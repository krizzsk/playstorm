package com.ogury.p376ed.internal;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.tapjoy.TapjoyConstants;
import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.fd */
public final class C10519fd {

    /* renamed from: a */
    private final C10510ez f26587a;

    /* renamed from: b */
    private final C10514fa f26588b;

    /* renamed from: c */
    private final C10542fx f26589c;

    public C10519fd(C10510ez ezVar, C10514fa faVar, C10542fx fxVar) {
        C10765mq.m32773b(ezVar, "device");
        C10765mq.m32773b(faVar, TapjoyConstants.TJC_APP_PLACEMENT);
        C10765mq.m32773b(fxVar, "coreWrapper");
        this.f26587a = ezVar;
        this.f26588b = faVar;
        this.f26589c = fxVar;
    }

    /* renamed from: a */
    public final JSONObject mo67368a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TapjoyConstants.TJC_DEVICE_TIMEZONE, C10510ez.m31865f());
        jSONObject.put("aaid", "00000000-0000-0000-0000-000000000000");
        jSONObject.put(TapjoyConstants.TJC_DEVICE_LANGUAGE, this.f26588b.mo67358c());
        jSONObject.put(TapjoyConstants.TJC_DEVICE_COUNTRY_CODE, this.f26588b.mo67359d());
        jSONObject.put("install_unknown_sources", this.f26587a.mo67339h());
        jSONObject.put("aaid_optin", this.f26589c.mo67450a().isAdTrackingEnabled());
        jSONObject.put("privacy_compliancy", m31916a(this.f26589c.mo67452c()));
        jSONObject.put("instance_token", this.f26589c.mo67453d());
        jSONObject.put("device", m31917b());
        jSONObject.put("permissions", m31919d());
        return jSONObject;
    }

    /* renamed from: b */
    private final JSONObject m31917b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", this.f26587a.mo67340i());
        jSONObject.put("screen", m31918c());
        jSONObject.put(TapjoyConstants.TJC_DEVICE_OS_VERSION_NAME, C10510ez.m31858a());
        jSONObject.put("vm_name", C10510ez.m31863d());
        jSONObject.put("phone_arch", C10510ez.m31864e());
        jSONObject.put("vm_version", C10510ez.m31862c());
        return jSONObject;
    }

    /* renamed from: c */
    private static JSONObject m31918c() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("density", Float.valueOf(displayMetrics.density));
        jSONObject.put("height", displayMetrics.heightPixels);
        jSONObject.put("width", displayMetrics.widthPixels);
        return jSONObject;
    }

    /* renamed from: d */
    private final JSONObject m31919d() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ACCESS_NETWORK_STATE", this.f26588b.mo67356a("android.permission.ACCESS_NETWORK_STATE"));
        jSONObject.put("RECEIVE_BOOT_COMPLETED", this.f26588b.mo67356a("android.permission.RECEIVE_BOOT_COMPLETED"));
        jSONObject.put("SYSTEM_ALERT_WINDOW", this.f26588b.mo67356a("android.permission.SYSTEM_ALERT_WINDOW"));
        jSONObject.put("GET_ACCOUNTS", this.f26588b.mo67356a("android.permission.GET_ACCOUNTS"));
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m31916a(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("consent_token", str);
        return jSONObject;
    }
}
