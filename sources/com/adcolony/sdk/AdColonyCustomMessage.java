package com.adcolony.sdk;

public class AdColonyCustomMessage {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f120a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f121b;

    /* renamed from: com.adcolony.sdk.AdColonyCustomMessage$a */
    class C0706a implements Runnable {
        C0706a() {
        }

        public void run() {
            AdColony.m38b();
            C0823f1 b = C0764c0.m322b();
            C0764c0.m319a(b, "type", AdColonyCustomMessage.this.f120a);
            C0764c0.m319a(b, "message", AdColonyCustomMessage.this.f121b);
            new C0841h0("CustomMessage.native_send", 1, b).mo10776c();
        }
    }

    public AdColonyCustomMessage(String str, String str2) {
        if (C1038z0.m1213e(str) || C1038z0.m1213e(str2)) {
            this.f120a = str;
            this.f121b = str2;
        }
    }

    public String getMessage() {
        return this.f121b;
    }

    public String getType() {
        return this.f120a;
    }

    public void send() {
        AdColony.m35a((Runnable) new C0706a());
    }

    public AdColonyCustomMessage set(String str, String str2) {
        this.f120a = str;
        this.f121b = str2;
        return this;
    }
}
