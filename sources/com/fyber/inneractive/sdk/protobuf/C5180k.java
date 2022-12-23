package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5177j0;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.protobuf.k */
public final class C5180k implements C5136e1 {

    /* renamed from: a */
    public final C5172j f13824a;

    /* renamed from: b */
    public int f13825b;

    /* renamed from: c */
    public int f13826c;

    /* renamed from: d */
    public int f13827d = 0;

    public C5180k(C5172j jVar) {
        C5172j jVar2 = (C5172j) C5252z.m16435a(jVar, "input");
        this.f13824a = jVar2;
        jVar2.f13798d = this;
    }

    /* renamed from: a */
    public <T> T mo25882a(Class<T> cls, C5205q qVar) throws IOException {
        mo26103b(3);
        return mo26104c(C5124b1.f13725c.mo25837a(cls), qVar);
    }

    /* renamed from: b */
    public final void mo26103b(int i) throws IOException {
        int i2 = this.f13825b;
        int i3 = C5227t1.f13895a;
        if ((i2 & 7) != i) {
            throw C5119a0.m15527d();
        }
    }

    /* renamed from: c */
    public final <T> T mo26104c(C5141f1<T> f1Var, C5205q qVar) throws IOException {
        int i = this.f13826c;
        int i2 = this.f13825b;
        int i3 = C5227t1.f13895a;
        this.f13826c = C5227t1.m16370a(i2 >>> 3, 4);
        try {
            T a = f1Var.mo25943a();
            f1Var.mo25944a(a, this, qVar);
            f1Var.mo25951c(a);
            if (this.f13825b == this.f13826c) {
                return a;
            }
            throw C5119a0.m15530g();
        } finally {
            this.f13826c = i;
        }
    }

    /* renamed from: d */
    public int mo25893d() throws IOException {
        mo26103b(0);
        return this.f13824a.mo26061k();
    }

    /* renamed from: e */
    public int mo25895e() {
        return this.f13825b;
    }

    /* renamed from: f */
    public long mo25897f() throws IOException {
        mo26103b(0);
        return this.f13824a.mo26072v();
    }

    /* renamed from: g */
    public long mo25899g() throws IOException {
        mo26103b(1);
        return this.f13824a.mo26059i();
    }

    /* renamed from: h */
    public double mo25901h() throws IOException {
        mo26103b(1);
        return this.f13824a.mo26056f();
    }

    /* renamed from: i */
    public boolean mo25904i() throws IOException {
        int i;
        if (this.f13824a.mo26051c() || (i = this.f13825b) == this.f13826c) {
            return false;
        }
        return this.f13824a.mo26055e(i);
    }

    /* renamed from: j */
    public int mo25905j() throws IOException {
        mo26103b(0);
        return this.f13824a.mo26066p();
    }

    /* renamed from: k */
    public float mo25907k() throws IOException {
        mo26103b(5);
        return this.f13824a.mo26060j();
    }

    /* renamed from: l */
    public long mo25909l() throws IOException {
        mo26103b(0);
        return this.f13824a.mo26067q();
    }

    /* renamed from: m */
    public int mo25911m() throws IOException {
        mo26103b(5);
        return this.f13824a.mo26064n();
    }

    /* renamed from: n */
    public String mo25913n() throws IOException {
        mo26103b(2);
        return this.f13824a.mo26068r();
    }

    /* renamed from: o */
    public long mo25915o() throws IOException {
        mo26103b(0);
        return this.f13824a.mo26062l();
    }

    /* renamed from: p */
    public String mo25917p() throws IOException {
        mo26103b(2);
        return this.f13824a.mo26069s();
    }

    /* renamed from: q */
    public int mo25919q() throws IOException {
        mo26103b(5);
        return this.f13824a.mo26058h();
    }

    /* renamed from: r */
    public boolean mo25921r() throws IOException {
        mo26103b(0);
        return this.f13824a.mo26053d();
    }

    /* renamed from: s */
    public int mo25922s() throws IOException {
        int i = this.f13827d;
        if (i != 0) {
            this.f13825b = i;
            this.f13827d = 0;
        } else {
            this.f13825b = this.f13824a.mo26070t();
        }
        int i2 = this.f13825b;
        if (i2 == 0 || i2 == this.f13826c) {
            return Integer.MAX_VALUE;
        }
        int i3 = C5227t1.f13895a;
        return i2 >>> 3;
    }

