package com.mbridge.msdk.foundation.p066db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.mbridge.msdk.foundation.db.f */
/* compiled from: CommonAbsDBHelper */
public abstract class C2374f {

    /* renamed from: a */
    private C2375a f4991a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo15893a(SQLiteDatabase sQLiteDatabase);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo15894a(SQLiteDatabase sQLiteDatabase, int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo15896b(SQLiteDatabase sQLiteDatabase, int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract String mo15897c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo15898d();

    public C2374f(Context context) {
        this.f4991a = new C2375a(context, mo15897c(), mo15898d());
    }

    /* renamed from: a */
    public final SQLiteDatabase mo15892a() {
        return this.f4991a.getReadableDatabase();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000b, code lost:
        r0 = null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.database.sqlite.SQLiteDatabase mo15895b() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.mbridge.msdk.foundation.db.f$a r0 = r1.f4991a     // Catch:{ Exception -> 0x000b, all -> 0x0008 }
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch:{ Exception -> 0x000b, all -> 0x0008 }
            goto L_0x000c
        L_0x0008:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x000b:
            r0 = 0
        L_0x000c:
            monitor-exit(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p066db.C2374f.mo15895b():android.database.sqlite.SQLiteDatabase");
    }

    /* renamed from: com.mbridge.msdk.foundation.db.f$a */
    /* compiled from: CommonAbsDBHelper */
    private class C2375a extends SQLiteOpenHelper {
        public C2375a(Context context, String str, int i) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            C2374f.this.mo15893a(sQLiteDatabase);
        }

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            C2374f.this.mo15894a(sQLiteDatabase, i, i2);
        }

        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            C2374f.this.mo15896b(sQLiteDatabase, i, i2);
        }
    }
}
