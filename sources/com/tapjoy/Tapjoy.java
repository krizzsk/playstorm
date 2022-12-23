package com.tapjoy;

import android.app.Activity;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.Log;
import com.tapjoy.internal.C11582et;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public final class Tapjoy {
    public static final String INTENT_EXTRA_PUSH_PAYLOAD = "com.tapjoy.PUSH_PAYLOAD";

    public static String getVersion() {
        return C11582et.m33598a().mo72417b();
    }

    public static void setDebugEnabled(boolean z) {
        C11582et.m33598a().mo72412a(z);
    }

    public static boolean connect(Context context, String str) {
        return C11582et.m33598a().mo72413a(context, str);
    }

    public static boolean connect(Context context, String str, Hashtable<String, ?> hashtable) {
        return C11582et.m33598a().mo72415a(context, str, hashtable, (TJConnectListener) null);
    }

    public static synchronized boolean connect(Context context, String str, Hashtable<String, ?> hashtable, TJConnectListener tJConnectListener) {
        boolean a;
        synchronized (Tapjoy.class) {
            a = C11582et.m33598a().mo72415a(context, str, hashtable, tJConnectListener);
        }
        return a;
    }

    public static TJPlacement getPlacement(String str, TJPlacementListener tJPlacementListener) {
        return C11582et.m33598a().mo72385a(str, tJPlacementListener);
    }

    public static void setActivity(Activity activity) {
        C11582et.m33598a().mo72391a(activity);
    }

    public static void getCurrencyBalance(TJGetCurrencyBalanceListener tJGetCurrencyBalanceListener) {
        C11582et.m33598a().mo72397a(tJGetCurrencyBalanceListener);
    }

    public static void spendCurrency(int i, TJSpendCurrencyListener tJSpendCurrencyListener) {
        C11582et.m33598a().mo72389a(i, tJSpendCurrencyListener);
    }

    public static void awardCurrency(int i, TJAwardCurrencyListener tJAwardCurrencyListener) {
        C11582et.m33598a().mo72388a(i, tJAwardCurrencyListener);
    }

    public static void setEarnedCurrencyListener(TJEarnedCurrencyListener tJEarnedCurrencyListener) {
        C11582et.m33598a().mo72396a(tJEarnedCurrencyListener);
    }

    @Deprecated
    public static void setCurrencyMultiplier(float f) {
        C11582et.m33598a().mo72386a(f);
    }

    @Deprecated
    public static float getCurrencyMultiplier() {
        return C11582et.m33598a().mo72424c();
    }

    public static void trackPurchase(String str, String str2, double d, String str3) {
        C11582et.m33598a().mo72403a(str, str2, d, str3);
    }

    public static void trackPurchase(String str, String str2, String str3, String str4) {
        C11582et.m33598a().mo72405a(str, str2, str3, str4);
    }

    @Deprecated
    public static void trackPurchase(String str, String str2) {
        C11582et.m33598a().mo72402a(str, str2);
    }

    public static void trackEvent(String str) {
        C11582et.m33598a().mo72399a(str);
    }

    public static void trackEvent(String str, long j) {
        C11582et.m33598a().mo72400a(str, j);
    }

    public static void trackEvent(String str, String str2, long j) {
        C11582et.m33598a().mo72404a(str, str2, j);
    }

    public static void trackEvent(String str, String str2, String str3, String str4) {
        C11582et.m33598a().mo72422b(str, str2, str3, str4);
    }

    public static void trackEvent(String str, String str2, String str3, String str4, long j) {
        C11582et.m33598a().mo72406a(str, str2, str3, str4, j);
    }

    public static void trackEvent(String str, String str2, String str3, String str4, String str5, long j) {
        C11582et.m33598a().mo72407a(str, str2, str3, str4, str5, j);
    }

    public static void trackEvent(String str, String str2, String str3, String str4, String str5, long j, String str6, long j2) {
        C11582et.m33598a().mo72408a(str, str2, str3, str4, str5, j, str6, j2);
    }

    public static void trackEvent(String str, String str2, String str3, String str4, String str5, long j, String str6, long j2, String str7, long j3) {
        C11582et.m33598a().mo72409a(str, str2, str3, str4, str5, j, str6, j2, str7, j3);
    }

    public static void trackEvent(String str, String str2, String str3, String str4, Map<String, Long> map) {
        C11582et.m33598a().mo72410a(str, str2, str3, str4, map);
    }

    public static void startSession() {
        C11582et.m33598a().mo72428d();
    }

    public static void endSession() {
        C11582et.m33598a().mo72431e();
    }

    public static void onActivityStart(Activity activity) {
        C11582et.m33598a().mo72419b(activity);
    }

    public static void onActivityStop(Activity activity) {
        C11582et.m33598a().mo72425c(activity);
    }

    @Deprecated
    public static void setUserID(String str) {
        setUserID(str, (TJSetUserIDListener) null);
    }

    public static void setUserID(String str, TJSetUserIDListener tJSetUserIDListener) {
        C11582et.m33598a().mo72401a(str, tJSetUserIDListener);
    }

    public static void setUserLevel(int i) {
        C11582et.m33598a().mo72387a(i);
    }

    public static void setUserFriendCount(int i) {
        C11582et.m33598a().mo72418b(i);
    }

    public static void setAppDataVersion(String str) {
        C11582et.m33598a().mo72421b(str);
    }

    public static void setUserCohortVariable(int i, String str) {
        C11582et.m33598a().mo72390a(i, str);
    }

    public static Set<String> getUserTags() {
        return C11582et.m33598a().mo72434f();
    }

    public static void setUserTags(Set<String> set) {
        C11582et.m33598a().mo72411a(set);
    }

    public static void clearUserTags() {
        C11582et.m33598a().mo72435g();
    }

    public static void addUserTag(String str) {
        C11582et.m33598a().mo72426c(str);
    }

    public static void removeUserTag(String str) {
        C11582et.m33598a().mo72429d(str);
    }

    public static void setVideoListener(TJVideoListener tJVideoListener) {
        C11582et.m33598a().mo72398a(tJVideoListener);
    }

    public static void actionComplete(String str) {
        C11582et.m33598a().mo72432e(str);
    }

    public static void setDeviceToken(String str) {
        C11582et.m33598a().mo72437h(str);
    }

    public static void setReceiveRemoteNotification(Context context, Map<String, String> map) {
        C11582et.m33598a().mo72393a(context, map);
    }

    public static void activateInstallReferrerClient(Context context) {
        try {
            C11582et.m33598a().mo72392a(context);
        } catch (TapjoyIntegrationException e) {
            Log.w("Tapjoy", e.getMessage());
        }
    }

    public static void setInstallReferrer(Context context, String str) {
        C11582et.m33598a().mo72420b(context, str);
    }

    public static boolean isPushNotificationDisabled() {
        return C11582et.m33598a().mo72438h();
    }

    public static void setPushNotificationDisabled(boolean z) {
        C11582et.m33598a().mo72423b(z);
    }

    public static void loadSharedLibrary() {
        try {
            System.loadLibrary("tapjoy");
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public static void setGLSurfaceView(GLSurfaceView gLSurfaceView) {
        C11582et.m33598a().mo72395a(gLSurfaceView);
    }

    public static String getSupportURL() {
        return C11582et.m33598a().mo72433f((String) null);
    }

    public static String getSupportURL(String str) {
        return C11582et.m33598a().mo72433f(str);
    }

    public static String getUserToken() {
        return C11582et.m33598a().mo72442k();
    }

    public static boolean isConnected() {
        return C11582et.m33598a().mo72440i();
    }

    @Deprecated
    public static void subjectToGDPR(boolean z) {
        C11582et.m33598a().mo72427c(z);
    }

    @Deprecated
    public static void setUserConsent(String str) {
        C11582et.m33598a().mo72436g(str);
    }

    @Deprecated
    public static void belowConsentAge(boolean z) {
        C11582et.m33598a().mo72430d(z);
    }

    public static synchronized boolean limitedConnect(Context context, String str, TJConnectListener tJConnectListener) {
        boolean a;
        synchronized (Tapjoy.class) {
            a = C11582et.m33598a().mo72414a(context, str, tJConnectListener);
        }
        return a;
    }

    public static boolean isLimitedConnected() {
        return C11582et.m33598a().mo72441j();
    }

    public static TJPlacement getLimitedPlacement(String str, TJPlacementListener tJPlacementListener) {
        return C11582et.m33598a().mo72416b(str, tJPlacementListener);
    }

    public static void setCustomParameter(String str) {
        C11582et.m33598a().mo72439i(str);
    }

    public static String getCustomParameter() {
        return C11582et.m33598a().mo72443l();
    }

    public static TJPrivacyPolicy getPrivacyPolicy() {
        return C11582et.m33598a().mo72444m();
    }

    public static void optOutAdvertisingID(Context context, boolean z) {
        C11582et.m33598a().mo72394a(context, z);
    }
}
