package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public class zzcwb {
    private final zzcxu zza;
    private final View zzb;
    private final zzfbh zzc;
    private final zzcli zzd;

    public zzcwb(View view, zzcli zzcli, zzcxu zzcxu, zzfbh zzfbh) {
        this.zzb = view;
        this.zzd = zzcli;
        this.zza = zzcxu;
        this.zzc = zzfbh;
    }

    public static final zzdiy zzf(Context context, zzcfo zzcfo, zzfbg zzfbg, zzfby zzfby) {
        return new zzdiy(new zzcvz(context, zzcfo, zzfbg, zzfby), zzcfv.zzf);
    }

    public static final Set zzg(zzcxl zzcxl) {
        return Collections.singleton(new zzdiy(zzcxl, zzcfv.zzf));
    }

    public static final zzdiy zzh(zzcxj zzcxj) {
        return new zzdiy(zzcxj, zzcfv.zze);
    }

    public final View zza() {
        return this.zzb;
    }

    public final zzcli zzb() {
        return this.zzd;
    }

    public final zzcxu zzc() {
        return this.zza;
    }

    public zzdde zzd(Set set) {
        return new zzdde(set);
    }

    public final zzfbh zze() {
        return this.zzc;
    }
}
