package com.p374my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;

/* renamed from: com.my.tracker.obfuscated.q */
public final class C10162q {

    /* renamed from: f */
    static int f25442f = 3;

    /* renamed from: g */
    static volatile C10162q f25443g;

    /* renamed from: a */
    final C10126m f25444a;

    /* renamed from: b */
    final C10106e f25445b;

    /* renamed from: c */
    final Context f25446c;

    /* renamed from: d */
    InstallReferrerClient f25447d;

    /* renamed from: e */
    int f25448e;

    /* renamed from: com.my.tracker.obfuscated.q$a */
    final class C10163a implements InstallReferrerStateListener {
        C10163a() {
        }

        public void onInstallReferrerServiceDisconnected() {
            C10175u0.m30440a("ReferrerHandler: install referrer service is disconnected. Connection attempts: " + C10162q.this.f25448e);
            C10162q.this.mo66365a((InstallReferrerStateListener) this);
        }

        public void onInstallReferrerSetupFinished(int i) {
            C10175u0.m30440a("ReferrerHandler: install referrer setup is finished");
            if (i == -1) {
                C10162q.this.mo66365a((InstallReferrerStateListener) this);
            } else {
                C10162q.this.mo66364a(i);
            }
        }
    }

    C10162q(C10126m mVar, C10106e eVar, Context context) {
        this.f25444a = mVar;
        this.f25445b = eVar;
        this.f25446c = context.getApplicationContext();
    }

    /* renamed from: a */
    public static void m30389a(C10126m mVar, C10106e eVar, Context context) {
        if (f25443g == null) {
            synchronized (C10162q.class) {
                if (f25443g == null) {
                    C10162q qVar = new C10162q(mVar, eVar, context);
                    C10104d.m30023a(new Runnable() {
                        public final void run() {
                            C10162q.m30390a(C10162q.this);
                        }
                    });
                    f25443g = qVar;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m30390a(C10162q qVar) {
        qVar.mo66368b();
        qVar.mo66363a();
    }

    /* renamed from: a */
    public static void m30391a(String str, Context context, Runnable runnable) {
        C10162q qVar = f25443g;
        if (qVar == null) {
            C10121k0 a = C10121k0.m30104a(context);
            if (!a.mo66213p()) {
                a.mo66210m(str);
            }
            runnable.run();
            return;
        }
        qVar.mo66367a(str, runnable);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m30393c() {
        try {
            C10175u0.m30440a("ReferrerHandler: initialize InstallReferrerClient");
            this.f25447d = InstallReferrerClient.newBuilder(this.f25446c).build();
            mo66365a((InstallReferrerStateListener) new C10163a());
        } catch (Throwable th) {
            C10175u0.m30445b("ReferrerHandler: error occurred while initialization InstallReferrerClient", th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo66363a() {
        if (!C10121k0.m30104a(this.f25446c).mo66211n()) {
            C10104d.m30025c(new Runnable() {
                public final void run() {
                    C10162q.this.m30393c();
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo66364a(int i) {
        if (this.f25447d == null) {
            C10175u0.m30444b("ReferrerHandler: install referrer client is null");
            return;
        }
        if (i == 0) {
            try {
                C10175u0.m30440a("ReferrerHandler: retrieving install referrer");
                C10104d.m30023a(new Runnable(this.f25447d.getInstallReferrer()) {
                    public final /* synthetic */ ReferrerDetails f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C10162q.this.m30392b(this.f$1);
                    }
                });
            } catch (Throwable th) {
                C10175u0.m30445b("ReferrerHandler: error occurred while retrieving install referrer", th);
            }
        } else {
            C10175u0.m30440a("ReferrerHandler: InstallReferrerResponse code: " + i);
        }
        try {
            this.f25447d.endConnection();
        } catch (Throwable unused) {
        }
        this.f25447d = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo66365a(InstallReferrerStateListener installReferrerStateListener) {
        InstallReferrerClient installReferrerClient = this.f25447d;
        if (installReferrerClient == null) {
            C10175u0.m30440a("ReferrerHandler: InstallReferrerClient is null");
            return;
        }
        int i = this.f25448e;
        if (i >= f25442f) {
            try {
                installReferrerClient.endConnection();
            } catch (Throwable unused) {
            }
            this.f25447d = null;
            return;
        }
        this.f25448e = i + 1;
        try {
            C10175u0.m30440a("ReferrerHandler: connect to referrer client");
            this.f25447d.startConnection(installReferrerStateListener);
        } catch (Throwable th) {
            C10175u0.m30445b("ReferrerHandler: error occurred while connection InstallReferrerClient", th);
            mo66365a(installReferrerStateListener);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void m30392b(ReferrerDetails referrerDetails) {
        C10121k0 a = C10121k0.m30104a(this.f25446c);
        if (a.mo66211n()) {
            C10175u0.m30440a("ReferrerHandler: api referrer has been tracked");
            return;
        }
        String installReferrer = referrerDetails.getInstallReferrer();
        C10175u0.m30440a("ReferrerHandler: retrieving install referrer is completed. Referrer: " + installReferrer);
        String str = installReferrer;
        this.f25444a.mo66238a(str, C10112h.m30079b(this.f25446c), referrerDetails.getInstallBeginTimestampSeconds(), referrerDetails.getReferrerClickTimestampSeconds());
        this.f25445b.mo66157a(installReferrer);
        a.mo66214q();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo66367a(String str, Runnable runnable) {
        C10121k0 a = C10121k0.m30104a(this.f25446c);
        if (a.mo66213p()) {
            C10175u0.m30440a("ReferrerHandler: referrer has been tracked");
            return;
        }
        this.f25444a.mo66239a(str, C10112h.m30079b(this.f25446c), runnable);
        this.f25445b.mo66157a(str);
        a.mo66216s();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo66368b() {
        C10121k0 a = C10121k0.m30104a(this.f25446c);
        if (!a.mo66213p()) {
            String l = a.mo66207l();
            if (!TextUtils.isEmpty(l)) {
                mo66367a(l, (Runnable) null);
            }
        }
    }
}
