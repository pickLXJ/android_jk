package android.support.v4.net; class TrafficStatsCompatIcs { void a() { int a;
a=0;// .class Landroid/support/v4/net/TrafficStatsCompatIcs;
a=0;// .super Ljava/lang/Object;
a=0;// .source "TrafficStatsCompatIcs.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static clearThreadStatsTag()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V
a=0;// 
a=0;//     .line 30
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getThreadStatsTag()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     invoke-static {}, Landroid/net/TrafficStats;->getThreadStatsTag()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static incrementOperationCount(I)V
a=0;//     .locals 0
a=0;//     .param p0, "operationCount"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     invoke-static {p0}, Landroid/net/TrafficStats;->incrementOperationCount(I)V
a=0;// 
a=0;//     .line 38
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static incrementOperationCount(II)V
a=0;//     .locals 0
a=0;//     .param p0, "tag"    # I
a=0;//     .param p1, "operationCount"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     invoke-static {p0, p1}, Landroid/net/TrafficStats;->incrementOperationCount(II)V
a=0;// 
a=0;//     .line 42
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setThreadStatsTag(I)V
a=0;//     .locals 0
a=0;//     .param p0, "tag"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     invoke-static {p0}, Landroid/net/TrafficStats;->setThreadStatsTag(I)V
a=0;// 
a=0;//     .line 46
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static tagSocket(Ljava/net/Socket;)V
a=0;//     .locals 0
a=0;//     .param p0, "socket"    # Ljava/net/Socket;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/net/SocketException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     invoke-static {p0}, Landroid/net/TrafficStats;->tagSocket(Ljava/net/Socket;)V
a=0;// 
a=0;//     .line 50
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static untagSocket(Ljava/net/Socket;)V
a=0;//     .locals 0
a=0;//     .param p0, "socket"    # Ljava/net/Socket;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/net/SocketException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     invoke-static {p0}, Landroid/net/TrafficStats;->untagSocket(Ljava/net/Socket;)V
a=0;// 
a=0;//     .line 54
a=0;//     return-void
a=0;// .end method
}}
