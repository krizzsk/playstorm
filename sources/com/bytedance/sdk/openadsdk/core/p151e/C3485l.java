package com.bytedance.sdk.openadsdk.core.p151e;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bykv.p068vk.openvk.component.video.api.p086d.C2526c;
import com.bytedance.sdk.component.adexpress.p096c.C2641a;
import com.bytedance.sdk.component.p110d.C2898j;
import com.bytedance.sdk.component.p110d.C2902n;
import com.bytedance.sdk.component.p110d.C2908t;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.C3568k;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.C3645t;
import com.bytedance.sdk.openadsdk.core.C3728w;
import com.bytedance.sdk.openadsdk.core.C3768z;
import com.bytedance.sdk.openadsdk.core.p146b.C3426a;
import com.bytedance.sdk.openadsdk.core.p146b.C3427b;
import com.bytedance.sdk.openadsdk.core.video.p164c.C3686c;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.core.widget.p166a.C3747b;
import com.bytedance.sdk.openadsdk.core.widget.p166a.C3748c;
import com.bytedance.sdk.openadsdk.core.widget.p166a.C3749d;
import com.bytedance.sdk.openadsdk.p130b.C3156e;
import com.bytedance.sdk.openadsdk.p130b.C3171n;
import com.bytedance.sdk.openadsdk.p167d.C3769a;
import com.bytedance.sdk.openadsdk.p176i.C3854d;
import com.bytedance.sdk.openadsdk.utils.C3999i;
import com.bytedance.sdk.openadsdk.utils.C4000j;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import com.bytedance.sdk.openadsdk.utils.C4020v;
import com.com.bytedance.overseas.sdk.p186a.C4026c;
import com.com.bytedance.overseas.sdk.p186a.C4027d;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.core.e.l */
/* compiled from: LandingPageModel */
public class C3485l {

    /* renamed from: A */
    private LinearLayout f8518A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public View f8519B;

    /* renamed from: C */
    private ImageView f8520C;

    /* renamed from: D */
    private View f8521D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public long f8522E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public AtomicBoolean f8523F = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: G */
    public Activity f8524G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public String f8525H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C4026c f8526I;

    /* renamed from: J */
    private C3171n f8527J;

    /* renamed from: K */
    private AtomicBoolean f8528K = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: L */
    public boolean f8529L = false;

    /* renamed from: a */
    ImageView f8530a;

    /* renamed from: b */
    FrameLayout f8531b;

    /* renamed from: c */
    TextView f8532c;

    /* renamed from: d */
    FrameLayout f8533d;

    /* renamed from: e */
    TextView f8534e;

    /* renamed from: f */
    RelativeLayout f8535f;

    /* renamed from: g */
    C3498n f8536g;

    /* renamed from: h */
    FrameLayout f8537h;

    /* renamed from: i */
    ObjectAnimator f8538i;

    /* renamed from: j */
    ObjectAnimator f8539j;

    /* renamed from: k */
    ObjectAnimator f8540k;

    /* renamed from: l */
    ObjectAnimator f8541l;

    /* renamed from: m */
    ObjectAnimator f8542m;

    /* renamed from: n */
    C2526c.C2527a f8543n;

    /* renamed from: o */
    C3426a f8544o;

    /* renamed from: p */
    C3427b f8545p;

    /* renamed from: q */
    private View f8546q;

    /* renamed from: r */
    private View f8547r;

    /* renamed from: s */
    private TextView f8548s;

    /* renamed from: t */
    private TextView f8549t;

    /* renamed from: u */
    private TTRoundRectImageView f8550u;

    /* renamed from: v */
    private TextView f8551v;

    /* renamed from: w */
    private C3728w f8552w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public SSWebView f8553x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public FrameLayout f8554y;

    /* renamed from: z */
    private AnimatorSet f8555z;

