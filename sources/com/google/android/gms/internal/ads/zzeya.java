package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzw;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzeya implements zzfei {
    public final zzeyu zza;
    public final zzeyw zzb;
    public final zzl zzc;
    public final String zzd;
    public final Executor zze;
    public final zzw zzf;
    public final zzfdx zzg;

    public zzeya(zzeyu zzeyu, zzeyw zzeyw, zzl zzl, String str, Executor executor, zzw zzw, zzfdx zzfdx) {
        this.zza = zzeyu;
        this.zzb = zzeyw;
        this.zzc = zzl;
        this.zzd = str;
        this.zze = executor;
        this.zzf = zzw;
        this.zzg = zzfdx;
    }

    public final zzfdx zza() {
        return this.zzg;
    }

    public final Executor zzb() {
        return this.zze;
    }
}
