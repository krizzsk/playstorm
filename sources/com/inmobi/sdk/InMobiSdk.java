package com.inmobi.sdk;

import android.content.Context;
import android.location.Location;
import android.os.SystemClock;
import android.util.Base64;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.inmobi.media.C5978dg;
import com.inmobi.media.C5980dh;
import com.inmobi.media.C6125fq;
import com.inmobi.media.C6145fs;
import com.inmobi.media.C6166gd;
import com.inmobi.media.C6218hh;
import com.inmobi.media.C6227ho;
import com.inmobi.media.C6228hp;
import com.inmobi.media.C6238hu;
import com.inmobi.media.C6240hw;
import com.inmobi.media.C6242hy;
import com.inmobi.media.C6251ib;
import com.inmobi.media.C6256ie;
import com.inmobi.media.C6258ig;
import com.inmobi.media.C6269iq;
import com.inmobi.media.C6271ir;
import com.inmobi.media.C6295jf;
import com.inmobi.media.C6306ji;
import com.inmobi.media.C6309jk;
import com.inmobi.media.C6310jl;
import com.inmobi.unification.sdk.InitializationStatus;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

public final class InMobiSdk {
    public static final String IM_GDPR_CONSENT_AVAILABLE = "gdpr_consent_available";
    public static final String IM_GDPR_CONSENT_GDPR_APPLIES = "gdpr";
    public static final String IM_GDPR_CONSENT_IAB = "gdpr_consent";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f16181a = InMobiSdk.class.getSimpleName();

    public enum LogLevel {
        NONE,
        ERROR,
        DEBUG
    }

    public enum Education {
        HIGH_SCHOOL_OR_LESS("highschoolorless"),
        COLLEGE_OR_GRADUATE("collegeorgraduate"),
        POST_GRADUATE_OR_ABOVE("postgraduateorabove");
        
        private String value;

        private Education(String str) {
            this.value = str;
        }

        public final String toString() {
            return this.value;
        }
    }

    public enum Gender {
        FEMALE(InneractiveMediationDefs.GENDER_FEMALE),
        MALE(InneractiveMediationDefs.GENDER_MALE);
        
        private String value;

        private Gender(String str) {
            this.value = str;
        }

        public final String toString() {
            return this.value;
        }
    }

    public enum AgeGroup {
        BELOW_18("below18"),
        BETWEEN_18_AND_24("between18and24"),
        BETWEEN_25_AND_29("between25and29"),
        BETWEEN_30_AND_34("between30and34"),
        BETWEEN_35_AND_44("between35and44"),
        BETWEEN_45_AND_54("between45and54"),
        BETWEEN_55_AND_65("between55and65"),
        ABOVE_65("above65");
        
        private String value;

        private AgeGroup(String str) {
            this.value = str;
        }

        public final String toString() {
            return this.value;
        }
    }

    @Deprecated
    @InitializationStatus
    public static String init(Context context, String str) {
        return init(context, str, (JSONObject) null);
    }

    @Deprecated
    @InitializationStatus
    public static String init(final Context context, String str, JSONObject jSONObject) {
        C6242hy.m18633a();
        if (C6295jf.m18823a()) {
            return "SDK could not be initialized; Required dependency could not be found. Please check out documentation and include the required dependency.";
        }
        final String trim = str.trim();
        try {
            C6256ie.m18667a(jSONObject);
            if (trim.length() == 0) {
                return "Account id cannot be empty. Please provide a valid account id.";
            }
            if (!C6240hw.m18620a(context, "android.permission.ACCESS_COARSE_LOCATION") && !C6240hw.m18620a(context, "android.permission.ACCESS_FINE_LOCATION")) {
                C6238hu.m18605a((byte) 1, f16181a, "Please grant the location permissions (ACCESS_COARSE_LOCATION or ACCESS_FINE_LOCATION, or both) for better ad targeting.");
            }
            if (!(trim.length() == 32 || trim.length() == 36)) {
                C6238hu.m18605a((byte) 2, f16181a, "Invalid account id passed to init. Please provide a valid account id.");
            }
            if (C6227ho.m18550b()) {
                return InitializationStatus.SUCCESS;
            }
            C6227ho.m18541a(context, trim);
            C6295jf.m18825b(context);
            C6227ho.m18543a((Runnable) new Runnable() {
                public final void run() {
                    try {
                        C6295jf.m18821a(context);
                        C6227ho.m18566k();
                        C6227ho.m18548b(trim);
                        C6145fs.m18326a(trim);
                        C6295jf.m18827c(context);
                    } catch (Exception unused) {
                        String unused2 = InMobiSdk.f16181a;
                    }
                }
            });
            C6238hu.m18605a((byte) 2, f16181a, "InMobi SDK initialized with account id: ".concat(String.valueOf(trim)));
            m19157b();
            return InitializationStatus.SUCCESS;
        } catch (Exception unused) {
            C6227ho.m18538a((Context) null);
            C6238hu.m18605a((byte) 1, f16181a, "SDK could not be initialized; an unexpected error was encountered.");
            return "SDK could not be initialized; an unexpected error was encountered.";
        }
    }

