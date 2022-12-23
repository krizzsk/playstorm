package com.mbridge.msdk.foundation.p066db;

import android.content.ContentValues;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.C8412m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C8556ac;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.vungle.warren.model.AdvertisementDBAdapter;
import com.vungle.warren.model.VisionDataDBAdapter;
import java.net.URLEncoder;

/* renamed from: com.mbridge.msdk.foundation.db.p */
/* compiled from: VideoReportDataDao */
public class C2385p extends C2365a<C8412m> {

    /* renamed from: a */
    private static final String f5004a = C2385p.class.getName();

    /* renamed from: b */
    private static C2385p f5005b = null;

    private C2385p(C2374f fVar) {
        super(fVar);
    }

    /* renamed from: a */
    public static synchronized C2385p m5777a(C2374f fVar) {
        C2385p pVar;
        synchronized (C2385p.class) {
            if (f5005b == null) {
                f5005b = new C2385p(fVar);
            }
            pVar = f5005b;
        }
        return pVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:120|121|(0)|125|126) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:125:0x0351 */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0346 A[SYNTHETIC, Splitter:B:118:0x0346] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x034e A[SYNTHETIC, Splitter:B:123:0x034e] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<com.mbridge.msdk.foundation.entity.C8412m> mo15935a(java.lang.String r26) {
        /*
            r25 = this;
            r0 = r26
            monitor-enter(r25)
            boolean r1 = android.text.TextUtils.isEmpty(r26)     // Catch:{ all -> 0x0355 }
            if (r1 != 0) goto L_0x0352
            android.database.sqlite.SQLiteDatabase r2 = r25.getReadableDatabase()     // Catch:{ Exception -> 0x0336, all -> 0x0333 }
            java.lang.String r3 = "reward_report"
            r4 = 0
            java.lang.String r5 = "key=?"
            r11 = 1
            java.lang.String[] r6 = new java.lang.String[r11]     // Catch:{ Exception -> 0x0336, all -> 0x0333 }
            r12 = 0
            r6[r12] = r0     // Catch:{ Exception -> 0x0336, all -> 0x0333 }
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r13 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0336, all -> 0x0333 }
            if (r13 == 0) goto L_0x032c
            int r1 = r13.getCount()     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            if (r1 <= 0) goto L_0x032c
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            r14.<init>()     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
        L_0x002c:
            boolean r1 = r13.moveToNext()     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            if (r1 == 0) goto L_0x031c
            java.lang.String r1 = "key"
            int r1 = r13.getColumnIndex(r1)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            java.lang.String r3 = r13.getString(r1)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            java.lang.String r1 = "networkType"
            int r1 = r13.getColumnIndex(r1)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            int r4 = r13.getInt(r1)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            java.lang.String r1 = "network_str"
            int r1 = r13.getColumnIndex(r1)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            java.lang.String r7 = r13.getString(r1)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            java.lang.String r1 = "isCompleteView"
            int r1 = r13.getColumnIndex(r1)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            r13.getInt(r1)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            java.lang.String r1 = "watchedMillis"
            int r1 = r13.getColumnIndex(r1)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            r13.getInt(r1)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            java.lang.String r1 = "videoLength"
            int r1 = r13.getColumnIndex(r1)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            int r18 = r13.getInt(r1)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            java.lang.String r1 = "offerUrl"
            int r1 = r13.getColumnIndex(r1)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            java.lang.String r5 = r13.getString(r1)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            java.lang.String r1 = "reason"
            int r1 = r13.getColumnIndex(r1)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            java.lang.String r8 = r13.getString(r1)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            java.lang.String r1 = "result"
            int r1 = r13.getColumnIndex(r1)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            int r6 = r13.getInt(r1)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            java.lang.String r1 = "duration"
            int r1 = r13.getColumnIndex(r1)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            java.lang.String r21 = r13.getString(r1)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            java.lang.String r1 = "videoSize"
            int r1 = r13.getColumnIndex(r1)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            int r22 = r13.getInt(r1)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            java.lang.String r1 = "campaignId"
            int r1 = r13.getColumnIndex(r1)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            java.lang.String r9 = r13.getString(r1)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            java.lang.String r1 = "video_url"
            int r1 = r13.getColumnIndex(r1)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            java.lang.String r1 = r13.getString(r1)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            java.lang.String r2 = "unitId"
            int r2 = r13.getColumnIndex(r2)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            java.lang.String r15 = r13.getString(r2)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            java.lang.String r2 = "rid"
            int r2 = r13.getColumnIndex(r2)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            java.lang.String r2 = r13.getString(r2)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            java.lang.String r10 = "rid_n"
            int r10 = r13.getColumnIndex(r10)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            java.lang.String r10 = r13.getString(r10)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            java.lang.String r12 = "ad_type"
            int r12 = r13.getColumnIndex(r12)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            java.lang.String r12 = r13.getString(r12)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            java.lang.String r11 = "resource_type"
            int r11 = r13.getColumnIndex(r11)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            java.lang.String r11 = r13.getString(r11)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            r16 = r2
            java.lang.String r2 = "device_id"
            int r2 = r13.getColumnIndex(r2)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            java.lang.String r2 = r13.getString(r2)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            r17 = r2
            java.lang.String r2 = "creative"
            int r2 = r13.getColumnIndex(r2)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            java.lang.String r2 = r13.getString(r2)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            r19 = r2
            java.lang.String r2 = "adspace_t"
            int r2 = r13.getColumnIndex(r2)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            int r2 = r13.getInt(r2)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            r20 = r2
            java.lang.String r2 = "2000021"
            boolean r2 = r0.equals(r2)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            if (r2 == 0) goto L_0x0132
            com.mbridge.msdk.foundation.entity.m r11 = new com.mbridge.msdk.foundation.entity.m     // Catch:{ Exception -> 0x012f }
            r12 = r16
            r2 = r11
            r6 = r8
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x012f }
            r11.mo57469n(r9)     // Catch:{ Exception -> 0x012f }
            r11.mo57451e((java.lang.String) r1)     // Catch:{ Exception -> 0x012f }
            r11.mo57463k(r12)     // Catch:{ Exception -> 0x012f }
            r11.mo57465l(r10)     // Catch:{ Exception -> 0x012f }
            r11.mo57467m(r15)     // Catch:{ Exception -> 0x012f }
            r7 = r13
            r24 = r14
            goto L_0x02d3
        L_0x012f:
            r0 = move-exception
            goto L_0x0338
        L_0x0132:
            r2 = r16
            r16 = r15
            java.lang.String r15 = "2000022"
            boolean r15 = r0.equals(r15)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            if (r15 == 0) goto L_0x0168
            com.mbridge.msdk.foundation.entity.m r11 = new com.mbridge.msdk.foundation.entity.m     // Catch:{ Exception -> 0x012f }
            r24 = r14
            r14 = r16
            r15 = r11
            r16 = r3
            r17 = r4
            r19 = r5
            r20 = r6
            r23 = r7
            r15.<init>((java.lang.String) r16, (int) r17, (int) r18, (java.lang.String) r19, (int) r20, (java.lang.String) r21, (int) r22, (java.lang.String) r23)     // Catch:{ Exception -> 0x012f }
            r11.mo57469n(r9)     // Catch:{ Exception -> 0x012f }
            r11.mo57451e((java.lang.String) r1)     // Catch:{ Exception -> 0x012f }
            r11.mo57463k(r2)     // Catch:{ Exception -> 0x012f }
            r11.mo57465l(r10)     // Catch:{ Exception -> 0x012f }
            r11.mo57467m(r14)     // Catch:{ Exception -> 0x012f }
            r11.mo57473p(r8)     // Catch:{ Exception -> 0x012f }
            r11.mo57457h((java.lang.String) r12)     // Catch:{ Exception -> 0x012f }
            goto L_0x0184
        L_0x0168:
            r24 = r14
            r14 = r16
            java.lang.String r1 = "2000025"
            boolean r1 = r0.equals(r1)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            if (r1 == 0) goto L_0x0187
            com.mbridge.msdk.foundation.entity.m r11 = new com.mbridge.msdk.foundation.entity.m     // Catch:{ Exception -> 0x012f }
            r15 = r11
            r16 = r3
            r17 = r4
            r19 = r5
            r20 = r6
            r23 = r7
            r15.<init>((java.lang.String) r16, (int) r17, (int) r18, (java.lang.String) r19, (int) r20, (java.lang.String) r21, (int) r22, (java.lang.String) r23)     // Catch:{ Exception -> 0x012f }
        L_0x0184:
            r7 = r13
            goto L_0x02d3
        L_0x0187:
            java.lang.String r1 = "2000024"
            boolean r1 = r0.equals(r1)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            if (r1 == 0) goto L_0x0197
            com.mbridge.msdk.foundation.entity.m r11 = new com.mbridge.msdk.foundation.entity.m     // Catch:{ Exception -> 0x012f }
            r2 = r11
            r6 = r8
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x012f }
            goto L_0x0184
        L_0x0197:
            java.lang.String r1 = "2000039"
            boolean r1 = r1.equals(r0)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            if (r1 == 0) goto L_0x01af
            java.lang.String r1 = "h5_click_data"
            int r1 = r13.getColumnIndex(r1)     // Catch:{ Exception -> 0x012f }
            java.lang.String r1 = r13.getString(r1)     // Catch:{ Exception -> 0x012f }
            com.mbridge.msdk.foundation.entity.m r11 = new com.mbridge.msdk.foundation.entity.m     // Catch:{ Exception -> 0x012f }
            r11.<init>(r1)     // Catch:{ Exception -> 0x012f }
            goto L_0x0184
        L_0x01af:
            java.lang.String r1 = "2000043"
            boolean r1 = r1.equals(r0)     // Catch:{ Exception -> 0x0329, all -> 0x0325 }
            if (r1 == 0) goto L_0x0228
            java.lang.String r1 = "type"
            int r1 = r13.getColumnIndex(r1)     // Catch:{ Exception -> 0x0223, all -> 0x021c }
            java.lang.String r15 = r13.getString(r1)     // Catch:{ Exception -> 0x0223, all -> 0x021c }
            java.lang.String r1 = "endcard_url"
            int r1 = r13.getColumnIndex(r1)     // Catch:{ Exception -> 0x0223, all -> 0x021c }
            java.lang.String r5 = r13.getString(r1)     // Catch:{ Exception -> 0x0223, all -> 0x021c }
            com.mbridge.msdk.foundation.entity.m r7 = new com.mbridge.msdk.foundation.entity.m     // Catch:{ Exception -> 0x0223, all -> 0x021c }
            r1 = r7
            r4 = r2
            r16 = r13
            r3 = r17
            r13 = r19
            r0 = r20
            r2 = r26
            r13 = r3
            r3 = r6
            r6 = r4
            r4 = r21
            r17 = r13
            r13 = r6
            r6 = r9
            r18 = r11
            r11 = r7
            r7 = r14
            r14 = r9
            r9 = r15
            r1.<init>((java.lang.String) r2, (int) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ Exception -> 0x0217, all -> 0x0215 }
            r11.mo57463k(r13)     // Catch:{ Exception -> 0x0217, all -> 0x0215 }
            r11.mo57465l(r10)     // Catch:{ Exception -> 0x0217, all -> 0x0215 }
            boolean r1 = android.text.TextUtils.isEmpty(r14)     // Catch:{ Exception -> 0x0217, all -> 0x0215 }
            if (r1 != 0) goto L_0x01fa
            r11.mo57469n(r14)     // Catch:{ Exception -> 0x0217, all -> 0x0215 }
        L_0x01fa:
            r11.mo57442b((int) r0)     // Catch:{ Exception -> 0x0217, all -> 0x0215 }
            r11.mo57457h((java.lang.String) r12)     // Catch:{ Exception -> 0x0217, all -> 0x0215 }
            r1 = r18
            r11.mo57440a((java.lang.String) r1)     // Catch:{ Exception -> 0x0217, all -> 0x0215 }
            r2 = r17
            r11.mo57443b((java.lang.String) r2)     // Catch:{ Exception -> 0x0217, all -> 0x0215 }
            r3 = r19
            r11.mo57446c((java.lang.String) r3)     // Catch:{ Exception -> 0x0217, all -> 0x0215 }
            r0 = r26
            r7 = r16
            goto L_0x02d3
        L_0x0215:
            r0 = move-exception
            goto L_0x021f
        L_0x0217:
            r0 = move-exception
            r13 = r16
            goto L_0x0338
        L_0x021c:
            r0 = move-exception
            r16 = r13
        L_0x021f:
            r10 = r16
            goto L_0x034c
        L_0x0223:
            r0 = move-exception
            r16 = r13
            goto L_0x0338
        L_0x0228:
            r5 = r9
            r1 = r11
            r16 = r13
            r3 = r19
            r0 = r20
            r13 = r2
            r2 = r17
            java.lang.String r7 = "2000045"
            r9 = r0
            r0 = r26
            boolean r7 = r7.equals(r0)     // Catch:{ Exception -> 0x0318, all -> 0x0314 }
            if (r7 == 0) goto L_0x026b
            com.mbridge.msdk.foundation.entity.m r11 = new com.mbridge.msdk.foundation.entity.m     // Catch:{ Exception -> 0x0318, all -> 0x0314 }
            r11.<init>()     // Catch:{ Exception -> 0x0318, all -> 0x0314 }
            r11.mo57471o(r0)     // Catch:{ Exception -> 0x0318, all -> 0x0314 }
            r11.mo57445c((int) r4)     // Catch:{ Exception -> 0x0318, all -> 0x0314 }
            r11.mo57448d((int) r6)     // Catch:{ Exception -> 0x0318, all -> 0x0314 }
            r11.mo57469n(r5)     // Catch:{ Exception -> 0x0318, all -> 0x0314 }
            java.lang.String r1 = "template_url"
            r7 = r16
            int r1 = r7.getColumnIndex(r1)     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            java.lang.String r1 = r7.getString(r1)     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            r11.mo57459i(r1)     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            r11.mo57473p(r8)     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            r11.mo57463k(r13)     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            r11.mo57465l(r10)     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            r11.mo57467m(r14)     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            goto L_0x02d3
        L_0x026b:
            r7 = r16
            java.lang.String r11 = "2000044"
            boolean r11 = r11.equals(r0)     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            if (r11 == 0) goto L_0x029d
            com.mbridge.msdk.foundation.entity.m r11 = new com.mbridge.msdk.foundation.entity.m     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            r11.<init>()     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            r11.mo57471o(r0)     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            r11.mo57445c((int) r4)     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            r11.mo57469n(r5)     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            java.lang.String r1 = "image_url"
            int r1 = r7.getColumnIndex(r1)     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            java.lang.String r1 = r7.getString(r1)     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            r11.mo57449d((java.lang.String) r1)     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            r11.mo57473p(r8)     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            r11.mo57463k(r13)     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            r11.mo57465l(r10)     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            r11.mo57467m(r14)     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            goto L_0x02d3
        L_0x029d:
            java.lang.String r11 = "2000054"
            boolean r11 = r11.equals(r0)     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            if (r11 == 0) goto L_0x02d2
            com.mbridge.msdk.foundation.entity.m r11 = new com.mbridge.msdk.foundation.entity.m     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            r11.<init>()     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            r11.mo57471o(r0)     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            r11.mo57440a((java.lang.String) r1)     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            r11.mo57467m(r14)     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            r11.mo57443b((java.lang.String) r2)     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            r11.mo57457h((java.lang.String) r12)     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            r11.mo57469n(r5)     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            r11.mo57463k(r13)     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            r11.mo57465l(r10)     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            r11.mo57448d((int) r6)     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            r11.mo57473p(r8)     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            r11.mo57445c((int) r4)     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            r11.mo57446c((java.lang.String) r3)     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            r11.mo57442b((int) r9)     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            goto L_0x02d3
        L_0x02d2:
            r11 = 0
        L_0x02d3:
            if (r11 == 0) goto L_0x02db
            r1 = r24
            r1.add(r11)     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            goto L_0x02dd
        L_0x02db:
            r1 = r24
        L_0x02dd:
            java.lang.String r2 = "id"
            int r2 = r7.getColumnIndex(r2)     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            int r2 = r7.getInt(r2)     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            android.database.sqlite.SQLiteDatabase r3 = r25.getWritableDatabase()     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            java.lang.String r4 = "reward_report"
            java.lang.String r5 = "id = ?"
            r6 = 1
            java.lang.String[] r8 = new java.lang.String[r6]     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            r9.<init>()     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            r9.append(r2)     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            java.lang.String r2 = ""
            r9.append(r2)     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            java.lang.String r2 = r9.toString()     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            r9 = 0
            r8[r9] = r2     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            r3.delete(r4, r5, r8)     // Catch:{ Exception -> 0x0311, all -> 0x030f }
            r14 = r1
            r11 = r6
            r13 = r7
            r12 = r9
            goto L_0x002c
        L_0x030f:
            r0 = move-exception
            goto L_0x0327
        L_0x0311:
            r0 = move-exception
        L_0x0312:
            r13 = r7
            goto L_0x0338
        L_0x0314:
            r0 = move-exception
            r7 = r16
            goto L_0x0327
        L_0x0318:
            r0 = move-exception
            r7 = r16
            goto L_0x0312
        L_0x031c:
            r7 = r13
            r1 = r14
            if (r7 == 0) goto L_0x0323
            r7.close()     // Catch:{ Exception -> 0x0323 }
        L_0x0323:
            monitor-exit(r25)
            return r1
        L_0x0325:
            r0 = move-exception
            r7 = r13
        L_0x0327:
            r10 = r7
            goto L_0x034c
        L_0x0329:
            r0 = move-exception
            r7 = r13
            goto L_0x0338
        L_0x032c:
            r7 = r13
            if (r7 == 0) goto L_0x0352
            r7.close()     // Catch:{ Exception -> 0x0352 }
            goto L_0x0352
        L_0x0333:
            r0 = move-exception
            r10 = 0
            goto L_0x034c
        L_0x0336:
            r0 = move-exception
            r13 = 0
        L_0x0338:
            r0.printStackTrace()     // Catch:{ all -> 0x034a }
            java.lang.String r1 = f5004a     // Catch:{ all -> 0x034a }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x034a }
            com.mbridge.msdk.foundation.tools.C8608u.m24884d(r1, r0)     // Catch:{ all -> 0x034a }
            if (r13 == 0) goto L_0x0352
            r13.close()     // Catch:{ Exception -> 0x0352 }
            goto L_0x0352
        L_0x034a:
            r0 = move-exception
            r10 = r13
        L_0x034c:
            if (r10 == 0) goto L_0x0351
            r10.close()     // Catch:{ Exception -> 0x0351 }
        L_0x0351:
            throw r0     // Catch:{ all -> 0x0355 }
        L_0x0352:
            monitor-exit(r25)
            r1 = 0
            return r1
        L_0x0355:
            r0 = move-exception
            monitor-exit(r25)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p066db.C2385p.mo15935a(java.lang.String):java.util.List");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v3, types: [android.database.Cursor] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        if (r0 == 0) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r0 != 0) goto L_0x001b;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x002f */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo15933a() {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            r1 = 0
            java.lang.String r2 = "select count(*) from reward_report"
            android.database.sqlite.SQLiteDatabase r3 = r4.getReadableDatabase()     // Catch:{ Exception -> 0x0021 }
            android.database.Cursor r0 = r3.rawQuery(r2, r0)     // Catch:{ Exception -> 0x0021 }
            if (r0 == 0) goto L_0x0019
            boolean r2 = r0.moveToFirst()     // Catch:{ Exception -> 0x0021 }
            if (r2 == 0) goto L_0x0019
            int r1 = r0.getInt(r1)     // Catch:{ Exception -> 0x0021 }
        L_0x0019:
            if (r0 == 0) goto L_0x0028
        L_0x001b:
            r0.close()     // Catch:{ Exception -> 0x0028 }
            goto L_0x0028
        L_0x001f:
            r1 = move-exception
            goto L_0x002a
        L_0x0021:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0028
            goto L_0x001b
        L_0x0028:
            monitor-exit(r4)
            return r1
        L_0x002a:
            if (r0 == 0) goto L_0x002f
            r0.close()     // Catch:{ Exception -> 0x002f }
        L_0x002f:
            throw r1     // Catch:{ all -> 0x0030 }
        L_0x0030:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p066db.C2385p.mo15933a():int");
    }

    /* renamed from: a */
    public final synchronized long mo15934a(C8412m mVar) {
        if (mVar != null) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put(SDKConstants.PARAM_KEY, mVar.mo57470o());
                contentValues.put("networkType", Integer.valueOf(mVar.mo57482v()));
                contentValues.put("network_str", mVar.mo57483w());
                contentValues.put("isCompleteView", Integer.valueOf(mVar.mo57484x()));
                contentValues.put("watchedMillis", Integer.valueOf(mVar.mo57472p()));
                contentValues.put("videoLength", Integer.valueOf(mVar.mo57474q()));
                if (!TextUtils.isEmpty(mVar.mo57476r())) {
                    contentValues.put("offerUrl", mVar.mo57476r());
                }
                if (!TextUtils.isEmpty(mVar.mo57478s())) {
                    contentValues.put(IronSourceConstants.EVENTS_ERROR_REASON, URLEncoder.encode(mVar.mo57478s(), "utf-8"));
                }
                contentValues.put(IronSourceConstants.EVENTS_RESULT, Integer.valueOf(mVar.mo57485y()));
                contentValues.put("duration", mVar.mo57479t());
                contentValues.put("videoSize", Long.valueOf(mVar.mo57481u()));
                contentValues.put("type", mVar.mo57454g());
                String f = mVar.mo57452f();
                if (!TextUtils.isEmpty(f)) {
                    contentValues.put(CampaignEx.ENDCARD_URL, f);
                }
                String e = mVar.mo57450e();
                if (!TextUtils.isEmpty(e)) {
                    contentValues.put("video_url", e);
                }
                String k = mVar.mo57462k();
                if (!TextUtils.isEmpty(k)) {
                    contentValues.put("rid", k);
                }
                String l = mVar.mo57464l();
                if (!TextUtils.isEmpty(l)) {
                    contentValues.put("rid_n", l);
                }
                String i = mVar.mo57458i();
                if (!TextUtils.isEmpty(i)) {
                    contentValues.put(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_TEMPLATE_URL, i);
                }
                String d = mVar.mo57447d();
                if (!TextUtils.isEmpty(d)) {
                    contentValues.put(CampaignEx.JSON_KEY_IMAGE_URL, d);
                }
                String h = mVar.mo57456h();
                if (!TextUtils.isEmpty(h)) {
                    contentValues.put("ad_type", URLEncoder.encode(h, "utf-8"));
                }
                contentValues.put("unitId", mVar.mo57466m());
                contentValues.put("campaignId", mVar.mo57468n());
                if ("2000039".equals(mVar.mo57470o())) {
                    String f2 = C8412m.m24233f(mVar);
                    if (C8556ac.m24738b(f2)) {
                        contentValues.put("h5_click_data", f2);
                    }
                }
                String a = mVar.mo57438a();
                if (!TextUtils.isEmpty(a)) {
                    contentValues.put("resource_type", URLEncoder.encode(a, "utf-8"));
                }
                String b = mVar.mo57441b();
                if (!TextUtils.isEmpty(b)) {
                    contentValues.put("device_id", URLEncoder.encode(b, "utf-8"));
                }
                String c = mVar.mo57444c();
                if (!TextUtils.isEmpty(c)) {
                    contentValues.put(VisionDataDBAdapter.VisionDataColumns.COLUMN_CREATIVE, URLEncoder.encode(c, "utf-8"));
                }
                contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, Integer.valueOf(mVar.mo57460j()));
                return getWritableDatabase().insert("reward_report", (String) null, contentValues);
            } catch (Exception e2) {
                e2.printStackTrace();
                C8608u.m24884d(f5004a, e2.getMessage());
            }
        }
        return -1;
    }
}
