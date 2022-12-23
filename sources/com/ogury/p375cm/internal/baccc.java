package com.ogury.p375cm.internal;

import android.content.Context;
import java.io.Closeable;

/* renamed from: com.ogury.cm.internal.baccc */
public final class baccc {

    /* renamed from: a */
    private boolean f25920a;

    /* renamed from: a */
    public static final void m30930a(Closeable closeable, Throwable th) {
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            bbabc.m30943b(th, "receiver$0");
            bbabc.m30943b(th2, "exception");
            bacca.f25919a.mo66718a(th, th2);
        }
    }

    /* renamed from: a */
    public final void mo66719a(Context context) {
        bbabc.m30943b(context, "context");
        boolean z = false;
        if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 2) != 0) {
            z = true;
        }
        this.f25920a = z;
    }
}
