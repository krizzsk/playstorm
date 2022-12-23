package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.C5357n;
import com.fyber.inneractive.sdk.util.C5384w0;

/* renamed from: com.fyber.inneractive.sdk.flow.t */
public class C4436t implements C5384w0.C5386b {

    /* renamed from: a */
    public final /* synthetic */ C4433s f10970a;

    public C4436t(C4433s sVar) {
        this.f10970a = sVar;
    }

    /* renamed from: a */
    public void mo24274a(C5384w0 w0Var) {
        Runnable runnable = this.f10970a.f10959n;
        if (runnable != null) {
            C5357n.f14225b.post(runnable);
        }
        C4433s sVar = this.f10970a;
        C5384w0 w0Var2 = sVar.f10960o;
        if (w0Var2 != null) {
            w0Var2.f14266e = null;
            sVar.f10960o = null;
        }
    }
}
