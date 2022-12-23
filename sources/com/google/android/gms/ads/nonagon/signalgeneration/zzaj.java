package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbzu;
import com.google.android.gms.internal.ads.zzeai;
import com.google.android.gms.internal.ads.zzfuh;
import com.google.android.gms.internal.ads.zzfva;
import com.google.android.gms.internal.ads.zzfvj;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzaj implements zzfuh {
    private final Executor zza;
    private final zzeai zzb;

    public zzaj(Executor executor, zzeai zzeai) {
        this.zza = executor;
        this.zzb = zzeai;
    }

    public final /* bridge */ /* synthetic */ zzfvj zza(Object obj) throws Exception {
        zzbzu zzbzu = (zzbzu) obj;
        return zzfva.zzn(this.zzb.zzb(zzbzu), new zzai(zzbzu), this.zza);
    }
}
