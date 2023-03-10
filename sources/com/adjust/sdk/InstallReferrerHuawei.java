package com.adjust.sdk;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

public class InstallReferrerHuawei {
    private static final int COLUMN_INDEX_CLICK_TIME = 1;
    private static final int COLUMN_INDEX_INSTALL_TIME = 2;
    private static final int COLUMN_INDEX_REFERRER = 0;
    private static final int COLUMN_INDEX_TRACK_ID = 4;
    private static final String REFERRER_PROVIDER_AUTHORITY = "com.huawei.appmarket.commondata";
    private static final String REFERRER_PROVIDER_URI = "content://com.huawei.appmarket.commondata/item/5";
    private Context context;
    private ILogger logger = AdjustFactory.getLogger();
    private final InstallReferrerReadListener referrerCallback;
    private final AtomicBoolean shouldTryToRead;

    public InstallReferrerHuawei(Context context2, InstallReferrerReadListener installReferrerReadListener) {
        this.context = context2;
        this.referrerCallback = installReferrerReadListener;
        this.shouldTryToRead = new AtomicBoolean(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00bf, code lost:
        if (r3 != null) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d4, code lost:
        if (r3 == null) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d6, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d9, code lost:
        r1.shouldTryToRead.set(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00de, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void readReferrer() {
        /*
            r19 = this;
            r1 = r19
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.shouldTryToRead
            boolean r0 = r0.get()
            r2 = 0
            if (r0 != 0) goto L_0x0015
            com.adjust.sdk.ILogger r0 = r1.logger
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "Should not try to read Install referrer Huawei"
            r0.debug(r3, r2)
            return
        L_0x0015:
            android.content.Context r0 = r1.context
            java.lang.String r3 = "com.huawei.appmarket.commondata"
            boolean r0 = com.adjust.sdk.Util.resolveContentProvider(r0, r3)
            if (r0 != 0) goto L_0x0020
            return
        L_0x0020:
            r3 = 0
            java.lang.String r0 = "content://com.huawei.appmarket.commondata/item/5"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.content.Context r4 = r1.context
            android.content.ContentResolver r4 = r4.getContentResolver()
            r10 = 1
            java.lang.String[] r8 = new java.lang.String[r10]
            android.content.Context r5 = r1.context
            java.lang.String r5 = r5.getPackageName()
            r8[r2] = r5
            r6 = 0
            r7 = 0
            r9 = 0
            r5 = r0
            android.database.Cursor r3 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x00c4 }
            r4 = 2
            if (r3 == 0) goto L_0x00a8
            boolean r5 = r3.moveToFirst()     // Catch:{ Exception -> 0x00c4 }
            if (r5 == 0) goto L_0x00a8
            java.lang.String r12 = r3.getString(r2)     // Catch:{ Exception -> 0x00c4 }
            r0 = 4
            java.lang.String r0 = r3.getString(r0)     // Catch:{ Exception -> 0x00c4 }
            com.adjust.sdk.ILogger r5 = r1.logger     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r6 = "InstallReferrerHuawei reads index_referrer[%s] index_track_id[%s]"
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x00c4 }
            r7[r2] = r12     // Catch:{ Exception -> 0x00c4 }
            r7[r10] = r0     // Catch:{ Exception -> 0x00c4 }
            r5.debug(r6, r7)     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r5 = r3.getString(r10)     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r6 = r3.getString(r4)     // Catch:{ Exception -> 0x00c4 }
            com.adjust.sdk.ILogger r7 = r1.logger     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r8 = "InstallReferrerHuawei reads clickTime[%s] installTime[%s]"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x00c4 }
            r4[r2] = r5     // Catch:{ Exception -> 0x00c4 }
            r4[r10] = r6     // Catch:{ Exception -> 0x00c4 }
            r7.debug(r8, r4)     // Catch:{ Exception -> 0x00c4 }
            long r4 = java.lang.Long.parseLong(r5)     // Catch:{ Exception -> 0x00c4 }
            long r17 = java.lang.Long.parseLong(r6)     // Catch:{ Exception -> 0x00c4 }
            boolean r6 = r1.isValidReferrerHuaweiAds(r12)     // Catch:{ Exception -> 0x00c4 }
            if (r6 == 0) goto L_0x0092
            com.adjust.sdk.ReferrerDetails r6 = new com.adjust.sdk.ReferrerDetails     // Catch:{ Exception -> 0x00c4 }
            r11 = r6
            r13 = r4
            r15 = r17
            r11.<init>(r12, r13, r15)     // Catch:{ Exception -> 0x00c4 }
            com.adjust.sdk.InstallReferrerReadListener r7 = r1.referrerCallback     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r8 = "huawei_ads"
            r7.onInstallReferrerRead(r6, r8)     // Catch:{ Exception -> 0x00c4 }
        L_0x0092:
            boolean r6 = r1.isValidReferrerHuaweiAppGallery(r0)     // Catch:{ Exception -> 0x00c4 }
            if (r6 == 0) goto L_0x00bf
            com.adjust.sdk.ReferrerDetails r6 = new com.adjust.sdk.ReferrerDetails     // Catch:{ Exception -> 0x00c4 }
            r13 = r6
            r14 = r0
            r15 = r4
            r13.<init>(r14, r15, r17)     // Catch:{ Exception -> 0x00c4 }
            com.adjust.sdk.InstallReferrerReadListener r0 = r1.referrerCallback     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r4 = "huawei_app_gallery"
            r0.onInstallReferrerRead(r6, r4)     // Catch:{ Exception -> 0x00c4 }
            goto L_0x00bf
        L_0x00a8:
            com.adjust.sdk.ILogger r5 = r1.logger     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r6 = "InstallReferrerHuawei fail to read referrer for package [%s] and content uri [%s]"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x00c4 }
            android.content.Context r7 = r1.context     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ Exception -> 0x00c4 }
            r4[r2] = r7     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00c4 }
            r4[r10] = r0     // Catch:{ Exception -> 0x00c4 }
            r5.debug(r6, r4)     // Catch:{ Exception -> 0x00c4 }
        L_0x00bf:
            if (r3 == 0) goto L_0x00d9
            goto L_0x00d6
        L_0x00c2:
            r0 = move-exception
            goto L_0x00df
        L_0x00c4:
            r0 = move-exception
            com.adjust.sdk.ILogger r4 = r1.logger     // Catch:{ all -> 0x00c2 }
            java.lang.String r5 = "InstallReferrerHuawei error [%s]"
            java.lang.Object[] r6 = new java.lang.Object[r10]     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00c2 }
            r6[r2] = r0     // Catch:{ all -> 0x00c2 }
            r4.debug(r5, r6)     // Catch:{ all -> 0x00c2 }
            if (r3 == 0) goto L_0x00d9
        L_0x00d6:
            r3.close()
        L_0x00d9:
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.shouldTryToRead
            r0.set(r2)
            return
        L_0x00df:
            if (r3 == 0) goto L_0x00e4
            r3.close()
        L_0x00e4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.InstallReferrerHuawei.readReferrer():void");
    }

    private boolean isValidReferrerHuaweiAds(String str) {
        return str != null && !str.isEmpty();
    }

    private boolean isValidReferrerHuaweiAppGallery(String str) {
        return str != null && !str.isEmpty();
    }
}
