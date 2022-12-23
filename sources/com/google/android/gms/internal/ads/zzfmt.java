package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfmt {
    final /* synthetic */ zzfmu zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    /* synthetic */ zzfmt(zzfmu zzfmu, byte[] bArr, zzfms zzfms) {
        this.zza = zzfmu;
        this.zzb = bArr;
    }

    public final zzfmt zza(int i) {
        this.zzd = i;
        return this;
    }

    public final zzfmt zzb(int i) {
        this.zzc = i;
        return this;
    }

    public final synchronized void zzc() {
        try {
            zzfmu zzfmu = this.zza;
            if (zzfmu.zzb) {
                zzfmu.zza.zzj(this.zzb);
                this.zza.zza.zzi(this.zzc);
                this.zza.zza.zzg(this.zzd);
                this.zza.zza.zzh((int[]) null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e) {
            Log.d("GASS", "Clearcut log failed", e);
        }
    }
}
