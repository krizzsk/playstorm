package com.applovin.impl.sdk.p046ad;

import android.graphics.Point;
import android.graphics.PointF;
import android.net.Uri;
import com.applovin.impl.adview.C1525i;
import com.applovin.impl.adview.C1553s;
import com.applovin.impl.adview.C1557v;
import com.applovin.impl.sdk.C1821ab;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p045a.C1790b;
import com.applovin.impl.sdk.p047b.C1854c;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.p049d.C1865a;
import com.applovin.impl.sdk.utils.C2039g;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.ad.e */
public abstract class C1829e extends AppLovinAdImpl {

    /* renamed from: a */
    private final List<Uri> f2942a = CollectionUtils.synchronizedList();

    /* renamed from: b */
    private final AtomicBoolean f2943b = new AtomicBoolean();

    /* renamed from: c */
    private final AtomicBoolean f2944c = new AtomicBoolean();

    /* renamed from: d */
    private final AtomicReference<C1854c> f2945d = new AtomicReference<>();

    /* renamed from: e */
    private List<C1865a> f2946e;

    /* renamed from: f */
    private List<C1865a> f2947f;

    /* renamed from: g */
    private List<C1865a> f2948g;

    /* renamed from: h */
    private List<C1865a> f2949h;

    /* renamed from: i */
    private C1833c f2950i;

    /* renamed from: com.applovin.impl.sdk.ad.e$a */
    public enum C1831a {
        UNSPECIFIED,
        DISMISS,
        DO_NOT_DISMISS
    }

    /* renamed from: com.applovin.impl.sdk.ad.e$b */
    public enum C1832b {
        DEFAULT,
        ACTIVITY_PORTRAIT,
        ACTIVITY_LANDSCAPE
    }

    /* renamed from: com.applovin.impl.sdk.ad.e$c */
    public class C1833c {

        /* renamed from: a */
        public final int f2959a;

        /* renamed from: b */
        public final int f2960b;

        /* renamed from: c */
        public final int f2961c;

        /* renamed from: d */
        public final int f2962d;

        /* renamed from: e */
        public final int f2963e;

        private C1833c() {
            this.f2959a = AppLovinSdkUtils.dpToPx(C1829e.this.sdk.mo14297L(), C1829e.this.mo13962Y());
            this.f2960b = AppLovinSdkUtils.dpToPx(C1829e.this.sdk.mo14297L(), C1829e.this.mo13963Z());
            this.f2961c = AppLovinSdkUtils.dpToPx(C1829e.this.sdk.mo14297L(), C1829e.this.mo13981aa());
            this.f2962d = AppLovinSdkUtils.dpToPx(C1829e.this.sdk.mo14297L(), ((Integer) C1829e.this.sdk.mo14311a(C1857b.f3130bG)).intValue());
            this.f2963e = AppLovinSdkUtils.dpToPx(C1829e.this.sdk.mo14297L(), ((Integer) C1829e.this.sdk.mo14311a(C1857b.f3129bF)).intValue());
        }
    }

    /* renamed from: com.applovin.impl.sdk.ad.e$d */
    public enum C1834d {
        RESIZE_ASPECT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT
    }

    public C1829e(JSONObject jSONObject, JSONObject jSONObject2, C1825b bVar, C1959m mVar) {
        super(jSONObject, jSONObject2, bVar, mVar);
    }

    /* renamed from: b */
    private C1525i.C1526a m3862b(boolean z) {
        return z ? C1525i.C1526a.WHITE_ON_TRANSPARENT : C1525i.C1526a.WHITE_ON_BLACK;
    }

    /* renamed from: b */
    private String m3864b(PointF pointF, boolean z) {
        String stringFromAdObject = getStringFromAdObject("click_tracking_url", (String) null);
        Map<String, String> c = m3868c(pointF, z);
        if (stringFromAdObject != null) {
            return StringUtils.replace(stringFromAdObject, c);
        }
        return null;
    }

