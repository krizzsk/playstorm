package com.bytedance.sdk.openadsdk.p178j;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Vibrator;

/* renamed from: com.bytedance.sdk.openadsdk.j.i */
/* compiled from: SensorHub */
public class C3901i {

    /* renamed from: a */
    private static SensorManager f10089a;

    /* renamed from: a */
    private static int m12797a(int i) {
        if (i == 0 || i == 1 || i == 2 || i == 3) {
            return i;
        }
        return 2;
    }

    /* renamed from: b */
    private static SensorManager m12801b(Context context) {
        if (f10089a == null) {
            synchronized (C3901i.class) {
                if (f10089a == null) {
                    f10089a = (SensorManager) context.getSystemService("sensor");
                }
            }
        }
        return f10089a;
    }

    /* renamed from: a */
    public static void m12800a(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener != null && context != null) {
            try {
                SensorManager b = m12801b(context);
                b.registerListener(sensorEventListener, b.getDefaultSensor(1), m12797a(i));
            } catch (Throwable th) {
                C3888f.m12722a("SensorHub", "startListenAccelerometer error", th);
            }
        }
    }

    /* renamed from: b */
    public static void m12802b(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener != null && context != null) {
            try {
                SensorManager b = m12801b(context);
                b.registerListener(sensorEventListener, b.getDefaultSensor(4), m12797a(i));
            } catch (Throwable th) {
                C3888f.m12722a("SensorHub", "startListenGyroscope error", th);
            }
        }
    }

    /* renamed from: a */
    public static void m12799a(Context context, SensorEventListener sensorEventListener) {
        if (sensorEventListener != null && context != null) {
            try {
                m12801b(context).unregisterListener(sensorEventListener);
            } catch (Throwable th) {
                C3888f.m12722a("SensorHub", "stopListen error", th);
            }
        }
    }

    /* renamed from: a */
    public static void m12798a(Context context) {
        if (context != null) {
            ((Vibrator) context.getSystemService("vibrator")).vibrate(300);
        }
    }
}
