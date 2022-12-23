package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzepl implements zzetb {
    private final AtomicReference zza = new AtomicReference();
    private final Clock zzb;
    private final zzetb zzc;
    private final long zzd;

    public zzepl(zzetb zzetb, long j, Clock clock) {
        this.zzb = clock;
        this.zzc = zzetb;
        this.zzd = j;
    }

    public final int zza() {
        return 16;
    }

    public final zzfvj zzb() {
        zzepk zzepk = (zzepk) this.zza.get();
        if (zzepk == null || zzepk.zza()) {
            zzepk = new zzepk(this.zzc.zzb(), this.zzd, this.zzb);
            this.zza.set(zzepk);
        }
        return zzepk.zza;
    }
}
