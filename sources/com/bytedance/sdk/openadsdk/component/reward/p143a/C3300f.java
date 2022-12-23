package com.bytedance.sdk.openadsdk.component.reward.p143a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.DownloadListener;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.p096c.C2643c;
import com.bytedance.sdk.component.p090a.C2561e;
import com.bytedance.sdk.component.p090a.C2562f;
import com.bytedance.sdk.component.p090a.C2582r;
import com.bytedance.sdk.component.p125f.C2952e;
import com.bytedance.sdk.component.p125f.C2955g;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.common.C3225a;
import com.bytedance.sdk.openadsdk.common.C3227c;
import com.bytedance.sdk.openadsdk.core.C3524h;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.C3728w;
import com.bytedance.sdk.openadsdk.core.p146b.C3429c;
import com.bytedance.sdk.openadsdk.core.p151e.C3485l;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.p151e.C3501p;
import com.bytedance.sdk.openadsdk.core.video.p163b.C3661a;
import com.bytedance.sdk.openadsdk.core.widget.p166a.C3747b;
import com.bytedance.sdk.openadsdk.core.widget.p166a.C3748c;
import com.bytedance.sdk.openadsdk.core.widget.p166a.C3749d;
import com.bytedance.sdk.openadsdk.p130b.C3156e;
import com.bytedance.sdk.openadsdk.p130b.C3171n;
import com.bytedance.sdk.openadsdk.p130b.C3185u;
import com.bytedance.sdk.openadsdk.p171g.C3803a;
import com.bytedance.sdk.openadsdk.p171g.C3807e;
import com.bytedance.sdk.openadsdk.p171g.C3811h;
import com.bytedance.sdk.openadsdk.p172h.C3815b;
import com.bytedance.sdk.openadsdk.p178j.C3855a;
import com.bytedance.sdk.openadsdk.p178j.C3859c;
import com.bytedance.sdk.openadsdk.p178j.C3888f;
import com.bytedance.sdk.openadsdk.p178j.C3890g;
import com.bytedance.sdk.openadsdk.utils.C3977b;
import com.bytedance.sdk.openadsdk.utils.C3999i;
import com.bytedance.sdk.openadsdk.utils.C4000j;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import com.bytedance.sdk.openadsdk.utils.C4020v;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.a.f */
/* compiled from: RewardFullWebViewManager */
public class C3300f {

