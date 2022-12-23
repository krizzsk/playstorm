package com.mbridge.msdk.foundation.p066db;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.mbridge.msdk.foundation.db.a */
/* compiled from: BaseDao */
public class C2365a<T> {
    protected C2374f mHelper = null;

    public C2365a(C2374f fVar) {
        this.mHelper = fVar;
    }

    /* access modifiers changed from: protected */
    public synchronized SQLiteDatabase getReadableDatabase() {
        return this.mHelper.mo15892a();
    }

    /* access modifiers changed from: protected */
    public synchronized SQLiteDatabase getWritableDatabase() {
        return this.mHelper.mo15895b();
    }
}
