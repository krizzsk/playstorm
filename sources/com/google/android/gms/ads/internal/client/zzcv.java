package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.internal.ads.zzcfi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public final class zzcv implements MuteThisAdReason {
    private final String zza;
    private final zzcu zzb;

    public zzcv(zzcu zzcu) {
        String str;
        this.zzb = zzcu;
        try {
            str = zzcu.zze();
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
            str = null;
        }
        this.zza = str;
    }

    public final String getDescription() {
        return this.zza;
    }

    public final String toString() {
        return this.zza;
    }

    public final zzcu zza() {
        return this.zzb;
    }
}
