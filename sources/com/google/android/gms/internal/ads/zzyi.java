package com.google.android.gms.internal.ads;

import android.support.p003v4.media.session.PlaybackStateCompat;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public class zzyi {
    protected final zzyc zza;
    protected final zzyh zzb;
    protected zzye zzc;
    private final int zzd;

    protected zzyi(zzyf zzyf, zzyh zzyh, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.zzb = zzyh;
        this.zzd = i;
        this.zza = new zzyc(zzyf, j, 0, j3, j4, j5, j6);
    }

    protected static final int zzf(zzyt zzyt, long j, zzzs zzzs) {
        if (j == zzyt.zzf()) {
            return 0;
        }
        zzzs.zza = j;
        return 1;
    }

    protected static final boolean zzg(zzyt zzyt, long j) throws IOException {
        long zzf = j - zzyt.zzf();
        if (zzf < 0 || zzf > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            return false;
        }
        ((zzym) zzyt).zzo((int) zzf, false);
        return true;
    }

    public final int zza(zzyt zzyt, zzzs zzzs) throws IOException {
        while (true) {
            zzye zzye = this.zzc;
            zzcw.zzb(zzye);
            long zzb2 = zzye.zzf;
            long zza2 = zzye.zzg;
            long zzc2 = zzye.zzh;
            if (zza2 - zzb2 <= ((long) this.zzd)) {
                zzc(false, zzb2);
                return zzf(zzyt, zzb2, zzzs);
            } else if (!zzg(zzyt, zzc2)) {
                return zzf(zzyt, zzc2, zzzs);
            } else {
                zzyt.zzj();
                zzyg zza3 = this.zzb.zza(zzyt, zzye.zzb);
                int zza4 = zza3.zzb;
                if (zza4 == -3) {
                    zzc(false, zzc2);
                    return zzf(zzyt, zzc2, zzzs);
                } else if (zza4 == -2) {
                    zzye.zzh(zzye, zza3.zzc, zza3.zzd);
                } else if (zza4 != -1) {
                    zzg(zzyt, zza3.zzd);
                    zzc(true, zza3.zzd);
                    return zzf(zzyt, zza3.zzd, zzzs);
                } else {
                    zzye.zzg(zzye, zza3.zzc, zza3.zzd);
                }
            }
        }
    }

    public final zzzv zzb() {
        return this.zza;
    }

    /* access modifiers changed from: protected */
    public final void zzc(boolean z, long j) {
        this.zzc = null;
        this.zzb.zzb();
    }

    public final void zzd(long j) {
        long j2 = j;
        zzye zzye = this.zzc;
        if (zzye == null || zzye.zza != j2) {
            long zzf = this.zza.zzf(j2);
            zzyc zzyc = this.zza;
            zzye zzye2 = r1;
            zzye zzye3 = new zzye(j, zzf, 0, zzyc.zzc, zzyc.zzd, zzyc.zze, zzyc.zzf);
            this.zzc = zzye2;
        }
    }

    public final boolean zze() {
        return this.zzc != null;
    }
}
