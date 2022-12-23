package com.bytedance.sdk.component.p120e.p123c;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Address;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.component.p120e.C2909a;
import com.bytedance.sdk.component.p120e.C2913b;
import com.bytedance.sdk.component.p120e.p121a.C2912a;
import com.bytedance.sdk.component.p120e.p122b.C2916b;
import com.bytedance.sdk.component.p120e.p122b.C2918c;
import com.bytedance.sdk.component.p120e.p124d.C2933b;
import com.bytedance.sdk.component.p120e.p124d.C2940e;
import com.bytedance.sdk.component.p120e.p124d.C2941f;
import com.bytedance.sdk.component.p120e.p124d.C2942g;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.e.c.a */
/* compiled from: AppConfig */
public class C2921a implements C2942g.C2943a {

    /* renamed from: b */
    private static C2921a f6606b;

    /* renamed from: a */
    final C2942g f6607a = new C2942g(Looper.getMainLooper(), this);

    /* renamed from: c */
    private final boolean f6608c;

    /* renamed from: d */
    private volatile boolean f6609d = false;

    /* renamed from: e */
    private boolean f6610e = true;

    /* renamed from: f */
    private boolean f6611f = false;

    /* renamed from: g */
    private long f6612g = 0;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public long f6613h = 0;

    /* renamed from: i */
    private ThreadPoolExecutor f6614i = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public AtomicBoolean f6615j = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Context f6616k;

    /* renamed from: l */
    private volatile boolean f6617l = false;

    /* renamed from: m */
    private C2909a f6618m;

    /* renamed from: n */
    private int f6619n;

    /* renamed from: a */
    public static C2921a m8190a(Context context) {
        C2921a aVar;
        synchronized (C2921a.class) {
            if (f6606b == null) {
                f6606b = new C2921a(context.getApplicationContext(), C2941f.m8279b(context));
            }
            aVar = f6606b;
        }
        return aVar;
    }

    private C2921a(Context context, boolean z) {
        this.f6616k = context;
        this.f6608c = z;
    }

    public C2921a(Context context, int i) {
        this.f6616k = context;
        this.f6608c = C2941f.m8279b(context);
        this.f6619n = i;
    }

    /* renamed from: a */
    public void mo17800a() {
        mo17803a(false);
    }

