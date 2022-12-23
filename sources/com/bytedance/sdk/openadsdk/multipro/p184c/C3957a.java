package com.bytedance.sdk.openadsdk.multipro.p184c;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2979o;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.C3581n;
import com.bytedance.sdk.openadsdk.multipro.C3913a;
import com.bytedance.sdk.openadsdk.multipro.C3956c;
import com.bytedance.sdk.openadsdk.multipro.C3969e;
import com.bytedance.sdk.openadsdk.multipro.p180a.C3914a;
import com.bytedance.sdk.openadsdk.p130b.C3126a;
import com.bytedance.sdk.openadsdk.p130b.C3152c;
import com.bytedance.sdk.openadsdk.p130b.C3159f;
import com.bytedance.sdk.openadsdk.p130b.C3160g;
import com.bytedance.sdk.openadsdk.p130b.C3161h;
import com.bytedance.sdk.openadsdk.p130b.C3181q;
import com.bytedance.sdk.openadsdk.p130b.C3183s;
import com.bytedance.sdk.openadsdk.p130b.C3184t;
import com.bytedance.sdk.openadsdk.p172h.C3812a;
import com.bytedance.sdk.openadsdk.p172h.p173a.C3813a;
import com.bytedance.sdk.openadsdk.p172h.p175c.C3837c;
import com.bytedance.sdk.openadsdk.p179k.C3902a;
import com.bytedance.sdk.openadsdk.p179k.C3903b;
import com.bytedance.sdk.openadsdk.p179k.C3912h;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.c.a */
/* compiled from: AdEventProviderImpl */
public class C3957a implements C3913a {
    /* renamed from: a */
    public int mo20801a(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    /* renamed from: a */
    public int mo20802a(Uri uri, String str, String[] strArr) {
        return 0;
    }

    /* renamed from: a */
    public Cursor mo20803a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    /* renamed from: a */
    public Uri mo20804a(Uri uri, ContentValues contentValues) {
        return null;
    }

    /* renamed from: a */
    public String mo20805a() {
        return "t_event_ad_event";
    }

    /* renamed from: b */
    public void mo20807b() {
    }

    /* renamed from: f */
    private static IListenerManager m12922f() {
        try {
            if (C3578m.m11231a() != null) {
                return C3914a.m12850a(C3578m.m11231a());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static void m12919c() {
        if (C3578m.m11231a() != null) {
            try {
                IListenerManager f = m12922f();
                if (f != null) {
                    f.getType(Uri.parse(m12923g() + "adEventStart"));
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m12917a(boolean z) {
        if (C3578m.m11231a() != null) {
            try {
                IListenerManager f = m12922f();
                if (f != null) {
                    f.getType(Uri.parse(m12923g() + "logStatusStart" + ("?isRealTime=" + String.valueOf(z))));
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m12914a(String str) {
        if (!TextUtils.isEmpty(str)) {
            C2975l.m8384b("AdEventProviderImpl", "dispatch event");
            try {
                IListenerManager f = m12922f();
                if (f != null) {
                    String a = C3956c.m12912a(str);
                    f.getType(Uri.parse(m12923g() + "adEventDispatch" + "?event=" + a));
                }
            } catch (Throwable th) {
                C2975l.m8391e("AdEventProviderImpl", "dispatch event Throwable:" + th.toString());
            }
        }
    }

    /* renamed from: a */
    public static void m12916a(List<String> list) {
        if (list != null && !list.isEmpty()) {
            try {
                StringBuilder sb = new StringBuilder();
                for (String a : list) {
                    sb.append(C3956c.m12912a(a));
                    sb.append(",");
                }
                String a2 = C3956c.m12912a(sb.toString());
                String str = "?track=" + String.valueOf(a2);
                IListenerManager f = m12922f();
                if (f != null) {
                    f.getType(Uri.parse(m12923g() + "trackUrl" + str));
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: d */
    public static void m12920d() {
        try {
            IListenerManager f = m12922f();
            if (f != null) {
                f.getType(Uri.parse(m12923g() + "trackFailed"));
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    public static void m12921e() {
        try {
            IListenerManager f = m12922f();
            if (f != null) {
                f.getType(Uri.parse(m12923g() + "logStatusInit"));
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static void m12918b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                IListenerManager f = m12922f();
                if (f != null) {
                    String a = C3956c.m12912a(str);
                    f.getType(Uri.parse(m12923g() + "logStatusUpload" + "?event=" + a));
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m12915a(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            try {
                IListenerManager f = m12922f();
                if (f != null) {
                    f.getType(Uri.parse(m12923g() + "logStatusDispatch" + ("?event=" + C3956c.m12912a(str) + "&isRealTime=" + String.valueOf(z))));
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: g */
    private static String m12923g() {
        return C3969e.f10187b + "/" + "t_event_ad_event" + "/";
    }

    /* renamed from: a */
    public String mo20806a(Uri uri) {
        String str = uri.getPath().split("/")[2];
        if ("adEventStart".equals(str)) {
            C2975l.m8384b("AdEventProviderImpl", "====ad event function will be start====");
            C3960b.m12935a().mo18742a();
        } else if ("logStatusStart".equals(str)) {
            C2975l.m8384b("AdEventProviderImpl", "====log stats function will be start====");
            if (Boolean.valueOf(uri.getQueryParameter("isRealTime")).booleanValue()) {
                C3960b.m12938c().mo18742a();
            } else {
                C3960b.m12937b().mo18742a();
            }
        } else if ("adEventDispatch".equals(str)) {
            C2975l.m8384b("AdEventProviderImpl", "dispatch FUN_AD_EVENT_DISPATCH");
            C3126a a = C3126a.m9005a(C3956c.m12913b(uri.getQueryParameter("event")));
            if (a != null) {
                C3960b.m12935a().mo18743a(a);
            }
        } else if ("logStatusDispatch".equals(str)) {
            Boolean valueOf = Boolean.valueOf(uri.getQueryParameter("isRealTime"));
            C3837c.C3840a a2 = C3837c.C3840a.m12604a(C3956c.m12913b(uri.getQueryParameter("event")));
            if (a2 == null) {
                return null;
            }
            if (valueOf.booleanValue()) {
                C3960b.m12938c().mo18743a(a2);
            } else {
                C3960b.m12937b().mo18743a(a2);
            }
        } else if ("trackUrl".equals(str)) {
            try {
                String[] split = C3956c.m12913b(uri.getQueryParameter("track")).split(",");
                if (split.length > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (String b : split) {
                        String b2 = C3956c.m12913b(b);
                        if (!TextUtils.isEmpty(b2)) {
                            arrayList.add(b2);
                        }
                    }
                    C3963d.m12942a().mo20785a(arrayList);
                }
            } catch (Throwable unused) {
            }
        } else if ("trackFailed".equals(str)) {
            C3963d.m12942a().mo20784a();
            C2975l.m8384b("AdEventProviderImpl", "track failed: ");
        } else if ("logStatusInit".equals(str)) {
            C3962c.m12941a().mo20675a();
        } else if ("logStatusUpload".equals(str)) {
            final String b3 = C3956c.m12913b(uri.getQueryParameter("event"));
            if (!TextUtils.isEmpty(b3)) {
                C3962c.m12941a().mo20676a((C3812a) new C3812a() {
                    /* renamed from: a */
                    public C3813a mo18671a() throws Exception {
                        return C3959a.m12933b(b3);
                    }
                });
            }
        }
        return null;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.multipro.c.a$b */
    /* compiled from: AdEventProviderImpl */
    private static class C3960b {

        /* renamed from: a */
        private static volatile C3152c<C3126a> f10178a;

        /* renamed from: b */
        private static volatile C3152c<C3837c.C3840a> f10179b;

        /* renamed from: c */
        private static volatile C3152c<C3837c.C3840a> f10180c;

        /* renamed from: a */
        static C3152c<C3126a> m12935a() {
            if (f10178a == null) {
                synchronized (C3578m.class) {
                    if (f10178a == null) {
                        f10178a = new C3152c<>(new C3160g(C3578m.m11231a()), C3578m.m11239f(), C3161h.C3164b.m9260a(), m12939d());
                    }
                }
            }
            return f10178a;
        }

        /* renamed from: b */
        public static C3152c<C3837c.C3840a> m12937b() {
            if (f10180c == null) {
                synchronized (C3578m.class) {
                    if (f10180c == null) {
                        f10180c = m12936a("ttad_bk_batch_stats", "AdStatsEventBatchThread", false);
                    }
                }
            }
            return f10180c;
        }

        /* renamed from: c */
        public static C3152c<C3837c.C3840a> m12938c() {
            if (f10179b == null) {
                synchronized (C3578m.class) {
                    if (f10179b == null) {
                        f10179b = m12936a("ttad_bk_stats", "AdStatsEventThread", true);
                    }
                }
            }
            return f10179b;
        }

        /* renamed from: a */
        public static C3152c<C3837c.C3840a> m12936a(String str, String str2, boolean z) {
            C3159f fVar;
            C3161h.C3164b bVar;
            if (z) {
                fVar = new C3183s(C3578m.m11231a());
                bVar = C3161h.C3164b.m9260a();
            } else {
                bVar = C3161h.C3164b.m9261b();
                fVar = new C3181q(C3578m.m11231a());
            }
            C3161h.C3163a d = m12939d();
            return new C3152c(fVar, (C3581n) null, bVar, d, new C3184t(str, str2, fVar, (C3581n) null, bVar, d));
        }

        /* renamed from: d */
        private static C3161h.C3163a m12939d() {
            return new C3161h.C3163a() {
                /* renamed from: a */
                public boolean mo18766a() {
                    return C2979o.m8406a(C3578m.m11231a());
                }
            };
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.multipro.c.a$d */
    /* compiled from: AdEventProviderImpl */
    private static class C3963d {

        /* renamed from: a */
        private static volatile C3902a f10182a;

        /* renamed from: a */
        public static C3902a m12942a() {
            if (f10182a == null) {
                synchronized (C3902a.class) {
                    if (f10182a == null) {
                        f10182a = new C3903b(C3578m.m11231a(), new C3912h(C3578m.m11231a()));
                    }
                }
            }
            return f10182a;
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.multipro.c.a$c */
    /* compiled from: AdEventProviderImpl */
    private static class C3962c {

        /* renamed from: a */
        private static volatile C3837c f10181a;

        /* renamed from: a */
        public static C3837c m12941a() {
            if (f10181a == null) {
                synchronized (C3837c.class) {
                    if (f10181a == null) {
                        f10181a = new C3837c();
                    }
                }
            }
            return f10181a;
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.multipro.c.a$a */
    /* compiled from: AdEventProviderImpl */
    private static class C3959a implements C3813a {

        /* renamed from: a */
        JSONObject f10177a;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static C3959a m12933b(String str) {
            return new C3959a(str);
        }

        private C3959a(String str) {
            try {
                this.f10177a = new JSONObject(str);
            } catch (Throwable unused) {
            }
        }

        /* renamed from: a */
        public JSONObject mo20631a() {
            return this.f10177a;
        }
    }
}
