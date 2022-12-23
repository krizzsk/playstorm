package com.bytedance.sdk.component.adexpress.p095b;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.p095b.C2629i;
import com.bytedance.sdk.component.adexpress.p097d.C2645a;
import com.bytedance.sdk.component.p125f.C2952e;
import com.bytedance.sdk.component.utils.C2975l;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.component.adexpress.b.o */
/* compiled from: WebViewRenderInterceptor */
public class C2637o implements C2629i {

    /* renamed from: a */
    private Context f5685a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C2645a f5686b;

    /* renamed from: c */
    private C2627g f5687c;

    /* renamed from: d */
    private C2633l f5688d;

    /* renamed from: e */
    private ScheduledFuture<?> f5689e;

    /* renamed from: f */
    private AtomicBoolean f5690f = new AtomicBoolean(false);

    public C2637o(Context context, C2633l lVar, C2645a aVar, C2627g gVar) {
        this.f5685a = context;
        this.f5688d = lVar;
        this.f5687c = gVar;
        this.f5686b = aVar;
        aVar.mo16815a(this.f5687c);
    }

    /* renamed from: a */
    public boolean mo16712a(final C2629i.C2630a aVar) {
        int d = this.f5688d.mo16752d();
        if (d < 0) {
            m6878a(aVar, 107);
        } else {
            this.f5689e = C2952e.m8318d().schedule(new C2639a(1, aVar), (long) d, TimeUnit.MILLISECONDS);
            this.f5686b.mo16719a((C2626f) new C2626f() {
                /* renamed from: a */
                public void mo16717a(View view, C2635m mVar) {
                    C2636n b;
                    C2637o.this.m6882e();
                    if (!aVar.mo16746c() && (b = aVar.mo16744b()) != null) {
                        b.mo16808a(C2637o.this.f5686b, mVar);
                        aVar.mo16743a(true);
                    }
                }

                /* renamed from: a */
                public void mo16716a(int i) {
                    C2637o.this.m6878a(aVar, i);
                }
            });
        }
        return true;
    }

    /* renamed from: a */
    public void mo16711a() {
        this.f5686b.mo16819d();
        m6882e();
    }

    /* renamed from: b */
    public void mo16713b() {
        this.f5686b.mo16822h();
    }

    /* renamed from: c */
    public void mo16714c() {
        this.f5686b.mo16823i();
    }

    /* renamed from: d */
    public C2645a mo16810d() {
        return this.f5686b;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m6882e() {
        try {
            if (this.f5689e != null && !this.f5689e.isCancelled()) {
                this.f5689e.cancel(false);
                this.f5689e = null;
            }
            C2975l.m8384b("RenderInterceptor", "WebView Render cancel timeout timer");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.b.o$a */
    /* compiled from: WebViewRenderInterceptor */
    private class C2639a implements Runnable {

        /* renamed from: a */
        C2629i.C2630a f5693a;

        /* renamed from: c */
        private int f5695c;

        public C2639a(int i, C2629i.C2630a aVar) {
            this.f5695c = i;
            this.f5693a = aVar;
        }

        public void run() {
            if (this.f5695c == 1) {
                C2975l.m8384b("RenderInterceptor", "WebView Render timeout");
                C2637o.this.f5686b.mo16817a(true);
                C2637o.this.m6878a(this.f5693a, 107);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m6878a(C2629i.C2630a aVar, int i) {
        if (!aVar.mo16746c() && !this.f5690f.get()) {
            m6882e();
            this.f5688d.mo16751c().mo16724a(i);
            if (aVar.mo16745b(this)) {
                aVar.mo16741a((C2629i) this);
            } else {
                C2636n b = aVar.mo16744b();
                if (b != null) {
                    b.mo16809a_(i);
                } else {
                    return;
                }
            }
            this.f5690f.getAndSet(true);
        }
    }
}
