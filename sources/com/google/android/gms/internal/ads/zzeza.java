package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzeza implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;
    private final zzgqh zzc;

    public zzeza(zzgqh zzgqh, zzgqh zzgqh2, zzgqh zzgqh3) {
        this.zza = zzgqh;
        this.zzb = zzgqh2;
        this.zzc = zzgqh3;
    }

    /* renamed from: zza */
    public final zzeyv zzb() {
        zzcel zzcel;
        Context context = (Context) this.zza.zzb();
        zzfdj zzfdj = (zzfdj) this.zzb.zzb();
        zzfeb zzfeb = (zzfeb) this.zzc.zzb();
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzfn)).booleanValue()) {
            zzcel = zzt.zzo().zzh().zzh();
        } else {
            zzcel = zzt.zzo().zzh().zzi();
        }
        boolean z = false;
        if (zzcel != null && zzcel.zzh()) {
            z = true;
        }
        if (((Integer) zzay.zzc().zzb(zzbhy.zzfp)).intValue() > 0) {
            if (!((Boolean) zzay.zzc().zzb(zzbhy.zzfm)).booleanValue() || z) {
                zzfea zza2 = zzfeb.zza(zzfdr.Rewarded, context, zzfdj, new zzexz(new zzexw()));
                return new zzeyb(new zzeyl(new zzeyk()), new zzeyh(zza2.zza, zzcfv.zza), zza2.zzb, zza2.zza.zza().zzf, zzcfv.zza);
            }
        }
        return new zzeyk();
    }
}