    /* renamed from: b */
    private List<Integer> mo12621b() {
        return getIntegerListFromAdObject("multi_close_style", (List<Integer>) null);
    }

    /* renamed from: c */
    private String mo12622c() {
        String stringFromAdObject = getStringFromAdObject("video_end_url", (String) null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace(Utils.MACRO_CLCODE, getClCode());
        }
        return null;
    }

    /* renamed from: c */
    private Map<String, String> m3868c(PointF pointF, boolean z) {
        Point a = C2039g.m4880a(this.sdk.mo14297L());
        HashMap hashMap = new HashMap(5);
        hashMap.put(Utils.MACRO_CLCODE, getClCode());
        hashMap.put(Utils.MACRO_CLICK_X, String.valueOf(pointF.x));
        hashMap.put(Utils.MACRO_CLICK_Y, String.valueOf(pointF.y));
        hashMap.put(Utils.MACRO_SCREEN_WIDTH, String.valueOf(a.x));
        hashMap.put(Utils.MACRO_SCREEN_HEIGHT, String.valueOf(a.y));
        hashMap.put(Utils.MACRO_IS_VIDEO_CLICK, String.valueOf(z));
        return hashMap;
    }

    /* renamed from: A */
    public List<Uri> mo13939A() {
        return this.f2942a;
    }

    /* renamed from: B */
    public String mo13940B() {
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("video_button_properties", (JSONObject) null);
        return jsonObjectFromAdObject != null ? JsonUtils.getString(jsonObjectFromAdObject, "video_button_html", "") : "";
    }

    /* renamed from: C */
    public C1553s mo13941C() {
        return new C1553s(getJsonObjectFromAdObject("video_button_properties", (JSONObject) null), this.sdk);
    }

    /* renamed from: D */
    public boolean mo12608D() {
        return getBooleanFromAdObject("video_clickable", false);
    }

    /* renamed from: E */
    public boolean mo13942E() {
        return getBooleanFromAdObject("lock_current_orientation", false);
    }

    /* renamed from: F */
    public C1831a mo13943F() {
        String stringFromAdObject = getStringFromAdObject("poststitial_dismiss_type", (String) null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            if (TapjoyConstants.TJC_FULLSCREEN_AD_DISMISS_URL.equalsIgnoreCase(stringFromAdObject)) {
                return C1831a.DISMISS;
            }
            if ("no_dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return C1831a.DO_NOT_DISMISS;
            }
        }
        return C1831a.UNSPECIFIED;
    }

    /* renamed from: G */
    public List<String> mo13944G() {
        String stringFromAdObject = getStringFromAdObject("required_html_resources", (String) null);
        return stringFromAdObject != null ? CollectionUtils.explode(stringFromAdObject) : Collections.emptyList();
    }

    /* renamed from: H */
    public List<String> mo13945H() {
        String stringFromAdObject = getStringFromAdObject("resource_cache_prefix", (String) null);
        return stringFromAdObject != null ? CollectionUtils.explode(stringFromAdObject) : this.sdk.mo14344b(C1857b.f3165bp);
    }

    /* renamed from: I */
    public boolean mo13946I() {
        return getBooleanFromAdObject("sruifwvc", false);
    }

    /* renamed from: J */
    public boolean mo13947J() {
        return getBooleanFromAdObject("recognize_interaction_as_click", false);
    }

    /* renamed from: K */
    public boolean mo13948K() {
        return getBooleanFromAdObject("require_interaction_for_click", false);
    }

    /* renamed from: L */
    public String mo13949L() {
        return getStringFromAdObject("cache_prefix", (String) null);
    }

    /* renamed from: M */
    public boolean mo13950M() {
        return getBooleanFromAdObject("sscomt", false);
    }

    /* renamed from: N */
    public String mo13951N() {
        return getStringFromFullResponse("event_id", (String) null);
    }

    /* renamed from: O */
    public boolean mo13952O() {
        return getBooleanFromAdObject("progress_bar_enabled", false);
    }

