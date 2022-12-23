package com.smaato.sdk.video.vast.widget;

import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.video.vast.widget.SurfaceViewVastSurfaceHolder;
import com.smaato.sdk.video.vast.widget.VastSurfaceHolder;

public class SurfaceViewVastSurfaceHolder implements VastSurfaceHolder {
    /* access modifiers changed from: private */
    public VastSurfaceHolder.OnSurfaceAvailableListener onSurfaceAvailableListener;
    /* access modifiers changed from: private */
    public VastSurfaceHolder.OnSurfaceChangedListener onSurfaceChangedListener;
    /* access modifiers changed from: private */
    public VastSurfaceHolder.OnSurfaceDestroyedListener onSurfaceDestroyedListener;
    private final SurfaceView surfaceView;

    SurfaceViewVastSurfaceHolder(SurfaceView surfaceView2) {
        this.surfaceView = surfaceView2;
        surfaceView2.getHolder().addCallback(new SurfaceHolder.Callback() {
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                Objects.onNotNull(SurfaceViewVastSurfaceHolder.this.onSurfaceAvailableListener, new Consumer(surfaceHolder) {
                    public final /* synthetic */ SurfaceHolder f$0;

                    {
                        this.f$0 = r1;
                    }

                    public final void accept(Object obj) {
                        SurfaceViewVastSurfaceHolder.C113181.lambda$surfaceCreated$0(this.f$0, (VastSurfaceHolder.OnSurfaceAvailableListener) obj);
                    }
                });
            }

            static /* synthetic */ void lambda$surfaceCreated$0(SurfaceHolder surfaceHolder, VastSurfaceHolder.OnSurfaceAvailableListener onSurfaceAvailableListener) {
                Surface surface = surfaceHolder.getSurface();
                if (surface != null) {
                    Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
                    onSurfaceAvailableListener.onSurfaceAvailable(surface, surfaceFrame.width(), surfaceFrame.height());
                }
            }

            public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                Objects.onNotNull(SurfaceViewVastSurfaceHolder.this.onSurfaceChangedListener, new Consumer(surfaceHolder, i2, i3) {
                    public final /* synthetic */ SurfaceHolder f$0;
                    public final /* synthetic */ int f$1;
                    public final /* synthetic */ int f$2;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void accept(Object obj) {
                        SurfaceViewVastSurfaceHolder.C113181.lambda$surfaceChanged$1(this.f$0, this.f$1, this.f$2, (VastSurfaceHolder.OnSurfaceChangedListener) obj);
                    }
                });
            }

            static /* synthetic */ void lambda$surfaceChanged$1(SurfaceHolder surfaceHolder, int i, int i2, VastSurfaceHolder.OnSurfaceChangedListener onSurfaceChangedListener) {
                Surface surface = surfaceHolder.getSurface();
                if (surface != null) {
                    onSurfaceChangedListener.onSurfaceChanged(surface, i, i2);
                }
            }

            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                Objects.onNotNull(SurfaceViewVastSurfaceHolder.this.onSurfaceDestroyedListener, new Consumer(surfaceHolder) {
                    public final /* synthetic */ SurfaceHolder f$0;

                    {
                        this.f$0 = r1;
                    }

                    public final void accept(Object obj) {
                        SurfaceViewVastSurfaceHolder.C113181.lambda$surfaceDestroyed$2(this.f$0, (VastSurfaceHolder.OnSurfaceDestroyedListener) obj);
                    }
                });
            }

            static /* synthetic */ void lambda$surfaceDestroyed$2(SurfaceHolder surfaceHolder, VastSurfaceHolder.OnSurfaceDestroyedListener onSurfaceDestroyedListener) {
                Surface surface = surfaceHolder.getSurface();
                if (surface != null) {
                    onSurfaceDestroyedListener.onSurfaceDestroyed(surface);
                }
            }
        });
    }

    public View getView() {
        return this.surfaceView;
    }

    public Surface getSurface() {
        return this.surfaceView.getHolder().getSurface();
    }

    public void setOnSurfaceAvailableListener(VastSurfaceHolder.OnSurfaceAvailableListener onSurfaceAvailableListener2) {
        this.onSurfaceAvailableListener = onSurfaceAvailableListener2;
    }

    public void setOnSurfaceChangedListener(VastSurfaceHolder.OnSurfaceChangedListener onSurfaceChangedListener2) {
        this.onSurfaceChangedListener = onSurfaceChangedListener2;
    }

    public void setOnSurfaceDestroyedListener(VastSurfaceHolder.OnSurfaceDestroyedListener onSurfaceDestroyedListener2) {
        this.onSurfaceDestroyedListener = onSurfaceDestroyedListener2;
    }
}
