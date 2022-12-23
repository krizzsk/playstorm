package com.adcolony.sdk;

import com.adcolony.sdk.C0817e0;
import com.adcolony.sdk.C1038z0;
import java.util.Date;

/* renamed from: com.adcolony.sdk.z */
class C1034z {

    /* renamed from: a */
    private boolean f900a = true;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Runnable f901b = new C1035a();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Runnable f902c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C1037c f903d;

    /* renamed from: com.adcolony.sdk.z$a */
    class C1035a implements Runnable {
        C1035a() {
        }

        public void run() {
            new C0841h0("AdColony.heartbeat", 1).mo10776c();
            C1034z.this.m1165c();
        }
    }

    /* renamed from: com.adcolony.sdk.z$b */
    class C1036b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C1038z0.C1041c f905a;

        C1036b(C1038z0.C1041c cVar) {
            this.f905a = cVar;
        }

        public void run() {
            Runnable unused = C1034z.this.f902c = null;
            if (C0714a.m139d()) {
                C0857k b = C0714a.m136b();
                if (this.f905a.mo11154a() && b.mo10809I()) {
                    b.mo10815a();
                    C0817e0.C0818a a = new C0817e0.C0818a().mo10684a("Controller heartbeat timeout occurred. ");
                    C0817e0.C0818a a2 = a.mo10684a("Timeout set to: " + this.f905a.mo11155b() + " ms. ");
                    a2.mo10684a("Interval set to: " + b.mo10837h() + " ms. ").mo10684a("Heartbeat last reply: ").mo10683a((Object) C1034z.this.f903d).mo10685a(C0817e0.f434i);
                    C1034z.this.m1162a();
                } else if (b.mo10806F()) {
                    C1034z.this.m1162a();
                } else {
                    C1038z0.m1187a(C1034z.this.f901b, b.mo10837h());
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.z$c */
    private static class C1037c {

        /* renamed from: a */
        private final C0823f1 f907a;

        /* synthetic */ C1037c(C0823f1 f1Var, C1035a aVar) {
            this(f1Var);
        }

        public String toString() {
            return this.f907a.toString();
        }

        private C1037c(C0823f1 f1Var) {
            C0823f1 m = f1Var != null ? f1Var.mo10744m("payload") : C0764c0.m322b();
            this.f907a = m;
            C0764c0.m319a(m, "heartbeatLastTimestamp", C0821f0.f440e.format(new Date()));
        }
    }

    C1034z() {
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m1165c() {
        if (C0714a.m139d()) {
            C1038z0.C1041c cVar = new C1038z0.C1041c(C0714a.m136b().mo10838i());
            C1036b bVar = new C1036b(cVar);
            this.f902c = bVar;
            C1038z0.m1187a((Runnable) bVar, cVar.mo11157d());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo11148b() {
        m1162a();
        this.f900a = false;
        C1038z0.m1187a(this.f901b, C0714a.m136b().mo10837h());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1162a() {
        this.f900a = true;
        C1038z0.m1206c(this.f901b);
        C1038z0.m1206c(this.f902c);
        this.f902c = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11147a(C0841h0 h0Var) {
        if (C0714a.m139d() && !this.f900a) {
            this.f903d = new C1037c(h0Var.mo10772a(), (C1035a) null);
            Runnable runnable = this.f902c;
            if (runnable != null) {
                C1038z0.m1206c(runnable);
                C1038z0.m1202b(this.f902c);
                return;
            }
            C1038z0.m1206c(this.f901b);
            C1038z0.m1187a(this.f901b, C0714a.m136b().mo10837h());
        }
    }
}
