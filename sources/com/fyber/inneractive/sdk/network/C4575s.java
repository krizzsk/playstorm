package com.fyber.inneractive.sdk.network;

import android.content.SharedPreferences;

/* renamed from: com.fyber.inneractive.sdk.network.s */
public class C4575s {

    /* renamed from: a */
    public SharedPreferences f11379a = null;

    /* renamed from: com.fyber.inneractive.sdk.network.s$a */
    public static final class C4576a {

        /* renamed from: a */
        public static C4575s f11380a = new C4575s();
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [com.fyber.inneractive.sdk.flow.j<? extends com.fyber.inneractive.sdk.response.e>, com.fyber.inneractive.sdk.flow.j] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m14052a(android.content.Context r11, java.lang.String r12, java.lang.String r13, com.fyber.inneractive.sdk.flow.C4419j<? extends com.fyber.inneractive.sdk.response.C5291e> r14) {
        /*
            java.lang.String r0 = "Got exception adding param to json object: %s, %s"
            r1 = 0
            if (r11 == 0) goto L_0x011c
            if (r12 == 0) goto L_0x011c
            com.fyber.inneractive.sdk.response.e r2 = r14.mo24367c()
            if (r2 != 0) goto L_0x000f
            goto L_0x011c
        L_0x000f:
            com.fyber.inneractive.sdk.network.s r2 = com.fyber.inneractive.sdk.network.C4575s.C4576a.f11380a
            android.content.SharedPreferences r3 = r2.f11379a
            if (r3 == 0) goto L_0x0016
            goto L_0x001e
        L_0x0016:
            java.lang.String r3 = "AutoWebActionPrefs"
            android.content.SharedPreferences r11 = r11.getSharedPreferences(r3, r1)
            r2.f11379a = r11
        L_0x001e:
            r11 = 1
            java.lang.Object[] r3 = new java.lang.Object[r11]
            r3[r1] = r12
            java.lang.String r4 = "IAautoWebActionReporter: reporting action: %s"
            com.fyber.inneractive.sdk.util.IAlog.m16702d(r4, r3)
            java.lang.Object[] r3 = new java.lang.Object[r11]
            r3[r1] = r13
            java.lang.String r4 = "IAautoWebActionReporter: url: %s"
            com.fyber.inneractive.sdk.util.IAlog.m16702d(r4, r3)
            com.fyber.inneractive.sdk.config.IAConfigManager r3 = com.fyber.inneractive.sdk.config.IAConfigManager.f10525J
            com.fyber.inneractive.sdk.config.q r4 = r3.f10544i
            boolean r4 = r4.f10684d
            if (r4 != 0) goto L_0x0042
            java.lang.Object[] r11 = new java.lang.Object[r1]
            java.lang.String r12 = "IAautoWebActionReporter: Report of Non user web actions disabled!"
            com.fyber.inneractive.sdk.util.IAlog.m16699a(r12, r11)
            goto L_0x011b
        L_0x0042:
            com.fyber.inneractive.sdk.network.q$a r4 = new com.fyber.inneractive.sdk.network.q$a
            com.fyber.inneractive.sdk.network.o r5 = com.fyber.inneractive.sdk.network.C4565o.MRAID_AUTO_ACTION_DETECTED
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r6 = r14.f10913a
            com.fyber.inneractive.sdk.response.e r7 = r14.mo24367c()
            com.fyber.inneractive.sdk.config.global.s r14 = r14.f10915c
            org.json.JSONArray r14 = r14.mo24342c()
            r4.<init>(r7)
            r4.f11364b = r5
            r4.f11363a = r6
            r4.f11366d = r14
            org.json.JSONObject r14 = new org.json.JSONObject
            r14.<init>()
            java.lang.String r5 = "action"
            r6 = 2
            r14.put(r5, r12)     // Catch:{ Exception -> 0x0067 }
            goto L_0x0070
        L_0x0067:
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r7[r1] = r5
            r7[r11] = r12
            com.fyber.inneractive.sdk.util.IAlog.m16703e(r0, r7)
        L_0x0070:
            boolean r12 = android.text.TextUtils.isEmpty(r13)
            if (r12 != 0) goto L_0x0085
            java.lang.String r12 = "url"
            r14.put(r12, r13)     // Catch:{ Exception -> 0x007c }
            goto L_0x0085
        L_0x007c:
            java.lang.Object[] r5 = new java.lang.Object[r6]
            r5[r1] = r12
            r5[r11] = r13
            com.fyber.inneractive.sdk.util.IAlog.m16703e(r0, r5)
        L_0x0085:
            android.content.SharedPreferences r12 = r2.f11379a
            java.lang.String r13 = "lastReportTS"
            r7 = 0
            long r9 = r12.getLong(r13, r7)
            java.lang.String r12 = "UTC"
            java.util.TimeZone r12 = java.util.TimeZone.getTimeZone(r12)
            java.util.Calendar r5 = java.util.Calendar.getInstance(r12)
            java.util.Calendar r12 = java.util.Calendar.getInstance(r12)
            r12.setTimeInMillis(r9)
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            java.lang.String r8 = "numReportsToday"
            if (r7 <= 0) goto L_0x00bf
            r7 = 6
            int r9 = r5.get(r7)
            int r12 = r12.get(r7)
            if (r9 != r12) goto L_0x00bf
            java.lang.Object[] r12 = new java.lang.Object[r1]
            java.lang.String r7 = "IAautoWebActionReporter: encountered same date"
            com.fyber.inneractive.sdk.util.IAlog.m16702d(r7, r12)
            android.content.SharedPreferences r12 = r2.f11379a
            int r12 = r12.getInt(r8, r1)
            goto L_0x00c0
        L_0x00bf:
            r12 = r1
        L_0x00c0:
            com.fyber.inneractive.sdk.config.q r3 = r3.f10544i
            int r3 = r3.f10685e
            java.lang.Object[] r7 = new java.lang.Object[r6]
            int r9 = r12 + 1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r7[r1] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            r7[r11] = r10
            java.lang.String r10 = "IAautoWebActionReporter: day counter: %d max: %d"
            com.fyber.inneractive.sdk.util.IAlog.m16702d(r10, r7)
            if (r12 >= r3) goto L_0x00e5
            java.lang.Object[] r12 = new java.lang.Object[r1]
            java.lang.String r3 = "IAautoWebActionReporter: adding ad data"
            com.fyber.inneractive.sdk.util.IAlog.m16702d(r3, r12)
            r4.f11369g = r11
            goto L_0x00ec
        L_0x00e5:
            java.lang.Object[] r12 = new java.lang.Object[r1]
            java.lang.String r3 = "IAautoWebActionReporter: not adding ad data"
            com.fyber.inneractive.sdk.util.IAlog.m16702d(r3, r12)
        L_0x00ec:
            java.lang.String r12 = "daily_count"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r14.put(r12, r3)     // Catch:{ Exception -> 0x00f6 }
            goto L_0x00ff
        L_0x00f6:
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r1] = r12
            r6[r11] = r3
            com.fyber.inneractive.sdk.util.IAlog.m16703e(r0, r6)
        L_0x00ff:
            org.json.JSONArray r11 = r4.f11368f
            r11.put(r14)
            r11 = 0
            r4.mo24768a((java.lang.String) r11)
            android.content.SharedPreferences r11 = r2.f11379a
            android.content.SharedPreferences$Editor r11 = r11.edit()
            long r0 = r5.getTimeInMillis()
            r11.putLong(r13, r0)
            r11.putInt(r8, r9)
            r11.apply()
        L_0x011b:
            return
        L_0x011c:
            java.lang.Object[] r11 = new java.lang.Object[r1]
            java.lang.String r12 = "Invalid report request parameters!"
            com.fyber.inneractive.sdk.util.IAlog.m16699a(r12, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.C4575s.m14052a(android.content.Context, java.lang.String, java.lang.String, com.fyber.inneractive.sdk.flow.j):void");
    }
}
