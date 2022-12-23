package com.bytedance.sdk.openadsdk.core.p151e;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.bykv.p068vk.openvk.component.video.api.p085c.C2521b;
import com.bykv.p068vk.openvk.component.video.api.p085c.C2522c;
import com.bytedance.sdk.component.adexpress.p091a.p093b.C2603a;
import com.bytedance.sdk.component.adexpress.p091a.p094c.C2617c;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.component.widget.p128b.C2997a;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p156j.C3539a;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareConstants;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.model.AdvertisementDBAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.e.n */
/* compiled from: MaterialMeta */
public class C3498n {

    /* renamed from: A */
    private int f8570A = 0;

    /* renamed from: B */
    private long f8571B;

    /* renamed from: C */
    private int f8572C;

    /* renamed from: D */
    private int f8573D;

    /* renamed from: E */
    private C2521b f8574E;

    /* renamed from: F */
    private C2521b f8575F;

    /* renamed from: G */
    private boolean f8576G;

    /* renamed from: H */
    private int f8577H;

    /* renamed from: I */
    private Map<String, Object> f8578I;

    /* renamed from: J */
    private C3499a f8579J;

    /* renamed from: K */
    private String f8580K;

    /* renamed from: L */
    private JSONObject f8581L;

    /* renamed from: M */
    private int f8582M = 0;

    /* renamed from: N */
    private int f8583N = 1;

    /* renamed from: O */
    private String f8584O = "";

    /* renamed from: P */
    private C3475f f8585P = new C3475f();

    /* renamed from: Q */
    private int f8586Q = AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES;

    /* renamed from: R */
    private int f8587R = 0;

    /* renamed from: S */
    private AdSlot f8588S;

    /* renamed from: T */
    private int f8589T;

    /* renamed from: U */
    private int f8590U = 1;

    /* renamed from: V */
    private String f8591V;

    /* renamed from: W */
    private int f8592W = 0;

    /* renamed from: X */
    private int f8593X = 0;

    /* renamed from: Y */
    private int f8594Y = 0;

    /* renamed from: Z */
    private JSONObject f8595Z;

    /* renamed from: a */
    public boolean f8596a = false;

    /* renamed from: aa */
    private int f8597aa = 1;

    /* renamed from: ab */
    private int f8598ab;

    /* renamed from: ac */
    private String f8599ac;

    /* renamed from: ad */
    private String f8600ad;

    /* renamed from: ae */
    private C3480i f8601ae;

    /* renamed from: af */
    private int f8602af = 1;

    /* renamed from: ag */
    private float f8603ag = 100.0f;

    /* renamed from: ah */
    private String f8604ah;

    /* renamed from: ai */
    private int f8605ai;

    /* renamed from: aj */
    private int f8606aj;

    /* renamed from: ak */
    private int f8607ak;

    /* renamed from: al */
    private int f8608al;

    /* renamed from: am */
    private int f8609am = 2;

    /* renamed from: an */
    private int f8610an = 1;

    /* renamed from: ao */
    private int f8611ao = 0;

    /* renamed from: ap */
    private int f8612ap;

    /* renamed from: aq */
    private C3497m f8613aq;

    /* renamed from: ar */
    private C3501p f8614ar;

    /* renamed from: as */
    private boolean f8615as;

    /* renamed from: at */
    private C3539a f8616at;

    /* renamed from: au */
    private boolean f8617au;

    /* renamed from: av */
    private String f8618av;

    /* renamed from: aw */
    private JSONObject f8619aw;

    /* renamed from: ax */
    private int f8620ax = 0;

    /* renamed from: ay */
    private String f8621ay;

    /* renamed from: az */
    private C3473d f8622az;

    /* renamed from: b */
    private int f8623b;

    /* renamed from: c */
    private int f8624c;

    /* renamed from: d */
    private int f8625d;

    /* renamed from: e */
    private C3484k f8626e;

    /* renamed from: f */
    private C3484k f8627f;

    /* renamed from: g */
    private String f8628g;

    /* renamed from: h */
    private List<C3484k> f8629h = new ArrayList();

    /* renamed from: i */
    private String f8630i;

    /* renamed from: j */
    private List<String> f8631j = new ArrayList();

    /* renamed from: k */
    private List<String> f8632k = new ArrayList();

    /* renamed from: l */
    private List<String> f8633l = new ArrayList();

    /* renamed from: m */
    private String f8634m;

    /* renamed from: n */
    private String f8635n;

    /* renamed from: o */
    private String f8636o;

    /* renamed from: p */
    private String f8637p = "0";

    /* renamed from: q */
    private C3472c f8638q;

    /* renamed from: r */
    private C3479h f8639r;

    /* renamed from: s */
    private int f8640s;

    /* renamed from: t */
    private String f8641t;

    /* renamed from: u */
    private String f8642u;

    /* renamed from: v */
    private String f8643v;

    /* renamed from: w */
    private String f8644w = "";

    /* renamed from: x */
    private int f8645x = 0;

    /* renamed from: y */
    private int f8646y = 2;

    /* renamed from: z */
    private List<FilterWord> f8647z = new ArrayList();

