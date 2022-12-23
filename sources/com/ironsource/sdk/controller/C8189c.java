package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.MutableContextWrapper;

/* renamed from: com.ironsource.sdk.controller.c */
public final class C8189c {

    /* renamed from: a */
    private MutableContextWrapper f19552a;

    /* renamed from: a */
    public final Activity mo56507a() {
        return (Activity) this.f19552a.getBaseContext();
    }

    /* renamed from: a */
    public final synchronized void mo56508a(Activity activity) {
        if (this.f19552a == null) {
            this.f19552a = new MutableContextWrapper(activity);
        }
        this.f19552a.setBaseContext(activity);
    }

    /* renamed from: b */
    public final synchronized void mo56509b() {
        this.f19552a = null;
    }
}
