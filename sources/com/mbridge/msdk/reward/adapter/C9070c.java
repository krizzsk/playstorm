package com.mbridge.msdk.reward.adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.controller.C2358b;
import com.mbridge.msdk.foundation.entity.C8412m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p066db.C2374f;
import com.mbridge.msdk.foundation.p066db.C2376g;
import com.mbridge.msdk.foundation.p066db.C2385p;
import com.mbridge.msdk.foundation.same.p301c.C8428c;
import com.mbridge.msdk.foundation.same.p304f.C8442b;
import com.mbridge.msdk.foundation.same.report.C8524c;
import com.mbridge.msdk.foundation.tools.C8596q;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.mbsignalcommon.p338b.C8789a;
import com.mbridge.msdk.mbsignalcommon.p338b.C8790b;
import com.mbridge.msdk.mbsignalcommon.windvane.C8818a;
import com.mbridge.msdk.mbsignalcommon.windvane.C8824g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.reward.p341a.C9047a;
import com.mbridge.msdk.reward.p342b.C9112a;
import com.mbridge.msdk.video.p346bt.module.p349b.C9238a;
import com.mbridge.msdk.video.p346bt.module.p349b.C9245g;
import com.mbridge.msdk.video.p346bt.p347a.C9196c;
import com.mbridge.msdk.video.signal.p369a.C9425j;
import com.mbridge.msdk.videocommon.C9536a;
import com.mbridge.msdk.videocommon.download.C9556c;
import com.mbridge.msdk.videocommon.download.C9563g;
import com.mbridge.msdk.videocommon.download.C9572h;
import com.mbridge.msdk.videocommon.download.C9575i;
import com.mbridge.msdk.videocommon.listener.C9584a;
import com.mbridge.msdk.videocommon.listener.InterVideoOutListener;
import com.mbridge.msdk.videocommon.p373d.C9551c;
import com.smaato.sdk.video.vast.model.ErrorCode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.reward.adapter.c */
/* compiled from: RewardCampaignsResourceManager */
public final class C9070c {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Map<String, C9074a> f21799c;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C9082h f21800a;

    /* renamed from: b */
    private ConcurrentHashMap<String, List<CampaignEx>> f21801b;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f21802d;

    /* renamed from: e */
    private volatile List<WindVaneWebView> f21803e;

    /* renamed from: com.mbridge.msdk.reward.adapter.c$c */
    /* compiled from: RewardCampaignsResourceManager */
    public interface C9076c {
        /* renamed from: a */
        void mo60917a(String str, String str2, String str3, List<CampaignEx> list);

        /* renamed from: a */
        void mo60918a(String str, String str2, String str3, List<CampaignEx> list, String str4);
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.c$i */
    /* compiled from: RewardCampaignsResourceManager */
    public interface C9083i {
        /* renamed from: a */
        void mo60923a(String str, String str2, String str3, String str4);

        /* renamed from: a */
        void mo60924a(String str, String str2, String str3, String str4, String str5);
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.c$j */
    /* compiled from: RewardCampaignsResourceManager */
    public interface C9084j {
        /* renamed from: a */
        void mo60920a(String str, String str2, String str3, String str4, String str5, C9536a.C9537a aVar);

        /* renamed from: a */
        void mo60921a(String str, String str2, String str3, String str4, String str5, C9536a.C9537a aVar, String str6);
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.c$m */
    /* compiled from: RewardCampaignsResourceManager */
    private static final class C9089m {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C9070c f21941a = new C9070c();
    }

    private C9070c() {
        this.f21803e = new ArrayList(6);
        HandlerThread handlerThread = new HandlerThread("mb-reward-load-thread");
        f21799c = new HashMap();
        handlerThread.start();
        this.f21800a = new C9082h(handlerThread.getLooper());
        this.f21801b = new ConcurrentHashMap<>();
    }

    /* renamed from: a */
    public static C9070c m25978a() {
        return C9089m.f21941a;
    }

