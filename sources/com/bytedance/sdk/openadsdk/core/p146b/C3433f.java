package com.bytedance.sdk.openadsdk.core.p146b;

import android.util.SparseArray;
import android.view.ViewConfiguration;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p146b.C3429c;

/* renamed from: com.bytedance.sdk.openadsdk.core.b.f */
/* compiled from: TouchInfoHelper */
public class C3433f {

    /* renamed from: j */
    public static int f8302j = ViewConfiguration.get(C3578m.m11231a()).getScaledTouchSlop();

    /* renamed from: m */
    private static float f8303m = 0.0f;

    /* renamed from: n */
    private static float f8304n = 0.0f;

    /* renamed from: o */
    private static float f8305o = 0.0f;

    /* renamed from: p */
    private static float f8306p = 0.0f;

    /* renamed from: q */
    private static long f8307q = 0;

    /* renamed from: a */
    public float f8308a = -1.0f;

    /* renamed from: b */
    public float f8309b = -1.0f;

    /* renamed from: c */
    public float f8310c = -1.0f;

    /* renamed from: d */
    public float f8311d = -1.0f;

    /* renamed from: e */
    public long f8312e = -1;

    /* renamed from: f */
    public long f8313f = -1;

    /* renamed from: g */
    public int f8314g = -1;

    /* renamed from: h */
    public int f8315h = -1024;

    /* renamed from: i */
    public int f8316i = -1;

    /* renamed from: k */
    public boolean f8317k = true;

    /* renamed from: l */
    public SparseArray<C3429c.C3430a> f8318l = new SparseArray<>();

    /* renamed from: r */
    private int f8319r = 0;

    /* renamed from: s */
    private int f8320s = 0;

    static {
        if (ViewConfiguration.get(C3578m.m11231a()) != null) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006f, code lost:
        if (f8306p <= ((float) r2)) goto L_0x0072;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19417a(android.view.MotionEvent r13) {
        /*
            r12 = this;
            int r0 = r13.getDeviceId()
            r12.f8315h = r0
            r0 = 0
            int r1 = r13.getToolType(r0)
            r12.f8314g = r1
            int r1 = r13.getSource()
            r12.f8316i = r1
            int r1 = r13.getActionMasked()
            r2 = 3
            r3 = 1
            if (r1 == 0) goto L_0x00dd
            if (r1 == r3) goto L_0x00a5
            r4 = 2
            if (r1 == r4) goto L_0x0028
            if (r1 == r2) goto L_0x0026
            r0 = -1
        L_0x0023:
            r5 = r0
            goto L_0x0119
        L_0x0026:
            r0 = 4
            goto L_0x0023
        L_0x0028:
            float r1 = f8305o
            float r2 = r13.getX()
            float r5 = f8303m
            float r2 = r2 - r5
            float r2 = java.lang.Math.abs(r2)
            float r1 = r1 + r2
            f8305o = r1
            float r1 = f8306p
            float r2 = r13.getY()
            float r5 = f8304n
            float r2 = r2 - r5
            float r2 = java.lang.Math.abs(r2)
            float r1 = r1 + r2
            f8306p = r1
            float r1 = r13.getX()
            f8303m = r1
            float r1 = r13.getY()
            f8304n = r1
            long r1 = java.lang.System.currentTimeMillis()
            long r5 = f8307q
            long r1 = r1 - r5
            r5 = 200(0xc8, double:9.9E-322)
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x0072
            float r1 = f8305o
            int r2 = f8302j
            float r5 = (float) r2
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 > 0) goto L_0x0073
            float r1 = f8306p
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0072
            goto L_0x0073
        L_0x0072:
            r3 = r4
        L_0x0073:
            float r1 = r13.getRawX()
            r12.f8310c = r1
            float r1 = r13.getRawY()
            r12.f8311d = r1
            float r1 = r12.f8310c
            int r2 = r12.f8319r
            float r2 = (float) r2
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            int r2 = com.bytedance.sdk.openadsdk.core.C3578m.f9006a
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x00a1
            float r1 = r12.f8311d
            int r2 = r12.f8320s
            float r2 = (float) r2
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            int r2 = com.bytedance.sdk.openadsdk.core.C3578m.f9006a
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x00a3
        L_0x00a1:
            r12.f8317k = r0
        L_0x00a3:
            r5 = r3
            goto L_0x0119
        L_0x00a5:
            float r1 = r13.getRawX()
            r12.f8310c = r1
            float r1 = r13.getRawY()
            r12.f8311d = r1
            long r3 = java.lang.System.currentTimeMillis()
            r12.f8313f = r3
            float r1 = r12.f8310c
            int r3 = r12.f8319r
            float r3 = (float) r3
            float r1 = r1 - r3
            float r1 = java.lang.Math.abs(r1)
            int r3 = com.bytedance.sdk.openadsdk.core.C3578m.f9006a
            float r3 = (float) r3
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x00d9
            float r1 = r12.f8311d
            int r3 = r12.f8320s
            float r3 = (float) r3
            float r1 = r1 - r3
            float r1 = java.lang.Math.abs(r1)
            int r3 = com.bytedance.sdk.openadsdk.core.C3578m.f9006a
            float r3 = (float) r3
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L_0x00db
        L_0x00d9:
            r12.f8317k = r0
        L_0x00db:
            r5 = r2
            goto L_0x0119
        L_0x00dd:
            float r1 = r13.getRawX()
            int r1 = (int) r1
            r12.f8319r = r1
            float r1 = r13.getRawY()
            int r1 = (int) r1
            r12.f8320s = r1
            float r1 = r13.getRawX()
            r12.f8308a = r1
            float r1 = r13.getRawY()
            r12.f8309b = r1
            long r1 = java.lang.System.currentTimeMillis()
            r12.f8312e = r1
            int r1 = r13.getToolType(r0)
            r12.f8314g = r1
            int r1 = r13.getDeviceId()
            r12.f8315h = r1
            int r1 = r13.getSource()
            r12.f8316i = r1
            long r1 = java.lang.System.currentTimeMillis()
            f8307q = r1
            r12.f8317k = r3
            goto L_0x0023
        L_0x0119:
            android.util.SparseArray<com.bytedance.sdk.openadsdk.core.b.c$a> r0 = r12.f8318l
            int r1 = r13.getActionMasked()
            com.bytedance.sdk.openadsdk.core.b.c$a r2 = new com.bytedance.sdk.openadsdk.core.b.c$a
            float r3 = r13.getSize()
            double r6 = (double) r3
            float r13 = r13.getPressure()
            double r8 = (double) r13
            long r10 = java.lang.System.currentTimeMillis()
            r4 = r2
            r4.<init>(r5, r6, r8, r10)
            r0.put(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p146b.C3433f.mo19417a(android.view.MotionEvent):void");
    }
}
