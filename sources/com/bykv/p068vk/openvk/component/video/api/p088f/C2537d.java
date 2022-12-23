package com.bykv.p068vk.openvk.component.video.api.p088f;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.bykv.vk.openvk.component.video.api.f.d */
/* compiled from: WeakHandler */
public class C2537d extends Handler {

    /* renamed from: a */
    private final WeakReference<C2538a> f5425a;

    /* renamed from: com.bykv.vk.openvk.component.video.api.f.d$a */
    /* compiled from: WeakHandler */
    public interface C2538a {
        /* renamed from: a */
        void mo16275a(Message message);
    }

    public C2537d(Looper looper, C2538a aVar) {
        super(looper);
        this.f5425a = new WeakReference<>(aVar);
    }

    public void handleMessage(Message message) {
        C2538a aVar = (C2538a) this.f5425a.get();
        if (aVar != null && message != null) {
            aVar.mo16275a(message);
        }
    }
}
