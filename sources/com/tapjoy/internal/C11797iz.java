package com.tapjoy.internal;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: com.tapjoy.internal.iz */
public final class C11797iz extends C11416ad {

    /* renamed from: a */
    private final C11760ie f28800a;

    /* renamed from: b */
    private final C11799ja f28801b;

    /* renamed from: c */
    private C11848z f28802c = null;

    public C11797iz(Context context, C11760ie ieVar, C11799ja jaVar) {
        super(context);
        this.f28800a = ieVar;
        this.f28801b = jaVar;
        addView(jaVar, new ViewGroup.LayoutParams(-1, -1));
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            com.tapjoy.internal.z r0 = com.tapjoy.internal.C11848z.m34423a(r0)
            com.tapjoy.internal.ie r1 = r6.f28800a
            boolean r1 = r1.mo72693a()
            r2 = 1
            r3 = 3
            r4 = 0
            if (r1 == 0) goto L_0x005b
            com.tapjoy.internal.ie r1 = r6.f28800a
            boolean r1 = r1.mo72694b()
            if (r1 == 0) goto L_0x0041
            boolean r1 = r0.mo72819a()
            if (r1 == 0) goto L_0x0024
            com.tapjoy.internal.z r0 = com.tapjoy.internal.C11848z.PORTRAIT
            goto L_0x003d
        L_0x0024:
            boolean r0 = r0.mo72820b()
            if (r0 != 0) goto L_0x003b
            android.content.Context r0 = r6.getContext()
            com.tapjoy.internal.z r0 = com.tapjoy.internal.C11848z.m34424b(r0)
            boolean r0 = r0.mo72819a()
            if (r0 == 0) goto L_0x003b
            com.tapjoy.internal.z r0 = com.tapjoy.internal.C11848z.PORTRAIT
            goto L_0x003d
        L_0x003b:
            com.tapjoy.internal.z r0 = com.tapjoy.internal.C11848z.LANDSCAPE
        L_0x003d:
            r6.setRotationCount(r4)
            goto L_0x0075
        L_0x0041:
            com.tapjoy.internal.z r1 = com.tapjoy.internal.C11848z.PORTRAIT
            boolean r5 = r0.mo72820b()
            if (r5 == 0) goto L_0x0057
            int r0 = r0.mo72821c()
            if (r0 != r3) goto L_0x0053
            r6.setRotationCount(r2)
            goto L_0x0074
        L_0x0053:
            r6.setRotationCount(r3)
            goto L_0x0074
        L_0x0057:
            r6.setRotationCount(r4)
            goto L_0x0074
        L_0x005b:
            com.tapjoy.internal.z r1 = com.tapjoy.internal.C11848z.LANDSCAPE
            boolean r5 = r0.mo72819a()
            if (r5 == 0) goto L_0x0071
            int r0 = r0.mo72821c()
            if (r0 != r3) goto L_0x006d
            r6.setRotationCount(r2)
            goto L_0x0074
        L_0x006d:
            r6.setRotationCount(r2)
            goto L_0x0074
        L_0x0071:
            r6.setRotationCount(r4)
        L_0x0074:
            r0 = r1
        L_0x0075:
            com.tapjoy.internal.z r1 = r6.f28802c
            if (r1 == r0) goto L_0x0084
            r6.f28802c = r0
            com.tapjoy.internal.ja r1 = r6.f28801b
            boolean r0 = r0.mo72820b()
            r1.setLandscape(r0)
        L_0x0084:
            super.onMeasure(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11797iz.onMeasure(int, int):void");
    }
}
