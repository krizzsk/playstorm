package com.fyber.inneractive.sdk.config;

import android.content.Context;
import com.fyber.inneractive.sdk.cache.C4241g;
import com.fyber.inneractive.sdk.config.enums.Vendor;
import com.fyber.inneractive.sdk.config.global.C4277a;
import com.fyber.inneractive.sdk.config.global.C4302l;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.measurement.C4459a;
import com.fyber.inneractive.sdk.network.C4532b0;
import com.fyber.inneractive.sdk.network.C4534c;
import com.fyber.inneractive.sdk.network.C4559m0;
import com.fyber.inneractive.sdk.network.C4581w;
import com.fyber.inneractive.sdk.p189dv.handler.C4365a;
import com.fyber.inneractive.sdk.p189dv.handler.C4368c;
import com.fyber.inneractive.sdk.p189dv.handler.C4370d;
import com.fyber.inneractive.sdk.util.C5347j0;
import com.fyber.inneractive.sdk.util.C5350l;
import com.fyber.inneractive.sdk.util.C5373t;
import com.fyber.inneractive.sdk.util.C5375u;
import com.fyber.inneractive.sdk.util.C5376u0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class IAConfigManager {

    /* renamed from: J */
    public static final IAConfigManager f10525J = new IAConfigManager();

    /* renamed from: K */
    public static long f10526K;

    /* renamed from: A */
    public final C5347j0 f10527A;

    /* renamed from: B */
    public C4532b0<C4258a> f10528B;

    /* renamed from: C */
    public C4532b0<C4302l> f10529C;

    /* renamed from: D */
    public C4270d f10530D;

    /* renamed from: E */
    public final C4365a f10531E;

    /* renamed from: F */
    public final C4241g f10532F;

    /* renamed from: G */
    public final C4534c f10533G;

    /* renamed from: H */
    public final Map<C5375u, C5373t> f10534H;

    /* renamed from: I */
    public C4459a f10535I;

    /* renamed from: a */
    public Map<String, C4344x> f10536a = new HashMap();

    /* renamed from: b */
    public Map<String, C4345y> f10537b = new HashMap();

    /* renamed from: c */
    public String f10538c;

    /* renamed from: d */
    public String f10539d;

    /* renamed from: e */
    public String f10540e;

    /* renamed from: f */
    public Context f10541f;

    /* renamed from: g */
    public List<OnConfigurationReadyAndValidListener> f10542g;

    /* renamed from: h */
    public boolean f10543h;

    /* renamed from: i */
    public final C4326q f10544i;

    /* renamed from: j */
    public InneractiveUserConfig f10545j;

    /* renamed from: k */
    public String f10546k;

    /* renamed from: l */
    public boolean f10547l;

    /* renamed from: m */
    public String f10548m;

    /* renamed from: n */
    public InneractiveMediationName f10549n;

    /* renamed from: o */
    public String f10550o;

    /* renamed from: p */
    public String f10551p;

    /* renamed from: q */
    public List<String> f10552q;

    /* renamed from: r */
    public boolean f10553r;

    /* renamed from: s */
    public boolean f10554s;

    /* renamed from: t */
    public final C4581w f10555t;

    /* renamed from: u */
    public String f10556u;

    /* renamed from: v */
    public C4311i f10557v;

    /* renamed from: w */
    public C4314j f10558w;

    /* renamed from: x */
    public final C4271d0 f10559x;

    /* renamed from: y */
    public C5376u0 f10560y;

    /* renamed from: z */
    public C4277a f10561z;

    public interface OnConfigurationReadyAndValidListener {
        void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z, Exception exc);
    }

    /* renamed from: com.fyber.inneractive.sdk.config.IAConfigManager$a */
    public static class C4258a {

        /* renamed from: a */
        public String f10562a;

        /* renamed from: b */
        public String f10563b;

        /* renamed from: c */
        public String f10564c;

        /* renamed from: d */
        public String f10565d;

        /* renamed from: e */
        public Map<String, C4344x> f10566e = new HashMap();

        /* renamed from: f */
        public Map<String, C4345y> f10567f = new HashMap();

        /* renamed from: g */
        public C4260c f10568g = new C4260c();
    }

    /* renamed from: com.fyber.inneractive.sdk.config.IAConfigManager$b */
    public static class C4259b extends Exception {
    }

    /* renamed from: com.fyber.inneractive.sdk.config.IAConfigManager$c */
    public static class C4260c {

        /* renamed from: a */
        public Set<Vendor> f10569a = new HashSet();
    }

    public IAConfigManager() {
        C4365a aVar;
        new HashSet();
        this.f10543h = false;
        this.f10544i = new C4326q();
        this.f10547l = false;
        this.f10553r = false;
        this.f10554s = true;
        this.f10555t = new C4581w();
        this.f10556u = "";
        this.f10559x = new C4271d0();
        this.f10527A = new C5347j0();
        if (C5350l.m16759a("com.google.android.gms.ads.MobileAds", "com.google.android.gms.ads.query.QueryInfoGenerationCallback")) {
            aVar = new C4368c();
        } else {
            aVar = new C4370d();
        }
        this.f10531E = aVar;
        this.f10532F = new C4241g();
        this.f10533G = new C4534c();
        this.f10534H = new HashMap();
        this.f10542g = new CopyOnWriteArrayList();
    }

    public static void addListener(OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener) {
        f10525J.f10542g.add(onConfigurationReadyAndValidListener);
    }

    /* renamed from: b */
    public static C4311i m13429b() {
        return f10525J.f10557v;
    }

    /* renamed from: c */
    public static C4271d0 m13430c() {
        return f10525J.f10559x;
    }

    /* renamed from: d */
    public static C5376u0 m13431d() {
        return f10525J.f10560y;
    }

    /* renamed from: e */
    public static String m13432e() {
        return f10525J.f10530D.f10597d;
    }

    /* renamed from: f */
    public static boolean m13433f() {
        return f10525J.f10540e != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
        m13428a();
        f10525J.f10532F.mo24246a();
        r1 = com.fyber.inneractive.sdk.web.C5433r.f14386c;
        r1.getClass();
        com.fyber.inneractive.sdk.util.C5357n.m16773a(new com.fyber.inneractive.sdk.web.C5432q(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0059, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002c, code lost:
        if ((java.lang.System.currentTimeMillis() - f10526K <= 3600000) != false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        if (r2 != false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        if (r2 == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        r2 = f10525J.f10557v;
        r2.f10662d = false;
        com.fyber.inneractive.sdk.util.C5357n.m16773a(new com.fyber.inneractive.sdk.util.C5354m(r2.f10663e));
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m13434g() {
        /*
            boolean r0 = m13433f()
            int r1 = com.fyber.inneractive.sdk.config.C4273e.f10606a
            r1 = 0
            java.lang.String r2 = java.lang.Boolean.toString(r1)
            java.lang.String r3 = "ia.testEnvironmentConfiguration.forceConfigRefresh"
            java.lang.String r2 = java.lang.System.getProperty(r3, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r2.booleanValue()
            if (r0 == 0) goto L_0x002e
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = f10526K
            long r3 = r3 - r5
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x002b
            r3 = 1
            goto L_0x002c
        L_0x002b:
            r3 = r1
        L_0x002c:
            if (r3 == 0) goto L_0x0030
        L_0x002e:
            if (r2 == 0) goto L_0x0059
        L_0x0030:
            if (r2 == 0) goto L_0x0042
            com.fyber.inneractive.sdk.config.IAConfigManager r2 = f10525J
            com.fyber.inneractive.sdk.config.i r2 = r2.f10557v
            r2.f10662d = r1
            com.fyber.inneractive.sdk.cache.b r1 = r2.f10663e
            com.fyber.inneractive.sdk.util.m r2 = new com.fyber.inneractive.sdk.util.m
            r2.<init>(r1)
            com.fyber.inneractive.sdk.util.C5357n.m16773a(r2)
        L_0x0042:
            m13428a()
            com.fyber.inneractive.sdk.config.IAConfigManager r1 = f10525J
            com.fyber.inneractive.sdk.cache.g r1 = r1.f10532F
            r1.mo24246a()
            com.fyber.inneractive.sdk.web.r r1 = com.fyber.inneractive.sdk.web.C5433r.f14386c
            r1.getClass()
            com.fyber.inneractive.sdk.web.q r2 = new com.fyber.inneractive.sdk.web.q
            r2.<init>(r1)
            com.fyber.inneractive.sdk.util.C5357n.m16773a(r2)
        L_0x0059:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.config.IAConfigManager.m13434g():boolean");
    }

    public static void removeListener(OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener) {
        f10525J.f10542g.remove(onConfigurationReadyAndValidListener);
    }

    /* renamed from: a */
    public final void mo24261a(Exception exc) {
        for (OnConfigurationReadyAndValidListener next : this.f10542g) {
            if (next != null) {
                boolean f = m13433f();
                IAlog.m16702d("notifying listener configuration state has been resolved", new Object[0]);
                next.onConfigurationReadyAndValid(this, f, !f ? exc : null);
            }
        }
    }

    /* renamed from: a */
    public static void m13428a() {
        IAConfigManager iAConfigManager = f10525J;
        C4532b0<C4258a> b0Var = iAConfigManager.f10528B;
        if (b0Var != null) {
            iAConfigManager.f10555t.f11387a.offer(b0Var);
            b0Var.mo24717a(C4559m0.QUEUED);
        }
        C4311i iVar = iAConfigManager.f10557v;
        if (!iVar.f10662d) {
            iVar.mo24351b();
        }
    }
}
