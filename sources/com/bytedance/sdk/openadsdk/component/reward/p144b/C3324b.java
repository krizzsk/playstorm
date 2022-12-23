package com.bytedance.sdk.openadsdk.component.reward.p144b;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.p143a.C3290c;
import com.bytedance.sdk.openadsdk.component.reward.view.C3389d;
import com.bytedance.sdk.openadsdk.component.reward.view.RatioImageView;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p146b.C3426a;
import com.bytedance.sdk.openadsdk.core.p146b.C3427b;
import com.bytedance.sdk.openadsdk.core.p151e.C3484k;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.p151e.C3501p;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.p167d.C3769a;
import com.bytedance.sdk.openadsdk.p176i.C3854d;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import com.bytedance.sdk.openadsdk.utils.C4020v;
import com.com.bytedance.overseas.sdk.p186a.C4025b;
import com.com.bytedance.overseas.sdk.p186a.C4026c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.b.b */
/* compiled from: RewardFullTypeImage */
public class C3324b extends C3322a {

    /* renamed from: i */
    protected View f7933i;

    /* renamed from: j */
    private boolean f7934j = false;

    /* renamed from: k */
    private int f7935k = 33;

    /* renamed from: l */
    private RatioImageView f7936l;

    /* renamed from: m */
    private TTRoundRectImageView f7937m;

    /* renamed from: n */
    private TextView f7938n;

    /* renamed from: o */
    private TextView f7939o;

    /* renamed from: p */
    private TextView f7940p;

    /* renamed from: q */
    private TTRatingBar2 f7941q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public TextView f7942r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C3498n f7943s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public String f7944t = "fullscreen_interstitial_ad";

    public C3324b(Activity activity, C3498n nVar, int i, int i2) {
        super(activity, nVar, i, i2);
        boolean z = false;
        this.f7943s = nVar;
        this.f7935k = nVar.mo19660ad();
        this.f7934j = this.f7929e == 2 ? true : z;
    }

    /* renamed from: d */
    private void m9876d() {
        boolean z = this.f7929e == 2;
        this.f7934j = z;
        if (z) {
            int i = this.f7935k;
            if (i == 3) {
                m9880f();
            } else if (i != 33) {
                m9884j();
            } else {
                m9882h();
            }
        } else {
            int i2 = this.f7935k;
            if (i2 == 3) {
                m9879e();
            } else if (i2 != 33) {
                m9883i();
            } else {
                m9881g();
            }
        }
    }

    /* renamed from: e */
    private void m9879e() {
        this.f7933i = LayoutInflater.from(this.f7925a).inflate(C2984t.m8433f(this.f7925a, "tt_activity_full_image_model_3_191_v"), (ViewGroup) null, true);
        m9885k();
    }

    /* renamed from: f */
    private void m9880f() {
        View inflate = LayoutInflater.from(this.f7925a).inflate(C2984t.m8433f(this.f7925a, "tt_activity_full_image_model_3_191_h"), (ViewGroup) null, true);
        this.f7933i = inflate;
        this.f7936l = (RatioImageView) inflate.findViewById(C2984t.m8432e(this.f7925a, "tt_ratio_image_view"));
        this.f7937m = (TTRoundRectImageView) this.f7933i.findViewById(C2984t.m8432e(this.f7925a, "tt_full_ad_icon"));
        this.f7938n = (TextView) this.f7933i.findViewById(C2984t.m8432e(this.f7925a, "tt_full_ad_app_name"));
        this.f7939o = (TextView) this.f7933i.findViewById(C2984t.m8432e(this.f7925a, "tt_full_desc"));
        this.f7940p = (TextView) this.f7933i.findViewById(C2984t.m8432e(this.f7925a, "tt_full_comment"));
        this.f7942r = (TextView) this.f7933i.findViewById(C2984t.m8432e(this.f7925a, "tt_full_ad_download"));
        final View findViewById = this.f7933i.findViewById(C2984t.m8432e(this.f7925a, "tt_image_full_bar"));
        mo19179a((View) this.f7936l);
        mo19179a((View) this.f7937m);
        mo19179a((View) this.f7938n);
        mo19179a((View) this.f7939o);
        mo19179a((View) this.f7940p);
        mo19179a((View) this.f7942r);
        ((TextView) this.f7933i.findViewById(C2984t.m8432e(this.f7925a, "tt_ad_logo"))).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.m8985a(C3324b.this.f7925a, C3324b.this.f7943s, C3324b.this.f7944t);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
        this.f7942r.post(new Runnable() {
            public void run() {
                int width = findViewById.getWidth() / 2;
                if (width >= C4020v.m13311d(C3578m.m11231a(), 90.0f)) {
                    ViewGroup.LayoutParams layoutParams = C3324b.this.f7942r.getLayoutParams();
                    if (layoutParams.width > 0) {
                        layoutParams.width = Math.min(width, layoutParams.width);
                        C3324b.this.f7942r.setLayoutParams(layoutParams);
                    }
                }
            }
        });
    }

