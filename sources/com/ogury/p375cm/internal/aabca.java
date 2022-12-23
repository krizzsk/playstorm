package com.ogury.p375cm.internal;

import com.ogury.core.internal.OguryEventBus;
import com.ogury.core.internal.OguryEventBuses;
import com.ogury.core.internal.OguryIntegrationLogger;

/* renamed from: com.ogury.cm.internal.aabca */
public final class aabca {

    /* renamed from: a */
    public static final aabca f25663a = new aabca();

    /* renamed from: b */
    private static OguryEventBuses f25664b;

    private aabca() {
    }

    /* renamed from: a */
    public static void m30652a() {
        OguryEventBus broadcast;
        OguryIntegrationLogger.m30996d("[Consent][EventBus] Dispatch CM-consent-change");
        OguryEventBuses oguryEventBuses = f25664b;
        if (oguryEventBuses != null && (broadcast = oguryEventBuses.getBroadcast()) != null) {
            broadcast.dispatch("CM-consent-change", "");
        }
    }

    /* renamed from: a */
    public static void m30653a(OguryEventBuses oguryEventBuses) {
        f25664b = oguryEventBuses;
    }

    /* renamed from: a */
    public static void m30654a(String str) {
        OguryEventBus persistentMessage;
        OguryEventBus persistentMessage2;
        bbabc.m30943b(str, "msg");
        if (str.length() > 0) {
            OguryIntegrationLogger.m30996d("[Consent][EventBus] Dispatch CM-status ".concat(String.valueOf(str)));
            OguryEventBuses oguryEventBuses = f25664b;
            if (oguryEventBuses != null && (persistentMessage2 = oguryEventBuses.getPersistentMessage()) != null) {
                persistentMessage2.dispatch("CM-status", str);
                return;
            }
            return;
        }
        OguryIntegrationLogger.m30996d("[Consent][EventBus] Dispatch CM-status UNKNOWN");
        OguryEventBuses oguryEventBuses2 = f25664b;
        if (oguryEventBuses2 != null && (persistentMessage = oguryEventBuses2.getPersistentMessage()) != null) {
            persistentMessage.dispatch("CM-status", "UNKNOWN");
        }
    }
}
