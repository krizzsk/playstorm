package com.bytedance.sdk.openadsdk.core.p155i;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.p091a.p093b.C2603a;
import com.bytedance.sdk.component.adexpress.p091a.p093b.C2605b;
import com.bytedance.sdk.component.adexpress.p091a.p094c.C2616b;
import com.bytedance.sdk.component.utils.C2969i;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2979o;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.component.utils.C2985u;
import com.bytedance.sdk.openadsdk.core.C3524h;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.multipro.C3953b;
import com.bytedance.sdk.openadsdk.multipro.p185d.C3966a;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.smaato.sdk.core.gdpr.CmpApiConstants;
import com.vungle.warren.model.AdvertisementDBAdapter;
import com.vungle.warren.model.Cookie;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.i.f */
/* compiled from: TTSdkSettings */
public class C3537f implements C3531b {

    /* renamed from: a */
    public static String f8806a = null;

    /* renamed from: b */
    public static String f8807b = CmpApiConstants.IABTCF_TC_STRING;

    /* renamed from: c */
    public static String f8808c;

    /* renamed from: d */
    public static String f8809d;

    /* renamed from: e */
    public static String f8810e = (C2984t.m8425a(C3578m.m11231a(), "tt_feedback_thank_text") + "\n" + C2984t.m8425a(C3578m.m11231a(), "tt_feedback_experience_text"));

    /* renamed from: f */
    static ArrayList<String> f8811f;

    /* renamed from: n */
    private static final String f8812n = C4014u.m13251m();

    /* renamed from: p */
    private static final String f8813p = null;

    /* renamed from: q */
    private static final String f8814q = null;

    /* renamed from: r */
    private static final String f8815r = null;

    /* renamed from: A */
    private int f8816A = Integer.MAX_VALUE;

    /* renamed from: B */
    private int f8817B = Integer.MAX_VALUE;

    /* renamed from: C */
    private long f8818C = 0;

    /* renamed from: D */
    private Set<String> f8819D = Collections.synchronizedSet(new HashSet());

    /* renamed from: E */
    private Set<String> f8820E = Collections.synchronizedSet(new HashSet());

    /* renamed from: F */
    private int f8821F = Integer.MAX_VALUE;

    /* renamed from: G */
    private int f8822G = Integer.MAX_VALUE;

    /* renamed from: H */
    private long f8823H = 2147483647L;

    /* renamed from: I */
    private int f8824I = Integer.MAX_VALUE;

    /* renamed from: J */
    private int f8825J = Integer.MAX_VALUE;

    /* renamed from: K */
    private int f8826K = Integer.MAX_VALUE;

    /* renamed from: L */
    private int f8827L = Integer.MAX_VALUE;

    /* renamed from: M */
    private String f8828M;

    /* renamed from: N */
    private String f8829N;

    /* renamed from: O */
    private String f8830O;

    /* renamed from: P */
    private int f8831P = Integer.MAX_VALUE;

    /* renamed from: Q */
    private int f8832Q;

    /* renamed from: R */
    private String f8833R;

    /* renamed from: S */
    private int f8834S = Integer.MAX_VALUE;

    /* renamed from: T */
    private String f8835T;

    /* renamed from: U */
    private int f8836U;

    /* renamed from: V */
    private int f8837V;

    /* renamed from: W */
    private String f8838W = null;

    /* renamed from: X */
    private String f8839X = null;

    /* renamed from: Y */
    private boolean f8840Y = false;

    /* renamed from: Z */
    private String f8841Z = "";

    /* renamed from: aa */
    private int f8842aa = Integer.MAX_VALUE;

    /* renamed from: ab */
    private int f8843ab = Integer.MAX_VALUE;

    /* renamed from: ac */
    private int f8844ac = Integer.MAX_VALUE;

    /* renamed from: ad */
    private int f8845ad = Integer.MAX_VALUE;

    /* renamed from: ae */
    private int f8846ae = Integer.MAX_VALUE;

    /* renamed from: af */
    private int f8847af = Integer.MAX_VALUE;

    /* renamed from: ag */
    private int f8848ag = Integer.MAX_VALUE;

    /* renamed from: ah */
    private int f8849ah = Integer.MAX_VALUE;

    /* renamed from: ai */
    private final Set<String> f8850ai = Collections.synchronizedSet(new HashSet());

    /* renamed from: aj */
    private volatile boolean f8851aj = false;

    /* renamed from: ak */
    private final C2985u f8852ak = C2985u.m8442a("tt_sdk_settings", C3578m.m11231a());

    /* renamed from: al */
    private int f8853al = Integer.MAX_VALUE;

    /* renamed from: am */
    private float f8854am = 2.14748365E9f;

    /* renamed from: an */
    private int f8855an = Integer.MAX_VALUE;

    /* renamed from: ao */
    private int f8856ao = Integer.MAX_VALUE;

    /* renamed from: ap */
    private int f8857ap = 30;

    /* renamed from: g */
    private int f8858g = Integer.MAX_VALUE;

    /* renamed from: h */
    private Map<String, C3530a> f8859h = new HashMap();

    /* renamed from: i */
    private String f8860i;

    /* renamed from: j */
    private String f8861j;

    /* renamed from: k */
    private Set<String> f8862k = new HashSet();

    /* renamed from: l */
    private String f8863l;

    /* renamed from: m */
    private Set<String> f8864m = Collections.synchronizedSet(new HashSet());

    /* renamed from: o */
    private Set<String> f8865o = Collections.synchronizedSet(new HashSet());

    /* renamed from: s */
    private String f8866s;

    /* renamed from: t */
    private int f8867t = Integer.MAX_VALUE;

    /* renamed from: u */
    private int f8868u = Integer.MAX_VALUE;

    /* renamed from: v */
    private String f8869v;

    /* renamed from: w */
    private String f8870w;

    /* renamed from: x */
    private String f8871x;

    /* renamed from: y */
    private String f8872y;

    /* renamed from: z */
    private int f8873z = Integer.MAX_VALUE;

    /* renamed from: a */
    private int m10970a(boolean z) {
        return z ? 20 : 5;
    }

    /* renamed from: k */
    private static boolean m10977k(int i) {
        return i == 1 || i == 2;
    }

