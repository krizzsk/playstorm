package com.bytedance.sdk.openadsdk.component.reward.view;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.p143a.C3290c;
import com.bytedance.sdk.openadsdk.component.reward.p143a.C3291d;
import com.bytedance.sdk.openadsdk.component.reward.p143a.C3299e;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p146b.C3429c;
import com.bytedance.sdk.openadsdk.core.p146b.C3434g;
import com.bytedance.sdk.openadsdk.core.p151e.C3485l;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.p151e.C3501p;
import com.bytedance.sdk.openadsdk.core.p155i.C3537f;
import com.bytedance.sdk.openadsdk.core.p156j.C3539a;
import com.bytedance.sdk.openadsdk.core.widget.C3756c;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.p176i.C3854d;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import com.bytedance.sdk.openadsdk.utils.C4020v;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.view.d */
/* compiled from: RewardFullVideoLayout */
public class C3389d {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public String f8144A;

    /* renamed from: B */
    private int f8145B;

    /* renamed from: C */
    private boolean f8146C = false;

    /* renamed from: a */
    int f8147a = 3;

    /* renamed from: b */
    Activity f8148b;

    /* renamed from: c */
    C3498n f8149c;

    /* renamed from: d */
    C3290c f8150d;

    /* renamed from: e */
    public View f8151e;

    /* renamed from: f */
    RelativeLayout f8152f;

    /* renamed from: g */
    ImageView f8153g;

    /* renamed from: h */
    RelativeLayout f8154h;

    /* renamed from: i */
    TTRoundRectImageView f8155i;

    /* renamed from: j */
    TextView f8156j;

    /* renamed from: k */
    TextView f8157k;

    /* renamed from: l */
    TextView f8158l;

    /* renamed from: m */
    FrameLayout f8159m;

    /* renamed from: n */
    FrameLayout f8160n;

    /* renamed from: o */
    FrameLayout f8161o;

    /* renamed from: p */
    TTRatingBar2 f8162p;

    /* renamed from: q */
    TextView f8163q;

    /* renamed from: r */
    TextView f8164r;

    /* renamed from: s */
    RelativeLayout f8165s;

    /* renamed from: t */
    C3291d f8166t;

    /* renamed from: u */
    boolean f8167u = true;

    /* renamed from: v */
    protected int f8168v = 0;

    /* renamed from: w */
    protected final AtomicBoolean f8169w = new AtomicBoolean(false);

    /* renamed from: x */
    public C3485l f8170x;

    /* renamed from: y */
    Runnable f8171y = new Runnable() {
        public void run() {
            try {
                if (C3389d.this.f8150d != null && C3389d.this.f8154h != null) {
                    int[] iArr = new int[2];
                    C3389d.this.f8154h.getLocationOnScreen(iArr);
                    C3389d.this.f8150d.mo19031b(iArr[0]);
                }
            } catch (Exception unused) {
            }
        }
    };

    /* renamed from: z */
    private boolean f8172z;

