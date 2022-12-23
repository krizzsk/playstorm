package com.applovin.impl.sdk.p045a;

import android.webkit.WebView;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p046ad.C1824a;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;

/* renamed from: com.applovin.impl.sdk.a.c */
public class C1798c extends C1790b {
    public C1798c(C1824a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AdSessionConfiguration mo13836a() {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.LOADED, Owner.NATIVE, Owner.NONE, false);
        } catch (Throwable th) {
            if (C2092v.m5047a()) {
                this.f2843c.mo14790b(this.f2844d, "Failed to create ad session configuration", th);
            }
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AdSessionContext mo13837a(WebView webView) {
        try {
            return AdSessionContext.createHtmlAdSessionContext(this.f2842b.mo14339al().mo13864d(), webView, this.f2841a.getOpenMeasurementContentUrl(), this.f2841a.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th) {
            if (C2092v.m5047a()) {
                this.f2843c.mo14790b(this.f2844d, "Failed to create ad session context", th);
            }
            return null;
        }
    }
}
