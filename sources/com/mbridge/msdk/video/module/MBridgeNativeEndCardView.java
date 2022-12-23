package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.p064b.C2339a;
import com.mbridge.msdk.foundation.p064b.C2347b;
import com.mbridge.msdk.foundation.same.C8413a;
import com.mbridge.msdk.foundation.same.p301c.C8425b;
import com.mbridge.msdk.foundation.same.report.C8542e;
import com.mbridge.msdk.foundation.tools.C8557ad;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.shake.C9127a;
import com.mbridge.msdk.shake.C9130b;
import com.mbridge.msdk.shake.MBShakeView;
import com.mbridge.msdk.video.signal.factory.C9529b;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import com.mbridge.msdk.widget.C9587a;
import com.mbridge.msdk.widget.FeedBackButton;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class MBridgeNativeEndCardView extends MBridgeBaseView {

    /* renamed from: A */
    private C9529b f22808A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f22809B = false;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f22810C = false;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f22811D = false;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public boolean f22812E = false;

    /* renamed from: F */
    private int f22813F = 0;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public AlphaAnimation f22814G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public int f22815H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public int f22816I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public int f22817J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public int f22818K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public View f22819L;

    /* renamed from: M */
    private View f22820M;

    /* renamed from: N */
    private FeedBackButton f22821N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public String f22822O;

    /* renamed from: P */
    private CampaignUnit f22823P;

    /* renamed from: Q */
    private MBShakeView f22824Q;

    /* renamed from: R */
    private C9130b f22825R;

    /* renamed from: m */
    private ViewGroup f22826m;

    /* renamed from: n */
    private ViewGroup f22827n;

    /* renamed from: o */
    private RelativeLayout f22828o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public ImageView f22829p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public ImageView f22830q;

    /* renamed from: r */
    private ImageView f22831r;

    /* renamed from: s */
    private ImageView f22832s;

    /* renamed from: t */
    private ImageView f22833t;

    /* renamed from: u */
    private TextView f22834u;

    /* renamed from: v */
    private TextView f22835v;

    /* renamed from: w */
    private TextView f22836w;

    /* renamed from: x */
    private LinearLayout f22837x;

    /* renamed from: y */
    private Runnable f22838y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public RelativeLayout f22839z;

    public void setCloseBtnDelay(int i) {
        this.f22813F = i;
    }

    public void setUnitId(String str) {
        this.f22822O = str;
    }

    public MBridgeNativeEndCardView(Context context) {
        super(context);
    }

    public MBridgeNativeEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBridgeNativeEndCardView(Context context, AttributeSet attributeSet, boolean z, int i, boolean z2, int i2) {
        super(context, attributeSet, z, i, z2, i2);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f22838y == null) {
            this.f22838y = new Runnable() {
                public final void run() {
                    boolean unused = MBridgeNativeEndCardView.this.f22810C = true;
                    if (MBridgeNativeEndCardView.this.f22819L != null) {
                        MBridgeNativeEndCardView.this.f22819L.setVisibility(0);
                    }
                }
            };
        }
        Runnable runnable = this.f22838y;
        if (runnable != null) {
            postDelayed(runnable, (long) (this.f22813F * 1000));
            if (!this.f22811D) {
                this.f22811D = true;
            }
            try {
                if (this.f22694b != null) {
                    String str = this.f22694b.getendcard_url();
                    if (TextUtils.isEmpty(str)) {
                        str = this.f22694b.getEndScreenUrl();
                    }
                    String a = C8557ad.m24740a(str, "alac");
                    if (!TextUtils.isEmpty(a) && a.equals("1")) {
                        postDelayed(new Runnable() {
                            public final void run() {
                                MBridgeNativeEndCardView.m26809a(MBridgeNativeEndCardView.this, 2);
                            }
                        }, 1000);
                    }
                }
            } catch (Throwable th) {
                C8608u.m24884d(MBridgeBaseView.TAG, th.getMessage());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f22838y;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        if (this.f22825R != null) {
            C9127a.m26171a().mo61027b(this.f22825R);
            this.f22825R = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0061, code lost:
        if (r5.f22703k != false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0079, code lost:
        if (r5.f22703k != false) goto L_0x007d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void init(android.content.Context r6) {
        /*
            r5 = this;
            boolean r6 = r5.f22701i
            r0 = 1
            if (r6 == 0) goto L_0x0047
            com.mbridge.msdk.video.dynview.j.c r6 = new com.mbridge.msdk.video.dynview.j.c
            r6.<init>()
            android.content.Context r6 = r5.getContext()
            int r1 = r5.f22702j
            int r1 = com.mbridge.msdk.foundation.tools.C8596q.m24828d(r6)
            if (r1 != r0) goto L_0x0019
            java.lang.String r0 = "mbridge_reward_end_card_layout_portrait"
            goto L_0x001b
        L_0x0019:
            java.lang.String r0 = "mbridge_reward_end_card_layout_landscape"
        L_0x001b:
            com.mbridge.msdk.video.dynview.c$a r1 = new com.mbridge.msdk.video.dynview.c$a
            r1.<init>()
            com.mbridge.msdk.video.dynview.c$b r0 = r1.mo62378a((java.lang.String) r0)
            r1 = 4
            com.mbridge.msdk.video.dynview.c$b r0 = r0.mo62375a((int) r1)
            com.mbridge.msdk.video.dynview.c$b r0 = r0.mo62376a((android.content.Context) r6)
            int r6 = com.mbridge.msdk.foundation.tools.C8596q.m24828d(r6)
            com.mbridge.msdk.video.dynview.c$b r6 = r0.mo62383b((int) r6)
            com.mbridge.msdk.video.dynview.c r6 = r6.mo62381a()
            com.mbridge.msdk.video.dynview.b r0 = com.mbridge.msdk.video.dynview.C9249b.m26477a()
            com.mbridge.msdk.video.module.MBridgeNativeEndCardView$7 r1 = new com.mbridge.msdk.video.module.MBridgeNativeEndCardView$7
            r1.<init>()
            r0.mo62361a(r6, r1)
            goto L_0x00b7
        L_0x0047:
            int r6 = r5.f22704l
            java.lang.String r1 = "mbridge_reward_endcard_native_half_landscape"
            java.lang.String r2 = "mbridge_reward_endcard_native_land"
            java.lang.String r3 = "mbridge_reward_endcard_native_half_portrait"
            java.lang.String r4 = "mbridge_reward_endcard_native_hor"
            if (r6 != 0) goto L_0x0064
            boolean r6 = r5.f22703k
            if (r6 == 0) goto L_0x0058
            goto L_0x0059
        L_0x0058:
            r3 = r4
        L_0x0059:
            boolean r6 = r5.isLandscape()
            if (r6 == 0) goto L_0x007e
            boolean r6 = r5.f22703k
            if (r6 == 0) goto L_0x007c
            goto L_0x007d
        L_0x0064:
            int r6 = r5.f22704l
            if (r6 != r0) goto L_0x006f
            boolean r6 = r5.f22703k
            if (r6 == 0) goto L_0x006d
            goto L_0x0072
        L_0x006d:
            r3 = r4
            goto L_0x0072
        L_0x006f:
            java.lang.String r6 = ""
            r3 = r6
        L_0x0072:
            int r6 = r5.f22704l
            r0 = 2
            if (r6 != r0) goto L_0x007e
            boolean r6 = r5.f22703k
            if (r6 == 0) goto L_0x007c
            goto L_0x007d
        L_0x007c:
            r1 = r2
        L_0x007d:
            r3 = r1
        L_0x007e:
            int r6 = r5.findLayout(r3)
            if (r6 <= 0) goto L_0x00b7
            boolean r0 = r5.isLandscape()
            r1 = 0
            if (r0 == 0) goto L_0x009f
            android.view.LayoutInflater r0 = r5.f22695c
            android.view.View r6 = r0.inflate(r6, r1)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r5.f22827n = r6
            r5.addView(r6)
            android.view.ViewGroup r6 = r5.f22827n
            boolean r6 = r5.m26814b((android.view.View) r6)
            goto L_0x00b2
        L_0x009f:
            android.view.LayoutInflater r0 = r5.f22695c
            android.view.View r6 = r0.inflate(r6, r1)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r5.f22826m = r6
            r5.addView(r6)
            android.view.ViewGroup r6 = r5.f22826m
            boolean r6 = r5.m26814b((android.view.View) r6)
        L_0x00b2:
            r5.f22698f = r6
            r5.m26807a()
        L_0x00b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.init(android.content.Context):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0158 A[Catch:{ all -> 0x0265, all -> 0x026e }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0172 A[Catch:{ all -> 0x0265, all -> 0x026e }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x017b A[Catch:{ all -> 0x0265, all -> 0x026e }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0186 A[Catch:{ all -> 0x0265, all -> 0x026e }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0191 A[SYNTHETIC, Splitter:B:55:0x0191] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void preLoadData(com.mbridge.msdk.video.signal.factory.C9529b r8) {
        /*
            r7 = this;
            java.lang.String r0 = "MBridgeBaseView"
            r7.f22808A = r8
            com.mbridge.msdk.foundation.entity.CampaignEx r8 = r7.f22694b     // Catch:{ all -> 0x026e }
            if (r8 == 0) goto L_0x0276
            boolean r8 = r7.f22698f     // Catch:{ all -> 0x026e }
            if (r8 == 0) goto L_0x0276
            com.mbridge.msdk.video.module.MBridgeNativeEndCardView$8 r8 = new com.mbridge.msdk.video.module.MBridgeNativeEndCardView$8     // Catch:{ all -> 0x026e }
            r8.<init>()     // Catch:{ all -> 0x026e }
            android.content.Context r1 = r7.f22693a     // Catch:{ all -> 0x026e }
            android.content.Context r1 = r1.getApplicationContext()     // Catch:{ all -> 0x026e }
            com.mbridge.msdk.foundation.same.c.b r1 = com.mbridge.msdk.foundation.same.p301c.C8425b.m24339a((android.content.Context) r1)     // Catch:{ all -> 0x026e }
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r7.f22694b     // Catch:{ all -> 0x026e }
            java.lang.String r2 = r2.getImageUrl()     // Catch:{ all -> 0x026e }
            r1.mo57506a((java.lang.String) r2, (com.mbridge.msdk.foundation.same.p301c.C8428c) r8)     // Catch:{ all -> 0x026e }
            com.mbridge.msdk.video.module.a.a.j r8 = new com.mbridge.msdk.video.module.a.a.j     // Catch:{ all -> 0x026e }
            android.widget.ImageView r1 = r7.f22831r     // Catch:{ all -> 0x026e }
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ all -> 0x026e }
            android.content.Context r2 = r2.mo15792g()     // Catch:{ all -> 0x026e }
            r3 = 1090519040(0x41000000, float:8.0)
            int r2 = com.mbridge.msdk.foundation.tools.C8613y.m24929b((android.content.Context) r2, (float) r3)     // Catch:{ all -> 0x026e }
            r8.<init>(r1, r2)     // Catch:{ all -> 0x026e }
            android.content.Context r1 = r7.f22693a     // Catch:{ all -> 0x026e }
            android.content.Context r1 = r1.getApplicationContext()     // Catch:{ all -> 0x026e }
            com.mbridge.msdk.foundation.same.c.b r1 = com.mbridge.msdk.foundation.same.p301c.C8425b.m24339a((android.content.Context) r1)     // Catch:{ all -> 0x026e }
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r7.f22694b     // Catch:{ all -> 0x026e }
            java.lang.String r2 = r2.getIconUrl()     // Catch:{ all -> 0x026e }
            r1.mo57506a((java.lang.String) r2, (com.mbridge.msdk.foundation.same.p301c.C8428c) r8)     // Catch:{ all -> 0x026e }
            android.widget.TextView r8 = r7.f22834u     // Catch:{ all -> 0x026e }
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r7.f22694b     // Catch:{ all -> 0x026e }
            java.lang.String r1 = r1.getAppName()     // Catch:{ all -> 0x026e }
            r8.setText(r1)     // Catch:{ all -> 0x026e }
            android.view.View r8 = r7.f22820M     // Catch:{ all -> 0x026e }
            if (r8 == 0) goto L_0x006e
            android.view.View r8 = r7.f22820M     // Catch:{ all -> 0x026e }
            boolean r8 = r8 instanceof android.widget.TextView     // Catch:{ all -> 0x026e }
            if (r8 == 0) goto L_0x006e
            android.view.View r8 = r7.f22820M     // Catch:{ all -> 0x026e }
            android.widget.TextView r8 = (android.widget.TextView) r8     // Catch:{ all -> 0x026e }
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r7.f22694b     // Catch:{ all -> 0x026e }
            java.lang.String r1 = r1.getAdCall()     // Catch:{ all -> 0x026e }
            r8.setText(r1)     // Catch:{ all -> 0x026e }
        L_0x006e:
            android.widget.TextView r8 = r7.f22835v     // Catch:{ all -> 0x026e }
            if (r8 == 0) goto L_0x007d
            android.widget.TextView r8 = r7.f22835v     // Catch:{ all -> 0x026e }
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r7.f22694b     // Catch:{ all -> 0x026e }
            java.lang.String r1 = r1.getAppDesc()     // Catch:{ all -> 0x026e }
            r8.setText(r1)     // Catch:{ all -> 0x026e }
        L_0x007d:
            android.widget.TextView r8 = r7.f22836w     // Catch:{ all -> 0x026e }
            if (r8 == 0) goto L_0x009d
            android.widget.TextView r8 = r7.f22836w     // Catch:{ all -> 0x026e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x026e }
            r1.<init>()     // Catch:{ all -> 0x026e }
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r7.f22694b     // Catch:{ all -> 0x026e }
            int r2 = r2.getNumberRating()     // Catch:{ all -> 0x026e }
            r1.append(r2)     // Catch:{ all -> 0x026e }
            java.lang.String r2 = ")"
            r1.append(r2)     // Catch:{ all -> 0x026e }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x026e }
            r8.setText(r1)     // Catch:{ all -> 0x026e }
        L_0x009d:
            android.widget.LinearLayout r8 = r7.f22837x     // Catch:{ all -> 0x026e }
            r8.removeAllViews()     // Catch:{ all -> 0x026e }
            com.mbridge.msdk.foundation.entity.CampaignEx r8 = r7.f22694b     // Catch:{ all -> 0x026e }
            double r1 = r8.getRating()     // Catch:{ all -> 0x026e }
            r3 = 0
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 > 0) goto L_0x00b0
            r1 = 4617315517961601024(0x4014000000000000, double:5.0)
        L_0x00b0:
            android.widget.LinearLayout r8 = r7.f22837x     // Catch:{ all -> 0x026e }
            boolean r8 = r8 instanceof com.mbridge.msdk.videocommon.view.StarLevelView     // Catch:{ all -> 0x026e }
            if (r8 == 0) goto L_0x00bd
            android.widget.LinearLayout r8 = r7.f22837x     // Catch:{ all -> 0x026e }
            com.mbridge.msdk.videocommon.view.StarLevelView r8 = (com.mbridge.msdk.videocommon.view.StarLevelView) r8     // Catch:{ all -> 0x026e }
            r8.initScore(r1)     // Catch:{ all -> 0x026e }
        L_0x00bd:
            android.widget.LinearLayout r8 = r7.f22837x     // Catch:{ all -> 0x026e }
            boolean r8 = r8 instanceof com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView     // Catch:{ all -> 0x026e }
            if (r8 == 0) goto L_0x00d0
            android.widget.LinearLayout r8 = r7.f22837x     // Catch:{ all -> 0x026e }
            com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView r8 = (com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView) r8     // Catch:{ all -> 0x026e }
            com.mbridge.msdk.foundation.entity.CampaignEx r3 = r7.f22694b     // Catch:{ all -> 0x026e }
            int r3 = r3.getNumberRating()     // Catch:{ all -> 0x026e }
            r8.setRatingAndUser(r1, r3)     // Catch:{ all -> 0x026e }
        L_0x00d0:
            com.mbridge.msdk.foundation.entity.CampaignEx r8 = r7.f22694b     // Catch:{ all -> 0x026e }
            java.lang.String r8 = r8.getendcard_url()     // Catch:{ all -> 0x026e }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x026e }
            r1 = 1
            if (r8 != 0) goto L_0x00ed
            com.mbridge.msdk.foundation.entity.CampaignEx r8 = r7.f22694b     // Catch:{ all -> 0x026e }
            java.lang.String r8 = r8.getendcard_url()     // Catch:{ all -> 0x026e }
            java.lang.String r2 = "alecfc=1"
            boolean r8 = r8.contains(r2)     // Catch:{ all -> 0x026e }
            if (r8 == 0) goto L_0x00ed
            r7.f22809B = r1     // Catch:{ all -> 0x026e }
        L_0x00ed:
            java.util.Locale r8 = java.util.Locale.getDefault()     // Catch:{ all -> 0x026e }
            java.lang.String r8 = r8.getLanguage()     // Catch:{ all -> 0x026e }
            boolean r2 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x026e }
            java.lang.String r3 = "drawable"
            if (r2 != 0) goto L_0x0125
            java.lang.String r2 = "zh"
            boolean r8 = r8.equals(r2)     // Catch:{ all -> 0x026e }
            if (r8 == 0) goto L_0x0125
            android.widget.ImageView r8 = r7.f22832s     // Catch:{ all -> 0x026e }
            android.content.res.Resources r2 = r7.getResources()     // Catch:{ all -> 0x026e }
            android.content.res.Resources r4 = r7.getResources()     // Catch:{ all -> 0x026e }
            java.lang.String r5 = "mbridge_reward_flag_cn"
            com.mbridge.msdk.foundation.controller.a r6 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ all -> 0x026e }
            java.lang.String r6 = r6.mo15783b()     // Catch:{ all -> 0x026e }
            int r3 = r4.getIdentifier(r5, r3, r6)     // Catch:{ all -> 0x026e }
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3)     // Catch:{ all -> 0x026e }
            r8.setImageDrawable(r2)     // Catch:{ all -> 0x026e }
            goto L_0x0144
        L_0x0125:
            android.widget.ImageView r8 = r7.f22832s     // Catch:{ all -> 0x026e }
            android.content.res.Resources r2 = r7.getResources()     // Catch:{ all -> 0x026e }
            android.content.res.Resources r4 = r7.getResources()     // Catch:{ all -> 0x026e }
            java.lang.String r5 = "mbridge_reward_flag_en"
            com.mbridge.msdk.foundation.controller.a r6 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ all -> 0x026e }
            java.lang.String r6 = r6.mo15783b()     // Catch:{ all -> 0x026e }
            int r3 = r4.getIdentifier(r5, r3, r6)     // Catch:{ all -> 0x026e }
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3)     // Catch:{ all -> 0x026e }
            r8.setImageDrawable(r2)     // Catch:{ all -> 0x026e }
        L_0x0144:
            com.mbridge.msdk.foundation.controller.a r8 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ all -> 0x026e }
            java.lang.String r8 = r8.mo15793h()     // Catch:{ all -> 0x026e }
            com.mbridge.msdk.c.b r2 = com.mbridge.msdk.p054c.C2283b.m5275a()     // Catch:{ all -> 0x026e }
            com.mbridge.msdk.c.a r8 = r2.mo15563b(r8)     // Catch:{ all -> 0x026e }
            r2 = 8
            if (r8 == 0) goto L_0x0172
            java.lang.String r8 = r8.mo15466ae()     // Catch:{ all -> 0x026e }
            boolean r3 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x026e }
            if (r3 == 0) goto L_0x0167
            android.widget.ImageView r3 = r7.f22833t     // Catch:{ all -> 0x026e }
            r3.setVisibility(r2)     // Catch:{ all -> 0x026e }
        L_0x0167:
            android.widget.ImageView r3 = r7.f22833t     // Catch:{ all -> 0x026e }
            com.mbridge.msdk.video.module.MBridgeNativeEndCardView$9 r4 = new com.mbridge.msdk.video.module.MBridgeNativeEndCardView$9     // Catch:{ all -> 0x026e }
            r4.<init>(r8)     // Catch:{ all -> 0x026e }
            r3.setOnClickListener(r4)     // Catch:{ all -> 0x026e }
            goto L_0x0177
        L_0x0172:
            android.widget.ImageView r8 = r7.f22833t     // Catch:{ all -> 0x026e }
            r8.setVisibility(r2)     // Catch:{ all -> 0x026e }
        L_0x0177:
            boolean r8 = r7.f22810C     // Catch:{ all -> 0x026e }
            if (r8 != 0) goto L_0x0180
            android.view.View r8 = r7.f22819L     // Catch:{ all -> 0x026e }
            r8.setVisibility(r2)     // Catch:{ all -> 0x026e }
        L_0x0180:
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x026e }
            r3 = 17
            if (r8 >= r3) goto L_0x0191
            android.widget.ImageView r8 = r7.f22829p     // Catch:{ all -> 0x026e }
            if (r8 == 0) goto L_0x0276
            android.widget.ImageView r8 = r7.f22829p     // Catch:{ all -> 0x026e }
            r8.setVisibility(r2)     // Catch:{ all -> 0x026e }
            goto L_0x0276
        L_0x0191:
            com.mbridge.msdk.foundation.entity.CampaignEx r8 = r7.f22694b     // Catch:{ all -> 0x0265 }
            if (r8 == 0) goto L_0x0276
            com.mbridge.msdk.foundation.entity.CampaignEx r8 = r7.f22694b     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = r8.getendcard_url()     // Catch:{ all -> 0x0265 }
            boolean r2 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0265 }
            if (r2 == 0) goto L_0x01a7
            com.mbridge.msdk.foundation.entity.CampaignEx r8 = r7.f22694b     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = r8.getEndScreenUrl()     // Catch:{ all -> 0x0265 }
        L_0x01a7:
            java.lang.String r2 = "shake_show"
            java.lang.String r2 = com.mbridge.msdk.foundation.tools.C8557ad.m24740a(r8, r2)     // Catch:{ all -> 0x0265 }
            java.lang.String r3 = "shake_strength"
            java.lang.String r3 = com.mbridge.msdk.foundation.tools.C8557ad.m24740a(r8, r3)     // Catch:{ all -> 0x0265 }
            java.lang.String r4 = "shake_time"
            java.lang.String r8 = com.mbridge.msdk.foundation.tools.C8557ad.m24740a(r8, r4)     // Catch:{ all -> 0x0265 }
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0265 }
            if (r4 != 0) goto L_0x0276
            java.lang.String r4 = "1"
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x0265 }
            if (r2 == 0) goto L_0x0276
            com.mbridge.msdk.shake.MBShakeView r2 = r7.f22824Q     // Catch:{ all -> 0x0265 }
            if (r2 == 0) goto L_0x01cd
            goto L_0x0276
        L_0x01cd:
            com.mbridge.msdk.shake.MBShakeView r2 = new com.mbridge.msdk.shake.MBShakeView     // Catch:{ all -> 0x0265 }
            android.content.Context r4 = r7.getContext()     // Catch:{ all -> 0x0265 }
            r2.<init>(r4)     // Catch:{ all -> 0x0265 }
            r7.f22824Q = r2     // Catch:{ all -> 0x0265 }
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r7.f22694b     // Catch:{ all -> 0x0265 }
            java.lang.String r4 = r4.getAdCall()     // Catch:{ all -> 0x0265 }
            r2.initView(r4, r1)     // Catch:{ all -> 0x0265 }
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ all -> 0x0265 }
            r2 = -2
            r1.<init>(r2, r2)     // Catch:{ all -> 0x0265 }
            boolean r2 = r7.isLandscape()     // Catch:{ all -> 0x0265 }
            if (r2 != 0) goto L_0x020d
            java.lang.String r2 = "mbridge_iv_logo"
            int r2 = r7.findID(r2)     // Catch:{ all -> 0x0265 }
            r4 = 2
            r1.addRule(r4, r2)     // Catch:{ all -> 0x0265 }
            r2 = 14
            r1.addRule(r2)     // Catch:{ all -> 0x0265 }
            com.mbridge.msdk.shake.MBShakeView r2 = r7.f22824Q     // Catch:{ all -> 0x0265 }
            android.content.Context r4 = r7.getContext()     // Catch:{ all -> 0x0265 }
            r5 = 1101004800(0x41a00000, float:20.0)
            int r4 = com.mbridge.msdk.foundation.tools.C8613y.m24929b((android.content.Context) r4, (float) r5)     // Catch:{ all -> 0x0265 }
            r5 = 0
            r2.setPadding(r5, r5, r5, r4)     // Catch:{ all -> 0x0265 }
            goto L_0x0212
        L_0x020d:
            r2 = 13
            r1.addRule(r2)     // Catch:{ all -> 0x0265 }
        L_0x0212:
            com.mbridge.msdk.shake.MBShakeView r2 = r7.f22824Q     // Catch:{ all -> 0x0265 }
            r2.setLayoutParams(r1)     // Catch:{ all -> 0x0265 }
            android.widget.RelativeLayout r1 = r7.f22828o     // Catch:{ all -> 0x0265 }
            if (r1 == 0) goto L_0x0276
            android.widget.RelativeLayout r1 = r7.f22828o     // Catch:{ all -> 0x0265 }
            com.mbridge.msdk.shake.MBShakeView r2 = r7.f22824Q     // Catch:{ all -> 0x0265 }
            r1.addView(r2)     // Catch:{ all -> 0x0265 }
            android.view.View r1 = r7.f22820M     // Catch:{ all -> 0x0265 }
            r2 = 4
            r1.setVisibility(r2)     // Catch:{ all -> 0x0265 }
            com.mbridge.msdk.shake.MBShakeView r1 = r7.f22824Q     // Catch:{ all -> 0x0265 }
            com.mbridge.msdk.video.module.MBridgeNativeEndCardView$4 r2 = new com.mbridge.msdk.video.module.MBridgeNativeEndCardView$4     // Catch:{ all -> 0x0265 }
            r2.<init>()     // Catch:{ all -> 0x0265 }
            r1.setOnClickListener(r2)     // Catch:{ all -> 0x0265 }
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0265 }
            r2 = 10
            if (r1 != 0) goto L_0x0242
            int r1 = java.lang.Integer.parseInt(r3)     // Catch:{ all -> 0x0265 }
            if (r1 > 0) goto L_0x0241
            goto L_0x0242
        L_0x0241:
            r2 = r1
        L_0x0242:
            boolean r1 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0265 }
            r3 = 5000(0x1388, float:7.006E-42)
            if (r1 != 0) goto L_0x0254
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ all -> 0x0265 }
            if (r8 > 0) goto L_0x0251
            goto L_0x0254
        L_0x0251:
            int r8 = r8 * 1000
            r3 = r8
        L_0x0254:
            com.mbridge.msdk.video.module.MBridgeNativeEndCardView$5 r8 = new com.mbridge.msdk.video.module.MBridgeNativeEndCardView$5     // Catch:{ all -> 0x0265 }
            r8.<init>(r2, r3)     // Catch:{ all -> 0x0265 }
            r7.f22825R = r8     // Catch:{ all -> 0x0265 }
            com.mbridge.msdk.shake.a r8 = com.mbridge.msdk.shake.C9127a.m26171a()     // Catch:{ all -> 0x0265 }
            com.mbridge.msdk.shake.b r1 = r7.f22825R     // Catch:{ all -> 0x0265 }
            r8.mo61026a(r1)     // Catch:{ all -> 0x0265 }
            goto L_0x0276
        L_0x0265:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch:{ all -> 0x026e }
            com.mbridge.msdk.foundation.tools.C8608u.m24884d(r0, r8)     // Catch:{ all -> 0x026e }
            goto L_0x0276
        L_0x026e:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()
            com.mbridge.msdk.foundation.tools.C8608u.m24880a(r0, r8)
        L_0x0276:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.preLoadData(com.mbridge.msdk.video.signal.factory.b):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m26807a() {
        mo62563c();
        if (!this.f22698f) {
            this.f22697e.mo62252a(104, "");
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
        this.f22814G = alphaAnimation;
        alphaAnimation.setDuration(200);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        if (this.f22694b == null || !this.f22694b.isDynamicView()) {
            this.f22839z.setVisibility(4);
            this.f22696d = configuration.orientation;
            if (this.f22696d == 2) {
                removeView(this.f22826m);
                m26808a((View) this.f22827n);
                return;
            }
            removeView(this.f22827n);
            m26808a((View) this.f22826m);
        }
    }

    public boolean canBackPress() {
        View view = this.f22819L;
        return view != null && view.getVisibility() == 0;
    }

    public void notifyShowListener() {
        this.f22697e.mo62252a(110, "");
    }

    /* renamed from: a */
    private void m26808a(View view) {
        if (view == null) {
            init(this.f22693a);
            preLoadData(this.f22808A);
        } else {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            addView(view);
            m26814b(view);
            mo62563c();
        }
        m26812b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo62563c() {
        if (this.f22698f) {
            this.f22828o.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    if (MBridgeNativeEndCardView.this.f22809B) {
                        MBridgeNativeEndCardView.m26809a(MBridgeNativeEndCardView.this, 1);
                    }
                }
            });
            this.f22819L.setOnClickListener(new View.OnClickListener() {
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x001c */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onClick(android.view.View r4) {
                    /*
                        r3 = this;
                        com.mbridge.msdk.video.module.MBridgeNativeEndCardView r4 = com.mbridge.msdk.video.module.MBridgeNativeEndCardView.this
                        boolean r4 = r4.f22701i
                        if (r4 == 0) goto L_0x002e
                        java.util.concurrent.ThreadPoolExecutor r4 = com.mbridge.msdk.foundation.same.p304f.C8442b.m24389b()     // Catch:{ Exception -> 0x001c }
                        com.mbridge.msdk.video.module.MBridgeNativeEndCardView$a r0 = new com.mbridge.msdk.video.module.MBridgeNativeEndCardView$a     // Catch:{ Exception -> 0x001c }
                        com.mbridge.msdk.video.module.MBridgeNativeEndCardView r1 = com.mbridge.msdk.video.module.MBridgeNativeEndCardView.this     // Catch:{ Exception -> 0x001c }
                        java.lang.String r1 = r1.f22822O     // Catch:{ Exception -> 0x001c }
                        com.mbridge.msdk.video.module.MBridgeNativeEndCardView r2 = com.mbridge.msdk.video.module.MBridgeNativeEndCardView.this     // Catch:{ Exception -> 0x001c }
                        com.mbridge.msdk.foundation.entity.CampaignEx r2 = r2.f22694b     // Catch:{ Exception -> 0x001c }
                        r0.<init>(r1, r2)     // Catch:{ Exception -> 0x001c }
                        r4.execute(r0)     // Catch:{ Exception -> 0x001c }
                    L_0x001c:
                        com.mbridge.msdk.video.dynview.moffer.a r4 = com.mbridge.msdk.video.dynview.moffer.C9320a.m26714a()     // Catch:{ Exception -> 0x0024 }
                        r4.mo62525b()     // Catch:{ Exception -> 0x0024 }
                        goto L_0x002e
                    L_0x0024:
                        r4 = move-exception
                        java.lang.String r4 = r4.getMessage()
                        java.lang.String r0 = "MBridgeBaseView"
                        com.mbridge.msdk.foundation.tools.C8608u.m24884d(r0, r4)
                    L_0x002e:
                        com.mbridge.msdk.video.module.MBridgeNativeEndCardView r4 = com.mbridge.msdk.video.module.MBridgeNativeEndCardView.this
                        com.mbridge.msdk.video.module.a.a r4 = r4.f22697e
                        r0 = 104(0x68, float:1.46E-43)
                        java.lang.String r1 = ""
                        r4.mo62252a(r0, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.C935411.onClick(android.view.View):void");
                }
            });
            this.f22820M.setOnClickListener(new C9587a() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo58122a(View view) {
                    MBridgeNativeEndCardView.m26809a(MBridgeNativeEndCardView.this, 0);
                }
            });
            this.f22831r.setOnClickListener(new C9587a() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo58122a(View view) {
                    MBridgeNativeEndCardView.m26809a(MBridgeNativeEndCardView.this, 0);
                }
            });
            this.f22830q.setOnClickListener(new C9587a() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo58122a(View view) {
                    MBridgeNativeEndCardView.m26809a(MBridgeNativeEndCardView.this, 0);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m26814b(View view) {
        try {
            this.f22828o = (RelativeLayout) view.findViewById(findID("mbridge_native_ec_layout"));
            this.f22830q = (ImageView) view.findViewById(findID("mbridge_iv_adbanner"));
            this.f22831r = (ImageView) view.findViewById(findID("mbridge_iv_icon"));
            this.f22832s = (ImageView) view.findViewById(findID("mbridge_iv_flag"));
            this.f22833t = (ImageView) view.findViewById(findID("mbridge_iv_link"));
            this.f22834u = (TextView) view.findViewById(findID("mbridge_tv_apptitle"));
            this.f22837x = (LinearLayout) view.findViewById(findID("mbridge_sv_starlevel"));
            this.f22819L = view.findViewById(findID("mbridge_iv_close"));
            this.f22820M = view.findViewById(findID("mbridge_tv_cta"));
            this.f22821N = (FeedBackButton) view.findViewById(findID("mbridge_native_endcard_feed_btn"));
            this.f22839z = (RelativeLayout) view.findViewById(findID("mbridge_native_ec_controller"));
            this.f22829p = (ImageView) view.findViewById(findID("mbridge_iv_adbanner_bg"));
            if (this.f22701i) {
                if (this.f22830q != null && (this.f22830q instanceof RoundImageView)) {
                    ((RoundImageView) this.f22830q).setBorderRadius(10);
                }
                if (this.f22831r != null && (this.f22831r instanceof RoundImageView)) {
                    ((RoundImageView) this.f22831r).setBorderRadius(10);
                }
                return isNotNULL(this.f22829p, this.f22830q, this.f22831r, this.f22834u, this.f22837x, this.f22819L, this.f22820M);
            }
            this.f22835v = (TextView) view.findViewById(findID("mbridge_tv_appdesc"));
            TextView textView = (TextView) view.findViewById(findID("mbridge_tv_number"));
            this.f22836w = textView;
            return isNotNULL(this.f22829p, this.f22830q, this.f22831r, this.f22834u, this.f22835v, textView, this.f22837x, this.f22819L, this.f22820M);
        } catch (Throwable th) {
            C8608u.m24881a(MBridgeBaseView.TAG, th.getMessage(), th);
            return false;
        }
    }

    public Bitmap blurBitmap(Bitmap bitmap) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
            RenderScript create = RenderScript.create(this.f22693a.getApplicationContext());
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(25.0f);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            create.destroy();
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public void setNotchPadding(int i, int i2, int i3, int i4) {
        C8608u.m24884d(MBridgeBaseView.TAG, "NOTCH NativeEndCard " + String.format("%1s-%2s-%3s-%4s", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}));
        this.f22815H = i;
        this.f22816I = i2;
        this.f22817J = i3;
        this.f22818K = i4;
        m26812b();
    }

    /* renamed from: b */
    private void m26812b() {
        this.f22839z.postDelayed(new Runnable() {
            public final void run() {
                if (!(MBridgeNativeEndCardView.this.f22694b == null || MBridgeNativeEndCardView.this.f22694b.isDynamicView() || MBridgeNativeEndCardView.this.f22694b.getAdSpaceT() == 2)) {
                    MBridgeNativeEndCardView.this.f22839z.setPadding(MBridgeNativeEndCardView.this.f22815H, MBridgeNativeEndCardView.this.f22817J, MBridgeNativeEndCardView.this.f22816I, MBridgeNativeEndCardView.this.f22818K);
                    MBridgeNativeEndCardView.this.f22839z.startAnimation(MBridgeNativeEndCardView.this.f22814G);
                }
                MBridgeNativeEndCardView.this.f22839z.setVisibility(0);
                if (MBridgeNativeEndCardView.this.f22819L.getVisibility() != 0 && MBridgeNativeEndCardView.this.f22810C) {
                    MBridgeNativeEndCardView.this.f22819L.setVisibility(0);
                }
                MBridgeNativeEndCardView.m26827n(MBridgeNativeEndCardView.this);
            }
        }, 200);
    }

    public void setMoreOfferCampaignUnit(CampaignUnit campaignUnit) {
        MBShakeView mBShakeView;
        if (this.f22694b != null && this.f22694b.isDynamicView()) {
            this.f22823P = campaignUnit;
            if (campaignUnit != null && campaignUnit.getAds() != null && this.f22823P.getAds().size() > 5 && (mBShakeView = this.f22824Q) != null) {
                mBShakeView.setPadding(0, 0, 0, C8613y.m24929b(getContext(), 5.0f));
            }
        }
    }

    public void clearMoreOfferBitmap() {
        CampaignUnit campaignUnit;
        if (this.f22694b != null && this.f22694b.isDynamicView() && (campaignUnit = this.f22823P) != null && campaignUnit.getAds() != null && this.f22823P.getAds().size() > 0) {
            Iterator<CampaignEx> it = this.f22823P.getAds().iterator();
            while (it.hasNext()) {
                CampaignEx next = it.next();
                if (!TextUtils.isEmpty(next.getIconUrl())) {
                    C8425b.m24339a(C2350a.m5601e().mo15792g()).mo57509c(next.getIconUrl());
                }
            }
        }
    }

    /* renamed from: com.mbridge.msdk.video.module.MBridgeNativeEndCardView$a */
    private static class C9366a implements Runnable {

        /* renamed from: a */
        private final String f22855a;

        /* renamed from: b */
        private final CampaignEx f22856b;

        public C9366a(String str, CampaignEx campaignEx) {
            this.f22855a = str;
            this.f22856b = campaignEx;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
            r1 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
            r9 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x004b, code lost:
            r1 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x004c, code lost:
            r9 = r0;
            r6 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0073, code lost:
            r1 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0074, code lost:
            r6 = null;
            r9 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x0077, code lost:
            r1 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x0078, code lost:
            r6 = null;
            r8 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x007b, code lost:
            r1 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x007c, code lost:
            r6 = null;
            r7 = null;
            r8 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x007f, code lost:
            r9 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x0080, code lost:
            r3 = r4;
            r4 = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0083, code lost:
            r1 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0084, code lost:
            r4 = null;
            r6 = null;
            r7 = null;
            r8 = null;
            r9 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x008d, code lost:
            r3 = "";
            r7 = "";
            r8 = "";
            r9 = "";
            r4 = "";
            r6 = "";
            r5 = "";
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:53:? A[ExcHandler: Exception (unused java.lang.Exception), SYNTHETIC, Splitter:B:9:0x001c] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r11 = this;
                java.lang.String r0 = ""
                java.lang.String r1 = r11.f22855a
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 != 0) goto L_0x009c
                com.mbridge.msdk.foundation.entity.CampaignEx r1 = r11.f22856b
                if (r1 == 0) goto L_0x009c
                java.lang.String r2 = r11.f22855a     // Catch:{ Exception -> 0x009c }
                boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x009c }
                if (r3 != 0) goto L_0x009c
                if (r1 != 0) goto L_0x001a
                goto L_0x009c
            L_0x001a:
                r5 = 0
                r3 = 0
                java.lang.String r4 = r1.getRequestId()     // Catch:{ Exception -> 0x008d, all -> 0x0083 }
                java.lang.String r7 = r1.getId()     // Catch:{ Exception -> 0x008d, all -> 0x007b }
                java.lang.String r8 = r1.getRequestIdNotice()     // Catch:{ Exception -> 0x008d, all -> 0x0077 }
                com.mbridge.msdk.foundation.entity.CampaignEx$c r6 = r1.getRewardTemplateMode()     // Catch:{ Exception -> 0x008d, all -> 0x0073 }
                if (r6 == 0) goto L_0x004f
                java.lang.String r9 = r6.mo57205e()     // Catch:{ Exception -> 0x008d, all -> 0x004b }
                int r6 = r6.mo57202b()     // Catch:{ Exception -> 0x008d, all -> 0x004b }
                java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x008d, all -> 0x004b }
                boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x008d, all -> 0x0048 }
                if (r10 != 0) goto L_0x0046
                java.lang.String r10 = "alecfc"
                java.lang.String r0 = com.mbridge.msdk.foundation.tools.C8557ad.m24740a(r9, r10)     // Catch:{ Exception -> 0x008d, all -> 0x0048 }
            L_0x0046:
                r9 = r6
                goto L_0x0050
            L_0x0048:
                r1 = move-exception
                r9 = r6
                goto L_0x006f
            L_0x004b:
                r1 = move-exception
                r9 = r0
                r6 = r3
                goto L_0x0080
            L_0x004f:
                r9 = r0
            L_0x0050:
                java.lang.String r1 = r1.getendcard_url()     // Catch:{ Exception -> 0x008d, all -> 0x006e }
                boolean r6 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x008d, all -> 0x006e }
                if (r6 != 0) goto L_0x0067
                java.lang.String r6 = "ec_id"
                java.lang.String r3 = com.mbridge.msdk.foundation.tools.C8557ad.m24740a(r1, r6)     // Catch:{ Exception -> 0x008d, all -> 0x006e }
                java.lang.String r6 = "mof"
                java.lang.String r1 = com.mbridge.msdk.foundation.tools.C8557ad.m24740a(r1, r6)     // Catch:{ Exception -> 0x008d, all -> 0x006e }
                r5 = r1
            L_0x0067:
                r6 = r3
                r3 = r4
                r4 = r0
            L_0x006a:
                com.mbridge.msdk.video.module.p367b.C9408a.m26939a((java.lang.String) r2, (java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ Exception -> 0x009c }
                goto L_0x009c
            L_0x006e:
                r1 = move-exception
            L_0x006f:
                r6 = r3
                r3 = r4
                r4 = r0
                goto L_0x0089
            L_0x0073:
                r1 = move-exception
                r6 = r3
                r9 = r6
                goto L_0x0080
            L_0x0077:
                r1 = move-exception
                r6 = r3
                r8 = r6
                goto L_0x007f
            L_0x007b:
                r1 = move-exception
                r6 = r3
                r7 = r6
                r8 = r7
            L_0x007f:
                r9 = r8
            L_0x0080:
                r3 = r4
                r4 = r9
                goto L_0x0089
            L_0x0083:
                r1 = move-exception
                r4 = r3
                r6 = r4
                r7 = r6
                r8 = r7
                r9 = r8
            L_0x0089:
                com.mbridge.msdk.video.module.p367b.C9408a.m26939a((java.lang.String) r2, (java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ Exception -> 0x009c }
                throw r1     // Catch:{ Exception -> 0x009c }
            L_0x008d:
                java.lang.String r3 = ""
                java.lang.String r7 = ""
                java.lang.String r8 = ""
                java.lang.String r9 = ""
                java.lang.String r4 = ""
                java.lang.String r6 = ""
                java.lang.String r5 = ""
                goto L_0x006a
            L_0x009c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.C9366a.run():void");
        }
    }

    public void setOnResume() {
        this.f22811D = true;
    }

    public void setOnPause() {
        this.f22811D = false;
    }

    /* renamed from: a */
    static /* synthetic */ void m26809a(MBridgeNativeEndCardView mBridgeNativeEndCardView, int i) {
        JSONObject jSONObject;
        if (mBridgeNativeEndCardView.f22694b != null && mBridgeNativeEndCardView.f22694b.isDynamicView()) {
            try {
                CampaignEx.C8398c rewardTemplateMode = mBridgeNativeEndCardView.f22694b.getRewardTemplateMode();
                String str = "";
                if (rewardTemplateMode != null) {
                    str = rewardTemplateMode.mo57202b() + str;
                }
                C8542e.m24704a(mBridgeNativeEndCardView.f22693a, "end_card_click", mBridgeNativeEndCardView.f22694b.getCampaignUnitId(), mBridgeNativeEndCardView.f22694b.isBidCampaign(), mBridgeNativeEndCardView.f22694b.getRequestId(), mBridgeNativeEndCardView.f22694b.getRequestIdNotice(), mBridgeNativeEndCardView.f22694b.getId(), str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(C8413a.f20325g, mBridgeNativeEndCardView.mo62562a(i));
            } catch (JSONException e2) {
                e = e2;
                jSONObject2 = jSONObject;
            }
        } catch (JSONException e3) {
            e = e3;
            e.printStackTrace();
            jSONObject = jSONObject2;
            mBridgeNativeEndCardView.f22697e.mo62252a(105, jSONObject);
        }
        mBridgeNativeEndCardView.f22697e.mo62252a(105, jSONObject);
    }

    /* renamed from: n */
    static /* synthetic */ void m26827n(MBridgeNativeEndCardView mBridgeNativeEndCardView) {
        if (C2347b.m5579a().mo15773b()) {
            mBridgeNativeEndCardView.f22694b.setCampaignUnitId(mBridgeNativeEndCardView.f22822O);
            C2347b a = C2347b.m5579a();
            a.mo15767a(mBridgeNativeEndCardView.f22822O + "_" + 2, (C2339a) new C2339a() {
                /* renamed from: a */
                public final void mo15737a() {
                    boolean unused = MBridgeNativeEndCardView.this.f22812E = true;
                }

                /* renamed from: b */
                public final void mo15739b() {
                    boolean unused = MBridgeNativeEndCardView.this.f22812E = false;
                }

                /* renamed from: a */
                public final void mo15738a(String str) {
                    boolean unused = MBridgeNativeEndCardView.this.f22812E = false;
                }
            });
            C2347b a2 = C2347b.m5579a();
            a2.mo15768a(mBridgeNativeEndCardView.f22822O + "_" + 2, mBridgeNativeEndCardView.f22694b);
            C2347b a3 = C2347b.m5579a();
            a3.mo15774c(mBridgeNativeEndCardView.f22822O + "_" + 1);
            C2347b a4 = C2347b.m5579a();
            a4.mo15769a(mBridgeNativeEndCardView.f22822O + "_" + 2, mBridgeNativeEndCardView.f22821N);
            return;
        }
        FeedBackButton feedBackButton = mBridgeNativeEndCardView.f22821N;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(8);
        }
    }
}
