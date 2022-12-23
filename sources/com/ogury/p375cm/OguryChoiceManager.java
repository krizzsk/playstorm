package com.ogury.p375cm;

import android.app.Activity;
import android.content.Context;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p375cm.internal.aaaaa;
import com.ogury.p375cm.internal.aaaab;
import com.ogury.p375cm.internal.aaaac;
import com.ogury.p375cm.internal.aaaba;
import com.ogury.p375cm.internal.aabbb;
import com.ogury.p375cm.internal.aacaa;
import com.ogury.p375cm.internal.abbba;
import com.ogury.p375cm.internal.abbca;
import com.ogury.p375cm.internal.accba;
import com.ogury.p375cm.internal.babca;
import com.ogury.p375cm.internal.bbabb;
import com.ogury.p375cm.internal.bbabc;
import com.ogury.p375cm.internal.bbacb;
import com.ogury.p375cm.internal.bbcbc;

/* renamed from: com.ogury.cm.OguryChoiceManager */
public final class OguryChoiceManager {
    public static final int CCPAF_VERSION_1 = 1;
    public static final OguryChoiceManager INSTANCE = new OguryChoiceManager();
    public static final int TCF_VERSION_2 = 2;

    /* renamed from: a */
    private static aaaaa f25530a;

    /* renamed from: b */
    private static bbacb f25531b;

    /* renamed from: c */
    private static Context f25532c;

    /* renamed from: d */
    private static String f25533d;

    /* renamed from: e */
    private static boolean f25534e;

    /* renamed from: com.ogury.cm.OguryChoiceManager$Answer */
    public enum Answer {
        FULL_APPROVAL,
        PARTIAL_APPROVAL,
        REFUSAL,
        NO_ANSWER,
        CCPAF_SALE_DENIED,
        CCPAF_SALE_ALLOWED
    }

    /* renamed from: com.ogury.cm.OguryChoiceManager$CcpafV1 */
    public static final class CcpafV1 {
        public static final CcpafV1 INSTANCE = new CcpafV1();

        private CcpafV1() {
        }

        public static final String getUspString() {
            OguryChoiceManager.m30525b();
            if (OguryChoiceManager.INSTANCE.getClientConsentImpl() == null) {
                bbabc.m30939a();
            }
            abbba abbba = abbba.f25716a;
            return abbba.m30722c().mo66561d().mo66568a();
        }

        public static final boolean hasSeenNotice() {
            OguryChoiceManager.m30525b();
            if (OguryChoiceManager.INSTANCE.getClientConsentImpl() == null) {
                bbabc.m30939a();
            }
            abbba abbba = abbba.f25716a;
            return abbba.m30722c().mo66561d().mo66572b();
        }

        public static final boolean isLspa() {
            OguryChoiceManager.m30525b();
            if (OguryChoiceManager.INSTANCE.getClientConsentImpl() == null) {
                bbabc.m30939a();
            }
            abbba abbba = abbba.f25716a;
            return abbba.m30722c().mo66561d().mo66576d();
        }

        public static final boolean isOptOutSale() {
            OguryChoiceManager.m30525b();
            if (OguryChoiceManager.INSTANCE.getClientConsentImpl() == null) {
                bbabc.m30939a();
            }
            abbba abbba = abbba.f25716a;
            return abbba.m30722c().mo66561d().mo66574c();
        }
    }

    /* renamed from: com.ogury.cm.OguryChoiceManager$TcfV2 */
    public static final class TcfV2 {
        public static final TcfV2 INSTANCE = new TcfV2();

        /* renamed from: com.ogury.cm.OguryChoiceManager$TcfV2$Purpose */
        public static final class Purpose {
            public static final int CREATE_PERSONALISED_ADS = 8;
            public static final int CREATE_PERSONALISED_CONTENT = 32;
            public static final int DEVELOP_AND_IMPROVE_PRODUCTS = 1024;
            public static final Purpose INSTANCE = new Purpose();
            public static final int MARKET_RESEARCH = 512;
            public static final int MEASURE_AD_PERFORMANCE = 128;
            public static final int MEASURE_CONTENT_PERFORMANCE = 256;
            public static final int SELECT_BASIC_ADS = 4;
            public static final int SELECT_PERSONALISED_ADS = 16;
            public static final int SELECT_PERSONALISED_CONTENT = 64;
            public static final int STORE_INFORMATION = 2;

            private Purpose() {
            }
        }

        /* renamed from: com.ogury.cm.OguryChoiceManager$TcfV2$SpecialFeature */
        public static final class SpecialFeature {
            public static final SpecialFeature INSTANCE = new SpecialFeature();
            public static final int PRECISE_GEOLOCATION = 2;
            public static final int SCAN_DEVICE_CHARACTERISTICS = 4;

            private SpecialFeature() {
            }
        }

