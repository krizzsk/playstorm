package com.mbridge.msdk.video.dynview.p364j;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.p301c.C8425b;
import com.mbridge.msdk.foundation.same.p301c.C8428c;
import com.mbridge.msdk.foundation.same.p304f.C8442b;
import com.mbridge.msdk.foundation.tools.C8594o;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.video.dynview.C9252c;
import com.mbridge.msdk.video.dynview.p352c.C9256a;
import com.mbridge.msdk.video.dynview.p353d.C9257a;
import com.mbridge.msdk.video.dynview.p353d.C9258b;
import com.mbridge.msdk.video.dynview.p358g.C9282a;
import com.mbridge.msdk.video.dynview.p359h.C9288b;
import com.mbridge.msdk.video.dynview.p360i.C9295a;
import com.mbridge.msdk.video.dynview.p360i.p361a.C9296a;
import com.mbridge.msdk.video.dynview.p360i.p363c.C9300b;
import com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView;
import com.mbridge.msdk.video.module.p367b.C9408a;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.mbridge.msdk.video.dynview.j.a */
/* compiled from: DataEnergizeWrapper */
public final class C9302a {

    /* renamed from: a */
    private C9300b f22541a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Map<String, Bitmap> f22542b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public volatile boolean f22543c;

    /* renamed from: d */
    private String f22544d = "#FFFFFFFF";

    /* renamed from: e */
    private String f22545e = "#60000000";
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f22546f = "#FF5F5F5F";

    /* renamed from: g */
    private String f22547g = "#90ECECEC";
    /* access modifiers changed from: private */

    /* renamed from: h */
    public volatile long f22548h = 0;

