package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzuf extends zzuh {
    private final zzvv zzd;
    private final zzfrh zze;
    private final zzcx zzf;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected zzuf(zzck zzck, int[] iArr, int i, zzvv zzvv, long j, long j2, long j3, int i2, int i3, float f, float f2, List list, zzcx zzcx) {
        super(zzck, iArr, 0);
        zzck zzck2 = zzck;
        int[] iArr2 = iArr;
        this.zzd = zzvv;
        this.zze = zzfrh.zzm(list);
        this.zzf = zzcx;
    }

    static /* bridge */ /* synthetic */ zzfrh zzf(zzvg[] zzvgArr) {
        int i;
        int i2;
        double d;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 2;
            i2 = 1;
            if (i4 >= 2) {
                break;
            }
            zzvg zzvg = zzvgArr[i4];
            if (zzvg == null || zzvg.zzb.length <= 1) {
                arrayList.add((Object) null);
            } else {
                zzfre zzi = zzfrh.zzi();
                zzi.zze(new zzud(0, 0));
                arrayList.add(zzi);
            }
            i4++;
        }
        long[][] jArr = new long[2][];
        for (int i5 = 0; i5 < 2; i5++) {
            zzvg zzvg2 = zzvgArr[i5];
            if (zzvg2 == null) {
                jArr[i5] = new long[0];
            } else {
                jArr[i5] = new long[zzvg2.zzb.length];
                int i6 = 0;
                while (true) {
                    int[] iArr = zzvg2.zzb;
                    if (i6 >= iArr.length) {
                        break;
                    }
                    jArr[i5][i6] = (long) zzvg2.zza.zzb(iArr[i6]).zzi;
                    i6++;
                }
                Arrays.sort(jArr[i5]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr2 = new long[2];
        for (int i7 = 0; i7 < 2; i7++) {
            long[] jArr3 = jArr[i7];
            jArr2[i7] = jArr3.length == 0 ? 0 : jArr3[0];
        }
        zzg(arrayList, jArr2);
        zzfrs zza = zzfsk.zzc(zzfsp.zzc()).zzb(2).zza();
        int i8 = 0;
        while (i8 < i) {
            int length = jArr[i8].length;
            if (length > i2) {
                double[] dArr = new double[length];
                int i9 = i3;
                while (true) {
                    long[] jArr4 = jArr[i8];
                    double d2 = 0.0d;
                    if (i9 >= jArr4.length) {
                        break;
                    }
                    long j = jArr4[i9];
                    if (j != -1) {
                        d2 = Math.log((double) j);
                    }
                    dArr[i9] = d2;
                    i9++;
                }
                int i10 = length - 1;
                double d3 = dArr[i10] - dArr[i3];
                int i11 = i3;
                while (i11 < i10) {
                    int i12 = i11 + 1;
                    double d4 = (dArr[i11] + dArr[i12]) * 0.5d;
                    if (d3 == 0.0d) {
                        d = 1.0d;
                    } else {
                        d = (d4 - dArr[i3]) / d3;
                    }
                    zza.zzs(Double.valueOf(d), Integer.valueOf(i8));
                    i11 = i12;
                    i3 = 0;
                }
            }
            i8++;
            i3 = 0;
            i = 2;
            i2 = 1;
        }
        zzfrh zzm = zzfrh.zzm(zza.zzt());
        for (int i13 = 0; i13 < zzm.size(); i13++) {
            int intValue = ((Integer) zzm.get(i13)).intValue();
            int i14 = iArr2[intValue] + 1;
            iArr2[intValue] = i14;
            jArr2[intValue] = jArr[intValue][i14];
            zzg(arrayList, jArr2);
        }
        for (int i15 = 0; i15 < 2; i15++) {
            if (arrayList.get(i15) != null) {
                long j2 = jArr2[i15];
                jArr2[i15] = j2 + j2;
            }
        }
        zzg(arrayList, jArr2);
        zzfre zzi2 = zzfrh.zzi();
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            zzfre zzfre = (zzfre) arrayList.get(i16);
            zzi2.zze(zzfre == null ? zzfrh.zzo() : zzfre.zzg());
        }
        return zzi2.zzg();
    }

    private static void zzg(List list, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzfre zzfre = (zzfre) list.get(i2);
            if (zzfre != null) {
                zzfre.zze(new zzud(j, jArr[i2]));
            }
        }
    }
}
