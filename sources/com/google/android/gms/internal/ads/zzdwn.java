package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public class zzdwn {
    protected final String zza = ((String) zzbji.zzb.zze());
    protected final Map zzb = new HashMap();
    protected final Executor zzc;
    protected final zzcfn zzd;
    protected final boolean zze;
    private final zzfgy zzf;
    private final boolean zzg;
    private final boolean zzh;

    protected zzdwn(Executor executor, zzcfn zzcfn, zzfgy zzfgy) {
        this.zzc = executor;
        this.zzd = zzcfn;
        this.zze = ((Boolean) zzay.zzc().zzb(zzbhy.zzbJ)).booleanValue();
        this.zzf = zzfgy;
        this.zzg = ((Boolean) zzay.zzc().zzb(zzbhy.zzbM)).booleanValue();
        this.zzh = ((Boolean) zzay.zzc().zzb(zzbhy.zzfX)).booleanValue();
    }

    private final void zza(Map map, boolean z) {
        if (!map.isEmpty()) {
            String zza2 = this.zzf.zza(map);
            zze.zza(zza2);
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("scar"));
            if (!this.zze) {
                return;
            }
            if (z && !this.zzg) {
                return;
            }
            if (!parseBoolean || this.zzh) {
                this.zzc.execute(new zzdwm(this, zza2));
                return;
            }
            return;
        }
        zze.zze("Empty paramMap.");
    }

    /* access modifiers changed from: protected */
    public final String zzb(Map map) {
        return this.zzf.zza(map);
    }

    public final ConcurrentHashMap zzc() {
        return new ConcurrentHashMap(this.zzb);
    }

    public final void zzd(Map map) {
        zza(map, true);
    }

    public final void zze(Map map) {
        zza(map, false);
    }
}
