package com.adjust.sdk;

import android.content.Context;
import android.net.Uri;
import org.json.JSONObject;

public class Adjust {
    private static AdjustInstance defaultInstance;

    private Adjust() {
    }

    public static synchronized AdjustInstance getDefaultInstance() {
        AdjustInstance adjustInstance;
        synchronized (Adjust.class) {
            if (defaultInstance == null) {
                defaultInstance = new AdjustInstance();
            }
            adjustInstance = defaultInstance;
        }
        return adjustInstance;
    }

    public static void onCreate(AdjustConfig adjustConfig) {
        getDefaultInstance().onCreate(adjustConfig);
    }

    public static void trackEvent(AdjustEvent adjustEvent) {
        getDefaultInstance().trackEvent(adjustEvent);
    }

    public static void onResume() {
        getDefaultInstance().onResume();
    }

    public static void onPause() {
        getDefaultInstance().onPause();
    }

    public static void setEnabled(boolean z) {
        getDefaultInstance().setEnabled(z);
    }

    public static boolean isEnabled() {
        return getDefaultInstance().isEnabled();
    }

    @Deprecated
    public static void appWillOpenUrl(Uri uri) {
        getDefaultInstance().appWillOpenUrl(uri);
    }

    public static void appWillOpenUrl(Uri uri, Context context) {
        getDefaultInstance().appWillOpenUrl(uri, extractApplicationContext(context));
    }

    public static void setReferrer(String str, Context context) {
        getDefaultInstance().sendReferrer(str, extractApplicationContext(context));
    }

    public static void setOfflineMode(boolean z) {
        getDefaultInstance().setOfflineMode(z);
    }

    public static void sendFirstPackages() {
        getDefaultInstance().sendFirstPackages();
    }

    public static void addSessionCallbackParameter(String str, String str2) {
        getDefaultInstance().addSessionCallbackParameter(str, str2);
    }

    public static void addSessionPartnerParameter(String str, String str2) {
        getDefaultInstance().addSessionPartnerParameter(str, str2);
    }

    public static void removeSessionCallbackParameter(String str) {
        getDefaultInstance().removeSessionCallbackParameter(str);
    }

    public static void removeSessionPartnerParameter(String str) {
        getDefaultInstance().removeSessionPartnerParameter(str);
    }

    public static void resetSessionCallbackParameters() {
        getDefaultInstance().resetSessionCallbackParameters();
    }

    public static void resetSessionPartnerParameters() {
        getDefaultInstance().resetSessionPartnerParameters();
    }

    public static void setPushToken(String str) {
        getDefaultInstance().setPushToken(str);
    }

    public static void setPushToken(String str, Context context) {
        getDefaultInstance().setPushToken(str, extractApplicationContext(context));
    }

    public static void gdprForgetMe(Context context) {
        getDefaultInstance().gdprForgetMe(extractApplicationContext(context));
    }

    public static void disableThirdPartySharing(Context context) {
        getDefaultInstance().disableThirdPartySharing(extractApplicationContext(context));
    }

    public static void trackThirdPartySharing(AdjustThirdPartySharing adjustThirdPartySharing) {
        getDefaultInstance().trackThirdPartySharing(adjustThirdPartySharing);
    }

    public static void trackMeasurementConsent(boolean z) {
        getDefaultInstance().trackMeasurementConsent(z);
    }

    public static void trackAdRevenue(String str, JSONObject jSONObject) {
        getDefaultInstance().trackAdRevenue(str, jSONObject);
    }

    public static void trackAdRevenue(AdjustAdRevenue adjustAdRevenue) {
        getDefaultInstance().trackAdRevenue(adjustAdRevenue);
    }

    public static void trackPlayStoreSubscription(AdjustPlayStoreSubscription adjustPlayStoreSubscription) {
        getDefaultInstance().trackPlayStoreSubscription(adjustPlayStoreSubscription);
    }

    public static void getGoogleAdId(Context context, OnDeviceIdsRead onDeviceIdsRead) {
        Util.getGoogleAdId(context != null ? context.getApplicationContext() : null, onDeviceIdsRead);
    }

    public static String getAmazonAdId(Context context) {
        Context extractApplicationContext = extractApplicationContext(context);
        if (extractApplicationContext != null) {
            return Util.getFireAdvertisingId(extractApplicationContext.getContentResolver());
        }
        return null;
    }

    public static String getAdid() {
        return getDefaultInstance().getAdid();
    }

    public static AdjustAttribution getAttribution() {
        return getDefaultInstance().getAttribution();
    }

    public static String getSdkVersion() {
        return getDefaultInstance().getSdkVersion();
    }

    public static void setTestOptions(AdjustTestOptions adjustTestOptions) {
        if (adjustTestOptions.teardown != null && adjustTestOptions.teardown.booleanValue()) {
            AdjustInstance adjustInstance = defaultInstance;
            if (adjustInstance != null) {
                adjustInstance.teardown();
            }
            defaultInstance = null;
            AdjustFactory.teardown(adjustTestOptions.context);
        }
        getDefaultInstance().setTestOptions(adjustTestOptions);
    }

    private static Context extractApplicationContext(Context context) {
        if (context == null) {
            return null;
        }
        return context.getApplicationContext();
    }
}
