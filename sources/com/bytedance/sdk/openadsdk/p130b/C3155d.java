package com.bytedance.sdk.openadsdk.p130b;

import com.bytedance.sdk.openadsdk.multipro.p184c.C3957a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.b.d */
/* compiled from: AdEventDispatcher4MultiProcess */
public class C3155d extends C3152c<C3126a> {

    /* renamed from: a */
    private AtomicBoolean f7459a = new AtomicBoolean(false);

    /* renamed from: b */
    public void mo18744b() {
    }

    /* renamed from: a */
    public void mo18742a() {
        if (!this.f7459a.getAndSet(true)) {
            C3957a.m12919c();
        }
    }

    /* renamed from: a */
    public void mo18743a(C3126a aVar) {
        if (!this.f7459a.get()) {
            mo18742a();
        }
        if (this.f7459a.get()) {
            try {
                C3957a.m12914a(aVar.mo18654a());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
