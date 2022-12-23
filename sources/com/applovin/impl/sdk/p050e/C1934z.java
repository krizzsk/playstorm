package com.applovin.impl.sdk.p050e;

import com.applovin.impl.sdk.C1959m;

/* renamed from: com.applovin.impl.sdk.e.z */
public class C1934z extends C1877a {

    /* renamed from: a */
    private final Runnable f3585a;

    public C1934z(C1959m mVar, Runnable runnable) {
        this(mVar, false, runnable);
    }

    public C1934z(C1959m mVar, boolean z, Runnable runnable) {
        super("TaskRunnable", mVar, z);
        this.f3585a = runnable;
    }

    public void run() {
        this.f3585a.run();
    }
}
