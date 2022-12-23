package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzuz extends zzvb implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;

    public zzuz(int i, zzck zzck, int i2, zzuu zzuu, int i3, String str) {
        super(i, zzck, i2);
        zzfrh zzfrh;
        int i4;
        int i5 = 0;
        this.zzf = zzvf.zzi(i3, false);
        int i6 = this.zzd.zze;
        int i7 = zzuu.zzF;
        this.zzg = 1 == (i6 & 1);
        this.zzh = (i6 & 2) != 0;
        if (zzuu.zzv.isEmpty()) {
            zzfrh = zzfrh.zzp("");
        } else {
            zzfrh = zzuu.zzv;
        }
        int i8 = 0;
        while (true) {
            if (i8 >= zzfrh.size()) {
                i8 = Integer.MAX_VALUE;
                i4 = 0;
                break;
            }
            boolean z = zzuu.zzx;
            i4 = zzvf.zza(this.zzd, (String) zzfrh.get(i8), false);
            if (i4 > 0) {
                break;
            }
            i8++;
        }
        this.zzi = i8;
        this.zzj = i4;
        int i9 = this.zzd.zzf;
        int i10 = zzuu.zzw;
        this.zzk = Integer.bitCount(0);
        int i11 = this.zzd.zzf;
        this.zzm = false;
        this.zzl = zzvf.zza(this.zzd, str, zzvf.zzf(str) == null);
        boolean z2 = this.zzj > 0 || (zzuu.zzv.isEmpty() && this.zzk > 0) || this.zzg || (this.zzh && this.zzl > 0);
        if (zzvf.zzi(i3, zzuu.zzP) && z2) {
            i5 = 1;
        }
        this.zze = i5;
    }

    /* renamed from: zza */
    public final int compareTo(zzuz zzuz) {
        zzfsp zzfsp;
        zzfqw zzd = zzfqw.zzj().zzd(this.zzf, zzuz.zzf).zzc(Integer.valueOf(this.zzi), Integer.valueOf(zzuz.zzi), zzfsp.zzc().zza()).zzb(this.zzj, zzuz.zzj).zzb(this.zzk, zzuz.zzk).zzd(this.zzg, zzuz.zzg);
        Boolean valueOf = Boolean.valueOf(this.zzh);
        Boolean valueOf2 = Boolean.valueOf(zzuz.zzh);
        if (this.zzj == 0) {
            zzfsp = zzfsp.zzc();
        } else {
            zzfsp = zzfsp.zzc().zza();
        }
        zzfqw zzb = zzd.zzc(valueOf, valueOf2, zzfsp).zzb(this.zzl, zzuz.zzl);
        if (this.zzk == 0) {
            boolean z = zzuz.zzm;
            zzb = zzb.zze(false, false);
        }
        return zzb.zza();
    }

    public final int zzb() {
        return this.zze;
    }

    public final /* bridge */ /* synthetic */ boolean zzc(zzvb zzvb) {
        zzuz zzuz = (zzuz) zzvb;
        return false;
    }
}