    /* renamed from: t */
    public long mo25923t() throws IOException {
        mo26103b(1);
        return this.f13824a.mo26065o();
    }

    /* renamed from: e */
    public void mo25896e(List<Integer> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C5250y) {
            C5250y yVar = (C5250y) list;
            int i = this.f13825b;
            int i2 = C5227t1.f13895a;
            int i3 = i & 7;
            if (i3 == 2) {
                int u = this.f13824a.mo26071u();
                mo26105c(u);
                int b = this.f13824a.mo26049b() + u;
                do {
                    yVar.mo26305c(this.f13824a.mo26058h());
                } while (this.f13824a.mo26049b() < b);
            } else if (i3 == 5) {
                do {
                    yVar.mo26305c(this.f13824a.mo26058h());
                    if (!this.f13824a.mo26051c()) {
                        t2 = this.f13824a.mo26070t();
                    } else {
                        return;
                    }
                } while (t2 == this.f13825b);
                this.f13827d = t2;
            } else {
                throw C5119a0.m15527d();
            }
        } else {
            int i4 = this.f13825b;
            int i5 = C5227t1.f13895a;
            int i6 = i4 & 7;
            if (i6 == 2) {
                int u2 = this.f13824a.mo26071u();
                mo26105c(u2);
                int b2 = this.f13824a.mo26049b() + u2;
                do {
                    list.add(Integer.valueOf(this.f13824a.mo26058h()));
                } while (this.f13824a.mo26049b() < b2);
            } else if (i6 == 5) {
                do {
                    list.add(Integer.valueOf(this.f13824a.mo26058h()));
                    if (!this.f13824a.mo26051c()) {
                        t = this.f13824a.mo26070t();
                    } else {
                        return;
                    }
                } while (t == this.f13825b);
                this.f13827d = t;
            } else {
                throw C5119a0.m15527d();
            }
        }
    }

    /* renamed from: b */
    public <T> T mo25888b(Class<T> cls, C5205q qVar) throws IOException {
        mo26103b(2);
        return mo26106d(C5124b1.f13725c.mo25837a(cls), qVar);
    }

    /* renamed from: d */
    public final <T> T mo26106d(C5141f1<T> f1Var, C5205q qVar) throws IOException {
        int u = this.f13824a.mo26071u();
        C5172j jVar = this.f13824a;
        if (jVar.f13795a < jVar.f13796b) {
            int d = jVar.mo26052d(u);
            T a = f1Var.mo25943a();
            this.f13824a.f13795a++;
            f1Var.mo25944a(a, this, qVar);
            f1Var.mo25951c(a);
            this.f13824a.mo26046a(0);
            C5172j jVar2 = this.f13824a;
            jVar2.f13795a--;
            jVar2.mo26050c(d);
            return a;
        }
        throw C5119a0.m15531h();
    }

    /* renamed from: f */
    public void mo25898f(List<Integer> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C5250y) {
            C5250y yVar = (C5250y) list;
            int i = this.f13825b;
            int i2 = C5227t1.f13895a;
            int i3 = i & 7;
            if (i3 == 2) {
                int u = this.f13824a.mo26071u();
                mo26105c(u);
                int b = this.f13824a.mo26049b() + u;
                do {
                    yVar.mo26305c(this.f13824a.mo26064n());
                } while (this.f13824a.mo26049b() < b);
            } else if (i3 == 5) {
                do {
                    yVar.mo26305c(this.f13824a.mo26064n());
                    if (!this.f13824a.mo26051c()) {
                        t2 = this.f13824a.mo26070t();
                    } else {
                        return;
                    }
                } while (t2 == this.f13825b);
                this.f13827d = t2;
            } else {
                throw C5119a0.m15527d();
            }
        } else {
            int i4 = this.f13825b;
            int i5 = C5227t1.f13895a;
            int i6 = i4 & 7;
            if (i6 == 2) {
                int u2 = this.f13824a.mo26071u();
                mo26105c(u2);
                int b2 = this.f13824a.mo26049b() + u2;
                do {
                    list.add(Integer.valueOf(this.f13824a.mo26064n()));
                } while (this.f13824a.mo26049b() < b2);
            } else if (i6 == 5) {
                do {
                    list.add(Integer.valueOf(this.f13824a.mo26064n()));
                    if (!this.f13824a.mo26051c()) {
                        t = this.f13824a.mo26070t();
                    } else {
                        return;
                    }
                } while (t == this.f13825b);
                this.f13827d = t;
            } else {
                throw C5119a0.m15527d();
            }
        }
    }

    /* renamed from: g */
    public void mo25900g(List<Long> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C5149h0) {
            C5149h0 h0Var = (C5149h0) list;
            int i = this.f13825b;
            int i2 = C5227t1.f13895a;
            int i3 = i & 7;
            if (i3 == 0) {
                do {
                    h0Var.mo25968a(this.f13824a.mo26067q());
                    if (!this.f13824a.mo26051c()) {
                        t2 = this.f13824a.mo26070t();
                    } else {
                        return;
                    }
                } while (t2 == this.f13825b);
                this.f13827d = t2;
            } else if (i3 == 2) {
                int b = this.f13824a.mo26049b() + this.f13824a.mo26071u();
                do {
                    h0Var.mo25968a(this.f13824a.mo26067q());
                } while (this.f13824a.mo26049b() < b);
                mo26101a(b);
            } else {
                throw C5119a0.m15527d();
            }
        } else {
            int i4 = this.f13825b;
            int i5 = C5227t1.f13895a;
            int i6 = i4 & 7;
            if (i6 == 0) {
                do {
                    list.add(Long.valueOf(this.f13824a.mo26067q()));
                    if (!this.f13824a.mo26051c()) {
                        t = this.f13824a.mo26070t();
                    } else {
                        return;
                    }
                } while (t == this.f13825b);
                this.f13827d = t;
            } else if (i6 == 2) {
                int b2 = this.f13824a.mo26049b() + this.f13824a.mo26071u();
                do {
                    list.add(Long.valueOf(this.f13824a.mo26067q()));
                } while (this.f13824a.mo26049b() < b2);
                mo26101a(b2);
            } else {
                throw C5119a0.m15527d();
            }
        }
    }

    /* renamed from: h */
    public void mo25902h(List<C5151i> list) throws IOException {
        int t;
        int i = this.f13825b;
        int i2 = C5227t1.f13895a;
        if ((i & 7) == 2) {
            do {
                list.add(mo25880a());
                if (!this.f13824a.mo26051c()) {
                    t = this.f13824a.mo26070t();
                } else {
                    return;
                }
            } while (t == this.f13825b);
            this.f13827d = t;
            return;
        }
        throw C5119a0.m15527d();
    }

    /* renamed from: j */
    public void mo25906j(List<Double> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C5194n) {
            C5194n nVar = (C5194n) list;
            int i = this.f13825b;
            int i2 = C5227t1.f13895a;
            int i3 = i & 7;
            if (i3 == 1) {
                do {
                    nVar.mo26183a(this.f13824a.mo26056f());
                    if (!this.f13824a.mo26051c()) {
                        t2 = this.f13824a.mo26070t();
                    } else {
                        return;
                    }
                } while (t2 == this.f13825b);
                this.f13827d = t2;
            } else if (i3 == 2) {
                int u = this.f13824a.mo26071u();
                mo26107d(u);
                int b = this.f13824a.mo26049b() + u;
                do {
                    nVar.mo26183a(this.f13824a.mo26056f());
                } while (this.f13824a.mo26049b() < b);
            } else {
                throw C5119a0.m15527d();
            }
        } else {
            int i4 = this.f13825b;
            int i5 = C5227t1.f13895a;
            int i6 = i4 & 7;
            if (i6 == 1) {
                do {
                    list.add(Double.valueOf(this.f13824a.mo26056f()));
                    if (!this.f13824a.mo26051c()) {
                        t = this.f13824a.mo26070t();
                    } else {
                        return;
                    }
                } while (t == this.f13825b);
                this.f13827d = t;
            } else if (i6 == 2) {
                int u2 = this.f13824a.mo26071u();
                mo26107d(u2);
                int b2 = this.f13824a.mo26049b() + u2;
                do {
                    list.add(Double.valueOf(this.f13824a.mo26056f()));
                } while (this.f13824a.mo26049b() < b2);
            } else {
                throw C5119a0.m15527d();
            }
        }
    }

    /* renamed from: k */
    public void mo25908k(List<Long> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C5149h0) {
            C5149h0 h0Var = (C5149h0) list;
            int i = this.f13825b;
            int i2 = C5227t1.f13895a;
            int i3 = i & 7;
            if (i3 == 0) {
                do {
                    h0Var.mo25968a(this.f13824a.mo26062l());
                    if (!this.f13824a.mo26051c()) {
                        t2 = this.f13824a.mo26070t();
                    } else {
                        return;
                    }
                } while (t2 == this.f13825b);
                this.f13827d = t2;
            } else if (i3 == 2) {
                int b = this.f13824a.mo26049b() + this.f13824a.mo26071u();
                do {
                    h0Var.mo25968a(this.f13824a.mo26062l());
                } while (this.f13824a.mo26049b() < b);
                mo26101a(b);
            } else {
                throw C5119a0.m15527d();
            }
        } else {
            int i4 = this.f13825b;
            int i5 = C5227t1.f13895a;
            int i6 = i4 & 7;
            if (i6 == 0) {
                do {
                    list.add(Long.valueOf(this.f13824a.mo26062l()));
                    if (!this.f13824a.mo26051c()) {
                        t = this.f13824a.mo26070t();
                    } else {
                        return;
                    }
                } while (t == this.f13825b);
                this.f13827d = t;
            } else if (i6 == 2) {
                int b2 = this.f13824a.mo26049b() + this.f13824a.mo26071u();
                do {
                    list.add(Long.valueOf(this.f13824a.mo26062l()));
                } while (this.f13824a.mo26049b() < b2);
                mo26101a(b2);
            } else {
                throw C5119a0.m15527d();
            }
        }
    }

    /* renamed from: l */
    public void mo25910l(List<Boolean> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C5142g) {
            C5142g gVar = (C5142g) list;
            int i = this.f13825b;
            int i2 = C5227t1.f13895a;
            int i3 = i & 7;
            if (i3 == 0) {
                do {
                    gVar.mo25953a(this.f13824a.mo26053d());
                    if (!this.f13824a.mo26051c()) {
                        t2 = this.f13824a.mo26070t();
                    } else {
                        return;
                    }
                } while (t2 == this.f13825b);
                this.f13827d = t2;
            } else if (i3 == 2) {
                int b = this.f13824a.mo26049b() + this.f13824a.mo26071u();
                do {
                    gVar.mo25953a(this.f13824a.mo26053d());
                } while (this.f13824a.mo26049b() < b);
                mo26101a(b);
            } else {
                throw C5119a0.m15527d();
            }
        } else {
            int i4 = this.f13825b;
            int i5 = C5227t1.f13895a;
            int i6 = i4 & 7;
            if (i6 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f13824a.mo26053d()));
                    if (!this.f13824a.mo26051c()) {
                        t = this.f13824a.mo26070t();
                    } else {
                        return;
                    }
                } while (t == this.f13825b);
                this.f13827d = t;
            } else if (i6 == 2) {
                int b2 = this.f13824a.mo26049b() + this.f13824a.mo26071u();
                do {
                    list.add(Boolean.valueOf(this.f13824a.mo26053d()));
                } while (this.f13824a.mo26049b() < b2);
                mo26101a(b2);
            } else {
                throw C5119a0.m15527d();
            }
        }
    }

    /* renamed from: m */
    public void mo25912m(List<Long> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C5149h0) {
            C5149h0 h0Var = (C5149h0) list;
            int i = this.f13825b;
            int i2 = C5227t1.f13895a;
            int i3 = i & 7;
            if (i3 == 1) {
                do {
                    h0Var.mo25968a(this.f13824a.mo26065o());
                    if (!this.f13824a.mo26051c()) {
                        t2 = this.f13824a.mo26070t();
                    } else {
                        return;
                    }
                } while (t2 == this.f13825b);
                this.f13827d = t2;
            } else if (i3 == 2) {
                int u = this.f13824a.mo26071u();
                mo26107d(u);
                int b = this.f13824a.mo26049b() + u;
                do {
                    h0Var.mo25968a(this.f13824a.mo26065o());
                } while (this.f13824a.mo26049b() < b);
            } else {
                throw C5119a0.m15527d();
            }
        } else {
            int i4 = this.f13825b;
            int i5 = C5227t1.f13895a;
            int i6 = i4 & 7;
            if (i6 == 1) {
                do {
                    list.add(Long.valueOf(this.f13824a.mo26065o()));
                    if (!this.f13824a.mo26051c()) {
                        t = this.f13824a.mo26070t();
                    } else {
                        return;
                    }
                } while (t == this.f13825b);
                this.f13827d = t;
            } else if (i6 == 2) {
                int u2 = this.f13824a.mo26071u();
                mo26107d(u2);
                int b2 = this.f13824a.mo26049b() + u2;
                do {
                    list.add(Long.valueOf(this.f13824a.mo26065o()));
                } while (this.f13824a.mo26049b() < b2);
            } else {
                throw C5119a0.m15527d();
            }
        }
    }

    /* renamed from: n */
    public void mo25914n(List<Long> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C5149h0) {
            C5149h0 h0Var = (C5149h0) list;
            int i = this.f13825b;
            int i2 = C5227t1.f13895a;
            int i3 = i & 7;
            if (i3 == 1) {
                do {
                    h0Var.mo25968a(this.f13824a.mo26059i());
                    if (!this.f13824a.mo26051c()) {
                        t2 = this.f13824a.mo26070t();
                    } else {
                        return;
                    }
                } while (t2 == this.f13825b);
                this.f13827d = t2;
            } else if (i3 == 2) {
                int u = this.f13824a.mo26071u();
                mo26107d(u);
                int b = this.f13824a.mo26049b() + u;
                do {
                    h0Var.mo25968a(this.f13824a.mo26059i());
                } while (this.f13824a.mo26049b() < b);
            } else {
                throw C5119a0.m15527d();
            }
        } else {
            int i4 = this.f13825b;
            int i5 = C5227t1.f13895a;
            int i6 = i4 & 7;
            if (i6 == 1) {
                do {
                    list.add(Long.valueOf(this.f13824a.mo26059i()));
                    if (!this.f13824a.mo26051c()) {
                        t = this.f13824a.mo26070t();
                    } else {
                        return;
                    }
                } while (t == this.f13825b);
                this.f13827d = t;
            } else if (i6 == 2) {
                int u2 = this.f13824a.mo26071u();
                mo26107d(u2);
                int b2 = this.f13824a.mo26049b() + u2;
                do {
                    list.add(Long.valueOf(this.f13824a.mo26059i()));
                } while (this.f13824a.mo26049b() < b2);
            } else {
                throw C5119a0.m15527d();
            }
        }
    }

    /* renamed from: o */
    public void mo25916o(List<Integer> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C5250y) {
            C5250y yVar = (C5250y) list;
            int i = this.f13825b;
            int i2 = C5227t1.f13895a;
            int i3 = i & 7;
            if (i3 == 0) {
                do {
                    yVar.mo26305c(this.f13824a.mo26061k());
                    if (!this.f13824a.mo26051c()) {
                        t2 = this.f13824a.mo26070t();
                    } else {
                        return;
                    }
                } while (t2 == this.f13825b);
                this.f13827d = t2;
            } else if (i3 == 2) {
                int b = this.f13824a.mo26049b() + this.f13824a.mo26071u();
                do {
                    yVar.mo26305c(this.f13824a.mo26061k());
                } while (this.f13824a.mo26049b() < b);
                mo26101a(b);
            } else {
                throw C5119a0.m15527d();
            }
        } else {
            int i4 = this.f13825b;
            int i5 = C5227t1.f13895a;
            int i6 = i4 & 7;
            if (i6 == 0) {
                do {
                    list.add(Integer.valueOf(this.f13824a.mo26061k()));
                    if (!this.f13824a.mo26051c()) {
                        t = this.f13824a.mo26070t();
                    } else {
                        return;
                    }
                } while (t == this.f13825b);
                this.f13827d = t;
            } else if (i6 == 2) {
                int b2 = this.f13824a.mo26049b() + this.f13824a.mo26071u();
                do {
                    list.add(Integer.valueOf(this.f13824a.mo26061k()));
                } while (this.f13824a.mo26049b() < b2);
                mo26101a(b2);
            } else {
                throw C5119a0.m15527d();
            }
        }
    }

    /* renamed from: p */
    public void mo25918p(List<Integer> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C5250y) {
            C5250y yVar = (C5250y) list;
            int i = this.f13825b;
            int i2 = C5227t1.f13895a;
            int i3 = i & 7;
            if (i3 == 0) {
                do {
                    yVar.mo26305c(this.f13824a.mo26057g());
                    if (!this.f13824a.mo26051c()) {
                        t2 = this.f13824a.mo26070t();
                    } else {
                        return;
                    }
                } while (t2 == this.f13825b);
                this.f13827d = t2;
            } else if (i3 == 2) {
                int b = this.f13824a.mo26049b() + this.f13824a.mo26071u();
                do {
                    yVar.mo26305c(this.f13824a.mo26057g());
                } while (this.f13824a.mo26049b() < b);
                mo26101a(b);
            } else {
                throw C5119a0.m15527d();
            }
        } else {
            int i4 = this.f13825b;
            int i5 = C5227t1.f13895a;
            int i6 = i4 & 7;
            if (i6 == 0) {
                do {
                    list.add(Integer.valueOf(this.f13824a.mo26057g()));
                    if (!this.f13824a.mo26051c()) {
                        t = this.f13824a.mo26070t();
                    } else {
                        return;
                    }
                } while (t == this.f13825b);
                this.f13827d = t;
            } else if (i6 == 2) {
                int b2 = this.f13824a.mo26049b() + this.f13824a.mo26071u();
                do {
                    list.add(Integer.valueOf(this.f13824a.mo26057g()));
                } while (this.f13824a.mo26049b() < b2);
                mo26101a(b2);
            } else {
                throw C5119a0.m15527d();
            }
        }
    }

    /* renamed from: q */
    public void mo25920q(List<String> list) throws IOException {
        mo26102a(list, false);
    }

    /* renamed from: a */
    public <T> T mo25881a(C5141f1<T> f1Var, C5205q qVar) throws IOException {
        mo26103b(3);
        return mo26104c(f1Var, qVar);
    }

    /* renamed from: i */
    public void mo25903i(List<Integer> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C5250y) {
            C5250y yVar = (C5250y) list;
            int i = this.f13825b;
            int i2 = C5227t1.f13895a;
            int i3 = i & 7;
            if (i3 == 0) {
                do {
                    yVar.mo26305c(this.f13824a.mo26071u());
                    if (!this.f13824a.mo26051c()) {
                        t2 = this.f13824a.mo26070t();
                    } else {
                        return;
                    }
                } while (t2 == this.f13825b);
                this.f13827d = t2;
            } else if (i3 == 2) {
                int b = this.f13824a.mo26049b() + this.f13824a.mo26071u();
                do {
                    yVar.mo26305c(this.f13824a.mo26071u());
                } while (this.f13824a.mo26049b() < b);
                mo26101a(b);
            } else {
                throw C5119a0.m15527d();
            }
        } else {
            int i4 = this.f13825b;
            int i5 = C5227t1.f13895a;
            int i6 = i4 & 7;
            if (i6 == 0) {
                do {
                    list.add(Integer.valueOf(this.f13824a.mo26071u()));
                    if (!this.f13824a.mo26051c()) {
                        t = this.f13824a.mo26070t();
                    } else {
                        return;
                    }
                } while (t == this.f13825b);
                this.f13827d = t;
            } else if (i6 == 2) {
                int b2 = this.f13824a.mo26049b() + this.f13824a.mo26071u();
                do {
                    list.add(Integer.valueOf(this.f13824a.mo26071u()));
                } while (this.f13824a.mo26049b() < b2);
                mo26101a(b2);
            } else {
                throw C5119a0.m15527d();
            }
        }
    }

    /* renamed from: a */
    public C5151i mo25880a() throws IOException {
        mo26103b(2);
        return this.f13824a.mo26054e();
    }

    /* renamed from: b */
    public <T> T mo25887b(C5141f1<T> f1Var, C5205q qVar) throws IOException {
        mo26103b(2);
        return mo26106d(f1Var, qVar);
    }

    /* renamed from: a */
    public void mo25883a(List<Long> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C5149h0) {
            C5149h0 h0Var = (C5149h0) list;
            int i = this.f13825b;
            int i2 = C5227t1.f13895a;
            int i3 = i & 7;
            if (i3 == 0) {
                do {
                    h0Var.mo25968a(this.f13824a.mo26072v());
                    if (!this.f13824a.mo26051c()) {
                        t2 = this.f13824a.mo26070t();
                    } else {
                        return;
                    }
                } while (t2 == this.f13825b);
                this.f13827d = t2;
            } else if (i3 == 2) {
                int b = this.f13824a.mo26049b() + this.f13824a.mo26071u();
                do {
                    h0Var.mo25968a(this.f13824a.mo26072v());
                } while (this.f13824a.mo26049b() < b);
                mo26101a(b);
            } else {
                throw C5119a0.m15527d();
            }
        } else {
            int i4 = this.f13825b;
            int i5 = C5227t1.f13895a;
            int i6 = i4 & 7;
            if (i6 == 0) {
                do {
                    list.add(Long.valueOf(this.f13824a.mo26072v()));
                    if (!this.f13824a.mo26051c()) {
                        t = this.f13824a.mo26070t();
                    } else {
                        return;
                    }
                } while (t == this.f13825b);
                this.f13827d = t;
            } else if (i6 == 2) {
                int b2 = this.f13824a.mo26049b() + this.f13824a.mo26071u();
                do {
                    list.add(Long.valueOf(this.f13824a.mo26072v()));
                } while (this.f13824a.mo26049b() < b2);
                mo26101a(b2);
            } else {
                throw C5119a0.m15527d();
            }
        }
    }

    /* renamed from: b */
    public int mo25886b() throws IOException {
        mo26103b(0);
        return this.f13824a.mo26057g();
    }

    /* renamed from: b */
    public void mo25889b(List<String> list) throws IOException {
        mo26102a(list, true);
    }

    /* renamed from: b */
    public <T> void mo25890b(List<T> list, C5141f1<T> f1Var, C5205q qVar) throws IOException {
        int t;
        int i = this.f13825b;
        int i2 = C5227t1.f13895a;
        if ((i & 7) == 2) {
            do {
                list.add(mo26106d(f1Var, qVar));
                if (!this.f13824a.mo26051c() && this.f13827d == 0) {
                    t = this.f13824a.mo26070t();
                } else {
                    return;
                }
            } while (t == i);
            this.f13827d = t;
            return;
        }
        throw C5119a0.m15527d();
    }

    /* renamed from: d */
    public void mo25894d(List<Float> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C5246w) {
            C5246w wVar = (C5246w) list;
            int i = this.f13825b;
            int i2 = C5227t1.f13895a;
            int i3 = i & 7;
            if (i3 == 2) {
                int u = this.f13824a.mo26071u();
                mo26105c(u);
                int b = this.f13824a.mo26049b() + u;
                do {
                    wVar.mo26293a(this.f13824a.mo26060j());
                } while (this.f13824a.mo26049b() < b);
            } else if (i3 == 5) {
                do {
                    wVar.mo26293a(this.f13824a.mo26060j());
                    if (!this.f13824a.mo26051c()) {
                        t2 = this.f13824a.mo26070t();
                    } else {
                        return;
                    }
                } while (t2 == this.f13825b);
                this.f13827d = t2;
            } else {
                throw C5119a0.m15527d();
            }
        } else {
            int i4 = this.f13825b;
            int i5 = C5227t1.f13895a;
            int i6 = i4 & 7;
            if (i6 == 2) {
                int u2 = this.f13824a.mo26071u();
                mo26105c(u2);
                int b2 = this.f13824a.mo26049b() + u2;
                do {
                    list.add(Float.valueOf(this.f13824a.mo26060j()));
                } while (this.f13824a.mo26049b() < b2);
            } else if (i6 == 5) {
                do {
                    list.add(Float.valueOf(this.f13824a.mo26060j()));
                    if (!this.f13824a.mo26051c()) {
                        t = this.f13824a.mo26070t();
                    } else {
                        return;
                    }
                } while (t == this.f13825b);
                this.f13827d = t;
            } else {
                throw C5119a0.m15527d();
            }
        }
    }

    /* renamed from: c */
    public int mo25891c() throws IOException {
        mo26103b(0);
        return this.f13824a.mo26071u();
    }

    /* renamed from: c */
    public void mo25892c(List<Integer> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C5250y) {
            C5250y yVar = (C5250y) list;
            int i = this.f13825b;
            int i2 = C5227t1.f13895a;
            int i3 = i & 7;
            if (i3 == 0) {
                do {
                    yVar.mo26305c(this.f13824a.mo26066p());
                    if (!this.f13824a.mo26051c()) {
                        t2 = this.f13824a.mo26070t();
                    } else {
                        return;
                    }
                } while (t2 == this.f13825b);
                this.f13827d = t2;
            } else if (i3 == 2) {
                int b = this.f13824a.mo26049b() + this.f13824a.mo26071u();
                do {
                    yVar.mo26305c(this.f13824a.mo26066p());
                } while (this.f13824a.mo26049b() < b);
                mo26101a(b);
            } else {
                throw C5119a0.m15527d();
            }
        } else {
            int i4 = this.f13825b;
            int i5 = C5227t1.f13895a;
            int i6 = i4 & 7;
            if (i6 == 0) {
                do {
                    list.add(Integer.valueOf(this.f13824a.mo26066p()));
                    if (!this.f13824a.mo26051c()) {
                        t = this.f13824a.mo26070t();
                    } else {
                        return;
                    }
                } while (t == this.f13825b);
                this.f13827d = t;
            } else if (i6 == 2) {
                int b2 = this.f13824a.mo26049b() + this.f13824a.mo26071u();
                do {
                    list.add(Integer.valueOf(this.f13824a.mo26066p()));
                } while (this.f13824a.mo26049b() < b2);
                mo26101a(b2);
            } else {
                throw C5119a0.m15527d();
            }
        }
    }

    /* renamed from: a */
    public void mo26102a(List<String> list, boolean z) throws IOException {
        int t;
        int t2;
        int i = this.f13825b;
        int i2 = C5227t1.f13895a;
        if ((i & 7) != 2) {
            throw C5119a0.m15527d();
        } else if (!(list instanceof C5140f0) || z) {
            do {
                list.add(z ? mo25917p() : mo25913n());
                if (!this.f13824a.mo26051c()) {
                    t = this.f13824a.mo26070t();
                } else {
                    return;
                }
            } while (t == this.f13825b);
            this.f13827d = t;
        } else {
            C5140f0 f0Var = (C5140f0) list;
            do {
                f0Var.mo25874a(mo25880a());
                if (!this.f13824a.mo26051c()) {
                    t2 = this.f13824a.mo26070t();
                } else {
                    return;
                }
            } while (t2 == this.f13825b);
            this.f13827d = t2;
        }
    }

    /* renamed from: c */
    public final void mo26105c(int i) throws IOException {
        if ((i & 3) != 0) {
            throw C5119a0.m15530g();
        }
    }

    /* renamed from: d */
    public final void mo26107d(int i) throws IOException {
        if ((i & 7) != 0) {
            throw C5119a0.m15530g();
        }
    }

    /* renamed from: a */
    public <T> void mo25884a(List<T> list, C5141f1<T> f1Var, C5205q qVar) throws IOException {
        int t;
        int i = this.f13825b;
        int i2 = C5227t1.f13895a;
        if ((i & 7) == 3) {
            do {
                list.add(mo26104c(f1Var, qVar));
                if (!this.f13824a.mo26051c() && this.f13827d == 0) {
                    t = this.f13824a.mo26070t();
                } else {
                    return;
                }
            } while (t == i);
            this.f13827d = t;
            return;
        }
        throw C5119a0.m15527d();
    }

    /* renamed from: a */
    public <K, V> void mo25885a(Map<K, V> map, C5177j0.C5178a<K, V> aVar, C5205q qVar) throws IOException {
        mo26103b(2);
        this.f13824a.mo26052d(this.f13824a.mo26071u());
        throw null;
    }

    /* renamed from: a */
    public final void mo26101a(int i) throws IOException {
        if (this.f13824a.mo26049b() != i) {
            throw C5119a0.m15532i();
        }
    }
}