        private TcfV2() {
        }

        public static final String getIabString() {
            OguryIntegrationLogger.m30996d("[Consent] Choice Manager - getIabString() called");
            OguryChoiceManager.access$checkInstance(OguryChoiceManager.INSTANCE, 2);
            aaaaa clientConsentImpl = OguryChoiceManager.INSTANCE.getClientConsentImpl();
            if (clientConsentImpl == null) {
                bbabc.m30939a();
            }
            aaaac a = clientConsentImpl.mo66490a();
            if (a != null) {
                aaaba aaaba = (aaaba) a;
                if (aaaba.mo66503a().mo66578a().length() > 0) {
                    return aaaba.mo66503a().mo66578a();
                }
                OguryIntegrationLogger.m30997e("[Consent][data] Consent info not yet available");
                return "";
            }
            throw new babca("null cannot be cast to non-null type com.ogury.cm.choiceManager.ClientConsentImplTcfV2");
        }

        public static final boolean isAccepted(int i) {
            OguryChoiceManager.access$checkInstance(OguryChoiceManager.INSTANCE, 2);
            aaaaa clientConsentImpl = OguryChoiceManager.INSTANCE.getClientConsentImpl();
            if (clientConsentImpl == null) {
                bbabc.m30939a();
            }
            aaaac a = clientConsentImpl.mo66490a();
            if (a != null) {
                return ((aaaba) a).mo66508c(i);
            }
            throw new babca("null cannot be cast to non-null type com.ogury.cm.choiceManager.ClientConsentImplTcfV2");
        }

        public static final boolean isAllVendorConditionsMet(int i) {
            OguryChoiceManager.access$checkInstance(OguryChoiceManager.INSTANCE, 2);
            aaaaa clientConsentImpl = OguryChoiceManager.INSTANCE.getClientConsentImpl();
            if (clientConsentImpl == null) {
                bbabc.m30939a();
            }
            aaaac a = clientConsentImpl.mo66490a();
            if (a != null) {
                return ((aaaba) a).mo66513h(i);
            }
            throw new babca("null cannot be cast to non-null type com.ogury.cm.choiceManager.ClientConsentImplTcfV2");
        }

        public static final boolean isLiPurposeMet(int i) {
            OguryChoiceManager.access$checkInstance(OguryChoiceManager.INSTANCE, 2);
            aaaaa clientConsentImpl = OguryChoiceManager.INSTANCE.getClientConsentImpl();
            if (clientConsentImpl == null) {
                bbabc.m30939a();
            }
            aaaac a = clientConsentImpl.mo66490a();
            if (a != null) {
                return ((aaaba) a).mo66510e(i);
            }
            throw new babca("null cannot be cast to non-null type com.ogury.cm.choiceManager.ClientConsentImplTcfV2");
        }

        public static final boolean isLiVendorMet(int i) {
            OguryChoiceManager.access$checkInstance(OguryChoiceManager.INSTANCE, 2);
            aaaaa clientConsentImpl = OguryChoiceManager.INSTANCE.getClientConsentImpl();
            if (clientConsentImpl == null) {
                bbabc.m30939a();
            }
            aaaac a = clientConsentImpl.mo66490a();
            if (a != null) {
                return ((aaaba) a).mo66509d(i);
            }
            throw new babca("null cannot be cast to non-null type com.ogury.cm.choiceManager.ClientConsentImplTcfV2");
        }

        public static final boolean isPurposeAccepted(int i) {
            OguryChoiceManager.access$checkInstance(OguryChoiceManager.INSTANCE, 2);
            aaaaa clientConsentImpl = OguryChoiceManager.INSTANCE.getClientConsentImpl();
            if (clientConsentImpl == null) {
                bbabc.m30939a();
            }
            aaaac a = clientConsentImpl.mo66490a();
            if (a != null) {
                return ((aaaba) a).mo66507b(i);
            }
            throw new babca("null cannot be cast to non-null type com.ogury.cm.choiceManager.ClientConsentImplTcfV2");
        }

        public static final boolean isSpecialFeatureAccepted(int i) {
            OguryChoiceManager.access$checkInstance(OguryChoiceManager.INSTANCE, 2);
            aaaaa clientConsentImpl = OguryChoiceManager.INSTANCE.getClientConsentImpl();
            if (clientConsentImpl == null) {
                bbabc.m30939a();
            }
            aaaac a = clientConsentImpl.mo66490a();
            if (a != null) {
                return ((aaaba) a).mo66504a(i);
            }
            throw new babca("null cannot be cast to non-null type com.ogury.cm.choiceManager.ClientConsentImplTcfV2");
        }

