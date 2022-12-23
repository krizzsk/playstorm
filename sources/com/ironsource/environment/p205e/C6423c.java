package com.ironsource.environment.p205e;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo75040bv = {1, 0, 3}, mo75041d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007J\u001a\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007J\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo75042d2 = {"Lcom/ironsource/environment/thread/IronSourceThreadManager;", "", "()V", "backgroundHandler", "Lcom/ironsource/environment/thread/IronSourceHandlerThread;", "uiHandler", "Landroid/os/Handler;", "postBackgroundTask", "", "action", "Ljava/lang/Runnable;", "delay", "", "postOnUiThreadTask", "removeBackgroundTask", "removeUiThreadTask", "environment_release"}, mo75043k = 1, mo75044mv = {1, 4, 2})
/* renamed from: com.ironsource.environment.e.c */
public final class C6423c {

    /* renamed from: a */
    public static final C6423c f16330a = new C6423c();

    /* renamed from: b */
    private static final Handler f16331b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private static final C6422b f16332c;

    static {
        C6422b bVar = new C6422b("background");
        bVar.start();
        bVar.mo35931a();
        f16332c = bVar;
    }

    private C6423c() {
    }

    /* renamed from: a */
    public static void m19277a(Runnable runnable, long j) {
        Intrinsics.checkNotNullParameter(runnable, "action");
        f16331b.postDelayed(runnable, j);
    }

    /* renamed from: b */
    public static void m19279b(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "action");
        f16331b.removeCallbacks(runnable);
    }

    /* renamed from: b */
    public static void m19280b(Runnable runnable, long j) {
        Intrinsics.checkNotNullParameter(runnable, "action");
        f16332c.mo35932a(runnable, j);
    }

    /* renamed from: a */
    public final void mo35933a(Runnable runnable) {
        m19277a(runnable, 0);
    }

    /* renamed from: c */
    public final void mo35934c(Runnable runnable) {
        m19280b(runnable, 0);
    }
}
