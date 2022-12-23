package com.applovin.impl.sdk.p049d;

import android.app.Activity;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.p046ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p049d.C1867c;
import com.applovin.impl.sdk.utils.C2039g;
import com.applovin.impl.sdk.utils.C2040h;

/* renamed from: com.applovin.impl.sdk.d.d */
public class C1869d {

    /* renamed from: a */
    private final C1959m f3421a;

    /* renamed from: b */
    private final C1872g f3422b;

    /* renamed from: c */
    private final C1867c.C1868a f3423c;

    /* renamed from: d */
    private final Object f3424d = new Object();

    /* renamed from: e */
    private final long f3425e;

    /* renamed from: f */
    private long f3426f;

    /* renamed from: g */
    private long f3427g;

    /* renamed from: h */
    private long f3428h;

    public C1869d(AppLovinAdImpl appLovinAdImpl, C1959m mVar) {
        if (appLovinAdImpl == null) {
            throw new IllegalArgumentException("No ad specified");
        } else if (mVar != null) {
            this.f3421a = mVar;
            this.f3422b = mVar.mo14304T();
            C1867c.C1868a a = mVar.mo14330ac().mo14097a(appLovinAdImpl);
            this.f3423c = a;
            a.mo14099a(C1866b.f3389a, (long) appLovinAdImpl.getSource().ordinal()).mo14101a();
            this.f3425e = appLovinAdImpl.getCreatedAtMillis();
        } else {
            throw new IllegalArgumentException("No sdk specified");
        }
    }

    /* renamed from: a */
    public static void m4081a(long j, AppLovinAdBase appLovinAdBase, C1959m mVar) {
        if (appLovinAdBase != null && mVar != null) {
            mVar.mo14330ac().mo14097a(appLovinAdBase).mo14099a(C1866b.f3390b, j).mo14101a();
        }
    }

    /* renamed from: a */
    public static void m4082a(AppLovinAdBase appLovinAdBase, C1959m mVar) {
        if (appLovinAdBase != null && mVar != null) {
            mVar.mo14330ac().mo14097a(appLovinAdBase).mo14099a(C1866b.f3391c, appLovinAdBase.getFetchLatencyMillis()).mo14099a(C1866b.f3392d, appLovinAdBase.getFetchResponseSize()).mo14101a();
        }
    }

    /* renamed from: a */
    private void m4083a(C1866b bVar) {
        synchronized (this.f3424d) {
            if (this.f3426f > 0) {
                this.f3423c.mo14099a(bVar, System.currentTimeMillis() - this.f3426f).mo14101a();
            }
        }
    }

    /* renamed from: a */
    public static void m4084a(C1870e eVar, AppLovinAdBase appLovinAdBase, C1959m mVar) {
        if (appLovinAdBase != null && mVar != null && eVar != null) {
            mVar.mo14330ac().mo14097a(appLovinAdBase).mo14099a(C1866b.f3393e, eVar.mo14119c()).mo14099a(C1866b.f3394f, eVar.mo14120d()).mo14099a(C1866b.f3409u, eVar.mo14123g()).mo14099a(C1866b.f3410v, eVar.mo14124h()).mo14099a(C1866b.f3411w, eVar.mo14118b() ? 1 : 0).mo14101a();
        }
    }

    /* renamed from: a */
    public void mo14102a() {
        this.f3423c.mo14099a(C1866b.f3398j, this.f3422b.mo14128a(C1871f.f3437b)).mo14099a(C1866b.f3397i, this.f3422b.mo14128a(C1871f.f3439d));
        synchronized (this.f3424d) {
            long j = 0;
            if (this.f3425e > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                this.f3426f = currentTimeMillis;
                long O = currentTimeMillis - this.f3421a.mo14299O();
                long j2 = this.f3426f - this.f3425e;
                long j3 = C2040h.m4900a(this.f3421a.mo14297L()) ? 1 : 0;
                Activity a = this.f3421a.mo14333af().mo13822a();
                if (C2039g.m4887f() && a != null && a.isInMultiWindowMode()) {
                    j = 1;
                }
                this.f3423c.mo14099a(C1866b.f3396h, O).mo14099a(C1866b.f3395g, j2).mo14099a(C1866b.f3404p, j3).mo14099a(C1866b.f3412x, j);
            }
        }
        this.f3423c.mo14101a();
    }

    /* renamed from: a */
    public void mo14103a(long j) {
        this.f3423c.mo14099a(C1866b.f3406r, j).mo14101a();
    }

    /* renamed from: b */
    public void mo14104b() {
        synchronized (this.f3424d) {
            if (this.f3427g < 1) {
                long currentTimeMillis = System.currentTimeMillis();
                this.f3427g = currentTimeMillis;
                if (this.f3426f > 0) {
                    this.f3423c.mo14099a(C1866b.f3401m, currentTimeMillis - this.f3426f).mo14101a();
                }
            }
        }
    }

    /* renamed from: b */
    public void mo14105b(long j) {
        this.f3423c.mo14099a(C1866b.f3405q, j).mo14101a();
    }

    /* renamed from: c */
    public void mo14106c() {
        m4083a(C1866b.f3399k);
    }

    /* renamed from: c */
    public void mo14107c(long j) {
        this.f3423c.mo14099a(C1866b.f3407s, j).mo14101a();
    }

    /* renamed from: d */
    public void mo14108d() {
        m4083a(C1866b.f3402n);
    }

    /* renamed from: d */
    public void mo14109d(long j) {
        synchronized (this.f3424d) {
            if (this.f3428h < 1) {
                this.f3428h = j;
                this.f3423c.mo14099a(C1866b.f3408t, j).mo14101a();
            }
        }
    }

    /* renamed from: e */
    public void mo14110e() {
        m4083a(C1866b.f3403o);
    }

    /* renamed from: f */
    public void mo14111f() {
        m4083a(C1866b.f3400l);
    }

    /* renamed from: g */
    public void mo14112g() {
        this.f3423c.mo14098a(C1866b.f3413y).mo14101a();
    }
}
