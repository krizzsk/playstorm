package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzfuh;
import com.google.android.gms.internal.ads.zzfva;
import com.google.android.gms.internal.ads.zzfvj;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzp implements zzfuh {
    public final /* synthetic */ zzz zza;

    public /* synthetic */ zzp(zzz zzz) {
        this.zza = zzz;
    }

    public final zzfvj zza(Object obj) {
        return zzfva.zzm(this.zza.zzQ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzl(this.zza, (Uri) obj), this.zza.zzk);
    }
}
