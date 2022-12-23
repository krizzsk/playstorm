package com.applovin.impl.adview;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.applovin.impl.adview.C1525i;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p046ad.C1824a;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.p049d.C1869d;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.adview.l */
class C1532l extends Dialog implements C1531k {

    /* renamed from: a */
    private final Activity f1917a;

    /* renamed from: b */
    private final C1959m f1918b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2092v f1919c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1513d f1920d;

    /* renamed from: e */
    private final C1824a f1921e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public RelativeLayout f1922f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C1525i f1923g;

    C1532l(C1824a aVar, C1513d dVar, Activity activity, C1959m mVar) {
        super(activity, 16973840);
        if (aVar == null) {
            throw new IllegalArgumentException("No ad specified");
        } else if (dVar == null) {
            throw new IllegalArgumentException("No main view specified");
        } else if (mVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        } else if (activity != null) {
            this.f1918b = mVar;
            this.f1919c = mVar.mo14286A();
            this.f1917a = activity;
            this.f1920d = dVar;
            this.f1921e = aVar;
            requestWindowFeature(1);
            setCancelable(false);
        } else {
            throw new IllegalArgumentException("No activity specified");
        }
    }

    /* renamed from: a */
    private int m2819a(int i) {
        return AppLovinSdkUtils.dpToPx(this.f1917a, i);
    }

    /* renamed from: a */
    private void m2821a(C1525i.C1526a aVar) {
        if (this.f1923g == null) {
            C1525i a = C1525i.m2800a(aVar, this.f1917a);
            this.f1923g = a;
            a.setVisibility(8);
            this.f1923g.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    C1532l.this.m2825d();
                }
            });
            this.f1923g.setClickable(false);
            int a2 = m2819a(((Integer) this.f1918b.mo14311a(C1857b.f3144bU)).intValue());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a2, a2);
            layoutParams.addRule(10);
            int i = 9;
            layoutParams.addRule(((Boolean) this.f1918b.mo14311a(C1857b.f3147bX)).booleanValue() ? 9 : 11);
            this.f1923g.mo12959a(a2);
            int a3 = m2819a(((Integer) this.f1918b.mo14311a(C1857b.f3146bW)).intValue());
            int a4 = m2819a(((Integer) this.f1918b.mo14311a(C1857b.f3145bV)).intValue());
            layoutParams.setMargins(a4, a3, a4, 0);
            this.f1922f.addView(this.f1923g, layoutParams);
            this.f1923g.bringToFront();
            int a5 = m2819a(((Integer) this.f1918b.mo14311a(C1857b.f3148bY)).intValue());
            View view = new View(this.f1917a);
            view.setBackgroundColor(0);
            int i2 = a2 + a5;
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i2, i2);
            layoutParams2.addRule(10);
            if (!((Boolean) this.f1918b.mo14311a(C1857b.f3147bX)).booleanValue()) {
                i = 11;
            }
            layoutParams2.addRule(i);
            layoutParams2.setMargins(a4 - m2819a(5), a3 - m2819a(5), a4 - m2819a(5), 0);
            view.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (C1532l.this.f1923g.isClickable()) {
                        C1532l.this.f1923g.performClick();
                    }
                }
            });
            this.f1922f.addView(view, layoutParams2);
            view.bringToFront();
        } else if (C2092v.m5047a()) {
            this.f1919c.mo14792d("ExpandedAdDialog", "Attempting to create duplicate close button");
        }
    }

    /* renamed from: c */
    private void m2823c() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f1920d.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(this.f1917a);
        this.f1922f = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f1922f.setBackgroundColor(-1157627904);
        this.f1922f.addView(this.f1920d);
        if (!this.f1921e.mo13920m()) {
            m2821a(this.f1921e.mo13921n());
            m2828e();
        }
        setContentView(this.f1922f);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m2825d() {
        this.f1920d.mo12928a("javascript:al_onCloseTapped();", (Runnable) new Runnable() {
            public void run() {
                C1532l.this.dismiss();
            }
        });
    }

    /* renamed from: e */
    private void m2828e() {
        this.f1917a.runOnUiThread(new Runnable() {
            public void run() {
                try {
                    if (C1532l.this.f1923g == null) {
                        C1532l.this.m2825d();
                    }
                    C1532l.this.f1923g.setVisibility(0);
                    C1532l.this.f1923g.bringToFront();
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(300);
                    alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
                        public void onAnimationEnd(Animation animation) {
                            C1532l.this.f1923g.setClickable(true);
                        }

                        public void onAnimationRepeat(Animation animation) {
                        }

                        public void onAnimationStart(Animation animation) {
                        }
                    });
                    C1532l.this.f1923g.startAnimation(alphaAnimation);
                } catch (Throwable th) {
                    if (C2092v.m5047a()) {
                        C1532l.this.f1919c.mo14790b("ExpandedAdDialog", "Unable to fade in close button", th);
                    }
                    C1532l.this.m2825d();
                }
            }
        });
    }

    /* renamed from: a */
    public C1824a mo12972a() {
        return this.f1921e;
    }

    /* renamed from: b */
    public C1513d mo12973b() {
        return this.f1920d;
    }

    public void dismiss() {
        C1869d statsManagerHelper = this.f1920d.getStatsManagerHelper();
        if (statsManagerHelper != null) {
            statsManagerHelper.mo14110e();
        }
        this.f1917a.runOnUiThread(new Runnable() {
            public void run() {
                C1532l.this.f1922f.removeView(C1532l.this.f1920d);
                C1532l.super.dismiss();
            }
        });
    }

    public void onBackPressed() {
        this.f1920d.mo12928a("javascript:al_onBackPressed();", (Runnable) new Runnable() {
            public void run() {
                C1532l.this.dismiss();
            }
        });
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m2823c();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        try {
            Window window = getWindow();
            if (window != null) {
                window.setFlags(this.f1917a.getWindow().getAttributes().flags, this.f1917a.getWindow().getAttributes().flags);
                window.addFlags(16777216);
            } else if (C2092v.m5047a()) {
                this.f1919c.mo14793e("ExpandedAdDialog", "Unable to turn on hardware acceleration - window is null");
            }
        } catch (Throwable th) {
            if (C2092v.m5047a()) {
                this.f1919c.mo14790b("ExpandedAdDialog", "Setting window flags failed.", th);
            }
        }
    }
}
