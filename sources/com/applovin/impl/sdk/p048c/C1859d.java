package com.applovin.impl.sdk.p048c;

import com.smaato.sdk.core.gdpr.CmpApiConstants;
import java.util.HashSet;

/* renamed from: com.applovin.impl.sdk.c.d */
public class C1859d<T> {

    /* renamed from: A */
    public static final C1859d<String> f3337A = new C1859d<>("com.applovin.sdk.mediation_provider", String.class);

    /* renamed from: B */
    public static final C1859d<String> f3338B = new C1859d<>("com.applovin.sdk.mediation.test_mode_network", String.class);

    /* renamed from: C */
    public static final C1859d<Boolean> f3339C = new C1859d<>("com.applovin.sdk.mediation.test_mode_enabled", Boolean.class);

    /* renamed from: a */
    public static final C1859d<String> f3340a = new C1859d<>("com.applovin.sdk.impl.isFirstRun", String.class);

    /* renamed from: b */
    public static final C1859d<Boolean> f3341b = new C1859d<>("com.applovin.sdk.launched_before", Boolean.class);

    /* renamed from: c */
    public static final C1859d<String> f3342c = new C1859d<>("com.applovin.sdk.latest_installed_version", String.class);

    /* renamed from: d */
    public static final C1859d<Long> f3343d = new C1859d<>("com.applovin.sdk.install_date", Long.class);

    /* renamed from: e */
    public static final C1859d<String> f3344e = new C1859d<>("com.applovin.sdk.user_id", String.class);

    /* renamed from: f */
    public static final C1859d<String> f3345f = new C1859d<>("com.applovin.sdk.compass_id", String.class);

    /* renamed from: g */
    public static final C1859d<String> f3346g = new C1859d<>("com.applovin.sdk.compass_random_token", String.class);

    /* renamed from: h */
    public static final C1859d<String> f3347h = new C1859d<>("com.applovin.sdk.applovin_random_token", String.class);

    /* renamed from: i */
    public static final C1859d<String> f3348i = new C1859d<>("com.applovin.sdk.device_test_group", String.class);

    /* renamed from: j */
    public static final C1859d<String> f3349j = new C1859d<>("com.applovin.sdk.variables", String.class);

    /* renamed from: k */
    public static final C1859d<Boolean> f3350k = new C1859d<>("com.applovin.sdk.compliance.has_user_consent", Boolean.class);

    /* renamed from: l */
    public static final C1859d<Boolean> f3351l = new C1859d<>("com.applovin.sdk.compliance.is_age_restricted_user", Boolean.class);

    /* renamed from: m */
    public static final C1859d<Boolean> f3352m = new C1859d<>("com.applovin.sdk.compliance.is_do_not_sell", Boolean.class);

    /* renamed from: n */
    public static final C1859d<String> f3353n = new C1859d<>(CmpApiConstants.IABTCF_TC_STRING, String.class);

    /* renamed from: o */
    public static final C1859d<?> f3354o = new C1859d<>(CmpApiConstants.IABTCF_GDPR_APPLIES, Object.class);

    /* renamed from: p */
    public static final C1859d<HashSet> f3355p = new C1859d<>("com.applovin.sdk.impl.postbackQueue.key", HashSet.class);

    /* renamed from: q */
    public static final C1859d<String> f3356q = new C1859d<>("com.applovin.sdk.stats", String.class);

    /* renamed from: r */
    public static final C1859d<HashSet> f3357r = new C1859d<>("com.applovin.sdk.task.stats", HashSet.class);

    /* renamed from: s */
    public static final C1859d<String> f3358s = new C1859d<>("com.applovin.sdk.network_response_code_mapping", String.class);

    /* renamed from: t */
    public static final C1859d<String> f3359t = new C1859d<>("com.applovin.sdk.event_tracking.super_properties", String.class);

    /* renamed from: u */
    public static final C1859d<HashSet> f3360u = new C1859d<>("com.applovin.sdk.ad.stats", HashSet.class);

    /* renamed from: v */
    public static final C1859d<Integer> f3361v = new C1859d<>("com.applovin.sdk.last_video_position", Integer.class);

    /* renamed from: w */
    public static final C1859d<Boolean> f3362w = new C1859d<>("com.applovin.sdk.should_resume_video", Boolean.class);

    /* renamed from: x */
    public static final C1859d<String> f3363x = new C1859d<>("com.applovin.sdk.mediation.signal_providers", String.class);

    /* renamed from: y */
    public static final C1859d<String> f3364y = new C1859d<>("com.applovin.sdk.mediation.auto_init_adapters", String.class);

    /* renamed from: z */
    public static final C1859d<String> f3365z = new C1859d<>("com.applovin.sdk.persisted_data", String.class);

    /* renamed from: D */
    private final String f3366D;

    /* renamed from: E */
    private final Class<T> f3367E;

    public C1859d(String str, Class<T> cls) {
        this.f3366D = str;
        this.f3367E = cls;
    }

    /* renamed from: a */
    public String mo14070a() {
        return this.f3366D;
    }

    /* renamed from: b */
    public Class<T> mo14071b() {
        return this.f3367E;
    }

    public String toString() {
        return "Key{name='" + this.f3366D + '\'' + ", type=" + this.f3367E + '}';
    }
}
