package com.applovin.impl.sdk.p048c;

import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.c.a */
public class C1856a<T> extends C1857b<T> {

    /* renamed from: A */
    public static final C1857b<Boolean> f3018A = m4022a("fullscreen_ads_block_publisher_load_if_another_showing", true);

    /* renamed from: B */
    public static final C1857b<Boolean> f3019B = m4022a("fabsina", false);

    /* renamed from: C */
    public static final C1857b<Boolean> f3020C = m4022a("fabsiaif", false);

    /* renamed from: D */
    public static final C1857b<Long> f3021D = m4022a("ad_expiration_ms", Long.valueOf(TimeUnit.HOURS.toMillis(4)));

    /* renamed from: E */
    public static final C1857b<Boolean> f3022E = m4022a("saewib", false);

    /* renamed from: F */
    public static final C1857b<Long> f3023F = m4022a("fullscreen_ad_displayed_timeout_ms", -1L);

    /* renamed from: G */
    public static final C1857b<Long> f3024G = m4022a("ad_hidden_timeout_ms", -1L);

    /* renamed from: H */
    public static final C1857b<Boolean> f3025H = m4022a("schedule_ad_hidden_on_ad_dismiss", false);

    /* renamed from: I */
    public static final C1857b<Long> f3026I = m4022a("ad_hidden_on_ad_dismiss_callback_delay_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(1)));

    /* renamed from: J */
    public static final C1857b<Boolean> f3027J = m4022a("proe", false);

    /* renamed from: K */
    public static final C1857b<Integer> f3028K = m4022a("mute_state", 2);

    /* renamed from: L */
    public static final C1857b<String> f3029L = m4022a("saf", "");

    /* renamed from: M */
    public static final C1857b<String> f3030M = m4022a("saui", "");

    /* renamed from: N */
    public static final C1857b<Integer> f3031N = m4022a("mra", -1);

    /* renamed from: O */
    public static final C1857b<String> f3032O = m4022a("mra_af", "INTER,REWARDED,REWARDED_INTER,BANNER,LEADER,MREC");

    /* renamed from: P */
    public static final C1857b<Boolean> f3033P = m4022a("pmp", false);

    /* renamed from: Q */
    public static final C1857b<Boolean> f3034Q = m4022a("sai", false);

    /* renamed from: R */
    public static final C1857b<Boolean> f3035R = m4022a("init_adapter_for_sc", true);

    /* renamed from: S */
    public static final C1857b<Boolean> f3036S = m4022a("init_adapter_for_al", true);

    /* renamed from: T */
    public static final C1857b<Boolean> f3037T = m4022a("fadiafase", true);

    /* renamed from: U */
    public static final C1857b<Boolean> f3038U = m4022a("fetch_mediated_ad_gzip", false);

    /* renamed from: V */
    public static final C1857b<Boolean> f3039V = m4022a("max_postback_gzip", false);

    /* renamed from: a */
    public static final C1857b<String> f3040a = m4022a("afi", "");

    /* renamed from: b */
    public static final C1857b<Long> f3041b = m4022a("afi_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(5)));

    /* renamed from: c */
    public static final C1857b<String> f3042c = m4022a("mediation_endpoint", "https://ms.applovin.com/");

    /* renamed from: d */
    public static final C1857b<String> f3043d = m4022a("mediation_backup_endpoint", "https://ms.applvn.com/");

    /* renamed from: e */
    public static final C1857b<Long> f3044e = m4022a("fetch_next_ad_retry_delay_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(2)));

    /* renamed from: f */
    public static final C1857b<Long> f3045f = m4022a("fetch_next_ad_timeout_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(5)));

    /* renamed from: g */
    public static final C1857b<Long> f3046g = m4022a("fetch_mediation_debugger_info_timeout_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(7)));

    /* renamed from: h */
    public static final C1857b<Boolean> f3047h = m4022a("auto_init_mediation_debugger", true);

    /* renamed from: i */
    public static final C1857b<String> f3048i = m4022a("postback_macros", "{\"{MCODE}\":\"mcode\",\"{BCODE}\":\"bcode\",\"{ICODE}\":\"icode\",\"{SCODE}\":\"scode\"}");

    /* renamed from: j */
    public static final C1857b<Boolean> f3049j = m4022a("persistent_mediated_postbacks", false);

    /* renamed from: k */
    public static final C1857b<Long> f3050k = m4022a("max_signal_provider_latency_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(30)));

    /* renamed from: l */
    public static final C1857b<Long> f3051l = m4022a("default_adapter_timeout_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(10)));

    /* renamed from: m */
    public static final C1857b<Long> f3052m = m4022a("ad_refresh_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(30)));

    /* renamed from: n */
    public static final C1857b<Long> f3053n = m4022a("ad_load_failure_refresh_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(30)));

    /* renamed from: o */
    public static final C1857b<String> f3054o = m4022a("ad_load_failure_refresh_ignore_error_codes", "204");

    /* renamed from: p */
    public static final C1857b<Long> f3055p = m4022a("refresh_ad_on_app_resume_elapsed_threshold_ms", 0L);

    /* renamed from: q */
    public static final C1857b<Boolean> f3056q = m4022a("refresh_ad_view_timer_responds_to_background", true);

    /* renamed from: r */
    public static final C1857b<Boolean> f3057r = m4022a("refresh_ad_view_timer_responds_to_store_kit", true);

    /* renamed from: s */
    public static final C1857b<Boolean> f3058s = m4022a("refresh_ad_view_timer_responds_to_window_visibility_changed", false);

    /* renamed from: t */
    public static final C1857b<Boolean> f3059t = m4022a("avrsponse", false);

    /* renamed from: u */
    public static final C1857b<Boolean> f3060u = m4022a("allow_pause_auto_refresh_immediately", false);

    /* renamed from: v */
    public static final C1857b<Long> f3061v = m4022a("fullscreen_display_delay_ms", 600L);

    /* renamed from: w */
    public static final C1857b<Boolean> f3062w = m4022a("susaode", false);

    /* renamed from: x */
    public static final C1857b<Long> f3063x = m4022a("ahdm", 500L);

    /* renamed from: y */
    public static final C1857b<Long> f3064y = m4022a("ad_view_refresh_precache_request_viewability_undesired_flags", 502L);

    /* renamed from: z */
    public static final C1857b<Boolean> f3065z = m4022a("ad_view_refresh_precache_request_enabled", true);
}
