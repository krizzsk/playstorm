package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.android.exoplayer2.DefaultLoadControl;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgq implements zzjb {
    private final zzvw zza;
    private final long zzb = zzeg.zzv(50000);
    private final long zzc = zzeg.zzv(50000);
    private final long zzd = zzeg.zzv(2500);
    private final long zze = zzeg.zzv(5000);
    private final long zzf = zzeg.zzv(0);
    private int zzg = 13107200;
    private boolean zzh;

    public zzgq() {
        zzvw zzvw = new zzvw(true, 65536);
        zzj(2500, 0, "bufferForPlaybackMs", "0");
        zzj(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        zzj(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        zzj(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzj(50000, 50000, "maxBufferMs", "minBufferMs");
        zzj(0, 0, "backBufferDurationMs", "0");
        this.zza = zzvw;
    }

    private static void zzj(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        zzcw.zze(z, str + " cannot be less than " + str2);
    }

    private final void zzk(boolean z) {
        this.zzg = 13107200;
        this.zzh = false;
        if (z) {
            this.zza.zze();
        }
    }

    public final long zza() {
        return this.zzf;
    }

    public final void zzb() {
        zzk(false);
    }

    public final void zzc() {
        zzk(true);
    }

    public final void zzd() {
        zzk(true);
    }

    public final void zze(zzju[] zzjuArr, zztz zztz, zzvh[] zzvhArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = zzjuArr.length;
            int i3 = 13107200;
            if (i < 2) {
                if (zzvhArr[i] != null) {
                    if (zzjuArr[i].zzb() != 1) {
                        i3 = DefaultLoadControl.DEFAULT_VIDEO_BUFFER_SIZE;
                    }
                    i2 += i3;
                }
                i++;
            } else {
                int max = Math.max(13107200, i2);
                this.zzg = max;
                this.zza.zzf(max);
                return;
            }
        }
    }

    public final boolean zzf() {
        return false;
    }

    public final boolean zzg(long j, long j2, float f) {
        int zza2 = this.zza.zza();
        int i = this.zzg;
        long j3 = this.zzb;
        if (f > 1.0f) {
            j3 = Math.min(zzeg.zzs(j3, f), this.zzc);
        }
        int i2 = (j2 > Math.max(j3, 500000) ? 1 : (j2 == Math.max(j3, 500000) ? 0 : -1));
        boolean z = false;
        if (i2 < 0) {
            if (zza2 < i) {
                z = true;
            }
            this.zzh = z;
            if (!z && j2 < 500000) {
                Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.zzc || zza2 >= i) {
            this.zzh = false;
        }
        return this.zzh;
    }

    public final boolean zzh(long j, float f, boolean z, long j2) {
        long j3;
        long zzu = zzeg.zzu(j, f);
        if (z) {
            j3 = this.zze;
        } else {
            j3 = this.zzd;
        }
        if (j2 != -9223372036854775807L) {
            j3 = Math.min(j2 / 2, j3);
        }
        return j3 <= 0 || zzu >= j3 || this.zza.zza() >= this.zzg;
    }

    public final zzvw zzi() {
        return this.zza;
    }
}
