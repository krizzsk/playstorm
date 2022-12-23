package com.ogury.core.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: OguryBroadcastEventBus.kt */
public final class OguryBroadcastEventBus implements OguryEventBus {
    private final List<C10239b> callbacks = new ArrayList();
    private final Handler mainThreadHandler = new Handler(Looper.getMainLooper());

    /* renamed from: com.ogury.core.internal.OguryBroadcastEventBus$b */
    /* compiled from: OguryBroadcastEventBus.kt */
    static final class C10201b extends C10220aj implements C10216af<C10239b, Boolean> {

        /* renamed from: a */
        private /* synthetic */ OguryBroadcastEventBus f25977a;

        /* renamed from: b */
        private /* synthetic */ OguryEventCallback f25978b;

        /* renamed from: c */
        private /* synthetic */ String f25979c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10201b(OguryBroadcastEventBus oguryBroadcastEventBus, OguryEventCallback oguryEventCallback, String str) {
            super(1);
            this.f25977a = oguryBroadcastEventBus;
            this.f25978b = oguryEventCallback;
            this.f25979c = str;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo66754a(Object obj) {
            C10239b bVar = (C10239b) obj;
            C10219ai.m31036b(bVar, "it");
            return Boolean.valueOf(C10219ai.m31035a((Object) bVar.mo66792b(), (Object) this.f25978b) && C10219ai.m31035a((Object) bVar.mo66791a(), (Object) this.f25979c));
        }
    }

    public final void dispatch(String str, String str2) {
        C10219ai.m31036b(str, "event");
        C10219ai.m31036b(str2, "message");
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.callbacks) {
            Collection arrayList = new ArrayList();
            for (Object next : this.callbacks) {
                if (C10219ai.m31035a((Object) ((C10239b) next).mo66791a(), (Object) str)) {
                    arrayList.add(next);
                }
            }
            for (C10239b sendEventOnMainThread : (List) arrayList) {
                sendEventOnMainThread(sendEventOnMainThread, str2, currentTimeMillis);
            }
            C10277g gVar = C10277g.f26074a;
        }
    }

    /* renamed from: com.ogury.core.internal.OguryBroadcastEventBus$a */
    /* compiled from: OguryBroadcastEventBus.kt */
    static final class C10200a implements Runnable {

        /* renamed from: a */
        private /* synthetic */ C10239b f25974a;

        /* renamed from: b */
        private /* synthetic */ String f25975b;

        /* renamed from: c */
        private /* synthetic */ long f25976c;

        C10200a(C10239b bVar, String str, long j) {
            this.f25974a = bVar;
            this.f25975b = str;
            this.f25976c = j;
        }

        public final void run() {
            this.f25974a.mo66792b().onNewEvent(this.f25974a.mo66791a(), this.f25975b, this.f25976c);
        }
    }

    private final void sendEventOnMainThread(C10239b bVar, String str, long j) {
        this.mainThreadHandler.post(new C10200a(bVar, str, j));
    }

    public final void register(String str, OguryEventCallback oguryEventCallback) {
        C10219ai.m31036b(str, "event");
        C10219ai.m31036b(oguryEventCallback, "callback");
        synchronized (this.callbacks) {
            this.callbacks.add(new C10239b(str, oguryEventCallback));
            C10277g gVar = C10277g.f26074a;
        }
    }

    public final void unregister(String str, OguryEventCallback oguryEventCallback) {
        C10219ai.m31036b(str, "event");
        C10219ai.m31036b(oguryEventCallback, "callback");
        synchronized (this.callbacks) {
            C10281k.m31130a(this.callbacks, new C10201b(this, oguryEventCallback, str));
        }
    }
}
