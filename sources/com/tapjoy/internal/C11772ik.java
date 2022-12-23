package com.tapjoy.internal;

import android.graphics.PointF;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;

/* renamed from: com.tapjoy.internal.ik */
public final class C11772ik {

    /* renamed from: d */
    public static final C11444bc<C11772ik> f28687d = new C11444bc<C11772ik>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo72202a(C11452bh bhVar) {
            return new C11772ik(bhVar);
        }
    };

    /* renamed from: a */
    public C11848z f28688a = C11848z.UNSPECIFIED;

    /* renamed from: b */
    public PointF f28689b;

    /* renamed from: c */
    public ArrayList<C11770ij> f28690c = new ArrayList<>();

    public C11772ik(C11452bh bhVar) {
        bhVar.mo72223h();
        while (bhVar.mo72225j()) {
            String l = bhVar.mo72227l();
            if (TJAdUnitConstants.String.BUTTONS.equals(l)) {
                if (bhVar.mo72226k() == C11461bm.BEGIN_ARRAY) {
                    bhVar.mo72209a(this.f28690c, C11770ij.f28673n);
                } else {
                    bhVar.mo72234s();
                }
            } else if ("window_aspect_ratio".equals(l)) {
                if (bhVar.mo72211a()) {
                    PointF pointF = new PointF();
                    bhVar.mo72223h();
                    while (bhVar.mo72225j()) {
                        String l2 = bhVar.mo72227l();
                        if ("width".equals(l2)) {
                            pointF.x = (float) bhVar.mo72231p();
                        } else if ("height".equals(l2)) {
                            pointF.y = (float) bhVar.mo72231p();
                        } else {
                            bhVar.mo72234s();
                        }
                    }
                    bhVar.mo72224i();
                    if (!(pointF.x == 0.0f || pointF.y == 0.0f)) {
                        this.f28689b = pointF;
                    }
                } else {
                    bhVar.mo72234s();
                }
            } else if ("orientation".equals(l)) {
                String m = bhVar.mo72228m();
                if ("landscape".equals(m)) {
                    this.f28688a = C11848z.LANDSCAPE;
                } else if ("portrait".equals(m)) {
                    this.f28688a = C11848z.PORTRAIT;
                }
            } else {
                bhVar.mo72234s();
            }
        }
        bhVar.mo72224i();
    }
}
