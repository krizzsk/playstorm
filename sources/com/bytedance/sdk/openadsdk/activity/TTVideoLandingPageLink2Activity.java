package com.bytedance.sdk.openadsdk.activity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bykv.p068vk.openvk.component.video.api.p086d.C2526c;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.common.C3228d;
import com.bytedance.sdk.openadsdk.core.C3568k;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.C3695b;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.core.widget.p166a.C3748c;
import com.bytedance.sdk.openadsdk.core.widget.p166a.C3749d;
import com.bytedance.sdk.openadsdk.p130b.C3156e;
import com.bytedance.sdk.openadsdk.p168e.C3792d;
import com.bytedance.sdk.openadsdk.p176i.C3854d;
import org.json.JSONObject;

public class TTVideoLandingPageLink2Activity extends TTVideoLandingPageActivity implements C3792d {

    /* renamed from: R */
    AnimatorSet f7270R;

    /* renamed from: S */
    private LinearLayout f7271S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public View f7272T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public View f7273U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public View f7274V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public boolean f7275W;

    /* renamed from: X */
    private TextView f7276X;

    /* renamed from: Y */
    private TextView f7277Y;

    /* renamed from: Z */
    private TextView f7278Z;
    /* access modifiers changed from: private */

    /* renamed from: aa */
    public TextView f7279aa;

    /* renamed from: ab */
    private TTRoundRectImageView f7280ab;

    /* renamed from: ac */
    private TextView f7281ac;

    /* renamed from: ad */
    private TextView f7282ad;
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public long f7283ae;
    /* access modifiers changed from: private */

    /* renamed from: af */
    public boolean f7284af = false;
    /* access modifiers changed from: private */

    /* renamed from: ag */
    public boolean f7285ag;
    /* access modifiers changed from: private */

    /* renamed from: ah */
    public C3228d f7286ah;
    /* access modifiers changed from: private */

