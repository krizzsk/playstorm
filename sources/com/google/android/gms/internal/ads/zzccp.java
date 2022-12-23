package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzfa;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzccp {
    private final Clock zza;
    private final zzccn zzb;

    zzccp(Clock clock, zzccn zzccn) {
        this.zza = clock;
        this.zzb = zzccn;
    }

    public static zzccp zza(Context context) {
        return zzcdo.zzd(context).zzb();
    }

    public final void zzb(int i, long j) {
        this.zzb.zzb(i, j);
    }

    public final void zzc() {
        this.zzb.zza();
    }

    public final void zzd(zzfa zzfa) {
        this.zzb.zzb(-1, this.zza.currentTimeMillis());
    }

    public final void zze() {
        this.zzb.zzb(-1, this.zza.currentTimeMillis());
    }
}
