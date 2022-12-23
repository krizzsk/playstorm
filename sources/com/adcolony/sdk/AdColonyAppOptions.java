package com.adcolony.sdk;

import android.content.Context;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.facebook.internal.security.CertificateUtil;
import com.smaato.sdk.core.gdpr.CmpApiConstants;
import com.tapjoy.TapjoyConstants;
import java.util.Locale;
import org.json.JSONObject;

public class AdColonyAppOptions {
    public static final String ADMARVEL = "AdMarvel";
    public static final String ADMOB = "AdMob";
    public static final String ADOBEAIR = "Adobe AIR";
    public static final String AERSERVE = "AerServe";
    @Deprecated
    public static final int ALL = 2;
    public static final String APPODEAL = "Appodeal";
    public static final String CCPA = "CCPA";
    public static final String COCOS2DX = "Cocos2d-x";
    public static final String COPPA = "COPPA";
    public static final String CORONA = "Corona";
    public static final String FUSEPOWERED = "Fuse Powered";
    public static final String FYBER = "Fyber";
    public static final String GDPR = "GDPR";
    public static final String IRONSOURCE = "ironSource";
    @Deprecated
    public static final int LANDSCAPE = 1;
    public static final String MOPUB = "MoPub";
    @Deprecated
    public static final int PORTRAIT = 0;
    @Deprecated
    public static final int SENSOR = 2;
    public static final String UNITY = "Unity";

    /* renamed from: a */
    private String f117a = "";

    /* renamed from: b */
    private C0823f1 f118b = new C0823f1();

    /* renamed from: c */
    private AdColonyUserMetadata f119c;

