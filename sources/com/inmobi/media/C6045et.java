package com.inmobi.media;

import android.graphics.Canvas;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import com.inmobi.media.C6051ev;
import java.io.File;
import java.io.IOException;

/* renamed from: com.inmobi.media.et */
/* compiled from: AnimatedDrawable */
public final class C6045et implements C6051ev {

    /* renamed from: a */
    AnimatedImageDrawable f15378a;

    /* renamed from: b */
    private C6051ev.C6052a f15379b;

    /* renamed from: a */
    public final void mo35174a(boolean z) {
    }

    /* renamed from: e */
    public final void mo35178e() {
    }

    public C6045et(String str) throws IOException {
        this.f15378a = (AnimatedImageDrawable) ImageDecoder.decodeDrawable(ImageDecoder.createSource(new File(str)));
    }

    /* renamed from: a */
    public final void mo35171a() {
        this.f15378a.registerAnimationCallback(new Animatable2.AnimationCallback() {
            public final void onAnimationStart(Drawable drawable) {
                super.onAnimationStart(drawable);
            }

            public final void onAnimationEnd(Drawable drawable) {
                super.onAnimationEnd(drawable);
                C6045et.this.f15378a.start();
            }
        });
        this.f15378a.start();
    }

    /* renamed from: b */
    public final int mo35175b() {
        return this.f15378a.getIntrinsicWidth();
    }

    /* renamed from: c */
    public final int mo35176c() {
        return this.f15378a.getIntrinsicHeight();
    }

    /* renamed from: a */
    public final void mo35172a(Canvas canvas, float f, float f2) {
        canvas.translate(f, f2);
        this.f15378a.draw(canvas);
    }

    /* renamed from: d */
    public final boolean mo35177d() {
        return this.f15378a.isRunning();
    }

    /* renamed from: a */
    public final void mo35173a(C6051ev.C6052a aVar) {
        this.f15379b = aVar;
    }
}
