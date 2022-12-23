package com.bytedance.sdk.component.p120e.p124d;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.sdk.component.e.d.g */
/* compiled from: WeakHandler */
public class C2942g extends Handler {

    /* renamed from: a */
    private final WeakReference<C2943a> f6679a;

    /* renamed from: com.bytedance.sdk.component.e.d.g$a */
    /* compiled from: WeakHandler */
    public interface C2943a {
        /* renamed from: a */
        void mo17801a(Message message);
    }

    public C2942g(Looper looper, C2943a aVar) {
        super(looper);
        this.f6679a = new WeakReference<>(aVar);
    }

    public void handleMessage(Message message) {
        C2943a aVar = (C2943a) this.f6679a.get();
        if (aVar != null && message != null) {
            aVar.mo17801a(message);
        }
    }
}
