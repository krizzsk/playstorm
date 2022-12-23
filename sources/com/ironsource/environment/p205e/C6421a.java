package com.ironsource.environment.p205e;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo75040bv = {1, 0, 3}, mo75041d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007J\u001a\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007J\u001a\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo75042d2 = {"Lcom/ironsource/environment/thread/ISAdPlayerThreadManager;", "", "()V", "backgroundHandler", "Lcom/ironsource/environment/thread/IronSourceHandlerThread;", "publisherCallbackHandler", "uiHandler", "Landroid/os/Handler;", "getBackgroundThreadLooper", "Landroid/os/Looper;", "postBackgroundTask", "", "action", "Ljava/lang/Runnable;", "delay", "", "postCallbacks", "postOnUiThreadTask", "environment_release"}, mo75043k = 1, mo75044mv = {1, 4, 2})
/* renamed from: com.ironsource.environment.e.a */
public final class C6421a {

    /* renamed from: a */
    public static final C6421a f16325a = new C6421a();

    /* renamed from: b */
    private static final Handler f16326b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private static final C6422b f16327c;

    /* renamed from: d */
    private static final C6422b f16328d;

    static {
        C6422b bVar = new C6422b("isadplayer-background");
        bVar.start();
        bVar.mo35931a();
        f16327c = bVar;
        C6422b bVar2 = new C6422b("isadplayer-publisher-callbacks");
        bVar2.start();
        bVar2.mo35931a();
        f16328d = bVar2;
    }

    private C6421a() {
    }

    /* renamed from: a */
    public static Looper m19270a() {
        return f16327c.getLooper();
    }

    /* renamed from: a */
    public final void mo35928a(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "action");
        f16326b.postDelayed(runnable, 0);
    }

    /* renamed from: b */
    public final void mo35929b(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "action");
        f16327c.mo35932a(runnable, 0);
    }

    /* renamed from: c */
    public final void mo35930c(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "action");
        f16328d.mo35932a(runnable, 0);
    }
}