    /* renamed from: g */
    private void m9881g() {
        this.f7933i = LayoutInflater.from(this.f7925a).inflate(C2984t.m8433f(this.f7925a, "tt_activity_full_image_model_33_v"), (ViewGroup) null, true);
        m9885k();
    }

    /* renamed from: h */
    private void m9882h() {
        this.f7933i = LayoutInflater.from(this.f7925a).inflate(C2984t.m8433f(this.f7925a, "tt_activity_full_image_model_33_h"), (ViewGroup) null, true);
        m9885k();
    }

    /* renamed from: i */
    private void m9883i() {
        View inflate = LayoutInflater.from(this.f7925a).inflate(C2984t.m8433f(this.f7925a, "tt_activity_full_image_model_173_v"), (ViewGroup) null, true);
        this.f7933i = inflate;
        this.f7936l = (RatioImageView) inflate.findViewById(C2984t.m8432e(this.f7925a, "tt_ratio_image_view"));
        this.f7937m = (TTRoundRectImageView) this.f7933i.findViewById(C2984t.m8432e(this.f7925a, "tt_full_ad_icon"));
        this.f7938n = (TextView) this.f7933i.findViewById(C2984t.m8432e(this.f7925a, "tt_full_ad_app_name"));
        this.f7939o = (TextView) this.f7933i.findViewById(C2984t.m8432e(this.f7925a, "tt_full_desc"));
        this.f7942r = (TextView) this.f7933i.findViewById(C2984t.m8432e(this.f7925a, "tt_full_ad_download"));
        mo19179a((View) this.f7936l);
        mo19179a((View) this.f7937m);
        mo19179a((View) this.f7938n);
        mo19179a((View) this.f7939o);
        mo19179a((View) this.f7942r);
        ((TextView) this.f7933i.findViewById(C2984t.m8432e(this.f7925a, "tt_ad_logo"))).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.m8985a(C3324b.this.f7925a, C3324b.this.f7943s, C3324b.this.f7944t);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    /* renamed from: j */
    private void m9884j() {
        this.f7933i = LayoutInflater.from(this.f7925a).inflate(C2984t.m8433f(this.f7925a, "tt_activity_full_image_model_173_h"), (ViewGroup) null, true);
        m9885k();
    }

    /* renamed from: k */
    private void m9885k() {
        View view = this.f7933i;
        if (view != null) {
            this.f7936l = (RatioImageView) view.findViewById(C2984t.m8432e(this.f7925a, "tt_ratio_image_view"));
            this.f7937m = (TTRoundRectImageView) this.f7933i.findViewById(C2984t.m8432e(this.f7925a, "tt_full_ad_icon"));
            this.f7938n = (TextView) this.f7933i.findViewById(C2984t.m8432e(this.f7925a, "tt_full_ad_app_name"));
            this.f7939o = (TextView) this.f7933i.findViewById(C2984t.m8432e(this.f7925a, "tt_full_desc"));
            this.f7940p = (TextView) this.f7933i.findViewById(C2984t.m8432e(this.f7925a, "tt_full_comment"));
            this.f7941q = (TTRatingBar2) this.f7933i.findViewById(C2984t.m8432e(this.f7925a, "tt_full_rb_score"));
            this.f7942r = (TextView) this.f7933i.findViewById(C2984t.m8432e(this.f7925a, "tt_full_ad_download"));
            mo19179a((View) this.f7936l);
            mo19179a((View) this.f7937m);
            mo19179a((View) this.f7938n);
            mo19179a((View) this.f7939o);
            mo19179a((View) this.f7940p);
            mo19179a((View) this.f7941q);
            mo19179a((View) this.f7942r);
            ((TextView) this.f7933i.findViewById(C2984t.m8432e(this.f7925a, "tt_ad_logo"))).setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    try {
                        TTWebsiteActivity.m8985a(C3324b.this.f7925a, C3324b.this.f7943s, C3324b.this.f7944t);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        }
    }

    /* renamed from: d */
    private void m9877d(C3498n nVar) {
        if (nVar != null) {
            RatioImageView ratioImageView = this.f7936l;
            if (ratioImageView != null) {
                int i = this.f7935k;
                if (i == 33) {
                    ratioImageView.setRatio(1.0f);
                } else if (i == 3) {
                    ratioImageView.setRatio(1.91f);
                } else {
                    ratioImageView.setRatio(0.56f);
                }
                m9872a((ImageView) this.f7936l);
            }
            if (!(this.f7937m == null || this.f7943s.mo19610M() == null || TextUtils.isEmpty(this.f7943s.mo19610M().mo19559a()))) {
                C3854d.m12660a().mo20704a(this.f7943s.mo19610M().mo19559a(), (ImageView) this.f7937m);
            }
            TextView textView = this.f7938n;
            if (textView != null) {
                textView.setText(mo19178a(this.f7943s));
            }
            TextView textView2 = this.f7939o;
            if (textView2 != null) {
                textView2.setText(mo19180b(this.f7943s));
            }
            m9886l();
            m9887m();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo19178a(C3498n nVar) {
        if (nVar == null) {
            return "";
        }
        if (nVar.mo19657aa() != null && !TextUtils.isEmpty(nVar.mo19657aa().mo19495b())) {
            return nVar.mo19657aa().mo19495b();
        }
        if (!TextUtils.isEmpty(nVar.mo19608K())) {
            return nVar.mo19608K();
        }
        if (!TextUtils.isEmpty(nVar.mo19618U())) {
            return nVar.mo19618U();
        }
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo19180b(C3498n nVar) {
        if (nVar == null) {
            return "";
        }
        if (!TextUtils.isEmpty(nVar.mo19618U())) {
            return nVar.mo19618U();
        }
        if (!TextUtils.isEmpty(nVar.mo19619V())) {
            return nVar.mo19619V();
        }
        return "";
    }

    /* renamed from: a */
    private void m9872a(ImageView imageView) {
        List<C3484k> P;
        C3498n nVar = this.f7943s;
        if (nVar != null && (P = nVar.mo19613P()) != null && P.size() > 0) {
            C3769a.m12387a(P.get(0)).mo17710a(imageView);
        }
    }

    /* renamed from: l */
    private void m9886l() {
        TTRatingBar2 tTRatingBar2 = this.f7941q;
        if (tTRatingBar2 != null) {
            C4020v.m13290a((TextView) null, tTRatingBar2, this.f7926b, (Context) this.f7925a);
        }
    }

    /* renamed from: m */
    private void m9887m() {
        C3498n nVar;
        TextView textView = this.f7940p;
        if (textView != null && (nVar = this.f7943s) != null) {
            C4020v.m13288a(textView, nVar, (Context) this.f7925a, "tt_comment_num_backup");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19179a(View view) {
        C3427b bVar;
        if (view != null && this.f7925a != null && this.f7943s != null) {
            if (this.f7932h == null) {
                Activity activity = this.f7925a;
                C3498n nVar = this.f7943s;
                String str = this.f7944t;
                bVar = new C3426a(activity, nVar, str, C4014u.m13176a(str));
                bVar.mo19402a(m9878e(this.f7943s));
                HashMap hashMap = new HashMap();
                if (C3501p.m10769i(this.f7926b)) {
                    hashMap.put("click_scence", 3);
                } else {
                    hashMap.put("click_scence", 1);
                }
                bVar.mo19404a((Map<String, Object>) hashMap);
            } else {
                bVar = this.f7932h;
            }
            if (this.f7925a != null) {
                bVar.mo19395a(this.f7925a);
            }
            view.setOnTouchListener(bVar);
            view.setOnClickListener(bVar);
        }
    }

    /* renamed from: e */
    private C4026c m9878e(C3498n nVar) {
        if (nVar.mo19609L() == 4) {
            return new C4025b(C3578m.m11231a(), nVar, this.f7944t);
        }
        return null;
    }

    /* renamed from: a */
    public void mo19171a(FrameLayout frameLayout) {
        m9876d();
        m9877d(this.f7943s);
        frameLayout.addView(this.f7933i);
    }

    /* renamed from: c */
    public static boolean m9875c(C3498n nVar) {
        if (nVar != null && !C3498n.m10583c(nVar) && nVar.mo19670an() == 100.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo19175b() {
        return m9888n();
    }

    /* renamed from: c */
    public boolean mo19176c() {
        return m9888n();
    }

    /* renamed from: n */
    private boolean m9888n() {
        C3498n nVar = this.f7943s;
        if (nVar != null && nVar.mo19724l() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo19172a(C3290c cVar, C3389d dVar) {
        dVar.mo19316b(8);
        dVar.mo19307a(8);
        cVar.mo19035c(false);
        cVar.mo19037d(false);
        if (this.f7926b.mo19724l() == 2) {
            cVar.mo19028a(false);
            dVar.mo19321d(8);
            return;
        }
        cVar.mo19028a(this.f7926b.mo19672ap());
        dVar.mo19321d(0);
        cVar.mo19036d();
    }
}