    public static void init(Context context, String str, JSONObject jSONObject, SdkInitializationListener sdkInitializationListener) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        C6242hy.m18633a();
        if (C6295jf.m18823a()) {
            m19159c(sdkInitializationListener, "SDK could not be initialized; Required dependency could not be found. Please check out documentation and include the required dependency.");
            return;
        }
        final String trim = str.trim();
        try {
            C6256ie.m18667a(jSONObject);
            if (trim.length() == 0) {
                m19159c(sdkInitializationListener, "Account id cannot be empty. Please provide a valid account id.");
                return;
            }
            if (!C6240hw.m18620a(context, "android.permission.ACCESS_COARSE_LOCATION") && !C6240hw.m18620a(context, "android.permission.ACCESS_FINE_LOCATION")) {
                C6238hu.m18605a((byte) 1, f16181a, "Please grant the location permissions (ACCESS_COARSE_LOCATION or ACCESS_FINE_LOCATION, or both) for better ad targeting.");
            }
            if (C6227ho.m18550b()) {
                m19159c(sdkInitializationListener, (String) null);
                return;
            }
            C6227ho.m18541a(context, trim);
            C6295jf.m18825b(context);
            m19157b();
            final Context context2 = context;
            final SdkInitializationListener sdkInitializationListener2 = sdkInitializationListener;
            C6227ho.m18543a((Runnable) new Runnable() {
                public final void run() {
                    try {
                        C6295jf.m18821a(context2);
                        C6227ho.m18566k();
                        C6227ho.m18548b(trim);
                        C6145fs.m18326a(trim);
                        C6295jf.m18827c(context2);
                        InMobiSdk.m19159c(sdkInitializationListener2, (String) null);
                        C6218hh.m18506a().mo35424a("SdkInitialized", (Map<String, Object>) InMobiSdk.m19155a(elapsedRealtime));
                    } catch (Exception unused) {
                        String unused2 = InMobiSdk.f16181a;
                        InMobiSdk.m19159c(sdkInitializationListener2, "SDK could not be initialized; an unexpected error was encountered.");
                    }
                }
            });
        } catch (Exception unused) {
            C6227ho.m18538a((Context) null);
            m19159c(sdkInitializationListener, "SDK could not be initialized; an unexpected error was encountered.");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m19159c(final SdkInitializationListener sdkInitializationListener, final String str) {
        if (sdkInitializationListener != null) {
            C6306ji.m18854a().mo35541a(new Runnable() {
                public final void run() {
                    InMobiSdk.fireListener(SdkInitializationListener.this, str);
                }
            });
        }
        if (str == null) {
            String str2 = f16181a;
            C6238hu.m18605a((byte) 2, str2, "InMobi SDK initialized with account id: " + C6227ho.m18561g());
            return;
        }
        C6238hu.m18605a((byte) 1, f16181a, str);
    }

    public static void fireListener(SdkInitializationListener sdkInitializationListener, String str) {
        sdkInitializationListener.onInitializationComplete(str == null ? null : new Error(str));
    }

    public static void updateGDPRConsent(JSONObject jSONObject) {
        C6256ie.m18667a(jSONObject);
    }

    public static void setPartnerGDPRConsent(JSONObject jSONObject) {
        C6256ie.m18671b(jSONObject);
    }

    public static void setApplicationMuted(boolean z) {
        C6227ho.m18544a(z);
    }

    /* renamed from: b */
    private static void m19157b() {
        C6227ho.m18543a((Runnable) new Runnable() {
            public final void run() {
                String[] strArr = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE"};
                StringBuilder sb = new StringBuilder("Permissions granted to SDK are :\nandroid.permission.INTERNET\nandroid.permission.ACCESS_NETWORK_STATE");
                for (int i = 0; i < 4; i++) {
                    String str = strArr[i];
                    if (C6240hw.m18620a(C6227ho.m18551c(), str)) {
                        sb.append("\n");
                        sb.append(str);
                    }
                }
                C6238hu.m18605a((byte) 2, InMobiSdk.f16181a, sb.toString());
            }
        });
    }

    public static String getVersion() {
        return C6228hp.m18574b();
    }

    /* renamed from: com.inmobi.sdk.InMobiSdk$6 */
    static /* synthetic */ class C63716 {

        /* renamed from: a */
        static final /* synthetic */ int[] f16191a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.inmobi.sdk.InMobiSdk$LogLevel[] r0 = com.inmobi.sdk.InMobiSdk.LogLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16191a = r0
                com.inmobi.sdk.InMobiSdk$LogLevel r1 = com.inmobi.sdk.InMobiSdk.LogLevel.NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16191a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.inmobi.sdk.InMobiSdk$LogLevel r1 = com.inmobi.sdk.InMobiSdk.LogLevel.ERROR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f16191a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.inmobi.sdk.InMobiSdk$LogLevel r1 = com.inmobi.sdk.InMobiSdk.LogLevel.DEBUG     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.inmobi.sdk.InMobiSdk.C63716.<clinit>():void");
        }
    }

