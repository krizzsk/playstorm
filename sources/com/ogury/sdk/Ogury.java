package com.ogury.sdk;

import android.content.Context;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.ogury.core.internal.InternalCore;
import com.ogury.core.internal.OguryBroadcastEventBus;
import com.ogury.core.internal.OguryEventBuses;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.core.internal.OguryPersistentMessageEventBus;
import com.ogury.p375cm.internal.InternalCM;
import com.ogury.p376ed.internal.InternalAds;
import com.ogury.sdk.internal.C10849a;
import com.ogury.sdk.internal.C10851c;
import com.ogury.sdk.internal.C10852d;
import com.ogury.sdk.internal.C10856f;
import com.ogury.sdk.internal.C10857g;
import com.ogury.sdk.internal.C10858h;
import com.ogury.sdk.internal.C10860i;
import com.ogury.sdk.internal.C10863k;
import com.ogury.sdk.internal.C10865m;

/* compiled from: Ogury.kt */
public final class Ogury {
    public static final Ogury INSTANCE = new Ogury();

    /* renamed from: a */
    private static OguryEventBuses f27078a;

    public static final String getSdkVersion() {
        return "5.3.0";
    }

    private Ogury() {
    }

    public static final synchronized void start(OguryConfiguration oguryConfiguration) {
        synchronized (Ogury.class) {
            C10865m.m32951b(oguryConfiguration, "configuration");
            OguryIntegrationLogger.m30996d("[Ogury] Starting Ogury SDK " + getSdkVersion() + APSSharedUtil.TRUNCATE_SEPARATOR);
            Context applicationContext = oguryConfiguration.getContext().getApplicationContext();
            if (f27078a == null) {
                f27078a = new OguryEventBuses(new OguryPersistentMessageEventBus(), new OguryBroadcastEventBus());
            }
            OguryIntegrationLogger.m30996d("[Ogury] Starting modules...");
            boolean z = false;
            if (!m32925a()) {
                C10865m.m32949a((Object) applicationContext, "appContext");
                if ((applicationContext.getApplicationInfo().flags & 2) != 0) {
                    z = true;
                }
                if (z) {
                    throw new OguryIntegrationException("Core module is missing!");
                }
                return;
            }
            C10865m.m32949a((Object) applicationContext, "appContext");
            OguryEventBuses oguryEventBuses = f27078a;
            try {
                String version = InternalCM.getVersion();
                OguryIntegrationLogger.m30996d("[Ogury] Starting Consent module " + version + APSSharedUtil.TRUNCATE_SEPARATOR);
                InternalCM.start(applicationContext, oguryConfiguration.getAssetKey(), oguryEventBuses);
                if (!C10865m.m32950a((Object) version, (Object) "3.3.0")) {
                    OguryIntegrationLogger.m30999i("[Ogury] Unexpected CM version: " + version + " (3.3.0 expected)");
                }
            } catch (NoClassDefFoundError unused) {
                OguryIntegrationLogger.m30999i("[Ogury] Consent module missing!");
            } catch (Throwable th) {
                OguryIntegrationLogger.m30998e(th);
            }
            OguryEventBuses oguryEventBuses2 = f27078a;
            try {
                String version2 = InternalAds.getVersion();
                OguryIntegrationLogger.m30996d("[Ogury] Starting Ads module " + version2 + APSSharedUtil.TRUNCATE_SEPARATOR);
                InternalAds.start(applicationContext, oguryConfiguration.getAssetKey(), oguryEventBuses2);
                if (!C10865m.m32950a((Object) version2, (Object) "4.2.0")) {
                    OguryIntegrationLogger.m30999i("[Ogury] Unexpected Ads version: " + version2 + " (4.2.0 expected)");
                }
            } catch (NoClassDefFoundError unused2) {
                OguryIntegrationLogger.m30999i("[Ogury] Ads module missing!");
            } catch (Throwable th2) {
                OguryIntegrationLogger.m30998e(th2);
            }
            OguryIntegrationLogger.m30996d("[Ogury] Ogury SDK is started");
            OguryIntegrationLogger.m30996d("[Ogury] Checking environment...");
            try {
                C10856f fVar = new C10856f(oguryConfiguration);
                OguryIntegrationLogger.m30996d("[Ogury][environment] Package name: " + fVar.mo67923c() + " ; version name: " + fVar.mo67924d() + " ; asset key: " + fVar.mo67922a() + " ; environment: " + C10856f.m32936b());
                C10857g gVar = new C10857g(new C10849a());
                new C10851c(new C10852d(fVar), new C10860i(new C10863k(oguryConfiguration.getContext()), gVar), new C10858h(fVar, gVar)).execute(new Object[0]);
            } catch (Exception e) {
                OguryIntegrationLogger.m30998e((Throwable) e);
            }
        }
    }

    /* renamed from: a */
    private static boolean m32925a() {
        try {
            String version = InternalCore.getVersion();
            OguryIntegrationLogger.m30996d("[Ogury] Core module " + version + " detected");
            if (!C10865m.m32950a((Object) version, (Object) "1.1.0")) {
                OguryIntegrationLogger.m30999i("[Ogury] Unexpected Core version: " + version + " (1.1.0 expected)");
            }
            return true;
        } catch (NoClassDefFoundError unused) {
            OguryIntegrationLogger.m30997e("[Ogury] Core module is missing!");
            return false;
        } catch (Throwable th) {
            OguryIntegrationLogger.m30998e(th);
            return false;
        }
    }

    public static final void applyChildPrivacy(int i) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3 = null;
        if (i == 1) {
            bool2 = Boolean.FALSE;
        } else if (i != 2) {
            if (i != 4) {
                bool = i != 8 ? null : Boolean.TRUE;
            } else {
                bool = Boolean.FALSE;
            }
            InternalCM.setChildUnderCoppaTreatment(bool3);
            InternalCM.setUnderAgeOfGdprConsentTreatment(bool);
            InternalAds.setChildUnderCoppaTreatment(bool3);
            InternalAds.setUnderAgeOfGdprConsentTreatment(bool);
        } else {
            bool2 = Boolean.TRUE;
        }
        bool3 = bool2;
        bool = null;
        InternalCM.setChildUnderCoppaTreatment(bool3);
        InternalCM.setUnderAgeOfGdprConsentTreatment(bool);
        InternalAds.setChildUnderCoppaTreatment(bool3);
        InternalAds.setUnderAgeOfGdprConsentTreatment(bool);
    }
}
