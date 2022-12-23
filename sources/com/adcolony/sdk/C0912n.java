package com.adcolony.sdk;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.adcolony.sdk.C0817e0;
import com.adcolony.sdk.C0914n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: com.adcolony.sdk.n */
class C0912n {

    /* renamed from: a */
    private final SQLiteDatabase f620a;

    /* renamed from: b */
    private final C0914n0 f621b;

    C0912n(SQLiteDatabase sQLiteDatabase, C0914n0 n0Var) {
        this.f620a = sQLiteDatabase;
        this.f621b = n0Var;
    }

    /* renamed from: a */
    private void m771a(C0914n0.C0915a aVar, List<String> list) {
        m773a(aVar.mo10903f(), "manager_tmp_table");
        m778c(aVar);
        m774a("manager_tmp_table", aVar.mo10903f(), list);
        m777b("manager_tmp_table");
    }

    /* renamed from: c */
    private void m779c(C0914n0.C0917c cVar, String str) {
        ArrayList<String[]> c = mo10888c(cVar.mo10909b());
        boolean z = true;
        if (cVar.mo10908a().length == c.size()) {
            boolean z2 = false;
            for (int i = 0; i < cVar.mo10908a().length; i++) {
                if (!Objects.equals(cVar.mo10908a()[i], c.get(i)[2])) {
                    z2 = true;
                }
            }
            z = z2;
        }
        if (z) {
            m772a(cVar.mo10909b());
            m776b(cVar, str);
        }
    }

    /* renamed from: d */
    private void m780d(C0914n0.C0915a aVar) {
        List<C0914n0.C0917c> b = aVar.mo10899b();
        ArrayList<String> d = mo10889d(aVar.mo10903f());
        for (C0914n0.C0917c next : b) {
            if (d.contains(next.mo10909b())) {
                m779c(next, aVar.mo10903f());
            } else {
                m776b(next, aVar.mo10903f());
            }
            d.remove(next.mo10909b());
        }
        Iterator<String> it = d.iterator();
        while (it.hasNext()) {
            m772a(it.next());
        }
    }