    public C3485l(Activity activity, C3498n nVar, String str, FrameLayout frameLayout) {
        this.f8524G = activity;
        this.f8536g = nVar;
        this.f8525H = str;
        if (m10539b(nVar)) {
            this.f8525H = "landingpage_split_screen";
        } else if (m10541c(nVar)) {
            this.f8525H = "landingpage_direct";
        }
        this.f8544o = new C3426a(C3578m.m11231a(), this.f8536g, this.f8525H, C4014u.m13176a(str));
        this.f8545p = new C3427b(C3578m.m11231a(), this.f8536g, this.f8525H, C4014u.m13176a(str), true);
        this.f8537h = frameLayout;
        try {
            if (m10541c(this.f8536g)) {
                ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "timeDown", new int[]{0, (int) (this.f8536g.mo19624a().mo19592b() * 1000)});
                this.f8540k = ofInt;
                ofInt.setDuration(this.f8536g.mo19624a().mo19592b() * 1000);
                this.f8540k.setInterpolator(new LinearInterpolator());
                this.f8540k.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (C3485l.this.f8543n != null) {
                            C3485l.this.f8543n.mo16464a(((Integer) valueAnimator.getAnimatedValue()).longValue(), C3485l.this.f8536g.mo19624a().mo19592b() * 1000);
                        }
                    }
                });
                this.f8540k.start();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void mo19573a(C2526c.C2527a aVar) {
        this.f8543n = aVar;
    }

    /* renamed from: a */
    public void mo19571a() {
        Activity activity = this.f8524G;
        SSWebView sSWebView = (SSWebView) activity.findViewById(C2984t.m8432e(activity, "tt_reward_browser_webview_loading"));
        this.f8553x = sSWebView;
        if (sSWebView == null || C3498n.m10579a(this.f8536g)) {
            C4020v.m13282a((View) this.f8553x, 8);
        } else {
            this.f8553x.mo17923a();
        }
        Activity activity2 = this.f8524G;
        this.f8554y = (FrameLayout) activity2.findViewById(C2984t.m8432e(activity2, "tt_reward_loading_container"));
        Activity activity3 = this.f8524G;
        this.f8518A = (LinearLayout) activity3.findViewById(C2984t.m8432e(activity3, "wave_container"));
        Activity activity4 = this.f8524G;
        this.f8519B = activity4.findViewById(C2984t.m8432e(activity4, "tt_up_slide"));
        Activity activity5 = this.f8524G;
        this.f8520C = (ImageView) activity5.findViewById(C2984t.m8432e(activity5, "tt_up_slide_image"));
        Activity activity6 = this.f8524G;
        this.f8521D = activity6.findViewById(C2984t.m8432e(activity6, "tt_video_container_root"));
        Activity activity7 = this.f8524G;
        this.f8531b = (FrameLayout) activity7.findViewById(C2984t.m8432e(activity7, "tt_image_reward_container"));
        Activity activity8 = this.f8524G;
        this.f8530a = (ImageView) activity8.findViewById(C2984t.m8432e(activity8, "tt_image_reward"));
        Activity activity9 = this.f8524G;
        this.f8535f = (RelativeLayout) activity9.findViewById(C2984t.m8432e(activity9, "tt_browser_webview_page_loading"));
        Activity activity10 = this.f8524G;
        this.f8532c = (TextView) activity10.findViewById(C2984t.m8432e(activity10, "tt_loading_tip"));
        Activity activity11 = this.f8524G;
        this.f8533d = (FrameLayout) activity11.findViewById(C2984t.m8432e(activity11, "tt_video_container_back"));
        Activity activity12 = this.f8524G;
        this.f8547r = activity12.findViewById(C2984t.m8432e(activity12, "tt_back_container"));
        Activity activity13 = this.f8524G;
        this.f8546q = activity13.findViewById(C2984t.m8432e(activity13, "tt_loading_container"));
        Activity activity14 = this.f8524G;
        this.f8548s = (TextView) activity14.findViewById(C2984t.m8432e(activity14, "tt_back_container_title"));
        Activity activity15 = this.f8524G;
        this.f8549t = (TextView) activity15.findViewById(C2984t.m8432e(activity15, "tt_back_container_des"));
        Activity activity16 = this.f8524G;
        this.f8550u = (TTRoundRectImageView) activity16.findViewById(C2984t.m8432e(activity16, "tt_back_container_icon"));
        Activity activity17 = this.f8524G;
        this.f8551v = (TextView) activity17.findViewById(C2984t.m8432e(activity17, "tt_back_container_download"));
        if (!(this.f8532c == null || this.f8536g.mo19624a() == null)) {
            this.f8532c.setText(this.f8536g.mo19624a().mo19594c());
        }
        Activity activity18 = this.f8524G;
        this.f8534e = (TextView) activity18.findViewById(C2984t.m8432e(activity18, "tt_ad_loading_logo"));
        if (m10541c(this.f8536g) || m10539b(this.f8536g)) {
            TextView textView = this.f8534e;
            if (textView != null) {
                textView.setVisibility(8);
            }
            C3568k.m11192d().postDelayed(new Runnable() {
                public void run() {
                    if (!C3485l.this.f8523F.get()) {
                        C3156e.m9168a(C3578m.m11231a(), C3485l.this.f8536g, C3485l.this.f8525H, System.currentTimeMillis() - C3485l.this.f8522E, false);
                        C3485l.this.m10556m();
                    }
                }
            }, this.f8536g.mo19624a().mo19589a() * 1000);
        }
        m10549i();
        if (m10539b(this.f8536g)) {
            m10557n();
            if (!mo19575c()) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f8554y.getLayoutParams();
                layoutParams.weight = 2.33f;
                this.f8554y.setLayoutParams(layoutParams);
            }
        }
        if (m10541c(this.f8536g)) {
            this.f8521D.setVisibility(8);
        }
    }

    /* renamed from: i */
    private void m10549i() {
        SSWebView sSWebView = this.f8553x;
        if (!(sSWebView == null || sSWebView.getWebView() == null)) {
            C3747b.m12300a(C3578m.m11231a()).mo20536a(false).mo20538b(false).mo20537a(this.f8553x.getWebView());
            SSWebView sSWebView2 = this.f8553x;
            if (!(sSWebView2 == null || sSWebView2.getWebView() == null)) {
                C3171n a = new C3171n(C3578m.m11231a(), this.f8536g, this.f8553x.getWebView()).mo18777a(true);
                this.f8527J = a;
                a.mo18787a(this.f8525H);
            }
            m10551j();
            this.f8553x.setLandingPage(true);
            this.f8553x.setTag(this.f8525H);
            this.f8553x.setMaterialMeta(this.f8536g.mo19649aC());
            this.f8553x.setWebViewClient(new C3749d(C3578m.m11231a(), this.f8552w, this.f8536g.mo19622Y(), this.f8527J, true) {
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    C3485l.this.m10553k();
                }

                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                    if (C3485l.this.f8524G instanceof C3686c) {
                        ((C3686c) C3485l.this.f8524G).mo18435e();
                    }
                    long unused = C3485l.this.f8522E = System.currentTimeMillis();
                }

                public void onReceivedError(WebView webView, int i, String str, String str2) {
                    super.onReceivedError(webView, i, str, str2);
                    String b = m12307b(str2);
                    if (this.f9744f != null) {
                        this.f9744f.mo18781a(webView, i, str, str2, m12307b(str2));
                    }
                    boolean z = true;
                    boolean z2 = b != null && b.startsWith("image");
                    if (b == null || !b.startsWith("mp4")) {
                        z = false;
                    }
                    if (!z2 && !z && !C3485l.this.f8523F.get()) {
                        C3485l.this.m10556m();
                    }
                }
            });
            this.f8553x.setWebChromeClient(new C3748c(this.f8552w, this.f8527J) {
                public void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                    if (C3485l.this.f8524G != null && !C3485l.this.f8524G.isFinishing() && i == 100) {
                        C3485l.this.m10553k();
                    }
                }
            });
            if (this.f8526I == null) {
                this.f8526I = C4027d.m13342a(C3578m.m11231a(), this.f8536g, this.f8525H);
            }
            this.f8553x.setDownloadListener(new DownloadListener() {
                public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                    if (C3485l.this.f8526I != null) {
                        C3485l.this.f8526I.mo20934d();
                    }
                }
            });
            SSWebView sSWebView3 = this.f8553x;
            if (sSWebView3 != null) {
                sSWebView3.setUserAgentString(C3999i.m13113a(sSWebView3.getWebView(), (int) BuildConfig.VERSION_CODE));
            }
            if (Build.VERSION.SDK_INT >= 21) {
                this.f8553x.setMixedContentMode(0);
            }
            this.f8553x.getWebView().setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (!C3485l.this.f8529L) {
                        C3485l.this.f8545p.onTouch(view, motionEvent);
                    }
                    if (C3485l.this.f8529L || motionEvent.getAction() != 1) {
                        return false;
                    }
                    C3485l.this.f8553x.getWebView().performClick();
                    boolean unused = C3485l.this.f8529L = true;
                    return false;
                }
            });
            this.f8553x.getWebView().setOnClickListener(this.f8545p);
            C3156e.m9166a(C3578m.m11231a(), this.f8536g, this.f8525H);
            C4000j.m13115a(this.f8553x, this.f8536g.mo19612O());
        }
        if (this.f8553x != null) {
            m10559p();
        }
    }

    /* renamed from: j */
    private void m10551j() {
        C3728w wVar = new C3728w(C3578m.m11231a());
        this.f8552w = wVar;
        wVar.mo20443b(this.f8553x).mo20453d(this.f8536g.mo19622Y()).mo20457e(this.f8536g.mo19659ac()).mo20426a(this.f8536g).mo20442b(-1).mo20420a(this.f8536g.mo19603F()).mo20449c(this.f8525H).mo20459f(C4014u.m13239i(this.f8536g)).mo20423a(this.f8553x);
    }

    /* renamed from: a */
    public static boolean m10537a(C3498n nVar) {
        if (nVar == null) {
            return false;
        }
        return m10541c(nVar) || m10539b(nVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m10553k() {
        if (!this.f8523F.get() && !this.f8528K.get()) {
            this.f8523F.set(true);
            C3156e.m9168a(C3578m.m11231a(), this.f8536g, this.f8525H, System.currentTimeMillis() - this.f8522E, true);
            m10554l();
        }
    }

    /* renamed from: l */
    private void m10554l() {
        this.f8535f.setVisibility(8);
        if (!m10541c(this.f8536g) && mo19575c()) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "timeVisible", new float[]{0.0f, 1.0f});
            this.f8542m = ofFloat;
            ofFloat.setDuration(100);
            this.f8542m.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) C3485l.this.f8554y.getLayoutParams();
                    layoutParams.weight = (float) (((double) ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 0.25d);
                    C3485l.this.mo19572a((float) (1.0d - (((double) ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 0.2d)));
                    C3485l.this.f8554y.setLayoutParams(layoutParams);
                }
            });
            this.f8542m.start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m10556m() {
        if (!this.f8523F.get()) {
            this.f8528K.set(true);
            Activity activity = this.f8524G;
            if (activity instanceof C3686c) {
                ((C3686c) activity).mo18441j();
            }
            this.f8546q.setVisibility(8);
            this.f8547r.setVisibility(0);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f8547r.getLayoutParams();
            layoutParams.addRule(13);
            layoutParams.addRule(10, 0);
            this.f8547r.setLayoutParams(layoutParams);
            if (this.f8536g.mo19610M() != null && !TextUtils.isEmpty(this.f8536g.mo19610M().mo19559a())) {
                C3854d.m12660a().mo20704a(this.f8536g.mo19610M().mo19559a(), (ImageView) this.f8550u);
            }
            this.f8548s.setText(this.f8536g.mo19608K());
            this.f8549t.setText(this.f8536g.mo19619V());
            if (this.f8551v != null) {
                mo19574b();
                this.f8551v.setClickable(true);
                this.f8551v.setOnClickListener(this.f8544o);
                this.f8551v.setOnTouchListener(this.f8544o);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo19574b() {
        C3498n nVar = this.f8536g;
        if (nVar != null && !TextUtils.isEmpty(nVar.mo19620W())) {
            this.f8551v.setText(this.f8536g.mo19620W());
        }
    }

    /* renamed from: n */
    private void m10557n() {
        if (mo19575c()) {
            this.f8519B.setVisibility(0);
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.f8520C, "translationY", new float[]{16.0f, 0.0f}).setDuration(500);
            this.f8538i = duration;
            duration.setRepeatMode(2);
            this.f8538i.setRepeatCount(-1);
            this.f8538i.start();
            this.f8519B.setClickable(true);
            this.f8519B.setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (!C3485l.this.f8529L) {
                        C3485l.this.f8545p.onTouch(view, motionEvent);
                    }
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1) {
                        return false;
                    }
                    C3485l.this.f8541l = ObjectAnimator.ofFloat(this, "timeSlide", new float[]{0.0f, 1.0f});
                    C3485l.this.f8541l.setDuration(200);
                    C3485l.this.f8541l.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) C3485l.this.f8554y.getLayoutParams();
                            layoutParams.weight = (float) (((double) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 2.07f)) + 0.25d);
                            C3485l.this.mo19572a((float) (0.800000011920929d - (((double) ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 0.5d)));
                            C3485l.this.f8554y.setLayoutParams(layoutParams);
                        }
                    });
                    C3485l.this.f8519B.performClick();
                    boolean unused = C3485l.this.f8529L = true;
                    C3485l.this.f8541l.start();
                    C3485l.this.f8519B.setVisibility(8);
                    return true;
                }
            });
            this.f8519B.setOnClickListener(this.f8545p);
        }
        if (!m10558o()) {
            this.f8537h.setVisibility(8);
            this.f8531b.setVisibility(0);
            this.f8530a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f8530a.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    C3156e.m9190b(C3578m.m11231a(), C3485l.this.f8536g, C3485l.this.f8525H);
                }
            });
            C3498n nVar = this.f8536g;
            if (!(nVar == null || nVar.mo19613P() == null || this.f8536g.mo19613P().size() <= 0 || this.f8536g.mo19613P().get(0) == null || TextUtils.isEmpty(this.f8536g.mo19613P().get(0).mo19559a()))) {
                C3854d.m12660a().mo20703a(this.f8536g.mo19613P().get(0), this.f8530a);
            }
        }
        try {
            C3769a.m12389a().mo17677a(this.f8536g.mo19613P().get(0).mo19559a()).mo17716a(C2908t.BITMAP).mo17711a((C2902n) new C2902n<Bitmap>() {
                /* renamed from: a */
                public void mo17256a(int i, String str, Throwable th) {
                }

                /* renamed from: a */
                public void mo17257a(C2898j<Bitmap> jVar) {
                    Bitmap a;
                    try {
                        Bitmap b = jVar.mo17725b();
                        if (Build.VERSION.SDK_INT >= 17 && (a = C2641a.m6893a(C3578m.m11231a(), b, 25)) != null) {
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(C3578m.m11231a().getResources(), a);
                            if (!C3485l.this.m10558o()) {
                                C3485l.this.f8531b.setBackground(bitmapDrawable);
                                return;
                            }
                            C3485l.this.f8533d.setBackground(bitmapDrawable);
                            View view = null;
                            if (C3485l.this.f8524G instanceof C3686c) {
                                view = ((C3686c) C3485l.this.f8524G).mo18443l();
                            }
                            if (view != null && (view.getParent() instanceof View)) {
                                ((View) view.getParent()).setBackground(bitmapDrawable);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public boolean m10558o() {
        return C3498n.m10583c(this.f8536g);
    }

    /* renamed from: p */
    private void m10559p() {
        this.f8555z = new AnimatorSet();
        LinearLayout linearLayout = this.f8518A;
        if (linearLayout != null) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(linearLayout.getChildAt(0), "translationY", new float[]{-9.0f, 9.0f}).setDuration(300);
            this.f8539j = duration;
            duration.setRepeatMode(2);
            this.f8539j.setRepeatCount(-1);
            AnimatorSet.Builder play = this.f8555z.play(this.f8539j);
            for (int i = 1; i < this.f8518A.getChildCount(); i++) {
                float f = i % 2 == 0 ? 9.0f : -9.0f;
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f8518A.getChildAt(i), "translationY", new float[]{-f, f}).setDuration(300);
                duration2.setRepeatMode(2);
                duration2.setRepeatCount(-1);
                play = play.with(duration2);
            }
            this.f8555z.start();
        }
    }

    /* renamed from: c */
    public boolean mo19575c() {
        return this.f8536g.mo19660ad() == 15 || this.f8536g.mo19660ad() == 16;
    }

    /* renamed from: a */
    public void mo19572a(float f) {
        try {
            ((C3686c) this.f8524G).mo18442k();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static boolean m10539b(C3498n nVar) {
        if (nVar.mo19609L() == 3 && nVar.mo19705f() == 6 && !C3501p.m10761a(nVar) && nVar.mo19669am() == 1 && (nVar.mo19670an() == 0.0f || nVar.mo19670an() == 100.0f)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m10541c(C3498n nVar) {
        if (nVar == null || nVar.mo19609L() != 3 || nVar.mo19705f() != 5 || C3501p.m10761a(nVar)) {
            return false;
        }
        if (nVar.mo19670an() == 0.0f || nVar.mo19670an() == 100.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m10543d(C3498n nVar) {
        if (nVar != null && C3578m.m11241h().mo19944g() && nVar.mo19602E() && !m10539b(nVar) && !m10541c(nVar)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void mo19576d() {
        FrameLayout frameLayout = this.f8554y;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
            this.f8521D.setVisibility(0);
        }
    }

    /* renamed from: e */
    public void mo19577e() {
        SSWebView sSWebView;
        C3171n nVar = this.f8527J;
        if (!(nVar == null || (sSWebView = this.f8553x) == null)) {
            nVar.mo18785a(sSWebView);
        }
        ObjectAnimator objectAnimator = this.f8540k;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.f8540k.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f8541l;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.f8541l.cancel();
        }
        ObjectAnimator objectAnimator3 = this.f8542m;
        if (objectAnimator3 != null) {
            objectAnimator3.removeAllUpdateListeners();
            this.f8542m.cancel();
        }
        AnimatorSet animatorSet = this.f8555z;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ObjectAnimator objectAnimator4 = this.f8539j;
        if (objectAnimator4 != null) {
            objectAnimator4.cancel();
        }
        ObjectAnimator objectAnimator5 = this.f8538i;
        if (objectAnimator5 != null) {
            objectAnimator5.cancel();
        }
        if (this.f8553x != null) {
            C3768z.m12384a(C3578m.m11231a(), this.f8553x.getWebView());
            C3768z.m12385a(this.f8553x.getWebView());
        }
        this.f8553x = null;
        C3728w wVar = this.f8552w;
        if (wVar != null) {
            wVar.mo20468n();
        }
        C3171n nVar2 = this.f8527J;
        if (nVar2 != null) {
            nVar2.mo18792f();
        }
    }

    /* renamed from: f */
    public void mo19578f() {
        C3728w wVar = this.f8552w;
        if (wVar != null) {
            wVar.mo20466l();
        }
        C3171n nVar = this.f8527J;
        if (nVar != null) {
            nVar.mo18790d();
        }
    }

    /* renamed from: g */
    public void mo19579g() {
        C3171n nVar = this.f8527J;
        if (nVar != null) {
            nVar.mo18791e();
        }
    }

    /* renamed from: h */
    public void mo19580h() {
        C3645t.m11590a().mo20223b(true);
        C3728w wVar = this.f8552w;
        if (wVar != null) {
            wVar.mo20467m();
        }
    }
}
