package com.mbridge.msdk.reward.player;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.foundation.p064b.C2339a;
import com.mbridge.msdk.foundation.p064b.C2347b;
import com.mbridge.msdk.foundation.same.p301c.C8425b;
import com.mbridge.msdk.foundation.same.p304f.C8442b;
import com.mbridge.msdk.foundation.tools.C8557ad;
import com.mbridge.msdk.foundation.tools.C8594o;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.reward.p342b.C9112a;
import com.mbridge.msdk.video.dynview.p350a.C9248a;
import com.mbridge.msdk.video.dynview.p353d.C9257a;
import com.mbridge.msdk.video.dynview.p359h.C9288b;
import com.mbridge.msdk.video.module.p367b.C9408a;
import com.mbridge.msdk.video.module.p367b.C9410b;
import com.mbridge.msdk.video.p346bt.module.MBTempContainer;
import com.mbridge.msdk.video.p346bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.p346bt.module.p348a.C9236a;
import com.mbridge.msdk.video.p346bt.module.p349b.C9246h;
import com.mbridge.msdk.video.signal.activity.AbstractJSActivity;
import com.mbridge.msdk.video.signal.factory.C9529b;
import com.mbridge.msdk.videocommon.C9536a;
import com.mbridge.msdk.videocommon.download.C9552a;
import com.mbridge.msdk.videocommon.download.C9556c;
import com.mbridge.msdk.videocommon.download.C9581k;
import com.mbridge.msdk.videocommon.p370a.C9538a;
import com.mbridge.msdk.videocommon.p371b.C9541c;
import com.mbridge.msdk.videocommon.p373d.C9551c;
import java.util.List;

public class MBRewardVideoActivity extends AbstractJSActivity {
    public static String INTENT_EXTRADATA = "extraData";
    public static String INTENT_ISBID = "isBid";
    public static String INTENT_ISBIG_OFFER = "isBigOffer";
    public static String INTENT_ISIV = "isIV";
    public static String INTENT_IVREWARD_MODETYPE = "ivRewardMode";
    public static String INTENT_IVREWARD_VALUE = "ivRewardValue";
    public static String INTENT_IVREWARD_VALUETYPE = "ivRewardValueType";
    public static String INTENT_MUTE = "mute";
    public static String INTENT_REWARD = "reward";
    public static String INTENT_UNITID = "unitId";
    public static String INTENT_USERID = "userId";
    public static String SAVE_STATE_KEY_REPORT = "hasRelease";

    /* renamed from: A */
    private boolean f22084A;

