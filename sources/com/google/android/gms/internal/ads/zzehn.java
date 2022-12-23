package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzehn implements Callable {
    public final /* synthetic */ zzehs zza;
    public final /* synthetic */ zzfvj zzb;
    public final /* synthetic */ zzfvj zzc;
    public final /* synthetic */ zzfbs zzd;
    public final /* synthetic */ zzfbg zze;
    public final /* synthetic */ JSONObject zzf;

    public /* synthetic */ zzehn(zzehs zzehs, zzfvj zzfvj, zzfvj zzfvj2, zzfbs zzfbs, zzfbg zzfbg, JSONObject jSONObject) {
        this.zza = zzehs;
        this.zzb = zzfvj;
        this.zzc = zzfvj2;
        this.zzd = zzfbs;
        this.zze = zzfbg;
        this.zzf = jSONObject;
    }

    public final Object call() {
        return this.zza.zzc(this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}
