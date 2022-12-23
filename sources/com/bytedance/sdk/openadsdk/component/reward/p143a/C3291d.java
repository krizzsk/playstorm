package com.bytedance.sdk.openadsdk.component.reward.p143a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.sdk.component.p110d.C2898j;
import com.bytedance.sdk.component.p110d.C2902n;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.core.widget.TwoSemicirclesView;
import com.bytedance.sdk.openadsdk.p167d.C3769a;
import com.bytedance.sdk.openadsdk.utils.C4020v;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.a.d */
/* compiled from: RewardFullVideoLoadingManager */
public class C3291d {

    /* renamed from: a */
    TTRoundRectImageView f7815a;

    /* renamed from: b */
    TextView f7816b;

    /* renamed from: c */
    ProgressBar f7817c;

    /* renamed from: d */
    TextView f7818d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C3498n f7819e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Context f7820f;

    /* renamed from: g */
    private int f7821g = 0;

    /* renamed from: h */
    private View f7822h;

    /* renamed from: i */
    private boolean f7823i = false;

    /* renamed from: j */
    private LinearLayout f7824j;

    /* renamed from: k */
    private TwoSemicirclesView f7825k;

    /* renamed from: l */
    private TwoSemicirclesView f7826l;

    /* renamed from: m */
    private TextView f7827m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public String f7828n;

    /* renamed from: o */
    private int f7829o;

    /* renamed from: p */
    private AnimatorSet f7830p;

    /* renamed from: q */
    private AnimatorSet f7831q;

    public C3291d(Context context) {
        this.f7820f = context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:8|9|10|11|(2:13|(2:15|(2:17|(2:19|29)(2:20|30))(2:21|31))(2:22|32))(2:23|33)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002c */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037 A[Catch:{ all -> 0x0054 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004f A[Catch:{ all -> 0x0054 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19040a(com.bytedance.sdk.openadsdk.core.p151e.C3498n r3, java.lang.String r4, int r5) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            r0 = 0
            r2.f7819e = r3     // Catch:{ all -> 0x0054 }
            boolean r3 = com.bytedance.sdk.openadsdk.core.p151e.C3498n.m10583c((com.bytedance.sdk.openadsdk.core.p151e.C3498n) r3)     // Catch:{ all -> 0x0054 }
            if (r3 == 0) goto L_0x0053
            com.bytedance.sdk.openadsdk.core.e.n r3 = r2.f7819e     // Catch:{ all -> 0x0054 }
            boolean r3 = com.bytedance.sdk.openadsdk.core.p151e.C3501p.m10769i(r3)     // Catch:{ all -> 0x0054 }
            if (r3 == 0) goto L_0x0015
            goto L_0x0053
        L_0x0015:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x002c }
            com.bytedance.sdk.openadsdk.core.e.n r1 = r2.f7819e     // Catch:{ JSONException -> 0x002c }
            com.bytedance.sdk.openadsdk.core.e.n$a r1 = r1.mo19604G()     // Catch:{ JSONException -> 0x002c }
            java.lang.String r1 = r1.mo19772g()     // Catch:{ JSONException -> 0x002c }
            r3.<init>(r1)     // Catch:{ JSONException -> 0x002c }
            java.lang.String r1 = "loading_page_type"
            int r3 = r3.optInt(r1, r0)     // Catch:{ JSONException -> 0x002c }
            r2.f7821g = r3     // Catch:{ JSONException -> 0x002c }
        L_0x002c:
            r2.f7828n = r4     // Catch:{ all -> 0x0054 }
            r2.f7829o = r5     // Catch:{ all -> 0x0054 }
            r3 = 1
            r2.f7823i = r3     // Catch:{ all -> 0x0054 }
            int r4 = r2.f7821g     // Catch:{ all -> 0x0054 }
            if (r4 == r3) goto L_0x004f
            r3 = 2
            if (r4 == r3) goto L_0x004b
            r3 = 3
            if (r4 == r3) goto L_0x0047
            r3 = 4
            if (r4 == r3) goto L_0x0043
            r2.f7823i = r0     // Catch:{ all -> 0x0054 }
            goto L_0x0056
        L_0x0043:
            r2.m9674h()     // Catch:{ all -> 0x0054 }
            goto L_0x0056
        L_0x0047:
            r2.m9673g()     // Catch:{ all -> 0x0054 }
            goto L_0x0056
        L_0x004b:
            r2.m9672f()     // Catch:{ all -> 0x0054 }
            goto L_0x0056
        L_0x004f:
            r2.m9671e()     // Catch:{ all -> 0x0054 }
            goto L_0x0056
        L_0x0053:
            return
        L_0x0054:
            r2.f7823i = r0
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.p143a.C3291d.mo19040a(com.bytedance.sdk.openadsdk.core.e.n, java.lang.String, int):void");
    }

    /* renamed from: a */
    public void mo19039a() {
        try {
            int i = this.f7821g;
            if (i == 1) {
                m9675i();
            } else if (i == 2) {
                m9676j();
            } else if (i == 3) {
                m9677k();
            } else if (i == 4) {
                m9678l();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    private void m9671e() {
        View inflate = LayoutInflater.from(this.f7820f).inflate(C2984t.m8433f(this.f7820f, "tt_full_reward_video_loading"), (ViewGroup) null, false);
        this.f7822h = inflate;
        this.f7815a = (TTRoundRectImageView) inflate.findViewById(C2984t.m8432e(this.f7820f, "tt_loading_icon"));
        this.f7816b = (TextView) this.f7822h.findViewById(C2984t.m8432e(this.f7820f, "tt_loading_appname"));
        this.f7817c = (ProgressBar) this.f7822h.findViewById(C2984t.m8432e(this.f7820f, "tt_loading_progressbar"));
        this.f7818d = (TextView) this.f7822h.findViewById(C2984t.m8432e(this.f7820f, "tt_loading_progress_number"));
        this.f7827m = (TextView) this.f7822h.findViewById(C2984t.m8432e(this.f7820f, "tt_ad_loading_logo"));
        if (this.f7829o == 1 && this.f7819e.mo19657aa() != null && !TextUtils.isEmpty(this.f7819e.mo19657aa().mo19495b())) {
            this.f7816b.setText(this.f7819e.mo19657aa().mo19495b());
        } else if (!TextUtils.isEmpty(this.f7819e.mo19618U())) {
            this.f7816b.setText(this.f7819e.mo19618U());
        } else {
            this.f7816b.setVisibility(8);
        }
        m9679m();
        this.f7827m.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTWebsiteActivity.m8985a(C3291d.this.f7820f, C3291d.this.f7819e, C3291d.this.f7828n);
            }
        });
    }

    /* renamed from: f */
    private void m9672f() {
        View inflate = LayoutInflater.from(this.f7820f).inflate(C2984t.m8433f(this.f7820f, "tt_full_reward_video_loading2"), (ViewGroup) null, false);
        this.f7822h = inflate;
        this.f7815a = (TTRoundRectImageView) inflate.findViewById(C2984t.m8432e(this.f7820f, "tt_loading_icon"));
        this.f7818d = (TextView) this.f7822h.findViewById(C2984t.m8432e(this.f7820f, "tt_loading_progress_number"));
        this.f7827m = (TextView) this.f7822h.findViewById(C2984t.m8432e(this.f7820f, "tt_ad_loading_logo"));
        m9679m();
        this.f7827m.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTWebsiteActivity.m8985a(C3291d.this.f7820f, C3291d.this.f7819e, C3291d.this.f7828n);
            }
        });
    }

