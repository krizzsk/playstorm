package com.bytedance.sdk.openadsdk.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C2959b;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.CustomEventInterstitialListener;
import com.bytedance.sdk.openadsdk.TTImage;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.p176i.C3854d;
import com.bytedance.sdk.openadsdk.utils.C4020v;
import java.util.ArrayList;

public class PangleAdInterstitialActivity extends Activity {
    public static final String INTENT_TYPE = "intent_type";
    public static final int INTENT_TYPE_IMAGE_2_3 = 2;
    public static final int INTENT_TYPE_IMAGE_3_2 = 1;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static CustomEventInterstitialListener f7335n;

    /* renamed from: o */
    private static TTNativeAd f7336o;

    /* renamed from: a */
    private ImageView f7337a;

    /* renamed from: b */
    private RelativeLayout f7338b;

    /* renamed from: c */
    private NiceImageView f7339c;

    /* renamed from: d */
    private TextView f7340d;

    /* renamed from: e */
    private TextView f7341e;

    /* renamed from: f */
    private Button f7342f;

    /* renamed from: g */
    private TTRatingBar2 f7343g;

    /* renamed from: h */
    private Intent f7344h;

    /* renamed from: i */
    private ViewGroup f7345i;

    /* renamed from: j */
    private RelativeLayout f7346j;

    /* renamed from: k */
    private ViewGroup f7347k;

    /* renamed from: l */
    private float f7348l;

    /* renamed from: m */
    private float f7349m;

    public void onBackPressed() {
    }

