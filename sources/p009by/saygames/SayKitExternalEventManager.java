package p009by.saygames;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.AppEventsLogger;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.unity3d.player.UnityPlayer;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* renamed from: by.saygames.SayKitExternalEventManager */
public class SayKitExternalEventManager {
    private static boolean _deviceIdAdded = false;
    static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static AppEventsLogger mFacebookEventsLogger;
    private static FirebaseAnalytics mFirebaseAnalytics;

    private static Activity getActivity() {
        return UnityPlayer.currentActivity;
    }

    public static void InitExternalEventManagers() {
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(getActivity());
        mFacebookEventsLogger = AppEventsLogger.newLogger(getActivity());
        FirebaseCrashlytics instance = FirebaseCrashlytics.getInstance();
        instance.setCustomKey("device", Build.MANUFACTURER + "+" + Build.MODEL);
        FirebaseCrashlytics.getInstance().setCustomKey("start_time", dateFormat.format(Calendar.getInstance().getTime()));
    }

    public static void SetDeviceId(String str) {
        if (!_deviceIdAdded && str != null) {
            _deviceIdAdded = true;
            FirebaseCrashlytics.getInstance().setUserId(str);
        }
    }

    public static void SetSessionId(String str) {
        FirebaseCrashlytics.getInstance().setCustomKey("session", str);
    }

    public static void setCrashlyticsParam(String str, String str2) {
        FirebaseCrashlytics.getInstance().setCustomKey(str, str2);
    }

    public static void logCrashlyticsException(String str) {
        FirebaseCrashlytics.getInstance().recordException(new Exception(str));
    }

    public static void logCrashlytics(String str) {
        FirebaseCrashlytics.getInstance().log(str);
    }

    public static void trackFirebaseId() {
        FirebaseAnalytics.getInstance(getActivity()).getAppInstanceId().addOnCompleteListener(new OnCompleteListener<String>() {
            public void onComplete(Task<String> task) {
                try {
                    SayKitEvents.track("firebase_client_id", 0, 0, task.getResult());
                } catch (Exception e) {
                    SayKitLog.Log("i", "[trackFirebaseId]", "Error getting firebase_id ", e);
                }
            }
        });
    }

    public static void trackFirebaseEvent(String str, String str2) {
        if (mFirebaseAnalytics != null) {
            Bundle bundle = new Bundle();
            bundle.putString("extra", str2);
            mFirebaseAnalytics.logEvent(str, bundle);
            return;
        }
        Log.w("SayKit", "Firebase Analytics is not initialized.");
    }

    public static void trackFirebaseEventWithValue(String str, float f) {
        if (mFirebaseAnalytics != null) {
            Bundle bundle = new Bundle();
            bundle.putFloat("value", f);
            if (str.equals("ads_earnings")) {
                bundle.putString("currency", "USD");
            }
            mFirebaseAnalytics.logEvent(str, bundle);
            return;
        }
        Log.w("SayKit", "Firebase Analytics is not initialized.");
    }

    public static void trackFullFirebaseEvent(String str, float f, String str2) {
        if (mFirebaseAnalytics != null) {
            Bundle convertCustomJSPNToDictionary = convertCustomJSPNToDictionary(str2);
            if (f != 0.0f) {
                convertCustomJSPNToDictionary.putFloat("value", f);
            }
            mFirebaseAnalytics.logEvent(str, convertCustomJSPNToDictionary);
            return;
        }
        Log.w("SayKit", "Firebase Analytics is not initialized.");
    }

    public static void setFirebaseUserProperty(String str, String str2) {
        FirebaseAnalytics firebaseAnalytics = mFirebaseAnalytics;
        if (firebaseAnalytics != null) {
            firebaseAnalytics.setUserProperty(str, str2);
        } else {
            Log.w("SayKit", "Firebase Analytics is not initialized.");
        }
    }

    public static void pingFacebook() {
        SayKitLog.Log("w", "SayKit", "Pinging Facebook");
        if (mFacebookEventsLogger == null) {
            SayKitEvents.track("facebook_error", 0, 0, "Facebook AppEventsLogger is not initialized.");
        }
        FacebookSdk.fullyInitialize();
        trackFullFacebookEvent(AppEventsConstants.EVENT_NAME_ACTIVATED_APP, 0.0f, "");
    }

    public static void trackFacebookEvent(String str, String str2) {
        if (mFacebookEventsLogger != null) {
            Bundle bundle = new Bundle();
            bundle.putString("extra", str2);
            bundle.putString("version", "a2");
            mFacebookEventsLogger.logEvent(str, bundle);
            return;
        }
        Log.w("SayKit", "Facebook AppEventsLogger is not initialized.");
    }

    public static void trackFacebookPurchaseEvent(float f, String str) {
        if (mFacebookEventsLogger != null) {
            Bundle bundle = new Bundle();
            bundle.putString(AppEventsConstants.EVENT_PARAM_CURRENCY, str);
            bundle.putString("version", "a2");
            bundle.putString(AppEventsConstants.EVENT_PARAM_CONTENT_TYPE, AppLovinEventTypes.USER_VIEWED_PRODUCT);
            mFacebookEventsLogger.logEvent(AppEventsConstants.EVENT_NAME_PURCHASED, (double) f, bundle);
            mFacebookEventsLogger.flush();
            return;
        }
        Log.w("SayKit", "Facebook AppEventsLogger is not initialized.");
        SayKitEvents.track("facebook_error", 0, 0, "Purchase event is not sent. Facebook AppEventsLogger is not initialized.");
    }

    public static void trackFullFacebookEvent(String str, float f, String str2) {
        if (mFacebookEventsLogger != null) {
            Bundle convertCustomJSPNToDictionary = convertCustomJSPNToDictionary(str2);
            convertCustomJSPNToDictionary.putString("version", "a2");
            if (f == 0.0f) {
                mFacebookEventsLogger.logEvent(str, convertCustomJSPNToDictionary);
            } else {
                mFacebookEventsLogger.logEvent(str, (double) f, convertCustomJSPNToDictionary);
            }
        } else {
            Log.w("SayKit", "Facebook AppEventsLogger is not initialized.");
        }
    }

    public static Bundle convertCustomJSPNToDictionary(String str) {
        Bundle bundle = new Bundle();
        try {
            if (str.length() > 0) {
                while (str.length() > 0) {
                    int indexOf = str.indexOf("%|%");
                    String substring = str.substring(0, indexOf);
                    String substring2 = str.substring(indexOf + 3);
                    int indexOf2 = substring2.indexOf("%|%");
                    String substring3 = substring2.substring(0, indexOf2);
                    String substring4 = substring2.substring(indexOf2 + 3);
                    int indexOf3 = substring4.indexOf("}&%&{");
                    String substring5 = substring4.substring(0, indexOf3);
                    str = substring4.substring(indexOf3 + 5);
                    if (substring5.equals("bool")) {
                        bundle.putBoolean(substring, Boolean.parseBoolean(substring3));
                    } else if (substring5.equals("int")) {
                        bundle.putInt(substring, Integer.parseInt(substring3));
                    } else if (substring5.equals("float")) {
                        bundle.putFloat(substring, Float.parseFloat(substring3));
                    } else {
                        bundle.putString(substring, substring3);
                    }
                }
            }
        } catch (Exception e) {
            SayKitLog.Log("e", "Error", e.getMessage());
        }
        return bundle;
    }
}
