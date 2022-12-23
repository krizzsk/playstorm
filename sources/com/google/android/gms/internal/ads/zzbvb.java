package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public final class zzbvb extends zzbue {
    private final Adapter zza;
    private final zzcav zzb;

    zzbvb(Adapter adapter, zzcav zzcav) {
        this.zza = adapter;
        this.zzb = zzcav;
    }

    public final void zze() throws RemoteException {
        zzcav zzcav = this.zzb;
        if (zzcav != null) {
            zzcav.zze(ObjectWrapper.wrap(this.zza));
        }
    }

    public final void zzf() throws RemoteException {
        zzcav zzcav = this.zzb;
        if (zzcav != null) {
            zzcav.zzf(ObjectWrapper.wrap(this.zza));
        }
    }

    public final void zzg(int i) throws RemoteException {
        zzcav zzcav = this.zzb;
        if (zzcav != null) {
            zzcav.zzg(ObjectWrapper.wrap(this.zza), i);
        }
    }

    public final void zzh(zze zze) throws RemoteException {
    }

    public final void zzi(int i, String str) throws RemoteException {
    }

    public final void zzj(int i) throws RemoteException {
    }

    public final void zzk(zze zze) {
    }

    public final void zzl(String str) {
    }

    public final void zzm() throws RemoteException {
    }

    public final void zzn() throws RemoteException {
    }

    public final void zzo() throws RemoteException {
        zzcav zzcav = this.zzb;
        if (zzcav != null) {
            zzcav.zzi(ObjectWrapper.wrap(this.zza));
        }
    }

    public final void zzp() throws RemoteException {
        zzcav zzcav = this.zzb;
        if (zzcav != null) {
            zzcav.zzj(ObjectWrapper.wrap(this.zza));
        }
    }

    public final void zzq(String str, String str2) throws RemoteException {
    }

    public final void zzr(zzblu zzblu, String str) throws RemoteException {
    }

    public final void zzs(zzcaw zzcaw) throws RemoteException {
    }

    public final void zzt(zzcba zzcba) throws RemoteException {
        zzcav zzcav = this.zzb;
        if (zzcav != null) {
            zzcav.zzm(ObjectWrapper.wrap(this.zza), new zzcaw(zzcba.zzf(), zzcba.zze()));
        }
    }

    public final void zzu() throws RemoteException {
        zzcav zzcav = this.zzb;
        if (zzcav != null) {
            zzcav.zzn(ObjectWrapper.wrap(this.zza));
        }
    }

    public final void zzv() throws RemoteException {
    }

    public final void zzw() throws RemoteException {
    }

    public final void zzx() throws RemoteException {
    }

    public final void zzy() throws RemoteException {
        zzcav zzcav = this.zzb;
        if (zzcav != null) {
            zzcav.zzo(ObjectWrapper.wrap(this.zza));
        }
    }
}