    /* renamed from: P */
    public int mo13953P() {
        return getColorFromAdObject("progress_bar_color", -922746881);
    }

    /* renamed from: Q */
    public int mo13954Q() {
        int videoCompletionPercent;
        synchronized (this.adObjectLock) {
            videoCompletionPercent = Utils.getVideoCompletionPercent(this.adObject);
        }
        return videoCompletionPercent;
    }

    /* renamed from: R */
    public int mo13955R() {
        synchronized (this.adObjectLock) {
            int i = JsonUtils.getInt(this.adObject, "graphic_completion_percent", -1);
            if (i < 0 || i > 100) {
                return 90;
            }
            return i;
        }
    }

    /* renamed from: S */
    public int mo13956S() {
        return getIntFromAdObject("poststitial_shown_forward_delay_millis", -1);
    }

    /* renamed from: T */
    public int mo13957T() {
        return getIntFromAdObject("poststitial_dismiss_forward_delay_millis", -1);
    }

    /* renamed from: U */
    public boolean mo13958U() {
        return getBooleanFromAdObject("should_apply_mute_setting_to_poststitial", false);
    }

    /* renamed from: V */
    public boolean mo13959V() {
        return getBooleanFromAdObject("should_forward_close_button_tapped_to_poststitial", false);
    }

    /* renamed from: W */
    public boolean mo13960W() {
        return getBooleanFromAdObject("forward_lifecycle_events_to_webview", false);
    }

    /* renamed from: X */
    public C1833c mo13961X() {
        if (this.f2950i == null) {
            this.f2950i = new C1833c();
        }
        return this.f2950i;
    }

    /* renamed from: Y */
    public int mo13962Y() {
        return getIntFromAdObject("close_button_size", ((Integer) this.sdk.mo14311a(C1857b.f3211cj)).intValue());
    }

    /* renamed from: Z */
    public int mo13963Z() {
        return getIntFromAdObject("close_button_top_margin", ((Integer) this.sdk.mo14311a(C1857b.f3212ck)).intValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1525i.C1526a mo13964a(int i) {
        return i == 1 ? C1525i.C1526a.WHITE_ON_TRANSPARENT : i == 2 ? C1525i.C1526a.INVISIBLE : i == 3 ? C1525i.C1526a.TRANSPARENT_SKIP : C1525i.C1526a.WHITE_ON_BLACK;
    }

    /* renamed from: a */
    public List<C1865a> mo13965a(PointF pointF) {
        List<C1865a> postbacks;
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("video_click_tracking_urls", this.adObject, m3868c(pointF, true), (String) null, mo14000au(), mo14018y(), this.sdk);
        }
        return postbacks.isEmpty() ? mo13966a(pointF, true) : postbacks;
    }

    /* renamed from: a */
    public List<C1865a> mo13966a(PointF pointF, boolean z) {
        List<C1865a> postbacks;
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("click_tracking_urls", this.adObject, m3868c(pointF, z), m3864b(pointF, z), mo14000au(), mo14018y(), this.sdk);
        }
        return postbacks;
    }

    /* renamed from: a */
    public abstract void mo12611a();

    /* renamed from: a */
    public void mo13967a(C1854c cVar) {
        this.f2945d.set(cVar);
    }

