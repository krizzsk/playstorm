package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfjx {
    private JSONObject zza;
    private final zzfkg zzb;

    public zzfjx(zzfkg zzfkg) {
        this.zzb = zzfkg;
    }

    public final JSONObject zza() {
        return this.zza;
    }

    public final void zzb() {
        this.zzb.zzb(new zzfkh(this, (byte[]) null));
    }

    public final void zzc(JSONObject jSONObject, HashSet hashSet, long j) {
        this.zzb.zzb(new zzfki(this, hashSet, jSONObject, j, (byte[]) null));
    }

    public final void zzd(JSONObject jSONObject, HashSet hashSet, long j) {
        this.zzb.zzb(new zzfkj(this, hashSet, jSONObject, j, (byte[]) null));
    }

    public final void zze(JSONObject jSONObject) {
        this.zza = jSONObject;
    }
}
