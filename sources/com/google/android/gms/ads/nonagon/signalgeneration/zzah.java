package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzdaz;
import com.google.android.gms.internal.ads.zzffy;
import com.google.android.gms.internal.ads.zzfge;
import com.google.android.gms.internal.ads.zzgpu;
import com.google.android.gms.internal.ads.zzgqh;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzah implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;
    private final zzgqh zzc;

    public zzah(zzgqh zzgqh, zzgqh zzgqh2, zzgqh zzgqh3) {
        this.zza = zzgqh;
        this.zzb = zzgqh2;
        this.zzc = zzgqh3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((zzfge) this.zza.zzb()).zzb(zzffy.GENERATE_SIGNALS, ((zzdaz) this.zzc).zzb().zzc()).zzf(((zzak) this.zzb).zzb()).zzi((long) ((Integer) zzay.zzc().zzb(zzbhy.zzex)).intValue(), TimeUnit.SECONDS).zza();
    }
}
