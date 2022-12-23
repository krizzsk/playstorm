package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public abstract class zzvk extends zzvn {
    private zzvj zza;

    /* access modifiers changed from: protected */
    public abstract Pair zzb(zzvj zzvj, int[][][] iArr, int[] iArr2, zzsb zzsb, zzci zzci) throws zzgu;

    public final zzvo zzj(zzjv[] zzjvArr, zztz zztz, zzsb zzsb, zzci zzci) throws zzgu {
        boolean z;
        int[] iArr;
        zztz zztz2 = zztz;
        int[] iArr2 = new int[3];
        zzck[][] zzckArr = new zzck[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = zztz2.zzc;
            zzckArr[i] = new zzck[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            iArr4[i4] = zzjvArr[i4].zze();
        }
        int i5 = 0;
        while (i5 < zztz2.zzc) {
            zzck zzb = zztz2.zzb(i5);
            int i6 = zzb.zzd;
            int i7 = i3;
            int i8 = 0;
            int i9 = 0;
            boolean z2 = true;
            while (i8 < i3) {
                zzjv zzjv = zzjvArr[i8];
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    int i12 = zzb.zzb;
                    if (i10 > 0) {
                        break;
                    }
                    i11 = Math.max(i11, zzjv.zzO(zzb.zzb(i10)) & 7);
                    i10++;
                }
                boolean z3 = iArr2[i8] == 0;
                if (i11 > i9) {
                    z2 = z3;
                    i7 = i8;
                    i9 = i11;
                } else if (i11 == i9 && i6 == 5 && !z2 && z3) {
                    i7 = i8;
                    i9 = i11;
                    z2 = true;
                }
                i8++;
                i3 = 2;
            }
            if (i7 == i3) {
                int i13 = zzb.zzb;
                iArr = new int[1];
            } else {
                zzjv zzjv2 = zzjvArr[i7];
                int i14 = zzb.zzb;
                int[] iArr5 = new int[1];
                int i15 = 0;
                while (true) {
                    int i16 = zzb.zzb;
                    if (i15 > 0) {
                        break;
                    }
                    iArr5[i15] = zzjv2.zzO(zzb.zzb(i15));
                    i15++;
                }
                iArr = iArr5;
            }
            int i17 = iArr2[i7];
            zzckArr[i7][i17] = zzb;
            iArr3[i7][i17] = iArr;
            iArr2[i7] = i17 + 1;
            i5++;
            i3 = 2;
        }
        zztz[] zztzArr = new zztz[i3];
        String[] strArr = new String[i3];
        int[] iArr6 = new int[i3];
        int i18 = 0;
        while (i18 < i3) {
            int i19 = iArr2[i18];
            zztzArr[i18] = new zztz((zzck[]) zzeg.zzad(zzckArr[i18], i19));
            iArr3[i18] = (int[][]) zzeg.zzad(iArr3[i18], i19);
            strArr[i18] = zzjvArr[i18].zzK();
            iArr6[i18] = zzjvArr[i18].zzb();
            i18++;
            i3 = 2;
        }
        int i20 = i3;
        zzvj zzvj = new zzvj(strArr, iArr6, zztzArr, iArr4, iArr3, new zztz((zzck[]) zzeg.zzad(zzckArr[i20], iArr2[i20])));
        Pair zzb2 = zzb(zzvj, iArr3, iArr4, zzsb, zzci);
        zzvl[] zzvlArr = (zzvl[]) zzb2.second;
        List[] listArr = new List[zzvlArr.length];
        for (int i21 = 0; i21 < zzvlArr.length; i21++) {
            zzvl zzvl = zzvlArr[i21];
            listArr[i21] = zzvl != null ? zzfrh.zzp(zzvl) : zzfrh.zzo();
        }
        zzfre zzfre = new zzfre();
        for (int i22 = 0; i22 < 2; i22++) {
            zztz zzd = zzvj.zzd(i22);
            List list = listArr[i22];
            for (int i23 = 0; i23 < zzd.zzc; i23++) {
                zzck zzb3 = zzd.zzb(i23);
                boolean z4 = zzvj.zza(i22, i23, false) != 0;
                int i24 = zzb3.zzb;
                int[] iArr7 = new int[1];
                boolean[] zArr = new boolean[1];
                int i25 = 0;
                while (true) {
                    int i26 = zzb3.zzb;
                    if (i25 > 0) {
                        break;
                    }
                    iArr7[i25] = zzvj.zzb(i22, i23, i25) & 7;
                    int i27 = 0;
                    while (true) {
                        if (i27 >= list.size()) {
                            z = false;
                            break;
                        }
                        zzvl zzvl2 = (zzvl) list.get(i27);
                        if (zzvl2.zze().equals(zzb3) && zzvl2.zzb(i25) != -1) {
                            z = true;
                            break;
                        }
                        i27++;
                    }
                    zArr[i25] = z;
                    i25++;
                }
                zzfre.zze(new zzcs(zzb3, z4, iArr7, zArr));
            }
        }
        zztz zze = zzvj.zze();
        for (int i28 = 0; i28 < zze.zzc; i28++) {
            zzck zzb4 = zze.zzb(i28);
            int i29 = zzb4.zzb;
            int[] iArr8 = new int[1];
            Arrays.fill(iArr8, 0);
            int i30 = zzb4.zzb;
            zzfre.zze(new zzcs(zzb4, false, iArr8, new boolean[1]));
        }
        return new zzvo((zzjw[]) zzb2.first, (zzvh[]) zzb2.second, new zzct(zzfre.zzg()), zzvj);
    }

    public final void zzk(Object obj) {
        this.zza = (zzvj) obj;
    }
}
