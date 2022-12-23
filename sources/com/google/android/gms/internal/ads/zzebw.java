package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzebw {
    private final zzfvk zza;
    private final zzebd zzb;
    private final zzgpo zzc;

    public zzebw(zzfvk zzfvk, zzebd zzebd, zzgpo zzgpo) {
        this.zza = zzfvk;
        this.zzb = zzebd;
        this.zzc = zzgpo;
    }

    private final zzfvj zzg(zzbzu zzbzu, zzebv zzebv, zzebv zzebv2, zzfuh zzfuh) {
        zzfvj zzfvj;
        String str = zzbzu.zzd;
        zzt.zzp();
        if (zzs.zzy(str)) {
            zzfvj = zzfva.zzh(new zzebm(1));
        } else {
            zzfvj = zzfva.zzg(zzebv.zza(zzbzu), ExecutionException.class, zzebn.zza, this.zza);
        }
        return zzfva.zzg(zzfva.zzn(zzfur.zzv(zzfvj), zzfuh, this.zza), zzebm.class, new zzebu(this, zzebv2, zzbzu, zzfuh), this.zza);
    }

    public final zzfvj zza(zzbzu zzbzu) {
        return zzg(zzbzu, new zzebs(this.zzb), new zzebt(this), new zzebr(zzbzu));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvj zzb(zzebv zzebv, zzbzu zzbzu, zzfuh zzfuh, zzebm zzebm) throws Exception {
        return zzfva.zzn(zzebv.zza(zzbzu), zzfuh, this.zza);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvj zzc(zzbzu zzbzu) {
        return ((zzecn) this.zzc.zzb()).zzb(zzbzu, Binder.getCallingUid());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvj zzd(zzbzu zzbzu) {
        String str;
        zzebd zzebd = this.zzb;
        if (((Boolean) zzbju.zzd.zze()).booleanValue()) {
            str = zzbzu.zzh;
        } else {
            str = zzbzu.zzj;
        }
        return zzebd.zzc(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvj zze(zzbzu zzbzu) {
        String str;
        zzecn zzecn = (zzecn) this.zzc.zzb();
        if (((Boolean) zzbju.zzd.zze()).booleanValue()) {
            str = zzbzu.zzh;
        } else {
            str = zzbzu.zzj;
        }
        return zzecn.zzi(str);
    }

    public final zzfvj zzf(zzbzu zzbzu) {
        if (zzapf.zzg(zzbzu.zzj)) {
            return zzfva.zzh(new zzdzk(2, "Pool key missing from removeUrl call."));
        }
        return zzg(zzbzu, new zzebp(this), new zzebq(this), zzebo.zza);
    }
}
