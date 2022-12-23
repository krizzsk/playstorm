package com.tapjoy.internal;

import com.tapjoy.internal.C11553ej;

/* renamed from: com.tapjoy.internal.ew */
public final class C11588ew extends C11553ej<C11588ew, C11589a> {

    /* renamed from: c */
    public static final C11556el<C11588ew> f28016c = new C11590b();

    /* renamed from: d */
    public static final Integer f28017d = 0;

    /* renamed from: e */
    public final String f28018e;

    /* renamed from: f */
    public final Integer f28019f;

    /* renamed from: g */
    public final String f28020g;

    /* renamed from: h */
    public final String f28021h;

    /* renamed from: i */
    public final String f28022i;

    public C11588ew(String str, Integer num, String str2, String str3, String str4, C11804je jeVar) {
        super(f28016c, jeVar);
        this.f28018e = str;
        this.f28019f = num;
        this.f28020g = str2;
        this.f28021h = str3;
        this.f28022i = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11588ew)) {
            return false;
        }
        C11588ew ewVar = (C11588ew) obj;
        return mo72347a().equals(ewVar.mo72347a()) && C11576eq.m33584a((Object) this.f28018e, (Object) ewVar.f28018e) && C11576eq.m33584a((Object) this.f28019f, (Object) ewVar.f28019f) && C11576eq.m33584a((Object) this.f28020g, (Object) ewVar.f28020g) && C11576eq.m33584a((Object) this.f28021h, (Object) ewVar.f28021h) && C11576eq.m33584a((Object) this.f28022i, (Object) ewVar.f28022i);
    }

    public final int hashCode() {
        int i = this.f27949b;
        if (i != 0) {
            return i;
        }
        int hashCode = mo72347a().hashCode() * 37;
        String str = this.f28018e;
        int i2 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.f28019f;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 37;
        String str2 = this.f28020g;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.f28021h;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.f28022i;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        int i3 = hashCode5 + i2;
        this.f27949b = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f28018e != null) {
            sb.append(", pkgVer=");
            sb.append(this.f28018e);
        }
        if (this.f28019f != null) {
            sb.append(", pkgRev=");
            sb.append(this.f28019f);
        }
        if (this.f28020g != null) {
            sb.append(", dataVer=");
            sb.append(this.f28020g);
        }
        if (this.f28021h != null) {
            sb.append(", installer=");
            sb.append(this.f28021h);
        }
        if (this.f28022i != null) {
            sb.append(", store=");
            sb.append(this.f28022i);
        }
        StringBuilder replace = sb.replace(0, 2, "App{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.tapjoy.internal.ew$a */
    public static final class C11589a extends C11553ej.C11554a<C11588ew, C11589a> {

        /* renamed from: c */
        public String f28023c;

        /* renamed from: d */
        public Integer f28024d;

        /* renamed from: e */
        public String f28025e;

        /* renamed from: f */
        public String f28026f;

        /* renamed from: g */
        public String f28027g;

        /* renamed from: b */
        public final C11588ew mo72448b() {
            return new C11588ew(this.f28023c, this.f28024d, this.f28025e, this.f28026f, this.f28027g, super.mo72351a());
        }
    }

    /* renamed from: com.tapjoy.internal.ew$b */
    static final class C11590b extends C11556el<C11588ew> {
        /* renamed from: a */
        public final /* synthetic */ int mo72342a(Object obj) {
            C11588ew ewVar = (C11588ew) obj;
            int i = 0;
            int a = (ewVar.f28018e != null ? C11556el.f27967p.mo72352a(1, ewVar.f28018e) : 0) + (ewVar.f28019f != null ? C11556el.f27955d.mo72352a(2, ewVar.f28019f) : 0) + (ewVar.f28020g != null ? C11556el.f27967p.mo72352a(3, ewVar.f28020g) : 0) + (ewVar.f28021h != null ? C11556el.f27967p.mo72352a(4, ewVar.f28021h) : 0);
            if (ewVar.f28022i != null) {
                i = C11556el.f27967p.mo72352a(5, ewVar.f28022i);
            }
            return a + i + ewVar.mo72347a().mo72783c();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo72345a(C11573en enVar, Object obj) {
            C11588ew ewVar = (C11588ew) obj;
            if (ewVar.f28018e != null) {
                C11556el.f27967p.mo72356a(enVar, 1, ewVar.f28018e);
            }
            if (ewVar.f28019f != null) {
                C11556el.f27955d.mo72356a(enVar, 2, ewVar.f28019f);
            }
            if (ewVar.f28020g != null) {
                C11556el.f27967p.mo72356a(enVar, 3, ewVar.f28020g);
            }
            if (ewVar.f28021h != null) {
                C11556el.f27967p.mo72356a(enVar, 4, ewVar.f28021h);
            }
            if (ewVar.f28022i != null) {
                C11556el.f27967p.mo72356a(enVar, 5, ewVar.f28022i);
            }
            enVar.mo72367a(ewVar.mo72347a());
        }

        C11590b() {
            super(C11551ei.LENGTH_DELIMITED, C11588ew.class);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo72344a(C11572em emVar) {
            C11589a aVar = new C11589a();
            long a = emVar.mo72359a();
            while (true) {
                int b = emVar.mo72361b();
                if (b == -1) {
                    emVar.mo72360a(a);
                    return aVar.mo72448b();
                } else if (b == 1) {
                    aVar.f28023c = C11556el.f27967p.mo72344a(emVar);
                } else if (b == 2) {
                    aVar.f28024d = C11556el.f27955d.mo72344a(emVar);
                } else if (b == 3) {
                    aVar.f28025e = C11556el.f27967p.mo72344a(emVar);
                } else if (b == 4) {
                    aVar.f28026f = C11556el.f27967p.mo72344a(emVar);
                } else if (b != 5) {
                    C11551ei eiVar = emVar.f27975b;
                    aVar.mo72349a(b, eiVar, eiVar.mo72346a().mo72344a(emVar));
                } else {
                    aVar.f28027g = C11556el.f27967p.mo72344a(emVar);
                }
            }
        }
    }
}
