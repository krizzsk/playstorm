package com.ogury.p375cm.internal;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.ogury.cm.internal.abbaa */
public final class abbaa implements abacc {

    /* renamed from: a */
    private final Handler f25711a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public final void mo66550a(bbaaa<babcc> bbaaa) {
        bbabc.m30943b(bbaaa, "action");
        this.f25711a.post(new abbab(bbaaa));
    }
}
