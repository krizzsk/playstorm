package com.bytedance.sdk.openadsdk.core;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.sdk.component.adexpress.p091a.p093b.C2603a;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.p130b.C3160g;
import com.bytedance.sdk.openadsdk.p130b.C3170m;
import com.bytedance.sdk.openadsdk.p130b.C3181q;
import com.bytedance.sdk.openadsdk.p130b.C3183s;
import com.bytedance.sdk.openadsdk.p179k.C3912h;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.bytedance.sdk.openadsdk.core.f */
/* compiled from: DBHelper */
class C3505f {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Object f8689c = new Object();

    /* renamed from: a */
    private C3509c f8690a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f8691b;

    C3505f(Context context) {
        Context context2;
        if (context == null) {
            try {
                context2 = C3578m.m11231a();
            } catch (Throwable unused) {
                return;
            }
        } else {
            context2 = context.getApplicationContext();
        }
        this.f8691b = context2;
        if (this.f8690a == null) {
            this.f8690a = new C3509c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public Context m10804c() {
        Context context = this.f8691b;
        return context == null ? C3578m.m11231a() : context;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.f$c */
    /* compiled from: DBHelper */
    public class C3509c {

        /* renamed from: b */
        private SQLiteDatabase f8696b = null;

        public C3509c() {
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
            	at java.base/java.util.Objects.checkIndex(Objects.java:372)
            	at java.base/java.util.ArrayList.get(ArrayList.java:458)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        /* renamed from: d */
        private synchronized void m10809d() {
            /*
                r4 = this;
                monitor-enter(r4)
                java.lang.Object r0 = com.bytedance.sdk.openadsdk.core.C3505f.f8689c     // Catch:{ all -> 0x002e }
                monitor-enter(r0)     // Catch:{ all -> 0x002e }
                android.database.sqlite.SQLiteDatabase r1 = r4.f8696b     // Catch:{ all -> 0x002b }
                if (r1 == 0) goto L_0x0012
                android.database.sqlite.SQLiteDatabase r1 = r4.f8696b     // Catch:{ all -> 0x002b }
                boolean r1 = r1.isOpen()     // Catch:{ all -> 0x002b }
                if (r1 != 0) goto L_0x0029
            L_0x0012:
                com.bytedance.sdk.openadsdk.core.f$a r1 = new com.bytedance.sdk.openadsdk.core.f$a     // Catch:{ all -> 0x002b }
                com.bytedance.sdk.openadsdk.core.f r2 = com.bytedance.sdk.openadsdk.core.C3505f.this     // Catch:{ all -> 0x002b }
                com.bytedance.sdk.openadsdk.core.f r3 = com.bytedance.sdk.openadsdk.core.C3505f.this     // Catch:{ all -> 0x002b }
                android.content.Context r3 = r3.m10804c()     // Catch:{ all -> 0x002b }
                r1.<init>(r3)     // Catch:{ all -> 0x002b }
                android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()     // Catch:{ all -> 0x002b }
                r4.f8696b = r1     // Catch:{ all -> 0x002b }
                r2 = 0
                r1.setLockingEnabled(r2)     // Catch:{ all -> 0x002b }
            L_0x0029:
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                goto L_0x0038
            L_0x002b:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                throw r1     // Catch:{ all -> 0x002e }
            L_0x002e:
                r0 = move-exception
                r0.printStackTrace()     // Catch:{ all -> 0x003b }
                boolean r1 = r4.m10810e()     // Catch:{ all -> 0x003b }
                if (r1 != 0) goto L_0x003a
            L_0x0038:
                monitor-exit(r4)
                return
            L_0x003a:
                throw r0     // Catch:{ all -> 0x003b }
            L_0x003b:
                r0 = move-exception
                monitor-exit(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3505f.C3509c.m10809d():void");
        }

        /* renamed from: a */
        public synchronized void mo19818a(String str) throws SQLException {
            try {
                m10809d();
                this.f8696b.execSQL(str);
            } catch (Throwable th) {
                if (m10810e()) {
                    throw th;
                }
            }
        }

        /* renamed from: a */
        public synchronized Cursor mo19816a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            Cursor cursor;
            try {
                m10809d();
                cursor = this.f8696b.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                th.printStackTrace();
                C3508b bVar = new C3508b();
                if (!m10810e()) {
                    cursor = bVar;
                } else {
                    throw th;
                }
            }
            return cursor;
        }

        /* renamed from: a */
        public synchronized int mo19813a(String str, ContentValues contentValues, String str2, String[] strArr) {
            int i;
            try {
                m10809d();
                i = this.f8696b.update(str, contentValues, str2, strArr);
            } catch (Exception e) {
                e.printStackTrace();
                if (!m10810e()) {
                    i = 0;
                } else {
                    throw e;
                }
            }
            return i;
        }

        /* renamed from: a */
        public synchronized long mo19815a(String str, String str2, ContentValues contentValues) {
            long j;
            try {
                m10809d();
                j = this.f8696b.replace(str, str2, contentValues);
            } catch (Exception e) {
                e.printStackTrace();
                if (!m10810e()) {
                    j = -1;
                } else {
                    throw e;
                }
            }
            return j;
        }

        /* renamed from: a */
        public synchronized int mo19814a(String str, String str2, String[] strArr) {
            int i;
            try {
                m10809d();
                i = this.f8696b.delete(str, str2, strArr);
            } catch (Exception e) {
                e.printStackTrace();
                if (!m10810e()) {
                    i = 0;
                } else {
                    throw e;
                }
            }
            return i;
        }

        /* renamed from: a */
        public synchronized void mo19817a() {
            m10809d();
            if (this.f8696b != null) {
                this.f8696b.beginTransaction();
            }
        }

        /* renamed from: b */
        public synchronized void mo19819b() {
            m10809d();
            if (this.f8696b != null) {
                this.f8696b.setTransactionSuccessful();
            }
        }

        /* renamed from: c */
        public synchronized void mo19820c() {
            m10809d();
            if (this.f8696b != null) {
                this.f8696b.endTransaction();
            }
        }

        /* renamed from: e */
        private synchronized boolean m10810e() {
            SQLiteDatabase sQLiteDatabase;
            sQLiteDatabase = this.f8696b;
            return sQLiteDatabase != null && sQLiteDatabase.inTransaction();
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.f$a */
    /* compiled from: DBHelper */
    private class C3507a extends SQLiteOpenHelper {

        /* renamed from: a */
        final Context f8692a;

        public C3507a(Context context) {
            super(context, "ttopensdk.db", (SQLiteDatabase.CursorFactory) null, 6);
            this.f8692a = context;
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                m10807a(sQLiteDatabase, this.f8692a);
            } catch (Throwable unused) {
            }
        }

        /* renamed from: a */
        private void m10807a(SQLiteDatabase sQLiteDatabase, Context context) {
            C2975l.m8384b("DBHelper", "initDB........");
            sQLiteDatabase.execSQL(C3160g.m9217e());
            sQLiteDatabase.execSQL(C3170m.m9273f());
            sQLiteDatabase.execSQL(C3183s.m9324f());
            sQLiteDatabase.execSQL(C3181q.m9312d());
            sQLiteDatabase.execSQL(C3912h.m12836b());
            sQLiteDatabase.execSQL(C2603a.m6645c());
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            try {
                C2975l.m8384b("DBHelper", "onUpgrade....Database version upgrade.....old:" + i + ",new:" + i2);
                if (i > i2) {
                    m10806a(sQLiteDatabase);
                    m10807a(sQLiteDatabase, C3505f.this.f8691b);
                    C2975l.m8384b("DBHelper", "onUpgrade...Reverse installation. Database reset and create table.....");
                } else {
                    m10807a(sQLiteDatabase, C3505f.this.f8691b);
                }
                if (i == 1) {
                    C2975l.m8384b("DBHelper", "onUpgrade.....perform table creation.....");
                } else if (i == 2) {
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'ad_video_info';");
                } else if (i == 3) {
                    sQLiteDatabase.execSQL(C3183s.m9324f());
                } else if (i == 4) {
                    sQLiteDatabase.execSQL(C2603a.m6645c());
                } else if (i == 5) {
                    sQLiteDatabase.execSQL(C3181q.m9312d());
                }
            } catch (Throwable unused) {
            }
        }

        /* renamed from: a */
        private void m10806a(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> b = m10808b(sQLiteDatabase);
            if (b != null && b.size() > 0) {
                Iterator<String> it = b.iterator();
                while (it.hasNext()) {
                    sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", new Object[]{it.next()}));
                }
            }
        }

        /* renamed from: b */
        private ArrayList<String> m10808b(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> arrayList = new ArrayList<>();
            try {
                Cursor rawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", (String[]) null);
                if (rawQuery != null) {
                    while (rawQuery.moveToNext()) {
                        String string = rawQuery.getString(0);
                        if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                            arrayList.add(string);
                        }
                    }
                    rawQuery.close();
                }
            } catch (Exception unused) {
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public C3509c mo19471a() {
        return this.f8690a;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.f$b */
    /* compiled from: DBHelper */
    private class C3508b extends AbstractCursor {
        public String[] getColumnNames() {
            return new String[0];
        }

        public int getCount() {
            return 0;
        }

        public double getDouble(int i) {
            return 0.0d;
        }

        public float getFloat(int i) {
            return 0.0f;
        }

        public int getInt(int i) {
            return 0;
        }

        public long getLong(int i) {
            return 0;
        }

        public short getShort(int i) {
            return 0;
        }

        public String getString(int i) {
            return null;
        }

        public boolean isNull(int i) {
            return true;
        }

        private C3508b() {
        }
    }
}
