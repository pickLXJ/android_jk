package android.support.v4.app; class NotificationCompat$Builder { void a() { int a;
a=0;// .class public Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// .super Ljava/lang/Object;
a=0;// .source "NotificationCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/app/NotificationCompat;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x9
a=0;//     name = "Builder"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mActions:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/support/v4/app/NotificationCompat$Action;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field mContentInfo:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field mContentIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;// .field mContentText:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field mContentTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field mContext:Landroid/content/Context;
a=0;// 
a=0;// .field mExtras:Landroid/os/Bundle;
a=0;// 
a=0;// .field mFullScreenIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;// .field mGroupKey:Ljava/lang/String;
a=0;// 
a=0;// .field mGroupSummary:Z
a=0;// 
a=0;// .field mLargeIcon:Landroid/graphics/Bitmap;
a=0;// 
a=0;// .field mLocalOnly:Z
a=0;// 
a=0;// .field mNotification:Landroid/app/Notification;
a=0;// 
a=0;// .field mNumber:I
a=0;// 
a=0;// .field mPriority:I
a=0;// 
a=0;// .field mProgress:I
a=0;// 
a=0;// .field mProgressIndeterminate:Z
a=0;// 
a=0;// .field mProgressMax:I
a=0;// 
a=0;// .field mSortKey:Ljava/lang/String;
a=0;// 
a=0;// .field mStyle:Landroid/support/v4/app/NotificationCompat$Style;
a=0;// 
a=0;// .field mSubText:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field mTickerView:Landroid/widget/RemoteViews;
a=0;// 
a=0;// .field mUseChronometer:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 5
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 676
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 659
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mActions:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 660
a=0;//     iput-boolean v4, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mLocalOnly:Z
a=0;// 
a=0;//     .line 663
a=0;//     new-instance v0, Landroid/app/Notification;
a=0;// 
a=0;//     invoke-direct {v0}, Landroid/app/Notification;-><init>()V
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
a=0;// 
a=0;//     .line 677
a=0;//     iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 680
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     iput-wide v2, v0, Landroid/app/Notification;->when:J
a=0;// 
a=0;//     .line 681
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
a=0;// 
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     iput v1, v0, Landroid/app/Notification;->audioStreamType:I
a=0;// 
a=0;//     .line 682
a=0;//     iput v4, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mPriority:I
a=0;// 
a=0;//     .line 683
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private setFlag(IZ)V
a=0;//     .locals 3
a=0;//     .param p1, "mask"    # I
a=0;//     .param p2, "value"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 990
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 991
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
a=0;// 
a=0;//     iget v1, v0, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     or-int/2addr v1, p1
a=0;// 
a=0;//     iput v1, v0, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     .line 995
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 993
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
a=0;// 
a=0;//     iget v1, v0, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     xor-int/lit8 v2, p1, -0x1
a=0;// 
a=0;//     and-int/2addr v1, v2
a=0;// 
a=0;//     iput v1, v0, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addAction(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;//     .locals 2
a=0;//     .param p1, "icon"    # I
a=0;//     .param p2, "title"    # Ljava/lang/CharSequence;
a=0;//     .param p3, "intent"    # Landroid/app/PendingIntent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1133
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mActions:Ljava/util/ArrayList;
a=0;// 
a=0;//     new-instance v1, Landroid/support/v4/app/NotificationCompat$Action;
a=0;// 
a=0;//     invoke-direct {v1, p1, p2, p3}, Landroid/support/v4/app/NotificationCompat$Action;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1134
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public addAction(Landroid/support/v4/app/NotificationCompat$Action;)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;//     .locals 1
a=0;//     .param p1, "action"    # Landroid/support/v4/app/NotificationCompat$Action;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1152
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mActions:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1153
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public addExtras(Landroid/os/Bundle;)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;//     .locals 1
a=0;//     .param p1, "extras"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1072
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 1073
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mExtras:Landroid/os/Bundle;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 1074
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-direct {v0, p1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mExtras:Landroid/os/Bundle;
a=0;// 
a=0;//     .line 1079
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     return-object p0
a=0;// 
a=0;//     .line 1076
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mExtras:Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public build()Landroid/app/Notification;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1196
a=0;//     invoke-static {}, Landroid/support/v4/app/NotificationCompat;->access$200()Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;->build(Landroid/support/v4/app/NotificationCompat$Builder;)Landroid/app/Notification;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public extend(Landroid/support/v4/app/NotificationCompat$Extender;)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;//     .locals 0
a=0;//     .param p1, "extender"    # Landroid/support/v4/app/NotificationCompat$Extender;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1179
a=0;//     invoke-interface {p1, p0}, Landroid/support/v4/app/NotificationCompat$Extender;->extend(Landroid/support/v4/app/NotificationCompat$Builder;)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     .line 1180
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public getExtras()Landroid/os/Bundle;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1110
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mExtras:Landroid/os/Bundle;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1111
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mExtras:Landroid/os/Bundle;
a=0;// 
a=0;//     .line 1113
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mExtras:Landroid/os/Bundle;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getNotification()Landroid/app/Notification;
a=0;//     .locals 1
a=0;//     .annotation runtime Ljava/lang/Deprecated;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1188
a=0;//     invoke-static {}, Landroid/support/v4/app/NotificationCompat;->access$200()Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;->build(Landroid/support/v4/app/NotificationCompat$Builder;)Landroid/app/Notification;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public setAutoCancel(Z)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;//     .locals 1
a=0;//     .param p1, "autoCancel"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 956
a=0;//     const/16 v0, 0x10
a=0;// 
a=0;//     invoke-direct {p0, v0, p1}, Landroid/support/v4/app/NotificationCompat$Builder;->setFlag(IZ)V
a=0;// 
a=0;//     .line 957
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setContent(Landroid/widget/RemoteViews;)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;//     .locals 1
a=0;//     .param p1, "views"    # Landroid/widget/RemoteViews;
a=0;// 
a=0;//     .prologue
a=0;//     .line 801
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
a=0;// 
a=0;//     iput-object p1, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     .line 802
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setContentInfo(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;//     .locals 0
a=0;//     .param p1, "info"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 782
a=0;//     iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mContentInfo:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 783
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setContentIntent(Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;//     .locals 0
a=0;//     .param p1, "intent"    # Landroid/app/PendingIntent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 814
a=0;//     iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mContentIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     .line 815
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setContentText(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;//     .locals 0
a=0;//     .param p1, "text"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 750
a=0;//     iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mContentText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 751
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setContentTitle(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;//     .locals 0
a=0;//     .param p1, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 742
a=0;//     iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mContentTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 743
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setDefaults(I)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;//     .locals 2
a=0;//     .param p1, "defaults"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 982
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
a=0;// 
a=0;//     iput p1, v0, Landroid/app/Notification;->defaults:I
a=0;// 
a=0;//     .line 983
a=0;//     and-int/lit8 v0, p1, 0x4
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 984
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
a=0;// 
a=0;//     iget v1, v0, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     or-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     iput v1, v0, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     .line 986
a=0;//     :cond_0
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setDeleteIntent(Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;//     .locals 1
a=0;//     .param p1, "intent"    # Landroid/app/PendingIntent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 826
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
a=0;// 
a=0;//     iput-object p1, v0, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     .line 827
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setExtras(Landroid/os/Bundle;)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;//     .locals 0
a=0;//     .param p1, "extras"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1095
a=0;//     iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mExtras:Landroid/os/Bundle;
a=0;// 
a=0;//     .line 1096
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setFullScreenIntent(Landroid/app/PendingIntent;Z)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;//     .locals 1
a=0;//     .param p1, "intent"    # Landroid/app/PendingIntent;
a=0;//     .param p2, "highPriority"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 844
a=0;//     iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mFullScreenIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     .line 845
a=0;//     const/16 v0, 0x80
a=0;// 
a=0;//     invoke-direct {p0, v0, p2}, Landroid/support/v4/app/NotificationCompat$Builder;->setFlag(IZ)V
a=0;// 
a=0;//     .line 846
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setGroup(Ljava/lang/String;)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;//     .locals 0
a=0;//     .param p1, "groupKey"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1031
a=0;//     iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mGroupKey:Ljava/lang/String;
a=0;// 
a=0;//     .line 1032
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setGroupSummary(Z)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;//     .locals 0
a=0;//     .param p1, "isGroupSummary"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 1043
a=0;//     iput-boolean p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mGroupSummary:Z
a=0;// 
a=0;//     .line 1044
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setLargeIcon(Landroid/graphics/Bitmap;)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;//     .locals 0
a=0;//     .param p1, "icon"    # Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .prologue
a=0;//     .line 873
a=0;//     iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mLargeIcon:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 874
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setLights(III)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;//     .locals 5
a=0;//     .param p1, "argb"    # I
a=0;//     .param p2, "onMs"    # I
a=0;//     .param p3, "offMs"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 915
a=0;//     iget-object v3, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
a=0;// 
a=0;//     iput p1, v3, Landroid/app/Notification;->ledARGB:I
a=0;// 
a=0;//     .line 916
a=0;//     iget-object v3, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
a=0;// 
a=0;//     iput p2, v3, Landroid/app/Notification;->ledOnMS:I
a=0;// 
a=0;//     .line 917
a=0;//     iget-object v3, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
a=0;// 
a=0;//     iput p3, v3, Landroid/app/Notification;->ledOffMS:I
a=0;// 
a=0;//     .line 918
a=0;//     iget-object v3, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
a=0;// 
a=0;//     iget v3, v3, Landroid/app/Notification;->ledOnMS:I
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
a=0;// 
a=0;//     iget v3, v3, Landroid/app/Notification;->ledOffMS:I
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 919
a=0;//     .local v0, "showLights":Z
a=0;//     :goto_0
a=0;//     iget-object v3, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
a=0;// 
a=0;//     iget v4, v4, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     and-int/lit8 v4, v4, -0x2
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :goto_1
a=0;//     or-int/2addr v1, v4
a=0;// 
a=0;//     iput v1, v3, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     .line 921
a=0;//     return-object p0
a=0;// 
a=0;//     .end local v0    # "showLights":Z
a=0;//     :cond_0
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 918
a=0;//     goto :goto_0
a=0;// 
a=0;//     .restart local v0    # "showLights":Z
a=0;//     :cond_1
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 919
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public setLocalOnly(Z)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;//     .locals 0
a=0;//     .param p1, "b"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 967
a=0;//     iput-boolean p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mLocalOnly:Z
a=0;// 
a=0;//     .line 968
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setNumber(I)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;//     .locals 0
a=0;//     .param p1, "number"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 774
a=0;//     iput p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNumber:I
a=0;// 
a=0;//     .line 775
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setOngoing(Z)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;//     .locals 1
a=0;//     .param p1, "ongoing"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 936
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     invoke-direct {p0, v0, p1}, Landroid/support/v4/app/NotificationCompat$Builder;->setFlag(IZ)V
a=0;// 
a=0;//     .line 937
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setOnlyAlertOnce(Z)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;//     .locals 1
a=0;//     .param p1, "onlyAlertOnce"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 945
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     invoke-direct {p0, v0, p1}, Landroid/support/v4/app/NotificationCompat$Builder;->setFlag(IZ)V
a=0;// 
a=0;//     .line 946
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setPriority(I)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;//     .locals 0
a=0;//     .param p1, "pri"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1015
a=0;//     iput p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mPriority:I
a=0;// 
a=0;//     .line 1016
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setProgress(IIZ)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;//     .locals 0
a=0;//     .param p1, "max"    # I
a=0;//     .param p2, "progress"    # I
a=0;//     .param p3, "indeterminate"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 791
a=0;//     iput p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mProgressMax:I
a=0;// 
a=0;//     .line 792
a=0;//     iput p2, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mProgress:I
a=0;// 
a=0;//     .line 793
a=0;//     iput-boolean p3, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mProgressIndeterminate:Z
a=0;// 
a=0;//     .line 794
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setSmallIcon(I)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;//     .locals 1
a=0;//     .param p1, "icon"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 718
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
a=0;// 
a=0;//     iput p1, v0, Landroid/app/Notification;->icon:I
a=0;// 
a=0;//     .line 719
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setSmallIcon(II)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;//     .locals 1
a=0;//     .param p1, "icon"    # I
a=0;//     .param p2, "level"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 733
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
a=0;// 
a=0;//     iput p1, v0, Landroid/app/Notification;->icon:I
a=0;// 
a=0;//     .line 734
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
a=0;// 
a=0;//     iput p2, v0, Landroid/app/Notification;->iconLevel:I
a=0;// 
a=0;//     .line 735
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setSortKey(Ljava/lang/String;)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;//     .locals 0
a=0;//     .param p1, "sortKey"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1060
a=0;//     iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mSortKey:Ljava/lang/String;
a=0;// 
a=0;//     .line 1061
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setSound(Landroid/net/Uri;)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;//     .locals 2
a=0;//     .param p1, "sound"    # Landroid/net/Uri;
a=0;// 
a=0;//     .prologue
a=0;//     .line 881
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
a=0;// 
a=0;//     iput-object p1, v0, Landroid/app/Notification;->sound:Landroid/net/Uri;
a=0;// 
a=0;//     .line 882
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
a=0;// 
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     iput v1, v0, Landroid/app/Notification;->audioStreamType:I
a=0;// 
a=0;//     .line 883
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setSound(Landroid/net/Uri;I)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;//     .locals 1
a=0;//     .param p1, "sound"    # Landroid/net/Uri;
a=0;//     .param p2, "streamType"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 893
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
a=0;// 
a=0;//     iput-object p1, v0, Landroid/app/Notification;->sound:Landroid/net/Uri;
a=0;// 
a=0;//     .line 894
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
a=0;// 
a=0;//     iput p2, v0, Landroid/app/Notification;->audioStreamType:I
a=0;// 
a=0;//     .line 895
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setStyle(Landroid/support/v4/app/NotificationCompat$Style;)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;//     .locals 1
a=0;//     .param p1, "style"    # Landroid/support/v4/app/NotificationCompat$Style;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1165
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mStyle:Landroid/support/v4/app/NotificationCompat$Style;
a=0;// 
a=0;//     if-eq v0, p1, :cond_0
a=0;// 
a=0;//     .line 1166
a=0;//     iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mStyle:Landroid/support/v4/app/NotificationCompat$Style;
a=0;// 
a=0;//     .line 1167
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mStyle:Landroid/support/v4/app/NotificationCompat$Style;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1168
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mStyle:Landroid/support/v4/app/NotificationCompat$Style;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/support/v4/app/NotificationCompat$Style;->setBuilder(Landroid/support/v4/app/NotificationCompat$Builder;)V
a=0;// 
a=0;//     .line 1171
a=0;//     :cond_0
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setSubText(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;//     .locals 0
a=0;//     .param p1, "text"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 764
a=0;//     iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mSubText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 765
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setTicker(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;//     .locals 1
a=0;//     .param p1, "tickerText"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 854
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
a=0;// 
a=0;//     iput-object p1, v0, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 855
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setTicker(Ljava/lang/CharSequence;Landroid/widget/RemoteViews;)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;//     .locals 1
a=0;//     .param p1, "tickerText"    # Ljava/lang/CharSequence;
a=0;//     .param p2, "views"    # Landroid/widget/RemoteViews;
a=0;// 
a=0;//     .prologue
a=0;//     .line 864
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
a=0;// 
a=0;//     iput-object p1, v0, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 865
a=0;//     iput-object p2, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mTickerView:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     .line 866
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setUsesChronometer(Z)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;//     .locals 0
a=0;//     .param p1, "b"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 706
a=0;//     iput-boolean p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mUseChronometer:Z
a=0;// 
a=0;//     .line 707
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setVibrate([J)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;//     .locals 1
a=0;//     .param p1, "pattern"    # [J
a=0;// 
a=0;//     .prologue
a=0;//     .line 905
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
a=0;// 
a=0;//     iput-object p1, v0, Landroid/app/Notification;->vibrate:[J
a=0;// 
a=0;//     .line 906
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setWhen(J)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;//     .locals 1
a=0;//     .param p1, "when"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 690
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
a=0;// 
a=0;//     iput-wide p1, v0, Landroid/app/Notification;->when:J
a=0;// 
a=0;//     .line 691
a=0;//     return-object p0
a=0;// .end method
}}
