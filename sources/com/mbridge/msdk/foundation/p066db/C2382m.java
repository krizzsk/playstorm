package com.mbridge.msdk.foundation.p066db;

/* renamed from: com.mbridge.msdk.foundation.db.m */
/* compiled from: ReportErrorDao */
public class C2382m extends C2365a {

    /* renamed from: a */
    private static C2382m f5001a;

    private C2382m(C2374f fVar) {
        super(fVar);
    }

    /* renamed from: a */
    public static C2382m m5755a(C2374f fVar) {
        if (f5001a == null) {
            synchronized (C2382m.class) {
                if (f5001a == null) {
                    f5001a = new C2382m(fVar);
                }
            }
        }
        return f5001a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r0 != null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        if (r0 == null) goto L_0x0034;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo15917a() {
        /*
            r10 = this;
            monitor-enter(r10)
            java.lang.String r0 = " count(*) "
            java.lang.String[] r3 = new java.lang.String[]{r0}     // Catch:{ all -> 0x003c }
            r0 = 0
            r9 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.getReadableDatabase()     // Catch:{ Exception -> 0x002d }
            java.lang.String r2 = "reporterror"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r0 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x002d }
            if (r0 == 0) goto L_0x0025
            boolean r1 = r0.moveToFirst()     // Catch:{ Exception -> 0x002d }
            if (r1 == 0) goto L_0x0025
            int r1 = r0.getInt(r9)     // Catch:{ Exception -> 0x002d }
            r9 = r1
        L_0x0025:
            if (r0 == 0) goto L_0x0034
        L_0x0027:
            r0.close()     // Catch:{ all -> 0x003c }
            goto L_0x0034
        L_0x002b:
            r1 = move-exception
            goto L_0x0036
        L_0x002d:
            r1 = move-exception
            r1.printStackTrace()     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0034
            goto L_0x0027
        L_0x0034:
            monitor-exit(r10)
            return r9
        L_0x0036:
            if (r0 == 0) goto L_0x003b
            r0.close()     // Catch:{ all -> 0x003c }
        L_0x003b:
            throw r1     // Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p066db.C2382m.mo15917a():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0022, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo15918a(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = -1
            java.lang.String r1 = "url=?"
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ Exception -> 0x0021, all -> 0x001e }
            r3 = 0
            r2[r3] = r5     // Catch:{ Exception -> 0x0021, all -> 0x001e }
            android.database.sqlite.SQLiteDatabase r5 = r4.getWritableDatabase()     // Catch:{ Exception -> 0x0021, all -> 0x001e }
            if (r5 != 0) goto L_0x0012
            monitor-exit(r4)
            return r0
        L_0x0012:
            android.database.sqlite.SQLiteDatabase r5 = r4.getWritableDatabase()     // Catch:{ Exception -> 0x0021, all -> 0x001e }
            java.lang.String r3 = "reporterror"
            int r5 = r5.delete(r3, r1, r2)     // Catch:{ Exception -> 0x0021, all -> 0x001e }
            monitor-exit(r4)
            return r5
        L_0x001e:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x0021:
            monitor-exit(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p066db.C2382m.mo15918a(java.lang.String):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0065, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo15919a(java.lang.String r4, java.lang.String r5, long r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = -1
            if (r4 != 0) goto L_0x0006
            java.lang.String r4 = ""
        L_0x0006:
            android.database.sqlite.SQLiteDatabase r1 = r3.getWritableDatabase()     // Catch:{ Exception -> 0x0064, all -> 0x0061 }
            if (r1 != 0) goto L_0x000e
            monitor-exit(r3)
            return r0
        L_0x000e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0064, all -> 0x0061 }
            r1.<init>()     // Catch:{ Exception -> 0x0064, all -> 0x0061 }
            java.lang.String r2 = "DELETE from reporterror where url='"
            r1.append(r2)     // Catch:{ Exception -> 0x0064, all -> 0x0061 }
            r1.append(r5)     // Catch:{ Exception -> 0x0064, all -> 0x0061 }
            java.lang.String r5 = "' and "
            r1.append(r5)     // Catch:{ Exception -> 0x0064, all -> 0x0061 }
            java.lang.String r5 = "data"
            r1.append(r5)     // Catch:{ Exception -> 0x0064, all -> 0x0061 }
            java.lang.String r5 = "='"
            r1.append(r5)     // Catch:{ Exception -> 0x0064, all -> 0x0061 }
            r1.append(r4)     // Catch:{ Exception -> 0x0064, all -> 0x0061 }
            java.lang.String r4 = "' and "
            r1.append(r4)     // Catch:{ Exception -> 0x0064, all -> 0x0061 }
            java.lang.String r4 = "time_stamp"
            r1.append(r4)     // Catch:{ Exception -> 0x0064, all -> 0x0061 }
            java.lang.String r4 = "="
            r1.append(r4)     // Catch:{ Exception -> 0x0064, all -> 0x0061 }
            r1.append(r6)     // Catch:{ Exception -> 0x0064, all -> 0x0061 }
            java.lang.String r4 = " or "
            r1.append(r4)     // Catch:{ Exception -> 0x0064, all -> 0x0061 }
            java.lang.String r4 = "count"
            r1.append(r4)     // Catch:{ Exception -> 0x0064, all -> 0x0061 }
            java.lang.String r4 = " > 5 "
            r1.append(r4)     // Catch:{ Exception -> 0x0064, all -> 0x0061 }
            java.lang.String r4 = r1.toString()     // Catch:{ Exception -> 0x0064, all -> 0x0061 }
            android.database.sqlite.SQLiteDatabase r5 = r3.getWritableDatabase()     // Catch:{ Exception -> 0x0064, all -> 0x0061 }
            r6 = 0
            android.database.Cursor r4 = r5.rawQuery(r4, r6)     // Catch:{ Exception -> 0x0064, all -> 0x0061 }
            int r4 = r4.getCount()     // Catch:{ Exception -> 0x0064, all -> 0x0061 }
            monitor-exit(r3)
            return r4
        L_0x0061:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x0064:
            monitor-exit(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p066db.C2382m.mo15919a(java.lang.String, java.lang.String, long):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized int m5756b(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r0.<init>()     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            java.lang.String r1 = "DELETE from reporterror where count >= "
            r0.append(r1)     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r0.append(r3)     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            java.lang.String r3 = r0.toString()     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            android.database.sqlite.SQLiteDatabase r0 = r2.getWritableDatabase()     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r1 = 0
            android.database.Cursor r3 = r0.rawQuery(r3, r1)     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            int r3 = r3.getCount()     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            monitor-exit(r2)
            return r3
        L_0x0021:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x0024:
            r3 = -1
            monitor-exit(r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p066db.C2382m.m5756b(int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r0 == null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        if (r0 != null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r0.close();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo15922b() {
        /*
            r12 = this;
            monitor-enter(r12)
            r0 = 0
            r1 = 0
            java.lang.String r2 = " count(*) "
            java.lang.String[] r5 = new java.lang.String[]{r2}     // Catch:{ all -> 0x0034 }
            android.database.sqlite.SQLiteDatabase r3 = r12.getReadableDatabase()     // Catch:{ Exception -> 0x0025 }
            java.lang.String r4 = "reporterror"
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r0 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0025 }
            int r1 = r0.getCount()     // Catch:{ Exception -> 0x0025 }
            if (r0 == 0) goto L_0x002c
        L_0x001f:
            r0.close()     // Catch:{ all -> 0x0034 }
            goto L_0x002c
        L_0x0023:
            r1 = move-exception
            goto L_0x002e
        L_0x0025:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x002c
            goto L_0x001f
        L_0x002c:
            monitor-exit(r12)
            return r1
        L_0x002e:
            if (r0 == 0) goto L_0x0033
            r0.close()     // Catch:{ all -> 0x0034 }
        L_0x0033:
            throw r1     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p066db.C2382m.mo15922b():int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.List<com.mbridge.msdk.foundation.entity.k>] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a1 A[SYNTHETIC, Splitter:B:26:0x00a1] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ab A[SYNTHETIC, Splitter:B:34:0x00ab] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<com.mbridge.msdk.foundation.entity.C8410k> mo15921a(int r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            r0 = 5
            r1 = 0
            r12.m5756b(r0)     // Catch:{ Exception -> 0x0098, all -> 0x0096 }
            android.database.sqlite.SQLiteDatabase r2 = r12.getReadableDatabase()     // Catch:{ Exception -> 0x0098, all -> 0x0096 }
            java.lang.String r3 = "reporterror"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0098, all -> 0x0096 }
            r0.<init>()     // Catch:{ Exception -> 0x0098, all -> 0x0096 }
            r0.append(r13)     // Catch:{ Exception -> 0x0098, all -> 0x0096 }
            java.lang.String r13 = ""
            r0.append(r13)     // Catch:{ Exception -> 0x0098, all -> 0x0096 }
            java.lang.String r10 = r0.toString()     // Catch:{ Exception -> 0x0098, all -> 0x0096 }
            android.database.Cursor r13 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0098, all -> 0x0096 }
            if (r13 == 0) goto L_0x0090
            int r0 = r13.getCount()     // Catch:{ Exception -> 0x008b }
            if (r0 <= 0) goto L_0x0090
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x008b }
            r0.<init>()     // Catch:{ Exception -> 0x008b }
        L_0x0034:
            boolean r1 = r13.moveToNext()     // Catch:{ Exception -> 0x0089 }
            if (r1 == 0) goto L_0x0087
            java.lang.String r1 = "url"
            int r1 = r13.getColumnIndex(r1)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r1 = r13.getString(r1)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r2 = "data"
            int r2 = r13.getColumnIndex(r2)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r2 = r13.getString(r2)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r3 = "method"
            int r3 = r13.getColumnIndex(r3)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r3 = r13.getString(r3)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r4 = "unitId"
            int r4 = r13.getColumnIndex(r4)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r4 = r13.getString(r4)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r5 = "count"
            int r5 = r13.getColumnIndex(r5)     // Catch:{ Exception -> 0x0089 }
            int r5 = r13.getInt(r5)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r6 = "time_stamp"
            int r6 = r13.getColumnIndex(r6)     // Catch:{ Exception -> 0x0089 }
            long r6 = r13.getLong(r6)     // Catch:{ Exception -> 0x0089 }
            com.mbridge.msdk.foundation.entity.k r8 = new com.mbridge.msdk.foundation.entity.k     // Catch:{ Exception -> 0x0089 }
            r8.<init>(r1, r3, r2, r4)     // Catch:{ Exception -> 0x0089 }
            int r5 = r5 + 1
            r8.mo57417a((int) r5)     // Catch:{ Exception -> 0x0089 }
            r8.mo57418a((long) r6)     // Catch:{ Exception -> 0x0089 }
            r0.add(r8)     // Catch:{ Exception -> 0x0089 }
            goto L_0x0034
        L_0x0087:
            r1 = r0
            goto L_0x0090
        L_0x0089:
            r1 = move-exception
            goto L_0x009c
        L_0x008b:
            r0 = move-exception
            r11 = r1
            r1 = r0
            r0 = r11
            goto L_0x009c
        L_0x0090:
            if (r13 == 0) goto L_0x00a5
            r13.close()     // Catch:{ all -> 0x00af }
            goto L_0x00a5
        L_0x0096:
            r0 = move-exception
            goto L_0x00a9
        L_0x0098:
            r13 = move-exception
            r0 = r1
            r1 = r13
            r13 = r0
        L_0x009c:
            r1.printStackTrace()     // Catch:{ all -> 0x00a7 }
            if (r13 == 0) goto L_0x00a4
            r13.close()     // Catch:{ all -> 0x00af }
        L_0x00a4:
            r1 = r0
        L_0x00a5:
            monitor-exit(r12)
            return r1
        L_0x00a7:
            r0 = move-exception
            r1 = r13
        L_0x00a9:
            if (r1 == 0) goto L_0x00ae
            r1.close()     // Catch:{ all -> 0x00af }
        L_0x00ae:
            throw r0     // Catch:{ all -> 0x00af }
        L_0x00af:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p066db.C2382m.mo15921a(int):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        return r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean m5757b(java.lang.String r4, java.lang.String r5, long r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            if (r4 != 0) goto L_0x0006
            java.lang.String r4 = ""
        L_0x0006:
            android.database.sqlite.SQLiteDatabase r1 = r3.getWritableDatabase()     // Catch:{ Exception -> 0x0057 }
            if (r1 != 0) goto L_0x000e
            monitor-exit(r3)
            return r0
        L_0x000e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0057 }
            r1.<init>()     // Catch:{ Exception -> 0x0057 }
            java.lang.String r2 = "select * from reporterror where url='"
            r1.append(r2)     // Catch:{ Exception -> 0x0057 }
            r1.append(r5)     // Catch:{ Exception -> 0x0057 }
            java.lang.String r5 = "' and "
            r1.append(r5)     // Catch:{ Exception -> 0x0057 }
            java.lang.String r5 = "data"
            r1.append(r5)     // Catch:{ Exception -> 0x0057 }
            java.lang.String r5 = "='"
            r1.append(r5)     // Catch:{ Exception -> 0x0057 }
            r1.append(r4)     // Catch:{ Exception -> 0x0057 }
            java.lang.String r4 = "' and "
            r1.append(r4)     // Catch:{ Exception -> 0x0057 }
            java.lang.String r4 = "time_stamp"
            r1.append(r4)     // Catch:{ Exception -> 0x0057 }
            java.lang.String r4 = "="
            r1.append(r4)     // Catch:{ Exception -> 0x0057 }
            r1.append(r6)     // Catch:{ Exception -> 0x0057 }
            java.lang.String r4 = r1.toString()     // Catch:{ Exception -> 0x0057 }
            android.database.sqlite.SQLiteDatabase r5 = r3.getReadableDatabase()     // Catch:{ Exception -> 0x0057 }
            r6 = 0
            android.database.Cursor r4 = r5.rawQuery(r4, r6)     // Catch:{ Exception -> 0x0057 }
            int r4 = r4.getCount()     // Catch:{ Exception -> 0x0057 }
            if (r4 <= 0) goto L_0x0053
            r0 = 1
        L_0x0053:
            monitor-exit(r3)
            return r0
        L_0x0055:
            r4 = move-exception
            goto L_0x005d
        L_0x0057:
            r4 = move-exception
            r4.printStackTrace()     // Catch:{ all -> 0x0055 }
            monitor-exit(r3)
            return r0
        L_0x005d:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p066db.C2382m.m5757b(java.lang.String, java.lang.String, long):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00d7, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long mo15920a(com.mbridge.msdk.foundation.entity.C8410k r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r0 = -1
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            r2.<init>()     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            java.lang.String r3 = "url"
            java.lang.String r4 = r8.mo57420b()     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            r2.put(r3, r4)     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            java.lang.String r3 = "method"
            java.lang.String r4 = r8.mo57422c()     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            r2.put(r3, r4)     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            java.lang.String r3 = "data"
            java.lang.String r4 = r8.mo57424d()     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            r2.put(r3, r4)     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            java.lang.String r3 = "unitId"
            java.lang.String r4 = r8.mo57416a()     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            r2.put(r3, r4)     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            java.lang.String r3 = "time_stamp"
            long r4 = r8.mo57426f()     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            r2.put(r3, r4)     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            android.database.sqlite.SQLiteDatabase r3 = r7.getWritableDatabase()     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            if (r3 != 0) goto L_0x0041
            monitor-exit(r7)
            return r0
        L_0x0041:
            java.lang.String r3 = r8.mo57424d()     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            java.lang.String r4 = r8.mo57420b()     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            long r5 = r8.mo57426f()     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            boolean r3 = r7.m5757b(r3, r4, r5)     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            r4 = 0
            if (r3 == 0) goto L_0x00ba
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            r2.<init>()     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            java.lang.String r3 = "UPDATE reporterror SET count = "
            r2.append(r3)     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            int r3 = r8.mo57425e()     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            r2.append(r3)     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            java.lang.String r3 = " where "
            r2.append(r3)     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            java.lang.String r3 = "url"
            r2.append(r3)     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            java.lang.String r3 = "='"
            r2.append(r3)     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            java.lang.String r3 = r8.mo57420b()     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            r2.append(r3)     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            java.lang.String r3 = "' and "
            r2.append(r3)     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            java.lang.String r3 = "data"
            r2.append(r3)     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            java.lang.String r3 = "='"
            r2.append(r3)     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            java.lang.String r3 = r8.mo57424d()     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            r2.append(r3)     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            java.lang.String r3 = "' and "
            r2.append(r3)     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            java.lang.String r3 = "time_stamp"
            r2.append(r3)     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            java.lang.String r3 = "="
            r2.append(r3)     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            long r5 = r8.mo57426f()     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            r2.append(r5)     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            java.lang.String r8 = r2.toString()     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            android.database.sqlite.SQLiteDatabase r2 = r7.getWritableDatabase()     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            android.database.Cursor r8 = r2.rawQuery(r8, r4)     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            int r8 = r8.getCount()     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            long r0 = (long) r8
            monitor-exit(r7)
            return r0
        L_0x00ba:
            java.lang.String r3 = "count"
            int r8 = r8.mo57425e()     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            r2.put(r3, r8)     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            android.database.sqlite.SQLiteDatabase r8 = r7.getWritableDatabase()     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            java.lang.String r3 = "reporterror"
            long r0 = r8.insert(r3, r4, r2)     // Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
            monitor-exit(r7)
            return r0
        L_0x00d3:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        L_0x00d6:
            monitor-exit(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p066db.C2382m.mo15920a(com.mbridge.msdk.foundation.entity.k):long");
    }
}
