package com.ogury.p375cm.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.ogury.cm.internal.ababc */
public final class ababc implements abacc {

    /* renamed from: a */
    private final ExecutorService f25704a = Executors.newFixedThreadPool(3);

    /* renamed from: a */
    public final void mo66550a(bbaaa<babcc> bbaaa) {
        bbabc.m30943b(bbaaa, "action");
        this.f25704a.execute(new abaca(bbaaa));
    }
}
