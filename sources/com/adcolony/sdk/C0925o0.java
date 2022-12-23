package com.adcolony.sdk;

import android.content.ContentValues;
import com.adcolony.sdk.C0817e0;
import com.adcolony.sdk.C0914n0;
import com.adcolony.sdk.C0919o;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* renamed from: com.adcolony.sdk.o0 */
class C0925o0 {

    /* renamed from: e */
    private static C0925o0 f656e;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C0914n0 f657a;

    /* renamed from: b */
    private final ExecutorService f658b = C1038z0.m1219h();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C0919o.C0921b f659c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f660d = false;

    /* renamed from: com.adcolony.sdk.o0$a */
    class C0926a implements C1004x<C0919o.C0921b> {

        /* renamed from: a */
        final /* synthetic */ C0919o.C0921b[] f661a;

        /* renamed from: b */
        final /* synthetic */ CountDownLatch f662b;

        C0926a(C0925o0 o0Var, C0919o.C0921b[] bVarArr, CountDownLatch countDownLatch) {
            this.f661a = bVarArr;
            this.f662b = countDownLatch;
        }

        /* renamed from: a */
        public void mo10860a(C0919o.C0921b bVar) {
            this.f661a[0] = bVar;
            this.f662b.countDown();
        }
    }

    /* renamed from: com.adcolony.sdk.o0$b */
    class C0927b implements C1004x<C0919o.C0921b> {
        C0927b(C0925o0 o0Var) {
        }

        /* renamed from: a */
        public void mo10860a(C0919o.C0921b bVar) {
        }
    }

    /* renamed from: com.adcolony.sdk.o0$c */
    class C0928c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C1004x f663a;

        /* renamed from: b */
        final /* synthetic */ long f664b;

        C0928c(C1004x xVar, long j) {
            this.f663a = xVar;
            this.f664b = j;
        }

        public void run() {
            C0919o.C0921b bVar;
            C1004x xVar = this.f663a;
            if (C0925o0.this.f660d) {
                bVar = C0925o0.this.f659c;
            } else {
                bVar = C0979v.m1032a().mo11082a(C0925o0.this.f657a, this.f664b);
            }
            xVar.mo10860a(bVar);
        }
    }

    C0925o0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo10933d() {
        this.f660d = false;
    }

    /* renamed from: c */
    static C0925o0 m838c() {
        if (f656e == null) {
            synchronized (C0925o0.class) {
                if (f656e == null) {
                    f656e = new C0925o0();
                }
            }
        }
        return f656e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10928a(C0914n0 n0Var) {
        this.f657a = n0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0919o.C0921b mo10932b() {
        return this.f659c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        r0 = r3.mo10747p("request_type");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10927a(com.adcolony.sdk.C0841h0 r3) {
        /*
            r2 = this;
            com.adcolony.sdk.n0 r0 = r2.f657a
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            com.adcolony.sdk.f1 r3 = r3.mo10772a()
            if (r3 != 0) goto L_0x000c
            return
        L_0x000c:
            java.lang.String r0 = "payload"
            com.adcolony.sdk.f1 r3 = r3.mo10745n(r0)
            if (r3 != 0) goto L_0x0015
            return
        L_0x0015:
            java.lang.String r0 = "request_type"
            java.lang.String r0 = r3.mo10747p(r0)
            com.adcolony.sdk.n0 r1 = r2.f657a
            com.adcolony.sdk.n0$a r1 = r1.mo10895a((java.lang.String) r0)
            if (r1 == 0) goto L_0x0026
            r2.m834a(r0, r3, r1)
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0925o0.mo10927a(com.adcolony.sdk.h0):void");
    }

    /* renamed from: a */
    private void m834a(String str, C0823f1 f1Var, C0914n0.C0915a aVar) {
        try {
            ContentValues a = m833a(f1Var, aVar);
            C0979v.m1032a().mo11086a(aVar.mo10903f(), a);
            C0979v.m1032a().mo11084a(aVar, a);
            mo10933d();
        } catch (NullPointerException | NumberFormatException e) {
            e.printStackTrace();
            C0817e0.C0818a aVar2 = new C0817e0.C0818a();
            C0817e0.C0818a a2 = aVar2.mo10684a("Error parsing event:" + str + " ").mo10684a(f1Var.toString());
            a2.mo10684a("Schema version: " + this.f657a.mo10897b() + " ").mo10684a(" e: ").mo10684a(e.toString()).mo10685a(C0817e0.f432g);
        }
    }

    /* renamed from: a */
    static ContentValues m833a(C0823f1 f1Var, C0914n0.C0915a aVar) throws NumberFormatException, NullPointerException {
        ContentValues contentValues = new ContentValues();
        for (C0914n0.C0916b next : aVar.mo10898a()) {
            Object o = f1Var.mo10746o(next.mo10906b());
            if (o != null) {
                if (o instanceof Boolean) {
                    contentValues.put(next.mo10906b(), (Boolean) o);
                } else if (o instanceof Long) {
                    contentValues.put(next.mo10906b(), (Long) o);
                } else if (o instanceof Double) {
                    contentValues.put(next.mo10906b(), (Double) o);
                } else if (o instanceof Number) {
                    Number number = (Number) o;
                    if (number.doubleValue() != ((double) number.longValue()) || !"INTEGER".equalsIgnoreCase(next.mo10907c())) {
                        contentValues.put(next.mo10906b(), Double.valueOf(number.doubleValue()));
                    } else {
                        contentValues.put(next.mo10906b(), Long.valueOf(number.longValue()));
                    }
                } else if (o instanceof String) {
                    contentValues.put(next.mo10906b(), (String) o);
                }
            }
        }
        return contentValues;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0919o.C0921b mo10925a(long j) {
        C0919o.C0921b[] bVarArr = new C0919o.C0921b[1];
        CountDownLatch countDownLatch = new CountDownLatch(1);
        mo10931a((C1004x<C0919o.C0921b>) new C0926a(this, bVarArr, countDownLatch), j);
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
        }
        return bVarArr[0];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10926a() {
        mo10930a((C1004x<C0919o.C0921b>) new C0927b(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10930a(C1004x<C0919o.C0921b> xVar) {
        mo10931a(xVar, -1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10931a(C1004x<C0919o.C0921b> xVar, long j) {
        if (this.f657a == null) {
            xVar.mo10860a(null);
        } else if (this.f660d) {
            xVar.mo10860a(this.f659c);
        } else if (!C1038z0.m1190a(this.f658b, (Runnable) new C0928c(xVar, j))) {
            new C0817e0.C0818a().mo10684a("Execute ADCOdtEventsListener.calculateFeatureVectors failed").mo10685a(C0817e0.f434i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10929a(C0919o.C0921b bVar) {
        this.f659c = bVar;
        this.f660d = true;
    }
}
