package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.m */
class C0906m implements C0856j0 {

    /* renamed from: com.adcolony.sdk.m$a */
    class C0907a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f612a;

        /* renamed from: b */
        final /* synthetic */ String f613b;

        C0907a(C0906m mVar, String str, String str2) {
            this.f612a = str;
            this.f613b = str2;
        }

        public void run() {
            try {
                AdColonyCustomMessageListener adColonyCustomMessageListener = C0714a.m136b().mo10842m().get(this.f612a);
                if (adColonyCustomMessageListener != null) {
                    adColonyCustomMessageListener.onAdColonyCustomMessage(new AdColonyCustomMessage(this.f612a, this.f613b));
                }
            } catch (RuntimeException unused) {
            }
        }
    }

    C0906m() {
        C0714a.m135a("CustomMessage.controller_send", (C0856j0) this);
    }

    /* renamed from: a */
    public void mo10469a(C0841h0 h0Var) {
        C0823f1 a = h0Var.mo10772a();
        C1038z0.m1202b((Runnable) new C0907a(this, C0764c0.m336h(a, "type"), C0764c0.m336h(a, "message")));
    }
}
