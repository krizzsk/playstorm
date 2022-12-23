package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzayl {
    private final zzayf[] zza = new zzayf[1];
    private int zzb;
    private int zzc;
    private int zzd = 0;
    private zzayf[] zze = new zzayf[100];

    public zzayl(boolean z, int i) {
    }

    public final synchronized int zza() {
        return this.zzc * 65536;
    }

    public final synchronized zzayf zzb() {
        zzayf zzayf;
        this.zzc++;
        int i = this.zzd;
        if (i > 0) {
            zzayf[] zzayfArr = this.zze;
            int i2 = i - 1;
            this.zzd = i2;
            zzayf = zzayfArr[i2];
            zzayfArr[i2] = null;
        } else {
            zzayf = new zzayf(new byte[65536], 0);
        }
        return zzayf;
    }

    public final synchronized void zzc(zzayf zzayf) {
        zzayf[] zzayfArr = this.zza;
        zzayfArr[0] = zzayf;
        zzd(zzayfArr);
    }

    public final synchronized void zzd(zzayf[] zzayfArr) {
        int i = this.zzd;
        int i2 = i + r1;
        zzayf[] zzayfArr2 = this.zze;
        int length = zzayfArr2.length;
        if (i2 >= length) {
            this.zze = (zzayf[]) Arrays.copyOf(zzayfArr2, Math.max(length + length, i2));
        }
        for (zzayf zzayf : zzayfArr) {
            byte[] bArr = zzayf.zza;
            zzayf[] zzayfArr3 = this.zze;
            int i3 = this.zzd;
            this.zzd = i3 + 1;
            zzayfArr3[i3] = zzayf;
        }
        this.zzc -= zzayfArr.length;
        notifyAll();
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i) {
        int i2 = this.zzb;
        this.zzb = i;
        if (i < i2) {
            zzg();
        }
    }

    public final synchronized void zzg() {
        int max = Math.max(0, zzazn.zzd(this.zzb, 65536) - this.zzc);
        int i = this.zzd;
        if (max < i) {
            Arrays.fill(this.zze, max, i, (Object) null);
            this.zzd = max;
        }
    }
}
