package com.applovin.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.mediation.p032d.C1645c;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.utils.C2035d;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class AppLovinSdk {
    private static final String TAG = "AppLovinSdk";
    public static final String VERSION = getVersion();
    public static final int VERSION_CODE = getVersionCode();
    private static final Map<String, AppLovinSdk> sdkInstances = new HashMap();
    private static final Object sdkInstancesLock = new Object();
    public final C1959m coreSdk;

    public interface SdkInitializationListener {
        void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration);
    }

    /* renamed from: com.applovin.sdk.AppLovinSdk$a */
    private static class C2390a extends AppLovinSdkSettings {
        C2390a(Context context) {
            super(context);
        }
    }

    private AppLovinSdk(C1959m mVar) {
        this.coreSdk = mVar;
    }

    /* renamed from: a */
    public static List<AppLovinSdk> m5781a() {
        return new ArrayList(sdkInstances.values());
    }

    public static AppLovinSdk getInstance(Context context) {
        return getInstance(new C2390a(context), context);
    }

    public static AppLovinSdk getInstance(AppLovinSdkSettings appLovinSdkSettings, Context context) {
        if (context != null) {
            return getInstance(C2035d.m4871a(context).mo14667a("applovin.sdk.key", ""), appLovinSdkSettings, context);
        }
        throw new IllegalArgumentException("No context specified");
    }

    public static AppLovinSdk getInstance(String str, AppLovinSdkSettings appLovinSdkSettings, Context context) {
        if (appLovinSdkSettings == null) {
            throw new IllegalArgumentException("No userSettings specified");
        } else if (context != null) {
            synchronized (sdkInstancesLock) {
                if (sdkInstances.containsKey(str)) {
                    AppLovinSdk appLovinSdk = sdkInstances.get(str);
                    return appLovinSdk;
                }
                if (!TextUtils.isEmpty(str) && str.contains(File.separator)) {
                    if (C2092v.m5047a()) {
                        C2092v.m5053i(TAG, "\n**************************************************\nINVALID SDK KEY: " + str + "\n**************************************************\n");
                    }
                    if (!sdkInstances.isEmpty()) {
                        AppLovinSdk next = sdkInstances.values().iterator().next();
                        return next;
                    }
                    str = str.replace(File.separator, "");
                }
                C1959m mVar = new C1959m();
                mVar.mo14323a(str, appLovinSdkSettings, context);
                AppLovinSdk appLovinSdk2 = new AppLovinSdk(mVar);
                mVar.mo14321a(appLovinSdk2);
                appLovinSdkSettings.attachAppLovinSdk(mVar);
                sdkInstances.put(str, appLovinSdk2);
                return appLovinSdk2;
            }
        } else {
            throw new IllegalArgumentException("No context specified");
        }
    }

    private static String getVersion() {
        return "11.4.4";
    }

    private static int getVersionCode() {
        return 11040499;
    }

    public static void initializeSdk(Context context) {
        initializeSdk(context, (SdkInitializationListener) null);
    }

    public static void initializeSdk(Context context, SdkInitializationListener sdkInitializationListener) {
        if (context != null) {
            AppLovinSdk instance = getInstance(context);
            if (instance != null) {
                instance.initializeSdk(sdkInitializationListener);
            } else if (C2092v.m5047a()) {
                C2092v.m5053i(TAG, "Unable to initialize AppLovin SDK: SDK object not created");
            }
        } else {
            throw new IllegalArgumentException("No context specified");
        }
    }

    static void reinitializeAll(Boolean bool, Boolean bool2, Boolean bool3) {
        synchronized (sdkInstancesLock) {
            for (AppLovinSdk next : sdkInstances.values()) {
                next.coreSdk.mo14345b();
                next.coreSdk.mo14356i();
                if (bool != null) {
                    if (C2092v.m5047a()) {
                        C2092v A = next.coreSdk.mo14286A();
                        A.mo14791c(TAG, "Toggled 'huc' to " + bool);
                    }
                    next.getEventService().trackEvent("huc", CollectionUtils.map("value", bool.toString()));
                }
                if (bool2 != null) {
                    if (C2092v.m5047a()) {
                        C2092v A2 = next.coreSdk.mo14286A();
                        A2.mo14791c(TAG, "Toggled 'aru' to " + bool2);
                    }
                    next.getEventService().trackEvent("aru", CollectionUtils.map("value", bool2.toString()));
                }
                if (bool3 != null) {
                    if (C2092v.m5047a()) {
                        C2092v A3 = next.coreSdk.mo14286A();
                        A3.mo14791c(TAG, "Toggled 'dns' to " + bool3);
                    }
                    next.getEventService().trackEvent("dns", CollectionUtils.map("value", bool3.toString()));
                }
            }
        }
    }

    public AppLovinAdService getAdService() {
        return this.coreSdk.mo14369u();
    }

    public List<MaxMediatedNetworkInfo> getAvailableMediatedNetworks() {
        JSONArray a = C1645c.m3314a(this.coreSdk);
        ArrayList arrayList = new ArrayList(a.length());
        for (int i = 0; i < a.length(); i++) {
            arrayList.add(new MaxMediatedNetworkInfoImpl(JsonUtils.getJSONObject(a, i, (JSONObject) null)));
        }
        return arrayList;
    }

    public AppLovinSdkConfiguration getConfiguration() {
        return this.coreSdk.mo14366s();
    }

    public AppLovinEventService getEventService() {
        return this.coreSdk.mo14371w();
    }

    public String getMediationProvider() {
        return this.coreSdk.mo14367t();
    }

    public AppLovinPostbackService getPostbackService() {
        return this.coreSdk.mo14308X();
    }

    public String getSdkKey() {
        return this.coreSdk.mo14374z();
    }

    public AppLovinSdkSettings getSettings() {
        return this.coreSdk.mo14363p();
    }

    public AppLovinTargetingData getTargetingData() {
        return this.coreSdk.mo14365r();
    }

    public String getUserIdentifier() {
        return this.coreSdk.mo14360m();
    }

    public AppLovinUserSegment getUserSegment() {
        return this.coreSdk.mo14364q();
    }

    public AppLovinUserService getUserService() {
        return this.coreSdk.mo14372x();
    }

    public AppLovinVariableService getVariableService() {
        return this.coreSdk.mo14373y();
    }

    public void initializeSdk() {
    }

    public void initializeSdk(SdkInitializationListener sdkInitializationListener) {
        this.coreSdk.mo14320a(sdkInitializationListener);
    }

    public boolean isEnabled() {
        return this.coreSdk.mo14351d();
    }

    public boolean isInitialized() {
        return this.coreSdk.mo14351d();
    }

    public void setMediationProvider(String str) {
        this.coreSdk.mo14349c(str);
    }

    public void setPluginVersion(String str) {
        this.coreSdk.mo14322a(str);
    }

    public void setUserIdentifier(String str) {
        this.coreSdk.mo14347b(str);
    }

    public void showMediationDebugger() {
        this.coreSdk.mo14359l();
    }

    public String toString() {
        return "AppLovinSdk{sdkKey='" + getSdkKey() + "', isEnabled=" + isEnabled() + ", isFirstSession=" + this.coreSdk.mo14300P() + '}';
    }
}
