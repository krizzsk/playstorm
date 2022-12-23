package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzst extends zzrk {
    private static final zzbb zza;
    private final zzsd[] zzb;
    private final zzci[] zzc;
    private final ArrayList zzd;
    private final Map zze;
    private final zzfsd zzf;
    private int zzg = -1;
    private long[][] zzh;
    private zzss zzi;
    private final zzrm zzj;

    static {
        zzah zzah = new zzah();
        zzah.zza("MergingMediaSource");
        zza = zzah.zzc();
    }

    public zzst(boolean z, boolean z2, zzsd... zzsdArr) {
        zzrm zzrm = new zzrm();
        this.zzb = zzsdArr;
        this.zzj = zzrm;
        this.zzd = new ArrayList(Arrays.asList(zzsdArr));
        this.zzc = new zzci[zzsdArr.length];
        this.zzh = new long[0][];
        this.zze = new HashMap();
        this.zzf = zzfsk.zzb(8).zzb(2).zza();
    }

    public final void zzB(zzrz zzrz) {
        zzsr zzsr = (zzsr) zzrz;
        int i = 0;
        while (true) {
            zzsd[] zzsdArr = this.zzb;
            if (i < zzsdArr.length) {
                zzsdArr[i].zzB(zzsr.zzn(i));
                i++;
            } else {
                return;
            }
        }
    }

    public final zzrz zzD(zzsb zzsb, zzvw zzvw, long j) {
        int length = this.zzb.length;
        zzrz[] zzrzArr = new zzrz[length];
        int zza2 = this.zzc[0].zza(zzsb.zza);
        for (int i = 0; i < length; i++) {
            zzrzArr[i] = this.zzb[i].zzD(zzsb.zzc(this.zzc[i].zzf(zza2)), zzvw, j - this.zzh[zza2][i]);
        }
        return new zzsr(this.zzj, this.zzh[zza2], zzrzArr, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    public final void zzn(zzft zzft) {
        super.zzn(zzft);
        for (int i = 0; i < this.zzb.length; i++) {
            zzy(Integer.valueOf(i), this.zzb[i]);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzq() {
        super.zzq();
        Arrays.fill(this.zzc, (Object) null);
        this.zzg = -1;
        this.zzi = null;
        this.zzd.clear();
        Collections.addAll(this.zzd, this.zzb);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ zzsb zzv(Object obj, zzsb zzsb) {
        if (((Integer) obj).intValue() == 0) {
            return zzsb;
        }
        return null;
    }

    public final void zzw() throws IOException {
        zzss zzss = this.zzi;
        if (zzss == null) {
            super.zzw();
            return;
        }
        throw zzss;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void zzx(Object obj, zzsd zzsd, zzci zzci) {
        int i;
        if (this.zzi == null) {
            if (this.zzg == -1) {
                i = zzci.zzb();
                this.zzg = i;
            } else {
                int zzb2 = zzci.zzb();
                int i2 = this.zzg;
                if (zzb2 == i2) {
                    i = i2;
                } else {
                    this.zzi = new zzss(0);
                    return;
                }
            }
            if (this.zzh.length == 0) {
                int[] iArr = new int[2];
                iArr[1] = this.zzc.length;
                iArr[0] = i;
                this.zzh = (long[][]) Array.newInstance(long.class, iArr);
            }
            this.zzd.remove(zzsd);
            this.zzc[((Integer) obj).intValue()] = zzci;
            if (this.zzd.isEmpty()) {
                zzo(this.zzc[0]);
            }
        }
    }

    public final zzbb zzz() {
        zzsd[] zzsdArr = this.zzb;
        return zzsdArr.length > 0 ? zzsdArr[0].zzz() : zza;
    }
}
