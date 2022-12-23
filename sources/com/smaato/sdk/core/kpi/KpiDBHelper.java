package com.smaato.sdk.core.kpi;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.preference.PreferenceManager;
import com.smaato.sdk.core.gdpr.IabCmpV2DataStorage;
import com.smaato.sdk.core.gdpr.SubjectToGdpr;
import java.util.HashMap;

public class KpiDBHelper extends SQLiteOpenHelper {
    static final String DATABASE_NAME = "KPI_DATABASE.db";
    private final IabCmpV2DataStorage iabCmpV2DataStorage;
    private final boolean sessionTrackingDisabled;
    HashMap<String, Integer> session_depth_map = new HashMap<>();

    public KpiDBHelper(Context context, boolean z) {
        super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 1);
        this.sessionTrackingDisabled = z;
        this.iabCmpV2DataStorage = new IabCmpV2DataStorage(PreferenceManager.getDefaultSharedPreferences(context));
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE Kpidata(adspaceid TEXT PRIMARY KEY NOT NULL,total INTEGER,fillrate INTEGER,fills TEXT)");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS Kpidata");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void incrementAdRequestCount(java.lang.String r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r0 = r9.sessionTrackingDisabled     // Catch:{ all -> 0x0070 }
            if (r0 != 0) goto L_0x006e
            if (r10 != 0) goto L_0x0008
            goto L_0x006e
        L_0x0008:
            android.database.sqlite.SQLiteDatabase r0 = r9.getWritableDatabase()     // Catch:{ all -> 0x0070 }
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ all -> 0x0070 }
            r1.<init>()     // Catch:{ all -> 0x0070 }
            com.smaato.sdk.core.kpi.KpiDBHelper$KpiDataModel r2 = r9.fetchAdSpaceDetail(r10)     // Catch:{ all -> 0x0070 }
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0035
            long r5 = r2.getTotalRequests()     // Catch:{ all -> 0x0070 }
            r7 = 1
            long r5 = r5 + r7
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0070 }
            java.lang.String r5 = "total"
            r1.put(r5, r2)     // Catch:{ all -> 0x0070 }
            java.lang.String[] r2 = new java.lang.String[r4]     // Catch:{ all -> 0x0070 }
            r2[r3] = r10     // Catch:{ all -> 0x0070 }
            java.lang.String r3 = "Kpidata"
            java.lang.String r5 = "adspaceid=?"
            r0.update(r3, r1, r5, r2)     // Catch:{ all -> 0x0070 }
            goto L_0x0052
        L_0x0035:
            java.lang.String r2 = "adspaceid"
            r1.put(r2, r10)     // Catch:{ all -> 0x0070 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0070 }
            java.lang.String r5 = "total"
            r1.put(r5, r2)     // Catch:{ all -> 0x0070 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0070 }
            java.lang.String r3 = "fillrate"
            r1.put(r3, r2)     // Catch:{ all -> 0x0070 }
            java.lang.String r2 = "Kpidata"
            r3 = 0
            r0.insert(r2, r3, r1)     // Catch:{ all -> 0x0070 }
        L_0x0052:
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r9.session_depth_map     // Catch:{ all -> 0x0070 }
            java.lang.Object r0 = r0.get(r10)     // Catch:{ all -> 0x0070 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0070 }
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r9.session_depth_map     // Catch:{ all -> 0x0070 }
            if (r0 != 0) goto L_0x0060
            r0 = 2
            goto L_0x0065
        L_0x0060:
            int r0 = r0.intValue()     // Catch:{ all -> 0x0070 }
            int r0 = r0 + r4
        L_0x0065:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0070 }
            r1.put(r10, r0)     // Catch:{ all -> 0x0070 }
            monitor-exit(r9)
            return
        L_0x006e:
            monitor-exit(r9)
            return
        L_0x0070:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.kpi.KpiDBHelper.incrementAdRequestCount(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void updateFillAndFillRate(java.lang.String r4, boolean r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.sessionTrackingDisabled     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x0040
            if (r4 != 0) goto L_0x0008
            goto L_0x0040
        L_0x0008:
            android.database.sqlite.SQLiteDatabase r0 = r3.getWritableDatabase()     // Catch:{ all -> 0x0042 }
            com.smaato.sdk.core.kpi.KpiDBHelper$KpiDataModel r1 = r3.fetchAdSpaceDetail(r4)     // Catch:{ all -> 0x0042 }
            if (r1 == 0) goto L_0x003e
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x0042 }
            r2.<init>()     // Catch:{ all -> 0x0042 }
            java.lang.String r1 = r1.getFills()     // Catch:{ all -> 0x0042 }
            java.lang.String r5 = r3.getFills(r1, r5)     // Catch:{ all -> 0x0042 }
            java.lang.String r1 = "fills"
            r2.put(r1, r5)     // Catch:{ all -> 0x0042 }
            int r5 = r3.getFillRate(r5)     // Catch:{ all -> 0x0042 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0042 }
            java.lang.String r1 = "fillrate"
            r2.put(r1, r5)     // Catch:{ all -> 0x0042 }
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ all -> 0x0042 }
            r1 = 0
            r5[r1] = r4     // Catch:{ all -> 0x0042 }
            java.lang.String r4 = "Kpidata"
            java.lang.String r1 = "adspaceid=?"
            r0.update(r4, r2, r1, r5)     // Catch:{ all -> 0x0042 }
        L_0x003e:
            monitor-exit(r3)
            return
        L_0x0040:
            monitor-exit(r3)
            return
        L_0x0042:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.kpi.KpiDBHelper.updateFillAndFillRate(java.lang.String, boolean):void");
    }

    public synchronized KpiData getKpiValuesForAdSpace(String str) {
        if (!this.sessionTrackingDisabled && str != null) {
            if (isConsentGiven()) {
                KpiDataModel fetchAdSpaceDetail = fetchAdSpaceDetail(str);
                return KpiData.builder().setRollingFillRatePerAdSpace(fetchAdSpaceDetail != null ? String.valueOf(fetchAdSpaceDetail.getFillRate()) : "0").setSessionDepthPerAdSpace(String.valueOf(getSessionDepth(str))).setTotalAdRequests(fetchAdSpaceDetail != null ? String.valueOf(fetchAdSpaceDetail.getTotalRequests()) : "0").setTotalFillRate(String.valueOf(getTotalFillRate())).build();
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public KpiDataModel fetchAdSpaceDetail(String str) {
        KpiDataModel kpiDataModel = null;
        if (str == null) {
            return null;
        }
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM Kpidata WHERE adspaceid=?", new String[]{str});
        try {
            int columnIndex = rawQuery.getColumnIndex("total");
            int columnIndex2 = rawQuery.getColumnIndex("fillrate");
            int columnIndex3 = rawQuery.getColumnIndex("fills");
            if (rawQuery.getCount() == 1) {
                rawQuery.moveToFirst();
                kpiDataModel = new KpiDataModel();
                kpiDataModel.setAdSpace(str);
                kpiDataModel.setFills(rawQuery.getString(columnIndex3));
                kpiDataModel.setTotalRequests((long) rawQuery.getInt(columnIndex));
                kpiDataModel.setFillRate(rawQuery.getInt(columnIndex2));
            }
            return kpiDataModel;
        } finally {
            rawQuery.close();
        }
    }

    /* access modifiers changed from: package-private */
    public String getFills(String str, boolean z) {
        String str2 = z ? "1" : "0";
        if (str == null || str.isEmpty()) {
            return str2;
        }
        if (str.length() < 50) {
            return str + str2;
        }
        return str.substring(1, 50) + str2;
    }

    /* access modifiers changed from: package-private */
    public int getFillRate(String str) {
        return (int) ((((double) str.replaceAll("0", "").length()) * 1000.0d) / ((double) str.length()));
    }

    /* access modifiers changed from: package-private */
    public int getTotalFillRate() {
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM Kpidata", (String[]) null);
        try {
            int columnIndex = rawQuery.getColumnIndex("fills");
            int i = 0;
            if (rawQuery.getCount() > 0) {
                StringBuilder sb = new StringBuilder();
                rawQuery.moveToFirst();
                do {
                    sb.append(rawQuery.getString(columnIndex));
                } while (rawQuery.moveToNext());
                i = getFillRate(sb.toString());
            }
            return i;
        } finally {
            rawQuery.close();
        }
    }

    /* access modifiers changed from: package-private */
    public int getSessionDepth(String str) {
        Integer num = this.session_depth_map.get(str);
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    private boolean isConsentGiven() {
        if (!isConsentRequired()) {
            return true;
        }
        return this.iabCmpV2DataStorage.isPurposeConsentGivenForPurposeId(7);
    }

    private boolean isConsentRequired() {
        return this.iabCmpV2DataStorage.getSubjectToGdpr() == SubjectToGdpr.CMP_GDPR_ENABLED;
    }

    static class KpiDataModel {
        private String adSpace;
        private int fillRate;
        private String fills;
        private long totalRequests;

        KpiDataModel() {
        }

        public String getAdSpace() {
            return this.adSpace;
        }

        public void setAdSpace(String str) {
            this.adSpace = str;
        }

        public String getFills() {
            return this.fills;
        }

        public void setFills(String str) {
            this.fills = str;
        }

        public int getFillRate() {
            return this.fillRate;
        }

        public void setFillRate(int i) {
            this.fillRate = i;
        }

        public long getTotalRequests() {
            return this.totalRequests;
        }

        public void setTotalRequests(long j) {
            this.totalRequests = j;
        }
    }
}
