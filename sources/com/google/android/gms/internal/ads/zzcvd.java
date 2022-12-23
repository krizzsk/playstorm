package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzcvd extends zzcxw {
    private final View zzc;
    private final zzcli zzd;
    private final zzfbh zze;
    private final int zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final zzcuv zzi;
    private zzbcj zzj;

    zzcvd(zzcxv zzcxv, View view, zzcli zzcli, zzfbh zzfbh, int i, boolean z, boolean z2, zzcuv zzcuv) {
        super(zzcxv);
        this.zzc = view;
        this.zzd = zzcli;
        this.zze = zzfbh;
        this.zzf = i;
        this.zzg = z;
        this.zzh = z2;
        this.zzi = zzcuv;
    }

    public final int zza() {
        return this.zzf;
    }

    public final View zzb() {
        return this.zzc;
    }

    public final zzfbh zzc() {
        return zzfcc.zzb(this.zzb.zzs, this.zze);
    }

    public final void zzd(zzbbz zzbbz) {
        this.zzd.zzaj(zzbbz);
    }

    public final boolean zze() {
        return this.zzg;
    }

    public final boolean zzf() {
        return this.zzh;
    }

    public final boolean zzg() {
        return this.zzd.zzay();
    }

    public final boolean zzh() {
        return this.zzd.zzP() != null && this.zzd.zzP().zzJ();
    }

    public final void zzi(long j, int i) {
        this.zzi.zza(j, i);
    }

    public final zzbcj zzj() {
        return this.zzj;
    }

    public final void zzk(zzbcj zzbcj) {
        this.zzj = zzbcj;
    }
}
