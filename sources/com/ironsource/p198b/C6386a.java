package com.ironsource.p198b;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.ironsource.b.a */
public final class C6386a extends SQLiteOpenHelper {

    /* renamed from: a */
    private static C6386a f16228a;

    /* renamed from: b */
    private final int f16229b = 4;

    /* renamed from: c */
    private final int f16230c = 400;

    /* renamed from: d */
    private final String f16231d = "DROP TABLE IF EXISTS events";

    /* renamed from: e */
    private final String f16232e = "CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )";

    private C6386a(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
    }

    /* renamed from: a */
    private synchronized SQLiteDatabase m19168a(boolean z) {
        int i = 0;
        while (true) {
            if (z) {
                try {
                    return getWritableDatabase();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                return getReadableDatabase();
            }
        }
    }

    /* renamed from: a */
    public static synchronized C6386a m19169a(Context context, String str, int i) {
        C6386a aVar;
        synchronized (C6386a.class) {
            if (f16228a == null) {
                f16228a = new C6386a(context, str, 5);
            }
            aVar = f16228a;
        }
        return aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0071, code lost:
        if (r11.isOpen() != false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0073, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0093, code lost:
        if (r13 != false) goto L_0x0073;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0084 A[SYNTHETIC, Splitter:B:31:0x0084] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008f A[Catch:{ all -> 0x0098 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.ArrayList<com.ironsource.mediationsdk.p207a.C6552c> mo35867a(java.lang.String r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x00b0 }
            r0.<init>()     // Catch:{ all -> 0x00b0 }
            r1 = 0
            r2 = 0
            android.database.sqlite.SQLiteDatabase r11 = r12.m19168a((boolean) r1)     // Catch:{ all -> 0x0079 }
            java.lang.String r6 = "type = ?"
            r3 = 1
            java.lang.String[] r7 = new java.lang.String[r3]     // Catch:{ all -> 0x0077 }
            r7[r1] = r13     // Catch:{ all -> 0x0077 }
            java.lang.String r10 = "timestamp ASC"
            java.lang.String r4 = "events"
            r5 = 0
            r8 = 0
            r9 = 0
            r3 = r11
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0077 }
            int r13 = r2.getCount()     // Catch:{ all -> 0x0077 }
            if (r13 <= 0) goto L_0x0060
            r2.moveToFirst()     // Catch:{ all -> 0x0077 }
        L_0x0028:
            boolean r13 = r2.isAfterLast()     // Catch:{ all -> 0x0077 }
            if (r13 != 0) goto L_0x005d
            java.lang.String r13 = "eventid"
            int r13 = r2.getColumnIndex(r13)     // Catch:{ all -> 0x0077 }
            int r13 = r2.getInt(r13)     // Catch:{ all -> 0x0077 }
            java.lang.String r1 = "timestamp"
            int r1 = r2.getColumnIndex(r1)     // Catch:{ all -> 0x0077 }
            long r3 = r2.getLong(r1)     // Catch:{ all -> 0x0077 }
            java.lang.String r1 = "data"
            int r1 = r2.getColumnIndex(r1)     // Catch:{ all -> 0x0077 }
            java.lang.String r1 = r2.getString(r1)     // Catch:{ all -> 0x0077 }
            com.ironsource.mediationsdk.a.c r5 = new com.ironsource.mediationsdk.a.c     // Catch:{ all -> 0x0077 }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ all -> 0x0077 }
            r6.<init>(r1)     // Catch:{ all -> 0x0077 }
            r5.<init>(r13, r3, r6)     // Catch:{ all -> 0x0077 }
            r0.add(r5)     // Catch:{ all -> 0x0077 }
            r2.moveToNext()     // Catch:{ all -> 0x0077 }
            goto L_0x0028
        L_0x005d:
            r2.close()     // Catch:{ all -> 0x0077 }
        L_0x0060:
            if (r2 == 0) goto L_0x006b
            boolean r13 = r2.isClosed()     // Catch:{ all -> 0x00b0 }
            if (r13 != 0) goto L_0x006b
            r2.close()     // Catch:{ all -> 0x00b0 }
        L_0x006b:
            if (r11 == 0) goto L_0x0096
            boolean r13 = r11.isOpen()     // Catch:{ all -> 0x00b0 }
            if (r13 == 0) goto L_0x0096
        L_0x0073:
            r11.close()     // Catch:{ all -> 0x00b0 }
            goto L_0x0096
        L_0x0077:
            r13 = move-exception
            goto L_0x007b
        L_0x0079:
            r13 = move-exception
            r11 = r2
        L_0x007b:
            java.lang.String r1 = "IronSource"
            java.lang.String r3 = "Exception while loading events: "
            android.util.Log.e(r1, r3, r13)     // Catch:{ all -> 0x0098 }
            if (r2 == 0) goto L_0x008d
            boolean r13 = r2.isClosed()     // Catch:{ all -> 0x00b0 }
            if (r13 != 0) goto L_0x008d
            r2.close()     // Catch:{ all -> 0x00b0 }
        L_0x008d:
            if (r11 == 0) goto L_0x0096
            boolean r13 = r11.isOpen()     // Catch:{ all -> 0x00b0 }
            if (r13 == 0) goto L_0x0096
            goto L_0x0073
        L_0x0096:
            monitor-exit(r12)
            return r0
        L_0x0098:
            r13 = move-exception
            if (r2 == 0) goto L_0x00a4
            boolean r0 = r2.isClosed()     // Catch:{ all -> 0x00b0 }
            if (r0 != 0) goto L_0x00a4
            r2.close()     // Catch:{ all -> 0x00b0 }
        L_0x00a4:
            if (r11 == 0) goto L_0x00af
            boolean r0 = r11.isOpen()     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x00af
            r11.close()     // Catch:{ all -> 0x00b0 }
        L_0x00af:
            throw r13     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.p198b.C6386a.mo35867a(java.lang.String):java.util.ArrayList");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0095, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0077 A[SYNTHETIC, Splitter:B:33:0x0077] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo35868a(java.util.List<com.ironsource.mediationsdk.p207a.C6552c> r8, java.lang.String r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            if (r8 == 0) goto L_0x0094
            boolean r0 = r8.isEmpty()     // Catch:{ all -> 0x0091 }
            if (r0 == 0) goto L_0x000b
            goto L_0x0094
        L_0x000b:
            r0 = 1
            r1 = 0
            android.database.sqlite.SQLiteDatabase r0 = r7.m19168a((boolean) r0)     // Catch:{ all -> 0x006d }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x006a }
        L_0x0015:
            boolean r2 = r8.hasNext()     // Catch:{ all -> 0x006a }
            if (r2 == 0) goto L_0x005d
            java.lang.Object r2 = r8.next()     // Catch:{ all -> 0x006a }
            com.ironsource.mediationsdk.a.c r2 = (com.ironsource.mediationsdk.p207a.C6552c) r2     // Catch:{ all -> 0x006a }
            if (r2 == 0) goto L_0x0052
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x006a }
            r4 = 4
            r3.<init>(r4)     // Catch:{ all -> 0x006a }
            java.lang.String r4 = "eventid"
            int r5 = r2.mo36390a()     // Catch:{ all -> 0x006a }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x006a }
            r3.put(r4, r5)     // Catch:{ all -> 0x006a }
            java.lang.String r4 = "timestamp"
            long r5 = r2.mo36393b()     // Catch:{ all -> 0x006a }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x006a }
            r3.put(r4, r5)     // Catch:{ all -> 0x006a }
            java.lang.String r4 = "type"
            r3.put(r4, r9)     // Catch:{ all -> 0x006a }
            java.lang.String r4 = "data"
            java.lang.String r2 = r2.mo36394c()     // Catch:{ all -> 0x006a }
            r3.put(r4, r2)     // Catch:{ all -> 0x006a }
            goto L_0x0053
        L_0x0052:
            r3 = r1
        L_0x0053:
            if (r0 == 0) goto L_0x0015
            if (r3 == 0) goto L_0x0015
            java.lang.String r2 = "events"
            r0.insert(r2, r1, r3)     // Catch:{ all -> 0x006a }
            goto L_0x0015
        L_0x005d:
            if (r0 == 0) goto L_0x0082
            boolean r8 = r0.isOpen()     // Catch:{ all -> 0x0091 }
            if (r8 == 0) goto L_0x0082
            r0.close()     // Catch:{ all -> 0x0091 }
            monitor-exit(r7)
            return
        L_0x006a:
            r8 = move-exception
            r1 = r0
            goto L_0x006e
        L_0x006d:
            r8 = move-exception
        L_0x006e:
            java.lang.String r9 = "IronSource"
            java.lang.String r0 = "Exception while saving events: "
            android.util.Log.e(r9, r0, r8)     // Catch:{ all -> 0x0084 }
            if (r1 == 0) goto L_0x0082
            boolean r8 = r1.isOpen()     // Catch:{ all -> 0x0091 }
            if (r8 == 0) goto L_0x0082
            r1.close()     // Catch:{ all -> 0x0091 }
            monitor-exit(r7)
            return
        L_0x0082:
            monitor-exit(r7)
            return
        L_0x0084:
            r8 = move-exception
            if (r1 == 0) goto L_0x0090
            boolean r9 = r1.isOpen()     // Catch:{ all -> 0x0091 }
            if (r9 == 0) goto L_0x0090
            r1.close()     // Catch:{ all -> 0x0091 }
        L_0x0090:
            throw r8     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        L_0x0094:
            monitor-exit(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.p198b.C6386a.mo35868a(java.util.List, java.lang.String):void");
    }

    /* renamed from: b */
    public final synchronized void mo35869b(String str) {
        SQLiteDatabase sQLiteDatabase = null;
        String[] strArr = {str};
        try {
            sQLiteDatabase = m19168a(true);
            sQLiteDatabase.delete("events", "type = ?", strArr);
            if (sQLiteDatabase != null) {
                if (sQLiteDatabase.isOpen()) {
                    sQLiteDatabase.close();
                }
            }
        } catch (Throwable th) {
            if (sQLiteDatabase != null) {
                if (sQLiteDatabase.isOpen()) {
                    sQLiteDatabase.close();
                }
            }
            throw th;
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
        onCreate(sQLiteDatabase);
    }
}
