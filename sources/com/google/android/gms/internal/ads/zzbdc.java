package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zze;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzbdc implements Runnable {
    public final /* synthetic */ zzbdf zza;
    public final /* synthetic */ zzbcw zzb;
    public final /* synthetic */ zzbcx zzc;
    public final /* synthetic */ zzcga zzd;

    public /* synthetic */ zzbdc(zzbdf zzbdf, zzbcw zzbcw, zzbcx zzbcx, zzcga zzcga) {
        this.zza = zzbdf;
        this.zzb = zzbcw;
        this.zzc = zzbcx;
        this.zzd = zzcga;
    }

    public final void run() {
        zzbcu zzbcu;
        zzbdf zzbdf = this.zza;
        zzbcw zzbcw = this.zzb;
        zzbcx zzbcx = this.zzc;
        zzcga zzcga = this.zzd;
        try {
            zzbcz zzq = zzbcw.zzq();
            if (zzbcw.zzp()) {
                zzbcu = zzq.zzg(zzbcx);
            } else {
                zzbcu = zzq.zzf(zzbcx);
            }
            if (!zzbcu.zze()) {
                zzcga.zze(new RuntimeException("No entry contents."));
                zzbdh.zze(zzbdf.zzc);
                return;
            }
            zzbde zzbde = new zzbde(zzbdf, zzbcu.zzc(), 1);
            int read = zzbde.read();
            if (read != -1) {
                zzbde.unread(read);
                zzcga.zzd(zzbdj.zzb(zzbde, zzbcu.zzd(), zzbcu.zzg(), zzbcu.zza(), zzbcu.zzf()));
                return;
            }
            throw new IOException("Unable to read from cache.");
        } catch (RemoteException | IOException e) {
            zze.zzh("Unable to obtain a cache service instance.", e);
            zzcga.zze(e);
            zzbdh.zze(zzbdf.zzc);
        }
    }
}
