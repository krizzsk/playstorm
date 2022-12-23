package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView;
import com.bytedance.sdk.openadsdk.core.p146b.C3426a;
import com.bytedance.sdk.openadsdk.core.p146b.C3432e;
import com.bytedance.sdk.openadsdk.core.p151e.C3481j;
import com.bytedance.sdk.openadsdk.core.p151e.C3484k;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.p167d.C3769a;
import com.bytedance.sdk.openadsdk.p176i.C3854d;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import com.bytedance.sdk.openadsdk.utils.C4020v;
import com.com.bytedance.overseas.sdk.p186a.C4025b;
import com.com.bytedance.overseas.sdk.p186a.C4026c;
import java.util.List;

public class FullInteractionStyleView extends BackupView {

    /* renamed from: a */
    private float f8102a;

    /* renamed from: m */
    private boolean f8103m;

    /* renamed from: n */
    private int f8104n;

    /* renamed from: o */
    private int f8105o;

    /* renamed from: p */
    private int f8106p = 1;

    /* renamed from: q */
    private View f8107q;

    /* renamed from: r */
    private View f8108r;

    /* renamed from: s */
    private FrameLayout f8109s;

    /* renamed from: t */
    private C3432e f8110t;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19260a(View view, int i, C3481j jVar) {
    }

    public FullInteractionStyleView(Context context, String str) {
        super(context, str);
        this.f9018b = context;
    }

    /* renamed from: a */
    public void mo19261a(C3498n nVar, float f, int i, int i2, int i3) {
        this.f8102a = f;
        this.f8106p = i;
        this.f9019c = nVar;
        this.f9022f = "fullscreen_interstitial_ad";
        this.f8104n = i2;
        this.f8105o = i3;
        mo20079a(this.f9025i);
        m10062b();
    }

    /* renamed from: b */
    private void m10062b() {
        this.f9023g = C4020v.m13315e(this.f9018b, (float) this.f8104n);
        this.f9024h = C4020v.m13315e(this.f9018b, (float) this.f8105o);
        int i = (int) (this.f8102a * 1000.0f);
        if (this.f8106p == 1) {
            if (i == 666) {
                m10069e();
            } else if (i == 1000) {
                m10065c();
            } else if (i == 1500) {
                m10076k();
            } else if (i != 1777) {
                m10058a(0.562f);
                m10077l();
            } else {
                m10078m();
            }
        } else if (i == 562) {
            m10074i();
        } else if (i == 666) {
            m10072g();
        } else if (i == 1000) {
            m10065c();
        } else if (i != 1500) {
            m10058a(1.777f);
            m10075j();
        } else {
            m10073h();
        }
    }

    /* renamed from: c */
    private void m10065c() {
        this.f8107q = LayoutInflater.from(this.f9018b).inflate(C2984t.m8433f(this.f9018b, "tt_interaction_style_1_1"), this, true);
        m10067d();
        m10071f();
    }