    /* renamed from: B */
    private C9257a f22085B = new C9257a() {
        /* renamed from: a */
        public final void mo61011a(CampaignEx campaignEx) {
            if (campaignEx != null) {
                if (MBRewardVideoActivity.this.f22107v != null) {
                    new C9288b().mo62477b((View) MBRewardVideoActivity.this.f22107v, 500);
                }
                CampaignEx unused = MBRewardVideoActivity.this.f22103r = campaignEx;
                MBRewardVideoActivity mBRewardVideoActivity = MBRewardVideoActivity.this;
                mBRewardVideoActivity.m26145a(mBRewardVideoActivity.f22103r);
                return;
            }
            MBRewardVideoActivity.this.m26147a("campaign is null");
        }

        /* renamed from: a */
        public final void mo61010a() {
            if (MBRewardVideoActivity.this.f22107v != null) {
                new C9288b().mo62477b((View) MBRewardVideoActivity.this.f22107v, 500);
            }
            boolean unused = MBRewardVideoActivity.this.f22096k = true;
            MBRewardVideoActivity.this.m26144a();
            try {
                C8442b.m24389b().execute(new C9126b(MBRewardVideoActivity.this.f22103r, MBRewardVideoActivity.this.f22086a, 1));
            } catch (Exception unused2) {
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f22086a;

    /* renamed from: b */
    private String f22087b;

    /* renamed from: c */
    private String f22088c;

    /* renamed from: d */
    private C9541c f22089d;

    /* renamed from: e */
    private int f22090e = 2;

    /* renamed from: f */
    private boolean f22091f = false;

    /* renamed from: g */
    private boolean f22092g = false;

    /* renamed from: h */
    private int f22093h;

    /* renamed from: i */
    private int f22094i;

    /* renamed from: j */
    private int f22095j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f22096k = false;

    /* renamed from: l */
    private boolean f22097l = false;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C9246h f22098m;

    /* renamed from: n */
    private C9551c f22099n;

    /* renamed from: o */
    private boolean f22100o = false;

    /* renamed from: p */
    private boolean f22101p = false;

    /* renamed from: q */
    private C9552a f22102q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public CampaignEx f22103r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public List<C9552a> f22104s;

    /* renamed from: t */
    private List<CampaignEx> f22105t;

    /* renamed from: u */
    private MBTempContainer f22106u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public MBridgeBTContainer f22107v;

    /* renamed from: w */
    private WindVaneWebView f22108w;

    /* renamed from: x */
    private C9236a f22109x;

    /* renamed from: y */
    private String f22110y;

    /* renamed from: z */
    private String f22111z;

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(14:78|(1:84)|85|(5:87|(1:89)(1:90)|91|(1:93)|94)|95|(1:97)|98|(1:104)|105|106|107|108|109|(2:142|151)(4:115|(2:119|(2:121|(2:123|(2:125|(1:127)(1:128))(1:129))(1:130)))|131|(2:133|(4:135|(1:137)|138|148)(1:(2:140|149)(2:141|150)))(1:147))) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:108:0x02bc */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02d6 A[Catch:{ Exception -> 0x0154, all -> 0x036d }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0360 A[Catch:{ Exception -> 0x0154, all -> 0x036d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r22) {
        /*
            r21 = this;
            r10 = r21
            r0 = r22
            java.lang.String r1 = "_"
            java.lang.String r2 = ""
            java.lang.String r3 = "anim"
            java.lang.String r4 = "DynamicViewCampaignResourceDownloader"
            super.onCreate(r22)
            r5 = 1
            com.mbridge.msdk.MBridgeConstans.isRewardActivityShowing = r5
            com.mbridge.msdk.foundation.controller.a r6 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
            r6.mo15778a((android.content.Context) r10)
            java.lang.String r6 = "mbridge_more_offer_activity"
            int r6 = r10.findLayout(r6)     // Catch:{ all -> 0x036d }
            if (r6 >= 0) goto L_0x0027
            java.lang.String r0 = "no mbridge_more_offer_activity layout"
            r10.m26147a((java.lang.String) r0)     // Catch:{ all -> 0x036d }
            return
        L_0x0027:
            r10.setContentView(r6)     // Catch:{ all -> 0x036d }
            android.content.Intent r6 = r21.getIntent()     // Catch:{ all -> 0x036d }
            java.lang.String r7 = INTENT_UNITID     // Catch:{ all -> 0x036d }
            java.lang.String r7 = r6.getStringExtra(r7)     // Catch:{ all -> 0x036d }
            r10.f22086a = r7     // Catch:{ all -> 0x036d }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x036d }
            java.lang.String r8 = "data empty error"
            if (r7 == 0) goto L_0x0042
            r10.m26147a((java.lang.String) r8)     // Catch:{ all -> 0x036d }
            return
        L_0x0042:
            java.util.Map<java.lang.String, com.mbridge.msdk.reward.a.a$d> r7 = com.mbridge.msdk.reward.p341a.C9047a.f21693b     // Catch:{ all -> 0x036d }
            java.lang.String r9 = r10.f22086a     // Catch:{ all -> 0x036d }
            java.lang.Object r7 = r7.get(r9)     // Catch:{ all -> 0x036d }
            com.mbridge.msdk.video.bt.module.b.h r7 = (com.mbridge.msdk.video.p346bt.module.p349b.C9246h) r7     // Catch:{ all -> 0x036d }
            r10.f22098m = r7     // Catch:{ all -> 0x036d }
            java.lang.String r7 = com.mbridge.msdk.MBridgeConstans.PLACEMENT_ID     // Catch:{ all -> 0x036d }
            java.lang.String r7 = r6.getStringExtra(r7)     // Catch:{ all -> 0x036d }
            r10.f22087b = r7     // Catch:{ all -> 0x036d }
            java.lang.String r7 = INTENT_REWARD     // Catch:{ all -> 0x036d }
            java.lang.String r7 = r6.getStringExtra(r7)     // Catch:{ all -> 0x036d }
            com.mbridge.msdk.videocommon.b.c r7 = com.mbridge.msdk.videocommon.p371b.C9541c.m27264b(r7)     // Catch:{ all -> 0x036d }
            r10.f22089d = r7     // Catch:{ all -> 0x036d }
            java.lang.String r7 = INTENT_USERID     // Catch:{ all -> 0x036d }
            java.lang.String r7 = r6.getStringExtra(r7)     // Catch:{ all -> 0x036d }
            r10.f22088c = r7     // Catch:{ all -> 0x036d }
            java.lang.String r7 = INTENT_MUTE     // Catch:{ all -> 0x036d }
            r9 = 2
            int r7 = r6.getIntExtra(r7, r9)     // Catch:{ all -> 0x036d }
            r10.f22090e = r7     // Catch:{ all -> 0x036d }
            java.lang.String r7 = INTENT_ISIV     // Catch:{ all -> 0x036d }
            r11 = 0
            boolean r7 = r6.getBooleanExtra(r7, r11)     // Catch:{ all -> 0x036d }
            r10.f22091f = r7     // Catch:{ all -> 0x036d }
            com.mbridge.msdk.foundation.controller.a r7 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ all -> 0x036d }
            boolean r12 = r10.f22091f     // Catch:{ all -> 0x036d }
            r14 = 94
            if (r12 == 0) goto L_0x0089
            r12 = 287(0x11f, float:4.02E-43)
            goto L_0x008a
        L_0x0089:
            r12 = r14
        L_0x008a:
            r7.mo15777a((int) r12)     // Catch:{ all -> 0x036d }
            java.lang.String r7 = INTENT_ISBID     // Catch:{ all -> 0x036d }
            boolean r7 = r6.getBooleanExtra(r7, r11)     // Catch:{ all -> 0x036d }
            r10.f22092g = r7     // Catch:{ all -> 0x036d }
            java.lang.String r7 = INTENT_EXTRADATA     // Catch:{ all -> 0x036d }
            java.lang.String r7 = r6.getStringExtra(r7)     // Catch:{ all -> 0x036d }
            r10.f22111z = r7     // Catch:{ all -> 0x036d }
            boolean r7 = r10.f22091f     // Catch:{ all -> 0x036d }
            if (r7 == 0) goto L_0x00b9
            java.lang.String r7 = INTENT_IVREWARD_MODETYPE     // Catch:{ all -> 0x036d }
            int r7 = r6.getIntExtra(r7, r11)     // Catch:{ all -> 0x036d }
            r10.f22093h = r7     // Catch:{ all -> 0x036d }
            java.lang.String r7 = INTENT_IVREWARD_VALUETYPE     // Catch:{ all -> 0x036d }
            int r7 = r6.getIntExtra(r7, r11)     // Catch:{ all -> 0x036d }
            r10.f22094i = r7     // Catch:{ all -> 0x036d }
            java.lang.String r7 = INTENT_IVREWARD_VALUE     // Catch:{ all -> 0x036d }
            int r7 = r6.getIntExtra(r7, r11)     // Catch:{ all -> 0x036d }
            r10.f22095j = r7     // Catch:{ all -> 0x036d }
        L_0x00b9:
            com.mbridge.msdk.video.signal.factory.b r7 = new com.mbridge.msdk.video.signal.factory.b     // Catch:{ all -> 0x036d }
            r7.<init>(r10)     // Catch:{ all -> 0x036d }
            r10.jsFactory = r7     // Catch:{ all -> 0x036d }
            com.mbridge.msdk.video.signal.factory.IJSFactory r7 = r10.jsFactory     // Catch:{ all -> 0x036d }
            r10.registerJsFactory(r7)     // Catch:{ all -> 0x036d }
            com.mbridge.msdk.video.bt.module.b.h r7 = r10.f22098m     // Catch:{ all -> 0x036d }
            if (r7 != 0) goto L_0x00cf
            java.lang.String r0 = "showRewardListener is null"
            r10.m26147a((java.lang.String) r0)     // Catch:{ all -> 0x036d }
            return
        L_0x00cf:
            com.mbridge.msdk.reward.adapter.RewardUnitCacheManager r7 = com.mbridge.msdk.reward.adapter.RewardUnitCacheManager.getInstance()     // Catch:{ all -> 0x036d }
            java.lang.String r12 = r10.f22087b     // Catch:{ all -> 0x036d }
            java.lang.String r15 = r10.f22086a     // Catch:{ all -> 0x036d }
            com.mbridge.msdk.videocommon.d.c r7 = r7.get(r12, r15)     // Catch:{ all -> 0x036d }
            r10.f22099n = r7     // Catch:{ all -> 0x036d }
            if (r7 != 0) goto L_0x010b
            com.mbridge.msdk.videocommon.d.b r7 = com.mbridge.msdk.videocommon.p373d.C9549b.m27299a()     // Catch:{ all -> 0x036d }
            com.mbridge.msdk.foundation.controller.a r12 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ all -> 0x036d }
            java.lang.String r12 = r12.mo15793h()     // Catch:{ all -> 0x036d }
            java.lang.String r15 = r10.f22086a     // Catch:{ all -> 0x036d }
            com.mbridge.msdk.videocommon.d.c r7 = r7.mo63123a(r12, r15)     // Catch:{ all -> 0x036d }
            r10.f22099n = r7     // Catch:{ all -> 0x036d }
            if (r7 != 0) goto L_0x010b
            com.mbridge.msdk.videocommon.d.b r7 = com.mbridge.msdk.videocommon.p373d.C9549b.m27299a()     // Catch:{ all -> 0x036d }
            com.mbridge.msdk.foundation.controller.a r12 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ all -> 0x036d }
            java.lang.String r12 = r12.mo15793h()     // Catch:{ all -> 0x036d }
            java.lang.String r15 = r10.f22086a     // Catch:{ all -> 0x036d }
            boolean r13 = r10.f22091f     // Catch:{ all -> 0x036d }
            com.mbridge.msdk.videocommon.d.c r7 = r7.mo63124a((java.lang.String) r12, (java.lang.String) r15, (boolean) r13)     // Catch:{ all -> 0x036d }
            r10.f22099n = r7     // Catch:{ all -> 0x036d }
        L_0x010b:
            com.mbridge.msdk.videocommon.d.c r7 = r10.f22099n     // Catch:{ all -> 0x036d }
            if (r7 == 0) goto L_0x0125
            com.mbridge.msdk.videocommon.b.c r7 = r10.f22089d     // Catch:{ all -> 0x036d }
            com.mbridge.msdk.videocommon.d.c r12 = r10.f22099n     // Catch:{ all -> 0x036d }
            int r12 = r12.mo63160k()     // Catch:{ all -> 0x036d }
            r7.mo63098a((int) r12)     // Catch:{ all -> 0x036d }
            com.mbridge.msdk.videocommon.b.c r7 = r10.f22089d     // Catch:{ all -> 0x036d }
            com.mbridge.msdk.videocommon.d.c r12 = r10.f22099n     // Catch:{ all -> 0x036d }
            java.lang.String r12 = r12.mo63162l()     // Catch:{ all -> 0x036d }
            r7.mo63099a((java.lang.String) r12)     // Catch:{ all -> 0x036d }
        L_0x0125:
            com.mbridge.msdk.videocommon.b.c r7 = r10.f22089d     // Catch:{ all -> 0x036d }
            if (r7 == 0) goto L_0x0136
            com.mbridge.msdk.videocommon.b.c r7 = r10.f22089d     // Catch:{ all -> 0x036d }
            int r7 = r7.mo63100b()     // Catch:{ all -> 0x036d }
            if (r7 > 0) goto L_0x0136
            com.mbridge.msdk.videocommon.b.c r7 = r10.f22089d     // Catch:{ all -> 0x036d }
            r7.mo63098a((int) r5)     // Catch:{ all -> 0x036d }
        L_0x0136:
            java.lang.String r7 = "mbridge_reward_activity_open"
            int r7 = com.mbridge.msdk.foundation.tools.C8594o.m24812a(r10, r7, r3)     // Catch:{ all -> 0x036d }
            java.lang.String r12 = "mbridge_reward_activity_stay"
            int r3 = com.mbridge.msdk.foundation.tools.C8594o.m24812a(r10, r12, r3)     // Catch:{ all -> 0x036d }
            if (r7 <= r5) goto L_0x0149
            if (r3 <= r5) goto L_0x0149
            r10.overridePendingTransition(r7, r3)     // Catch:{ all -> 0x036d }
        L_0x0149:
            if (r0 == 0) goto L_0x0158
            java.lang.String r3 = SAVE_STATE_KEY_REPORT     // Catch:{ Exception -> 0x0154 }
            boolean r0 = r0.getBoolean(r3)     // Catch:{ Exception -> 0x0154 }
            r10.f22101p = r0     // Catch:{ Exception -> 0x0154 }
            goto L_0x0158
        L_0x0154:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x036d }
        L_0x0158:
            com.mbridge.msdk.videocommon.download.c r0 = com.mbridge.msdk.videocommon.download.C9556c.getInstance()     // Catch:{ all -> 0x036d }
            java.lang.String r3 = r10.f22086a     // Catch:{ all -> 0x036d }
            java.util.List r0 = r0.mo63232b((java.lang.String) r3)     // Catch:{ all -> 0x036d }
            r10.f22104s = r0     // Catch:{ all -> 0x036d }
            java.lang.String r0 = INTENT_ISBIG_OFFER     // Catch:{ all -> 0x036d }
            boolean r0 = r6.getBooleanExtra(r0, r11)     // Catch:{ all -> 0x036d }
            r10.f22096k = r0     // Catch:{ all -> 0x036d }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x036d }
            r0.<init>()     // Catch:{ all -> 0x036d }
            java.lang.String r3 = "进入 show，大模板 "
            r0.append(r3)     // Catch:{ all -> 0x036d }
            boolean r3 = r10.f22096k     // Catch:{ all -> 0x036d }
            r0.append(r3)     // Catch:{ all -> 0x036d }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x036d }
            com.mbridge.msdk.foundation.tools.C8608u.m24880a(r4, r0)     // Catch:{ all -> 0x036d }
            boolean r0 = r10.f22096k     // Catch:{ all -> 0x036d }
            if (r0 != 0) goto L_0x01d8
            java.util.List<com.mbridge.msdk.videocommon.download.a> r0 = r10.f22104s     // Catch:{ all -> 0x036d }
            if (r0 == 0) goto L_0x019c
            java.util.List<com.mbridge.msdk.videocommon.download.a> r0 = r10.f22104s     // Catch:{ all -> 0x036d }
            int r0 = r0.size()     // Catch:{ all -> 0x036d }
            if (r0 <= 0) goto L_0x019c
            java.util.List<com.mbridge.msdk.videocommon.download.a> r0 = r10.f22104s     // Catch:{ all -> 0x036d }
            java.lang.Object r0 = r0.get(r11)     // Catch:{ all -> 0x036d }
            com.mbridge.msdk.videocommon.download.a r0 = (com.mbridge.msdk.videocommon.download.C9552a) r0     // Catch:{ all -> 0x036d }
            r10.f22102q = r0     // Catch:{ all -> 0x036d }
        L_0x019c:
            com.mbridge.msdk.videocommon.download.a r0 = r10.f22102q     // Catch:{ all -> 0x036d }
            if (r0 == 0) goto L_0x01c5
            com.mbridge.msdk.videocommon.download.a r0 = r10.f22102q     // Catch:{ all -> 0x036d }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r0.mo63212g()     // Catch:{ all -> 0x036d }
            r10.f22103r = r0     // Catch:{ all -> 0x036d }
            com.mbridge.msdk.videocommon.download.a r0 = r10.f22102q     // Catch:{ all -> 0x036d }
            r0.mo63199a((boolean) r5)     // Catch:{ all -> 0x036d }
            com.mbridge.msdk.videocommon.download.a r0 = r10.f22102q     // Catch:{ all -> 0x036d }
            r0.mo63203b((boolean) r11)     // Catch:{ all -> 0x036d }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r10.f22103r     // Catch:{ all -> 0x036d }
            if (r0 == 0) goto L_0x01c5
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r10.f22103r     // Catch:{ all -> 0x036d }
            int r0 = r0.getMaitve()     // Catch:{ all -> 0x036d }
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r10.f22103r     // Catch:{ all -> 0x036d }
            java.lang.String r1 = r1.getMaitve_src()     // Catch:{ all -> 0x036d }
            com.mbridge.msdk.click.C2309b.m5446a((android.content.Context) r10, (int) r0, (java.lang.String) r1)     // Catch:{ all -> 0x036d }
        L_0x01c5:
            com.mbridge.msdk.videocommon.download.a r0 = r10.f22102q     // Catch:{ all -> 0x036d }
            if (r0 == 0) goto L_0x01d1
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r10.f22103r     // Catch:{ all -> 0x036d }
            if (r0 == 0) goto L_0x01d1
            com.mbridge.msdk.videocommon.b.c r0 = r10.f22089d     // Catch:{ all -> 0x036d }
            if (r0 != 0) goto L_0x01d4
        L_0x01d1:
            r10.m26147a((java.lang.String) r8)     // Catch:{ all -> 0x036d }
        L_0x01d4:
            r21.m26144a()     // Catch:{ all -> 0x036d }
            return
        L_0x01d8:
            com.mbridge.msdk.videocommon.download.c r0 = com.mbridge.msdk.videocommon.download.C9556c.getInstance()     // Catch:{ all -> 0x036d }
            java.lang.String r3 = r10.f22086a     // Catch:{ all -> 0x036d }
            java.util.List r0 = r0.mo63225a((java.lang.String) r3)     // Catch:{ all -> 0x036d }
            r10.f22105t = r0     // Catch:{ all -> 0x036d }
            r10.f22110y = r2     // Catch:{ all -> 0x036d }
            if (r0 == 0) goto L_0x020b
            int r0 = r0.size()     // Catch:{ all -> 0x036d }
            if (r0 <= 0) goto L_0x020b
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r10.f22105t     // Catch:{ all -> 0x036d }
            java.lang.Object r0 = r0.get(r11)     // Catch:{ all -> 0x036d }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0     // Catch:{ all -> 0x036d }
            java.lang.String r2 = r0.getCMPTEntryUrl()     // Catch:{ all -> 0x036d }
            java.lang.String r3 = r0.getRequestId()     // Catch:{ all -> 0x036d }
            r10.f22110y = r3     // Catch:{ all -> 0x036d }
            int r3 = r0.getMaitve()     // Catch:{ all -> 0x036d }
            java.lang.String r0 = r0.getMaitve_src()     // Catch:{ all -> 0x036d }
            com.mbridge.msdk.click.C2309b.m5446a((android.content.Context) r10, (int) r3, (java.lang.String) r0)     // Catch:{ all -> 0x036d }
        L_0x020b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x036d }
            r0.<init>()     // Catch:{ all -> 0x036d }
            java.lang.String r3 = r10.f22086a     // Catch:{ all -> 0x036d }
            r0.append(r3)     // Catch:{ all -> 0x036d }
            r0.append(r1)     // Catch:{ all -> 0x036d }
            java.lang.String r3 = r10.f22110y     // Catch:{ all -> 0x036d }
            r0.append(r3)     // Catch:{ all -> 0x036d }
            r0.append(r1)     // Catch:{ all -> 0x036d }
            r0.append(r2)     // Catch:{ all -> 0x036d }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x036d }
            com.mbridge.msdk.videocommon.a$a r0 = com.mbridge.msdk.videocommon.C9536a.m27222a(r0)     // Catch:{ all -> 0x036d }
            r1 = 0
            if (r0 == 0) goto L_0x0233
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r0 = r0.mo63070a()     // Catch:{ all -> 0x036d }
            goto L_0x0234
        L_0x0233:
            r0 = r1
        L_0x0234:
            r10.f22108w = r0     // Catch:{ all -> 0x036d }
            if (r0 != 0) goto L_0x0369
            com.mbridge.msdk.videocommon.download.a r0 = r10.f22102q     // Catch:{ all -> 0x036d }
            if (r0 != 0) goto L_0x0252
            java.util.List<com.mbridge.msdk.videocommon.download.a> r0 = r10.f22104s     // Catch:{ all -> 0x036d }
            if (r0 == 0) goto L_0x0252
            java.util.List<com.mbridge.msdk.videocommon.download.a> r0 = r10.f22104s     // Catch:{ all -> 0x036d }
            int r0 = r0.size()     // Catch:{ all -> 0x036d }
            if (r0 <= 0) goto L_0x0252
            java.util.List<com.mbridge.msdk.videocommon.download.a> r0 = r10.f22104s     // Catch:{ all -> 0x036d }
            java.lang.Object r0 = r0.get(r11)     // Catch:{ all -> 0x036d }
            com.mbridge.msdk.videocommon.download.a r0 = (com.mbridge.msdk.videocommon.download.C9552a) r0     // Catch:{ all -> 0x036d }
            r10.f22102q = r0     // Catch:{ all -> 0x036d }
        L_0x0252:
            com.mbridge.msdk.videocommon.download.a r0 = r10.f22102q     // Catch:{ all -> 0x036d }
            if (r0 != 0) goto L_0x0272
            com.mbridge.msdk.videocommon.download.c r0 = com.mbridge.msdk.videocommon.download.C9556c.getInstance()     // Catch:{ all -> 0x036d }
            boolean r2 = r10.f22091f     // Catch:{ all -> 0x036d }
            if (r2 == 0) goto L_0x0261
            r13 = 287(0x11f, float:4.02E-43)
            goto L_0x0262
        L_0x0261:
            r13 = r14
        L_0x0262:
            java.lang.String r2 = r10.f22086a     // Catch:{ all -> 0x036d }
            boolean r3 = r10.f22092g     // Catch:{ all -> 0x036d }
            com.mbridge.msdk.videocommon.download.k r0 = r0.mo63234c(r2)     // Catch:{ all -> 0x036d }
            if (r0 == 0) goto L_0x0270
            com.mbridge.msdk.videocommon.download.a r1 = r0.mo63267b((int) r13, (boolean) r3)     // Catch:{ all -> 0x036d }
        L_0x0270:
            r10.f22102q = r1     // Catch:{ all -> 0x036d }
        L_0x0272:
            com.mbridge.msdk.videocommon.download.a r0 = r10.f22102q     // Catch:{ all -> 0x036d }
            if (r0 == 0) goto L_0x0288
            com.mbridge.msdk.videocommon.download.a r0 = r10.f22102q     // Catch:{ all -> 0x036d }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r0.mo63212g()     // Catch:{ all -> 0x036d }
            r10.f22103r = r0     // Catch:{ all -> 0x036d }
            com.mbridge.msdk.videocommon.download.a r0 = r10.f22102q     // Catch:{ all -> 0x036d }
            r0.mo63199a((boolean) r5)     // Catch:{ all -> 0x036d }
            com.mbridge.msdk.videocommon.download.a r0 = r10.f22102q     // Catch:{ all -> 0x036d }
            r0.mo63203b((boolean) r11)     // Catch:{ all -> 0x036d }
        L_0x0288:
            com.mbridge.msdk.videocommon.download.a r0 = r10.f22102q     // Catch:{ all -> 0x036d }
            if (r0 == 0) goto L_0x0294
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r10.f22103r     // Catch:{ all -> 0x036d }
            if (r0 == 0) goto L_0x0294
            com.mbridge.msdk.videocommon.b.c r0 = r10.f22089d     // Catch:{ all -> 0x036d }
            if (r0 != 0) goto L_0x0297
        L_0x0294:
            r10.m26147a((java.lang.String) r8)     // Catch:{ all -> 0x036d }
        L_0x0297:
            r10.f22096k = r11     // Catch:{ all -> 0x036d }
            com.mbridge.msdk.foundation.entity.CampaignEx r12 = r10.f22103r     // Catch:{ Exception -> 0x02bc }
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ Exception -> 0x02bc }
            android.content.Context r13 = r0.mo15792g()     // Catch:{ Exception -> 0x02bc }
            java.lang.String r14 = "showMoreOffer showBTOld"
            java.lang.String r15 = r10.f22086a     // Catch:{ Exception -> 0x02bc }
            boolean r0 = r10.f22092g     // Catch:{ Exception -> 0x02bc }
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r10.f22103r     // Catch:{ Exception -> 0x02bc }
            java.lang.String r17 = r1.getRequestId()     // Catch:{ Exception -> 0x02bc }
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r10.f22103r     // Catch:{ Exception -> 0x02bc }
            java.lang.String r18 = r1.getRequestIdNotice()     // Catch:{ Exception -> 0x02bc }
            r19 = 0
            r16 = r0
            com.mbridge.msdk.reward.p342b.C9112a.m26119a(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x02bc }
        L_0x02bc:
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r10.f22105t     // Catch:{ all -> 0x036d }
            if (r0 == 0) goto L_0x0360
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r10.f22105t     // Catch:{ all -> 0x036d }
            int r0 = r0.size()     // Catch:{ all -> 0x036d }
            if (r0 <= 0) goto L_0x0360
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r10.f22105t     // Catch:{ all -> 0x036d }
            java.lang.Object r0 = r0.get(r11)     // Catch:{ all -> 0x036d }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0     // Catch:{ all -> 0x036d }
            boolean r0 = r0.isDynamicView()     // Catch:{ all -> 0x036d }
            if (r0 == 0) goto L_0x0360
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r10.f22105t     // Catch:{ all -> 0x036d }
            java.lang.Object r0 = r0.get(r11)     // Catch:{ all -> 0x036d }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0     // Catch:{ all -> 0x036d }
            if (r0 == 0) goto L_0x030f
            com.mbridge.msdk.foundation.entity.CampaignEx$c r1 = r0.getRewardTemplateMode()     // Catch:{ all -> 0x036d }
            if (r1 == 0) goto L_0x030f
            com.mbridge.msdk.foundation.entity.CampaignEx$c r0 = r0.getRewardTemplateMode()     // Catch:{ all -> 0x036d }
            int r0 = r0.mo57203c()     // Catch:{ all -> 0x036d }
            boolean r1 = r21.isFinishing()     // Catch:{ all -> 0x036d }
            if (r1 != 0) goto L_0x030f
            r1 = 7
            if (r0 == r5) goto L_0x030c
            r2 = 6
            if (r0 == r9) goto L_0x0308
            boolean r0 = com.mbridge.msdk.video.dynview.p360i.C9297b.m26663a((android.content.Context) r21)     // Catch:{ all -> 0x036d }
            if (r0 == 0) goto L_0x0304
            r10.setRequestedOrientation(r2)     // Catch:{ all -> 0x036d }
            goto L_0x030f
        L_0x0304:
            r10.setRequestedOrientation(r1)     // Catch:{ all -> 0x036d }
            goto L_0x030f
        L_0x0308:
            r10.setRequestedOrientation(r2)     // Catch:{ all -> 0x036d }
            goto L_0x030f
        L_0x030c:
            r10.setRequestedOrientation(r1)     // Catch:{ all -> 0x036d }
        L_0x030f:
            java.lang.String r0 = "展示新业务"
            com.mbridge.msdk.foundation.tools.C8608u.m24880a(r4, r0)     // Catch:{ all -> 0x036d }
            com.mbridge.msdk.videocommon.a.a r0 = com.mbridge.msdk.videocommon.p370a.C9538a.m27238a()     // Catch:{ all -> 0x036d }
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r1 = r10.f22105t     // Catch:{ all -> 0x036d }
            java.util.List r0 = r0.mo63080a((java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>) r1)     // Catch:{ all -> 0x036d }
            if (r0 == 0) goto L_0x0382
            int r1 = r0.size()     // Catch:{ all -> 0x036d }
            if (r1 != r5) goto L_0x0354
            java.lang.Object r0 = r0.get(r11)     // Catch:{ all -> 0x036d }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0     // Catch:{ all -> 0x036d }
            r10.f22103r = r0     // Catch:{ all -> 0x036d }
            if (r0 == 0) goto L_0x034e
            r0.setCampaignIsFiltered(r5)     // Catch:{ all -> 0x036d }
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r10.f22103r     // Catch:{ all -> 0x036d }
            java.lang.String r3 = "no available campaign but to one offer show"
            java.lang.String r4 = r10.f22086a     // Catch:{ all -> 0x036d }
            boolean r5 = r10.f22092g     // Catch:{ all -> 0x036d }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r10.f22103r     // Catch:{ all -> 0x036d }
            java.lang.String r6 = r0.getRequestId()     // Catch:{ all -> 0x036d }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r10.f22103r     // Catch:{ all -> 0x036d }
            java.lang.String r7 = r0.getRequestIdNotice()     // Catch:{ all -> 0x036d }
            r8 = 0
            r2 = r21
            com.mbridge.msdk.reward.p342b.C9112a.m26119a(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x036d }
        L_0x034e:
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r10.f22103r     // Catch:{ all -> 0x036d }
            r10.m26145a((com.mbridge.msdk.foundation.entity.CampaignEx) r0)     // Catch:{ all -> 0x036d }
            goto L_0x0382
        L_0x0354:
            if (r1 < r9) goto L_0x035a
            r21.m26150b()     // Catch:{ all -> 0x036d }
            goto L_0x0382
        L_0x035a:
            java.lang.String r0 = "no available campaign,timeout"
            r10.m26147a((java.lang.String) r0)     // Catch:{ all -> 0x036d }
            goto L_0x0382
        L_0x0360:
            java.lang.String r0 = "展示老业务"
            com.mbridge.msdk.foundation.tools.C8608u.m24880a(r4, r0)     // Catch:{ all -> 0x036d }
            r21.m26144a()     // Catch:{ all -> 0x036d }
            goto L_0x0382
        L_0x0369:
            r21.m26150b()     // Catch:{ all -> 0x036d }
            goto L_0x0382
        L_0x036d:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onCreate error"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r10.m26147a((java.lang.String) r0)
        L_0x0382:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.player.MBRewardVideoActivity.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m26145a(CampaignEx campaignEx) {
        List<C9552a> list = this.f22104s;
        if (list != null && list.size() > 0) {
            for (C9552a next : this.f22104s) {
                CampaignEx g = next.mo63212g();
                if (g != null && TextUtils.equals(g.getId(), campaignEx.getId()) && TextUtils.equals(g.getRequestId(), campaignEx.getRequestId())) {
                    this.f22102q = next;
                }
            }
        }
        this.f22096k = true;
        m26144a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m26147a(String str) {
        C8608u.m24884d("MBRewardVideoActivity", str);
        C9246h hVar = this.f22098m;
        if (hVar != null) {
            hVar.mo60932a(str);
        }
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m26144a() {
        RewardPlus rewardPlus;
        List<CampaignEx> list;
        int findID = findID("mbridge_temp_container");
        if (findID < 0) {
            m26147a("no id mbridge_bt_container in mbridge_more_offer_activity layout");
        }
        MBTempContainer mBTempContainer = (MBTempContainer) findViewById(findID);
        this.f22106u = mBTempContainer;
        if (mBTempContainer == null) {
            m26147a("env error");
        }
        List<CampaignEx> list2 = this.f22105t;
        if (list2 == null || list2.size() <= 0 || !this.f22105t.get(0).isDynamicView()) {
            this.f22106u.setVisibility(0);
        } else {
            new C9288b().mo62479c((View) this.f22106u, 500);
        }
        changeHalfScreenPadding(-1);
        this.f22106u.setActivity(this);
        this.f22106u.setBidCampaign(this.f22092g);
        this.f22106u.setBigOffer(this.f22096k);
        this.f22106u.setUnitId(this.f22086a);
        this.f22106u.setCampaign(this.f22103r);
        this.f22106u.setCampaignDownLoadTask(this.f22102q);
        this.f22106u.setIV(this.f22091f);
        CampaignEx campaignEx = this.f22103r;
        if (campaignEx == null || campaignEx.getAdSpaceT() != 2) {
            this.f22106u.setIVRewardEnable(this.f22093h, this.f22094i, this.f22095j);
        } else {
            this.f22106u.setIVRewardEnable(0, 0, 0);
        }
        this.f22106u.setMute(this.f22090e);
        CampaignEx campaignEx2 = this.f22103r;
        if (!((campaignEx2 == null || (rewardPlus = campaignEx2.getRewardPlus()) == null) && ((list = this.f22105t) == null || list.size() <= 0 || this.f22105t.get(0) == null || (rewardPlus = this.f22105t.get(0).getRewardPlus()) == null)) && !TextUtils.isEmpty(rewardPlus.getName()) && rewardPlus.getAmount() > 0) {
            C9541c cVar = new C9541c(rewardPlus.getName(), rewardPlus.getAmount());
            if (cVar.mo63100b() < 0) {
                cVar.mo63098a(1);
            }
            this.f22089d = cVar;
        }
        this.f22106u.setReward(this.f22089d);
        this.f22106u.setRewardUnitSetting(this.f22099n);
        this.f22106u.setPlacementId(this.f22087b);
        this.f22106u.setUserId(this.f22088c);
        this.f22106u.setShowRewardListener(this.f22098m);
        this.f22106u.setDeveloperExtraData(this.f22111z);
        this.f22106u.init(this);
        this.f22106u.onCreate();
        try {
            C9112a.m26119a(this.f22103r, C2350a.m5601e().mo15792g(), "showBTOld", this.f22086a, this.f22092g, "", "", 0);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private void m26150b() {
        RewardPlus rewardPlus;
        int findID = findID("mbridge_bt_container");
        if (findID < 0) {
            m26147a("no mbridge_webview_framelayout in mbridge_more_offer_activity layout");
        }
        MBridgeBTContainer mBridgeBTContainer = (MBridgeBTContainer) findViewById(findID);
        this.f22107v = mBridgeBTContainer;
        if (mBridgeBTContainer == null) {
            m26147a("env error");
        }
        this.f22107v.setVisibility(0);
        C9236a c = m26153c();
        this.f22109x = c;
        this.f22107v.setBTContainerCallback(c);
        this.f22107v.setShowRewardVideoListener(this.f22098m);
        this.f22107v.setChoiceOneCallback(this.f22085B);
        this.f22107v.setCampaigns(this.f22105t);
        this.f22107v.setCampaignDownLoadTasks(this.f22104s);
        this.f22107v.setRewardUnitSetting(this.f22099n);
        this.f22107v.setUnitId(this.f22086a);
        this.f22107v.setPlacementId(this.f22087b);
        this.f22107v.setUserId(this.f22088c);
        this.f22107v.setActivity(this);
        CampaignEx campaignEx = this.f22103r;
        if (!((campaignEx == null || (rewardPlus = campaignEx.getRewardPlus()) == null) && (this.f22105t.get(0) == null || (rewardPlus = this.f22105t.get(0).getRewardPlus()) == null)) && !TextUtils.isEmpty(rewardPlus.getName()) && rewardPlus.getAmount() > 0) {
            C9541c cVar = new C9541c(rewardPlus.getName(), rewardPlus.getAmount());
            if (cVar.mo63100b() < 0) {
                cVar.mo63098a(1);
            }
            this.f22089d = cVar;
        }
        this.f22107v.setReward(this.f22089d);
        this.f22107v.setIVRewardEnable(this.f22093h, this.f22094i, this.f22095j);
        this.f22107v.setIV(this.f22091f);
        this.f22107v.setMute(this.f22090e);
        this.f22107v.setJSFactory((C9529b) this.jsFactory);
        this.f22107v.setDeveloperExtraData(this.f22111z);
        this.f22107v.init(this);
        this.f22107v.onCreate();
        List<C9552a> list = this.f22104s;
        if (list != null && list.size() > 0) {
            try {
                C9112a.m26119a(this.f22104s.get(0).mo63212g(), C2350a.m5601e().mo15792g(), "showMoreOffer", this.f22086a, this.f22092g, "", "", 0);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    private C9236a m26153c() {
        if (this.f22109x == null) {
            this.f22109x = new C9236a() {
                /* renamed from: a */
                public final void mo61012a() {
                    if (MBRewardVideoActivity.this.f22098m != null) {
                        MBRewardVideoActivity.this.f22098m.mo60930a();
                    }
                }

                /* renamed from: a */
                public final void mo61017a(boolean z, C9541c cVar) {
                    if (MBRewardVideoActivity.this.f22098m != null) {
                        MBRewardVideoActivity.this.f22098m.mo60935a(z, cVar);
                    }
                }

                /* renamed from: a */
                public final void mo61016a(boolean z, int i) {
                    if (MBRewardVideoActivity.this.f22098m != null) {
                        MBRewardVideoActivity.this.f22098m.mo60934a(z, i);
                    }
                }

                /* renamed from: a */
                public final void mo61014a(String str) {
                    if (MBRewardVideoActivity.this.f22098m != null) {
                        MBRewardVideoActivity.this.f22098m.mo60932a(str);
                    }
                }

                /* renamed from: a */
                public final void mo61018a(boolean z, String str, String str2) {
                    if (MBRewardVideoActivity.this.f22098m != null) {
                        MBRewardVideoActivity.this.f22098m.mo60936a(z, str, str2);
                    }
                }

                /* renamed from: a */
                public final void mo61015a(String str, String str2) {
                    if (MBRewardVideoActivity.this.f22098m != null) {
                        MBRewardVideoActivity.this.f22098m.mo60933a(str, str2);
                    }
                }

                /* renamed from: b */
                public final void mo61019b(String str, String str2) {
                    if (MBRewardVideoActivity.this.f22098m != null) {
                        MBRewardVideoActivity.this.f22098m.mo60937b(str, str2);
                    }
                }

                /* renamed from: a */
                public final void mo61013a(int i, String str, String str2) {
                    if (MBRewardVideoActivity.this.f22098m != null) {
                        MBRewardVideoActivity.this.f22098m.mo60931a(i, str, str2);
                    }
                }
            };
        }
        return this.f22109x;
    }

    public void onResume() {
        super.onResume();
        if (!C2347b.f4898c) {
            C2350a.m5601e().mo15778a((Context) this);
            C8442b.m24388a().execute(new Runnable() {
                public final void run() {
                    if (MBRewardVideoActivity.this.f22104s != null && MBRewardVideoActivity.this.f22104s.size() > 0) {
                        for (C9552a aVar : MBRewardVideoActivity.this.f22104s) {
                            if (!(aVar == null || aVar.mo63212g() == null)) {
                                C9538a.m27238a().mo63083a(aVar.mo63212g(), MBRewardVideoActivity.this.f22086a);
                            }
                        }
                    }
                }
            });
            MBTempContainer mBTempContainer = this.f22106u;
            if (mBTempContainer != null) {
                mBTempContainer.onResume();
            }
            MBridgeBTContainer mBridgeBTContainer = this.f22107v;
            if (mBridgeBTContainer != null) {
                mBridgeBTContainer.onResume();
            }
        }
    }

    public void onPause() {
        super.onPause();
        MBTempContainer mBTempContainer = this.f22106u;
        if (mBTempContainer != null) {
            mBTempContainer.onPause();
        }
        MBridgeBTContainer mBridgeBTContainer = this.f22107v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onPause();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f22106u != null) {
            changeHalfScreenPadding(configuration.orientation);
            this.f22106u.onConfigurationChanged(configuration);
        }
        MBridgeBTContainer mBridgeBTContainer = this.f22107v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onConfigurationChanged(configuration);
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        MBTempContainer mBTempContainer = this.f22106u;
        if (mBTempContainer != null) {
            mBTempContainer.onBackPressed();
        }
        MBridgeBTContainer mBridgeBTContainer = this.f22107v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        MBridgeConstans.isRewardActivityShowing = false;
        super.onStop();
        MBTempContainer mBTempContainer = this.f22106u;
        if (mBTempContainer != null) {
            mBTempContainer.onStop();
        }
        MBridgeBTContainer mBridgeBTContainer = this.f22107v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onStop();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C9410b.m26949a(this.f22086a);
        try {
            if (this.f22105t != null && this.f22105t.size() > 0) {
                for (CampaignEx b : this.f22105t) {
                    m26151b(b);
                }
            }
            if (this.f22103r != null) {
                m26151b(this.f22103r);
            }
        } catch (Throwable th) {
            C8608u.m24884d("MBRewardVideoActivity", th.getMessage());
        }
        MBTempContainer mBTempContainer = this.f22106u;
        if (mBTempContainer != null) {
            mBTempContainer.onDestroy();
            this.f22106u = null;
        }
        MBridgeBTContainer mBridgeBTContainer = this.f22107v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onDestroy();
            this.f22107v = null;
        }
        C2347b a = C2347b.m5579a();
        a.mo15774c(this.f22086a + "_" + 1);
        C2347b a2 = C2347b.m5579a();
        a2.mo15774c(this.f22086a + "_" + 2);
        C8442b.m24388a().execute(new C9125a(this.f22104s, this.f22086a, this.f22110y));
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        MBTempContainer mBTempContainer = this.f22106u;
        if (mBTempContainer != null) {
            mBTempContainer.onRestart();
        }
        MBridgeBTContainer mBridgeBTContainer = this.f22107v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onRestart();
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (!C2347b.f4898c) {
            new C2339a() {
                /* renamed from: a */
                public final void mo15737a() {
                    MBRewardVideoActivity.this.onPause();
                }

                /* renamed from: b */
                public final void mo15739b() {
                    MBRewardVideoActivity.this.onResume();
                }

                /* renamed from: a */
                public final void mo15738a(String str) {
                    MBRewardVideoActivity.this.onResume();
                }
            };
            MBTempContainer mBTempContainer = this.f22106u;
            if (mBTempContainer != null) {
                mBTempContainer.onStart();
                this.f22103r.setCampaignUnitId(this.f22086a);
                C2347b a = C2347b.m5579a();
                a.mo15768a(this.f22086a + "_" + 1, this.f22103r);
            }
            MBridgeBTContainer mBridgeBTContainer = this.f22107v;
            if (mBridgeBTContainer != null) {
                mBridgeBTContainer.onStart();
                List<CampaignEx> list = this.f22105t;
                if (list != null && list.size() > 0) {
                    CampaignEx campaignEx = this.f22105t.get(0);
                    campaignEx.setCampaignUnitId(this.f22086a);
                    C2347b a2 = C2347b.m5579a();
                    a2.mo15768a(this.f22086a + "_" + 1, campaignEx);
                }
            }
            if (!this.f22084A) {
                C2347b a3 = C2347b.m5579a();
                a3.mo15775c(this.f22086a + "_" + 1, 1);
                C2347b a4 = C2347b.m5579a();
                a4.mo15774c(this.f22086a + "_" + 2);
                this.f22084A = true;
            }
        }
    }

    /* renamed from: com.mbridge.msdk.reward.player.MBRewardVideoActivity$a */
    private static final class C9125a implements Runnable {

        /* renamed from: a */
        private final List<C9552a> f22116a;

        /* renamed from: b */
        private final String f22117b;

        /* renamed from: c */
        private final String f22118c;

        public C9125a(List<C9552a> list, String str, String str2) {
            this.f22116a = list;
            this.f22117b = str;
            this.f22118c = str2;
        }

        public final void run() {
            try {
                if (this.f22116a != null && this.f22116a.size() > 0) {
                    for (C9552a next : this.f22116a) {
                        if (!(next == null || next.mo63212g() == null)) {
                            CampaignEx g = next.mo63212g();
                            String str = g.getRequestId() + g.getId() + g.getVideoUrlEncode();
                            C9581k c = C9556c.getInstance().mo63234c(this.f22117b);
                            if (c != null) {
                                try {
                                    c.mo63269b(str);
                                } catch (Exception unused) {
                                }
                            }
                            if (g != null) {
                                if (g.getRewardTemplateMode() != null) {
                                    if (!TextUtils.isEmpty(g.getRewardTemplateMode().mo57205e())) {
                                        C9536a.m27228b(this.f22117b + "_" + g.getId() + "_" + this.f22118c + "_" + g.getRewardTemplateMode().mo57205e());
                                        C9536a.m27226b(g.getAdType(), g);
                                    }
                                    if (!TextUtils.isEmpty(g.getCMPTEntryUrl())) {
                                        C9536a.m27228b(this.f22117b + "_" + this.f22118c + "_" + g.getCMPTEntryUrl());
                                    }
                                    C9538a.m27238a().mo63082a(g);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                C8608u.m24880a("MBRewardVideoActivity", e.getMessage());
            }
        }
    }

    public void finish() {
        super.finish();
        C2350a.m5601e().mo15777a(0);
        MBTempContainer mBTempContainer = this.f22106u;
        if (mBTempContainer != null) {
            mBTempContainer.onDestroy();
            this.f22106u = null;
        }
        MBridgeBTContainer mBridgeBTContainer = this.f22107v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onDestroy();
            this.f22107v = null;
        }
        C2347b.m5579a().mo15774c(this.f22086a);
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean(SAVE_STATE_KEY_REPORT, this.f22101p);
        super.onSaveInstanceState(bundle);
    }

    public void setTopControllerPadding(int i, int i2, int i3, int i4, int i5) {
        MBTempContainer mBTempContainer = this.f22106u;
        if (mBTempContainer != null) {
            mBTempContainer.setNotchPadding(i, i2, i3, i4, i5);
        }
        MBridgeBTContainer mBridgeBTContainer = this.f22107v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.setNotchPadding(i, i2, i3, i4, i5);
        }
        C9248a.f22404e = i;
        C9248a.f22400a = i2;
        C9248a.f22401b = i3;
        C9248a.f22402c = i4;
        C9248a.f22403d = i5;
    }

    public int findID(String str) {
        return C8594o.m24812a(getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return C8594o.m24812a(getApplicationContext(), str, "layout");
    }

    public void changeHalfScreenPadding(int i) {
        try {
            if (this.f22103r != null && this.f22103r.getAdSpaceT() == 2) {
                getWindow().getDecorView().setBackground(new ColorDrawable(0));
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f22106u.getLayoutParams();
                int b = C8613y.m24929b((Context) this, 58.0f);
                int b2 = C8613y.m24929b((Context) this, 104.0f);
                if (this.f22103r.getRewardTemplateMode().mo57203c() == 0) {
                    if (i == 2) {
                        layoutParams.setMargins(b2, b, b2, b);
                    } else {
                        layoutParams.setMargins(b, b2, b, b2);
                    }
                } else if (this.f22103r.getRewardTemplateMode().mo57203c() == 2) {
                    layoutParams.setMargins(b2, b, b2, b);
                } else {
                    layoutParams.setMargins(b, b2, b, b2);
                }
                this.f22106u.setLayoutParams(layoutParams);
            }
        } catch (Throwable th) {
            C8608u.m24884d("MBRewardVideoActivity", th.getMessage());
        }
    }

    /* renamed from: b */
    private void m26151b(CampaignEx campaignEx) {
        if (campaignEx != null) {
            if (!TextUtils.isEmpty(campaignEx.getImageUrl())) {
                C8425b.m24339a(C2350a.m5601e().mo15792g()).mo57509c(campaignEx.getImageUrl());
            }
            if (!TextUtils.isEmpty(campaignEx.getIconUrl())) {
                C8425b.m24339a(C2350a.m5601e().mo15792g()).mo57509c(campaignEx.getIconUrl());
            }
        }
    }

    public void setTheme(int i) {
        super.setTheme(C8594o.m24812a(this, "mbridge_transparent_theme", "style"));
    }

    /* renamed from: com.mbridge.msdk.reward.player.MBRewardVideoActivity$b */
    private static final class C9126b implements Runnable {

        /* renamed from: a */
        private final CampaignEx f22119a;

        /* renamed from: b */
        private final String f22120b;

        /* renamed from: c */
        private final int f22121c;

        public C9126b(CampaignEx campaignEx, String str, int i) {
            this.f22119a = campaignEx;
            this.f22120b = str;
            this.f22121c = i;
        }

        public final void run() {
            if (this.f22119a != null && !TextUtils.isEmpty(this.f22120b)) {
                try {
                    String mof_template_url = this.f22119a.getMof_template_url();
                    String str = "";
                    if (!TextUtils.isEmpty(mof_template_url)) {
                        str = C8557ad.m24740a(mof_template_url, "cltp");
                    }
                    C9408a.m26937a(this.f22120b, this.f22119a, this.f22121c, str);
                } catch (Exception unused) {
                }
            }
        }
    }
}
