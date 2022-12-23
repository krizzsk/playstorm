package com.bytedance.sdk.openadsdk.core;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.sdk.component.adexpress.p091a.p092a.C2599a;
import com.bytedance.sdk.component.adexpress.p091a.p092a.C2600b;
import com.bytedance.sdk.component.adexpress.p091a.p092a.C2601c;
import com.bytedance.sdk.component.adexpress.p091a.p092a.C2602d;
import com.bytedance.sdk.component.adexpress.p091a.p093b.C2603a;
import com.bytedance.sdk.component.adexpress.p091a.p094c.C2614a;
import com.bytedance.sdk.component.p120e.p122b.C2914a;
import com.bytedance.sdk.component.p120e.p122b.C2916b;
import com.bytedance.sdk.component.widget.p127a.C2995a;
import com.bytedance.sdk.component.widget.p127a.C2996b;
import com.bytedance.sdk.component.widget.p128b.C2997a;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.video.p163b.C3661a;
import com.bytedance.sdk.openadsdk.multipro.C3953b;
import com.bytedance.sdk.openadsdk.multipro.aidl.C3952c;
import com.bytedance.sdk.openadsdk.multipro.p180a.C3914a;
import com.bytedance.sdk.openadsdk.p130b.C3156e;
import com.bytedance.sdk.openadsdk.p172h.C3815b;
import com.bytedance.sdk.openadsdk.p172h.p173a.C3814b;
import com.bytedance.sdk.openadsdk.p176i.C3853c;
import com.bytedance.sdk.openadsdk.p176i.C3854d;
import com.bytedance.sdk.openadsdk.utils.C4002l;
import com.bytedance.sdk.openadsdk.utils.C4011r;
import com.bytedance.sdk.openadsdk.utils.C4020v;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.k */
/* compiled from: InitHelper */
public class C3568k {

    /* renamed from: a */
    public static volatile boolean f8980a = false;

    /* renamed from: b */
    public static AtomicBoolean f8981b = new AtomicBoolean(false);

    /* renamed from: c */
    public static volatile boolean f8982c = false;

    /* renamed from: d */
    private static AtomicBoolean f8983d = new AtomicBoolean(false);

    /* renamed from: e */
    private static volatile HandlerThread f8984e;

    /* renamed from: f */
    private static volatile Handler f8985f;

    /* renamed from: g */
    private static volatile Handler f8986g;

    static {
        f8984e = null;
        f8986g = null;
        f8984e = new HandlerThread("tt_pangle_thread_init", 10);
        f8984e.start();
        f8986g = new Handler(f8984e.getLooper());
    }

    /* renamed from: a */
    public static void m11187a() {
        Context a;
        if (C3578m.m11241h().mo19935d() && (a = C3578m.m11231a()) != null) {
            try {
                C3854d.m12660a().mo20705b().mo17760a(a, C3953b.m12901c(), true, new C3853c(a));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m11188a(Context context) {
        C4011r.m13165a();
        C4020v.m13278a(context);
        m11190b(context);
        C3578m.m11242i().mo20675a();
        C3644s.m11587a(C3538j.m11045a(context));
        C3578m.m11240g().mo20784a();
        C2603a.m6638a();
        C3661a.m11659a().mo20259b();
    }

    /* renamed from: b */
    public static void m11189b() {
        C2599a.m6611a().mo16623a((C2600b) new C2600b() {
            /* renamed from: a */
            public int mo16631a(String str, ContentValues contentValues, String str2, String[] strArr) {
                return C3914a.m12848a(C3578m.m11231a(), str, contentValues, str2, strArr);
            }

            /* renamed from: a */
            public Cursor mo16633a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
                return new C3952c(C3914a.m12852a(C3578m.m11231a(), str, strArr, str2, strArr2, str3, str4, str5));
            }

            /* renamed from: a */
            public int mo16632a(String str, String str2, String[] strArr) {
                return C3914a.m12849a(C3578m.m11231a(), str, str2, strArr);
            }

            /* renamed from: a */
            public void mo16634a(String str, ContentValues contentValues) {
                C3914a.m12854a(C3578m.m11231a(), str, contentValues);
            }
        });
        C2599a.m6611a().mo16624a((C2601c) new C2601c() {
            /* renamed from: d */
            public void mo16638d() {
            }

            /* renamed from: i */
            public int mo16643i() {
                return 1;
            }

            /* renamed from: k */
            public int mo16645k() {
                return 0;
            }

            /* renamed from: a */
            public int mo16635a() {
                if (C3578m.m11241h() == null) {
                    return 0;
                }
                return C3578m.m11241h().mo19928b();
            }

            /* renamed from: b */
            public Context mo16636b() {
                return C3578m.m11231a();
            }

            /* renamed from: c */
            public Handler mo16637c() {
                return C3568k.m11192d();
            }

            /* renamed from: e */
            public C2614a mo16639e() {
                return C3578m.m11239f().mo20070a();
            }

            /* renamed from: f */
            public C2914a mo16640f() {
                return C3854d.m12660a().mo20705b().mo17763d();
            }

            /* renamed from: g */
            public C2916b mo16641g() {
                return C3854d.m12660a().mo20705b().mo17762c();
            }

            /* renamed from: h */
            public String mo16642h() {
                return C3524h.m10852d().mo19854f();
            }

            /* renamed from: j */
            public int mo16644j() {
                return C3578m.m11241h().mo19921H();
            }
        });
        C2599a.m6611a().mo16625a((C2602d) new C2602d() {
            /* renamed from: a */
            public void mo16646a(int i) {
                C3815b.m12552a().mo20665b(C3814b.m12522b().mo20635b(i).mo20643f(C3513g.m10825a(i)));
            }
        });
        C2995a.m8507a().mo17995a(new C2996b() {
            /* renamed from: a */
            public boolean mo17998a() {
                return true;
            }

            /* renamed from: a */
            public void mo17997a(C2997a aVar, String str, String str2, JSONObject jSONObject, long j) {
                C3498n nVar = new C3498n();
                nVar.mo19740q(aVar.mo17999a());
                nVar.mo19729m(aVar.mo18002b());
                nVar.mo19723k(aVar.mo18004c());
                C3156e.m9174a(C3578m.m11231a(), nVar, str, str2, jSONObject, j);
            }
        });
    }

    /* renamed from: b */
    private static void m11190b(Context context) {
        C3455c.m10351a(context).mo19457a("uuid", C4002l.m13120a());
    }

    /* renamed from: c */
    public static Handler m11191c() {
        if (f8984e == null || !f8984e.isAlive()) {
            synchronized (C3568k.class) {
                if (f8984e == null || !f8984e.isAlive()) {
                    f8984e = new HandlerThread("tt_pangle_thread_init", -1);
                    f8984e.start();
                    f8986g = new Handler(f8984e.getLooper());
                }
            }
        }
        return f8986g;
    }

    /* renamed from: d */
    public static Handler m11192d() {
        if (f8985f == null) {
            synchronized (C3568k.class) {
                if (f8985f == null) {
                    f8985f = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f8985f;
    }
}
