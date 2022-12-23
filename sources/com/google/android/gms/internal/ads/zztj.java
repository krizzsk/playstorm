package com.google.android.gms.internal.ads;

import android.support.p003v4.media.session.PlaybackStateCompat;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zztj implements zzvq {
    public long zza;
    public long zzb;
    public zzvp zzc;
    public zztj zzd;

    public zztj(long j, int i) {
        zze(j, 65536);
    }

    public final int zza(long j) {
        long j2 = this.zza;
        int i = this.zzc.zzb;
        return (int) (j - j2);
    }

    public final zztj zzb() {
        this.zzc = null;
        zztj zztj = this.zzd;
        this.zzd = null;
        return zztj;
    }

    public final zzvp zzc() {
        zzvp zzvp = this.zzc;
        if (zzvp != null) {
            return zzvp;
        }
        throw null;
    }

    public final zzvq zzd() {
        zztj zztj = this.zzd;
        if (zztj == null || zztj.zzc == null) {
            return null;
        }
        return zztj;
    }

    public final void zze(long j, int i) {
        zzcw.zzf(this.zzc == null);
        this.zza = j;
        this.zzb = j + PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
    }
}
