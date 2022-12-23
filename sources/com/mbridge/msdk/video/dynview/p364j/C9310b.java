package com.mbridge.msdk.video.dynview.p364j;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.tools.C8594o;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.video.dynview.C9252c;
import com.mbridge.msdk.video.dynview.p350a.C9248a;
import com.mbridge.msdk.video.dynview.p359h.C9288b;
import com.mbridge.msdk.video.dynview.p360i.p362b.C9298a;
import com.mbridge.msdk.video.dynview.widget.MBridgeFramLayout;
import com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView;
import com.mbridge.msdk.video.dynview.widget.MBridgeRelativeLayout;
import com.mbridge.msdk.video.dynview.widget.MBridgeTextView;
import com.mbridge.msdk.video.module.MBridgeClickCTAView;

/* renamed from: com.mbridge.msdk.video.dynview.j.b */
/* compiled from: UIEnergizeWrapper */
public final class C9310b {

    /* renamed from: a */
    private String f22572a = "mbridge_top_play_bg";

    /* renamed from: b */
    private String f22573b = "mbridge_top_finger_bg";

    /* renamed from: c */
    private String f22574c = "mbridge_bottom_play_bg";

    /* renamed from: d */
    private String f22575d = "mbridge_bottom_finger_bg";

    /* renamed from: e */
    private String f22576e = "mbridge_tv_count";

    /* renamed from: f */
    private String f22577f = "mbridge_sound_switch";

    /* renamed from: g */
    private String f22578g = "mbridge_top_control";

    /* renamed from: h */
    private String f22579h = "mbridge_tv_title";

    /* renamed from: i */
    private String f22580i = "mbridge_tv_desc";

    /* renamed from: j */
    private String f22581j = "mbridge_tv_install";

    /* renamed from: k */
    private String f22582k = "mbridge_sv_starlevel";

    /* renamed from: l */
    private String f22583l = "mbridge_tv_cta";

    /* renamed from: m */
    private String f22584m = "mbridge_native_ec_controller";

    /* renamed from: n */
    private String f22585n = "mbridge_reward_shape_choice_rl";

    /* renamed from: o */
    private String f22586o = "#FFFFFF";

    /* renamed from: p */
    private String f22587p = "#FF000000";

    /* renamed from: q */
    private String f22588q = "#40000000";

    /* renamed from: r */
    private String f22589r = "#CAEF79";

    /* renamed from: s */
    private String f22590s = "#2196F3";

    /* renamed from: t */
    private String f22591t = "#402196F3";

    /* renamed from: u */
    private String f22592u = "#8FC31F";

    /* renamed from: v */
    private String f22593v = "#03A9F4";

