package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzekv {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();
    private final zzdub zzb;

    public zzekv(zzdub zzdub) {
        this.zzb = zzdub;
    }

    @CheckForNull
    public final zzbvs zza(String str) {
        if (this.zza.containsKey(str)) {
            return (zzbvs) this.zza.get(str);
        }
        return null;
    }

    public final void zzb(String str) {
        try {
            this.zza.put(str, this.zzb.zzb(str));
        } catch (RemoteException e) {
            zze.zzh("Couldn't create RTB adapter : ", e);
        }
    }
}
