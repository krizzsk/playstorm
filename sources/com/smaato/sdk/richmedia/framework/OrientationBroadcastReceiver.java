package com.smaato.sdk.richmedia.framework;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.smaato.sdk.core.util.Whatever;
import com.smaato.sdk.core.util.notifier.ChangeSender;
import java.util.concurrent.atomic.AtomicBoolean;

final class OrientationBroadcastReceiver extends BroadcastReceiver {
    private final Context context;
    private final AtomicBoolean isRegistered = new AtomicBoolean();
    private final ChangeSender<Whatever> orientationChangeSender;

    /* JADX WARNING: type inference failed for: r3v0, types: [com.smaato.sdk.core.util.notifier.ChangeSender<com.smaato.sdk.core.util.Whatever>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    OrientationBroadcastReceiver(android.content.Context r2, com.smaato.sdk.core.util.notifier.ChangeSender<com.smaato.sdk.core.util.Whatever> r3) {
        /*
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r1.isRegistered = r0
            java.lang.Object r2 = com.smaato.sdk.core.util.Objects.requireNonNull(r2)
            android.content.Context r2 = (android.content.Context) r2
            r1.context = r2
            java.lang.Object r2 = com.smaato.sdk.core.util.Objects.requireNonNull(r3)
            com.smaato.sdk.core.util.notifier.ChangeSender r2 = (com.smaato.sdk.core.util.notifier.ChangeSender) r2
            r1.orientationChangeSender = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.richmedia.framework.OrientationBroadcastReceiver.<init>(android.content.Context, com.smaato.sdk.core.util.notifier.ChangeSender):void");
    }

    /* access modifiers changed from: package-private */
    public ChangeSender<Whatever> getOrientationChangeSender() {
        return this.orientationChangeSender;
    }

    /* access modifiers changed from: package-private */
    public void register() {
        if (this.isRegistered.compareAndSet(false, true)) {
            this.context.registerReceiver(this, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
        }
    }

    /* access modifiers changed from: package-private */
    public void unregister() {
        if (this.isRegistered.compareAndSet(true, false)) {
            this.context.unregisterReceiver(this);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isRegistered() {
        return this.isRegistered.get();
    }

    public void onReceive(Context context2, Intent intent) {
        if (intent != null && "android.intent.action.CONFIGURATION_CHANGED".equals(intent.getAction())) {
            this.orientationChangeSender.newValue(Whatever.INSTANCE);
        }
    }
}
