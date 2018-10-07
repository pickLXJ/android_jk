.class public Lcom/example/forceapkobj/MainActivity;
.super Landroid/app/Activity;
.source "MainActivity.java"


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
    .locals 2
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 15
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 17
    const/high16 v1, 0x7f030000

    invoke-virtual {p0, v1}, Lcom/example/forceapkobj/MainActivity;->setContentView(I)V

    .line 19
    const/high16 v1, 0x7f060000

    invoke-virtual {p0, v1}, Lcom/example/forceapkobj/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 21
    .local v0, "tv":Landroid/widget/TextView;
    new-instance v1, Lcom/example/forceapkobj/MainActivity$1;

    invoke-direct {v1, p0}, Lcom/example/forceapkobj/MainActivity$1;-><init>(Lcom/example/forceapkobj/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 30
    return-void
.end method
