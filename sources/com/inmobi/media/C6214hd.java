package com.inmobi.media;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.inmobi.media.hd */
/* compiled from: DbHelper */
public final class C6214hd extends SQLiteOpenHelper {

    /* renamed from: a */
    public static final String f15741a = ("com.im_" + C6228hp.m18574b() + ".db");

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public C6214hd(Context context) {
        super(context, f15741a, (SQLiteDatabase.CursorFactory) null, 1);
    }
}