    /* renamed from: a */
    public void mo13968a(boolean z) {
        try {
            synchronized (this.adObjectLock) {
                this.adObject.put("html_resources_cached", z);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: aA */
    public List<String> mo13969aA() {
        return CollectionUtils.explode(getStringFromAdObject("wls", ""));
    }

    /* renamed from: aB */
    public List<String> mo13970aB() {
        return CollectionUtils.explode(getStringFromAdObject("wlh", (String) null));
    }

    /* renamed from: aC */
    public Uri mo13971aC() {
        String stringFromAdObject = getStringFromAdObject("mute_image", (String) null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    /* renamed from: aD */
    public Uri mo13972aD() {
        String stringFromAdObject = getStringFromAdObject("unmute_image", "");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    /* renamed from: aE */
    public boolean mo13973aE() {
        return this.f2944c.get();
    }

    /* renamed from: aF */
    public void mo13974aF() {
        this.f2944c.set(true);
    }

    /* renamed from: aG */
    public C1854c mo13975aG() {
        return this.f2945d.getAndSet((Object) null);
    }

    /* renamed from: aH */
    public boolean mo13976aH() {
        String str = this.sdk.mo14363p().getExtraParameters().get("should_use_exoplayer_if_available");
        return StringUtils.isValidString(str) ? Boolean.parseBoolean(str) : getBooleanFromAdObject("suep", false);
    }

    /* renamed from: aI */
    public boolean mo13977aI() {
        return getBooleanFromAdObject("rwvbv", false);
    }

    /* renamed from: aJ */
    public boolean mo13978aJ() {
        return getBooleanFromAdObject("upiosp", false);
    }

    /* renamed from: aK */
    public boolean mo13979aK() {
        return getBooleanFromAdObject("web_video", false);
    }

    /* renamed from: aL */
    public C1834d mo13980aL() {
        String stringFromAdObject = getStringFromAdObject("video_gravity", (String) null);
        return "top".equals(stringFromAdObject) ? C1834d.TOP : TJAdUnitConstants.String.BOTTOM.equals(stringFromAdObject) ? C1834d.BOTTOM : "left".equals(stringFromAdObject) ? C1834d.LEFT : "right".equals(stringFromAdObject) ? C1834d.RIGHT : C1834d.RESIZE_ASPECT;
    }

    /* renamed from: aa */
    public int mo13981aa() {
        return getIntFromAdObject("close_button_horizontal_margin", ((Integer) this.sdk.mo14311a(C1857b.f3210ci)).intValue());
    }

    /* renamed from: ab */
    public boolean mo13982ab() {
        return getBooleanFromAdObject("lhs_close_button", (Boolean) this.sdk.mo14311a(C1857b.f3209ch));
    }

    /* renamed from: ac */
    public boolean mo13983ac() {
        return getBooleanFromAdObject("lhs_skip_button", (Boolean) this.sdk.mo14311a(C1857b.f3216co));
    }

    /* renamed from: ad */
    public long mo13984ad() {
        long longFromAdObject = getLongFromAdObject("report_reward_duration", -1);
        if (longFromAdObject >= 0) {
            return TimeUnit.SECONDS.toMillis(longFromAdObject);
        }
        return -1;
    }

    /* renamed from: ae */
    public int mo13985ae() {
        return getIntFromAdObject("report_reward_percent", -1);
    }

    /* renamed from: af */
    public boolean mo13986af() {
        return getBooleanFromAdObject("report_reward_percent_include_close_delay", true);
    }

    /* renamed from: ag */
    public AtomicBoolean mo13987ag() {
        return this.f2943b;
    }

    /* renamed from: ah */
    public boolean mo13988ah() {
        return getBooleanFromAdObject("show_nia", false);
    }

    /* renamed from: ai */
    public String mo13989ai() {
        return getStringFromAdObject("nia_title", "");
    }

    /* renamed from: aj */
    public String mo13990aj() {
        return getStringFromAdObject("nia_message", "");
    }

    /* renamed from: ak */
    public String mo13991ak() {
        return getStringFromAdObject("nia_button_title", "");
    }

    /* renamed from: al */
    public boolean mo13992al() {
        return getBooleanFromAdObject("avoms", false);
    }

    /* renamed from: am */
    public boolean mo13993am() {
        return getBooleanFromAdObject("show_rewarded_interstitial_overlay_alert", Boolean.valueOf(AppLovinAdType.AUTO_INCENTIVIZED == getType()));
    }

    /* renamed from: an */
    public String mo13994an() {
        return getStringFromAdObject("text_rewarded_inter_alert_title", "Watch a video to earn a reward!");
    }

    /* renamed from: ao */
    public String mo13995ao() {
        return getStringFromAdObject("text_rewarded_inter_alert_body", "");
    }

    /* renamed from: ap */
    public String mo13996ap() {
        return getStringFromAdObject("text_rewarded_inter_alert_ok_action", "OK!");
    }

    /* renamed from: aq */
    public List<C1865a> mo13997aq() {
        List<C1865a> postbacks;
        List<C1865a> list = this.f2946e;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("video_end_urls", this.adObject, getClCode(), mo12622c(), this.sdk);
            this.f2946e = postbacks;
        }
        return postbacks;
    }

    /* renamed from: ar */
    public List<C1865a> mo13998ar() {
        List<C1865a> postbacks;
        List<C1865a> list = this.f2947f;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("ad_closed_urls", this.adObject, getClCode(), (String) null, this.sdk);
            this.f2947f = postbacks;
        }
        return postbacks;
    }

    /* renamed from: as */
    public List<C1865a> mo13999as() {
        List<C1865a> postbacks;
        List<C1865a> list = this.f2948g;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("app_killed_urls", this.adObject, getClCode(), (String) null, this.sdk);
            this.f2948g = postbacks;
        }
        return postbacks;
    }

    /* renamed from: at */
    public List<C1865a> mo12620at() {
        List<C1865a> postbacks;
        List<C1865a> list = this.f2949h;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("imp_urls", this.adObject, getClCode(), (Map<String, String>) null, (String) null, mo14000au(), mo14018y(), this.sdk);
            this.f2949h = postbacks;
        }
        return postbacks;
    }

    /* renamed from: au */
    public Map<String, String> mo14000au() {
        HashMap hashMap = new HashMap();
        if (getBooleanFromAdObject("use_webview_ua_for_postbacks", false)) {
            hashMap.put("User-Agent", C1821ab.m3814a());
        }
        return hashMap;
    }

    /* renamed from: av */
    public boolean mo14001av() {
        return getBooleanFromAdObject("playback_requires_user_action", true);
    }

    /* renamed from: aw */
    public String mo14002aw() {
        String stringFromAdObject = getStringFromAdObject("base_url", "/");
        if ("null".equalsIgnoreCase(stringFromAdObject)) {
            return null;
        }
        return stringFromAdObject;
    }

    /* renamed from: ax */
    public boolean mo14003ax() {
        return getBooleanFromAdObject("web_contents_debugging_enabled", false);
    }

    /* renamed from: ay */
    public C1557v mo14004ay() {
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("web_view_settings", (JSONObject) null);
        if (jsonObjectFromAdObject != null) {
            return new C1557v(jsonObjectFromAdObject);
        }
        return null;
    }

    /* renamed from: az */
    public int mo14005az() {
        return getIntFromAdObject("whalt", Utils.isBML(getSize()) ? 1 : ((Boolean) this.sdk.mo14311a(C1857b.f3291eL)).booleanValue() ? 0 : -1);
    }

    /* renamed from: b */
    public void mo14006b(Uri uri) {
        this.f2942a.add(uri);
    }

    /* renamed from: c */
    public void mo14007c(Uri uri) {
        synchronized (this.adObjectLock) {
            JsonUtils.putObject(this.adObject, "mute_image", uri);
        }
    }

    /* renamed from: d */
    public abstract String mo12623d();

    /* renamed from: d */
    public void mo14008d(Uri uri) {
        synchronized (this.adObjectLock) {
            JsonUtils.putObject(this.adObject, "unmute_image", uri);
        }
    }

    /* renamed from: f */
    public boolean mo12626f() {
        if (!C2092v.m5047a()) {
            return false;
        }
        this.sdk.mo14286A().mo14793e("DirectAd", "Attempting to invoke isVideoStream() from base ad class");
        return false;
    }

    public String getOpenMeasurementContentUrl() {
        return getStringFromAdObject("omid_content_url", (String) null);
    }

    public String getOpenMeasurementCustomReferenceData() {
        return getStringFromAdObject("omid_custom_ref_data", "");
    }

    public List<VerificationScriptResource> getOpenMeasurementVerificationScriptResources() {
        return Collections.emptyList();
    }

    /* renamed from: h */
    public Uri mo12630h() {
        if (!C2092v.m5047a()) {
            return null;
        }
        this.sdk.mo14286A().mo14793e("DirectAd", "Attempting to invoke getVideoUri() from base ad class");
        return null;
    }

    public abstract boolean isOpenMeasurementEnabled();

    /* renamed from: j */
    public Uri mo12635j() {
        if (!C2092v.m5047a()) {
            return null;
        }
        this.sdk.mo14286A().mo14793e("DirectAd", "Attempting to invoke getClickDestinationUri() from base ad class");
        return null;
    }

    /* renamed from: k */
    public Uri mo12636k() {
        if (!C2092v.m5047a()) {
            return null;
        }
        this.sdk.mo14286A().mo14793e("DirectAd", "Attempting to invoke getVideoClickDestinationUri() from base ad class");
        return null;
    }

    /* renamed from: o */
    public abstract C1790b mo12640o();

    /* renamed from: p */
    public C1832b mo14009p() {
        String upperCase = getStringFromAdObject("ad_target", C1832b.DEFAULT.toString()).toUpperCase(Locale.ENGLISH);
        return "ACTIVITY_PORTRAIT".equalsIgnoreCase(upperCase) ? C1832b.ACTIVITY_PORTRAIT : "ACTIVITY_LANDSCAPE".equalsIgnoreCase(upperCase) ? C1832b.ACTIVITY_LANDSCAPE : C1832b.DEFAULT;
    }

    /* renamed from: q */
    public long mo14010q() {
        return getLongFromAdObject("close_delay", 0);
    }

    /* renamed from: r */
    public long mo14011r() {
        return TimeUnit.SECONDS.toMillis(getLongFromAdObject("close_delay_max_buffering_time_seconds", 5));
    }

    /* renamed from: s */
    public long mo14012s() {
        List<Integer> t = mo14013t();
        long longFromAdObject = getLongFromAdObject("close_delay_graphic", (t == null || t.size() <= 0) ? 0 : (long) t.get(0).intValue());
        if (longFromAdObject == -1 || longFromAdObject == -2) {
            return 0;
        }
        return longFromAdObject;
    }

    /* renamed from: t */
    public List<Integer> mo14013t() {
        return getIntegerListFromAdObject("multi_close_delay_graphic", (List<Integer>) null);
    }

    /* renamed from: u */
    public C1525i.C1526a mo14014u() {
        List<Integer> b = mo12621b();
        int intFromAdObject = getIntFromAdObject("close_style", (b == null || b.size() <= 0) ? -1 : b.get(0).intValue());
        return intFromAdObject == -1 ? m3862b(hasVideoUrl()) : mo13964a(intFromAdObject);
    }

    /* renamed from: v */
    public List<C1525i.C1526a> mo14015v() {
        List<Integer> b = mo12621b();
        if (b == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(b.size());
        for (Integer intValue : b) {
            arrayList.add(mo13964a(intValue.intValue()));
        }
        return arrayList;
    }

    /* renamed from: w */
    public C1525i.C1526a mo14016w() {
        int intFromAdObject = getIntFromAdObject("skip_style", -1);
        return intFromAdObject == -1 ? mo14014u() : mo13964a(intFromAdObject);
    }

    /* renamed from: x */
    public boolean mo14017x() {
        return getBooleanFromAdObject("dismiss_on_skip", false);
    }

    /* renamed from: y */
    public boolean mo14018y() {
        return getBooleanFromAdObject("fire_postbacks_from_webview", false);
    }

    /* renamed from: z */
    public boolean mo14019z() {
        return getBooleanFromAdObject("html_resources_cached", false);
    }
}
