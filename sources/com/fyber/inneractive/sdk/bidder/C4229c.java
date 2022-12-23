package com.fyber.inneractive.sdk.bidder;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.fyber.inneractive.sdk.config.C4273e;
import com.fyber.inneractive.sdk.config.C4315k;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.serverapi.C5298a;
import com.fyber.inneractive.sdk.serverapi.C5300b;
import com.fyber.inneractive.sdk.util.C5348k;
import com.fyber.inneractive.sdk.util.C5349k0;
import com.fyber.inneractive.sdk.util.C5350l;
import com.fyber.inneractive.sdk.util.C5357n;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.bidder.c */
public class C4229c {

    /* renamed from: A */
    public int f10438A;

    /* renamed from: B */
    public String f10439B;

    /* renamed from: C */
    public Long f10440C;

    /* renamed from: D */
    public String f10441D;

    /* renamed from: E */
    public Boolean f10442E;

    /* renamed from: F */
    public String f10443F;

    /* renamed from: G */
    public String f10444G;

    /* renamed from: H */
    public int f10445H;

    /* renamed from: I */
    public InneractiveUserConfig.Gender f10446I;

    /* renamed from: J */
    public boolean f10447J;

    /* renamed from: K */
    public String f10448K;

    /* renamed from: L */
    public String f10449L;

    /* renamed from: a */
    public final C5300b f10450a;

    /* renamed from: b */
    public String f10451b;

    /* renamed from: c */
    public String f10452c;

    /* renamed from: d */
    public String f10453d;

    /* renamed from: e */
    public String f10454e;

    /* renamed from: f */
    public String f10455f;

    /* renamed from: g */
    public String f10456g;

    /* renamed from: h */
    public String f10457h;

    /* renamed from: i */
    public String f10458i;

    /* renamed from: j */
    public String f10459j;

    /* renamed from: k */
    public String f10460k;

    /* renamed from: l */
    public int f10461l;

    /* renamed from: m */
    public Long f10462m;

    /* renamed from: n */
    public int f10463n;

    /* renamed from: o */
    public int f10464o;

    /* renamed from: p */
    public TokenParametersOuterClass$TokenParameters.C4198d f10465p = C4233f.m13394b(C5298a.m16654c());

    /* renamed from: q */
    public String f10466q;

    /* renamed from: r */
    public String f10467r;

    /* renamed from: s */
    public TokenParametersOuterClass$TokenParameters.C4202h f10468s;

    /* renamed from: t */
    public Boolean f10469t;

    /* renamed from: u */
    public Boolean f10470u;

    /* renamed from: v */
    public Boolean f10471v;

    /* renamed from: w */
    public boolean f10472w;

    /* renamed from: x */
    public Boolean f10473x;

    /* renamed from: y */
    public Boolean f10474y;

    /* renamed from: z */
    public Boolean f10475z;

    /* renamed from: com.fyber.inneractive.sdk.bidder.c$a */
    public class C4230a implements Runnable {
        public C4230a() {
        }

        public void run() {
            C4229c.this.f10451b = C5350l.m16770f();
        }
    }

    public C4229c(C5300b bVar) {
        this.f10450a = bVar;
        mo24237c();
        this.f10452c = bVar.mo26398a("2.2.0");
        this.f10453d = bVar.mo26408j();
        this.f10454e = bVar.mo26400b();
        this.f10455f = bVar.mo26409k();
        this.f10463n = bVar.mo26411m();
        this.f10464o = bVar.mo26410l();
        this.f10468s = bVar.mo26413o() ? TokenParametersOuterClass$TokenParameters.C4202h.SECURE : TokenParametersOuterClass$TokenParameters.C4202h.UNSECURE;
        mo24236b();
        mo24234a();
        this.f10470u = C5298a.m16659h();
        this.f10442E = C5298a.m16661j();
        this.f10473x = C5298a.m16658g();
        this.f10474y = C5298a.m16663l();
        this.f10475z = C5298a.m16662k();
    }

    /* renamed from: a */
    public void mo24234a() {
        this.f10450a.getClass();
        IAConfigManager iAConfigManager = IAConfigManager.f10525J;
        this.f10456g = iAConfigManager.f10551p;
        this.f10450a.getClass();
        this.f10457h = C5348k.m16742g();
        this.f10458i = this.f10450a.mo26396a();
        this.f10459j = this.f10450a.mo26406h();
        this.f10460k = this.f10450a.mo26407i();
        this.f10461l = C5298a.m16657f().intValue();
        this.f10462m = C5298a.m16656e();
        this.f10450a.getClass();
        List<String> list = iAConfigManager.f10552q;
        if (list != null && !list.isEmpty()) {
            this.f10466q = C5350l.m16762b(",", list);
        }
        this.f10450a.getClass();
        this.f10467r = C5349k0.m16751f().f14215a;
        this.f10443F = C5298a.m16651a();
        this.f10472w = C5298a.m16660i().booleanValue();
        this.f10438A = C5298a.m16653b().intValue();
        this.f10439B = this.f10450a.mo26404f();
        this.f10440C = C5298a.m16655d();
        int i = C4273e.f10606a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.device");
        if (TextUtils.isEmpty(property)) {
            property = C4315k.m13546a();
        }
        this.f10441D = property;
        this.f10444G = iAConfigManager.f10546k;
        this.f10445H = iAConfigManager.f10545j.getAge();
        this.f10446I = iAConfigManager.f10545j.getGender();
        this.f10448K = iAConfigManager.f10545j.getZipCode();
        this.f10447J = iAConfigManager.f10547l;
        this.f10469t = C5298a.m16664m();
        mo24236b();
        this.f10471v = C5298a.m16665n();
    }

    /* renamed from: b */
    public final void mo24236b() {
        IAConfigManager iAConfigManager = IAConfigManager.f10525J;
        if (!TextUtils.isEmpty(iAConfigManager.f10550o)) {
            this.f10449L = String.format("%s_%s", new Object[]{iAConfigManager.f10548m, iAConfigManager.f10550o});
            return;
        }
        this.f10449L = iAConfigManager.f10548m;
    }

    /* renamed from: c */
    public final void mo24237c() {
        if (TextUtils.isEmpty(this.f10451b)) {
            C5357n.m16773a(new C4230a());
        }
    }

    /* renamed from: a */
    public void mo24235a(String str) {
        this.f10451b = str;
    }
}
