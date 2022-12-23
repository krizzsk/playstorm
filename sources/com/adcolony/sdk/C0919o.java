package com.adcolony.sdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.adcolony.sdk.C0817e0;
import com.adcolony.sdk.C0914n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.adcolony.sdk.o */
class C0919o {

    /* renamed from: com.adcolony.sdk.o$a */
    class C0920a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0914n0 f643a;

        /* renamed from: b */
        final /* synthetic */ SQLiteDatabase f644b;

        /* renamed from: c */
        final /* synthetic */ C0921b f645c;

        /* renamed from: d */
        final /* synthetic */ CountDownLatch f646d;

        C0920a(C0914n0 n0Var, SQLiteDatabase sQLiteDatabase, C0921b bVar, CountDownLatch countDownLatch) {
            this.f643a = n0Var;
            this.f644b = sQLiteDatabase;
            this.f645c = bVar;
            this.f646d = countDownLatch;
        }

        public void run() {
            for (C0914n0.C0915a next : this.f643a.mo10896a()) {
                for (Map.Entry next2 : next.mo10902e().entrySet()) {
                    C0923c a = C0919o.m813a((String) next2.getValue(), this.f644b);
                    if (a != null) {
                        this.f645c.m815a(next.mo10901d(), (String) next2.getKey(), a);
                    }
                }
            }
            C0925o0.m838c().mo10929a(this.f645c);
            this.f646d.countDown();
        }
    }

    /* renamed from: com.adcolony.sdk.o$b */
    static class C0921b {

        /* renamed from: a */
        private final int f647a;

        /* renamed from: b */
        private final Map<String, ArrayList<C0922a>> f648b;

        /* renamed from: com.adcolony.sdk.o$b$a */
        static class C0922a {

            /* renamed from: a */
            private final String f649a;

            /* renamed from: b */
            private final C0923c f650b;

            /* synthetic */ C0922a(String str, C0923c cVar, C0920a aVar) {
                this(str, cVar);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public String mo10915a() {
                return this.f649a;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public C0923c mo10916b() {
                return this.f650b;
            }

            private C0922a(String str, C0923c cVar) {
                this.f649a = str;
                this.f650b = cVar;
            }
        }

        /* synthetic */ C0921b(int i, C0920a aVar) {
            this(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0823f1 mo10914b() {
            C0823f1 b = C0764c0.m322b();
            C0764c0.m326b(b, "version", mo10913a());
            for (Map.Entry next : this.f648b.entrySet()) {
                C0823f1 b2 = C0764c0.m322b();
                Iterator it = ((ArrayList) next.getValue()).iterator();
                while (it.hasNext()) {
                    C0922a aVar = (C0922a) it.next();
                    C0819e1 a = C0764c0.m308a();
                    for (String b3 : aVar.mo10916b().mo10919a((Character) ',')) {
                        a.mo10692b(b3);
                    }
                    C0764c0.m317a(b2, aVar.mo10915a(), a);
                }
                C0764c0.m318a(b, (String) next.getKey(), b2);
            }
            return b;
        }

        private C0921b(int i) {
            this.f648b = new ConcurrentHashMap();
            this.f647a = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m815a(String str, String str2, C0923c cVar) {
            ArrayList arrayList;
            C0922a aVar = new C0922a(str2, cVar, (C0920a) null);
            if (!this.f648b.containsKey(str) || (arrayList = this.f648b.get(str)) == null) {
                this.f648b.put(str, new ArrayList(Collections.singletonList(aVar)));
            } else {
                arrayList.add(aVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo10913a() {
            return this.f647a;
        }
    }

    /* renamed from: a */
    static C0921b m812a(C0914n0 n0Var, SQLiteDatabase sQLiteDatabase, Executor executor, long j) {
        C0921b bVar = new C0921b(n0Var.mo10897b(), (C0920a) null);
        try {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            executor.execute(new C0920a(n0Var, sQLiteDatabase, bVar, countDownLatch));
            if (j > 0) {
                countDownLatch.await(j, TimeUnit.MILLISECONDS);
            } else {
                countDownLatch.await();
            }
        } catch (InterruptedException | RejectedExecutionException e) {
            C0817e0.C0818a aVar = new C0817e0.C0818a();
            aVar.mo10684a("ADCDbReader.calculateFeatureVectors failed with: " + e.toString()).mo10685a(C0817e0.f434i);
        }
        return bVar;
    }

    /* renamed from: com.adcolony.sdk.o$c */
    static class C0923c {

        /* renamed from: a */
        private final List<C0924a> f651a = new ArrayList();

        /* renamed from: b */
        private final List<ContentValues> f652b = new ArrayList();

        /* renamed from: com.adcolony.sdk.o$c$a */
        static class C0924a {

            /* renamed from: a */
            private final int f653a;
            /* access modifiers changed from: private */

            /* renamed from: b */
            public final String f654b;
            /* access modifiers changed from: private */

            /* renamed from: c */
            public final int f655c;

            /* synthetic */ C0924a(int i, String str, int i2, C0920a aVar) {
                this(i, str, i2);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: c */
            public int mo10924c() {
                return this.f655c;
            }

            private C0924a(int i, String str, int i2) {
                this.f653a = i;
                this.f654b = str;
                this.f655c = i2;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public int mo10922a() {
                return this.f653a;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public String mo10923b() {
                return this.f654b;
            }
        }

        C0923c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo10920b(int i) {
            if (i < 0 || i >= this.f651a.size()) {
                return -1;
            }
            return this.f651a.get(i).mo10924c();
        }

        public String toString() {
            String str;
            String str2;
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (true) {
                str = "\n";
                if (i >= this.f651a.size()) {
                    break;
                }
                sb.append(this.f651a.get(i).f654b);
                if (i != this.f651a.size() - 1) {
                    str = " | ";
                }
                sb.append(str);
                i++;
            }
            for (ContentValues next : this.f652b) {
                for (int i2 = 0; i2 < this.f651a.size(); i2++) {
                    sb.append(next.getAsString(mo10917a(i2)));
                    if (i2 == this.f651a.size() - 1) {
                        str2 = str;
                    } else {
                        str2 = " | ";
                    }
                    sb.append(str2);
                }
            }
            return sb.toString();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m820a(int i, String str, int i2) {
            this.f651a.add(new C0924a(i, str, i2, (C0920a) null));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo10917a(int i) {
            if (i < 0 || i >= this.f651a.size()) {
                return null;
            }
            return this.f651a.get(i).mo10923b();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m821a(Cursor cursor) {
            ContentValues contentValues = new ContentValues();
            for (C0924a next : this.f651a) {
                int a = next.f655c;
                if (a == 1) {
                    contentValues.put(next.mo10923b(), Long.valueOf(cursor.getLong(next.mo10922a())));
                } else if (a == 2) {
                    contentValues.put(next.mo10923b(), Double.valueOf(cursor.getDouble(next.mo10922a())));
                } else if (a != 4) {
                    contentValues.put(next.mo10923b(), cursor.getString(next.mo10922a()));
                } else {
                    contentValues.put(next.mo10923b(), cursor.getBlob(next.mo10922a()));
                }
            }
            this.f652b.add(contentValues);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo10918a(int i, Character ch) {
            if (i < 0 || i >= this.f652b.size()) {
                return null;
            }
            ContentValues contentValues = this.f652b.get(i);
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            while (i2 < this.f651a.size()) {
                if (mo10920b(i2) == 3) {
                    sb.append("\"");
                    sb.append(contentValues.get(mo10917a(i2)));
                    sb.append("\"");
                } else {
                    sb.append(contentValues.getAsString(mo10917a(i2)));
                }
                sb.append(i2 == this.f651a.size() + -1 ? "" : ch);
                i2++;
            }
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public List<String> mo10919a(Character ch) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f652b.size(); i++) {
                arrayList.add(mo10918a(i, ch));
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    static C0923c m813a(String str, SQLiteDatabase sQLiteDatabase) {
        C0923c cVar;
        Throwable th;
        C0923c cVar2 = null;
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery(str, (String[]) null);
            if (rawQuery != null) {
                try {
                    if (rawQuery.moveToFirst()) {
                        cVar = new C0923c();
                        int i = 0;
                        while (i < rawQuery.getColumnCount()) {
                            try {
                                cVar.m820a(i, rawQuery.getColumnName(i), rawQuery.getType(i));
                                i++;
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    rawQuery.close();
                                } catch (Throwable th3) {
                                    try {
                                        th.addSuppressed(th3);
                                    } catch (SQLException e) {
                                        e = e;
                                        new C0817e0.C0818a().mo10684a("SQLException on execute query: ").mo10684a(e.toString()).mo10685a(C0817e0.f434i);
                                        return cVar;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        new C0817e0.C0818a().mo10684a("Error on execute query: ").mo10684a(th.toString()).mo10685a(C0817e0.f434i);
                                        return cVar;
                                    }
                                }
                                throw th;
                            }
                        }
                        do {
                            cVar.m821a(rawQuery);
                        } while (rawQuery.moveToNext());
                        cVar2 = cVar;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    cVar = null;
                    rawQuery.close();
                    throw th;
                }
            }
            if (rawQuery == null) {
                return cVar2;
            }
            rawQuery.close();
            return cVar2;
        } catch (SQLException e2) {
            e = e2;
            cVar = cVar2;
        } catch (Throwable th6) {
            th = th6;
            cVar = cVar2;
            new C0817e0.C0818a().mo10684a("Error on execute query: ").mo10684a(th.toString()).mo10685a(C0817e0.f434i);
            return cVar;
        }
    }
}
