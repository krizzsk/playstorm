package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import com.bykv.p068vk.openvk.component.video.api.C2518b;
import com.bykv.p068vk.openvk.component.video.api.p085c.C2521b;
import com.bykv.p068vk.openvk.component.video.api.p085c.C2522c;
import com.bykv.p068vk.openvk.component.video.api.p087e.C2531a;
import com.bytedance.sdk.component.p110d.C2898j;
import com.bytedance.sdk.component.p110d.C2902n;
import com.bytedance.sdk.component.p110d.C2908t;
import com.bytedance.sdk.component.p125f.C2952e;
import com.bytedance.sdk.component.p125f.C2955g;
import com.bytedance.sdk.component.utils.C2958a;
import com.bytedance.sdk.component.utils.C2963e;
import com.bytedance.sdk.component.utils.C2964f;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2979o;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.component.p138c.C3272a;
import com.bytedance.sdk.openadsdk.component.p139d.C3274a;
import com.bytedance.sdk.openadsdk.component.p141f.C3281a;
import com.bytedance.sdk.openadsdk.core.C3423b;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.C3581n;
import com.bytedance.sdk.openadsdk.core.p151e.C3469a;
import com.bytedance.sdk.openadsdk.core.p151e.C3470b;
import com.bytedance.sdk.openadsdk.core.p151e.C3484k;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.p151e.C3500o;
import com.bytedance.sdk.openadsdk.core.p151e.C3503r;
import com.bytedance.sdk.openadsdk.core.video.p165d.C3687a;
import com.bytedance.sdk.openadsdk.multipro.C3953b;
import com.bytedance.sdk.openadsdk.multipro.p185d.C3966a;
import com.bytedance.sdk.openadsdk.p129a.C3019b;
import com.bytedance.sdk.openadsdk.p130b.C3126a;
import com.bytedance.sdk.openadsdk.p167d.C3769a;
import com.bytedance.sdk.openadsdk.p176i.C3845a;
import com.bytedance.sdk.openadsdk.p176i.p177a.C3850b;
import com.bytedance.sdk.openadsdk.utils.C3995g;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.component.a */
/* compiled from: TTAppOpenAdCacheManager */
public class C3245a {

    /* renamed from: a */
    private static volatile C3245a f7679a;

    /* renamed from: b */
    private final C3019b f7680b;

    /* renamed from: c */
    private final C3581n<C3126a> f7681c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Context f7682d;

    /* renamed from: com.bytedance.sdk.openadsdk.component.a$b */
    /* compiled from: TTAppOpenAdCacheManager */
    public interface C3254b {
        /* renamed from: a */
        void mo18935a();

        /* renamed from: a */
        void mo18936a(C3850b bVar);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.component.a$c */
    /* compiled from: TTAppOpenAdCacheManager */
    interface C3255c {
        /* renamed from: a */
        void mo18933a();

        /* renamed from: a */
        void mo18934a(int i, String str);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.component.a$d */
    /* compiled from: TTAppOpenAdCacheManager */
    public interface C3256d {
        /* renamed from: a */
        void mo18402a();

        /* renamed from: a */
        void mo18403a(Bitmap bitmap);
    }

    private C3245a(Context context) {
        if (context != null) {
            this.f7682d = context.getApplicationContext();
        } else {
            this.f7682d = C3578m.m11231a();
        }
        this.f7680b = new C3019b(10, 8, true);
        this.f7681c = C3578m.m11239f();
    }

    /* renamed from: a */
    public static C3245a m9453a(Context context) {
        if (f7679a == null) {
            synchronized (C3245a.class) {
                if (f7679a == null) {
                    f7679a = new C3245a(context);
                }
            }
        }
        return f7679a;
    }

