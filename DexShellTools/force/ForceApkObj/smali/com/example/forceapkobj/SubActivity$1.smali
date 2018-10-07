.class Lcom/example/forceapkobj/SubActivity$1;
.super Ljava/lang/Object;
.source "SubActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/forceapkobj/SubActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/example/forceapkobj/SubActivity;


# direct methods
.method constructor <init>(Lcom/example/forceapkobj/SubActivity;)V
    .locals 0

    .prologue
    .line 22
    iput-object p1, p0, Lcom/example/forceapkobj/SubActivity$1;->this$0:Lcom/example/forceapkobj/SubActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 26
    iget-object v0, p0, Lcom/example/forceapkobj/SubActivity$1;->this$0:Lcom/example/forceapkobj/SubActivity;

    const-string v1, "\u52a0\u6cb9\u554a\uff0c\u5144\u5f1f\uff01\u6ca1\u6709\u4ec0\u4e48\u662f\u4e0d\u53ef\u80fd\u7684\uff01"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 27
    return-void
.end method
