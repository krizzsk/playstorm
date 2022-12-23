package com.tapjoy.internal;

import com.tapjoy.internal.C11553ej;
import java.util.List;

/* renamed from: com.tapjoy.internal.ey */
public final class C11594ey extends C11553ej<C11594ey, C11595a> {

    /* renamed from: c */
    public static final C11556el<C11594ey> f28089c = new C11596b();

    /* renamed from: d */
    public final List<C11591ex> f28090d;

    public C11594ey(List<C11591ex> list, C11804je jeVar) {
        super(f28089c, jeVar);
        this.f28090d = C11576eq.m33583a("events", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11594ey)) {
            return false;
        }
        C11594ey eyVar = (C11594ey) obj;
        return mo72347a().equals(eyVar.mo72347a()) && this.f28090d.equals(eyVar.f28090d);
    }

    public final int hashCode() {
        int i = this.f27949b;
        if (i != 0) {
            return i;
        }
        int hashCode = (mo72347a().hashCode() * 37) + this.f28090d.hashCode();
        this.f27949b = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f28090d.isEmpty()) {
            sb.append(", events=");
            sb.append(this.f28090d);
        }
        StringBuilder replace = sb.replace(0, 2, "EventBatch{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.tapjoy.internal.ey$a */
    public static final class C11595a extends C11553ej.C11554a<C11594ey, C11595a> {

        /* renamed from: c */
        public List<C11591ex> f28091c = C11576eq.m33582a();

        /* renamed from: b */
        public final C11594ey mo72454b() {
            return new C11594ey(this.f28091c, super.mo72351a());
        }
    }

    /* renamed from: com.tapjoy.internal.ey$b */
    static final class C11596b extends C11556el<C11594ey> {
        /* renamed from: a */
        public final /* synthetic */ int mo72342a(Object obj) {
            C11594ey eyVar = (C11594ey) obj;
            return C11591ex.f28028c.mo72353a().mo72352a(1, eyVar.f28090d) + eyVar.mo72347a().mo72783c();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo72345a(C11573en enVar, Object obj) {
            C11594ey eyVar = (C11594ey) obj;
            C11591ex.f28028c.mo72353a().mo72356a(enVar, 1, eyVar.f28090d);
            enVar.mo72367a(eyVar.mo72347a());
        }

        C11596b() {
            super(C11551ei.LENGTH_DELIMITED, C11594ey.class);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo72344a(C11572em emVar) {
            C11595a aVar = new C11595a();
            long a = emVar.mo72359a();
            while (true) {
                int b = emVar.mo72361b();
                if (b == -1) {
                    emVar.mo72360a(a);
                    return aVar.mo72454b();
                } else if (b != 1) {
                    C11551ei eiVar = emVar.f27975b;
                    aVar.mo72349a(b, eiVar, eiVar.mo72346a().mo72344a(emVar));
                } else {
                    aVar.f28091c.add(C11591ex.f28028c.mo72344a(emVar));
                }
            }
        }
    }
}
