package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;

/* renamed from: com.bytedance.sdk.component.utils.v */
/* compiled from: ShakeUtils */
public class C2986v implements SensorEventListener {

    /* renamed from: a */
    private long f6755a = 2000;

    /* renamed from: b */
    private volatile long f6756b;

    /* renamed from: c */
    private float f6757c;

    /* renamed from: d */
    private float f6758d;

    /* renamed from: e */
    private float f6759e;

    /* renamed from: f */
    private boolean f6760f = false;

    /* renamed from: g */
    private volatile long f6761g;

    /* renamed from: h */
    private float f6762h = 20.0f;

    /* renamed from: i */
    private float f6763i = 50.0f;

    /* renamed from: j */
    private boolean f6764j;

    /* renamed from: k */
    private SensorManager f6765k = null;

    /* renamed from: l */
    private C2987a f6766l = null;

    /* renamed from: com.bytedance.sdk.component.utils.v$a */
    /* compiled from: ShakeUtils */
    public interface C2987a {
        /* renamed from: a */
        void mo17413a(int i);
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public C2986v(Context context) {
        this.f6765k = (SensorManager) context.getSystemService("sensor");
    }

    /* renamed from: a */
    public void mo17916a(C2987a aVar) {
        this.f6766l = aVar;
    }

    /* renamed from: a */
    public void mo17914a() {
        SensorManager sensorManager = this.f6765k;
        if (sensorManager != null && !this.f6764j) {
            try {
                this.f6760f = false;
                sensorManager.registerListener(this, sensorManager.getDefaultSensor(1), 3);
                if (Build.VERSION.SDK_INT > 18) {
                    this.f6765k.registerListener(this, this.f6765k.getDefaultSensor(15), 1);
                }
                this.f6764j = true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public void mo17917b() {
        SensorManager sensorManager = this.f6765k;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
            this.f6764j = false;
        }
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        int type = sensorEvent.sensor.getType();
        float[] fArr = sensorEvent.values;
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[1]);
        float abs3 = Math.abs(fArr[2]);
        if (type == 1) {
            float f = this.f6762h;
            if ((abs > f || abs2 > f || abs3 > f) && this.f6766l != null && System.currentTimeMillis() - this.f6756b > this.f6755a) {
                this.f6766l.mo17413a(1);
                this.f6756b = System.currentTimeMillis();
            }
        } else if (type == 15) {
            float abs4 = Math.abs(fArr[0]);
            float abs5 = Math.abs(fArr[1]);
            float abs6 = Math.abs(fArr[2]);
            if (abs4 != 0.0f || abs5 != 0.0f || abs6 != 0.0f) {
                if (!this.f6760f) {
                    this.f6760f = true;
                    this.f6757c = abs4;
                    this.f6758d = abs5;
                    this.f6759e = abs6;
                    return;
                }
                float abs7 = Math.abs(abs5 - this.f6758d) * 180.0f;
                float abs8 = Math.abs(abs6 - this.f6759e) * 180.0f;
                float f2 = this.f6763i;
                if ((Math.abs(abs4 - this.f6757c) * 180.0f > f2 || abs7 > f2 || abs8 > f2) && this.f6766l != null && System.currentTimeMillis() - this.f6761g > this.f6755a) {
                    this.f6766l.mo17413a(2);
                    this.f6761g = System.currentTimeMillis();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo17915a(float f) {
        this.f6762h = f;
    }

    /* renamed from: b */
    public void mo17918b(float f) {
        this.f6763i = f;
    }
}
