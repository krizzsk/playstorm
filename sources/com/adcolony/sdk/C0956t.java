package com.adcolony.sdk;

import com.adcolony.sdk.C0817e0;
import com.adcolony.sdk.C0951s;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.adcolony.sdk.t */
class C0956t implements C0951s.C0952a {

    /* renamed from: a */
    private LinkedBlockingQueue<Runnable> f748a = new LinkedBlockingQueue<>();

    /* renamed from: b */
    private int f749b = 4;

    /* renamed from: c */
    private int f750c = 16;

    /* renamed from: d */
    private double f751d = 1.0d;

    /* renamed from: e */
    private ThreadPoolExecutor f752e = new ThreadPoolExecutor(this.f749b, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, this.f748a);

    /* renamed from: com.adcolony.sdk.t$a */
    class C0957a implements C0856j0 {
        C0957a() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0956t tVar = C0956t.this;
            tVar.mo11042a(new C0951s(h0Var, tVar));
        }
    }

    /* renamed from: com.adcolony.sdk.t$b */
    class C0958b implements C0856j0 {
        C0958b() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0956t tVar = C0956t.this;
            tVar.mo11042a(new C0951s(h0Var, tVar));
        }
    }

    /* renamed from: com.adcolony.sdk.t$c */
    class C0959c implements C0856j0 {
        C0959c() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0956t tVar = C0956t.this;
            tVar.mo11042a(new C0951s(h0Var, tVar));
        }
    }

    C0956t() {
    }

    /* renamed from: b */
    private void m966b() {
        int corePoolSize = this.f752e.getCorePoolSize();
        int size = this.f748a.size();
        int i = this.f749b;
        if (((double) size) * this.f751d > ((double) ((corePoolSize - i) + 1)) && corePoolSize < this.f750c) {
            this.f752e.setCorePoolSize(corePoolSize + 1);
        } else if (size == 0 && corePoolSize > i) {
            this.f752e.setCorePoolSize(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11039a() {
        this.f752e.allowCoreThreadTimeOut(true);
        C0714a.m135a("WebServices.download", (C0856j0) new C0957a());
        C0714a.m135a("WebServices.get", (C0856j0) new C0958b());
        C0714a.m135a("WebServices.post", (C0856j0) new C0959c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo11044c(int i) {
        this.f752e.setKeepAliveTime((long) i, TimeUnit.SECONDS);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo11043b(int i) {
        this.f750c = i;
        int corePoolSize = this.f752e.getCorePoolSize();
        int i2 = this.f750c;
        if (corePoolSize > i2) {
            this.f752e.setCorePoolSize(i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11042a(C0951s sVar) {
        m966b();
        try {
            this.f752e.execute(sVar);
        } catch (RejectedExecutionException unused) {
            C0817e0.C0818a a = new C0817e0.C0818a().mo10684a("RejectedExecutionException: ThreadPoolExecutor unable to ");
            a.mo10684a("execute download for url " + sVar.f735l).mo10685a(C0817e0.f434i);
            mo10863a(sVar, sVar.mo11024b(), (Map<String, List<String>>) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11041a(int i) {
        this.f749b = i;
        int corePoolSize = this.f752e.getCorePoolSize();
        int i2 = this.f749b;
        if (corePoolSize < i2) {
            this.f752e.setCorePoolSize(i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11040a(double d) {
        this.f751d = d;
    }

    /* renamed from: a */
    public void mo10863a(C0951s sVar, C0841h0 h0Var, Map<String, List<String>> map) {
        C0823f1 b = C0764c0.m322b();
        C0764c0.m319a(b, "url", sVar.f735l);
        C0764c0.m328b(b, "success", sVar.f737n);
        C0764c0.m326b(b, "status", sVar.f739p);
        C0764c0.m319a(b, "body", sVar.f736m);
        C0764c0.m326b(b, "size", sVar.f738o);
        if (map != null) {
            C0823f1 b2 = C0764c0.m322b();
            for (Map.Entry next : map.entrySet()) {
                String obj = ((List) next.getValue()).toString();
                String substring = obj.substring(1, obj.length() - 1);
                if (next.getKey() != null) {
                    C0764c0.m319a(b2, (String) next.getKey(), substring);
                }
            }
            C0764c0.m318a(b, "headers", b2);
        }
        h0Var.mo10773a(b).mo10776c();
    }
}
