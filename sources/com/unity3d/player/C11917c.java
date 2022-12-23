package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: com.unity3d.player.c */
class C11917c {

    /* renamed from: a */
    protected C11936o f29195a = null;

    /* renamed from: b */
    protected C11921f f29196b = null;

    /* renamed from: c */
    protected Context f29197c = null;

    /* renamed from: d */
    protected String f29198d = null;

    /* renamed from: e */
    protected String f29199e = "";

    C11917c(String str, C11921f fVar) {
        this.f29199e = str;
        this.f29196b = fVar;
    }

    /* access modifiers changed from: protected */
    public void reportError(String str) {
        C11921f fVar = this.f29196b;
        if (fVar != null) {
            fVar.reportError(this.f29199e + " Error [" + this.f29198d + "]", str);
            return;
        }
        C11922g.Log(6, this.f29199e + " Error [" + this.f29198d + "]: " + str);
    }

    /* access modifiers changed from: protected */
    public void runOnUiThread(Runnable runnable) {
        Context context = this.f29197c;
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(runnable);
            return;
        }
        C11922g.Log(5, "Not running " + this.f29199e + " from an Activity; Ignoring execution request...");
    }

    /* access modifiers changed from: protected */
    public boolean runOnUiThreadWithSync(final Runnable runnable) {
        boolean z = true;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
            return true;
        }
        final Semaphore semaphore = new Semaphore(0);
        runOnUiThread(new Runnable() {
            public final void run() {
                try {
                    runnable.run();
                } catch (Exception e) {
                    C11917c cVar = C11917c.this;
                    cVar.reportError("Exception unloading Google VR on UI Thread. " + e.getLocalizedMessage());
                } catch (Throwable th) {
                    semaphore.release();
                    throw th;
                }
                semaphore.release();
            }
        });
        try {
            if (!semaphore.tryAcquire(4, TimeUnit.SECONDS)) {
                reportError("Timeout waiting for vr state change!");
                z = false;
            }
            return z;
        } catch (InterruptedException e) {
            reportError("Interrupted while trying to acquire sync lock. " + e.getLocalizedMessage());
            return false;
        }
    }
}
