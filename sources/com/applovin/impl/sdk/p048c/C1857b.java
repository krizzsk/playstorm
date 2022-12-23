package com.applovin.impl.sdk.p048c;

import android.net.Uri;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.p025a.C1418m;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.google.android.exoplayer2.audio.AacUtil;
import com.tapjoy.TapjoyConstants;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.c.b */
public class C1857b<T> implements Comparable {

    /* renamed from: W */
    public static final C1857b<Boolean> f3066W = m4022a("is_disabled", false);

    /* renamed from: X */
    public static final C1857b<String> f3067X = m4022a("device_id", "");

    /* renamed from: Y */
    public static final C1857b<Boolean> f3068Y = m4022a("rss", true);

    /* renamed from: Z */
    public static final C1857b<String> f3069Z = m4022a("device_token", "");

    /* renamed from: a */
    private static final List<?> f3070a = Arrays.asList(new Class[]{Boolean.class, Float.class, Integer.class, Long.class, String.class});

    /* renamed from: aA */
    public static final C1857b<Long> f3071aA = m4022a("alert_consent_after_init_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(5)));

    /* renamed from: aB */
    public static final C1857b<Long> f3072aB = m4022a("alert_consent_after_dialog_rejection_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(30)));

    /* renamed from: aC */
    public static final C1857b<Long> f3073aC = m4022a("alert_consent_after_dialog_close_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(5)));

    /* renamed from: aD */
    public static final C1857b<Long> f3074aD = m4022a("alert_consent_after_dialog_close_with_back_button_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(5)));

    /* renamed from: aE */
    public static final C1857b<Long> f3075aE = m4022a("alert_consent_after_cancel_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(10)));

    /* renamed from: aF */
    public static final C1857b<Long> f3076aF = m4022a("alert_consent_reschedule_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(5)));

    /* renamed from: aG */
    public static final C1857b<String> f3077aG = m4022a("text_alert_consent_title", "Make this App Better and Stay Free!");

    /* renamed from: aH */
    public static final C1857b<String> f3078aH = m4022a("text_alert_consent_body", "If you don't give us consent to use your data, you will be making our ability to support this app harder, which may negatively affect the user experience.");

    /* renamed from: aI */
    public static final C1857b<String> f3079aI = m4022a("text_alert_consent_yes_option", "I Agree");

    /* renamed from: aJ */
    public static final C1857b<String> f3080aJ = m4022a("text_alert_consent_no_option", "Cancel");

    /* renamed from: aK */
    public static final C1857b<Long> f3081aK = m4022a("ttc_max_click_duration_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(1)));

    /* renamed from: aL */
    public static final C1857b<Integer> f3082aL = m4022a("ttc_max_click_distance_dp", 10);

    /* renamed from: aM */
    public static final C1857b<Integer> f3083aM = m4022a("ttc_acrsv2a", Integer.valueOf(AppLovinTouchToClickListener.ClickRecognitionState.ACTION_DOWN.ordinal()));

    /* renamed from: aN */
    public static final C1857b<Integer> f3084aN = m4022a("ttc_edge_buffer_dp", 0);

    /* renamed from: aO */
    public static final C1857b<String> f3085aO = m4022a("whitelisted_postback_endpoints", "https://prod-a.applovin.com,https://rt.applovin.com/4.0/pix, https://rt.applvn.com/4.0/pix,https://ms.applovin.com/,https://ms.applvn.com/");

    /* renamed from: aP */
    public static final C1857b<String> f3086aP = m4022a("fetch_settings_endpoint", "https://ms.applovin.com/");

    /* renamed from: aQ */
    public static final C1857b<String> f3087aQ = m4022a("fetch_settings_backup_endpoint", "https://ms.applvn.com/");

    /* renamed from: aR */
    public static final C1857b<String> f3088aR = m4022a("adserver_endpoint", "https://a.applovin.com/");

    /* renamed from: aS */
    public static final C1857b<String> f3089aS = m4022a("adserver_backup_endpoint", "https://a.applvn.com/");

    /* renamed from: aT */
    public static final C1857b<String> f3090aT = m4022a("api_endpoint", "https://d.applovin.com/");

    /* renamed from: aU */
    public static final C1857b<String> f3091aU = m4022a("api_backup_endpoint", "https://d.applvn.com/");

    /* renamed from: aV */
    public static final C1857b<String> f3092aV = m4022a("event_tracking_endpoint_v2", "https://rt.applovin.com/");

    /* renamed from: aW */
    public static final C1857b<String> f3093aW = m4022a("event_tracking_backup_endpoint_v2", "https://rt.applvn.com/");

    /* renamed from: aX */
    public static final C1857b<String> f3094aX = m4022a("fetch_variables_endpoint", "https://ms.applovin.com/");

    /* renamed from: aY */
    public static final C1857b<String> f3095aY = m4022a("fetch_variables_backup_endpoint", "https://ms.applvn.com/");

    /* renamed from: aZ */
    public static final C1857b<String> f3096aZ = m4022a("anr_postback_endpoint", "https://ms.applovin.com/1.0/sdk/error");

    /* renamed from: aa */
    public static final C1857b<Long> f3097aa = m4022a("publisher_id", 0L);

    /* renamed from: ab */
    public static final C1857b<Boolean> f3098ab = m4022a("is_verbose_logging", false);

    /* renamed from: ac */
    public static final C1857b<String> f3099ac = m4022a("sc", "");

    /* renamed from: ad */
    public static final C1857b<String> f3100ad = m4022a("sc2", "");

    /* renamed from: ae */
    public static final C1857b<String> f3101ae = m4022a("sc3", "");

    /* renamed from: af */
    public static final C1857b<String> f3102af = m4022a("server_installed_at", "");

    /* renamed from: ag */
    public static final C1857b<Boolean> f3103ag = m4022a("track_network_response_codes", false);

    /* renamed from: ah */
    public static final C1857b<Boolean> f3104ah = m4022a("submit_network_response_codes", false);

    /* renamed from: ai */
    public static final C1857b<Boolean> f3105ai = m4022a("clear_network_response_codes_on_request", true);

    /* renamed from: aj */
    public static final C1857b<Boolean> f3106aj = m4022a("clear_completion_callback_on_failure", false);

    /* renamed from: ak */
    public static final C1857b<Long> f3107ak = m4022a("sicd_ms", 0L);

    /* renamed from: al */
    public static final C1857b<Integer> f3108al = m4022a("logcat_max_line_size", 1000);

    /* renamed from: am */
    public static final C1857b<Integer> f3109am = m4022a("stps", 16);

    /* renamed from: an */
    public static final C1857b<Boolean> f3110an = m4022a("ustp", false);

    /* renamed from: ao */
    public static final C1857b<Boolean> f3111ao = m4022a("exception_handler_enabled", true);

    /* renamed from: ap */
    public static final C1857b<Integer> f3112ap = m4022a("network_thread_count", 4);

    /* renamed from: aq */
    public static final C1857b<Boolean> f3113aq = m4022a("init_omsdk", true);

    /* renamed from: ar */
    public static final C1857b<String> f3114ar = m4022a("omsdk_partner_name", "applovin");

    /* renamed from: as */
    public static final C1857b<Boolean> f3115as = m4022a("publisher_can_show_consent_dialog", true);

    /* renamed from: at */
    public static final C1857b<String> f3116at = m4022a("consent_dialog_url", "https://assets.applovin.com/gdpr/flow_v1/gdpr-flow-1.html");

    /* renamed from: au */
    public static final C1857b<Boolean> f3117au = m4022a("consent_dialog_immersive_mode_on", false);

    /* renamed from: av */
    public static final C1857b<Long> f3118av = m4022a("consent_dialog_show_from_alert_delay_ms", 450L);

    /* renamed from: aw */
    public static final C1857b<Boolean> f3119aw = m4022a("alert_consent_for_dialog_rejected", false);

    /* renamed from: ax */
    public static final C1857b<Boolean> f3120ax = m4022a("alert_consent_for_dialog_closed", false);

    /* renamed from: ay */
    public static final C1857b<Boolean> f3121ay = m4022a("alert_consent_for_dialog_closed_with_back_button", false);

    /* renamed from: az */
    public static final C1857b<Boolean> f3122az = m4022a("alert_consent_after_init", false);

    /* renamed from: b */
    private static final Map<String, C1857b<?>> f3123b = new HashMap(512);

    /* renamed from: bA */
    public static final C1857b<String> f3124bA = m4022a("text_incent_nonvideo_warning_title", "Attention!");

    /* renamed from: bB */
    public static final C1857b<String> f3125bB = m4022a("text_incent_nonvideo_warning_body", "You won’t get your reward if the game hasn’t finished.");

    /* renamed from: bC */
    public static final C1857b<String> f3126bC = m4022a("text_incent_nonvideo_warning_close_option", "Close");

    /* renamed from: bD */
    public static final C1857b<String> f3127bD = m4022a("text_incent_nonvideo_warning_continue_option", "Keep Playing");

    /* renamed from: bE */
    public static final C1857b<Boolean> f3128bE = m4022a("check_webview_has_gesture", false);

    /* renamed from: bF */
    public static final C1857b<Integer> f3129bF = m4022a("close_button_touch_area", 0);

    /* renamed from: bG */
    public static final C1857b<Integer> f3130bG = m4022a("close_button_outside_touch_area", 0);

    /* renamed from: bH */
    public static final C1857b<Boolean> f3131bH = m4022a("creative_debugger_enabled", false);

    /* renamed from: bI */
    public static final C1857b<Long> f3132bI = m4022a("viewability_adview_imp_delay_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(1)));

    /* renamed from: bJ */
    public static final C1857b<Integer> f3133bJ = m4022a("viewability_adview_banner_min_width", 320);

    /* renamed from: bK */
    public static final C1857b<Integer> f3134bK = m4022a("viewability_adview_banner_min_height", Integer.valueOf(AppLovinAdSize.BANNER.getHeight()));

    /* renamed from: bL */
    public static final C1857b<Integer> f3135bL = m4022a("viewability_adview_mrec_min_width", Integer.valueOf(MaxAdFormat.MREC.getSize().getWidth()));

    /* renamed from: bM */
    public static final C1857b<Integer> f3136bM = m4022a("viewability_adview_mrec_min_height", Integer.valueOf(MaxAdFormat.MREC.getSize().getHeight()));

    /* renamed from: bN */
    public static final C1857b<Integer> f3137bN = m4022a("viewability_adview_leader_min_width", 728);

    /* renamed from: bO */
    public static final C1857b<Integer> f3138bO = m4022a("viewability_adview_leader_min_height", Integer.valueOf(AppLovinAdSize.LEADER.getHeight()));

    /* renamed from: bP */
    public static final C1857b<Integer> f3139bP = m4022a("viewability_adview_native_min_width", 0);

    /* renamed from: bQ */
    public static final C1857b<Integer> f3140bQ = m4022a("viewability_adview_native_min_height", 0);

    /* renamed from: bR */
    public static final C1857b<Float> f3141bR = m4022a("viewability_adview_min_alpha", Float.valueOf(10.0f));

    /* renamed from: bS */
    public static final C1857b<Long> f3142bS = m4022a("viewability_timer_min_visible_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(1)));

    /* renamed from: bT */
    public static final C1857b<Long> f3143bT = m4022a("viewability_timer_interval_ms", 100L);

    /* renamed from: bU */
    public static final C1857b<Integer> f3144bU = m4022a("expandable_close_button_size", 27);

    /* renamed from: bV */
    public static final C1857b<Integer> f3145bV = m4022a("expandable_h_close_button_margin", 10);

    /* renamed from: bW */
    public static final C1857b<Integer> f3146bW = m4022a("expandable_t_close_button_margin", 10);

    /* renamed from: bX */
    public static final C1857b<Boolean> f3147bX = m4022a("expandable_lhs_close_button", false);

    /* renamed from: bY */
    public static final C1857b<Integer> f3148bY = m4022a("expandable_close_button_touch_area", 0);

    /* renamed from: bZ */
    public static final C1857b<Boolean> f3149bZ = m4022a("iaad", false);

    /* renamed from: ba */
    public static final C1857b<String> f3150ba = m4022a("token_type_prefixes_r", "4!");

    /* renamed from: bb */
    public static final C1857b<String> f3151bb = m4022a("token_type_prefixes_arj", "json_v3!");

    /* renamed from: bc */
    public static final C1857b<String> f3152bc = m4022a("top_level_events", "landing,paused,resumed,ref,rdf,checkout,iap");

    /* renamed from: bd */
    public static final C1857b<String> f3153bd = m4022a("valid_super_property_types", String.class.getName() + "," + Integer.class.getName() + "," + Long.class.getName() + "," + Double.class.getName() + "," + Float.class.getName() + "," + Date.class.getName() + "," + Uri.class.getName() + "," + List.class.getName() + "," + Map.class.getName());

    /* renamed from: be */
    public static final C1857b<Boolean> f3154be = m4022a("persist_super_properties", true);

    /* renamed from: bf */
    public static final C1857b<Integer> f3155bf = m4022a("super_property_string_max_length", 1024);

    /* renamed from: bg */
    public static final C1857b<Integer> f3156bg = m4022a("super_property_url_max_length", 1024);

    /* renamed from: bh */
    public static final C1857b<Long> f3157bh = m4022a("cached_advertising_info_ttl_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(10)));

    /* renamed from: bi */
    public static final C1857b<Boolean> f3158bi = m4022a("use_per_format_cache_queues", true);

    /* renamed from: bj */
    public static final C1857b<Boolean> f3159bj = m4022a("cache_cleanup_enabled", false);

    /* renamed from: bk */
    public static final C1857b<Long> f3160bk = m4022a("cache_file_ttl_seconds", Long.valueOf(TimeUnit.DAYS.toSeconds(1)));

    /* renamed from: bl */
    public static final C1857b<Integer> f3161bl = m4022a("cache_max_size_mb", -1);

    /* renamed from: bm */
    public static final C1857b<String> f3162bm = m4022a("precache_delimiters", ")]',");

    /* renamed from: bn */
    public static final C1857b<Boolean> f3163bn = m4022a("ad_resource_caching_enabled", true);

    /* renamed from: bo */
    public static final C1857b<Boolean> f3164bo = m4022a("fail_ad_load_on_failed_video_cache", true);

    /* renamed from: bp */
    public static final C1857b<String> f3165bp = m4022a("resource_cache_prefix", "https://vid.applovin.com/,https://stage-vid.applovin.com/,https://pdn.applovin.com/,https://stage-pdn.applovin.com/,https://img.applovin.com/,https://stage-img.applovin.com/,https://d.applovin.com/,https://assets.applovin.com/,https://stage-assets.applovin.com/,https://cdnjs.cloudflare.com/,http://vid.applovin.com/,http://stage-vid.applovin.com/,http://pdn.applovin.com/,http://stage-pdn.applovin.com/,http://img.applovin.com/,http://stage-img.applovin.com/,http://d.applovin.com/,http://assets.applovin.com/,http://stage-assets.applovin.com/,http://cdnjs.cloudflare.com/,http://u.appl.vn/,https://u.appl.vn/,https://res.applovin.com/,https://res1.applovin.com/,https://res2.applovin.com/,https://res3.applovin.com/,http://res.applovin.com/,http://res1.applovin.com/,http://res2.applovin.com/,http://res3.applovin.com/");

    /* renamed from: bq */
    public static final C1857b<String> f3166bq = m4022a("preserved_cached_assets", "sound_off.png,sound_on.png,closeOptOut.png,1381250003_28x28.png,zepto-1.1.3.min.js,jquery-2.1.1.min.js,jquery-1.9.1.min.js,jquery.knob.js");

    /* renamed from: br */
    public static final C1857b<Boolean> f3167br = m4022a("use_old_file_manager", false);

    /* renamed from: bs */
    public static final C1857b<Integer> f3168bs = m4022a("vr_retry_count_v1", 1);

    /* renamed from: bt */
    public static final C1857b<Integer> f3169bt = m4022a("cr_retry_count_v1", 1);

    /* renamed from: bu */
    public static final C1857b<Boolean> f3170bu = m4022a("incent_warning_enabled", false);

    /* renamed from: bv */
    public static final C1857b<String> f3171bv = m4022a("text_incent_warning_title", "Attention!");

    /* renamed from: bw */
    public static final C1857b<String> f3172bw = m4022a("text_incent_warning_body", "You won’t get your reward if the video hasn’t finished.");

    /* renamed from: bx */
    public static final C1857b<String> f3173bx = m4022a("text_incent_warning_close_option", "Close");

    /* renamed from: by */
    public static final C1857b<String> f3174by = m4022a("text_incent_warning_continue_option", "Keep Watching");

    /* renamed from: bz */
    public static final C1857b<Boolean> f3175bz = m4022a("incent_nonvideo_warning_enabled", false);

    /* renamed from: cA */
    public static final C1857b<Integer> f3176cA = m4022a("progress_bar_vertical_padding", -8);

    /* renamed from: cB */
    public static final C1857b<Integer> f3177cB = m4022a("vs_buffer_indicator_size", 50);

    /* renamed from: cC */
    public static final C1857b<Long> f3178cC = m4022a("set_poststitial_muted_initial_delay_ms", 500L);

    /* renamed from: cD */
    public static final C1857b<Integer> f3179cD = m4022a("minepsv", -1);

    /* renamed from: cE */
    public static final C1857b<Integer> f3180cE = m4022a("maxepsv", -1);

    /* renamed from: cF */
    public static final C1857b<Boolean> f3181cF = m4022a("fasuic", true);

    /* renamed from: cG */
    public static final C1857b<Boolean> f3182cG = m4022a("ssfwif", false);

    /* renamed from: cH */
    public static final C1857b<Integer> f3183cH = m4022a("submit_postback_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(10)));

    /* renamed from: cI */
    public static final C1857b<Integer> f3184cI = m4022a("submit_postback_retries", 4);

    /* renamed from: cJ */
    public static final C1857b<Integer> f3185cJ = m4022a("max_postback_attempts", 3);

    /* renamed from: cK */
    public static final C1857b<Boolean> f3186cK = m4022a("fppopq", false);

    /* renamed from: cL */
    public static final C1857b<Integer> f3187cL = m4022a("max_persisted_postbacks", 100);

    /* renamed from: cM */
    public static final C1857b<Boolean> f3188cM = m4022a("retry_on_all_errors", false);

    /* renamed from: cN */
    public static final C1857b<Integer> f3189cN = m4022a("get_retry_delay_v1", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(10)));

    /* renamed from: cO */
    public static final C1857b<Integer> f3190cO = m4022a("http_connection_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(30)));

    /* renamed from: cP */
    public static final C1857b<Integer> f3191cP = m4022a("http_socket_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(20)));

    /* renamed from: cQ */
    public static final C1857b<Boolean> f3192cQ = m4022a("force_ssl", false);

    /* renamed from: cR */
    public static final C1857b<Integer> f3193cR = m4022a("fetch_ad_connection_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(30)));

    /* renamed from: cS */
    public static final C1857b<Integer> f3194cS = m4022a("fetch_ad_retry_count_v1", 1);

    /* renamed from: cT */
    public static final C1857b<Boolean> f3195cT = m4022a("faer", false);

    /* renamed from: cU */
    public static final C1857b<Boolean> f3196cU = m4022a("faroae", false);

    /* renamed from: cV */
    public static final C1857b<Integer> f3197cV = m4022a("submit_data_retry_count_v1", 1);

    /* renamed from: cW */
    public static final C1857b<Integer> f3198cW = m4022a("response_buffer_size", Integer.valueOf(AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND));

    /* renamed from: cX */
    public static final C1857b<Integer> f3199cX = m4022a("fetch_basic_settings_connection_timeout_ms", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(10)));

    /* renamed from: cY */
    public static final C1857b<Integer> f3200cY = m4022a("fetch_basic_settings_retry_count", 3);

    /* renamed from: cZ */
    public static final C1857b<Boolean> f3201cZ = m4022a("fetch_basic_settings_on_reconnect", false);

    /* renamed from: ca */
    public static final C1857b<String> f3202ca = m4022a("js_tag_schemes", "applovin,mopub");

    /* renamed from: cb */
    public static final C1857b<String> f3203cb = m4022a("js_tag_load_success_hosts", "load,load_succeeded");

    /* renamed from: cc */
    public static final C1857b<String> f3204cc = m4022a("js_tag_load_failure_hosts", "failLoad,load_failed");

    /* renamed from: cd */
    public static final C1857b<Integer> f3205cd = m4022a("auxiliary_operations_threads", 3);

    /* renamed from: ce */
    public static final C1857b<Integer> f3206ce = m4022a("caching_operations_threads", 8);

    /* renamed from: cf */
    public static final C1857b<Long> f3207cf = m4022a("fullscreen_ad_pending_display_state_timeout_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(10)));

    /* renamed from: cg */
    public static final C1857b<Long> f3208cg = m4022a("fullscreen_ad_showing_state_timeout_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(2)));

    /* renamed from: ch */
    public static final C1857b<Boolean> f3209ch = m4022a("lhs_close_button_video", false);

    /* renamed from: ci */
    public static final C1857b<Integer> f3210ci = m4022a("close_button_right_margin_video", 4);

    /* renamed from: cj */
    public static final C1857b<Integer> f3211cj = m4022a("close_button_size_video", 30);

    /* renamed from: ck */
    public static final C1857b<Integer> f3212ck = m4022a("close_button_top_margin_video", 8);

    /* renamed from: cl */
    public static final C1857b<Long> f3213cl = m4022a("inter_display_delay", 200L);

    /* renamed from: cm */
    public static final C1857b<Long> f3214cm = m4022a("maximum_close_button_delay_seconds", 999L);

    /* renamed from: cn */
    public static final C1857b<Boolean> f3215cn = m4022a("respect_close_button", true);

    /* renamed from: co */
    public static final C1857b<Boolean> f3216co = m4022a("lhs_skip_button", true);

    /* renamed from: cp */
    public static final C1857b<Boolean> f3217cp = m4022a("track_app_killed", false);

    /* renamed from: cq */
    public static final C1857b<Boolean> f3218cq = m4022a("mute_controls_enabled", false);

    /* renamed from: cr */
    public static final C1857b<Boolean> f3219cr = m4022a("allow_user_muting", true);

    /* renamed from: cs */
    public static final C1857b<Boolean> f3220cs = m4022a("mute_videos", false);

    /* renamed from: ct */
    public static final C1857b<Boolean> f3221ct = m4022a("show_mute_by_default", false);

    /* renamed from: cu */
    public static final C1857b<Boolean> f3222cu = m4022a("mute_with_user_settings", true);

    /* renamed from: cv */
    public static final C1857b<Integer> f3223cv = m4022a("mute_button_size", 32);

    /* renamed from: cw */
    public static final C1857b<Integer> f3224cw = m4022a("mute_button_margin", 10);

    /* renamed from: cx */
    public static final C1857b<Integer> f3225cx = m4022a("mute_button_gravity", 85);

    /* renamed from: cy */
    public static final C1857b<Long> f3226cy = m4022a("progress_bar_step", 25L);

    /* renamed from: cz */
    public static final C1857b<Integer> f3227cz = m4022a("progress_bar_scale", 10000);

    /* renamed from: dA */
    public static final C1857b<Boolean> f3228dA = m4022a("hgn", false);

    /* renamed from: dB */
    public static final C1857b<Boolean> f3229dB = m4022a("cso", false);

    /* renamed from: dC */
    public static final C1857b<Boolean> f3230dC = m4022a("cfs", false);

    /* renamed from: dD */
    public static final C1857b<Boolean> f3231dD = m4022a("cmi", false);

    /* renamed from: dE */
    public static final C1857b<Boolean> f3232dE = m4022a("crat", false);

    /* renamed from: dF */
    public static final C1857b<Boolean> f3233dF = m4022a("cvs", false);

    /* renamed from: dG */
    public static final C1857b<Boolean> f3234dG = m4022a("caf", false);

    /* renamed from: dH */
    public static final C1857b<Boolean> f3235dH = m4022a("cf", false);

    /* renamed from: dI */
    public static final C1857b<Boolean> f3236dI = m4022a("cmtl", true);

    /* renamed from: dJ */
    public static final C1857b<Boolean> f3237dJ = m4022a("cnr", false);

    /* renamed from: dK */
    public static final C1857b<Boolean> f3238dK = m4022a("adr", false);

    /* renamed from: dL */
    public static final C1857b<Float> f3239dL = m4022a("volume_normalization_factor", Float.valueOf(6.6666665f));

    /* renamed from: dM */
    public static final C1857b<Boolean> f3240dM = m4022a("system_user_agent_collection_enabled", false);

    /* renamed from: dN */
    public static final C1857b<Boolean> f3241dN = m4022a("user_agent_collection_enabled", false);

    /* renamed from: dO */
    public static final C1857b<Boolean> f3242dO = m4022a("collect_device_angle", false);

    /* renamed from: dP */
    public static final C1857b<Boolean> f3243dP = m4022a("collect_device_movement", false);

    /* renamed from: dQ */
    public static final C1857b<Float> f3244dQ = m4022a("movement_degradation", Float.valueOf(0.75f));

    /* renamed from: dR */
    public static final C1857b<Integer> f3245dR = m4022a("device_sensor_period_ms", 250);

    /* renamed from: dS */
    public static final C1857b<Boolean> f3246dS = m4022a("dte", true);

    /* renamed from: dT */
    public static final C1857b<Boolean> f3247dT = m4022a("idcw", false);

    /* renamed from: dU */
    public static final C1857b<Long> f3248dU = m4022a("anr_debug_thread_refresh_time_ms", -1L);

    /* renamed from: dV */
    public static final C1857b<Integer> f3249dV = m4022a("fetch_basic_settings_delay_ms", 1500);

    /* renamed from: dW */
    public static final C1857b<Boolean> f3250dW = m4022a("cclia", true);

    /* renamed from: dX */
    public static final C1857b<Long> f3251dX = m4022a("lccdm", 10L);

    /* renamed from: dY */
    public static final C1857b<Integer> f3252dY = m4022a("lmfd", 3);

    /* renamed from: dZ */
    public static final C1857b<Boolean> f3253dZ = m4022a("is_track_ad_info", true);

    /* renamed from: da */
    public static final C1857b<Boolean> f3254da = m4022a("skip_fetch_basic_settings_if_not_connected", false);

    /* renamed from: db */
    public static final C1857b<Integer> f3255db = m4022a("fetch_basic_settings_retry_delay_ms", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(2)));

    /* renamed from: dc */
    public static final C1857b<Integer> f3256dc = m4022a("fetch_variables_connection_timeout_ms", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(5)));

    /* renamed from: dd */
    public static final C1857b<Boolean> f3257dd = m4022a("idflrwbe", false);

    /* renamed from: de */
    public static final C1857b<Boolean> f3258de = m4022a("falawpr", false);

    /* renamed from: df */
    public static final C1857b<Boolean> f3259df = m4022a("sort_query_parameters", false);

    /* renamed from: dg */
    public static final C1857b<Boolean> f3260dg = m4022a("encode_amp_query_value", false);

    /* renamed from: dh */
    public static final C1857b<Long> f3261dh = m4022a("communicator_request_timeout_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(10)));

    /* renamed from: di */
    public static final C1857b<Integer> f3262di = m4022a("communicator_request_retry_count", 3);

    /* renamed from: dj */
    public static final C1857b<Long> f3263dj = m4022a("communicator_request_retry_delay_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(2)));

    /* renamed from: dk */
    public static final C1857b<Integer> f3264dk = m4022a("ad_session_minutes", 60);

    /* renamed from: dl */
    public static final C1857b<Boolean> f3265dl = m4022a("session_tracking_cooldown_on_event_fire", true);

    /* renamed from: dm */
    public static final C1857b<Long> f3266dm = m4022a("session_tracking_resumed_cooldown_minutes", 90L);

    /* renamed from: dn */
    public static final C1857b<Long> f3267dn = m4022a("session_tracking_paused_cooldown_minutes", 90L);

    /* renamed from: do */
    public static final C1857b<Boolean> f3268do = m4022a("qq", false);

    /* renamed from: dp */
    public static final C1857b<Boolean> f3269dp = m4022a("qq1", true);

    /* renamed from: dq */
    public static final C1857b<Boolean> f3270dq = m4022a("qq2", true);

    /* renamed from: dr */
    public static final C1857b<Boolean> f3271dr = m4022a("qq3", true);

    /* renamed from: ds */
    public static final C1857b<Boolean> f3272ds = m4022a("qq4", true);

    /* renamed from: dt */
    public static final C1857b<Boolean> f3273dt = m4022a("qq5", true);

    /* renamed from: du */
    public static final C1857b<Boolean> f3274du = m4022a("qq6", true);

    /* renamed from: dv */
    public static final C1857b<Boolean> f3275dv = m4022a("qq7", true);

    /* renamed from: dw */
    public static final C1857b<Boolean> f3276dw = m4022a("qq8", true);

    /* renamed from: dx */
    public static final C1857b<Boolean> f3277dx = m4022a("qq9", false);

    /* renamed from: dy */
    public static final C1857b<Boolean> f3278dy = m4022a("pui", true);

    /* renamed from: dz */
    public static final C1857b<String> f3279dz = m4022a("plugin_version", "");

    /* renamed from: eA */
    public static final C1857b<Boolean> f3280eA = m4022a("reward_postback_gzip", false);

    /* renamed from: eB */
    public static final C1857b<Boolean> f3281eB = m4022a("force_rerender", false);

    /* renamed from: eC */
    public static final C1857b<Boolean> f3282eC = m4022a("daostr", false);

    /* renamed from: eD */
    public static final C1857b<Boolean> f3283eD = m4022a("tctlaa", false);

    /* renamed from: eE */
    public static final C1857b<Boolean> f3284eE = m4022a("rwvdv", false);

    /* renamed from: eF */
    public static final C1857b<Boolean> f3285eF = m4022a("handle_render_process_gone", true);

    /* renamed from: eG */
    public static final C1857b<Boolean> f3286eG = m4022a("comcr", true);

    /* renamed from: eH */
    public static final C1857b<Boolean> f3287eH = m4022a("teorpc", false);

    /* renamed from: eI */
    public static final C1857b<Boolean> f3288eI = m4022a("rmpibt", false);

    /* renamed from: eJ */
    public static final C1857b<Boolean> f3289eJ = m4022a("spbcioa", false);

    /* renamed from: eK */
    public static final C1857b<Boolean> f3290eK = m4022a("set_webview_render_process_client", false);

    /* renamed from: eL */
    public static final C1857b<Boolean> f3291eL = m4022a("disable_webview_hardware_acceleration", false);

    /* renamed from: eM */
    public static final C1857b<Boolean> f3292eM = m4022a("dsaovcf", false);

    /* renamed from: eN */
    public static final C1857b<Boolean> f3293eN = m4022a("daoar", false);

    /* renamed from: eO */
    public static final C1857b<Boolean> f3294eO = m4022a("use_uri_encode", false);

    /* renamed from: eP */
    public static final C1857b<Boolean> f3295eP = m4022a("anr_detection_enabled", false);

    /* renamed from: eQ */
    public static final C1857b<Long> f3296eQ = m4022a("anr_trigger_millis", 4000L);

    /* renamed from: eR */
    public static final C1857b<Long> f3297eR = m4022a("anr_touch_millis", 3000L);

    /* renamed from: eS */
    public static final C1857b<Long> f3298eS = m4022a("anr_check_millis", 3000L);

    /* renamed from: eT */
    public static final C1857b<Boolean> f3299eT = m4022a("frpcfn", false);

    /* renamed from: eU */
    public static final C1857b<String> f3300eU = m4022a("config_consent_dialog_state", "unknown");

    /* renamed from: eV */
    public static final C1857b<String> f3301eV = m4022a(TapjoyConstants.TJC_DEVICE_COUNTRY_CODE, "");

    /* renamed from: eW */
    public static final C1857b<String> f3302eW = m4022a("c_sticky_topics", "user_engagement_sdk_init,adjust_init,safedk_init,discovery_init,max_ad_events,send_http_request,adapter_initialization_status,privacy_setting_updated,network_sdk_version_updated");

    /* renamed from: eX */
    public static final C1857b<Boolean> f3303eX = m4022a("communicator_enabled", true);

    /* renamed from: ea */
    public static final C1857b<Boolean> f3304ea = m4022a("submit_ad_stats_enabled", false);

    /* renamed from: eb */
    public static final C1857b<Integer> f3305eb = m4022a("submit_ad_stats_connection_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(30)));

    /* renamed from: ec */
    public static final C1857b<Integer> f3306ec = m4022a("submit_ad_stats_retry_count", 1);

    /* renamed from: ed */
    public static final C1857b<Integer> f3307ed = m4022a("submit_ad_stats_max_count", 500);

    /* renamed from: ee */
    public static final C1857b<Boolean> f3308ee = m4022a("asdm", false);

    /* renamed from: ef */
    public static final C1857b<String> f3309ef = m4022a("vast_image_html", "<html><head><style>html,body{height:100%;width:100%}body{background-image:url({SOURCE});background-repeat:no-repeat;background-size:contain;background-position:center;}a{position:absolute;top:0;bottom:0;left:0;right:0}</style></head><body><a href=\"applovin://com.applovin.sdk/adservice/track_click_now\"></a></body></html>");

    /* renamed from: eg */
    public static final C1857b<String> f3310eg = m4022a("vast_link_html", "<html><head><style>html,body,iframe{height:100%;width:100%;}body{margin:0}iframe{border:0;overflow:hidden;position:absolute}</style></head><body><iframe src={SOURCE} frameborder=0></iframe></body></html>");

    /* renamed from: eh */
    public static final C1857b<Integer> f3311eh = m4022a("vast_max_response_length", 640000);

    /* renamed from: ei */
    public static final C1857b<Integer> f3312ei = m4022a("vast_max_wrapper_depth", 5);

    /* renamed from: ej */
    public static final C1857b<String> f3313ej = m4022a("vast_unsupported_video_extensions", "ogv,flv");

    /* renamed from: ek */
    public static final C1857b<String> f3314ek = m4022a("vast_unsupported_video_types", "video/ogg,video/x-flv");

    /* renamed from: el */
    public static final C1857b<Boolean> f3315el = m4022a("vast_validate_with_extension_if_no_video_type", true);

    /* renamed from: em */
    public static final C1857b<Integer> f3316em = m4022a("vast_video_selection_policy", Integer.valueOf(C1418m.C1420a.MEDIUM.ordinal()));

    /* renamed from: en */
    public static final C1857b<Integer> f3317en = m4022a("vast_wrapper_resolution_retry_count_v1", 1);

    /* renamed from: eo */
    public static final C1857b<Integer> f3318eo = m4022a("vast_wrapper_resolution_connection_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(30)));

    /* renamed from: ep */
    public static final C1857b<Boolean> f3319ep = m4022a("ree", true);

    /* renamed from: eq */
    public static final C1857b<Boolean> f3320eq = m4022a("btee", true);

    /* renamed from: er */
    public static final C1857b<Long> f3321er = m4022a("server_timestamp_ms", 0L);

    /* renamed from: es */
    public static final C1857b<Long> f3322es = m4022a("device_timestamp_ms", 0L);

    /* renamed from: et */
    public static final C1857b<Integer> f3323et = m4022a("gzip_min_length", 0);

    /* renamed from: eu */
    public static final C1857b<Boolean> f3324eu = m4022a("gzip_encoding_default", false);

    /* renamed from: ev */
    public static final C1857b<Boolean> f3325ev = m4022a("fetch_settings_gzip", false);

    /* renamed from: ew */
    public static final C1857b<Boolean> f3326ew = m4022a("device_init_gzip", false);

    /* renamed from: ex */
    public static final C1857b<Boolean> f3327ex = m4022a("fetch_ad_gzip", false);

    /* renamed from: ey */
    public static final C1857b<Boolean> f3328ey = m4022a("event_tracking_gzip", false);

    /* renamed from: ez */
    public static final C1857b<Boolean> f3329ez = m4022a("submit_ad_stats_gzip", false);

    /* renamed from: c */
    private final String f3330c;

    /* renamed from: d */
    private final T f3331d;

    public C1857b(String str, T t) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified");
        } else if (t != null) {
            this.f3330c = str;
            this.f3331d = t;
        } else {
            throw new IllegalArgumentException("No default value specified");
        }
    }

    /* renamed from: a */
    protected static <T> C1857b<T> m4022a(String str, T t) {
        if (t == null) {
            throw new IllegalArgumentException("No default value specified");
        } else if (f3070a.contains(t.getClass())) {
            C1857b<T> bVar = new C1857b<>(str, t);
            if (!f3123b.containsKey(str)) {
                f3123b.put(str, bVar);
                return bVar;
            }
            throw new IllegalArgumentException("Setting has already been used: " + str);
        } else {
            throw new IllegalArgumentException("Unsupported value type: " + t.getClass());
        }
    }

    /* renamed from: c */
    public static Collection<C1857b<?>> m4023c() {
        return Collections.synchronizedCollection(f3123b.values());
    }

    /* renamed from: a */
    public T mo14056a(Object obj) {
        return this.f3331d.getClass().cast(obj);
    }

    /* renamed from: a */
    public String mo14057a() {
        return this.f3330c;
    }

    /* renamed from: b */
    public T mo14058b() {
        return this.f3331d;
    }

    public int compareTo(Object obj) {
        if (!(obj instanceof C1857b)) {
            return 0;
        }
        return this.f3330c.compareTo(((C1857b) obj).mo14057a());
    }
}
