package com.tapjoy.internal;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;

/* renamed from: com.tapjoy.internal.e */
public final class C11540e {

    /* renamed from: a */
    public String f27922a;

    /* renamed from: b */
    public String f27923b;

    /* renamed from: c */
    public String f27924c;

    /* renamed from: d */
    public long f27925d;

    /* renamed from: e */
    public int f27926e;

    /* renamed from: f */
    public String f27927f;

    /* renamed from: g */
    public String f27928g;

    public C11540e(String str) {
        C11452bh b = C11452bh.m33266b(str);
        b.mo72223h();
        while (b.mo72225j()) {
            String l = b.mo72227l();
            if ("orderId".equals(l)) {
                this.f27922a = b.mo72228m();
            } else if ("packageName".equals(l)) {
                this.f27923b = b.mo72228m();
            } else if (InAppPurchaseMetaData.KEY_PRODUCT_ID.equals(l)) {
                this.f27924c = b.mo72228m();
            } else if ("purchaseTime".equals(l)) {
                this.f27925d = b.mo72232q();
            } else if ("purchaseState".equals(l)) {
                this.f27926e = b.mo72233r();
            } else if (SDKConstants.PARAM_DEVELOPER_PAYLOAD.equals(l)) {
                this.f27927f = b.mo72228m();
            } else if (SDKConstants.PARAM_PURCHASE_TOKEN.equals(l)) {
                this.f27928g = b.mo72228m();
            } else {
                b.mo72234s();
            }
        }
        b.mo72224i();
    }
}
