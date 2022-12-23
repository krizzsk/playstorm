package com.tapjoy.internal;

import com.tapjoy.internal.C11553ej;
import java.util.List;

/* renamed from: com.tapjoy.internal.fh */
public final class C11621fh extends C11553ej<C11621fh, C11622a> {

    /* renamed from: c */
    public static final C11556el<C11621fh> f28212c = new C11623b();

    /* renamed from: d */
    public final List<C11618fg> f28213d;

    public C11621fh(List<C11618fg> list) {
        this(list, C11804je.f28817b);
    }

    public C11621fh(List<C11618fg> list, C11804je jeVar) {
        super(f28212c, jeVar);
        this.f28213d = C11576eq.m33583a("pushes", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11621fh)) {
            return false;
        }
        C11621fh fhVar = (C11621fh) obj;
        return mo72347a().equals(fhVar.mo72347a()) && this.f28213d.equals(fhVar.f28213d);
    }

    public final int hashCode() {
        int i = this.f27949b;
        if (i != 0) {
            return i;
        }
        int hashCode = (mo72347a().hashCode() * 37) + this.f28213d.hashCode();
        this.f27949b = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f28213d.isEmpty()) {
            sb.append(", pushes=");
            sb.append(this.f28213d);
        }
        StringBuilder replace = sb.replace(0, 2, "PushList{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.tapjoy.internal.fh$a */
    public static final class C11622a extends C11553ej.C11554a<C11621fh, C11622a> {

        /* renamed from: c */
        public List<C11618fg> f28214c = C11576eq.m33582a();

        /* renamed from: b */
        public final C11621fh mo72485b() {
            return new C11621fh(this.f28214c, super.mo72351a());
        }
    }

    /* renamed from: com.tapjoy.internal.fh$b */
    static final class C11623b extends C11556el<C11621fh> {
        /* renamed from: a */
        public final /* synthetic */ int mo72342a(Object obj) {
            C11621fh fhVar = (C11621fh) obj;
            return C11618fg.f28203c.mo72353a().mo72352a(1, fhVar.f28213d) + fhVar.mo72347a().mo72783c();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo72345a(C11573en enVar, Object obj) {
            C11621fh fhVar = (C11621fh) obj;
            C11618fg.f28203c.mo72353a().mo72356a(enVar, 1, fhVar.f28213d);
            enVar.mo72367a(fhVar.mo72347a());
        }

        C11623b() {
            super(C11551ei.LENGTH_DELIMITED, C11621fh.class);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo72344a(C11572em emVar) {
            C11622a aVar = new C11622a();
            long a = emVar.mo72359a();
            while (true) {
                int b = emVar.mo72361b();
                if (b == -1) {
                    emVar.mo72360a(a);
                    return aVar.mo72485b();
                } else if (b != 1) {
                    C11551ei eiVar = emVar.f27975b;
                    aVar.mo72349a(b, eiVar, eiVar.mo72346a().mo72344a(emVar));
                } else {
                    aVar.f28214c.add(C11618fg.f28203c.mo72344a(emVar));
                }
            }
        }
    }
}
