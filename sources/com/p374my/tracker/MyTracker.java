package com.p374my.tracker;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import com.p374my.tracker.ads.AdEvent;
import com.p374my.tracker.miniapps.MiniAppEvent;
import com.p374my.tracker.obfuscated.C10089a0;
import com.p374my.tracker.obfuscated.C10175u0;
import com.p374my.tracker.obfuscated.C10178v0;
import com.p374my.tracker.obfuscated.C10180w0;
import com.p374my.tracker.plugins.MyTrackerPluginConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.my.tracker.MyTracker */
public final class MyTracker {
    public static final String VERSION = "3.0.6";

    /* renamed from: a */
    private static final List<MyTrackerPluginConfig> f25070a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    private static volatile C10089a0 f25071b;

    /* renamed from: com.my.tracker.MyTracker$AttributionListener */
    public interface AttributionListener {
        void onReceiveAttribution(MyTrackerAttribution myTrackerAttribution);
    }

    /* renamed from: com.my.tracker.MyTracker$a */
    static final class C10084a {

        /* renamed from: a */
        static final C10178v0 f25072a;

        /* renamed from: b */
        static final MyTrackerParams f25073b;

        /* renamed from: c */
        static final MyTrackerConfig f25074c;

        static {
            C10178v0 s = C10178v0.m30453s();
            f25072a = s;
            f25074c = MyTrackerConfig.newConfig(s);
            f25073b = s.mo66422i();
        }
    }

    private MyTracker() {
    }

    public static void applyPlugin(MyTrackerPluginConfig myTrackerPluginConfig) {
        f25070a.add(myTrackerPluginConfig);
    }

    public static void flush() {
        C10089a0 a0Var = f25071b;
        if (a0Var == null) {
            C10175u0.m30444b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            a0Var.mo66051a();
        }
    }

    public static String getInstanceId(Context context) {
        return C10180w0.m30493a(context);
    }

    public static MyTrackerConfig getTrackerConfig() {
        return C10084a.f25074c;
    }

    public static MyTrackerParams getTrackerParams() {
        return C10084a.f25073b;
    }

    public static String handleDeeplink(Intent intent) {
        C10089a0 a0Var = f25071b;
        if (a0Var != null) {
            return a0Var.mo66050a(intent);
        }
        C10175u0.m30444b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        return null;
    }

    public static void initTracker(String str, Application application) {
        if (TextUtils.isEmpty(str)) {
            C10175u0.m30444b("MyTracker initialization failed: id can't be empty");
        } else if (f25071b != null) {
            C10175u0.m30446c("MyTracker has already been initialized");
        } else {
            synchronized (MyTracker.class) {
                if (f25071b != null) {
                    C10175u0.m30446c("MyTracker has already been initialized");
                    return;
                }
                C10178v0 v0Var = C10084a.f25072a;
                ArrayList arrayList = new ArrayList(f25070a);
                C10089a0 a = C10089a0.m29945a(str, v0Var, application);
                a.mo66060a((List<MyTrackerPluginConfig>) arrayList);
                f25071b = a;
            }
        }
    }

    public static boolean isDebugMode() {
        return C10175u0.m30443a();
    }

    public static void onActivityResult(int i, Intent intent) {
        C10089a0 a0Var = f25071b;
        if (a0Var == null) {
            C10175u0.m30444b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            a0Var.mo66052a(i, intent);
        }
    }

    public static void onPurchasesUpdated(int i, List<Object> list) {
        C10089a0 a0Var = f25071b;
        if (a0Var == null) {
            C10175u0.m30444b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            a0Var.mo66053a(i, list);
        }
    }

    public static void setAttributionListener(AttributionListener attributionListener) {
        setAttributionListener(attributionListener, (Handler) null);
    }

    public static void setAttributionListener(AttributionListener attributionListener, Handler handler) {
        C10084a.f25072a.mo66398a(attributionListener, handler);
    }

    public static void setDebugMode(boolean z) {
        C10175u0.m30442a(z);
    }

    public static void trackAdEvent(AdEvent adEvent) {
        C10089a0 a0Var = f25071b;
        if (a0Var == null) {
            C10175u0.m30444b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            a0Var.mo66056a(adEvent);
        }
    }

    public static void trackEvent(String str) {
        trackEvent(str, (Map<String, String>) null);
    }

    public static void trackEvent(String str, Map<String, String> map) {
        C10089a0 a0Var = f25071b;
        if (a0Var == null) {
            C10175u0.m30444b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            a0Var.mo66059a(str, map);
        }
    }

    public static void trackInviteEvent() {
        trackInviteEvent((Map<String, String>) null);
    }

    public static void trackInviteEvent(Map<String, String> map) {
        C10089a0 a0Var = f25071b;
        if (a0Var == null) {
            C10175u0.m30444b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            a0Var.mo66061a(map);
        }
    }

    public static void trackLaunchManually(Activity activity) {
        C10089a0 a0Var = f25071b;
        if (a0Var == null) {
            C10175u0.m30444b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            a0Var.mo66055a(activity);
        }
    }

    public static void trackLevelEvent() {
        trackLevelEvent((Map<String, String>) null);
    }

    public static void trackLevelEvent(int i, Map<String, String> map) {
        C10089a0 a0Var = f25071b;
        if (a0Var == null) {
            C10175u0.m30444b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            a0Var.mo66054a(i, map);
        }
    }

    public static void trackLevelEvent(Map<String, String> map) {
        C10089a0 a0Var = f25071b;
        if (a0Var == null) {
            C10175u0.m30444b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            a0Var.mo66064b(map);
        }
    }

    public static void trackLoginEvent(String str, String str2) {
        trackLoginEvent(str, str2, (Map<String, String>) null);
    }

    public static void trackLoginEvent(String str, String str2, Map<String, String> map) {
        C10089a0 a0Var = f25071b;
        if (a0Var == null) {
            C10175u0.m30444b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            a0Var.mo66058a(str, str2, map);
        }
    }

    public static void trackMiniAppEvent(MiniAppEvent miniAppEvent) {
        C10089a0 a0Var = f25071b;
        if (a0Var == null) {
            C10175u0.m30444b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            a0Var.mo66057a(miniAppEvent);
        }
    }

    public static void trackPurchaseEvent(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        trackPurchaseEvent(jSONObject, jSONObject2, str, (Map<String, String>) null);
    }

    public static void trackPurchaseEvent(JSONObject jSONObject, JSONObject jSONObject2, String str, Map<String, String> map) {
        C10089a0 a0Var = f25071b;
        if (a0Var == null) {
            C10175u0.m30444b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            a0Var.mo66062a(jSONObject, jSONObject2, str, map);
        }
    }

    public static void trackRegistrationEvent(String str, String str2) {
        trackRegistrationEvent(str, str2, (Map<String, String>) null);
    }

    public static void trackRegistrationEvent(String str, String str2, Map<String, String> map) {
        C10089a0 a0Var = f25071b;
        if (a0Var == null) {
            C10175u0.m30444b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            a0Var.mo66063b(str, str2, map);
        }
    }
}
