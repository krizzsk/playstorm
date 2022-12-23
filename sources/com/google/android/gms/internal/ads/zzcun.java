package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzcun implements zzgpu {
    private final zzgqh zza;

    public zzcun(zzgqh zzgqh) {
        this.zza = zzgqh;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((zzcym) this.zza).zza().zzA);
        } catch (JSONException unused) {
            return null;
        }
    }
}
