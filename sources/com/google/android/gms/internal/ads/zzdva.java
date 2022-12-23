package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdva implements zzden, zzddg, zzdbv, zzdcm, zza, zzdgy {
    private final zzbdl zza;
    private boolean zzb = false;

    public zzdva(zzbdl zzbdl, @Nullable zzezb zzezb) {
        this.zza = zzbdl;
        zzbdl.zzc(2);
        if (zzezb != null) {
            zzbdl.zzc(IronSourceConstants.RV_API_HAS_AVAILABILITY_TRUE);
        }
    }

    public final synchronized void onAdClicked() {
        if (!this.zzb) {
            this.zza.zzc(7);
            this.zzb = true;
            return;
        }
        this.zza.zzc(8);
    }

    public final void zza(zze zze) {
        switch (zze.zza) {
            case 1:
                this.zza.zzc(101);
                return;
            case 2:
                this.zza.zzc(102);
                return;
            case 3:
                this.zza.zzc(5);
                return;
            case 4:
                this.zza.zzc(103);
                return;
            case 5:
                this.zza.zzc(104);
                return;
            case 6:
                this.zza.zzc(105);
                return;
            case 7:
                this.zza.zzc(106);
                return;
            default:
                this.zza.zzc(4);
                return;
        }
    }

    public final void zzb(zzfbs zzfbs) {
        this.zza.zzb(new zzduw(zzfbs));
    }

    public final void zzbE(zzbzu zzbzu) {
    }

    public final void zzd() {
        this.zza.zzc(1109);
    }

    public final void zze(zzbeg zzbeg) {
        this.zza.zzb(new zzduz(zzbeg));
        this.zza.zzc(1103);
    }

    public final void zzf(zzbeg zzbeg) {
        this.zza.zzb(new zzduy(zzbeg));
        this.zza.zzc(IronSourceConstants.RV_API_HAS_AVAILABILITY_FALSE);
    }

    public final void zzh(boolean z) {
        this.zza.zzc(true != z ? 1108 : 1107);
    }

    public final void zzi(zzbeg zzbeg) {
        this.zza.zzb(new zzdux(zzbeg));
        this.zza.zzc(1104);
    }

    public final void zzk(boolean z) {
        this.zza.zzc(true != z ? 1106 : 1105);
    }

    public final synchronized void zzl() {
        this.zza.zzc(6);
    }

    public final void zzn() {
        this.zza.zzc(3);
    }
}
