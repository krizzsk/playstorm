package com.ogury.p375cm.internal;

import android.content.Context;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.ogury.cm.internal.aacca */
public abstract class aacca {

    /* renamed from: a */
    private final aacbc f25675a;

    public aacca(aacbc aacbc) {
        bbabc.m30943b(aacbc, "requestScheduler");
        this.f25675a = aacbc;
    }

    /* renamed from: a */
    public final aacbc mo66536a() {
        return this.f25675a;
    }

    /* renamed from: a */
    public abstract void mo66537a(Context context, acabc acabc, CountDownLatch countDownLatch);
}
