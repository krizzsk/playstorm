package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdmp implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;

    public zzdmp(zzgqh zzgqh, zzgqh zzgqh2) {
        this.zza = zzgqh;
        this.zzb = zzgqh2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcfo zza2 = ((zzcnu) this.zza).zza();
        zzt.zzp();
        return new zzbai(UUID.randomUUID().toString(), zza2, "native", new JSONObject(), false, true);
    }
}