    public static void showAd(Context context, TTNativeAd tTNativeAd, int i, CustomEventInterstitialListener customEventInterstitialListener) {
        f7336o = tTNativeAd;
        f7335n = customEventInterstitialListener;
        Intent intent = new Intent(context, PangleAdInterstitialActivity.class);
        intent.addFlags(268435456);
        intent.putExtra(INTENT_TYPE, i);
        C2959b.m8339a(context, intent, new C2959b.C2960a() {
            /* renamed from: a */
            public void mo17887a() {
            }

            /* renamed from: a */
            public void mo17888a(Throwable th) {
                if (PangleAdInterstitialActivity.f7335n != null) {
                    PangleAdInterstitialActivity.f7335n.onInterstitialShowFail();
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f7344h = getIntent();
        try {
            requestWindowFeature(1);
            getWindow().addFlags(1024);
            getWindow().addFlags(16777216);
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f7348l = (float) C4020v.m13306c((Context) this);
        this.f7349m = (float) C4020v.m13310d((Context) this);
        if (this.f7344h.getIntExtra(INTENT_TYPE, 0) == 2) {
            setRequestedOrientation(1);
        } else {
            setRequestedOrientation(0);
        }
        if (this.f7344h != null) {
            m8998b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d8  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8998b() {
        /*
            r8 = this;
            float r0 = r8.f7348l
            int r0 = (int) r0
            com.bytedance.sdk.openadsdk.TTNativeAd r1 = f7336o
            r2 = 1
            r3 = 0
            java.lang.String r4 = "PangleAdInterstitial"
            if (r1 == 0) goto L_0x0086
            java.util.List r1 = r1.getImageList()
            if (r1 == 0) goto L_0x0086
            com.bytedance.sdk.openadsdk.TTNativeAd r1 = f7336o
            java.util.List r1 = r1.getImageList()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0086
            com.bytedance.sdk.openadsdk.TTNativeAd r1 = f7336o
            java.util.List r1 = r1.getImageList()
            java.lang.Object r1 = r1.get(r3)
            com.bytedance.sdk.openadsdk.TTImage r1 = (com.bytedance.sdk.openadsdk.TTImage) r1
            if (r1 == 0) goto L_0x0086
            boolean r5 = r1.isValid()
            if (r5 == 0) goto L_0x0086
            int r5 = r1.getHeight()
            float r5 = (float) r5
            int r1 = r1.getWidth()
            float r1 = (float) r1
            float r1 = r1 / r5
            r5 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 * r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "ratio...."
            r6.append(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            com.bytedance.sdk.component.utils.C2975l.m8384b((java.lang.String) r4, (java.lang.String) r6)
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            r6 = 1155432448(0x44de8000, float:1780.0)
            if (r5 <= 0) goto L_0x006c
            int r5 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r5 > 0) goto L_0x006c
            float r1 = (float) r0
            r5 = 1071896330(0x3fe3d70a, float:1.78)
            float r1 = r1 / r5
            int r1 = (int) r1
            int r1 = r1 + 30
            java.lang.String r5 = "RATIO_1_7_8...."
            com.bytedance.sdk.component.utils.C2975l.m8384b((java.lang.String) r4, (java.lang.String) r5)
            goto L_0x0087
        L_0x006c:
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x007e
            float r1 = (float) r0
            r5 = 1072986849(0x3ff47ae1, float:1.91)
            float r1 = r1 / r5
            int r1 = (int) r1
            int r1 = r1 + 30
            java.lang.String r5 = "RATIO_1_9_1...."
            com.bytedance.sdk.component.utils.C2975l.m8384b((java.lang.String) r4, (java.lang.String) r5)
            goto L_0x0087
        L_0x007e:
            java.lang.String r1 = "RATIO_1_1...."
            com.bytedance.sdk.component.utils.C2975l.m8384b((java.lang.String) r4, (java.lang.String) r1)
            r1 = r0
            r5 = r2
            goto L_0x0088
        L_0x0086:
            r1 = r0
        L_0x0087:
            r5 = r3
        L_0x0088:
            android.content.Intent r6 = r8.f7344h
            java.lang.String r7 = "intent_type"
            int r3 = r6.getIntExtra(r7, r3)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "intentType="
            r6.append(r7)
            r6.append(r3)
            java.lang.String r7 = ",isImageRatio_1_1="
            r6.append(r7)
            r6.append(r5)
            java.lang.String r7 = ", imageHeight = "
            r6.append(r7)
            r6.append(r1)
            java.lang.String r7 = "，imageWidth="
            r6.append(r7)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.bytedance.sdk.component.utils.C2975l.m8384b((java.lang.String) r4, (java.lang.String) r0)
            if (r3 == r2) goto L_0x00d8
            r0 = 2
            if (r3 == r0) goto L_0x00c7
            r8.finish()
            goto L_0x0156
        L_0x00c7:
            java.lang.String r0 = "tt_pangle_ad_instersitial_layout_2_3"
            int r0 = com.bytedance.sdk.component.utils.C2984t.m8433f(r8, r0)
            r8.setContentView(r0)
            r8.m9001d()
            r8.m8996a((int) r1)
            goto L_0x0156
        L_0x00d8:
            if (r5 != 0) goto L_0x0101
            java.lang.String r0 = "tt_pangle_ad_instersitial_layout_3_2"
            int r0 = com.bytedance.sdk.component.utils.C2984t.m8433f(r8, r0)
            r8.setContentView(r0)
            r8.m9001d()
            r0 = 1117126656(0x42960000, float:75.0)
            int r0 = com.bytedance.sdk.openadsdk.utils.C4020v.m13315e(r8, r0)
            float r0 = (float) r0
            float r2 = r8.f7349m
            float r3 = (float) r1
            float r4 = r2 - r3
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x00fd
            float r4 = r8.f7348l
            float r4 = r4 - r3
            float r0 = r0 - r4
            float r2 = r2 + r0
            r8.f7349m = r2
        L_0x00fd:
            r8.m8996a((int) r1)
            goto L_0x0156
        L_0x0101:
            java.lang.String r0 = "tt_pangle_ad_instersitial_layout_3_2_1_1"
            int r0 = com.bytedance.sdk.component.utils.C2984t.m8433f(r8, r0)
            r8.setContentView(r0)
            r8.m9001d()
            r0 = 1126825984(0x432a0000, float:170.0)
            int r0 = com.bytedance.sdk.openadsdk.utils.C4020v.m13315e(r8, r0)
            float r0 = (float) r0
            float r2 = r8.f7349m
            r3 = 1101004800(0x41a00000, float:20.0)
            int r3 = com.bytedance.sdk.openadsdk.utils.C4020v.m13315e(r8, r3)
            float r3 = (float) r3
            float r2 = r2 - r3
            int r2 = (int) r2
            float r3 = r8.f7348l
            float r4 = (float) r1
            float r5 = r3 - r4
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 >= 0) goto L_0x012b
            float r3 = r3 - r0
            int r0 = (int) r3
            goto L_0x012c
        L_0x012b:
            r0 = r1
        L_0x012c:
            float r3 = r8.f7349m
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x013a
            int r1 = (int) r3
            r3 = 1111490560(0x42400000, float:48.0)
            int r3 = com.bytedance.sdk.openadsdk.utils.C4020v.m13315e(r8, r3)
            int r1 = r1 - r3
        L_0x013a:
            android.widget.RelativeLayout r3 = r8.f7346j
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            r3.height = r1
            r3.width = r0
            android.widget.RelativeLayout r0 = r8.f7346j
            r0.setLayoutParams(r3)
            android.view.ViewGroup r0 = r8.f7345i
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r0.height = r2
            android.view.ViewGroup r1 = r8.f7345i
            r1.setLayoutParams(r0)
        L_0x0156:
            com.bytedance.sdk.openadsdk.TTNativeAd r0 = f7336o
            r8.m8997a((com.bytedance.sdk.openadsdk.TTNativeAd) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.adapter.PangleAdInterstitialActivity.m8998b():void");
    }

    /* renamed from: a */
    private void m8996a(int i) {
        ViewGroup.LayoutParams layoutParams = this.f7346j.getLayoutParams();
        layoutParams.height = i;
        this.f7346j.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f7345i.getLayoutParams();
        layoutParams2.height = (int) (this.f7349m - ((float) i));
        this.f7345i.setLayoutParams(layoutParams2);
    }

    /* renamed from: a */
    private void m8997a(TTNativeAd tTNativeAd) {
        TTImage tTImage;
        if (tTNativeAd != null) {
            if (f7336o.getImageList() != null && !f7336o.getImageList().isEmpty() && (tTImage = f7336o.getImageList().get(0)) != null && tTImage.isValid()) {
                C3854d.m12660a().mo20704a(tTImage.getImageUrl(), this.f7337a);
            }
            if (!(f7336o.getIcon() == null || !f7336o.getIcon().isValid() || f7336o.getIcon().getImageUrl() == null)) {
                C3854d.m12660a().mo20704a(f7336o.getIcon().getImageUrl(), (ImageView) this.f7339c);
            }
            this.f7340d.setText(f7336o.getTitle());
            this.f7341e.setText(f7336o.getDescription());
            this.f7342f.setText(f7336o.getButtonText());
            m9000c();
            m8999b(tTNativeAd);
        }
    }

    /* renamed from: b */
    private void m8999b(TTNativeAd tTNativeAd) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f7337a);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.f7342f);
        tTNativeAd.registerViewForInteraction(this.f7347k, arrayList, arrayList2, this.f7338b, new TTNativeAd.AdInteractionListener() {
            public void onAdClicked(View view, TTNativeAd tTNativeAd) {
                C2975l.m8384b("PangleAdInterstitial", "PangleAdInterstitialActivity-onAdClicked....");
                if (PangleAdInterstitialActivity.f7335n != null) {
                    PangleAdInterstitialActivity.f7335n.onInterstitialClicked();
                }
            }

            public void onAdCreativeClick(View view, TTNativeAd tTNativeAd) {
                C2975l.m8384b("PangleAdInterstitial", "PangleAdInterstitialActivity-onAdClicked....");
                if (PangleAdInterstitialActivity.f7335n != null) {
                    PangleAdInterstitialActivity.f7335n.onInterstitialClicked();
                }
            }

            public void onAdShow(TTNativeAd tTNativeAd) {
                C2975l.m8384b("PangleAdInterstitial", "PangleAdInterstitialActivity-onAdShow....");
                if (PangleAdInterstitialActivity.f7335n != null) {
                    PangleAdInterstitialActivity.f7335n.onInterstitialShown();
                }
            }
        });
    }

    /* renamed from: c */
    private void m9000c() {
        this.f7338b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                PangleAdInterstitialActivity.this.finish();
                if (PangleAdInterstitialActivity.f7335n != null) {
                    PangleAdInterstitialActivity.f7335n.onInterstitialDismissed();
                }
            }
        });
    }

    /* renamed from: d */
    private void m9001d() {
        TTRatingBar2 tTRatingBar2 = (TTRatingBar2) findViewById(C2984t.m8432e(this, "tt_pangle_ad_score"));
        this.f7343g = tTRatingBar2;
        if (tTRatingBar2 != null) {
            C4020v.m13289a((TextView) null, tTRatingBar2, (double) f7336o.getAppScore(), (Context) this);
        }
        this.f7337a = (ImageView) findViewById(C2984t.m8432e(this, "tt_pangle_ad_main_img"));
        this.f7338b = (RelativeLayout) findViewById(C2984t.m8432e(this, "tt_pangle_ad_close_layout"));
        this.f7339c = (NiceImageView) findViewById(C2984t.m8432e(this, "tt_pangle_ad_icon"));
        this.f7340d = (TextView) findViewById(C2984t.m8432e(this, "tt_pangle_ad_title"));
        this.f7341e = (TextView) findViewById(C2984t.m8432e(this, "tt_pangle_ad_content"));
        this.f7342f = (Button) findViewById(C2984t.m8432e(this, "tt_pangle_ad_btn"));
        this.f7345i = (ViewGroup) findViewById(C2984t.m8432e(this, "tt_pangle_ad_content_layout"));
        this.f7346j = (RelativeLayout) findViewById(C2984t.m8432e(this, "tt_pangle_ad_image_layout"));
        this.f7347k = (ViewGroup) findViewById(C2984t.m8432e(this, "tt_pangle_ad_root"));
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        f7336o = null;
        f7335n = null;
    }
}
