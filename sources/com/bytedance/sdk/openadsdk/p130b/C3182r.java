package com.bytedance.sdk.openadsdk.p130b;

import com.bytedance.sdk.openadsdk.multipro.p184c.C3957a;
import com.bytedance.sdk.openadsdk.p172h.p175c.C3837c;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.b.r */
/* compiled from: StatsDispatcher4MultiProcess */
public class C3182r extends C3152c<C3837c.C3840a> {

    /* renamed from: a */
    private AtomicBoolean f7541a = new AtomicBoolean(false);

    /* renamed from: b */
    private boolean f7542b = true;

    /* renamed from: b */
    public void mo18744b() {
    }

    public C3182r(boolean z) {
        this.f7542b = z;
    }

    /* renamed from: a */
    public void mo18742a() {
        if (!this.f7541a.getAndSet(true)) {
            C3957a.m12917a(this.f7542b);
        }
    }

    /* renamed from: a */
    public void mo18743a(C3837c.C3840a aVar) {
        if (!this.f7541a.get()) {
            mo18742a();
        }
        if (this.f7541a.get()) {
            C3957a.m12915a(aVar.mo20684a(), this.f7542b);
        }
    }
}
