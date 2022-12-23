package com.adcolony.sdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.adcolony.sdk.C0817e0;

/* renamed from: com.adcolony.sdk.p */
class C0929p {
    /* renamed from: a */
    static void m853a(String str, ContentValues contentValues, SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.beginTransaction();
            sQLiteDatabase.insertOrThrow(str, (String) null, contentValues);
            sQLiteDatabase.setTransactionSuccessful();
        } catch (SQLException e) {
            try {
                C0817e0.C0818a aVar = new C0817e0.C0818a();
                C0817e0.C0818a a = aVar.mo10684a("Exception on insert to " + str + ", db version:").mo10682a(sQLiteDatabase.getVersion());
                a.mo10684a(". Values: " + contentValues.toString() + " caused: ").mo10684a(e.toString()).mo10685a(C0817e0.f432g);
            } catch (Throwable th) {
                C0817e0.C0818a aVar2 = new C0817e0.C0818a();
                C0817e0.C0818a a2 = aVar2.mo10684a("Error on insert to " + str + ", db version:").mo10682a(sQLiteDatabase.getVersion());
                a2.mo10684a(". Values: " + contentValues.toString() + " caused: ").mo10684a(th.toString()).mo10685a(C0817e0.f434i);
                return;
            }
        }
        sQLiteDatabase.endTransaction();
    }

    /* renamed from: a */
    static void m852a(int i, long j, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.beginTransaction();
            if (str == null) {
                str = "rowid";
                j = -1;
            }
            if (i >= 0) {
                Cursor rawQuery = sQLiteDatabase.rawQuery("select " + str + " from " + str2 + " order by " + str + " desc limit 1 offset " + i, (String[]) null);
                if (rawQuery.moveToFirst()) {
                    j = Math.max(j, rawQuery.getLong(0));
                }
                rawQuery.close();
            }
            if (j >= 0) {
                sQLiteDatabase.execSQL("delete from " + str2 + " where " + str + " <= " + j);
            }
            sQLiteDatabase.setTransactionSuccessful();
        } catch (SQLException e) {
            try {
                new C0817e0.C0818a().mo10684a("Exception on deleting excessive rows:").mo10684a(e.toString()).mo10685a(C0817e0.f432g);
            } catch (Throwable th) {
                new C0817e0.C0818a().mo10684a("Error on deleting excessive rows:").mo10684a(th.toString()).mo10685a(C0817e0.f434i);
                return;
            }
        }
        sQLiteDatabase.endTransaction();
    }
}