    /* JADX WARNING: Removed duplicated region for block: B:40:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x031d  */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62503a(com.mbridge.msdk.video.dynview.C9252c r30, android.view.View r31, java.util.Map r32, com.mbridge.msdk.video.dynview.p353d.C9258b r33) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r32
            r4 = r33
            java.util.Map<java.lang.String, android.graphics.Bitmap> r5 = r0.f22542b
            if (r5 != 0) goto L_0x0015
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r0.f22542b = r5
        L_0x0015:
            java.util.List r5 = r30.mo62370g()
            android.content.Context r6 = r31.getContext()
            if (r6 != 0) goto L_0x0025
            com.mbridge.msdk.video.dynview.c.a r1 = com.mbridge.msdk.video.dynview.p352c.C9256a.NOT_FOUND_CONTEXT
            r4.mo62389a(r1)
            return
        L_0x0025:
            r8 = 1
            r9 = 0
            if (r5 == 0) goto L_0x003c
            int r10 = r5.size()
            if (r10 <= r8) goto L_0x003c
            java.lang.Object r10 = r5.get(r9)
            com.mbridge.msdk.foundation.entity.CampaignEx r10 = (com.mbridge.msdk.foundation.entity.CampaignEx) r10
            java.lang.Object r11 = r5.get(r8)
            com.mbridge.msdk.foundation.entity.CampaignEx r11 = (com.mbridge.msdk.foundation.entity.CampaignEx) r11
            goto L_0x003e
        L_0x003c:
            r10 = 0
            r11 = 0
        L_0x003e:
            if (r10 != 0) goto L_0x0048
            if (r4 == 0) goto L_0x0048
            com.mbridge.msdk.video.dynview.c.a r1 = com.mbridge.msdk.video.dynview.p352c.C9256a.CAMPAIGNEX_IS_NULL
            r4.mo62389a(r1)
            return
        L_0x0048:
            if (r11 != 0) goto L_0x0052
            if (r4 == 0) goto L_0x0052
            com.mbridge.msdk.video.dynview.c.a r1 = com.mbridge.msdk.video.dynview.p352c.C9256a.CAMPAIGNEX_IS_NULL
            r4.mo62389a(r1)
            return
        L_0x0052:
            java.lang.String r12 = "mbridge_top_item_rl"
            int r12 = r0.m26674a((java.lang.String) r12)
            android.view.View r12 = r2.findViewById(r12)
            android.widget.RelativeLayout r12 = (android.widget.RelativeLayout) r12
            if (r12 == 0) goto L_0x0068
            com.mbridge.msdk.video.dynview.j.a$1 r13 = new com.mbridge.msdk.video.dynview.j.a$1
            r13.<init>(r3, r5)
            r12.setOnClickListener(r13)
        L_0x0068:
            java.lang.String r12 = "mbridge_top_iv"
            int r12 = r0.m26674a((java.lang.String) r12)
            android.view.View r12 = r2.findViewById(r12)
            com.mbridge.msdk.video.dynview.widget.MBridgeImageView r12 = (com.mbridge.msdk.video.dynview.widget.MBridgeImageView) r12
            r15 = 1063675494(0x3f666666, float:0.9)
            r14 = 1055286886(0x3ee66666, float:0.45)
            r13 = 1128792064(0x43480000, float:200.0)
            r7 = -1
            if (r12 == 0) goto L_0x011c
            r16 = 20
            r17 = 20
            r18 = 0
            r19 = 0
            r20 = 10
            r21 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r9 = r13
            r13 = r12
            r8 = r14
            r14 = r16
            r15 = r17
            r16 = r18
            r17 = r19
            r18 = r20
            r19 = r21
            r13.setCustomBorder(r14, r15, r16, r17, r18, r19)
            java.lang.String r13 = r10.getImageUrl()
            r0.m26683a((java.lang.String) r13, (android.widget.ImageView) r12, (com.mbridge.msdk.video.dynview.C9252c) r1, (android.view.View) r2)
            java.lang.String r12 = "mbridge_top_ration"
            int r12 = r0.m26674a((java.lang.String) r12)
            android.view.View r12 = r2.findViewById(r12)
            com.mbridge.msdk.video.dynview.widget.MBRotationView r12 = (com.mbridge.msdk.video.dynview.widget.MBRotationView) r12
            if (r12 == 0) goto L_0x0118
            boolean r13 = r10.getCanStart2C1Anim()
            if (r13 == 0) goto L_0x0108
            java.lang.String r13 = r10.getIconUrl()
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 != 0) goto L_0x00f8
            android.widget.ImageView r13 = new android.widget.ImageView
            android.content.Context r14 = r30.mo62364a()
            r13.<init>(r14)
            android.widget.FrameLayout$LayoutParams r14 = new android.widget.FrameLayout$LayoutParams
            android.content.Context r15 = r30.mo62364a()
            int r15 = com.mbridge.msdk.foundation.tools.C8613y.m24929b((android.content.Context) r15, (float) r9)
            r14.<init>(r7, r15)
            r13.setLayoutParams(r14)
            android.widget.ImageView$ScaleType r14 = android.widget.ImageView.ScaleType.CENTER_CROP
            r13.setScaleType(r14)
            r12.addView(r13)
            java.lang.String r14 = r10.getIconUrl()
            r0.m26682a((java.lang.String) r14, (android.widget.ImageView) r13)
            r12.setWidthRatio(r8)
            r13 = 1063675494(0x3f666666, float:0.9)
            r12.setHeightRatio(r13)
            r14 = 1
            r12.setAutoscroll(r14)
            goto L_0x011f
        L_0x00f8:
            r13 = 1063675494(0x3f666666, float:0.9)
            r14 = 1065353216(0x3f800000, float:1.0)
            r12.setWidthRatio(r14)
            r12.setHeightRatio(r14)
            r15 = 0
            r12.setAutoscroll(r15)
            goto L_0x0120
        L_0x0108:
            r13 = 1063675494(0x3f666666, float:0.9)
            r14 = 1065353216(0x3f800000, float:1.0)
            r15 = 0
            r12.setWidthRatio(r14)
            r12.setHeightRatio(r14)
            r12.setAutoscroll(r15)
            goto L_0x0120
        L_0x0118:
            r13 = 1063675494(0x3f666666, float:0.9)
            goto L_0x011f
        L_0x011c:
            r9 = r13
            r8 = r14
            r13 = r15
        L_0x011f:
            r15 = 0
        L_0x0120:
            java.lang.String r12 = "mbridge_top_icon_iv"
            int r12 = r0.m26674a((java.lang.String) r12)
            android.view.View r12 = r2.findViewById(r12)
            com.mbridge.msdk.videocommon.view.RoundImageView r12 = (com.mbridge.msdk.videocommon.view.RoundImageView) r12
            if (r12 == 0) goto L_0x0138
            r12.setType(r15)
            java.lang.String r14 = r10.getIconUrl()
            r0.m26682a((java.lang.String) r14, (android.widget.ImageView) r12)
        L_0x0138:
            java.lang.String r12 = "mbridge_top_title_tv"
            int r12 = r0.m26674a((java.lang.String) r12)
            android.view.View r12 = r2.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            if (r12 == 0) goto L_0x015d
            java.lang.String r14 = r10.getAppName()
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 != 0) goto L_0x0158
            java.lang.String r14 = r10.getAppName()
            r12.setText(r14)
            goto L_0x015d
        L_0x0158:
            r14 = 8
            r12.setVisibility(r14)
        L_0x015d:
            java.lang.String r12 = "mbridge_bottom_item_rl"
            int r12 = r0.m26674a((java.lang.String) r12)
            android.view.View r12 = r2.findViewById(r12)
            android.widget.RelativeLayout r12 = (android.widget.RelativeLayout) r12
            if (r12 == 0) goto L_0x0173
            com.mbridge.msdk.video.dynview.j.a$2 r14 = new com.mbridge.msdk.video.dynview.j.a$2
            r14.<init>(r3, r5)
            r12.setOnClickListener(r14)
        L_0x0173:
            java.lang.String r5 = "mbridge_bottom_iv"
            int r5 = r0.m26674a((java.lang.String) r5)
            android.view.View r5 = r2.findViewById(r5)
            com.mbridge.msdk.video.dynview.widget.MBridgeImageView r5 = (com.mbridge.msdk.video.dynview.widget.MBridgeImageView) r5
            if (r5 == 0) goto L_0x0204
            r23 = 20
            r24 = 20
            r25 = 0
            r26 = 0
            r27 = 10
            r28 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r22 = r5
            r22.setCustomBorder(r23, r24, r25, r26, r27, r28)
            java.lang.String r12 = r11.getImageUrl()
            r0.m26683a((java.lang.String) r12, (android.widget.ImageView) r5, (com.mbridge.msdk.video.dynview.C9252c) r1, (android.view.View) r2)
            java.lang.String r5 = "mbridge_bottom_ration"
            int r5 = r0.m26674a((java.lang.String) r5)
            android.view.View r5 = r2.findViewById(r5)
            com.mbridge.msdk.video.dynview.widget.MBRotationView r5 = (com.mbridge.msdk.video.dynview.widget.MBRotationView) r5
            if (r5 == 0) goto L_0x0204
            boolean r12 = r11.getCanStart2C1Anim()
            if (r12 == 0) goto L_0x01f7
            java.lang.String r12 = r11.getIconUrl()
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x01ea
            android.widget.ImageView r12 = new android.widget.ImageView
            android.content.Context r14 = r30.mo62364a()
            r12.<init>(r14)
            android.widget.FrameLayout$LayoutParams r14 = new android.widget.FrameLayout$LayoutParams
            android.content.Context r15 = r30.mo62364a()
            int r9 = com.mbridge.msdk.foundation.tools.C8613y.m24929b((android.content.Context) r15, (float) r9)
            r14.<init>(r7, r9)
            r12.setLayoutParams(r14)
            android.widget.ImageView$ScaleType r7 = android.widget.ImageView.ScaleType.CENTER_CROP
            r12.setScaleType(r7)
            r5.addView(r12)
            java.lang.String r7 = r11.getIconUrl()
            r0.m26682a((java.lang.String) r7, (android.widget.ImageView) r12)
            r5.setWidthRatio(r8)
            r5.setHeightRatio(r13)
            r7 = 1
            r5.setAutoscroll(r7)
            goto L_0x0204
        L_0x01ea:
            r7 = 1065353216(0x3f800000, float:1.0)
            r5.setWidthRatio(r7)
            r5.setHeightRatio(r7)
            r8 = 0
            r5.setAutoscroll(r8)
            goto L_0x0205
        L_0x01f7:
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            r5.setWidthRatio(r7)
            r5.setHeightRatio(r7)
            r5.setAutoscroll(r8)
            goto L_0x0205
        L_0x0204:
            r8 = 0
        L_0x0205:
            java.lang.String r5 = "mbridge_bottom_icon_iv"
            int r5 = r0.m26674a((java.lang.String) r5)
            android.view.View r5 = r2.findViewById(r5)
            com.mbridge.msdk.videocommon.view.RoundImageView r5 = (com.mbridge.msdk.videocommon.view.RoundImageView) r5
            if (r5 == 0) goto L_0x021d
            r5.setType(r8)
            java.lang.String r7 = r11.getIconUrl()
            r0.m26682a((java.lang.String) r7, (android.widget.ImageView) r5)
        L_0x021d:
            java.lang.String r5 = "mbridge_bottom_title_tv"
            int r5 = r0.m26674a((java.lang.String) r5)
            android.view.View r5 = r2.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x0232
            java.lang.String r7 = r11.getAppName()
            r5.setText(r7)
        L_0x0232:
            java.lang.String r5 = r10.getCMPTEntryUrl()
            int r7 = r30.mo62368e()
            java.lang.String r8 = "cltp"
            java.lang.String r5 = com.mbridge.msdk.foundation.tools.C8557ad.m24740a(r5, r8)
            boolean r8 = android.text.TextUtils.isEmpty(r5)
            r9 = 0
            if (r8 != 0) goto L_0x024d
            long r11 = java.lang.Long.parseLong(r5)
            goto L_0x024e
        L_0x024d:
            r11 = r9
        L_0x024e:
            int r5 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            r8 = 2
            if (r5 == 0) goto L_0x02e3
            java.lang.String r5 = "mbridge_choice_one_countdown_tv"
            int r5 = r0.m26674a((java.lang.String) r5)
            android.view.View r5 = r2.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r9 = 1093664768(0x41300000, float:11.0)
            r5.setTextSize(r9)
            java.lang.String r9 = r0.f22544d
            int r9 = android.graphics.Color.parseColor(r9)
            r5.setTextColor(r9)
            r9 = 12
            java.lang.String r10 = r0.f22545e
            if (r5 == 0) goto L_0x02a0
            android.graphics.drawable.GradientDrawable r13 = new android.graphics.drawable.GradientDrawable
            r13.<init>()
            int r14 = android.graphics.Color.parseColor(r10)
            r13.setColor(r14)
            android.content.Context r14 = r5.getContext()
            float r9 = (float) r9
            int r9 = com.mbridge.msdk.foundation.tools.C8613y.m24929b((android.content.Context) r14, (float) r9)
            float r9 = (float) r9
            r13.setCornerRadius(r9)
            android.content.Context r9 = r5.getContext()
            r14 = 1
            float r15 = (float) r14
            int r9 = com.mbridge.msdk.foundation.tools.C8613y.m24929b((android.content.Context) r9, (float) r15)
            int r10 = android.graphics.Color.parseColor(r10)
            r13.setStroke(r9, r10)
            r5.setBackground(r13)
        L_0x02a0:
            if (r7 != r8) goto L_0x02b7
            android.view.ViewGroup$LayoutParams r7 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r7 = (android.widget.FrameLayout.LayoutParams) r7
            if (r7 == 0) goto L_0x02b7
            int r9 = com.mbridge.msdk.foundation.tools.C8613y.m24944e((android.content.Context) r6)
            r10 = 1092616192(0x41200000, float:10.0)
            int r10 = com.mbridge.msdk.foundation.tools.C8613y.m24929b((android.content.Context) r6, (float) r10)
            r7.setMargins(r10, r10, r9, r10)
        L_0x02b7:
            if (r5 == 0) goto L_0x02e3
            r7 = 0
            r5.setVisibility(r7)
            com.mbridge.msdk.video.dynview.j.a$3 r7 = new com.mbridge.msdk.video.dynview.j.a$3
            r7.<init>(r3)
            r5.setOnClickListener(r7)
            com.mbridge.msdk.video.dynview.i.c.b r7 = new com.mbridge.msdk.video.dynview.i.c.b
            r7.<init>()
            r9 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 * r9
            com.mbridge.msdk.video.dynview.i.c.b r7 = r7.mo62497b(r11)
            com.mbridge.msdk.video.dynview.i.c.b r7 = r7.mo62494a((long) r9)
            com.mbridge.msdk.video.dynview.j.a$4 r9 = new com.mbridge.msdk.video.dynview.j.a$4
            r9.<init>(r5, r3)
            com.mbridge.msdk.video.dynview.i.c.b r3 = r7.mo62495a((com.mbridge.msdk.video.dynview.p360i.p363c.C9299a) r9)
            r0.f22541a = r3
            r3.mo62496a()
        L_0x02e3:
            java.lang.String r3 = "mbridge_reward_choice_one_like_iv"
            int r3 = r0.m26674a((java.lang.String) r3)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            if (r1 == 0) goto L_0x031b
            if (r3 == 0) goto L_0x031b
            int r1 = r30.mo62368e()
            java.lang.String r5 = "drawable"
            r7 = 1
            if (r1 != r7) goto L_0x030c
            java.lang.String r1 = com.mbridge.msdk.video.dynview.p360i.C9297b.m26662a(r6, r7)
            android.content.Context r6 = r6.getApplicationContext()
            int r1 = com.mbridge.msdk.foundation.tools.C8594o.m24812a(r6, r1, r5)
            r3.setImageResource(r1)
            goto L_0x031b
        L_0x030c:
            java.lang.String r1 = com.mbridge.msdk.video.dynview.p360i.C9297b.m26662a(r6, r8)
            android.content.Context r6 = r6.getApplicationContext()
            int r1 = com.mbridge.msdk.foundation.tools.C8594o.m24812a(r6, r1, r5)
            r3.setImageResource(r1)
        L_0x031b:
            if (r4 == 0) goto L_0x0321
            r1 = 0
            r4.mo62388a(r2, r1)
        L_0x0321:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.dynview.p364j.C9302a.mo62503a(com.mbridge.msdk.video.dynview.c, android.view.View, java.util.Map, com.mbridge.msdk.video.dynview.d.b):void");
    }

    /* renamed from: b */
    public final void mo62504b(C9252c cVar, View view, Map map, C9258b bVar) {
        if (bVar != null) {
            if (cVar == null) {
                bVar.mo62389a(C9256a.NOT_FOUND_VIEWOPTION);
                return;
            }
            ArrayList arrayList = new ArrayList();
            List<CampaignEx> g = cVar.mo62370g();
            if (g == null || g.size() <= 0) {
                bVar.mo62389a(C9256a.CAMPAIGNEX_IS_NULL);
                return;
            }
            CampaignEx campaignEx = g.get(0);
            if (campaignEx != null) {
                RoundImageView roundImageView = (RoundImageView) view.findViewById(m26674a("mbridge_reward_icon_riv"));
                if (roundImageView != null) {
                    roundImageView.setBorderRadius(10);
                    m26682a(campaignEx.getIconUrl(), (ImageView) roundImageView);
                }
                TextView textView = (TextView) view.findViewById(m26674a("mbridge_reward_title_tv"));
                if (textView != null) {
                    textView.setText(campaignEx.getAppName());
                }
                TextView textView2 = (TextView) view.findViewById(m26674a("mbridge_reward_desc_tv"));
                if (textView2 != null) {
                    textView2.setText(campaignEx.getAppDesc());
                }
                MBridgeLevelLayoutView mBridgeLevelLayoutView = (MBridgeLevelLayoutView) view.findViewById(m26674a("mbridge_reward_stars_mllv"));
                if (mBridgeLevelLayoutView != null) {
                    double rating = campaignEx.getRating();
                    if (rating <= 0.0d) {
                        rating = 5.0d;
                    }
                    mBridgeLevelLayoutView.setRatingAndUser(rating, campaignEx.getNumberRating());
                }
                TextView textView3 = (TextView) view.findViewById(m26674a("mbridge_reward_click_tv"));
                if (textView3 != null) {
                    textView3.setText(campaignEx.getAdCall());
                }
                int h = cVar.mo62371h();
                if (h == 102 || h == 202 || h == 302) {
                    if (textView3 != null) {
                        arrayList.add(textView3);
                    }
                } else if (h == 802) {
                    if (roundImageView != null) {
                        arrayList.add(roundImageView);
                    }
                    if (textView3 != null) {
                        arrayList.add(textView3);
                    }
                    m26677a((ImageView) view.findViewById(m26674a("mbridge_videoview_bg")), campaignEx.getImageUrl(), h);
                } else if (h == 904 && cVar.mo62373j()) {
                    arrayList.add(view);
                }
                bVar.mo62388a(view, arrayList);
                return;
            }
            bVar.mo62389a(C9256a.CAMPAIGNEX_IS_NULL);
        }
    }

    /* renamed from: a */
    public final void mo62502a(C9252c cVar, View view, C9258b bVar) {
        if (bVar != null) {
            if (cVar == null) {
                bVar.mo62389a(C9256a.NOT_FOUND_VIEWOPTION);
                return;
            }
            try {
                ImageView imageView = (ImageView) view.findViewById(m26674a("mbridge_iv_adbanner_bg"));
                if (imageView != null) {
                    imageView.setBackgroundColor(Color.parseColor(this.f22547g));
                }
                ImageView imageView2 = (ImageView) view.findViewById(m26674a("mbridge_iv_adbanner"));
                if (imageView2 != null) {
                    imageView2.setBackgroundColor(Color.parseColor(this.f22547g));
                }
                bVar.mo62388a(view, new ArrayList());
            } catch (Exception e) {
                C8608u.m24880a("DataEnergizeWrapper", e.getMessage());
                bVar.mo62389a(C9256a.NOT_FOUND_VIEWOPTION);
            }
        }
    }

    /* renamed from: a */
    private void m26682a(String str, ImageView imageView) {
        if (!TextUtils.isEmpty(str) && imageView != null) {
            m26677a(imageView, str, -1);
        }
    }

    /* renamed from: a */
    private void m26677a(final ImageView imageView, String str, final int i) {
        if (!TextUtils.isEmpty(str) && imageView != null) {
            C8425b.m24339a(imageView.getContext()).mo57506a(str, (C8428c) new C8428c() {
                public final void onSuccessLoad(Bitmap bitmap, String str) {
                    if (bitmap == null || bitmap.isRecycled()) {
                        int a = C8594o.m24812a(imageView.getContext(), "mbridge_icon_play_bg", "drawable");
                        imageView.setBackgroundColor(Color.parseColor(C9302a.this.f22546f));
                        imageView.setImageResource(a);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                    } else if (i != 802) {
                        imageView.setImageBitmap(bitmap);
                    } else {
                        imageView.setImageBitmap(C9295a.m26655a().mo62489a(bitmap, 0));
                    }
                }

                public final void onFailedLoad(String str, String str2) {
                    try {
                        int a = C8594o.m24812a(imageView.getContext(), "mbridge_icon_play_bg", "drawable");
                        imageView.setBackgroundColor(Color.parseColor(C9302a.this.f22546f));
                        imageView.setImageResource(a);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                    } catch (Exception e) {
                        C8608u.m24880a("DataEnergizeWrapper", e.getMessage());
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private void m26683a(String str, ImageView imageView, C9252c cVar, View view) {
        final ImageView imageView2 = imageView;
        final String str2 = str;
        final C9252c cVar2 = cVar;
        final View view2 = view;
        C8425b.m24339a(imageView.getContext()).mo57506a(str, (C8428c) new C8428c() {
            public final void onFailedLoad(String str, String str2) {
            }

            public final void onSuccessLoad(Bitmap bitmap, String str) {
                ImageView imageView;
                if (bitmap != null && !bitmap.isRecycled() && (imageView = imageView2) != null) {
                    imageView.setImageBitmap(bitmap);
                    if (C9302a.this.f22542b != null) {
                        C9302a.this.f22542b.put(SameMD5.getMD5(str2), bitmap);
                        C9302a.m26679a(C9302a.this, cVar2, view2);
                    }
                }
            }
        });
        if (m26676a() != null) {
            m26678a(cVar, view);
        }
    }

    /* renamed from: a */
    private int m26674a(String str) {
        return C8594o.m24812a(C2350a.m5601e().mo15792g(), str, "id");
    }

    /* renamed from: a */
    private Bitmap m26676a() {
        Bitmap bitmap = null;
        try {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_4444);
            bitmap.eraseColor(Color.parseColor(this.f22547g));
            return bitmap;
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return bitmap;
            }
            e.printStackTrace();
            return bitmap;
        }
    }

    /* renamed from: a */
    private void m26678a(C9252c cVar, View view) {
        C9282a.C9284a a = C9282a.m26617a();
        a.mo62466a(cVar.mo62368e()).mo62468a(true);
        if (cVar.mo62368e() != 2) {
            a.mo62465a(cVar.mo62367d()).mo62470b(cVar.mo62366c());
        } else if (cVar.mo62367d() > cVar.mo62366c()) {
            a.mo62465a(cVar.mo62367d()).mo62470b(cVar.mo62366c());
        } else {
            a.mo62465a(cVar.mo62366c()).mo62470b(cVar.mo62367d());
        }
        if (view.getBackground() == null) {
            view.setBackground(a.mo62469a());
        }
    }

    /* renamed from: b */
    private void m26687b() {
        C9296a.m26657a().mo62491b();
        C9300b bVar = this.f22541a;
        if (bVar != null) {
            bVar.mo62498b();
            this.f22541a = null;
        }
        Map<String, Bitmap> map = this.f22542b;
        if (map != null) {
            if (map.entrySet() != null) {
                try {
                    Iterator<Map.Entry<String, Bitmap>> it = this.f22542b.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry next = it.next();
                        if (!(next == null || next.getValue() == null || ((Bitmap) next.getValue()).isRecycled())) {
                            ((Bitmap) next.getValue()).recycle();
                        }
                        it.remove();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            this.f22542b.clear();
        }
    }

    /* renamed from: com.mbridge.msdk.video.dynview.j.a$a */
    /* compiled from: DataEnergizeWrapper */
    private static final class C9309a implements Runnable {

        /* renamed from: a */
        private List<CampaignEx> f22568a;

        /* renamed from: b */
        private int f22569b;

        /* renamed from: c */
        private long f22570c;

        /* renamed from: d */
        private int f22571d;

        public C9309a(List<CampaignEx> list, int i, long j, int i2) {
            this.f22568a = list;
            this.f22569b = i;
            this.f22570c = j;
            this.f22571d = i2;
        }

        public final void run() {
            List<CampaignEx> list = this.f22568a;
            if (list != null) {
                try {
                    CampaignEx campaignEx = list.get(this.f22569b);
                    if (campaignEx != null) {
                        C9408a.m26937a(campaignEx.getCampaignUnitId(), campaignEx, this.f22571d, String.valueOf(this.f22570c));
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m26681a(C9302a aVar, Map map, List list, int i) {
        if (map != null && map.containsKey("choice_one_callback") && (map.get("choice_one_callback") instanceof C9257a) && list != null && list.size() > 1) {
            try {
                C8442b.m24389b().execute(new C9309a(list, i, aVar.f22548h, 0));
            } catch (Exception unused) {
            }
            ((C9257a) map.get("choice_one_callback")).mo61011a((CampaignEx) list.get(i));
            aVar.m26687b();
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m26680a(C9302a aVar, Map map) {
        if (map != null && map.containsKey("choice_one_callback") && (map.get("choice_one_callback") instanceof C9257a)) {
            ((C9257a) map.get("choice_one_callback")).mo61010a();
            aVar.m26687b();
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m26679a(C9302a aVar, C9252c cVar, View view) {
        Map<String, Bitmap> map = aVar.f22542b;
        if (map != null && map.size() > 1) {
            new C9288b();
            Map<String, Bitmap> map2 = aVar.f22542b;
            if (view != null) {
                C9296a.m26657a().mo62490a(map2, cVar, view);
            }
        }
    }
}
