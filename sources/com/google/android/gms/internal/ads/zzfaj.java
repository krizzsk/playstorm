package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfaj extends zzfkm implements zzddg, zzdbv, zzdbs, zzdci, zzded, zzeys, zzdjf {
    private final zzfdj zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicReference zzh = new AtomicReference();

    public zzfaj(zzfdj zzfdj) {
        this.zza = zzfdj;
    }

    public final void zza(zze zze2) {
        int i = zze2.zza;
        zzeyj.zza(this.zzc, new zzezp(zze2));
        zzeyj.zza(this.zzc, new zzezq(i));
        zzeyj.zza(this.zze, new zzezr(i));
    }

    public final void zzb(zzfkm zzfkm) {
        this.zzb.set(zzfkm);
    }

    public final void zzbL(zzeys zzeys) {
        throw null;
    }

    public final void zzbv() {
        zzeyj.zza(this.zze, zzezu.zza);
    }

    public final void zzc(zzde zzde) {
        this.zzh.set(zzde);
    }

    public final void zzd(zzcbg zzcbg) {
        this.zzd.set(zzcbg);
    }

    public final void zze(zzcbk zzcbk) {
        this.zzc.set(zzcbk);
    }

    @Deprecated
    public final void zzf(zzcaq zzcaq) {
        this.zze.set(zzcaq);
    }

    public final void zzg(zzs zzs) {
        zzeyj.zza(this.zzh, new zzezo(zzs));
    }

    @Deprecated
    public final void zzh(zzcal zzcal) {
        this.zzg.set(zzcal);
    }

    public final void zzi(zzcbl zzcbl) {
        this.zzf.set(zzcbl);
    }

    public final void zzj() {
        this.zza.zza();
        zzeyj.zza(this.zzd, zzezv.zza);
        zzeyj.zza(this.zze, zzezw.zza);
    }

    public final void zzk(zze zze2) {
        zzeyj.zza(this.zzd, new zzezs(zze2));
        zzeyj.zza(this.zzd, new zzezt(zze2));
    }

    public final void zzm() {
        zzeyj.zza(this.zze, zzfae.zza);
    }

    public final void zzn() {
        zzeyj.zza(this.zzc, zzfab.zza);
        zzeyj.zza(this.zze, zzfac.zza);
    }

    public final void zzo() {
        zzeyj.zza(this.zzd, zzezx.zza);
        zzeyj.zza(this.zze, zzezz.zza);
        zzeyj.zza(this.zzd, zzfaa.zza);
    }

    public final void zzp(zzcak zzcak, String str, String str2) {
        zzeyj.zza(this.zzd, new zzfaf(zzcak));
        zzeyj.zza(this.zzf, new zzfag(zzcak, str, str2));
        zzeyj.zza(this.zze, new zzfah(zzcak));
        zzeyj.zza(this.zzg, new zzfai(zzcak, str, str2));
    }

    public final void zzq() {
        zzeyj.zza(this.zzd, zzezn.zza);
    }

    public final void zzr() {
        zzeyj.zza(this.zze, zzezy.zza);
    }

    public final void zzv() {
        zzeyj.zza(this.zzb, zzfad.zza);
    }
}
