package com.fyber.inneractive.sdk.mraid;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.util.C5350l;
import com.fyber.inneractive.sdk.util.C5364p0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C5405c;
import com.fyber.inneractive.sdk.web.C5407d;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.mraid.n */
public class C4516n extends C4503b {
    public C4516n(Map<String, String> map, C5407d dVar, C5364p0 p0Var) {
        super(map, dVar, p0Var);
    }

    /* renamed from: a */
    public void mo24710a() {
        int a = mo24709a("w");
        int a2 = mo24709a("h");
        int a3 = mo24709a("offsetX");
        int a4 = mo24709a("offsetY");
        boolean equals = "true".equals(this.f11163b.get("allowOffscreen"));
        String str = this.f11163b.get("customClosePosition");
        if (a <= 0) {
            a = this.f11164c.f14330K;
        }
        if (a2 <= 0) {
            a2 = this.f11164c.f14331L;
        }
        C5407d dVar = this.f11164c;
        C5405c cVar = dVar.f14280b;
        if (cVar != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) cVar.getRootView().findViewById(16908290);
                dVar.f14322C = viewGroup;
                if (viewGroup == null) {
                    IAlog.m16703e("Couldn't find content in the view tree", new Object[0]);
                    dVar.mo26545a(C4508f.RESIZE, "Ad can be resized only if it's state is default or resized.");
                } else if (dVar.f14346z != C5407d.C5411d.DISABLED) {
                    C4502a0 a0Var = dVar.f14345y;
                    if (a0Var != C4502a0.DEFAULT && a0Var != C4502a0.RESIZED) {
                        dVar.mo26545a(C4508f.RESIZE, "Ad can be resized only if it's state is default or resized.");
                    } else if (a >= 0 || a2 >= 0) {
                        dVar.mo26549b(false);
                        C5407d.C5415h hVar = dVar.f14320A;
                        if (hVar == C5407d.C5415h.ALWAYS_VISIBLE || (!dVar.f14328I && hVar != C5407d.C5415h.ALWAYS_HIDDEN)) {
                            dVar.mo26551c(true);
                        }
                        dVar.mo26552d(false);
                        dVar.f14335P = C5350l.m16760b(a2);
                        dVar.f14334O = C5350l.m16760b(a);
                        if (!equals) {
                            int i = (a3 + a) - dVar.f14330K;
                            if (i > 0) {
                                a3 -= i;
                            }
                            if (a3 < 0) {
                                a3 = 0;
                            }
                            int i2 = (a4 + a2) - dVar.f14331L;
                            if (i2 > 0) {
                                a4 -= i2;
                            }
                            if (a4 < 0) {
                                a4 = 0;
                            }
                        }
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C5350l.m16760b(a), C5350l.m16760b(a2));
                        layoutParams.leftMargin = a3;
                        layoutParams.topMargin = a4;
                        if (a3 == 0 && a4 == 0) {
                            layoutParams.gravity = 17;
                        }
                        dVar.f14280b.setLayoutParams(layoutParams);
                        C4502a0 a0Var2 = dVar.f14345y;
                        C4502a0 a0Var3 = C4502a0.RESIZED;
                        if (a0Var2 != a0Var3) {
                            dVar.f14345y = a0Var3;
                            dVar.mo26546a((C4522t) new C4527y(a0Var3));
                            int i3 = dVar.f14334O;
                            if (!(i3 == -1 || dVar.f14335P == -1)) {
                                dVar.mo26546a((C4522t) new C4521s(C5350l.m16765c(i3), C5350l.m16765c(dVar.f14335P)));
                            }
                        }
                        L l = dVar.f14285g;
                        if (l != null) {
                            ((C5407d.C5413f) l).mo24971b(dVar);
                        }
                    } else {
                        dVar.mo26545a(C4508f.RESIZE, "Creative size passed to resize() was invalid.");
                    }
                }
            } catch (Exception unused) {
                IAlog.m16703e("Couldn't find content in the view tree", new Object[0]);
                dVar.mo26545a(C4508f.RESIZE, "Ad can be resized only if it's state is default or resized.");
            }
        }
    }

    /* renamed from: b */
    public boolean mo24706b() {
        return true;
    }
}
