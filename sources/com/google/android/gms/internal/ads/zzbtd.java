package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbtd implements zzbsp {
    /* access modifiers changed from: private */
    public final zzbsr zza;
    private final zzbss zzb;
    private final zzbsl zzc;
    private final String zzd;

    zzbtd(zzbsl zzbsl, String str, zzbss zzbss, zzbsr zzbsr) {
        this.zzc = zzbsl;
        this.zzd = str;
        this.zzb = zzbss;
        this.zza = zzbsr;
    }

    static /* bridge */ /* synthetic */ void zzd(zzbtd zzbtd, zzbsf zzbsf, zzbsm zzbsm, Object obj, zzcga zzcga) {
        try {
            zzt.zzp();
            String uuid = UUID.randomUUID().toString();
            zzbok.zzo.zzc(uuid, new zzbtc(zzbtd, zzbsf, zzcga));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", zzbtd.zzb.zzb(obj));
            zzbsm.zzl(zzbtd.zzd, jSONObject);
        } catch (Exception e) {
            zzcga.zze(e);
            zze.zzh("Unable to invokeJavascript", e);
            zzbsf.zzb();
        } catch (Throwable th) {
            zzbsf.zzb();
            throw th;
        }
    }

    public final zzfvj zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final zzfvj zzb(Object obj) {
        zzcga zzcga = new zzcga();
        zzbsf zzb2 = this.zzc.zzb((zzaoc) null);
        zzb2.zzi(new zzbta(this, zzb2, obj, zzcga), new zzbtb(this, zzcga, zzb2));
        return zzcga;
    }
}
