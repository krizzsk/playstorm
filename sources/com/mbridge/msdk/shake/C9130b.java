package com.mbridge.msdk.shake;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;

/* renamed from: com.mbridge.msdk.shake.b */
/* compiled from: ShakeSensorEventListener */
public abstract class C9130b implements SensorEventListener {

    /* renamed from: a */
    private int f22126a = 0;

    /* renamed from: b */
    private int f22127b = 0;

    /* renamed from: d */
    public float f22128d = 0.0f;

    /* renamed from: e */
    public float f22129e = 0.0f;

    /* renamed from: f */
    public float f22130f = 0.0f;

    /* renamed from: g */
    public long f22131g = 0;

    /* renamed from: a */
    public abstract void mo61028a();

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public C9130b(int i, int i2) {
        this.f22126a = i;
        this.f22127b = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0046, code lost:
        if (java.lang.Math.abs(r9 - r2) > ((float) r8.f22126a)) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSensorChanged(android.hardware.SensorEvent r9) {
        /*
            r8 = this;
            float[] r9 = r9.values
            r0 = 0
            r0 = r9[r0]
            float r0 = -r0
            r1 = 1
            r1 = r9[r1]
            float r1 = -r1
            r2 = 2
            r9 = r9[r2]
            float r9 = -r9
            float r2 = r8.f22128d
            r3 = 0
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x0022
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r4 = r8.f22126a
            float r4 = (float) r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x0048
        L_0x0022:
            float r2 = r8.f22129e
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x0035
            float r2 = r1 - r2
            float r2 = java.lang.Math.abs(r2)
            int r4 = r8.f22126a
            float r4 = (float) r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x0048
        L_0x0035:
            float r2 = r8.f22130f
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x005c
            float r2 = r9 - r2
            float r2 = java.lang.Math.abs(r2)
            int r3 = r8.f22126a
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x005c
        L_0x0048:
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r8.f22131g
            long r4 = r2 - r4
            int r6 = r8.f22127b
            long r6 = (long) r6
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x005c
            r8.f22131g = r2
            r8.mo61028a()
        L_0x005c:
            r8.f22128d = r0
            r8.f22129e = r1
            r8.f22130f = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.shake.C9130b.onSensorChanged(android.hardware.SensorEvent):void");
    }
}