    /* renamed from: a */
    public final synchronized void mo60943a(Context context, boolean z, int i, boolean z2, int i2, String str, String str2, String str3, List<CampaignEx> list, C9076c cVar, C9083i iVar) {
        String str4 = str2;
        String str5 = str3;
        synchronized (this) {
            String str6 = str4 + "_" + str5;
            f21799c.put(str6, new C9074a(z, z2, i, list.size(), str2, str3, i2, list));
            this.f21800a.mo60952a(str, str4, str5, cVar);
            this.f21800a.mo60951a(context);
            this.f21800a.mo60953a(str6, list);
            final List<CampaignEx> list2 = list;
            final Context context2 = context;
            final String str7 = str2;
            final int i3 = i2;
            final String str8 = str;
            final String str9 = str3;
            final C9083i iVar2 = iVar;
            this.f21800a.post(new Runnable() {
                /* JADX WARNING: Removed duplicated region for block: B:109:0x026d  */
                /* JADX WARNING: Removed duplicated region for block: B:52:0x0123  */
                /* JADX WARNING: Removed duplicated region for block: B:53:0x0136  */
                /* JADX WARNING: Removed duplicated region for block: B:62:0x0172 A[SYNTHETIC, Splitter:B:62:0x0172] */
                /* JADX WARNING: Removed duplicated region for block: B:70:0x01a6 A[SYNTHETIC, Splitter:B:70:0x01a6] */
                /* JADX WARNING: Removed duplicated region for block: B:77:0x01d2  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r21 = this;
                        r1 = r21
                        java.lang.String r2 = "RewardCampaignsResourceManager"
                        java.util.List r0 = r3
                        if (r0 == 0) goto L_0x02c8
                        int r0 = r0.size()
                        if (r0 <= 0) goto L_0x02c8
                        com.mbridge.msdk.videocommon.download.i r0 = com.mbridge.msdk.videocommon.download.C9575i.m27485a()     // Catch:{ Exception -> 0x0041 }
                        java.util.List r3 = r3     // Catch:{ Exception -> 0x0041 }
                        r0.mo63249a((java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>) r3)     // Catch:{ Exception -> 0x0041 }
                        com.mbridge.msdk.videocommon.download.c r4 = com.mbridge.msdk.videocommon.download.C9556c.getInstance()     // Catch:{ Exception -> 0x0041 }
                        android.content.Context r5 = r4     // Catch:{ Exception -> 0x0041 }
                        java.lang.String r6 = r5     // Catch:{ Exception -> 0x0041 }
                        java.util.List r7 = r3     // Catch:{ Exception -> 0x0041 }
                        int r8 = r6     // Catch:{ Exception -> 0x0041 }
                        com.mbridge.msdk.reward.adapter.c$f r9 = new com.mbridge.msdk.reward.adapter.c$f     // Catch:{ Exception -> 0x0041 }
                        com.mbridge.msdk.reward.adapter.c r0 = com.mbridge.msdk.reward.adapter.C9070c.this     // Catch:{ Exception -> 0x0041 }
                        com.mbridge.msdk.reward.adapter.c$h r0 = r0.f21800a     // Catch:{ Exception -> 0x0041 }
                        java.lang.String r3 = r7     // Catch:{ Exception -> 0x0041 }
                        java.lang.String r10 = r5     // Catch:{ Exception -> 0x0041 }
                        java.lang.String r11 = r8     // Catch:{ Exception -> 0x0041 }
                        r9.<init>(r0, r3, r10, r11)     // Catch:{ Exception -> 0x0041 }
                        r4.createUnitCache((android.content.Context) r5, (java.lang.String) r6, (java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>) r7, (int) r8, (com.mbridge.msdk.videocommon.listener.C9584a) r9)     // Catch:{ Exception -> 0x0041 }
                        com.mbridge.msdk.videocommon.download.c r0 = com.mbridge.msdk.videocommon.download.C9556c.getInstance()     // Catch:{ Exception -> 0x0041 }
                        java.lang.String r3 = r5     // Catch:{ Exception -> 0x0041 }
                        r0.load(r3)     // Catch:{ Exception -> 0x0041 }
                        goto L_0x004d
                    L_0x0041:
                        r0 = move-exception
                        boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG
                        if (r3 == 0) goto L_0x004d
                        java.lang.String r0 = r0.getLocalizedMessage()
                        com.mbridge.msdk.foundation.tools.C8608u.m24884d(r2, r0)
                    L_0x004d:
                        java.util.List r0 = r3
                        java.util.Iterator r3 = r0.iterator()
                    L_0x0053:
                        boolean r0 = r3.hasNext()
                        if (r0 == 0) goto L_0x02c8
                        java.lang.Object r0 = r3.next()
                        r14 = r0
                        com.mbridge.msdk.foundation.entity.CampaignEx r14 = (com.mbridge.msdk.foundation.entity.CampaignEx) r14
                        if (r14 != 0) goto L_0x0063
                        goto L_0x0053
                    L_0x0063:
                        com.mbridge.msdk.foundation.entity.CampaignEx$c r15 = r14.getRewardTemplateMode()
                        java.lang.String r13 = ".zip"
                        if (r15 == 0) goto L_0x0111
                        boolean r0 = r14.isDynamicView()
                        if (r0 != 0) goto L_0x0111
                        java.lang.String r0 = r15.mo57205e()
                        boolean r4 = android.text.TextUtils.isEmpty(r0)
                        if (r4 != 0) goto L_0x0111
                        java.lang.String r4 = "cmpt=1"
                        boolean r4 = r0.contains(r4)
                        if (r4 != 0) goto L_0x0111
                        boolean r4 = r0.contains(r13)
                        if (r4 == 0) goto L_0x00d5
                        com.mbridge.msdk.videocommon.download.g r12 = com.mbridge.msdk.videocommon.download.C9563g.m27460a()     // Catch:{ Exception -> 0x00c3 }
                        com.mbridge.msdk.reward.adapter.c$g r11 = new com.mbridge.msdk.reward.adapter.c$g     // Catch:{ Exception -> 0x00c3 }
                        android.content.Context r5 = r4     // Catch:{ Exception -> 0x00c3 }
                        java.lang.String r6 = r7     // Catch:{ Exception -> 0x00c3 }
                        java.lang.String r7 = r5     // Catch:{ Exception -> 0x00c3 }
                        java.lang.String r8 = r8     // Catch:{ Exception -> 0x00c3 }
                        r10 = 859(0x35b, float:1.204E-42)
                        com.mbridge.msdk.reward.adapter.c r4 = com.mbridge.msdk.reward.adapter.C9070c.this     // Catch:{ Exception -> 0x00c3 }
                        com.mbridge.msdk.reward.adapter.c$h r16 = r4.f21800a     // Catch:{ Exception -> 0x00c3 }
                        com.mbridge.msdk.reward.adapter.c$i r9 = r9     // Catch:{ Exception -> 0x00c3 }
                        java.util.List r4 = r3     // Catch:{ Exception -> 0x00c3 }
                        r17 = r4
                        r4 = r11
                        r18 = r9
                        r9 = r14
                        r19 = r11
                        r11 = r16
                        r20 = r12
                        r12 = r18
                        r16 = r3
                        r3 = r13
                        r13 = r17
                        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x00c1 }
                        r5 = r19
                        r4 = r20
                        r4.mo63243b(r0, r5)     // Catch:{ Exception -> 0x00c1 }
                        goto L_0x00d2
                    L_0x00c1:
                        r0 = move-exception
                        goto L_0x00c7
                    L_0x00c3:
                        r0 = move-exception
                        r16 = r3
                        r3 = r13
                    L_0x00c7:
                        boolean r4 = com.mbridge.msdk.MBridgeConstans.DEBUG
                        if (r4 == 0) goto L_0x00d2
                        java.lang.String r0 = r0.getLocalizedMessage()
                        com.mbridge.msdk.foundation.tools.C8608u.m24884d(r2, r0)
                    L_0x00d2:
                        r18 = r3
                        goto L_0x0115
                    L_0x00d5:
                        r16 = r3
                        r3 = r13
                        com.mbridge.msdk.videocommon.download.g r13 = com.mbridge.msdk.videocommon.download.C9563g.m27460a()     // Catch:{ Exception -> 0x0102 }
                        com.mbridge.msdk.reward.adapter.c$d r12 = new com.mbridge.msdk.reward.adapter.c$d     // Catch:{ Exception -> 0x0102 }
                        r5 = 859(0x35b, float:1.204E-42)
                        java.lang.String r6 = r7     // Catch:{ Exception -> 0x0102 }
                        java.lang.String r7 = r5     // Catch:{ Exception -> 0x0102 }
                        java.lang.String r8 = r8     // Catch:{ Exception -> 0x0102 }
                        com.mbridge.msdk.reward.adapter.c$i r10 = r9     // Catch:{ Exception -> 0x0102 }
                        com.mbridge.msdk.reward.adapter.c r4 = com.mbridge.msdk.reward.adapter.C9070c.this     // Catch:{ Exception -> 0x0102 }
                        com.mbridge.msdk.reward.adapter.c$h r11 = r4.f21800a     // Catch:{ Exception -> 0x0102 }
                        java.util.List r9 = r3     // Catch:{ Exception -> 0x0102 }
                        r4 = r12
                        r17 = r9
                        r9 = r14
                        r18 = r3
                        r3 = r12
                        r12 = r17
                        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0100 }
                        r13.mo63243b(r0, r3)     // Catch:{ Exception -> 0x0100 }
                        goto L_0x0115
                    L_0x0100:
                        r0 = move-exception
                        goto L_0x0105
                    L_0x0102:
                        r0 = move-exception
                        r18 = r3
                    L_0x0105:
                        boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG
                        if (r3 == 0) goto L_0x0115
                        java.lang.String r0 = r0.getLocalizedMessage()
                        com.mbridge.msdk.foundation.tools.C8608u.m24884d(r2, r0)
                        goto L_0x0115
                    L_0x0111:
                        r16 = r3
                        r18 = r13
                    L_0x0115:
                        java.lang.String r10 = r14.getendcard_url()
                        boolean r0 = r14.isDynamicView()
                        boolean r3 = com.mbridge.msdk.foundation.tools.C8613y.m24949g((java.lang.String) r10)
                        if (r0 != 0) goto L_0x0136
                        com.mbridge.msdk.reward.adapter.c r4 = com.mbridge.msdk.reward.adapter.C9070c.this
                        android.content.Context r5 = r4
                        java.lang.String r6 = r7
                        java.lang.String r7 = r5
                        java.lang.String r8 = r8
                        com.mbridge.msdk.reward.adapter.c$i r11 = r9
                        java.util.List r12 = r3
                        r9 = r14
                        com.mbridge.msdk.reward.adapter.C9070c.m25980a(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                        goto L_0x014a
                    L_0x0136:
                        if (r3 == 0) goto L_0x014a
                        com.mbridge.msdk.reward.adapter.c r4 = com.mbridge.msdk.reward.adapter.C9070c.this
                        android.content.Context r5 = r4
                        java.lang.String r6 = r7
                        java.lang.String r7 = r5
                        java.lang.String r8 = r8
                        com.mbridge.msdk.reward.adapter.c$i r11 = r9
                        java.util.List r12 = r3
                        r9 = r14
                        com.mbridge.msdk.reward.adapter.C9070c.m25980a(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                    L_0x014a:
                        java.lang.String r0 = r14.getEndScreenUrl()
                        boolean r0 = android.text.TextUtils.isEmpty(r0)
                        if (r0 != 0) goto L_0x0168
                        boolean r0 = r14.isDynamicView()
                        if (r0 != 0) goto L_0x0168
                        com.mbridge.msdk.videocommon.download.g r0 = com.mbridge.msdk.videocommon.download.C9563g.m27460a()
                        java.lang.String r3 = r14.getEndScreenUrl()
                        r4 = 0
                        com.mbridge.msdk.videocommon.download.g$b r4 = (com.mbridge.msdk.videocommon.download.C9563g.C9569b) r4
                        r0.mo63241a(r3, r4)
                    L_0x0168:
                        java.lang.String r0 = r14.getIconUrl()
                        boolean r3 = android.text.TextUtils.isEmpty(r0)
                        if (r3 != 0) goto L_0x019c
                        android.content.Context r3 = r4     // Catch:{ Exception -> 0x0190 }
                        com.mbridge.msdk.foundation.same.c.b r3 = com.mbridge.msdk.foundation.same.p301c.C8425b.m24339a((android.content.Context) r3)     // Catch:{ Exception -> 0x0190 }
                        com.mbridge.msdk.reward.adapter.c$e r11 = new com.mbridge.msdk.reward.adapter.c$e     // Catch:{ Exception -> 0x0190 }
                        com.mbridge.msdk.reward.adapter.c r4 = com.mbridge.msdk.reward.adapter.C9070c.this     // Catch:{ Exception -> 0x0190 }
                        com.mbridge.msdk.reward.adapter.c$h r5 = r4.f21800a     // Catch:{ Exception -> 0x0190 }
                        r6 = 0
                        java.lang.String r7 = r7     // Catch:{ Exception -> 0x0190 }
                        java.lang.String r8 = r5     // Catch:{ Exception -> 0x0190 }
                        java.lang.String r9 = r8     // Catch:{ Exception -> 0x0190 }
                        r4 = r11
                        r10 = r14
                        r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0190 }
                        r3.mo57506a((java.lang.String) r0, (com.mbridge.msdk.foundation.same.p301c.C8428c) r11)     // Catch:{ Exception -> 0x0190 }
                        goto L_0x019c
                    L_0x0190:
                        r0 = move-exception
                        boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG
                        if (r3 == 0) goto L_0x019c
                        java.lang.String r0 = r0.getLocalizedMessage()
                        com.mbridge.msdk.foundation.tools.C8608u.m24884d(r2, r0)
                    L_0x019c:
                        java.lang.String r0 = r14.getImageUrl()
                        boolean r3 = android.text.TextUtils.isEmpty(r0)
                        if (r3 != 0) goto L_0x01d0
                        android.content.Context r3 = r4     // Catch:{ Exception -> 0x01c4 }
                        com.mbridge.msdk.foundation.same.c.b r3 = com.mbridge.msdk.foundation.same.p301c.C8425b.m24339a((android.content.Context) r3)     // Catch:{ Exception -> 0x01c4 }
                        com.mbridge.msdk.reward.adapter.c$e r11 = new com.mbridge.msdk.reward.adapter.c$e     // Catch:{ Exception -> 0x01c4 }
                        com.mbridge.msdk.reward.adapter.c r4 = com.mbridge.msdk.reward.adapter.C9070c.this     // Catch:{ Exception -> 0x01c4 }
                        com.mbridge.msdk.reward.adapter.c$h r5 = r4.f21800a     // Catch:{ Exception -> 0x01c4 }
                        r6 = 0
                        java.lang.String r7 = r7     // Catch:{ Exception -> 0x01c4 }
                        java.lang.String r8 = r5     // Catch:{ Exception -> 0x01c4 }
                        java.lang.String r9 = r8     // Catch:{ Exception -> 0x01c4 }
                        r4 = r11
                        r10 = r14
                        r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x01c4 }
                        r3.mo57506a((java.lang.String) r0, (com.mbridge.msdk.foundation.same.p301c.C8428c) r11)     // Catch:{ Exception -> 0x01c4 }
                        goto L_0x01d0
                    L_0x01c4:
                        r0 = move-exception
                        boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG
                        if (r3 == 0) goto L_0x01d0
                        java.lang.String r0 = r0.getLocalizedMessage()
                        com.mbridge.msdk.foundation.tools.C8608u.m24884d(r2, r0)
                    L_0x01d0:
                        if (r15 == 0) goto L_0x02c4
                        java.lang.String r0 = r15.mo57204d()
                        boolean r3 = android.text.TextUtils.isEmpty(r0)
                        if (r3 != 0) goto L_0x0255
                        boolean r3 = r14.isDynamicView()
                        if (r3 != 0) goto L_0x0255
                        r3 = r18
                        boolean r3 = r0.contains(r3)
                        if (r3 == 0) goto L_0x0225
                        com.mbridge.msdk.videocommon.download.g r3 = com.mbridge.msdk.videocommon.download.C9563g.m27460a()     // Catch:{ Exception -> 0x0216 }
                        com.mbridge.msdk.reward.adapter.c$g r13 = new com.mbridge.msdk.reward.adapter.c$g     // Catch:{ Exception -> 0x0216 }
                        android.content.Context r5 = r4     // Catch:{ Exception -> 0x0216 }
                        java.lang.String r6 = r7     // Catch:{ Exception -> 0x0216 }
                        java.lang.String r7 = r5     // Catch:{ Exception -> 0x0216 }
                        java.lang.String r8 = r8     // Catch:{ Exception -> 0x0216 }
                        r10 = 313(0x139, float:4.39E-43)
                        com.mbridge.msdk.reward.adapter.c r4 = com.mbridge.msdk.reward.adapter.C9070c.this     // Catch:{ Exception -> 0x0216 }
                        com.mbridge.msdk.reward.adapter.c$h r11 = r4.f21800a     // Catch:{ Exception -> 0x0216 }
                        com.mbridge.msdk.reward.adapter.c$i r12 = r9     // Catch:{ Exception -> 0x0216 }
                        java.util.List r9 = r3     // Catch:{ Exception -> 0x0216 }
                        r4 = r13
                        r17 = r9
                        r9 = r14
                        r18 = r15
                        r15 = r13
                        r13 = r17
                        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0214 }
                        r3.mo63243b(r0, r15)     // Catch:{ Exception -> 0x0214 }
                        goto L_0x0257
                    L_0x0214:
                        r0 = move-exception
                        goto L_0x0219
                    L_0x0216:
                        r0 = move-exception
                        r18 = r15
                    L_0x0219:
                        boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG
                        if (r3 == 0) goto L_0x0257
                        java.lang.String r0 = r0.getLocalizedMessage()
                        com.mbridge.msdk.foundation.tools.C8608u.m24884d(r2, r0)
                        goto L_0x0257
                    L_0x0225:
                        r18 = r15
                        com.mbridge.msdk.videocommon.download.g r3 = com.mbridge.msdk.videocommon.download.C9563g.m27460a()     // Catch:{ Exception -> 0x0248 }
                        com.mbridge.msdk.reward.adapter.c$d r13 = new com.mbridge.msdk.reward.adapter.c$d     // Catch:{ Exception -> 0x0248 }
                        r5 = 313(0x139, float:4.39E-43)
                        java.lang.String r6 = r7     // Catch:{ Exception -> 0x0248 }
                        java.lang.String r7 = r5     // Catch:{ Exception -> 0x0248 }
                        java.lang.String r8 = r8     // Catch:{ Exception -> 0x0248 }
                        com.mbridge.msdk.reward.adapter.c$i r10 = r9     // Catch:{ Exception -> 0x0248 }
                        com.mbridge.msdk.reward.adapter.c r4 = com.mbridge.msdk.reward.adapter.C9070c.this     // Catch:{ Exception -> 0x0248 }
                        com.mbridge.msdk.reward.adapter.c$h r11 = r4.f21800a     // Catch:{ Exception -> 0x0248 }
                        java.util.List r12 = r3     // Catch:{ Exception -> 0x0248 }
                        r4 = r13
                        r9 = r14
                        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0248 }
                        r3.mo63243b(r0, r13)     // Catch:{ Exception -> 0x0248 }
                        goto L_0x0257
                    L_0x0248:
                        r0 = move-exception
                        boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG
                        if (r3 == 0) goto L_0x0257
                        java.lang.String r0 = r0.getLocalizedMessage()
                        com.mbridge.msdk.foundation.tools.C8608u.m24884d(r2, r0)
                        goto L_0x0257
                    L_0x0255:
                        r18 = r15
                    L_0x0257:
                        java.util.List r0 = r18.mo57206f()
                        if (r0 == 0) goto L_0x02c4
                        int r3 = r0.size()
                        if (r3 <= 0) goto L_0x02c4
                        java.util.Iterator r3 = r0.iterator()
                    L_0x0267:
                        boolean r0 = r3.hasNext()
                        if (r0 == 0) goto L_0x02c4
                        java.lang.Object r0 = r3.next()
                        com.mbridge.msdk.foundation.entity.CampaignEx$c$a r0 = (com.mbridge.msdk.foundation.entity.CampaignEx.C8398c.C8399a) r0
                        if (r0 == 0) goto L_0x0267
                        java.util.List<java.lang.String> r4 = r0.f20183b
                        if (r4 == 0) goto L_0x0267
                        java.util.List<java.lang.String> r4 = r0.f20183b
                        int r4 = r4.size()
                        if (r4 <= 0) goto L_0x0267
                        java.util.List<java.lang.String> r0 = r0.f20183b
                        java.util.Iterator r11 = r0.iterator()
                    L_0x0287:
                        boolean r0 = r11.hasNext()
                        if (r0 == 0) goto L_0x0267
                        java.lang.Object r0 = r11.next()
                        java.lang.String r0 = (java.lang.String) r0
                        boolean r4 = android.text.TextUtils.isEmpty(r0)
                        if (r4 != 0) goto L_0x0287
                        android.content.Context r4 = r4     // Catch:{ Exception -> 0x02b7 }
                        com.mbridge.msdk.foundation.same.c.b r12 = com.mbridge.msdk.foundation.same.p301c.C8425b.m24339a((android.content.Context) r4)     // Catch:{ Exception -> 0x02b7 }
                        com.mbridge.msdk.reward.adapter.c$e r13 = new com.mbridge.msdk.reward.adapter.c$e     // Catch:{ Exception -> 0x02b7 }
                        com.mbridge.msdk.reward.adapter.c r4 = com.mbridge.msdk.reward.adapter.C9070c.this     // Catch:{ Exception -> 0x02b7 }
                        com.mbridge.msdk.reward.adapter.c$h r5 = r4.f21800a     // Catch:{ Exception -> 0x02b7 }
                        r6 = 1
                        java.lang.String r7 = r7     // Catch:{ Exception -> 0x02b7 }
                        java.lang.String r8 = r5     // Catch:{ Exception -> 0x02b7 }
                        java.lang.String r9 = r8     // Catch:{ Exception -> 0x02b7 }
                        r4 = r13
                        r10 = r14
                        r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x02b7 }
                        r12.mo57506a((java.lang.String) r0, (com.mbridge.msdk.foundation.same.p301c.C8428c) r13)     // Catch:{ Exception -> 0x02b7 }
                        goto L_0x0287
                    L_0x02b7:
                        r0 = move-exception
                        boolean r4 = com.mbridge.msdk.MBridgeConstans.DEBUG
                        if (r4 == 0) goto L_0x0287
                        java.lang.String r0 = r0.getLocalizedMessage()
                        com.mbridge.msdk.foundation.tools.C8608u.m24884d(r2, r0)
                        goto L_0x0287
                    L_0x02c4:
                        r3 = r16
                        goto L_0x0053
                    L_0x02c8:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.C9070c.C90711.run():void");
                }
            });
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0053, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008c, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo60942a(android.content.Context r14, com.mbridge.msdk.foundation.entity.CampaignEx r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, com.mbridge.msdk.reward.adapter.C9070c.C9083i r19) {
        /*
            r13 = this;
            r9 = r13
            r0 = r16
            r3 = r17
            r5 = r18
            r6 = r19
            monitor-enter(r13)
            com.mbridge.msdk.reward.adapter.c$h r1 = r9.f21800a     // Catch:{ all -> 0x008d }
            r7 = r14
            r1.mo60951a(r14)     // Catch:{ all -> 0x008d }
            if (r15 == 0) goto L_0x0054
            java.lang.String r1 = r15.getCMPTEntryUrl()     // Catch:{ all -> 0x008d }
            boolean r2 = r15.isDynamicView()     // Catch:{ all -> 0x008d }
            if (r2 == 0) goto L_0x0054
            com.mbridge.msdk.videocommon.download.i r2 = com.mbridge.msdk.videocommon.download.C9575i.m27485a()     // Catch:{ all -> 0x008d }
            r4 = 1
            r2.mo63251b(r1, r4)     // Catch:{ all -> 0x008d }
            android.os.Message r2 = android.os.Message.obtain()     // Catch:{ all -> 0x008d }
            r4 = 105(0x69, float:1.47E-43)
            r2.what = r4     // Catch:{ all -> 0x008d }
            android.os.Bundle r4 = new android.os.Bundle     // Catch:{ all -> 0x008d }
            r4.<init>()     // Catch:{ all -> 0x008d }
            java.lang.String r7 = "unit_id"
            r4.putString(r7, r3)     // Catch:{ all -> 0x008d }
            java.lang.String r7 = com.mbridge.msdk.MBridgeConstans.PLACEMENT_ID     // Catch:{ all -> 0x008d }
            r4.putString(r7, r0)     // Catch:{ all -> 0x008d }
            java.lang.String r7 = "request_id"
            r4.putString(r7, r5)     // Catch:{ all -> 0x008d }
            java.lang.String r7 = "url"
            r4.putString(r7, r1)     // Catch:{ all -> 0x008d }
            r2.setData(r4)     // Catch:{ all -> 0x008d }
            com.mbridge.msdk.reward.adapter.c$h r4 = r9.f21800a     // Catch:{ all -> 0x008d }
            r4.sendMessage(r2)     // Catch:{ all -> 0x008d }
            if (r6 == 0) goto L_0x0052
            r6.mo60923a(r0, r3, r5, r1)     // Catch:{ all -> 0x008d }
        L_0x0052:
            monitor-exit(r13)
            return
        L_0x0054:
            if (r15 == 0) goto L_0x008b
            java.lang.String r1 = r15.getCMPTEntryUrl()     // Catch:{ all -> 0x008d }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x008d }
            if (r1 != 0) goto L_0x008b
            com.mbridge.msdk.videocommon.download.g r10 = com.mbridge.msdk.videocommon.download.C9563g.m27460a()     // Catch:{ Exception -> 0x007d }
            java.lang.String r11 = r15.getCMPTEntryUrl()     // Catch:{ Exception -> 0x007d }
            com.mbridge.msdk.reward.adapter.c$2 r12 = new com.mbridge.msdk.reward.adapter.c$2     // Catch:{ Exception -> 0x007d }
            r1 = r12
            r2 = r13
            r3 = r17
            r4 = r16
            r5 = r18
            r6 = r19
            r7 = r14
            r8 = r15
            r1.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x007d }
            r10.mo63243b(r11, r12)     // Catch:{ Exception -> 0x007d }
            goto L_0x008b
        L_0x007d:
            r0 = move-exception
            boolean r1 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch:{ all -> 0x008d }
            if (r1 == 0) goto L_0x008b
            java.lang.String r1 = "RewardCampaignsResourceManager"
            java.lang.String r0 = r0.getLocalizedMessage()     // Catch:{ all -> 0x008d }
            com.mbridge.msdk.foundation.tools.C8608u.m24884d(r1, r0)     // Catch:{ all -> 0x008d }
        L_0x008b:
            monitor-exit(r13)
            return
        L_0x008d:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.C9070c.mo60942a(android.content.Context, com.mbridge.msdk.foundation.entity.CampaignEx, java.lang.String, java.lang.String, java.lang.String, com.mbridge.msdk.reward.adapter.c$i):void");
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.c$e */
    /* compiled from: RewardCampaignsResourceManager */
    private static final class C9078e implements C8428c {

        /* renamed from: a */
        private Handler f21866a;

        /* renamed from: b */
        private int f21867b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f21868c;

        /* renamed from: d */
        private String f21869d;

        /* renamed from: e */
        private String f21870e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public CampaignEx f21871f;

        public C9078e(Handler handler, int i, String str, String str2, String str3, CampaignEx campaignEx) {
            this.f21866a = handler;
            this.f21867b = i;
            this.f21869d = str;
            this.f21868c = str2;
            this.f21870e = str3;
            this.f21871f = campaignEx;
        }

        public final void onSuccessLoad(Bitmap bitmap, String str) {
            C9575i.m27485a().mo63253c(str, true);
            Message obtain = Message.obtain();
            obtain.what = this.f21867b == 0 ? 102 : 104;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f21868c);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f21869d);
            bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f21870e);
            obtain.setData(bundle);
            this.f21866a.sendMessage(obtain);
        }

        public final void onFailedLoad(final String str, String str2) {
            Message obtain = Message.obtain();
            obtain.what = this.f21867b == 0 ? ErrorCode.DIFFERENT_DURATION_EXPECTED_ERROR : 204;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f21868c);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f21869d);
            bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f21870e);
            obtain.setData(bundle);
            this.f21866a.sendMessage(obtain);
            C90791 r5 = new Runnable() {
                public final void run() {
                    if (C9078e.this.f21871f != null) {
                        try {
                            C2385p a = C2385p.m5777a((C2374f) C2376g.m5723a(C2350a.m5601e().mo15792g()));
                            C8608u.m24880a("RewardCampaignsResourceManager", "campaign is null");
                            C8412m mVar = new C8412m();
                            mVar.mo57471o("2000044");
                            mVar.mo57445c(C8596q.m24849n(C2350a.m5601e().mo15792g()));
                            mVar.mo57469n(C9078e.this.f21871f.getId());
                            mVar.mo57449d(C9078e.this.f21871f.getImageUrl());
                            mVar.mo57463k(C9078e.this.f21871f.getRequestId());
                            mVar.mo57465l(C9078e.this.f21871f.getRequestIdNotice());
                            mVar.mo57467m(C9078e.this.f21868c);
                            mVar.mo57473p(str);
                            a.mo15934a(mVar);
                        } catch (Exception e) {
                            if (MBridgeConstans.DEBUG) {
                                C8608u.m24884d("RewardCampaignsResourceManager", e.getLocalizedMessage());
                            }
                        }
                    }
                }
            };
            if (C2358b.m5644a().mo15829d()) {
                C8442b.m24388a().execute(r5);
            } else {
                r5.run();
            }
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.c$f */
    /* compiled from: RewardCampaignsResourceManager */
    private static final class C9080f implements C9584a {

