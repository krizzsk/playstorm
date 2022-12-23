package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.fyber.inneractive.sdk.util.n0 */
public class C5360n0 extends Handler {

    /* renamed from: a */
    public final WeakReference<C5362o0> f14227a;

    public C5360n0(Looper looper, C5362o0 o0Var) {
        super(looper);
        this.f14227a = new WeakReference<>(o0Var);
    }

    public void handleMessage(Message message) {
        super.handleMessage(message);
        C5362o0 o0Var = (C5362o0) C5370s.m16784a(this.f14227a);
        if (o0Var != null) {
            o0Var.handleMessage(message);
        }
    }
}
