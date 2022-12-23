package com.ogury.p376ed.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import p394io.presage.mraid.browser.listeners.CloseSystemDialogsListener$1;

/* renamed from: com.ogury.ed.internal.hy */
public final class C10612hy {

    /* renamed from: a */
    private final Context f26786a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C10598hp f26787b;

    /* renamed from: c */
    private final BroadcastReceiver f26788c = new CloseSystemDialogsListener$1(this);

    public C10612hy(Context context, C10598hp hpVar) {
        C10765mq.m32773b(context, "context");
        C10765mq.m32773b(hpVar, "multiWebViewCommandExecutor");
        this.f26786a = context;
        this.f26787b = hpVar;
        m32334b();
    }

    /* renamed from: b */
    private final void m32334b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.CLOSE_SYSTEM_DIALOGS");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        this.f26786a.registerReceiver(this.f26788c, intentFilter);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m32336c() {
        this.f26787b.mo67565b();
    }

    /* renamed from: a */
    public final void mo67606a() {
        try {
            this.f26786a.unregisterReceiver(this.f26788c);
        } catch (Throwable th) {
            C10559gl.m32093a(th);
        }
    }
}
