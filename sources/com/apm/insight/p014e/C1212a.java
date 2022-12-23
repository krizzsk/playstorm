package com.apm.insight.p014e;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.C1240h;
import com.apm.insight.p014e.p015a.C1213a;
import com.apm.insight.p014e.p016b.C1216b;
import com.apm.insight.p023l.C1311q;

/* renamed from: com.apm.insight.e.a */
public class C1212a {

    /* renamed from: a */
    private static volatile C1212a f1072a;

    /* renamed from: b */
    private C1216b f1073b;

    /* renamed from: c */
    private SQLiteDatabase f1074c;

    private C1212a() {
    }

    /* renamed from: a */
    public static C1212a m1367a() {
        if (f1072a == null) {
            synchronized (C1212a.class) {
                if (f1072a == null) {
                    f1072a = new C1212a();
                }
            }
        }
        return f1072a;
    }

    /* renamed from: b */
    private void m1368b() {
        if (this.f1073b == null) {
            mo12224a(C1240h.m1558g());
        }
    }

    /* renamed from: a */
    public synchronized void mo12224a(Context context) {
        try {
            this.f1074c = new C1214b(context).getWritableDatabase();
        } catch (Throwable th) {
            C1311q.m1877b(th);
        }
        this.f1073b = new C1216b();
    }

    /* renamed from: a */
    public synchronized void mo12225a(C1213a aVar) {
        m1368b();
        if (this.f1073b != null) {
            this.f1073b.mo12232a(this.f1074c, aVar);
        }
    }

    /* renamed from: a */
    public synchronized boolean mo12226a(String str) {
        m1368b();
        if (this.f1073b == null) {
            return false;
        }
        return this.f1073b.mo12235a(this.f1074c, str);
    }
}
