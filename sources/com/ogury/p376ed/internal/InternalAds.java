package com.ogury.p376ed.internal;

import android.content.Context;
import com.ogury.core.internal.OguryEventBuses;
import com.ogury.core.internal.OguryIntegrationLogger;
import p394io.presage.common.PresageSdk;

/* renamed from: com.ogury.ed.internal.InternalAds */
public final class InternalAds {

    /* renamed from: a */
    public static final InternalAds f26108a = new InternalAds();

    private InternalAds() {
    }

    public static final void start(Context context, String str, OguryEventBuses oguryEventBuses) {
        C10765mq.m32773b(context, "context");
        C10765mq.m32773b(str, "assetKey");
        C10765mq.m32773b(oguryEventBuses, "eventBuses");
        OguryIntegrationLogger.m30996d("[Ads] Module started");
        C10424cz czVar = C10424cz.f26365a;
        C10424cz.m31536a(oguryEventBuses);
        PresageSdk presageSdk = PresageSdk.f29336a;
        PresageSdk.m34605a(new C10423cy(context, str));
    }

    public static final String getVersion() {
        return PresageSdk.getAdsSdkVersion();
    }

    public static final void setChildUnderCoppaTreatment(Boolean bool) {
        C10430dc dcVar = C10430dc.f26375a;
        C10430dc.m31547a("IS_CHILD_UNDER_COPPA", bool);
    }

    public static final void setUnderAgeOfGdprConsentTreatment(Boolean bool) {
        C10430dc dcVar = C10430dc.f26375a;
        C10430dc.m31547a("IS_UNDER_AGE_OF_GDPR_CONSENT", bool);
    }
}
