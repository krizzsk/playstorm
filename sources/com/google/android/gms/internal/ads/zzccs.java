package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzccs {
    private Context zza;
    private Clock zzb;
    private zzg zzc;
    private zzcdn zzd;

    private zzccs() {
    }

    /* synthetic */ zzccs(zzccr zzccr) {
    }

    public final zzccs zza(zzg zzg) {
        this.zzc = zzg;
        return this;
    }

    public final zzccs zzb(Context context) {
        if (context != null) {
            this.zza = context;
            return this;
        }
        throw null;
    }

    public final zzccs zzc(Clock clock) {
        if (clock != null) {
            this.zzb = clock;
            return this;
        }
        throw null;
    }

    public final zzccs zzd(zzcdn zzcdn) {
        this.zzd = zzcdn;
        return this;
    }

    public final zzcdo zze() {
        zzgqc.zzc(this.zza, Context.class);
        zzgqc.zzc(this.zzb, Clock.class);
        zzgqc.zzc(this.zzc, zzg.class);
        zzgqc.zzc(this.zzd, zzcdn.class);
        return new zzccu(this.zza, this.zzb, this.zzc, this.zzd, (zzcct) null);
    }
}