    /* renamed from: g */
    private void m9673g() {
        View inflate = LayoutInflater.from(this.f7820f).inflate(C2984t.m8433f(this.f7820f, "tt_full_reward_video_loading3"), (ViewGroup) null, false);
        this.f7822h = inflate;
        this.f7824j = (LinearLayout) inflate.findViewById(C2984t.m8432e(this.f7820f, "wave_container"));
        this.f7818d = (TextView) this.f7822h.findViewById(C2984t.m8432e(this.f7820f, "tt_loading_progress_number"));
        TextView textView = (TextView) this.f7822h.findViewById(C2984t.m8432e(this.f7820f, "tt_ad_loading_logo"));
        this.f7827m = textView;
        textView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTWebsiteActivity.m8985a(C3291d.this.f7820f, C3291d.this.f7819e, C3291d.this.f7828n);
            }
        });
    }

    /* renamed from: h */
    private void m9674h() {
        View inflate = LayoutInflater.from(this.f7820f).inflate(C2984t.m8433f(this.f7820f, "tt_full_reward_video_loading4"), (ViewGroup) null, false);
        this.f7822h = inflate;
        this.f7825k = (TwoSemicirclesView) inflate.findViewById(C2984t.m8432e(this.f7820f, "inner_circle"));
        this.f7826l = (TwoSemicirclesView) this.f7822h.findViewById(C2984t.m8432e(this.f7820f, "outer_circle"));
        this.f7825k.setRadius((float) C4020v.m13315e(this.f7820f, 80.0f));
        Paint paintTwo = this.f7825k.getPaintTwo();
        paintTwo.setColor(Color.parseColor("#C4C4C4"));
        this.f7825k.setPaintTwo(paintTwo);
        this.f7826l.setRadius((float) C4020v.m13315e(this.f7820f, 95.0f));
        Paint paintTwo2 = this.f7826l.getPaintTwo();
        paintTwo2.setStrokeWidth(6.0f);
        paintTwo2.setColor(Color.parseColor("#118BFF"));
        this.f7826l.setPaintTwo(paintTwo2);
        this.f7818d = (TextView) this.f7822h.findViewById(C2984t.m8432e(this.f7820f, "tt_loading_progress_number"));
        TextView textView = (TextView) this.f7822h.findViewById(C2984t.m8432e(this.f7820f, "tt_ad_loading_logo"));
        this.f7827m = textView;
        textView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTWebsiteActivity.m8985a(C3291d.this.f7820f, C3291d.this.f7819e, C3291d.this.f7828n);
            }
        });
    }

    /* renamed from: i */
    private void m9675i() {
        m9680n();
    }

    /* renamed from: j */
    private void m9676j() {
        Context context = this.f7820f;
        this.f7815a.setAnimation(AnimationUtils.loadAnimation(context, C2984t.m8439l(context, "tt_loading_two_icon_scale")));
        m9680n();
    }

    /* renamed from: k */
    private void m9677k() {
        this.f7830p = new AnimatorSet();
        LinearLayout linearLayout = this.f7824j;
        if (linearLayout != null) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(linearLayout.getChildAt(0), "translationY", new float[]{-9.0f, 9.0f}).setDuration(300);
            duration.setRepeatMode(2);
            duration.setRepeatCount(-1);
            AnimatorSet.Builder play = this.f7830p.play(duration);
            for (int i = 1; i < this.f7824j.getChildCount(); i++) {
                float f = i % 2 == 0 ? 9.0f : -9.0f;
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f7824j.getChildAt(i), "translationY", new float[]{-f, f}).setDuration(300);
                duration2.setRepeatMode(2);
                duration2.setRepeatCount(-1);
                play = play.with(duration2);
            }
            this.f7830p.start();
        }
        m9680n();
    }

    /* renamed from: l */
    private void m9678l() {
        this.f7830p = new AnimatorSet();
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f7825k, "rotation", new float[]{0.0f, 360.0f}).setDuration(1500);
        duration.setInterpolator(new LinearInterpolator());
        duration.setRepeatCount(-1);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f7826l, "rotation", new float[]{0.0f, 360.0f}).setDuration(2500);
        duration2.setRepeatCount(-1);
        this.f7830p.playTogether(new Animator[]{duration, duration2});
        this.f7830p.start();
        m9680n();
    }

    /* renamed from: m */
    private void m9679m() {
        if (this.f7819e.mo19610M() == null || TextUtils.isEmpty(this.f7819e.mo19610M().mo19559a())) {
            this.f7815a.setVisibility(8);
            return;
        }
        try {
            C3769a.m12387a(this.f7819e.mo19610M()).mo17711a((C2902n) new C2902n<Bitmap>() {
                /* renamed from: a */
                public void mo17257a(C2898j<Bitmap> jVar) {
                    if (jVar != null) {
                        try {
                            if (jVar.mo17725b() != null) {
                                C3291d.this.f7815a.setImageBitmap(jVar.mo17725b());
                                return;
                            }
                        } catch (Throwable unused) {
                            C3291d.this.f7815a.setVisibility(8);
                            return;
                        }
                    }
                    C3291d.this.f7815a.setVisibility(8);
                }

                /* renamed from: a */
                public void mo17256a(int i, String str, Throwable th) {
                    C3291d.this.f7815a.setVisibility(8);
                }
            });
        } catch (Throwable unused) {
            this.f7815a.setVisibility(8);
        }
    }

    /* renamed from: n */
    private void m9680n() {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{1, 80});
        ofInt.setDuration(2000);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (C3291d.this.f7817c != null) {
                    C3291d.this.f7817c.setProgress(intValue);
                }
                C3291d.this.f7818d.setText(String.valueOf(intValue));
            }
        });
        ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{81, 99});
        ofInt2.setDuration(3000);
        ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (C3291d.this.f7817c != null) {
                    C3291d.this.f7817c.setProgress(intValue);
                }
                C3291d.this.f7818d.setText(String.valueOf(intValue));
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofInt).before(ofInt2);
        animatorSet.start();
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f7831q = animatorSet2;
        animatorSet2.play(ofInt).before(ofInt2);
        this.f7831q.start();
    }

    /* renamed from: b */
    public void mo19041b() {
        AnimatorSet animatorSet = this.f7830p;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.f7831q;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
    }

    /* renamed from: c */
    public View mo19042c() {
        return this.f7822h;
    }

    /* renamed from: d */
    public boolean mo19043d() {
        return this.f7823i;
    }
}
