package com.example.reforceapk;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.zip.Adler32;


public class mymain {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File payloadSrcFile = new File("force/ForceApkObj.apk");   //��Ҫ�ӿǵ�
			File unShellDexFile = new File("force/ForceApkObj.dex");	//��ѹdex
			byte[] payloadArray = encrpt(readFileBytes(payloadSrcFile));//�Զ�������ʽ����apk�������м��ܴ���//��ԴApk���м��ܲ���
			byte[] unShellDexArray = readFileBytes(unShellDexFile);//�Զ�������ʽ����dex
			int payloadLen = payloadArray.length;
			int unShellDexLen = unShellDexArray.length;
			int totalLen = payloadLen + unShellDexLen +4;//���4�ֽ��Ǵ�ų��ȵġ�
			byte[] newdex = new byte[totalLen]; // �������µĳ���
			//��ӽ�Ǵ���
			System.arraycopy(unShellDexArray, 0, newdex, 0, unShellDexLen);//�ȿ���dex����
			//��Ӽ��ܺ�Ľ������
			System.arraycopy(payloadArray, 0, newdex, unShellDexLen, payloadLen);//����dex���ݺ��濽��apk������
			//��ӽ�����ݳ���
			System.arraycopy(intToByte(payloadLen), 0, newdex, totalLen-4, 4);//���4Ϊ����
            //�޸�DEX file size�ļ�ͷ
			fixFileSizeHeader(newdex);
			//�޸�DEX SHA1 �ļ�ͷ
			fixSHA1Header(newdex);
			//�޸�DEX CheckSum�ļ�ͷ
			fixCheckSumHeader(newdex);

			String str = "force/classes.dex";
			File file = new File(str);
			if (!file.exists()) {
				file.createNewFile();
			}
			
			FileOutputStream localFileOutputStream = new FileOutputStream(str);
			localFileOutputStream.write(newdex);
			localFileOutputStream.flush();
			localFileOutputStream.close();


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//ֱ�ӷ������ݣ����߿�������Լ����ܷ���
	private static byte[] encrpt(byte[] srcdata){
		for(int i = 0;i<srcdata.length;i++){
			srcdata[i] = (byte)(0xFF ^ srcdata[i]);
		}
		return srcdata;
	}

	/**
	 * �޸�dexͷ��CheckSum У����
	 * @param dexBytes
	 */
	private static void fixCheckSumHeader(byte[] dexBytes) {
		
		System.out.println("FIXCHECKSUM:");
		
		Adler32 adler = new Adler32();
		adler.update(dexBytes, 12, dexBytes.length - 12);//��12���ļ�ĩβ����У����
		long value = adler.getValue();
		int va = (int) value;
		byte[] newcs = intToByte(va);
		//��λ��ǰ����λ��ǰ������
		byte[] recs = new byte[4];
		for (int i = 0; i < 4; i++) {
			recs[i] = newcs[newcs.length - 1 - i];
			System.out.println(Integer.toHexString(newcs[i]));
		}
		System.arraycopy(recs, 0, dexBytes, 8, 4);//Ч���븳ֵ��8-11��
		System.out.println("\n"+Long.toHexString(value));
	}


	/**
	 * int תbyte[]
	 * @param number
	 * @return
	 */
	public static byte[] intToByte(int number) {
		byte[] b = new byte[4];
		for (int i = 3; i >= 0; i--) {
			b[i] = (byte) (number % 256);
			number >>= 8;
		}
		return b;
	}

	/**
	 * �޸�dexͷ sha1ֵ(ժҪǩ��ֵsignature�����۸���)
	 * @param dexBytes
	 * @throws NoSuchAlgorithmException
	 */
	private static void fixSHA1Header(byte[] dexBytes)
			throws NoSuchAlgorithmException {
		
		System.out.println("FIXSHA1HEADER:");
		
		MessageDigest md = MessageDigest.getInstance("SHA-1");
		md.update(dexBytes, 32, dexBytes.length - 32);//��32Ϊ����������sha--1
		byte[] newdt = md.digest();
		System.arraycopy(newdt, 0, dexBytes, 12, 20);//�޸�sha-1ֵ��12-31��
		//���sha-1ֵ�����п���
		String hexstr = "";
		for (int i = 0; i < newdt.length; i++) {
			hexstr += Integer.toString((newdt[i] & 0xff) + 0x100, 16)
					.substring(1);
		}
		System.out.println("File Sha1�� "+hexstr+"\n");
	}

	/**
	 * �޸�dexͷ file_sizeֵ
	 * @param dexBytes 
	 */
	private static void fixFileSizeHeader(byte[] dexBytes) {
		//���ļ�����
		byte[] newfs = intToByte(dexBytes.length);
		System.out.println("FIXFILESIZEHEADER:\nFileSize: "+dexBytes.length);
		byte[] refs = new byte[4];
		//��λ��ǰ����λ��ǰ������
		for (int i = 0; i < 4; i++) {
			refs[i] = newfs[newfs.length - 1 - i];
//			System.out.println(Integer.toHexString(newfs[i]));
		}
		System.out.println("FileSize's hex: "+Integer.toHexString(dexBytes.length)+"  change to: "+refs+"\n");
		System.arraycopy(refs, 0, dexBytes, 32, 4);//�޸ģ�32-35��
	}


	/**
	 * �Զ����ƶ����ļ�����
	 * @param file
	 * @return
	 * @throws IOException
	 */
	private static byte[] readFileBytes(File file) throws IOException {
		byte[] arrayOfByte = new byte[1024];
		ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
		FileInputStream fis = new FileInputStream(file);
		while (true) {
			int i = fis.read(arrayOfByte);
			if (i != -1) {
				localByteArrayOutputStream.write(arrayOfByte, 0, i);
			} else {
				return localByteArrayOutputStream.toByteArray();
			}
		}
	}
}
