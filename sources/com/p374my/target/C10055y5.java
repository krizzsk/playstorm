package com.p374my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.SimpleExoPlayer;

/* renamed from: com.my.target.y5 */
public class C10055y5 extends FrameLayout {

    /* renamed from: a */
    public final TextureView f25015a;

    /* renamed from: b */
    public SurfaceView f25016b;

    /* renamed from: c */
    public int f25017c;

    /* renamed from: d */
    public int f25018d;

    /* renamed from: e */
    public C10056a f25019e;

    /* renamed from: f */
    public int f25020f;

    /* renamed from: com.my.target.y5$a */
    public interface C10056a {
        /* renamed from: p */
        void mo63891p();
    }

    public C10055y5(Context context) {
        super(context);
        this.f25015a = new TextureView(context);
        mo65763a();
    }

    /* renamed from: a */
    public final void mo65763a() {
        View view;
        C10059y8.m29840b(this.f25015a, "ad_video");
        if (getChildAt(0) != null) {
            removeViewAt(0);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        if (this.f25020f == 0) {
            view = this.f25015a;
        } else {
            if (this.f25016b == null) {
                this.f25016b = new SurfaceView(getContext());
            }
            view = this.f25016b;
        }
        addView(view, layoutParams);
    }

    /* renamed from: a */
    public void mo65764a(int i, int i2) {
        this.f25017c = i;
        this.f25018d = i2;
        requestLayout();
        invalidate();
    }

    public Bitmap getScreenShot() {
        if (this.f25020f == 1) {
            return null;
        }
        try {
            return this.f25015a.getBitmap(getWidth(), getHeight());
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public TextureView getTextureView() {
        return this.f25015a;
    }

    public void onAttachedToWindow() {
        C10056a aVar;
        super.onAttachedToWindow();
        if (!C10059y8.m29835a((View) this) && (aVar = this.f25019e) != null) {
            aVar.mo63891p();
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i4 = this.f25017c;
        if (i4 <= 0 || (i3 = this.f25018d) <= 0) {
            super.onMeasure(i, i2);
            return;
        }
        float f = ((float) i4) / ((float) i3);
        if (mode == 0 && mode2 == 0) {
            size = i4;
            size2 = i3;
        } else {
            if (mode == 0) {
                size = (int) (((float) size2) * f);
            } else if (mode2 == 0) {
                size2 = (int) (((float) size) / f);
            } else if (C9787j8.m28415a(f, 1.0f) >= 0) {
                i4 = size;
                i3 = size2;
                size2 = (int) (((float) size) / f);
            } else {
                i4 = size;
                i3 = size2;
                size = (int) (((float) size2) * f);
            }
            i4 = size;
            i3 = size2;
        }
        this.f25015a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        SurfaceView surfaceView = this.f25016b;
        if (surfaceView != null) {
            surfaceView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        setMeasuredDimension(i4, i3);
    }

    public void setAdVideoViewListener(C10056a aVar) {
        this.f25019e = aVar;
    }

    public void setExoPlayer(SimpleExoPlayer simpleExoPlayer) {
        if (simpleExoPlayer != null) {
            int i = this.f25020f;
            if (i == 0) {
                simpleExoPlayer.setVideoSurfaceView((SurfaceView) null);
                simpleExoPlayer.setVideoTextureView(this.f25015a);
            } else if (i == 1) {
                simpleExoPlayer.setVideoTextureView((TextureView) null);
                simpleExoPlayer.setVideoSurfaceView(this.f25016b);
            }
        }
    }

    public void setViewMode(int i) {
        if (this.f25020f != i) {
            this.f25020f = i;
            mo65763a();
        }
    }
}
