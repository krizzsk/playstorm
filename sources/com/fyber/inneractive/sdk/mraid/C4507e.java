package com.fyber.inneractive.sdk.mraid;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.C4167R;
import com.fyber.inneractive.sdk.util.C5350l;
import com.fyber.inneractive.sdk.util.C5364p0;
import com.fyber.inneractive.sdk.util.C5370s;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C5405c;
import com.fyber.inneractive.sdk.web.C5407d;
import com.fyber.inneractive.sdk.web.C5422h;
import com.fyber.inneractive.sdk.web.C5426l;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.mraid.e */
public class C4507e extends C4501a {
    public C4507e(Map<String, String> map, C5407d dVar, C5364p0 p0Var) {
        super(map, dVar, p0Var);
    }

    /* renamed from: a */
    public void mo24710a() {
        int i;
        int a = mo24709a("w");
        int a2 = mo24709a("h");
        String str = this.f11163b.get("url");
        boolean equals = "true".equals(this.f11163b.get("shouldUseCustomClose"));
        boolean equals2 = "true".equals(this.f11163b.get("lockOrientation"));
        if (a <= 0) {
            a = -1;
        }
        if (a2 <= 0) {
            a2 = -1;
        }
        C5407d dVar = this.f11164c;
        if (dVar.f14280b != null && dVar.f14346z != C5407d.C5411d.DISABLED && dVar.f14345y == C4502a0.DEFAULT) {
            if (str == null || URLUtil.isValidUrl(str)) {
                int i2 = 0;
                try {
                    ViewGroup viewGroup = (ViewGroup) dVar.f14280b.getRootView().findViewById(16908290);
                    dVar.f14322C = viewGroup;
                    if (viewGroup == null) {
                        IAlog.m16703e("Couldn't find content in the view tree", new Object[0]);
                        dVar.mo26545a(C4508f.RESIZE, "Ad can be resized only if it's state is default or resized.");
                        return;
                    }
                    dVar.f14328I = equals;
                    L l = dVar.f14285g;
                    if (l != null) {
                        ((C5407d.C5413f) l).mo24966a(dVar, equals);
                    }
                    dVar.mo26552d(equals2);
                    if (dVar.f14335P >= 0) {
                        dVar.f14335P = C5350l.m16760b(a2);
                    }
                    if (dVar.f14334O >= 0) {
                        dVar.f14334O = C5350l.m16760b(i);
                    }
                    C5405c cVar = dVar.f14280b;
                    if (str != null) {
                        C5405c cVar2 = new C5405c(dVar.mo26554g());
                        dVar.f14323D = cVar2;
                        cVar2.setId(C4167R.C4169id.inneractive_webview_mraid);
                        dVar.f14323D.loadUrl(str);
                        dVar.f14323D.setWebChromeClient(dVar.f14281c);
                        dVar.f14323D.setWebViewClient(dVar.f14282d);
                        cVar = dVar.f14323D;
                        cVar.setOnKeyListener(new C5422h(dVar));
                    } else {
                        ViewGroup viewGroup2 = (ViewGroup) cVar.getParent();
                        if (viewGroup2 != null) {
                            int childCount = viewGroup2.getChildCount();
                            while (i2 < childCount && viewGroup2.getChildAt(i2) != dVar.f14280b) {
                                i2++;
                            }
                            dVar.f14337R = i2;
                            C5370s.m16789a((View) dVar.f14338S);
                            viewGroup2.addView(dVar.f14338S, i2, new ViewGroup.LayoutParams(dVar.f14280b.getWidth(), dVar.f14280b.getHeight()));
                            viewGroup2.removeView(dVar.f14280b);
                        }
                    }
                    float f = dVar.f14329J;
                    int i3 = (int) ((50.0f * f) + 0.5f);
                    if (a2 >= 0 && i >= 0) {
                        i = (int) (((float) i) * f);
                        a2 = (int) (((float) a2) * f);
                        if (i < i3) {
                            i = i3;
                        }
                        if (a2 < i3) {
                            a2 = i3;
                        }
                    }
                    View view = new View(dVar.mo26554g());
                    view.setBackgroundColor(dVar.mo26554g().getResources().getColor(C4167R.color.ia_mraid_expanded_dimmed_bk));
                    view.setOnTouchListener(new C5426l(dVar));
                    dVar.f14340U.addView(view, new RelativeLayout.LayoutParams(-1, -1));
                    C5370s.m16789a((View) cVar);
                    dVar.f14339T.addView(cVar, new RelativeLayout.LayoutParams(-1, -1));
                    C5370s.m16789a((View) dVar.f14339T);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, a2);
                    layoutParams.addRule(13);
                    dVar.f14340U.addView(dVar.f14339T, layoutParams);
                    C5370s.m16789a((View) dVar.f14340U);
                    dVar.f14322C.addView(dVar.f14340U, new ViewGroup.LayoutParams(-1, -1));
                    if (!cVar.hasFocus()) {
                        cVar.requestFocus();
                    }
                    C5407d.C5415h hVar = dVar.f14320A;
                    if (hVar == C5407d.C5415h.ALWAYS_VISIBLE || (!dVar.f14328I && hVar != C5407d.C5415h.ALWAYS_HIDDEN)) {
                        dVar.mo26551c(true);
                    }
                    C4502a0 a0Var = C4502a0.EXPANDED;
                    dVar.f14345y = a0Var;
                    dVar.mo26546a((C4522t) new C4527y(a0Var));
                    int i4 = dVar.f14334O;
                    if (!(i4 == -1 || dVar.f14335P == -1)) {
                        dVar.mo26546a((C4522t) new C4521s(C5350l.m16765c(i4), C5350l.m16765c(dVar.f14335P)));
                    }
                    L l2 = dVar.f14285g;
                    if (l2 != null) {
                        ((C5407d.C5413f) l2).mo24964a(dVar);
                    }
                } catch (Exception unused) {
                    IAlog.m16703e("Couldn't find content in the view tree", new Object[0]);
                    dVar.mo26545a(C4508f.RESIZE, "Ad can be resized only if it's state is default or resized.");
                }
            } else {
                dVar.mo26545a(C4508f.EXPAND, "URL passed to expand() was invalid.");
            }
        }
    }

    /* renamed from: c */
    public String mo24707c() {
        return this.f11163b.get("url");
    }
}
