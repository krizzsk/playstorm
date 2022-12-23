package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.sdk.component.utils.x */
/* compiled from: WeakHandler */
public class C2989x extends Handler {

    /* renamed from: a */
    private final WeakReference<C2990a> f6767a;

    /* renamed from: com.bytedance.sdk.component.utils.x$a */
    /* compiled from: WeakHandler */
    public interface C2990a {
        /* renamed from: a */
        void mo17318a(Message message);
    }

    public C2989x(C2990a aVar) {
        this.f6767a = new WeakReference<>(aVar);
    }

    public C2989x(Looper looper, C2990a aVar) {
        super(looper);
        this.f6767a = new WeakReference<>(aVar);
    }

    public void handleMessage(Message message) {
        C2990a aVar = (C2990a) this.f6767a.get();
        if (aVar != null && message != null) {
            aVar.mo17318a(message);
        }
    }
}
