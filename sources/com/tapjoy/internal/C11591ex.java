package com.tapjoy.internal;

import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.internal.C11553ej;
import com.tapjoy.internal.C11556el;
import java.util.List;

/* renamed from: com.tapjoy.internal.ex */
public final class C11591ex extends C11553ej<C11591ex, C11592a> {

    /* renamed from: c */
    public static final C11556el<C11591ex> f28028c = new C11593b();

    /* renamed from: d */
    public static final C11601fa f28029d = C11601fa.APP;

    /* renamed from: e */
    public static final Long f28030e = 0L;

    /* renamed from: f */
    public static final Long f28031f = 0L;

    /* renamed from: g */
    public static final Long f28032g = 0L;

    /* renamed from: h */
    public static final Long f28033h = 0L;

    /* renamed from: i */
    public static final Integer f28034i = 0;

    /* renamed from: j */
    public static final Integer f28035j = 0;

    /* renamed from: k */
    public static final Integer f28036k = 0;

    /* renamed from: l */
    public static final Long f28037l = 0L;

    /* renamed from: m */
    public static final Long f28038m = 0L;

    /* renamed from: A */
    public final C11615ff f28039A;

    /* renamed from: B */
    public final String f28040B;

    /* renamed from: C */
    public final String f28041C;

    /* renamed from: D */
    public final C11612fe f28042D;

    /* renamed from: E */
    public final String f28043E;

    /* renamed from: F */
    public final String f28044F;

    /* renamed from: G */
    public final String f28045G;

    /* renamed from: H */
    public final List<C11603fb> f28046H;

    /* renamed from: I */
    public final String f28047I;

    /* renamed from: J */
    public final Integer f28048J;

    /* renamed from: K */
    public final Long f28049K;

    /* renamed from: L */
    public final Long f28050L;

    /* renamed from: n */
    public final C11601fa f28051n;

    /* renamed from: o */
    public final String f28052o;

    /* renamed from: p */
    public final Long f28053p;

    /* renamed from: q */
    public final Long f28054q;

    /* renamed from: r */
    public final String f28055r;

    /* renamed from: s */
    public final Long f28056s;

    /* renamed from: t */
    public final Long f28057t;

    /* renamed from: u */
    public final C11606fc f28058u;

    /* renamed from: v */
    public final C11588ew f28059v;

    /* renamed from: w */
    public final C11627fj f28060w;

    /* renamed from: x */
    public final Integer f28061x;

    /* renamed from: y */
    public final Integer f28062y;

