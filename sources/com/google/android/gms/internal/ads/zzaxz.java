package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public abstract class zzaxz extends zzayd {
    private final SparseArray zza = new SparseArray();
    private final SparseBooleanArray zzb = new SparseBooleanArray();
    private zzaxx zzc;

    /* access modifiers changed from: protected */
    public abstract zzaxt[] zzb(zzary[] zzaryArr, zzaxp[] zzaxpArr, int[][][] iArr) throws zzare;

    public final zzaye zzc(zzary[] zzaryArr, zzaxp zzaxp) throws zzare {
        zzaxy zzaxy;
        int[] iArr;
        zzary[] zzaryArr2 = zzaryArr;
        zzaxp zzaxp2 = zzaxp;
        int[] iArr2 = new int[3];
        zzaxo[][] zzaxoArr = new zzaxo[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = zzaxp2.zzb;
            zzaxoArr[i] = new zzaxo[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            zzaryArr2[i4].zze();
            iArr4[i4] = 4;
        }
        int i5 = 0;
        while (i5 < zzaxp2.zzb) {
            zzaxo zzb2 = zzaxp2.zzb(i5);
            int i6 = i3;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                if (i7 >= i3) {
                    i7 = i6;
                    break;
                }
                zzary zzary = zzaryArr2[i7];
                int i9 = 0;
                while (true) {
                    int i10 = zzb2.zza;
                    if (i9 > 0) {
                        break;
                    }
                    int zzG = zzary.zzG(zzb2.zzb(i9)) & 3;
                    if (zzG > i8) {
                        if (zzG == 3) {
                            break;
                        }
                        i6 = i7;
                        i8 = zzG;
                    }
                    i9++;
                }
                i7++;
                i3 = 2;
            }
            if (i7 == 2) {
                int i11 = zzb2.zza;
                iArr = new int[1];
            } else {
                zzary zzary2 = zzaryArr2[i7];
                int i12 = zzb2.zza;
                int[] iArr5 = new int[1];
                int i13 = 0;
                while (true) {
                    int i14 = zzb2.zza;
                    if (i13 > 0) {
                        break;
                    }
                    iArr5[i13] = zzary2.zzG(zzb2.zzb(i13));
                    i13++;
                }
                iArr = iArr5;
            }
            int i15 = iArr2[i7];
            zzaxoArr[i7][i15] = zzb2;
            iArr3[i7][i15] = iArr;
            iArr2[i7] = i15 + 1;
            i5++;
            i3 = 2;
        }
        int i16 = i3;
        zzaxp[] zzaxpArr = new zzaxp[i16];
        int[] iArr6 = new int[i16];
        int i17 = 0;
        while (i17 < i16) {
            int i18 = iArr2[i17];
            zzaxpArr[i17] = new zzaxp((zzaxo[]) Arrays.copyOf(zzaxoArr[i17], i18));
            iArr3[i17] = (int[][]) Arrays.copyOf(iArr3[i17], i18);
            iArr6[i17] = zzaryArr2[i17].zzc();
            i17++;
            i16 = 2;
        }
        int i19 = i16;
        zzaxp zzaxp3 = new zzaxp((zzaxo[]) Arrays.copyOf(zzaxoArr[i19], iArr2[i19]));
        zzaxt[] zzb3 = zzb(zzaryArr2, zzaxpArr, iArr3);
        int i20 = 0;
        while (i20 < i19) {
            if (this.zzb.get(i20)) {
                zzb3[i20] = null;
            } else {
                zzaxp zzaxp4 = zzaxpArr[i20];
                Map map = (Map) this.zza.get(i20);
                if (map == null) {
                    zzaxy = null;
                } else {
                    zzaxy = (zzaxy) map.get(zzaxp4);
                }
                if (zzaxy != null) {
                    throw null;
                }
            }
            i20++;
            i19 = 2;
        }
        zzaxx zzaxx = new zzaxx(iArr6, zzaxpArr, iArr4, iArr3, zzaxp3);
        zzarz[] zzarzArr = new zzarz[2];
        for (int i21 = 0; i21 < 2; i21++) {
            zzarzArr[i21] = zzb3[i21] != null ? zzarz.zza : null;
        }
        return new zzaye(zzaxp2, new zzayb(zzb3, (byte[]) null), zzaxx, zzarzArr);
    }

    public final void zzd(Object obj) {
        this.zzc = (zzaxx) obj;
    }

    public final void zze(int i, boolean z) {
        if (this.zzb.get(i) != z) {
            this.zzb.put(i, z);
            zzg();
        }
    }
}
