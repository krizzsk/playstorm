package com.ogury.p376ed.internal;

import com.ogury.p376ed.OguryAdClickCallback;
import p394io.presage.interstitial.PresageInterstitialCallback;

/* renamed from: com.ogury.ed.internal.gs */
public final class C10568gs {

    /* renamed from: a */
    private C10569gt f26682a;

    /* renamed from: b */
    private OguryAdClickCallback f26683b;

    /* renamed from: a */
    public final C10569gt mo67507a(PresageInterstitialCallback presageInterstitialCallback) {
        if (presageInterstitialCallback == null) {
            return null;
        }
        C10569gt gtVar = new C10569gt(presageInterstitialCallback);
        gtVar.mo67509a(this.f26683b);
        this.f26682a = gtVar;
        return gtVar;
    }

    /* renamed from: a */
    public final void mo67508a(OguryAdClickCallback oguryAdClickCallback) {
        C10569gt gtVar = this.f26682a;
        if (gtVar != null) {
            gtVar.mo67509a(oguryAdClickCallback);
        }
        this.f26683b = oguryAdClickCallback;
    }
}
