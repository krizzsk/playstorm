package com.bytedance.sdk.component.adexpress.dynamic.animation.p099a;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2680a;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.a.c */
/* compiled from: AnimatorFactory */
public class C2661c {

    /* renamed from: a */
    private static volatile C2661c f5747a;

    private C2661c() {
    }

    /* renamed from: a */
    public static C2661c m6975a() {
        if (f5747a == null) {
            synchronized (C2661c.class) {
                if (f5747a == null) {
                    f5747a = new C2661c();
                }
            }
        }
        return f5747a;
    }

    /* renamed from: a */
    public C2662d mo16882a(View view, C2680a aVar) {
        if (aVar == null) {
            return null;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).setClipChildren(false);
        }
        if (view.getParent().getParent() != null) {
            ((ViewGroup) view.getParent().getParent()).setClipChildren(false);
        }
        if ("scale".equals(aVar.mo16936h())) {
            return new C2672h(view, aVar);
        }
        if ("translate".equals(aVar.mo16936h())) {
            return new C2675k(view, aVar);
        }
        if ("ripple".equals(aVar.mo16936h())) {
            return new C2668f(view, aVar);
        }
        if ("marquee".equals(aVar.mo16936h())) {
            return new C2667e(view, aVar);
        }
        if ("waggle".equals(aVar.mo16936h())) {
            return new C2676l(view, aVar);
        }
        if ("shine".equals(aVar.mo16936h())) {
            return new C2673i(view, aVar);
        }
        if ("swing".equals(aVar.mo16936h())) {
            return new C2674j(view, aVar);
        }
        if ("fade".equals(aVar.mo16936h())) {
            return new C2659a(view, aVar);
        }
        if ("rubIn".equals(aVar.mo16936h())) {
            return new C2669g(view, aVar);
        }
        return null;
    }
}
