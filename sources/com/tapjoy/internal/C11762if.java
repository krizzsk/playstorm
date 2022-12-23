package com.tapjoy.internal;

import android.graphics.Point;
import android.text.TextUtils;
import java.net.URL;

/* renamed from: com.tapjoy.internal.if */
public final class C11762if {

    /* renamed from: d */
    public static final C11444bc<C11762if> f28655d = new C11444bc<C11762if>() {
        /* renamed from: b */
        private static Point m34157b(C11452bh bhVar) {
            bhVar.mo72223h();
            Point point = null;
            while (bhVar.mo72225j()) {
                if ("offset".equals(bhVar.mo72227l())) {
                    bhVar.mo72223h();
                    int i = 0;
                    int i2 = 0;
                    while (bhVar.mo72225j()) {
                        String l = bhVar.mo72227l();
                        if ("x".equals(l)) {
                            i = bhVar.mo72233r();
                        } else if ("y".equals(l)) {
                            i2 = bhVar.mo72233r();
                        } else {
                            bhVar.mo72234s();
                        }
                    }
                    bhVar.mo72224i();
                    point = new Point(i, i2);
                } else {
                    bhVar.mo72234s();
                }
            }
            bhVar.mo72224i();
            return point;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo72202a(C11452bh bhVar) {
            bhVar.mo72223h();
            C11766ih ihVar = null;
            Point point = null;
            Point point2 = null;
            while (bhVar.mo72225j()) {
                String l = bhVar.mo72227l();
                if ("image".equals(l)) {
                    String m = bhVar.mo72228m();
                    if (!TextUtils.isEmpty(m)) {
                        ihVar = new C11766ih(new URL(m));
                    }
                } else if ("landscape".equals(l)) {
                    point = m34157b(bhVar);
                } else if ("portrait".equals(l)) {
                    point2 = m34157b(bhVar);
                } else {
                    bhVar.mo72234s();
                }
            }
            bhVar.mo72224i();
            return new C11762if(ihVar, point, point2);
        }
    };

    /* renamed from: a */
    public final C11766ih f28656a;

    /* renamed from: b */
    public final Point f28657b;

    /* renamed from: c */
    public final Point f28658c;

    public C11762if(C11766ih ihVar, Point point, Point point2) {
        this.f28656a = ihVar;
        this.f28657b = point;
        this.f28658c = point2;
    }
}