        public static final boolean isVendorAndItsPurposesAccepted(int i) {
            OguryChoiceManager.access$checkInstance(OguryChoiceManager.INSTANCE, 2);
            aaaaa clientConsentImpl = OguryChoiceManager.INSTANCE.getClientConsentImpl();
            if (clientConsentImpl == null) {
                bbabc.m30939a();
            }
            aaaac a = clientConsentImpl.mo66490a();
            if (a != null) {
                return ((aaaba) a).mo66511f(i);
            }
            throw new babca("null cannot be cast to non-null type com.ogury.cm.choiceManager.ClientConsentImplTcfV2");
        }

        public static final boolean isVendorsLiAndLiPurposeMet(int i) {
            OguryChoiceManager.access$checkInstance(OguryChoiceManager.INSTANCE, 2);
            aaaaa clientConsentImpl = OguryChoiceManager.INSTANCE.getClientConsentImpl();
            if (clientConsentImpl == null) {
                bbabc.m30939a();
            }
            aaaac a = clientConsentImpl.mo66490a();
            if (a != null) {
                return ((aaaba) a).mo66512g(i);
            }
            throw new babca("null cannot be cast to non-null type com.ogury.cm.choiceManager.ClientConsentImplTcfV2");
        }
    }

    private OguryChoiceManager() {
    }

    /* renamed from: a */
    private static void m30524a() {
        if (f25532c != null) {
            CharSequence charSequence = f25533d;
            if (charSequence == null || bbcbc.m30979a(charSequence)) {
                OguryIntegrationLogger.m30997e("[Consent][setup] Failed (module not correctly started: asset key is null or empty)");
                throw new IllegalStateException("AssetKey is not allowed to be empty.");
            }
            return;
        }
        OguryIntegrationLogger.m30997e("[Consent][setup] Failed (module not started)");
        throw new IllegalStateException("You must first call initialize method.");
    }

    public static final /* synthetic */ void access$checkInstance(OguryChoiceManager oguryChoiceManager, int i) {
        m30525b();
        if (i == 2) {
            aaaaa aaaaa = f25530a;
            if (aaaaa == null) {
                bbabc.m30939a();
            }
            if (!(aaaaa.mo66490a() instanceof aaaba)) {
                throw new IllegalStateException("You cannot use method from another TCF version.".toString());
            }
            return;
        }
        throw new IllegalArgumentException("Bad TCF version is passed, you can use one of versions declared in class OguryChoiceManager.");
    }

