package com.bykv.p068vk.openvk.component.video.api.renderview;

import android.view.SurfaceHolder;
import java.lang.ref.WeakReference;

/* renamed from: com.bykv.vk.openvk.component.video.api.renderview.c */
/* compiled from: WeakSurfaceCallback */
public class C2542c implements SurfaceHolder.Callback {

    /* renamed from: a */
    private final WeakReference<SurfaceHolder.Callback> f5432a;

    public C2542c(SurfaceHolder.Callback callback) {
        this.f5432a = new WeakReference<>(callback);
    }

    /* renamed from: a */
    public SurfaceHolder.Callback mo16505a() {
        return (SurfaceHolder.Callback) this.f5432a.get();
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = (SurfaceHolder.Callback) this.f5432a.get();
        if (callback != null) {
            callback.surfaceCreated(surfaceHolder);
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        SurfaceHolder.Callback callback = (SurfaceHolder.Callback) this.f5432a.get();
        if (callback != null) {
            callback.surfaceChanged(surfaceHolder, i, i2, i3);
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = (SurfaceHolder.Callback) this.f5432a.get();
        if (callback != null) {
            callback.surfaceDestroyed(surfaceHolder);
        }
    }
}
