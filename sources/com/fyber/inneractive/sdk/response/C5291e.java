package com.fyber.inneractive.sdk.response;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C4309s;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.p189dv.C4364g;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.response.e */
public abstract class C5291e {

    /* renamed from: A */
    public boolean f14065A = false;

    /* renamed from: a */
    public long f14066a;

    /* renamed from: b */
    public long f14067b;

    /* renamed from: c */
    public long f14068c;

    /* renamed from: d */
    public String f14069d;

    /* renamed from: e */
    public int f14070e;

    /* renamed from: f */
    public int f14071f;

    /* renamed from: g */
    public int f14072g;

    /* renamed from: h */
    public String f14073h;

    /* renamed from: i */
    public String f14074i;

    /* renamed from: j */
    public String f14075j;

    /* renamed from: k */
    public String f14076k;

    /* renamed from: l */
    public String f14077l;

    /* renamed from: m */
    public String f14078m;

    /* renamed from: n */
    public UnitDisplayType f14079n;

    /* renamed from: o */
    public String f14080o;

    /* renamed from: p */
    public Map<String, String> f14081p;

    /* renamed from: q */
    public String f14082q;

    /* renamed from: r */
    public ImpressionData f14083r;

    /* renamed from: s */
    public C4364g f14084s;

    /* renamed from: t */
    public int f14085t = 0;

    /* renamed from: u */
    public float f14086u = -1.0f;

    /* renamed from: v */
    public String f14087v;

    /* renamed from: w */
    public int f14088w = -1;

    /* renamed from: x */
    public Exception f14089x;

    /* renamed from: y */
    public String f14090y;

    /* renamed from: z */
    public String f14091z;

    /* renamed from: a */
    public int mo26388a() {
        return this.f14071f;
    }

    /* renamed from: a */
    public abstract InneractiveErrorCode mo24396a(InneractiveAdRequest inneractiveAdRequest);

    /* renamed from: a */
    public abstract InneractiveErrorCode mo24397a(InneractiveAdRequest inneractiveAdRequest, C4309s sVar);

    /* renamed from: b */
    public UnitDisplayType mo26389b() {
        return this.f14079n;
    }

    /* renamed from: c */
    public int mo26390c() {
        return this.f14070e;
    }

    /* renamed from: d */
    public boolean mo26391d() {
        return this.f14066a < System.currentTimeMillis();
    }
}