    public static void setLogLevel(LogLevel logLevel) {
        int i = C63716.f16191a[logLevel.ordinal()];
        if (i == 1) {
            C6238hu.m18604a((byte) 0);
        } else if (i != 2) {
            C6238hu.m18604a((byte) 2);
        } else {
            C6238hu.m18604a((byte) 1);
        }
    }

    public static void setAge(int i) {
        C6258ig.m18682a(i);
    }

    public static void setIsAgeRestricted(boolean z) {
        C6258ig.m18685a(z);
        C6269iq.m18729a().mo35479f();
        if (z) {
            InMobiUnifiedIdService.reset();
        }
    }

    public static void setAgeGroup(AgeGroup ageGroup) {
        C6258ig.m18684a(ageGroup.toString().toLowerCase(Locale.ENGLISH));
    }

    public static void setAreaCode(String str) {
        C6258ig.m18688b(str);
    }

    public static void setPostalCode(String str) {
        C6258ig.m18691c(str);
    }

    public static void setLocationWithCityStateCountry(String str, String str2, String str3) {
        C6258ig.m18693d(str);
        C6258ig.m18695e(str2);
        C6258ig.m18697f(str3);
    }

    public static void setYearOfBirth(int i) {
        C6258ig.m18687b(i);
    }

    public static void setGender(Gender gender) {
        C6258ig.m18699g(gender.toString().toLowerCase(Locale.ENGLISH));
    }

    public static void setEducation(Education education) {
        C6258ig.m18701h(education.toString().toLowerCase(Locale.ENGLISH));
    }

    public static void setLanguage(String str) {
        C6258ig.m18703i(str);
    }

    public static void setInterests(String str) {
        C6258ig.m18705j(str);
    }

    public static void setLocation(Location location) {
        C6258ig.m18683a(location);
    }

    public static String getToken() {
        return getToken((Map<String, String>) null, (String) null);
    }

    public static String getToken(Map<String, String> map, String str) {
        C5978dg.m17848a();
        long currentTimeMillis = System.currentTimeMillis();
        if (map != null) {
            C6228hp.m18573a(map.get("tp"));
            C6228hp.m18575b(map.get("tp-ver"));
        }
        HashMap hashMap = new HashMap();
        hashMap.put("networkType", C6251ib.m18652b());
        hashMap.put("plType", "AB");
        C6218hh.m18506a().mo35424a("AdGetSignalsCalled", (Map<String, Object>) hashMap);
        if (!C6227ho.m18545a()) {
            C6238hu.m18605a((byte) 1, C5978dg.f15194a, "InMobi SDK is not initialised. Cannot fetch a token.");
            C5978dg.m17849a(90, currentTimeMillis);
            return null;
        } else if (((C6166gd) C6145fs.m18321a("root", C6227ho.m18559f(), (C6145fs.C6148c) null)).mo35352i()) {
            C5978dg.m17849a(9, currentTimeMillis);
            return null;
        } else {
            C5980dh dhVar = new C5980dh(new C6271ir(((C6125fq) C6145fs.m18321a(CampaignUnit.JSON_KEY_ADS, C6227ho.m18559f(), (C6145fs.C6148c) null)).mo35330f()));
            dhVar.f15197b = map;
            dhVar.f15196a = str;
            HashMap hashMap2 = new HashMap();
            hashMap2.put("h-user-agent", C6227ho.m18564i());
            dhVar.mo35388c(hashMap2);
            dhVar.mo34922a();
            if (!dhVar.f15717q) {
                C5978dg.m17849a(21, currentTimeMillis);
                return null;
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put("latency", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            hashMap3.put("networkType", C6251ib.m18652b());
            hashMap3.put("plType", "AB");
            C6218hh.m18506a().mo35424a("AdGetSignalsSucceeded", (Map<String, Object>) hashMap3);
            return new String(Base64.encode(dhVar.mo35393f().getBytes(), 8));
        }
    }

    public static void setPublisherProvidedUnifiedId(final JSONObject jSONObject) {
        C6227ho.m18543a((Runnable) new Runnable() {
            public final void run() {
                if (!C6310jl.m18873b()) {
                    C6309jk.m18865b(jSONObject);
                }
            }
        });
    }

    public static boolean isSDKInitialized() {
        return C6227ho.m18550b();
    }

    /* renamed from: a */
    static /* synthetic */ Map m19155a(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        hashMap.put("networkType", C6251ib.m18652b());
        hashMap.put("integrationType", "InMobi");
        return hashMap;
    }
}
