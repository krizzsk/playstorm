package com.p374my.tracker.obfuscated;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import com.p374my.tracker.config.AntiFraudConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.my.tracker.obfuscated.r0 */
public final class C10166r0 {

    /* renamed from: a */
    final AtomicInteger f25457a = new AtomicInteger();

    /* renamed from: b */
    final C10126m f25458b;

    /* renamed from: c */
    final AntiFraudConfig f25459c;

    /* renamed from: d */
    final Context f25460d;

    /* renamed from: e */
    C10167a f25461e;

    /* renamed from: f */
    Runnable f25462f;

    /* renamed from: g */
    Runnable f25463g;

    /* renamed from: h */
    long f25464h = -1;

    /* renamed from: com.my.tracker.obfuscated.r0$a */
    static final class C10167a implements SensorEventListener {

        /* renamed from: a */
        private final C10126m f25465a;

        /* renamed from: b */
        private final SensorManager f25466b;

        /* renamed from: c */
        private final AntiFraudConfig f25467c;

        /* renamed from: d */
        private final ArrayList<Sensor> f25468d = new ArrayList<>();

        C10167a(C10126m mVar, SensorManager sensorManager, AntiFraudConfig antiFraudConfig) {
            this.f25465a = mVar;
            this.f25466b = sensorManager;
            this.f25467c = antiFraudConfig;
        }

        /* renamed from: a */
        public static C10167a m30418a(C10126m mVar, Context context, AntiFraudConfig antiFraudConfig) {
            SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
            if (sensorManager == null) {
                return null;
            }
            return new C10167a(mVar, sensorManager, antiFraudConfig);
        }

        /* renamed from: a */
        public void mo66380a() {
            C10175u0.m30440a("SensorEventListenerImpl: start()");
            int[] iArr = {5, 2, 4, 6, 8};
            for (int i = 0; i < 5; i++) {
                int i2 = iArr[i];
                if (!((i2 == 5 && !this.f25467c.useLightSensor) || (i2 == 2 && !this.f25467c.useMagneticFieldSensor) || ((i2 == 4 && !this.f25467c.useGyroscope) || ((i2 == 6 && !this.f25467c.usePressureSensor) || (i2 == 8 && !this.f25467c.useProximitySensor))))) {
                    try {
                        Sensor defaultSensor = this.f25466b.getDefaultSensor(i2);
                        if (defaultSensor != null) {
                            this.f25466b.registerListener(this, defaultSensor, 1000000);
                            this.f25468d.add(defaultSensor);
                        }
                    } catch (Throwable th) {
                        C10175u0.m30440a("SensorEventListenerImpl: exception at register listener: " + th);
                    }
                }
            }
        }

        /* renamed from: b */
        public void mo66381b() {
            C10175u0.m30440a("SensorEventListenerImpl: stop()");
            Iterator<Sensor> it = this.f25468d.iterator();
            while (it.hasNext()) {
                try {
                    this.f25466b.unregisterListener(this, it.next());
                } catch (Throwable th) {
                    C10175u0.m30440a("SensorEventListenerImpl: exception at unregister listener: " + th);
                }
            }
            this.f25468d.clear();
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            float f;
            StringBuilder sb;
            int type = sensorEvent.sensor.getType();
            if (type == 2) {
                C10126m mVar = this.f25465a;
                float[] fArr = sensorEvent.values;
                mVar.mo66247b(fArr[0], fArr[1], fArr[2]);
                sb = new StringBuilder();
                sb.append("SensorHandler: magnetometer - ");
                sb.append(sensorEvent.values[0]);
                sb.append(", ");
                sb.append(sensorEvent.values[1]);
                sb.append(", ");
                f = sensorEvent.values[2];
            } else if (type == 8) {
                this.f25465a.mo66252c(sensorEvent.values[0]);
                sb = new StringBuilder();
                sb.append("SensorHandler: proximity - ");
                f = sensorEvent.values[0];
            } else if (type == 4) {
                C10126m mVar2 = this.f25465a;
                float[] fArr2 = sensorEvent.values;
                mVar2.mo66230a(fArr2[0], fArr2[1], fArr2[2]);
                sb = new StringBuilder();
                sb.append("SensorHandler: gyroscope - ");
                sb.append(sensorEvent.values[0]);
                sb.append(", ");
                sb.append(sensorEvent.values[1]);
                sb.append(", ");
                f = sensorEvent.values[2];
            } else if (type == 5) {
                this.f25465a.mo66229a(sensorEvent.values[0]);
                sb = new StringBuilder();
                sb.append("SensorHandler: light - ");
                f = sensorEvent.values[0];
            } else if (type == 6) {
                this.f25465a.mo66246b(sensorEvent.values[0]);
                sb = new StringBuilder();
                sb.append("SensorHandler: pressure - ");
                f = sensorEvent.values[0];
            } else {
                return;
            }
            sb.append(f);
            C10175u0.m30440a(sb.toString());
        }
    }

    C10166r0(C10126m mVar, AntiFraudConfig antiFraudConfig, Context context) {
        this.f25458b = mVar;
        this.f25459c = antiFraudConfig;
        this.f25460d = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C10166r0 m30412a(C10126m mVar, AntiFraudConfig antiFraudConfig, Context context) {
        return new C10166r0(mVar, antiFraudConfig, context);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30413a() {
        if (!this.f25457a.compareAndSet(2, 1)) {
            C10175u0.m30440a("SensorHandler: handle isn't running");
            return;
        }
        this.f25461e.mo66381b();
        this.f25458b.mo66228a();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m30414b() {
        C10104d.m30023a(new Runnable() {
            public final void run() {
                C10166r0.this.m30413a();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m30415b(long j) {
        if (!this.f25457a.compareAndSet(1, 2)) {
            C10175u0.m30440a("SensorHandler: handler can't start, current state: " + this.f25457a.get());
        } else if (this.f25461e == null) {
            C10175u0.m30440a("SensorHandler: handler can't start, sensor event listener is null");
        } else if (C10173t0.m30433a() - j > 259200) {
            C10175u0.m30440a(String.format(Locale.ENGLISH, "SensorHandler: more than %d seconds passed since the app was installed", new Object[]{259200}));
        } else {
            this.f25461e.mo66380a();
            C10104d.f25156a.postDelayed(this.f25462f, SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US);
        }
    }

    /* renamed from: a */
    public void mo66378a(long j) {
        if (j <= 0) {
            C10175u0.m30440a("SensorHandler: install timestamp is empty, do nothing");
        } else if (!this.f25457a.compareAndSet(0, 1)) {
            C10175u0.m30440a("SensorHandler: handler has already been initialized");
        } else {
            C10167a a = C10167a.m30418a(this.f25458b, this.f25460d.getApplicationContext(), this.f25459c);
            this.f25461e = a;
            if (a == null) {
                C10175u0.m30440a("SensorHandler: sensor event listener is null");
                return;
            }
            this.f25462f = new Runnable() {
                public final void run() {
                    C10166r0.this.m30414b();
                }
            };
            this.f25463g = new Runnable(j) {
                public final /* synthetic */ long f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C10166r0.this.m30415b(this.f$1);
                }
            };
            this.f25464h = j;
            C10175u0.m30440a("SensorHandler: initialized");
            this.f25463g.run();
        }
    }

    /* renamed from: c */
    public void mo66379c() {
        Runnable runnable = this.f25463g;
        if (runnable == null) {
            C10175u0.m30440a("SensorHandler: can't start, startRunnable is null");
        } else {
            C10104d.m30023a(runnable);
        }
    }
}