    /* renamed from: e */
    private void m781e(C0914n0.C0915a aVar) {
        boolean z;
        boolean z2;
        ArrayList<C0913a> g = mo10892g(aVar.mo10903f());
        ArrayList arrayList = new ArrayList();
        boolean z3 = true;
        boolean z4 = false;
        for (C0914n0.C0916b next : aVar.mo10898a()) {
            int size = g.size() - 1;
            while (true) {
                if (size < 0) {
                    z = false;
                    z2 = false;
                    break;
                }
                C0913a aVar2 = g.get(size);
                if (Objects.equals(aVar2.mo10893a(), next.mo10906b())) {
                    arrayList.add(next.mo10906b());
                    z = aVar2.mo10894a(next);
                    g.remove(size);
                    z2 = true;
                    break;
                }
                size--;
            }
            if (!z2 || !z) {
                z4 = true;
            }
        }
        if (g.size() <= 0) {
            z3 = z4;
        }
        if (z3) {
            m771a(aVar, (List<String>) arrayList);
            m775b(aVar);
            return;
        }
        m780d(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo10887b() {
        int version = this.f620a.getVersion();
        this.f620a.beginTransaction();
        boolean z = false;
        try {
            List<C0914n0.C0915a> a = this.f621b.mo10896a();
            ArrayList<String> a2 = mo10886a();
            for (C0914n0.C0915a next : a) {
                if (a2.contains(next.mo10903f())) {
                    m781e(next);
                } else {
                    m778c(next);
                    m775b(next);
                }
                a2.remove(next.mo10903f());
            }
            Iterator<String> it = a2.iterator();
            while (it.hasNext()) {
                m777b(it.next());
            }
            this.f620a.setVersion(this.f621b.mo10897b());
            this.f620a.setTransactionSuccessful();
            z = true;
            new C0817e0.C0818a().mo10684a("Success upgrading database from ").mo10682a(version).mo10684a(" to ").mo10682a(this.f621b.mo10897b()).mo10685a(C0817e0.f430e);
        } catch (SQLException e) {
            new C0817e0.C0818a().mo10684a("Upgrading database from ").mo10682a(version).mo10684a(" to ").mo10682a(this.f621b.mo10897b()).mo10684a("caused: ").mo10684a(e.toString()).mo10685a(C0817e0.f432g);
        } catch (Throwable th) {
            this.f620a.endTransaction();
            throw th;
        }
        this.f620a.endTransaction();
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public ArrayList<String> mo10891f(String str) {
        SQLiteDatabase sQLiteDatabase = this.f620a;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master  WHERE type='" + str + "' ORDER BY name", (String[]) null);
        ArrayList<String> arrayList = new ArrayList<>();
        if (rawQuery == null || !rawQuery.moveToFirst()) {
            rawQuery.close();
            return arrayList;
        }
        do {
            arrayList.add(rawQuery.getString(0));
        } while (rawQuery.moveToNext());
        rawQuery.close();
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public ArrayList<C0913a> mo10892g(String str) {
        ArrayList<C0913a> arrayList = new ArrayList<>();
        Iterator<String[]> it = mo10890e("PRAGMA table_info(" + str + ")").iterator();
        while (it.hasNext()) {
            C0913a a = C0913a.m789a(it.next());
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: com.adcolony.sdk.n$a */
    static class C0913a {

        /* renamed from: a */
        private final String f622a;

        /* renamed from: b */
        private final String f623b;

        /* renamed from: c */
        private final String f624c;

        private C0913a(String[] strArr) {
            this.f622a = strArr[1];
            this.f623b = strArr[2];
            this.f624c = strArr[4];
        }

        /* renamed from: a */
        static C0913a m789a(String[] strArr) {
            if (strArr.length >= 5) {
                return new C0913a(strArr);
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo10894a(C0914n0.C0916b bVar) {
            return Objects.equals(this.f622a, bVar.mo10906b()) && Objects.equals(this.f623b, bVar.mo10907c()) && Objects.equals(this.f624c, bVar.mo10905a());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo10893a() {
            return this.f622a;
        }
    }

    /* renamed from: a */
    private void m772a(String str) {
        SQLiteDatabase sQLiteDatabase = this.f620a;
        sQLiteDatabase.execSQL("DROP INDEX " + str);
    }

    /* renamed from: a */
    private String m769a(C0914n0.C0915a aVar) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE ");
        sb.append(aVar.mo10903f());
        sb.append(" (");
        for (int i = 0; i < aVar.mo10898a().size(); i++) {
            C0914n0.C0916b bVar = aVar.mo10898a().get(i);
            sb.append(bVar.mo10906b());
            sb.append(" ");
            sb.append(bVar.mo10907c());
            if (bVar.mo10905a() != null) {
                if (bVar.mo10905a() instanceof Boolean) {
                    str = ((Boolean) bVar.mo10905a()).booleanValue() ? "1" : "0";
                } else if (bVar.mo10905a() instanceof String) {
                    str = "'" + bVar.mo10905a() + "'";
                } else {
                    str = bVar.mo10905a().toString();
                }
                sb.append(" DEFAULT ");
                sb.append(str);
            }
            if (i < aVar.mo10898a().size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ArrayList<String> mo10889d(String str) {
        ArrayList<String[]> e = mo10890e("PRAGMA index_list(" + str + ")");
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<String[]> it = e.iterator();
        while (it.hasNext()) {
            String[] next = it.next();
            if (next.length >= 3) {
                arrayList.add(next[1]);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private void m778c(C0914n0.C0915a aVar) {
        this.f620a.execSQL(m769a(aVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ArrayList<String[]> mo10888c(String str) {
        return mo10890e("PRAGMA index_info(" + str + ")");
    }

    /* renamed from: a */
    private String m770a(C0914n0.C0917c cVar, String str) {
        String join = TextUtils.join(", ", cVar.mo10908a());
        return "CREATE INDEX " + cVar.mo10909b() + " ON " + str + "(" + join + ")";
    }

    /* renamed from: a */
    private void m773a(String str, String str2) {
        SQLiteDatabase sQLiteDatabase = this.f620a;
        sQLiteDatabase.execSQL("ALTER TABLE " + str + " RENAME TO " + str2);
    }

    /* renamed from: a */
    private void m774a(String str, String str2, List<String> list) {
        String join = TextUtils.join(", ", list);
        SQLiteDatabase sQLiteDatabase = this.f620a;
        sQLiteDatabase.execSQL("INSERT INTO " + str2 + " (" + join + ") SELECT " + join + " FROM " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public ArrayList<String[]> mo10890e(String str) {
        Cursor rawQuery = this.f620a.rawQuery(str, (String[]) null);
        ArrayList<String[]> arrayList = new ArrayList<>();
        if (rawQuery == null || !rawQuery.moveToFirst()) {
            rawQuery.close();
            return arrayList;
        }
        do {
            int columnCount = rawQuery.getColumnCount();
            String[] strArr = new String[columnCount];
            for (int i = 0; i < columnCount; i++) {
                strArr[i] = rawQuery.getString(i);
            }
            arrayList.add(strArr);
        } while (rawQuery.moveToNext());
        rawQuery.close();
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<String> mo10886a() {
        ArrayList<String> f = mo10891f("table");
        for (int size = f.size() - 1; size >= 0; size--) {
            String str = f.get(size);
            if (str.startsWith("android_") || str.startsWith("sqlite_")) {
                f.remove(size);
            }
        }
        return f;
    }

    /* renamed from: b */
    private void m775b(C0914n0.C0915a aVar) {
        for (C0914n0.C0917c b : aVar.mo10899b()) {
            m776b(b, aVar.mo10903f());
        }
    }

    /* renamed from: b */
    private void m776b(C0914n0.C0917c cVar, String str) {
        this.f620a.execSQL(m770a(cVar, str));
    }

    /* renamed from: b */
    private void m777b(String str) {
        SQLiteDatabase sQLiteDatabase = this.f620a;
        sQLiteDatabase.execSQL("DROP TABLE " + str);
    }
}
