package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.view.ViewTreeObserver;

/* renamed from: com.fyber.inneractive.sdk.web.e */
public class C5419e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public final /* synthetic */ Context f14366a;

    /* renamed from: b */
    public final /* synthetic */ C5407d f14367b;

    public C5419e(C5407d dVar, Context context) {
        this.f14367b = dVar;
        this.f14366a = context;
    }

    public boolean onPreDraw() {
        C5405c cVar = this.f14367b.f14280b;
        if (cVar == null) {
            return false;
        }
        cVar.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f14367b.mo26544a(this.f14366a, true);
        return false;
    }
}
