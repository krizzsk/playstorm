package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.p048c.C1857b;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.utils.n */
public class C2081n implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    private final int f4064a;

    /* renamed from: b */
    private final float f4065b;

    /* renamed from: c */
    private final SensorManager f4066c;

    /* renamed from: d */
    private final Sensor f4067d;

    /* renamed from: e */
    private final Sensor f4068e = this.f4066c.getDefaultSensor(4);

    /* renamed from: f */
    private final C1959m f4069f;

    /* renamed from: g */
    private float[] f4070g;

    /* renamed from: h */
    private float f4071h;

    public C2081n(C1959m mVar) {
        this.f4069f = mVar;
        SensorManager sensorManager = (SensorManager) mVar.mo14297L().getSystemService("sensor");
        this.f4066c = sensorManager;
        this.f4067d = sensorManager.getDefaultSensor(9);
        this.f4064a = ((Integer) mVar.mo14311a(C1857b.f3245dR)).intValue();
        this.f4065b = ((Float) mVar.mo14311a(C1857b.f3244dQ)).floatValue();
        mVar.mo14337aj().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
        mVar.mo14337aj().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
    }

    /* renamed from: a */
    public void mo14745a() {
        this.f4066c.unregisterListener(this);
        if (((Boolean) this.f4069f.mo14296K().mo14061a(C1857b.f3242dO)).booleanValue()) {
            this.f4066c.registerListener(this, this.f4067d, (int) TimeUnit.MILLISECONDS.toMicros((long) this.f4064a));
        }
        if (((Boolean) this.f4069f.mo14296K().mo14061a(C1857b.f3243dP)).booleanValue()) {
            this.f4066c.registerListener(this, this.f4068e, (int) TimeUnit.MILLISECONDS.toMicros((long) this.f4064a));
        }
    }

    /* renamed from: b */
    public float mo14746b() {
        return this.f4071h;
    }

    /* renamed from: c */
    public float mo14747c() {
        float[] fArr = this.f4070g;
        if (fArr == null) {
            return 0.0f;
        }
        return (float) Math.toDegrees(Math.acos((double) (fArr[2] / 9.81f)));
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            this.f4066c.unregisterListener(this);
        } else if ("com.applovin.application_resumed".equals(action)) {
            mo14745a();
        }
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 9) {
            this.f4070g = sensorEvent.values;
        } else if (sensorEvent.sensor.getType() == 4) {
            float f = this.f4071h * this.f4065b;
            this.f4071h = f;
            this.f4071h = f + Math.abs(sensorEvent.values[0]) + Math.abs(sensorEvent.values[1]) + Math.abs(sensorEvent.values[2]);
        }
    }
}