    /* renamed from: ai */
    public LinearLayout f7287ai;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo18588a() {
        return "tt_activity_videolandingpage_link2";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo18590c() {
        return "tt_top_back";
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.f7285ag = C3578m.m11241h().mo19944g();
        super.onCreate(bundle);
        if (!TTAdSdk.isInitSuccess() || this.f7246p == null || this.f7231a == null) {
            finish();
            return;
        }
        this.f7231a.setWebViewClient(new C3749d(this.f7235e, this.f7239i, this.f7237g, this.f7223M, true) {
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                try {
                    if (TTVideoLandingPageLink2Activity.this.f7272T != null && !TTVideoLandingPageLink2Activity.this.f7275W) {
                        TTVideoLandingPageLink2Activity.this.f7272T.setVisibility(8);
                    }
                    if (TTVideoLandingPageLink2Activity.this.f7287ai != null) {
                        TTVideoLandingPageLink2Activity.this.f7287ai.setVisibility(0);
                    }
                    boolean unused = TTVideoLandingPageLink2Activity.this.f7284af = true;
                    TTVideoLandingPageLink2Activity.this.m8972n();
                    C3156e.m9168a((Context) TTVideoLandingPageLink2Activity.this, TTVideoLandingPageLink2Activity.this.f7246p, TTVideoLandingPageLink2Activity.this.f7216F, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.f7283ae, true);
                } catch (Throwable unused2) {
                }
            }

            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                long unused = TTVideoLandingPageLink2Activity.this.f7283ae = System.currentTimeMillis();
            }
        });
        this.f7231a.setWebChromeClient(new C3748c(this.f7239i, this.f7223M) {
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (TTVideoLandingPageLink2Activity.this.f7285ag && TTVideoLandingPageLink2Activity.this.f7286ah != null && i == 100) {
                    TTVideoLandingPageLink2Activity.this.f7286ah.mo18886a(webView);
                }
                if (TTVideoLandingPageLink2Activity.this.f7213C != null && !TTVideoLandingPageLink2Activity.this.isFinishing() && i == 100 && TTVideoLandingPageLink2Activity.this.f7213C.isShown() && !TTVideoLandingPageLink2Activity.this.f7275W) {
                    if (TTVideoLandingPageLink2Activity.this.f7272T != null) {
                        TTVideoLandingPageLink2Activity.this.f7272T.setVisibility(8);
                    }
                    if (TTVideoLandingPageLink2Activity.this.f7287ai != null) {
                        TTVideoLandingPageLink2Activity.this.f7287ai.setVisibility(0);
                    }
                    TTVideoLandingPageLink2Activity.this.m8972n();
                }
            }
        });
        TextView textView = (TextView) findViewById(C2984t.m8432e(this, "tt_loading_tip"));
        this.f7281ac = textView;
        if (!(textView == null || this.f7246p.mo19624a() == null)) {
            this.f7281ac.setText(this.f7246p.mo19624a().mo19594c());
        }
        long j = 10000;
        if (!(this.f7246p == null || this.f7246p.mo19624a() == null)) {
            j = this.f7246p.mo19624a().mo19589a() * 1000;
        }
        C3568k.m11192d().postDelayed(new Runnable() {
            public void run() {
                try {
                    boolean unused = TTVideoLandingPageLink2Activity.this.f7275W = true;
                    TTVideoLandingPageLink2Activity.this.f7273U.setVisibility(8);
                    TTVideoLandingPageLink2Activity.this.f7274V.setVisibility(0);
                    if (!TTVideoLandingPageLink2Activity.this.f7284af) {
                        C3156e.m9168a((Context) TTVideoLandingPageLink2Activity.this, TTVideoLandingPageLink2Activity.this.f7246p, TTVideoLandingPageLink2Activity.this.f7216F, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.f7283ae, false);
                    }
                } catch (Exception unused2) {
                }
            }
        }, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo18591d() {
        super.mo18591d();
        TextView textView = (TextView) findViewById(C2984t.m8432e(this, "tt_top_dislike"));
        this.f7278Z = textView;
        if (textView != null) {
            textView.setText(C2984t.m8425a(C3578m.m11231a(), "tt_reward_feedback"));
            this.f7278Z.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    TTDelegateActivity.m8755a(TTVideoLandingPageLink2Activity.this.f7246p, "");
                }
            });
        }
        this.f7279aa = (TextView) findViewById(C2984t.m8432e(this, "tt_top_skip"));
        this.f7271S = (LinearLayout) findViewById(C2984t.m8432e(this.f7235e, "wave_container"));
        this.f7272T = findViewById(C2984t.m8432e(this.f7235e, "tt_browser_webview_loading"));
        this.f7274V = findViewById(C2984t.m8432e(this.f7235e, "tt_back_container"));
        this.f7273U = findViewById(C2984t.m8432e(this.f7235e, "tt_loading_container"));
        this.f7276X = (TextView) findViewById(C2984t.m8432e(this.f7235e, "tt_back_container_title"));
        this.f7277Y = (TextView) findViewById(C2984t.m8432e(this.f7235e, "tt_back_container_des"));
        this.f7280ab = (TTRoundRectImageView) findViewById(C2984t.m8432e(this.f7235e, "tt_back_container_icon"));
        this.f7282ad = (TextView) findViewById(C2984t.m8432e(this.f7235e, "tt_back_container_download"));
        if (this.f7246p.mo19610M() != null && !TextUtils.isEmpty(this.f7246p.mo19610M().mo19559a())) {
            C3854d.m12660a().mo20704a(this.f7246p.mo19610M().mo19559a(), (ImageView) this.f7280ab);
        }
        this.f7276X.setText(this.f7246p.mo19608K());
        this.f7277Y.setText(this.f7246p.mo19619V());
        ((TextView) findViewById(C2984t.m8432e(this, "tt_ad_loading_logo"))).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTWebsiteActivity.m8985a(TTVideoLandingPageLink2Activity.this.f7235e, TTVideoLandingPageLink2Activity.this.f7246p, TTVideoLandingPageLink2Activity.this.f7216F);
            }
        });
        if (this.f7285ag) {
            ((ViewStub) findViewById(C2984t.m8432e(this, "tt_browser_new_bottom_bar_view_stub"))).setVisibility(0);
            LinearLayout linearLayout = (LinearLayout) findViewById(C2984t.m8432e(this, "tt_bottom_bar"));
            this.f7287ai = linearLayout;
            linearLayout.setVisibility(8);
            this.f7286ah = new C3228d(this, this.f7287ai, this.f7231a, this.f7246p, "landingpage_split_screen");
            if (this.f7231a.getWebView() != null) {
                this.f7231a.getWebView().setOnTouchListener(new View.OnTouchListener() {

                    /* renamed from: a */
                    float f7293a = 0.0f;

                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 0) {
                            this.f7293a = motionEvent.getY();
                        }
                        if (motionEvent.getAction() == 2) {
                            float y = motionEvent.getY();
                            float f = this.f7293a;
                            if (y - f > 8.0f) {
                                if (TTVideoLandingPageLink2Activity.this.f7286ah != null) {
                                    TTVideoLandingPageLink2Activity.this.f7286ah.mo18885a();
                                }
                                return false;
                            } else if (y - f < -8.0f && TTVideoLandingPageLink2Activity.this.f7286ah != null) {
                                TTVideoLandingPageLink2Activity.this.f7286ah.mo18887b();
                            }
                        }
                        return false;
                    }
                });
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8958a(String str) {
        C3156e.m9173a(this.f7235e, this.f7246p, "landingpage_split_screen", str, (JSONObject) null);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m8971m();
    }

    /* renamed from: m */
    private void m8971m() {
        this.f7270R = new AnimatorSet();
        LinearLayout linearLayout = this.f7271S;
        if (linearLayout != null) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(linearLayout.getChildAt(0), "translationY", new float[]{-9.0f, 9.0f}).setDuration(300);
            duration.setRepeatMode(2);
            duration.setRepeatCount(-1);
            AnimatorSet.Builder play = this.f7270R.play(duration);
            for (int i = 1; i < this.f7271S.getChildCount(); i++) {
                float f = i % 2 == 0 ? 9.0f : -9.0f;
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f7271S.getChildAt(i), "translationY", new float[]{-f, f}).setDuration(300);
                duration2.setRepeatMode(2);
                duration2.setRepeatCount(-1);
                play = play.with(duration2);
            }
            this.f7270R.start();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo18592e() {
        if (mo18593f()) {
            super.mo18592e();
            if (this.f7244n.getNativeVideoController() != null) {
                this.f7244n.getNativeVideoController().mo16434a(false);
                ((C3695b) this.f7244n.getNativeVideoController()).mo20339g(false);
                this.f7244n.setIsNeedShowDetail(false);
                this.f7242l.setClickable(true);
                this.f7242l.setOnTouchListener(new View.OnTouchListener() {
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() != 0) {
                            return false;
                        }
                        TTVideoLandingPageLink2Activity.this.m8958a("click_video");
                        return false;
                    }
                });
            }
            ((C3695b) this.f7244n.getNativeVideoController()).mo16430a((C2526c.C2527a) new C2526c.C2527a() {
                /* renamed from: a */
                public void mo16462a() {
                }

                /* renamed from: a */
                public void mo16463a(long j, int i) {
                }

                /* renamed from: b */
                public void mo16465b(long j, int i) {
                }

                /* renamed from: a */
                public void mo16464a(long j, long j2) {
                    if (TTVideoLandingPageLink2Activity.this.f7279aa != null) {
                        int max = (int) Math.max(0, (j2 - j) / 1000);
                        TextView k = TTVideoLandingPageLink2Activity.this.f7279aa;
                        k.setText(max + "");
                        if (max <= 0) {
                            TTVideoLandingPageLink2Activity.this.f7279aa.setVisibility(8);
                        }
                    }
                }
            });
            return;
        }
        try {
            ImageView imageView = new ImageView(this);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            C3854d.m12660a().mo20703a(this.f7246p.mo19613P().get(0), imageView);
            this.f7242l.setVisibility(0);
            this.f7242l.removeAllViews();
            this.f7242l.addView(imageView);
            imageView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    C3156e.m9190b(C3578m.m11231a(), TTVideoLandingPageLink2Activity.this.f7246p, "landingpage_split_screen");
                }
            });
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo18593f() {
        return this.f7243m == 5 || this.f7243m == 15 || this.f7243m == 50;
    }

    /* renamed from: j */
    public void mo18597j() {
        super.mo18597j();
        if (this.f7246p != null) {
            this.f7246p.mo19646a(true);
        }
        TextView textView = this.f7282ad;
        if (textView != null) {
            textView.setText(mo18589b());
            this.f7282ad.setClickable(true);
            this.f7282ad.setOnClickListener(this.f7227Q);
            this.f7282ad.setOnTouchListener(this.f7227Q);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m8972n() {
        AnimatorSet animatorSet = this.f7270R;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f7270R.removeAllListeners();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        m8972n();
        if (!this.f7275W && this.f7223M != null && this.f7231a != null && this.f7273U.getVisibility() == 8) {
            this.f7223M.mo18785a(this.f7231a);
        }
        super.onDestroy();
    }
}
