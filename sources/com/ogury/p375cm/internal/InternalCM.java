package com.ogury.p375cm.internal;

import android.content.Context;
import com.ogury.core.internal.InternalCore;
import com.ogury.core.internal.OguryEventBuses;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p375cm.OguryChoiceManager;
import com.ogury.p375cm.OguryCmConfig;

/* renamed from: com.ogury.cm.internal.InternalCM */
public final class InternalCM {

    /* renamed from: a */
    public static final InternalCM f25557a = new InternalCM();

    private InternalCM() {
    }

    public static final String getVersion() {
        return "3.3.0";
    }

    public static final void setChildUnderCoppaTreatment(Boolean bool) {
        aacac aacac = aacac.f25671a;
        aacac.m30670a("IS_CHILD_UNDER_COPPA", bool);
    }

    public static final void setUnderAgeOfGdprConsentTreatment(Boolean bool) {
        aacac aacac = aacac.f25671a;
        aacac.m30670a("IS_UNDER_AGE_OF_GDPR_CONSENT", bool);
    }

    public static final void start(Context context, String str, OguryEventBuses oguryEventBuses) {
        bbabc.m30943b(context, "context");
        bbabc.m30943b(str, "assetKey");
        bbabc.m30943b(oguryEventBuses, "eventBuses");
        OguryIntegrationLogger.m30996d("[Consent] Module started");
        OguryChoiceManager.initialize$default(context, str, (OguryCmConfig) null, 4, (Object) null);
        aabcb aabcb = aabcb.f25665a;
        String token = InternalCore.getToken(context, "consent_token");
        bbabc.m30940a((Object) token, "InternalCore.getToken(context, \"consent_token\")");
        aabcb.m30655a(context, str, token);
        aabca aabca = aabca.f25663a;
        aabca.m30653a(oguryEventBuses);
    }
}