    /* renamed from: a */
    public static C2522c m10578a(String str, C3498n nVar) {
        C4014u.m13183a(nVar);
        nVar.mo19596A(0);
        nVar.mo19598B(0);
        return new C2522c(str, nVar.mo19607J(), nVar.mo19652aF(), nVar.mo19650aD(), nVar.mo19651aE());
    }

    /* renamed from: a */
    public static boolean m10579a(C3498n nVar) {
        return (nVar == null || nVar.mo19607J() == null || nVar.mo19607J().mo16347d() == 0) ? false : true;
    }

    /* renamed from: a */
    public static boolean m10580a(C3498n nVar, boolean z, boolean z2, boolean z3) {
        C2521b bVar;
        C2521b bVar2;
        if (m10579a(nVar) || z3 || nVar == null || (bVar = nVar.f8574E) == null || TextUtils.isEmpty(bVar.mo16362j())) {
            return false;
        }
        if (nVar == null || (bVar2 = nVar.f8574E) == null || bVar2.mo16336a() != 1) {
            C2975l.m8384b("MaterialMeta", "can show end card follow js WebViewClient");
            return z;
        }
        C2975l.m8384b("MaterialMeta", "can show end card follow js");
        return z2;
    }

    /* renamed from: b */
    private JSONObject m10581b(FilterWord filterWord) {
        if (filterWord == null) {
            return null;
        }
        try {
            if (filterWord.isValid()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", filterWord.getId());
                jSONObject.put("name", filterWord.getName());
                jSONObject.put("is_selected", filterWord.getIsSelected());
                if (filterWord.hasSecondOptions()) {
                    JSONArray jSONArray = new JSONArray();
                    for (FilterWord b : filterWord.getOptions()) {
                        jSONArray.put(m10581b(b));
                    }
                    if (jSONArray.length() > 0) {
                        jSONObject.put(SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, jSONArray);
                    }
                }
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r2 = r2.f8574E;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m10582b(com.bytedance.sdk.openadsdk.core.p151e.C3498n r2) {
        /*
            r0 = 0
            if (r2 == 0) goto L_0x0010
            com.bykv.vk.openvk.component.video.api.c.b r2 = r2.f8574E
            if (r2 != 0) goto L_0x0008
            goto L_0x0010
        L_0x0008:
            int r2 = r2.mo16336a()
            r1 = 1
            if (r2 != r1) goto L_0x0010
            r0 = r1
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p151e.C3498n.m10582b(com.bytedance.sdk.openadsdk.core.e.n):boolean");
    }

    /* renamed from: c */
    public static boolean m10583c(C3498n nVar) {
        if (nVar == null) {
            return false;
        }
        return nVar.mo19679aw() || nVar.mo19660ad() == 5 || nVar.mo19660ad() == 15 || nVar.mo19660ad() == 50;
    }

    /* renamed from: A */
    public int mo19595A() {
        return this.f8597aa;
    }

    /* renamed from: A */
    public void mo19596A(int i) {
        this.f8611ao = i;
    }

    /* renamed from: B */
    public int mo19597B() {
        return this.f8598ab;
    }

    /* renamed from: B */
    public void mo19598B(int i) {
        this.f8612ap = i;
    }

    /* renamed from: C */
    public int mo19599C() {
        return this.f8573D;
    }

    /* renamed from: C */
    public void mo19600C(int i) {
        this.f8620ax = i;
    }

    /* renamed from: D */
    public String mo19601D() {
        return this.f8580K;
    }

    /* renamed from: E */
    public boolean mo19602E() {
        return mo19599C() == 100;
    }

    /* renamed from: F */
    public int mo19603F() {
        return this.f8577H;
    }

    /* renamed from: G */
    public C3499a mo19604G() {
        return this.f8579J;
    }

    /* renamed from: H */
    public C2617c mo19605H() {
        if (mo19604G() == null) {
            return null;
        }
        String b = mo19604G().mo19762b();
        String d = mo19604G().mo19766d();
        String c = mo19604G().mo19764c();
        String e = mo19604G().mo19768e();
        String a = mo19604G().mo19760a();
        int f = C4014u.m13223f(this);
        C2617c e2 = C2617c.m6727a().mo16703a(b).mo16704b(c).mo16705c(d).mo16706d(e).mo16707e(a);
        return e2.mo16708f(f + "");
    }

    /* renamed from: I */
    public int mo19606I() {
        C3480i iVar = this.f8601ae;
        if (iVar == null) {
            return 0;
        }
        return iVar.mo19540a();
    }

    /* renamed from: J */
    public C2521b mo19607J() {
        return this.f8574E;
    }

    /* renamed from: K */
    public String mo19608K() {
        return this.f8641t;
    }

    /* renamed from: L */
    public int mo19609L() {
        return this.f8623b;
    }

    /* renamed from: M */
    public C3484k mo19610M() {
        return this.f8626e;
    }

    /* renamed from: N */
    public C3484k mo19611N() {
        return this.f8627f;
    }

    /* renamed from: O */
    public String mo19612O() {
        return this.f8628g;
    }

    /* renamed from: P */
    public List<C3484k> mo19613P() {
        return this.f8629h;
    }

    /* renamed from: Q */
    public String mo19614Q() {
        return this.f8630i;
    }

    /* renamed from: R */
    public List<String> mo19615R() {
        return this.f8631j;
    }

    /* renamed from: S */
    public List<String> mo19616S() {
        return this.f8632k;
    }

    /* renamed from: T */
    public List<String> mo19617T() {
        return this.f8633l;
    }

    /* renamed from: U */
    public String mo19618U() {
        return this.f8634m;
    }

    /* renamed from: V */
    public String mo19619V() {
        return this.f8635n;
    }

    /* renamed from: W */
    public String mo19620W() {
        String str;
        if (!TextUtils.isEmpty(this.f8636o)) {
            return this.f8636o;
        }
        Context a = C3578m.m11231a();
        int L = mo19609L();
        if (L == 2 || L == 3) {
            if (a == null) {
                return this.f8636o;
            }
            str = "tt_video_mobile_go_detail";
        } else if (L != 4) {
            return this.f8636o;
        } else {
            if (a == null) {
                return this.f8636o;
            }
            str = "tt_video_download_apk";
        }
        return C2984t.m8425a(a, str);
    }

    /* renamed from: X */
    public String mo19621X() {
        return this.f8636o;
    }

    /* renamed from: Y */
    public String mo19622Y() {
        return this.f8637p;
    }

    /* renamed from: Z */
    public String mo19623Z() {
        return this.f8642u;
    }

    /* renamed from: a */
    public C3497m mo19624a() {
        return this.f8613aq;
    }

    /* renamed from: a */
    public void mo19625a(double d) {
        this.f8610an = (d == 2.0d || d == 1.0d) ? (int) d : 1;
    }

    /* renamed from: a */
    public void mo19626a(float f) {
        this.f8603ag = f;
    }

    /* renamed from: a */
    public void mo19627a(int i) {
        mo19628a(i, -1);
    }

    /* renamed from: a */
    public void mo19628a(int i, int i2) {
        int i3;
        this.f8625d = i;
        this.f8624c = i;
        if (this.f8588S == null) {
            this.f8624c = 0;
            return;
        }
        if (i2 <= 0) {
            i2 = C4014u.m13219e(this);
        }
        if (this.f8588S.getNativeAdType() == 3 || this.f8588S.getDurationSlotType() == 3 || i2 == 3) {
            i3 = 14;
        } else if (this.f8588S.getNativeAdType() == 7 || this.f8588S.getNativeAdType() == 8 || this.f8588S.getDurationSlotType() == 7 || this.f8588S.getDurationSlotType() == 8 || i2 == 7 || i2 == 8) {
            if (C3501p.m10769i(this)) {
                i3 = 12;
            } else if (C3501p.m10761a(this)) {
                i3 = 9;
            } else {
                if (this.f8625d == 5 && !C3485l.m10541c(this)) {
                    this.f8624c = 7;
                }
                if (this.f8625d == 6 && !C3485l.m10539b(this)) {
                    this.f8624c = 7;
                }
                if (this.f8625d == 8 && mo19599C() != 100) {
                    this.f8624c = 7;
                }
                if (i < 5) {
                    this.f8624c = 7;
                    return;
                }
                return;
            }
        } else if (C3501p.m10761a(this)) {
            this.f8624c = 4;
            return;
        } else {
            if (this.f8625d == 4 && !C3501p.m10761a(this)) {
                this.f8624c = 0;
            }
            if (i >= 5) {
                this.f8624c = 0;
                return;
            } else if (this.f8625d == 2 && mo19609L() != 3) {
                this.f8624c = 0;
                return;
            } else if (i == 0 || (i == 1 && mo19609L() != 3)) {
                this.f8624c = 0;
                return;
            } else {
                return;
            }
        }
        this.f8624c = i3;
    }

    /* renamed from: a */
    public void mo19629a(long j) {
        this.f8571B = j;
    }

    /* renamed from: a */
    public void mo19630a(C2521b bVar) {
        this.f8574E = bVar;
    }

    /* renamed from: a */
    public void mo19631a(AdSlot adSlot) {
        this.f8588S = adSlot;
    }

    /* renamed from: a */
    public void mo19632a(FilterWord filterWord) {
        this.f8647z.add(filterWord);
    }

    /* renamed from: a */
    public void mo19633a(C3472c cVar) {
        this.f8638q = cVar;
    }

    /* renamed from: a */
    public void mo19634a(C3473d dVar) {
        this.f8622az = dVar;
    }

    /* renamed from: a */
    public void mo19635a(C3475f fVar) {
        this.f8585P = fVar;
    }

    /* renamed from: a */
    public void mo19636a(C3479h hVar) {
        this.f8639r = hVar;
    }

    /* renamed from: a */
    public void mo19637a(C3480i iVar) {
        this.f8601ae = iVar;
    }

    /* renamed from: a */
    public void mo19638a(C3484k kVar) {
        this.f8626e = kVar;
    }

    /* renamed from: a */
    public void mo19639a(C3497m mVar) {
        this.f8613aq = mVar;
    }

    /* renamed from: a */
    public void mo19640a(C3499a aVar) {
        this.f8579J = aVar;
        C2617c H = mo19605H();
        if (H != null) {
            C2603a.m6640a(H);
        }
    }

    /* renamed from: a */
    public void mo19641a(C3501p pVar) {
        this.f8614ar = pVar;
    }

    /* renamed from: a */
    public void mo19642a(C3539a aVar) {
        this.f8616at = aVar;
    }

    /* renamed from: a */
    public void mo19643a(String str) {
        this.f8644w = str;
    }

    /* renamed from: a */
    public void mo19644a(Map<String, Object> map) {
        this.f8578I = map;
    }

    /* renamed from: a */
    public void mo19645a(JSONObject jSONObject) {
        this.f8595Z = jSONObject;
    }

    /* renamed from: a */
    public void mo19646a(boolean z) {
        this.f8596a = z;
    }

    /* renamed from: aA */
    public int mo19647aA() {
        JSONObject jSONObject = this.f8619aw;
        if (jSONObject != null) {
            return jSONObject.optInt("easy_playable_skip_duration", 0);
        }
        return 0;
    }

    /* renamed from: aB */
    public JSONObject mo19648aB() {
        return this.f8619aw;
    }

    /* renamed from: aC */
    public C2997a mo19649aC() {
        C2997a aVar = new C2997a();
        aVar.mo18000a(this.f8577H);
        aVar.mo18003b(this.f8637p);
        aVar.mo18001a(mo19659ac());
        return aVar;
    }

    /* renamed from: aD */
    public int mo19650aD() {
        return this.f8611ao;
    }

    /* renamed from: aE */
    public int mo19651aE() {
        return this.f8612ap;
    }

    /* renamed from: aF */
    public C2521b mo19652aF() {
        return this.f8575F;
    }

    /* renamed from: aG */
    public boolean mo19653aG() {
        C2521b bVar = this.f8574E;
        return bVar == null || bVar.mo16369q() != 1;
    }

    /* renamed from: aH */
    public JSONObject mo19654aH() {
        if (this.f8581L == null) {
            try {
                if (!TextUtils.isEmpty(this.f8643v)) {
                    this.f8581L = new JSONObject(this.f8643v);
                }
            } catch (JSONException unused) {
            }
        }
        return this.f8581L;
    }

    /* renamed from: aI */
    public int mo19655aI() {
        return this.f8620ax;
    }

    /* renamed from: aJ */
    public String mo19656aJ() {
        return this.f8621ay;
    }

    /* renamed from: aa */
    public C3472c mo19657aa() {
        return this.f8638q;
    }

    /* renamed from: ab */
    public C3479h mo19658ab() {
        return this.f8639r;
    }

    /* renamed from: ac */
    public String mo19659ac() {
        return this.f8643v;
    }

    /* renamed from: ad */
    public int mo19660ad() {
        return this.f8640s;
    }

    /* renamed from: ae */
    public List<FilterWord> mo19661ae() {
        return this.f8647z;
    }

    /* renamed from: af */
    public String mo19662af() {
        return this.f8600ad;
    }

    /* renamed from: ag */
    public long mo19663ag() {
        return this.f8571B;
    }

    /* renamed from: ah */
    public int mo19664ah() {
        return this.f8572C;
    }

    /* renamed from: ai */
    public boolean mo19665ai() {
        return this.f8576G;
    }

    /* renamed from: aj */
    public Map<String, Object> mo19666aj() {
        return this.f8578I;
    }

    /* renamed from: ak */
    public JSONObject mo19667ak() {
        return this.f8595Z;
    }

    /* renamed from: al */
    public String mo19668al() {
        return this.f8591V;
    }

    /* renamed from: am */
    public int mo19669am() {
        if (this.f8602af != 2) {
            this.f8602af = 1;
        }
        return this.f8602af;
    }

    /* renamed from: an */
    public float mo19670an() {
        if (this.f8603ag <= 0.0f) {
            this.f8603ag = 100.0f;
        }
        return (this.f8603ag * 1000.0f) / 1000.0f;
    }

    /* renamed from: ao */
    public boolean mo19671ao() {
        if (this.f8629h.isEmpty()) {
            return false;
        }
        if (this.f8640s == 4 && this.f8629h.size() < 3) {
            return false;
        }
        for (C3484k e : this.f8629h) {
            if (!e.mo19568e()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ap */
    public boolean mo19672ap() {
        return !this.f8615as && mo19673aq() == 1;
    }

    /* renamed from: aq */
    public int mo19673aq() {
        return this.f8570A;
    }

    /* renamed from: ar */
    public JSONObject mo19674ar() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("interaction_type", mo19609L());
            jSONObject.put("interaction_method", mo19708g());
            jSONObject.put("target_url", mo19612O());
            jSONObject.put("app_log_url", mo19623Z());
            jSONObject.put("gecko_id", mo19662af());
            jSONObject.put(ShareConstants.MEDIA_EXTENSION, mo19648aB());
            jSONObject.put("ad_id", mo19622Y());
            jSONObject.put("source", mo19608K());
            jSONObject.put("screenshot", mo19665ai());
            jSONObject.put("dislike_control", mo19673aq());
            jSONObject.put("play_bar_show_time", mo19758z());
            jSONObject.put("play_bar_style", mo19750v());
            jSONObject.put("if_block_lp", mo19727m());
            jSONObject.put("cache_sort", mo19595A());
            jSONObject.put("if_sp_cache", mo19597B());
            jSONObject.put("render_control", mo19724l());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(SDKConstants.PARAM_GAME_REQUESTS_CTA, mo19715i());
            jSONObject2.put("other", mo19711h());
            jSONObject.put("set_click_type", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(CampaignEx.JSON_KEY_REWARD_NAME, mo19718j());
            jSONObject3.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, mo19721k());
            jSONObject.put("reward_data", jSONObject3);
            C3484k M = mo19610M();
            if (M != null) {
                if (!TextUtils.isEmpty(M.mo19559a())) {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("url", M.mo19559a());
                    jSONObject4.put("height", M.mo19566c());
                    jSONObject4.put("width", M.mo19563b());
                    jSONObject.put(RewardPlus.ICON, jSONObject4);
                }
            }
            C3484k N = mo19611N();
            if (N != null && !TextUtils.isEmpty(N.mo19559a())) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("url", N.mo19559a());
                jSONObject5.put("height", N.mo19566c());
                jSONObject5.put("width", N.mo19563b());
                jSONObject.put("cover_image", jSONObject5);
            }
            JSONObject ak = mo19667ak();
            if (ak != null) {
                jSONObject.put("session_params", ak);
            }
            C3475f w = mo19752w();
            if (w != null) {
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("click_upper_content_area", w.f8431a);
                jSONObject6.put("click_upper_non_content_area", w.f8432b);
                jSONObject6.put("click_lower_content_area", w.f8433c);
                jSONObject6.put("click_lower_non_content_area", w.f8434d);
                jSONObject6.put("click_button_area", w.f8435e);
                jSONObject6.put("click_video_area", w.f8436f);
                jSONObject.put("click_area", jSONObject6);
            }
            AdSlot x = mo19754x();
            if (x != null) {
                jSONObject.put("adslot", x.toJsonObj());
            }
            List<C3484k> P = mo19613P();
            if (P != null) {
                JSONArray jSONArray = new JSONArray();
                for (C3484k next : P) {
                    JSONObject jSONObject7 = new JSONObject();
                    jSONObject7.put("url", next.mo19559a());
                    jSONObject7.put("height", next.mo19566c());
                    jSONObject7.put("width", next.mo19563b());
                    jSONObject7.put("image_preview", next.mo19569f());
                    jSONObject7.put("image_key", next.mo19570g());
                    jSONArray.put(jSONObject7);
                }
                jSONObject.put("image", jSONArray);
            }
            List<String> R = mo19615R();
            if (R != null) {
                JSONArray jSONArray2 = new JSONArray();
                for (String put : R) {
                    jSONArray2.put(put);
                }
                jSONObject.put("show_url", jSONArray2);
            }
            List<String> S = mo19616S();
            if (S != null) {
                JSONArray jSONArray3 = new JSONArray();
                for (String put2 : S) {
                    jSONArray3.put(put2);
                }
                jSONObject.put("click_url", jSONArray3);
            }
            List<String> T = mo19617T();
            if (T != null) {
                JSONArray jSONArray4 = new JSONArray();
                for (String put3 : T) {
                    jSONArray4.put(put3);
                }
                jSONObject.put("play_start", jSONArray4);
            }
            jSONObject.put("phone_num", mo19614Q());
            jSONObject.put("title", mo19618U());
            jSONObject.put("description", mo19619V());
            jSONObject.put("ext", mo19659ac());
            jSONObject.put("image_mode", mo19660ad());
            jSONObject.put("cover_click_area", mo19599C());
            jSONObject.put("intercept_flag", mo19756y());
            jSONObject.put("button_text", mo19620W());
            jSONObject.put("ad_logo", mo19748u());
            jSONObject.put("video_adaptation", mo19746t());
            jSONObject.put("feed_video_opentype", mo19736p());
            jSONObject.put("orientation", mo19669am());
            jSONObject.put("aspect_ratio", (double) mo19670an());
            C3472c aa = mo19657aa();
            if (aa != null) {
                JSONObject jSONObject8 = new JSONObject();
                jSONObject8.put(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, aa.mo19495b());
                jSONObject8.put(CampaignEx.JSON_KEY_PACKAGE_NAME, aa.mo19498c());
                jSONObject8.put(DownloadModel.DOWNLOAD_URL, aa.mo19491a());
                jSONObject8.put("score", aa.mo19500d());
                jSONObject8.put("comment_num", aa.mo19501e());
                jSONObject8.put(CampaignEx.JSON_KEY_APP_SIZE, aa.mo19502f());
                jSONObject.put(TapjoyConstants.TJC_APP_PLACEMENT, jSONObject8);
            }
            C3479h ab = mo19658ab();
            if (ab != null) {
                JSONObject jSONObject9 = new JSONObject();
                jSONObject9.put("deeplink_url", ab.mo19534a());
                jSONObject9.put("fallback_url", ab.mo19537b());
                jSONObject9.put("fallback_type", ab.mo19539c());
                jSONObject.put(CampaignEx.JSON_KEY_DEEP_LINK_URL, jSONObject9);
            }
            List<FilterWord> ae = mo19661ae();
            if (ae != null) {
                JSONArray jSONArray5 = new JSONArray();
                for (FilterWord b : ae) {
                    JSONObject b2 = m10581b(b);
                    if (b2 != null) {
                        jSONArray5.put(b2);
                    }
                }
                jSONObject.put("filter_words", jSONArray5);
            }
            mo19701e().mo19774a(jSONObject);
            jSONObject.put("count_down", mo19664ah());
            jSONObject.put("expiration_time", mo19663ag());
            C2521b J = mo19607J();
            if (J != null) {
                jSONObject.put("video", J.mo16368p());
            }
            C2521b aF = mo19652aF();
            if (aF != null) {
                jSONObject.put("h265_video", aF.mo16368p());
            }
            JSONObject jSONObject10 = new JSONObject();
            jSONObject10.put("if_send_click", mo19606I());
            jSONObject.put("download_conf", jSONObject10);
            if (mo19666aj() != null) {
                JSONObject jSONObject11 = new JSONObject();
                Set<Map.Entry<String, Object>> entrySet = mo19666aj().entrySet();
                if (entrySet != null && !entrySet.isEmpty()) {
                    for (Map.Entry next2 : entrySet) {
                        jSONObject11.put((String) next2.getKey(), next2.getValue());
                    }
                }
                jSONObject.put("media_ext", jSONObject11);
            }
            C3499a G = mo19604G();
            if (G != null) {
                JSONObject jSONObject12 = new JSONObject();
                jSONObject12.put("id", G.mo19762b());
                jSONObject12.put(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_MD5, G.mo19764c());
                jSONObject12.put("url", G.mo19766d());
                jSONObject12.put("data", G.mo19768e());
                jSONObject12.put("diff_data", G.mo19770f());
                jSONObject12.put("version", G.mo19760a());
                jSONObject12.put("dynamic_creative", G.mo19772g());
                jSONObject.put("tpl_info", jSONObject12);
            }
            jSONObject.put("creative_extra", mo19601D());
            jSONObject.put("market_url", mo19668al());
            jSONObject.put("auction_price", mo19744s());
            jSONObject.put("ad_info", mo19730n());
            jSONObject.put("is_package_open", mo19675as());
            jSONObject.put("playable_duration_time", mo19676at());
            jSONObject.put("playable_endcard_close_time", mo19677au());
            jSONObject.put("endcard_close_time", mo19678av());
            JSONObject jSONObject13 = new JSONObject();
            jSONObject13.put("render_sequence", mo19739q());
            jSONObject13.put("backup_render_control", mo19742r());
            jSONObject.put("render", jSONObject13);
            if (this.f8613aq == null) {
                C3497m mVar = new C3497m();
                this.f8613aq = mVar;
                mVar.mo19591a("");
                this.f8613aq.mo19590a(10);
                this.f8613aq.mo19593b(20);
            }
            JSONObject jSONObject14 = new JSONObject();
            jSONObject14.put("onlylp_loading_maxtime", this.f8613aq.mo19589a());
            jSONObject14.put("straight_lp_showtime", this.f8613aq.mo19592b());
            jSONObject14.put("loading_text", this.f8613aq.mo19594c());
            jSONObject.put("interaction_method_params", jSONObject14);
            JSONObject jSONObject15 = new JSONObject();
            jSONObject15.put("splash_clickarea", mo19691c());
            jSONObject15.put("splash_layout_id", mo19697d());
            jSONObject.put("splash_control", jSONObject15);
            if (this.f8617au) {
                jSONObject.put("is_html", true);
                jSONObject.put("dsp_html", this.f8618av);
            }
            if (this.f8615as) {
                jSONObject.put("is_vast", true);
                jSONObject.put("vast_json", this.f8616at.mo19996j());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: as */
    public int mo19675as() {
        return this.f8605ai;
    }

    /* renamed from: at */
    public int mo19676at() {
        int i = this.f8606aj;
        if (i > 0) {
            return i;
        }
        return 20;
    }

    /* renamed from: au */
    public int mo19677au() {
        return this.f8607ak;
    }

    /* renamed from: av */
    public int mo19678av() {
        return this.f8608al;
    }

    /* renamed from: aw */
    public boolean mo19679aw() {
        return this.f8615as;
    }

    /* renamed from: ax */
    public C3539a mo19680ax() {
        if (this.f8615as) {
            return this.f8616at;
        }
        return null;
    }

    /* renamed from: ay */
    public boolean mo19681ay() {
        return this.f8617au;
    }

    /* renamed from: az */
    public String mo19682az() {
        return this.f8618av;
    }

    /* renamed from: b */
    public C3473d mo19683b() {
        return this.f8622az;
    }

    /* renamed from: b */
    public void mo19684b(double d) {
        this.f8609am = (d == 2.0d || d == 1.0d) ? (int) d : 2;
    }

    /* renamed from: b */
    public void mo19685b(int i) {
        this.f8624c = i;
    }

    /* renamed from: b */
    public void mo19686b(C2521b bVar) {
        this.f8575F = bVar;
    }

    /* renamed from: b */
    public void mo19687b(C3484k kVar) {
        this.f8627f = kVar;
    }

    /* renamed from: b */
    public void mo19688b(String str) {
        this.f8604ah = str;
    }

    /* renamed from: b */
    public void mo19689b(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f8623b = 4;
            this.f8637p = jSONObject.optString("id");
            this.f8641t = jSONObject.optString("source");
            C3472c cVar = new C3472c();
            this.f8638q = cVar;
            cVar.mo19499c(jSONObject.optString("pkg_name"));
            this.f8638q.mo19497b(jSONObject.optString("name"));
            this.f8638q.mo19494a(jSONObject.optString(DownloadModel.DOWNLOAD_URL));
        }
    }

    /* renamed from: b */
    public void mo19690b(boolean z) {
        this.f8576G = z;
    }

    /* renamed from: c */
    public int mo19691c() {
        C3473d dVar = this.f8622az;
        if (dVar == null) {
            return 2;
        }
        return dVar.mo19504a();
    }

    /* renamed from: c */
    public void mo19692c(int i) {
        this.f8645x = i;
    }

    /* renamed from: c */
    public void mo19693c(C3484k kVar) {
        this.f8629h.add(kVar);
    }

    /* renamed from: c */
    public void mo19694c(String str) {
        this.f8599ac = str;
    }

    /* renamed from: c */
    public void mo19695c(JSONObject jSONObject) {
        this.f8619aw = jSONObject;
    }

    /* renamed from: c */
    public void mo19696c(boolean z) {
        this.f8615as = z;
    }

    /* renamed from: d */
    public int mo19697d() {
        C3473d dVar = this.f8622az;
        if (dVar == null) {
            return 1;
        }
        return dVar.mo19506b();
    }

    /* renamed from: d */
    public void mo19698d(int i) {
        this.f8646y = i;
    }

    /* renamed from: d */
    public void mo19699d(String str) {
        this.f8580K = str;
    }

    /* renamed from: d */
    public void mo19700d(boolean z) {
        this.f8617au = z;
    }

    /* renamed from: e */
    public C3501p mo19701e() {
        return this.f8614ar;
    }

    /* renamed from: e */
    public void mo19702e(int i) {
        this.f8592W = i;
    }

    /* renamed from: e */
    public void mo19703e(String str) {
        this.f8641t = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3498n nVar = (C3498n) obj;
        return this.f8637p.equals(nVar.f8637p) && this.f8643v.equals(nVar.f8643v);
    }

    /* renamed from: f */
    public int mo19705f() {
        return this.f8624c;
    }

    /* renamed from: f */
    public void mo19706f(int i) {
        this.f8594Y = i;
    }

    /* renamed from: f */
    public void mo19707f(String str) {
        this.f8628g = str;
    }

    /* renamed from: g */
    public int mo19708g() {
        return this.f8625d;
    }

    /* renamed from: g */
    public void mo19709g(int i) {
        this.f8582M = i;
    }

    /* renamed from: g */
    public void mo19710g(String str) {
        this.f8630i = str;
    }

    /* renamed from: h */
    public int mo19711h() {
        return this.f8610an;
    }

    /* renamed from: h */
    public void mo19712h(int i) {
        this.f8583N = i;
    }

    /* renamed from: h */
    public void mo19713h(String str) {
        this.f8634m = str;
    }

    public int hashCode() {
        return (this.f8637p.hashCode() * 31) + this.f8643v.hashCode();
    }

    /* renamed from: i */
    public int mo19715i() {
        return this.f8609am;
    }

    /* renamed from: i */
    public void mo19716i(int i) {
        this.f8593X = i;
    }

    /* renamed from: i */
    public void mo19717i(String str) {
        this.f8635n = str;
    }

    /* renamed from: j */
    public String mo19718j() {
        return this.f8644w;
    }

    /* renamed from: j */
    public void mo19719j(int i) {
        this.f8590U = i;
    }

    /* renamed from: j */
    public void mo19720j(String str) {
        this.f8636o = str;
    }

    /* renamed from: k */
    public int mo19721k() {
        return this.f8645x;
    }

    /* renamed from: k */
    public void mo19722k(int i) {
        this.f8587R = i;
    }

    /* renamed from: k */
    public void mo19723k(String str) {
        this.f8637p = str;
    }

    /* renamed from: l */
    public int mo19724l() {
        int i = this.f8624c;
        if (i == 5 || i == 6) {
            return 1;
        }
        return this.f8646y;
    }

    /* renamed from: l */
    public void mo19725l(int i) {
        this.f8589T = i;
    }

    /* renamed from: l */
    public void mo19726l(String str) {
        this.f8642u = str;
    }

    /* renamed from: m */
    public int mo19727m() {
        return this.f8592W;
    }

    /* renamed from: m */
    public void mo19728m(int i) {
        this.f8586Q = i;
    }

    /* renamed from: m */
    public void mo19729m(String str) {
        this.f8643v = str;
    }

    /* renamed from: n */
    public String mo19730n() {
        return this.f8604ah;
    }

    /* renamed from: n */
    public void mo19731n(int i) {
        this.f8597aa = i;
    }

    /* renamed from: n */
    public void mo19732n(String str) {
        this.f8600ad = str;
    }

    /* renamed from: o */
    public void mo19733o(int i) {
        this.f8598ab = i;
    }

    /* renamed from: o */
    public void mo19734o(String str) {
        this.f8591V = str;
    }

    /* renamed from: o */
    public boolean mo19735o() {
        return this.f8592W == 1;
    }

    /* renamed from: p */
    public int mo19736p() {
        return this.f8594Y;
    }

    /* renamed from: p */
    public void mo19737p(int i) {
        this.f8573D = i;
    }

    /* renamed from: p */
    public void mo19738p(String str) {
        this.f8618av = str;
    }

    /* renamed from: q */
    public int mo19739q() {
        return this.f8582M;
    }

    /* renamed from: q */
    public void mo19740q(int i) {
        this.f8577H = i;
    }

    /* renamed from: q */
    public void mo19741q(String str) {
        this.f8621ay = str;
    }

    /* renamed from: r */
    public int mo19742r() {
        return this.f8583N;
    }

    /* renamed from: r */
    public void mo19743r(int i) {
        this.f8623b = i;
    }

    /* renamed from: s */
    public String mo19744s() {
        return this.f8599ac;
    }

    /* renamed from: s */
    public void mo19745s(int i) {
        this.f8640s = i;
    }

    /* renamed from: t */
    public int mo19746t() {
        return this.f8593X;
    }

    /* renamed from: t */
    public void mo19747t(int i) {
        this.f8572C = i;
    }

    /* renamed from: u */
    public int mo19748u() {
        return this.f8590U;
    }

    /* renamed from: u */
    public void mo19749u(int i) {
        this.f8602af = i;
    }

    /* renamed from: v */
    public int mo19750v() {
        if (mo19679aw()) {
            return 5;
        }
        if (mo19670an() != 100.0f || mo19724l() == 2) {
            return 0;
        }
        return this.f8587R;
    }

    /* renamed from: v */
    public void mo19751v(int i) {
        this.f8570A = i;
    }

    /* renamed from: w */
    public C3475f mo19752w() {
        return this.f8585P;
    }

    /* renamed from: w */
    public void mo19753w(int i) {
        this.f8605ai = i;
    }

    /* renamed from: x */
    public AdSlot mo19754x() {
        return this.f8588S;
    }

    /* renamed from: x */
    public void mo19755x(int i) {
        this.f8606aj = i;
    }

    /* renamed from: y */
    public int mo19756y() {
        return this.f8589T;
    }

    /* renamed from: y */
    public void mo19757y(int i) {
        this.f8607ak = i;
    }

    /* renamed from: z */
    public int mo19758z() {
        return this.f8586Q;
    }

    /* renamed from: z */
    public void mo19759z(int i) {
        this.f8608al = i;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.e.n$a */
    /* compiled from: MaterialMeta */
    public static class C3499a {

        /* renamed from: a */
        private String f8648a;

        /* renamed from: b */
        private String f8649b;

        /* renamed from: c */
        private String f8650c;

        /* renamed from: d */
        private String f8651d;

        /* renamed from: e */
        private String f8652e;

        /* renamed from: f */
        private String f8653f;

        /* renamed from: g */
        private String f8654g;

        /* renamed from: a */
        public String mo19760a() {
            return this.f8653f;
        }

        /* renamed from: a */
        public void mo19761a(String str) {
            this.f8653f = str;
        }

        /* renamed from: b */
        public String mo19762b() {
            return this.f8648a;
        }

        /* renamed from: b */
        public void mo19763b(String str) {
            this.f8648a = str;
        }

        /* renamed from: c */
        public String mo19764c() {
            return this.f8649b;
        }

        /* renamed from: c */
        public void mo19765c(String str) {
            this.f8649b = str;
        }

        /* renamed from: d */
        public String mo19766d() {
            return this.f8650c;
        }

        /* renamed from: d */
        public void mo19767d(String str) {
            this.f8650c = str;
        }

        /* renamed from: e */
        public String mo19768e() {
            return this.f8651d;
        }

        /* renamed from: e */
        public void mo19769e(String str) {
            this.f8651d = str;
        }

        /* renamed from: f */
        public String mo19770f() {
            return this.f8652e;
        }

        /* renamed from: f */
        public void mo19771f(String str) {
            this.f8652e = str;
        }

        /* renamed from: g */
        public String mo19772g() {
            return this.f8654g;
        }

        /* renamed from: g */
        public void mo19773g(String str) {
            this.f8654g = str;
        }
    }
}
