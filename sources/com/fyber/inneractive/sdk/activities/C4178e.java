package com.fyber.inneractive.sdk.activities;

import android.view.View;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.activities.e */
public class C4178e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ InneractiveInternalBrowserActivity f10345a;

    public C4178e(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f10345a = inneractiveInternalBrowserActivity;
    }

    public void onClick(View view) {
        this.f10345a.f10332d.reload();
        int i = IAlog.f14137a;
        IAlog.m16697a(1, (Exception) null, "%s %s", "AD_INTERNAL_BROWSER_REFRESH", this.f10345a.f10332d.getUrl());
    }
}
