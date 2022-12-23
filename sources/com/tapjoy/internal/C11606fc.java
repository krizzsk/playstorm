package com.tapjoy.internal;

import com.tapjoy.internal.C11553ej;

/* renamed from: com.tapjoy.internal.fc */
public final class C11606fc extends C11553ej<C11606fc, C11607a> {

    /* renamed from: c */
    public static final C11556el<C11606fc> f28116c = new C11608b();

    /* renamed from: d */
    public static final Integer f28117d = 0;

    /* renamed from: e */
    public static final Integer f28118e = 0;

    /* renamed from: f */
    public static final Integer f28119f = 0;

    /* renamed from: g */
    public final String f28120g;

    /* renamed from: h */
    public final String f28121h;

    /* renamed from: i */
    public final String f28122i;

    /* renamed from: j */
    public final String f28123j;

    /* renamed from: k */
    public final String f28124k;

    /* renamed from: l */
    public final String f28125l;

    /* renamed from: m */
    public final Integer f28126m;

    /* renamed from: n */
    public final Integer f28127n;

    /* renamed from: o */
    public final Integer f28128o;

    /* renamed from: p */
    public final String f28129p;

    /* renamed from: q */
    public final String f28130q;

    /* renamed from: r */
    public final String f28131r;

    /* renamed from: s */
    public final String f28132s;

    /* renamed from: t */
    public final String f28133t;

    /* renamed from: u */
    public final String f28134u;

    /* renamed from: v */
    public final String f28135v;

    /* renamed from: w */
    public final String f28136w;