    /* renamed from: I */
    private static final C3888f.C3889a f7853I = new C3888f.C3889a() {
        /* renamed from: a */
        public void mo18560a(String str, String str2) {
            C2975l.m8384b(str, str2);
        }

        /* renamed from: a */
        public void mo18561a(String str, String str2, Throwable th) {
            C2975l.m8388c(str, str2, th);
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: A */
    public float f7854A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public long f7855B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public SparseArray<C3429c.C3430a> f7856C = new SparseArray<>();
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f7857D = true;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public float f7858E = -1.0f;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public float f7859F = -1.0f;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public C3227c f7860G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public boolean f7861H;

    /* renamed from: a */
    C3728w f7862a;

    /* renamed from: b */
    C3728w f7863b;

    /* renamed from: c */
    protected boolean f7864c = true;

    /* renamed from: d */
    protected String f7865d;

    /* renamed from: e */
    C3171n f7866e;

    /* renamed from: f */
    AtomicBoolean f7867f = new AtomicBoolean(true);

    /* renamed from: g */
    int f7868g = 0;

    /* renamed from: h */
    String f7869h = "";

    /* renamed from: i */
    protected C3185u f7870i;

    /* renamed from: j */
    boolean f7871j = false;

    /* renamed from: k */
    protected C3803a f7872k = new C3803a() {
        /* renamed from: a */
        public int mo19142a() {
            int measuredHeight = C3300f.this.f7880s != null ? C3300f.this.f7880s.getMeasuredHeight() : -1;
            C2975l.m8387c("TTAndroidObject", "mWebView>>>>height=" + measuredHeight);
            return measuredHeight <= 0 ? C4020v.m13310d(C3578m.m11231a()) : measuredHeight;
        }

        /* renamed from: b */
        public int mo19143b() {
            int measuredWidth = C3300f.this.f7880s != null ? C3300f.this.f7880s.getMeasuredWidth() : -1;
            C2975l.m8387c("TTAndroidObject", "mWebView>>>>width=" + measuredWidth);
            return measuredWidth <= 0 ? C4020v.m13306c(C3578m.m11231a()) : measuredWidth;
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Activity f7873l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C3498n f7874m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public String f7875n;

    /* renamed from: o */
    private int f7876o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f7877p;

    /* renamed from: q */
    private int f7878q;

    /* renamed from: r */
    private int f7879r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public SSWebView f7880s;

    /* renamed from: t */
    private SSWebView f7881t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f7882u = false;

    /* renamed from: v */
    private boolean f7883v = false;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C3890g f7884w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public View f7885x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public View f7886y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public float f7887z;

    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.a.f$a */
    /* compiled from: RewardFullWebViewManager */
    public interface C3312a {
        /* renamed from: a */
        void mo18468a(WebView webView, int i);

        /* renamed from: a */
        void mo18469a(WebView webView, String str);

        /* renamed from: a */
        void mo18470a(WebView webView, String str, Bitmap bitmap);
    }

    /* renamed from: q */
    public void mo19129q() {
    }

    public C3300f(Activity activity) {
        this.f7873l = activity;
    }

    /* renamed from: a */
    public void mo19103a(C3498n nVar, String str, int i, boolean z) {
        if (!this.f7883v) {
            this.f7883v = true;
            this.f7874m = nVar;
            this.f7875n = str;
            this.f7876o = i;
            this.f7877p = z;
            mo19096a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo19096a() {
        C3227c cVar;
        this.f7885x = this.f7873l.findViewById(16908290);
        boolean d = C3485l.m10543d(this.f7874m);
        this.f7861H = d;
        if (!d || (cVar = this.f7860G) == null) {
            Activity activity = this.f7873l;
            SSWebView sSWebView = (SSWebView) activity.findViewById(C2984t.m8432e(activity, "tt_reward_browser_webview"));
            this.f7880s = sSWebView;
            if (sSWebView == null || C3498n.m10579a(this.f7874m)) {
                C4020v.m13282a((View) this.f7880s, 8);
            } else {
                this.f7880s.mo17923a();
            }
        } else {
            this.f7880s = cVar.mo18883d();
        }
        Activity activity2 = this.f7873l;
        SSWebView sSWebView2 = (SSWebView) activity2.findViewById(C2984t.m8432e(activity2, "tt_browser_webview_loading"));
        this.f7881t = sSWebView2;
        if (sSWebView2 == null || C3498n.m10579a(this.f7874m)) {
            C4020v.m13282a((View) this.f7881t, 8);
        } else {
            this.f7881t.mo17923a();
        }
        SSWebView sSWebView3 = this.f7880s;
        if (sSWebView3 != null) {
            sSWebView3.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                public void onGlobalLayout() {
                    if (C3300f.this.f7880s != null && C3300f.this.f7880s.getViewTreeObserver() != null) {
                        if (Build.VERSION.SDK_INT >= 16) {
                            C3300f.this.f7880s.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        } else {
                            C3300f.this.f7880s.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                        }
                        int measuredWidth = C3300f.this.f7880s.getMeasuredWidth();
                        int measuredHeight = C3300f.this.f7880s.getMeasuredHeight();
                        if (C3300f.this.f7880s.getVisibility() == 0) {
                            C3300f.this.mo19099a(measuredWidth, measuredHeight);
                        }
                    }
                }
            });
        }
        SSWebView sSWebView4 = this.f7881t;
        if (sSWebView4 != null) {
            sSWebView4.setLandingPage(true);
            this.f7881t.setTag(C3501p.m10761a(this.f7874m) ? this.f7875n : "landingpage_endcard");
            this.f7881t.setWebViewClient(new SSWebView.C2992a());
            C3498n nVar = this.f7874m;
            if (nVar != null) {
                this.f7881t.setMaterialMeta(nVar.mo19649aC());
            }
        }
    }

    /* renamed from: a */
    public void mo19105a(Boolean bool, String str, boolean z, C3807e eVar, String str2) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("rit_scene", str);
        }
        if (C3501p.m10761a(this.f7874m)) {
            hashMap.put("click_scence", 3);
        } else {
            hashMap.put("click_scence", 2);
        }
        this.f7870i = m9735A();
        C3728w wVar = new C3728w(this.f7873l);
        this.f7862a = wVar;
        int i = 7;
        C3728w a = wVar.mo20443b(this.f7880s).mo20426a(this.f7874m).mo20453d(this.f7874m.mo19622Y()).mo20457e(this.f7874m.mo19659ac()).mo20442b(bool.booleanValue() ? 7 : 5).mo20429a(this.f7872k).mo20459f(C4014u.m13239i(this.f7874m)).mo20423a(this.f7880s);
        if (m9765z()) {
            str2 = "landingpage_endcard";
        }
        a.mo20449c(str2).mo20435a((Map<String, Object>) hashMap).mo20424a(this.f7870i);
        C3728w wVar2 = new C3728w(this.f7873l);
        this.f7863b = wVar2;
        C3728w e = wVar2.mo20443b(this.f7881t).mo20426a(this.f7874m).mo20453d(this.f7874m.mo19622Y()).mo20457e(this.f7874m.mo19659ac());
        if (!bool.booleanValue()) {
            i = 5;
        }
        e.mo20442b(i).mo20423a(this.f7881t).mo20459f(C4014u.m13239i(this.f7874m)).mo20424a(this.f7870i);
        if (C3501p.m10761a(this.f7874m)) {
            mo19104a(eVar, z);
        }
        this.f7862a.mo20433a((C3811h) new C3811h() {
            /* renamed from: a */
            public void mo19144a() {
                SSWebView a = C3300f.this.f7880s;
                if (a == null) {
                    C2975l.m8384b("RewardFullWebViewManage", "webView has destroy when onPauseWebView");
                    return;
                }
                a.mo17951k();
                C2975l.m8384b("RewardFullWebViewManage", "js make webView onPause OK");
            }

            /* renamed from: b */
            public void mo19145b() {
                SSWebView a = C3300f.this.f7880s;
                if (a == null) {
                    C2975l.m8384b("RewardFullWebViewManage", "webView has destroy when onPauseWebViewTimers");
                    return;
                }
                a.mo17954n();
                C2975l.m8384b("RewardFullWebViewManage", "js make webView pauseTimers OK");
            }
        });
    }

    /* renamed from: a */
    public void mo19104a(final C3807e eVar, boolean z) {
        C2582r a;
        C33119 r7;
        if (C3524h.m10852d().mo19869s()) {
            C3888f.m12720a(f7853I);
        }
        C33097 r1 = new C3855a() {
            /* renamed from: a */
            public void mo18569a(JSONObject jSONObject) {
            }

            /* renamed from: b */
            public void mo18571b(JSONObject jSONObject) {
            }

            /* JADX WARNING: Removed duplicated region for block: B:27:0x0057  */
            /* JADX WARNING: Removed duplicated region for block: B:41:0x006e  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.bytedance.sdk.openadsdk.p178j.C3860d mo18568a() {
                /*
                    r7 = this;
                    java.lang.String r0 = com.bytedance.sdk.openadsdk.common.C3225a.m9415f()
                    int r1 = r0.hashCode()
                    r2 = 1653(0x675, float:2.316E-42)
                    r3 = 4
                    r4 = 3
                    r5 = 2
                    r6 = 1
                    if (r1 == r2) goto L_0x004a
                    r2 = 1684(0x694, float:2.36E-42)
                    if (r1 == r2) goto L_0x0040
                    r2 = 1715(0x6b3, float:2.403E-42)
                    if (r1 == r2) goto L_0x0036
                    r2 = 1746(0x6d2, float:2.447E-42)
                    if (r1 == r2) goto L_0x002c
                    r2 = 3649301(0x37af15, float:5.11376E-39)
                    if (r1 == r2) goto L_0x0022
                    goto L_0x0054
                L_0x0022:
                    java.lang.String r1 = "wifi"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x0054
                    r0 = r3
                    goto L_0x0055
                L_0x002c:
                    java.lang.String r1 = "5g"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x0054
                    r0 = r4
                    goto L_0x0055
                L_0x0036:
                    java.lang.String r1 = "4g"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x0054
                    r0 = r5
                    goto L_0x0055
                L_0x0040:
                    java.lang.String r1 = "3g"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x0054
                    r0 = r6
                    goto L_0x0055
                L_0x004a:
                    java.lang.String r1 = "2g"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x0054
                    r0 = 0
                    goto L_0x0055
                L_0x0054:
                    r0 = -1
                L_0x0055:
                    if (r0 == 0) goto L_0x006e
                    if (r0 == r6) goto L_0x006b
                    if (r0 == r5) goto L_0x0068
                    if (r0 == r4) goto L_0x0065
                    if (r0 == r3) goto L_0x0062
                    com.bytedance.sdk.openadsdk.j.d r0 = com.bytedance.sdk.openadsdk.p178j.C3860d.TYPE_UNKNOWN
                    return r0
                L_0x0062:
                    com.bytedance.sdk.openadsdk.j.d r0 = com.bytedance.sdk.openadsdk.p178j.C3860d.TYPE_WIFI
                    return r0
                L_0x0065:
                    com.bytedance.sdk.openadsdk.j.d r0 = com.bytedance.sdk.openadsdk.p178j.C3860d.TYPE_5G
                    return r0
                L_0x0068:
                    com.bytedance.sdk.openadsdk.j.d r0 = com.bytedance.sdk.openadsdk.p178j.C3860d.TYPE_4G
                    return r0
                L_0x006b:
                    com.bytedance.sdk.openadsdk.j.d r0 = com.bytedance.sdk.openadsdk.p178j.C3860d.TYPE_3G
                    return r0
                L_0x006e:
                    com.bytedance.sdk.openadsdk.j.d r0 = com.bytedance.sdk.openadsdk.p178j.C3860d.TYPE_2G
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.C33097.mo18568a():com.bytedance.sdk.openadsdk.j.d");
            }

            /* renamed from: b */
            public void mo18570b() {
                C3300f.this.f7862a.mo20455d(true);
                C3807e eVar = eVar;
                if (eVar != null) {
                    eVar.mo18488a();
                }
            }

            /* renamed from: c */
            public void mo18572c(JSONObject jSONObject) {
                C3156e.m9195b(C3578m.m11231a(), C3300f.this.f7874m, C3300f.this.f7875n, "playable_track", jSONObject);
            }
        };
        C33108 r72 = new C3859c() {
            /* renamed from: a */
            public void mo18573a(String str, JSONObject jSONObject) {
                C3300f.this.f7862a.mo20439a(str, jSONObject);
            }
        };
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(BidResponsedEx.KEY_CID, this.f7874m.mo19622Y());
            jSONObject.put("log_extra", this.f7874m.mo19659ac());
            C3890g a2 = C3890g.m12726a(C3578m.m11231a(), this.f7880s.getWebView(), r72, r1).mo20752f(this.f7865d).mo20749e(C3225a.m9410a(C3578m.m11231a())).mo20727a(C3225a.m9409a()).mo20729a(jSONObject).mo20728a("sdkEdition", C3225a.m9412c()).mo20736b(C3225a.m9414e()).mo20746d(C3225a.m9413d()).mo20742c(false).mo20730a(z);
            this.f7884w = a2;
            if (a2 == null) {
                r7 = new C2955g("PlayablePlugin_init") {
                    public void run() {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("PlayablePlugin_is_null", true);
                            C3815b.m12552a().mo20663a("PlayablePlugin_init", jSONObject);
                        } catch (Exception unused) {
                        }
                    }
                };
                C2952e.m8308a(r7, 5);
            }
        } catch (Throwable unused) {
            if (this.f7884w == null) {
                r7 = new C2955g("PlayablePlugin_init") {
                    public void run() {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("PlayablePlugin_is_null", true);
                            C3815b.m12552a().mo20663a("PlayablePlugin_init", jSONObject);
                        } catch (Exception unused) {
                        }
                    }
                };
            }
        }
        if (this.f7884w != null && !TextUtils.isEmpty(C3501p.m10762b(this.f7874m))) {
            this.f7884w.mo20741c(C3501p.m10762b(this.f7874m));
        }
        C3890g gVar = this.f7884w;
        if (gVar != null) {
            Set<String> j = gVar.mo20760j();
            final WeakReference weakReference = new WeakReference(this.f7884w);
            for (String next : j) {
                if (!"subscribe_app_ad".equals(next) && !"adInfo".equals(next) && !"webview_time_track".equals(next) && !"download_app_ad".equals(next) && (a = this.f7862a.mo20419a()) != null) {
                    a.mo16603a(next, (C2561e<?, ?>) new C2561e<JSONObject, JSONObject>() {
                        /* renamed from: a */
                        public JSONObject mo16564a(JSONObject jSONObject, C2562f fVar) throws Exception {
                            try {
                                C3890g gVar = (C3890g) weakReference.get();
                                if (gVar == null) {
                                    return null;
                                }
                                return gVar.mo20744c(mo16549a(), jSONObject);
                            } catch (Throwable unused) {
                                return null;
                            }
                        }
                    });
                }
            }
        }
    }

    /* renamed from: a */
    public void mo19099a(int i, int i2) {
        Activity activity;
        if (this.f7862a != null && (activity = this.f7873l) != null && !activity.isFinishing()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("width", i);
                jSONObject.put("height", i2);
                this.f7862a.mo20439a(MraidJsMethods.RESIZE, jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo19107a(boolean z) {
        this.f7864c = z;
    }

    /* renamed from: b */
    public void mo19110b() {
        if (TextUtils.isEmpty(this.f7865d) || !this.f7865d.contains("play.google.com/store")) {
            SSWebView sSWebView = this.f7880s;
            if (sSWebView != null && this.f7864c) {
                C4000j.m13115a(sSWebView, this.f7865d + "&is_pre_render=1");
                return;
            }
            return;
        }
        this.f7871j = true;
    }

    /* renamed from: b */
    public void mo19111b(int i, int i2) {
        this.f7878q = i;
        this.f7879r = i2;
    }

    /* renamed from: c */
    public SSWebView mo19113c() {
        return this.f7880s;
    }

    /* renamed from: d */
    public SSWebView mo19115d() {
        return this.f7881t;
    }

    /* renamed from: e */
    public C3728w mo19117e() {
        return this.f7862a;
    }

    /* renamed from: f */
    public C3728w mo19118f() {
        return this.f7863b;
    }

    /* renamed from: g */
    public C3171n mo19119g() {
        return this.f7866e;
    }

    /* renamed from: h */
    public void mo19120h() {
        this.f7865d = C3501p.m10764d(this.f7874m);
        float an = this.f7874m.mo19670an();
        if (!TextUtils.isEmpty(this.f7865d)) {
            if (this.f7876o == 1) {
                if (this.f7865d.contains("?")) {
                    this.f7865d += "&orientation=portrait";
                } else {
                    this.f7865d += "?orientation=portrait";
                }
            }
            if (this.f7865d.contains("?")) {
                this.f7865d += "&height=" + this.f7879r + "&width=" + this.f7878q + "&aspect_ratio=" + an;
            } else {
                this.f7865d += "?height=" + this.f7879r + "&width=" + this.f7878q + "&aspect_ratio=" + an;
            }
        }
        if (!C3501p.m10761a(this.f7874m)) {
            this.f7865d = C3977b.m13032a(this.f7865d);
        }
    }

    /* renamed from: i */
    public void mo19121i() {
        SSWebView sSWebView;
        C3171n nVar = this.f7866e;
        if (!(nVar == null || (sSWebView = this.f7880s) == null)) {
            nVar.mo18785a(sSWebView);
        }
        this.f7880s = null;
        C3185u uVar = this.f7870i;
        if (uVar != null) {
            uVar.mo18813a(true);
            this.f7870i.mo18833m();
        }
        C3728w wVar = this.f7862a;
        if (wVar != null) {
            wVar.mo20468n();
        }
        C3171n nVar2 = this.f7866e;
        if (nVar2 != null) {
            nVar2.mo18792f();
        }
        C3890g gVar = this.f7884w;
        if (gVar != null) {
            gVar.mo20772v();
        }
        this.f7873l = null;
    }

    /* renamed from: a */
    public void mo19098a(int i) {
        C3498n nVar;
        C4020v.m13282a((View) this.f7880s, i);
        SSWebView sSWebView = this.f7880s;
        if (sSWebView != null) {
            C4020v.m13282a((View) sSWebView.getWebView(), i);
        }
        if (this.f7880s != null && (nVar = this.f7874m) != null) {
            if (nVar.mo19602E() || C3501p.m10761a(this.f7874m)) {
                this.f7880s.setLandingPage(true);
                this.f7880s.setTag(C3501p.m10761a(this.f7874m) ? this.f7875n : "landingpage_endcard");
                C3498n nVar2 = this.f7874m;
                if (nVar2 != null) {
                    this.f7880s.setMaterialMeta(nVar2.mo19649aC());
                }
            }
        }
    }

    /* renamed from: a */
    public void mo19102a(C3227c cVar) {
        this.f7860G = cVar;
    }

    /* renamed from: a */
    public void mo19097a(float f) {
        C4020v.m13281a((View) this.f7880s, f);
    }

    /* renamed from: b */
    public void mo19112b(boolean z) {
        Activity activity;
        if (this.f7862a != null && (activity = this.f7873l) != null && !activity.isFinishing()) {
            try {
                this.f7862a.mo20445b(z);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo19106a(String str, final C3312a aVar) {
        SSWebView sSWebView;
        SSWebView sSWebView2 = this.f7880s;
        if (!(sSWebView2 == null || sSWebView2.getWebView() == null)) {
            C3171n a = new C3171n(this.f7873l, this.f7874m, this.f7880s.getWebView()).mo18777a(true);
            this.f7866e = a;
            a.mo18777a(true);
            C3171n nVar = this.f7866e;
            if (m9765z()) {
                str = "landingpage_endcard";
            }
            nVar.mo18787a(str);
            final C3312a aVar2 = aVar;
            this.f7880s.setWebViewClient(new C3749d(C3578m.m11231a(), this.f7862a, this.f7874m.mo19622Y(), this.f7866e, this.f7874m.mo19602E() || C3501p.m10761a(this.f7874m)) {
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    if (!C3501p.m10761a(C3300f.this.f7874m)) {
                        return super.shouldInterceptRequest(webView, str);
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    WebResourceResponse a = C3661a.m11659a().mo20256a(C3300f.this.f7874m.mo19607J().mo16363k(), C3300f.this.f7874m.mo19607J().mo16362j(), str);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (C3300f.this.f7870i != null) {
                        C2643c.C2644a a2 = C2643c.m6902a(str);
                        int i = a != null ? 1 : 2;
                        if (a2 == C2643c.C2644a.HTML) {
                            C3300f.this.f7870i.mo18811a(str, currentTimeMillis, currentTimeMillis2, i);
                        } else if (a2 == C2643c.C2644a.JS) {
                            C3300f.this.f7870i.mo18818b(str, currentTimeMillis, currentTimeMillis2, i);
                        }
                    }
                    return a;
                }

                public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                    try {
                        return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
                    } catch (Throwable th) {
                        C2975l.m8388c("RewardFullWebViewManage", "shouldInterceptRequest error1", th);
                        return super.shouldInterceptRequest(webView, webResourceRequest);
                    }
                }

                public void onReceivedError(WebView webView, int i, String str, String str2) {
                    Log.i("RewardFullWebViewManage", "onReceivedError: description=" + str + "  url =" + str2);
                    if (!C3300f.this.m9743a(str2)) {
                        C3300f.this.f7867f.set(false);
                        C3300f.this.f7868g = i;
                        C3300f.this.f7869h = str;
                        try {
                            if (C3300f.this.f7884w != null) {
                                C3300f.this.f7884w.mo20732a(i, str, str2);
                            }
                        } catch (Throwable unused) {
                        }
                        if (C3300f.this.f7870i != null) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                if (Build.VERSION.SDK_INT >= 23) {
                                    jSONObject.put("code", i);
                                    jSONObject.put("msg", str);
                                }
                                C3300f.this.f7870i.mo18812a(jSONObject);
                            } catch (JSONException unused2) {
                            }
                        }
                        super.onReceivedError(webView, i, str, str2);
                    }
                }

                public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                    if (!(webResourceError == null || webResourceRequest == null || webResourceRequest.getUrl() == null)) {
                        Log.i("RewardFullWebViewManage", "onReceivedError WebResourceError : description=" + webResourceError.getDescription() + "  url =" + webResourceRequest.getUrl().toString());
                    }
                    if (webResourceRequest == null || webResourceRequest.getUrl() == null || !C3300f.this.m9743a(webResourceRequest.getUrl().toString())) {
                        C3300f.this.f7867f.set(false);
                        if (C3300f.this.f7870i != null) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                if (Build.VERSION.SDK_INT >= 23 && webResourceError != null) {
                                    jSONObject.put("code", webResourceError.getErrorCode());
                                    jSONObject.put("msg", webResourceError.getDescription());
                                }
                                C3300f.this.f7870i.mo18812a(jSONObject);
                            } catch (JSONException unused) {
                            }
                        }
                        if (webResourceError != null) {
                            C3300f.this.f7868g = webResourceError.getErrorCode();
                            C3300f.this.f7869h = String.valueOf(webResourceError.getDescription());
                        }
                        if (webResourceRequest != null) {
                            super.onReceivedError(webView, webResourceRequest, webResourceError);
                        }
                    }
                }

                public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                    try {
                        if (C3300f.this.f7884w != null) {
                            C3300f.this.f7884w.mo20735a(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
                        }
                    } catch (Throwable unused) {
                    }
                    if (!(webResourceRequest == null || webResourceRequest.getUrl() == null)) {
                        Log.i("RewardFullWebViewManage", "onReceivedHttpError:url =" + webResourceRequest.getUrl().toString());
                    }
                    if (webResourceRequest != null && !TextUtils.isEmpty(C3300f.this.f7865d) && C3300f.this.f7865d.equals(String.valueOf(webResourceRequest.getUrl()))) {
                        C3300f.this.f7867f.set(false);
                        if (webResourceResponse != null) {
                            C3300f.this.f7868g = webResourceResponse.getStatusCode();
                            C3300f.this.f7869h = "onReceivedHttpError";
                        }
                    }
                    if (C3300f.this.f7870i != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (Build.VERSION.SDK_INT >= 21 && webResourceResponse != null) {
                                jSONObject.put("code", webResourceResponse.getStatusCode());
                                jSONObject.put("msg", webResourceResponse.getReasonPhrase());
                            }
                            C3300f.this.f7870i.mo18812a(jSONObject);
                        } catch (JSONException unused2) {
                        }
                    }
                    if (webResourceRequest != null) {
                        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                    }
                }

                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    if (C3300f.this.f7870i != null) {
                        C3300f.this.f7870i.mo18826f();
                    }
                    if (C3300f.this.f7884w != null) {
                        C3300f.this.f7884w.mo20756h(str);
                    }
                    C3312a aVar = aVar2;
                    if (aVar != null) {
                        aVar.mo18469a(webView, str);
                    }
                }

                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                    if (C3300f.this.f7870i != null) {
                        C3300f.this.f7870i.mo18824e();
                    }
                    if (C3300f.this.f7884w != null) {
                        C3300f.this.f7884w.mo20755g(str);
                    }
                    C3312a aVar = aVar2;
                    if (aVar != null) {
                        aVar.mo18470a(webView, str, bitmap);
                    }
                }
            });
            if (!(!this.f7874m.mo19602E() || (sSWebView = this.f7880s) == null || sSWebView.getWebView() == null)) {
                this.f7880s.getWebView().setOnTouchListener(new View.OnTouchListener() {
                    /* JADX WARNING: Can't wrap try/catch for region: R(6:32|33|34|(1:38)|39|40) */
                    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0152 */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public boolean onTouch(android.view.View r20, android.view.MotionEvent r21) {
                        /*
                            r19 = this;
                            r1 = r19
                            java.lang.String r0 = "tt_id_click_end"
                            java.lang.String r2 = "tt_id_click_begin"
                            r3 = 0
                            int r4 = r21.getActionMasked()     // Catch:{ all -> 0x0360 }
                            r5 = 0
                            r7 = 3
                            r8 = -1
                            r9 = 2
                            r10 = 1
                            if (r4 == 0) goto L_0x00e9
                            if (r4 == r10) goto L_0x00e7
                            if (r4 == r9) goto L_0x001f
                            if (r4 == r7) goto L_0x001c
                            r12 = r8
                            goto L_0x015f
                        L_0x001c:
                            r7 = 4
                            goto L_0x00e7
                        L_0x001f:
                            float r2 = r21.getRawX()     // Catch:{ all -> 0x0360 }
                            float r4 = r21.getRawY()     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r7 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            float r7 = r7.f7887z     // Catch:{ all -> 0x0360 }
                            float r2 = r2 - r7
                            float r2 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x0360 }
                            int r7 = com.bytedance.sdk.openadsdk.core.C3578m.f9006a     // Catch:{ all -> 0x0360 }
                            float r7 = (float) r7     // Catch:{ all -> 0x0360 }
                            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                            if (r2 >= 0) goto L_0x004c
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            float r2 = r2.f7854A     // Catch:{ all -> 0x0360 }
                            float r2 = r4 - r2
                            float r2 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x0360 }
                            int r7 = com.bytedance.sdk.openadsdk.core.C3578m.f9006a     // Catch:{ all -> 0x0360 }
                            float r7 = (float) r7     // Catch:{ all -> 0x0360 }
                            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                            if (r2 < 0) goto L_0x0051
                        L_0x004c:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            boolean unused = r2.f7857D = r3     // Catch:{ all -> 0x0360 }
                        L_0x0051:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r7 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            float r7 = r7.f7858E     // Catch:{ all -> 0x0360 }
                            float r11 = r21.getX()     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r12 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            float r12 = r12.f7887z     // Catch:{ all -> 0x0360 }
                            float r11 = r11 - r12
                            float r11 = java.lang.Math.abs(r11)     // Catch:{ all -> 0x0360 }
                            float r7 = r7 + r11
                            float unused = r2.f7858E = r7     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r7 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            float r7 = r7.f7859F     // Catch:{ all -> 0x0360 }
                            float r11 = r21.getY()     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r12 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            float r12 = r12.f7854A     // Catch:{ all -> 0x0360 }
                            float r11 = r11 - r12
                            float r11 = java.lang.Math.abs(r11)     // Catch:{ all -> 0x0360 }
                            float r7 = r7 + r11
                            float unused = r2.f7859F = r7     // Catch:{ all -> 0x0360 }
                            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            long r13 = r2.f7855B     // Catch:{ all -> 0x0360 }
                            long r11 = r11 - r13
                            r13 = 200(0xc8, double:9.9E-322)
                            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                            r7 = 1090519040(0x41000000, float:8.0)
                            if (r2 <= 0) goto L_0x00b0
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            float r2 = r2.f7858E     // Catch:{ all -> 0x0360 }
                            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                            if (r2 > 0) goto L_0x00ae
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            float r2 = r2.f7859F     // Catch:{ all -> 0x0360 }
                            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                            if (r2 <= 0) goto L_0x00b0
                        L_0x00ae:
                            r2 = r10
                            goto L_0x00b1
                        L_0x00b0:
                            r2 = r9
                        L_0x00b1:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r11 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            boolean r11 = r11.f7861H     // Catch:{ all -> 0x0360 }
                            if (r11 == 0) goto L_0x00e4
                            com.bytedance.sdk.openadsdk.component.reward.a.f r11 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            float r11 = r11.f7854A     // Catch:{ all -> 0x0360 }
                            float r11 = r4 - r11
                            int r7 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
                            if (r7 <= 0) goto L_0x00ce
                            com.bytedance.sdk.openadsdk.component.reward.a.f r7 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.common.c r7 = r7.f7860G     // Catch:{ all -> 0x0360 }
                            r7.mo18879a()     // Catch:{ all -> 0x0360 }
                        L_0x00ce:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r7 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            float r7 = r7.f7854A     // Catch:{ all -> 0x0360 }
                            float r4 = r4 - r7
                            r7 = -1056964608(0xffffffffc1000000, float:-8.0)
                            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                            if (r4 >= 0) goto L_0x00e4
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.common.c r4 = r4.f7860G     // Catch:{ all -> 0x0360 }
                            r4.mo18881b()     // Catch:{ all -> 0x0360 }
                        L_0x00e4:
                            r12 = r2
                            goto L_0x015f
                        L_0x00e7:
                            r12 = r7
                            goto L_0x015f
                        L_0x00e9:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            android.util.SparseArray r7 = new android.util.SparseArray     // Catch:{ all -> 0x0360 }
                            r7.<init>()     // Catch:{ all -> 0x0360 }
                            android.util.SparseArray unused = r4.f7856C = r7     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            float r7 = r21.getRawX()     // Catch:{ all -> 0x0360 }
                            float unused = r4.f7887z = r7     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            float r7 = r21.getRawY()     // Catch:{ all -> 0x0360 }
                            float unused = r4.f7854A = r7     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0360 }
                            long unused = r4.f7855B = r11     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ Exception -> 0x0152 }
                            com.bytedance.sdk.component.widget.SSWebView r4 = r4.f7880s     // Catch:{ Exception -> 0x0152 }
                            android.webkit.WebView r4 = r4.getWebView()     // Catch:{ Exception -> 0x0152 }
                            android.content.Context r7 = com.bytedance.sdk.openadsdk.core.C3578m.m11231a()     // Catch:{ Exception -> 0x0152 }
                            int r7 = com.bytedance.sdk.component.utils.C2984t.m8432e(r7, r2)     // Catch:{ Exception -> 0x0152 }
                            java.lang.Object r4 = r4.getTag(r7)     // Catch:{ Exception -> 0x0152 }
                            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ Exception -> 0x0152 }
                            long r11 = r4.longValue()     // Catch:{ Exception -> 0x0152 }
                            int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                            if (r4 <= 0) goto L_0x0152
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ Exception -> 0x0152 }
                            long r13 = r4.f7855B     // Catch:{ Exception -> 0x0152 }
                            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                            if (r4 >= 0) goto L_0x0152
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ Exception -> 0x0152 }
                            long unused = r4.f7855B = r11     // Catch:{ Exception -> 0x0152 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ Exception -> 0x0152 }
                            com.bytedance.sdk.component.widget.SSWebView r4 = r4.f7880s     // Catch:{ Exception -> 0x0152 }
                            android.content.Context r7 = com.bytedance.sdk.openadsdk.core.C3578m.m11231a()     // Catch:{ Exception -> 0x0152 }
                            int r2 = com.bytedance.sdk.component.utils.C2984t.m8432e(r7, r2)     // Catch:{ Exception -> 0x0152 }
                            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0152 }
                            r4.setTag(r2, r7)     // Catch:{ Exception -> 0x0152 }
                        L_0x0152:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
                            float unused = r2.f7858E = r4     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            float unused = r2.f7859F = r4     // Catch:{ all -> 0x0360 }
                            r12 = r3
                        L_0x015f:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            android.util.SparseArray r2 = r2.f7856C     // Catch:{ all -> 0x0360 }
                            int r4 = r21.getActionMasked()     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.core.b.c$a r7 = new com.bytedance.sdk.openadsdk.core.b.c$a     // Catch:{ all -> 0x0360 }
                            float r11 = r21.getSize()     // Catch:{ all -> 0x0360 }
                            double r13 = (double) r11     // Catch:{ all -> 0x0360 }
                            float r11 = r21.getPressure()     // Catch:{ all -> 0x0360 }
                            double r8 = (double) r11     // Catch:{ all -> 0x0360 }
                            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0360 }
                            r11 = r7
                            r15 = r8
                            r11.<init>(r12, r13, r15, r17)     // Catch:{ all -> 0x0360 }
                            r2.put(r4, r7)     // Catch:{ all -> 0x0360 }
                            int r2 = r21.getAction()     // Catch:{ all -> 0x0360 }
                            if (r2 != r10) goto L_0x0368
                            int r2 = r20.getVisibility()     // Catch:{ all -> 0x0360 }
                            if (r2 != 0) goto L_0x0368
                            float r2 = r20.getAlpha()     // Catch:{ all -> 0x0360 }
                            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ all -> 0x0360 }
                            int r2 = r2.intValue()     // Catch:{ all -> 0x0360 }
                            if (r2 != r10) goto L_0x0368
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            boolean r2 = r2.f7882u     // Catch:{ all -> 0x0360 }
                            if (r2 != 0) goto L_0x0368
                            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0360 }
                            r2.<init>()     // Catch:{ all -> 0x0360 }
                            java.lang.String r4 = "down_x"
                            com.bytedance.sdk.openadsdk.component.reward.a.f r7 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            float r7 = r7.f7887z     // Catch:{ all -> 0x0360 }
                            double r7 = (double) r7     // Catch:{ all -> 0x0360 }
                            r2.put(r4, r7)     // Catch:{ all -> 0x0360 }
                            java.lang.String r4 = "down_y"
                            com.bytedance.sdk.openadsdk.component.reward.a.f r7 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            float r7 = r7.f7854A     // Catch:{ all -> 0x0360 }
                            double r7 = (double) r7     // Catch:{ all -> 0x0360 }
                            r2.put(r4, r7)     // Catch:{ all -> 0x0360 }
                            java.lang.String r4 = "down_time"
                            com.bytedance.sdk.openadsdk.component.reward.a.f r7 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            long r7 = r7.f7855B     // Catch:{ all -> 0x0360 }
                            r2.put(r4, r7)     // Catch:{ all -> 0x0360 }
                            java.lang.String r4 = "up_x"
                            float r7 = r21.getRawX()     // Catch:{ all -> 0x0360 }
                            double r7 = (double) r7     // Catch:{ all -> 0x0360 }
                            r2.put(r4, r7)     // Catch:{ all -> 0x0360 }
                            java.lang.String r4 = "up_y"
                            float r7 = r21.getRawY()     // Catch:{ all -> 0x0360 }
                            double r7 = (double) r7     // Catch:{ all -> 0x0360 }
                            r2.put(r4, r7)     // Catch:{ all -> 0x0360 }
                            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ Exception -> 0x021e }
                            com.bytedance.sdk.component.widget.SSWebView r4 = r4.f7880s     // Catch:{ Exception -> 0x021e }
                            android.webkit.WebView r4 = r4.getWebView()     // Catch:{ Exception -> 0x021e }
                            android.content.Context r9 = com.bytedance.sdk.openadsdk.core.C3578m.m11231a()     // Catch:{ Exception -> 0x021e }
                            int r9 = com.bytedance.sdk.component.utils.C2984t.m8432e(r9, r0)     // Catch:{ Exception -> 0x021e }
                            java.lang.Object r4 = r4.getTag(r9)     // Catch:{ Exception -> 0x021e }
                            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ Exception -> 0x021e }
                            long r11 = r4.longValue()     // Catch:{ Exception -> 0x021e }
                            int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                            if (r4 <= 0) goto L_0x021e
                            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
                            if (r4 >= 0) goto L_0x021e
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ Exception -> 0x021d }
                            com.bytedance.sdk.component.widget.SSWebView r4 = r4.f7880s     // Catch:{ Exception -> 0x021d }
                            android.content.Context r5 = com.bytedance.sdk.openadsdk.core.C3578m.m11231a()     // Catch:{ Exception -> 0x021d }
                            int r0 = com.bytedance.sdk.component.utils.C2984t.m8432e(r5, r0)     // Catch:{ Exception -> 0x021d }
                            r5 = -1
                            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x021d }
                            r4.setTag(r0, r5)     // Catch:{ Exception -> 0x021d }
                        L_0x021d:
                            r7 = r11
                        L_0x021e:
                            java.lang.String r0 = "up_time"
                            r2.put(r0, r7)     // Catch:{ all -> 0x0360 }
                            r0 = 2
                            int[] r4 = new int[r0]     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            boolean r0 = r0.f7861H     // Catch:{ all -> 0x0360 }
                            if (r0 == 0) goto L_0x0248
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r5 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            android.app.Activity r5 = r5.f7873l     // Catch:{ all -> 0x0360 }
                            android.content.Context r6 = com.bytedance.sdk.openadsdk.core.C3578m.m11231a()     // Catch:{ all -> 0x0360 }
                            java.lang.String r7 = "tt_title_bar_feedback"
                            int r6 = com.bytedance.sdk.component.utils.C2984t.m8432e(r6, r7)     // Catch:{ all -> 0x0360 }
                            android.view.View r5 = r5.findViewById(r6)     // Catch:{ all -> 0x0360 }
                            android.view.View unused = r0.f7886y = r5     // Catch:{ all -> 0x0360 }
                            goto L_0x0261
                        L_0x0248:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r5 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            android.app.Activity r5 = r5.f7873l     // Catch:{ all -> 0x0360 }
                            android.content.Context r6 = com.bytedance.sdk.openadsdk.core.C3578m.m11231a()     // Catch:{ all -> 0x0360 }
                            java.lang.String r7 = "tt_top_dislike"
                            int r6 = com.bytedance.sdk.component.utils.C2984t.m8432e(r6, r7)     // Catch:{ all -> 0x0360 }
                            android.view.View r5 = r5.findViewById(r6)     // Catch:{ all -> 0x0360 }
                            android.view.View unused = r0.f7886y = r5     // Catch:{ all -> 0x0360 }
                        L_0x0261:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            android.view.View r0 = r0.f7886y     // Catch:{ all -> 0x0360 }
                            if (r0 == 0) goto L_0x029e
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            android.view.View r0 = r0.f7886y     // Catch:{ all -> 0x0360 }
                            r0.getLocationOnScreen(r4)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "button_x"
                            r5 = r4[r3]     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r5)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "button_y"
                            r4 = r4[r10]     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r4)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "button_width"
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            android.view.View r4 = r4.f7886y     // Catch:{ all -> 0x0360 }
                            int r4 = r4.getWidth()     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r4)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "button_height"
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            android.view.View r4 = r4.f7886y     // Catch:{ all -> 0x0360 }
                            int r4 = r4.getHeight()     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r4)     // Catch:{ all -> 0x0360 }
                        L_0x029e:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            android.view.View r0 = r0.f7885x     // Catch:{ all -> 0x0360 }
                            if (r0 == 0) goto L_0x02de
                            r0 = 2
                            int[] r4 = new int[r0]     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            android.view.View r0 = r0.f7885x     // Catch:{ all -> 0x0360 }
                            r0.getLocationOnScreen(r4)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "ad_x"
                            r5 = r4[r3]     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r5)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "ad_y"
                            r4 = r4[r10]     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r4)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "width"
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            android.view.View r4 = r4.f7885x     // Catch:{ all -> 0x0360 }
                            int r4 = r4.getWidth()     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r4)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "height"
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            android.view.View r4 = r4.f7885x     // Catch:{ all -> 0x0360 }
                            int r4 = r4.getHeight()     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r4)     // Catch:{ all -> 0x0360 }
                        L_0x02de:
                            java.lang.String r0 = "toolType"
                            r4 = r21
                            int r5 = r4.getToolType(r3)     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r5)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "deviceId"
                            int r5 = r21.getDeviceId()     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r5)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "source"
                            int r4 = r21.getSource()     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r4)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "ft"
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            android.util.SparseArray r4 = r4.f7856C     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.core.h r5 = com.bytedance.sdk.openadsdk.core.C3524h.m10852d()     // Catch:{ all -> 0x0360 }
                            boolean r5 = r5.mo19842b()     // Catch:{ all -> 0x0360 }
                            if (r5 == 0) goto L_0x030f
                            r5 = r10
                            goto L_0x0310
                        L_0x030f:
                            r5 = 2
                        L_0x0310:
                            org.json.JSONObject r4 = com.bytedance.sdk.openadsdk.core.p151e.C3476g.m10439a(r4, r5)     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r4)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "user_behavior_type"
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            boolean r4 = r4.f7857D     // Catch:{ all -> 0x0360 }
                            if (r4 == 0) goto L_0x0323
                            r4 = r10
                            goto L_0x0324
                        L_0x0323:
                            r4 = 2
                        L_0x0324:
                            r2.put(r0, r4)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "click_scence"
                            r4 = 2
                            r2.put(r0, r4)     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            boolean r0 = r0.f7877p     // Catch:{ all -> 0x0360 }
                            java.lang.String r4 = "click"
                            if (r0 == 0) goto L_0x0349
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            android.app.Activity r0 = r0.f7873l     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r5 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.core.e.n r5 = r5.f7874m     // Catch:{ all -> 0x0360 }
                            java.lang.String r6 = "rewarded_video"
                            com.bytedance.sdk.openadsdk.p130b.C3156e.m9173a((android.content.Context) r0, (com.bytedance.sdk.openadsdk.core.p151e.C3498n) r5, (java.lang.String) r6, (java.lang.String) r4, (org.json.JSONObject) r2)     // Catch:{ all -> 0x0360 }
                            goto L_0x035a
                        L_0x0349:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            android.app.Activity r0 = r0.f7873l     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r5 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.core.e.n r5 = r5.f7874m     // Catch:{ all -> 0x0360 }
                            java.lang.String r6 = "fullscreen_interstitial_ad"
                            com.bytedance.sdk.openadsdk.p130b.C3156e.m9173a((android.content.Context) r0, (com.bytedance.sdk.openadsdk.core.p151e.C3498n) r5, (java.lang.String) r6, (java.lang.String) r4, (org.json.JSONObject) r2)     // Catch:{ all -> 0x0360 }
                        L_0x035a:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.this     // Catch:{ all -> 0x0360 }
                            boolean unused = r0.f7882u = r10     // Catch:{ all -> 0x0360 }
                            goto L_0x0368
                        L_0x0360:
                            r0 = move-exception
                            java.lang.String r2 = "RewardFullWebViewManage"
                            java.lang.String r4 = "TouchRecordTool onTouch error"
                            android.util.Log.e(r2, r4, r0)
                        L_0x0368:
                            return r3
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f.C33042.onTouch(android.view.View, android.view.MotionEvent):boolean");
                    }
                });
            }
            this.f7880s.setWebChromeClient(new C3748c(this.f7862a, this.f7866e) {
                public void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                    C3312a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo18468a(webView, i);
                    }
                }
            });
            mo19101a(this.f7880s);
            if (Build.VERSION.SDK_INT >= 24) {
                this.f7880s.setLayerType(1, (Paint) null);
            }
            this.f7880s.setBackgroundColor(-1);
            this.f7880s.setDisplayZoomControls(false);
        }
        mo19110b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m9743a(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        C3498n nVar = this.f7874m;
        if (nVar == null || !nVar.mo19602E() || !str.endsWith(".mp4")) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    private boolean m9765z() {
        String str = this.f7865d;
        if (str == null) {
            return false;
        }
        try {
            return Uri.parse(str).getQueryParameterNames().contains("show_landingpage");
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public void mo19100a(DownloadListener downloadListener) {
        SSWebView sSWebView = this.f7880s;
        if (sSWebView != null && downloadListener != null) {
            sSWebView.setDownloadListener(downloadListener);
        }
    }

    /* renamed from: j */
    public boolean mo19122j() {
        return this.f7867f.get();
    }

    /* renamed from: a */
    public void mo19101a(SSWebView sSWebView) {
        if (sSWebView != null) {
            C3747b.m12300a((Context) this.f7873l).mo20536a(false).mo20538b(false).mo20537a(sSWebView.getWebView());
            sSWebView.setUserAgentString(C3999i.m13113a(sSWebView.getWebView(), (int) BuildConfig.VERSION_CODE));
            if (Build.VERSION.SDK_INT >= 21) {
                sSWebView.setMixedContentMode(0);
            }
        }
    }

    /* renamed from: k */
    public void mo19123k() {
        C3185u uVar = this.f7870i;
        if (uVar != null) {
            uVar.mo18830j();
        }
        C3171n nVar = this.f7866e;
        if (nVar != null) {
            nVar.mo18791e();
        }
    }

    /* renamed from: l */
    public void mo19124l() {
        SSWebView sSWebView = this.f7880s;
        if (sSWebView != null) {
            sSWebView.mo17951k();
        }
        C3728w wVar = this.f7862a;
        if (wVar != null) {
            wVar.mo20467m();
            this.f7862a.mo20445b(false);
            mo19114c(false);
            mo19109a(true, false);
        }
        C3890g gVar = this.f7884w;
        if (gVar != null) {
            gVar.mo20767q();
            this.f7884w.mo20737b(false);
        }
    }

    /* renamed from: c */
    public void mo19114c(boolean z) {
        try {
            if (this.f7884w != null) {
                this.f7884w.mo20737b(z);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewStatus", z ? 1 : 0);
            this.f7862a.mo20439a("viewableChange", jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo19109a(boolean z, boolean z2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z);
            jSONObject.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD_SHOW, z2);
            this.f7862a.mo20439a("endcard_control_event", jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    public void mo19116d(boolean z) {
        Activity activity;
        if (this.f7862a != null && (activity = this.f7873l) != null && !activity.isFinishing()) {
            C3890g gVar = this.f7884w;
            if (gVar != null) {
                gVar.mo20730a(z);
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("endcard_mute", z);
                this.f7862a.mo20439a("volumeChange", jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: m */
    public void mo19125m() {
        SSWebView sSWebView = this.f7880s;
        if (sSWebView != null) {
            sSWebView.mo17949i();
        }
        C3728w wVar = this.f7862a;
        if (wVar != null) {
            wVar.mo20466l();
            SSWebView sSWebView2 = this.f7880s;
            if (sSWebView2 != null) {
                if (sSWebView2.getVisibility() == 0) {
                    this.f7862a.mo20445b(true);
                    mo19114c(true);
                    mo19109a(false, true);
                } else {
                    this.f7862a.mo20445b(false);
                    mo19114c(false);
                    mo19109a(true, false);
                }
            }
        }
        C3171n nVar = this.f7866e;
        if (nVar != null) {
            nVar.mo18790d();
        }
        C3890g gVar = this.f7884w;
        if (gVar != null) {
            gVar.mo20768r();
            if (C4020v.m13313d((View) this.f7880s)) {
                this.f7884w.mo20737b(true);
            }
        }
    }

    /* renamed from: n */
    public int mo19126n() {
        return this.f7868g;
    }

    /* renamed from: o */
    public String mo19127o() {
        return this.f7869h;
    }

    /* renamed from: p */
    public String mo19128p() {
        return this.f7865d;
    }

    /* renamed from: r */
    public void mo19130r() {
        C3185u uVar = this.f7870i;
        if (uVar != null) {
            uVar.mo18829i();
        }
    }

    /* renamed from: a */
    public void mo19108a(boolean z, int i, String str) {
        C3185u uVar = this.f7870i;
        if (uVar != null) {
            if (z) {
                uVar.mo18814b();
            } else {
                uVar.mo18809a(i, str);
            }
        }
    }

    /* renamed from: s */
    public void mo19131s() {
        C3185u uVar = this.f7870i;
        if (uVar != null) {
            uVar.mo18828h();
        }
    }

    /* renamed from: t */
    public void mo19132t() {
        C3171n nVar = this.f7866e;
        if (nVar != null) {
            nVar.mo18779a(System.currentTimeMillis());
        }
    }

    /* renamed from: u */
    public boolean mo19133u() {
        return this.f7871j;
    }

    /* renamed from: v */
    public void mo19134v() {
        C3185u uVar = this.f7870i;
        if (uVar != null) {
            uVar.mo18820c();
            this.f7870i.mo18822d();
        }
    }

    /* renamed from: w */
    public void mo19135w() {
        C3185u uVar = this.f7870i;
        if (uVar != null) {
            uVar.mo18831k();
        }
    }

    /* renamed from: A */
    private C3185u m9735A() {
        return new C3185u(C3501p.m10761a(this.f7874m) ? 3 : 2, this.f7877p ? "rewarded_video" : "fullscreen_interstitial_ad", this.f7874m);
    }

    /* renamed from: x */
    public boolean mo19136x() {
        C3728w wVar = this.f7862a;
        if (wVar == null) {
            return false;
        }
        return wVar.mo20464j();
    }

    /* renamed from: y */
    public boolean mo19137y() {
        SSWebView sSWebView = this.f7880s;
        if (sSWebView == null || sSWebView.getWebView() == null) {
            return true;
        }
        return false;
    }
}
