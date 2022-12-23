package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzw;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzdrx implements zza, zzbnl, zzo, zzbnn, zzw {
    private zza zza;
    private zzbnl zzb;
    private zzo zzc;
    private zzbnn zzd;
    private zzw zze;

    private zzdrx() {
    }

    /* synthetic */ zzdrx(zzdrw zzdrw) {
    }

    /* access modifiers changed from: private */
    public final synchronized void zzi(zza zza2, zzbnl zzbnl, zzo zzo, zzbnn zzbnn, zzw zzw) {
        this.zza = zza2;
        this.zzb = zzbnl;
        this.zzc = zzo;
        this.zzd = zzbnn;
        this.zze = zzw;
    }

    public final synchronized void onAdClicked() {
        zza zza2 = this.zza;
        if (zza2 != null) {
            zza2.onAdClicked();
        }
    }

    public final synchronized void zza(String str, Bundle bundle) {
        zzbnl zzbnl = this.zzb;
        if (zzbnl != null) {
            zzbnl.zza(str, bundle);
        }
    }

    public final synchronized void zzb() {
        zzo zzo = this.zzc;
        if (zzo != null) {
            zzo.zzb();
        }
    }

    public final synchronized void zzbC() {
        zzo zzo = this.zzc;
        if (zzo != null) {
            zzo.zzbC();
        }
    }

    public final synchronized void zzbD(String str, String str2) {
        zzbnn zzbnn = this.zzd;
        if (zzbnn != null) {
            zzbnn.zzbD(str, str2);
        }
    }

    public final synchronized void zzbK() {
        zzo zzo = this.zzc;
        if (zzo != null) {
            zzo.zzbK();
        }
    }

    public final synchronized void zzbr() {
        zzo zzo = this.zzc;
        if (zzo != null) {
            zzo.zzbr();
        }
    }

    public final synchronized void zze() {
        zzo zzo = this.zzc;
        if (zzo != null) {
            zzo.zze();
        }
    }

    public final synchronized void zzf(int i) {
        zzo zzo = this.zzc;
        if (zzo != null) {
            zzo.zzf(i);
        }
    }

    public final synchronized void zzg() {
        zzw zzw = this.zze;
        if (zzw != null) {
            ((zzdry) zzw).zza.zzb();
        }
    }
}
