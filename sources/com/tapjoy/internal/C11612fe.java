package com.tapjoy.internal;

import com.tapjoy.internal.C11553ej;

/* renamed from: com.tapjoy.internal.fe */
public final class C11612fe extends C11553ej<C11612fe, C11613a> {

    /* renamed from: c */
    public static final C11556el<C11612fe> f28163c = new C11614b();

    /* renamed from: d */
    public final String f28164d;

    /* renamed from: e */
    public final String f28165e;

    /* renamed from: f */
    public final String f28166f;

    public C11612fe(String str, String str2, String str3) {
        this(str, str2, str3, C11804je.f28817b);
    }

    public C11612fe(String str, String str2, String str3, C11804je jeVar) {
        super(f28163c, jeVar);
        this.f28164d = str;
        this.f28165e = str2;
        this.f28166f = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11612fe)) {
            return false;
        }
        C11612fe feVar = (C11612fe) obj;
        return mo72347a().equals(feVar.mo72347a()) && C11576eq.m33584a((Object) this.f28164d, (Object) feVar.f28164d) && C11576eq.m33584a((Object) this.f28165e, (Object) feVar.f28165e) && C11576eq.m33584a((Object) this.f28166f, (Object) feVar.f28166f);
    }

    public final int hashCode() {
        int i = this.f27949b;
        if (i != 0) {
            return i;
        }
        int hashCode = mo72347a().hashCode() * 37;
        String str = this.f28164d;
        int i2 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.f28165e;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.f28166f;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        int i3 = hashCode3 + i2;
        this.f27949b = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f28164d != null) {
            sb.append(", fq7Change=");
            sb.append(this.f28164d);
        }
        if (this.f28165e != null) {
            sb.append(", fq30Change=");
            sb.append(this.f28165e);
        }
        if (this.f28166f != null) {
            sb.append(", pushId=");
            sb.append(this.f28166f);
        }
        StringBuilder replace = sb.replace(0, 2, "Meta{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.tapjoy.internal.fe$a */
    public static final class C11613a extends C11553ej.C11554a<C11612fe, C11613a> {

        /* renamed from: c */
        public String f28167c;

        /* renamed from: d */
        public String f28168d;

        /* renamed from: e */
        public String f28169e;

        /* renamed from: b */
        public final C11612fe mo72476b() {
            return new C11612fe(this.f28167c, this.f28168d, this.f28169e, super.mo72351a());
        }
    }

    /* renamed from: com.tapjoy.internal.fe$b */
    static final class C11614b extends C11556el<C11612fe> {
        /* renamed from: a */
        public final /* synthetic */ int mo72342a(Object obj) {
            C11612fe feVar = (C11612fe) obj;
            int i = 0;
            int a = (feVar.f28164d != null ? C11556el.f27967p.mo72352a(1, feVar.f28164d) : 0) + (feVar.f28165e != null ? C11556el.f27967p.mo72352a(2, feVar.f28165e) : 0);
            if (feVar.f28166f != null) {
                i = C11556el.f27967p.mo72352a(3, feVar.f28166f);
            }
            return a + i + feVar.mo72347a().mo72783c();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo72345a(C11573en enVar, Object obj) {
            C11612fe feVar = (C11612fe) obj;
            if (feVar.f28164d != null) {
                C11556el.f27967p.mo72356a(enVar, 1, feVar.f28164d);
            }
            if (feVar.f28165e != null) {
                C11556el.f27967p.mo72356a(enVar, 2, feVar.f28165e);
            }
            if (feVar.f28166f != null) {
                C11556el.f27967p.mo72356a(enVar, 3, feVar.f28166f);
            }
            enVar.mo72367a(feVar.mo72347a());
        }

        C11614b() {
            super(C11551ei.LENGTH_DELIMITED, C11612fe.class);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo72344a(C11572em emVar) {
            C11613a aVar = new C11613a();
            long a = emVar.mo72359a();
            while (true) {
                int b = emVar.mo72361b();
                if (b == -1) {
                    emVar.mo72360a(a);
                    return aVar.mo72476b();
                } else if (b == 1) {
                    aVar.f28167c = C11556el.f27967p.mo72344a(emVar);
                } else if (b == 2) {
                    aVar.f28168d = C11556el.f27967p.mo72344a(emVar);
                } else if (b != 3) {
                    C11551ei eiVar = emVar.f27975b;
                    aVar.mo72349a(b, eiVar, eiVar.mo72346a().mo72344a(emVar));
                } else {
                    aVar.f28169e = C11556el.f27967p.mo72344a(emVar);
                }
            }
        }
    }
}
