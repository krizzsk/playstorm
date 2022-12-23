package com.adcolony.sdk;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.adcolony.sdk.C0817e0;
import com.adcolony.sdk.C0914n0;
import com.adcolony.sdk.C0919o;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.adcolony.sdk.v */
class C0979v {

    /* renamed from: f */
    private static C0979v f807f;

    /* renamed from: a */
    private final Executor f808a = Executors.newSingleThreadExecutor();

    /* renamed from: b */
    private SQLiteDatabase f809b;

    /* renamed from: c */
    private boolean f810c = false;

    /* renamed from: d */
    private C0982c f811d;

    /* renamed from: e */
    private Set<String> f812e = new HashSet();

    /* renamed from: com.adcolony.sdk.v$a */
    class C0980a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0823f1 f813a;

        /* renamed from: b */
        final /* synthetic */ C1004x f814b;

        /* renamed from: c */
        final /* synthetic */ Context f815c;

        C0980a(C0823f1 f1Var, C1004x xVar, Context context) {
            this.f813a = f1Var;
            this.f814b = xVar;
            this.f815c = context;
        }

        public void run() {
            C0914n0 a = C0914n0.m792a(this.f813a);
            if (a != null) {
                C0979v.this.m1033a(a, (C1004x<C0914n0>) this.f814b, this.f815c);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.v$b */
    class C0981b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f817a;

        /* renamed from: b */
        final /* synthetic */ ContentValues f818b;

        C0981b(String str, ContentValues contentValues) {
            this.f817a = str;
            this.f818b = contentValues;
        }

        public void run() {
            C0979v.this.m1037b(this.f817a, this.f818b);
        }
    }

    /* renamed from: com.adcolony.sdk.v$c */
    interface C0982c {
        /* renamed from: a */
        void mo10864a();
    }

    C0979v() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo11087b() {
        this.f812e.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public synchronized void m1037b(String str, ContentValues contentValues) {
        C0929p.m853a(str, contentValues, this.f809b);
    }

    /* renamed from: a */
    public static C0979v m1032a() {
        if (f807f == null) {
            synchronized (C0979v.class) {
                if (f807f == null) {
                    f807f = new C0979v();
                }
            }
        }
        return f807f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11085a(C0982c cVar) {
        this.f811d = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11083a(C0823f1 f1Var, C1004x<C0914n0> xVar) {
        Context applicationContext = C0714a.m138c() ? C0714a.m129a().getApplicationContext() : null;
        if (applicationContext != null && f1Var != null) {
            try {
                this.f808a.execute(new C0980a(f1Var, xVar, applicationContext));
            } catch (RejectedExecutionException e) {
                C0817e0.C0818a aVar = new C0817e0.C0818a();
                aVar.mo10684a("ADCEventsRepository.open failed with: " + e.toString()).mo10685a(C0817e0.f434i);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m1033a(C0914n0 n0Var, C1004x<C0914n0> xVar, Context context) {
        try {
            SQLiteDatabase sQLiteDatabase = this.f809b;
            boolean z = false;
            if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                this.f809b = context.openOrCreateDatabase("adc_events_db", 0, (SQLiteDatabase.CursorFactory) null);
            }
            if (this.f809b.needUpgrade(n0Var.mo10897b())) {
                if (m1036a(n0Var) && this.f811d != null) {
                    z = true;
                }
                this.f810c = z;
                if (z) {
                    this.f811d.mo10864a();
                }
            } else {
                this.f810c = true;
            }
            if (this.f810c) {
                xVar.mo10860a(n0Var);
            }
        } catch (SQLiteException e) {
            new C0817e0.C0818a().mo10684a("Database cannot be opened").mo10684a(e.toString()).mo10685a(C0817e0.f432g);
        }
        return;
    }

    /* renamed from: a */
    private boolean m1036a(C0914n0 n0Var) {
        return new C0912n(this.f809b, n0Var).mo10887b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11084a(C0914n0.C0915a aVar, ContentValues contentValues) {
        String str;
        if (aVar != null && !this.f812e.contains(aVar.mo10903f())) {
            this.f812e.add(aVar.mo10903f());
            int c = aVar.mo10900c();
            long j = -1;
            C0914n0.C0918d g = aVar.mo10904g();
            if (g != null) {
                j = contentValues.getAsLong(g.mo10910a()).longValue() - g.mo10911b();
                str = g.mo10910a();
            } else {
                str = null;
            }
            C0929p.m852a(c, j, str, aVar.mo10903f(), this.f809b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11086a(String str, ContentValues contentValues) {
        if (this.f810c) {
            try {
                this.f808a.execute(new C0981b(str, contentValues));
            } catch (RejectedExecutionException e) {
                C0817e0.C0818a aVar = new C0817e0.C0818a();
                aVar.mo10684a("ADCEventsRepository.saveEvent failed with: " + e.toString()).mo10685a(C0817e0.f434i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0919o.C0921b mo11082a(C0914n0 n0Var, long j) {
        if (this.f810c) {
            return C0919o.m812a(n0Var, this.f809b, this.f808a, j);
        }
        return null;
    }
}
