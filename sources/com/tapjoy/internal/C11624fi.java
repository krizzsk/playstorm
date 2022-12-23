package com.tapjoy.internal;

import com.tapjoy.internal.C11553ej;
import java.util.List;

/* renamed from: com.tapjoy.internal.fi */
public final class C11624fi extends C11553ej<C11624fi, C11625a> {

    /* renamed from: c */
    public static final C11556el<C11624fi> f28215c = new C11626b();

    /* renamed from: d */
    public final List<String> f28216d;

    public C11624fi(List<String> list) {
        this(list, C11804je.f28817b);
    }

    public C11624fi(List<String> list, C11804je jeVar) {
        super(f28215c, jeVar);
        this.f28216d = C11576eq.m33583a("elements", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11624fi)) {
            return false;
        }
        C11624fi fiVar = (C11624fi) obj;
        return mo72347a().equals(fiVar.mo72347a()) && this.f28216d.equals(fiVar.f28216d);
    }

    public final int hashCode() {
        int i = this.f27949b;
        if (i != 0) {
            return i;
        }
        int hashCode = (mo72347a().hashCode() * 37) + this.f28216d.hashCode();
        this.f27949b = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f28216d.isEmpty()) {
            sb.append(", elements=");
            sb.append(this.f28216d);
        }
        StringBuilder replace = sb.replace(0, 2, "StringList{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.tapjoy.internal.fi$a */
    public static final class C11625a extends C11553ej.C11554a<C11624fi, C11625a> {

        /* renamed from: c */
        public List<String> f28217c = C11576eq.m33582a();

        /* renamed from: b */
        public final C11624fi mo72488b() {
            return new C11624fi(this.f28217c, super.mo72351a());
        }
    }

    /* renamed from: com.tapjoy.internal.fi$b */
    static final class C11626b extends C11556el<C11624fi> {
        /* renamed from: a */
        public final /* synthetic */ int mo72342a(Object obj) {
            C11624fi fiVar = (C11624fi) obj;
            return C11556el.f27967p.mo72353a().mo72352a(1, fiVar.f28216d) + fiVar.mo72347a().mo72783c();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo72345a(C11573en enVar, Object obj) {
            C11624fi fiVar = (C11624fi) obj;
            C11556el.f27967p.mo72353a().mo72356a(enVar, 1, fiVar.f28216d);
            enVar.mo72367a(fiVar.mo72347a());
        }

        C11626b() {
            super(C11551ei.LENGTH_DELIMITED, C11624fi.class);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo72344a(C11572em emVar) {
            C11625a aVar = new C11625a();
            long a = emVar.mo72359a();
            while (true) {
                int b = emVar.mo72361b();
                if (b == -1) {
                    emVar.mo72360a(a);
                    return aVar.mo72488b();
                } else if (b != 1) {
                    C11551ei eiVar = emVar.f27975b;
                    aVar.mo72349a(b, eiVar, eiVar.mo72346a().mo72344a(emVar));
                } else {
                    aVar.f28217c.add(C11556el.f27967p.mo72344a(emVar));
                }
            }
        }
    }
}
