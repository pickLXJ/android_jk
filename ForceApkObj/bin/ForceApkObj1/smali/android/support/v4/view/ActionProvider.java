package android.support.v4.view; class ActionProvider { void a() { int a;
a=0;// .class public abstract Landroid/support/v4/view/ActionProvider;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ActionProvider.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/view/ActionProvider$VisibilityListener;,
a=0;//         Landroid/support/v4/view/ActionProvider$SubUiVisibilityListener;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final TAG:Ljava/lang/String; = "ActionProvider(support)"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private mSubUiVisibilityListener:Landroid/support/v4/view/ActionProvider$SubUiVisibilityListener;
a=0;// 
a=0;// .field private mVisibilityListener:Landroid/support/v4/view/ActionProvider$VisibilityListener;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 79
a=0;//     iput-object p1, p0, Landroid/support/v4/view/ActionProvider;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 80
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getContext()Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 86
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ActionProvider;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public hasSubMenu()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 195
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isVisible()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 135
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public abstract onCreateActionView()Landroid/view/View;
a=0;// .end method
a=0;// 
a=0;// .method public onCreateActionView(Landroid/view/MenuItem;)Landroid/view/View;
a=0;//     .locals 1
a=0;//     .param p1, "forItem"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 109
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ActionProvider;->onCreateActionView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onPerformDefaultAction()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 182
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onPrepareSubMenu(Landroid/view/SubMenu;)V
a=0;//     .locals 0
a=0;//     .param p1, "subMenu"    # Landroid/view/SubMenu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 208
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public overridesItemVisibility()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 121
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public refreshVisibility()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 145
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ActionProvider;->mVisibilityListener:Landroid/support/v4/view/ActionProvider$VisibilityListener;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ActionProvider;->overridesItemVisibility()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 146
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ActionProvider;->mVisibilityListener:Landroid/support/v4/view/ActionProvider$VisibilityListener;
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ActionProvider;->isVisible()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Landroid/support/v4/view/ActionProvider$VisibilityListener;->onActionProviderVisibilityChanged(Z)V
a=0;// 
a=0;//     .line 148
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSubUiVisibilityListener(Landroid/support/v4/view/ActionProvider$SubUiVisibilityListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "listener"    # Landroid/support/v4/view/ActionProvider$SubUiVisibilityListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 226
a=0;//     iput-object p1, p0, Landroid/support/v4/view/ActionProvider;->mSubUiVisibilityListener:Landroid/support/v4/view/ActionProvider$SubUiVisibilityListener;
a=0;// 
a=0;//     .line 227
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setVisibilityListener(Landroid/support/v4/view/ActionProvider$VisibilityListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "listener"    # Landroid/support/v4/view/ActionProvider$VisibilityListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 236
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ActionProvider;->mVisibilityListener:Landroid/support/v4/view/ActionProvider$VisibilityListener;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 237
a=0;//     const-string v0, "ActionProvider(support)"
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     const-string v2, "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " instance while it is still in use somewhere else?"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 241
a=0;//     :cond_0
a=0;//     iput-object p1, p0, Landroid/support/v4/view/ActionProvider;->mVisibilityListener:Landroid/support/v4/view/ActionProvider$VisibilityListener;
a=0;// 
a=0;//     .line 242
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public subUiVisibilityChanged(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "isVisible"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 217
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ActionProvider;->mSubUiVisibilityListener:Landroid/support/v4/view/ActionProvider$SubUiVisibilityListener;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 218
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ActionProvider;->mSubUiVisibilityListener:Landroid/support/v4/view/ActionProvider$SubUiVisibilityListener;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/support/v4/view/ActionProvider$SubUiVisibilityListener;->onSubUiVisibilityChanged(Z)V
a=0;// 
a=0;//     .line 220
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
}}
