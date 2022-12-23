package com.mbridge.msdk.reward.p342b;

import android.content.Context;
import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.C8410k;
import com.mbridge.msdk.foundation.entity.C8412m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p066db.C2374f;
import com.mbridge.msdk.foundation.p066db.C2376g;
import com.mbridge.msdk.foundation.p066db.C2382m;
import com.mbridge.msdk.foundation.p066db.C2385p;
import com.mbridge.msdk.foundation.same.C8413a;
import com.mbridge.msdk.foundation.same.net.p310f.C8487d;
import com.mbridge.msdk.foundation.same.net.p311g.C8494d;
import com.mbridge.msdk.foundation.same.report.C8518b;
import com.mbridge.msdk.foundation.same.report.C8542e;
import com.mbridge.msdk.foundation.same.report.p315d.C8540a;
import com.mbridge.msdk.foundation.same.report.p315d.C8541b;
import com.mbridge.msdk.foundation.tools.C8596q;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.videocommon.p373d.C9549b;
import java.util.List;

/* renamed from: com.mbridge.msdk.reward.b.a */
/* compiled from: RewardReport */
public class C9112a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f22068a = C9112a.class.getName();

    /* renamed from: b */
    private static String f22069b = "";

    /* renamed from: a */
    public static void m26115a(Context context, String str) {
        if (context != null) {
            try {
                C2385p a = C2385p.m5777a((C2374f) C2376g.m5723a(context));
                if (!TextUtils.isEmpty(str) && a != null && a.mo15933a() > 0) {
                    List<C8412m> a2 = a.mo15935a("2000022");
                    List<C8412m> a3 = a.mo15935a("2000021");
                    List<C8412m> a4 = a.mo15935a("2000039");
                    List<C8412m> a5 = a.mo15935a("2000043");
                    List<C8412m> a6 = a.mo15935a("2000045");
                    List<C8412m> a7 = a.mo15935a("2000044");
                    String a8 = C8412m.m24224a(a3);
                    String b = C8412m.m24226b(a2);
                    String f = C8412m.m24234f(a4);
                    String c = C8412m.m24228c(a5);
                    String d = C8412m.m24230d(a6);
                    String e = C8412m.m24232e(a7);
                    StringBuilder sb = new StringBuilder();
                    if (!TextUtils.isEmpty(a8)) {
                        sb.append(a8);
                    }
                    if (!TextUtils.isEmpty(b)) {
                        sb.append(b);
                    }
                    if (!TextUtils.isEmpty(f)) {
                        sb.append(f);
                    }
                    if (!TextUtils.isEmpty(c)) {
                        sb.append(c);
                    }
                    if (!TextUtils.isEmpty(d)) {
                        sb.append(d);
                    }
                    if (!TextUtils.isEmpty(e)) {
                        sb.append(e);
                    }
                    if (!TextUtils.isEmpty(sb.toString())) {
                        String sb2 = sb.toString();
                        if (context != null && !TextUtils.isEmpty(sb2) && !TextUtils.isEmpty(str)) {
                            try {
                                C8540a aVar = new C8540a(context);
                                C8494d a9 = C8542e.m24691a(sb2, context, str);
                                a9.mo57606a("r_stid", C9549b.m27299a().mo63129b().mo63105a());
                                aVar.mo57603c(0, C8487d.m24492a().f20531a, a9, new C8541b() {
                                    /* renamed from: a */
                                    public final void mo15651a(String str) {
                                        C8608u.m24884d(C9112a.f22068a, str);
                                    }

                                    /* renamed from: b */
                                    public final void mo15652b(String str) {
                                        C8608u.m24884d(C9112a.f22068a, str);
                                    }
                                });
                            } catch (Exception e2) {
                                e2.printStackTrace();
                                C8608u.m24884d(f22068a, e2.getMessage());
                            }
                        }
                    }
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private static void m26116a(final Context context, final String str, String str2) {
        if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                C8540a aVar = new C8540a(context);
                C8494d a = C8542e.m24691a(str, context, str2);
                a.mo57606a("r_stid", C9549b.m27299a().mo63129b().mo63105a());
                aVar.mo57603c(0, C8487d.m24492a().f20531a, a, new C8541b() {
                    /* renamed from: a */
                    public final void mo15651a(String str) {
                        C8608u.m24884d(C9112a.f22068a, str);
                    }

                    /* renamed from: b */
                    public final void mo15652b(String str) {
                        C8410k kVar = new C8410k();
                        kVar.mo57423c(str);
                        kVar.mo57418a(System.currentTimeMillis());
                        kVar.mo57417a(0);
                        kVar.mo57421b(ShareTarget.METHOD_POST);
                        kVar.mo57419a(C8487d.m24492a().f20531a);
                        C2382m.m5755a((C2374f) C2376g.m5723a(context)).mo15920a(kVar);
                        C8608u.m24884d(C9112a.f22068a, str);
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
                C8608u.m24884d(f22068a, e.getMessage());
            }
        }
    }

    /* renamed from: b */
    private static void m26120b(final Context context, final String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                C8540a aVar = new C8540a(context);
                C8494d a = C8542e.m24690a(str, context);
                a.mo57606a("r_stid", C9549b.m27299a().mo63129b().mo63105a());
                aVar.mo57603c(0, C8487d.m24492a().f20531a, a, new C8541b() {
                    /* renamed from: a */
                    public final void mo15651a(String str) {
                        C8608u.m24884d(C9112a.f22068a, str);
                    }

                    /* renamed from: b */
                    public final void mo15652b(String str) {
                        C8410k kVar = new C8410k();
                        kVar.mo57423c(str);
                        kVar.mo57418a(System.currentTimeMillis());
                        kVar.mo57417a(0);
                        kVar.mo57421b(ShareTarget.METHOD_POST);
                        kVar.mo57419a(C8487d.m24492a().f20531a);
                        C2382m.m5755a((C2374f) C2376g.m5723a(context)).mo15920a(kVar);
                        C8608u.m24884d(C9112a.f22068a, str);
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
                C8608u.m24884d(f22068a, e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static void m26117a(Context context, List<CampaignEx> list, String str, long j) {
        C8608u.m24880a("test_load_time", "time: " + j);
        if (context != null && list != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (list.size() > 0) {
                        String requestId = list.get(0).getRequestId();
                        if (TextUtils.isEmpty(f22069b) || !requestId.equals(f22069b)) {
                            f22069b = requestId;
                        } else {
                            return;
                        }
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=");
                    stringBuffer.append("2000048");
                    stringBuffer.append("&");
                    stringBuffer.append("network_type=");
                    stringBuffer.append(C8596q.m24849n(context));
                    stringBuffer.append("&");
                    stringBuffer.append("unit_id=");
                    stringBuffer.append(str);
                    stringBuffer.append("&");
                    stringBuffer.append("load_time=");
                    stringBuffer.append(j);
                    stringBuffer.append("&");
                    if (list != null && list.size() > 0) {
                        stringBuffer.append("cid=");
                        StringBuilder sb = new StringBuilder("rtins_type=");
                        for (int i = 0; i < list.size(); i++) {
                            CampaignEx campaignEx = list.get(i);
                            if (i < list.size() - 1) {
                                stringBuffer.append(campaignEx.getId());
                                stringBuffer.append(",");
                                sb.append(campaignEx.getRtinsType());
                                sb.append(",");
                            } else {
                                stringBuffer.append(campaignEx.getId());
                                stringBuffer.append("&");
                                sb.append(campaignEx.getRtinsType());
                                sb.append("&");
                                if (campaignEx.isBidCampaign()) {
                                    stringBuffer.append("hb=1&");
                                } else {
                                    stringBuffer.append("hb=0&");
                                }
                            }
                        }
                        stringBuffer.append(sb);
                        CampaignEx campaignEx2 = list.get(0);
                        if (!(campaignEx2 == null || campaignEx2.getRewardTemplateMode() == null)) {
                            stringBuffer.append("rid=");
                            stringBuffer.append(campaignEx2.getRequestId());
                            try {
                                int i2 = C8613y.m24953i(campaignEx2.getRewardTemplateMode().mo57205e());
                                if (i2 != -1) {
                                    stringBuffer.append("&view=");
                                    stringBuffer.append(i2);
                                }
                            } catch (Exception unused) {
                            }
                        }
                        String str2 = "";
                        String str3 = str2;
                        for (int i3 = 0; i3 < list.size(); i3++) {
                            str2 = str2 + list.get(i3).getRequestIdNotice();
                            str3 = str3 + list.get(i3).getAdSpaceT();
                            if (i3 < list.size() - 1) {
                                str2 = str2 + ",";
                                str3 = str3 + ",";
                            }
                        }
                        stringBuffer.append("&rid_n=");
                        stringBuffer.append(str2);
                        stringBuffer.append("&adspace_t=");
                        stringBuffer.append(str3);
                        if (C8518b.m24607a().mo57681c()) {
                            C8518b.m24607a().mo57679a(stringBuffer.toString());
                        } else {
                            m26116a(context, stringBuffer.toString(), str);
                        }
                    }
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m26118a(CampaignEx campaignEx, Context context, String str, String str2, boolean z, String str3, String str4) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000047&");
                    stringBuffer.append("network_type=" + C8596q.m24849n(context) + "&");
                    stringBuffer.append("unit_id=" + str2 + "&");
                    if (!TextUtils.isEmpty(str2)) {
                        String str5 = C2350a.f4905c.get(str2);
                        StringBuilder sb = new StringBuilder();
                        sb.append("u_stid=");
                        if (str5 == null) {
                            str5 = "";
                        }
                        sb.append(str5);
                        sb.append("&");
                        stringBuffer.append(sb.toString());
                    }
                    if (!TextUtils.isEmpty(C8413a.f20329k)) {
                        stringBuffer.append("b=" + C8413a.f20329k + "&");
                    }
                    if (!TextUtils.isEmpty(C8413a.f20330l)) {
                        stringBuffer.append("c=" + C8413a.f20330l + "&");
                    }
                    if (z) {
                        stringBuffer.append("hb=1&");
                    } else {
                        stringBuffer.append("hb=0&");
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        stringBuffer.append("rid=");
                        stringBuffer.append(str3);
                        stringBuffer.append("&");
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        stringBuffer.append("rid_n=");
                        stringBuffer.append(str4);
                        stringBuffer.append("&");
                    }
                    stringBuffer.append("reason=" + str);
                    if (!(campaignEx == null || campaignEx.getRewardTemplateMode() == null)) {
                        try {
                            int i = C8613y.m24953i(campaignEx.getRewardTemplateMode().mo57205e());
                            if (i != -1) {
                                stringBuffer.append("&view=");
                                stringBuffer.append(i);
                            }
                        } catch (Exception unused) {
                        }
                    }
                    if (campaignEx != null) {
                        stringBuffer.append("&adspace_t=");
                        stringBuffer.append(campaignEx.getAdSpaceT());
                    }
                    if (C8518b.m24607a().mo57681c()) {
                        C8518b.m24607a().mo57679a(stringBuffer.toString());
                    } else {
                        m26120b(context, stringBuffer.toString());
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:5|6|(2:8|9)|10|(1:12)|13|(1:15)(1:16)|(1:18)|(3:22|23|(1:25))|26|27|(2:29|37)(2:30|38)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00fa */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0104 A[Catch:{ all -> 0x0118 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0110 A[Catch:{ all -> 0x0118 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m26114a(android.content.Context r4, com.mbridge.msdk.foundation.entity.CampaignEx r5, java.lang.String r6) {
        /*
            if (r4 == 0) goto L_0x011c
            if (r5 == 0) goto L_0x011c
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0118 }
            if (r0 != 0) goto L_0x011c
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ all -> 0x0118 }
            r0.<init>()     // Catch:{ all -> 0x0118 }
            java.lang.String r1 = "key=2000048&"
            r0.append(r1)     // Catch:{ all -> 0x0118 }
            java.lang.String r1 = "&"
            if (r5 == 0) goto L_0x0033
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0118 }
            r2.<init>()     // Catch:{ all -> 0x0118 }
            java.lang.String r3 = "cid="
            r2.append(r3)     // Catch:{ all -> 0x0118 }
            java.lang.String r3 = r5.getId()     // Catch:{ all -> 0x0118 }
            r2.append(r3)     // Catch:{ all -> 0x0118 }
            r2.append(r1)     // Catch:{ all -> 0x0118 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0118 }
            r0.append(r2)     // Catch:{ all -> 0x0118 }
        L_0x0033:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0118 }
            r2.<init>()     // Catch:{ all -> 0x0118 }
            java.lang.String r3 = "network_type="
            r2.append(r3)     // Catch:{ all -> 0x0118 }
            int r3 = com.mbridge.msdk.foundation.tools.C8596q.m24849n(r4)     // Catch:{ all -> 0x0118 }
            r2.append(r3)     // Catch:{ all -> 0x0118 }
            r2.append(r1)     // Catch:{ all -> 0x0118 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0118 }
            r0.append(r2)     // Catch:{ all -> 0x0118 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0118 }
            r2.<init>()     // Catch:{ all -> 0x0118 }
            java.lang.String r3 = "unit_id="
            r2.append(r3)     // Catch:{ all -> 0x0118 }
            r2.append(r6)     // Catch:{ all -> 0x0118 }
            r2.append(r1)     // Catch:{ all -> 0x0118 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0118 }
            r0.append(r2)     // Catch:{ all -> 0x0118 }
            boolean r2 = com.mbridge.msdk.foundation.tools.C8613y.m24935b((com.mbridge.msdk.foundation.entity.CampaignEx) r5)     // Catch:{ all -> 0x0118 }
            if (r2 == 0) goto L_0x007a
            java.lang.String r2 = "rtins_type="
            r0.append(r2)     // Catch:{ all -> 0x0118 }
            int r2 = r5.getRtinsType()     // Catch:{ all -> 0x0118 }
            r0.append(r2)     // Catch:{ all -> 0x0118 }
            r0.append(r1)     // Catch:{ all -> 0x0118 }
        L_0x007a:
            boolean r2 = r5.isBidCampaign()     // Catch:{ all -> 0x0118 }
            if (r2 == 0) goto L_0x0086
            java.lang.String r2 = "hb=1&"
            r0.append(r2)     // Catch:{ all -> 0x0118 }
            goto L_0x008b
        L_0x0086:
            java.lang.String r2 = "hb=0&"
            r0.append(r2)     // Catch:{ all -> 0x0118 }
        L_0x008b:
            if (r5 == 0) goto L_0x00db
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0118 }
            r2.<init>()     // Catch:{ all -> 0x0118 }
            java.lang.String r3 = "rid="
            r2.append(r3)     // Catch:{ all -> 0x0118 }
            java.lang.String r3 = r5.getRequestId()     // Catch:{ all -> 0x0118 }
            r2.append(r3)     // Catch:{ all -> 0x0118 }
            r2.append(r1)     // Catch:{ all -> 0x0118 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0118 }
            r0.append(r2)     // Catch:{ all -> 0x0118 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0118 }
            r2.<init>()     // Catch:{ all -> 0x0118 }
            java.lang.String r3 = "rid_n="
            r2.append(r3)     // Catch:{ all -> 0x0118 }
            java.lang.String r3 = r5.getRequestIdNotice()     // Catch:{ all -> 0x0118 }
            r2.append(r3)     // Catch:{ all -> 0x0118 }
            r2.append(r1)     // Catch:{ all -> 0x0118 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0118 }
            r0.append(r1)     // Catch:{ all -> 0x0118 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0118 }
            r1.<init>()     // Catch:{ all -> 0x0118 }
            java.lang.String r2 = "adspace_t="
            r1.append(r2)     // Catch:{ all -> 0x0118 }
            int r2 = r5.getAdSpaceT()     // Catch:{ all -> 0x0118 }
            r1.append(r2)     // Catch:{ all -> 0x0118 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0118 }
            r0.append(r1)     // Catch:{ all -> 0x0118 }
        L_0x00db:
            if (r5 == 0) goto L_0x00fa
            com.mbridge.msdk.foundation.entity.CampaignEx$c r1 = r5.getRewardTemplateMode()     // Catch:{ all -> 0x0118 }
            if (r1 == 0) goto L_0x00fa
            com.mbridge.msdk.foundation.entity.CampaignEx$c r5 = r5.getRewardTemplateMode()     // Catch:{ Exception -> 0x00fa }
            java.lang.String r5 = r5.mo57205e()     // Catch:{ Exception -> 0x00fa }
            int r5 = com.mbridge.msdk.foundation.tools.C8613y.m24953i((java.lang.String) r5)     // Catch:{ Exception -> 0x00fa }
            r1 = -1
            if (r5 == r1) goto L_0x00fa
            java.lang.String r1 = "&view="
            r0.append(r1)     // Catch:{ Exception -> 0x00fa }
            r0.append(r5)     // Catch:{ Exception -> 0x00fa }
        L_0x00fa:
            com.mbridge.msdk.foundation.same.report.b r5 = com.mbridge.msdk.foundation.same.report.C8518b.m24607a()     // Catch:{ all -> 0x0118 }
            boolean r5 = r5.mo57681c()     // Catch:{ all -> 0x0118 }
            if (r5 == 0) goto L_0x0110
            com.mbridge.msdk.foundation.same.report.b r4 = com.mbridge.msdk.foundation.same.report.C8518b.m24607a()     // Catch:{ all -> 0x0118 }
            java.lang.String r5 = r0.toString()     // Catch:{ all -> 0x0118 }
            r4.mo57679a((java.lang.String) r5)     // Catch:{ all -> 0x0118 }
            goto L_0x011c
        L_0x0110:
            java.lang.String r5 = r0.toString()     // Catch:{ all -> 0x0118 }
            m26116a((android.content.Context) r4, (java.lang.String) r5, (java.lang.String) r6)     // Catch:{ all -> 0x0118 }
            goto L_0x011c
        L_0x0118:
            r4 = move-exception
            r4.printStackTrace()
        L_0x011c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.p342b.C9112a.m26114a(android.content.Context, com.mbridge.msdk.foundation.entity.CampaignEx, java.lang.String):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(16:7|(3:9|(1:11)(1:12)|13)|14|(1:16)|17|(1:19)|(1:21)(1:22)|23|(1:25)|26|(1:28)|29|(3:33|34|(1:36))|37|38|(2:40|48)(2:41|49)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x011a */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0124 A[Catch:{ all -> 0x0138 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0130 A[Catch:{ all -> 0x0138 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m26121b(com.mbridge.msdk.foundation.entity.CampaignEx r4, android.content.Context r5, java.lang.String r6, java.lang.String r7, boolean r8, java.lang.String r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "&"
            if (r5 == 0) goto L_0x013c
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0138 }
            if (r1 != 0) goto L_0x013c
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0138 }
            if (r1 != 0) goto L_0x013c
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch:{ all -> 0x0138 }
            r1.<init>()     // Catch:{ all -> 0x0138 }
            java.lang.String r2 = "key=2000047&"
            r1.append(r2)     // Catch:{ all -> 0x0138 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0138 }
            r2.<init>()     // Catch:{ all -> 0x0138 }
            java.lang.String r3 = "network_type="
            r2.append(r3)     // Catch:{ all -> 0x0138 }
            int r3 = com.mbridge.msdk.foundation.tools.C8596q.m24849n(r5)     // Catch:{ all -> 0x0138 }
            r2.append(r3)     // Catch:{ all -> 0x0138 }
            r2.append(r0)     // Catch:{ all -> 0x0138 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0138 }
            r1.append(r2)     // Catch:{ all -> 0x0138 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0138 }
            r2.<init>()     // Catch:{ all -> 0x0138 }
            java.lang.String r3 = "unit_id="
            r2.append(r3)     // Catch:{ all -> 0x0138 }
            r2.append(r7)     // Catch:{ all -> 0x0138 }
            r2.append(r0)     // Catch:{ all -> 0x0138 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0138 }
            r1.append(r2)     // Catch:{ all -> 0x0138 }
            boolean r2 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0138 }
            if (r2 != 0) goto L_0x0076
            java.util.HashMap<java.lang.String, java.lang.String> r2 = com.mbridge.msdk.foundation.controller.C2350a.f4905c     // Catch:{ all -> 0x0138 }
            java.lang.Object r7 = r2.get(r7)     // Catch:{ all -> 0x0138 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0138 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0138 }
            r2.<init>()     // Catch:{ all -> 0x0138 }
            java.lang.String r3 = "u_stid="
            r2.append(r3)     // Catch:{ all -> 0x0138 }
            if (r7 == 0) goto L_0x0067
            goto L_0x0069
        L_0x0067:
            java.lang.String r7 = ""
        L_0x0069:
            r2.append(r7)     // Catch:{ all -> 0x0138 }
            r2.append(r0)     // Catch:{ all -> 0x0138 }
            java.lang.String r7 = r2.toString()     // Catch:{ all -> 0x0138 }
            r1.append(r7)     // Catch:{ all -> 0x0138 }
        L_0x0076:
            java.lang.String r7 = com.mbridge.msdk.foundation.same.C8413a.f20329k     // Catch:{ all -> 0x0138 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0138 }
            if (r7 != 0) goto L_0x0097
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0138 }
            r7.<init>()     // Catch:{ all -> 0x0138 }
            java.lang.String r2 = "b="
            r7.append(r2)     // Catch:{ all -> 0x0138 }
            java.lang.String r2 = com.mbridge.msdk.foundation.same.C8413a.f20329k     // Catch:{ all -> 0x0138 }
            r7.append(r2)     // Catch:{ all -> 0x0138 }
            r7.append(r0)     // Catch:{ all -> 0x0138 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0138 }
            r1.append(r7)     // Catch:{ all -> 0x0138 }
        L_0x0097:
            java.lang.String r7 = com.mbridge.msdk.foundation.same.C8413a.f20330l     // Catch:{ all -> 0x0138 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0138 }
            if (r7 != 0) goto L_0x00b8
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0138 }
            r7.<init>()     // Catch:{ all -> 0x0138 }
            java.lang.String r2 = "c="
            r7.append(r2)     // Catch:{ all -> 0x0138 }
            java.lang.String r2 = com.mbridge.msdk.foundation.same.C8413a.f20330l     // Catch:{ all -> 0x0138 }
            r7.append(r2)     // Catch:{ all -> 0x0138 }
            r7.append(r0)     // Catch:{ all -> 0x0138 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0138 }
            r1.append(r7)     // Catch:{ all -> 0x0138 }
        L_0x00b8:
            if (r8 == 0) goto L_0x00c0
            java.lang.String r7 = "hb=1&"
            r1.append(r7)     // Catch:{ all -> 0x0138 }
            goto L_0x00c5
        L_0x00c0:
            java.lang.String r7 = "hb=0&"
            r1.append(r7)     // Catch:{ all -> 0x0138 }
        L_0x00c5:
            boolean r7 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0138 }
            if (r7 != 0) goto L_0x00d6
            java.lang.String r7 = "rid="
            r1.append(r7)     // Catch:{ all -> 0x0138 }
            r1.append(r9)     // Catch:{ all -> 0x0138 }
            r1.append(r0)     // Catch:{ all -> 0x0138 }
        L_0x00d6:
            boolean r7 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0138 }
            if (r7 != 0) goto L_0x00e7
            java.lang.String r7 = "rid_n="
            r1.append(r7)     // Catch:{ all -> 0x0138 }
            r1.append(r10)     // Catch:{ all -> 0x0138 }
            r1.append(r0)     // Catch:{ all -> 0x0138 }
        L_0x00e7:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0138 }
            r7.<init>()     // Catch:{ all -> 0x0138 }
            java.lang.String r8 = "reason="
            r7.append(r8)     // Catch:{ all -> 0x0138 }
            r7.append(r6)     // Catch:{ all -> 0x0138 }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x0138 }
            r1.append(r6)     // Catch:{ all -> 0x0138 }
            if (r4 == 0) goto L_0x011a
            com.mbridge.msdk.foundation.entity.CampaignEx$c r6 = r4.getRewardTemplateMode()     // Catch:{ all -> 0x0138 }
            if (r6 == 0) goto L_0x011a
            com.mbridge.msdk.foundation.entity.CampaignEx$c r4 = r4.getRewardTemplateMode()     // Catch:{ Exception -> 0x011a }
            java.lang.String r4 = r4.mo57205e()     // Catch:{ Exception -> 0x011a }
            int r4 = com.mbridge.msdk.foundation.tools.C8613y.m24953i((java.lang.String) r4)     // Catch:{ Exception -> 0x011a }
            r6 = -1
            if (r4 == r6) goto L_0x011a
            java.lang.String r6 = "&view="
            r1.append(r6)     // Catch:{ Exception -> 0x011a }
            r1.append(r4)     // Catch:{ Exception -> 0x011a }
        L_0x011a:
            com.mbridge.msdk.foundation.same.report.b r4 = com.mbridge.msdk.foundation.same.report.C8518b.m24607a()     // Catch:{ all -> 0x0138 }
            boolean r4 = r4.mo57681c()     // Catch:{ all -> 0x0138 }
            if (r4 == 0) goto L_0x0130
            com.mbridge.msdk.foundation.same.report.b r4 = com.mbridge.msdk.foundation.same.report.C8518b.m24607a()     // Catch:{ all -> 0x0138 }
            java.lang.String r5 = r1.toString()     // Catch:{ all -> 0x0138 }
            r4.mo57679a((java.lang.String) r5)     // Catch:{ all -> 0x0138 }
            goto L_0x013c
        L_0x0130:
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x0138 }
            m26120b(r5, r4)     // Catch:{ all -> 0x0138 }
            goto L_0x013c
        L_0x0138:
            r4 = move-exception
            r4.printStackTrace()
        L_0x013c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.p342b.C9112a.m26121b(com.mbridge.msdk.foundation.entity.CampaignEx, android.content.Context, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(18:7|(3:9|(1:11)(1:12)|13)|14|(1:16)|17|(1:19)|(1:21)(1:22)|23|24|(2:26|27)(1:(1:31))|32|33|(2:35|36)(1:(1:40))|41|(3:45|46|(1:48))|49|50|(2:52|60)(2:53|61)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0156 */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0160 A[Catch:{ all -> 0x0174 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x016c A[Catch:{ all -> 0x0174 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m26119a(com.mbridge.msdk.foundation.entity.CampaignEx r4, android.content.Context r5, java.lang.String r6, java.lang.String r7, boolean r8, java.lang.String r9, java.lang.String r10, long r11) {
        /*
            java.lang.String r0 = "&"
            if (r5 == 0) goto L_0x0178
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0174 }
            if (r1 != 0) goto L_0x0178
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0174 }
            if (r1 != 0) goto L_0x0178
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch:{ all -> 0x0174 }
            r1.<init>()     // Catch:{ all -> 0x0174 }
            java.lang.String r2 = "key=2000078&"
            r1.append(r2)     // Catch:{ all -> 0x0174 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0174 }
            r2.<init>()     // Catch:{ all -> 0x0174 }
            java.lang.String r3 = "network_type="
            r2.append(r3)     // Catch:{ all -> 0x0174 }
            int r3 = com.mbridge.msdk.foundation.tools.C8596q.m24849n(r5)     // Catch:{ all -> 0x0174 }
            r2.append(r3)     // Catch:{ all -> 0x0174 }
            r2.append(r0)     // Catch:{ all -> 0x0174 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0174 }
            r1.append(r2)     // Catch:{ all -> 0x0174 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0174 }
            r2.<init>()     // Catch:{ all -> 0x0174 }
            java.lang.String r3 = "unit_id="
            r2.append(r3)     // Catch:{ all -> 0x0174 }
            r2.append(r7)     // Catch:{ all -> 0x0174 }
            r2.append(r0)     // Catch:{ all -> 0x0174 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0174 }
            r1.append(r2)     // Catch:{ all -> 0x0174 }
            boolean r2 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0174 }
            if (r2 != 0) goto L_0x0076
            java.util.HashMap<java.lang.String, java.lang.String> r2 = com.mbridge.msdk.foundation.controller.C2350a.f4905c     // Catch:{ all -> 0x0174 }
            java.lang.Object r7 = r2.get(r7)     // Catch:{ all -> 0x0174 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0174 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0174 }
            r2.<init>()     // Catch:{ all -> 0x0174 }
            java.lang.String r3 = "u_stid="
            r2.append(r3)     // Catch:{ all -> 0x0174 }
            if (r7 == 0) goto L_0x0067
            goto L_0x0069
        L_0x0067:
            java.lang.String r7 = ""
        L_0x0069:
            r2.append(r7)     // Catch:{ all -> 0x0174 }
            r2.append(r0)     // Catch:{ all -> 0x0174 }
            java.lang.String r7 = r2.toString()     // Catch:{ all -> 0x0174 }
            r1.append(r7)     // Catch:{ all -> 0x0174 }
        L_0x0076:
            java.lang.String r7 = com.mbridge.msdk.foundation.same.C8413a.f20329k     // Catch:{ all -> 0x0174 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0174 }
            if (r7 != 0) goto L_0x0097
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0174 }
            r7.<init>()     // Catch:{ all -> 0x0174 }
            java.lang.String r2 = "b="
            r7.append(r2)     // Catch:{ all -> 0x0174 }
            java.lang.String r2 = com.mbridge.msdk.foundation.same.C8413a.f20329k     // Catch:{ all -> 0x0174 }
            r7.append(r2)     // Catch:{ all -> 0x0174 }
            r7.append(r0)     // Catch:{ all -> 0x0174 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0174 }
            r1.append(r7)     // Catch:{ all -> 0x0174 }
        L_0x0097:
            java.lang.String r7 = com.mbridge.msdk.foundation.same.C8413a.f20330l     // Catch:{ all -> 0x0174 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0174 }
            if (r7 != 0) goto L_0x00b8
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0174 }
            r7.<init>()     // Catch:{ all -> 0x0174 }
            java.lang.String r2 = "c="
            r7.append(r2)     // Catch:{ all -> 0x0174 }
            java.lang.String r2 = com.mbridge.msdk.foundation.same.C8413a.f20330l     // Catch:{ all -> 0x0174 }
            r7.append(r2)     // Catch:{ all -> 0x0174 }
            r7.append(r0)     // Catch:{ all -> 0x0174 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0174 }
            r1.append(r7)     // Catch:{ all -> 0x0174 }
        L_0x00b8:
            if (r8 == 0) goto L_0x00c0
            java.lang.String r7 = "hb=1&"
            r1.append(r7)     // Catch:{ all -> 0x0174 }
            goto L_0x00c5
        L_0x00c0:
            java.lang.String r7 = "hb=0&"
            r1.append(r7)     // Catch:{ all -> 0x0174 }
        L_0x00c5:
            boolean r7 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0174 }
            java.lang.String r8 = "rid="
            if (r7 != 0) goto L_0x00d7
            r1.append(r8)     // Catch:{ all -> 0x0174 }
            r1.append(r9)     // Catch:{ all -> 0x0174 }
            r1.append(r0)     // Catch:{ all -> 0x0174 }
            goto L_0x00f0
        L_0x00d7:
            if (r4 == 0) goto L_0x00f0
            java.lang.String r7 = r4.getRequestId()     // Catch:{ all -> 0x0174 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0174 }
            if (r7 != 0) goto L_0x00f0
            r1.append(r8)     // Catch:{ all -> 0x0174 }
            java.lang.String r7 = r4.getRequestId()     // Catch:{ all -> 0x0174 }
            r1.append(r7)     // Catch:{ all -> 0x0174 }
            r1.append(r0)     // Catch:{ all -> 0x0174 }
        L_0x00f0:
            boolean r7 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0174 }
            java.lang.String r8 = "rid_n="
            if (r7 != 0) goto L_0x0102
            r1.append(r8)     // Catch:{ all -> 0x0174 }
            r1.append(r10)     // Catch:{ all -> 0x0174 }
            r1.append(r0)     // Catch:{ all -> 0x0174 }
            goto L_0x011b
        L_0x0102:
            if (r4 == 0) goto L_0x011b
            java.lang.String r7 = r4.getRequestIdNotice()     // Catch:{ all -> 0x0174 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0174 }
            if (r7 != 0) goto L_0x011b
            r1.append(r8)     // Catch:{ all -> 0x0174 }
            java.lang.String r7 = r4.getRequestIdNotice()     // Catch:{ all -> 0x0174 }
            r1.append(r7)     // Catch:{ all -> 0x0174 }
            r1.append(r0)     // Catch:{ all -> 0x0174 }
        L_0x011b:
            java.lang.String r7 = "during="
            r1.append(r7)     // Catch:{ all -> 0x0174 }
            r1.append(r11)     // Catch:{ all -> 0x0174 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0174 }
            r7.<init>()     // Catch:{ all -> 0x0174 }
            java.lang.String r8 = "&reason="
            r7.append(r8)     // Catch:{ all -> 0x0174 }
            r7.append(r6)     // Catch:{ all -> 0x0174 }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x0174 }
            r1.append(r6)     // Catch:{ all -> 0x0174 }
            if (r4 == 0) goto L_0x0156
            com.mbridge.msdk.foundation.entity.CampaignEx$c r6 = r4.getRewardTemplateMode()     // Catch:{ all -> 0x0174 }
            if (r6 == 0) goto L_0x0156
            com.mbridge.msdk.foundation.entity.CampaignEx$c r4 = r4.getRewardTemplateMode()     // Catch:{ Exception -> 0x0156 }
            java.lang.String r4 = r4.mo57205e()     // Catch:{ Exception -> 0x0156 }
            int r4 = com.mbridge.msdk.foundation.tools.C8613y.m24953i((java.lang.String) r4)     // Catch:{ Exception -> 0x0156 }
            r6 = -1
            if (r4 == r6) goto L_0x0156
            java.lang.String r6 = "&view="
            r1.append(r6)     // Catch:{ Exception -> 0x0156 }
            r1.append(r4)     // Catch:{ Exception -> 0x0156 }
        L_0x0156:
            com.mbridge.msdk.foundation.same.report.b r4 = com.mbridge.msdk.foundation.same.report.C8518b.m24607a()     // Catch:{ all -> 0x0174 }
            boolean r4 = r4.mo57681c()     // Catch:{ all -> 0x0174 }
            if (r4 == 0) goto L_0x016c
            com.mbridge.msdk.foundation.same.report.b r4 = com.mbridge.msdk.foundation.same.report.C8518b.m24607a()     // Catch:{ all -> 0x0174 }
            java.lang.String r5 = r1.toString()     // Catch:{ all -> 0x0174 }
            r4.mo57679a((java.lang.String) r5)     // Catch:{ all -> 0x0174 }
            goto L_0x0178
        L_0x016c:
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x0174 }
            m26120b(r5, r4)     // Catch:{ all -> 0x0174 }
            goto L_0x0178
        L_0x0174:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0178:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.p342b.C9112a.m26119a(com.mbridge.msdk.foundation.entity.CampaignEx, android.content.Context, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, long):void");
    }
}
