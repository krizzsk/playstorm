package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zztv extends zzci {
    private static final Object zzc = new Object();
    private static final zzbb zzd;
    private final long zze;
    private final long zzf;
    private final boolean zzg;
    private final zzbb zzh;
    private final zzau zzi;

    static {
        zzah zzah = new zzah();
        zzah.zza("SinglePeriodTimeline");
        zzah.zzb(Uri.EMPTY);
        zzd = zzah.zzc();
    }

    public zztv(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, Object obj, zzbb zzbb, zzau zzau) {
        this.zze = j4;
        this.zzf = j5;
        this.zzg = z;
        this.zzh = zzbb;
        this.zzi = zzau;
    }

    public final int zza(Object obj) {
        return zzc.equals(obj) ? 0 : -1;
    }

    public final int zzb() {
        return 1;
    }

    public final int zzc() {
        return 1;
    }

    public final zzcf zzd(int i, zzcf zzcf, boolean z) {
        zzcw.zza(i, 0, 1);
        zzcf.zzk((Object) null, z ? zzc : null, 0, this.zze, 0, zzd.zza, false);
        return zzcf;
    }

    public final zzch zze(int i, zzch zzch, long j) {
        zzcw.zza(i, 0, 1);
        zzch.zza(zzch.zza, this.zzh, (Object) null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.zzg, false, this.zzi, 0, this.zzf, 0, 0, 0);
        return zzch;
    }

    public final Object zzf(int i) {
        zzcw.zza(i, 0, 1);
        return zzc;
    }
}
