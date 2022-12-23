package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public class zzeka extends zzbue {
    private final zzdbq zza;
    private final zzdjd zzb;
    private final zzdck zzc;
    private final zzdcz zzd;
    private final zzdde zze;
    private final zzdgl zzf;
    private final zzddy zzg;
    private final zzdjv zzh;
    private final zzdgh zzi;
    private final zzdcf zzj;

    public zzeka(zzdbq zzdbq, zzdjd zzdjd, zzdck zzdck, zzdcz zzdcz, zzdde zzdde, zzdgl zzdgl, zzddy zzddy, zzdjv zzdjv, zzdgh zzdgh, zzdcf zzdcf) {
        this.zza = zzdbq;
        this.zzb = zzdjd;
        this.zzc = zzdck;
        this.zzd = zzdcz;
        this.zze = zzdde;
        this.zzf = zzdgl;
        this.zzg = zzddy;
        this.zzh = zzdjv;
        this.zzi = zzdgh;
        this.zzj = zzdcf;
    }

    public final void zze() {
        this.zza.onAdClicked();
        this.zzb.zzq();
    }

    public final void zzf() {
        this.zzg.zzf(4);
    }

    public final void zzg(int i) {
    }

    public final void zzh(zze zze2) {
    }

    public final void zzi(int i, String str) {
    }

    @Deprecated
    public final void zzj(int i) throws RemoteException {
        zzk(new zze(i, "", AdError.UNDEFINED_DOMAIN, (zze) null, (IBinder) null));
    }

    public final void zzk(zze zze2) {
        this.zzj.zza(zzfcx.zzc(8, zze2));
    }

    public final void zzl(String str) {
        zzk(new zze(0, str, AdError.UNDEFINED_DOMAIN, (zze) null, (IBinder) null));
    }

    public void zzm() {
        this.zzc.zza();
        this.zzi.zzb();
    }

    public final void zzn() {
        this.zzd.zzb();
    }

    public final void zzo() {
        this.zze.zzn();
    }

    public final void zzp() {
        this.zzg.zzb();
        this.zzi.zza();
    }

    public final void zzq(String str, String str2) {
        this.zzf.zzbD(str, str2);
    }

    public final void zzr(zzblu zzblu, String str) {
    }

    public void zzs(zzcaw zzcaw) {
    }

    public void zzt(zzcba zzcba) throws RemoteException {
    }

    public void zzu() throws RemoteException {
    }

    public void zzv() {
        this.zzh.zza();
    }

    public final void zzw() {
        this.zzh.zzb();
    }

    public final void zzx() throws RemoteException {
        this.zzh.zzc();
    }

    public void zzy() {
        this.zzh.zzd();
    }
}
