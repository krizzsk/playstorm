package com.mbridge.msdk.foundation.same.net;

import android.os.Handler;
import com.mbridge.msdk.foundation.same.net.p305a.C8452a;
import java.util.concurrent.Executor;

/* renamed from: com.mbridge.msdk.foundation.same.net.d */
/* compiled from: ExecutorDelivery */
public class C8458d implements C8455c {

    /* renamed from: a */
    private final String f20444a = C8458d.class.getSimpleName();

    /* renamed from: b */
    private final Executor f20445b;

    public C8458d(final Handler handler) {
        this.f20445b = new Executor() {
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    /* renamed from: a */
    public final void mo57552a(C8498i<?> iVar, C8501k<?> kVar) {
        Executor executor = this.f20445b;
        if (executor != null) {
            executor.execute(new C8466a(iVar, kVar));
        }
    }

    /* renamed from: a */
    public final void mo57551a(C8498i<?> iVar, C8452a aVar) {
        if (this.f20445b != null) {
            this.f20445b.execute(new C8466a(iVar, C8501k.m24569a(aVar)));
        }
    }

    /* renamed from: a */
    public final void mo57549a(final C8498i<?> iVar) {
        Executor executor = this.f20445b;
        if (executor != null) {
            executor.execute(new Runnable() {
                public final void run() {
                    iVar.mo57634p();
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo57553b(final C8498i<?> iVar) {
        Executor executor = this.f20445b;
        if (executor != null) {
            executor.execute(new Runnable() {
                public final void run() {
                    iVar.mo57632n();
                }
            });
        }
    }

    /* renamed from: c */
    public final void mo57554c(final C8498i<?> iVar) {
        Executor executor = this.f20445b;
        if (executor != null) {
            executor.execute(new Runnable() {
                public final void run() {
                    iVar.mo57633o();
                }
            });
        }
    }

    /* renamed from: d */
    public final void mo57555d(final C8498i<?> iVar) {
        Executor executor = this.f20445b;
        if (executor != null) {
            executor.execute(new Runnable() {
                public final void run() {
                    iVar.mo57636r();
                }
            });
        }
    }

    /* renamed from: e */
    public final void mo57556e(final C8498i<?> iVar) {
        Executor executor = this.f20445b;
        if (executor != null) {
            executor.execute(new Runnable() {
                public final void run() {
                    iVar.mo57635q();
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo57550a(C8498i<?> iVar, long j, long j2) {
        Executor executor = this.f20445b;
        if (executor != null) {
            final C8498i<?> iVar2 = iVar;
            final long j3 = j;
            final long j4 = j2;
            executor.execute(new Runnable() {
                public final void run() {
                    iVar2.mo57614a(j3, j4);
                }
            });
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.same.net.d$a */
    /* compiled from: ExecutorDelivery */
    private class C8466a implements Runnable {

        /* renamed from: b */
        private final C8498i f20463b;

        /* renamed from: c */
        private final C8501k f20464c;

        public C8466a(C8498i iVar, C8501k kVar) {
            this.f20463b = iVar;
            this.f20464c = kVar;
        }

        public final void run() {
            if (this.f20463b.mo57622c()) {
                this.f20463b.mo57618a("canceled-at-delivery");
                this.f20463b.mo57632n();
                return;
            }
            if (this.f20464c.f20595b == null) {
                this.f20463b.mo57617a(this.f20464c);
            } else {
                this.f20463b.mo57615a(this.f20464c.f20595b);
            }
            this.f20463b.mo57618a("done");
            this.f20463b.mo57634p();
        }
    }
}
