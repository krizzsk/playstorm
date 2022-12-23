package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzemn {
    private final zzems zza;
    private final String zzb;
    /* access modifiers changed from: private */
    public zzdh zzc;

    public zzemn(zzems zzems, String str) {
        this.zza = zzems;
        this.zzb = str;
    }

    public final synchronized String zza() {
        String str;
        str = null;
        try {
            zzdh zzdh = this.zzc;
            if (zzdh != null) {
                str = zzdh.zzg();
            }
        } catch (RemoteException e) {
            zze.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return str;
    }

    public final synchronized String zzb() {
        String str;
        str = null;
        try {
            zzdh zzdh = this.zzc;
            if (zzdh != null) {
                str = zzdh.zzg();
            }
        } catch (RemoteException e) {
            zze.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return str;
    }

    public final synchronized void zzd(zzl zzl, int i) throws RemoteException {
        this.zzc = null;
        this.zza.zzb(zzl, this.zzb, new zzemt(i), new zzemm(this));
    }

    public final synchronized boolean zze() throws RemoteException {
        return this.zza.zza();
    }
}