    public AdColonyAppOptions() {
        setOriginStore(Constants.REFERRER_API_GOOGLE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AdColonyAppOptions mo10319a(String str) {
        if (str == null) {
            return this;
        }
        this.f117a = str;
        C0764c0.m319a(this.f118b, "app_id", str);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0823f1 mo10321b() {
        return this.f118b;
    }

    public int getAppOrientation() {
        return C0764c0.m306a(this.f118b, "app_orientation", -1);
    }

    public String getAppVersion() {
        return C0764c0.m336h(this.f118b, TapjoyConstants.TJC_APP_VERSION_NAME);
    }

    @Deprecated
    public String getGDPRConsentString() {
        return C0764c0.m336h(this.f118b, "consent_string");
    }

    @Deprecated
    public boolean getGDPRRequired() {
        return C0764c0.m325b(this.f118b, "gdpr_required");
    }

    public boolean getIsChildDirectedApp() {
        return C0764c0.m325b(this.f118b, "is_child_directed");
    }

    public boolean getKeepScreenOn() {
        return C0764c0.m325b(this.f118b, "keep_screen_on");
    }

    public JSONObject getMediationInfo() {
        C0823f1 b = C0764c0.m322b();
        C0764c0.m319a(b, "name", C0764c0.m336h(this.f118b, "mediation_network"));
        C0764c0.m319a(b, "version", C0764c0.m336h(this.f118b, "mediation_network_version"));
        return b.mo10718a();
    }

    public boolean getMultiWindowEnabled() {
        return C0764c0.m325b(this.f118b, "multi_window_enabled");
    }

    public Object getOption(String str) {
        return C0764c0.m335g(this.f118b, str);
    }

    public String getOriginStore() {
        return C0764c0.m336h(this.f118b, "origin_store");
    }

    public JSONObject getPluginInfo() {
        C0823f1 b = C0764c0.m322b();
        C0764c0.m319a(b, "name", C0764c0.m336h(this.f118b, TapjoyConstants.TJC_PLUGIN));
        C0764c0.m319a(b, "version", C0764c0.m336h(this.f118b, "plugin_version"));
        return b.mo10718a();
    }

    public String getPrivacyConsentString(String str) {
        C0823f1 f1Var = this.f118b;
        return C0764c0.m336h(f1Var, str.toLowerCase(Locale.ENGLISH) + "_consent_string");
    }

    public boolean getPrivacyFrameworkRequired(String str) {
        C0823f1 f1Var = this.f118b;
        return C0764c0.m325b(f1Var, str.toLowerCase(Locale.ENGLISH) + "_required");
    }

    @Deprecated
    public int getRequestedAdOrientation() {
        return C0764c0.m306a(this.f118b, "orientation", -1);
    }

    public boolean getTestModeEnabled() {
        return C0764c0.m325b(this.f118b, "test_mode");
    }

    public String getUserID() {
        return C0764c0.m336h(this.f118b, "user_id");
    }

    @Deprecated
    public AdColonyUserMetadata getUserMetadata() {
        return this.f119c;
    }

    public boolean isPrivacyFrameworkRequiredSet(String str) {
        C0823f1 f1Var = this.f118b;
        return f1Var.mo10722a(str.toLowerCase(Locale.ENGLISH) + "_required");
    }

    public AdColonyAppOptions setAppOrientation(int i) {
        setOption("app_orientation", (double) i);
        return this;
    }

    public AdColonyAppOptions setAppVersion(String str) {
        setOption(TapjoyConstants.TJC_APP_VERSION_NAME, str);
        return this;
    }

    @Deprecated
    public AdColonyAppOptions setGDPRConsentString(String str) {
        C0764c0.m319a(this.f118b, "consent_string", str);
        return this;
    }

    @Deprecated
    public AdColonyAppOptions setGDPRRequired(boolean z) {
        setOption("gdpr_required", z);
        return this;
    }

    public AdColonyAppOptions setIsChildDirectedApp(boolean z) {
        setOption("is_child_directed", z);
        return this;
    }

    public AdColonyAppOptions setKeepScreenOn(boolean z) {
        C0764c0.m328b(this.f118b, "keep_screen_on", z);
        return this;
    }

    public AdColonyAppOptions setMediationNetwork(String str, String str2) {
        C0764c0.m319a(this.f118b, "mediation_network", str);
        C0764c0.m319a(this.f118b, "mediation_network_version", str2);
        return this;
    }

    public AdColonyAppOptions setMultiWindowEnabled(boolean z) {
        C0764c0.m328b(this.f118b, "multi_window_enabled", z);
        return this;
    }

    public AdColonyAppOptions setOption(String str, boolean z) {
        C0764c0.m328b(this.f118b, str, z);
        return this;
    }

    public AdColonyAppOptions setOriginStore(String str) {
        setOption("origin_store", str);
        return this;
    }

    public AdColonyAppOptions setPlugin(String str, String str2) {
        C0764c0.m319a(this.f118b, TapjoyConstants.TJC_PLUGIN, str);
        C0764c0.m319a(this.f118b, "plugin_version", str2);
        return this;
    }

    public AdColonyAppOptions setPrivacyConsentString(String str, String str2) {
        C0823f1 f1Var = this.f118b;
        C0764c0.m319a(f1Var, str.toLowerCase(Locale.ENGLISH) + "_consent_string", str2);
        return this;
    }

    public AdColonyAppOptions setPrivacyFrameworkRequired(String str, boolean z) {
        setOption(str.toLowerCase(Locale.ENGLISH) + "_required", z);
        return this;
    }

    @Deprecated
    public AdColonyAppOptions setRequestedAdOrientation(int i) {
        setOption("orientation", (double) i);
        return this;
    }

    public AdColonyAppOptions setTestModeEnabled(boolean z) {
        C0764c0.m328b(this.f118b, "test_mode", z);
        return this;
    }

    public AdColonyAppOptions setUserID(String str) {
        setOption("user_id", str);
        return this;
    }

    @Deprecated
    public AdColonyAppOptions setUserMetadata(AdColonyUserMetadata adColonyUserMetadata) {
        this.f119c = adColonyUserMetadata;
        C0764c0.m318a(this.f118b, "user_metadata", adColonyUserMetadata.f163b);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10322b(Context context) {
        m64a(context);
        Boolean g = this.f118b.mo10738g("use_forced_controller");
        if (g != null) {
            C0890l.f590H = g.booleanValue();
        }
        if (this.f118b.mo10737f("use_staging_launch_server")) {
            C0857k.f506Z = "https://adc3-launch-staging.adcolony.com/v4/launch";
        }
        String b = C1038z0.m1196b(context, "IABUSPrivacy_String");
        String b2 = C1038z0.m1196b(context, CmpApiConstants.IABTCF_TC_STRING);
        int a = C1038z0.m1171a(context, CmpApiConstants.IABTCF_GDPR_APPLIES);
        if (b != null) {
            C0764c0.m319a(this.f118b, "ccpa_consent_string", b);
        }
        if (b2 != null) {
            C0764c0.m319a(this.f118b, "gdpr_consent_string", b2);
        }
        boolean z = true;
        if (a == 0 || a == 1) {
            C0823f1 f1Var = this.f118b;
            if (a != 1) {
                z = false;
            }
            C0764c0.m328b(f1Var, "gdpr_required", z);
        }
    }

    public AdColonyAppOptions setOption(String str, double d) {
        C0764c0.m316a(this.f118b, str, d);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo10320a() {
        return this.f117a;
    }

    public AdColonyAppOptions setOption(String str, String str2) {
        C0764c0.m319a(this.f118b, str, str2);
        return this;
    }

    /* renamed from: a */
    private void m64a(Context context) {
        setOption("bundle_id", C1038z0.m1210d(context));
    }

    public static AdColonyAppOptions getMoPubAppOptions(String str) {
        AdColonyAppOptions mediationNetwork = new AdColonyAppOptions().setMediationNetwork("MoPub", "unknown");
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",");
            int length = split.length;
            int i = 0;
            while (i < length) {
                String[] split2 = split[i].split(CertificateUtil.DELIMITER);
                if (split2.length == 2) {
                    String str2 = split2[0];
                    str2.hashCode();
                    if (str2.equals("store")) {
                        mediationNetwork.setOriginStore(split2[1]);
                    } else if (!str2.equals("version")) {
                        Log.e("AdColonyMoPub", "AdColony client options in wrong format - please check your MoPub dashboard");
                        return mediationNetwork;
                    } else {
                        mediationNetwork.setAppVersion(split2[1]);
                    }
                    i++;
                } else {
                    Log.e("AdColonyMoPub", "AdColony client options not recognized - please check your MoPub dashboard");
                    return null;
                }
            }
        }
        return mediationNetwork;
    }
}
