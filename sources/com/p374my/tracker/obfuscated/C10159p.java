package com.p374my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* renamed from: com.my.tracker.obfuscated.p */
public final class C10159p {

    /* renamed from: a */
    boolean f25434a = false;

    /* renamed from: b */
    boolean f25435b = true;

    /* renamed from: c */
    String f25436c;

    C10159p() {
    }

    /* renamed from: a */
    public void mo66353a(Context context) {
        if (!this.f25434a) {
            mo66355b(context);
            this.f25434a = true;
        }
    }

    /* renamed from: a */
    public void mo66354a(C10129m0 m0Var, Context context) {
        if (!TextUtils.isEmpty(this.f25436c)) {
            m0Var.mo66272a(this.f25436c, this.f25435b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo66355b(Context context) {
        C10175u0.m30440a("get google AId");
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            this.f25436c = advertisingIdInfo.getId();
            C10175u0.m30440a("AId: " + this.f25436c);
            this.f25435b = advertisingIdInfo.isLimitAdTrackingEnabled() ^ true;
            C10175u0.m30440a("AId ad tracking enabled: " + this.f25435b);
        } catch (Throwable th) {
            C10175u0.m30445b("failed to get google AId", th);
        }
    }

    /* renamed from: c */
    public void mo66356c(Context context) {
    }
}
