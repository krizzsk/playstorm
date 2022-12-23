package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzbtk implements zzboy {
    final /* synthetic */ zzbtl zza;
    private final zzcga zzb;

    public zzbtk(zzbtl zzbtl, zzcga zzcga) {
        this.zza = zzbtl;
        this.zzb = zzcga;
    }

    public final void zza(String str) {
        if (str == null) {
            try {
                this.zzb.zze(new zzbso());
            } catch (IllegalStateException unused) {
            }
        } else {
            this.zzb.zze(new zzbso(str));
        }
    }

    public final void zzb(JSONObject jSONObject) {
        try {
            this.zzb.zzd(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.zzb.zze(e);
        }
    }
}
