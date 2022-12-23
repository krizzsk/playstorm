package com.tapjoy;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.lang.reflect.Method;

public class TapjoyAdIdClient {

    /* renamed from: a */
    private Context f27483a;

    /* renamed from: b */
    private String f27484b;

    /* renamed from: c */
    private boolean f27485c;

    public TapjoyAdIdClient(Context context) {
        this.f27483a = context;
    }

    public boolean setupAdIdInfo() {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f27483a);
            this.f27484b = advertisingIdInfo.getId();
            this.f27485c = !advertisingIdInfo.isLimitAdTrackingEnabled();
            return true;
        } catch (Error | Exception unused) {
            return false;
        }
    }

    public boolean setupAdIdInfoReflection() {
        try {
            Class<?> cls = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            Method method = cls.getMethod("getAdvertisingIdInfo", new Class[]{Context.class});
            TapjoyLog.m33194d("TapjoyAdIdClient", "Found method: ".concat(String.valueOf(method)));
            Object invoke = method.invoke(cls, new Object[]{this.f27483a});
            Method method2 = invoke.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]);
            Method method3 = invoke.getClass().getMethod("getId", new Class[0]);
            this.f27485c = !((Boolean) method2.invoke(invoke, new Object[0])).booleanValue();
            this.f27484b = (String) method3.invoke(invoke, new Object[0]);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public String getAdvertisingId() {
        return this.f27484b;
    }

    public boolean isAdTrackingEnabled() {
        return this.f27485c;
    }
}
