package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzcul implements Runnable {
    public final /* synthetic */ zzcum zza;
    public final /* synthetic */ JSONObject zzb;

    public /* synthetic */ zzcul(zzcum zzcum, JSONObject jSONObject) {
        this.zza = zzcum;
        this.zzb = jSONObject;
    }

    public final void run() {
        this.zza.zzd(this.zzb);
    }
}
