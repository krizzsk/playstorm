package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdbc {
    /* access modifiers changed from: private */
    public Context zza;
    /* access modifiers changed from: private */
    public zzfby zzb;
    /* access modifiers changed from: private */
    public Bundle zzc;
    /* access modifiers changed from: private */
    public zzfbt zzd;

    public final zzdbc zzc(Context context) {
        this.zza = context;
        return this;
    }

    public final zzdbc zzd(Bundle bundle) {
        this.zzc = bundle;
        return this;
    }

    public final zzdbc zze(zzfbt zzfbt) {
        this.zzd = zzfbt;
        return this;
    }

    public final zzdbc zzf(zzfby zzfby) {
        this.zzb = zzfby;
        return this;
    }

    public final zzdbe zzg() {
        return new zzdbe(this, (zzdbd) null);
    }
}
