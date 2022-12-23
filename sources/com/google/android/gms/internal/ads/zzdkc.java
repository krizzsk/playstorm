package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public class zzdkc {
    private final zzdlf zza;
    private final zzcli zzb;

    public zzdkc(zzdlf zzdlf, zzcli zzcli) {
        this.zza = zzdlf;
        this.zzb = zzcli;
    }

    public static final zzdiy zzh(zzfhd zzfhd) {
        return new zzdiy(zzfhd, zzcfv.zzf);
    }

    public static final zzdiy zzi(zzdlk zzdlk) {
        return new zzdiy(zzdlk, zzcfv.zzf);
    }

    public final View zza() {
        zzcli zzcli = this.zzb;
        if (zzcli == null) {
            return null;
        }
        return zzcli.zzI();
    }

    public final View zzb() {
        zzcli zzcli = this.zzb;
        if (zzcli != null) {
            return zzcli.zzI();
        }
        return null;
    }

    public final zzcli zzc() {
        return this.zzb;
    }

    public final zzdiy zzd(Executor executor) {
        return new zzdiy(new zzdka(this.zzb), executor);
    }

    public final zzdlf zze() {
        return this.zza;
    }

    public Set zzf(zzdas zzdas) {
        return Collections.singleton(new zzdiy(zzdas, zzcfv.zzf));
    }

    public Set zzg(zzdas zzdas) {
        return Collections.singleton(new zzdiy(zzdas, zzcfv.zzf));
    }
}
