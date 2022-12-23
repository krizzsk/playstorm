package com.inmobi.media;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.inmobi.media.he */
/* compiled from: DbStore */
public final class C6215he {

    /* renamed from: a */
    private static final String f15742a = C6215he.class.getSimpleName();

    /* renamed from: b */
    private static volatile C6215he f15743b;

    /* renamed from: c */
    private static final Object f15744c = new Object();

    /* renamed from: d */
    private static final Object f15745d = new Object();

    /* renamed from: e */
    private static int f15746e = 0;

    /* renamed from: f */
    private SQLiteDatabase f15747f;

    private C6215he() {
        try {
            this.f15747f = new C6214hd(C6227ho.m18551c()).getWritableDatabase();
            f15743b = this;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static C6215he m18482a() {
        synchronized (f15745d) {
            f15746e++;
        }
        C6215he heVar = f15743b;
        if (heVar == null) {
            synchronized (f15744c) {
                heVar = f15743b;
                if (heVar == null) {
                    heVar = new C6215he();
                    f15743b = heVar;
                }
            }
        }
        return heVar;
    }

    /* renamed from: a */
    public final void mo35408a(String str, ContentValues contentValues, String str2, String[] strArr) {
        try {
            synchronized (f15744c) {
                if (-1 == mo35406a(str, contentValues)) {
                    mo35410b(str, contentValues, str2, strArr);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final long mo35406a(String str, ContentValues contentValues) {
        long insertWithOnConflict;
        try {
            synchronized (f15744c) {
                insertWithOnConflict = this.f15747f.insertWithOnConflict(str, (String) null, contentValues, 4);
            }
            return insertWithOnConflict;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public final int mo35405a(String str, String str2, String[] strArr) {
        int delete;
        try {
            synchronized (f15744c) {
                delete = this.f15747f.delete(str, str2, strArr);
            }
            return delete;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public final int mo35410b(String str, ContentValues contentValues, String str2, String[] strArr) {
        int updateWithOnConflict;
        try {
            synchronized (f15744c) {
                updateWithOnConflict = this.f15747f.updateWithOnConflict(str, contentValues, str2, strArr, 4);
            }
            return updateWithOnConflict;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        if (r2 != null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004b, code lost:
        if (r2 == null) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004d, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0050, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0046  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<android.content.ContentValues> mo35407a(java.lang.String r15, java.lang.String[] r16, java.lang.String r17, java.lang.String[] r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22) {
        /*
            r14 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            java.lang.Object r3 = f15744c     // Catch:{ Exception -> 0x004a, all -> 0x0042 }
            monitor-enter(r3)     // Catch:{ Exception -> 0x004a, all -> 0x0042 }
            r4 = r14
            android.database.sqlite.SQLiteDatabase r5 = r4.f15747f     // Catch:{ all -> 0x003d }
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r20
            r12 = r21
            r13 = r22
            android.database.Cursor r2 = r5.query(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x003d }
            monitor-exit(r3)     // Catch:{ all -> 0x003d }
            boolean r0 = r2.moveToFirst()     // Catch:{ Exception -> 0x004b, all -> 0x0040 }
            if (r0 == 0) goto L_0x0037
        L_0x0026:
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch:{ Exception -> 0x004b, all -> 0x0040 }
            r0.<init>()     // Catch:{ Exception -> 0x004b, all -> 0x0040 }
            android.database.DatabaseUtils.cursorRowToContentValues(r2, r0)     // Catch:{ Exception -> 0x004b, all -> 0x0040 }
            r1.add(r0)     // Catch:{ Exception -> 0x004b, all -> 0x0040 }
            boolean r0 = r2.moveToNext()     // Catch:{ Exception -> 0x004b, all -> 0x0040 }
            if (r0 != 0) goto L_0x0026
        L_0x0037:
            r2.close()     // Catch:{ Exception -> 0x004b, all -> 0x0040 }
            if (r2 == 0) goto L_0x0050
            goto L_0x004d
        L_0x003d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003d }
            throw r0     // Catch:{ Exception -> 0x004b, all -> 0x0040 }
        L_0x0040:
            r0 = move-exception
            goto L_0x0044
        L_0x0042:
            r0 = move-exception
            r4 = r14
        L_0x0044:
            if (r2 == 0) goto L_0x0049
            r2.close()
        L_0x0049:
            throw r0
        L_0x004a:
            r4 = r14
        L_0x004b:
            if (r2 == 0) goto L_0x0050
        L_0x004d:
            r2.close()
        L_0x0050:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6215he.mo35407a(java.lang.String, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* renamed from: a */
    public final int mo35404a(String str) {
        Cursor cursor = null;
        try {
            String str2 = "SELECT COUNT(*) FROM " + str + " ; ";
            synchronized (f15744c) {
                cursor = this.f15747f.rawQuery(str2, (String[]) null);
            }
            cursor.moveToFirst();
            int i = cursor.getInt(0);
            cursor.close();
            if (cursor != null) {
                cursor.close();
            }
            return i;
        } catch (Exception unused) {
            if (cursor == null) {
                return -1;
            }
            cursor.close();
            return -1;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: b */
    public final int mo35411b(String str, String str2, String[] strArr) {
        Cursor cursor = null;
        try {
            String str3 = "SELECT COUNT(*) FROM " + str + " WHERE " + str2 + " ; ";
            synchronized (f15744c) {
                cursor = this.f15747f.rawQuery(str3, strArr);
            }
            cursor.moveToFirst();
            int i = cursor.getInt(0);
            cursor.close();
            if (cursor != null) {
                cursor.close();
            }
            return i;
        } catch (Exception unused) {
            if (cursor == null) {
                return -1;
            }
            cursor.close();
            return -1;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: b */
    public final void mo35413b(String str) {
        try {
            String str2 = "DROP TABLE IF EXISTS \"" + str + "\"";
            synchronized (f15744c) {
                this.f15747f.execSQL(str2);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo35409a(String str, String str2) {
        try {
            String str3 = "CREATE TABLE IF NOT EXISTS " + str + str2 + ";";
            synchronized (f15744c) {
                this.f15747f.execSQL(str3);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public final void mo35412b() {
        try {
            synchronized (f15745d) {
                int i = f15746e - 1;
                f15746e = i;
                if (i == 0) {
                    synchronized (f15744c) {
                        this.f15747f.close();
                    }
                    f15743b = null;
                }
            }
        } catch (Exception unused) {
        }
    }
}