    /* renamed from: a */
    public final void mo62506a(View view) {
        if (view != null && (view instanceof MBridgeFramLayout)) {
            MBridgeFramLayout mBridgeFramLayout = (MBridgeFramLayout) view;
            AnimatorSet animatorSet = new AnimatorSet();
            if (view.getContext() != null) {
                ImageView imageView = (ImageView) view.findViewById(m26698a(this.f22572a));
                ImageView imageView2 = (ImageView) view.findViewById(m26698a(this.f22573b));
                ImageView imageView3 = (ImageView) view.findViewById(m26698a(this.f22574c));
                ImageView imageView4 = (ImageView) view.findViewById(m26698a(this.f22575d));
                ObjectAnimator objectAnimator = null;
                ObjectAnimator a = imageView != null ? new C9288b().mo62472a(imageView) : null;
                ObjectAnimator b = imageView2 != null ? new C9288b().mo62476b(imageView2) : null;
                ObjectAnimator a2 = imageView3 != null ? new C9288b().mo62472a(imageView3) : null;
                if (imageView4 != null) {
                    objectAnimator = new C9288b().mo62476b(imageView4);
                }
                if (a != null && a2 != null && b != null && objectAnimator != null) {
                    animatorSet.playTogether(new Animator[]{a, a2, b, objectAnimator});
                    mBridgeFramLayout.setAnimatorSet(animatorSet);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo62507a(View view, C9252c cVar) {
        String str;
        String str2;
        Context context = view != null ? view.getContext() : null;
        if (context != null && cVar != null) {
            TextView textView = (TextView) view.findViewById(m26698a(this.f22576e));
            if (textView != null) {
                textView.setBackgroundResource(C8594o.m24812a(context, "mbridge_reward_shape_progress", "drawable"));
                textView.setTextColor(Color.parseColor(this.f22586o));
                textView.setTextSize(11.0f);
            }
            TextView textView2 = (TextView) view.findViewById(m26698a("mbridge_reward_click_tv"));
            if (textView2 != null) {
                textView2.setTextSize(20.0f);
                if (textView2 instanceof MBridgeTextView) {
                    ((MBridgeTextView) textView2).setObjectAnimator(new C9288b().mo62478c(textView2));
                }
            }
            if (cVar != null) {
                String str3 = this.f22587p;
                String str4 = this.f22589r;
                float f = 1.0f;
                float f2 = 5.0f;
                int i = cVar.mo62372i();
                if (i == 302) {
                    str2 = this.f22590s;
                    str = this.f22593v;
                    str3 = this.f22586o;
                    str4 = this.f22591t;
                    f2 = 10.0f;
                } else if (i != 802) {
                    str2 = this.f22592u;
                    str = this.f22589r;
                } else {
                    str2 = this.f22586o;
                    str3 = this.f22587p;
                    str4 = this.f22588q;
                    f = 0.5f;
                    f2 = 25.0f;
                    str = str2;
                }
                float f3 = f2;
                String str5 = str4;
                float f4 = f;
                float f5 = f3;
                if (textView2 != null) {
                    textView2.setTextColor(Color.parseColor(str3));
                    C9298a.m26665a(textView2, f4, f5, str5, new String[]{str2, str}, GradientDrawable.Orientation.LEFT_RIGHT);
                }
                if (cVar.mo62369f() != null) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cVar.mo62369f().getLayoutParams();
                    layoutParams.setMargins(0, 0, 0, 0);
                    cVar.mo62369f().setLayoutParams(layoutParams);
                }
                RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(m26698a(this.f22578g));
                if (relativeLayout == null) {
                    return;
                }
                if (C9248a.f22400a != 0 || C9248a.f22401b != 0 || C9248a.f22402c != 0 || C9248a.f22403d != 0) {
                    relativeLayout.setVisibility(4);
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
                    layoutParams2.setMargins(layoutParams2.leftMargin + C9248a.f22400a, layoutParams2.topMargin + C9248a.f22402c, layoutParams2.rightMargin + C9248a.f22401b, layoutParams2.bottomMargin + C9248a.f22403d);
                    relativeLayout.setLayoutParams(layoutParams2);
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
                    alphaAnimation.setDuration(200);
                    relativeLayout.startAnimation(alphaAnimation);
                    relativeLayout.setVisibility(0);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo62508b(View view, C9252c cVar) {
        Context context;
        int i;
        if (view != null && cVar != null && (context = view.getContext()) != null) {
            if (cVar.mo62368e() == 1) {
                view.setBackground(context.getResources().getDrawable(C8594o.m24812a(context, this.f22585n, "drawable")));
                TextView textView = (TextView) view.findViewById(m26698a(this.f22579h));
                if (textView != null) {
                    textView.setTextColor(Color.parseColor(this.f22587p));
                }
                TextView textView2 = (TextView) view.findViewById(m26698a(this.f22580i));
                if (textView2 != null) {
                    textView2.setTextColor(Color.parseColor(this.f22587p));
                }
                i = C8613y.m24929b(context, 2.0f);
            } else {
                i = C8613y.m24929b(context, 10.0f);
                view.getBackground().setAlpha(100);
            }
            int b = C8613y.m24929b(context, 8.0f);
            View findViewById = view.findViewById(m26698a(this.f22581j));
            if (findViewById != null) {
                if (cVar.mo62369f() != null && (cVar.mo62369f() instanceof MBridgeClickCTAView)) {
                    ((MBridgeClickCTAView) cVar.mo62369f()).setObjectAnimator(new C9288b().mo62478c(findViewById));
                }
                if (findViewById instanceof TextView) {
                    TextView textView3 = (TextView) findViewById;
                    textView3.setTextColor(Color.parseColor(this.f22586o));
                    textView3.setTextSize(15.0f);
                    String str = this.f22589r;
                    C9298a.m26665a(textView3, 1.0f, 5.0f, str, new String[]{this.f22592u, str}, GradientDrawable.Orientation.LEFT_RIGHT);
                }
            }
            if (view.getLayoutParams() == null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(i, i, i, b);
                layoutParams.height = C8613y.m24929b(context, 60.0f);
                view.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: c */
    public final void mo62509c(View view, C9252c cVar) {
        if (view != null && cVar != null) {
            if (view.getContext() != null) {
                MBridgeLevelLayoutView mBridgeLevelLayoutView = (MBridgeLevelLayoutView) view.findViewById(m26698a(this.f22582k));
                if (mBridgeLevelLayoutView != null) {
                    if (cVar.mo62368e() == 1) {
                        mBridgeLevelLayoutView.setOrientation(1);
                    } else {
                        mBridgeLevelLayoutView.setOrientation(0);
                    }
                }
                RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(m26698a(this.f22584m));
                if (relativeLayout != null) {
                    if (cVar.mo62368e() == 1) {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        layoutParams.setMargins(layoutParams.leftMargin + C9248a.f22400a, layoutParams.topMargin + C9248a.f22402c, layoutParams.rightMargin + C9248a.f22401b, layoutParams.bottomMargin + C9248a.f22403d);
                        relativeLayout.setLayoutParams(layoutParams);
                    } else {
                        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                        layoutParams2.setMargins(layoutParams2.leftMargin + C9248a.f22400a, layoutParams2.topMargin + C9248a.f22402c, layoutParams2.rightMargin + C9248a.f22401b, layoutParams2.bottomMargin + C9248a.f22403d);
                        relativeLayout.setLayoutParams(layoutParams2);
                    }
                }
                View findViewById = view.findViewById(m26698a(this.f22583l));
                if (findViewById instanceof TextView) {
                    TextView textView = (TextView) findViewById;
                    textView.setTextColor(Color.parseColor(this.f22586o));
                    textView.setTextSize(25.0f);
                    String str = this.f22589r;
                    View view2 = findViewById;
                    C9298a.m26665a(view2, 1.0f, 5.0f, str, new String[]{this.f22592u, str}, GradientDrawable.Orientation.LEFT_RIGHT);
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{new C9288b().mo62478c(findViewById)});
                if (view instanceof MBridgeFramLayout) {
                    ((MBridgeFramLayout) view).setAnimatorSet(animatorSet);
                }
                if (view instanceof MBridgeRelativeLayout) {
                    ((MBridgeRelativeLayout) view).setAnimatorSet(animatorSet);
                }
            }
            new C9288b().mo62479c(view, 500);
        }
    }

    /* renamed from: a */
    private int m26698a(String str) {
        return C8594o.m24812a(C2350a.m5601e().mo15792g(), str, "id");
    }
}
