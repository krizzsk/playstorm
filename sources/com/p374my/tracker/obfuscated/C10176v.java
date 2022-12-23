package com.p374my.tracker.obfuscated;

import android.content.Context;
import com.huawei.hms.ads.installreferrer.api.InstallReferrerClient;
import com.huawei.hms.ads.installreferrer.api.InstallReferrerStateListener;
import com.huawei.hms.ads.installreferrer.api.ReferrerDetails;

/* renamed from: com.my.tracker.obfuscated.v */
public final class C10176v {

    /* renamed from: f */
    static int f25478f = 3;

    /* renamed from: g */
    static volatile C10176v f25479g;

    /* renamed from: a */
    final C10126m f25480a;

    /* renamed from: b */
    final C10106e f25481b;

    /* renamed from: c */
    final Context f25482c;

    /* renamed from: d */
    InstallReferrerClient f25483d;

    /* renamed from: e */
    int f25484e;

    /* renamed from: com.my.tracker.obfuscated.v$a */
    final class C10177a implements InstallReferrerStateListener {
        C10177a() {
        }

        public void onInstallReferrerServiceDisconnected() {
            C10175u0.m30440a("HuaweiReferrerHandler: install referrer service is disconnected. Connection attempts: " + C10176v.this.f25484e);
            C10176v.this.mo66392a((InstallReferrerStateListener) this);
        }

        public void onInstallReferrerSetupFinished(int i) {
            if (i == -1) {
                C10176v.this.mo66392a((InstallReferrerStateListener) this);
                return;
            }
            C10175u0.m30440a("HuaweiReferrerHandler: install referrer setup is finished");
            C10176v.this.mo66391a(i);
        }
    }

    C10176v(C10126m mVar, C10106e eVar, Context context) {
        this.f25480a = mVar;
        this.f25481b = eVar;
        this.f25482c = context.getApplicationContext();
    }

    /* renamed from: a */
    public static void m30447a(C10126m mVar, C10106e eVar, Context context) {
        if (f25479g == null) {
            synchronized (C10176v.class) {
                if (f25479g == null) {
                    C10176v vVar = new C10176v(mVar, eVar, context);
                    C10104d.m30023a(new Runnable() {
                        public final void run() {
                            C10176v.this.mo66390a();
                        }
                    });
                    f25479g = vVar;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo66390a() {
        if (!C10121k0.m30104a(this.f25482c).mo66211n()) {
            try {
                C10175u0.m30440a("HuaweiReferrerHandler: initialize InstallReferrerClient");
                this.f25483d = InstallReferrerClient.newBuilder(this.f25482c).build();
                mo66392a((InstallReferrerStateListener) new C10177a());
            } catch (Throwable th) {
                C10175u0.m30445b("HuaweiReferrerHandler: error occurred while initialization InstallReferrerClient", th);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo66391a(int i) {
        if (this.f25483d == null) {
            C10175u0.m30444b("HuaweiReferrerHandler: install referrer client is null");
            return;
        }
        if (i == 0) {
            try {
                C10175u0.m30440a("HuaweiReferrerHandler: retrieving install referrer");
                mo66393a(this.f25483d.getInstallReferrer());
            } catch (Throwable th) {
                C10175u0.m30445b("HuaweiReferrerHandler: error occurred while retrieving install referrer", th);
            }
        } else {
            C10175u0.m30440a("HuaweiReferrerHandler: InstallReferrerResponse code: " + i);
        }
        try {
            this.f25483d.endConnection();
        } catch (Throwable unused) {
        }
        this.f25483d = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo66392a(InstallReferrerStateListener installReferrerStateListener) {
        if (this.f25483d == null) {
            C10175u0.m30440a("HuaweiReferrerHandler: InstallReferrerClient is null");
            return;
        }
        int i = this.f25484e;
        if (i >= f25478f) {
            C10175u0.m30440a("HuaweiReferrerHandler: max count of reconnection attempts is reached");
            try {
                this.f25483d.endConnection();
            } catch (Throwable unused) {
            }
            this.f25483d = null;
            return;
        }
        this.f25484e = i + 1;
        try {
            C10175u0.m30440a("HuaweiReferrerHandler: connect to referrer client");
            this.f25483d.startConnection(installReferrerStateListener);
        } catch (Throwable th) {
            C10175u0.m30445b("HuaweiReferrerHandler: error occurred while connection InstallReferrerClient", th);
            mo66392a(installReferrerStateListener);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo66393a(ReferrerDetails referrerDetails) {
        C10121k0 a = C10121k0.m30104a(this.f25482c);
        if (a.mo66211n()) {
            C10175u0.m30440a("HuaweiReferrerHandler: api referrer has been tracked");
            return;
        }
        String installReferrer = referrerDetails.getInstallReferrer();
        C10175u0.m30440a("HuaweiReferrerHandler: retrieving install referrer is completed. Referrer: " + installReferrer);
        String str = installReferrer;
        this.f25480a.mo66248b(str, C10112h.m30079b(this.f25482c), referrerDetails.getInstallBeginTimestampSeconds(), referrerDetails.getReferrerClickTimestampSeconds());
        this.f25481b.mo66157a(installReferrer);
        a.mo66214q();
    }
}
