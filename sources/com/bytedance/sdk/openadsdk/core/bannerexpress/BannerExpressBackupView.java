package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.C2618b;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3618k;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.p151e.C3481j;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.widget.RatioFrameLayout;
import com.bytedance.sdk.openadsdk.core.widget.RatioImageView;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.p176i.C3854d;
import com.bytedance.sdk.openadsdk.utils.C4020v;
import com.com.bytedance.overseas.sdk.p186a.C4026c;

public class BannerExpressBackupView extends BackupView {

    /* renamed from: a */
    public static C3618k[] f8324a = {new C3618k(1, 6.4f, 320, 50), new C3618k(4, 1.2f, 300, 250)};

    /* renamed from: m */
    private View f8325m;

    /* renamed from: n */
    private NativeExpressView f8326n;

    /* renamed from: o */
    private C4026c f8327o;

    /* renamed from: p */
    private int f8328p = 1;

    /* renamed from: q */
    private String f8329q;

    public void setClosedListenerKey(String str) {
        this.f8329q = str;
    }

    public BannerExpressBackupView(Context context) {
        super(context);
        this.f9018b = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19260a(View view, int i, C3481j jVar) {
        if (this.f8326n != null) {
            if (i == 1 || i == 2) {
                View findViewById = this.f8325m.findViewById(C2984t.m8432e(this.f9018b, "tt_bu_close"));
                if (i == 1) {
                    this.f8326n.getClickListener().mo19408b(findViewById);
                } else {
                    this.f8326n.getClickCreativeListener().mo19408b(findViewById);
                }
            }
            this.f8326n.mo16722a(view, i, (C2618b) jVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo19420a(C3498n nVar, NativeExpressView nativeExpressView, C4026c cVar) {
        setBackgroundColor(-1);
        this.f9019c = nVar;
        this.f8326n = nativeExpressView;
        this.f8327o = cVar;
        this.f9022f = "banner_ad";
        this.f8326n.addView(this, new ViewGroup.LayoutParams(-2, -2));
        m10287b();
    }

    /* renamed from: b */
    private void m10287b() {
        C3618k a = m10284a(this.f8326n.getExpectExpressWidth(), this.f8326n.getExpectExpressHeight());
        if (this.f8326n.getExpectExpressWidth() <= 0 || this.f8326n.getExpectExpressHeight() <= 0) {
            this.f9023g = C4020v.m13306c(this.f9018b);
            this.f9024h = Float.valueOf(((float) this.f9023g) / a.f9165b).intValue();
        } else {
            this.f9023g = C4020v.m13315e(this.f9018b, (float) this.f8326n.getExpectExpressWidth());
            this.f9024h = C4020v.m13315e(this.f9018b, (float) this.f8326n.getExpectExpressHeight());
        }
        if (this.f9023g > 0 && this.f9023g > C4020v.m13306c(this.f9018b)) {
            float c = ((float) C4020v.m13306c(this.f9018b)) / ((float) this.f9023g);
            this.f9023g = C4020v.m13306c(this.f9018b);
            this.f9024h = Float.valueOf(((float) this.f9024h) * c).intValue();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.f9023g, this.f9024h);
        }
        layoutParams.width = this.f9023g;
        layoutParams.height = this.f9024h;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        if (a.f9164a == 1) {
            m10289c();
        } else if (a.f9164a == 4) {
            m10291d();
        } else {
            m10291d();
        }
    }

    /* renamed from: a */
    private void m10285a(ImageView imageView) {
        C3854d.m12660a().mo20703a(this.f9019c.mo19613P().get(0), imageView);
    }

    /* renamed from: c */
    private void m10289c() {
        float e = (((float) this.f9024h) * 1.0f) / ((float) C4020v.m13315e(this.f9018b, 50.0f));
        if ((((float) this.f9024h) * 1.0f) / ((float) this.f9023g) > 0.21875f) {
            e = (((float) this.f9023g) * 1.0f) / ((float) C4020v.m13315e(this.f9018b, 320.0f));
        }
        View inflate = LayoutInflater.from(this.f9018b).inflate(C2984t.m8433f(this.f9018b, "tt_backup_banner_layout1"), this, true);
        this.f8325m = inflate;
        View findViewById = inflate.findViewById(C2984t.m8432e(this.f9018b, "tt_bu_close"));
        ImageView imageView = (ImageView) this.f8325m.findViewById(C2984t.m8432e(this.f9018b, "tt_bu_icon"));
        TextView textView = (TextView) this.f8325m.findViewById(C2984t.m8432e(this.f9018b, "tt_bu_title"));
        TextView textView2 = (TextView) this.f8325m.findViewById(C2984t.m8432e(this.f9018b, "tt_bu_score"));
        TTRatingBar2 tTRatingBar2 = (TTRatingBar2) this.f8325m.findViewById(C2984t.m8432e(this.f9018b, "tt_bu_score_bar"));
        TextView textView3 = (TextView) this.f8325m.findViewById(C2984t.m8432e(this.f9018b, "tt_bu_download"));
        textView.setTextSize(2, ((float) C4020v.m13272a(this.f9018b, textView.getTextSize())) * e);
        textView2.setTextSize(2, ((float) C4020v.m13272a(this.f9018b, textView2.getTextSize())) * e);
        textView3.setTextSize(2, ((float) C4020v.m13272a(this.f9018b, textView3.getTextSize())) * e);
        View findViewById2 = this.f8325m.findViewById(C2984t.m8432e(this.f9018b, "tt_backup_logoLayout"));
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    TTWebsiteActivity.m8985a(BannerExpressBackupView.this.f9018b, BannerExpressBackupView.this.f9019c, BannerExpressBackupView.this.f9022f);
                }
            });
        }
        findViewById.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                BannerExpressBackupView.this.mo19419a();
            }
        });
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) (((float) C4020v.m13315e(this.f9018b, 45.0f)) * e);
            layoutParams.height = (int) (((float) C4020v.m13315e(this.f9018b, 45.0f)) * e);
        }
        if (this.f9019c.mo19610M() != null && !TextUtils.isEmpty(this.f9019c.mo19610M().mo19559a())) {
            C3854d.m12660a().mo20704a(this.f9019c.mo19610M().mo19559a(), imageView);
        }
        textView.setText(getTitle());
        if (!TextUtils.isEmpty(this.f9019c.mo19620W())) {
            textView3.setText(this.f9019c.mo19620W());
        } else {
            textView3.setVisibility(8);
        }
        C4020v.m13290a(textView2, tTRatingBar2, this.f9019c, this.f9018b);
        mo20081a(imageView, true);
        imageView.setTag(C2984t.m8432e(C3578m.m11231a(), "tt_id_is_video_picture"), true);
        mo20081a(this, true);
        mo20081a(textView3, true);
    }

    /* renamed from: d */
    private void m10291d() {
        String str;
        if (this.f9019c != null) {
            int ad = this.f9019c.mo19660ad();
            float e = (((float) this.f9024h) * 1.0f) / ((float) C4020v.m13315e(this.f9018b, 250.0f));
            if (this.f9019c.mo19607J() == null) {
                View inflate = LayoutInflater.from(this.f9018b).inflate(C2984t.m8433f(this.f9018b, "tt_backup_banner_layout4"), this, true);
                this.f8325m = inflate;
                View findViewById = inflate.findViewById(C2984t.m8432e(this.f9018b, "tt_bu_close"));
                RatioImageView ratioImageView = (RatioImageView) this.f8325m.findViewById(C2984t.m8432e(this.f9018b, "ratio_image_view"));
                ImageView imageView = (ImageView) this.f8325m.findViewById(C2984t.m8432e(this.f9018b, "tt_bu_icon"));
                TextView textView = (TextView) this.f8325m.findViewById(C2984t.m8432e(this.f9018b, "tt_bu_title"));
                TextView textView2 = (TextView) this.f8325m.findViewById(C2984t.m8432e(this.f9018b, "tt_bu_desc"));
                TextView textView3 = (TextView) this.f8325m.findViewById(C2984t.m8432e(this.f9018b, "tt_bu_name"));
                TextView textView4 = (TextView) this.f8325m.findViewById(C2984t.m8432e(this.f9018b, "tt_bu_download"));
                FrameLayout frameLayout = (FrameLayout) this.f8325m.findViewById(C2984t.m8432e(this.f9018b, "tt_image_layout"));
                LinearLayout linearLayout = (LinearLayout) this.f8325m.findViewById(C2984t.m8432e(this.f9018b, "tt_bu_total_title"));
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams != null) {
                    str = "tt_id_is_video_picture";
                    layoutParams.width = (int) (((float) C4020v.m13315e(this.f9018b, 45.0f)) * e);
                    layoutParams.height = (int) (((float) C4020v.m13315e(this.f9018b, 45.0f)) * e);
                } else {
                    str = "tt_id_is_video_picture";
                }
                textView.setTextSize(2, ((float) C4020v.m13272a(this.f9018b, textView.getTextSize())) * e);
                textView2.setTextSize(2, ((float) C4020v.m13272a(this.f9018b, textView2.getTextSize())) * e);
                textView3.setTextSize(2, ((float) C4020v.m13272a(this.f9018b, textView3.getTextSize())) * e);
                textView4.setTextSize(2, ((float) C4020v.m13272a(this.f9018b, textView4.getTextSize())) * e);
                try {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
                    float f = e - 1.0f;
                    if (f > 0.0f) {
                        layoutParams2.topMargin = C4020v.m13315e(this.f9018b, f * 8.0f);
                    }
                    ((LinearLayout.LayoutParams) textView4.getLayoutParams()).setMargins(0, (int) (((float) C4020v.m13315e(this.f9018b, 16.0f)) * e), 0, 0);
                } catch (Throwable unused) {
                }
                View findViewById2 = this.f8325m.findViewById(C2984t.m8432e(this.f9018b, "tt_backup_logoLayout"));
                if (findViewById2 != null) {
                    findViewById2.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            TTWebsiteActivity.m8985a(BannerExpressBackupView.this.f9018b, BannerExpressBackupView.this.f9019c, BannerExpressBackupView.this.f9022f);
                        }
                    });
                }
                if (ad == 33) {
                    ratioImageView.setRatio(1.0f);
                } else {
                    ((LinearLayout.LayoutParams) frameLayout.getLayoutParams()).weight = 2.5f;
                    ratioImageView.setRatio(1.91f);
                }
                findViewById.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        BannerExpressBackupView.this.mo19419a();
                    }
                });
                int b = (int) C4020v.m13297b(this.f9018b, 15.0f);
                C4020v.m13283a(findViewById, b, b, b, b);
                m10285a((ImageView) ratioImageView);
                if (this.f9019c.mo19610M() != null && !TextUtils.isEmpty(this.f9019c.mo19610M().mo19559a())) {
                    C3854d.m12660a().mo20704a(this.f9019c.mo19610M().mo19559a(), imageView);
                }
                textView3.setText(getNameOrSource());
                textView.setText(getNameOrSource());
                textView2.setText(getDescription());
                if (!TextUtils.isEmpty(this.f9019c.mo19620W())) {
                    textView4.setText(this.f9019c.mo19620W());
                } else {
                    textView4.setVisibility(8);
                }
                mo20081a(ratioImageView, true);
                ratioImageView.setTag(C2984t.m8432e(C3578m.m11231a(), str), true);
                mo20081a(this, true);
                mo20081a(textView4, true);
                return;
            }
            String str2 = "tt_id_is_video_picture";
            View inflate2 = LayoutInflater.from(this.f9018b).inflate(C2984t.m8433f(this.f9018b, "tt_backup_banner_layout4_video"), this, true);
            this.f8325m = inflate2;
            View findViewById3 = inflate2.findViewById(C2984t.m8432e(this.f9018b, "tt_bu_close"));
            TextView textView5 = (TextView) this.f8325m.findViewById(C2984t.m8432e(this.f9018b, "tt_bu_title"));
            TextView textView6 = (TextView) this.f8325m.findViewById(C2984t.m8432e(this.f9018b, "tt_bu_desc"));
            TextView textView7 = (TextView) this.f8325m.findViewById(C2984t.m8432e(this.f9018b, "tt_bu_download"));
            RatioFrameLayout ratioFrameLayout = (RatioFrameLayout) this.f8325m.findViewById(C2984t.m8432e(this.f9018b, "ratio_frame_layout"));
            textView5.setTextSize(2, ((float) C4020v.m13272a(this.f9018b, textView5.getTextSize())) * e);
            textView6.setTextSize(2, ((float) C4020v.m13272a(this.f9018b, textView6.getTextSize())) * e);
            textView7.setTextSize(2, ((float) C4020v.m13272a(this.f9018b, textView7.getTextSize())) * e);
            View findViewById4 = this.f8325m.findViewById(C2984t.m8432e(this.f9018b, "tt_backup_logoLayout"));
            if (findViewById4 != null) {
                findViewById4.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        TTWebsiteActivity.m8985a(BannerExpressBackupView.this.f9018b, BannerExpressBackupView.this.f9019c, BannerExpressBackupView.this.f9022f);
                    }
                });
            }
            if (ad == 15) {
                ratioFrameLayout.setRatio(0.5625f);
            } else if (ad == 5) {
                ratioFrameLayout.setRatio(1.7777778f);
            } else {
                ratioFrameLayout.setRatio(1.0f);
            }
            ratioFrameLayout.removeAllViews();
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
            View videoView = getVideoView();
            if (videoView != null) {
                ratioFrameLayout.addView(videoView, layoutParams3);
            }
            textView5.setText(getNameOrSource());
            textView6.setText(getDescription());
            if (!TextUtils.isEmpty(this.f9019c.mo19620W())) {
                textView7.setText(this.f9019c.mo19620W());
            } else {
                textView7.setVisibility(8);
            }
            findViewById3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    BannerExpressBackupView.this.mo19419a();
                }
            });
            int b2 = (int) C4020v.m13297b(this.f9018b, 15.0f);
            C4020v.m13283a(findViewById3, b2, b2, b2, b2);
            mo20081a(videoView, true);
            videoView.setTag(C2984t.m8432e(C3578m.m11231a(), str2), true);
            mo20081a(this, true);
            mo20081a(textView7, true);
            mo20080a((View) ratioFrameLayout);
        }
    }

    /* renamed from: a */
    public static C3618k m10284a(int i, int i2) {
        try {
            return ((double) i2) >= Math.floor((((double) i) * 450.0d) / 600.0d) ? f8324a[1] : f8324a[0];
        } catch (Throwable unused) {
            return f8324a[0];
        }
    }

    /* renamed from: a */
    public void mo19419a() {
        if (this.f9021e != null) {
            this.f9021e.show();
        } else if (this.f9020d != null) {
            this.f9020d.showDislikeDialog();
        } else {
            TTDelegateActivity.m8755a(this.f9019c, this.f8329q);
        }
    }
}
