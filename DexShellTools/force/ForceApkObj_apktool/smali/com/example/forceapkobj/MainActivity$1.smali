.class Lcom/example/forceapkobj/MainActivity$1;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/forceapkobj/MainActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/example/forceapkobj/MainActivity;


# direct methods
.method constructor <init>(Lcom/example/forceapkobj/MainActivity;)V
    .locals 0

    .prologue
    .line 21
    iput-object p1, p0, Lcom/example/forceapkobj/MainActivity$1;->this$0:Lcom/example/forceapkobj/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 25
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/example/forceapkobj/MainActivity$1;->this$0:Lcom/example/forceapkobj/MainActivity;

    const-class v2, Lcom/example/forceapkobj/SubActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 26
    .local v0, "intent":Landroid/content/Intent;
    iget-object v1, p0, Lcom/example/forceapkobj/MainActivity$1;->this$0:Lcom/example/forceapkobj/MainActivity;

    invoke-virtual {v1, v0}, Lcom/example/forceapkobj/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 27
    return-void
.end method
