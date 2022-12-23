package com.p374my.tracker.plugins;

import com.p374my.tracker.obfuscated.C10126m;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.my.tracker.plugins.PluginEventTracker */
public final class PluginEventTracker {

    /* renamed from: b */
    private static final Executor f25514b = Executors.newSingleThreadExecutor();

    /* renamed from: a */
    private final C10126m f25515a;

    private PluginEventTracker(C10126m mVar) {
        this.f25515a = mVar;
    }

    public static PluginEventTracker newTracker(C10126m mVar) {
        return new PluginEventTracker(mVar);
    }

    public static void onBackground(Runnable runnable) {
        f25514b.execute(runnable);
    }

    public void trackPluginEvent(int i, byte[] bArr, boolean z, boolean z2, Runnable runnable) {
        this.f25515a.mo66232a(i, bArr, z, z2, runnable);
    }
}
