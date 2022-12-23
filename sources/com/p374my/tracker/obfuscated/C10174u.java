package com.p374my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.ads.identifier.AdvertisingIdClient;

/* renamed from: com.my.tracker.obfuscated.u */
public final class C10174u {

    /* renamed from: a */
    boolean f25474a = false;

    /* renamed from: b */
    String f25475b;

    /* renamed from: c */
    boolean f25476c = true;

    /* renamed from: a */
    public void mo66386a(Context context) {
        if (!this.f25474a) {
            this.f25474a = true;
            mo66388b(context);
        }
    }

    /* renamed from: a */
    public void mo66387a(C10129m0 m0Var, Context context) {
        if (!TextUtils.isEmpty(this.f25475b)) {
            m0Var.mo66283b(this.f25475b, this.f25476c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo66388b(Context context) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            this.f25475b = advertisingIdInfo.getId();
            C10175u0.m30440a("HuaweiAIdDataProvider: oaid: " + this.f25475b);
            this.f25476c = advertisingIdInfo.isLimitAdTrackingEnabled() ^ true;
            C10175u0.m30440a("HuaweiAIdDataProvider: oaid tracking enabled: " + this.f25476c);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public void mo66389c(Context context) {
    }
}