        /* renamed from: a */
        private Handler f21874a;

        /* renamed from: b */
        private final String f21875b;

        /* renamed from: c */
        private final String f21876c;

        /* renamed from: d */
        private final String f21877d;

        public C9080f(Handler handler, String str, String str2, String str3) {
            this.f21874a = handler;
            this.f21876c = str;
            this.f21875b = str2;
            this.f21877d = str3;
        }

        /* renamed from: a */
        public final void mo58396a(String str) {
            C9575i.m27485a().mo63248a(str, true);
            Message obtain = Message.obtain();
            obtain.what = 100;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f21875b);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f21876c);
            bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f21877d);
            bundle.putString("url", str);
            obtain.setData(bundle);
            this.f21874a.sendMessage(obtain);
        }

        /* renamed from: a */
        public final void mo58397a(String str, String str2) {
            C9575i.m27485a().mo63248a(str2, false);
            Message obtain = Message.obtain();
            obtain.what = 200;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f21875b);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f21876c);
            bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f21877d);
            bundle.putString("url", str2);
            bundle.putString("message", str);
            obtain.setData(bundle);
            this.f21874a.sendMessage(obtain);
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.c$g */
    /* compiled from: RewardCampaignsResourceManager */
    private static final class C9081g implements C9563g.C9571d {

        /* renamed from: a */
        private boolean f21878a = false;

        /* renamed from: b */
        private Context f21879b;

        /* renamed from: c */
        private String f21880c;

        /* renamed from: d */
        private String f21881d;

        /* renamed from: e */
        private String f21882e;

        /* renamed from: f */
        private CampaignEx f21883f;

        /* renamed from: g */
        private int f21884g;

        /* renamed from: h */
        private Handler f21885h;

        /* renamed from: i */
        private C9083i f21886i;

        /* renamed from: j */
        private List<CampaignEx> f21887j;

        /* renamed from: k */
        private long f21888k;

        public C9081g(Context context, String str, String str2, String str3, CampaignEx campaignEx, int i, Handler handler, C9083i iVar, List<CampaignEx> list) {
            this.f21879b = context;
            this.f21881d = str;
            this.f21880c = str2;
            this.f21882e = str3;
            this.f21883f = campaignEx;
            this.f21884g = i;
            this.f21885h = handler;
            this.f21886i = iVar;
            this.f21887j = list;
            this.f21888k = System.currentTimeMillis();
        }

        /* renamed from: a */
        public final void mo60950a(boolean z) {
            this.f21878a = z;
        }

        /* renamed from: a */
        public final void mo57995a(String str) {
            C9575i.m27485a().mo63251b(str, true);
            long currentTimeMillis = System.currentTimeMillis() - this.f21888k;
            int i = this.f21884g;
            if (i == 313) {
                Message obtain = Message.obtain();
                obtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f21880c);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f21881d);
                bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f21882e);
                bundle.putString("url", str);
                obtain.setData(bundle);
                this.f21885h.sendMessage(obtain);
            } else if (i == 497) {
                Message obtain2 = Message.obtain();
                obtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f21880c);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f21881d);
                bundle2.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f21882e);
                bundle2.putString("url", str);
                obtain2.setData(bundle2);
                this.f21885h.sendMessage(obtain2);
                if (this.f21878a) {
                    try {
                        C8412m mVar = new C8412m("2000043", 14, currentTimeMillis + "", str, this.f21883f.getId(), this.f21880c, "", "1");
                        mVar.mo57463k(this.f21883f.getRequestId());
                        mVar.mo57465l(this.f21883f.getRequestIdNotice());
                        mVar.mo57469n(this.f21883f.getId());
                        mVar.mo57442b(this.f21883f.getAdSpaceT());
                        if (this.f21883f.getAdType() == 287) {
                            mVar.mo57457h("3");
                        } else if (this.f21883f.getAdType() == 94) {
                            mVar.mo57457h("1");
                        }
                        C8524c.m24636a(mVar, this.f21880c);
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            C8608u.m24884d("RewardCampaignsResourceManager", e.getLocalizedMessage());
                        }
                    }
                }
            } else if (i == 859) {
                Message obtain3 = Message.obtain();
                obtain3.what = 103;
                Bundle bundle3 = new Bundle();
                bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f21880c);
                bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f21881d);
                bundle3.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f21882e);
                obtain3.setData(bundle3);
                this.f21885h.sendMessage(obtain3);
                C9083i iVar = this.f21886i;
                if (iVar != null) {
                    iVar.mo60923a(this.f21881d, this.f21880c, this.f21882e, str);
                }
                try {
                    C8412m mVar2 = new C8412m();
                    mVar2.mo57471o("2000045");
                    if (this.f21879b != null) {
                        mVar2.mo57445c(C8596q.m24849n(this.f21879b.getApplicationContext()));
                    }
                    mVar2.mo57448d(1);
                    if (this.f21883f != null) {
                        mVar2.mo57469n(this.f21883f.getId());
                        mVar2.mo57463k(this.f21883f.getRequestId());
                        mVar2.mo57465l(this.f21883f.getRequestIdNotice());
                    }
                    mVar2.mo57459i(str);
                    mVar2.mo57473p("");
                    mVar2.mo57467m(this.f21880c);
                    C2385p.m5777a((C2374f) C2376g.m5723a(C2350a.m5601e().mo15792g())).mo15934a(mVar2);
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        C8608u.m24884d("RewardCampaignsResourceManager", e2.getLocalizedMessage());
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo57996a(String str, String str2) {
            C9575i.m27485a().mo63251b(str2, false);
            long currentTimeMillis = System.currentTimeMillis() - this.f21888k;
            int i = this.f21884g;
            if (i == 313) {
                Message obtain = Message.obtain();
                obtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f21880c);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f21881d);
                bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f21882e);
                bundle.putString("url", str2);
                bundle.putString("message", str);
                obtain.setData(bundle);
                this.f21885h.sendMessage(obtain);
            } else if (i == 497) {
                Message obtain2 = Message.obtain();
                obtain2.what = ErrorCode.DIFFERENT_LINEARITY_EXPECTED_ERROR;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f21880c);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f21881d);
                bundle2.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f21882e);
                bundle2.putString("url", str2);
                bundle2.putString("message", str);
                obtain2.setData(bundle2);
                this.f21885h.sendMessage(obtain2);
                if (this.f21878a) {
                    try {
                        C8412m mVar = new C8412m("2000043", 3, currentTimeMillis + "", str2, this.f21883f.getId(), this.f21880c, "zip download failed", "1");
                        mVar.mo57463k(this.f21883f.getRequestId());
                        mVar.mo57465l(this.f21883f.getRequestIdNotice());
                        mVar.mo57469n(this.f21883f.getId());
                        mVar.mo57442b(this.f21883f.getAdSpaceT());
                        if (this.f21883f.getAdType() == 287) {
                            mVar.mo57457h("3");
                        } else if (this.f21883f.getAdType() == 94) {
                            mVar.mo57457h("1");
                        }
                        C8524c.m24636a(mVar, this.f21880c);
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            C8608u.m24884d("RewardCampaignsResourceManager", e.getLocalizedMessage());
                        }
                    }
                }
            } else if (i == 859) {
                Message obtain3 = Message.obtain();
                obtain3.what = ErrorCode.DIFFERENT_SIZE_EXPECTED_ERROR;
                Bundle bundle3 = new Bundle();
                bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f21880c);
                bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f21881d);
                bundle3.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f21882e);
                bundle3.putString("url", str2);
                bundle3.putString("message", str);
                obtain3.setData(bundle3);
                this.f21885h.sendMessage(obtain3);
                C9083i iVar = this.f21886i;
                if (iVar != null) {
                    iVar.mo60924a(this.f21881d, this.f21880c, this.f21882e, str2, str);
                }
                try {
                    C8412m mVar2 = new C8412m();
                    mVar2.mo57471o("2000045");
                    if (this.f21879b != null) {
                        mVar2.mo57445c(C8596q.m24849n(this.f21879b.getApplicationContext()));
                    }
                    mVar2.mo57448d(3);
                    if (this.f21883f != null) {
                        mVar2.mo57469n(this.f21883f.getId());
                        mVar2.mo57463k(this.f21883f.getRequestId());
                        mVar2.mo57465l(this.f21883f.getRequestIdNotice());
                    }
                    mVar2.mo57459i(str2);
                    mVar2.mo57473p(str);
                    mVar2.mo57467m(this.f21880c);
                    C2385p.m5777a((C2374f) C2376g.m5723a(C2350a.m5601e().mo15792g())).mo15934a(mVar2);
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        C8608u.m24884d("RewardCampaignsResourceManager", e2.getLocalizedMessage());
                    }
                }
            }
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.c$d */
    /* compiled from: RewardCampaignsResourceManager */
    private static final class C9077d implements C9563g.C9569b {

        /* renamed from: a */
        private boolean f21856a = false;

        /* renamed from: b */
        private int f21857b;

        /* renamed from: c */
        private final String f21858c;

        /* renamed from: d */
        private final String f21859d;

        /* renamed from: e */
        private final String f21860e;

        /* renamed from: f */
        private CampaignEx f21861f;

        /* renamed from: g */
        private C9083i f21862g;

        /* renamed from: h */
        private Handler f21863h;

        /* renamed from: i */
        private List<CampaignEx> f21864i;

        /* renamed from: j */
        private final long f21865j;

        public C9077d(int i, String str, String str2, String str3, CampaignEx campaignEx, C9083i iVar, Handler handler, List<CampaignEx> list) {
            this.f21857b = i;
            this.f21858c = str;
            this.f21859d = str2;
            this.f21860e = str3;
            this.f21861f = campaignEx;
            this.f21862g = iVar;
            this.f21863h = handler;
            this.f21864i = list;
            this.f21865j = System.currentTimeMillis();
        }

        /* renamed from: a */
        public final void mo60948a(boolean z) {
            this.f21856a = z;
        }

        /* renamed from: a */
        public final void mo57995a(String str) {
            C9575i.m27485a().mo63251b(str, true);
            int i = this.f21857b;
            if (i == 313) {
                Message obtain = Message.obtain();
                obtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f21859d);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f21858c);
                bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f21860e);
                bundle.putString("url", str);
                obtain.setData(bundle);
                this.f21863h.sendMessage(obtain);
            } else if (i == 497) {
                Message obtain2 = Message.obtain();
                obtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f21859d);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f21858c);
                bundle2.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f21860e);
                bundle2.putString("url", str);
                obtain2.setData(bundle2);
                this.f21863h.sendMessage(obtain2);
                if (this.f21856a) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f21865j;
                    try {
                        C8412m mVar = new C8412m("2000043", 20, currentTimeMillis + "", str, this.f21861f.getId(), this.f21859d, "", "2");
                        mVar.mo57463k(this.f21861f.getRequestId());
                        mVar.mo57465l(this.f21861f.getRequestIdNotice());
                        mVar.mo57469n(this.f21861f.getId());
                        mVar.mo57442b(this.f21861f.getAdSpaceT());
                        if (this.f21861f.getAdType() == 287) {
                            mVar.mo57457h("3");
                        } else if (this.f21861f.getAdType() == 94) {
                            mVar.mo57457h("1");
                        }
                        C8524c.m24636a(mVar, this.f21859d);
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            C8608u.m24884d("RewardCampaignsResourceManager", e.getLocalizedMessage());
                        }
                    }
                }
            } else if (i == 859) {
                Message obtain3 = Message.obtain();
                obtain3.what = 105;
                Bundle bundle3 = new Bundle();
                bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f21859d);
                bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f21858c);
                bundle3.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f21860e);
                obtain3.setData(bundle3);
                this.f21863h.sendMessage(obtain3);
                C9083i iVar = this.f21862g;
                if (iVar != null) {
                    iVar.mo60923a(this.f21858c, this.f21859d, this.f21860e, str);
                }
            }
        }

        /* renamed from: a */
        public final void mo57996a(String str, String str2) {
            C9575i.m27485a().mo63251b(str, false);
            int i = this.f21857b;
            if (i == 313) {
                Message obtain = Message.obtain();
                obtain.what = ErrorCode.DIFFERENT_LINEARITY_EXPECTED_ERROR;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f21859d);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f21858c);
                bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f21860e);
                bundle.putString("url", str);
                bundle.putString("message", str2);
                obtain.setData(bundle);
                this.f21863h.sendMessage(obtain);
            } else if (i == 497) {
                Message obtain2 = Message.obtain();
                obtain2.what = ErrorCode.DIFFERENT_LINEARITY_EXPECTED_ERROR;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f21859d);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f21858c);
                bundle2.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f21860e);
                bundle2.putString("url", str);
                bundle2.putString("message", str2);
                obtain2.setData(bundle2);
                this.f21863h.sendMessage(obtain2);
                if (this.f21856a) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f21865j;
                    try {
                        C8412m mVar = new C8412m("2000043", 21, currentTimeMillis + "", str, this.f21861f.getId(), this.f21859d, "url download failed", "2");
                        mVar.mo57463k(this.f21861f.getRequestId());
                        mVar.mo57465l(this.f21861f.getRequestIdNotice());
                        mVar.mo57469n(this.f21861f.getId());
                        mVar.mo57442b(this.f21861f.getAdSpaceT());
                        if (this.f21861f.getAdType() == 287) {
                            mVar.mo57457h("3");
                        } else if (this.f21861f.getAdType() == 94) {
                            mVar.mo57457h("1");
                        }
                        C8524c.m24636a(mVar, this.f21859d);
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            C8608u.m24884d("RewardCampaignsResourceManager", e.getLocalizedMessage());
                        }
                    }
                }
            } else if (i == 859) {
                Message obtain3 = Message.obtain();
                obtain3.what = ErrorCode.INLINE_CATEGORY_VIOLATES_BLOCKED_CATEGORIES_ERROR;
                Bundle bundle3 = new Bundle();
                bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f21859d);
                bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f21858c);
                bundle3.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f21860e);
                bundle3.putString("message", str2);
                obtain3.setData(bundle3);
                this.f21863h.sendMessage(obtain3);
                C9083i iVar = this.f21862g;
                if (iVar != null) {
                    iVar.mo60924a(this.f21858c, this.f21859d, this.f21860e, str, str2);
                }
            }
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.c$h */
    /* compiled from: RewardCampaignsResourceManager */
    private static final class C9082h extends Handler {

        /* renamed from: a */
        private Context f21889a;

        /* renamed from: b */
        private ConcurrentHashMap<String, C9076c> f21890b = new ConcurrentHashMap<>();

        /* renamed from: c */
        private ConcurrentHashMap<String, List<CampaignEx>> f21891c = new ConcurrentHashMap<>();

        public C9082h(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final void mo60952a(String str, String str2, String str3, C9076c cVar) {
            ConcurrentHashMap<String, C9076c> concurrentHashMap = this.f21890b;
            concurrentHashMap.put(str2 + "_" + str3, cVar);
        }

        /* renamed from: a */
        public final void mo60951a(Context context) {
            this.f21889a = context;
        }

        /* renamed from: a */
        public final void mo60953a(String str, List<CampaignEx> list) {
            this.f21891c.put(str, list);
        }

        public final void handleMessage(Message message) {
            boolean z;
            String str;
            Message message2 = message;
            Bundle data = message.getData();
            String string = data.getString(MBridgeConstans.PLACEMENT_ID);
            String string2 = data.getString(MBridgeConstans.PROPERTIES_UNIT_ID);
            String string3 = data.getString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID);
            String str2 = string2 + "_" + string3;
            C9074a aVar = (C9074a) C9070c.f21799c.get(str2);
            C9076c cVar = this.f21890b.get(str2);
            List list = this.f21891c.get(str2);
            int i = message2.what;
            switch (i) {
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                    break;
                default:
                    switch (i) {
                        case 200:
                        case ErrorCode.DIFFERENT_LINEARITY_EXPECTED_ERROR /*201*/:
                        case ErrorCode.DIFFERENT_SIZE_EXPECTED_ERROR /*203*/:
                        case ErrorCode.INLINE_CATEGORY_VIOLATES_BLOCKED_CATEGORIES_ERROR /*205*/:
                            if (aVar != null && cVar != null) {
                                String string4 = data.getString("message");
                                if (string4 == null) {
                                    string4 = "";
                                }
                                String str3 = "resource download failed " + C9070c.m25982b(message2.what) + " " + string4;
                                CampaignEx campaignEx = null;
                                if (aVar.f21834h != null && aVar.f21834h.size() > 0) {
                                    campaignEx = aVar.f21834h.get(0);
                                }
                                try {
                                    if (!aVar.f21827a || aVar.f21835i == null) {
                                        str = "resource download failed ";
                                        try {
                                            if (C9556c.getInstance().mo63229a(94, aVar.f21831e, aVar.f21828b, aVar.f21830d, aVar.f21827a, aVar.f21829c, list)) {
                                                cVar.mo60917a(string, string2, string3, aVar.f21834h);
                                            } else {
                                                if (!(campaignEx == null || campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0)) {
                                                    int i2 = message2.what;
                                                    if (i2 != 200) {
                                                        if (i2 != 201) {
                                                            if (i2 != 203) {
                                                                if (i2 == 205) {
                                                                    if (campaignEx.getRsIgnoreCheckRule().contains(3)) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if (campaignEx.getRsIgnoreCheckRule().contains(1)) {
                                                                return;
                                                            }
                                                        } else if (campaignEx.getRsIgnoreCheckRule().contains(2)) {
                                                            return;
                                                        }
                                                    } else if (campaignEx.getRsIgnoreCheckRule().contains(0)) {
                                                        return;
                                                    }
                                                }
                                                cVar.mo60918a(string, string2, string3, aVar.f21834h, str3);
                                            }
                                            this.f21890b.remove(str2);
                                            C9070c.f21799c.remove(str2);
                                            this.f21891c.remove(str2);
                                            return;
                                        } catch (Exception e) {
                                            e = e;
                                            cVar.mo60918a(string, string2, string3, aVar.f21834h, str + e.getMessage());
                                            return;
                                        }
                                    } else if (aVar.f21829c == 1) {
                                        if (!(campaignEx == null || campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0)) {
                                            int i3 = message2.what;
                                            if (i3 != 200) {
                                                if (i3 != 201) {
                                                    if (i3 != 203) {
                                                        if (i3 == 205) {
                                                            if (!campaignEx.getRsIgnoreCheckRule().contains(3)) {
                                                                if (aVar.f21834h != null && aVar.f21834h.size() > 0) {
                                                                    CampaignEx campaignEx2 = aVar.f21834h.get(0);
                                                                    if (campaignEx2.getCMPTEntryUrl().equals(campaignEx2.getendcard_url()) && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else {
                                                                return;
                                                            }
                                                        }
                                                    } else if (campaignEx.getRsIgnoreCheckRule().contains(1)) {
                                                        return;
                                                    }
                                                } else if (campaignEx.getRsIgnoreCheckRule().contains(2)) {
                                                    return;
                                                }
                                            } else if (campaignEx.getRsIgnoreCheckRule().contains(0)) {
                                                return;
                                            }
                                        }
                                        cVar.mo60918a(string, string2, string3, aVar.f21834h, str3);
                                        this.f21890b.remove(str2);
                                        C9070c.f21799c.remove(str2);
                                        this.f21891c.remove(str2);
                                        return;
                                    } else {
                                        String string5 = data.getString("url");
                                        int i4 = message2.what;
                                        if (i4 != 200) {
                                            if (i4 != 201) {
                                                if (i4 != 203) {
                                                    if (i4 == 205) {
                                                        if (campaignEx == null || campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(3)) {
                                                            aVar.f21835i.clear();
                                                            C9070c.f21799c.remove(str2);
                                                            C9070c.f21799c.put(str2, aVar);
                                                        } else {
                                                            C8608u.m24882b("RewardCampaignsResourceManager", "Is TPL but download BTL Template fail but hit ignoreCheckRule");
                                                            return;
                                                        }
                                                    }
                                                } else if (campaignEx == null || campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(1)) {
                                                    for (int i5 = 0; i5 < aVar.f21835i.size(); i5++) {
                                                        CampaignEx campaignEx3 = aVar.f21835i.get(i5);
                                                        if (campaignEx3.getRewardTemplateMode() != null && campaignEx3.getRewardTemplateMode().mo57205e().equals(string5)) {
                                                            aVar.f21835i.remove(i5);
                                                        }
                                                    }
                                                    C9070c.f21799c.remove(str2);
                                                    C9070c.f21799c.put(str2, aVar);
                                                } else {
                                                    C8608u.m24882b("RewardCampaignsResourceManager", "Is TPL but download template fail but hit ignoreCheckRule");
                                                    return;
                                                }
                                            } else if (campaignEx == null || campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(2)) {
                                                for (int i6 = 0; i6 < aVar.f21835i.size(); i6++) {
                                                    CampaignEx campaignEx4 = aVar.f21835i.get(i6);
                                                    if (campaignEx4.getRewardTemplateMode() != null && campaignEx4.getRewardTemplateMode().mo57204d().equals(string5)) {
                                                        aVar.f21835i.remove(i6);
                                                    }
                                                    if (campaignEx4.getendcard_url().equals(string5)) {
                                                        aVar.f21835i.remove(i6);
                                                    }
                                                }
                                                C9070c.f21799c.remove(str2);
                                                C9070c.f21799c.put(str2, aVar);
                                            } else {
                                                C8608u.m24882b("RewardCampaignsResourceManager", "Is TPL but download endcard fail but hit ignoreCheckRule");
                                                return;
                                            }
                                        } else if (campaignEx == null || campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(0)) {
                                            for (int i7 = 0; i7 < aVar.f21835i.size(); i7++) {
                                                if (aVar.f21835i.get(i7).getVideoUrlEncode().equals(string5)) {
                                                    aVar.f21835i.remove(i7);
                                                }
                                            }
                                            C9070c.f21799c.remove(str2);
                                            C9070c.f21799c.put(str2, aVar);
                                        } else {
                                            C8608u.m24882b("RewardCampaignsResourceManager", "Is TPL but  video download fail but hit ignoreCheckRule");
                                            return;
                                        }
                                        C9556c instance = C9556c.getInstance();
                                        String str4 = aVar.f21831e;
                                        String str5 = "resource download failed ";
                                        try {
                                            if (instance.mo63229a(94, str4, aVar.f21828b, aVar.f21830d, aVar.f21827a, aVar.f21829c, list)) {
                                                cVar.mo60917a(string, string2, string3, aVar.f21834h);
                                                this.f21890b.remove(str2);
                                                C9070c.f21799c.remove(str2);
                                                this.f21891c.remove(str2);
                                                return;
                                            } else if (aVar.f21835i.size() == 0) {
                                                str4 = str5;
                                                try {
                                                    cVar.mo60918a(string, string2, string3, aVar.f21834h, str3);
                                                    this.f21890b.remove(str2);
                                                    C9070c.f21799c.remove(str2);
                                                    this.f21891c.remove(str2);
                                                    return;
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    str = str4;
                                                    cVar.mo60918a(string, string2, string3, aVar.f21834h, str + e.getMessage());
                                                    return;
                                                }
                                            } else {
                                                return;
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                            str = str5;
                                            cVar.mo60918a(string, string2, string3, aVar.f21834h, str + e.getMessage());
                                            return;
                                        }
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    str = "resource download failed ";
                                    cVar.mo60918a(string, string2, string3, aVar.f21834h, str + e.getMessage());
                                    return;
                                }
                            } else {
                                return;
                            }
                        case ErrorCode.DIFFERENT_DURATION_EXPECTED_ERROR /*202*/:
                        case 204:
                            break;
                        default:
                            return;
                    }
            }
            if (aVar != null && cVar != null) {
                try {
                    z = C9556c.getInstance().mo63229a(94, aVar.f21831e, aVar.f21828b, aVar.f21830d, aVar.f21827a, aVar.f21829c, list);
                } catch (Exception e5) {
                    if (MBridgeConstans.DEBUG) {
                        C8608u.m24884d("RewardCampaignsResourceManager", e5.getLocalizedMessage());
                    }
                    z = false;
                }
                if (z) {
                    cVar.mo60917a(string, string2, string3, aVar.f21834h);
                    this.f21890b.remove(str2);
                    C9070c.f21799c.remove(str2);
                    this.f21891c.remove(str2);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x005a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00d4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0151 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0182 A[Catch:{ Exception -> 0x01e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0188 A[Catch:{ Exception -> 0x01e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01f7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo60944a(boolean r24, android.os.Handler r25, boolean r26, boolean r27, com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r28, java.lang.String r29, int r30, com.mbridge.msdk.foundation.entity.CampaignEx r31, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, com.mbridge.msdk.videocommon.p373d.C9551c r38, com.mbridge.msdk.reward.adapter.C9070c.C9084j r39) {
        /*
            r23 = this;
            r15 = r29
            r13 = r31
            r0 = r32
            r14 = r35
            r12 = r36
            monitor-enter(r23)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x020d }
            r1.<init>()     // Catch:{ all -> 0x020d }
            r1.append(r14)     // Catch:{ all -> 0x020d }
            java.lang.String r2 = "_"
            r1.append(r2)     // Catch:{ all -> 0x020d }
            r1.append(r15)     // Catch:{ all -> 0x020d }
            java.lang.String r17 = r1.toString()     // Catch:{ all -> 0x020d }
            long r18 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x020d }
            boolean r1 = com.mbridge.msdk.foundation.tools.C8613y.m24947f((java.lang.String) r29)     // Catch:{ Exception -> 0x01e6 }
            if (r1 == 0) goto L_0x003d
            if (r39 == 0) goto L_0x003b
            r7 = 0
            r1 = r39
            r2 = r17
            r3 = r34
            r4 = r35
            r5 = r36
            r6 = r29
            r1.mo60920a(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x01e6 }
        L_0x003b:
            monitor-exit(r23)
            return
        L_0x003d:
            com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ Exception -> 0x005a }
            android.content.Context r2 = r1.mo15792g()     // Catch:{ Exception -> 0x005a }
            java.lang.String r3 = "start preload template "
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x005a }
            long r8 = r4 - r18
            r1 = r31
            r4 = r35
            r5 = r27
            r6 = r36
            r7 = r37
            com.mbridge.msdk.reward.p342b.C9112a.m26119a(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x005a }
        L_0x005a:
            com.mbridge.msdk.videocommon.a$a r11 = new com.mbridge.msdk.videocommon.a$a     // Catch:{ Exception -> 0x01e6 }
            r11.<init>()     // Catch:{ Exception -> 0x01e6 }
            com.mbridge.msdk.reward.adapter.c r1 = com.mbridge.msdk.reward.adapter.C9070c.C9089m.f21941a     // Catch:{ Exception -> 0x01e6 }
            r2 = 0
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r1 = r1.m25976a((boolean) r2)     // Catch:{ Exception -> 0x01e6 }
            if (r1 != 0) goto L_0x0175
            r1 = 1
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r2 = new com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView     // Catch:{ Exception -> 0x00f8, all -> 0x007b }
            com.mbridge.msdk.foundation.controller.a r3 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ Exception -> 0x00f8, all -> 0x007b }
            android.content.Context r3 = r3.mo15792g()     // Catch:{ Exception -> 0x00f8, all -> 0x007b }
            r2.<init>(r3)     // Catch:{ Exception -> 0x00f8, all -> 0x007b }
            r10 = r2
            goto L_0x0176
        L_0x007b:
            r0 = move-exception
            if (r39 == 0) goto L_0x00f6
            r11.mo63073a((boolean) r1)     // Catch:{ Exception -> 0x01e6 }
            com.mbridge.msdk.videocommon.download.i r2 = com.mbridge.msdk.videocommon.download.C9575i.m27485a()     // Catch:{ Exception -> 0x01e6 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e6 }
            r3.<init>()     // Catch:{ Exception -> 0x01e6 }
            r3.append(r14)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r4 = "_"
            r3.append(r4)     // Catch:{ Exception -> 0x01e6 }
            r3.append(r12)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r4 = "_"
            r3.append(r4)     // Catch:{ Exception -> 0x01e6 }
            r3.append(r15)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01e6 }
            r2.mo63255d(r3, r1)     // Catch:{ Exception -> 0x01e6 }
            com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ Exception -> 0x00d4 }
            android.content.Context r2 = r1.mo15792g()     // Catch:{ Exception -> 0x00d4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d4 }
            r1.<init>()     // Catch:{ Exception -> 0x00d4 }
            java.lang.String r3 = "WebView exception: "
            r1.append(r3)     // Catch:{ Exception -> 0x00d4 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x00d4 }
            r1.append(r0)     // Catch:{ Exception -> 0x00d4 }
            java.lang.String r3 = r1.toString()     // Catch:{ Exception -> 0x00d4 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00d4 }
            long r8 = r0 - r18
            r1 = r31
            r4 = r35
            r5 = r27
            r6 = r36
            r7 = r37
            com.mbridge.msdk.reward.p342b.C9112a.m26119a(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00d4 }
        L_0x00d4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e6 }
            r0.<init>()     // Catch:{ Exception -> 0x01e6 }
            r0.append(r14)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r1 = "_"
            r0.append(r1)     // Catch:{ Exception -> 0x01e6 }
            r0.append(r15)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r2 = r0.toString()     // Catch:{ Exception -> 0x01e6 }
            r1 = r39
            r3 = r34
            r4 = r35
            r5 = r36
            r6 = r29
            r7 = r11
            r1.mo60920a(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x01e6 }
        L_0x00f6:
            monitor-exit(r23)
            return
        L_0x00f8:
            r0 = move-exception
            if (r39 == 0) goto L_0x0173
            r11.mo63073a((boolean) r1)     // Catch:{ Exception -> 0x01e6 }
            com.mbridge.msdk.videocommon.download.i r2 = com.mbridge.msdk.videocommon.download.C9575i.m27485a()     // Catch:{ Exception -> 0x01e6 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e6 }
            r3.<init>()     // Catch:{ Exception -> 0x01e6 }
            r3.append(r14)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r4 = "_"
            r3.append(r4)     // Catch:{ Exception -> 0x01e6 }
            r3.append(r12)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r4 = "_"
            r3.append(r4)     // Catch:{ Exception -> 0x01e6 }
            r3.append(r15)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01e6 }
            r2.mo63255d(r3, r1)     // Catch:{ Exception -> 0x01e6 }
            com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ Exception -> 0x0151 }
            android.content.Context r2 = r1.mo15792g()     // Catch:{ Exception -> 0x0151 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0151 }
            r1.<init>()     // Catch:{ Exception -> 0x0151 }
            java.lang.String r3 = "WebView exception: "
            r1.append(r3)     // Catch:{ Exception -> 0x0151 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x0151 }
            r1.append(r0)     // Catch:{ Exception -> 0x0151 }
            java.lang.String r3 = r1.toString()     // Catch:{ Exception -> 0x0151 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0151 }
            long r8 = r0 - r18
            r1 = r31
            r4 = r35
            r5 = r27
            r6 = r36
            r7 = r37
            com.mbridge.msdk.reward.p342b.C9112a.m26119a(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0151 }
        L_0x0151:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e6 }
            r0.<init>()     // Catch:{ Exception -> 0x01e6 }
            r0.append(r14)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r1 = "_"
            r0.append(r1)     // Catch:{ Exception -> 0x01e6 }
            r0.append(r15)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r2 = r0.toString()     // Catch:{ Exception -> 0x01e6 }
            r1 = r39
            r3 = r34
            r4 = r35
            r5 = r36
            r6 = r29
            r7 = r11
            r1.mo60920a(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x01e6 }
        L_0x0173:
            monitor-exit(r23)
            return
        L_0x0175:
            r10 = r1
        L_0x0176:
            r11.mo63071a((com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView) r10)     // Catch:{ Exception -> 0x01e6 }
            r1 = 0
            if (r0 == 0) goto L_0x0188
            int r2 = r32.size()     // Catch:{ Exception -> 0x01e6 }
            if (r2 <= 0) goto L_0x0188
            com.mbridge.msdk.video.signal.a.j r2 = new com.mbridge.msdk.video.signal.a.j     // Catch:{ Exception -> 0x01e6 }
            r2.<init>(r1, r13, r0)     // Catch:{ Exception -> 0x01e6 }
            goto L_0x018d
        L_0x0188:
            com.mbridge.msdk.video.signal.a.j r2 = new com.mbridge.msdk.video.signal.a.j     // Catch:{ Exception -> 0x01e6 }
            r2.<init>(r1, r13)     // Catch:{ Exception -> 0x01e6 }
        L_0x018d:
            r1 = r30
            r9 = r2
            r9.mo62811a((int) r1)     // Catch:{ Exception -> 0x01e6 }
            r9.mo62816a((java.lang.String) r14)     // Catch:{ Exception -> 0x01e6 }
            r1 = r38
            r9.mo62815a((com.mbridge.msdk.videocommon.p373d.C9551c) r1)     // Catch:{ Exception -> 0x01e6 }
            r1 = r24
            r9.mo62853d((boolean) r1)     // Catch:{ Exception -> 0x01e6 }
            com.mbridge.msdk.reward.adapter.c$k r8 = new com.mbridge.msdk.reward.adapter.c$k     // Catch:{ Exception -> 0x01e6 }
            r3 = 0
            r1 = r8
            r2 = r25
            r4 = r26
            r5 = r27
            r6 = r36
            r7 = r39
            r20 = r8
            r8 = r28
            r21 = r9
            r9 = r29
            r22 = r10
            r10 = r34
            r16 = r11
            r11 = r35
            r12 = r16
            r13 = r31
            r14 = r32
            r15 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x01e2 }
            r0 = r20
            r1 = r22
            r1.setWebViewListener(r0)     // Catch:{ Exception -> 0x01e2 }
            r2 = r21
            r1.setObject(r2)     // Catch:{ Exception -> 0x01e2 }
            r0 = r33
            r1.loadUrl(r0)     // Catch:{ Exception -> 0x01e2 }
            r5 = r36
            r1.setRid(r5)     // Catch:{ Exception -> 0x01e0 }
            goto L_0x020b
        L_0x01e0:
            r0 = move-exception
            goto L_0x01e8
        L_0x01e2:
            r0 = move-exception
            r5 = r36
            goto L_0x01e8
        L_0x01e6:
            r0 = move-exception
            r5 = r12
        L_0x01e8:
            boolean r1 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch:{ all -> 0x020d }
            if (r1 == 0) goto L_0x01f5
            java.lang.String r1 = "RewardCampaignsResourceManager"
            java.lang.String r2 = r0.getLocalizedMessage()     // Catch:{ all -> 0x020d }
            com.mbridge.msdk.foundation.tools.C8608u.m24884d(r1, r2)     // Catch:{ all -> 0x020d }
        L_0x01f5:
            if (r39 == 0) goto L_0x020b
            r7 = 0
            java.lang.String r8 = r0.getLocalizedMessage()     // Catch:{ all -> 0x020d }
            r1 = r39
            r2 = r17
            r3 = r34
            r4 = r35
            r5 = r36
            r6 = r29
            r1.mo60921a(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x020d }
        L_0x020b:
            monitor-exit(r23)
            return
        L_0x020d:
            r0 = move-exception
            monitor-exit(r23)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.C9070c.mo60944a(boolean, android.os.Handler, boolean, boolean, com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView, java.lang.String, int, com.mbridge.msdk.foundation.entity.CampaignEx, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.mbridge.msdk.videocommon.d.c, com.mbridge.msdk.reward.adapter.c$j):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static synchronized String m25982b(int i) {
        synchronized (C9070c.class) {
            if (i == 200) {
                return "video";
            }
            if (i == 201) {
                return "zip/html";
            }
            if (i != 203) {
                return i != 205 ? "unknown" : "tpl";
            }
            return "temp";
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.c$k */
    /* compiled from: RewardCampaignsResourceManager */
    private static class C9085k extends C8790b {

        /* renamed from: a */
        private Handler f21892a;

        /* renamed from: b */
        private Runnable f21893b;

        /* renamed from: c */
        private final boolean f21894c;

        /* renamed from: d */
        private final boolean f21895d;

        /* renamed from: e */
        private String f21896e;

        /* renamed from: f */
        private final C9084j f21897f;

        /* renamed from: g */
        private final WindVaneWebView f21898g;

        /* renamed from: h */
        private final String f21899h;

        /* renamed from: i */
        private final String f21900i;

        /* renamed from: j */
        private final String f21901j;

        /* renamed from: k */
        private final C9536a.C9537a f21902k;

        /* renamed from: l */
        private final CampaignEx f21903l;

        /* renamed from: m */
        private List<CampaignEx> f21904m;

        /* renamed from: n */
        private long f21905n;

        /* renamed from: o */
        private boolean f21906o;

        /* renamed from: p */
        private boolean f21907p;

        /* renamed from: q */
        private final Runnable f21908q;

        /* renamed from: r */
        private final Runnable f21909r;

        public C9085k(Handler handler, Runnable runnable, boolean z, boolean z2, String str, C9084j jVar, WindVaneWebView windVaneWebView, String str2, String str3, String str4, C9536a.C9537a aVar, CampaignEx campaignEx, List<CampaignEx> list, long j) {
            Handler handler2 = handler;
            this.f21892a = handler2;
            this.f21893b = runnable;
            this.f21894c = z;
            this.f21895d = z2;
            this.f21896e = str;
            this.f21897f = jVar;
            this.f21898g = windVaneWebView;
            this.f21899h = str2;
            this.f21900i = str4;
            this.f21901j = str3;
            this.f21902k = aVar;
            this.f21903l = campaignEx;
            this.f21904m = list;
            this.f21905n = j;
            final C9084j jVar2 = jVar;
            C90861 r14 = r0;
            final C9536a.C9537a aVar2 = aVar;
            final String str5 = str4;
            final String str6 = str;
            final String str7 = str2;
            final CampaignEx campaignEx2 = campaignEx;
            final boolean z3 = z2;
            final long j2 = j;
            final String str8 = str3;
            C90861 r0 = new Runnable() {
                public final void run() {
                    WindVaneWebView a;
                    C9536a.C9537a aVar;
                    if (!(jVar2 == null || (aVar = aVar2) == null)) {
                        aVar.mo63073a(true);
                        C9575i a2 = C9575i.m27485a();
                        a2.mo63255d(str5 + "_" + str6 + "_" + str7, true);
                        try {
                            C9112a.m26119a(campaignEx2, C2350a.m5601e().mo15792g(), "WebView onPageFinish timeout exception after 5s", str5, z3, str6, campaignEx2.getRequestIdNotice(), System.currentTimeMillis() - j2);
                        } catch (Exception unused) {
                        }
                        C9084j jVar = jVar2;
                        jVar.mo60920a(str5 + "_" + str7, str8, str5, str6, str7, aVar2);
                    }
                    C9536a.C9537a aVar2 = aVar2;
                    if (aVar2 != null && (a = aVar2.mo63070a()) != null) {
                        try {
                            a.release();
                        } catch (Exception unused2) {
                        }
                    }
                }
            };
            this.f21909r = r14;
            this.f21908q = new Runnable() {
                public final void run() {
                    WindVaneWebView a;
                    C9536a.C9537a aVar;
                    if (!(jVar2 == null || (aVar = aVar2) == null)) {
                        aVar.mo63073a(true);
                        C9575i a2 = C9575i.m27485a();
                        a2.mo63255d(str5 + "_" + str6 + "_" + str7, true);
                        try {
                            C9112a.m26119a(campaignEx2, C2350a.m5601e().mo15792g(), "WebView readyState timeout exception after 5s", str5, z3, str6, campaignEx2.getRequestIdNotice(), System.currentTimeMillis() - j2);
                        } catch (Exception unused) {
                        }
                        C9084j jVar = jVar2;
                        jVar.mo60920a(str5 + "_" + str7, str8, str5, str6, str7, aVar2);
                    }
                    C9536a.C9537a aVar2 = aVar2;
                    if (aVar2 != null && (a = aVar2.mo63070a()) != null) {
                        try {
                            a.release();
                        } catch (Exception unused2) {
                        }
                    }
                }
            };
            if (handler2 != null) {
                handler2.postDelayed(this.f21909r, 5000);
            }
        }

        /* renamed from: a */
        public final void mo57899a(WebView webView, int i) {
            Handler handler;
            Runnable runnable;
            Runnable runnable2;
            super.mo57899a(webView, i);
            Handler handler2 = this.f21892a;
            if (!(handler2 == null || (runnable2 = this.f21908q) == null)) {
                handler2.removeCallbacks(runnable2);
            }
            Handler handler3 = this.f21892a;
            if (!(handler3 == null || (runnable = this.f21909r) == null)) {
                handler3.removeCallbacks(runnable);
            }
            if (!this.f21907p) {
                try {
                    C9112a.m26119a(this.f21903l, C2350a.m5601e().mo15792g(), "preload temp readState: " + i, this.f21900i, this.f21895d, this.f21896e, this.f21903l.getRequestIdNotice(), System.currentTimeMillis() - this.f21905n);
                } catch (Exception unused) {
                }
                String str = this.f21900i + "_" + this.f21899h;
                if (i == 1) {
                    Runnable runnable3 = this.f21893b;
                    if (!(runnable3 == null || (handler = this.f21892a) == null)) {
                        handler.removeCallbacks(runnable3);
                    }
                    C9575i.m27485a().mo63255d(this.f21900i + "_" + this.f21896e + "_" + this.f21899h, true);
                    C9536a.C9537a aVar = this.f21902k;
                    if (aVar != null) {
                        aVar.mo63073a(true);
                    }
                    if (this.f21894c) {
                        if (this.f21895d) {
                            C9536a.m27224a(287, this.f21903l.getRequestIdNotice(), this.f21902k);
                        } else {
                            C9536a.m27227b(287, this.f21903l.getRequestIdNotice(), this.f21902k);
                        }
                    } else if (this.f21895d) {
                        C9536a.m27224a(94, this.f21903l.getRequestIdNotice(), this.f21902k);
                    } else {
                        C9536a.m27227b(94, this.f21903l.getRequestIdNotice(), this.f21902k);
                    }
                    C9084j jVar = this.f21897f;
                    if (jVar != null) {
                        jVar.mo60920a(str, this.f21901j, this.f21900i, this.f21896e, this.f21899h, this.f21902k);
                    }
                } else {
                    C9084j jVar2 = this.f21897f;
                    if (jVar2 != null) {
                        jVar2.mo60921a(str, this.f21901j, this.f21900i, this.f21896e, this.f21899h, this.f21902k, "state " + i);
                    }
                }
                this.f21907p = true;
            }
        }

        /* renamed from: a */
        public final void mo57900a(WebView webView, int i, String str, String str2) {
            super.mo57900a(webView, i, str, str2);
            C9575i.m27485a().mo63255d(this.f21900i + "_" + this.f21896e + "_" + this.f21899h, false);
            try {
                C9112a.m26119a(this.f21903l, C2350a.m5601e().mo15792g(), "WebView onReceivedError exception: " + str, this.f21900i, this.f21895d, this.f21896e, this.f21903l.getRequestIdNotice(), System.currentTimeMillis() - this.f21905n);
            } catch (Exception unused) {
            }
            Handler handler = this.f21892a;
            if (handler != null) {
                if (this.f21908q != null) {
                    handler.removeCallbacks(this.f21909r);
                }
                Runnable runnable = this.f21908q;
                if (runnable != null) {
                    this.f21892a.removeCallbacks(runnable);
                }
            }
            try {
                String str3 = this.f21900i + "_" + this.f21899h;
                if (this.f21902k != null) {
                    this.f21902k.mo63073a(false);
                }
                if (this.f21897f != null) {
                    this.f21897f.mo60921a(str3, this.f21901j, this.f21900i, this.f21896e, str2, this.f21902k, str);
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    C8608u.m24884d("WindVaneWebView", e.getLocalizedMessage());
                }
            }
        }

        /* renamed from: a */
        public final void mo57901a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.mo57901a(webView, sslErrorHandler, sslError);
            C9575i.m27485a().mo63255d(this.f21900i + "_" + this.f21896e + "_" + this.f21899h, false);
            try {
                CampaignEx campaignEx = this.f21903l;
                Context g = C2350a.m5601e().mo15792g();
                StringBuilder sb = new StringBuilder();
                sb.append("WebView onReceivedSslError exception: ");
                sb.append(sslError == null ? "SSLError" : Integer.toString(sslError.getPrimaryError()));
                C9112a.m26119a(campaignEx, g, sb.toString(), this.f21900i, this.f21895d, this.f21896e, this.f21903l.getRequestIdNotice(), System.currentTimeMillis() - this.f21905n);
            } catch (Exception unused) {
            }
            Handler handler = this.f21892a;
            if (handler != null) {
                if (this.f21908q != null) {
                    handler.removeCallbacks(this.f21909r);
                }
                Runnable runnable = this.f21908q;
                if (runnable != null) {
                    this.f21892a.removeCallbacks(runnable);
                }
            }
            try {
                String str = this.f21900i + "_" + this.f21899h;
                if (this.f21902k != null) {
                    this.f21902k.mo63073a(false);
                }
                if (this.f21897f != null) {
                    this.f21897f.mo60921a(str, this.f21901j, this.f21900i, this.f21896e, this.f21899h, this.f21902k, sslError == null ? "" : Integer.toString(sslError.getPrimaryError()));
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    C8608u.m24884d("WindVaneWebView", e.getLocalizedMessage());
                }
            }
        }

        /* renamed from: a */
        public final void mo57902a(WebView webView, String str) {
            Runnable runnable;
            Handler handler;
            Runnable runnable2;
            super.mo57902a(webView, str);
            Handler handler2 = this.f21892a;
            if (!(handler2 == null || (runnable2 = this.f21909r) == null)) {
                handler2.removeCallbacks(runnable2);
            }
            if (!this.f21906o) {
                try {
                    C9112a.m26119a(this.f21903l, C2350a.m5601e().mo15792g(), "preload temp onPageFinish", this.f21900i, this.f21895d, this.f21896e, this.f21903l.getRequestIdNotice(), System.currentTimeMillis() - this.f21905n);
                } catch (Exception unused) {
                }
                if (!str.contains("wfr=1")) {
                    String str2 = this.f21900i + "_" + this.f21899h;
                    C9575i.m27485a().mo63255d(this.f21900i + "_" + this.f21896e + "_" + this.f21899h, true);
                    Runnable runnable3 = this.f21893b;
                    if (!(runnable3 == null || (handler = this.f21892a) == null)) {
                        handler.removeCallbacks(runnable3);
                    }
                    C9536a.C9537a aVar = this.f21902k;
                    if (aVar != null) {
                        aVar.mo63073a(true);
                    }
                    if (this.f21894c) {
                        if (this.f21903l.isBidCampaign()) {
                            C9536a.m27224a(287, this.f21903l.getRequestIdNotice(), this.f21902k);
                        } else {
                            C9536a.m27227b(287, this.f21903l.getRequestIdNotice(), this.f21902k);
                        }
                    } else if (this.f21903l.isBidCampaign()) {
                        C9536a.m27224a(94, this.f21903l.getRequestIdNotice(), this.f21902k);
                    } else {
                        C9536a.m27227b(94, this.f21903l.getRequestIdNotice(), this.f21902k);
                    }
                    C9084j jVar = this.f21897f;
                    if (jVar != null) {
                        jVar.mo60920a(str2, this.f21901j, this.f21900i, this.f21896e, this.f21899h, this.f21902k);
                    }
                } else {
                    Handler handler3 = this.f21892a;
                    if (!(handler3 == null || (runnable = this.f21908q) == null)) {
                        handler3.postDelayed(runnable, 5000);
                    }
                }
                C8824g.m25670a().mo58309a(webView);
                this.f21906o = true;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:9|10|11|12|(1:14)|15|(1:37)(3:19|(3:23|(5:26|(4:29|(2:33|69)|34|27)|68|35|24)|67)|36)|38|39|40|41|42|(5:43|44|45|46|47)) */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01ce, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01cf, code lost:
        r6 = r14;
        r3 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r42.mo60921a(r21, r33, r34, r31, r35, (com.mbridge.msdk.videocommon.C9536a.C9537a) null, r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01ef, code lost:
        com.mbridge.msdk.foundation.tools.C8608u.m24884d("RewardCampaignsResourceManager", r0.getLocalizedMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0046, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0064 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0074 A[Catch:{ Exception -> 0x01ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a0 A[Catch:{ Exception -> 0x01ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fd A[Catch:{ Exception -> 0x01ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01ef  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo60945a(boolean r27, android.os.Handler r28, boolean r29, boolean r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, int r36, com.mbridge.msdk.foundation.entity.CampaignEx r37, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r38, java.lang.String r39, java.lang.String r40, com.mbridge.msdk.videocommon.p373d.C9551c r41, com.mbridge.msdk.reward.adapter.C9070c.C9084j r42, boolean r43) {
        /*
            r26 = this;
            r1 = r26
            r15 = r31
            r14 = r34
            r0 = r37
            r13 = r38
            r12 = r43
            monitor-enter(r26)
            r1.f21802d = r12     // Catch:{ all -> 0x01fa }
            long r19 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01fa }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fa }
            r2.<init>()     // Catch:{ all -> 0x01fa }
            r2.append(r14)     // Catch:{ all -> 0x01fa }
            java.lang.String r3 = "_"
            r2.append(r3)     // Catch:{ all -> 0x01fa }
            r11 = r35
            r2.append(r11)     // Catch:{ all -> 0x01fa }
            java.lang.String r21 = r2.toString()     // Catch:{ all -> 0x01fa }
            r1.f21802d = r12     // Catch:{ all -> 0x01fa }
            boolean r2 = com.mbridge.msdk.foundation.tools.C8613y.m24947f((java.lang.String) r35)     // Catch:{ all -> 0x01fa }
            if (r2 == 0) goto L_0x0047
            if (r42 == 0) goto L_0x0045
            r0 = 0
            r36 = r42
            r37 = r21
            r38 = r33
            r39 = r34
            r40 = r31
            r41 = r35
            r42 = r0
            r36.mo60920a(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x01fa }
        L_0x0045:
            monitor-exit(r26)
            return
        L_0x0047:
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ Exception -> 0x0064 }
            android.content.Context r3 = r2.mo15792g()     // Catch:{ Exception -> 0x0064 }
            java.lang.String r4 = "start preload tpl"
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0064 }
            long r9 = r5 - r19
            r2 = r37
            r5 = r40
            r6 = r30
            r7 = r31
            r8 = r32
            com.mbridge.msdk.reward.p342b.C9112a.m26119a(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0064 }
        L_0x0064:
            com.mbridge.msdk.videocommon.a$a r10 = new com.mbridge.msdk.videocommon.a$a     // Catch:{ Exception -> 0x01ce }
            r10.<init>()     // Catch:{ Exception -> 0x01ce }
            com.mbridge.msdk.reward.adapter.c r2 = com.mbridge.msdk.reward.adapter.C9070c.C9089m.f21941a     // Catch:{ Exception -> 0x01ce }
            r3 = 1
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r2 = r2.m25976a((boolean) r3)     // Catch:{ Exception -> 0x01ce }
            if (r2 != 0) goto L_0x0081
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r2 = new com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView     // Catch:{ Exception -> 0x01ce }
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ Exception -> 0x01ce }
            android.content.Context r4 = r4.mo15792g()     // Catch:{ Exception -> 0x01ce }
            r2.<init>(r4)     // Catch:{ Exception -> 0x01ce }
        L_0x0081:
            r9 = r2
            r10.mo63071a((com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView) r9)     // Catch:{ Exception -> 0x01ce }
            com.mbridge.msdk.video.bt.a.c r2 = com.mbridge.msdk.video.p346bt.p347a.C9196c.m26194a()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r8 = r2.mo62134b()     // Catch:{ Exception -> 0x01ce }
            com.mbridge.msdk.video.bt.a.c r2 = com.mbridge.msdk.video.p346bt.p347a.C9196c.m26194a()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r7 = r2.mo62134b()     // Catch:{ Exception -> 0x01ce }
            r10.mo63072a((java.lang.String) r7)     // Catch:{ Exception -> 0x01ce }
            if (r13 == 0) goto L_0x00fd
            int r4 = r38.size()     // Catch:{ Exception -> 0x01ce }
            if (r4 <= 0) goto L_0x00fd
            com.mbridge.msdk.videocommon.download.c r4 = com.mbridge.msdk.videocommon.download.C9556c.getInstance()     // Catch:{ Exception -> 0x01ce }
            java.util.List r4 = r4.mo63225a((java.lang.String) r14)     // Catch:{ Exception -> 0x01ce }
            if (r4 == 0) goto L_0x00f6
            int r5 = r4.size()     // Catch:{ Exception -> 0x01ce }
            if (r5 <= 0) goto L_0x00f6
            r5 = 0
        L_0x00b1:
            int r6 = r38.size()     // Catch:{ Exception -> 0x01ce }
            if (r5 >= r6) goto L_0x00f6
            java.lang.Object r6 = r13.get(r5)     // Catch:{ Exception -> 0x01ce }
            com.mbridge.msdk.foundation.entity.CampaignEx r6 = (com.mbridge.msdk.foundation.entity.CampaignEx) r6     // Catch:{ Exception -> 0x01ce }
            java.util.Iterator r16 = r4.iterator()     // Catch:{ Exception -> 0x01ce }
        L_0x00c1:
            boolean r17 = r16.hasNext()     // Catch:{ Exception -> 0x01ce }
            if (r17 == 0) goto L_0x00f2
            java.lang.Object r17 = r16.next()     // Catch:{ Exception -> 0x01ce }
            com.mbridge.msdk.foundation.entity.CampaignEx r17 = (com.mbridge.msdk.foundation.entity.CampaignEx) r17     // Catch:{ Exception -> 0x01ce }
            java.lang.String r2 = r17.getId()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r3 = r6.getId()     // Catch:{ Exception -> 0x01ce }
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x01ce }
            if (r2 == 0) goto L_0x00f0
            java.lang.String r2 = r17.getRequestId()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r3 = r6.getRequestId()     // Catch:{ Exception -> 0x01ce }
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x01ce }
            if (r2 == 0) goto L_0x00f0
            r2 = 1
            r6.setReady(r2)     // Catch:{ Exception -> 0x01ce }
            r13.set(r5, r6)     // Catch:{ Exception -> 0x01ce }
        L_0x00f0:
            r3 = 1
            goto L_0x00c1
        L_0x00f2:
            int r5 = r5 + 1
            r3 = 1
            goto L_0x00b1
        L_0x00f6:
            com.mbridge.msdk.video.signal.a.j r2 = new com.mbridge.msdk.video.signal.a.j     // Catch:{ Exception -> 0x01ce }
            r3 = 0
            r2.<init>(r3, r0, r13)     // Catch:{ Exception -> 0x01ce }
            goto L_0x0103
        L_0x00fd:
            com.mbridge.msdk.video.signal.a.j r2 = new com.mbridge.msdk.video.signal.a.j     // Catch:{ Exception -> 0x01ce }
            r3 = 0
            r2.<init>(r3, r0)     // Catch:{ Exception -> 0x01ce }
        L_0x0103:
            r4 = r36
            r6 = r2
            r6.mo62811a((int) r4)     // Catch:{ Exception -> 0x01ce }
            r2 = r40
            r6.mo62816a((java.lang.String) r2)     // Catch:{ Exception -> 0x01ce }
            r6.mo62850c((java.lang.String) r7)     // Catch:{ Exception -> 0x01ce }
            r6.mo62852d((java.lang.String) r8)     // Catch:{ Exception -> 0x01ce }
            r2 = 1
            r6.mo62851c((boolean) r2)     // Catch:{ Exception -> 0x01ce }
            r3 = r41
            r6.mo62815a((com.mbridge.msdk.videocommon.p373d.C9551c) r3)     // Catch:{ Exception -> 0x01ce }
            r2 = r27
            r6.mo62853d((boolean) r2)     // Catch:{ Exception -> 0x01ce }
            com.mbridge.msdk.reward.adapter.c$b r5 = new com.mbridge.msdk.reward.adapter.c$b     // Catch:{ Exception -> 0x01ce }
            r16 = 0
            r32 = r5
            r5 = r16
            r2 = r32
            r3 = r27
            r4 = r28
            r22 = r6
            r6 = r29
            r23 = r7
            r7 = r30
            r24 = r8
            r8 = r36
            r25 = r9
            r9 = r35
            r16 = r10
            r10 = r33
            r11 = r34
            r12 = r31
            r13 = r16
            r14 = r37
            r15 = r38
            r16 = r41
            r17 = r42
            r18 = r43
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x01c8 }
            r0 = r32
            r2 = r25
            r2.setWebViewListener(r0)     // Catch:{ Exception -> 0x01c8 }
            r0 = r22
            r2.setObject(r0)     // Catch:{ Exception -> 0x01c8 }
            r0 = r39
            r2.loadUrl(r0)     // Catch:{ Exception -> 0x01c8 }
            r3 = r31
            r2.setRid(r3)     // Catch:{ Exception -> 0x01c6 }
            com.mbridge.msdk.video.bt.module.MBridgeBTRootLayout r0 = new com.mbridge.msdk.video.bt.module.MBridgeBTRootLayout     // Catch:{ Exception -> 0x01c6 }
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ Exception -> 0x01c6 }
            android.content.Context r4 = r4.mo15792g()     // Catch:{ Exception -> 0x01c6 }
            r0.<init>(r4)     // Catch:{ Exception -> 0x01c6 }
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams     // Catch:{ Exception -> 0x01c6 }
            r5 = -1
            r4.<init>(r5, r5)     // Catch:{ Exception -> 0x01c6 }
            r0.setLayoutParams(r4)     // Catch:{ Exception -> 0x01c6 }
            r4 = r24
            r0.setInstanceId(r4)     // Catch:{ Exception -> 0x01c6 }
            r6 = r34
            r0.setUnitId(r6)     // Catch:{ Exception -> 0x01c4 }
            com.mbridge.msdk.video.bt.module.MBridgeBTLayout r7 = new com.mbridge.msdk.video.bt.module.MBridgeBTLayout     // Catch:{ Exception -> 0x01c4 }
            com.mbridge.msdk.foundation.controller.a r8 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ Exception -> 0x01c4 }
            android.content.Context r8 = r8.mo15792g()     // Catch:{ Exception -> 0x01c4 }
            r7.<init>(r8)     // Catch:{ Exception -> 0x01c4 }
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams     // Catch:{ Exception -> 0x01c4 }
            r8.<init>(r5, r5)     // Catch:{ Exception -> 0x01c4 }
            r7.setLayoutParams(r8)     // Catch:{ Exception -> 0x01c4 }
            r8 = r23
            r7.setInstanceId(r8)     // Catch:{ Exception -> 0x01c4 }
            r7.setUnitId(r6)     // Catch:{ Exception -> 0x01c4 }
            r7.setWebView(r2)     // Catch:{ Exception -> 0x01c4 }
            com.mbridge.msdk.video.bt.a.c r2 = com.mbridge.msdk.video.p346bt.p347a.C9196c.m26194a()     // Catch:{ Exception -> 0x01c4 }
            java.util.LinkedHashMap r2 = r2.mo62135b((java.lang.String) r6, (java.lang.String) r3)     // Catch:{ Exception -> 0x01c4 }
            r2.put(r8, r7)     // Catch:{ Exception -> 0x01c4 }
            r2.put(r4, r0)     // Catch:{ Exception -> 0x01c4 }
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams     // Catch:{ Exception -> 0x01c4 }
            r2.<init>(r5, r5)     // Catch:{ Exception -> 0x01c4 }
            r0.addView(r7, r2)     // Catch:{ Exception -> 0x01c4 }
            goto L_0x01f8
        L_0x01c4:
            r0 = move-exception
            goto L_0x01d1
        L_0x01c6:
            r0 = move-exception
            goto L_0x01cb
        L_0x01c8:
            r0 = move-exception
            r3 = r31
        L_0x01cb:
            r6 = r34
            goto L_0x01d1
        L_0x01ce:
            r0 = move-exception
            r6 = r14
            r3 = r15
        L_0x01d1:
            if (r42 == 0) goto L_0x01eb
            r2 = 0
            java.lang.String r4 = r0.getMessage()     // Catch:{ all -> 0x01fa }
            r36 = r42
            r37 = r21
            r38 = r33
            r39 = r34
            r40 = r31
            r41 = r35
            r42 = r2
            r43 = r4
            r36.mo60921a(r37, r38, r39, r40, r41, r42, r43)     // Catch:{ all -> 0x01fa }
        L_0x01eb:
            boolean r2 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch:{ all -> 0x01fa }
            if (r2 == 0) goto L_0x01f8
            java.lang.String r2 = "RewardCampaignsResourceManager"
            java.lang.String r0 = r0.getLocalizedMessage()     // Catch:{ all -> 0x01fa }
            com.mbridge.msdk.foundation.tools.C8608u.m24884d(r2, r0)     // Catch:{ all -> 0x01fa }
        L_0x01f8:
            monitor-exit(r26)
            return
        L_0x01fa:
            r0 = move-exception
            monitor-exit(r26)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.C9070c.mo60945a(boolean, android.os.Handler, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, com.mbridge.msdk.foundation.entity.CampaignEx, java.util.List, java.lang.String, java.lang.String, com.mbridge.msdk.videocommon.d.c, com.mbridge.msdk.reward.adapter.c$j, boolean):void");
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.c$b */
    /* compiled from: RewardCampaignsResourceManager */
    private static class C9075b extends C8789a {

        /* renamed from: a */
        private final Handler f21836a;

        /* renamed from: b */
        private final Runnable f21837b;

        /* renamed from: c */
        private final boolean f21838c;

        /* renamed from: d */
        private final boolean f21839d;

        /* renamed from: e */
        private int f21840e;

        /* renamed from: f */
        private String f21841f;

        /* renamed from: g */
        private String f21842g;

        /* renamed from: h */
        private String f21843h;

        /* renamed from: i */
        private String f21844i;

        /* renamed from: j */
        private C9536a.C9537a f21845j;

        /* renamed from: k */
        private CampaignEx f21846k;

        /* renamed from: l */
        private List<CampaignEx> f21847l;

        /* renamed from: m */
        private C9551c f21848m;

        /* renamed from: n */
        private final C9084j f21849n;

        /* renamed from: o */
        private boolean f21850o;

        /* renamed from: p */
        private boolean f21851p;

        /* renamed from: q */
        private boolean f21852q;

        /* renamed from: r */
        private int f21853r = 0;

        /* renamed from: s */
        private boolean f21854s;

        /* renamed from: t */
        private long f21855t;

        public C9075b(boolean z, Handler handler, Runnable runnable, boolean z2, boolean z3, int i, String str, String str2, String str3, String str4, C9536a.C9537a aVar, CampaignEx campaignEx, List<CampaignEx> list, C9551c cVar, C9084j jVar, boolean z4, long j) {
            this.f21836a = handler;
            this.f21837b = runnable;
            this.f21838c = z2;
            this.f21839d = z3;
            this.f21840e = i;
            this.f21841f = str;
            this.f21843h = str2;
            this.f21842g = str3;
            this.f21844i = str4;
            this.f21845j = aVar;
            this.f21846k = campaignEx;
            this.f21847l = list;
            this.f21848m = cVar;
            this.f21849n = jVar;
            this.f21850o = z4;
            this.f21854s = z;
            this.f21855t = j;
        }

        /* renamed from: a */
        public final void mo57899a(WebView webView, int i) {
            Runnable runnable;
            if (!this.f21852q) {
                try {
                    C9112a.m26119a(this.f21846k, C2350a.m5601e().mo15792g(), "preload tpl readyState: " + i, this.f21842g, this.f21839d, this.f21844i, this.f21846k.getRequestIdNotice(), System.currentTimeMillis() - this.f21855t);
                } catch (Exception unused) {
                }
                String str = this.f21842g + "_" + this.f21841f;
                if (i == 1) {
                    if (this.f21850o) {
                        C9536a.m27231e(this.f21842g + "_" + this.f21844i);
                    } else {
                        C9536a.m27230d(this.f21842g + "_" + this.f21844i);
                    }
                    C9536a.m27225a(this.f21842g + "_" + this.f21844i + "_" + this.f21841f, this.f21845j, true, this.f21850o);
                    Handler handler = this.f21836a;
                    if (!(handler == null || (runnable = this.f21837b) == null)) {
                        handler.removeCallbacks(runnable);
                    }
                    C9575i.m27485a().mo63255d(this.f21842g + "_" + this.f21844i + "_" + this.f21841f, true);
                    C9536a.C9537a aVar = this.f21845j;
                    if (aVar != null) {
                        aVar.mo63073a(true);
                    }
                    C9084j jVar = this.f21849n;
                    if (jVar != null) {
                        jVar.mo60920a(str, this.f21843h, this.f21842g, this.f21844i, this.f21841f, this.f21845j);
                    }
                } else {
                    C9575i.m27485a().mo63255d(this.f21842g + "_" + this.f21844i + "_" + this.f21841f, false);
                    C9536a.C9537a aVar2 = this.f21845j;
                    if (aVar2 != null) {
                        aVar2.mo63073a(false);
                    }
                    C9084j jVar2 = this.f21849n;
                    if (jVar2 != null) {
                        jVar2.mo60921a(str, this.f21843h, this.f21842g, this.f21844i, this.f21841f, this.f21845j, "state 2");
                    }
                }
                this.f21852q = true;
            }
        }

        /* renamed from: a */
        public final void mo58184a(WebView webView, String str, String str2, int i, int i2) {
            boolean z = true;
            if (i == 1) {
                try {
                    C9047a aVar = new C9047a();
                    aVar.mo60909b(false);
                    if (i2 != 2) {
                        z = false;
                    }
                    aVar.mo60905a(z);
                    aVar.mo60908b(str, str2);
                    aVar.mo60902a((InterVideoOutListener) new C9238a((C9245g) null));
                    aVar.mo60911d(false);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: a */
        public final void mo58186a(Object obj, String str) {
            Object obj2 = obj;
            if (obj2 != null) {
                try {
                    if (!TextUtils.isEmpty(str)) {
                        String optString = new JSONObject(str).optString("id");
                        C9196c.m26194a().mo62127a(obj2, optString);
                        String c = C9196c.m26194a().mo62139c(optString);
                        CampaignEx a = C9196c.m26194a().mo62123a(optString);
                        C9551c b = C9196c.m26194a().mo62133b(optString);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(a);
                        C8818a aVar = (C8818a) obj2;
                        if (aVar.f21444a instanceof WindVaneWebView) {
                            WindVaneWebView windVaneWebView = aVar.f21444a;
                            C9070c a2 = C9089m.f21941a;
                            boolean z = this.f21854s;
                            int i = this.f21853r == 0 ? 3 : 6;
                            if (windVaneWebView != null) {
                                if (!(a == null || b == null)) {
                                    try {
                                        if (a.getRewardTemplateMode() != null) {
                                            if (!TextUtils.isEmpty(c)) {
                                                if (TextUtils.isEmpty(a.getRewardTemplateMode().mo57205e())) {
                                                    JSONObject jSONObject = new JSONObject();
                                                    jSONObject.put("id", optString);
                                                    JSONObject jSONObject2 = new JSONObject();
                                                    jSONObject2.put(IronSourceConstants.EVENTS_RESULT, 1);
                                                    jSONObject2.put("error", "data is null");
                                                    jSONObject.put("data", jSONObject2);
                                                    C8824g.m25670a().mo58310a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                                                } else if (TextUtils.isEmpty(a.getRewardTemplateMode().mo57205e()) || !a.getRewardTemplateMode().mo57205e().contains(CampaignEx.KEY_IS_CMPT_ENTRY)) {
                                                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable(z, windVaneWebView, a, arrayList, c, b, optString) {

                                                        /* renamed from: a */
                                                        final /* synthetic */ boolean f21819a;

                                                        /* renamed from: b */
                                                        final /* synthetic */ WindVaneWebView f21820b;

                                                        /* renamed from: c */
                                                        final /* synthetic */ CampaignEx f21821c;

                                                        /* renamed from: d */
                                                        final /* synthetic */ List f21822d;

                                                        /* renamed from: e */
                                                        final /* synthetic */ String f21823e;

                                                        /* renamed from: f */
                                                        final /* synthetic */ C9551c f21824f;

                                                        /* renamed from: g */
                                                        final /* synthetic */ String f21825g;

                                                        {
                                                            this.f21819a = r2;
                                                            this.f21820b = r3;
                                                            this.f21821c = r4;
                                                            this.f21822d = r5;
                                                            this.f21823e = r6;
                                                            this.f21824f = r7;
                                                            this.f21825g = r8;
                                                        }

                                                        public final void run() {
                                                            C9070c.m25981a(C9070c.this, this.f21819a, this.f21820b, this.f21821c.getRewardTemplateMode().mo57205e(), 0, this.f21821c, this.f21822d, C9563g.m27460a().mo63242b(this.f21821c.getRewardTemplateMode().mo57205e()), this.f21823e, this.f21824f, this.f21825g, C9070c.this.f21802d);
                                                        }
                                                    }, (long) (i * 1000));
                                                } else {
                                                    C8608u.m24880a("RewardCampaignsResourceManager", "getTeamplateUrl contains cmpt=1");
                                                }
                                            }
                                        }
                                    } catch (Exception e) {
                                        if (MBridgeConstans.DEBUG) {
                                            C8608u.m24884d("RewardCampaignsResourceManager", e.getLocalizedMessage());
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        C8608u.m24884d("RVWindVaneWebView", th.getMessage());
                                        return;
                                    }
                                }
                                JSONObject jSONObject3 = new JSONObject();
                                try {
                                    jSONObject3.put("id", optString);
                                    JSONObject jSONObject4 = new JSONObject();
                                    jSONObject4.put(IronSourceConstants.EVENTS_RESULT, 2);
                                    jSONObject4.put("error", "data is null");
                                    jSONObject3.put("data", jSONObject4);
                                    C8824g.m25670a().mo58310a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
                                } catch (Exception e2) {
                                    if (MBridgeConstans.DEBUG) {
                                        C8608u.m24884d("RewardCampaignsResourceManager", e2.getLocalizedMessage());
                                    }
                                }
                            }
                            this.f21853r++;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }

        /* renamed from: a */
        public final void mo57902a(WebView webView, String str) {
            Runnable runnable;
            super.mo57902a(webView, str);
            if (!this.f21851p) {
                try {
                    C9112a.m26119a(this.f21846k, C2350a.m5601e().mo15792g(), "preload tpl onPageFinish", this.f21842g, this.f21839d, this.f21844i, this.f21846k.getRequestIdNotice(), System.currentTimeMillis() - this.f21855t);
                } catch (Exception unused) {
                }
                String str2 = this.f21842g + "_" + this.f21841f;
                if (!str.contains("wfr=1")) {
                    C9575i.m27485a().mo63255d(this.f21842g + "_" + this.f21844i + "_" + this.f21841f, true);
                    Handler handler = this.f21836a;
                    if (!(handler == null || (runnable = this.f21837b) == null)) {
                        handler.removeCallbacks(runnable);
                    }
                    C9536a.C9537a aVar = this.f21845j;
                    if (aVar != null) {
                        aVar.mo63073a(true);
                    }
                    C9084j jVar = this.f21849n;
                    if (jVar != null) {
                        jVar.mo60920a(str2, this.f21843h, this.f21842g, this.f21844i, this.f21841f, this.f21845j);
                    }
                }
                C8824g.m25670a().mo58309a(webView);
                this.f21851p = true;
            }
        }

        /* renamed from: a */
        public final void mo57900a(WebView webView, int i, String str, String str2) {
            super.mo57900a(webView, i, str, str2);
            C9575i.m27485a().mo63255d(this.f21842g + "_" + this.f21844i + "_" + this.f21841f, false);
            if (this.f21849n != null) {
                String str3 = this.f21842g + "_" + this.f21841f;
                C9536a.C9537a aVar = this.f21845j;
                if (aVar != null) {
                    aVar.mo63073a(false);
                }
                this.f21849n.mo60921a(str3, this.f21843h, this.f21842g, this.f21844i, this.f21841f, this.f21845j, str);
            }
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.c$l */
    /* compiled from: RewardCampaignsResourceManager */
    private static class C9088l extends C8790b {

        /* renamed from: a */
        private String f21930a;

        /* renamed from: b */
        private final boolean f21931b;

        /* renamed from: c */
        private final WindVaneWebView f21932c;

        /* renamed from: d */
        private final String f21933d;

        /* renamed from: e */
        private final String f21934e;

        /* renamed from: f */
        private final C9536a.C9537a f21935f;

        /* renamed from: g */
        private final CampaignEx f21936g;

        /* renamed from: h */
        private boolean f21937h;

        /* renamed from: i */
        private String f21938i;

        /* renamed from: j */
        private boolean f21939j;

        /* renamed from: k */
        private boolean f21940k;

        public C9088l(String str, boolean z, WindVaneWebView windVaneWebView, String str2, String str3, C9536a.C9537a aVar, CampaignEx campaignEx, boolean z2, String str4) {
            this.f21931b = z;
            this.f21932c = windVaneWebView;
            this.f21933d = str2;
            this.f21934e = str3;
            this.f21935f = aVar;
            this.f21936g = campaignEx;
            this.f21930a = str;
            this.f21937h = z2;
            this.f21938i = str4;
        }

        /* renamed from: a */
        public final void mo57899a(WebView webView, int i) {
            if (!this.f21940k) {
                if (this.f21932c != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", this.f21930a);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(IronSourceConstants.EVENTS_RESULT, i);
                        jSONObject2.put("error", "");
                        jSONObject.put("data", jSONObject2);
                        C8824g.m25670a().mo58310a((WebView) this.f21932c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            C8608u.m24884d("WindVaneWebView", e.getLocalizedMessage());
                        }
                    }
                }
                String str = this.f21934e + "_" + this.f21936g.getId() + "_" + this.f21936g.getRequestId() + "_" + this.f21933d;
                if (i == 1) {
                    C9575i.m27485a().mo63255d(this.f21934e + "_" + this.f21938i + "_" + this.f21933d, true);
                    C9536a.C9537a aVar = this.f21935f;
                    if (aVar != null) {
                        aVar.mo63073a(true);
                    }
                    if (this.f21931b) {
                        if (this.f21936g.isBidCampaign()) {
                            C9536a.m27225a(str, this.f21935f, false, this.f21937h);
                        } else {
                            C9536a.m27225a(str, this.f21935f, false, this.f21937h);
                        }
                    } else if (this.f21936g.isBidCampaign()) {
                        C9536a.m27225a(str, this.f21935f, false, this.f21937h);
                    } else {
                        C9536a.m27225a(str, this.f21935f, false, this.f21937h);
                    }
                } else {
                    C9575i.m27485a().mo63255d(this.f21934e + "_" + this.f21938i + "_" + this.f21933d, false);
                    C9536a.C9537a aVar2 = this.f21935f;
                    if (aVar2 != null) {
                        aVar2.mo63073a(false);
                    }
                }
                this.f21940k = true;
            }
        }

        /* renamed from: a */
        public final void mo57900a(WebView webView, int i, String str, String str2) {
            C9575i a = C9575i.m27485a();
            a.mo63255d(this.f21934e + "_" + this.f21938i + "_" + this.f21933d, false);
            C9536a.C9537a aVar = this.f21935f;
            if (aVar != null) {
                aVar.mo63073a(false);
            }
            if (this.f21932c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f21930a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(IronSourceConstants.EVENTS_RESULT, 2);
                    jSONObject2.put("error", str);
                    jSONObject.put("data", jSONObject2);
                    C8824g.m25670a().mo58310a((WebView) this.f21932c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        C8608u.m24884d("WindVaneWebView", e.getLocalizedMessage());
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo57902a(WebView webView, String str) {
            if (!this.f21939j) {
                if (!str.contains("wfr=1")) {
                    if (this.f21932c != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", this.f21930a);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(IronSourceConstants.EVENTS_RESULT, 1);
                            jSONObject2.put("error", "");
                            jSONObject.put("data", jSONObject2);
                            C8824g.m25670a().mo58310a((WebView) this.f21932c, "componentReact", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        } catch (Exception e) {
                            if (MBridgeConstans.DEBUG) {
                                C8608u.m24884d("WindVaneWebView", e.getLocalizedMessage());
                            }
                        }
                    }
                    C9575i.m27485a().mo63255d(this.f21934e + "_" + this.f21938i + "_" + this.f21933d, true);
                    C9536a.C9537a aVar = this.f21935f;
                    if (aVar != null) {
                        aVar.mo63073a(true);
                    }
                    String str2 = this.f21934e + "_" + this.f21936g.getId() + "_" + this.f21936g.getRequestId() + "_" + this.f21933d;
                    if (this.f21931b) {
                        if (this.f21936g.isBidCampaign()) {
                            C9536a.m27224a(287, this.f21936g.getRequestIdNotice(), this.f21935f);
                        } else {
                            C9536a.m27225a(str2, this.f21935f, false, this.f21937h);
                        }
                    } else if (this.f21936g.isBidCampaign()) {
                        C9536a.m27224a(94, this.f21936g.getRequestIdNotice(), this.f21935f);
                    } else {
                        C9536a.m27225a(str2, this.f21935f, false, this.f21937h);
                    }
                }
                C8824g.m25670a().mo58309a(webView);
                this.f21939j = true;
            }
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.c$a */
    /* compiled from: RewardCampaignsResourceManager */
    private static class C9074a {

        /* renamed from: a */
        boolean f21827a;

        /* renamed from: b */
        boolean f21828b;

        /* renamed from: c */
        int f21829c;

        /* renamed from: d */
        int f21830d;

        /* renamed from: e */
        String f21831e;

        /* renamed from: f */
        String f21832f;

        /* renamed from: g */
        int f21833g;

        /* renamed from: h */
        List<CampaignEx> f21834h;

        /* renamed from: i */
        CopyOnWriteArrayList<CampaignEx> f21835i;

        public C9074a(boolean z, boolean z2, int i, int i2, String str, String str2, int i3, List<CampaignEx> list) {
            this.f21827a = z;
            this.f21828b = z2;
            this.f21829c = i;
            this.f21830d = i2;
            this.f21831e = str;
            this.f21832f = str2;
            this.f21833g = i3;
            this.f21834h = list;
            this.f21835i = new CopyOnWriteArrayList<>(list);
        }
    }

    /* renamed from: a */
    private synchronized WindVaneWebView m25976a(boolean z) {
        return null;
    }

    /* renamed from: a */
    static /* synthetic */ void m25980a(C9070c cVar, Context context, String str, String str2, String str3, CampaignEx campaignEx, String str4, C9083i iVar, List list) {
        C9070c cVar2 = cVar;
        String str5 = str4;
        if (!TextUtils.isEmpty(str4) && !campaignEx.isMraid()) {
            if (!str5.contains(".zip") || !str5.contains("md5filename")) {
                boolean isEmpty = TextUtils.isEmpty(C9572h.m27477a().mo63246b(str5));
                try {
                    C9077d dVar = new C9077d(497, str, str2, str3, campaignEx, iVar, cVar2.f21800a, list);
                    dVar.mo60948a(isEmpty);
                    C9563g.m27460a().mo63243b(str5, dVar);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        C8608u.m24884d("RewardCampaignsResourceManager", e.getLocalizedMessage());
                    }
                }
            } else {
                boolean isEmpty2 = TextUtils.isEmpty(C9563g.m27460a().mo63242b(str5));
                try {
                    C9081g gVar = new C9081g(context, str, str2, str3, campaignEx, 497, cVar2.f21800a, iVar, list);
                    gVar.mo60950a(isEmpty2);
                    C9563g.m27460a().mo63243b(str5, gVar);
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        C8608u.m24884d("RewardCampaignsResourceManager", e2.getLocalizedMessage());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m25981a(C9070c cVar, boolean z, WindVaneWebView windVaneWebView, String str, int i, CampaignEx campaignEx, List list, String str2, String str3, C9551c cVar2, String str4, boolean z2) {
        C9425j jVar;
        String str5;
        CampaignEx campaignEx2 = campaignEx;
        List list2 = list;
        String str6 = str3;
        try {
            C9536a.C9537a aVar = new C9536a.C9537a();
            WindVaneWebView a = C9089m.f21941a.m25976a(false);
            if (a == null) {
                a = new WindVaneWebView(C2350a.m5601e().mo15792g());
            }
            WindVaneWebView windVaneWebView2 = a;
            aVar.mo63071a(windVaneWebView2);
            if (list2 == null || list.size() <= 0) {
                jVar = new C9425j((Activity) null, campaignEx2);
                str5 = campaignEx.getRequestId();
            } else {
                List<CampaignEx> a2 = C9556c.getInstance().mo63225a(str6);
                if (a2 != null && a2.size() > 0) {
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        CampaignEx campaignEx3 = (CampaignEx) list2.get(i2);
                        for (CampaignEx next : a2) {
                            if (next.getId().equals(campaignEx3.getId()) && next.getRequestId().equals(campaignEx3.getRequestId())) {
                                campaignEx3.setReady(true);
                                list2.set(i2, campaignEx3);
                            }
                        }
                    }
                }
                jVar = new C9425j((Activity) null, campaignEx2, list2);
                str5 = ((CampaignEx) list2.get(0)).getRequestId();
            }
            String str7 = str5;
            C9425j jVar2 = jVar;
            jVar2.mo62811a(i);
            jVar2.mo62816a(str6);
            jVar2.mo62850c(str4);
            jVar2.mo62815a(cVar2);
            jVar2.mo62853d(z);
            windVaneWebView2.setWebViewListener(new C9088l(str4, false, windVaneWebView, str, str3, aVar, campaignEx, z2, str7));
            windVaneWebView2.setObject(jVar2);
            windVaneWebView2.loadUrl(str2);
            windVaneWebView2.setRid(str7);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C8608u.m24884d("RewardCampaignsResourceManager", e.getLocalizedMessage());
            }
        }
    }
}
