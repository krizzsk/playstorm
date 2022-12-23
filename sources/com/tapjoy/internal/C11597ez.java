package com.tapjoy.internal;

import com.tapjoy.internal.C11553ej;
import com.tapjoy.internal.C11556el;

/* renamed from: com.tapjoy.internal.ez */
public final class C11597ez extends C11553ej<C11597ez, C11598a> {

    /* renamed from: c */
    public static final C11556el<C11597ez> f28092c = new C11599b();

    /* renamed from: d */
    public static final C11601fa f28093d = C11601fa.APP;

    /* renamed from: e */
    public final C11601fa f28094e;

    /* renamed from: f */
    public final String f28095f;

    /* renamed from: g */
    public final String f28096g;

    public C11597ez(C11601fa faVar, String str, String str2, C11804je jeVar) {
        super(f28092c, jeVar);
        this.f28094e = faVar;
        this.f28095f = str;
        this.f28096g = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11597ez)) {
            return false;
        }
        C11597ez ezVar = (C11597ez) obj;
        return mo72347a().equals(ezVar.mo72347a()) && this.f28094e.equals(ezVar.f28094e) && this.f28095f.equals(ezVar.f28095f) && C11576eq.m33584a((Object) this.f28096g, (Object) ezVar.f28096g);
    }

    public final int hashCode() {
        int i = this.f27949b;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((mo72347a().hashCode() * 37) + this.f28094e.hashCode()) * 37) + this.f28095f.hashCode()) * 37;
        String str = this.f28096g;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.f27949b = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.f28094e);
        sb.append(", name=");
        sb.append(this.f28095f);
        if (this.f28096g != null) {
            sb.append(", category=");
            sb.append(this.f28096g);
        }
        StringBuilder replace = sb.replace(0, 2, "EventGroup{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.tapjoy.internal.ez$a */
    public static final class C11598a extends C11553ej.C11554a<C11597ez, C11598a> {

        /* renamed from: c */
        public C11601fa f28097c;

        /* renamed from: d */
        public String f28098d;

        /* renamed from: e */
        public String f28099e;

        /* renamed from: b */
        public final C11597ez mo72457b() {
            if (this.f28097c != null && this.f28098d != null) {
                return new C11597ez(this.f28097c, this.f28098d, this.f28099e, super.mo72351a());
            }
            throw C11576eq.m33581a(this.f28097c, "type", this.f28098d, "name");
        }
    }

    /* renamed from: com.tapjoy.internal.ez$b */
    static final class C11599b extends C11556el<C11597ez> {
        /* renamed from: a */
        public final /* synthetic */ int mo72342a(Object obj) {
            C11597ez ezVar = (C11597ez) obj;
            return C11601fa.f28107e.mo72352a(1, ezVar.f28094e) + C11556el.f27967p.mo72352a(2, ezVar.f28095f) + (ezVar.f28096g != null ? C11556el.f27967p.mo72352a(3, ezVar.f28096g) : 0) + ezVar.mo72347a().mo72783c();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo72344a(C11572em emVar) {
            return m33740b(emVar);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo72345a(C11573en enVar, Object obj) {
            C11597ez ezVar = (C11597ez) obj;
            C11601fa.f28107e.mo72356a(enVar, 1, ezVar.f28094e);
            C11556el.f27967p.mo72356a(enVar, 2, ezVar.f28095f);
            if (ezVar.f28096g != null) {
                C11556el.f27967p.mo72356a(enVar, 3, ezVar.f28096g);
            }
            enVar.mo72367a(ezVar.mo72347a());
        }

        C11599b() {
            super(C11551ei.LENGTH_DELIMITED, C11597ez.class);
        }

        /* renamed from: b */
        private static C11597ez m33740b(C11572em emVar) {
            C11598a aVar = new C11598a();
            long a = emVar.mo72359a();
            while (true) {
                int b = emVar.mo72361b();
                if (b == -1) {
                    emVar.mo72360a(a);
                    return aVar.mo72457b();
                } else if (b == 1) {
                    try {
                        aVar.f28097c = C11601fa.f28107e.mo72344a(emVar);
                    } catch (C11556el.C11571a e) {
                        aVar.mo72349a(b, C11551ei.VARINT, Long.valueOf((long) e.f27973a));
                    }
                } else if (b == 2) {
                    aVar.f28098d = C11556el.f27967p.mo72344a(emVar);
                } else if (b != 3) {
                    C11551ei eiVar = emVar.f27975b;
                    aVar.mo72349a(b, eiVar, eiVar.mo72346a().mo72344a(emVar));
                } else {
                    aVar.f28099e = C11556el.f27967p.mo72344a(emVar);
                }
            }
        }
    }
}
