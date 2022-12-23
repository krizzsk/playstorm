package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.p143a.C3299e;
import com.bytedance.sdk.openadsdk.component.reward.p143a.C3313g;
import com.bytedance.sdk.openadsdk.core.p146b.C3432e;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.p176i.C3854d;
import com.bytedance.sdk.openadsdk.utils.C4020v;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.view.a */
/* compiled from: RewardFullBackUpEndCard */
public class C3384a {

    /* renamed from: a */
    LinearLayout f8120a;

    /* renamed from: b */
    FrameLayout f8121b;

    /* renamed from: c */
    TTRoundRectImageView f8122c;

    /* renamed from: d */
    TextView f8123d;

    /* renamed from: e */
    TTRatingBar2 f8124e;

    /* renamed from: f */
    TextView f8125f;

    /* renamed from: g */
    TextView f8126g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Activity f8127h;

    /* renamed from: i */
    private boolean f8128i;

    /* renamed from: j */
    private TextView f8129j;

    /* renamed from: k */
    private C3313g f8130k;

    public C3384a(Activity activity) {
        this.f8127h = activity;
    }

    /* renamed from: a */
    public void mo19275a() {
        if (!this.f8128i) {
            this.f8128i = true;
            m10099d();
        }
    }

    /* renamed from: d */
    private void m10099d() {
        Activity activity = this.f8127h;
        this.f8121b = (FrameLayout) activity.findViewById(C2984t.m8432e(activity, "tt_reward_full_endcard_backup_container"));
        Activity activity2 = this.f8127h;
        this.f8120a = (LinearLayout) activity2.findViewById(C2984t.m8432e(activity2, "tt_reward_full_endcard_backup"));
        Activity activity3 = this.f8127h;
        this.f8122c = (TTRoundRectImageView) activity3.findViewById(C2984t.m8432e(activity3, "tt_reward_ad_icon_backup"));
        Activity activity4 = this.f8127h;
        this.f8123d = (TextView) activity4.findViewById(C2984t.m8432e(activity4, "tt_reward_ad_appname_backup"));
        Activity activity5 = this.f8127h;
        this.f8124e = (TTRatingBar2) activity5.findViewById(C2984t.m8432e(activity5, "tt_rb_score_backup"));
        Activity activity6 = this.f8127h;
        this.f8125f = (TextView) activity6.findViewById(C2984t.m8432e(activity6, "tt_comment_backup"));
        Activity activity7 = this.f8127h;
        this.f8126g = (TextView) activity7.findViewById(C2984t.m8432e(activity7, "tt_reward_ad_download_backup"));
        Activity activity8 = this.f8127h;
        this.f8129j = (TextView) activity8.findViewById(C2984t.m8432e(activity8, "tt_ad_endcard_logo"));
    }

    /* renamed from: a */
    public void mo19276a(C3432e eVar) {
        C4020v.m13284a((View) this.f8121b, (View.OnClickListener) new View.OnClickListener() {
            public void onClick(View view) {
            }
        }, "TTBaseVideoActivity#mFLEndCardBackupContainer");
        this.f8126g.setOnClickListener(eVar);
        this.f8126g.setOnTouchListener(eVar);
        if (this.f8130k == null) {
            this.f8130k = new C3313g(this.f8127h);
        }
        this.f8130k.mo19148a(eVar);
    }

    /* renamed from: b */
    public void mo19281b() {
        C4020v.m13282a((View) this.f8121b, 0);
        C4020v.m13282a((View) this.f8120a, 0);
        C3313g gVar = this.f8130k;
        if (gVar != null) {
            gVar.mo19147a();
        }
    }

    /* renamed from: c */
    public void mo19282c() {
        TTRoundRectImageView tTRoundRectImageView = this.f8122c;
        if (tTRoundRectImageView != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) tTRoundRectImageView.getLayoutParams();
            layoutParams.setMargins(0, (int) C4020v.m13297b(this.f8127h, 50.0f), 0, 0);
            this.f8122c.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public void mo19277a(C3498n nVar) {
        if (nVar.mo19679aw()) {
            if (this.f8130k == null) {
                this.f8130k = new C3313g(this.f8127h);
            }
            this.f8130k.mo19149a(nVar);
            return;
        }
        if (!(this.f8122c == null || nVar.mo19610M() == null || TextUtils.isEmpty(nVar.mo19610M().mo19559a()))) {
            C3854d.m12660a().mo20703a(nVar.mo19610M(), (ImageView) this.f8122c);
        }
        TTRatingBar2 tTRatingBar2 = this.f8124e;
        if (tTRatingBar2 != null) {
            C4020v.m13290a((TextView) null, tTRatingBar2, nVar, (Context) this.f8127h);
        }
        if (this.f8123d != null) {
            if (nVar.mo19657aa() == null || TextUtils.isEmpty(nVar.mo19657aa().mo19495b())) {
                this.f8123d.setText(nVar.mo19618U());
            } else {
                this.f8123d.setText(nVar.mo19657aa().mo19495b());
            }
        }
        TextView textView = this.f8125f;
        if (textView != null) {
            C4020v.m13288a(textView, nVar, (Context) this.f8127h, "tt_comment_num_backup");
        }
    }

    /* renamed from: a */
    public void mo19279a(String str) {
        TextView textView;
        if (!TextUtils.isEmpty(str) && (textView = this.f8126g) != null) {
            textView.setText(str);
        }
    }

    /* renamed from: a */
    public void mo19278a(final C3498n nVar, final String str) {
        this.f8129j.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.m8985a(C3384a.this.f8127h, nVar, str);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    /* renamed from: a */
    public boolean mo19280a(C3299e eVar) {
        C3313g gVar = this.f8130k;
        if (gVar == null || !gVar.mo19150a(eVar)) {
            return false;
        }
        C4020v.m13282a((View) this.f8121b, 0);
        C4020v.m13282a((View) this.f8120a, 8);
        return true;
    }
}
