package com.ogury.p376ed.internal;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.ogury.ed.internal.cs */
public final class C10414cs implements C10415ct {

    /* renamed from: a */
    private final Handler f26352a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public final void mo67162a(Runnable runnable) {
        C10765mq.m32773b(runnable, "runnable");
        this.f26352a.post(runnable);
    }
}
