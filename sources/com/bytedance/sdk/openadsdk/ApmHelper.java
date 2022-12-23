package com.bytedance.sdk.openadsdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.amazon.aps.shared.APSAnalytics;
import com.apm.insight.MonitorCrash;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.core.C3538j;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p155i.C3537f;
import com.tapjoy.TapjoyConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ApmHelper {

    /* renamed from: a */
    private static boolean f6833a = false;

    /* renamed from: b */
    private static String f6834b;

    /* renamed from: c */
    private static boolean f6835c;

    public static void initApm(Context context, TTAdConfig tTAdConfig) {
        if (!f6833a) {
            C3537f h = C3578m.m11241h();
            boolean B = h.mo19915B();
            f6835c = B;
            if (B && !TextUtils.isEmpty(h.mo19968r())) {
                f6834b = tTAdConfig.getAppId();
                String[] strArr = {"com.bytedance.sdk", "com.com.bytedance.overseas.sdk", "com.pgl.sys.ces", "com.bykv.vk"};
                String a = C3538j.m11045a(context);
                String r = h.mo19968r();
                try {
                    MonitorCrash initSDK = MonitorCrash.initSDK(context, "10000001", 4504, BuildConfig.VERSION_NAME, strArr);
                    initSDK.config().setDeviceId(a);
                    initSDK.setReportUrl(r);
                    initSDK.addTags("host_appid", f6834b);
                    initSDK.addTags("sdk_version", BuildConfig.VERSION_NAME);
                    f6833a = true;
                    m8539b(a, r);
                } catch (Throwable unused) {
                    C2975l.m8390d("ApmHelper", "init Apm fail or not include Apm module");
                    f6833a = false;
                }
            }
        }
    }

    /* renamed from: a */
    private static void m8538a(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            C3578m.m11239f().mo20077a(m8537a(str), "https://" + str2 + "/monitor/collect/c/session?version_code=" + BuildConfig.VERSION_CODE + "&device_platform=android&aid=" + "10000001");
        }
    }

    /* renamed from: b */
    private static void m8539b(String str, String str2) {
        m8538a(str, str2);
    }

    public static void reportPvFromBackGround() {
        if (f6835c) {
            m8538a(C3538j.m11045a(C3578m.m11231a()), C3578m.m11241h().mo19968r());
        }
    }

    /* renamed from: a */
    private static JSONObject m8537a(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject3.put("host_app_id", f6834b);
            jSONObject2.putOpt("custom", jSONObject3);
            jSONObject2.put("os", APSAnalytics.OS_NAME);
            jSONObject2.put(TapjoyConstants.TJC_DEVICE_OS_VERSION_NAME, Build.VERSION.RELEASE);
            jSONObject2.put("device_model", Build.MODEL);
            jSONObject2.put("device_brand", Build.BRAND);
            jSONObject2.put("sdk_version_name", "0.0.5");
            jSONObject2.put("channel", "release");
            jSONObject2.put("aid", "10000001");
            jSONObject2.put("update_version_code", BuildConfig.VERSION_CODE);
            jSONObject2.put("bd_did", str);
            jSONObject.putOpt("header", jSONObject2);
            jSONObject.putOpt("local_time", Long.valueOf(System.currentTimeMillis()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject().put("local_time_ms", System.currentTimeMillis()));
            jSONObject.putOpt("launch", jSONArray);
        } catch (JSONException e) {
            C2975l.m8391e("ApmHelper", e.getMessage());
        }
        return jSONObject;
    }

    public static boolean isIsInit() {
        return f6833a;
    }
}
