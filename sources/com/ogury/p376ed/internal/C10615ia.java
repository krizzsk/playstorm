package com.ogury.p376ed.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import p394io.presage.mraid.browser.listeners.OrientationListener$1;

/* renamed from: com.ogury.ed.internal.ia */
public final class C10615ia {

    /* renamed from: a */
    private final Context f26798a;

    /* renamed from: b */
    private final C10598hp f26799b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f26800c;

    /* renamed from: d */
    private final BroadcastReceiver f26801d = new OrientationListener$1(this);

    public C10615ia(Context context, C10598hp hpVar) {
        C10765mq.m32773b(context, "context");
        C10765mq.m32773b(hpVar, "multiWebViewCommandExecutor");
        this.f26798a = context;
        this.f26799b = hpVar;
        this.f26800c = context.getResources().getConfiguration().orientation;
        m32355b();
    }

    /* renamed from: b */
    private final void m32355b() {
        this.f26798a.registerReceiver(this.f26801d, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m32357c() {
        this.f26799b.mo67566c();
    }

    /* renamed from: a */
    public final void mo67611a() {
        try {
            this.f26798a.unregisterReceiver(this.f26801d);
        } catch (Exception e) {
            C10559gl.m32093a((Throwable) e);
        }
    }
}
