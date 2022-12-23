package com.bytedance.sdk.component.p090a;

/* renamed from: com.bytedance.sdk.component.a.d */
/* compiled from: BaseStatefulMethod */
public abstract class C2558d<P, R> extends C2556b<P, R> {

    /* renamed from: a */
    private boolean f5458a = true;

    /* renamed from: b */
    private C2559a f5459b;

    /* renamed from: c */
    private C2562f f5460c;

    /* renamed from: com.bytedance.sdk.component.a.d$a */
    /* compiled from: BaseStatefulMethod */
    interface C2559a {
        /* renamed from: a */
        void mo16561a(Object obj);

        /* renamed from: a */
        void mo16562a(Throwable th);
    }

    /* renamed from: com.bytedance.sdk.component.a.d$b */
    /* compiled from: BaseStatefulMethod */
    public interface C2560b {
        /* renamed from: a */
        C2558d mo16563a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo16554a(P p, C2562f fVar) throws Exception;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo16558d();

    /* renamed from: a */
    public /* bridge */ /* synthetic */ String mo16549a() {
        return super.mo16549a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16553a(R r) {
        if (m6488g()) {
            this.f5459b.mo16561a((Object) r);
            mo16559e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16556a(Throwable th) {
        if (m6488g()) {
            this.f5459b.mo16562a(th);
            mo16559e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo16557c() {
        mo16556a((Throwable) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo16559e() {
        this.f5458a = false;
        this.f5460c = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16555a(P p, C2562f fVar, C2559a aVar) throws Exception {
        this.f5460c = fVar;
        this.f5459b = aVar;
        mo16554a(p, fVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo16560f() {
        mo16558d();
        mo16559e();
    }

    /* renamed from: g */
    private boolean m6488g() {
        if (this.f5458a) {
            return true;
        }
        C2568i.m6522a((RuntimeException) new IllegalStateException("Jsb async call already finished: " + mo16549a() + ", hashcode: " + hashCode()));
        return false;
    }
}