    /* renamed from: x */
    public final String f28137x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11606fc(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, Integer num3, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, C11804je jeVar) {
        super(f28116c, jeVar);
        this.f28120g = str;
        this.f28121h = str2;
        this.f28122i = str3;
        this.f28123j = str4;
        this.f28124k = str5;
        this.f28125l = str6;
        this.f28126m = num;
        this.f28127n = num2;
        this.f28128o = num3;
        this.f28129p = str7;
        this.f28130q = str8;
        this.f28131r = str9;
        this.f28132s = str10;
        this.f28133t = str11;
        this.f28134u = str12;
        this.f28135v = str13;
        this.f28136w = str14;
        this.f28137x = str15;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11606fc)) {
            return false;
        }
        C11606fc fcVar = (C11606fc) obj;
        return mo72347a().equals(fcVar.mo72347a()) && C11576eq.m33584a((Object) this.f28120g, (Object) fcVar.f28120g) && C11576eq.m33584a((Object) this.f28121h, (Object) fcVar.f28121h) && C11576eq.m33584a((Object) this.f28122i, (Object) fcVar.f28122i) && C11576eq.m33584a((Object) this.f28123j, (Object) fcVar.f28123j) && C11576eq.m33584a((Object) this.f28124k, (Object) fcVar.f28124k) && C11576eq.m33584a((Object) this.f28125l, (Object) fcVar.f28125l) && C11576eq.m33584a((Object) this.f28126m, (Object) fcVar.f28126m) && C11576eq.m33584a((Object) this.f28127n, (Object) fcVar.f28127n) && C11576eq.m33584a((Object) this.f28128o, (Object) fcVar.f28128o) && C11576eq.m33584a((Object) this.f28129p, (Object) fcVar.f28129p) && C11576eq.m33584a((Object) this.f28130q, (Object) fcVar.f28130q) && C11576eq.m33584a((Object) this.f28131r, (Object) fcVar.f28131r) && C11576eq.m33584a((Object) this.f28132s, (Object) fcVar.f28132s) && C11576eq.m33584a((Object) this.f28133t, (Object) fcVar.f28133t) && C11576eq.m33584a((Object) this.f28134u, (Object) fcVar.f28134u) && C11576eq.m33584a((Object) this.f28135v, (Object) fcVar.f28135v) && C11576eq.m33584a((Object) this.f28136w, (Object) fcVar.f28136w) && C11576eq.m33584a((Object) this.f28137x, (Object) fcVar.f28137x);
    }

    public final int hashCode() {
        int i = this.f27949b;
        if (i != 0) {
            return i;
        }
        int hashCode = mo72347a().hashCode() * 37;
        String str = this.f28120g;
        int i2 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.f28121h;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.f28122i;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.f28123j;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.f28124k;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.f28125l;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
        Integer num = this.f28126m;
        int hashCode8 = (hashCode7 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.f28127n;
        int hashCode9 = (hashCode8 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Integer num3 = this.f28128o;
        int hashCode10 = (hashCode9 + (num3 != null ? num3.hashCode() : 0)) * 37;
        String str7 = this.f28129p;
        int hashCode11 = (hashCode10 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.f28130q;
        int hashCode12 = (hashCode11 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.f28131r;
        int hashCode13 = (hashCode12 + (str9 != null ? str9.hashCode() : 0)) * 37;
        String str10 = this.f28132s;
        int hashCode14 = (hashCode13 + (str10 != null ? str10.hashCode() : 0)) * 37;
        String str11 = this.f28133t;
        int hashCode15 = (hashCode14 + (str11 != null ? str11.hashCode() : 0)) * 37;
        String str12 = this.f28134u;
        int hashCode16 = (hashCode15 + (str12 != null ? str12.hashCode() : 0)) * 37;
        String str13 = this.f28135v;
        int hashCode17 = (hashCode16 + (str13 != null ? str13.hashCode() : 0)) * 37;
        String str14 = this.f28136w;
        int hashCode18 = (hashCode17 + (str14 != null ? str14.hashCode() : 0)) * 37;
        String str15 = this.f28137x;
        if (str15 != null) {
            i2 = str15.hashCode();
        }
        int i3 = hashCode18 + i2;
        this.f27949b = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f28120g != null) {
            sb.append(", mac=");
            sb.append(this.f28120g);
        }
        if (this.f28121h != null) {
            sb.append(", deviceId=");
            sb.append(this.f28121h);
        }
        if (this.f28122i != null) {
            sb.append(", deviceMaker=");
            sb.append(this.f28122i);
        }
        if (this.f28123j != null) {
            sb.append(", deviceModel=");
            sb.append(this.f28123j);
        }
        if (this.f28124k != null) {
            sb.append(", osName=");
            sb.append(this.f28124k);
        }
        if (this.f28125l != null) {
            sb.append(", osVer=");
            sb.append(this.f28125l);
        }
        if (this.f28126m != null) {
            sb.append(", displayD=");
            sb.append(this.f28126m);
        }
        if (this.f28127n != null) {
            sb.append(", displayW=");
            sb.append(this.f28127n);
        }
        if (this.f28128o != null) {
            sb.append(", displayH=");
            sb.append(this.f28128o);
        }
        if (this.f28129p != null) {
            sb.append(", locale=");
            sb.append(this.f28129p);
        }
        if (this.f28130q != null) {
            sb.append(", timezone=");
            sb.append(this.f28130q);
        }
        if (this.f28131r != null) {
            sb.append(", pkgId=");
            sb.append(this.f28131r);
        }
        if (this.f28132s != null) {
            sb.append(", pkgSign=");
            sb.append(this.f28132s);
        }
        if (this.f28133t != null) {
            sb.append(", sdk=");
            sb.append(this.f28133t);
        }
        if (this.f28134u != null) {
            sb.append(", countrySim=");
            sb.append(this.f28134u);
        }
        if (this.f28135v != null) {
            sb.append(", countryNet=");
            sb.append(this.f28135v);
        }
        if (this.f28136w != null) {
            sb.append(", imei=");
            sb.append(this.f28136w);
        }
        if (this.f28137x != null) {
            sb.append(", androidId=");
            sb.append(this.f28137x);
        }
        StringBuilder replace = sb.replace(0, 2, "Info{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.tapjoy.internal.fc$a */
    public static final class C11607a extends C11553ej.C11554a<C11606fc, C11607a> {

        /* renamed from: c */
        public String f28138c;

        /* renamed from: d */
        public String f28139d;

        /* renamed from: e */
        public String f28140e;

        /* renamed from: f */
        public String f28141f;

        /* renamed from: g */
        public String f28142g;

        /* renamed from: h */
        public String f28143h;

        /* renamed from: i */
        public Integer f28144i;

        /* renamed from: j */
        public Integer f28145j;

        /* renamed from: k */
        public Integer f28146k;

        /* renamed from: l */
        public String f28147l;

        /* renamed from: m */
        public String f28148m;

        /* renamed from: n */
        public String f28149n;

        /* renamed from: o */
        public String f28150o;

        /* renamed from: p */
        public String f28151p;

        /* renamed from: q */
        public String f28152q;

        /* renamed from: r */
        public String f28153r;

        /* renamed from: s */
        public String f28154s;

        /* renamed from: t */
        public String f28155t;

        /* renamed from: b */
        public final C11606fc mo72470b() {
            return new C11606fc(this.f28138c, this.f28139d, this.f28140e, this.f28141f, this.f28142g, this.f28143h, this.f28144i, this.f28145j, this.f28146k, this.f28147l, this.f28148m, this.f28149n, this.f28150o, this.f28151p, this.f28152q, this.f28153r, this.f28154s, this.f28155t, super.mo72351a());
        }
    }

    /* renamed from: com.tapjoy.internal.fc$b */
    static final class C11608b extends C11556el<C11606fc> {
        /* renamed from: a */
        public final /* synthetic */ int mo72342a(Object obj) {
            C11606fc fcVar = (C11606fc) obj;
            int i = 0;
            int a = (fcVar.f28120g != null ? C11556el.f27967p.mo72352a(1, fcVar.f28120g) : 0) + (fcVar.f28121h != null ? C11556el.f27967p.mo72352a(2, fcVar.f28121h) : 0) + (fcVar.f28122i != null ? C11556el.f27967p.mo72352a(3, fcVar.f28122i) : 0) + (fcVar.f28123j != null ? C11556el.f27967p.mo72352a(4, fcVar.f28123j) : 0) + (fcVar.f28124k != null ? C11556el.f27967p.mo72352a(5, fcVar.f28124k) : 0) + (fcVar.f28125l != null ? C11556el.f27967p.mo72352a(6, fcVar.f28125l) : 0) + (fcVar.f28126m != null ? C11556el.f27955d.mo72352a(7, fcVar.f28126m) : 0) + (fcVar.f28127n != null ? C11556el.f27955d.mo72352a(8, fcVar.f28127n) : 0) + (fcVar.f28128o != null ? C11556el.f27955d.mo72352a(9, fcVar.f28128o) : 0) + (fcVar.f28129p != null ? C11556el.f27967p.mo72352a(10, fcVar.f28129p) : 0) + (fcVar.f28130q != null ? C11556el.f27967p.mo72352a(11, fcVar.f28130q) : 0) + (fcVar.f28131r != null ? C11556el.f27967p.mo72352a(12, fcVar.f28131r) : 0) + (fcVar.f28132s != null ? C11556el.f27967p.mo72352a(13, fcVar.f28132s) : 0) + (fcVar.f28133t != null ? C11556el.f27967p.mo72352a(14, fcVar.f28133t) : 0) + (fcVar.f28134u != null ? C11556el.f27967p.mo72352a(15, fcVar.f28134u) : 0) + (fcVar.f28135v != null ? C11556el.f27967p.mo72352a(16, fcVar.f28135v) : 0) + (fcVar.f28136w != null ? C11556el.f27967p.mo72352a(17, fcVar.f28136w) : 0);
            if (fcVar.f28137x != null) {
                i = C11556el.f27967p.mo72352a(18, fcVar.f28137x);
            }
            return a + i + fcVar.mo72347a().mo72783c();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo72345a(C11573en enVar, Object obj) {
            C11606fc fcVar = (C11606fc) obj;
            if (fcVar.f28120g != null) {
                C11556el.f27967p.mo72356a(enVar, 1, fcVar.f28120g);
            }
            if (fcVar.f28121h != null) {
                C11556el.f27967p.mo72356a(enVar, 2, fcVar.f28121h);
            }
            if (fcVar.f28122i != null) {
                C11556el.f27967p.mo72356a(enVar, 3, fcVar.f28122i);
            }
            if (fcVar.f28123j != null) {
                C11556el.f27967p.mo72356a(enVar, 4, fcVar.f28123j);
            }
            if (fcVar.f28124k != null) {
                C11556el.f27967p.mo72356a(enVar, 5, fcVar.f28124k);
            }
            if (fcVar.f28125l != null) {
                C11556el.f27967p.mo72356a(enVar, 6, fcVar.f28125l);
            }
            if (fcVar.f28126m != null) {
                C11556el.f27955d.mo72356a(enVar, 7, fcVar.f28126m);
            }
            if (fcVar.f28127n != null) {
                C11556el.f27955d.mo72356a(enVar, 8, fcVar.f28127n);
            }
            if (fcVar.f28128o != null) {
                C11556el.f27955d.mo72356a(enVar, 9, fcVar.f28128o);
            }
            if (fcVar.f28129p != null) {
                C11556el.f27967p.mo72356a(enVar, 10, fcVar.f28129p);
            }
            if (fcVar.f28130q != null) {
                C11556el.f27967p.mo72356a(enVar, 11, fcVar.f28130q);
            }
            if (fcVar.f28131r != null) {
                C11556el.f27967p.mo72356a(enVar, 12, fcVar.f28131r);
            }
            if (fcVar.f28132s != null) {
                C11556el.f27967p.mo72356a(enVar, 13, fcVar.f28132s);
            }
            if (fcVar.f28133t != null) {
                C11556el.f27967p.mo72356a(enVar, 14, fcVar.f28133t);
            }
            if (fcVar.f28134u != null) {
                C11556el.f27967p.mo72356a(enVar, 15, fcVar.f28134u);
            }
            if (fcVar.f28135v != null) {
                C11556el.f27967p.mo72356a(enVar, 16, fcVar.f28135v);
            }
            if (fcVar.f28136w != null) {
                C11556el.f27967p.mo72356a(enVar, 17, fcVar.f28136w);
            }
            if (fcVar.f28137x != null) {
                C11556el.f27967p.mo72356a(enVar, 18, fcVar.f28137x);
            }
            enVar.mo72367a(fcVar.mo72347a());
        }

        C11608b() {
            super(C11551ei.LENGTH_DELIMITED, C11606fc.class);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo72344a(C11572em emVar) {
            C11607a aVar = new C11607a();
            long a = emVar.mo72359a();
            while (true) {
                int b = emVar.mo72361b();
                if (b != -1) {
                    switch (b) {
                        case 1:
                            aVar.f28138c = C11556el.f27967p.mo72344a(emVar);
                            break;
                        case 2:
                            aVar.f28139d = C11556el.f27967p.mo72344a(emVar);
                            break;
                        case 3:
                            aVar.f28140e = C11556el.f27967p.mo72344a(emVar);
                            break;
                        case 4:
                            aVar.f28141f = C11556el.f27967p.mo72344a(emVar);
                            break;
                        case 5:
                            aVar.f28142g = C11556el.f27967p.mo72344a(emVar);
                            break;
                        case 6:
                            aVar.f28143h = C11556el.f27967p.mo72344a(emVar);
                            break;
                        case 7:
                            aVar.f28144i = C11556el.f27955d.mo72344a(emVar);
                            break;
                        case 8:
                            aVar.f28145j = C11556el.f27955d.mo72344a(emVar);
                            break;
                        case 9:
                            aVar.f28146k = C11556el.f27955d.mo72344a(emVar);
                            break;
                        case 10:
                            aVar.f28147l = C11556el.f27967p.mo72344a(emVar);
                            break;
                        case 11:
                            aVar.f28148m = C11556el.f27967p.mo72344a(emVar);
                            break;
                        case 12:
                            aVar.f28149n = C11556el.f27967p.mo72344a(emVar);
                            break;
                        case 13:
                            aVar.f28150o = C11556el.f27967p.mo72344a(emVar);
                            break;
                        case 14:
                            aVar.f28151p = C11556el.f27967p.mo72344a(emVar);
                            break;
                        case 15:
                            aVar.f28152q = C11556el.f27967p.mo72344a(emVar);
                            break;
                        case 16:
                            aVar.f28153r = C11556el.f27967p.mo72344a(emVar);
                            break;
                        case 17:
                            aVar.f28154s = C11556el.f27967p.mo72344a(emVar);
                            break;
                        case 18:
                            aVar.f28155t = C11556el.f27967p.mo72344a(emVar);
                            break;
                        default:
                            C11551ei eiVar = emVar.f27975b;
                            aVar.mo72349a(b, eiVar, eiVar.mo72346a().mo72344a(emVar));
                            break;
                    }
                } else {
                    emVar.mo72360a(a);
                    return aVar.mo72470b();
                }
            }
        }
    }
}
