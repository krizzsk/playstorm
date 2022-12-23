package com.mbridge.msdk.shake;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.same.C8413a;
import com.mbridge.msdk.foundation.same.report.C8518b;
import com.mbridge.msdk.foundation.same.report.C8542e;

/* renamed from: com.mbridge.msdk.shake.a */
/* compiled from: NativeShakeManager */
public final class C9127a {

    /* renamed from: a */
    private SensorManager f22124a;

    /* renamed from: com.mbridge.msdk.shake.a$a */
    /* compiled from: NativeShakeManager */
    private static class C9129a {

        /* renamed from: a */
        static C9127a f22125a = new C9127a();
    }

    private C9127a() {
    }

    /* renamed from: a */
    public static C9127a m26171a() {
        return C9129a.f22125a;
    }

    /* renamed from: b */
    public final void mo61027b(SensorEventListener sensorEventListener) {
        SensorManager sensorManager = this.f22124a;
        if (sensorManager != null) {
            try {
                sensorManager.unregisterListener(sensorEventListener);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo61026a(SensorEventListener sensorEventListener) {
        Context g = C2350a.m5601e().mo15792g();
        if (g != null) {
            try {
                if (this.f22124a == null) {
                    this.f22124a = (SensorManager) g.getSystemService("sensor");
                }
                this.f22124a.registerListener(sensorEventListener, this.f22124a.getDefaultSensor(1), 2);
            } catch (Exception e) {
                e.printStackTrace();
                String message = e.getMessage();
                if (g == null) {
                    return;
                }
                if (!TextUtils.isEmpty(message)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000106&");
                    if (!TextUtils.isEmpty(C8413a.f20329k)) {
                        stringBuffer.append("b=" + C8413a.f20329k + "&");
                    }
                    if (!TextUtils.isEmpty(C8413a.f20330l)) {
                        stringBuffer.append("c=" + C8413a.f20330l + "&");
                    }
                    stringBuffer.append("reason=" + message);
                    if (C8518b.m24607a().mo57681c()) {
                        C8518b.m24607a().mo57679a(stringBuffer.toString());
                    } else {
                        C8542e.m24711b(g, stringBuffer.toString());
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
