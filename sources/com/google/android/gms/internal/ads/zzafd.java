package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzafd implements zzys {
    public static final zzyz zza = zzafc.zza;
    private zzyv zzb;
    private zzafl zzc;
    private boolean zzd;

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    private final boolean zze(zzyt zzyt) throws IOException {
        zzaff zzaff = new zzaff();
        if (zzaff.zzb(zzyt, true) && (zzaff.zza & 2) == 2) {
            int min = Math.min(zzaff.zze, 8);
            zzdy zzdy = new zzdy(min);
            ((zzym) zzyt).zzm(zzdy.zzH(), 0, min, false);
            zzdy.zzF(0);
            if (zzdy.zza() >= 5 && zzdy.zzk() == 127 && zzdy.zzs() == 1179402563) {
                this.zzc = new zzafb();
            } else {
                zzdy.zzF(0);
                try {
                    if (zzaaf.zzd(1, zzdy, true)) {
                        this.zzc = new zzafn();
                    }
                } catch (zzbp unused) {
                }
                zzdy.zzF(0);
                if (zzafh.zzd(zzdy)) {
                    this.zzc = new zzafh();
                }
            }
            return true;
        }
        return false;
    }

    public final int zza(zzyt zzyt, zzzs zzzs) throws IOException {
        zzcw.zzb(this.zzb);
        if (this.zzc == null) {
            if (zze(zzyt)) {
                zzyt.zzj();
            } else {
                throw zzbp.zza("Failed to determine bitstream type", (Throwable) null);
            }
        }
        if (!this.zzd) {
            zzzz zzv = this.zzb.zzv(0, 1);
            this.zzb.zzB();
            this.zzc.zzh(this.zzb, zzv);
            this.zzd = true;
        }
        return this.zzc.zze(zzyt, zzzs);
    }

    public final void zzb(zzyv zzyv) {
        this.zzb = zzyv;
    }

    public final void zzc(long j, long j2) {
        zzafl zzafl = this.zzc;
        if (zzafl != null) {
            zzafl.zzj(j, j2);
        }
    }

    public final boolean zzd(zzyt zzyt) throws IOException {
        try {
            return zze(zzyt);
        } catch (zzbp unused) {
            return false;
        }
    }
}