    /* renamed from: a */
    private void m10132a(C3539a aVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo19304a() {
        return true;
    }

    public C3389d(Activity activity) {
        this.f8148b = activity;
    }

    /* renamed from: a */
    public void mo19311a(C3498n nVar, String str, int i, boolean z, C3290c cVar) {
        if (!this.f8146C) {
            this.f8146C = true;
            this.f8149c = nVar;
            this.f8144A = str;
            this.f8145B = i;
            this.f8172z = z;
            this.f8150d = cVar;
            if (this.f8148b != null && mo19304a()) {
                C3291d dVar = new C3291d(this.f8148b);
                this.f8166t = dVar;
                dVar.mo19040a(nVar, this.f8144A, this.f8145B);
            }
            m10134s();
            C3485l lVar = new C3485l(this.f8148b, this.f8149c, str, this.f8159m);
            this.f8170x = lVar;
            lVar.mo19571a();
        }
    }

    /* renamed from: s */
    private void m10134s() {
        RelativeLayout relativeLayout;
        Activity activity = this.f8148b;
        this.f8151e = activity.findViewById(C2984t.m8432e(activity, "tt_reward_root"));
        Activity activity2 = this.f8148b;
        this.f8152f = (RelativeLayout) activity2.findViewById(C2984t.m8432e(activity2, "tt_video_reward_bar"));
        Activity activity3 = this.f8148b;
        this.f8158l = (TextView) activity3.findViewById(C2984t.m8432e(activity3, "tt_reward_ad_download"));
        Activity activity4 = this.f8148b;
        this.f8155i = (TTRoundRectImageView) activity4.findViewById(C2984t.m8432e(activity4, "tt_reward_ad_icon"));
        Activity activity5 = this.f8148b;
        this.f8156j = (TextView) activity5.findViewById(C2984t.m8432e(activity5, "tt_reward_ad_appname"));
        Activity activity6 = this.f8148b;
        this.f8157k = (TextView) activity6.findViewById(C2984t.m8432e(activity6, "tt_comment_vertical"));
        Activity activity7 = this.f8148b;
        this.f8163q = (TextView) activity7.findViewById(C2984t.m8432e(activity7, "tt_ad_logo"));
        Activity activity8 = this.f8148b;
        this.f8153g = (ImageView) activity8.findViewById(C2984t.m8432e(activity8, "tt_video_ad_close"));
        Activity activity9 = this.f8148b;
        this.f8154h = (RelativeLayout) activity9.findViewById(C2984t.m8432e(activity9, "tt_video_ad_close_layout"));
        Activity activity10 = this.f8148b;
        this.f8159m = (FrameLayout) activity10.findViewById(C2984t.m8432e(activity10, "tt_video_reward_container"));
        Activity activity11 = this.f8148b;
        this.f8160n = (FrameLayout) activity11.findViewById(C2984t.m8432e(activity11, "tt_click_upper_non_content_layout"));
        Activity activity12 = this.f8148b;
        this.f8161o = (FrameLayout) activity12.findViewById(C2984t.m8432e(activity12, "tt_click_lower_non_content_layout"));
        Activity activity13 = this.f8148b;
        this.f8162p = (TTRatingBar2) activity13.findViewById(C2984t.m8432e(activity13, "tt_rb_score"));
        Activity activity14 = this.f8148b;
        this.f8165s = (RelativeLayout) activity14.findViewById(C2984t.m8432e(activity14, "tt_full_reward_video_loading_container"));
        TTRatingBar2 tTRatingBar2 = this.f8162p;
        if (tTRatingBar2 != null) {
            C4020v.m13290a((TextView) null, tTRatingBar2, this.f8149c, (Context) this.f8148b);
        }
        C3291d dVar = this.f8166t;
        if (!(dVar == null || !dVar.mo19043d() || this.f8166t.mo19042c() == null || (relativeLayout = this.f8165s) == null)) {
            relativeLayout.addView(this.f8166t.mo19042c(), new LinearLayout.LayoutParams(-1, -1));
            this.f8166t.mo19039a();
        }
        C3498n nVar = this.f8149c;
        if (nVar != null && nVar.mo19679aw()) {
            Activity activity15 = this.f8148b;
            this.f8164r = (TextView) activity15.findViewById(C2984t.m8432e(activity15, "tt_reward_ad_description"));
        }
    }

    /* renamed from: a */
    public void mo19313a(String str, boolean z) {
        mo19324g();
        C4020v.m13282a((View) this.f8163q, C3501p.m10769i(this.f8149c) ? 8 : 0);
        mo19323f();
        mo19312a(str);
        mo19314a(z);
        mo19320d();
        if (this.f8172z) {
            mo19318c();
        }
        C3498n nVar = this.f8149c;
        if (nVar != null && nVar.mo19680ax() != null) {
            m10132a(this.f8149c.mo19680ax());
        }
    }

    /* renamed from: a */
    public void mo19303a(int i, int i2) {
        FrameLayout frameLayout;
        if (!this.f8167u) {
            mo19307a(4);
        }
        try {
            if (this.f8145B == 2 && this.f8149c.mo19750v() == 1) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f8158l.getLayoutParams();
                layoutParams.height = (int) C4020v.m13297b(this.f8148b, 55.0f);
                layoutParams.topMargin = (int) C4020v.m13297b(this.f8148b, 20.0f);
                this.f8158l.setLayoutParams(layoutParams);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f8152f.getLayoutParams();
                layoutParams2.bottomMargin = (int) C4020v.m13297b(this.f8148b, 12.0f);
                this.f8152f.setLayoutParams(layoutParams2);
            }
        } catch (Throwable unused) {
        }
        C3498n nVar = this.f8149c;
        if (nVar != null && nVar.mo19750v() == 1 && (frameLayout = this.f8159m) != null && (frameLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            int c = C4020v.m13306c((Context) this.f8148b);
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f8159m.getLayoutParams();
            layoutParams3.width = c;
            int i3 = (c * 9) / 16;
            layoutParams3.height = i3;
            this.f8159m.setLayoutParams(layoutParams3);
            this.f8168v = (C4020v.m13310d((Context) this.f8148b) - i3) / 2;
            C2975l.m8391e("RewardFullVideoLayout", "NonContentAreaHeight:" + this.f8168v);
        }
    }

    /* renamed from: a */
    public void mo19310a(C3429c cVar, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener, C3299e eVar) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        C3498n nVar;
        C3429c cVar2 = cVar;
        View.OnTouchListener onTouchListener2 = onTouchListener;
        final View.OnClickListener onClickListener2 = onClickListener;
        final C3299e eVar2 = eVar;
        C3498n nVar2 = this.f8149c;
        if (!(nVar2 == null || nVar2.mo19752w() == null)) {
            if (this.f8149c.mo19750v() != 5) {
                if (this.f8149c.mo19752w().f8435e) {
                    this.f8158l.setOnClickListener(cVar);
                    this.f8158l.setOnTouchListener(onTouchListener2);
                } else {
                    this.f8158l.setOnClickListener(onClickListener2);
                }
            }
            if (this.f8149c.mo19750v() == 1) {
                if (this.f8149c.mo19752w().f8431a) {
                    C4020v.m13284a((View) this.f8152f, (View.OnClickListener) cVar, "TTBaseVideoActivity#mRlDownloadBar");
                    C4020v.m13285a((View) this.f8152f, onTouchListener2, "TTBaseVideoActivity#mRlDownloadBar");
                    this.f8156j.setOnClickListener(cVar);
                    this.f8156j.setOnTouchListener(onTouchListener2);
                    this.f8157k.setOnClickListener(cVar);
                    this.f8157k.setOnTouchListener(onTouchListener2);
                    this.f8162p.setOnClickListener(cVar);
                    this.f8162p.setOnTouchListener(onTouchListener2);
                    this.f8155i.setOnClickListener(cVar);
                    this.f8155i.setOnTouchListener(onTouchListener2);
                } else {
                    C4020v.m13284a((View) this.f8152f, onClickListener2, "TTBaseVideoActivity#mRlDownloadBar");
                    this.f8156j.setOnClickListener(onClickListener2);
                    this.f8157k.setOnClickListener(onClickListener2);
                    this.f8162p.setOnClickListener(onClickListener2);
                    this.f8155i.setOnClickListener(onClickListener2);
                }
            } else if (this.f8149c.mo19750v() == 5) {
                if (this.f8149c.mo19752w().f8435e) {
                    C3429c cVar3 = cVar;
                    final C3299e eVar3 = eVar;
                    C33901 r0 = new C3434g("VAST_ACTION_BUTTON", this.f8149c.mo19680ax(), cVar3) {
                        /* renamed from: a */
                        public void mo19153a() {
                            if (C3389d.this.f8149c != null && C3389d.this.f8149c.mo19680ax() != null) {
                                C3389d.this.f8149c.mo19680ax().mo19977a().mo20056g(eVar3.mo19088s());
                            }
                        }
                    };
                    C33912 r02 = new C3434g("VAST_ICON", this.f8149c.mo19680ax(), cVar3) {
                        /* renamed from: a */
                        public void mo19153a() {
                            if (C3389d.this.f8149c != null && C3389d.this.f8149c.mo19680ax() != null && C3389d.this.f8149c.mo19680ax().mo19983b() != null) {
                                C3389d.this.f8149c.mo19680ax().mo19983b().mo20023a(eVar3.mo19088s());
                            }
                        }
                    };
                    TextView textView = this.f8158l;
                    if (textView != null) {
                        textView.setOnClickListener(r0);
                        this.f8158l.setOnTouchListener(r0);
                    }
                    TTRoundRectImageView tTRoundRectImageView = this.f8155i;
                    if (tTRoundRectImageView != null) {
                        tTRoundRectImageView.setOnClickListener(r02);
                        this.f8155i.setOnTouchListener(r02);
                    }
                    TextView textView2 = this.f8156j;
                    if (textView2 != null && !TextUtils.isEmpty(textView2.getText())) {
                        this.f8156j.setOnClickListener(r0);
                        this.f8156j.setOnTouchListener(r0);
                    }
                    TextView textView3 = this.f8164r;
                    if (textView3 != null && !TextUtils.isEmpty(textView3.getText())) {
                        this.f8164r.setOnClickListener(r0);
                        this.f8164r.setOnTouchListener(r0);
                    }
                } else {
                    C33923 r03 = new View.OnClickListener() {
                        public void onClick(View view) {
                            View.OnClickListener onClickListener = onClickListener2;
                            if (onClickListener != null) {
                                onClickListener.onClick(view);
                            }
                            if (C3389d.this.f8149c != null && C3389d.this.f8149c.mo19680ax() != null) {
                                C3389d.this.f8149c.mo19680ax().mo19977a().mo20056g(eVar2.mo19088s());
                            }
                        }
                    };
                    TextView textView4 = this.f8158l;
                    if (textView4 != null) {
                        textView4.setOnClickListener(r03);
                    }
                    TextView textView5 = this.f8156j;
                    if (textView5 != null && !TextUtils.isEmpty(textView5.getText())) {
                        this.f8156j.setOnClickListener(r03);
                    }
                    TextView textView6 = this.f8164r;
                    if (textView6 != null && !TextUtils.isEmpty(textView6.getText())) {
                        this.f8164r.setOnClickListener(r03);
                    }
                    TTRoundRectImageView tTRoundRectImageView2 = this.f8155i;
                    if (tTRoundRectImageView2 != null) {
                        tTRoundRectImageView2.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View view) {
                                View.OnClickListener onClickListener = onClickListener2;
                                if (onClickListener != null) {
                                    onClickListener.onClick(view);
                                }
                                if (C3389d.this.f8149c != null && C3389d.this.f8149c.mo19680ax() != null && C3389d.this.f8149c.mo19680ax().mo19983b() != null) {
                                    C3389d.this.f8149c.mo19680ax().mo19983b().mo20023a(eVar2.mo19088s());
                                }
                            }
                        });
                    }
                }
            } else if (this.f8149c.mo19752w().f8433c) {
                C4020v.m13284a((View) this.f8152f, (View.OnClickListener) cVar, "TTBaseVideoActivity#mRlDownloadBar");
                C4020v.m13285a((View) this.f8152f, onTouchListener2, "TTBaseVideoActivity#mRlDownloadBar");
            } else {
                C4020v.m13284a((View) this.f8152f, onClickListener2, "TTBaseVideoActivity#mRlDownloadBar");
            }
        }
        if (!(this.f8159m == null || (nVar = this.f8149c) == null || nVar.mo19752w() == null)) {
            if (!this.f8149c.mo19752w().f8436f || C3485l.m10539b(this.f8149c)) {
                mo19308a(onClickListener2);
            } else {
                mo19308a((View.OnClickListener) cVar);
                m10131a(cVar);
            }
        }
        C3498n nVar3 = this.f8149c;
        if (nVar3 != null && nVar3.mo19750v() == 1) {
            if (!(this.f8149c.mo19752w() == null || (frameLayout2 = this.f8160n) == null)) {
                C4020v.m13282a((View) frameLayout2, 0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f8160n.getLayoutParams();
                layoutParams.height = this.f8168v;
                this.f8160n.setLayoutParams(layoutParams);
                if (this.f8149c.mo19752w().f8432b) {
                    this.f8160n.setOnClickListener(cVar);
                    this.f8160n.setOnTouchListener(onTouchListener2);
                } else {
                    this.f8160n.setOnClickListener(onClickListener2);
                }
            }
            if (!(this.f8149c.mo19752w() == null || (frameLayout = this.f8161o) == null)) {
                C4020v.m13282a((View) frameLayout, 0);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f8161o.getLayoutParams();
                layoutParams2.height = this.f8168v;
                this.f8161o.setLayoutParams(layoutParams2);
                if (this.f8149c.mo19752w().f8434d) {
                    this.f8161o.setOnClickListener(cVar);
                    this.f8161o.setOnTouchListener(onTouchListener2);
                } else {
                    this.f8161o.setOnClickListener(onClickListener2);
                }
            }
        }
        TextView textView7 = this.f8163q;
        if (textView7 != null) {
            textView7.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    C2975l.m8387c("mAdLogo", "mAdLogo,,,,,,,onClick,,,,,");
                    try {
                        TTWebsiteActivity.m8985a(C3389d.this.f8148b, C3389d.this.f8149c, C3389d.this.f8144A);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public void mo19315b() {
        C4020v.m13282a((View) this.f8159m, 8);
        C4020v.m13282a((View) this.f8160n, 8);
        C4020v.m13282a((View) this.f8161o, 8);
        C4020v.m13282a((View) this.f8152f, 8);
        C4020v.m13282a((View) this.f8156j, 8);
        C4020v.m13282a((View) this.f8155i, 8);
        C4020v.m13282a((View) this.f8157k, 8);
        C4020v.m13282a((View) this.f8162p, 8);
        C4020v.m13282a((View) this.f8153g, 8);
        C4020v.m13282a((View) this.f8154h, 8);
        C4020v.m13282a((View) this.f8158l, 8);
        C4020v.m13282a((View) this.f8163q, 8);
        C4020v.m13282a((View) this.f8165s, 8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo19318c() {
        int z = this.f8149c.mo19758z();
        this.f8147a = z;
        if (z == -200) {
            C3537f h = C3578m.m11241h();
            this.f8147a = h.mo19955k(C4014u.m13223f(this.f8149c) + "");
        }
        if (this.f8147a == -1 && this.f8167u) {
            C4020v.m13282a((View) this.f8152f, 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo19320d() {
        if (this.f8149c.mo19750v() == 3) {
            int[] iArr = {Color.parseColor("#0070FF")};
            int e = C4020v.m13315e(this.f8148b, 17.0f);
            int parseColor = Color.parseColor("#80000000");
            C3756c.C3757a e2 = new C3756c.C3757a().mo20557a(iArr[0]).mo20560b(parseColor).mo20558a(iArr).mo20561c(e).mo20562d(0).mo20563e(C4020v.m13315e(this.f8148b, 3.0f));
            Activity activity = this.f8148b;
            C3756c.m12321a((LinearLayout) activity.findViewById(C2984t.m8432e(activity, "tt_reward_ad_download_layout")), e2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo19314a(boolean z) {
        if (this.f8145B == 1) {
            TextView textView = this.f8156j;
            if (textView != null) {
                textView.setMaxWidth((int) C4020v.m13297b(this.f8148b, 153.0f));
            }
        } else {
            TextView textView2 = this.f8156j;
            if (textView2 != null) {
                textView2.setMaxWidth((int) C4020v.m13297b(this.f8148b, 404.0f));
            }
            RelativeLayout relativeLayout = this.f8154h;
            if (relativeLayout != null && z) {
                ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    int b = m10133b("status_bar_height");
                    int b2 = m10133b("navigation_bar_height");
                    if (b > 0) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        if (b > marginLayoutParams.topMargin) {
                            marginLayoutParams.topMargin = b;
                            this.f8150d.mo19024a(b);
                        }
                    }
                    if (b2 > 0) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                        if (b2 > marginLayoutParams2.rightMargin) {
                            marginLayoutParams2.rightMargin = b2;
                        }
                    }
                }
            }
        }
        if (!this.f8172z) {
            C4020v.m13282a((View) this.f8152f, 0);
        }
    }

    /* renamed from: b */
    private int m10133b(String str) {
        Resources resources = this.f8148b.getResources();
        if (resources != null) {
            return resources.getDimensionPixelSize(resources.getIdentifier(str, "dimen", "android"));
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19312a(String str) {
        TextView textView;
        if (!this.f8149c.mo19679aw()) {
            TextView textView2 = this.f8158l;
            if (textView2 != null) {
                if (this.f8149c.mo19750v() == 3) {
                    str = mo19322e();
                }
                textView2.setText(str);
            }
        } else if (this.f8149c.mo19680ax() != null && TextUtils.isEmpty(this.f8149c.mo19680ax().mo19991f()) && (textView = this.f8158l) != null) {
            C4020v.m13282a((View) textView, 8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo19322e() {
        String j = C4014u.m13242j((Context) this.f8148b);
        if (j == null) {
            j = "";
        }
        boolean z = false;
        boolean z2 = true;
        try {
            if (!j.equals(Locale.CHINESE.getLanguage()) && !j.equals(Locale.CHINA.getLanguage())) {
                if (!j.equals(Locale.TRADITIONAL_CHINESE.getLanguage())) {
                    z2 = false;
                }
            }
            z = j.equals(Locale.ENGLISH.getLanguage());
        } catch (Throwable unused) {
        }
        C3498n nVar = this.f8149c;
        String str = "Install";
        if (nVar == null) {
            return str;
        }
        if (!TextUtils.isEmpty(nVar.mo19620W())) {
            str = this.f8149c.mo19620W();
            if (str == null || !C4014u.m13240i(str) || str.length() <= 2) {
                if (str != null && !C4014u.m13240i(str) && str.length() > 7 && (z2 || z)) {
                    str = m10135t();
                }
            } else if (z2 || z) {
                str = m10135t();
            }
        } else if (this.f8149c.mo19609L() != 4) {
            str = "View";
        }
        if (z && !C4014u.m13240i(str)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f8158l.getLayoutParams();
            layoutParams.bottomMargin = C4020v.m13315e(this.f8148b, 4.0f);
            this.f8158l.setLayoutParams(layoutParams);
        }
        return str;
    }

    /* renamed from: t */
    private String m10135t() {
        C3498n nVar = this.f8149c;
        if (nVar == null) {
            return null;
        }
        return nVar.mo19609L() != 4 ? "View" : "Install";
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo19323f() {
        TextView textView = this.f8157k;
        if (textView != null) {
            C4020v.m13288a(textView, this.f8149c, (Context) this.f8148b, "tt_comment_num");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo19324g() {
        if (!(this.f8155i == null || this.f8149c.mo19610M() == null || TextUtils.isEmpty(this.f8149c.mo19610M().mo19559a()))) {
            C3854d.m12660a().mo20703a(this.f8149c.mo19610M(), (ImageView) this.f8155i);
            if (!(this.f8149c.mo19680ax() == null || this.f8149c.mo19680ax().mo19983b() == null)) {
                this.f8149c.mo19680ax().mo19983b().mo20026b(0);
            }
        }
        if (this.f8156j != null) {
            if (this.f8145B != 1 || this.f8149c.mo19657aa() == null || TextUtils.isEmpty(this.f8149c.mo19657aa().mo19495b())) {
                this.f8156j.setText(this.f8149c.mo19618U());
            } else {
                this.f8156j.setText(this.f8149c.mo19657aa().mo19495b());
            }
        }
        TextView textView = this.f8164r;
        if (textView != null) {
            textView.setText(this.f8149c.mo19619V());
        }
    }

    /* renamed from: b */
    public void mo19317b(boolean z) {
        this.f8167u = z;
    }

    /* renamed from: a */
    public void mo19307a(int i) {
        C4020v.m13282a((View) this.f8152f, i);
    }

    /* renamed from: a */
    public int mo19305a(C3498n nVar) {
        int f = C2984t.m8433f(this.f8148b, "tt_activity_full_reward_video_default_style");
        if (C3485l.m10539b(nVar)) {
            nVar.mo19722k(4);
            return C2984t.m8433f(this.f8148b, "tt_activity_full_reward_video_landingpage_style");
        } else if (C3485l.m10541c(nVar)) {
            nVar.mo19722k(4);
            return C2984t.m8433f(this.f8148b, "tt_activity_full_reward_landingpage_style");
        } else {
            int v = nVar.mo19750v();
            if (v == 0) {
                return C2984t.m8433f(this.f8148b, "tt_activity_full_reward_video_default_style");
            }
            if (v == 1) {
                return C3501p.m10769i(this.f8149c) ? C2984t.m8433f(this.f8148b, "tt_activity_full_reward_video_default_style") : C2984t.m8433f(this.f8148b, "tt_activity_full_reward_video_no_bar_style");
            } else if (v == 3) {
                return C2984t.m8433f(this.f8148b, "tt_activity_full_reward_video_new_bar_style");
            } else {
                if (v != 5) {
                    return f;
                }
                return C2984t.m8433f(this.f8148b, "tt_activity_full_reward_video_vast_bar_style");
            }
        }
    }

    /* renamed from: h */
    public FrameLayout mo19325h() {
        return this.f8159m;
    }

    /* renamed from: b */
    public void mo19316b(int i) {
        C4020v.m13282a((View) this.f8163q, i);
    }

    /* renamed from: c */
    public void mo19319c(int i) {
        int i2 = this.f8147a;
        if (i2 != -1 && i == i2 && !this.f8169w.get()) {
            this.f8152f.setVisibility(0);
            this.f8169w.set(true);
            mo19326i();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo19326i() {
        if (this.f8152f != null) {
            Keyframe ofFloat = Keyframe.ofFloat(0.0f, 0.0f);
            Keyframe ofFloat2 = Keyframe.ofFloat(0.65f, 1.0f);
            Keyframe ofFloat3 = Keyframe.ofFloat(0.765f, 0.9f);
            Keyframe ofFloat4 = Keyframe.ofFloat(0.88f, 1.0f);
            Keyframe ofFloat5 = Keyframe.ofFloat(0.95f, 0.95f);
            Keyframe ofFloat6 = Keyframe.ofFloat(1.0f, 1.0f);
            PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe("scaleX", new Keyframe[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6});
            PropertyValuesHolder ofKeyframe2 = PropertyValuesHolder.ofKeyframe("scaleY", new Keyframe[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6});
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f8152f, new PropertyValuesHolder[]{ofKeyframe, ofKeyframe2});
            ofPropertyValuesHolder.setDuration(1000);
            ofPropertyValuesHolder.start();
        }
    }

    /* renamed from: d */
    public void mo19321d(int i) {
        C4020v.m13282a((View) this.f8153g, i);
        C4020v.m13282a((View) this.f8154h, i);
        RelativeLayout relativeLayout = this.f8154h;
        if (relativeLayout != null) {
            relativeLayout.post(this.f8171y);
        }
    }

    /* renamed from: j */
    public boolean mo19327j() {
        ImageView imageView = this.f8153g;
        if (imageView == null || this.f8154h == null || imageView.getVisibility() != 0 || this.f8154h.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo19308a(View.OnClickListener onClickListener) {
        C4020v.m13284a((View) this.f8159m, onClickListener, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    /* renamed from: a */
    private void m10131a(C3429c cVar) {
        C4020v.m13285a((View) this.f8159m, (View.OnTouchListener) cVar, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    /* renamed from: k */
    public View mo19328k() {
        return this.f8154h;
    }

    /* renamed from: l */
    public View mo19329l() {
        return this.f8152f;
    }

    /* renamed from: a */
    public void mo19306a(float f) {
        C4020v.m13281a((View) this.f8153g, f);
        C4020v.m13281a((View) this.f8154h, f);
    }

    /* renamed from: a */
    public void mo19309a(Animation animation) {
        RelativeLayout relativeLayout = this.f8165s;
        if (relativeLayout != null) {
            relativeLayout.setAnimation(animation);
        }
    }

    /* renamed from: m */
    public void mo19330m() {
        try {
            if (this.f8166t != null) {
                this.f8166t.mo19041b();
            }
            if (this.f8151e != null && this.f8165s != null) {
                ((ViewGroup) this.f8151e).removeView(this.f8165s);
            }
        } catch (Throwable unused) {
            RelativeLayout relativeLayout = this.f8165s;
            if (relativeLayout != null) {
                relativeLayout.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: n */
    public void mo19331n() {
        C3485l lVar = this.f8170x;
        if (lVar != null) {
            lVar.mo19577e();
        }
        RelativeLayout relativeLayout = this.f8154h;
        if (relativeLayout != null) {
            relativeLayout.removeCallbacks(this.f8171y);
        }
    }

    /* renamed from: o */
    public void mo19332o() {
        C3485l lVar = this.f8170x;
        if (lVar != null) {
            lVar.mo19578f();
        }
    }

    /* renamed from: p */
    public void mo19333p() {
        C3485l lVar = this.f8170x;
        if (lVar != null) {
            lVar.mo19579g();
        }
    }

    /* renamed from: q */
    public void mo19334q() {
        C3485l lVar = this.f8170x;
        if (lVar != null) {
            lVar.mo19580h();
        }
    }

    /* renamed from: r */
    public void mo19335r() {
        RelativeLayout relativeLayout = this.f8152f;
        if (relativeLayout != null) {
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            layoutParams.width = -1;
            this.f8152f.setLayoutParams(layoutParams);
            this.f8152f.setVisibility(0);
        }
    }
}
