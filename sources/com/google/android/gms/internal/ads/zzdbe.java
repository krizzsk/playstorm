package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdbe {
    private final Context zza;
    private final zzfby zzb;
    private final Bundle zzc;
    private final zzfbt zzd;

    /* synthetic */ zzdbe(zzdbc zzdbc, zzdbd zzdbd) {
        this.zza = zzdbc.zza;
        this.zzb = zzdbc.zzb;
        this.zzc = zzdbc.zzc;
        this.zzd = zzdbc.zzd;
    }

    /* access modifiers changed from: package-private */
    public final Context zza(Context context) {
        return this.zza;
    }

    /* access modifiers changed from: package-private */
    public final Bundle zzb() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final zzdbc zzc() {
        zzdbc zzdbc = new zzdbc();
        zzdbc.zzc(this.zza);
        zzdbc.zzf(this.zzb);
        zzdbc.zzd(this.zzc);
        return zzdbc;
    }

    /* access modifiers changed from: package-private */
    public final zzfbt zzd() {
        return this.zzd;
    }

    /* access modifiers changed from: package-private */
    public final zzfby zze() {
        return this.zzb;
    }
}
