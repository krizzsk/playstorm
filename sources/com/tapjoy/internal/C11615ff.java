package com.tapjoy.internal;

import com.tapjoy.internal.C11553ej;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;

/* renamed from: com.tapjoy.internal.ff */
public final class C11615ff extends C11553ej<C11615ff, C11616a> {

    /* renamed from: c */
    public static final C11556el<C11615ff> f28170c = new C11617b();

    /* renamed from: d */
    public static final Integer f28171d = 1;

    /* renamed from: e */
    public static final Double f28172e = Double.valueOf(0.0d);

    /* renamed from: f */
    public static final Integer f28173f = 0;

    /* renamed from: g */
    public static final Long f28174g = 0L;

    /* renamed from: h */
    public final String f28175h;

    /* renamed from: i */
    public final Integer f28176i;

    /* renamed from: j */
    public final Double f28177j;

    /* renamed from: k */
    public final String f28178k;

    /* renamed from: l */
    public final String f28179l;

    /* renamed from: m */
    public final String f28180m;

    /* renamed from: n */
    public final String f28181n;

    /* renamed from: o */
    public final String f28182o;

    /* renamed from: p */
    public final Integer f28183p;

    /* renamed from: q */
    public final Long f28184q;

    /* renamed from: r */
    public final String f28185r;

    /* renamed from: s */
    public final String f28186s;

    /* renamed from: t */
    public final String f28187t;

