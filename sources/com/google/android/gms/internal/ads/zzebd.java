package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzebd extends zzeax {
    private String zzg;
    private int zzh = 1;

    public zzebd(Context context) {
        this.zzf = new zzbzf(context, zzt.zzt().zzb(), this, this);
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zze.zze("Cannot connect to remote service, fallback to local instance.");
        this.zza.zze(new zzebm(1));
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    int i = this.zzh;
                    if (i == 2) {
                        this.zzf.zzp().zze(this.zze, new zzeaw(this));
                    } else if (i == 3) {
                        this.zzf.zzp().zzh(this.zzg, new zzeaw(this));
                    } else {
                        this.zza.zze(new zzebm(1));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zze(new zzebm(1));
                } catch (Throwable th) {
                    zzt.zzo().zzt(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                    this.zza.zze(new zzebm(1));
                }
            }
        }
    }

    public final zzfvj zzb(zzbzu zzbzu) {
        synchronized (this.zzb) {
            int i = this.zzh;
            if (i != 1 && i != 2) {
                zzfvj zzh2 = zzfva.zzh(new zzebm(2));
                return zzh2;
            } else if (this.zzc) {
                zzcga zzcga = this.zza;
                return zzcga;
            } else {
                this.zzh = 2;
                this.zzc = true;
                this.zze = zzbzu;
                this.zzf.checkAvailabilityAndConnect();
                this.zza.zzc(new zzebc(this), zzcfv.zzf);
                zzcga zzcga2 = this.zza;
                return zzcga2;
            }
        }
    }

    public final zzfvj zzc(String str) {
        synchronized (this.zzb) {
            int i = this.zzh;
            if (i != 1 && i != 3) {
                zzfvj zzh2 = zzfva.zzh(new zzebm(2));
                return zzh2;
            } else if (this.zzc) {
                zzcga zzcga = this.zza;
                return zzcga;
            } else {
                this.zzh = 3;
                this.zzc = true;
                this.zzg = str;
                this.zzf.checkAvailabilityAndConnect();
                this.zza.zzc(new zzebb(this), zzcfv.zzf);
                zzcga zzcga2 = this.zza;
                return zzcga2;
            }
        }
    }
}
