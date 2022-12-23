package com.fyber.inneractive.sdk.util;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.util.C5314b0;

/* renamed from: com.fyber.inneractive.sdk.util.a0 */
public class C5312a0 extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ C5314b0 f14146a;

    public C5312a0(C5314b0 b0Var) {
        this.f14146a = b0Var;
    }

    public void onReceive(Context context, Intent intent) {
        boolean z;
        C5314b0 b0Var = this.f14146a;
        b0Var.getClass();
        IAlog.m16699a("%sonReceive. action = %s", IAlog.m16696a((Object) b0Var), intent.getAction());
        C5314b0 b0Var2 = this.f14146a;
        synchronized (b0Var2) {
            try {
                z = ((KeyguardManager) context.getSystemService("keyguard")).isKeyguardLocked();
            } catch (Exception unused) {
                IAlog.m16699a("%sFailed to get lock screen status", IAlog.m16696a((Object) b0Var2));
                z = false;
            }
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                b0Var2.f14148b = true;
            } else if (("android.intent.action.SCREEN_ON".equals(intent.getAction()) && !z) || "android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                b0Var2.f14148b = false;
            }
            IAlog.m16699a("%sNew screen state is locked: %s. number of listeners: %d", IAlog.m16696a((Object) b0Var2), Boolean.valueOf(b0Var2.f14148b), Integer.valueOf(b0Var2.f14147a.size()));
            for (C5314b0.C5316b b : b0Var2.f14147a) {
                b.mo26339b(b0Var2.f14148b);
            }
        }
    }
}
