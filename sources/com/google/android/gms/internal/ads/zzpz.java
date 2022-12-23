package com.google.android.gms.internal.ads;

import android.util.Log;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzpz {
    private long zza;
    private long zzb;
    private boolean zzc;

    zzpz() {
    }

    private final long zzd(long j) {
        return this.zza + Math.max(0, ((this.zzb - 529) * 1000000) / j);
    }

    public final long zza(zzad zzad) {
        return zzd((long) zzad.zzA);
    }

    public final long zzb(zzad zzad, zzgc zzgc) {
        if (this.zzb == 0) {
            this.zza = zzgc.zzd;
        }
        if (this.zzc) {
            return zzgc.zzd;
        }
        ByteBuffer byteBuffer = zzgc.zzb;
        if (byteBuffer != null) {
            byte b = 0;
            for (int i = 0; i < 4; i++) {
                b = (b << 8) | (byteBuffer.get(i) & 255);
            }
            int zzc2 = zzzm.zzc(b);
            if (zzc2 == -1) {
                this.zzc = true;
                this.zzb = 0;
                this.zza = zzgc.zzd;
                Log.w("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                return zzgc.zzd;
            }
            long zzd = zzd((long) zzad.zzA);
            this.zzb += (long) zzc2;
            return zzd;
        }
        throw null;
    }

    public final void zzc() {
        this.zza = 0;
        this.zzb = 0;
        this.zzc = false;
    }
}
