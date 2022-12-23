package com.fyber.inneractive.sdk.player.p191ui;

/* renamed from: com.fyber.inneractive.sdk.player.ui.k */
public class C5106k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C5100i f13686a;

    public C5106k(C5100i iVar) {
        this.f13686a = iVar;
    }

    public void run() {
        C5100i iVar = this.f13686a;
        int i = iVar.f13650C + 200;
        iVar.f13650C = i;
        iVar.f13671v.setProgress(i);
        C5100i iVar2 = this.f13686a;
        if (iVar2.f13650C == iVar2.f13651D) {
            iVar2.f13652E = null;
            iVar2.f13650C = 0;
            iVar2.f13651D = 0;
            return;
        }
        iVar2.postDelayed(iVar2.f13652E, 200);
    }
}
