package com.ogury.p375cm.internal;

import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p375cm.OguryCmConfig;

/* renamed from: com.ogury.cm.internal.aaaab */
public final class aaaab {

    /* renamed from: a */
    public static final aaaab f25585a = new aaaab();

    /* renamed from: b */
    private static aaaaa f25586b;

    private aaaab() {
    }

    /* renamed from: a */
    public static aaaaa m30576a(OguryCmConfig oguryCmConfig) {
        bbabc.m30943b(oguryCmConfig, "oguryCmConfig");
        if (f25586b != null) {
            return f25586b;
        }
        if (oguryCmConfig.getCcpafVersion() != 1) {
            OguryIntegrationLogger.m30997e("[Consent][setup] Failed to set up versions (CCPA version " + oguryCmConfig.getCcpafVersion() + " is not allowed)");
            throw new IllegalArgumentException("Bad CCPAF version used! Please use one of the declared ones in OguryChoiceManager class.");
        } else if (oguryCmConfig.getTcfVersion() == 2) {
            return new aaaaa(new aaaba(), (babac) null, 2, (bbabb) null);
        } else {
            OguryIntegrationLogger.m30997e("[Consent][setup] Failed to set up versions (TCF version " + oguryCmConfig.getTcfVersion() + " is not allowed)");
            throw new IllegalArgumentException("Bad TCF version used! Please use one of the declared ones in OguryChoiceManager class.");
        }
    }
}