    /* renamed from: z */
    public final C11597ez f28063z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11591ex(C11601fa faVar, String str, Long l, Long l2, String str2, Long l3, Long l4, C11606fc fcVar, C11588ew ewVar, C11627fj fjVar, Integer num, Integer num2, C11597ez ezVar, C11615ff ffVar, String str3, String str4, C11612fe feVar, String str5, String str6, String str7, List<C11603fb> list, String str8, Integer num3, Long l5, Long l6, C11804je jeVar) {
        super(f28028c, jeVar);
        this.f28051n = faVar;
        this.f28052o = str;
        this.f28053p = l;
        this.f28054q = l2;
        this.f28055r = str2;
        this.f28056s = l3;
        this.f28057t = l4;
        this.f28058u = fcVar;
        this.f28059v = ewVar;
        this.f28060w = fjVar;
        this.f28061x = num;
        this.f28062y = num2;
        this.f28063z = ezVar;
        this.f28039A = ffVar;
        this.f28040B = str3;
        this.f28041C = str4;
        this.f28042D = feVar;
        this.f28043E = str5;
        this.f28044F = str6;
        this.f28045G = str7;
        this.f28046H = C11576eq.m33583a(TJAdUnitConstants.String.USAGE_TRACKER_VALUES, list);
        this.f28047I = str8;
        this.f28048J = num3;
        this.f28049K = l5;
        this.f28050L = l6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11591ex)) {
            return false;
        }
        C11591ex exVar = (C11591ex) obj;
        return mo72347a().equals(exVar.mo72347a()) && this.f28051n.equals(exVar.f28051n) && this.f28052o.equals(exVar.f28052o) && this.f28053p.equals(exVar.f28053p) && C11576eq.m33584a((Object) this.f28054q, (Object) exVar.f28054q) && C11576eq.m33584a((Object) this.f28055r, (Object) exVar.f28055r) && C11576eq.m33584a((Object) this.f28056s, (Object) exVar.f28056s) && C11576eq.m33584a((Object) this.f28057t, (Object) exVar.f28057t) && C11576eq.m33584a((Object) this.f28058u, (Object) exVar.f28058u) && C11576eq.m33584a((Object) this.f28059v, (Object) exVar.f28059v) && C11576eq.m33584a((Object) this.f28060w, (Object) exVar.f28060w) && C11576eq.m33584a((Object) this.f28061x, (Object) exVar.f28061x) && C11576eq.m33584a((Object) this.f28062y, (Object) exVar.f28062y) && C11576eq.m33584a((Object) this.f28063z, (Object) exVar.f28063z) && C11576eq.m33584a((Object) this.f28039A, (Object) exVar.f28039A) && C11576eq.m33584a((Object) this.f28040B, (Object) exVar.f28040B) && C11576eq.m33584a((Object) this.f28041C, (Object) exVar.f28041C) && C11576eq.m33584a((Object) this.f28042D, (Object) exVar.f28042D) && C11576eq.m33584a((Object) this.f28043E, (Object) exVar.f28043E) && C11576eq.m33584a((Object) this.f28044F, (Object) exVar.f28044F) && C11576eq.m33584a((Object) this.f28045G, (Object) exVar.f28045G) && this.f28046H.equals(exVar.f28046H) && C11576eq.m33584a((Object) this.f28047I, (Object) exVar.f28047I) && C11576eq.m33584a((Object) this.f28048J, (Object) exVar.f28048J) && C11576eq.m33584a((Object) this.f28049K, (Object) exVar.f28049K) && C11576eq.m33584a((Object) this.f28050L, (Object) exVar.f28050L);
    }

    public final int hashCode() {
        int i = this.f27949b;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((mo72347a().hashCode() * 37) + this.f28051n.hashCode()) * 37) + this.f28052o.hashCode()) * 37) + this.f28053p.hashCode()) * 37;
        Long l = this.f28054q;
        int i2 = 0;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 37;
        String str = this.f28055r;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Long l2 = this.f28056s;
        int hashCode4 = (hashCode3 + (l2 != null ? l2.hashCode() : 0)) * 37;
        Long l3 = this.f28057t;
        int hashCode5 = (hashCode4 + (l3 != null ? l3.hashCode() : 0)) * 37;
        C11606fc fcVar = this.f28058u;
        int hashCode6 = (hashCode5 + (fcVar != null ? fcVar.hashCode() : 0)) * 37;
        C11588ew ewVar = this.f28059v;
        int hashCode7 = (hashCode6 + (ewVar != null ? ewVar.hashCode() : 0)) * 37;
        C11627fj fjVar = this.f28060w;
        int hashCode8 = (hashCode7 + (fjVar != null ? fjVar.hashCode() : 0)) * 37;
        Integer num = this.f28061x;
        int hashCode9 = (hashCode8 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.f28062y;
        int hashCode10 = (hashCode9 + (num2 != null ? num2.hashCode() : 0)) * 37;
        C11597ez ezVar = this.f28063z;
        int hashCode11 = (hashCode10 + (ezVar != null ? ezVar.hashCode() : 0)) * 37;
        C11615ff ffVar = this.f28039A;
        int hashCode12 = (hashCode11 + (ffVar != null ? ffVar.hashCode() : 0)) * 37;
        String str2 = this.f28040B;
        int hashCode13 = (hashCode12 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.f28041C;
        int hashCode14 = (hashCode13 + (str3 != null ? str3.hashCode() : 0)) * 37;
        C11612fe feVar = this.f28042D;
        int hashCode15 = (hashCode14 + (feVar != null ? feVar.hashCode() : 0)) * 37;
        String str4 = this.f28043E;
        int hashCode16 = (hashCode15 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.f28044F;
        int hashCode17 = (hashCode16 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.f28045G;
        int hashCode18 = (((hashCode17 + (str6 != null ? str6.hashCode() : 0)) * 37) + this.f28046H.hashCode()) * 37;
        String str7 = this.f28047I;
        int hashCode19 = (hashCode18 + (str7 != null ? str7.hashCode() : 0)) * 37;
        Integer num3 = this.f28048J;
        int hashCode20 = (hashCode19 + (num3 != null ? num3.hashCode() : 0)) * 37;
        Long l4 = this.f28049K;
        int hashCode21 = (hashCode20 + (l4 != null ? l4.hashCode() : 0)) * 37;
        Long l5 = this.f28050L;
        if (l5 != null) {
            i2 = l5.hashCode();
        }
        int i3 = hashCode21 + i2;
        this.f27949b = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.f28051n);
        sb.append(", name=");
        sb.append(this.f28052o);
        sb.append(", time=");
        sb.append(this.f28053p);
        if (this.f28054q != null) {
            sb.append(", systemTime=");
            sb.append(this.f28054q);
        }
        if (this.f28055r != null) {
            sb.append(", instanceId=");
            sb.append(this.f28055r);
        }
        if (this.f28056s != null) {
            sb.append(", elapsedRealtime=");
            sb.append(this.f28056s);
        }
        if (this.f28057t != null) {
            sb.append(", duration=");
            sb.append(this.f28057t);
        }
        if (this.f28058u != null) {
            sb.append(", info=");
            sb.append(this.f28058u);
        }
        if (this.f28059v != null) {
            sb.append(", app=");
            sb.append(this.f28059v);
        }
        if (this.f28060w != null) {
            sb.append(", user=");
            sb.append(this.f28060w);
        }
        if (this.f28061x != null) {
            sb.append(", xxx_session_seq=");
            sb.append(this.f28061x);
        }
        if (this.f28062y != null) {
            sb.append(", eventSeq=");
            sb.append(this.f28062y);
        }
        if (this.f28063z != null) {
            sb.append(", eventPrev=");
            sb.append(this.f28063z);
        }
        if (this.f28039A != null) {
            sb.append(", purchase=");
            sb.append(this.f28039A);
        }
        if (this.f28040B != null) {
            sb.append(", exception=");
            sb.append(this.f28040B);
        }
        if (this.f28041C != null) {
            sb.append(", metaBase=");
            sb.append(this.f28041C);
        }
        if (this.f28042D != null) {
            sb.append(", meta=");
            sb.append(this.f28042D);
        }
        if (this.f28043E != null) {
            sb.append(", category=");
            sb.append(this.f28043E);
        }
        if (this.f28044F != null) {
            sb.append(", p1=");
            sb.append(this.f28044F);
        }
        if (this.f28045G != null) {
            sb.append(", p2=");
            sb.append(this.f28045G);
        }
        if (!this.f28046H.isEmpty()) {
            sb.append(", values=");
            sb.append(this.f28046H);
        }
        if (this.f28047I != null) {
            sb.append(", dimensions=");
            sb.append(this.f28047I);
        }
        if (this.f28048J != null) {
            sb.append(", count=");
            sb.append(this.f28048J);
        }
        if (this.f28049K != null) {
            sb.append(", firstTime=");
            sb.append(this.f28049K);
        }
        if (this.f28050L != null) {
            sb.append(", lastTime=");
            sb.append(this.f28050L);
        }
        StringBuilder replace = sb.replace(0, 2, "Event{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.tapjoy.internal.ex$a */
    public static final class C11592a extends C11553ej.C11554a<C11591ex, C11592a> {

        /* renamed from: A */
        public Long f28064A;

        /* renamed from: c */
        public C11601fa f28065c;

        /* renamed from: d */
        public String f28066d;

        /* renamed from: e */
        public Long f28067e;

        /* renamed from: f */
        public Long f28068f;

        /* renamed from: g */
        public String f28069g;

        /* renamed from: h */
        public Long f28070h;

        /* renamed from: i */
        public Long f28071i;

        /* renamed from: j */
        public C11606fc f28072j;

        /* renamed from: k */
        public C11588ew f28073k;

        /* renamed from: l */
        public C11627fj f28074l;

        /* renamed from: m */
        public Integer f28075m;

        /* renamed from: n */
        public Integer f28076n;

        /* renamed from: o */
        public C11597ez f28077o;

        /* renamed from: p */
        public C11615ff f28078p;

        /* renamed from: q */
        public String f28079q;

        /* renamed from: r */
        public String f28080r;

        /* renamed from: s */
        public C11612fe f28081s;

        /* renamed from: t */
        public String f28082t;

        /* renamed from: u */
        public String f28083u;

        /* renamed from: v */
        public String f28084v;

        /* renamed from: w */
        public List<C11603fb> f28085w = C11576eq.m33582a();

        /* renamed from: x */
        public String f28086x;

        /* renamed from: y */
        public Integer f28087y;

        /* renamed from: z */
        public Long f28088z;

        /* renamed from: b */
        public final C11591ex mo72451b() {
            if (this.f28065c == null || this.f28066d == null || this.f28067e == null) {
                throw C11576eq.m33581a(this.f28065c, "type", this.f28066d, "name", this.f28067e, "time");
            }
            C11591ex exVar = r2;
            C11591ex exVar2 = new C11591ex(this.f28065c, this.f28066d, this.f28067e, this.f28068f, this.f28069g, this.f28070h, this.f28071i, this.f28072j, this.f28073k, this.f28074l, this.f28075m, this.f28076n, this.f28077o, this.f28078p, this.f28079q, this.f28080r, this.f28081s, this.f28082t, this.f28083u, this.f28084v, this.f28085w, this.f28086x, this.f28087y, this.f28088z, this.f28064A, super.mo72351a());
            return exVar;
        }
    }

    /* renamed from: com.tapjoy.internal.ex$b */
    static final class C11593b extends C11556el<C11591ex> {
        /* renamed from: a */
        public final /* synthetic */ int mo72342a(Object obj) {
            C11591ex exVar = (C11591ex) obj;
            int i = 0;
            int a = C11601fa.f28107e.mo72352a(1, exVar.f28051n) + C11556el.f27967p.mo72352a(2, exVar.f28052o) + C11556el.f27960i.mo72352a(3, exVar.f28053p) + (exVar.f28054q != null ? C11556el.f27960i.mo72352a(19, exVar.f28054q) : 0) + (exVar.f28055r != null ? C11556el.f27967p.mo72352a(20, exVar.f28055r) : 0) + (exVar.f28056s != null ? C11556el.f27960i.mo72352a(21, exVar.f28056s) : 0) + (exVar.f28057t != null ? C11556el.f27960i.mo72352a(4, exVar.f28057t) : 0) + (exVar.f28058u != null ? C11606fc.f28116c.mo72352a(5, exVar.f28058u) : 0) + (exVar.f28059v != null ? C11588ew.f28016c.mo72352a(6, exVar.f28059v) : 0) + (exVar.f28060w != null ? C11627fj.f28218c.mo72352a(7, exVar.f28060w) : 0) + (exVar.f28061x != null ? C11556el.f27955d.mo72352a(8, exVar.f28061x) : 0) + (exVar.f28062y != null ? C11556el.f27955d.mo72352a(9, exVar.f28062y) : 0) + (exVar.f28063z != null ? C11597ez.f28092c.mo72352a(10, exVar.f28063z) : 0) + (exVar.f28039A != null ? C11615ff.f28170c.mo72352a(11, exVar.f28039A) : 0) + (exVar.f28040B != null ? C11556el.f27967p.mo72352a(12, exVar.f28040B) : 0) + (exVar.f28041C != null ? C11556el.f27967p.mo72352a(13, exVar.f28041C) : 0) + (exVar.f28042D != null ? C11612fe.f28163c.mo72352a(18, exVar.f28042D) : 0) + (exVar.f28043E != null ? C11556el.f27967p.mo72352a(14, exVar.f28043E) : 0) + (exVar.f28044F != null ? C11556el.f27967p.mo72352a(15, exVar.f28044F) : 0) + (exVar.f28045G != null ? C11556el.f27967p.mo72352a(16, exVar.f28045G) : 0) + C11603fb.f28110c.mo72353a().mo72352a(17, exVar.f28046H) + (exVar.f28047I != null ? C11556el.f27967p.mo72352a(22, exVar.f28047I) : 0) + (exVar.f28048J != null ? C11556el.f27955d.mo72352a(23, exVar.f28048J) : 0) + (exVar.f28049K != null ? C11556el.f27960i.mo72352a(24, exVar.f28049K) : 0);
            if (exVar.f28050L != null) {
                i = C11556el.f27960i.mo72352a(25, exVar.f28050L);
            }
            return a + i + exVar.mo72347a().mo72783c();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo72344a(C11572em emVar) {
            return m33731b(emVar);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo72345a(C11573en enVar, Object obj) {
            C11591ex exVar = (C11591ex) obj;
            C11601fa.f28107e.mo72356a(enVar, 1, exVar.f28051n);
            C11556el.f27967p.mo72356a(enVar, 2, exVar.f28052o);
            C11556el.f27960i.mo72356a(enVar, 3, exVar.f28053p);
            if (exVar.f28054q != null) {
                C11556el.f27960i.mo72356a(enVar, 19, exVar.f28054q);
            }
            if (exVar.f28055r != null) {
                C11556el.f27967p.mo72356a(enVar, 20, exVar.f28055r);
            }
            if (exVar.f28056s != null) {
                C11556el.f27960i.mo72356a(enVar, 21, exVar.f28056s);
            }
            if (exVar.f28057t != null) {
                C11556el.f27960i.mo72356a(enVar, 4, exVar.f28057t);
            }
            if (exVar.f28058u != null) {
                C11606fc.f28116c.mo72356a(enVar, 5, exVar.f28058u);
            }
            if (exVar.f28059v != null) {
                C11588ew.f28016c.mo72356a(enVar, 6, exVar.f28059v);
            }
            if (exVar.f28060w != null) {
                C11627fj.f28218c.mo72356a(enVar, 7, exVar.f28060w);
            }
            if (exVar.f28061x != null) {
                C11556el.f27955d.mo72356a(enVar, 8, exVar.f28061x);
            }
            if (exVar.f28062y != null) {
                C11556el.f27955d.mo72356a(enVar, 9, exVar.f28062y);
            }
            if (exVar.f28063z != null) {
                C11597ez.f28092c.mo72356a(enVar, 10, exVar.f28063z);
            }
            if (exVar.f28039A != null) {
                C11615ff.f28170c.mo72356a(enVar, 11, exVar.f28039A);
            }
            if (exVar.f28040B != null) {
                C11556el.f27967p.mo72356a(enVar, 12, exVar.f28040B);
            }
            if (exVar.f28041C != null) {
                C11556el.f27967p.mo72356a(enVar, 13, exVar.f28041C);
            }
            if (exVar.f28042D != null) {
                C11612fe.f28163c.mo72356a(enVar, 18, exVar.f28042D);
            }
            if (exVar.f28043E != null) {
                C11556el.f27967p.mo72356a(enVar, 14, exVar.f28043E);
            }
            if (exVar.f28044F != null) {
                C11556el.f27967p.mo72356a(enVar, 15, exVar.f28044F);
            }
            if (exVar.f28045G != null) {
                C11556el.f27967p.mo72356a(enVar, 16, exVar.f28045G);
            }
            C11603fb.f28110c.mo72353a().mo72356a(enVar, 17, exVar.f28046H);
            if (exVar.f28047I != null) {
                C11556el.f27967p.mo72356a(enVar, 22, exVar.f28047I);
            }
            if (exVar.f28048J != null) {
                C11556el.f27955d.mo72356a(enVar, 23, exVar.f28048J);
            }
            if (exVar.f28049K != null) {
                C11556el.f27960i.mo72356a(enVar, 24, exVar.f28049K);
            }
            if (exVar.f28050L != null) {
                C11556el.f27960i.mo72356a(enVar, 25, exVar.f28050L);
            }
            enVar.mo72367a(exVar.mo72347a());
        }

        C11593b() {
            super(C11551ei.LENGTH_DELIMITED, C11591ex.class);
        }

        /* renamed from: b */
        private static C11591ex m33731b(C11572em emVar) {
            C11592a aVar = new C11592a();
            long a = emVar.mo72359a();
            while (true) {
                int b = emVar.mo72361b();
                if (b != -1) {
                    switch (b) {
                        case 1:
                            try {
                                aVar.f28065c = C11601fa.f28107e.mo72344a(emVar);
                                break;
                            } catch (C11556el.C11571a e) {
                                aVar.mo72349a(b, C11551ei.VARINT, Long.valueOf((long) e.f27973a));
                                break;
                            }
                        case 2:
                            aVar.f28066d = C11556el.f27967p.mo72344a(emVar);
                            break;
                        case 3:
                            aVar.f28067e = C11556el.f27960i.mo72344a(emVar);
                            break;
                        case 4:
                            aVar.f28071i = C11556el.f27960i.mo72344a(emVar);
                            break;
                        case 5:
                            aVar.f28072j = C11606fc.f28116c.mo72344a(emVar);
                            break;
                        case 6:
                            aVar.f28073k = C11588ew.f28016c.mo72344a(emVar);
                            break;
                        case 7:
                            aVar.f28074l = C11627fj.f28218c.mo72344a(emVar);
                            break;
                        case 8:
                            aVar.f28075m = C11556el.f27955d.mo72344a(emVar);
                            break;
                        case 9:
                            aVar.f28076n = C11556el.f27955d.mo72344a(emVar);
                            break;
                        case 10:
                            aVar.f28077o = C11597ez.f28092c.mo72344a(emVar);
                            break;
                        case 11:
                            aVar.f28078p = C11615ff.f28170c.mo72344a(emVar);
                            break;
                        case 12:
                            aVar.f28079q = C11556el.f27967p.mo72344a(emVar);
                            break;
                        case 13:
                            aVar.f28080r = C11556el.f27967p.mo72344a(emVar);
                            break;
                        case 14:
                            aVar.f28082t = C11556el.f27967p.mo72344a(emVar);
                            break;
                        case 15:
                            aVar.f28083u = C11556el.f27967p.mo72344a(emVar);
                            break;
                        case 16:
                            aVar.f28084v = C11556el.f27967p.mo72344a(emVar);
                            break;
                        case 17:
                            aVar.f28085w.add(C11603fb.f28110c.mo72344a(emVar));
                            break;
                        case 18:
                            aVar.f28081s = C11612fe.f28163c.mo72344a(emVar);
                            break;
                        case 19:
                            aVar.f28068f = C11556el.f27960i.mo72344a(emVar);
                            break;
                        case 20:
                            aVar.f28069g = C11556el.f27967p.mo72344a(emVar);
                            break;
                        case 21:
                            aVar.f28070h = C11556el.f27960i.mo72344a(emVar);
                            break;
                        case 22:
                            aVar.f28086x = C11556el.f27967p.mo72344a(emVar);
                            break;
                        case 23:
                            aVar.f28087y = C11556el.f27955d.mo72344a(emVar);
                            break;
                        case 24:
                            aVar.f28088z = C11556el.f27960i.mo72344a(emVar);
                            break;
                        case 25:
                            aVar.f28064A = C11556el.f27960i.mo72344a(emVar);
                            break;
                        default:
                            C11551ei eiVar = emVar.f27975b;
                            aVar.mo72349a(b, eiVar, eiVar.mo72346a().mo72344a(emVar));
                            break;
                    }
                } else {
                    emVar.mo72360a(a);
                    return aVar.mo72451b();
                }
            }
        }
    }
}
