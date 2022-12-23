package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.p120e.C2909a;
import com.bytedance.sdk.component.utils.C2958a;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2988w;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdManager;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.core.C3627o;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.p151e.C3500o;
import com.bytedance.sdk.openadsdk.core.p155i.C3537f;
import com.bytedance.sdk.openadsdk.p130b.C3156e;
import com.bytedance.sdk.openadsdk.utils.C4003m;
import com.bytedance.sdk.openadsdk.utils.C4006n;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import com.bytedance.sdk.openadsdk.utils.C4020v;
import com.com.bytedance.overseas.sdk.p187b.C4028a;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.smaato.sdk.video.vast.model.Verification;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.VungleApiClient;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.u */
/* compiled from: TTAdManagerImpl */
public class C3647u implements TTAdManager {

    /* renamed from: f */
    private static final Map<Integer, String> f9262f = new HashMap<Integer, String>(12) {
        {
            put(1, "abtest");
            put(2, "user_data");
            put(3, VungleApiClient.GAID);
            put(4, "apk-sign");
            put(5, "app_running_time");
            put(6, Verification.VENDOR);
            put(7, DeviceRequestsHelper.DEVICE_INFO_MODEL);
            put(8, "user_agent_device");
            put(9, "user_agent_webview");
            put(10, "sys_compiling_time");
            put(11, "sec_did");
            put(12, "url");
            put(13, "X-Argus");
            put(14, "X-Ladon");
            put(15, "X-Khronos");
            put(16, "X-Gorgon");
            put(17, "pangle_m");
            put(18, "screen_height");
            put(19, "screen_width");
            put(20, "rom_version");
            put(21, TapjoyConstants.TJC_CARRIER_NAME);
            put(22, TapjoyConstants.TJC_DEVICE_OS_VERSION_NAME);
            put(23, "conn_type");
            put(24, "boot");
        }
    };

    /* renamed from: a */
    String f9263a;

    /* renamed from: b */
    boolean f9264b = false;

    /* renamed from: c */
    boolean f9265c = false;

    /* renamed from: d */
    String f9266d = "com.union_test.internationad";

    /* renamed from: e */
    String f9267e = "5001121";

    /* renamed from: g */
    private int f9268g = 0;