    /* renamed from: a */
    public synchronized void mo17803a(boolean z) {
        if (this.f6608c) {
            m8201c(z);
        } else if (this.f6612g <= 0) {
            try {
                mo17810g().execute(new Runnable() {
                    public void run() {
                        C2921a.this.mo17804b();
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m8199b(Context context) {
        C2921a aVar = f6606b;
        if (aVar == null) {
            return;
        }
        if (C2941f.m8279b(context)) {
            aVar.mo17803a(true);
        } else {
            aVar.mo17800a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo17804b() {
        if (System.currentTimeMillis() - this.f6612g > 3600000) {
            this.f6612g = System.currentTimeMillis();
            try {
                if (C2931g.m8259a().mo17844a(this.f6619n).mo17840h() != null) {
                    C2931g.m8259a().mo17844a(this.f6619n).mo17840h().mo17825b();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    private void m8201c(boolean z) {
        if (!this.f6611f) {
            if (this.f6610e) {
                this.f6610e = false;
                this.f6612g = 0;
                this.f6613h = 0;
            }
            long j = z ? 10800000 : 43200000;
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f6612g <= j) {
                return;
            }
            if (currentTimeMillis - this.f6613h > 120000 || !this.f6617l) {
                mo17806c();
            }
        }
    }

    /* renamed from: c */
    public boolean mo17806c() {
        C2933b.m8266b("TNCManager", "doRefresh: updating state " + this.f6615j.get());
        mo17810g().execute(new Runnable() {
            public void run() {
                boolean a = C2940e.m8276a(C2921a.this.f6616k);
                if (a) {
                    long unused = C2921a.this.f6613h = System.currentTimeMillis();
                    if (!C2921a.this.f6615j.compareAndSet(false, true)) {
                        C2933b.m8266b("TNCManager", "doRefresh, already running");
                    } else {
                        C2921a.this.mo17805b(a);
                    }
                }
            }
        });
        return true;
    }

    /* renamed from: a */
    public void mo17801a(Message message) {
        int i = message.what;
        if (i == 101) {
            this.f6611f = false;
            this.f6612g = System.currentTimeMillis();
            C2933b.m8266b("TNCManager", "doRefresh, succ");
            if (this.f6610e) {
                mo17800a();
            }
            this.f6615j.set(false);
        } else if (i == 102) {
            this.f6611f = false;
            if (this.f6610e) {
                mo17800a();
            }
            C2933b.m8266b("TNCManager", "doRefresh, error");
            this.f6615j.set(false);
        }
    }

    /* renamed from: d */
    public synchronized void mo17807d() {
        if (!this.f6617l) {
            this.f6617l = true;
            long j = this.f6616k.getSharedPreferences("ss_app_config", 0).getLong("last_refresh_time", 0);
            long currentTimeMillis = System.currentTimeMillis();
            if (j > currentTimeMillis) {
                j = currentTimeMillis;
            }
            this.f6612g = j;
            try {
                if (C2931g.m8259a().mo17844a(this.f6619n).mo17840h() != null) {
                    C2931g.m8259a().mo17844a(this.f6619n).mo17840h().mo17823a();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: e */
    public void mo17808e() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                if (this.f6608c) {
                    mo17807d();
                } else {
                    mo17804b();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo17805b(boolean z) {
        C2933b.m8266b("TNCManager", "doRefresh, actual request");
        mo17807d();
        this.f6611f = true;
        if (!z) {
            this.f6607a.sendEmptyMessage(102);
            return;
        }
        try {
            m8202h();
        } catch (Exception unused) {
            this.f6615j.set(false);
        }
    }

    /* renamed from: f */
    public String[] mo17809f() {
        String[] f = C2931g.m8259a().mo17844a(this.f6619n).mo17836d() != null ? C2931g.m8259a().mo17844a(this.f6619n).mo17836d().mo17821f() : null;
        return (f == null || f.length <= 0) ? new String[0] : f;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m8196a(Object obj) throws Exception {
        JSONObject jSONObject;
        if (obj instanceof String) {
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            jSONObject = new JSONObject(str);
            if (!"success".equals(jSONObject.getString("message"))) {
                return false;
            }
        } else {
            jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
        }
        if (jSONObject == null) {
            return false;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        synchronized (this) {
            SharedPreferences.Editor edit = this.f6616k.getSharedPreferences("ss_app_config", 0).edit();
            edit.putLong("last_refresh_time", System.currentTimeMillis());
            edit.apply();
        }
        if (C2931g.m8259a().mo17844a(this.f6619n).mo17840h() == null) {
            return true;
        }
        C2931g.m8259a().mo17844a(this.f6619n).mo17840h().mo17824a(jSONObject2);
        return true;
    }

    /* renamed from: h */
    private boolean m8202h() {
        String[] f = mo17809f();
        if (!(f == null || f.length == 0)) {
            m8192a(0);
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8192a(final int i) {
        String[] f = mo17809f();
        if (f == null || f.length <= i) {
            m8198b(102);
            return;
        }
        String str = f[i];
        if (TextUtils.isEmpty(str)) {
            m8198b(102);
            return;
        }
        try {
            String a = m8191a(str);
            if (TextUtils.isEmpty(a)) {
                m8198b(102);
                return;
            }
            C2916b c = m8203i().mo17762c();
            c.mo17789a(a);
            m8193a(c);
            c.mo17786a(new C2912a() {
                /* renamed from: a */
                public void mo17771a(C2918c cVar, C2913b bVar) {
                    JSONObject jSONObject;
                    if (bVar == null || !bVar.mo17779f()) {
                        C2921a.this.m8192a(i + 1);
                        return;
                    }
                    String str = null;
                    try {
                        jSONObject = new JSONObject(bVar.mo17777d());
                    } catch (Exception unused) {
                        jSONObject = null;
                    }
                    if (jSONObject == null) {
                        C2921a.this.m8192a(i + 1);
                        return;
                    }
                    try {
                        str = jSONObject.getString("message");
                    } catch (Exception unused2) {
                    }
                    if (!"success".equals(str)) {
                        C2921a.this.m8192a(i + 1);
                        return;
                    }
                    try {
                        if (C2921a.this.m8196a((Object) jSONObject)) {
                            C2921a.this.m8198b(101);
                        } else {
                            C2921a.this.m8192a(i + 1);
                        }
                    } catch (Exception unused3) {
                    }
                }

                /* renamed from: a */
                public void mo17772a(C2918c cVar, IOException iOException) {
                    C2921a.this.m8192a(i + 1);
                }
            });
        } catch (Throwable th) {
            C2933b.m8266b("AppConfig", "try app config exception: " + th);
        }
    }

    /* renamed from: i */
    private C2909a m8203i() {
        if (this.f6618m == null) {
            this.f6618m = new C2909a.C2911a().mo17765a(10, TimeUnit.SECONDS).mo17768b(10, TimeUnit.SECONDS).mo17769c(10, TimeUnit.SECONDS).mo17767a();
        }
        return this.f6618m;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m8198b(int i) {
        C2942g gVar = this.f6607a;
        if (gVar != null) {
            gVar.sendEmptyMessage(i);
        }
    }

    /* renamed from: a */
    private String m8191a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return "https://" + str + "/get_domains/v4/";
    }

    /* renamed from: a */
    private void m8193a(C2916b bVar) {
        String str;
        if (bVar != null) {
            Address address = null;
            if (C2931g.m8259a().mo17844a(this.f6619n).mo17836d() != null) {
                address = C2931g.m8259a().mo17844a(this.f6619n).mo17836d().mo17814a(this.f6616k);
            }
            if (address != null && address.hasLatitude() && address.hasLongitude()) {
                bVar.mo17787a("latitude", address.getLatitude() + "");
                bVar.mo17787a("longitude", address.getLongitude() + "");
                String locality = address.getLocality();
                if (!TextUtils.isEmpty(locality)) {
                    bVar.mo17787a("city", Uri.encode(locality));
                }
            }
            if (this.f6609d) {
                bVar.mo17787a("force", "1");
            }
            try {
                if (Build.VERSION.SDK_INT < 21) {
                    str = Build.CPU_ABI;
                } else {
                    str = Build.SUPPORTED_ABIS[0];
                }
                bVar.mo17787a("abi", str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (C2931g.m8259a().mo17844a(this.f6619n).mo17836d() != null) {
                bVar.mo17787a("aid", C2931g.m8259a().mo17844a(this.f6619n).mo17836d().mo17813a() + "");
                bVar.mo17787a("device_platform", C2931g.m8259a().mo17844a(this.f6619n).mo17836d().mo17818c());
                bVar.mo17787a("channel", C2931g.m8259a().mo17844a(this.f6619n).mo17836d().mo17817b());
                bVar.mo17787a("version_code", C2931g.m8259a().mo17844a(this.f6619n).mo17836d().mo17819d() + "");
                bVar.mo17787a("custom_info_1", C2931g.m8259a().mo17844a(this.f6619n).mo17836d().mo17820e());
            }
        }
    }

    /* renamed from: g */
    public ThreadPoolExecutor mo17810g() {
        if (this.f6614i == null) {
            synchronized (C2921a.class) {
                if (this.f6614i == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 20, TimeUnit.SECONDS, new LinkedBlockingQueue());
                    this.f6614i = threadPoolExecutor;
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
            }
        }
        return this.f6614i;
    }

    /* renamed from: a */
    public void mo17802a(ThreadPoolExecutor threadPoolExecutor) {
        this.f6614i = threadPoolExecutor;
    }
}
