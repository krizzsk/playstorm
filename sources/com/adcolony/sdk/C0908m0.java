package com.adcolony.sdk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.adcolony.sdk.C0817e0;
import com.tapjoy.TapjoyConstants;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.adcolony.sdk.m0 */
class C0908m0 {

    /* renamed from: a */
    private ScheduledExecutorService f614a;

    /* renamed from: b */
    private ScheduledFuture<?> f615b;

    /* renamed from: c */
    private String f616c;

    /* renamed from: com.adcolony.sdk.m0$a */
    class C0909a implements C0856j0 {
        C0909a() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0908m0.this.m761c();
        }
    }

    /* renamed from: com.adcolony.sdk.m0$b */
    class C0910b implements C0856j0 {
        C0910b() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0908m0.this.m764f();
        }
    }

    /* renamed from: com.adcolony.sdk.m0$c */
    class C0911c implements Runnable {
        C0911c() {
        }

        public void run() {
            C0908m0.this.m763d();
        }
    }

    C0908m0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m763d() {
        String e = mo10884e();
        if (!e.equals(this.f616c)) {
            this.f616c = e;
            C0823f1 b = C0764c0.m322b();
            C0764c0.m319a(b, "network_type", e);
            new C0841h0("Network.on_status_change", 1, b).mo10776c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m764f() {
        ScheduledFuture<?> scheduledFuture = this.f615b;
        if (scheduledFuture != null) {
            if (!scheduledFuture.isCancelled()) {
                this.f615b.cancel(false);
            }
            this.f615b = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo10884e() {
        return m758a();
    }

    /* renamed from: a */
    private String m758a() {
        NetworkInfo networkInfo;
        Context a = C0714a.m129a();
        if (a == null) {
            return "none";
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) a.getApplicationContext().getSystemService("connectivity");
            if (connectivityManager == null) {
                networkInfo = null;
            } else {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            }
            if (networkInfo == null) {
                return "none";
            }
            int type = networkInfo.getType();
            if (type == 1) {
                return TapjoyConstants.TJC_CONNECTION_TYPE_WIFI;
            }
            if (type == 0) {
                return "cell";
            }
            if (type >= 2) {
                return "cell";
            }
            return "none";
        } catch (SecurityException e) {
            new C0817e0.C0818a().mo10684a("SecurityException - please ensure you added the ").mo10684a("ACCESS_NETWORK_STATE permission: ").mo10684a(e.toString()).mo10685a(C0817e0.f433h);
            return "none";
        } catch (Exception e2) {
            new C0817e0.C0818a().mo10684a("Exception occurred when retrieving activeNetworkInfo in ").mo10684a("ADCNetwork.getConnectivityStatus(): ").mo10684a(e2.toString()).mo10685a(C0817e0.f434i);
            return "none";
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m761c() {
        if (this.f614a == null) {
            this.f614a = Executors.newSingleThreadScheduledExecutor();
        }
        if (this.f615b == null) {
            try {
                this.f615b = this.f614a.scheduleAtFixedRate(new C0911c(), 0, 1000, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                new C0817e0.C0818a().mo10684a("Error when scheduling network checks: ").mo10684a(e.toString()).mo10685a(C0817e0.f434i);
            }
            m763d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10883b() {
        this.f616c = mo10884e();
        C0714a.m135a("Network.start_notifications", (C0856j0) new C0909a());
        C0714a.m135a("Network.stop_notifications", (C0856j0) new C0910b());
    }
}
