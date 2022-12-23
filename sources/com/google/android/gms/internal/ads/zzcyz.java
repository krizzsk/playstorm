package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzcyz {
    private final zzeas zza;
    private final zzfby zzb;
    private final zzfge zzc;
    private final zzcsm zzd;
    private final zzeiq zze;
    /* access modifiers changed from: private */
    public final zzdgw zzf;
    private zzfbs zzg;
    private final zzebw zzh;
    private final zzday zzi;
    private final Executor zzj;
    private final zzebj zzk;
    private final zzefd zzl;

    zzcyz(zzeas zzeas, zzfby zzfby, zzfge zzfge, zzcsm zzcsm, zzeiq zzeiq, zzdgw zzdgw, zzfbs zzfbs, zzebw zzebw, zzday zzday, Executor executor, zzebj zzebj, zzefd zzefd) {
        this.zza = zzeas;
        this.zzb = zzfby;
        this.zzc = zzfge;
        this.zzd = zzcsm;
        this.zze = zzeiq;
        this.zzf = zzdgw;
        this.zzg = zzfbs;
        this.zzh = zzebw;
        this.zzi = zzday;
        this.zzj = executor;
        this.zzk = zzebj;
        this.zzl = zzefd;
    }

    public final zze zza(Throwable th) {
        return zzfcx.zzb(th, this.zzl);
    }

    public final zzdgw zzc() {
        return this.zzf;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfbs zzd(zzfbs zzfbs) throws Exception {
        this.zzd.zza(zzfbs);
        return zzfbs;
    }

    public final zzfvj zze(zzfdu zzfdu) {
        zzffj zza2 = this.zzc.zzb(zzffy.GET_CACHE_KEY, this.zzi.zzc()).zzf(new zzcyw(this, zzfdu)).zza();
        zzfva.zzr(zza2, new zzcyx(this), this.zzj);
        return zza2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvj zzf(zzfdu zzfdu, zzbzu zzbzu) throws Exception {
        zzbzu.zzi = zzfdu;
        return this.zzh.zza(zzbzu);
    }

    public final zzfvj zzg(zzbzu zzbzu) {
        zzffj zza2 = this.zzc.zzb(zzffy.NOTIFY_CACHE_HIT, this.zzh.zzf(zzbzu)).zza();
        zzfva.zzr(zza2, new zzcyy(this), this.zzj);
        return zza2;
    }

    public final zzfvj zzh(zzfvj zzfvj) {
        zzffv zzf2 = this.zzc.zzb(zzffy.RENDERER, zzfvj).zze(new zzcyv(this)).zzf(this.zze);
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzew)).booleanValue()) {
            zzf2 = zzf2.zzi((long) ((Integer) zzay.zzc().zzb(zzbhy.zzex)).intValue(), TimeUnit.SECONDS);
        }
        return zzf2.zza();
    }

    public final zzfvj zzi() {
        zzl zzl2 = this.zzb.zzd;
        if (zzl2.zzx == null && zzl2.zzs == null) {
            return zzj(this.zzi.zzc());
        }
        zzfge zzfge = this.zzc;
        return zzffo.zzc(this.zza.zza(), zzffy.PRELOADED_LOADER, zzfge).zza();
    }

    public final zzfvj zzj(zzfvj zzfvj) {
        if (this.zzg != null) {
            zzfge zzfge = this.zzc;
            return zzffo.zzc(zzfva.zzi(this.zzg), zzffy.SERVER_TRANSACTION, zzfge).zza();
        }
        zzt.zzc().zzj();
        return this.zzc.zzb(zzffy.SERVER_TRANSACTION, zzfvj).zzf(new zzcyu(this.zzk)).zza();
    }

    public final void zzk(zzfbs zzfbs) {
        this.zzg = zzfbs;
    }
}
