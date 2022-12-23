package com.bytedance.sdk.openadsdk.common;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.p155i.C3537f;
import com.bytedance.sdk.openadsdk.utils.C4020v;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.common.f */
/* compiled from: TTTitleNewStyleManager */
public class C3238f {

    /* renamed from: a */
    TTAdDislikeDialog f7658a;

    /* renamed from: b */
    TTAdDislikeToast f7659b;

    /* renamed from: c */
    final AtomicBoolean f7660c = new AtomicBoolean(false);

    /* renamed from: d */
    final AtomicBoolean f7661d = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final RelativeLayout f7662e;

    /* renamed from: f */
    private final C3498n f7663f;

    /* renamed from: g */
    private Context f7664g;

    /* renamed from: h */
    private ImageView f7665h;

    /* renamed from: i */
    private TextView f7666i;

    /* renamed from: j */
    private ImageView f7667j;

    /* renamed from: k */
    private ProgressBar f7668k;

    /* renamed from: l */
    private final int f7669l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f7670m;

    public C3238f(Context context, RelativeLayout relativeLayout, C3498n nVar) {
        this.f7664g = context;
        this.f7662e = relativeLayout;
        this.f7663f = nVar;
        this.f7669l = C4020v.m13315e(C3578m.m11231a(), 44.0f);
        m9440e();
    }

    /* renamed from: e */
    private void m9440e() {
        this.f7665h = (ImageView) this.f7662e.findViewById(C2984t.m8432e(this.f7664g, "tt_title_bar_close"));
        this.f7666i = (TextView) this.f7662e.findViewById(C2984t.m8432e(this.f7664g, "tt_title_bar_title"));
        this.f7667j = (ImageView) this.f7662e.findViewById(C2984t.m8432e(this.f7664g, "tt_title_bar_feedback"));
        this.f7668k = (ProgressBar) this.f7662e.findViewById(C2984t.m8432e(this.f7664g, "tt_title_bar_browser_progress"));
        C3498n nVar = this.f7663f;
        if (nVar != null) {
            this.f7666i.setText(TextUtils.isEmpty(nVar.mo19618U()) ? C2984t.m8425a(this.f7664g, "tt_web_title_default") : this.f7663f.mo19618U());
        }
        this.f7667j.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C3238f.this.mo18903d();
            }
        });
    }

    /* renamed from: a */
    public void mo18900a(WebView webView, int i) {
        if (i == 100) {
            this.f7668k.setVisibility(8);
            return;
        }
        this.f7668k.setVisibility(0);
        this.f7668k.setProgress(i);
    }

    /* renamed from: a */
    public void mo18899a() {
        try {
            final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f7662e.getLayoutParams();
            if (!this.f7670m && marginLayoutParams.topMargin == (-this.f7669l)) {
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{-this.f7669l, 0});
                ofInt.setDuration(300);
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        C3238f.this.f7662e.setLayoutParams(marginLayoutParams);
                    }
                });
                ofInt.addListener(new Animator.AnimatorListener() {
                    public void onAnimationCancel(Animator animator) {
                    }

                    public void onAnimationRepeat(Animator animator) {
                    }

                    public void onAnimationStart(Animator animator) {
                        boolean unused = C3238f.this.f7670m = true;
                    }

                    public void onAnimationEnd(Animator animator) {
                        boolean unused = C3238f.this.f7670m = false;
                    }
                });
                ofInt.start();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public void mo18901b() {
        try {
            final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f7662e.getLayoutParams();
            if (!this.f7670m && marginLayoutParams.topMargin == 0) {
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, -this.f7669l});
                ofInt.setDuration(300);
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        C3238f.this.f7662e.setLayoutParams(marginLayoutParams);
                    }
                });
                ofInt.addListener(new Animator.AnimatorListener() {
                    public void onAnimationCancel(Animator animator) {
                    }

                    public void onAnimationRepeat(Animator animator) {
                    }

                    public void onAnimationStart(Animator animator) {
                        boolean unused = C3238f.this.f7670m = true;
                    }

                    public void onAnimationEnd(Animator animator) {
                        boolean unused = C3238f.this.f7670m = false;
                    }
                });
                ofInt.start();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public ImageView mo18902c() {
        return this.f7665h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo18903d() {
        if (this.f7661d.get()) {
            m9442g();
            return;
        }
        if (this.f7658a == null) {
            m9441f();
        }
        this.f7658a.mo18867a();
    }

    /* renamed from: f */
    private void m9441f() {
        try {
            if (this.f7658a == null) {
                TTAdDislikeDialog tTAdDislikeDialog = new TTAdDislikeDialog(this.f7664g, this.f7663f);
                this.f7658a = tTAdDislikeDialog;
                tTAdDislikeDialog.setCallback(new TTAdDislikeDialog.C3222a() {
                    /* renamed from: c */
                    public void mo18407c(View view) {
                    }

                    /* renamed from: a */
                    public void mo18405a(View view) {
                        C3238f.this.f7660c.set(true);
                    }

                    /* renamed from: b */
                    public void mo18406b(View view) {
                        C3238f.this.f7660c.set(false);
                    }

                    /* renamed from: a */
                    public void mo18404a(int i, FilterWord filterWord) {
                        if (!C3238f.this.f7661d.get() && filterWord != null && !filterWord.hasSecondOptions()) {
                            C3238f.this.f7661d.set(true);
                        }
                    }
                });
            }
            ((FrameLayout) this.f7662e.getRootView().findViewById(16908290)).addView(this.f7658a);
            if (this.f7659b == null) {
                this.f7659b = new TTAdDislikeToast(this.f7664g);
                ((FrameLayout) this.f7662e.getRootView().findViewById(16908290)).addView(this.f7659b);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: g */
    private void m9442g() {
        this.f7659b.mo18875a(C3537f.f8809d);
    }
}
