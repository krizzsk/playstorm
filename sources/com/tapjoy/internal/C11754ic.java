package com.tapjoy.internal;

import android.graphics.Rect;
import com.tapjoy.TapjoyConstants;

/* renamed from: com.tapjoy.internal.ic */
public final class C11754ic {

    /* renamed from: h */
    public static final C11444bc<C11754ic> f28621h = new C11444bc<C11754ic>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo72202a(C11452bh bhVar) {
            bhVar.mo72223h();
            Rect rect = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            C11747hy hyVar = null;
            boolean z = false;
            String str4 = "";
            while (bhVar.mo72225j()) {
                String l = bhVar.mo72227l();
                if ("region".equals(l)) {
                    rect = C11445bd.f27692b.mo72202a(bhVar);
                } else if ("value".equals(l)) {
                    str = bhVar.mo72228m();
                } else if (TapjoyConstants.TJC_FULLSCREEN_AD_DISMISS_URL.equals(l)) {
                    z = bhVar.mo72229n();
                } else if ("url".equals(l)) {
                    str4 = bhVar.mo72228m();
                } else if (TapjoyConstants.TJC_REDIRECT_URL.equals(l)) {
                    str2 = bhVar.mo72212b();
                } else if ("ad_content".equals(l)) {
                    str3 = bhVar.mo72212b();
                } else if (C11747hy.m34129a(l)) {
                    hyVar = C11747hy.m34128a(l, bhVar);
                } else {
                    bhVar.mo72234s();
                }
            }
            bhVar.mo72224i();
            return new C11754ic(rect, str, z, str4, str2, str3, hyVar);
        }
    };

    /* renamed from: a */
    public final Rect f28622a;

    /* renamed from: b */
    public final String f28623b;

    /* renamed from: c */
    public final boolean f28624c;

    /* renamed from: d */
    public final String f28625d;

    /* renamed from: e */
    public String f28626e;

    /* renamed from: f */
    public String f28627f;

    /* renamed from: g */
    public final C11693gv f28628g;

    C11754ic(Rect rect, String str, boolean z, String str2, String str3, String str4, C11693gv gvVar) {
        this.f28622a = rect;
        this.f28623b = str;
        this.f28624c = z;
        this.f28625d = str2;
        this.f28626e = str3;
        this.f28627f = str4;
        this.f28628g = gvVar;
    }
}
