package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzcug implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;
    private final zzgqh zzc;
    private final zzgqh zzd;

    public zzcug(zzgqh zzgqh, zzgqh zzgqh2, zzgqh zzgqh3, zzgqh zzgqh4) {
        this.zza = zzgqh;
        this.zzb = zzgqh2;
        this.zzc = zzgqh3;
        this.zzd = zzgqh4;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        ((zzcym) this.zza).zza();
        String str = (String) this.zzd.zzb();
        boolean equals = "native".equals(str);
        zzt.zzp();
        return new zzbai(UUID.randomUUID().toString(), ((zzcnu) this.zzb).zza(), str, (JSONObject) this.zzc.zzb(), false, equals);
    }
}
