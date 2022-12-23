package com.fyber.inneractive.sdk.activities;

import android.view.View;

/* renamed from: com.fyber.inneractive.sdk.activities.d */
public class C4177d implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ InneractiveInternalBrowserActivity f10344a;

    public C4177d(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f10344a = inneractiveInternalBrowserActivity;
    }

    public void onClick(View view) {
        if (this.f10344a.f10332d.canGoForward()) {
            this.f10344a.f10332d.goForward();
        }
    }
}
