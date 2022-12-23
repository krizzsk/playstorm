package com.ogury.core.internal.aaid;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import com.ogury.core.internal.C10219ai;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.ogury.core.internal.aaid.b */
/* compiled from: AdvertisingConnection.kt */
public final class C10207b implements ServiceConnection {

    /* renamed from: a */
    private final LinkedBlockingQueue<IBinder> f25986a = new LinkedBlockingQueue<>(1);

    /* renamed from: b */
    private boolean f25987b;

    public final void onServiceDisconnected(ComponentName componentName) {
        C10219ai.m31036b(componentName, "name");
    }

    /* renamed from: a */
    public final IBinder mo66769a() throws InterruptedException {
        if (!this.f25987b) {
            this.f25987b = true;
            IBinder take = this.f25986a.take();
            if (take != null) {
                return take;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.IBinder");
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C10219ai.m31036b(componentName, "name");
        C10219ai.m31036b(iBinder, NotificationCompat.CATEGORY_SERVICE);
        try {
            this.f25986a.put(iBinder);
        } catch (InterruptedException unused) {
        }
    }
}
