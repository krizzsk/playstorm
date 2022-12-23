package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzete {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfhq zzd;
    private final zzdwg zze;

    public zzete(Context context, Executor executor, Set set, zzfhq zzfhq, zzdwg zzdwg) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfhq;
        this.zze = zzdwg;
    }

    public final zzfvj zza(Object obj) {
        zzfhg zza2 = zzfhf.zza(this.zza, 8);
        zza2.zzf();
        ArrayList arrayList = new ArrayList(this.zzb.size());
        for (zzetb zzetb : this.zzb) {
            zzfvj zzb2 = zzetb.zzb();
            zzb2.zzc(new zzetc(this, zzetb), zzcfv.zzf);
            arrayList.add(zzb2);
        }
        zzfvj zza3 = zzfva.zzc(arrayList).zza(new zzetd(arrayList, obj), this.zzc);
        if (zzfhs.zza()) {
            zzfhp.zza(zza3, this.zzd, zza2);
        }
        return zza3;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzetb zzetb) {
        long elapsedRealtime = zzt.zzA().elapsedRealtime() - zzt.zzA().elapsedRealtime();
        if (((Boolean) zzbjr.zza.zze()).booleanValue()) {
            String zzc2 = zzfpg.zzc(zzetb.getClass().getCanonicalName());
            zze.zza("Signal runtime (ms) : " + zzc2 + " = " + elapsedRealtime);
        }
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzbM)).booleanValue()) {
            zzdwf zza2 = this.zze.zza();
            zza2.zzb("action", "lat_ms");
            zza2.zzb("lat_grp", "sig_lat_grp");
            zza2.zzb("lat_id", String.valueOf(zzetb.zza()));
            zza2.zzb("clat_ms", String.valueOf(elapsedRealtime));
            zza2.zzh();
        }
    }
}
