package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzuq extends zzvb implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg = zzvf.zzf(this.zzd.zzd);
    private final zzuu zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final boolean zzu;
    private final boolean zzv;

    public zzuq(int i, zzck zzck, int i2, zzuu zzuu, int i3, boolean z) {
        super(i, zzck, i2);
        int i4;
        int i5;
        int i6;
        boolean z2;
        this.zzh = zzuu;
        int i7 = 0;
        this.zzi = zzvf.zzi(i3, false);
        int i8 = 0;
        while (true) {
            i4 = Integer.MAX_VALUE;
            if (i8 >= zzuu.zzq.size()) {
                i5 = 0;
                i8 = Integer.MAX_VALUE;
                break;
            }
            i5 = zzvf.zza(this.zzd, (String) zzuu.zzq.get(i8), false);
            if (i5 > 0) {
                break;
            }
            i8++;
        }
        this.zzk = i8;
        this.zzj = i5;
        int i9 = this.zzd.zzf;
        int i10 = zzuu.zzr;
        this.zzl = Integer.bitCount(0);
        zzad zzad = this.zzd;
        int i11 = zzad.zzf;
        this.zzm = true;
        this.zzp = 1 == (zzad.zze & 1);
        this.zzq = zzad.zzz;
        this.zzr = zzad.zzA;
        this.zzs = zzad.zzi;
        if (zzad.zzi != -1) {
            int i12 = zzuu.zzt;
        }
        if (zzad.zzz != -1) {
            int i13 = zzuu.zzs;
        }
        this.zzf = true;
        String[] zzae = zzeg.zzae();
        int i14 = 0;
        while (true) {
            if (i14 >= zzae.length) {
                i6 = 0;
                i14 = Integer.MAX_VALUE;
                break;
            }
            i6 = zzvf.zza(this.zzd, zzae[i14], false);
            if (i6 > 0) {
                break;
            }
            i14++;
        }
        this.zzn = i14;
        this.zzo = i6;
        int i15 = 0;
        while (true) {
            if (i15 < zzuu.zzu.size()) {
                String str = this.zzd.zzm;
                if (str != null && str.equals(zzuu.zzu.get(i15))) {
                    i4 = i15;
                    break;
                }
                i15++;
            } else {
                break;
            }
        }
        this.zzt = i4;
        this.zzu = (i3 & 128) == 128;
        this.zzv = (i3 & 64) == 64;
        zzuu zzuu2 = this.zzh;
        if (zzvf.zzi(i3, zzuu2.zzP) && ((z2 = this.zzf) || zzuu2.zzK)) {
            if (zzvf.zzi(i3, false) && z2 && this.zzd.zzi != -1) {
                boolean z3 = zzuu2.zzz;
                boolean z4 = zzuu2.zzy;
                if (zzuu2.zzR || !z) {
                    i7 = 2;
                }
            }
            i7 = 1;
        }
        this.zze = i7;
    }

    public final int zzb() {
        return this.zze;
    }

    public final /* bridge */ /* synthetic */ boolean zzc(zzvb zzvb) {
        zzuq zzuq = (zzuq) zzvb;
        zzuu zzuu = this.zzh;
        boolean z = zzuu.zzN;
        zzad zzad = this.zzd;
        int i = zzad.zzz;
        if (i == -1) {
            return false;
        }
        zzad zzad2 = zzuq.zzd;
        if (i != zzad2.zzz) {
            return false;
        }
        boolean z2 = zzuu.zzL;
        String str = zzad.zzm;
        if (str == null || !TextUtils.equals(str, zzad2.zzm)) {
            return false;
        }
        zzuu zzuu2 = this.zzh;
        boolean z3 = zzuu2.zzM;
        int i2 = this.zzd.zzA;
        if (i2 == -1 || i2 != zzuq.zzd.zzA) {
            return false;
        }
        boolean z4 = zzuu2.zzO;
        return this.zzu == zzuq.zzu && this.zzv == zzuq.zzv;
    }

    /* renamed from: zza */
    public final int compareTo(zzuq zzuq) {
        zzfsp zzfsp;
        if (!this.zzf || !this.zzi) {
            zzfsp = zzvf.zzb.zza();
        } else {
            zzfsp = zzvf.zzb;
        }
        zzfqw zzd = zzfqw.zzj().zzd(this.zzi, zzuq.zzi).zzc(Integer.valueOf(this.zzk), Integer.valueOf(zzuq.zzk), zzfsp.zzc().zza()).zzb(this.zzj, zzuq.zzj).zzb(this.zzl, zzuq.zzl).zzd(this.zzp, zzuq.zzp);
        boolean z = zzuq.zzm;
        zzfqw zzc = zzd.zzd(true, true).zzc(Integer.valueOf(this.zzn), Integer.valueOf(zzuq.zzn), zzfsp.zzc().zza()).zzb(this.zzo, zzuq.zzo).zzd(this.zzf, zzuq.zzf).zzc(Integer.valueOf(this.zzt), Integer.valueOf(zzuq.zzt), zzfsp.zzc().zza());
        Integer valueOf = Integer.valueOf(this.zzs);
        Integer valueOf2 = Integer.valueOf(zzuq.zzs);
        boolean z2 = this.zzh.zzy;
        zzfqw zzc2 = zzc.zzc(valueOf, valueOf2, zzvf.zzc).zzd(this.zzu, zzuq.zzu).zzd(this.zzv, zzuq.zzv).zzc(Integer.valueOf(this.zzq), Integer.valueOf(zzuq.zzq), zzfsp).zzc(Integer.valueOf(this.zzr), Integer.valueOf(zzuq.zzr), zzfsp);
        Integer valueOf3 = Integer.valueOf(this.zzs);
        Integer valueOf4 = Integer.valueOf(zzuq.zzs);
        if (!zzeg.zzS(this.zzg, zzuq.zzg)) {
            zzfsp = zzvf.zzc;
        }
        return zzc2.zzc(valueOf3, valueOf4, zzfsp).zza();
    }
}
