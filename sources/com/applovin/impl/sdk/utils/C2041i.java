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
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.utils.i */
public class C2041i implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    private final C1959m f3970a;

    /* renamed from: b */
    private final SensorManager f3971b;

    /* renamed from: c */
    private final Sensor f3972c;

    /* renamed from: d */
    private final C2042a f3973d;

    /* renamed from: e */
    private float f3974e;

    /* renamed from: com.applovin.impl.sdk.utils.i$a */
    public interface C2042a {
        /* renamed from: b */
        void mo14382b();

        /* renamed from: c */
        void mo14383c();
    }

    public C2041i(C1959m mVar, C2042a aVar) {
        this.f3970a = mVar;
        SensorManager sensorManager = (SensorManager) mVar.mo14297L().getSystemService("sensor");
        this.f3971b = sensorManager;
        this.f3972c = sensorManager.getDefaultSensor(1);
        this.f3973d = aVar;
    }

    /* renamed from: a */
    public void mo14674a() {
        this.f3971b.unregisterListener(this);
        this.f3971b.registerListener(this, this.f3972c, (int) TimeUnit.MILLISECONDS.toMicros(50));
        this.f3970a.mo14337aj().unregisterReceiver(this);
        this.f3970a.mo14337aj().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
        this.f3970a.mo14337aj().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
    }

    /* renamed from: b */
    public void mo14675b() {
        this.f3970a.mo14337aj().unregisterReceiver(this);
        this.f3971b.unregisterListener(this);
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            this.f3971b.unregisterListener(this);
        } else if ("com.applovin.application_resumed".equals(action)) {
            mo14674a();
        }
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            float max = Math.max(Math.min(sensorEvent.values[2] / 9.81f, 1.0f), -1.0f);
            float f = this.f3974e;
            float f2 = (f * 0.5f) + (max * 0.5f);
            this.f3974e = f2;
            if (f < 0.8f && f2 > 0.8f) {
                this.f3973d.mo14383c();
            } else if (f > -0.8f && this.f3974e < -0.8f) {
                this.f3973d.mo14382b();
            }
        }
    }
}
