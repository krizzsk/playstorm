package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzcoc implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;

    public zzcoc(zzgqh zzgqh, zzgqh zzgqh2) {
        this.zza = zzgqh;
        this.zzb = zzgqh2;
    }

    /* renamed from: zza */
    public final zzcaf zzb() {
        Context zza2 = ((zzcnk) this.zza).zza();
        zzfhs zzfhs = (zzfhs) this.zzb.zzb();
        zzt.zzf().zzb(zza2, zzcfo.zza(), zzfhs).zza("google.afma.request.getAdDictionary", zzbsw.zza, zzbsw.zza);
        zzbsz zzb2 = zzt.zzf().zzb(zza2, zzcfo.zza(), zzfhs);
        zzbst zzbst = zzbsw.zza;
        return new zzcae(zza2, zzb2.zza("google.afma.sdkConstants.getSdkConstants", zzbst, zzbst));
    }
}