    /* renamed from: u */
    public final String f28188u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11615ff(String str, Integer num, Double d, String str2, String str3, String str4, String str5, String str6, Integer num2, Long l, String str7, String str8, String str9, String str10, C11804je jeVar) {
        super(f28170c, jeVar);
        this.f28175h = str;
        this.f28176i = num;
        this.f28177j = d;
        this.f28178k = str2;
        this.f28179l = str3;
        this.f28180m = str4;
        this.f28181n = str5;
        this.f28182o = str6;
        this.f28183p = num2;
        this.f28184q = l;
        this.f28185r = str7;
        this.f28186s = str8;
        this.f28187t = str9;
        this.f28188u = str10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11615ff)) {
            return false;
        }
        C11615ff ffVar = (C11615ff) obj;
        return mo72347a().equals(ffVar.mo72347a()) && this.f28175h.equals(ffVar.f28175h) && C11576eq.m33584a((Object) this.f28176i, (Object) ffVar.f28176i) && C11576eq.m33584a((Object) this.f28177j, (Object) ffVar.f28177j) && C11576eq.m33584a((Object) this.f28178k, (Object) ffVar.f28178k) && C11576eq.m33584a((Object) this.f28179l, (Object) ffVar.f28179l) && C11576eq.m33584a((Object) this.f28180m, (Object) ffVar.f28180m) && C11576eq.m33584a((Object) this.f28181n, (Object) ffVar.f28181n) && C11576eq.m33584a((Object) this.f28182o, (Object) ffVar.f28182o) && C11576eq.m33584a((Object) this.f28183p, (Object) ffVar.f28183p) && C11576eq.m33584a((Object) this.f28184q, (Object) ffVar.f28184q) && C11576eq.m33584a((Object) this.f28185r, (Object) ffVar.f28185r) && C11576eq.m33584a((Object) this.f28186s, (Object) ffVar.f28186s) && C11576eq.m33584a((Object) this.f28187t, (Object) ffVar.f28187t) && C11576eq.m33584a((Object) this.f28188u, (Object) ffVar.f28188u);
    }

    public final int hashCode() {
        int i = this.f27949b;
        if (i != 0) {
            return i;
        }
        int hashCode = ((mo72347a().hashCode() * 37) + this.f28175h.hashCode()) * 37;
        Integer num = this.f28176i;
        int i2 = 0;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 37;
        Double d = this.f28177j;
        int hashCode3 = (hashCode2 + (d != null ? d.hashCode() : 0)) * 37;
        String str = this.f28178k;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.f28179l;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.f28180m;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.f28181n;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.f28182o;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Integer num2 = this.f28183p;
        int hashCode9 = (hashCode8 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Long l = this.f28184q;
        int hashCode10 = (hashCode9 + (l != null ? l.hashCode() : 0)) * 37;
        String str6 = this.f28185r;
        int hashCode11 = (hashCode10 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.f28186s;
        int hashCode12 = (hashCode11 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.f28187t;
        int hashCode13 = (hashCode12 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.f28188u;
        if (str9 != null) {
            i2 = str9.hashCode();
        }
        int i3 = hashCode13 + i2;
        this.f27949b = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", productId=");
        sb.append(this.f28175h);
        if (this.f28176i != null) {
            sb.append(", productQuantity=");
            sb.append(this.f28176i);
        }
        if (this.f28177j != null) {
            sb.append(", productPrice=");
            sb.append(this.f28177j);
        }
        if (this.f28178k != null) {
            sb.append(", productPriceCurrency=");
            sb.append(this.f28178k);
        }
        if (this.f28179l != null) {
            sb.append(", productType=");
            sb.append(this.f28179l);
        }
        if (this.f28180m != null) {
            sb.append(", productTitle=");
            sb.append(this.f28180m);
        }
        if (this.f28181n != null) {
            sb.append(", productDescription=");
            sb.append(this.f28181n);
        }
        if (this.f28182o != null) {
            sb.append(", transactionId=");
            sb.append(this.f28182o);
        }
        if (this.f28183p != null) {
            sb.append(", transactionState=");
            sb.append(this.f28183p);
        }
        if (this.f28184q != null) {
            sb.append(", transactionDate=");
            sb.append(this.f28184q);
        }
        if (this.f28185r != null) {
            sb.append(", campaignId=");
            sb.append(this.f28185r);
        }
        if (this.f28186s != null) {
            sb.append(", currencyPrice=");
            sb.append(this.f28186s);
        }
        if (this.f28187t != null) {
            sb.append(", receipt=");
            sb.append(this.f28187t);
        }
        if (this.f28188u != null) {
            sb.append(", signature=");
            sb.append(this.f28188u);
        }
        StringBuilder replace = sb.replace(0, 2, "Purchase{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.tapjoy.internal.ff$a */
    public static final class C11616a extends C11553ej.C11554a<C11615ff, C11616a> {

        /* renamed from: c */
        public String f28189c;

        /* renamed from: d */
        public Integer f28190d;

        /* renamed from: e */
        public Double f28191e;

        /* renamed from: f */
        public String f28192f;

        /* renamed from: g */
        public String f28193g;

        /* renamed from: h */
        public String f28194h;

        /* renamed from: i */
        public String f28195i;

        /* renamed from: j */
        public String f28196j;

        /* renamed from: k */
        public Integer f28197k;

        /* renamed from: l */
        public Long f28198l;

        /* renamed from: m */
        public String f28199m;

        /* renamed from: n */
        public String f28200n;

        /* renamed from: o */
        public String f28201o;

        /* renamed from: p */
        public String f28202p;

        /* renamed from: b */
        public final C11615ff mo72479b() {
            String str = this.f28189c;
            if (str != null) {
                return new C11615ff(this.f28189c, this.f28190d, this.f28191e, this.f28192f, this.f28193g, this.f28194h, this.f28195i, this.f28196j, this.f28197k, this.f28198l, this.f28199m, this.f28200n, this.f28201o, this.f28202p, super.mo72351a());
            }
            throw C11576eq.m33581a(str, InAppPurchaseMetaData.KEY_PRODUCT_ID);
        }
    }

    /* renamed from: com.tapjoy.internal.ff$b */
    static final class C11617b extends C11556el<C11615ff> {
        /* renamed from: a */
        public final /* synthetic */ int mo72342a(Object obj) {
            C11615ff ffVar = (C11615ff) obj;
            int i = 0;
            int a = C11556el.f27967p.mo72352a(1, ffVar.f28175h) + (ffVar.f28176i != null ? C11556el.f27955d.mo72352a(2, ffVar.f28176i) : 0) + (ffVar.f28177j != null ? C11556el.f27966o.mo72352a(3, ffVar.f28177j) : 0) + (ffVar.f28178k != null ? C11556el.f27967p.mo72352a(4, ffVar.f28178k) : 0) + (ffVar.f28179l != null ? C11556el.f27967p.mo72352a(5, ffVar.f28179l) : 0) + (ffVar.f28180m != null ? C11556el.f27967p.mo72352a(6, ffVar.f28180m) : 0) + (ffVar.f28181n != null ? C11556el.f27967p.mo72352a(7, ffVar.f28181n) : 0) + (ffVar.f28182o != null ? C11556el.f27967p.mo72352a(8, ffVar.f28182o) : 0) + (ffVar.f28183p != null ? C11556el.f27955d.mo72352a(9, ffVar.f28183p) : 0) + (ffVar.f28184q != null ? C11556el.f27960i.mo72352a(10, ffVar.f28184q) : 0) + (ffVar.f28185r != null ? C11556el.f27967p.mo72352a(11, ffVar.f28185r) : 0) + (ffVar.f28186s != null ? C11556el.f27967p.mo72352a(12, ffVar.f28186s) : 0) + (ffVar.f28187t != null ? C11556el.f27967p.mo72352a(13, ffVar.f28187t) : 0);
            if (ffVar.f28188u != null) {
                i = C11556el.f27967p.mo72352a(14, ffVar.f28188u);
            }
            return a + i + ffVar.mo72347a().mo72783c();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo72345a(C11573en enVar, Object obj) {
            C11615ff ffVar = (C11615ff) obj;
            C11556el.f27967p.mo72356a(enVar, 1, ffVar.f28175h);
            if (ffVar.f28176i != null) {
                C11556el.f27955d.mo72356a(enVar, 2, ffVar.f28176i);
            }
            if (ffVar.f28177j != null) {
                C11556el.f27966o.mo72356a(enVar, 3, ffVar.f28177j);
            }
            if (ffVar.f28178k != null) {
                C11556el.f27967p.mo72356a(enVar, 4, ffVar.f28178k);
            }
            if (ffVar.f28179l != null) {
                C11556el.f27967p.mo72356a(enVar, 5, ffVar.f28179l);
            }
            if (ffVar.f28180m != null) {
                C11556el.f27967p.mo72356a(enVar, 6, ffVar.f28180m);
            }
            if (ffVar.f28181n != null) {
                C11556el.f27967p.mo72356a(enVar, 7, ffVar.f28181n);
            }
            if (ffVar.f28182o != null) {
                C11556el.f27967p.mo72356a(enVar, 8, ffVar.f28182o);
            }
            if (ffVar.f28183p != null) {
                C11556el.f27955d.mo72356a(enVar, 9, ffVar.f28183p);
            }
            if (ffVar.f28184q != null) {
                C11556el.f27960i.mo72356a(enVar, 10, ffVar.f28184q);
            }
            if (ffVar.f28185r != null) {
                C11556el.f27967p.mo72356a(enVar, 11, ffVar.f28185r);
            }
            if (ffVar.f28186s != null) {
                C11556el.f27967p.mo72356a(enVar, 12, ffVar.f28186s);
            }
            if (ffVar.f28187t != null) {
                C11556el.f27967p.mo72356a(enVar, 13, ffVar.f28187t);
            }
            if (ffVar.f28188u != null) {
                C11556el.f27967p.mo72356a(enVar, 14, ffVar.f28188u);
            }
            enVar.mo72367a(ffVar.mo72347a());
        }

        C11617b() {
            super(C11551ei.LENGTH_DELIMITED, C11615ff.class);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo72344a(C11572em emVar) {
            C11616a aVar = new C11616a();
            long a = emVar.mo72359a();
            while (true) {
                int b = emVar.mo72361b();
                if (b != -1) {
                    switch (b) {
                        case 1:
                            aVar.f28189c = C11556el.f27967p.mo72344a(emVar);
                            break;
                        case 2:
                            aVar.f28190d = C11556el.f27955d.mo72344a(emVar);
                            break;
                        case 3:
                            aVar.f28191e = C11556el.f27966o.mo72344a(emVar);
                            break;
                        case 4:
                            aVar.f28192f = C11556el.f27967p.mo72344a(emVar);
                            break;
                        case 5:
                            aVar.f28193g = C11556el.f27967p.mo72344a(emVar);
                            break;
                        case 6:
                            aVar.f28194h = C11556el.f27967p.mo72344a(emVar);
                            break;
                        case 7:
                            aVar.f28195i = C11556el.f27967p.mo72344a(emVar);
                            break;
                        case 8:
                            aVar.f28196j = C11556el.f27967p.mo72344a(emVar);
                            break;
                        case 9:
                            aVar.f28197k = C11556el.f27955d.mo72344a(emVar);
                            break;
                        case 10:
                            aVar.f28198l = C11556el.f27960i.mo72344a(emVar);
                            break;
                        case 11:
                            aVar.f28199m = C11556el.f27967p.mo72344a(emVar);
                            break;
                        case 12:
                            aVar.f28200n = C11556el.f27967p.mo72344a(emVar);
                            break;
                        case 13:
                            aVar.f28201o = C11556el.f27967p.mo72344a(emVar);
                            break;
                        case 14:
                            aVar.f28202p = C11556el.f27967p.mo72344a(emVar);
                            break;
                        default:
                            C11551ei eiVar = emVar.f27975b;
                            aVar.mo72349a(b, eiVar, eiVar.mo72346a().mo72344a(emVar));
                            break;
                    }
                } else {
                    emVar.mo72360a(a);
                    return aVar.mo72479b();
                }
            }
        }
    }
}
