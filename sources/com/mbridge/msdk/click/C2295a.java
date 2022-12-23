package com.mbridge.msdk.click;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.CommonJumpLoader;
import com.mbridge.msdk.click.p057a.C2302a;
import com.mbridge.msdk.foundation.entity.C8403d;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p066db.C2376g;
import com.mbridge.msdk.foundation.same.report.C8518b;
import com.mbridge.msdk.foundation.same.report.C8526d;
import com.mbridge.msdk.foundation.tools.C8556ac;
import com.mbridge.msdk.foundation.tools.C8596q;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8611x;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.LoadingActivity;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.p054c.C2278a;
import com.mbridge.msdk.p054c.C2283b;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.mbridge.msdk.click.a */
/* compiled from: CommonClickControl */
public final class C2295a {

    /* renamed from: a */
    public static boolean f4701a = false;

    /* renamed from: b */
    public static Map<String, Long> f4702b = new HashMap();

    /* renamed from: c */
    public static Set<String> f4703c = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f4704d;

    /* renamed from: e */
    private long f4705e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C2376g f4706f = null;

    /* renamed from: g */
    private Context f4707g = null;

    /* renamed from: h */
    private CommonJumpLoader f4708h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public NativeListener.NativeTrackingListener f4709i = null;

    /* renamed from: j */
    private C8526d f4710j;

    /* renamed from: k */
    private C2278a f4711k;

    /* renamed from: l */
    private boolean f4712l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f4713m = false;

    /* renamed from: n */
    private boolean f4714n = true;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f4715o;

    public C2295a(Context context, String str) {
        C2278a b = C2283b.m5275a().mo15563b(str);
        this.f4711k = b;
        if (b == null) {
            this.f4711k = C2283b.m5275a().mo15562b();
        }
        this.f4712l = this.f4711k.mo15439M();
        Context applicationContext = context.getApplicationContext();
        this.f4707g = applicationContext;
        this.f4704d = str;
        if (this.f4706f == null) {
            this.f4706f = C2376g.m5723a(applicationContext);
        }
        this.f4710j = new C8526d(this.f4707g);
    }

    /* renamed from: a */
    public final void mo15643a(String str) {
        this.f4704d = str;
    }

    /* renamed from: a */
    public final void mo15642a(NativeListener.NativeTrackingListener nativeTrackingListener) {
        this.f4709i = nativeTrackingListener;
    }

    /* renamed from: a */
    public final void mo15644a(boolean z) {
        this.f4714n = z;
    }

