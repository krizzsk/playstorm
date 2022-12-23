package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.jg */
final class C11808jg implements C11802jc {

    /* renamed from: a */
    public final C11801jb f28826a = new C11801jb();

    /* renamed from: b */
    public final C11813jl f28827b;

    /* renamed from: c */
    boolean f28828c;

    C11808jg(C11813jl jlVar) {
        if (jlVar != null) {
            this.f28827b = jlVar;
            return;
        }
        throw new IllegalArgumentException("sink == null");
    }

    /* renamed from: a */
    public final void mo72750a(C11801jb jbVar, long j) {
        if (!this.f28828c) {
            this.f28826a.mo72750a(jbVar, j);
            m34310b();
            return;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: b */
    public final C11802jc mo72753b(C11804je jeVar) {
        if (!this.f28828c) {
            this.f28826a.mo72753b(jeVar);
            return m34310b();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: b */
    public final C11802jc mo72754b(String str) {
        if (!this.f28828c) {
            this.f28826a.mo72754b(str);
            return m34310b();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: e */
    public final C11802jc mo72767e(int i) {
        if (!this.f28828c) {
            this.f28826a.mo72767e(i);
            return m34310b();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: d */
    public final C11802jc mo72763d(int i) {
        if (!this.f28828c) {
            this.f28826a.mo72763d(i);
            return m34310b();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: f */
    public final C11802jc mo72770f(long j) {
        if (!this.f28828c) {
            this.f28826a.mo72770f(j);
            return m34310b();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: b */
    private C11802jc m34310b() {
        if (!this.f28828c) {
            long c = this.f28826a.mo72757c();
            if (c > 0) {
                this.f28827b.mo72750a(this.f28826a, c);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: a */
    public final C11802jc mo72748a() {
        if (!this.f28828c) {
            long j = this.f28826a.f28815b;
            if (j > 0) {
                this.f28827b.mo72750a(this.f28826a, j);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final void flush() {
        if (!this.f28828c) {
            if (this.f28826a.f28815b > 0) {
                C11813jl jlVar = this.f28827b;
                C11801jb jbVar = this.f28826a;
                jlVar.mo72750a(jbVar, jbVar.f28815b);
            }
            this.f28827b.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final void close() {
        if (!this.f28828c) {
            Throwable th = null;
            try {
                if (this.f28826a.f28815b > 0) {
                    this.f28827b.mo72750a(this.f28826a, this.f28826a.f28815b);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f28827b.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f28828c = true;
            if (th != null) {
                C11817jo.m34349a(th);
            }
        }
    }

    public final String toString() {
        return "buffer(" + this.f28827b + ")";
    }
}
