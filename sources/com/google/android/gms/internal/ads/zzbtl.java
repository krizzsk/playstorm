package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbtl implements zzfuh {
    private final zzbsr zza;
    private final zzbss zzb;
    private final String zzc = "google.afma.activeView.handleUpdate";
    private final zzfvj zzd;

    zzbtl(zzfvj zzfvj, String str, zzbss zzbss, zzbsr zzbsr) {
        this.zzd = zzfvj;
        this.zzb = zzbss;
        this.zza = zzbsr;
    }

    public final zzfvj zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final zzfvj zzb(Object obj) {
        return zzfva.zzn(this.zzd, new zzbtj(this, obj), zzcfv.zzf);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvj zzc(Object obj, zzbsm zzbsm) throws Exception {
        zzcga zzcga = new zzcga();
        zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        zzbok.zzo.zzc(uuid, new zzbtk(this, zzcga));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", uuid);
        jSONObject.put("args", (JSONObject) obj);
        zzbsm.zzl(this.zzc, jSONObject);
        return zzcga;
    }
}
