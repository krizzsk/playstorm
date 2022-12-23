package com.tapjoy.internal;

import android.content.Context;
import android.graphics.Matrix;
import android.view.MotionEvent;

/* renamed from: com.tapjoy.internal.ad */
public class C11416ad extends C11417ae {

    /* renamed from: a */
    private int f27659a = 0;

    /* renamed from: b */
    private final Matrix f27660b = new Matrix();

    /* renamed from: c */
    private final float[] f27661c = new float[2];

    public C11416ad(Context context) {
        super(context);
    }

    public int getRotationCount() {
        return this.f27659a;
    }

    public void setRotationCount(int i) {
        this.f27659a = i & 3;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f27659a % 2 == 0) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i2, i);
        setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(14:4|5|6|7|8|(1:12)|13|14|15|(1:(1:(1:20)(2:21|22))(1:23))(1:24)|25|(1:(1:(1:29)(2:30|31))(1:32))(1:33)|34|35) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x002c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatchDraw(android.graphics.Canvas r9) {
        /*
            r8 = this;
            int r0 = r8.f27659a
            if (r0 != 0) goto L_0x0008
            super.dispatchDraw(r9)
            return
        L_0x0008:
            r9.save()
            int r0 = r8.getWidth()
            int r1 = r8.getHeight()
            r2 = 0
            r9.clipRect(r2, r2, r0, r1)
            android.view.ViewParent r2 = r8.getParent()     // Catch:{ Exception -> 0x004f }
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2     // Catch:{ Exception -> 0x004f }
            android.view.ViewParent r3 = r2.getParent()     // Catch:{ Exception -> 0x002c }
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3     // Catch:{ Exception -> 0x002c }
            boolean r4 = r3 instanceof android.widget.ScrollView     // Catch:{ Exception -> 0x002c }
            if (r4 != 0) goto L_0x002b
            boolean r4 = r3 instanceof android.widget.HorizontalScrollView     // Catch:{ Exception -> 0x002c }
            if (r4 == 0) goto L_0x002c
        L_0x002b:
            r2 = r3
        L_0x002c:
            int r3 = r8.getLeft()     // Catch:{ Exception -> 0x004f }
            int r4 = r2.getScrollX()     // Catch:{ Exception -> 0x004f }
            int r3 = r3 - r4
            int r4 = r8.getTop()     // Catch:{ Exception -> 0x004f }
            int r5 = r2.getScrollY()     // Catch:{ Exception -> 0x004f }
            int r4 = r4 - r5
            int r5 = 0 - r3
            int r6 = 0 - r4
            int r7 = r2.getWidth()     // Catch:{ Exception -> 0x004f }
            int r7 = r7 - r3
            int r2 = r2.getHeight()     // Catch:{ Exception -> 0x004f }
            int r2 = r2 - r4
            r9.clipRect(r5, r6, r7, r2)     // Catch:{ Exception -> 0x004f }
        L_0x004f:
            int r2 = r8.f27659a
            int r2 = r2 * 90
            float r2 = (float) r2
            r9.rotate(r2)
            int r2 = r8.f27659a
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == r6) goto L_0x0077
            if (r2 == r4) goto L_0x006f
            if (r2 != r3) goto L_0x0069
            int r2 = -r1
            float r2 = (float) r2
            r9.translate(r2, r5)
            goto L_0x007c
        L_0x0069:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>()
            throw r9
        L_0x006f:
            int r2 = -r0
            float r2 = (float) r2
            int r7 = -r1
            float r7 = (float) r7
            r9.translate(r2, r7)
            goto L_0x007c
        L_0x0077:
            int r2 = -r0
            float r2 = (float) r2
            r9.translate(r5, r2)
        L_0x007c:
            android.graphics.Matrix r2 = r8.f27660b
            int r7 = r8.f27659a
            int r7 = r7 * -90
            float r7 = (float) r7
            r2.setRotate(r7)
            int r2 = r8.f27659a
            if (r2 == r6) goto L_0x00a6
            if (r2 == r4) goto L_0x009c
            if (r2 != r3) goto L_0x0096
            android.graphics.Matrix r0 = r8.f27660b
            int r1 = r1 - r6
            float r1 = (float) r1
            r0.postTranslate(r1, r5)
            goto L_0x00ad
        L_0x0096:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>()
            throw r9
        L_0x009c:
            android.graphics.Matrix r2 = r8.f27660b
            int r0 = r0 - r6
            float r0 = (float) r0
            int r1 = r1 - r6
            float r1 = (float) r1
            r2.postTranslate(r0, r1)
            goto L_0x00ad
        L_0x00a6:
            android.graphics.Matrix r1 = r8.f27660b
            int r0 = r0 - r6
            float r0 = (float) r0
            r1.postTranslate(r5, r0)
        L_0x00ad:
            super.dispatchDraw(r9)
            r9.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11416ad.dispatchDraw(android.graphics.Canvas):void");
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f27659a == 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float[] fArr = this.f27661c;
        fArr[0] = motionEvent.getX();
        fArr[1] = motionEvent.getY();
        this.f27660b.mapPoints(fArr);
        motionEvent.setLocation(fArr[0], fArr[1]);
        return super.dispatchTouchEvent(motionEvent);
    }
}
