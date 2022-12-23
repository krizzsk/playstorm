package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzbtc implements zzboy {
    final /* synthetic */ zzbtd zza;
    private final zzbsf zzb;
    private final zzcga zzc;

    public zzbtc(zzbtd zzbtd, zzbsf zzbsf, zzcga zzcga) {
        this.zza = zzbtd;
        this.zzb = zzbsf;
        this.zzc = zzcga;
    }

    public final void zza(String str) {
        zzbsf zzbsf;
        if (str == null) {
            try {
                this.zzc.zze(new zzbso());
            } catch (IllegalStateException unused) {
                zzbsf = this.zzb;
            } catch (Throwable th) {
                this.zzb.zzb();
                throw th;
            }
        } else {
            this.zzc.zze(new zzbso(str));
        }
        zzbsf = this.zzb;
        zzbsf.zzb();
    }

    public final void zzb(JSONObject jSONObject) {
        zzbsf zzbsf;
        try {
            this.zzc.zzd(this.zza.zza.zza(jSONObject));
            zzbsf = this.zzb;
        } catch (IllegalStateException unused) {
            zzbsf = this.zzb;
        } catch (JSONException e) {
            this.zzc.zze(e);
            zzbsf = this.zzb;
        } catch (Throwable th) {
            this.zzb.zzb();
            throw th;
        }
        zzbsf.zzb();
    }
}
