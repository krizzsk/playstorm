package com.ogury.p375cm.internal;

import android.content.Context;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p375cm.internal.aaaca;

/* renamed from: com.ogury.cm.internal.aabcb */
public final class aabcb {

    /* renamed from: a */
    public static final aabcb f25665a = new aabcb();

    /* renamed from: b */
    private static aaabb f25666b;

    /* renamed from: c */
    private static aaaca f25667c;

    /* renamed from: com.ogury.cm.internal.aabcb$aaaaa */
    public static final class aaaaa implements aaaca.aaaaa {
        aaaaa() {
        }

        /* renamed from: a */
        public final void mo66517a(int i, String str) {
            bbabc.m30943b(str, "consentString");
            OguryIntegrationLogger.m30996d("[Consent][external] TCF consent data detected");
            aabcb aabcb = aabcb.f25665a;
            aabcb.m30656a(new aabab(i, str, aabba.AUTOMATIC));
        }
    }

    private aabcb() {
    }

    /* renamed from: a */
    public static void m30655a(Context context, String str, String str2) {
        bbabc.m30943b(context, "context");
        bbabc.m30943b(str, "assetKey");
        bbabc.m30943b(str2, "consentToken");
        OguryIntegrationLogger.m30996d("[Consent][External] Setting up...");
        if (!((f25666b == null || f25667c == null) ? false : true)) {
            f25666b = new aaabb(context, str, str2);
            OguryIntegrationLogger.m30996d("[Consent][External][setup] Completed!");
            aaaca aaaca = new aaaca(new aaacb(context));
            f25667c = aaaca;
            aaaca.mo66516a(new aaaaa());
            return;
        }
        OguryIntegrationLogger.m30996d("[Consent][External][setup] Already set up!");
    }

    /* renamed from: a */
    public static void m30656a(aaacc aaacc) {
        bbabc.m30943b(aaacc, "externalConsentData");
        OguryIntegrationLogger.m30996d("[Consent][external] Passing external consent data...");
        aaabb aaabb = f25666b;
        if (aaabb != null) {
            if (aaabb == null) {
                bbabc.m30939a();
            }
            aaabb.mo66514a(aaacc);
            return;
        }
        OguryIntegrationLogger.m30997e("Failed to pass external consent data (bad internal initialization)");
    }
}
