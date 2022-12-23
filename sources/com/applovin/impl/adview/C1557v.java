package com.applovin.impl.adview;

import android.webkit.WebSettings;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.adview.v */
public final class C1557v {

    /* renamed from: a */
    private JSONObject f1974a;

    public C1557v(JSONObject jSONObject) {
        this.f1974a = jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Integer mo13023a() {
        int i;
        String string = JsonUtils.getString(this.f1974a, "mixed_content_mode", (String) null);
        if (StringUtils.isValidString(string)) {
            if ("always_allow".equalsIgnoreCase(string)) {
                i = 0;
            } else if ("never_allow".equalsIgnoreCase(string)) {
                i = 1;
            } else if ("compatibility_mode".equalsIgnoreCase(string)) {
                i = 2;
            }
            return Integer.valueOf(i);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public WebSettings.PluginState mo13024b() {
        String string = JsonUtils.getString(this.f1974a, "plugin_state", (String) null);
        if (StringUtils.isValidString(string)) {
            if (TJAdUnitConstants.String.SPLIT_VIEW_TRIGGER_ON.equalsIgnoreCase(string)) {
                return WebSettings.PluginState.ON;
            }
            if ("on_demand".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.ON_DEMAND;
            }
            if ("off".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.OFF;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Boolean mo13025c() {
        return JsonUtils.getBoolean(this.f1974a, "allow_file_access", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Boolean mo13026d() {
        return JsonUtils.getBoolean(this.f1974a, "load_with_overview_mode", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Boolean mo13027e() {
        return JsonUtils.getBoolean(this.f1974a, "use_wide_view_port", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Boolean mo13028f() {
        return JsonUtils.getBoolean(this.f1974a, "allow_content_access", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Boolean mo13029g() {
        return JsonUtils.getBoolean(this.f1974a, "use_built_in_zoom_controls", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Boolean mo13030h() {
        return JsonUtils.getBoolean(this.f1974a, "display_zoom_controls", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Boolean mo13031i() {
        return JsonUtils.getBoolean(this.f1974a, "save_form_data", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Boolean mo13032j() {
        return JsonUtils.getBoolean(this.f1974a, "geolocation_enabled", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Boolean mo13033k() {
        return JsonUtils.getBoolean(this.f1974a, "need_initial_focus", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public Boolean mo13034l() {
        return JsonUtils.getBoolean(this.f1974a, "allow_file_access_from_file_urls", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public Boolean mo13035m() {
        return JsonUtils.getBoolean(this.f1974a, "allow_universal_access_from_file_urls", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public Boolean mo13036n() {
        return JsonUtils.getBoolean(this.f1974a, "offscreen_pre_raster", (Boolean) null);
    }
}