    static {
        try {
            f8808c = C2984t.m8425a(C3578m.m11231a(), "tt_txt_skip");
            f8809d = C2984t.m8425a(C3578m.m11231a(), "tt_feedback_submit_text");
            f8811f = new ArrayList<>(Arrays.asList(new String[]{"ja", "en", "ko", "zh", "th", "vi", "id", "ru", "ar", "fr", "de", "it", "es", "hi", "pt", "zh-Hant"}));
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(15:53|54|(1:56)|57|(4:59|60|(2:62|63)|109)|68|(3:72|(2:75|73)|110)|76|(3:80|(2:83|81)|111)|84|(3:86|87|(2:89|(3:91|(2:93|112)(1:113)|94)))|95|96|97|98) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x0594 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo19908a() {
        /*
            r16 = this;
            r1 = r16
            monitor-enter(r16)
            r2 = 1
            r1.f8851aj = r2     // Catch:{ all -> 0x05b6 }
            boolean r3 = com.bytedance.sdk.openadsdk.multipro.C3953b.m12901c()     // Catch:{ all -> 0x05b6 }
            r10 = 3000(0xbb8, float:4.204E-42)
            r11 = 5
            r12 = 3600(0xe10, float:5.045E-42)
            r13 = 50
            r14 = 10000(0x2710, double:4.9407E-320)
            r5 = 30
            r4 = 0
            r6 = 2147483647(0x7fffffff, float:NaN)
            r7 = 0
            if (r3 == 0) goto L_0x02ec
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "xpath"
            java.lang.String r9 = ""
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12977b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8866s = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "duration"
            long r8 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12963a((java.lang.String) r3, (java.lang.String) r8, (long) r14)     // Catch:{ all -> 0x05b6 }
            r1.f8823H = r8     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "max"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12962a((java.lang.String) r3, (java.lang.String) r8, (int) r13)     // Catch:{ all -> 0x05b6 }
            r1.f8824I = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "download_config_dl_network"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12962a((java.lang.String) r3, (java.lang.String) r8, (int) r2)     // Catch:{ all -> 0x05b6 }
            r1.f8867t = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "download_config_dl_size"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12962a((java.lang.String) r3, (java.lang.String) r8, (int) r5)     // Catch:{ all -> 0x05b6 }
            r1.f8868u = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "vbtt"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12962a((java.lang.String) r3, (java.lang.String) r8, (int) r11)     // Catch:{ all -> 0x05b6 }
            r1.f8825J = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "fetch_template"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12962a((java.lang.String) r3, (java.lang.String) r8, (int) r12)     // Catch:{ all -> 0x05b6 }
            r1.f8826K = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "template_ids"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12977b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.f8863l = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "ab_test_version"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12977b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.f8869v = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "ab_test_param"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12977b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.f8870w = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "pyload_h5"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12977b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.f8871x = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "playableLoadH5Url"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12977b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.f8872y = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "splash_load_type"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12962a((java.lang.String) r3, (java.lang.String) r8, (int) r2)     // Catch:{ all -> 0x05b6 }
            r1.f8873z = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "splash_check_type"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12962a((java.lang.String) r3, (java.lang.String) r8, (int) r2)     // Catch:{ all -> 0x05b6 }
            r1.f8816A = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "if_both_open"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12962a((java.lang.String) r3, (java.lang.String) r8, (int) r4)     // Catch:{ all -> 0x05b6 }
            r1.f8821F = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "support_tnc"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12962a((java.lang.String) r3, (java.lang.String) r8, (int) r2)     // Catch:{ all -> 0x05b6 }
            r1.f8822G = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "force_language"
            java.lang.String r9 = ""
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12977b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8841Z = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "fetch_tpl_timeout_ctrl"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12962a((java.lang.String) r3, (java.lang.String) r8, (int) r10)     // Catch:{ all -> 0x05b6 }
            r1.f8842aa = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "disable_rotate_banner_on_dislike"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12962a((java.lang.String) r3, (java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f8855an = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "max_tpl_cnts"
            r9 = 100
            int r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12962a((java.lang.String) r3, (java.lang.String) r8, (int) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8843ab = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "tpl_infos"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12977b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.f8860i = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "insert_js_config"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12977b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.f8861j = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "app_list_control"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12962a((java.lang.String) r3, (java.lang.String) r8, (int) r4)     // Catch:{ all -> 0x05b6 }
            r1.f8817B = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "hit_app_list_time"
            r9 = 0
            long r8 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12963a((java.lang.String) r3, (java.lang.String) r8, (long) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8818C = r8     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "ads_url"
            java.lang.String r9 = f8814q     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12977b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8828M = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "app_log_url"
            java.lang.String r9 = f8813p     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12977b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8829N = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "apm_url"
            java.lang.String r9 = ""
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12977b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8830O = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "coppa"
            r9 = -99
            int r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12962a((java.lang.String) r3, (java.lang.String) r8, (int) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8831P = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "ccpa"
            r9 = -1
            int r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12962a((java.lang.String) r3, (java.lang.String) r8, (int) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8832Q = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.core.h r3 = com.bytedance.sdk.openadsdk.core.C3524h.m10852d()     // Catch:{ all -> 0x05b6 }
            int r8 = r1.f8831P     // Catch:{ all -> 0x05b6 }
            r3.mo19847d((int) r8)     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "policy_url"
            java.lang.String r9 = f8815r     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12977b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8833R = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "consent_url"
            java.lang.String r9 = "https://lf-hs-sg.ibytedtos.com/obj/union-platform-i18n/union_platform_gdpr_607_en.html"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12977b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8835T = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "ivrv_downward"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12962a((java.lang.String) r3, (java.lang.String) r8, (int) r4)     // Catch:{ all -> 0x05b6 }
            r1.f8837V = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "isGdprUser"
            r9 = -1
            int r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12962a((java.lang.String) r3, (java.lang.String) r8, (int) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8834S = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "dyn_draw_engine_url"
            java.lang.String r9 = f8812n     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12977b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8838W = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "dc"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12977b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.f8839X = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "privacy_ad_enable"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12962a((java.lang.String) r3, (java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f8844ac = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "privacy_personalized_ad"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12962a((java.lang.String) r3, (java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f8845ad = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "privacy_sladar_enable"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12962a((java.lang.String) r3, (java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f8846ae = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "privacy_app_log_enable"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12962a((java.lang.String) r3, (java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f8847af = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "privacy_sec_enable"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12962a((java.lang.String) r3, (java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f8848ag = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "privacy_debug_unlock"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12962a((java.lang.String) r3, (java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f8849ah = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "privacy_fields_allowed"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12977b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "tt_sdk_settings"
            java.lang.String r9 = "webview_cache_count"
            r10 = 20
            int r8 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12962a((java.lang.String) r8, (java.lang.String) r9, (int) r10)     // Catch:{ all -> 0x05b6 }
            r1.f8827L = r8     // Catch:{ all -> 0x05b6 }
            java.util.Set<java.lang.String> r8 = r1.f8865o     // Catch:{ all -> 0x05b6 }
            if (r8 == 0) goto L_0x01f4
            java.util.Set<java.lang.String> r8 = r1.f8865o     // Catch:{ all -> 0x05b6 }
            r8.clear()     // Catch:{ all -> 0x05b6 }
        L_0x01f4:
            java.lang.String r8 = "tt_sdk_settings"
            java.lang.String r9 = "gecko_hosts"
            java.util.Set r8 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12978b((java.lang.String) r8, (java.lang.String) r9, (java.util.Set<java.lang.String>) r7)     // Catch:{ all -> 0x05b6 }
            r1.f8865o = r8     // Catch:{ all -> 0x05b6 }
            java.util.Set r8 = r1.mo19925a((java.util.Set<java.lang.String>) r8)     // Catch:{ all -> 0x05b6 }
            r1.f8865o = r8     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "tt_sdk_settings"
            java.lang.String r9 = "global_rate"
            r10 = 1065353216(0x3f800000, float:1.0)
            float r8 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12961a((java.lang.String) r8, (java.lang.String) r9, (float) r10)     // Catch:{ all -> 0x05b6 }
            r1.f8854am = r8     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "tt_sdk_settings"
            java.lang.String r9 = "sp_key_if_sp_cache"
            int r8 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12962a((java.lang.String) r8, (java.lang.String) r9, (int) r4)     // Catch:{ all -> 0x05b6 }
            r1.f8858g = r8     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "tt_sdk_settings"
            java.lang.String r9 = "landingpage_new_style"
            int r6 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12962a((java.lang.String) r8, (java.lang.String) r9, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f8856ao = r6     // Catch:{ all -> 0x05b6 }
            boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x05b6 }
            if (r6 != 0) goto L_0x024c
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0247 }
            r6.<init>(r3)     // Catch:{ JSONException -> 0x0247 }
            int r3 = r6.length()     // Catch:{ JSONException -> 0x0247 }
            java.util.Set<java.lang.String> r8 = r1.f8850ai     // Catch:{ JSONException -> 0x0247 }
            r8.clear()     // Catch:{ JSONException -> 0x0247 }
            r8 = r4
        L_0x0239:
            if (r8 >= r3) goto L_0x024c
            java.util.Set<java.lang.String> r9 = r1.f8850ai     // Catch:{ JSONException -> 0x0247 }
            java.lang.String r10 = r6.getString(r8)     // Catch:{ JSONException -> 0x0247 }
            r9.add(r10)     // Catch:{ JSONException -> 0x0247 }
            int r8 = r8 + 1
            goto L_0x0239
        L_0x0247:
            r0 = move-exception
            r3 = r0
            r3.printStackTrace()     // Catch:{ all -> 0x05b6 }
        L_0x024c:
            java.util.Set<java.lang.String> r3 = r1.f8819D     // Catch:{ all -> 0x05b6 }
            r3.clear()     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r6 = "hit_app_list_data"
            java.util.Set r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12978b((java.lang.String) r3, (java.lang.String) r6, (java.util.Set<java.lang.String>) r7)     // Catch:{ all -> 0x05b6 }
            if (r3 == 0) goto L_0x0277
            boolean r6 = r3.isEmpty()     // Catch:{ all -> 0x05b6 }
            if (r6 != 0) goto L_0x0277
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x05b6 }
        L_0x0265:
            boolean r6 = r3.hasNext()     // Catch:{ all -> 0x05b6 }
            if (r6 == 0) goto L_0x0277
            java.lang.Object r6 = r3.next()     // Catch:{ all -> 0x05b6 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x05b6 }
            java.util.Set<java.lang.String> r8 = r1.f8819D     // Catch:{ all -> 0x05b6 }
            r8.add(r6)     // Catch:{ all -> 0x05b6 }
            goto L_0x0265
        L_0x0277:
            java.util.Set<java.lang.String> r3 = r1.f8820E     // Catch:{ all -> 0x05b6 }
            r3.clear()     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r6 = "scheme_list_data"
            java.util.Set r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12978b((java.lang.String) r3, (java.lang.String) r6, (java.util.Set<java.lang.String>) r7)     // Catch:{ all -> 0x05b6 }
            if (r3 == 0) goto L_0x02a2
            boolean r6 = r3.isEmpty()     // Catch:{ all -> 0x05b6 }
            if (r6 != 0) goto L_0x02a2
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x05b6 }
        L_0x0290:
            boolean r6 = r3.hasNext()     // Catch:{ all -> 0x05b6 }
            if (r6 == 0) goto L_0x02a2
            java.lang.Object r6 = r3.next()     // Catch:{ all -> 0x05b6 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x05b6 }
            java.util.Set<java.lang.String> r8 = r1.f8820E     // Catch:{ all -> 0x05b6 }
            r8.add(r6)     // Catch:{ all -> 0x05b6 }
            goto L_0x0290
        L_0x02a2:
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r6 = "ad_slot_conf"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12977b((java.lang.String) r3, (java.lang.String) r6, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x05b6 }
            if (r6 != 0) goto L_0x02d6
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ Exception -> 0x02d6 }
            r6.<init>(r3)     // Catch:{ Exception -> 0x02d6 }
            int r3 = r6.length()     // Catch:{ Exception -> 0x02d6 }
            if (r3 <= 0) goto L_0x02d6
            java.util.Map<java.lang.String, com.bytedance.sdk.openadsdk.core.i.a> r7 = r1.f8859h     // Catch:{ Exception -> 0x02d6 }
            r7.clear()     // Catch:{ Exception -> 0x02d6 }
        L_0x02c0:
            if (r4 >= r3) goto L_0x02d6
            org.json.JSONObject r7 = r6.optJSONObject(r4)     // Catch:{ Exception -> 0x02d6 }
            com.bytedance.sdk.openadsdk.core.i.a r7 = m10972b((org.json.JSONObject) r7)     // Catch:{ Exception -> 0x02d6 }
            if (r7 == 0) goto L_0x02d3
            java.util.Map<java.lang.String, com.bytedance.sdk.openadsdk.core.i.a> r8 = r1.f8859h     // Catch:{ Exception -> 0x02d6 }
            java.lang.String r9 = r7.f8768a     // Catch:{ Exception -> 0x02d6 }
            r8.put(r9, r7)     // Catch:{ Exception -> 0x02d6 }
        L_0x02d3:
            int r4 = r4 + 1
            goto L_0x02c0
        L_0x02d6:
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r4 = "read_video_from_cache"
            int r2 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12962a((java.lang.String) r3, (java.lang.String) r4, (int) r2)     // Catch:{ all -> 0x05b6 }
            r1.f8853al = r2     // Catch:{ all -> 0x05b6 }
            java.lang.String r2 = "tt_sdk_settings"
            java.lang.String r3 = "blank_detect_rate"
            int r2 = com.bytedance.sdk.openadsdk.multipro.p185d.C3966a.m12962a((java.lang.String) r2, (java.lang.String) r3, (int) r5)     // Catch:{ all -> 0x05b6 }
            r1.f8857ap = r2     // Catch:{ all -> 0x05b6 }
            monitor-exit(r16)
            return
        L_0x02ec:
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "xpath"
            java.lang.String r9 = ""
            java.lang.String r3 = r3.mo17910b((java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8866s = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "duration"
            long r8 = r3.mo17909b((java.lang.String) r8, (long) r14)     // Catch:{ all -> 0x05b6 }
            r1.f8823H = r8     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "max"
            int r3 = r3.mo17908b((java.lang.String) r8, (int) r13)     // Catch:{ all -> 0x05b6 }
            r1.f8824I = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "download_config_dl_network"
            int r3 = r3.mo17908b((java.lang.String) r8, (int) r2)     // Catch:{ all -> 0x05b6 }
            r1.f8867t = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "download_config_dl_size"
            int r3 = r3.mo17908b((java.lang.String) r8, (int) r5)     // Catch:{ all -> 0x05b6 }
            r1.f8868u = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "fetch_template"
            int r3 = r3.mo17908b((java.lang.String) r8, (int) r12)     // Catch:{ all -> 0x05b6 }
            r1.f8826K = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "ab_test_version"
            java.lang.String r3 = r3.mo17899a(r8)     // Catch:{ all -> 0x05b6 }
            r1.f8869v = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "ab_test_param"
            java.lang.String r3 = r3.mo17899a(r8)     // Catch:{ all -> 0x05b6 }
            r1.f8870w = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "vbtt"
            int r3 = r3.mo17908b((java.lang.String) r8, (int) r11)     // Catch:{ all -> 0x05b6 }
            r1.f8825J = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "template_ids"
            java.lang.String r3 = r3.mo17910b((java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.f8863l = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "pyload_h5"
            java.lang.String r3 = r3.mo17910b((java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.f8871x = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "playableLoadH5Url"
            java.lang.String r3 = r3.mo17910b((java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.f8872y = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "splash_load_type"
            int r3 = r3.mo17908b((java.lang.String) r8, (int) r2)     // Catch:{ all -> 0x05b6 }
            r1.f8873z = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "splash_check_type"
            int r3 = r3.mo17908b((java.lang.String) r8, (int) r2)     // Catch:{ all -> 0x05b6 }
            r1.f8816A = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "if_both_open"
            int r3 = r3.mo17908b((java.lang.String) r8, (int) r4)     // Catch:{ all -> 0x05b6 }
            r1.f8821F = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "support_tnc"
            int r3 = r3.mo17908b((java.lang.String) r8, (int) r2)     // Catch:{ all -> 0x05b6 }
            r1.f8822G = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "tpl_infos"
            java.lang.String r3 = r3.mo17910b((java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.f8860i = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "insert_js_config"
            java.lang.String r3 = r3.mo17910b((java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.f8861j = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "app_list_control"
            int r3 = r3.mo17908b((java.lang.String) r8, (int) r4)     // Catch:{ all -> 0x05b6 }
            r1.f8817B = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "force_language"
            java.lang.String r9 = ""
            java.lang.String r3 = r3.mo17910b((java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8841Z = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "fetch_tpl_timeout_ctrl"
            int r3 = r3.mo17908b((java.lang.String) r8, (int) r10)     // Catch:{ all -> 0x05b6 }
            r1.f8842aa = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "disable_rotate_banner_on_dislike"
            int r3 = r3.mo17908b((java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f8855an = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "max_tpl_cnts"
            r9 = 100
            int r3 = r3.mo17908b((java.lang.String) r8, (int) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8843ab = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "hit_app_list_time"
            r9 = 0
            long r8 = r3.mo17909b((java.lang.String) r8, (long) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8818C = r8     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "ads_url"
            java.lang.String r3 = r3.mo17899a(r8)     // Catch:{ all -> 0x05b6 }
            r1.f8828M = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "app_log_url"
            java.lang.String r3 = r3.mo17899a(r8)     // Catch:{ all -> 0x05b6 }
            r1.f8829N = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "apm_url"
            java.lang.String r3 = r3.mo17899a(r8)     // Catch:{ all -> 0x05b6 }
            r1.f8830O = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "coppa"
            r9 = -99
            int r3 = r3.mo17908b((java.lang.String) r8, (int) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8831P = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "ccpa"
            r9 = -1
            int r3 = r3.mo17908b((java.lang.String) r8, (int) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8832Q = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.core.h r3 = com.bytedance.sdk.openadsdk.core.C3524h.m10852d()     // Catch:{ all -> 0x05b6 }
            int r8 = r1.f8831P     // Catch:{ all -> 0x05b6 }
            r3.mo19847d((int) r8)     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "policy_url"
            java.lang.String r9 = f8815r     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = r3.mo17910b((java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8833R = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "consent_url"
            java.lang.String r9 = "https://lf-hs-sg.ibytedtos.com/obj/union-platform-i18n/union_platform_gdpr_607_en.html"
            java.lang.String r3 = r3.mo17910b((java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8835T = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "ivrv_downward"
            int r3 = r3.mo17908b((java.lang.String) r8, (int) r4)     // Catch:{ all -> 0x05b6 }
            r1.f8837V = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "dyn_draw_engine_url"
            java.lang.String r9 = f8812n     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = r3.mo17910b((java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8838W = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "dc"
            java.lang.String r3 = r3.mo17899a(r8)     // Catch:{ all -> 0x05b6 }
            r1.f8839X = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "isGdprUser"
            r9 = -1
            int r3 = r3.mo17908b((java.lang.String) r8, (int) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8834S = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "privacy_ad_enable"
            int r3 = r3.mo17908b((java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f8844ac = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "privacy_personalized_ad"
            int r3 = r3.mo17908b((java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f8845ad = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "privacy_sladar_enable"
            int r3 = r3.mo17908b((java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f8846ae = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "privacy_app_log_enable"
            int r3 = r3.mo17908b((java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f8847af = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "privacy_sec_enable"
            int r3 = r3.mo17908b((java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f8848ag = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "privacy_debug_unlock"
            int r3 = r3.mo17908b((java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f8849ah = r3     // Catch:{ all -> 0x05b6 }
            java.util.Set<java.lang.String> r3 = r1.f8865o     // Catch:{ all -> 0x05b6 }
            if (r3 == 0) goto L_0x04aa
            java.util.Set<java.lang.String> r3 = r1.f8865o     // Catch:{ all -> 0x05b6 }
            r3.clear()     // Catch:{ all -> 0x05b6 }
        L_0x04aa:
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "gecko_hosts"
            java.util.Set r3 = r3.mo17911b((java.lang.String) r8, (java.util.Set<java.lang.String>) r7)     // Catch:{ all -> 0x05b6 }
            r1.f8865o = r3     // Catch:{ all -> 0x05b6 }
            java.util.Set r3 = r1.mo19925a((java.util.Set<java.lang.String>) r3)     // Catch:{ all -> 0x05b6 }
            r1.f8865o = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "global_rate"
            r9 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3.mo17906b((java.lang.String) r8, (float) r9)     // Catch:{ all -> 0x05b6 }
            r1.f8854am = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "sp_key_if_sp_cache"
            int r3 = r3.mo17908b((java.lang.String) r8, (int) r4)     // Catch:{ all -> 0x05b6 }
            r1.f8858g = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "landingpage_new_style"
            int r3 = r3.mo17908b((java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f8856ao = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r6 = "privacy_fields_allowed"
            java.lang.String r3 = r3.mo17910b((java.lang.String) r6, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x05b6 }
            if (r6 != 0) goto L_0x050a
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0505 }
            r6.<init>(r3)     // Catch:{ JSONException -> 0x0505 }
            int r3 = r6.length()     // Catch:{ JSONException -> 0x0505 }
            java.util.Set<java.lang.String> r8 = r1.f8850ai     // Catch:{ JSONException -> 0x0505 }
            r8.clear()     // Catch:{ JSONException -> 0x0505 }
            r8 = r4
        L_0x04f7:
            if (r8 >= r3) goto L_0x050a
            java.util.Set<java.lang.String> r9 = r1.f8850ai     // Catch:{ JSONException -> 0x0505 }
            java.lang.String r10 = r6.getString(r8)     // Catch:{ JSONException -> 0x0505 }
            r9.add(r10)     // Catch:{ JSONException -> 0x0505 }
            int r8 = r8 + 1
            goto L_0x04f7
        L_0x0505:
            r0 = move-exception
            r3 = r0
            r3.printStackTrace()     // Catch:{ all -> 0x05b6 }
        L_0x050a:
            java.util.Set<java.lang.String> r3 = r1.f8819D     // Catch:{ all -> 0x05b6 }
            r3.clear()     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r6 = "hit_app_list_data"
            java.util.Set r3 = r3.mo17911b((java.lang.String) r6, (java.util.Set<java.lang.String>) r7)     // Catch:{ all -> 0x05b6 }
            if (r3 == 0) goto L_0x0535
            boolean r6 = r3.isEmpty()     // Catch:{ all -> 0x05b6 }
            if (r6 != 0) goto L_0x0535
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x05b6 }
        L_0x0523:
            boolean r6 = r3.hasNext()     // Catch:{ all -> 0x05b6 }
            if (r6 == 0) goto L_0x0535
            java.lang.Object r6 = r3.next()     // Catch:{ all -> 0x05b6 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x05b6 }
            java.util.Set<java.lang.String> r8 = r1.f8819D     // Catch:{ all -> 0x05b6 }
            r8.add(r6)     // Catch:{ all -> 0x05b6 }
            goto L_0x0523
        L_0x0535:
            java.util.Set<java.lang.String> r3 = r1.f8820E     // Catch:{ all -> 0x05b6 }
            r3.clear()     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r6 = "scheme_list_data"
            java.util.Set r3 = r3.mo17911b((java.lang.String) r6, (java.util.Set<java.lang.String>) r7)     // Catch:{ all -> 0x05b6 }
            if (r3 == 0) goto L_0x0560
            boolean r6 = r3.isEmpty()     // Catch:{ all -> 0x05b6 }
            if (r6 != 0) goto L_0x0560
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x05b6 }
        L_0x054e:
            boolean r6 = r3.hasNext()     // Catch:{ all -> 0x05b6 }
            if (r6 == 0) goto L_0x0560
            java.lang.Object r6 = r3.next()     // Catch:{ all -> 0x05b6 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x05b6 }
            java.util.Set<java.lang.String> r8 = r1.f8820E     // Catch:{ all -> 0x05b6 }
            r8.add(r6)     // Catch:{ all -> 0x05b6 }
            goto L_0x054e
        L_0x0560:
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r6 = "ad_slot_conf"
            java.lang.String r3 = r3.mo17910b((java.lang.String) r6, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x05b6 }
            if (r6 != 0) goto L_0x0594
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ Exception -> 0x0594 }
            r6.<init>(r3)     // Catch:{ Exception -> 0x0594 }
            int r3 = r6.length()     // Catch:{ Exception -> 0x0594 }
            if (r3 <= 0) goto L_0x0594
            java.util.Map<java.lang.String, com.bytedance.sdk.openadsdk.core.i.a> r7 = r1.f8859h     // Catch:{ Exception -> 0x0594 }
            r7.clear()     // Catch:{ Exception -> 0x0594 }
        L_0x057e:
            if (r4 >= r3) goto L_0x0594
            org.json.JSONObject r7 = r6.optJSONObject(r4)     // Catch:{ Exception -> 0x0594 }
            com.bytedance.sdk.openadsdk.core.i.a r7 = m10972b((org.json.JSONObject) r7)     // Catch:{ Exception -> 0x0594 }
            if (r7 == 0) goto L_0x0591
            java.util.Map<java.lang.String, com.bytedance.sdk.openadsdk.core.i.a> r8 = r1.f8859h     // Catch:{ Exception -> 0x0594 }
            java.lang.String r9 = r7.f8768a     // Catch:{ Exception -> 0x0594 }
            r8.put(r9, r7)     // Catch:{ Exception -> 0x0594 }
        L_0x0591:
            int r4 = r4 + 1
            goto L_0x057e
        L_0x0594:
            com.bytedance.sdk.component.utils.u r3 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r4 = "read_video_from_cache"
            int r2 = r3.mo17908b((java.lang.String) r4, (int) r2)     // Catch:{ all -> 0x05b6 }
            r1.f8853al = r2     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r2 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "webview_cache_count"
            r4 = 20
            int r2 = r2.mo17908b((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x05b6 }
            r1.f8827L = r2     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r2 = r1.f8852ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "blank_detect_rate"
            int r2 = r2.mo17908b((java.lang.String) r3, (int) r5)     // Catch:{ all -> 0x05b6 }
            r1.f8857ap = r2     // Catch:{ all -> 0x05b6 }
            monitor-exit(r16)
            return
        L_0x05b6:
            r0 = move-exception
            r2 = r0
            monitor-exit(r16)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p155i.C3537f.mo19908a():void");
    }

    /* renamed from: b */
    private static C3530a m10972b(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2 == null) {
            return null;
        }
        String optString = jSONObject2.optString("code_id");
        int optInt = jSONObject2.optInt("auto_play", 1);
        int optInt2 = jSONObject2.optInt("voice_control", 1);
        int optInt3 = jSONObject2.optInt("rv_preload", 2);
        int optInt4 = jSONObject2.optInt("nv_preload", 1);
        int optInt5 = jSONObject2.optInt("proportion_watching", 100);
        int optInt6 = jSONObject2.optInt("skip_time_displayed", 0);
        int optInt7 = jSONObject2.optInt("video_skip_result", 2);
        int optInt8 = jSONObject2.optInt("reg_creative_control", 1);
        int optInt9 = jSONObject2.optInt("play_bar_show_time", 3);
        int optInt10 = jSONObject2.optInt("rv_skip_time", -1);
        int optInt11 = jSONObject2.optInt("voice_control", 2);
        int optInt12 = jSONObject2.optInt("if_show_win", 1);
        int optInt13 = jSONObject2.optInt("sp_preload", 2);
        int optInt14 = jSONObject2.optInt("stop_time", 1500);
        int optInt15 = jSONObject2.optInt("native_playable_delay", 2);
        int optInt16 = jSONObject2.optInt("time_out_control", -1);
        int optInt17 = jSONObject2.optInt("playable_close_time", -1);
        int optInt18 = jSONObject2.optInt("playable_reward_type", 0);
        int optInt19 = jSONObject2.optInt("reward_is_callback", 0);
        int optInt20 = jSONObject2.optInt("iv_skip_time", 5);
        JSONArray optJSONArray = jSONObject2.optJSONArray("parent_tpl_ids");
        int i = optInt20;
        int optInt21 = jSONObject2.optInt("slot_type", 2);
        boolean optBoolean = jSONObject2.optBoolean("close_on_click", false);
        int optInt22 = jSONObject2.optInt("allow_system_back", 0);
        int optInt23 = jSONObject2.optInt("splash_skip_time", 0);
        int optInt24 = jSONObject2.optInt("splash_image_count_down_time", 5);
        if (!m10977k(optInt2)) {
            optInt2 = 1;
        }
        return C3530a.m10917a().mo19882a(optString).mo19894k(optInt).mo19895l(optInt2).mo19896m(optInt3).mo19897n(optInt4).mo19898o(optInt5).mo19899p(optInt6).mo19900q(optInt7).mo19901r(optInt8).mo19893j(optInt9).mo19892i(optInt10).mo19891h(!m10977k(optInt11) ? 1 : optInt11).mo19902s(optInt12).mo19888e(optInt13).mo19889f(optInt14).mo19890g(optInt15).mo19887d(optInt16).mo19885b(optInt18).mo19886c(optInt19).mo19881a(optInt17).mo19903t(optInt21).mo19904u(i).mo19883a(optJSONArray).mo19884a(optBoolean).mo19905v(optInt22).mo19906w(optInt23).mo19907x(optInt24);
    }

    /* renamed from: b */
    public int mo19928b() {
        if (this.f8843ab == Integer.MAX_VALUE) {
            if (C3953b.m12901c()) {
                this.f8843ab = C3966a.m12962a("tt_sdk_settings", "max_tpl_cnts", 100);
            } else {
                this.f8843ab = this.f8852ak.mo17908b("max_tpl_cnts", 100);
            }
        }
        return this.f8843ab;
    }

    /* renamed from: a */
    public void mo19909a(JSONObject jSONObject) {
        String str;
        this.f8856ao = jSONObject.optInt("lp_new_style", Integer.MAX_VALUE);
        int optInt = jSONObject.optInt("blank_detect_rate", 30);
        this.f8857ap = optInt;
        if (optInt < 0 || optInt > 100) {
            this.f8857ap = 30;
        }
        this.f8866s = jSONObject.optString("xpath");
        JSONObject optJSONObject = jSONObject.optJSONObject("feq_policy");
        if (optJSONObject != null) {
            this.f8823H = optJSONObject.optLong("duration") * 1000;
            this.f8824I = optJSONObject.optInt("max");
        }
        this.f8825J = jSONObject.optInt("vbtt", 5);
        this.f8826K = jSONObject.optInt("fetch_tpl_interval", 3600);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("abtest");
        if (optJSONObject2 != null) {
            this.f8869v = optJSONObject2.optString("version");
            this.f8870w = optJSONObject2.optString("param");
        } else {
            m10969J();
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("log_rate_conf");
        if (optJSONObject3 != null) {
            this.f8854am = (float) optJSONObject3.optDouble("global_rate", 1.0d);
        }
        this.f8871x = jSONObject.optString("pyload_h5");
        this.f8872y = jSONObject.optString("pure_pyload_h5");
        this.f8828M = jSONObject.optString("ads_url");
        this.f8829N = jSONObject.optString("app_log_url");
        this.f8830O = jSONObject.optString("apm_url");
        this.f8831P = jSONObject.optInt(Cookie.COPPA_KEY, -99);
        this.f8832Q = jSONObject.optInt("ccpa", -1);
        C3524h.m10852d().mo19847d(this.f8831P);
        this.f8833R = jSONObject.optString("privacy_url", f8815r);
        this.f8835T = jSONObject.optString("consent_url", "https://lf-hs-sg.ibytedtos.com/obj/union-platform-i18n/union_platform_gdpr_607_en.html");
        this.f8836U = jSONObject.optInt("network_module", 1);
        this.f8837V = jSONObject.optInt("ivrv_downward", 0);
        this.f8839X = jSONObject.optString("dc");
        m10973c(jSONObject);
        m10974d(jSONObject);
        this.f8873z = m10975e(jSONObject);
        C2975l.m8391e("splashLoad", "setting-》mSplashLoadType=" + this.f8873z);
        this.f8816A = m10976f(jSONObject);
        C2975l.m8391e("splashLoad", "setting-》mSplashCheckType=" + this.f8816A);
        this.f8821F = jSONObject.optInt("if_both_open", 0);
        this.f8822G = jSONObject.optInt("support_tnc", 1);
        this.f8861j = jSONObject.optString("insert_js_config", "");
        this.f8817B = jSONObject.optInt(CampaignEx.JSON_KEY_AD_AL, 0);
        this.f8843ab = jSONObject.optInt("max_tpl_cnts", 100);
        JSONObject optJSONObject4 = jSONObject.optJSONObject("app_common_config");
        if (optJSONObject4 != null) {
            this.f8841Z = optJSONObject4.optString("force_language");
            this.f8842aa = optJSONObject4.optInt("fetch_tpl_timeout_ctrl", 3000);
            this.f8855an = optJSONObject4.optInt("disable_rotate_banner_on_dislike", Integer.MAX_VALUE);
            this.f8858g = optJSONObject4.optInt("if_sp_cache", 0);
            this.f8827L = optJSONObject4.optInt("webview_cache_count", 20);
            try {
                this.f8865o.clear();
                JSONArray optJSONArray = optJSONObject4.optJSONArray("gecko_hosts");
                if (!(optJSONArray == null || optJSONArray.length() == 0)) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        this.f8865o.add(optJSONArray.getString(i));
                    }
                }
                this.f8865o = mo19925a(this.f8865o);
            } catch (Throwable th) {
                C2975l.m8383b("GeckoLog: settings json error " + th);
            }
        }
        this.f8818C = System.currentTimeMillis();
        this.f8819D.clear();
        JSONArray optJSONArray2 = jSONObject.optJSONArray("spam_app_list");
        if (optJSONArray2 != null) {
            int length = optJSONArray2.length();
            for (int i2 = 0; i2 < length; i2++) {
                String optString = optJSONArray2.optString(i2);
                if (!TextUtils.isEmpty(optString)) {
                    this.f8819D.add(optString);
                }
            }
        }
        this.f8820E.clear();
        JSONArray optJSONArray3 = jSONObject.optJSONArray("scheme_check_list");
        if (optJSONArray3 != null) {
            int length2 = optJSONArray3.length();
            for (int i3 = 0; i3 < length2; i3++) {
                String optString2 = optJSONArray3.optString(i3);
                if (!TextUtils.isEmpty(optString2)) {
                    this.f8820E.add(optString2);
                }
            }
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("download_config");
        if (optJSONObject5 != null) {
            this.f8867t = optJSONObject5.optInt("dl_network", 1);
            this.f8868u = optJSONObject5.optInt("dl_size", 30);
        }
        this.f8853al = jSONObject.optInt("read_video_from_cache", 1);
        JSONArray optJSONArray4 = jSONObject.optJSONArray("ad_slot_conf_list");
        if (optJSONArray4 != null) {
            str = optJSONArray4.toString();
            int length3 = optJSONArray4.length();
            if (length3 > 0) {
                this.f8859h.clear();
                for (int i4 = 0; i4 < length3; i4++) {
                    C3530a b = m10972b(optJSONArray4.optJSONObject(i4));
                    if (b != null) {
                        this.f8859h.put(b.f8768a, b);
                    }
                }
            }
        } else {
            str = null;
        }
        JSONObject optJSONObject6 = jSONObject.optJSONObject("privacy");
        if (optJSONObject6 != null) {
            this.f8844ac = optJSONObject6.optInt("ad_enable", Integer.MAX_VALUE);
            this.f8845ad = optJSONObject6.optInt("personalized_ad", Integer.MAX_VALUE);
            this.f8846ae = optJSONObject6.optInt("sladar_enable", Integer.MAX_VALUE);
            this.f8847af = optJSONObject6.optInt("app_log_enable", Integer.MAX_VALUE);
            this.f8848ag = optJSONObject6.optInt("sec_enable", Integer.MAX_VALUE);
            this.f8849ah = optJSONObject6.optInt("debug_unlock", Integer.MAX_VALUE);
            String optString3 = optJSONObject6.optString("fields_allowed", "");
            if (!TextUtils.isEmpty(optString3)) {
                try {
                    JSONArray jSONArray = new JSONArray(optString3);
                    int length4 = jSONArray.length();
                    this.f8850ai.clear();
                    for (int i5 = 0; i5 < length4; i5++) {
                        this.f8850ai.add(jSONArray.getString(i5));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else {
                this.f8850ai.clear();
            }
        } else {
            this.f8844ac = Integer.MAX_VALUE;
            this.f8845ad = Integer.MAX_VALUE;
            this.f8846ae = Integer.MAX_VALUE;
            this.f8847af = Integer.MAX_VALUE;
            this.f8848ag = Integer.MAX_VALUE;
            this.f8849ah = Integer.MAX_VALUE;
            this.f8850ai.clear();
        }
        m10971a(str, (String) null);
        mo19926a((Boolean) true);
        this.f8840Y = true;
    }

    /* renamed from: J */
    private void m10969J() {
        this.f8870w = null;
        this.f8869v = null;
        if (C3953b.m12901c()) {
            C3966a.m12979b("tt_sdk_settings", "ab_test_version");
            C3966a.m12979b("tt_sdk_settings", "ab_test_param");
            return;
        }
        this.f8852ak.mo17913c("ab_test_version");
        this.f8852ak.mo17913c("ab_test_param");
    }

    /* renamed from: c */
    private void m10973c(JSONObject jSONObject) {
        String str;
        if (jSONObject != null) {
            if (C3953b.m12901c()) {
                str = C3966a.m12977b("tt_sdk_settings", "dyn_draw_engine_url", f8812n);
            } else {
                str = this.f8852ak.mo17910b("dyn_draw_engine_url", f8812n);
            }
            this.f8838W = jSONObject.optString("dyn_draw_engine_url", f8812n);
            C2975l.m8391e("TemplateManager", "settinng---TTDynamic.init().....oldDynDrawEngineUrl=" + str);
            C2975l.m8391e("TemplateManager", "settinng---TTDynamic.init().....newmDynDrawEngineUrl=" + this.f8838W);
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.f8838W) && !this.f8838W.equals(str)) {
                C2975l.m8384b("TemplateManager", "Reinitialize the template TTDynamic.init().....");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                C2605b.m6649a().mo16654g();
                C2605b.m6649a().mo16650b(false);
                C2603a.m6643b();
                C2605b.m6649a().mo16649b();
            }
        }
    }

    /* renamed from: a */
    public int mo19923a(String str) {
        if (str == null) {
            return 0;
        }
        return C3578m.m11241h().mo19962n(String.valueOf(str)).f8785r;
    }

    /* renamed from: d */
    private void m10974d(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("is_gdpr_user", -1);
        this.f8834S = optInt;
        if (optInt != -1 && optInt != 1 && optInt != 0) {
            this.f8834S = -1;
        }
    }

    /* renamed from: e */
    private int m10975e(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("splash_load_type", 1);
        this.f8873z = optInt;
        if (optInt == 0 || optInt == 1 || optInt == 2 || optInt == 3) {
            return this.f8873z;
        }
        return 1;
    }

    /* renamed from: f */
    private int m10976f(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("splash_check_type", 1);
        this.f8816A = optInt;
        if (optInt == 0 || optInt == 1) {
            return this.f8816A;
        }
        return 1;
    }

    /* renamed from: a */
    private void m10971a(String str, String str2) {
        String str3 = str;
        String str4 = "scheme_list_data";
        String str5 = "hit_app_list_data";
        String str6 = "hit_app_list_time";
        String str7 = "disable_rotate_banner_on_dislike";
        String str8 = "fetch_tpl_timeout_ctrl";
        String str9 = "max_tpl_cnts";
        String str10 = "app_list_control";
        if (C3953b.m12901c()) {
            String str11 = "privacy_fields_allowed";
            C3966a.m12971a("tt_sdk_settings", "xpath", this.f8866s);
            C3966a.m12970a("tt_sdk_settings", "duration", Long.valueOf(this.f8823H));
            C3966a.m12969a("tt_sdk_settings", "max", Integer.valueOf(this.f8824I));
            C3966a.m12969a("tt_sdk_settings", "download_config_dl_network", Integer.valueOf(this.f8867t));
            C3966a.m12969a("tt_sdk_settings", "download_config_dl_size", Integer.valueOf(this.f8868u));
            C3966a.m12969a("tt_sdk_settings", "vbtt", Integer.valueOf(this.f8825J));
            C3966a.m12969a("tt_sdk_settings", "fetch_template", Integer.valueOf(this.f8826K));
            C3966a.m12969a("tt_sdk_settings", "splash_load_type", Integer.valueOf(this.f8873z));
            C3966a.m12969a("tt_sdk_settings", "splash_check_type", Integer.valueOf(this.f8816A));
            C3966a.m12969a("tt_sdk_settings", "if_both_open", Integer.valueOf(this.f8821F));
            C3966a.m12969a("tt_sdk_settings", "support_tnc", Integer.valueOf(this.f8822G));
            C3966a.m12971a("tt_sdk_settings", "insert_js_config", this.f8861j);
            C3966a.m12971a("tt_sdk_settings", "pyload_h5", this.f8871x);
            C3966a.m12971a("tt_sdk_settings", "playableLoadH5Url", this.f8872y);
            C3966a.m12969a("tt_sdk_settings", str10, Integer.valueOf(this.f8817B));
            C3966a.m12969a("tt_sdk_settings", str9, Integer.valueOf(this.f8843ab));
            C3966a.m12969a("tt_sdk_settings", str8, Integer.valueOf(this.f8842aa));
            C3966a.m12969a("tt_sdk_settings", str7, Integer.valueOf(this.f8855an));
            C3966a.m12970a("tt_sdk_settings", str6, Long.valueOf(this.f8818C));
            C3966a.m12972a("tt_sdk_settings", str5, this.f8819D);
            C3966a.m12972a("tt_sdk_settings", str4, this.f8820E);
            C3966a.m12971a("tt_sdk_settings", "ads_url", this.f8828M);
            C3966a.m12971a("tt_sdk_settings", "app_log_url", this.f8829N);
            C3966a.m12971a("tt_sdk_settings", "apm_url", this.f8830O);
            C3966a.m12969a("tt_sdk_settings", Cookie.COPPA_KEY, Integer.valueOf(this.f8831P));
            C3966a.m12969a("tt_sdk_settings", "ccpa", Integer.valueOf(this.f8832Q));
            C3966a.m12971a("tt_sdk_settings", "policy_url", this.f8833R);
            C3966a.m12971a("tt_sdk_settings", "consent_url", this.f8835T);
            C3966a.m12969a("tt_sdk_settings", "ivrv_downward", Integer.valueOf(this.f8837V));
            C3966a.m12971a("tt_sdk_settings", "dyn_draw_engine_url", this.f8838W);
            C3966a.m12971a("tt_sdk_settings", "dc", this.f8839X);
            C3966a.m12969a("tt_sdk_settings", "isGdprUser", Integer.valueOf(this.f8834S));
            C3966a.m12969a("tt_sdk_settings", "sp_key_if_sp_cache", Integer.valueOf(this.f8858g));
            C3966a.m12969a("tt_sdk_settings", "landingpage_new_style", Integer.valueOf(this.f8856ao));
            if (!TextUtils.isEmpty(this.f8841Z) && f8811f.contains(this.f8841Z)) {
                C3966a.m12971a("tt_sdk_settings", "force_language", this.f8841Z);
            }
            String str12 = this.f8869v;
            if (str12 != null) {
                C3966a.m12971a("tt_sdk_settings", "ab_test_version", str12);
            }
            String str13 = this.f8870w;
            if (str13 != null) {
                C3966a.m12971a("tt_sdk_settings", "ab_test_param", str13);
            }
            if (!TextUtils.isEmpty(str)) {
                C3966a.m12971a("tt_sdk_settings", "ad_slot_conf", str);
            }
            if (!TextUtils.isEmpty(this.f8863l)) {
                C3966a.m12971a("tt_sdk_settings", "template_ids", this.f8863l);
            }
            if (!TextUtils.isEmpty(this.f8860i)) {
                C3966a.m12971a("tt_sdk_settings", "tpl_infos", this.f8860i);
            }
            C3966a.m12969a("tt_sdk_settings", "privacy_ad_enable", Integer.valueOf(this.f8844ac));
            C3966a.m12969a("tt_sdk_settings", "privacy_personalized_ad", Integer.valueOf(this.f8845ad));
            C3966a.m12969a("tt_sdk_settings", "privacy_sladar_enable", Integer.valueOf(this.f8846ae));
            C3966a.m12969a("tt_sdk_settings", "privacy_app_log_enable", Integer.valueOf(this.f8847af));
            C3966a.m12969a("tt_sdk_settings", "privacy_sec_enable", Integer.valueOf(this.f8848ag));
            C3966a.m12969a("tt_sdk_settings", "privacy_debug_unlock", Integer.valueOf(this.f8849ah));
            C3966a.m12972a("tt_sdk_settings", "gecko_hosts", this.f8865o);
            if (this.f8850ai.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (String put : this.f8850ai) {
                    jSONArray.put(put);
                }
                C3966a.m12971a("tt_sdk_settings", str11, jSONArray.toString());
            } else {
                C3966a.m12971a("tt_sdk_settings", str11, "");
            }
            C3966a.m12969a("tt_sdk_settings", "read_video_from_cache", Integer.valueOf(this.f8853al));
            C3966a.m12968a("tt_sdk_settings", "global_rate", Float.valueOf(this.f8854am));
            C3966a.m12969a("tt_sdk_settings", "webview_cache_count", Integer.valueOf(this.f8827L));
            C3966a.m12969a("tt_sdk_settings", "blank_detect_rate", Integer.valueOf(this.f8857ap));
            return;
        }
        String str14 = "privacy_fields_allowed";
        String str15 = str10;
        this.f8852ak.mo17903a("xpath", this.f8866s);
        this.f8852ak.mo17902a("duration", this.f8823H);
        this.f8852ak.mo17901a("max", this.f8824I);
        this.f8852ak.mo17901a("download_config_dl_network", this.f8867t);
        this.f8852ak.mo17901a("download_config_dl_size", this.f8868u);
        this.f8852ak.mo17901a("fetch_template", this.f8826K);
        this.f8852ak.mo17903a("pyload_h5", this.f8871x);
        this.f8852ak.mo17903a("insert_js_config", this.f8861j);
        this.f8852ak.mo17903a("playableLoadH5Url", this.f8872y);
        this.f8852ak.mo17901a("splash_load_type", this.f8873z);
        this.f8852ak.mo17901a("splash_check_type", this.f8816A);
        this.f8852ak.mo17901a("if_both_open", this.f8821F);
        this.f8852ak.mo17901a("support_tnc", this.f8822G);
        this.f8852ak.mo17901a(str10, this.f8817B);
        this.f8852ak.mo17901a(str9, this.f8843ab);
        this.f8852ak.mo17901a(str8, this.f8842aa);
        this.f8852ak.mo17901a(str7, this.f8855an);
        this.f8852ak.mo17902a(str6, this.f8818C);
        this.f8852ak.mo17904a(str5, this.f8819D);
        this.f8852ak.mo17904a(str4, this.f8820E);
        this.f8852ak.mo17903a("ads_url", this.f8828M);
        this.f8852ak.mo17903a("app_log_url", this.f8829N);
        this.f8852ak.mo17903a("apm_url", this.f8830O);
        this.f8852ak.mo17901a(Cookie.COPPA_KEY, this.f8831P);
        this.f8852ak.mo17901a("ccpa", this.f8832Q);
        this.f8852ak.mo17903a("policy_url", this.f8833R);
        this.f8852ak.mo17903a("consent_url", this.f8835T);
        this.f8852ak.mo17901a("ivrv_downward", this.f8837V);
        this.f8852ak.mo17903a("dyn_draw_engine_url", this.f8838W);
        this.f8852ak.mo17903a("dc", this.f8839X);
        this.f8852ak.mo17901a("isGdprUser", this.f8834S);
        this.f8852ak.mo17901a("sp_key_if_sp_cache", this.f8858g);
        this.f8852ak.mo17901a("landingpage_new_style", this.f8856ao);
        if (!TextUtils.isEmpty(this.f8841Z) && f8811f.contains(this.f8841Z)) {
            this.f8852ak.mo17903a("force_language", this.f8841Z);
        }
        String str16 = this.f8869v;
        if (str16 != null) {
            this.f8852ak.mo17903a("ab_test_version", str16);
        }
        String str17 = this.f8870w;
        if (str17 != null) {
            this.f8852ak.mo17903a("ab_test_param", str17);
        }
        this.f8852ak.mo17901a("vbtt", this.f8825J);
        if (!TextUtils.isEmpty(str)) {
            this.f8852ak.mo17903a("ad_slot_conf", str);
        }
        if (!TextUtils.isEmpty(this.f8863l)) {
            this.f8852ak.mo17903a("template_ids", this.f8863l);
        }
        if (!TextUtils.isEmpty(this.f8860i)) {
            this.f8852ak.mo17903a("tpl_infos", this.f8860i);
        }
        this.f8852ak.mo17901a("privacy_ad_enable", this.f8844ac);
        this.f8852ak.mo17901a("privacy_personalized_ad", this.f8845ad);
        this.f8852ak.mo17901a("privacy_sladar_enable", this.f8846ae);
        this.f8852ak.mo17901a("privacy_app_log_enable", this.f8847af);
        this.f8852ak.mo17901a("privacy_sec_enable", this.f8848ag);
        this.f8852ak.mo17901a("privacy_debug_unlock", this.f8849ah);
        this.f8852ak.mo17904a("gecko_hosts", this.f8865o);
        if (this.f8850ai.size() > 0) {
            JSONArray jSONArray2 = new JSONArray();
            for (String put2 : this.f8850ai) {
                jSONArray2.put(put2);
            }
            this.f8852ak.mo17903a(str14, jSONArray2.toString());
        } else {
            this.f8852ak.mo17903a(str14, "");
        }
        this.f8852ak.mo17901a("read_video_from_cache", this.f8853al);
        this.f8852ak.mo17900a("global_rate", this.f8854am);
        this.f8852ak.mo17901a("webview_cache_count", this.f8827L);
        this.f8852ak.mo17901a("blank_detect_rate", this.f8857ap);
    }

    /* renamed from: c */
    public boolean mo19932c() {
        if (this.f8821F == Integer.MAX_VALUE) {
            if (C3953b.m12901c()) {
                this.f8821F = C3966a.m12962a("tt_sdk_settings", "if_both_open", 0);
            } else {
                this.f8821F = this.f8852ak.mo17908b("if_both_open", 0);
            }
        }
        if (this.f8821F == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo19935d() {
        if (this.f8822G == Integer.MAX_VALUE) {
            if (C3953b.m12901c()) {
                this.f8822G = C3966a.m12962a("tt_sdk_settings", "support_tnc", 1);
            } else {
                this.f8822G = this.f8852ak.mo17908b("support_tnc", 1);
            }
        }
        if (this.f8822G == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public String mo19939e() {
        if (this.f8869v == null) {
            if (C3953b.m12901c()) {
                this.f8869v = C3966a.m12977b("tt_sdk_settings", "ab_test_version", (String) null);
            } else {
                this.f8869v = this.f8852ak.mo17899a("ab_test_version");
            }
        }
        return this.f8869v;
    }

    /* renamed from: f */
    public String mo19942f() {
        if (this.f8870w == null) {
            if (C3953b.m12901c()) {
                this.f8870w = C3966a.m12977b("tt_sdk_settings", "ab_test_param", (String) null);
            } else {
                this.f8870w = this.f8852ak.mo17899a("ab_test_param");
            }
        }
        return this.f8870w;
    }

    /* renamed from: g */
    public boolean mo19944g() {
        if (this.f8856ao == Integer.MAX_VALUE) {
            if (C3953b.m12901c()) {
                this.f8856ao = C3966a.m12962a("tt_sdk_settings", "landingpage_new_style", -1);
            } else {
                this.f8856ao = this.f8852ak.mo17907b("landingpage_new_style");
            }
        }
        return this.f8856ao == 1;
    }

    /* renamed from: h */
    public long mo19947h() {
        if (this.f8823H == 2147483647L) {
            if (C3953b.m12901c()) {
                this.f8823H = C3966a.m12963a("tt_sdk_settings", "duration", 10000);
            } else {
                this.f8823H = this.f8852ak.mo17909b("duration", 10000);
            }
        }
        return this.f8823H;
    }

    /* renamed from: i */
    public int mo19949i() {
        if (this.f8824I == Integer.MAX_VALUE) {
            if (C3953b.m12901c()) {
                this.f8824I = C3966a.m12962a("tt_sdk_settings", "max", 50);
            } else {
                this.f8824I = this.f8852ak.mo17908b("max", 50);
            }
        }
        return this.f8824I;
    }

    /* renamed from: j */
    public String mo19954j() {
        if (TextUtils.isEmpty(this.f8871x)) {
            if (C3953b.m12901c()) {
                this.f8871x = C3966a.m12977b("tt_sdk_settings", "pyload_h5", (String) null);
            } else {
                this.f8871x = this.f8852ak.mo17910b("pyload_h5", (String) null);
            }
        }
        return this.f8871x;
    }

    /* renamed from: k */
    public C3532c mo19956k() {
        if (TextUtils.isEmpty(this.f8861j)) {
            if (C3953b.m12901c()) {
                this.f8861j = C3966a.m12977b("tt_sdk_settings", "insert_js_config", (String) null);
            } else {
                this.f8861j = this.f8852ak.mo17910b("insert_js_config", (String) null);
            }
        }
        return new C3532c(this.f8861j);
    }

    /* renamed from: l */
    public String mo19957l() {
        if (TextUtils.isEmpty(this.f8872y)) {
            if (C3953b.m12901c()) {
                this.f8872y = C3966a.m12977b("tt_sdk_settings", "playableLoadH5Url", (String) null);
            } else {
                this.f8872y = this.f8852ak.mo17910b("playableLoadH5Url", (String) null);
            }
        }
        return this.f8872y;
    }

    /* renamed from: m */
    public int mo19959m() {
        if (this.f8842aa == Integer.MAX_VALUE) {
            if (C3953b.m12901c()) {
                this.f8842aa = C3966a.m12962a("tt_sdk_settings", "fetch_tpl_timeout_ctrl", 3000);
            } else {
                this.f8842aa = this.f8852ak.mo17908b("fetch_tpl_timeout_ctrl", 3000);
            }
        }
        if (this.f8842aa <= 0) {
            this.f8842aa = 3000;
        }
        return this.f8842aa;
    }

    /* renamed from: a */
    public void mo19926a(Boolean bool) {
        if (Build.VERSION.SDK_INT >= 17) {
            if (bool.booleanValue() && (TextUtils.isEmpty(this.f8841Z) || !f8811f.contains(this.f8841Z))) {
                if (C3953b.m12901c()) {
                    this.f8841Z = C3966a.m12977b("tt_sdk_settings", "force_language", "");
                } else {
                    this.f8841Z = this.f8852ak.mo17910b("force_language", "");
                }
            }
            if (!TextUtils.isEmpty(this.f8841Z)) {
                if (this.f8841Z.equals("zh-Hant")) {
                    C2969i.m8368a(C3578m.m11231a(), "zh", "tw");
                } else {
                    C2969i.m8368a(C3578m.m11231a(), this.f8841Z, (String) null);
                }
                try {
                    f8808c = C2984t.m8425a(C3578m.m11231a(), "tt_txt_skip");
                    f8809d = C2984t.m8425a(C3578m.m11231a(), "tt_feedback_submit_text");
                    f8810e = C2984t.m8425a(C3578m.m11231a(), "tt_feedback_thank_text") + "\n" + C2984t.m8425a(C3578m.m11231a(), "tt_feedback_experience_text");
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: n */
    public int mo19961n() {
        if (this.f8855an == Integer.MAX_VALUE) {
            if (C3953b.m12901c()) {
                this.f8855an = C3966a.m12962a("tt_sdk_settings", "disable_rotate_banner_on_dislike", Integer.MAX_VALUE);
            } else {
                this.f8855an = this.f8852ak.mo17908b("disable_rotate_banner_on_dislike", Integer.MAX_VALUE);
            }
        }
        return this.f8855an;
    }

    /* renamed from: a */
    public boolean mo19927a(int i) {
        return mo19962n(String.valueOf(i)).f8770c == 1;
    }

    /* renamed from: b */
    public boolean mo19930b(String str) {
        int i = C3578m.m11241h().mo19962n(String.valueOf(str)).f8772e;
        if (i == 1) {
            return C2979o.m8410d(C3578m.m11231a());
        }
        if (i != 2) {
            return false;
        }
        if (C2979o.m8409c(C3578m.m11231a()) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo19933c(String str) {
        return mo19962n(String.valueOf(str)).f8774g == 1;
    }

    /* renamed from: d */
    public boolean mo19936d(String str) {
        if (str == null || C3578m.m11241h().mo19962n(String.valueOf(str)).f8780m == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public int mo19938e(String str) {
        if (str == null) {
            return 1500;
        }
        return C3578m.m11241h().mo19962n(String.valueOf(str)).f8782o;
    }

    /* renamed from: f */
    public int mo19941f(String str) {
        return C3578m.m11241h().mo19962n(String.valueOf(str)).f8778k;
    }

    /* renamed from: g */
    public JSONArray mo19943g(String str) {
        try {
            Set<String> b = C2603a.m6642b(str);
            if (b != null) {
                if (b.size() != 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (String a : b) {
                        C2616b a2 = C2603a.m6637a(a);
                        if (a2 != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("id", a2.mo16693b());
                            jSONObject.put(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_MD5, a2.mo16695c());
                            jSONArray.put(jSONObject);
                        }
                    }
                    return jSONArray;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: h */
    public boolean mo19948h(String str) {
        try {
            C3530a n = C3578m.m11241h().mo19962n(String.valueOf(str));
            return (n == null || n.f8789v == null) ? false : true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: i */
    public boolean mo19951i(String str) {
        try {
            C3530a n = C3578m.m11241h().mo19962n(String.valueOf(str));
            return n != null && n.f8790w == 8;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: o */
    public boolean mo19964o() {
        return this.f8840Y;
    }

    /* renamed from: j */
    public int mo19953j(String str) {
        return mo19962n(String.valueOf(str)).f8775h;
    }

    /* renamed from: k */
    public int mo19955k(String str) {
        return mo19962n(str).f8777j;
    }

    /* renamed from: a */
    public int mo19924a(String str, boolean z) {
        if (str == null) {
            return m10970a(z);
        }
        C3530a n = C3578m.m11241h().mo19962n(str);
        return n.f8791x != -1 ? n.f8791x : m10970a(z);
    }

    /* renamed from: l */
    public boolean mo19958l(String str) {
        return mo19962n(String.valueOf(str)).f8788u == 0;
    }

    /* renamed from: b */
    public boolean mo19929b(int i) {
        if (i == 0 || C3578m.m11241h().mo19962n(String.valueOf(i)).f8779l == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public String mo19965p() {
        if (TextUtils.isEmpty(this.f8828M)) {
            if (C3953b.m12901c()) {
                this.f8828M = C3966a.m12977b("tt_sdk_settings", "ads_url", f8814q);
            } else {
                this.f8828M = this.f8852ak.mo17910b("ads_url", f8814q);
            }
            if (TextUtils.isEmpty(this.f8828M)) {
                this.f8828M = f8814q;
            }
        }
        return this.f8828M;
    }

    /* renamed from: q */
    public String mo19967q() {
        if (TextUtils.isEmpty(this.f8829N)) {
            if (C3953b.m12901c()) {
                this.f8829N = C3966a.m12977b("tt_sdk_settings", "app_log_url", f8813p);
            } else {
                this.f8829N = this.f8852ak.mo17899a("app_log_url");
            }
            if (TextUtils.isEmpty(this.f8829N)) {
                this.f8829N = f8813p;
            }
        }
        return this.f8829N;
    }

    /* renamed from: r */
    public String mo19968r() {
        if (TextUtils.isEmpty(this.f8830O)) {
            if (C3953b.m12901c()) {
                this.f8830O = C3966a.m12977b("tt_sdk_settings", "apm_url", "");
            } else {
                this.f8830O = this.f8852ak.mo17910b("apm_url", "");
            }
        }
        return this.f8830O;
    }

    /* renamed from: s */
    public String mo19969s() {
        if (TextUtils.isEmpty(this.f8833R)) {
            if (C3953b.m12901c()) {
                this.f8833R = C3966a.m12977b("tt_sdk_settings", "policy_url", f8815r);
            } else {
                this.f8833R = this.f8852ak.mo17910b("policy_url", f8815r);
            }
        }
        return this.f8833R;
    }

    /* renamed from: t */
    public String mo19970t() {
        if (TextUtils.isEmpty(this.f8835T)) {
            if (C3953b.m12901c()) {
                this.f8835T = C3966a.m12977b("tt_sdk_settings", "consent_url", "https://lf-hs-sg.ibytedtos.com/obj/union-platform-i18n/union_platform_gdpr_607_en.html");
            } else {
                this.f8835T = this.f8852ak.mo17910b("consent_url", "https://lf-hs-sg.ibytedtos.com/obj/union-platform-i18n/union_platform_gdpr_607_en.html");
            }
        }
        return this.f8835T;
    }

    /* renamed from: u */
    public int mo19971u() {
        if (this.f8837V == 0) {
            if (C3953b.m12901c()) {
                this.f8837V = C3966a.m12962a("tt_sdk_settings", "ivrv_downward", 0);
            } else {
                this.f8837V = this.f8852ak.mo17908b("ivrv_downward", 0);
            }
        }
        return this.f8837V;
    }

    /* renamed from: v */
    public String mo19972v() {
        if (TextUtils.isEmpty(this.f8838W)) {
            if (C3953b.m12901c()) {
                this.f8838W = C3966a.m12977b("tt_sdk_settings", "dyn_draw_engine_url", f8812n);
            } else {
                this.f8838W = this.f8852ak.mo17910b("dyn_draw_engine_url", f8812n);
            }
        }
        return this.f8838W;
    }

    /* renamed from: w */
    public String mo19973w() {
        if (TextUtils.isEmpty(this.f8839X)) {
            if (C3953b.m12901c()) {
                this.f8839X = C3966a.m12977b("tt_sdk_settings", "dc", (String) null);
            } else {
                this.f8839X = this.f8852ak.mo17899a("dc");
            }
        }
        return this.f8839X;
    }

    /* renamed from: x */
    public int mo19974x() {
        if (this.f8834S == Integer.MAX_VALUE) {
            if (C3953b.m12901c()) {
                this.f8834S = C3966a.m12962a("tt_sdk_settings", "isGdprUser", -1);
            } else {
                this.f8834S = this.f8852ak.mo17908b("isGdprUser", -1);
            }
        }
        return this.f8834S;
    }

    /* renamed from: c */
    public int mo19931c(int i) {
        return mo19962n(String.valueOf(i)).f8769b;
    }

    /* renamed from: d */
    public int mo19934d(int i) {
        return mo19962n(String.valueOf(i)).f8776i;
    }

    /* renamed from: y */
    public int mo19975y() {
        if (this.f8825J == Integer.MAX_VALUE) {
            if (C3953b.m12901c()) {
                this.f8825J = C3966a.m12962a("tt_sdk_settings", "vbtt", 5);
            } else {
                this.f8825J = this.f8852ak.mo17908b("vbtt", 5);
            }
        }
        return this.f8825J;
    }

    /* renamed from: e */
    public int mo19937e(int i) {
        return mo19962n(String.valueOf(i)).f8786s;
    }

    /* renamed from: f */
    public int mo19940f(int i) {
        return mo19962n(String.valueOf(i)).f8778k;
    }

    /* renamed from: g */
    public boolean mo19945g(int i) {
        return mo19962n(String.valueOf(i)).f8787t;
    }

    /* renamed from: h */
    public int mo19946h(int i) {
        return mo19962n(String.valueOf(i)).f8792y;
    }

    /* renamed from: i */
    public int mo19950i(int i) {
        return mo19962n(String.valueOf(i)).f8793z;
    }

    /* renamed from: j */
    public int mo19952j(int i) {
        return mo19962n(String.valueOf(i)).f8767A;
    }

    /* renamed from: m */
    public boolean mo19960m(String str) {
        if (str != null && C3578m.m11241h().mo19962n(str).f8781n == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public C3530a mo19962n(String str) {
        C3530a aVar = this.f8859h.get(str);
        return aVar == null ? m10978q(str) : aVar;
    }

    /* renamed from: q */
    private C3530a m10978q(String str) {
        return C3530a.m10917a().mo19882a(str).mo19894k(1).mo19895l(this.f8862k.contains(str) ^ true ? 1 : 0).mo19896m(2).mo19897n(1).mo19898o(100).mo19899p(0).mo19901r(1).mo19893j(3).mo19892i(-1).mo19891h(1).mo19902s(1).mo19887d(-1).mo19881a(-1).mo19903t(2).mo19904u(5).mo19883a((JSONArray) null).mo19884a(false).mo19905v(0).mo19906w(0).mo19907x(5);
    }

    /* renamed from: o */
    public void mo19963o(String str) {
        this.f8862k.add(str);
    }

    /* renamed from: z */
    public boolean mo19976z() {
        if (this.f8844ac == Integer.MAX_VALUE) {
            if (C3953b.m12901c()) {
                this.f8844ac = C3966a.m12962a("tt_sdk_settings", "privacy_ad_enable", Integer.MAX_VALUE);
            } else {
                this.f8844ac = this.f8852ak.mo17908b("privacy_ad_enable", Integer.MAX_VALUE);
            }
        }
        int i = this.f8844ac;
        if (i == 1) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        int o = C4014u.m13257o();
        return o == 1 || o == 2 || o == 3;
    }

    /* renamed from: A */
    public int mo19914A() {
        if (this.f8845ad == Integer.MAX_VALUE) {
            if (C3953b.m12901c()) {
                this.f8845ad = C3966a.m12962a("tt_sdk_settings", "privacy_personalized_ad", Integer.MAX_VALUE);
            } else {
                this.f8845ad = this.f8852ak.mo17908b("privacy_personalized_ad", Integer.MAX_VALUE);
            }
        }
        int i = this.f8845ad;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int o = C4014u.m13257o();
        if (o == 1 || o == 2) {
            return 2;
        }
        return o != 3 ? 0 : 1;
    }

    /* renamed from: B */
    public boolean mo19915B() {
        if (this.f8846ae == Integer.MAX_VALUE) {
            if (C3953b.m12901c()) {
                this.f8846ae = C3966a.m12962a("tt_sdk_settings", "privacy_sladar_enable", Integer.MAX_VALUE);
            } else {
                this.f8846ae = this.f8852ak.mo17908b("privacy_sladar_enable", Integer.MAX_VALUE);
            }
        }
        return this.f8846ae == 1;
    }

    /* renamed from: C */
    public boolean mo19916C() {
        if (this.f8848ag == Integer.MAX_VALUE) {
            if (C3953b.m12901c()) {
                this.f8848ag = C3966a.m12962a("tt_sdk_settings", "privacy_sec_enable", Integer.MAX_VALUE);
            } else {
                this.f8848ag = this.f8852ak.mo17908b("privacy_sec_enable", Integer.MAX_VALUE);
            }
        }
        if ("VA".equalsIgnoreCase(mo19973w()) || C4014u.m13257o() == 3) {
            return false;
        }
        int i = this.f8848ag;
        if (i == 1) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        int o = C4014u.m13257o();
        if (o == 1 || o == 2 || o == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: D */
    public boolean mo19917D() {
        if (this.f8849ah == Integer.MAX_VALUE) {
            if (C3953b.m12901c()) {
                this.f8849ah = C3966a.m12962a("tt_sdk_settings", "privacy_debug_unlock", Integer.MAX_VALUE);
            } else {
                this.f8849ah = this.f8852ak.mo17908b("privacy_debug_unlock", Integer.MAX_VALUE);
            }
        }
        return this.f8849ah != 0;
    }

    /* renamed from: p */
    public boolean mo19966p(String str) {
        if (this.f8850ai.size() != 0) {
            return this.f8850ai.contains(str);
        }
        int o = C4014u.m13257o();
        if (o != 1) {
            if (o == 2) {
                return "mcc".equals(str) || "mnc".equals(str);
            }
            if (o != 3) {
                return false;
            }
            return "mcc".equals(str) || "mnc".equals(str);
        }
    }

    /* renamed from: a */
    public Set<String> mo19925a(Set<String> set) {
        if (set == null) {
            try {
                return new HashSet();
            } catch (Throwable unused) {
                return new HashSet();
            }
        } else {
            HashSet hashSet = new HashSet();
            for (String next : set) {
                if (!TextUtils.isEmpty(next)) {
                    hashSet.add(next);
                }
            }
            return hashSet;
        }
    }

    /* renamed from: E */
    public boolean mo19918E() {
        return this.f8851aj;
    }

    /* renamed from: F */
    public boolean mo19919F() {
        if (this.f8854am == 2.14748365E9f) {
            if (C3953b.m12901c()) {
                this.f8854am = C3966a.m12961a("tt_sdk_settings", "global_rate", 1.0f);
            } else {
                this.f8854am = this.f8852ak.mo17906b("global_rate", 1.0f);
            }
        }
        return this.f8854am == 1.0f;
    }

    /* renamed from: G */
    public boolean mo19920G() {
        if (this.f8853al == Integer.MAX_VALUE) {
            if (C3953b.m12901c()) {
                this.f8853al = C3966a.m12962a("tt_sdk_settings", "read_video_from_cache", 1);
            } else {
                this.f8853al = this.f8852ak.mo17908b("read_video_from_cache", 1);
            }
        }
        if (this.f8853al == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public int mo19921H() {
        if (this.f8827L == Integer.MAX_VALUE) {
            if (C3953b.m12901c()) {
                this.f8827L = C3966a.m12962a("tt_sdk_settings", "webview_cache_count", 20);
            } else {
                this.f8827L = this.f8852ak.mo17908b("webview_cache_count", 20);
            }
        }
        int i = this.f8827L;
        if (i < 0) {
            return 20;
        }
        return i;
    }

    /* renamed from: I */
    public int mo19922I() {
        return this.f8857ap;
    }
}
