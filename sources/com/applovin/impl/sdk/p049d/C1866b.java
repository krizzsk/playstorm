package com.applovin.impl.sdk.p049d;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.applovin.impl.sdk.d.b */
public class C1866b {

    /* renamed from: A */
    public static final C1866b f3384A = m4075a("wvhec", "WEB_VIEW_HTTP_ERROR_COUNT");

    /* renamed from: B */
    public static final C1866b f3385B = m4075a("wvrec", "WEB_VIEW_RENDER_ERROR_COUNT");

    /* renamed from: C */
    public static final C1866b f3386C = m4075a("wvsem", "WEB_VIEW_SSL_ERROR_MESSAGES");

    /* renamed from: D */
    public static final C1866b f3387D = m4075a("wvruc", "WEB_VIEW_RENDERER_UNRESPONSIVE_COUNT");

    /* renamed from: G */
    private static final Set<String> f3388G = new HashSet(32);

    /* renamed from: a */
    public static final C1866b f3389a = m4075a("sas", "AD_SOURCE");

    /* renamed from: b */
    public static final C1866b f3390b = m4075a("srt", "AD_RENDER_TIME");

    /* renamed from: c */
    public static final C1866b f3391c = m4075a("sft", "AD_FETCH_TIME");

    /* renamed from: d */
    public static final C1866b f3392d = m4075a("sfs", "AD_FETCH_SIZE");

    /* renamed from: e */
    public static final C1866b f3393e = m4075a("sadb", "AD_DOWNLOADED_BYTES");

    /* renamed from: f */
    public static final C1866b f3394f = m4075a("sacb", "AD_CACHED_BYTES");

    /* renamed from: g */
    public static final C1866b f3395g = m4075a("stdl", "TIME_TO_DISPLAY_FROM_LOAD");

    /* renamed from: h */
    public static final C1866b f3396h = m4075a("stdi", "TIME_TO_DISPLAY_FROM_INIT");

    /* renamed from: i */
    public static final C1866b f3397i = m4075a("snas", "AD_NUMBER_IN_SESSION");

    /* renamed from: j */
    public static final C1866b f3398j = m4075a("snat", "AD_NUMBER_TOTAL");

    /* renamed from: k */
    public static final C1866b f3399k = m4075a("stah", "TIME_AD_HIDDEN_FROM_SHOW");

    /* renamed from: l */
    public static final C1866b f3400l = m4075a("stas", "TIME_TO_SKIP_FROM_SHOW");

    /* renamed from: m */
    public static final C1866b f3401m = m4075a("stac", "TIME_TO_CLICK_FROM_SHOW");

    /* renamed from: n */
    public static final C1866b f3402n = m4075a("stbe", "TIME_TO_EXPAND_FROM_SHOW");

    /* renamed from: o */
    public static final C1866b f3403o = m4075a("stbc", "TIME_TO_CONTRACT_FROM_SHOW");

    /* renamed from: p */
    public static final C1866b f3404p = m4075a("saan", "AD_SHOWN_WITH_ACTIVE_NETWORK");

    /* renamed from: q */
    public static final C1866b f3405q = m4075a("suvs", "INTERSTITIAL_USED_VIDEO_STREAM");

    /* renamed from: r */
    public static final C1866b f3406r = m4075a("sugs", "AD_USED_GRAPHIC_STREAM");

    /* renamed from: s */
    public static final C1866b f3407s = m4075a("svpv", "INTERSTITIAL_VIDEO_PERCENT_VIEWED");

    /* renamed from: t */
    public static final C1866b f3408t = m4075a("stpd", "INTERSTITIAL_PAUSED_DURATION");

    /* renamed from: u */
    public static final C1866b f3409u = m4075a("shsc", "HTML_RESOURCE_CACHE_SUCCESS_COUNT");

    /* renamed from: v */
    public static final C1866b f3410v = m4075a("shfc", "HTML_RESOURCE_CACHE_FAILURE_COUNT");

    /* renamed from: w */
    public static final C1866b f3411w = m4075a("schc", "AD_CANCELLED_HTML_CACHING");

    /* renamed from: x */
    public static final C1866b f3412x = m4075a("smwm", "AD_SHOWN_IN_MULTIWINDOW_MODE");

    /* renamed from: y */
    public static final C1866b f3413y = m4075a("vssc", "VIDEO_STREAM_STALLED_COUNT");

    /* renamed from: z */
    public static final C1866b f3414z = m4075a("wvem", "WEB_VIEW_ERROR_MESSAGES");

    /* renamed from: E */
    private final String f3415E;

    /* renamed from: F */
    private final String f3416F;

    static {
        m4075a("sisw", "IS_STREAMING_WEBKIT");
        m4075a("surw", "UNABLE_TO_RETRIEVE_WEBKIT_HTML_STRING");
        m4075a("surp", "UNABLE_TO_PERSIST_WEBKIT_HTML_PLACEMENT_REPLACED_STRING");
        m4075a("swhp", "SUCCESSFULLY_PERSISTED_WEBKIT_HTML_STRING");
        m4075a("skr", "STOREKIT_REDIRECTED");
        m4075a("sklf", "STOREKIT_LOAD_FAILURE");
        m4075a("skps", "STOREKIT_PRELOAD_SKIPPED");
    }

    private C1866b(String str, String str2) {
        this.f3415E = str;
        this.f3416F = str2;
    }

    /* renamed from: a */
    private static C1866b m4075a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No key name specified");
        } else if (f3388G.contains(str)) {
            throw new IllegalArgumentException("Key has already been used: " + str);
        } else if (!TextUtils.isEmpty(str2)) {
            f3388G.add(str);
            return new C1866b(str, str2);
        } else {
            throw new IllegalArgumentException("No debug name specified");
        }
    }
}
