package com.bytedance.sdk.component.utils;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: com.bytedance.sdk.component.utils.g */
/* compiled from: HackTouchDelegate */
public class C2967g extends TouchDelegate {

    /* renamed from: a */
    private View f6729a;

    /* renamed from: b */
    private Rect f6730b;

    /* renamed from: c */
    private Rect f6731c;

    /* renamed from: d */
    private boolean f6732d;

    /* renamed from: e */
    private int f6733e;

    public C2967g(Rect rect, View view) {
        super(rect, view);
        this.f6730b = rect;
        this.f6733e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        Rect rect2 = new Rect(rect);
        this.f6731c = rect2;
        int i = this.f6733e;
        rect2.inset(-i, -i);
        this.f6729a = view;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            float r0 = r8.getX()
            int r0 = (int) r0
            float r1 = r8.getY()
            int r1 = (int) r1
            int r2 = r8.getAction()
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0032
            if (r2 == r4) goto L_0x0025
            if (r2 == r3) goto L_0x0025
            r0 = 3
            if (r2 == r0) goto L_0x001d
        L_0x001a:
            r0 = r4
            r4 = r5
            goto L_0x0041
        L_0x001d:
            boolean r0 = r7.f6732d
            r7.f6732d = r5
            r6 = r4
            r4 = r0
            r0 = r6
            goto L_0x0041
        L_0x0025:
            boolean r2 = r7.f6732d
            if (r2 == 0) goto L_0x002f
            android.graphics.Rect r4 = r7.f6731c
            boolean r4 = r4.contains(r0, r1)
        L_0x002f:
            r0 = r4
            r4 = r2
            goto L_0x0041
        L_0x0032:
            android.graphics.Rect r2 = r7.f6730b
            boolean r0 = r2.contains(r0, r1)
            if (r0 == 0) goto L_0x003e
            r7.f6732d = r4
            r0 = r4
            goto L_0x0041
        L_0x003e:
            r7.f6732d = r5
            goto L_0x001a
        L_0x0041:
            if (r4 == 0) goto L_0x0069
            android.view.View r1 = r7.f6729a
            if (r0 == 0) goto L_0x0057
            int r0 = r1.getWidth()
            int r0 = r0 / r3
            float r0 = (float) r0
            int r2 = r1.getHeight()
            int r2 = r2 / r3
            float r2 = (float) r2
            r8.setLocation(r0, r2)
            goto L_0x005f
        L_0x0057:
            int r0 = r7.f6733e
            int r0 = r0 * r3
            int r0 = -r0
            float r0 = (float) r0
            r8.setLocation(r0, r0)
        L_0x005f:
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0069
            boolean r5 = r1.dispatchTouchEvent(r8)
        L_0x0069:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.utils.C2967g.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
