package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzckj implements zzer {
    private final zzer zza;
    private final long zzb;
    private final zzer zzc;
    private long zzd;
    private Uri zze;

    zzckj(zzer zzer, int i, zzer zzer2) {
        this.zza = zzer;
        this.zzb = (long) i;
        this.zzc = zzer2;
    }

    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.zzd;
        long j2 = this.zzb;
        if (j < j2) {
            int zza2 = this.zza.zza(bArr, i, (int) Math.min((long) i2, j2 - j));
            long j3 = this.zzd + ((long) zza2);
            this.zzd = j3;
            i3 = zza2;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j < this.zzb) {
            return i3;
        }
        int zza3 = this.zzc.zza(bArr, i + i3, i2 - i3);
        this.zzd += (long) zza3;
        return i3 + zza3;
    }

    public final long zzb(zzew zzew) throws IOException {
        zzew zzew2;
        zzew zzew3 = zzew;
        this.zze = zzew3.zza;
        long j = zzew3.zzf;
        long j2 = this.zzb;
        zzew zzew4 = null;
        if (j >= j2) {
            zzew2 = null;
        } else {
            long j3 = zzew3.zzg;
            zzew2 = new zzew(zzew3.zza, (byte[]) null, j, j, j3 != -1 ? Math.min(j3, j2 - j) : j2 - j, (String) null, 0);
        }
        long j4 = zzew3.zzg;
        if (j4 == -1 || zzew3.zzf + j4 > this.zzb) {
            long max = Math.max(this.zzb, zzew3.zzf);
            long j5 = zzew3.zzg;
            zzew4 = new zzew(zzew3.zza, (byte[]) null, max, max, j5 != -1 ? Math.min(j5, (zzew3.zzf + j5) - this.zzb) : -1, (String) null, 0);
        }
        long j6 = 0;
        long zzb2 = zzew2 != null ? this.zza.zzb(zzew2) : 0;
        if (zzew4 != null) {
            j6 = this.zzc.zzb(zzew4);
        }
        this.zzd = zzew3.zzf;
        if (zzb2 == -1 || j6 == -1) {
            return -1;
        }
        return zzb2 + j6;
    }

    public final Uri zzc() {
        return this.zze;
    }

    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    public final Map zze() {
        return zzfrk.zzd();
    }

    public final void zzf(zzft zzft) {
    }
}
