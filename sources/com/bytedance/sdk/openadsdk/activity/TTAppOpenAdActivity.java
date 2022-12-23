package com.bytedance.sdk.openadsdk.activity;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bykv.p068vk.openvk.component.video.api.p086d.C2526c;
import com.bytedance.sdk.component.adexpress.p096c.C2641a;
import com.bytedance.sdk.component.p125f.C2952e;
import com.bytedance.sdk.component.p125f.C2955g;
import com.bytedance.sdk.component.utils.C2963e;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.component.utils.C2989x;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTAppOpenAd;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.C3245a;
import com.bytedance.sdk.openadsdk.component.p136a.C3257a;
import com.bytedance.sdk.openadsdk.component.p136a.C3258b;
import com.bytedance.sdk.openadsdk.component.p138c.C3272a;
import com.bytedance.sdk.openadsdk.component.p140e.C3276a;
import com.bytedance.sdk.openadsdk.component.p140e.C3277b;
import com.bytedance.sdk.openadsdk.component.p141f.C3281a;
import com.bytedance.sdk.openadsdk.component.p142g.C3283b;
import com.bytedance.sdk.openadsdk.component.view.ButtonFlash;
import com.bytedance.sdk.openadsdk.component.view.C3397a;
import com.bytedance.sdk.openadsdk.core.C3423b;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.C3639p;
import com.bytedance.sdk.openadsdk.core.C3645t;
import com.bytedance.sdk.openadsdk.core.p146b.C3427b;
import com.bytedance.sdk.openadsdk.core.p151e.C3484k;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.p155i.C3537f;
import com.bytedance.sdk.openadsdk.multipro.C3953b;
import com.bytedance.sdk.openadsdk.multipro.aidl.C3917a;
import com.bytedance.sdk.openadsdk.multipro.aidl.p181a.C3922a;
import com.bytedance.sdk.openadsdk.p130b.C3156e;
import com.bytedance.sdk.openadsdk.p130b.C3167j;
import com.bytedance.sdk.openadsdk.p176i.C3845a;
import com.bytedance.sdk.openadsdk.p176i.p177a.C3850b;
import com.bytedance.sdk.openadsdk.utils.C3995g;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import com.bytedance.sdk.openadsdk.utils.C4020v;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class TTAppOpenAdActivity extends Activity implements C2989x.C2990a {

    /* renamed from: F */
    private static TTAppOpenAd.AppOpenAdInteractionListener f6929F;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public int f6930A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public String f6931B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C3498n f6932C;

    /* renamed from: D */
    private IListenerManager f6933D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public TTAppOpenAd.AppOpenAdInteractionListener f6934E;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public int f6935G;

    /* renamed from: a */
    TTAdDislikeDialog f6936a;

    /* renamed from: b */
    TTAdDislikeToast f6937b;

    /* renamed from: c */
    final AtomicBoolean f6938c = new AtomicBoolean(false);

    /* renamed from: d */
    final AtomicBoolean f6939d = new AtomicBoolean(false);

    /* renamed from: e */
    protected boolean f6940e = false;

    /* renamed from: f */
    protected final AtomicBoolean f6941f = new AtomicBoolean(false);

    /* renamed from: g */
    protected final C2989x f6942g = new C2989x(Looper.getMainLooper(), this);

    /* renamed from: h */
    private final String f6943h = "open_ad";

    /* renamed from: i */
    private RelativeLayout f6944i;

    /* renamed from: j */
    private FrameLayout f6945j;

    /* renamed from: k */
    private ImageView f6946k;

    /* renamed from: l */
    private TextView f6947l;

    /* renamed from: m */
    private ButtonFlash f6948m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C3277b f6949n = new C3277b();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public ValueAnimator f6950o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C3283b f6951p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public long f6952q;

    /* renamed from: r */
    private C3258b f6953r;

    /* renamed from: s */
    private final C3397a f6954s = new C3397a();

    /* renamed from: t */
    private float f6955t;

    /* renamed from: u */
    private float f6956u;

    /* renamed from: v */
    private ImageView f6957v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public long f6958w = 0;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public C3167j f6959x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public AtomicBoolean f6960y = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f6961z;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (m8582b(bundle)) {
            if (!TTAdSdk.isInitSuccess()) {
                finish();
            }
            this.f6961z = C3498n.m10583c(this.f6932C);
            m8587f();
            m8588g();
            m8590h();
            m8593i();
            m8595j();
            m8597k();
        }
    }

    /* renamed from: f */
    private void m8587f() {
        int f = C2984t.m8433f(this, "tt_app_open_view");
        int d = this.f6932C.mo19697d();
        if (d == 2) {
            f = C2984t.m8433f(this, "tt_app_open_view2");
        } else if (d == 3) {
            f = C2984t.m8433f(this, "tt_app_open_view3");
        }
        setContentView(f);
    }

    /* renamed from: g */
    private void m8588g() {
        int i;
        int i2;
        int am = this.f6932C.mo19669am();
        if (this.f6932C.mo19697d() == 3) {
            am = 2;
        }
        if (am != 2) {
            setRequestedOrientation(1);
        } else if (mo18381e()) {
            setRequestedOrientation(8);
        } else {
            setRequestedOrientation(0);
        }
        int i3 = C4020v.m13321i(getApplicationContext());
        int h = C4020v.m13320h(getApplicationContext());
        if (am == 2) {
            i = Math.max(i3, h);
            i2 = Math.min(i3, h);
        } else {
            i = Math.min(i3, h);
            i2 = Math.max(i3, h);
        }
        this.f6955t = (float) i2;
        this.f6956u = (float) i;
        float j = C4020v.m13322j(getApplicationContext());
        if (!C4020v.m13308c((Activity) this)) {
            return;
        }
        if (am == 1) {
            this.f6955t -= j;
        } else if (am == 2) {
            this.f6956u -= j;
        }
    }

    /* renamed from: h */
    private void m8590h() {
        this.f6944i = (RelativeLayout) findViewById(C2984t.m8432e(this, "tt_open_ad_container"));
        this.f6957v = (ImageView) findViewById(C2984t.m8432e(this, "tt_open_ad_back_image"));
        this.f6945j = (FrameLayout) findViewById(C2984t.m8432e(this, "tt_open_ad_video_container"));
        this.f6946k = (ImageView) findViewById(C2984t.m8432e(this, "tt_open_ad_image"));
        this.f6948m = (ButtonFlash) findViewById(C2984t.m8432e(this, "tt_open_ad_click_button"));
        this.f6947l = (TextView) findViewById(C2984t.m8432e(this, "tt_ad_logo"));
        this.f6954s.mo19346a(this);
        this.f6949n.mo18961a((Activity) this);
    }

    /* renamed from: i */
    private void m8593i() {
        this.f6954s.mo19347a(this.f6932C, this.f6956u, this.f6955t);
    }

    /* renamed from: j */
    private void m8595j() {
        this.f6947l.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.m8985a(TTAppOpenAdActivity.this, TTAppOpenAdActivity.this.f6932C, "open_ad");
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
        this.f6949n.mo18962a((C3276a) new C3276a() {
            /* renamed from: a */
            public void mo18396a(View view) {
                C3639p.m11565c(TTAppOpenAdActivity.this.f6930A);
                TTAppOpenAdActivity.this.m8609t();
                if (TTAppOpenAdActivity.this.f6951p != null) {
                    TTAppOpenAdActivity.this.f6951p.mo18981a(4);
                }
                C3272a.m9551a(TTAppOpenAdActivity.this.f6932C, TTAppOpenAdActivity.this.f6949n.mo18966d(), TTAppOpenAdActivity.this.f6949n.mo18968f(), TTAppOpenAdActivity.this.f6949n.mo18967e());
                TTAppOpenAdActivity.this.finish();
            }

            /* renamed from: b */
            public void mo18397b(View view) {
                TTAppOpenAdActivity.this.mo18372a();
            }

            /* renamed from: a */
            public void mo18395a() {
                if (C3953b.m12901c()) {
                    TTAppOpenAdActivity.this.m8579a("onAdTimeOver");
                } else if (TTAppOpenAdActivity.this.f6934E != null) {
                    TTAppOpenAdActivity.this.f6934E.onAdCountdownToZero();
                }
                TTAppOpenAdActivity.this.finish();
            }
        });
        C3258b bVar = new C3258b(this.f6932C, this);
        this.f6953r = bVar;
        bVar.mo18941a((C3427b.C3428a) new C3427b.C3428a() {
            /* renamed from: a */
            public void mo18398a(View view, int i) {
                if (C3953b.m12901c()) {
                    TTAppOpenAdActivity.this.m8579a("onAdClicked");
                } else if (TTAppOpenAdActivity.this.f6934E != null) {
                    TTAppOpenAdActivity.this.f6934E.onAdClicked();
                }
            }
        });
        C3257a a = this.f6953r.mo18940a();
        if (this.f6932C.mo19691c() == 1) {
            this.f6944i.setOnClickListener(a);
            this.f6944i.setOnTouchListener(a);
        }
        this.f6948m.setOnClickListener(a);
        this.f6948m.setOnTouchListener(a);
    }

    /* renamed from: k */
    private void m8597k() {
        this.f6954s.mo19345a();
        this.f6948m.setText(this.f6932C.mo19620W());
        this.f6949n.mo18964b(C3578m.m11241h().mo19950i(this.f6930A));
        if (this.f6961z) {
            mo18373a(0);
            mo18378b(8);
            this.f6949n.mo18959a((float) this.f6932C.mo19607J().mo16353f());
            this.f6950o = this.f6949n.mo18963b();
            this.f6949n.mo18960a(0);
            m8601m();
            return;
        }
        int j = C3578m.m11241h().mo19952j(this.f6930A);
        mo18373a(8);
        mo18378b(0);
        this.f6949n.mo18959a((float) j);
        this.f6950o = this.f6949n.mo18963b();
        this.f6949n.mo18960a(0);
        m8598l();
    }

    /* renamed from: l */
    private void m8598l() {
        m8608s();
        C3484k kVar = this.f6932C.mo19613P().get(0);
        C3995g.m13103a(new C3845a(kVar.mo19559a(), kVar.mo19570g()), kVar.mo19563b(), kVar.mo19566c(), new C3995g.C3997a() {
            /* renamed from: a */
            public void mo18399a() {
            }

            /* renamed from: b */
            public void mo18401b() {
            }

            /* renamed from: a */
            public void mo18400a(C3850b bVar) {
                if (bVar.mo20697c()) {
                    TTAppOpenAdActivity.this.mo18376a(bVar);
                    TTAppOpenAdActivity.this.m8576a(bVar.mo20695a());
                }
            }
        }, C3281a.m9589b(TextUtils.isEmpty(kVar.mo19570g()) ? C2963e.m8350a(kVar.mo19559a()) : kVar.mo19570g(), this.f6930A).getParent());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8576a(Bitmap bitmap) {
        Bitmap a;
        if (bitmap != null) {
            try {
                if (Build.VERSION.SDK_INT >= 17 && (a = C2641a.m6893a(C3578m.m11231a(), bitmap, 25)) != null) {
                    this.f6957v.setImageDrawable(new BitmapDrawable(C3578m.m11231a().getResources(), a));
                }
            } catch (Throwable unused) {
                C2975l.m8391e("TTAppOpenAdActivity", "bindBackGroundImage error");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo18376a(C3850b bVar) {
        if (bVar.mo20695a() != null) {
            this.f6946k.setImageBitmap(bVar.mo20695a());
        } else if (this.f6932C.mo19613P() != null && this.f6932C.mo19613P().get(0) != null) {
            Drawable a = C3995g.m13102a(bVar.mo20696b(), this.f6932C.mo19613P().get(0).mo19563b());
            this.f6946k.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f6946k.setImageDrawable(a);
        }
    }

    /* renamed from: m */
    private void m8601m() {
        boolean z;
        m8608s();
        C3283b bVar = new C3283b(this);
        this.f6951p = bVar;
        bVar.mo18982a(this.f6945j, this.f6932C);
        this.f6951p.mo18983a((C2526c.C2527a) new C2526c.C2527a() {
            /* renamed from: a */
            public void mo16463a(long j, int i) {
                C2975l.m8384b("TTAppOpenAdActivity", "onComplete");
            }

            /* renamed from: b */
            public void mo16465b(long j, int i) {
                C2975l.m8384b("TTAppOpenAdActivity", "onError");
                TTAppOpenAdActivity.this.m8609t();
                TTAppOpenAdActivity.this.finish();
            }

            /* renamed from: a */
            public void mo16462a() {
                C2975l.m8384b("TTAppOpenAdActivity", "onTimeOut");
                TTAppOpenAdActivity.this.m8609t();
                TTAppOpenAdActivity.this.finish();
            }

            /* renamed from: a */
            public void mo16464a(long j, long j2) {
                long unused = TTAppOpenAdActivity.this.f6952q = j;
                if (!TTAppOpenAdActivity.this.f6940e && TTAppOpenAdActivity.this.f6951p.mo18985b()) {
                    TTAppOpenAdActivity.this.f6951p.mo18987d();
                }
                TTAppOpenAdActivity.this.m8605p();
            }
        });
        try {
            z = this.f6951p.mo18984a();
        } catch (Throwable th) {
            C2975l.m8391e("TTAppOpenAdActivity", "ttAppOpenAd playVideo error: " + th.getMessage());
            z = false;
        }
        if (z) {
            m8604o();
        } else {
            finish();
        }
        C3245a.m9457a(this.f6932C, (C3245a.C3256d) new C3245a.C3256d() {
            /* renamed from: a */
            public void mo18402a() {
            }

            /* renamed from: a */
            public void mo18403a(Bitmap bitmap) {
                TTAppOpenAdActivity.this.m8576a(bitmap);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo18373a(int i) {
        C4020v.m13282a((View) this.f6945j, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo18378b(int i) {
        C4020v.m13282a((View) this.f6946k, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18372a() {
        if (!isFinishing()) {
            if (this.f6939d.get()) {
                m8606q();
                return;
            }
            if (this.f6936a == null) {
                m8603n();
            }
            this.f6936a.mo18867a();
        }
    }

    /* renamed from: n */
    private void m8603n() {
        if (this.f6936a == null) {
            TTAdDislikeDialog tTAdDislikeDialog = new TTAdDislikeDialog((Context) this, this.f6932C);
            this.f6936a = tTAdDislikeDialog;
            tTAdDislikeDialog.setCallback(new TTAdDislikeDialog.C3222a() {
                /* renamed from: c */
                public void mo18407c(View view) {
                }

                /* renamed from: a */
                public void mo18405a(View view) {
                    TTAppOpenAdActivity.this.f6938c.set(true);
                    TTAppOpenAdActivity.this.mo18379c();
                }

                /* renamed from: b */
                public void mo18406b(View view) {
                    TTAppOpenAdActivity.this.f6938c.set(false);
                    TTAppOpenAdActivity.this.mo18377b();
                }

                /* renamed from: a */
                public void mo18404a(int i, FilterWord filterWord) {
                    if (!TTAppOpenAdActivity.this.f6939d.get() && filterWord != null && !filterWord.hasSecondOptions()) {
                        TTAppOpenAdActivity.this.f6939d.set(true);
                        TTAppOpenAdActivity.this.m8607r();
                    }
                }
            });
        }
        ((FrameLayout) findViewById(16908290)).addView(this.f6936a);
        if (this.f6937b == null) {
            this.f6937b = new TTAdDislikeToast(this);
            ((FrameLayout) findViewById(16908290)).addView(this.f6937b);
        }
    }

    /* renamed from: o */
    private void m8604o() {
        if (this.f6961z) {
            this.f6942g.sendEmptyMessageDelayed(100, 5000);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m8605p() {
        this.f6942g.removeMessages(100);
    }

    /* renamed from: q */
    private void m8606q() {
        this.f6937b.mo18875a(C3537f.f8809d);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m8607r() {
        this.f6937b.mo18875a(C3537f.f8810e);
    }

    public void onBackPressed() {
        C3277b bVar;
        if (C3578m.m11241h().mo19946h(this.f6930A) == 1) {
            if (((long) this.f6949n.mo18966d()) >= ((long) C3578m.m11241h().mo19950i(this.f6930A)) * 1000 && (bVar = this.f6949n) != null) {
                bVar.mo18965c();
            }
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z || !this.f6960y.get()) {
            this.f6958w = System.currentTimeMillis();
            return;
        }
        if (this.f6958w > 0) {
            C3156e.m9189a((System.currentTimeMillis() - this.f6958w) + "", this.f6932C, "open_ad", this.f6959x);
        }
        this.f6958w = 0;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f6940e = true;
        if (this.f6941f.getAndSet(true)) {
            mo18377b();
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f6940e = false;
        mo18379c();
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f6961z) {
            C3272a.m9554a(this.f6932C, this.f6952q, this.f6949n.mo18967e(), true);
        } else {
            C3272a.m9554a(this.f6932C, -1, this.f6949n.mo18967e(), false);
        }
        if (this.f6958w > 0 && this.f6960y.get()) {
            C3156e.m9189a((System.currentTimeMillis() - this.f6958w) + "", this.f6932C, "open_ad", this.f6959x);
            this.f6958w = 0;
        }
        ButtonFlash buttonFlash = this.f6948m;
        if (buttonFlash != null) {
            buttonFlash.mo19340a();
        }
        C3283b bVar = this.f6951p;
        if (bVar != null) {
            bVar.mo18989f();
        }
        if (C3953b.m12901c()) {
            m8579a("recycleRes");
        }
        ValueAnimator valueAnimator = this.f6950o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        f6929F = null;
        this.f6934E = null;
        TTAdDislikeDialog tTAdDislikeDialog = this.f6936a;
        if (tTAdDislikeDialog != null) {
            tTAdDislikeDialog.setCallback((TTAdDislikeDialog.C3222a) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo18377b() {
        if (this.f6961z) {
            if (this.f6951p.mo18986c()) {
                this.f6951p.mo18988e();
            }
            m8604o();
        }
        if (this.f6950o != null && Build.VERSION.SDK_INT >= 19) {
            this.f6950o.resume();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo18379c() {
        if (this.f6961z) {
            if (this.f6951p.mo18985b()) {
                this.f6951p.mo18987d();
            }
            m8605p();
        }
        if (this.f6950o != null && Build.VERSION.SDK_INT >= 19) {
            this.f6950o.pause();
        }
    }

    /* renamed from: s */
    private void m8608s() {
        try {
            getWindow().getDecorView().post(new Runnable() {
                public void run() {
                    C3167j unused = TTAppOpenAdActivity.this.f6959x = new C3167j();
                    TTAppOpenAdActivity.this.f6959x.mo18770a(System.currentTimeMillis(), 1.0f);
                    long unused2 = TTAppOpenAdActivity.this.f6958w = System.currentTimeMillis();
                    if (TTAppOpenAdActivity.this.f6950o != null && !TTAppOpenAdActivity.this.f6950o.isStarted()) {
                        TTAppOpenAdActivity.this.f6950o.start();
                    }
                    if (C3953b.m12901c()) {
                        TTAppOpenAdActivity.this.m8579a("onAdShow");
                    } else if (TTAppOpenAdActivity.this.f6934E != null) {
                        TTAppOpenAdActivity.this.f6934E.onAdShow();
                    }
                    View findViewById = TTAppOpenAdActivity.this.findViewById(16908290);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("width", findViewById.getWidth());
                        jSONObject.put("height", findViewById.getHeight());
                        jSONObject.put("alpha", (double) findViewById.getAlpha());
                        HashMap hashMap = new HashMap();
                        hashMap.put("root_view", jSONObject.toString());
                        hashMap.put("ad_root", Integer.valueOf(TTAppOpenAdActivity.this.f6935G));
                        hashMap.put("openad_creative_type", TTAppOpenAdActivity.this.f6961z ? "video_normal_ad" : "image_normal_ad");
                        if (C3397a.m10178c() == null) {
                            hashMap.put("appicon_acquirefail", "1");
                        }
                        C3156e.m9175a(C3578m.m11231a(), TTAppOpenAdActivity.this.f6932C, "open_ad", (Map<String, Object>) hashMap, (Double) null);
                        TTAppOpenAdActivity.this.f6960y.set(true);
                    } catch (JSONException unused3) {
                        TTAppOpenAdActivity.this.finish();
                    }
                }
            });
        } catch (Throwable unused) {
            finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m8609t() {
        if (C3953b.m12901c()) {
            m8579a("onAdSkip");
            return;
        }
        TTAppOpenAd.AppOpenAdInteractionListener appOpenAdInteractionListener = this.f6934E;
        if (appOpenAdInteractionListener != null) {
            appOpenAdInteractionListener.onAdSkip();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8579a(final String str) {
        C2952e.m8317c(new C2955g("AppOpenAd_executeMultiProcessCallback") {
            public void run() {
                try {
                    TTAppOpenAdActivity.this.mo18380d().executeAppOpenAdCallback(TTAppOpenAdActivity.this.f6931B, str);
                } catch (Throwable th) {
                    C2975l.m8388c("TTAppOpenAdActivity", "executeAppOpenAdCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public IListenerManager mo18380d() {
        if (this.f6933D == null) {
            this.f6933D = C3922a.asInterface(C3917a.m12866a(C3578m.m11231a()).mo20811a(7));
        }
        return this.f6933D;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C4020v.m13277a((Activity) this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
            public void onSystemUiVisibilityChange(int i) {
                if (i == 0) {
                    try {
                        if (!TTAppOpenAdActivity.this.isFinishing()) {
                            TTAppOpenAdActivity.this.getWindow().getDecorView().postDelayed(new Runnable() {
                                public void run() {
                                    C4020v.m13277a((Activity) TTAppOpenAdActivity.this);
                                }
                            }, 2500);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    /* renamed from: b */
    private boolean m8582b(Bundle bundle) {
        if (C3953b.m12901c()) {
            Intent intent = getIntent();
            if (intent != null) {
                String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra != null) {
                    try {
                        this.f6932C = C3423b.m10208a(new JSONObject(stringExtra));
                    } catch (Exception e) {
                        C2975l.m8388c("TTAppOpenAdActivity", "initData MultiGlobalInfo throws ", e);
                    }
                }
                this.f6931B = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_META_MD5);
            }
        } else {
            this.f6932C = C3645t.m11590a().mo20225c();
            this.f6934E = C3645t.m11590a().mo20228f();
            C3645t.m11590a().mo20230h();
        }
        mo18374a(getIntent());
        mo18375a(bundle);
        C3498n nVar = this.f6932C;
        if (nVar == null) {
            C2975l.m8384b("TTAppOpenAdActivity", "mMaterialMeta is null , no data to display ,the TTOpenAdActivity finished !!");
            finish();
            return false;
        }
        this.f6930A = C4014u.m13223f(nVar);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18374a(Intent intent) {
        if (intent != null) {
            this.f6935G = intent.getIntExtra("ad_source", 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18375a(Bundle bundle) {
        if (bundle != null) {
            if (this.f6934E == null) {
                this.f6934E = f6929F;
                f6929F = null;
            }
            try {
                String string = bundle.getString("material_meta");
                this.f6931B = bundle.getString(TTAdConstant.MULTI_PROCESS_META_MD5);
                this.f6935G = bundle.getInt("ad_source", 0);
                this.f6932C = C3423b.m10208a(new JSONObject(string));
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            bundle.putString("material_meta", this.f6932C != null ? this.f6932C.mo19674ar().toString() : null);
            bundle.putString(TTAdConstant.MULTI_PROCESS_META_MD5, this.f6931B);
            bundle.putInt("ad_source", this.f6935G);
        } catch (Throwable unused) {
        }
        f6929F = this.f6934E;
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: a */
    public void mo17318a(Message message) {
        if (message.what == 100) {
            C3283b bVar = this.f6951p;
            if (bVar != null) {
                bVar.mo18981a(1);
            }
            m8609t();
            finish();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo18381e() {
        try {
            if (getIntent().getIntExtra("orientation_angle", 0) == 3) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
