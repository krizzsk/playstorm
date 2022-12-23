package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzca;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzbrx implements zzbol {
    final /* synthetic */ zzbrg zza;
    final /* synthetic */ zzca zzb;
    final /* synthetic */ zzbsl zzc;

    zzbrx(zzbsl zzbsl, zzaoc zzaoc, zzbrg zzbrg, zzca zzca) {
        this.zzc = zzbsl;
        this.zza = zzbrg;
        this.zzb = zzca;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.zzbol, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzbsm zzbsm = (zzbsm) obj;
        synchronized (this.zzc.zza) {
            zze.zzi("JS Engine is requesting an update");
            if (this.zzc.zzi == 0) {
                zze.zzi("Starting reload.");
                this.zzc.zzi = 2;
                this.zzc.zzd((zzaoc) null);
            }
            this.zza.zzr("/requestReload", this.zzb.zza());
        }
    }
}