    /* renamed from: a */
    public void mo18919a(final AdSlot adSlot) {
        long currentTimeMillis = System.currentTimeMillis();
        final C3503r rVar = new C3503r();
        rVar.mo19785a(currentTimeMillis);
        C3500o oVar = new C3500o();
        oVar.f8661g = currentTimeMillis;
        oVar.f8663i = rVar;
        oVar.f8658d = 2;
        this.f7681c.mo20073a(adSlot, oVar, 3, new C3581n.C3582a() {
            /* renamed from: a */
            public void mo18544a(int i, String str) {
                C2975l.m8384b("TTAppOpenAdCacheManager", "cache Load App OpenAd From Network fail");
            }

            /* renamed from: a */
            public void mo18545a(C3469a aVar, C3470b bVar) {
                C2975l.m8384b("TTAppOpenAdCacheManager", "cache Load App Open Ad From Network success");
                if (aVar == null || aVar.mo19477b() == null || aVar.mo19477b().size() == 0) {
                    C2975l.m8384b("TTAppOpenAdCacheManager", "material is null");
                    bVar.mo19482a(-3);
                    C3470b.m10407a(bVar);
                    return;
                }
                C3498n nVar = aVar.mo19477b().get(0);
                if (C3498n.m10583c(nVar)) {
                    C3245a.this.m9456a(nVar, adSlot, rVar);
                } else {
                    C3245a.this.m9458a(nVar, rVar);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9456a(final C3498n nVar, AdSlot adSlot, final C3503r rVar) {
        final int f = C4014u.m13223f(nVar);
        mo18921a(nVar, adSlot, rVar, (C3255c) new C3255c() {
            /* renamed from: a */
            public void mo18934a(int i, String str) {
            }

            /* renamed from: a */
            public void mo18933a() {
                C3274a aVar = new C3274a(f, nVar);
                C3245a.this.mo18920a(aVar);
                C3272a.m9552a(aVar.mo18952b(), 1, rVar);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9458a(final C3498n nVar, final C3503r rVar) {
        final int f = C4014u.m13223f(nVar);
        mo18922a(nVar, rVar, (C3254b) new C3254b() {
            /* renamed from: a */
            public void mo18935a() {
            }

            /* renamed from: a */
            public void mo18936a(C3850b bVar) {
                C3274a aVar = new C3274a(f, nVar);
                C3245a.this.mo18920a(aVar);
                C3272a.m9552a(aVar.mo18952b(), 1, rVar);
            }
        });
    }

    /* renamed from: a */
    public void mo18921a(C3498n nVar, AdSlot adSlot, C3503r rVar, C3255c cVar) {
        C3498n nVar2 = nVar;
        C3503r rVar2 = rVar;
        long currentTimeMillis = System.currentTimeMillis();
        int f = C4014u.m13223f(nVar);
        C2521b J = nVar.mo19607J();
        String i = J.mo16360i();
        String l = J.mo16364l();
        if (TextUtils.isEmpty(l)) {
            l = C2963e.m8350a(i);
        }
        final File a = C3281a.m9584a(l, f);
        if (a.exists()) {
            C2975l.m8384b("TTAppOpenAdCacheManager", "The video cache exists locally, use the cache directly");
            C3281a.m9588a(a);
            mo18918a(f);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (rVar2 != null) {
                rVar2.mo19790c(currentTimeMillis2);
                rVar2.mo19784a(1);
            }
            cVar.mo18933a();
            m9457a(nVar2, (C3256d) null);
        } else if (!C3578m.m11241h().mo19960m(String.valueOf(f)) || C2979o.m8410d(C3578m.m11231a())) {
            C3255c cVar2 = cVar;
            C2522c a2 = C3498n.m10578a(a.getParent(), nVar2);
            a2.mo16377a("material_meta", nVar2);
            a2.mo16377a("ad_slot", adSlot);
            final int i2 = f;
            C32494 r15 = r0;
            final long j = currentTimeMillis;
            C2522c cVar3 = a2;
            final C3498n nVar3 = nVar;
            final C3503r rVar3 = rVar;
            final C3255c cVar4 = cVar;
            C32494 r0 = new C2531a.C2532a() {
                /* renamed from: b */
                public void mo16476b(C2522c cVar, int i) {
                }

                /* renamed from: a */
                public void mo16474a(C2522c cVar, int i) {
                    C2975l.m8384b("TTAppOpenAdCacheManager", "Video file caching success");
                    C3245a.this.mo18923a(a);
                    C3245a.this.mo18918a(i2);
                    long currentTimeMillis = System.currentTimeMillis() - j;
                    C3272a.m9557b(nVar3, currentTimeMillis, true);
                    C3503r rVar = rVar3;
                    if (rVar != null) {
                        rVar.mo19790c(currentTimeMillis);
                        rVar3.mo19784a(2);
                    }
                    cVar4.mo18933a();
                    C3245a.m9457a(nVar3, (C3256d) null);
                }

                /* renamed from: a */
                public void mo16475a(C2522c cVar, int i, String str) {
                    C2975l.m8384b("TTAppOpenAdCacheManager", "Video file caching failed");
                    long currentTimeMillis = System.currentTimeMillis() - j;
                    C3272a.m9557b(nVar3, currentTimeMillis, false);
                    C3503r rVar = rVar3;
                    if (rVar != null) {
                        rVar.mo19790c(currentTimeMillis);
                    }
                    cVar4.mo18934a(i, str);
                    try {
                        if (a.exists() && a.isFile()) {
                            C2964f.m8359c(a);
                        }
                    } catch (Throwable unused) {
                    }
                }
            };
            C3687a.m11850a(cVar3, r15);
            if (Build.VERSION.SDK_INT < 23) {
                mo18923a(new File(C2518b.m6270a().getCacheDir(), "proxy_cache"));
                mo18918a(f);
                long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                C3272a.m9557b(nVar2, currentTimeMillis3, true);
                C3503r rVar4 = rVar;
                if (rVar4 != null) {
                    rVar4.mo19790c(currentTimeMillis3);
                    rVar4.mo19784a(2);
                }
                cVar.mo18933a();
                m9457a(nVar2, (C3256d) null);
            }
        } else {
            cVar.mo18934a(100, "OnlyWifi");
        }
    }

    /* renamed from: a */
    public void mo18922a(C3498n nVar, C3503r rVar, C3254b bVar) {
        C3503r rVar2 = rVar;
        final long currentTimeMillis = System.currentTimeMillis();
        final int f = C4014u.m13223f(nVar);
        C3484k kVar = nVar.mo19613P().get(0);
        String g = kVar.mo19570g();
        String a = kVar.mo19559a();
        int b = kVar.mo19563b();
        int c = kVar.mo19566c();
        File b2 = C3281a.m9589b(TextUtils.isEmpty(g) ? C2963e.m8350a(a) : g, f);
        if (mo18924a(a, g)) {
            C2975l.m8384b("TTAppOpenAdCacheManager", "The image cache exists locally, directly use the cache");
            mo18927c(f);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (rVar2 != null) {
                rVar2.mo19790c(currentTimeMillis2);
                rVar2.mo19784a(1);
            }
            bVar.mo18936a((C3850b) null);
            return;
        }
        final C3254b bVar2 = bVar;
        C3845a aVar = new C3845a(a, kVar.mo19570g());
        final C3498n nVar2 = nVar;
        final C3503r rVar3 = rVar;
        C3995g.m13103a(aVar, b, c, new C3995g.C3997a() {
            /* renamed from: a */
            public void mo18400a(C3850b bVar) {
                if (bVar.mo20697c()) {
                    C2975l.m8384b("TTAppOpenAdCacheManager", "Image loaded successfully");
                    C3245a.this.mo18927c(f);
                    long currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
                    C3272a.m9555a(nVar2, currentTimeMillis, true);
                    C3503r rVar = rVar3;
                    if (rVar != null) {
                        rVar.mo19790c(currentTimeMillis);
                        rVar3.mo19784a(2);
                    }
                    bVar2.mo18936a(bVar);
                    return;
                }
                C3272a.m9555a(nVar2, System.currentTimeMillis() - currentTimeMillis, false);
                bVar2.mo18935a();
            }

            /* renamed from: a */
            public void mo18399a() {
                C2975l.m8384b("TTAppOpenAdCacheManager", "Image loading failed");
                C3272a.m9555a(nVar2, System.currentTimeMillis() - currentTimeMillis, false);
                bVar2.mo18935a();
            }

            /* renamed from: b */
            public void mo18401b() {
                C2975l.m8384b("TTAppOpenAdCacheManager", "Image caching success");
            }
        }, b2.getParent());
    }

    /* renamed from: a */
    public static void m9457a(C3498n nVar, final C3256d dVar) {
        C3769a.m12388a(nVar.mo19607J().mo16358h()).mo17716a(C2908t.BITMAP).mo17711a((C2902n) new C2902n<Bitmap>() {
            /* renamed from: a */
            public void mo17257a(C2898j<Bitmap> jVar) {
                if (jVar == null || jVar.mo17725b() == null) {
                    C3256d dVar = dVar;
                    if (dVar != null) {
                        dVar.mo18402a();
                        return;
                    }
                    return;
                }
                C3256d dVar2 = dVar;
                if (dVar2 != null) {
                    dVar2.mo18403a(jVar.mo17725b());
                }
            }

            /* renamed from: a */
            public void mo17256a(int i, String str, Throwable th) {
                C3256d dVar = dVar;
                if (dVar != null) {
                    dVar.mo18402a();
                }
            }
        });
    }

    /* renamed from: a */
    public void mo18918a(int i) {
        if (C3953b.m12901c()) {
            C3966a.m12967a("tt_openad", "video_has_cached" + i, (Boolean) true);
            return;
        }
        SharedPreferences.Editor edit = this.f7682d.getSharedPreferences("tt_openad", 0).edit();
        edit.putBoolean("video_has_cached" + i, true).apply();
    }

    /* renamed from: b */
    public boolean mo18925b(int i) {
        if (C3953b.m12901c()) {
            return C3966a.m12974a("tt_openad", "video_has_cached" + i, false);
        }
        SharedPreferences sharedPreferences = this.f7682d.getSharedPreferences("tt_openad", 0);
        return sharedPreferences.getBoolean("video_has_cached" + i, false);
    }

    /* renamed from: c */
    public void mo18927c(int i) {
        if (C3953b.m12901c()) {
            C3966a.m12967a("tt_openad", "image_has_cached" + i, (Boolean) true);
            return;
        }
        SharedPreferences.Editor edit = this.f7682d.getSharedPreferences("tt_openad", 0).edit();
        edit.putBoolean("image_has_cached" + i, true).apply();
    }

    /* renamed from: d */
    public boolean mo18928d(int i) {
        if (C3953b.m12901c()) {
            return C3966a.m12974a("tt_openad", "image_has_cached" + i, false);
        }
        SharedPreferences sharedPreferences = this.f7682d.getSharedPreferences("tt_openad", 0);
        return sharedPreferences.getBoolean("image_has_cached" + i, false);
    }

    /* renamed from: a */
    public void mo18920a(C3274a aVar) {
        if (aVar.mo18952b() != null && aVar.mo18951a() != 0) {
            long ag = aVar.mo18952b().mo19663ag();
            if (C3953b.m12901c()) {
                C3966a.m12970a("tt_openad", "material_expiration_time" + aVar.mo18951a(), Long.valueOf(ag));
            } else {
                SharedPreferences.Editor edit = this.f7682d.getSharedPreferences("tt_openad", 0).edit();
                edit.putLong("material_expiration_time" + aVar.mo18951a(), ag).apply();
            }
            m9459b(aVar);
        }
    }

    /* renamed from: e */
    public boolean mo18929e(int i) {
        long j;
        if (C3953b.m12901c()) {
            j = C3966a.m12963a("tt_openad", "material_expiration_time" + i, -1);
        } else {
            SharedPreferences sharedPreferences = this.f7682d.getSharedPreferences("tt_openad", 0);
            j = sharedPreferences.getLong("material_expiration_time" + i, -1);
        }
        if (System.currentTimeMillis() / 1000 < j) {
            return true;
        }
        if (j != -1) {
            C3498n f = mo18930f(i);
            if (f != null) {
                C3272a.m9550a(f);
            }
            mo18931g(i);
        }
        return false;
    }

    /* renamed from: f */
    public C3498n mo18930f(int i) {
        String str;
        String str2;
        if (C3953b.m12901c()) {
            str = C3966a.m12977b("tt_openad_materialMeta", "material" + i, (String) null);
        } else {
            str = this.f7682d.getSharedPreferences("tt_openad_materialMeta", 0).getString("material" + i, (String) null);
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.optInt("cypher", -1);
                str2 = C2958a.m8337b(jSONObject.optString("message"));
            } catch (JSONException e) {
                e.printStackTrace();
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                try {
                    C3498n a = C3423b.m10208a(new JSONObject(str2));
                    if (a != null) {
                        return a;
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    private void m9459b(C3274a aVar) {
        C2952e.m8309a(new C3253a(aVar), 10, 5);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.component.a$a */
    /* compiled from: TTAppOpenAdCacheManager */
    private class C3253a extends C2955g {

        /* renamed from: b */
        private final C3274a f7710b;

        public C3253a(C3274a aVar) {
            super("App Open Ad Write Cache");
            this.f7710b = aVar;
        }

        public void run() {
            try {
                String jSONObject = C2958a.m8335a(this.f7710b.mo18952b().mo19674ar()).toString();
                if (C3953b.m12901c()) {
                    C3966a.m12971a("tt_openad_materialMeta", "material" + this.f7710b.mo18951a(), jSONObject);
                    return;
                }
                SharedPreferences.Editor edit = C3245a.this.f7682d.getSharedPreferences("tt_openad_materialMeta", 0).edit();
                edit.putString("material" + this.f7710b.mo18951a(), jSONObject).apply();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public String mo18915a(C3498n nVar) {
        if (!(nVar == null || nVar.mo19607J() == null || TextUtils.isEmpty(nVar.mo19607J().mo16360i()))) {
            String i = nVar.mo19607J().mo16360i();
            String l = nVar.mo19607J().mo16364l();
            String valueOf = String.valueOf(C4014u.m13223f(nVar));
            if (TextUtils.isEmpty(l)) {
                l = C2963e.m8350a(i);
            }
            File a = C3281a.m9583a(this.f7682d, mo18916a(valueOf), l);
            if (a.exists() && a.isFile()) {
                return a.getAbsolutePath();
            }
        }
        return null;
    }

    /* renamed from: b */
    public boolean mo18926b(C3498n nVar) {
        if (nVar == null || nVar.mo19613P() == null || nVar.mo19613P().size() == 0 || TextUtils.isEmpty(nVar.mo19613P().get(0).mo19559a())) {
            return false;
        }
        C3484k kVar = nVar.mo19613P().get(0);
        return mo18924a(kVar.mo19559a(), kVar.mo19570g());
    }

    /* renamed from: a */
    public boolean mo18924a(String str, String str2) {
        boolean z;
        try {
            if (TextUtils.isEmpty(str2)) {
                str2 = C2963e.m8350a(str);
            }
            File b = C3281a.m9589b(str2, 0);
            InputStream a = C3769a.m12390a(str, str2);
            if (a != null) {
                try {
                    a.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (C3769a.m12391a(str, str2, b.getParent())) {
                    return true;
                }
                if (new File(b.getPath() + ".0").exists()) {
                    return true;
                }
            }
            return z;
        } catch (Exception e2) {
            C2975l.m8391e("TTAppOpenAdCacheManager", e2.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    public void mo18923a(File file) {
        try {
            this.f7680b.mo18365a(file);
        } catch (IOException e) {
            C2975l.m8391e("TTAppOpenAdCacheManager", "trimFileCache IOException:" + e.toString());
        }
    }

    /* renamed from: g */
    public void mo18931g(int i) {
        if (C3953b.m12901c()) {
            C3966a.m12979b("tt_openad_materialMeta", "material" + i);
            C3966a.m12979b("tt_openad", "material_expiration_time" + i);
            C3966a.m12979b("tt_openad", "video_has_cached" + i);
            C3966a.m12979b("tt_openad", "image_has_cached" + i);
            return;
        }
        SharedPreferences.Editor edit = this.f7682d.getSharedPreferences("tt_openad_materialMeta", 0).edit();
        edit.remove("material" + i).apply();
        SharedPreferences.Editor edit2 = this.f7682d.getSharedPreferences("tt_openad", 0).edit();
        SharedPreferences.Editor remove = edit2.remove("material_expiration_time" + i);
        SharedPreferences.Editor remove2 = remove.remove("video_has_cached" + i);
        remove2.remove("image_has_cached" + i).apply();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|(2:5|6)(1:7)|8|9|(1:34)(4:19|(5:21|22|23|28|24)|27|35)) */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0034 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056 A[Catch:{ all -> 0x0061 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18917a() {
        /*
            r4 = this;
            r0 = 0
            boolean r1 = com.bytedance.sdk.openadsdk.multipro.C3953b.m12901c()     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = "tt_openad"
            java.lang.String r3 = "tt_openad_materialMeta"
            if (r1 == 0) goto L_0x0012
            com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12965a((java.lang.String) r3)     // Catch:{ all -> 0x0034 }
            com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12965a((java.lang.String) r2)     // Catch:{ all -> 0x0034 }
            goto L_0x0034
        L_0x0012:
            android.content.Context r1 = r4.f7682d     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r3, r0)     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences$Editor r1 = r1.clear()     // Catch:{ all -> 0x0034 }
            r1.apply()     // Catch:{ all -> 0x0034 }
            android.content.Context r1 = r4.f7682d     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences$Editor r1 = r1.clear()     // Catch:{ all -> 0x0034 }
            r1.apply()     // Catch:{ all -> 0x0034 }
        L_0x0034:
            android.content.Context r1 = r4.f7682d     // Catch:{ all -> 0x0061 }
            java.io.File r1 = r1.getCacheDir()     // Catch:{ all -> 0x0061 }
            if (r1 == 0) goto L_0x0061
            boolean r2 = r1.exists()     // Catch:{ all -> 0x0061 }
            if (r2 == 0) goto L_0x0061
            boolean r2 = r1.isDirectory()     // Catch:{ all -> 0x0061 }
            if (r2 == 0) goto L_0x0061
            com.bytedance.sdk.openadsdk.component.a$7 r2 = new com.bytedance.sdk.openadsdk.component.a$7     // Catch:{ all -> 0x0061 }
            r2.<init>()     // Catch:{ all -> 0x0061 }
            java.io.File[] r1 = r1.listFiles(r2)     // Catch:{ all -> 0x0061 }
            if (r1 == 0) goto L_0x0061
            int r2 = r1.length     // Catch:{ all -> 0x0061 }
            if (r2 <= 0) goto L_0x0061
            int r2 = r1.length     // Catch:{ all -> 0x0061 }
        L_0x0057:
            if (r0 >= r2) goto L_0x0061
            r3 = r1[r0]     // Catch:{ all -> 0x0061 }
            com.bytedance.sdk.component.utils.C2964f.m8359c(r3)     // Catch:{ all -> 0x005e }
        L_0x005e:
            int r0 = r0 + 1
            goto L_0x0057
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.C3245a.mo18917a():void");
    }

    /* renamed from: a */
    public String mo18916a(String str) {
        return C3953b.m12901c() ? "openad_video_cache/" : "/openad_video_cache/";
    }

    /* renamed from: h */
    public String mo18932h(int i) {
        return C3953b.m12901c() ? "openad_image_cache/" : "/openad_image_cache/";
    }
}
