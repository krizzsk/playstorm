package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.C5384w0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.TimeUnit;

/* renamed from: com.fyber.inneractive.sdk.flow.r */
public class C4431r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ long f10953a;

    /* renamed from: b */
    public final /* synthetic */ C4433s f10954b;

    /* renamed from: com.fyber.inneractive.sdk.flow.r$a */
    public class C4432a implements Runnable {
        public C4432a() {
        }

        public void run() {
            C4433s sVar = C4431r.this.f10954b;
            sVar.mo24628e(!sVar.f10965t);
            C4431r.this.f10954b.f10959n = null;
        }
    }

    public C4431r(C4433s sVar, long j) {
        this.f10954b = sVar;
        this.f10953a = j;
    }

    public void run() {
        if (this.f10954b.mo24407E()) {
            C4433s sVar = this.f10954b;
            sVar.f10959n = new C4432a();
            long a = sVar.mo24412a(this.f10953a);
            C4433s sVar2 = this.f10954b;
            sVar2.getClass();
            C5384w0 w0Var = new C5384w0(TimeUnit.MILLISECONDS, a);
            sVar2.f10960o = w0Var;
            w0Var.f14266e = new C4436t(sVar2);
            w0Var.mo26486c();
            C4433s sVar3 = this.f10954b;
            sVar3.getClass();
            IAlog.m16699a("%sad contains custom close. Will show transparent x in %d", IAlog.m16696a((Object) sVar3), Long.valueOf(a));
            this.f10954b.f10957l = null;
            return;
        }
        C4433s sVar4 = this.f10954b;
        sVar4.getClass();
        IAlog.m16699a("%sad does not contain custom close. Showing close button", IAlog.m16696a((Object) sVar4));
        this.f10954b.mo24628e(false);
    }
}