    /* renamed from: d */
    private void m10067d() {
        this.f8109s = (FrameLayout) this.f8107q.findViewById(C2984t.m8432e(this.f9018b, "tt_ad_container"));
        ImageView imageView = (ImageView) this.f8107q.findViewById(C2984t.m8432e(this.f9018b, "tt_full_img"));
        TTRoundRectImageView tTRoundRectImageView = (TTRoundRectImageView) this.f8107q.findViewById(C2984t.m8432e(this.f9018b, "tt_full_ad_icon"));
        TextView textView = (TextView) this.f8107q.findViewById(C2984t.m8432e(this.f9018b, "tt_full_ad_app_name"));
        TextView textView2 = (TextView) this.f8107q.findViewById(C2984t.m8432e(this.f9018b, "tt_full_ad_download"));
        LinearLayout linearLayout = (LinearLayout) this.f8107q.findViewById(C2984t.m8432e(this.f9018b, "tt_ad_logo_layout"));
        if (!TextUtils.isEmpty(this.f9019c.mo19620W())) {
            textView2.setText(this.f9019c.mo19620W());
        }
        m10059a(this.f8109s, imageView);
        if (this.f9019c.mo19610M() != null && !TextUtils.isEmpty(this.f9019c.mo19610M().mo19559a())) {
            C3854d.m12660a().mo20704a(this.f9019c.mo19610M().mo19559a(), (ImageView) tTRoundRectImageView);
        }
        textView.setText(getTitle());
        m10063b((View) this.f8109s);
        m10063b((View) imageView);
        m10063b((View) tTRoundRectImageView);
        m10063b((View) textView);
        m10063b((View) textView2);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.m8985a(FullInteractionStyleView.this.f9018b, FullInteractionStyleView.this.f9019c, FullInteractionStyleView.this.f9022f);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    /* renamed from: e */
    private void m10069e() {
        this.f8107q = LayoutInflater.from(this.f9018b).inflate(C2984t.m8433f(this.f9018b, "tt_interaction_style_2_3"), this, true);
        m10067d();
        m10071f();
    }

    /* renamed from: f */
    private void m10071f() {
        TextView textView = (TextView) this.f8107q.findViewById(C2984t.m8432e(this.f9018b, "tt_full_ad_desc"));
        if (textView != null) {
            textView.setText(getDescription());
            m10063b((View) textView);
        }
    }

    /* renamed from: g */
    private void m10072g() {
        this.f8107q = LayoutInflater.from(this.f9018b).inflate(C2984t.m8433f(this.f9018b, "tt_interaction_style_2_3_h"), this, true);
        m10067d();
        m10071f();
    }

    /* renamed from: h */
    private void m10073h() {
        this.f8107q = LayoutInflater.from(this.f9018b).inflate(C2984t.m8433f(this.f9018b, "tt_interaction_style_3_2_h"), this, true);
        m10067d();
    }

    /* renamed from: i */
    private void m10074i() {
        this.f8107q = LayoutInflater.from(this.f9018b).inflate(C2984t.m8433f(this.f9018b, "tt_interaction_style_9_16_h"), this, true);
        m10067d();
        m10071f();
    }

    /* renamed from: j */
    private void m10075j() {
        this.f8107q = LayoutInflater.from(this.f9018b).inflate(C2984t.m8433f(this.f9018b, "tt_interaction_style_16_9_h"), this, true);
        m10067d();
    }

    /* renamed from: k */
    private void m10076k() {
        View inflate = LayoutInflater.from(this.f9018b).inflate(C2984t.m8433f(this.f9018b, "tt_interaction_style_3_2"), this, true);
        this.f8107q = inflate;
        this.f8109s = (FrameLayout) inflate.findViewById(C2984t.m8432e(this.f9018b, "tt_ad_container"));
        ImageView imageView = (ImageView) this.f8107q.findViewById(C2984t.m8432e(this.f9018b, "tt_bu_img"));
        TextView textView = (TextView) this.f8107q.findViewById(C2984t.m8432e(this.f9018b, "tt_bu_desc"));
        m10059a(this.f8109s, imageView);
        textView.setText(getDescription());
        m10063b((View) this.f8109s);
        m10063b((View) imageView);
        m10063b((View) textView);
        ((LinearLayout) this.f8107q.findViewById(C2984t.m8432e(this.f9018b, "tt_ad_logo_layout"))).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.m8985a(FullInteractionStyleView.this.f9018b, FullInteractionStyleView.this.f9019c, FullInteractionStyleView.this.f9022f);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    /* renamed from: a */
    private void m10059a(FrameLayout frameLayout, ImageView imageView) {
        if (this.f9019c != null) {
            boolean c = C3498n.m10583c(this.f9019c);
            if (this.f9019c.mo19607J() == null || !c) {
                m10060a(imageView);
                C4020v.m13282a((View) imageView, 0);
                C4020v.m13282a((View) frameLayout, 8);
                return;
            }
            C4020v.m13282a((View) imageView, 8);
            C4020v.m13282a((View) frameLayout, 0);
        }
    }

    /* renamed from: a */
    private void m10060a(ImageView imageView) {
        List<C3484k> P;
        if (this.f9019c != null && (P = this.f9019c.mo19613P()) != null && P.size() > 0) {
            C3769a.m12387a(P.get(0)).mo17710a(imageView);
        }
    }

    /* renamed from: l */
    private void m10077l() {
        this.f8107q = LayoutInflater.from(this.f9018b).inflate(C2984t.m8433f(this.f9018b, "tt_interaction_style_9_16_v"), this, true);
        m10067d();
    }

    /* renamed from: m */
    private void m10078m() {
        this.f8107q = LayoutInflater.from(this.f9018b).inflate(C2984t.m8433f(this.f9018b, "tt_interaction_style_16_9_v"), this, true);
        m10067d();
        m10071f();
    }

    /* renamed from: b */
    private void m10063b(View view) {
        if (view != null) {
            C3426a aVar = this.f8110t;
            if (aVar == null) {
                aVar = new C3426a(this.f9018b, this.f9019c, this.f9022f, C4014u.m13176a(this.f9022f));
                aVar.mo19402a(m10057a(this.f9019c, this.f9018b));
            }
            view.setOnTouchListener(aVar);
            view.setOnClickListener(aVar);
        }
    }

    /* renamed from: a */
    private C4026c m10057a(C3498n nVar, Context context) {
        if (nVar != null && nVar.mo19609L() == 4) {
            return new C4025b(context, nVar, this.f9022f);
        }
        return null;
    }

    public View getInteractionStyleRootView() {
        return this.f8107q;
    }

    public void setIsMute(boolean z) {
        this.f8103m = z;
        View view = this.f8108r;
        if (view != null && (view instanceof NativeVideoTsView)) {
            ((NativeVideoTsView) view).setIsQuiet(z);
        }
    }

    public FrameLayout getVideoContainer() {
        return this.f8109s;
    }

    public void setDownloadListener(C3432e eVar) {
        this.f8110t = eVar;
    }

    private float getHeightDp() {
        return (float) C4020v.m13311d(this.f9018b, (float) C4020v.m13320h(this.f9018b));
    }

    private float getWidthDp() {
        return (float) C4020v.m13311d(this.f9018b, (float) C4020v.m13321i(this.f9018b));
    }

    /* renamed from: a */
    private void m10058a(float f) {
        float f2;
        float f3;
        int i;
        int i2;
        float heightDp = getHeightDp();
        float widthDp = getWidthDp();
        if (this.f8106p == 2) {
            f2 = Math.max(heightDp, widthDp);
            f3 = Math.min(heightDp, widthDp);
        } else {
            f2 = Math.min(heightDp, widthDp);
            f3 = Math.max(heightDp, widthDp);
        }
        if (this.f8106p != 2 && C4020v.m13308c((Activity) this.f9018b)) {
            f3 -= (float) C4020v.m13311d(this.f9018b, C4020v.m13322j(this.f9018b));
        }
        int i3 = 20;
        int i4 = 0;
        if (this.f8106p != 2) {
            if (!(f == 0.0f || f == 100.0f)) {
                float f4 = (float) 20;
                i = (int) Math.max((f3 - (((f2 - f4) - f4) / f)) / 2.0f, 0.0f);
                i2 = 20;
                i4 = 20;
                i3 = i;
                ((Activity) this.f9018b).getWindow().getDecorView().setPadding(C4020v.m13315e(this.f9018b, (float) i4), C4020v.m13315e(this.f9018b, (float) i3), C4020v.m13315e(this.f9018b, (float) i2), C4020v.m13315e(this.f9018b, (float) i));
            }
        } else if (!(f == 0.0f || f == 100.0f)) {
            float f5 = (float) 20;
            i2 = (int) Math.max((f2 - (((f3 - f5) - f5) * f)) / 2.0f, 0.0f);
            i4 = i2;
            i = 20;
            ((Activity) this.f9018b).getWindow().getDecorView().setPadding(C4020v.m13315e(this.f9018b, (float) i4), C4020v.m13315e(this.f9018b, (float) i3), C4020v.m13315e(this.f9018b, (float) i2), C4020v.m13315e(this.f9018b, (float) i));
        }
        i = 0;
        i2 = 0;
        i3 = 0;
        ((Activity) this.f9018b).getWindow().getDecorView().setPadding(C4020v.m13315e(this.f9018b, (float) i4), C4020v.m13315e(this.f9018b, (float) i3), C4020v.m13315e(this.f9018b, (float) i2), C4020v.m13315e(this.f9018b, (float) i));
    }
}
