package com.apm.insight.p014e.p016b;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.C1176b;
import com.apm.insight.p023l.C1311q;
import java.util.HashMap;

/* renamed from: com.apm.insight.e.b.a */
public abstract class C1215a<T> {

    /* renamed from: a */
    protected final String f1077a = "_id";

    /* renamed from: b */
    protected final String f1078b;

    protected C1215a(String str) {
        this.f1078b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract ContentValues mo12229a(T t);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract HashMap<String, String> mo12230a();

    /* renamed from: a */
    public void mo12231a(SQLiteDatabase sQLiteDatabase) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("CREATE TABLE ");
            sb.append(this.f1078b);
            sb.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, ");
            HashMap<String, String> a = mo12230a();
            if (a != null) {
                for (String next : a.keySet()) {
                    sb.append(next);
                    sb.append(" ");
                    sb.append(a.get(next));
                    sb.append(",");
                }
                sb.delete(sb.length() - 1, sb.length());
                sb.append(")");
                sQLiteDatabase.execSQL(sb.toString());
            }
        } catch (Throwable th) {
            C1176b.m1249a().mo12218a("NPTH_CATCH", th);
        }
    }

    /* renamed from: a */
    public void mo12232a(SQLiteDatabase sQLiteDatabase, T t) {
        if (sQLiteDatabase != null && t != null) {
            try {
                sQLiteDatabase.insert(this.f1078b, (String) null, mo12229a(t));
            } catch (Throwable th) {
                C1311q.m1877b(th);
            }
        }
    }
}
