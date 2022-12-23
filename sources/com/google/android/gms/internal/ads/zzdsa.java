package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdsa implements Callable {
    /* access modifiers changed from: private */
    public final zza zza;
    /* access modifiers changed from: private */
    public final zzclu zzb;
    /* access modifiers changed from: private */
    public final Context zzc;
    /* access modifiers changed from: private */
    public final zzdwg zzd;
    /* access modifiers changed from: private */
    public final zzfgo zze;
    /* access modifiers changed from: private */
    public final zzeen zzf;
    /* access modifiers changed from: private */
    public final Executor zzg;
    /* access modifiers changed from: private */
    public final zzaoc zzh;
    /* access modifiers changed from: private */
    public final zzcfo zzi;
    /* access modifiers changed from: private */
    public final zzfig zzj;

    public zzdsa(Context context, Executor executor, zzaoc zzaoc, zzcfo zzcfo, zza zza2, zzclu zzclu, zzeen zzeen, zzfig zzfig, zzdwg zzdwg, zzfgo zzfgo) {
        this.zzc = context;
        this.zzg = executor;
        this.zzh = zzaoc;
        this.zzi = zzcfo;
        this.zza = zza2;
        this.zzb = zzclu;
        this.zzf = zzeen;
        this.zzj = zzfig;
        this.zzd = zzdwg;
        this.zze = zzfgo;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzdsd zzdsd = new zzdsd(this);
        zzdsd.zzh();
        return zzdsd;
    }
}
