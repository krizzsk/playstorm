package com.tapjoy.internal;

import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;

/* renamed from: com.tapjoy.internal.ij */
public final class C11770ij {

    /* renamed from: n */
    public static final C11444bc<C11770ij> f28673n = new C11444bc<C11770ij>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo72202a(C11452bh bhVar) {
            return new C11770ij(bhVar);
        }
    };

    /* renamed from: a */
    public C11774il f28674a;

    /* renamed from: b */
    public C11774il f28675b;

    /* renamed from: c */
    public C11774il f28676c;

    /* renamed from: d */
    public C11774il f28677d;

    /* renamed from: e */
    public int f28678e = 9;

    /* renamed from: f */
    public int f28679f = 10;

    /* renamed from: g */
    public String f28680g;

    /* renamed from: h */
    public String f28681h;

    /* renamed from: i */
    public String f28682i;

    /* renamed from: j */
    public boolean f28683j = false;

    /* renamed from: k */
    public String f28684k;

    /* renamed from: l */
    public C11766ih f28685l;

    /* renamed from: m */
    public C11766ih f28686m;

    public C11770ij(C11452bh bhVar) {
        bhVar.mo72223h();
        while (bhVar.mo72225j()) {
            String l = bhVar.mo72227l();
            if ("x".equals(l)) {
                this.f28674a = C11774il.m34173a(bhVar.mo72228m());
            } else if ("y".equals(l)) {
                this.f28675b = C11774il.m34173a(bhVar.mo72228m());
            } else if ("width".equals(l)) {
                this.f28676c = C11774il.m34173a(bhVar.mo72228m());
            } else if ("height".equals(l)) {
                this.f28677d = C11774il.m34173a(bhVar.mo72228m());
            } else if ("url".equals(l)) {
                this.f28680g = bhVar.mo72228m();
            } else if (TapjoyConstants.TJC_REDIRECT_URL.equals(l)) {
                this.f28681h = bhVar.mo72228m();
            } else if ("ad_content".equals(l)) {
                this.f28682i = bhVar.mo72228m();
            } else if (TapjoyConstants.TJC_FULLSCREEN_AD_DISMISS_URL.equals(l)) {
                this.f28683j = bhVar.mo72229n();
            } else if ("value".equals(l)) {
                this.f28684k = bhVar.mo72228m();
            } else if ("image".equals(l)) {
                this.f28685l = C11766ih.f28662e.mo72202a(bhVar);
            } else if ("image_clicked".equals(l)) {
                this.f28686m = C11766ih.f28662e.mo72202a(bhVar);
            } else if ("align".equals(l)) {
                String m = bhVar.mo72228m();
                if ("left".equals(m)) {
                    this.f28678e = 9;
                } else if ("right".equals(m)) {
                    this.f28678e = 11;
                } else if ("center".equals(m)) {
                    this.f28678e = 14;
                } else {
                    bhVar.mo72234s();
                }
            } else if ("valign".equals(l)) {
                String m2 = bhVar.mo72228m();
                if ("top".equals(m2)) {
                    this.f28679f = 10;
                } else if ("middle".equals(m2)) {
                    this.f28679f = 15;
                } else if (TJAdUnitConstants.String.BOTTOM.equals(m2)) {
                    this.f28679f = 12;
                } else {
                    bhVar.mo72234s();
                }
            } else {
                bhVar.mo72234s();
            }
        }
        bhVar.mo72224i();
    }
}
