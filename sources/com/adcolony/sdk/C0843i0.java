package com.adcolony.sdk;

import android.content.Context;
import com.adcolony.sdk.C0817e0;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* renamed from: com.adcolony.sdk.i0 */
class C0843i0 {

    /* renamed from: a */
    private final LinkedHashMap<Integer, C0889k0> f483a = new LinkedHashMap<>();

    /* renamed from: b */
    private int f484b = 2;

    /* renamed from: c */
    private final HashMap<String, ArrayList<C0856j0>> f485c = new HashMap<>();

    /* renamed from: d */
    private int f486d = 1;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final LinkedBlockingQueue<C0823f1> f487e = new LinkedBlockingQueue<>();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f488f = false;

    /* renamed from: g */
    private final ScheduledExecutorService f489g = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: h */
    private final ExecutorService f490h = Executors.newSingleThreadExecutor();

    /* renamed from: i */
    private ScheduledFuture<?> f491i;

    /* renamed from: com.adcolony.sdk.i0$a */
    class C0844a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f492a;

        C0844a(Context context) {
            this.f492a = context;
        }

        public void run() {
            C0823f1 b = C0714a.m136b().mo10850u().mo10321b();
            C0823f1 b2 = C0764c0.m322b();
            C0764c0.m319a(b, "os_name", "android");
            C0764c0.m319a(b2, "filepath", C0714a.m136b().mo10855z().mo11091a() + "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5");
            C0764c0.m318a(b2, TJAdUnitConstants.String.VIDEO_INFO, b);
            C0764c0.m326b(b2, "m_origin", 0);
            C0764c0.m326b(b2, "m_id", C0843i0.m576a(C0843i0.this));
            C0764c0.m319a(b2, "m_type", "Controller.create");
            try {
                C0890l.m743b(this.f492a, new C0841h0(b2));
            } catch (RuntimeException e) {
                C0817e0.C0818a aVar = new C0817e0.C0818a();
                aVar.mo10684a(e.toString() + ": during WebView initialization.").mo10684a(" Disabling AdColony.").mo10685a(C0817e0.f433h);
                AdColony.disable();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.i0$b */
    class C0845b implements Runnable {
        C0845b() {
        }

        public void run() {
            while (true) {
                try {
                    C0823f1 f1Var = (C0823f1) C0843i0.this.f487e.poll(60, TimeUnit.SECONDS);
                    if (f1Var != null) {
                        C0843i0.this.m584b(f1Var);
                    } else {
                        synchronized (C0843i0.this.f487e) {
                            if (C0843i0.this.f487e.peek() == null) {
                                boolean unused = C0843i0.this.f488f = false;
                                return;
                            }
                        }
                    }
                } catch (InterruptedException e) {
                    new C0817e0.C0818a().mo10684a("Native messages thread was interrupted: ").mo10684a(e.toString()).mo10685a(C0817e0.f434i);
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.i0$c */
    class C0846c implements Runnable {
        C0846c() {
        }

        public void run() {
            C0714a.m141f();
            if (!C0843i0.this.mo10791f()) {
                C0843i0.this.mo10793i();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.i0$d */
    class C0847d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f496a;

        /* renamed from: b */
        final /* synthetic */ C0823f1 f497b;

        C0847d(String str, C0823f1 f1Var) {
            this.f496a = str;
            this.f497b = f1Var;
        }

        public void run() {
            C0843i0.this.m580a(this.f496a, this.f497b);
        }
    }

    C0843i0() {
    }

    /* renamed from: a */
    static /* synthetic */ int m576a(C0843i0 i0Var) {
        int i = i0Var.f486d;
        i0Var.f486d = i + 1;
        return i;
    }

    /* renamed from: g */
    private void m585g() {
        if (this.f491i == null) {
            try {
                this.f491i = this.f489g.scheduleAtFixedRate(new C0846c(), 0, 17, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                new C0817e0.C0818a().mo10684a("Error when scheduling message pumping").mo10684a(e.toString()).mo10685a(C0817e0.f434i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo10788c(C0823f1 f1Var) {
        try {
            if (f1Var.mo10731c("m_id", this.f486d)) {
                this.f486d++;
            }
            f1Var.mo10731c("m_origin", 0);
            int b = f1Var.mo10724b("m_target");
            if (b == 0) {
                m577a(f1Var);
                return;
            }
            C0889k0 k0Var = this.f483a.get(Integer.valueOf(b));
            if (k0Var != null) {
                k0Var.mo10604a(f1Var);
            }
        } catch (JSONException e) {
            new C0817e0.C0818a().mo10684a("JSON error in ADCMessageDispatcher's sendMessage(): ").mo10684a(e.toString()).mo10685a(C0817e0.f434i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public LinkedHashMap<Integer, C0889k0> mo10789d() {
        return this.f483a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo10790e() {
        int i = this.f484b;
        this.f484b = i + 1;
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo10791f() {
        for (C0889k0 a : this.f483a.values()) {
            if (a.mo10605a()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo10792h() {
        if (mo10791f()) {
            m585g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo10793i() {
        ScheduledFuture<?> scheduledFuture = this.f491i;
        if (scheduledFuture != null) {
            if (!scheduledFuture.isCancelled()) {
                this.f491i.cancel(false);
            }
            this.f491i = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo10794j() {
        synchronized (this.f483a) {
            ArrayList arrayList = new ArrayList(this.f483a.values());
            Collections.reverse(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C0889k0) it.next()).mo10606b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10784b(String str, C0856j0 j0Var) {
        synchronized (this.f485c) {
            ArrayList arrayList = this.f485c.get(str);
            if (arrayList != null) {
                arrayList.remove(j0Var);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10783a(String str, C0856j0 j0Var) {
        ArrayList arrayList = this.f485c.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f485c.put(str, arrayList);
        }
        arrayList.add(j0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo10786b(C0889k0 k0Var) {
        return mo10785b(k0Var.getAdcModuleId());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo10785b(int i) {
        synchronized (this.f483a) {
            C0889k0 k0Var = (C0889k0) this.f483a.remove(Integer.valueOf(i));
            if (k0Var == null) {
                return false;
            }
            k0Var.mo10609c();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10782a() {
        Context a;
        C0857k b = C0714a.m136b();
        if (!b.mo10805E() && !b.mo10806F() && (a = C0714a.m129a()) != null) {
            m583b();
            C1038z0.m1202b((Runnable) new C0844a(a));
        }
    }

    /* renamed from: b */
    private void m583b() {
        if (!this.f488f) {
            synchronized (this.f487e) {
                if (!this.f488f) {
                    this.f488f = true;
                    new Thread(new C0845b()).start();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0890l mo10787c() {
        C0889k0 a = mo10780a(1);
        if (a instanceof C0890l) {
            return (C0890l) a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0889k0 mo10781a(C0889k0 k0Var) {
        synchronized (this.f483a) {
            this.f483a.put(Integer.valueOf(k0Var.getAdcModuleId()), k0Var);
            mo10792h();
        }
        return k0Var;
    }

    /* renamed from: a */
    private void m577a(C0823f1 f1Var) {
        m583b();
        this.f487e.add(f1Var);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r4.hasNext() == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        ((com.adcolony.sdk.C0856j0) r4.next()).mo10469a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        new com.adcolony.sdk.C0817e0.C0818a().mo10683a((java.lang.Object) r3).mo10685a(com.adcolony.sdk.C0817e0.f434i);
        r3.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        r3 = new com.adcolony.sdk.C0841h0(r4);
        r4 = r1.iterator();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m580a(java.lang.String r3, com.adcolony.sdk.C0823f1 r4) {
        /*
            r2 = this;
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.adcolony.sdk.j0>> r0 = r2.f485c
            monitor-enter(r0)
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.adcolony.sdk.j0>> r1 = r2.f485c     // Catch:{ all -> 0x0041 }
            java.lang.Object r3 = r1.get(r3)     // Catch:{ all -> 0x0041 }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x0041 }
            if (r3 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            return
        L_0x000f:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0041 }
            r1.<init>(r3)     // Catch:{ all -> 0x0041 }
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            com.adcolony.sdk.h0 r3 = new com.adcolony.sdk.h0
            r3.<init>(r4)
            java.util.Iterator r4 = r1.iterator()
        L_0x001e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0040
            java.lang.Object r0 = r4.next()
            com.adcolony.sdk.j0 r0 = (com.adcolony.sdk.C0856j0) r0
            r0.mo10469a(r3)     // Catch:{ RuntimeException -> 0x002e }
            goto L_0x001e
        L_0x002e:
            r3 = move-exception
            com.adcolony.sdk.e0$a r4 = new com.adcolony.sdk.e0$a
            r4.<init>()
            com.adcolony.sdk.e0$a r4 = r4.mo10683a((java.lang.Object) r3)
            com.adcolony.sdk.e0 r0 = com.adcolony.sdk.C0817e0.f434i
            r4.mo10685a((com.adcolony.sdk.C0817e0) r0)
            r3.printStackTrace()
        L_0x0040:
            return
        L_0x0041:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0843i0.m580a(java.lang.String, com.adcolony.sdk.f1):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0889k0 mo10780a(int i) {
        return this.f483a.get(Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m584b(C0823f1 f1Var) {
        try {
            String e = f1Var.mo10734e("m_type");
            int b = f1Var.mo10724b("m_origin");
            C0847d dVar = new C0847d(e, f1Var);
            if (b >= 2) {
                C1038z0.m1202b((Runnable) dVar);
            } else {
                this.f490h.execute(dVar);
            }
        } catch (RejectedExecutionException e2) {
            new C0817e0.C0818a().mo10684a("RejectedExecutionException from message dispatcher's dispatchNativeMessage(): ").mo10684a(e2.toString()).mo10685a(C0817e0.f434i);
        } catch (JSONException e3) {
            new C0817e0.C0818a().mo10684a("JSON error from message dispatcher's dispatchNativeMessage(): ").mo10684a(e3.toString()).mo10685a(C0817e0.f434i);
        }
    }
}
