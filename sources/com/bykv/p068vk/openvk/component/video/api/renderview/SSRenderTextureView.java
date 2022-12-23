package com.bykv.p068vk.openvk.component.video.api.renderview;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.p068vk.openvk.component.video.api.p088f.C2536c;
import com.bykv.p068vk.openvk.component.video.api.renderview.C2540b;

/* renamed from: com.bykv.vk.openvk.component.video.api.renderview.SSRenderTextureView */
public class SSRenderTextureView extends TextureView implements TextureView.SurfaceTextureListener, C2540b {

    /* renamed from: a */
    private C2539a f5430a;

    /* renamed from: b */
    private C2540b.C2541a f5431b;

    public SurfaceHolder getHolder() {
        return null;
    }

    public View getView() {
        return this;
    }

    public SSRenderTextureView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SSRenderTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo16479a(C2539a aVar) {
        this.f5430a = aVar;
        setSurfaceTextureListener(this);
    }

    /* renamed from: a */
    public void mo16478a(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (Throwable th) {
            th.printStackTrace();
            if (C2536c.m6439b()) {
                C2536c.m6437b("CSJ_VIDEO_TextureView", "rethrow exception for debug & local_test, (TextureView)", th);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C2536c.m6436b("CSJ_VIDEO_TextureView", "onSurfaceTextureAvailable: ");
        C2539a aVar = this.f5430a;
        if (aVar != null) {
            aVar.mo16496a(surfaceTexture, i, i2);
        }
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C2536c.m6436b("CSJ_VIDEO_TextureView", "onSurfaceTextureSizeChanged: ");
        C2539a aVar = this.f5430a;
        if (aVar != null) {
            aVar.mo16501b(surfaceTexture, i, i2);
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C2536c.m6436b("CSJ_VIDEO_TextureView", "onSurfaceTextureDestroyed: ");
        C2539a aVar = this.f5430a;
        if (aVar != null) {
            return aVar.mo16499a(surfaceTexture);
        }
        return false;
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C2539a aVar = this.f5430a;
        if (aVar != null) {
            aVar.mo16500b(surfaceTexture);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        C2540b.C2541a aVar = this.f5431b;
        if (aVar != null) {
            aVar.mo16504a(i);
        }
    }

    public void setWindowVisibilityChangedListener(C2540b.C2541a aVar) {
        this.f5431b = aVar;
    }
}
