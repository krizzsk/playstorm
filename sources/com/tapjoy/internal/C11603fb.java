package com.tapjoy.internal;

import com.tapjoy.internal.C11553ej;

/* renamed from: com.tapjoy.internal.fb */
public final class C11603fb extends C11553ej<C11603fb, C11604a> {

    /* renamed from: c */
    public static final C11556el<C11603fb> f28110c = new C11605b();

    /* renamed from: d */
    public static final Long f28111d = 0L;

    /* renamed from: e */
    public final String f28112e;

    /* renamed from: f */
    public final Long f28113f;

    public C11603fb(String str, Long l) {
        this(str, l, C11804je.f28817b);
    }

    public C11603fb(String str, Long l, C11804je jeVar) {
        super(f28110c, jeVar);
        this.f28112e = str;
        this.f28113f = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11603fb)) {
            return false;
        }
        C11603fb fbVar = (C11603fb) obj;
        return mo72347a().equals(fbVar.mo72347a()) && this.f28112e.equals(fbVar.f28112e) && this.f28113f.equals(fbVar.f28113f);
    }

    public final int hashCode() {
        int i = this.f27949b;
        if (i != 0) {
            return i;
        }
        int hashCode = (((mo72347a().hashCode() * 37) + this.f28112e.hashCode()) * 37) + this.f28113f.hashCode();
        this.f27949b = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", name=");
        sb.append(this.f28112e);
        sb.append(", value=");
        sb.append(this.f28113f);
        StringBuilder replace = sb.replace(0, 2, "EventValue{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.tapjoy.internal.fb$a */
    public static final class C11604a extends C11553ej.C11554a<C11603fb, C11604a> {

        /* renamed from: c */
        public String f28114c;

        /* renamed from: d */
        public Long f28115d;

        /* renamed from: b */
        public final C11603fb mo72467b() {
            if (this.f28114c != null && this.f28115d != null) {
                return new C11603fb(this.f28114c, this.f28115d, super.mo72351a());
            }
            throw C11576eq.m33581a(this.f28114c, "name", this.f28115d, "value");
        }
    }

    /* renamed from: com.tapjoy.internal.fb$b */
    static final class C11605b extends C11556el<C11603fb> {
        /* renamed from: a */
        public final /* synthetic */ int mo72342a(Object obj) {
            C11603fb fbVar = (C11603fb) obj;
            return C11556el.f27967p.mo72352a(1, fbVar.f28112e) + C11556el.f27960i.mo72352a(2, fbVar.f28113f) + fbVar.mo72347a().mo72783c();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo72345a(C11573en enVar, Object obj) {
            C11603fb fbVar = (C11603fb) obj;
            C11556el.f27967p.mo72356a(enVar, 1, fbVar.f28112e);
            C11556el.f27960i.mo72356a(enVar, 2, fbVar.f28113f);
            enVar.mo72367a(fbVar.mo72347a());
        }

        C11605b() {
            super(C11551ei.LENGTH_DELIMITED, C11603fb.class);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo72344a(C11572em emVar) {
            C11604a aVar = new C11604a();
            long a = emVar.mo72359a();
            while (true) {
                int b = emVar.mo72361b();
                if (b == -1) {
                    emVar.mo72360a(a);
                    return aVar.mo72467b();
                } else if (b == 1) {
                    aVar.f28114c = C11556el.f27967p.mo72344a(emVar);
                } else if (b != 2) {
                    C11551ei eiVar = emVar.f27975b;
                    aVar.mo72349a(b, eiVar, eiVar.mo72346a().mo72344a(emVar));
                } else {
                    aVar.f28115d = C11556el.f27960i.mo72344a(emVar);
                }
            }
        }
    }
}
