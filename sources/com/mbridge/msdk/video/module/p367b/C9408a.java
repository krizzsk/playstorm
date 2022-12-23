package com.mbridge.msdk.video.module.p367b;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.same.net.p310f.C8487d;
import com.mbridge.msdk.foundation.same.net.p311g.C8494d;
import com.mbridge.msdk.foundation.same.report.C8518b;
import com.mbridge.msdk.foundation.same.report.C8542e;
import com.mbridge.msdk.foundation.same.report.p315d.C8540a;
import com.mbridge.msdk.foundation.same.report.p315d.C8541b;
import com.mbridge.msdk.videocommon.p373d.C9549b;

/* renamed from: com.mbridge.msdk.video.module.b.a */
/* compiled from: RewardDynamicViewReporter */
public final class C9408a {
    /* renamed from: a */
    public static void m26940a(String str, String str2, String str3, String str4, String[] strArr, String[] strArr2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && strArr != null && strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            try {
                StringBuilder sb = new StringBuilder("key=2000103&");
                sb.append("type=choseFromTwoShow&cltp=");
                sb.append(str3);
                sb.append("&");
                sb.append("rid=");
                sb.append(str2);
                sb.append("&");
                sb.append("unit_id=");
                sb.append(str);
                sb.append("&");
                sb.append("xt=");
                sb.append(str4);
                sb.append("&");
                String str5 = "";
                String str6 = str5;
                for (int i = 0; i < strArr.length; i++) {
                    String str7 = strArr[i];
                    if (!TextUtils.isEmpty(str7)) {
                        str6 = str6 + str7;
                        if (i < strArr.length - 1) {
                            str6 = str6 + ",";
                        }
                    }
                }
                sb.append("cids=");
                sb.append(str6);
                sb.append("&");
                for (int i2 = 0; i2 < strArr2.length; i2++) {
                    String str8 = strArr2[i2];
                    if (!TextUtils.isEmpty(str8)) {
                        str5 = str5 + str8;
                        if (i2 < strArr2.length - 1) {
                            str5 = str5 + ",";
                        }
                    }
                }
                sb.append("rid_ns=");
                sb.append(str5);
                if (C8518b.m24607a().mo57681c()) {
                    C8518b.m24607a().mo57679a(sb.toString());
                    return;
                }
                C8494d a = C8542e.m24691a(sb.toString(), C2350a.m5601e().mo15792g(), str);
                if (a != null) {
                    m26936a(a);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m26938a(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            try {
                StringBuilder sb = new StringBuilder("key=2000103&");
                sb.append("type=choseFromTwoSelect&rid=");
                sb.append(str2);
                sb.append("&");
                sb.append("choose_cid=");
                sb.append(str3);
                sb.append("&");
                sb.append("rid_n=");
                sb.append(str4);
                sb.append("&");
                sb.append("click=");
                sb.append(i);
                sb.append("&");
                sb.append("unit_id=");
                sb.append(str);
                sb.append("&");
                sb.append("time=");
                sb.append(str5);
                sb.append("&");
                sb.append("alecfc=");
                sb.append(str6);
                sb.append("&");
                sb.append("template_id=");
                sb.append(str7);
                if (C8518b.m24607a().mo57681c()) {
                    C8518b.m24607a().mo57679a(sb.toString());
                    return;
                }
                C8494d a = C8542e.m24691a(sb.toString(), C2350a.m5601e().mo15792g(), str);
                if (a != null) {
                    m26936a(a);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003b, code lost:
        r17 = r1;
        r18 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0050, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
        r17 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0059, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005a, code lost:
        r14 = null;
        r17 = null;
        r18 = null;
        r12 = r4;
        r13 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0062, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0063, code lost:
        r13 = null;
        r14 = null;
        r17 = null;
        r18 = null;
        r12 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006c, code lost:
        r12 = null;
        r13 = null;
        r14 = null;
        r17 = null;
        r18 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007d, code lost:
        m26938a(r19, "", "", "", r21, r22, "", "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[ExcHandler: Exception (unused java.lang.Exception), SYNTHETIC, Splitter:B:4:0x000d] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m26937a(java.lang.String r19, com.mbridge.msdk.foundation.entity.CampaignEx r20, int r21, java.lang.String r22) {
        /*
            java.lang.String r1 = ""
            boolean r0 = android.text.TextUtils.isEmpty(r19)
            if (r0 != 0) goto L_0x0090
            if (r20 != 0) goto L_0x000c
            goto L_0x0090
        L_0x000c:
            r2 = 0
            java.lang.String r4 = r20.getRequestId()     // Catch:{ Exception -> 0x007d, all -> 0x006b }
            java.lang.String r5 = r20.getId()     // Catch:{ Exception -> 0x007d, all -> 0x0062 }
            java.lang.String r6 = r20.getRequestIdNotice()     // Catch:{ Exception -> 0x007d, all -> 0x0059 }
            com.mbridge.msdk.foundation.entity.CampaignEx$c r0 = r20.getRewardTemplateMode()     // Catch:{ Exception -> 0x007d, all -> 0x0050 }
            if (r0 == 0) goto L_0x0044
            java.lang.String r2 = r0.mo57205e()     // Catch:{ Exception -> 0x007d, all -> 0x0040 }
            int r0 = r0.mo57202b()     // Catch:{ Exception -> 0x007d, all -> 0x0040 }
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x007d, all -> 0x0040 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x007d, all -> 0x003a }
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = "alecfc"
            java.lang.String r1 = com.mbridge.msdk.foundation.tools.C8557ad.m24740a(r2, r0)     // Catch:{ Exception -> 0x007d, all -> 0x003a }
        L_0x0037:
            r9 = r1
            r10 = r3
            goto L_0x0046
        L_0x003a:
            r0 = move-exception
            r17 = r1
            r18 = r3
            goto L_0x0055
        L_0x0040:
            r0 = move-exception
            r17 = r1
            goto L_0x0053
        L_0x0044:
            r9 = r1
            r10 = r9
        L_0x0046:
            r3 = r19
            r7 = r21
            r8 = r22
            m26938a((java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (int) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10)
            goto L_0x0090
        L_0x0050:
            r0 = move-exception
            r17 = r2
        L_0x0053:
            r18 = r17
        L_0x0055:
            r12 = r4
            r13 = r5
            r14 = r6
            goto L_0x0073
        L_0x0059:
            r0 = move-exception
            r14 = r2
            r17 = r14
            r18 = r17
            r12 = r4
            r13 = r5
            goto L_0x0073
        L_0x0062:
            r0 = move-exception
            r13 = r2
            r14 = r13
            r17 = r14
            r18 = r17
            r12 = r4
            goto L_0x0073
        L_0x006b:
            r0 = move-exception
            r12 = r2
            r13 = r12
            r14 = r13
            r17 = r14
            r18 = r17
        L_0x0073:
            r11 = r19
            r15 = r21
            r16 = r22
            m26938a((java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13, (java.lang.String) r14, (int) r15, (java.lang.String) r16, (java.lang.String) r17, (java.lang.String) r18)
            throw r0
        L_0x007d:
            java.lang.String r2 = ""
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            java.lang.String r7 = ""
            java.lang.String r8 = ""
            r1 = r19
            r5 = r21
            r6 = r22
            m26938a((java.lang.String) r1, (java.lang.String) r2, (java.lang.String) r3, (java.lang.String) r4, (int) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8)
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.p367b.C9408a.m26937a(java.lang.String, com.mbridge.msdk.foundation.entity.CampaignEx, int, java.lang.String):void");
    }

    /* renamed from: a */
    public static void m26939a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str6) && !TextUtils.isEmpty(str7)) {
            try {
                StringBuilder sb = new StringBuilder("key=2000103&");
                sb.append("type=choseFromTwoClose&rid=");
                sb.append(str2);
                sb.append("&");
                sb.append("choose_cid=");
                sb.append(str6);
                sb.append("&");
                sb.append("rid_n=");
                sb.append(str7);
                sb.append("&");
                sb.append("mof=");
                sb.append(str4);
                sb.append("&");
                sb.append("unit_id=");
                sb.append(str);
                sb.append("&");
                sb.append("endcard_id=");
                sb.append(str5);
                sb.append("&");
                sb.append("alecfc=");
                sb.append(str3);
                sb.append("&");
                sb.append("template_id=");
                sb.append(str8);
                if (C8518b.m24607a().mo57681c()) {
                    C8518b.m24607a().mo57679a(sb.toString());
                    return;
                }
                C8494d a = C8542e.m24691a(sb.toString(), C2350a.m5601e().mo15792g(), str);
                if (a != null) {
                    m26936a(a);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m26936a(C8494d dVar) {
        if (dVar != null) {
            try {
                C8540a aVar = new C8540a(C2350a.m5601e().mo15792g());
                dVar.mo57606a("r_stid", C9549b.m27299a().mo63129b().mo63105a());
                aVar.mo57603c(0, C8487d.m24492a().f20531a, dVar, new C8541b() {
                    /* renamed from: a */
                    public final void mo15651a(String str) {
                    }

                    /* renamed from: b */
                    public final void mo15652b(String str) {
                    }
                });
            } catch (Exception unused) {
            }
        }
    }
}
