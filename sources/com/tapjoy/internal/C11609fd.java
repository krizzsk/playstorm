package com.tapjoy.internal;

import com.tapjoy.internal.C11553ej;

/* renamed from: com.tapjoy.internal.fd */
public final class C11609fd extends C11553ej<C11609fd, C11610a> {

    /* renamed from: c */
    public static final C11556el<C11609fd> f28156c = new C11611b();

    /* renamed from: d */
    public final C11606fc f28157d;

    /* renamed from: e */
    public final C11588ew f28158e;

    /* renamed from: f */
    public final C11627fj f28159f;

    public C11609fd(C11606fc fcVar, C11588ew ewVar, C11627fj fjVar) {
        this(fcVar, ewVar, fjVar, C11804je.f28817b);
    }

    public C11609fd(C11606fc fcVar, C11588ew ewVar, C11627fj fjVar, C11804je jeVar) {
        super(f28156c, jeVar);
        this.f28157d = fcVar;
        this.f28158e = ewVar;
        this.f28159f = fjVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11609fd)) {
            return false;
        }
        C11609fd fdVar = (C11609fd) obj;
        return mo72347a().equals(fdVar.mo72347a()) && C11576eq.m33584a((Object) this.f28157d, (Object) fdVar.f28157d) && C11576eq.m33584a((Object) this.f28158e, (Object) fdVar.f28158e) && C11576eq.m33584a((Object) this.f28159f, (Object) fdVar.f28159f);
    }

    public final int hashCode() {
        int i = this.f27949b;
        if (i != 0) {
            return i;
        }
        int hashCode = mo72347a().hashCode() * 37;
        C11606fc fcVar = this.f28157d;
        int i2 = 0;
        int hashCode2 = (hashCode + (fcVar != null ? fcVar.hashCode() : 0)) * 37;
        C11588ew ewVar = this.f28158e;
        int hashCode3 = (hashCode2 + (ewVar != null ? ewVar.hashCode() : 0)) * 37;
        C11627fj fjVar = this.f28159f;
        if (fjVar != null) {
            i2 = fjVar.hashCode();
        }
        int i3 = hashCode3 + i2;
        this.f27949b = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f28157d != null) {
            sb.append(", info=");
            sb.append(this.f28157d);
        }
        if (this.f28158e != null) {
            sb.append(", app=");
            sb.append(this.f28158e);
        }
        if (this.f28159f != null) {
            sb.append(", user=");
            sb.append(this.f28159f);
        }
        StringBuilder replace = sb.replace(0, 2, "InfoSet{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.tapjoy.internal.fd$a */
    public static final class C11610a extends C11553ej.C11554a<C11609fd, C11610a> {

        /* renamed from: c */
        public C11606fc f28160c;

        /* renamed from: d */
        public C11588ew f28161d;

        /* renamed from: e */
        public C11627fj f28162e;

        /* renamed from: b */
        public final C11609fd mo72473b() {
            return new C11609fd(this.f28160c, this.f28161d, this.f28162e, super.mo72351a());
        }
    }

    /* renamed from: com.tapjoy.internal.fd$b */
    static final class C11611b extends C11556el<C11609fd> {
        /* renamed from: a */
        public final /* synthetic */ int mo72342a(Object obj) {
            C11609fd fdVar = (C11609fd) obj;
            int i = 0;
            int a = (fdVar.f28157d != null ? C11606fc.f28116c.mo72352a(1, fdVar.f28157d) : 0) + (fdVar.f28158e != null ? C11588ew.f28016c.mo72352a(2, fdVar.f28158e) : 0);
            if (fdVar.f28159f != null) {
                i = C11627fj.f28218c.mo72352a(3, fdVar.f28159f);
            }
            return a + i + fdVar.mo72347a().mo72783c();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo72345a(C11573en enVar, Object obj) {
            C11609fd fdVar = (C11609fd) obj;
            if (fdVar.f28157d != null) {
                C11606fc.f28116c.mo72356a(enVar, 1, fdVar.f28157d);
            }
            if (fdVar.f28158e != null) {
                C11588ew.f28016c.mo72356a(enVar, 2, fdVar.f28158e);
            }
            if (fdVar.f28159f != null) {
                C11627fj.f28218c.mo72356a(enVar, 3, fdVar.f28159f);
            }
            enVar.mo72367a(fdVar.mo72347a());
        }

        C11611b() {
            super(C11551ei.LENGTH_DELIMITED, C11609fd.class);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo72344a(C11572em emVar) {
            C11610a aVar = new C11610a();
            long a = emVar.mo72359a();
            while (true) {
                int b = emVar.mo72361b();
                if (b == -1) {
                    emVar.mo72360a(a);
                    return aVar.mo72473b();
                } else if (b == 1) {
                    aVar.f28160c = C11606fc.f28116c.mo72344a(emVar);
                } else if (b == 2) {
                    aVar.f28161d = C11588ew.f28016c.mo72344a(emVar);
                } else if (b != 3) {
                    C11551ei eiVar = emVar.f27975b;
                    aVar.mo72349a(b, eiVar, eiVar.mo72346a().mo72344a(emVar));
                } else {
                    aVar.f28162e = C11627fj.f28218c.mo72344a(emVar);
                }
            }
        }
    }
}
