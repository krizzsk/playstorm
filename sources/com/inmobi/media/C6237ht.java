package com.inmobi.media;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.inmobi.media.ht */
/* compiled from: InMobiThreadFactory */
public final class C6237ht implements ThreadFactory {

    /* renamed from: a */
    private String f15798a;

    public C6237ht(String str) {
        this.f15798a = "TIM-".concat(String.valueOf(str));
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f15798a);
    }
}
