package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public final class zzbdq {
    final /* synthetic */ zzbdr zza;
    private final byte[] zzb;
    private int zzc;

    /* synthetic */ zzbdq(zzbdr zzbdr, byte[] bArr, zzbdp zzbdp) {
        this.zza = zzbdr;
        this.zzb = bArr;
    }

    /* access modifiers changed from: private */
    public final synchronized void zzd() {
        try {
            zzbdr zzbdr = this.zza;
            if (zzbdr.zzb) {
                zzbdr.zza.zzj(this.zzb);
                this.zza.zza.zzi(0);
                this.zza.zza.zzg(this.zzc);
                this.zza.zza.zzh((int[]) null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e) {
            zzcfi.zzf("Clearcut log failed", e);
        }
    }

    public final zzbdq zza(int i) {
        this.zzc = i;
        return this;
    }

    public final synchronized void zzc() {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzin)).booleanValue()) {
            this.zza.zzc.execute(new zzbdo(this));
        } else {
            zzd();
        }
    }
}
