package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.inmobi.media.jg */
/* compiled from: BitmapDetector */
public class C6299jg {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String f15941b = C6299jg.class.getSimpleName();

    /* renamed from: a */
    public final WeakReference<View> f15942a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final WeakReference<C6304a> f15943c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f15944d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f15945e = false;

    /* renamed from: com.inmobi.media.jg$a */
    /* compiled from: BitmapDetector */
    public interface C6304a {
        /* renamed from: j */
        void mo35528j();

        /* renamed from: k */
        void mo35529k();
    }

    public C6299jg(View view, C6304a aVar) {
        this.f15943c = new WeakReference<>(aVar);
        this.f15942a = new WeakReference<>(view);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Bitmap m18834b(final View view) throws IllegalStateException {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            throw new IllegalStateException();
        }
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        final Canvas canvas = new Canvas(createBitmap);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        view.post(new Runnable() {
            public final void run() {
                view.draw(canvas);
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
        }
        return createBitmap;
    }
}
