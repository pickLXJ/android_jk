.class public Lcom/example/forceapkobj/SubActivity;
.super Landroid/app/Activity;
.source "SubActivity.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 15
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 18
    const v1, 0x7f030001

    invoke-virtual {p0, v1}, Lcom/example/forceapkobj/SubActivity;->setContentView(I)V

    .line 20
    const v1, 0x7f060001

    invoke-virtual {p0, v1}, Lcom/example/forceapkobj/SubActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 22
    .local v0, "bun":Landroid/widget/Button;
    new-instance v1, Lcom/example/forceapkobj/SubActivity$1;

    invoke-direct {v1, p0}, Lcom/example/forceapkobj/SubActivity$1;-><init>(Lcom/example/forceapkobj/SubActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 30
    const-string v1, "demo"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "app:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/example/forceapkobj/SubActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    return-void
.end method
