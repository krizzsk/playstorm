package com.fyber.inneractive.sdk.web;

import android.view.KeyEvent;
import android.view.View;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.web.h */
public class C5422h implements View.OnKeyListener {

    /* renamed from: a */
    public final /* synthetic */ C5407d f14370a;

    public C5422h(C5407d dVar) {
        this.f14370a = dVar;
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (i != 4 || !this.f14370a.mo26555h()) {
            return false;
        }
        IAlog.m16702d("back button pressed while ad is expanded, ad will be collapsed.", new Object[0]);
        this.f14370a.mo26553f();
        return true;
    }
}
