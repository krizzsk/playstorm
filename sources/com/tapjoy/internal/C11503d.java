package com.tapjoy.internal;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;

/* renamed from: com.tapjoy.internal.d */
public final class C11503d {

    /* renamed from: a */
    public String f27832a;

    /* renamed from: b */
    public String f27833b;

    /* renamed from: c */
    public String f27834c;

    /* renamed from: d */
    public String f27835d;

    /* renamed from: e */
    public String f27836e;

    /* renamed from: f */
    public String f27837f;

    /* renamed from: g */
    public long f27838g;

    public C11503d(String str) {
        C11452bh b = C11452bh.m33266b(str);
        b.mo72223h();
        while (b.mo72225j()) {
            String l = b.mo72227l();
            if (InAppPurchaseMetaData.KEY_PRODUCT_ID.equals(l)) {
                this.f27832a = b.mo72228m();
            } else if ("type".equals(l)) {
                this.f27833b = b.mo72228m();
            } else if ("price".equals(l)) {
                this.f27834c = b.mo72228m();
            } else if ("title".equals(l)) {
                this.f27835d = b.mo72228m();
            } else if ("description".equals(l)) {
                this.f27836e = b.mo72228m();
            } else if ("price_currency_code".equals(l)) {
                this.f27837f = b.mo72228m();
            } else if ("price_amount_micros".equals(l)) {
                this.f27838g = b.mo72232q();
            } else {
                b.mo72234s();
            }
        }
        b.mo72224i();
    }
}