    /* renamed from: a */
    public final void mo15638a() {
        try {
            this.f4709i = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo15640a(CampaignEx campaignEx, NativeListener.NativeAdListener nativeAdListener) {
        if (!(nativeAdListener == null || campaignEx == null)) {
            nativeAdListener.onAdClick(campaignEx);
        }
        mo15639a(campaignEx);
    }

    /* renamed from: b */
    private boolean m5378b(CampaignEx campaignEx) {
        Long l;
        if (campaignEx == null) {
            return true;
        }
        try {
            if (2 != campaignEx.getLinkType() && 3 != campaignEx.getLinkType()) {
                return true;
            }
            String id = campaignEx.getId();
            if (f4702b == null) {
                return true;
            }
            if (f4702b.containsKey(id) && (l = f4702b.get(id)) != null) {
                if (l.longValue() > System.currentTimeMillis() || f4703c.contains(campaignEx.getId())) {
                    return false;
                }
            }
            f4702b.put(campaignEx.getId(), Long.valueOf(System.currentTimeMillis() + ((long) (campaignEx.getClickTimeOutInterval() * 1000))));
            return true;
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return true;
            }
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: a */
    private void m5370a(CampaignEx campaignEx, String str) {
        if (!TextUtils.isEmpty(str)) {
            m5361a(this.f4707g, campaignEx, this.f4704d, str, true, false, C2302a.f4735i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d5 A[Catch:{ all -> 0x01c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0142 A[Catch:{ all -> 0x01c8 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15639a(com.mbridge.msdk.foundation.entity.CampaignEx r12) {
        /*
            r11 = this;
            boolean r0 = r11.m5378b((com.mbridge.msdk.foundation.entity.CampaignEx) r12)     // Catch:{ all -> 0x01c8 }
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.String r0 = r12.getNoticeUrl()     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.foundation.db.g r1 = r11.f4706f     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.foundation.db.c r1 = com.mbridge.msdk.foundation.p066db.C2370c.m5669a(r1)     // Catch:{ all -> 0x01c8 }
            r1.mo15852a()     // Catch:{ all -> 0x01c8 }
            java.lang.String r2 = r12.getId()     // Catch:{ all -> 0x01c8 }
            java.lang.String r3 = r11.f4704d     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.click.CommonJumpLoader$JumpLoaderResult r2 = r1.mo15854b(r2, r3)     // Catch:{ all -> 0x01c8 }
            if (r2 == 0) goto L_0x0032
            java.lang.String r3 = r2.getNoticeurl()     // Catch:{ all -> 0x01c8 }
            if (r3 == 0) goto L_0x002a
            r3 = 0
            r2.setNoticeurl(r3)     // Catch:{ all -> 0x01c8 }
        L_0x002a:
            r12.setJumpResult(r2)     // Catch:{ all -> 0x01c8 }
            java.lang.String r3 = r11.f4704d     // Catch:{ all -> 0x01c8 }
            r1.mo15851a((com.mbridge.msdk.foundation.entity.CampaignEx) r12, (java.lang.String) r3)     // Catch:{ all -> 0x01c8 }
        L_0x0032:
            boolean r1 = com.mbridge.msdk.foundation.tools.C8613y.m24925a((com.mbridge.msdk.foundation.entity.CampaignEx) r12)     // Catch:{ all -> 0x01c8 }
            if (r1 == 0) goto L_0x0078
            com.mbridge.msdk.foundation.tools.m r1 = com.mbridge.msdk.foundation.tools.C8585m.m24795a()     // Catch:{ all -> 0x01c8 }
            r1.mo57768a((com.mbridge.msdk.foundation.entity.CampaignEx) r12)     // Catch:{ all -> 0x01c8 }
            android.content.Context r1 = r11.f4707g     // Catch:{ all -> 0x01c8 }
            java.lang.String r3 = r12.getDeepLinkURL()     // Catch:{ all -> 0x01c8 }
            boolean r1 = com.mbridge.msdk.click.C2309b.m5451d(r1, r3)     // Catch:{ all -> 0x01c8 }
            if (r1 == 0) goto L_0x0060
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c8 }
            r1.<init>()     // Catch:{ all -> 0x01c8 }
            r1.append(r0)     // Catch:{ all -> 0x01c8 }
            java.lang.String r0 = "&opdptype=1"
            r1.append(r0)     // Catch:{ all -> 0x01c8 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01c8 }
            r11.m5370a((com.mbridge.msdk.foundation.entity.CampaignEx) r12, (java.lang.String) r0)     // Catch:{ all -> 0x01c8 }
            return
        L_0x0060:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c8 }
            r1.<init>()     // Catch:{ all -> 0x01c8 }
            r1.append(r0)     // Catch:{ all -> 0x01c8 }
            java.lang.String r0 = "&opdptype=0"
            r1.append(r0)     // Catch:{ all -> 0x01c8 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.foundation.tools.m r1 = com.mbridge.msdk.foundation.tools.C8585m.m24795a()     // Catch:{ all -> 0x01c8 }
            r1.mo57770b((com.mbridge.msdk.foundation.entity.CampaignEx) r12)     // Catch:{ all -> 0x01c8 }
        L_0x0078:
            r11.m5370a((com.mbridge.msdk.foundation.entity.CampaignEx) r12, (java.lang.String) r0)     // Catch:{ all -> 0x01c8 }
            boolean r0 = r12.getUserActivation()     // Catch:{ all -> 0x01c8 }
            r1 = 1
            if (r0 != 0) goto L_0x00ba
            android.content.Context r0 = r11.f4707g     // Catch:{ all -> 0x01c8 }
            java.lang.String r3 = r12.getPackageName()     // Catch:{ all -> 0x01c8 }
            boolean r0 = com.mbridge.msdk.click.C2309b.m5450c(r0, r3)     // Catch:{ all -> 0x01c8 }
            if (r0 == 0) goto L_0x00ba
            android.content.Context r0 = r11.f4707g     // Catch:{ all -> 0x01c8 }
            java.lang.String r2 = r12.getPackageName()     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.click.C2309b.m5452e(r0, r2)     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f4709i     // Catch:{ all -> 0x01c8 }
            if (r0 == 0) goto L_0x00a4
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f4709i     // Catch:{ all -> 0x01c8 }
            java.lang.String r2 = r12.getClickURL()     // Catch:{ all -> 0x01c8 }
            r0.onStartRedirection(r12, r2)     // Catch:{ all -> 0x01c8 }
        L_0x00a4:
            r11.m5371a((com.mbridge.msdk.foundation.entity.CampaignEx) r12, (boolean) r1)     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f4709i     // Catch:{ all -> 0x01c8 }
            if (r0 == 0) goto L_0x00b9
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f4709i     // Catch:{ all -> 0x01c8 }
            java.lang.String r1 = r12.getClickURL()     // Catch:{ all -> 0x01c8 }
            r0.onFinishRedirection(r12, r1)     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r12 = r11.f4709i     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.foundation.tools.C8611x.m24902a((com.mbridge.msdk.out.NativeListener.NativeTrackingListener) r12)     // Catch:{ all -> 0x01c8 }
        L_0x00b9:
            return
        L_0x00ba:
            int r0 = r12.getLinkType()     // Catch:{ all -> 0x01c8 }
            int r3 = r11.m5376b()     // Catch:{ all -> 0x01c8 }
            r4 = 4
            r5 = 9
            r6 = 8
            r7 = 0
            if (r0 == r6) goto L_0x00d1
            if (r0 == r5) goto L_0x00d1
            if (r0 != r4) goto L_0x00cf
            goto L_0x00d1
        L_0x00cf:
            r8 = r7
            goto L_0x00d2
        L_0x00d1:
            r8 = r1
        L_0x00d2:
            r9 = 2
            if (r8 == 0) goto L_0x0142
            java.lang.String r8 = r12.getClickURL()     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r10 = r11.f4709i     // Catch:{ all -> 0x01c8 }
            if (r10 == 0) goto L_0x00e2
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r10 = r11.f4709i     // Catch:{ all -> 0x01c8 }
            r10.onStartRedirection(r12, r8)     // Catch:{ all -> 0x01c8 }
        L_0x00e2:
            boolean r10 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x01c8 }
            if (r10 == 0) goto L_0x00f5
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f4709i     // Catch:{ all -> 0x01c8 }
            if (r0 == 0) goto L_0x00f1
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f4709i     // Catch:{ all -> 0x01c8 }
            r0.onRedirectionFailed(r12, r8)     // Catch:{ all -> 0x01c8 }
        L_0x00f1:
            r11.m5364a((com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r2, (com.mbridge.msdk.foundation.entity.CampaignEx) r12, (boolean) r1)     // Catch:{ all -> 0x01c8 }
            return
        L_0x00f5:
            if (r0 != r6) goto L_0x010b
            android.content.Context r0 = r11.f4707g     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r11.f4709i     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.foundation.tools.C8611x.m24900a(r0, r8, r12, r1)     // Catch:{ all -> 0x01c8 }
            r11.m5364a((com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r2, (com.mbridge.msdk.foundation.entity.CampaignEx) r12, (boolean) r7)     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f4709i     // Catch:{ all -> 0x01c8 }
            if (r0 == 0) goto L_0x010a
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f4709i     // Catch:{ all -> 0x01c8 }
            r0.onFinishRedirection(r12, r8)     // Catch:{ all -> 0x01c8 }
        L_0x010a:
            return
        L_0x010b:
            if (r0 != r5) goto L_0x0121
            android.content.Context r0 = r11.f4707g     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r11.f4709i     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.foundation.tools.C8611x.m24903b(r0, r8, r1)     // Catch:{ all -> 0x01c8 }
            r11.m5364a((com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r2, (com.mbridge.msdk.foundation.entity.CampaignEx) r12, (boolean) r7)     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f4709i     // Catch:{ all -> 0x01c8 }
            if (r0 == 0) goto L_0x0120
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f4709i     // Catch:{ all -> 0x01c8 }
            r0.onFinishRedirection(r12, r8)     // Catch:{ all -> 0x01c8 }
        L_0x0120:
            return
        L_0x0121:
            if (r0 != r4) goto L_0x0134
            if (r3 != r9) goto L_0x012d
            android.content.Context r0 = r11.f4707g     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r11.f4709i     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.foundation.tools.C8611x.m24900a(r0, r8, r12, r1)     // Catch:{ all -> 0x01c8 }
            goto L_0x0134
        L_0x012d:
            android.content.Context r0 = r11.f4707g     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r11.f4709i     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.foundation.tools.C8611x.m24903b(r0, r8, r1)     // Catch:{ all -> 0x01c8 }
        L_0x0134:
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f4709i     // Catch:{ all -> 0x01c8 }
            if (r0 == 0) goto L_0x013d
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f4709i     // Catch:{ all -> 0x01c8 }
            r0.onFinishRedirection(r12, r8)     // Catch:{ all -> 0x01c8 }
        L_0x013d:
            r11.m5364a((com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r2, (com.mbridge.msdk.foundation.entity.CampaignEx) r12, (boolean) r7)     // Catch:{ all -> 0x01c8 }
            goto L_0x01d2
        L_0x0142:
            if (r0 != r9) goto L_0x0196
            java.lang.String r0 = r12.getClickURL()     // Catch:{ all -> 0x01c8 }
            java.lang.String r1 = "market://"
            boolean r0 = r0.startsWith(r1)     // Catch:{ all -> 0x01c8 }
            if (r0 != 0) goto L_0x0161
            java.lang.String r0 = r12.getClickURL()     // Catch:{ all -> 0x01c8 }
            java.lang.String r1 = "https://play.google.com/"
            boolean r0 = r0.startsWith(r1)     // Catch:{ all -> 0x01c8 }
            if (r0 == 0) goto L_0x015d
            goto L_0x0161
        L_0x015d:
            r11.m5371a((com.mbridge.msdk.foundation.entity.CampaignEx) r12, (boolean) r7)     // Catch:{ all -> 0x01c8 }
            goto L_0x01d2
        L_0x0161:
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f4709i     // Catch:{ all -> 0x01c8 }
            if (r0 == 0) goto L_0x016e
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f4709i     // Catch:{ all -> 0x01c8 }
            java.lang.String r1 = r12.getClickURL()     // Catch:{ all -> 0x01c8 }
            r0.onStartRedirection(r12, r1)     // Catch:{ all -> 0x01c8 }
        L_0x016e:
            android.content.Context r0 = r11.f4707g     // Catch:{ all -> 0x01c8 }
            java.lang.String r1 = r12.getClickURL()     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r4 = r11.f4709i     // Catch:{ all -> 0x01c8 }
            boolean r0 = com.mbridge.msdk.foundation.tools.C8611x.C8612a.m24905a(r0, r1, r4)     // Catch:{ all -> 0x01c8 }
            if (r0 != 0) goto L_0x0185
            java.lang.String r0 = r12.getClickURL()     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r11.f4709i     // Catch:{ all -> 0x01c8 }
            r11.m5359a((int) r3, (java.lang.String) r0, (com.mbridge.msdk.foundation.entity.CampaignEx) r12, (com.mbridge.msdk.out.NativeListener.NativeTrackingListener) r1)     // Catch:{ all -> 0x01c8 }
        L_0x0185:
            r11.m5364a((com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r2, (com.mbridge.msdk.foundation.entity.CampaignEx) r12, (boolean) r7)     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f4709i     // Catch:{ all -> 0x01c8 }
            if (r0 == 0) goto L_0x0195
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f4709i     // Catch:{ all -> 0x01c8 }
            java.lang.String r1 = r12.getClickURL()     // Catch:{ all -> 0x01c8 }
            r0.onFinishRedirection(r12, r1)     // Catch:{ all -> 0x01c8 }
        L_0x0195:
            return
        L_0x0196:
            r3 = 3
            if (r0 != r3) goto L_0x019d
            r11.m5371a((com.mbridge.msdk.foundation.entity.CampaignEx) r12, (boolean) r7)     // Catch:{ all -> 0x01c8 }
            goto L_0x01d2
        L_0x019d:
            java.lang.String r0 = r12.getClickURL()     // Catch:{ all -> 0x01c8 }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x01c8 }
            if (r3 == 0) goto L_0x01b4
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r3 = r11.f4709i     // Catch:{ all -> 0x01c8 }
            if (r3 == 0) goto L_0x01b0
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r3 = r11.f4709i     // Catch:{ all -> 0x01c8 }
            r3.onRedirectionFailed(r12, r0)     // Catch:{ all -> 0x01c8 }
        L_0x01b0:
            r11.m5364a((com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r2, (com.mbridge.msdk.foundation.entity.CampaignEx) r12, (boolean) r1)     // Catch:{ all -> 0x01c8 }
            return
        L_0x01b4:
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r3 = r11.f4709i     // Catch:{ all -> 0x01c8 }
            if (r3 == 0) goto L_0x01bd
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r3 = r11.f4709i     // Catch:{ all -> 0x01c8 }
            r3.onFinishRedirection(r12, r0)     // Catch:{ all -> 0x01c8 }
        L_0x01bd:
            android.content.Context r3 = r11.f4707g     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r4 = r11.f4709i     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.foundation.tools.C8611x.m24903b(r3, r0, r4)     // Catch:{ all -> 0x01c8 }
            r11.m5364a((com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r2, (com.mbridge.msdk.foundation.entity.CampaignEx) r12, (boolean) r1)     // Catch:{ all -> 0x01c8 }
            goto L_0x01d2
        L_0x01c8:
            r12 = move-exception
            java.lang.String r0 = r12.getMessage()
            java.lang.String r1 = "MBridge SDK M"
            com.mbridge.msdk.foundation.tools.C8608u.m24881a(r1, r0, r12)
        L_0x01d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.C2295a.mo15639a(com.mbridge.msdk.foundation.entity.CampaignEx):void");
    }

    /* renamed from: a */
    public static void m5360a(Context context, CampaignEx campaignEx, String str, String str2, boolean z, boolean z2) {
        if (context != null) {
            new CommonJumpLoader(context.getApplicationContext()).mo15613a(str, campaignEx, new C2314d() {
                /* renamed from: a */
                public final void mo15645a(Object obj) {
                }

                /* renamed from: a */
                public final void mo15646a(Object obj, String str) {
                }

                /* renamed from: b */
                public final void mo15647b(Object obj) {
                }
            }, str2, z, z2, C2302a.f4732f);
        }
    }

    /* renamed from: a */
    public static void m5361a(Context context, CampaignEx campaignEx, String str, String str2, boolean z, boolean z2, int i) {
        if (context != null) {
            new CommonJumpLoader(context.getApplicationContext()).mo15613a(str, campaignEx, new C2314d() {
                /* renamed from: a */
                public final void mo15645a(Object obj) {
                }

                /* renamed from: a */
                public final void mo15646a(Object obj, String str) {
                }

                /* renamed from: b */
                public final void mo15647b(Object obj) {
                }
            }, str2, z, z2, i);
        }
    }

    /* renamed from: a */
    public static void m5362a(Context context, CampaignEx campaignEx, String str, String[] strArr, boolean z, boolean z2) {
        if (context != null && campaignEx != null && !TextUtils.isEmpty(str) && strArr != null) {
            CommonJumpLoader commonJumpLoader = new CommonJumpLoader(context.getApplicationContext());
            for (String a : strArr) {
                commonJumpLoader.mo15613a(str, campaignEx, new C2314d() {
                    /* renamed from: a */
                    public final void mo15645a(Object obj) {
                    }

                    /* renamed from: a */
                    public final void mo15646a(Object obj, String str) {
                    }

                    /* renamed from: b */
                    public final void mo15647b(Object obj) {
                    }
                }, a, z, z2, C2302a.f4732f);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e4 A[Catch:{ Exception -> 0x012d }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f9 A[Catch:{ Exception -> 0x012d }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010c A[Catch:{ Exception -> 0x012d }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5371a(final com.mbridge.msdk.foundation.entity.CampaignEx r8, final boolean r9) {
        /*
            r7 = this;
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x012d }
            r7.f4705e = r0     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r7.f4709i     // Catch:{ Exception -> 0x012d }
            r1 = 1
            if (r0 == 0) goto L_0x001e
            if (r9 != 0) goto L_0x001e
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r7.f4709i     // Catch:{ Exception -> 0x012d }
            java.lang.String r2 = r8.getClickURL()     // Catch:{ Exception -> 0x012d }
            r0.onStartRedirection(r8, r2)     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r7.f4709i     // Catch:{ Exception -> 0x012d }
            boolean r0 = r0.onInterceptDefaultLoadingDialog()     // Catch:{ Exception -> 0x012d }
            r0 = r0 ^ r1
            goto L_0x001f
        L_0x001e:
            r0 = r1
        L_0x001f:
            r2 = 0
            r7.f4715o = r2     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.click.CommonJumpLoader$JumpLoaderResult r3 = r8.getJumpResult()     // Catch:{ Exception -> 0x012d }
            if (r3 == 0) goto L_0x0039
            if (r9 != 0) goto L_0x0033
            com.mbridge.msdk.click.CommonJumpLoader$JumpLoaderResult r3 = r8.getJumpResult()     // Catch:{ Exception -> 0x012d }
            boolean r4 = r7.f4713m     // Catch:{ Exception -> 0x012d }
            r7.m5369a((com.mbridge.msdk.foundation.entity.CampaignEx) r8, (com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r3, (boolean) r1, (boolean) r4)     // Catch:{ Exception -> 0x012d }
        L_0x0033:
            r7.f4715o = r1     // Catch:{ Exception -> 0x012d }
            r7.f4713m = r2     // Catch:{ Exception -> 0x012d }
            r3 = r2
            goto L_0x003a
        L_0x0039:
            r3 = r1
        L_0x003a:
            com.mbridge.msdk.foundation.db.g r4 = r7.f4706f     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.foundation.db.c r4 = com.mbridge.msdk.foundation.p066db.C2370c.m5669a(r4)     // Catch:{ Exception -> 0x012d }
            java.lang.String r5 = r8.getId()     // Catch:{ Exception -> 0x012d }
            java.lang.String r6 = r7.f4704d     // Catch:{ Exception -> 0x012d }
            boolean r4 = r4.mo15853a((java.lang.String) r5, (java.lang.String) r6)     // Catch:{ Exception -> 0x012d }
            if (r4 == 0) goto L_0x0052
            com.mbridge.msdk.click.CommonJumpLoader$JumpLoaderResult r4 = r8.getJumpResult()     // Catch:{ Exception -> 0x012d }
            if (r4 != 0) goto L_0x0131
        L_0x0052:
            com.mbridge.msdk.foundation.db.g r4 = r7.f4706f     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.foundation.db.c r4 = com.mbridge.msdk.foundation.p066db.C2370c.m5669a(r4)     // Catch:{ Exception -> 0x012d }
            r4.mo15852a()     // Catch:{ Exception -> 0x012d }
            java.lang.String r5 = r8.getId()     // Catch:{ Exception -> 0x012d }
            java.lang.String r6 = r7.f4704d     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.click.CommonJumpLoader$JumpLoaderResult r4 = r4.mo15854b(r5, r6)     // Catch:{ Exception -> 0x012d }
            if (r4 == 0) goto L_0x007a
            if (r9 != 0) goto L_0x007a
            r8.setJumpResult(r4)     // Catch:{ Exception -> 0x012d }
            if (r3 == 0) goto L_0x0078
            boolean r5 = r7.f4713m     // Catch:{ Exception -> 0x012d }
            r7.m5369a((com.mbridge.msdk.foundation.entity.CampaignEx) r8, (com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r4, (boolean) r3, (boolean) r5)     // Catch:{ Exception -> 0x012d }
            r7.f4715o = r1     // Catch:{ Exception -> 0x012d }
            r7.f4713m = r2     // Catch:{ Exception -> 0x012d }
            goto L_0x00cf
        L_0x0078:
            r2 = r3
            goto L_0x00cf
        L_0x007a:
            java.lang.String r4 = r8.getClick_mode()     // Catch:{ Exception -> 0x012d }
            java.lang.String r5 = "6"
            boolean r4 = r4.equals(r5)     // Catch:{ Exception -> 0x012d }
            if (r4 == 0) goto L_0x00c9
            java.lang.String r4 = r8.getPackageName()     // Catch:{ Exception -> 0x012d }
            boolean r4 = r4.isEmpty()     // Catch:{ Exception -> 0x012d }
            if (r4 != 0) goto L_0x00c9
            int r4 = r8.getLinkType()     // Catch:{ Exception -> 0x012d }
            r5 = 2
            if (r4 != r5) goto L_0x00c9
            if (r9 != 0) goto L_0x00c9
            android.content.Context r4 = r7.f4707g     // Catch:{ Exception -> 0x012d }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x012d }
            r5.<init>()     // Catch:{ Exception -> 0x012d }
            java.lang.String r6 = "market://details?id="
            r5.append(r6)     // Catch:{ Exception -> 0x012d }
            java.lang.String r6 = r8.getPackageName()     // Catch:{ Exception -> 0x012d }
            r5.append(r6)     // Catch:{ Exception -> 0x012d }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r6 = r7.f4709i     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.foundation.tools.C8611x.C8612a.m24905a(r4, r5, r6)     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r4 = r7.f4709i     // Catch:{ Exception -> 0x012d }
            if (r4 == 0) goto L_0x00c6
            if (r3 == 0) goto L_0x00c6
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r3 = r7.f4709i     // Catch:{ Exception -> 0x012d }
            r3.onDismissLoading(r8)     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r3 = r7.f4709i     // Catch:{ Exception -> 0x012d }
            r4 = 0
            r3.onFinishRedirection(r8, r4)     // Catch:{ Exception -> 0x012d }
        L_0x00c6:
            r7.f4715o = r1     // Catch:{ Exception -> 0x012d }
            r3 = r2
        L_0x00c9:
            if (r9 == 0) goto L_0x0078
            r7.f4715o = r1     // Catch:{ Exception -> 0x012d }
            r7.f4713m = r2     // Catch:{ Exception -> 0x012d }
        L_0x00cf:
            android.os.Handler r1 = new android.os.Handler     // Catch:{ Exception -> 0x012d }
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x012d }
            r1.<init>(r3)     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.click.a$4 r3 = new com.mbridge.msdk.click.a$4     // Catch:{ Exception -> 0x012d }
            r3.<init>(r0, r9, r8)     // Catch:{ Exception -> 0x012d }
            r1.post(r3)     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.click.CommonJumpLoader r9 = r7.f4708h     // Catch:{ Exception -> 0x012d }
            if (r9 == 0) goto L_0x00e9
            com.mbridge.msdk.click.CommonJumpLoader r9 = r7.f4708h     // Catch:{ Exception -> 0x012d }
            r9.mo15611a()     // Catch:{ Exception -> 0x012d }
        L_0x00e9:
            java.util.Set<java.lang.String> r9 = f4703c     // Catch:{ Exception -> 0x012d }
            if (r9 == 0) goto L_0x010c
            java.util.Set<java.lang.String> r9 = f4703c     // Catch:{ Exception -> 0x012d }
            java.lang.String r1 = r8.getId()     // Catch:{ Exception -> 0x012d }
            boolean r9 = r9.contains(r1)     // Catch:{ Exception -> 0x012d }
            if (r9 == 0) goto L_0x010c
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r9 = r7.f4709i     // Catch:{ Exception -> 0x012d }
            if (r9 == 0) goto L_0x010b
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r9 = r7.f4709i     // Catch:{ Exception -> 0x012d }
            r9.onDismissLoading(r8)     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r9 = r7.f4709i     // Catch:{ Exception -> 0x012d }
            java.lang.String r0 = r8.getClickURL()     // Catch:{ Exception -> 0x012d }
            r9.onFinishRedirection(r8, r0)     // Catch:{ Exception -> 0x012d }
        L_0x010b:
            return
        L_0x010c:
            java.util.Set<java.lang.String> r9 = f4703c     // Catch:{ Exception -> 0x012d }
            if (r9 == 0) goto L_0x0119
            java.util.Set<java.lang.String> r9 = f4703c     // Catch:{ Exception -> 0x012d }
            java.lang.String r1 = r8.getId()     // Catch:{ Exception -> 0x012d }
            r9.add(r1)     // Catch:{ Exception -> 0x012d }
        L_0x0119:
            com.mbridge.msdk.click.CommonJumpLoader r9 = new com.mbridge.msdk.click.CommonJumpLoader     // Catch:{ Exception -> 0x012d }
            android.content.Context r1 = r7.f4707g     // Catch:{ Exception -> 0x012d }
            r9.<init>(r1)     // Catch:{ Exception -> 0x012d }
            r7.f4708h = r9     // Catch:{ Exception -> 0x012d }
            java.lang.String r1 = r7.f4704d     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.click.a$5 r3 = new com.mbridge.msdk.click.a$5     // Catch:{ Exception -> 0x012d }
            r3.<init>(r8, r2, r0)     // Catch:{ Exception -> 0x012d }
            r9.mo15612a(r1, r8, r3)     // Catch:{ Exception -> 0x012d }
            goto L_0x0131
        L_0x012d:
            r8 = move-exception
            r8.printStackTrace()
        L_0x0131:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.C2295a.m5371a(com.mbridge.msdk.foundation.entity.CampaignEx, boolean):void");
    }

    /* renamed from: a */
    private void m5363a(CommonJumpLoader.JumpLoaderResult jumpLoaderResult, CampaignEx campaignEx, int i, boolean z) {
        if (campaignEx != null && jumpLoaderResult != null) {
            try {
                long currentTimeMillis = System.currentTimeMillis() - this.f4705e;
                C8403d dVar = new C8403d();
                int n = C8596q.m24849n(this.f4707g);
                dVar.mo57318a(n);
                dVar.mo57319a(C8596q.m24818a(this.f4707g, n));
                dVar.mo57333j(campaignEx.getRequestId());
                dVar.mo57334k(campaignEx.getRequestIdNotice());
                dVar.mo57324d(i);
                dVar.mo57332i(currentTimeMillis + "");
                dVar.mo57331h(campaignEx.getId());
                dVar.mo57328f(jumpLoaderResult.getType());
                if (!TextUtils.isEmpty(jumpLoaderResult.getUrl())) {
                    dVar.mo57330g(URLEncoder.encode(jumpLoaderResult.getUrl(), "utf-8"));
                }
                dVar.mo57323c((this.f4705e / 1000) + "");
                dVar.mo57320b(Integer.parseInt(campaignEx.getLandingType()));
                dVar.mo57322c(campaignEx.getLinkType());
                dVar.mo57321b(this.f4704d);
                dVar.mo57328f(jumpLoaderResult.getType());
                if (!TextUtils.isEmpty(jumpLoaderResult.getUrl())) {
                    dVar.mo57330g(URLEncoder.encode(jumpLoaderResult.getUrl(), "utf-8"));
                }
                if (this.f4712l) {
                    dVar.mo57326e(jumpLoaderResult.getStatusCode());
                    if (!TextUtils.isEmpty(jumpLoaderResult.getHeader())) {
                        dVar.mo57327e(URLEncoder.encode(jumpLoaderResult.getHeader(), "utf-8"));
                    }
                    if (!TextUtils.isEmpty(jumpLoaderResult.getContent())) {
                        dVar.mo57329f(URLEncoder.encode(jumpLoaderResult.getContent(), "UTF-8"));
                    }
                    if (!TextUtils.isEmpty(jumpLoaderResult.getExceptionMsg())) {
                        dVar.mo57325d(URLEncoder.encode(jumpLoaderResult.getExceptionMsg(), "utf-8"));
                    }
                }
                if (z) {
                    this.f4710j.mo57692a("click_jump_error", dVar, this.f4704d);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(dVar);
                String a = C8403d.m24103a((List<C8403d>) arrayList);
                if (!C8556ac.m24738b(a)) {
                    return;
                }
                if (C8518b.m24607a().mo57681c()) {
                    C8518b.m24607a().mo57679a(a);
                } else {
                    new C8526d(this.f4707g, 0).mo57695a("click_jump_success", a, (String) null, (Frame) null);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo15641a(Campaign campaign, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (campaign != null) {
                CampaignEx campaignEx = null;
                if (campaign instanceof CampaignEx) {
                    campaignEx = (CampaignEx) campaign;
                }
                if ((!str.startsWith("market://") && !str.startsWith("https://play.google.com/")) || C8611x.C8612a.m24905a(this.f4707g, str, this.f4709i) || campaignEx == null) {
                    return;
                }
                if (!TextUtils.isEmpty(campaignEx.getPackageName())) {
                    Context context = this.f4707g;
                    C8611x.C8612a.m24905a(context, "market://details?id=" + campaignEx.getPackageName(), this.f4709i);
                } else if (m5376b() == 2) {
                    C8611x.m24900a(this.f4707g, campaignEx.getClickURL(), campaignEx, this.f4709i);
                } else {
                    C8611x.m24903b(this.f4707g, campaignEx.getClickURL(), this.f4709i);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5364a(CommonJumpLoader.JumpLoaderResult jumpLoaderResult, CampaignEx campaignEx, boolean z) {
        m5363a(jumpLoaderResult, campaignEx, 1, z);
    }

    /* renamed from: a */
    private void m5359a(int i, String str, CampaignEx campaignEx, NativeListener.NativeTrackingListener nativeTrackingListener) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (i == 2) {
                C8611x.m24900a(this.f4707g, str, campaignEx, nativeTrackingListener);
            } else {
                C8611x.m24903b(this.f4707g, str, nativeTrackingListener);
            }
        } catch (Throwable th) {
            C8608u.m24881a("MBridge SDK M", th.getMessage(), th);
        }
    }

    /* renamed from: a */
    private boolean m5375a(CampaignEx campaignEx, CommonJumpLoader.JumpLoaderResult jumpLoaderResult, boolean z, int i) {
        boolean z2 = false;
        if (z) {
            try {
                int parseInt = Integer.parseInt(campaignEx.getLandingType());
                if (parseInt == 1) {
                    C8611x.m24903b(this.f4707g, jumpLoaderResult.getUrl(), this.f4709i);
                } else if (parseInt == 2) {
                    C8611x.m24900a(this.f4707g, jumpLoaderResult.getUrl(), campaignEx, this.f4709i);
                } else if (campaignEx.getPackageName() != null) {
                    if (!C8611x.C8612a.m24905a(this.f4707g, "market://details?id=" + campaignEx.getPackageName(), this.f4709i)) {
                        m5359a(i, jumpLoaderResult.getUrl(), campaignEx, this.f4709i);
                    }
                } else {
                    m5359a(i, jumpLoaderResult.getUrl(), campaignEx, this.f4709i);
                }
                z2 = true;
            } catch (Throwable th) {
                C8608u.m24881a("MBridge SDK M", th.getMessage(), th);
            }
        }
        if (z2) {
            m5364a(jumpLoaderResult, campaignEx, true);
            if (this.f4709i != null) {
                this.f4709i.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
            }
        } else {
            m5364a(jumpLoaderResult, campaignEx, true);
            if (this.f4709i != null && z) {
                this.f4709i.onRedirectionFailed(campaignEx, jumpLoaderResult.getUrl());
            }
        }
        return z2;
    }

    /* renamed from: a */
    private boolean m5374a(CampaignEx campaignEx, CommonJumpLoader.JumpLoaderResult jumpLoaderResult, boolean z) {
        boolean z2 = false;
        if (z) {
            try {
                C8611x.m24903b(this.f4707g, campaignEx.getClickURL(), this.f4709i);
                z2 = true;
            } catch (Throwable th) {
                C8608u.m24881a("MBridge SDK M", th.getMessage(), th);
            }
        }
        m5364a(jumpLoaderResult, campaignEx, true);
        if (z2) {
            if (this.f4709i != null) {
                this.f4709i.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
            }
        } else if (this.f4709i != null) {
            this.f4709i.onRedirectionFailed(campaignEx, jumpLoaderResult.getUrl());
        }
        return z2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b0, code lost:
        if (com.mbridge.msdk.foundation.tools.C8611x.C8612a.m24905a(r2, "market://details?id=" + r7.getPackageName(), r6.f4709i) == false) goto L_0x00b2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m5369a(com.mbridge.msdk.foundation.entity.CampaignEx r7, com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult r8, boolean r9, boolean r10) {
        /*
            r6 = this;
            boolean r0 = r6.f4714n     // Catch:{ Exception -> 0x0154 }
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            if (r7 == 0) goto L_0x0144
            if (r8 != 0) goto L_0x000c
            goto L_0x0144
        L_0x000c:
            int r1 = r6.m5376b()     // Catch:{ Exception -> 0x0154 }
            int r2 = r8.getCode()     // Catch:{ Exception -> 0x0154 }
            java.lang.String r3 = r8.getUrl()     // Catch:{ Exception -> 0x0154 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0154 }
            r4 = 2
            r5 = 3
            if (r3 == 0) goto L_0x0052
            if (r9 == 0) goto L_0x0052
            int r10 = r7.getLinkType()     // Catch:{ Exception -> 0x0154 }
            if (r10 != r4) goto L_0x0030
            int r10 = r6.m5376b()     // Catch:{ Exception -> 0x0154 }
            r6.m5375a((com.mbridge.msdk.foundation.entity.CampaignEx) r7, (com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r8, (boolean) r9, (int) r10)     // Catch:{ Exception -> 0x0154 }
            return
        L_0x0030:
            if (r10 != r5) goto L_0x0036
            r6.m5374a((com.mbridge.msdk.foundation.entity.CampaignEx) r7, (com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r8, (boolean) r9)     // Catch:{ Exception -> 0x0154 }
            return
        L_0x0036:
            android.content.Context r9 = r6.f4707g     // Catch:{ Exception -> 0x0154 }
            java.lang.String r10 = r7.getClickURL()     // Catch:{ Exception -> 0x0154 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r6.f4709i     // Catch:{ Exception -> 0x0154 }
            com.mbridge.msdk.foundation.tools.C8611x.m24903b(r9, r10, r1)     // Catch:{ Exception -> 0x0154 }
            r6.m5364a((com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r8, (com.mbridge.msdk.foundation.entity.CampaignEx) r7, (boolean) r0)     // Catch:{ Exception -> 0x0154 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r9 = r6.f4709i     // Catch:{ Exception -> 0x0154 }
            if (r9 == 0) goto L_0x0051
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r9 = r6.f4709i     // Catch:{ Exception -> 0x0154 }
            java.lang.String r8 = r8.getUrl()     // Catch:{ Exception -> 0x0154 }
            r9.onFinishRedirection(r7, r8)     // Catch:{ Exception -> 0x0154 }
        L_0x0051:
            return
        L_0x0052:
            if (r2 != r0) goto L_0x00cb
            java.lang.String r2 = r7.getPackageName()     // Catch:{ Exception -> 0x0154 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0154 }
            if (r2 != 0) goto L_0x0087
            java.lang.String r2 = r8.getUrl()     // Catch:{ Exception -> 0x0154 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0154 }
            if (r2 != 0) goto L_0x0087
            java.lang.String r2 = r8.getUrl()     // Catch:{ Exception -> 0x0154 }
            java.lang.String r3 = r7.getPackageName()     // Catch:{ Exception -> 0x0154 }
            boolean r2 = r2.contains(r3)     // Catch:{ Exception -> 0x0154 }
            if (r2 == 0) goto L_0x0087
            if (r9 == 0) goto L_0x0087
            android.content.Context r2 = r6.f4707g     // Catch:{ Exception -> 0x0154 }
            java.lang.String r3 = r8.getUrl()     // Catch:{ Exception -> 0x0154 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r4 = r6.f4709i     // Catch:{ Exception -> 0x0154 }
            boolean r2 = com.mbridge.msdk.foundation.tools.C8611x.C8612a.m24905a(r2, r3, r4)     // Catch:{ Exception -> 0x0154 }
            if (r2 != 0) goto L_0x00bb
            goto L_0x00b2
        L_0x0087:
            if (r9 == 0) goto L_0x00bb
            java.lang.String r2 = r7.getPackageName()     // Catch:{ Exception -> 0x0154 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0154 }
            if (r2 != 0) goto L_0x00b2
            android.content.Context r2 = r6.f4707g     // Catch:{ Exception -> 0x0154 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0154 }
            r3.<init>()     // Catch:{ Exception -> 0x0154 }
            java.lang.String r4 = "market://details?id="
            r3.append(r4)     // Catch:{ Exception -> 0x0154 }
            java.lang.String r4 = r7.getPackageName()     // Catch:{ Exception -> 0x0154 }
            r3.append(r4)     // Catch:{ Exception -> 0x0154 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0154 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r4 = r6.f4709i     // Catch:{ Exception -> 0x0154 }
            boolean r2 = com.mbridge.msdk.foundation.tools.C8611x.C8612a.m24905a(r2, r3, r4)     // Catch:{ Exception -> 0x0154 }
            if (r2 != 0) goto L_0x00bb
        L_0x00b2:
            java.lang.String r2 = r8.getUrl()     // Catch:{ Exception -> 0x0154 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r3 = r6.f4709i     // Catch:{ Exception -> 0x0154 }
            r6.m5359a((int) r1, (java.lang.String) r2, (com.mbridge.msdk.foundation.entity.CampaignEx) r7, (com.mbridge.msdk.out.NativeListener.NativeTrackingListener) r3)     // Catch:{ Exception -> 0x0154 }
        L_0x00bb:
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r6.f4709i     // Catch:{ Exception -> 0x0154 }
            if (r1 == 0) goto L_0x011c
            if (r9 == 0) goto L_0x011c
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r6.f4709i     // Catch:{ Exception -> 0x0154 }
            java.lang.String r2 = r8.getUrl()     // Catch:{ Exception -> 0x0154 }
            r1.onFinishRedirection(r7, r2)     // Catch:{ Exception -> 0x0154 }
            goto L_0x011c
        L_0x00cb:
            if (r2 != r5) goto L_0x00ea
            if (r9 == 0) goto L_0x00da
            android.content.Context r1 = r6.f4707g     // Catch:{ Exception -> 0x0154 }
            java.lang.String r2 = r8.getUrl()     // Catch:{ Exception -> 0x0154 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r3 = r6.f4709i     // Catch:{ Exception -> 0x0154 }
            com.mbridge.msdk.foundation.tools.C8611x.m24903b(r1, r2, r3)     // Catch:{ Exception -> 0x0154 }
        L_0x00da:
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r6.f4709i     // Catch:{ Exception -> 0x0154 }
            if (r1 == 0) goto L_0x011c
            if (r9 == 0) goto L_0x011c
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r6.f4709i     // Catch:{ Exception -> 0x0154 }
            java.lang.String r2 = r8.getUrl()     // Catch:{ Exception -> 0x0154 }
            r1.onFinishRedirection(r7, r2)     // Catch:{ Exception -> 0x0154 }
            goto L_0x011c
        L_0x00ea:
            if (r9 == 0) goto L_0x011c
            int r1 = r7.getLinkType()     // Catch:{ Exception -> 0x0154 }
            if (r5 != r1) goto L_0x00f6
            r6.m5374a((com.mbridge.msdk.foundation.entity.CampaignEx) r7, (com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r8, (boolean) r9)     // Catch:{ Exception -> 0x0154 }
            return
        L_0x00f6:
            int r1 = r7.getLinkType()     // Catch:{ Exception -> 0x0154 }
            if (r4 != r1) goto L_0x0104
            int r10 = r6.m5376b()     // Catch:{ Exception -> 0x0154 }
            r6.m5375a((com.mbridge.msdk.foundation.entity.CampaignEx) r7, (com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r8, (boolean) r9, (int) r10)     // Catch:{ Exception -> 0x0154 }
            return
        L_0x0104:
            android.content.Context r1 = r6.f4707g     // Catch:{ Exception -> 0x0154 }
            java.lang.String r2 = r8.getUrl()     // Catch:{ Exception -> 0x0154 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r3 = r6.f4709i     // Catch:{ Exception -> 0x0154 }
            com.mbridge.msdk.foundation.tools.C8611x.m24903b(r1, r2, r3)     // Catch:{ Exception -> 0x0154 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r6.f4709i     // Catch:{ Exception -> 0x0154 }
            if (r1 == 0) goto L_0x011c
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r6.f4709i     // Catch:{ Exception -> 0x0154 }
            java.lang.String r2 = r8.getUrl()     // Catch:{ Exception -> 0x0154 }
            r1.onFinishRedirection(r7, r2)     // Catch:{ Exception -> 0x0154 }
        L_0x011c:
            int r1 = r7.getLinkType()     // Catch:{ Exception -> 0x0154 }
            java.lang.String r2 = r8.getUrl()     // Catch:{ Exception -> 0x0154 }
            boolean r1 = r6.m5372a((int) r1, (java.lang.String) r2)     // Catch:{ Exception -> 0x0154 }
            if (r1 == 0) goto L_0x012f
            r0 = 0
            r6.m5364a((com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r8, (com.mbridge.msdk.foundation.entity.CampaignEx) r7, (boolean) r0)     // Catch:{ Exception -> 0x0154 }
            goto L_0x0132
        L_0x012f:
            r6.m5364a((com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r8, (com.mbridge.msdk.foundation.entity.CampaignEx) r7, (boolean) r0)     // Catch:{ Exception -> 0x0154 }
        L_0x0132:
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r6.f4709i     // Catch:{ Exception -> 0x0154 }
            if (r0 == 0) goto L_0x0158
            if (r9 != 0) goto L_0x0158
            if (r10 == 0) goto L_0x0158
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r9 = r6.f4709i     // Catch:{ Exception -> 0x0154 }
            java.lang.String r8 = r8.getUrl()     // Catch:{ Exception -> 0x0154 }
            r9.onFinishRedirection(r7, r8)     // Catch:{ Exception -> 0x0154 }
            goto L_0x0158
        L_0x0144:
            if (r9 == 0) goto L_0x0153
            r6.m5364a((com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r8, (com.mbridge.msdk.foundation.entity.CampaignEx) r7, (boolean) r0)     // Catch:{ Exception -> 0x0154 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r7 = r6.f4709i     // Catch:{ Exception -> 0x0154 }
            if (r7 == 0) goto L_0x0153
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r7 = r6.f4709i     // Catch:{ Exception -> 0x0154 }
            r8 = 0
            r7.onRedirectionFailed(r8, r8)     // Catch:{ Exception -> 0x0154 }
        L_0x0153:
            return
        L_0x0154:
            r7 = move-exception
            r7.printStackTrace()
        L_0x0158:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.C2295a.m5369a(com.mbridge.msdk.foundation.entity.CampaignEx, com.mbridge.msdk.click.CommonJumpLoader$JumpLoaderResult, boolean, boolean):void");
    }

    /* renamed from: b */
    private int m5376b() {
        try {
            if (this.f4711k != null) {
                return this.f4711k.mo15434H();
            }
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (android.text.TextUtils.isEmpty(r5) == false) goto L_0x0014;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m5372a(int r4, java.lang.String r5) {
        /*
            r3 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            if (r4 != r0) goto L_0x000c
            boolean r4 = com.mbridge.msdk.foundation.tools.C8611x.C8612a.m24906a((java.lang.String) r5)     // Catch:{ Exception -> 0x0016 }
            if (r4 == 0) goto L_0x0013
            goto L_0x0014
        L_0x000c:
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0016 }
            if (r4 != 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r1 = r2
        L_0x0014:
            r2 = r1
            goto L_0x001a
        L_0x0016:
            r4 = move-exception
            r4.printStackTrace()
        L_0x001a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.C2295a.m5372a(int, java.lang.String):boolean");
    }

    /* renamed from: a */
    static /* synthetic */ void m5366a(C2295a aVar, CampaignEx campaignEx) {
        try {
            Intent intent = new Intent(aVar.f4707g, LoadingActivity.class);
            intent.setFlags(268435456);
            intent.putExtra(CampaignEx.JSON_KEY_ICON_URL, campaignEx.getIconUrl());
            aVar.f4707g.startActivity(intent);
        } catch (Exception e) {
            C8608u.m24881a("MBridge SDK M", "Exception", e);
        }
    }

    /* renamed from: f */
    static /* synthetic */ void m5382f(C2295a aVar) {
        try {
            Intent intent = new Intent();
            intent.setAction("ExitApp");
            aVar.f4707g.sendBroadcast(intent);
        } catch (Exception e) {
            C8608u.m24881a("MBridge SDK M", "Exception", e);
        }
    }
}
