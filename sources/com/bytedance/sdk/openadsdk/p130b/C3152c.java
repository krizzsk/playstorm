package com.bytedance.sdk.openadsdk.p130b;

import android.os.Handler;
import android.os.Message;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.C3581n;
import com.bytedance.sdk.openadsdk.p130b.C3161h;
import com.bytedance.sdk.openadsdk.p130b.C3168k;
import com.bytedance.sdk.openadsdk.p172h.p175c.C3837c;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.b.c */
/* compiled from: AdEventDispatcher */
public class C3152c<T extends C3168k> {

    /* renamed from: a */
    private C3161h<T> f7452a;

    /* renamed from: b */
    private Handler f7453b;

    /* renamed from: c */
    private C3161h<T> f7454c;

    /* renamed from: d */
    private Handler f7455d;

    /* renamed from: e */
    private AtomicBoolean f7456e;

    public C3152c(C3159f<T> fVar, C3581n<T> nVar, C3161h.C3164b bVar, C3161h.C3163a aVar) {
        this.f7452a = new C3161h<>(fVar, nVar, bVar, aVar);
        this.f7454c = new C3169l(new C3170m(C3578m.m11231a()), nVar, bVar, aVar);
        this.f7456e = new AtomicBoolean(false);
    }

    public C3152c(C3159f<T> fVar, C3581n<T> nVar, C3161h.C3164b bVar, C3161h.C3163a aVar, C3161h<T> hVar) {
        this.f7452a = hVar;
        this.f7454c = new C3169l(new C3170m(C3578m.m11231a()), nVar, bVar, aVar);
        this.f7456e = new AtomicBoolean(false);
    }

    C3152c() {
    }

    /* renamed from: a */
    public synchronized void mo18742a() {
        try {
            if (this.f7456e != null && !this.f7456e.get()) {
                if (this.f7452a.getLooper() == null) {
                    this.f7452a.start();
                    Handler handler = new Handler(this.f7452a.getLooper(), this.f7452a);
                    this.f7453b = handler;
                    Message obtainMessage = handler.obtainMessage();
                    obtainMessage.what = 5;
                    this.f7453b.sendMessageDelayed(obtainMessage, 10000);
                }
                if (this.f7454c.getLooper() == null) {
                    this.f7454c.start();
                    Handler handler2 = new Handler(this.f7454c.getLooper(), this.f7454c);
                    this.f7455d = handler2;
                    Message obtainMessage2 = handler2.obtainMessage();
                    obtainMessage2.what = 5;
                    this.f7455d.sendMessageDelayed(obtainMessage2, 10000);
                }
                this.f7456e.set(true);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public void mo18744b() {
        this.f7456e.set(false);
        this.f7452a.quit();
        this.f7454c.quit();
        this.f7453b.removeCallbacksAndMessages((Object) null);
        this.f7455d.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: a */
    public void mo18743a(T t) {
        if (!this.f7456e.get()) {
            mo18742a();
        }
        if (t.mo18658e()) {
            Message obtainMessage = this.f7455d.obtainMessage();
            obtainMessage.what = 1;
            obtainMessage.obj = t;
            this.f7455d.sendMessage(obtainMessage);
            return;
        }
        Message obtainMessage2 = this.f7453b.obtainMessage();
        obtainMessage2.what = 1;
        obtainMessage2.obj = t;
        this.f7453b.sendMessage(obtainMessage2);
    }

    /* renamed from: c */
    public static C3153a m9146c() {
        return C3153a.m9151e();
    }

    /* renamed from: d */
    public static C3154b m9147d() {
        return C3154b.m9156e();
    }

    /* renamed from: com.bytedance.sdk.openadsdk.b.c$a */
    /* compiled from: AdEventDispatcher */
    private static class C3153a extends C3152c<C3126a> {

        /* renamed from: a */
        private static volatile C3153a f7457a;

        /* renamed from: a */
        public void mo18743a(C3126a aVar) {
        }

        /* renamed from: b */
        public void mo18744b() {
        }

        /* renamed from: e */
        public static C3153a m9151e() {
            if (f7457a == null) {
                synchronized (C3153a.class) {
                    if (f7457a == null) {
                        f7457a = new C3153a();
                    }
                }
            }
            return f7457a;
        }

        C3153a() {
        }

        /* renamed from: a */
        public synchronized void mo18742a() {
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.b.c$b */
    /* compiled from: AdEventDispatcher */
    private static class C3154b extends C3152c<C3837c.C3840a> {

        /* renamed from: a */
        private static volatile C3154b f7458a;

        /* renamed from: a */
        public void mo18743a(C3837c.C3840a aVar) {
        }

        /* renamed from: b */
        public void mo18744b() {
        }

        /* renamed from: e */
        public static C3154b m9156e() {
            if (f7458a == null) {
                synchronized (C3154b.class) {
                    if (f7458a == null) {
                        f7458a = new C3154b();
                    }
                }
            }
            return f7458a;
        }

        C3154b() {
        }

        /* renamed from: a */
        public synchronized void mo18742a() {
        }
    }
}
