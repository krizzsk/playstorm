package com.fyber.inneractive.sdk.activities;

import android.view.View;

/* renamed from: com.fyber.inneractive.sdk.activities.c */
public class C4176c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ InneractiveInternalBrowserActivity f10343a;

    public C4176c(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f10343a = inneractiveInternalBrowserActivity;
    }

    public void onClick(View view) {
        if (this.f10343a.f10332d.canGoBack()) {
            this.f10343a.f10332d.goBack();
        }
    }
}
