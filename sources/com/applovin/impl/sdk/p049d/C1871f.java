package com.applovin.impl.sdk.p049d;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.applovin.impl.sdk.d.f */
public class C1871f {

    /* renamed from: a */
    public static final C1871f f3436a = m4110a("ad_req");

    /* renamed from: b */
    public static final C1871f f3437b = m4110a("ad_imp");

    /* renamed from: c */
    public static final C1871f f3438c = m4110a("ad_session_start");

    /* renamed from: d */
    public static final C1871f f3439d = m4110a("ad_imp_session");

    /* renamed from: e */
    public static final C1871f f3440e = m4110a("cached_files_expired");

    /* renamed from: f */
    public static final C1871f f3441f = m4110a("cache_drop_count");

    /* renamed from: g */
    public static final C1871f f3442g = m4111a("sdk_reset_state_count", true);

    /* renamed from: h */
    public static final C1871f f3443h = m4111a("ad_response_process_failures", true);

    /* renamed from: i */
    public static final C1871f f3444i = m4111a("response_process_failures", true);

    /* renamed from: j */
    public static final C1871f f3445j = m4111a("incent_failed_to_display_count", true);

    /* renamed from: k */
    public static final C1871f f3446k = m4110a("app_paused_and_resumed");

    /* renamed from: l */
    public static final C1871f f3447l = m4111a("ad_rendered_with_mismatched_sdk_key", true);

    /* renamed from: m */
    public static final C1871f f3448m = m4110a("ad_shown_outside_app_count");

    /* renamed from: n */
    public static final C1871f f3449n = m4110a("med_ad_req");

    /* renamed from: o */
    public static final C1871f f3450o = m4111a("med_ad_response_process_failures", true);

    /* renamed from: p */
    public static final C1871f f3451p = m4111a("med_waterfall_ad_no_fill", true);

    /* renamed from: q */
    public static final C1871f f3452q = m4111a("med_waterfall_ad_adapter_load_failed", true);

    /* renamed from: r */
    public static final C1871f f3453r = m4111a("med_waterfall_ad_invalid_response", true);

    /* renamed from: s */
    private static final Set<String> f3454s = new HashSet(32);

    /* renamed from: u */
    private static final Set<C1871f> f3455u = new HashSet(16);

    /* renamed from: t */
    private final String f3456t;

    static {
        m4110a("fullscreen_ad_nil_vc_count");
        m4110a("applovin_bundle_missing");
    }

    private C1871f(String str) {
        this.f3456t = str;
    }

    /* renamed from: a */
    private static C1871f m4110a(String str) {
        return m4111a(str, false);
    }

    /* renamed from: a */
    private static C1871f m4111a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No key name specified");
        } else if (!f3454s.contains(str)) {
            f3454s.add(str);
            C1871f fVar = new C1871f(str);
            if (z) {
                f3455u.add(fVar);
            }
            return fVar;
        } else {
            throw new IllegalArgumentException("Key has already been used: " + str);
        }
    }
}