    /* renamed from: e */
    private void m11606e(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f9263a)) {
            this.f9263a = str;
            try {
                JSONObject a = C3578m.m11239f().mo20072a(new JSONObject(str));
                if (a != null) {
                    C3627o.C3637a a2 = C3627o.C3637a.m11562a(a, (AdSlot) null, (C3500o) null);
                    if (a2.f9233d == 20000 && a2.f9237h != null && a2.f9237h.mo19477b().size() > 0) {
                        boolean z = false;
                        C3498n nVar = a2.f9237h.mo19477b().get(0);
                        this.f9264b = C4014u.m13216d(nVar);
                        if (nVar.mo19604G() != null) {
                            z = true;
                        }
                        this.f9265c = z;
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public C3647u setAppId(String str) {
        C3524h.m10852d().mo19834a(str);
        return this;
    }

    /* renamed from: a */
    public C3647u setPaid(boolean z) {
        C3524h.m10852d().mo19846c(z);
        return this;
    }

    /* renamed from: b */
    public C3647u setName(String str) {
        C3524h.m10852d().mo19840b(str);
        return this;
    }

    /* renamed from: c */
    public C3647u setKeywords(String str) {
        C3524h.m10852d().mo19845c(str);
        return this;
    }

    public TTAdNative createAdNative(Context context) {
        return new C3649v(context);
    }

    /* renamed from: d */
    public C3647u setData(String str) {
        C3524h.m10852d().mo19848d(str);
        return this;
    }

    public TTAdManager debugLog(int i) {
        this.f9268g = i;
        return this;
    }

    public String getBiddingToken() {
        return getBiddingToken((String) null);
    }

    public String getBiddingToken(String str) {
        int i;
        String str2 = str;
        C4014u.m13256n("getBiddingToken");
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("is_init", TTAdSdk.isInitSuccess() ? 1 : 0);
            String e = C3578m.m11241h().mo19939e();
            String f = C3578m.m11241h().mo19942f();
            if (!(e == null || f == null)) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("version", e);
                jSONObject3.put("param", f);
                jSONObject2.put("abtest", jSONObject3);
            }
            jSONObject2.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject2.put(CampaignEx.JSON_KEY_PACKAGE_NAME, C4014u.m13214d());
            jSONObject2.put("user_data", C3627o.m11499a(TextUtils.isEmpty(str2) ? null : new AdSlot.Builder().setCodeId(str2).build()));
            jSONObject2.put(CampaignEx.JSON_KEY_ST_TS, System.currentTimeMillis() / 1000);
            if (jSONObject2.toString().getBytes().length <= 2680) {
                C3537f h = C3578m.m11241h();
                if (h.mo19966p(VungleApiClient.GAID)) {
                    jSONObject2.put(VungleApiClient.GAID, C4028a.m13343a().mo20936b());
                }
                Context a = C3578m.m11231a();
                jSONObject2.put("apk-sign", C3644s.m11585a());
                jSONObject2.put("app_running_time", (System.currentTimeMillis() - TTAdSdk.INIT_TIME) / 1000);
                jSONObject2.put(Verification.VENDOR, Build.MANUFACTURER);
                jSONObject2.put(DeviceRequestsHelper.DEVICE_INFO_MODEL, Build.MODEL);
                jSONObject2.put("user_agent_device", C4014u.m13180a());
                jSONObject2.put("user_agent_webview", C4014u.m13197b());
                jSONObject2.put("sys_compiling_time", C3538j.m11048b(a));
                jSONObject2.put("screen_height", C4020v.m13310d(a));
                jSONObject2.put("screen_width", C4020v.m13306c(a));
                jSONObject2.put("rom_version", C4003m.m13121a());
                jSONObject2.put(TapjoyConstants.TJC_CARRIER_NAME, C4006n.m13148a());
                jSONObject2.put(TapjoyConstants.TJC_DEVICE_OS_VERSION_NAME, Build.VERSION.RELEASE);
                jSONObject2.put("conn_type", C4014u.m13261p(a));
                if (h.mo19966p("boot")) {
                    jSONObject2.put("boot", (System.currentTimeMillis() - SystemClock.elapsedRealtime()) + "");
                }
                C3644s.m11588a(jSONObject2);
                i = f9262f.size();
            } else {
                i = 2;
            }
            while (i >= 1 && jSONObject2.toString().getBytes().length > 2680) {
                jSONObject2.remove(f9262f.get(Integer.valueOf(i)));
                i--;
            }
            jSONObject = C2958a.m8335a(jSONObject2);
            while (i >= 1 && jSONObject.toString().getBytes().length > 4096) {
                jSONObject2.remove(f9262f.get(Integer.valueOf(i)));
                jSONObject = C2958a.m8335a(jSONObject2);
                i--;
            }
            if (C2975l.m8389c()) {
                C2975l.m8387c("mssdk", "bidding token: " + jSONObject.toString() + "\nbidding token length: " + jSONObject.toString().getBytes().length);
            }
            C3156e.m9188a(str);
        } catch (Throwable unused) {
        }
        C2975l.m8384b("TTAdManagerImpl", "bidding token: " + jSONObject.toString());
        return jSONObject.toString();
    }

    public int getCcpa() {
        return C3524h.m10852d().mo19872v();
    }

    public int getCoppa() {
        return C3524h.m10852d().mo19859i();
    }

    public int getDebugLog() {
        return this.f9268g;
    }

    public int getGdpr() {
        return C3524h.m10852d().mo19860j();
    }

    public String getSDKVersion() {
        return BuildConfig.VERSION_NAME;
    }

    public String getSupportRegion() {
        return "VA";
    }

    public boolean isExpressAd(String str, String str2) {
        if (C3578m.m11241h().mo19948h(str)) {
            return true;
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        m11606e(str2);
        return this.f9265c;
    }

    public boolean isFullScreenVideoAd(String str, String str2) {
        if (C3578m.m11241h().mo19951i(str)) {
            return true;
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        m11606e(str2);
        return this.f9264b;
    }

    public TTAdManager isUseTextureView(boolean z) {
        C3524h.m10852d().mo19852e(z);
        return this;
    }

    public boolean onlyVerityPlayable(String str, int i, String str2, String str3, String str4) {
        if (!this.f9266d.equals(C3578m.m11231a().getPackageName()) || !this.f9267e.equals(C3524h.m10852d().mo19854f()) || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Method a = C2988w.m8466a("com.bytedance.sdk.openadsdk.TTC3Proxy", "verityPlayable", String.class, Integer.TYPE, String.class, String.class, String.class);
            if (a != null) {
                a.invoke((Object) null, new Object[]{str, Integer.valueOf(i), str2, str3, str4});
            }
        } catch (Throwable th) {
            C2975l.m8385b("TTAdManagerImpl", "reward component maybe not exist, pls check", th);
        }
        return true;
    }

    public TTAdManager openDebugMode() {
        C2975l.m8382b();
        C2909a.m8132a();
        return this;
    }

    public void requestPermissionIfNecessary(Context context) {
    }

    public TTAdManager setAllowShowNotifiFromSDK(boolean z) {
        C3524h.m10852d().mo19849d(z);
        return this;
    }

    public TTAdManager setCcpa(int i) {
        C3524h.m10852d().mo19855f(i);
        return this;
    }

    public TTAdManager setCoppa(int i) {
        C3524h.m10852d().mo19839b(i);
        return this;
    }

    public TTAdManager setGdpr(int i) {
        C3524h.m10852d().mo19844c(i);
        return this;
    }

    public TTAdManager setIconId(int i) {
        C3524h.m10852d().mo19833a(i);
        return this;
    }

    public TTAdManager setNeedClearTaskReset(String[] strArr) {
        C3524h.m10852d().mo19837a(strArr);
        return this;
    }

    public TTAdManager setTitleBarTheme(int i) {
        C3524h.m10852d().mo19851e(i);
        return this;
    }

    public void showPrivacyProtection() {
        TTDelegateActivity.m8754a();
    }
}
