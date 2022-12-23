package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzfdm {
    private final LinkedList zza = new LinkedList();
    private final int zzb;
    private final int zzc;
    private final zzfel zzd;

    public zzfdm(int i, int i2) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = new zzfel();
    }

    private final void zzi() {
        while (!this.zza.isEmpty() && zzt.zzA().currentTimeMillis() - ((zzfdw) this.zza.getFirst()).zzd >= ((long) this.zzc)) {
            this.zzd.zzg();
            this.zza.remove();
        }
    }

    public final int zza() {
        return this.zzd.zza();
    }

    public final int zzb() {
        zzi();
        return this.zza.size();
    }

    public final long zzc() {
        return this.zzd.zzb();
    }

    public final long zzd() {
        return this.zzd.zzc();
    }

    public final zzfdw zze() {
        this.zzd.zzf();
        zzi();
        if (this.zza.isEmpty()) {
            return null;
        }
        zzfdw zzfdw = (zzfdw) this.zza.remove();
        if (zzfdw != null) {
            this.zzd.zzh();
        }
        return zzfdw;
    }

    public final zzfek zzf() {
        return this.zzd.zzd();
    }

    public final String zzg() {
        return this.zzd.zze();
    }

    public final boolean zzh(zzfdw zzfdw) {
        this.zzd.zzf();
        zzi();
        if (this.zza.size() == this.zzb) {
            return false;
        }
        this.zza.add(zzfdw);
        return true;
    }
}
