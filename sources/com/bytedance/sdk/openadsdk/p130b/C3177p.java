package com.bytedance.sdk.openadsdk.p130b;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.sdk.openadsdk.b.p */
/* compiled from: OpenAppSuccEvent */
public class C3177p {

    /* renamed from: a */
    private static volatile C3177p f7527a;

    /* renamed from: b */
    private HandlerThread f7528b;

    /* renamed from: c */
    private final Handler f7529c;

    /* renamed from: d */
    private final Executor f7530d = Executors.newCachedThreadPool();

    /* renamed from: e */
    private C3180b f7531e = C3180b.m9311a();

    /* renamed from: f */
    private Map<String, Object> f7532f;

    /* renamed from: a */
    public static C3177p m9301a() {
        if (f7527a == null) {
            synchronized (C3177p.class) {
                if (f7527a == null) {
                    f7527a = new C3177p();
                }
            }
        }
        return f7527a;
    }

    private C3177p() {
        if (this.f7528b == null) {
            HandlerThread handlerThread = new HandlerThread("OpenAppSuccEvent_HandlerThread", 10);
            this.f7528b = handlerThread;
            handlerThread.start();
        }
        this.f7529c = new Handler(this.f7528b.getLooper(), new Handler.Callback() {
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.bytedance.sdk.openadsdk.b.p$a} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean handleMessage(android.os.Message r3) {
                /*
                    r2 = this;
                    int r0 = r3.what
                    r1 = 100
                    if (r0 != r1) goto L_0x001d
                    r0 = 0
                    java.lang.Object r1 = r3.obj
                    if (r1 == 0) goto L_0x0016
                    java.lang.Object r1 = r3.obj
                    boolean r1 = r1 instanceof com.bytedance.sdk.openadsdk.p130b.C3177p.C3179a
                    if (r1 == 0) goto L_0x0016
                    java.lang.Object r3 = r3.obj
                    r0 = r3
                    com.bytedance.sdk.openadsdk.b.p$a r0 = (com.bytedance.sdk.openadsdk.p130b.C3177p.C3179a) r0
                L_0x0016:
                    if (r0 == 0) goto L_0x001d
                    com.bytedance.sdk.openadsdk.b.p r3 = com.bytedance.sdk.openadsdk.p130b.C3177p.this
                    r3.m9304b(r0)
                L_0x001d:
                    r3 = 1
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p130b.C3177p.C31781.handleMessage(android.os.Message):boolean");
            }
        });
    }

    /* renamed from: a */
    public void mo18797a(C3498n nVar, String str) {
        Message obtainMessage = this.f7529c.obtainMessage();
        obtainMessage.what = 100;
        obtainMessage.obj = C3179a.m9307a(nVar, str, this.f7532f);
        obtainMessage.sendToTarget();
    }

    /* renamed from: a */
    private void m9302a(C3179a aVar) {
        if (aVar != null) {
            aVar.mo18801b();
            if (aVar.mo18799a() * this.f7531e.f7539a > this.f7531e.f7540b) {
                m9305c(aVar.mo18800a(false));
                return;
            }
            Message obtainMessage = this.f7529c.obtainMessage();
            obtainMessage.what = 100;
            obtainMessage.obj = aVar;
            this.f7529c.sendMessageDelayed(obtainMessage, (long) this.f7531e.f7539a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m9304b(C3179a aVar) {
        if (aVar != null) {
            Context a = C3578m.m11231a();
            if (C4014u.m13209c(a, a.getPackageName())) {
                m9302a(aVar);
            } else {
                m9305c(aVar.mo18800a(true));
            }
        }
    }

    /* renamed from: c */
    private void m9305c(C3179a aVar) {
        if (aVar != null) {
            this.f7530d.execute(aVar);
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.b.p$a */
    /* compiled from: OpenAppSuccEvent */
    private static class C3179a implements Serializable, Runnable {

        /* renamed from: a */
        public final AtomicInteger f7534a = new AtomicInteger(0);

        /* renamed from: b */
        public final AtomicBoolean f7535b = new AtomicBoolean(false);

        /* renamed from: c */
        public C3498n f7536c;

        /* renamed from: d */
        public String f7537d;

        /* renamed from: e */
        public Map<String, Object> f7538e;

        /* renamed from: a */
        public static C3179a m9307a(C3498n nVar, String str, Map<String, Object> map) {
            return new C3179a(nVar, str, map);
        }

        public C3179a() {
        }

        public C3179a(C3498n nVar, String str, Map<String, Object> map) {
            this.f7536c = nVar;
            this.f7537d = str;
            this.f7538e = map;
        }

        /* renamed from: a */
        public C3179a mo18800a(boolean z) {
            this.f7535b.set(z);
            return this;
        }

        /* renamed from: a */
        public int mo18799a() {
            return this.f7534a.get();
        }

        /* renamed from: b */
        public void mo18801b() {
            this.f7534a.incrementAndGet();
        }

        public void run() {
            if (this.f7536c == null || TextUtils.isEmpty(this.f7537d)) {
                C2975l.m8377a("materialMeta or eventTag is null, pls check");
            } else {
                C3156e.m9200d(C3578m.m11231a(), this.f7536c, this.f7537d, this.f7535b.get() ? "dpl_success" : "dpl_failed", this.f7538e);
            }
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.b.p$b */
    /* compiled from: OpenAppSuccEvent */
    private static class C3180b {

        /* renamed from: a */
        public int f7539a = 500;

        /* renamed from: b */
        public int f7540b = 5000;

        /* renamed from: a */
        public static C3180b m9311a() {
            return new C3180b();
        }
    }
}
