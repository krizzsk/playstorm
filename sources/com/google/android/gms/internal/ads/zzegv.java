package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzegv extends zzcau implements zzddc {
    private zzcav zza;
    private zzddb zzb;
    private zzdjq zzc;

    public final synchronized void zza(zzddb zzddb) {
        this.zzb = zzddb;
    }

    public final synchronized void zzc(zzcav zzcav) {
        this.zza = zzcav;
    }

    public final synchronized void zzd(zzdjq zzdjq) {
        this.zzc = zzdjq;
    }

    public final synchronized void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcav zzcav = this.zza;
        if (zzcav != null) {
            ((zzejo) zzcav).zzb.onAdClicked();
        }
    }

    public final synchronized void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcav zzcav = this.zza;
        if (zzcav != null) {
            zzcav.zzf(iObjectWrapper);
        }
    }

    public final synchronized void zzg(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzddb zzddb = this.zzb;
        if (zzddb != null) {
            zzddb.zza(i);
        }
    }

    public final synchronized void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcav zzcav = this.zza;
        if (zzcav != null) {
            ((zzejo) zzcav).zzc.zzb();
        }
    }

    public final synchronized void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzddb zzddb = this.zzb;
        if (zzddb != null) {
            zzddb.zzd();
        }
    }

    public final synchronized void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcav zzcav = this.zza;
        if (zzcav != null) {
            ((zzejo) zzcav).zza.zzb();
        }
    }

    public final synchronized void zzk(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzdjq zzdjq = this.zzc;
        if (zzdjq != null) {
            zze.zzj("Fail to initialize adapter ".concat(String.valueOf(((zzejn) zzdjq).zzc.zza)));
        }
    }

    public final synchronized void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzdjq zzdjq = this.zzc;
        if (zzdjq != null) {
            ((zzejn) zzdjq).zzd.zzb.execute(new zzejm((zzejn) zzdjq, ((zzejn) zzdjq).zza, ((zzejn) zzdjq).zzb, ((zzejn) zzdjq).zzc));
        }
    }

    public final synchronized void zzm(IObjectWrapper iObjectWrapper, zzcaw zzcaw) throws RemoteException {
        zzcav zzcav = this.zza;
        if (zzcav != null) {
            ((zzejo) zzcav).zzd.zza(zzcaw);
        }
    }

    public final synchronized void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcav zzcav = this.zza;
        if (zzcav != null) {
            ((zzejo) zzcav).zzc.zze();
        }
    }

    public final synchronized void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcav zzcav = this.zza;
        if (zzcav != null) {
            ((zzejo) zzcav).zzd.zzc();
        }
    }
}
