package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.core.C3524h;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.utils.C4020v;

public class BannerExpressView extends FrameLayout {

    /* renamed from: a */
    protected final Context f8337a;

    /* renamed from: b */
    protected NativeExpressView f8338b;

    /* renamed from: c */
    protected NativeExpressView f8339c;

    /* renamed from: d */
    protected C3498n f8340d;

    /* renamed from: e */
    protected AdSlot f8341e;

    /* renamed from: f */
    protected TTNativeExpressAd.ExpressAdInteractionListener f8342f;

    /* renamed from: g */
    protected TTNativeExpressAd.ExpressVideoAdListener f8343g;

    /* renamed from: h */
    protected int f8344h;

    /* renamed from: i */
    protected boolean f8345i;

    /* renamed from: j */
    protected String f8346j = "banner_ad";

    public BannerExpressView(Context context, C3498n nVar, AdSlot adSlot) {
        super(context);
        this.f8337a = context;
        this.f8340d = nVar;
        this.f8341e = adSlot;
        mo19428a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19428a() {
        NativeExpressView nativeExpressView = new NativeExpressView(this.f8337a, this.f8340d, this.f8341e, this.f8346j);
        this.f8338b = nativeExpressView;
        addView(nativeExpressView, new ViewGroup.LayoutParams(-1, -1));
    }

    /* renamed from: a */
    public void mo19429a(C3498n nVar, AdSlot adSlot) {
        NativeExpressView nativeExpressView = new NativeExpressView(this.f8337a, nVar, adSlot, this.f8346j);
        this.f8339c = nativeExpressView;
        nativeExpressView.setExpressInteractionListener(new TTNativeExpressAd.ExpressAdInteractionListener() {
            public void onAdShow(View view, int i) {
            }

            public void onRenderFail(View view, String str, int i) {
            }

            public void onAdClicked(View view, int i) {
                if (BannerExpressView.this.f8342f != null) {
                    BannerExpressView.this.f8342f.onAdClicked(BannerExpressView.this, i);
                }
            }

            public void onRenderSuccess(View view, float f, float f2) {
                BannerExpressView.this.mo19431a(f, f2);
                if (BannerExpressView.this.f8339c != null) {
                    BannerExpressView.this.f8339c.setSoundMute(true);
                }
                BannerExpressView.this.mo19435e();
            }
        });
        C4020v.m13282a((View) this.f8339c, 8);
        addView(this.f8339c, new ViewGroup.LayoutParams(-1, -1));
    }

    public void setVideoAdListener(TTNativeExpressAd.ExpressVideoAdListener expressVideoAdListener) {
        this.f8343g = expressVideoAdListener;
    }

    public void setExpressInteractionListener(TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener) {
        this.f8342f = expressAdInteractionListener;
        NativeExpressView nativeExpressView = this.f8338b;
        if (nativeExpressView != null) {
            nativeExpressView.setExpressInteractionListener(new TTNativeExpressAd.ExpressAdInteractionListener() {
                public void onAdShow(View view, int i) {
                }

                public void onAdClicked(View view, int i) {
                    if (BannerExpressView.this.f8342f != null) {
                        BannerExpressView.this.f8342f.onAdClicked(BannerExpressView.this, i);
                    }
                }

                public void onRenderFail(View view, String str, int i) {
                    if (BannerExpressView.this.f8342f != null) {
                        BannerExpressView.this.f8342f.onRenderFail(BannerExpressView.this, str, i);
                    }
                }

                public void onRenderSuccess(View view, float f, float f2) {
                    if (BannerExpressView.this.f8338b != null) {
                        BannerExpressView.this.f8338b.setSoundMute(true);
                    }
                    BannerExpressView.this.mo19431a(f, f2);
                    if (BannerExpressView.this.f8342f != null) {
                        BannerExpressView.this.f8342f.onRenderSuccess(BannerExpressView.this, f, f2);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19431a(float f, float f2) {
        int b = (int) C4020v.m13297b(this.f8337a, f);
        int b2 = (int) C4020v.m13297b(this.f8337a, f2);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(b, b2);
        }
        layoutParams.width = b;
        layoutParams.height = b2;
        setLayoutParams(layoutParams);
    }

    /* renamed from: b */
    public void mo19432b() {
        NativeExpressView nativeExpressView = this.f8338b;
        if (nativeExpressView != null) {
            nativeExpressView.mo20125j();
        }
    }

    /* renamed from: c */
    public void mo19433c() {
        if (this.f8338b != null) {
            C3524h.m10852d().mo19856f(this.f8338b.getClosedListenerKey());
            removeView(this.f8338b);
            this.f8338b.mo20127l();
            this.f8338b = null;
        }
        if (this.f8339c != null) {
            C3524h.m10852d().mo19856f(this.f8339c.getClosedListenerKey());
            removeView(this.f8339c);
            this.f8339c.mo20127l();
            this.f8339c = null;
        }
        C3524h.m10852d().mo19873w();
    }

    public NativeExpressView getCurView() {
        return this.f8338b;
    }

    public NativeExpressView getNextView() {
        return this.f8339c;
    }

    public void setDuration(int i) {
        this.f8344h = i;
    }

    /* renamed from: a */
    private ObjectAnimator m10302a(NativeExpressView nativeExpressView) {
        return ObjectAnimator.ofFloat(nativeExpressView, "translationX", new float[]{0.0f, (float) (-getWidth())});
    }

    /* renamed from: b */
    private ObjectAnimator m10304b(NativeExpressView nativeExpressView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(nativeExpressView, "translationX", new float[]{(float) getWidth(), 0.0f});
        ofFloat.addListener(new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                BannerExpressView.this.f8345i = false;
                BannerExpressView.this.m10305g();
            }
        });
        return ofFloat;
    }

    /* renamed from: d */
    public void mo19434d() {
        NativeExpressView nativeExpressView = this.f8339c;
        if (nativeExpressView != null) {
            nativeExpressView.mo20125j();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo19435e() {
        try {
            if (!this.f8345i && this.f8339c != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(m10302a(this.f8338b)).with(m10304b(this.f8339c));
                animatorSet.setDuration((long) this.f8344h).start();
                C4020v.m13282a((View) this.f8339c, 0);
                this.f8345i = true;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: f */
    public boolean mo19436f() {
        return this.f8339c != null;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m10305g() {
        NativeExpressView nativeExpressView = this.f8338b;
        this.f8338b = this.f8339c;
        this.f8339c = nativeExpressView;
        if (nativeExpressView != null) {
            removeView(nativeExpressView);
            this.f8339c.mo20127l();
            this.f8339c = null;
        }
    }
}
