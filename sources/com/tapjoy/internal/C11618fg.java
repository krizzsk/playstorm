package com.tapjoy.internal;

import com.tapjoy.internal.C11553ej;

/* renamed from: com.tapjoy.internal.fg */
public final class C11618fg extends C11553ej<C11618fg, C11619a> {

    /* renamed from: c */
    public static final C11556el<C11618fg> f28203c = new C11620b();

    /* renamed from: d */
    public static final Long f28204d = 0L;

    /* renamed from: e */
    public static final Long f28205e = 0L;

    /* renamed from: f */
    public final String f28206f;

    /* renamed from: g */
    public final Long f28207g;

    /* renamed from: h */
    public final Long f28208h;

    public C11618fg(String str, Long l) {
        this(str, l, (Long) null, C11804je.f28817b);
    }

    public C11618fg(String str, Long l, Long l2, C11804je jeVar) {
        super(f28203c, jeVar);
        this.f28206f = str;
        this.f28207g = l;
        this.f28208h = l2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11618fg)) {
            return false;
        }
        C11618fg fgVar = (C11618fg) obj;
        return mo72347a().equals(fgVar.mo72347a()) && this.f28206f.equals(fgVar.f28206f) && this.f28207g.equals(fgVar.f28207g) && C11576eq.m33584a((Object) this.f28208h, (Object) fgVar.f28208h);
    }

    public final int hashCode() {
        int i = this.f27949b;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((mo72347a().hashCode() * 37) + this.f28206f.hashCode()) * 37) + this.f28207g.hashCode()) * 37;
        Long l = this.f28208h;
        int hashCode2 = hashCode + (l != null ? l.hashCode() : 0);
        this.f27949b = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.f28206f);
        sb.append(", received=");
        sb.append(this.f28207g);
        if (this.f28208h != null) {
            sb.append(", clicked=");
            sb.append(this.f28208h);
        }
        StringBuilder replace = sb.replace(0, 2, "Push{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.tapjoy.internal.fg$a */
    public static final class C11619a extends C11553ej.C11554a<C11618fg, C11619a> {

        /* renamed from: c */
        public String f28209c;

        /* renamed from: d */
        public Long f28210d;

        /* renamed from: e */
        public Long f28211e;

        /* renamed from: b */
        public final C11618fg mo72482b() {
            if (this.f28209c != null && this.f28210d != null) {
                return new C11618fg(this.f28209c, this.f28210d, this.f28211e, super.mo72351a());
            }
            throw C11576eq.m33581a(this.f28209c, "id", this.f28210d, "received");
        }
    }

    /* renamed from: com.tapjoy.internal.fg$b */
    static final class C11620b extends C11556el<C11618fg> {
        /* renamed from: a */
        public final /* synthetic */ int mo72342a(Object obj) {
            C11618fg fgVar = (C11618fg) obj;
            return C11556el.f27967p.mo72352a(1, fgVar.f28206f) + C11556el.f27960i.mo72352a(2, fgVar.f28207g) + (fgVar.f28208h != null ? C11556el.f27960i.mo72352a(3, fgVar.f28208h) : 0) + fgVar.mo72347a().mo72783c();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo72345a(C11573en enVar, Object obj) {
            C11618fg fgVar = (C11618fg) obj;
            C11556el.f27967p.mo72356a(enVar, 1, fgVar.f28206f);
            C11556el.f27960i.mo72356a(enVar, 2, fgVar.f28207g);
            if (fgVar.f28208h != null) {
                C11556el.f27960i.mo72356a(enVar, 3, fgVar.f28208h);
            }
            enVar.mo72367a(fgVar.mo72347a());
        }

        C11620b() {
            super(C11551ei.LENGTH_DELIMITED, C11618fg.class);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo72344a(C11572em emVar) {
            C11619a aVar = new C11619a();
            long a = emVar.mo72359a();
            while (true) {
                int b = emVar.mo72361b();
                if (b == -1) {
                    emVar.mo72360a(a);
                    return aVar.mo72482b();
                } else if (b == 1) {
                    aVar.f28209c = C11556el.f27967p.mo72344a(emVar);
                } else if (b == 2) {
                    aVar.f28210d = C11556el.f27960i.mo72344a(emVar);
                } else if (b != 3) {
                    C11551ei eiVar = emVar.f27975b;
                    aVar.mo72349a(b, eiVar, eiVar.mo72346a().mo72344a(emVar));
                } else {
                    aVar.f28211e = C11556el.f27960i.mo72344a(emVar);
                }
            }
        }
    }
}