    public static final void ask(Activity activity, OguryConsentListener oguryConsentListener) {
        bbabc.m30943b(activity, "activity");
        bbabc.m30943b(oguryConsentListener, "oguryConsentListener");
        OguryIntegrationLogger.m30996d("[Consent] Choice Manager - ask() called");
        f25534e = true;
        m30525b();
        aaaaa aaaaa = f25530a;
        if (aaaaa == null) {
            bbabc.m30939a();
        }
        Context context = activity;
        String str = f25533d;
        if (str == null) {
            bbabc.m30939a();
        }
        aaaaa.mo66492a(context, str, oguryConsentListener);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m30525b() {
        m30524a();
        if (!f25534e) {
            m30526c();
            Context context = f25532c;
            if (context == null) {
                bbabc.m30939a();
            }
            boolean a = bbacb.m30944a(context);
            OguryIntegrationLogger.m30997e("[Consent] Failed (consent data not synced). Please call ask() method first");
            if (a) {
                throw new IllegalStateException("You must first call ask to get config.");
            }
        }
    }

    /* renamed from: c */
    private static bbacb m30526c() {
        if (f25531b == null) {
            f25531b = new bbacb();
        }
        bbacb bbacb = f25531b;
        if (bbacb == null) {
            bbabc.m30939a();
        }
        return bbacb;
    }

    public static final boolean ccpaApplies() {
        m30525b();
        if (f25530a == null) {
            bbabc.m30939a();
        }
        abbba abbba = abbba.f25716a;
        return abbba.m30722c().mo66561d().mo66577e();
    }

    public static /* synthetic */ void clientConsentImpl$annotations() {
    }

    public static /* synthetic */ void debugUtilVal$annotations() {
    }

    public static final void edit(Activity activity, OguryConsentListener oguryConsentListener) {
        bbabc.m30943b(activity, "activity");
        bbabc.m30943b(oguryConsentListener, "oguryConsentListener");
        OguryIntegrationLogger.m30996d("[Consent] Choice Manager - edit() called");
        f25534e = true;
        m30525b();
        aaaaa aaaaa = f25530a;
        if (aaaaa == null) {
            bbabc.m30939a();
        }
        Context context = activity;
        String str = f25533d;
        if (str == null) {
            bbabc.m30939a();
        }
        aaaaa.mo66496b(context, str, oguryConsentListener);
    }

    public static final boolean gdprApplies() {
        m30525b();
        if (f25530a == null) {
            bbabc.m30939a();
        }
        abbba abbba = abbba.f25716a;
        return abbba.m30722c().mo66560c().mo66581b();
    }

    public static final boolean hasPaid() {
        m30525b();
        if (f25530a == null) {
            bbabc.m30939a();
        }
        Context context = f25532c;
        if (context == null) {
            bbabc.m30939a();
        }
        bbabc.m30943b(context, "context");
        return accba.m30854a(context);
    }

    @Deprecated
    public static final void initialize(Context context, String str, OguryCmConfig oguryCmConfig) {
        bbabc.m30943b(context, "context");
        bbabc.m30943b(str, "assetKey");
        bbabc.m30943b(oguryCmConfig, "oguryCmConfig");
        OguryIntegrationLogger.m30996d("[Consent] Setting up...");
        new abbca(context, (accba) null, (aabbb) null, 6, (bbabb) null).mo66555a();
        aacaa.aaaaa aaaaa = aacaa.f25669a;
        aacaa.aaaaa.m30663a(context, oguryCmConfig);
        if (f25530a == null) {
            f25532c = context.getApplicationContext();
            f25533d = str;
            aaaab aaaab = aaaab.f25585a;
            f25530a = aaaab.m30576a(oguryCmConfig);
        }
        m30524a();
        OguryIntegrationLogger.m30996d("[Consent][setup] TCF version: " + oguryCmConfig.getTcfVersion());
        OguryIntegrationLogger.m30996d("[Consent][setup] CCPA version: " + oguryCmConfig.getCcpafVersion());
        OguryIntegrationLogger.m30996d("[Consent][setup] Completed!");
    }

    @Deprecated
    public static /* synthetic */ void initialize$default(Context context, String str, OguryCmConfig oguryCmConfig, int i, Object obj) {
        if ((i & 4) != 0) {
            oguryCmConfig = new OguryCmConfig();
        }
        initialize(context, str, oguryCmConfig);
    }

    public static final boolean isEditAvailable() {
        m30525b();
        if (f25530a == null) {
            bbabc.m30939a();
        }
        Context context = f25532c;
        if (context == null) {
            bbabc.m30939a();
        }
        bbabc.m30943b(context, "context");
        return accba.m30856b(context);
    }

    public static final void updateOguryCmConfig(OguryCmConfig oguryCmConfig) {
        bbabc.m30943b(oguryCmConfig, "oguryCmConfig");
        OguryIntegrationLogger.m30996d("[Consent] Choice Manager - updateOguryCmConfig() called with tcfVersion: " + oguryCmConfig.getTcfVersion() + " and ccpaVersion: " + oguryCmConfig.getCcpafVersion());
        OguryIntegrationLogger.m30996d("[Consent][setup] Manual setting up TCF and CCPA versions...");
        if (f25532c == null) {
            OguryIntegrationLogger.m30997e("[Consent][setup] Failed to set up versions (module not started)");
        } else if (f25534e) {
            OguryIntegrationLogger.m30997e("[Consent][setup] TCF or CCPA versions cannot be changed when ask() method is already called");
        } else {
            abbba abbba = abbba.f25716a;
            if (abbba.m30710a() == oguryCmConfig.getTcfVersion()) {
                abbba abbba2 = abbba.f25716a;
                if (abbba.m30719b() == oguryCmConfig.getCcpafVersion()) {
                    OguryIntegrationLogger.m30996d("[Consent][setup] versions setup aborted (no change detected)");
                    return;
                }
            }
            aacaa.aaaaa aaaaa = aacaa.f25669a;
            Context context = f25532c;
            if (context == null) {
                bbabc.m30939a();
            }
            aacaa.aaaaa.m30663a(context, oguryCmConfig);
            aaaab aaaab = aaaab.f25585a;
            f25530a = aaaab.m30576a(oguryCmConfig);
            OguryIntegrationLogger.m30996d("[Consent][setup] TCF version: " + oguryCmConfig.getTcfVersion());
            OguryIntegrationLogger.m30996d("[Consent][setup] CCPA version: " + oguryCmConfig.getCcpafVersion());
            OguryIntegrationLogger.m30996d("[Consent][setup] Manual setup done! ");
        }
    }

    public final aaaaa getClientConsentImpl() {
        return f25530a;
    }

    public final bbacb getDebugUtilVal$3dacfc6e() {
        return f25531b;
    }

    public final void resetClientConsentImpl$consent_manager_prodRelease() {
        f25530a = null;
    }

    public final void resetFieldsForTests() {
        f25532c = null;
        f25533d = null;
        f25534e = false;
    }

    public final void setClientConsentImpl(aaaaa aaaaa) {
        f25530a = aaaaa;
    }

    public final void setDebugUtilVal$47bacc58(bbacb bbacb) {
        f25531b = bbacb;
    }
}
