package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzwp {
    private static final Comparator zza = zzwl.zza;
    private static final Comparator zzb = zzwm.zza;
    private final ArrayList zzc = new ArrayList();
    private final zzwo[] zzd = new zzwo[5];
    private int zze = -1;
    private int zzf;
    private int zzg;
    private int zzh;

    public zzwp(int i) {
    }

    public final float zza(float f) {
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f2 = ((float) this.zzg) * 0.5f;
        int i = 0;
        for (int i2 = 0; i2 < this.zzc.size(); i2++) {
            zzwo zzwo = (zzwo) this.zzc.get(i2);
            i += zzwo.zzb;
            if (((float) i) >= f2) {
                return zzwo.zzc;
            }
        }
        if (this.zzc.isEmpty()) {
            return Float.NaN;
        }
        ArrayList arrayList = this.zzc;
        return ((zzwo) arrayList.get(arrayList.size() - 1)).zzc;
    }

    public final void zzb(int i, float f) {
        zzwo zzwo;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i2 = this.zzh;
        if (i2 > 0) {
            zzwo[] zzwoArr = this.zzd;
            int i3 = i2 - 1;
            this.zzh = i3;
            zzwo = zzwoArr[i3];
        } else {
            zzwo = new zzwo((zzwn) null);
        }
        int i4 = this.zzf;
        this.zzf = i4 + 1;
        zzwo.zza = i4;
        zzwo.zzb = i;
        zzwo.zzc = f;
        this.zzc.add(zzwo);
        this.zzg += i;
        while (true) {
            int i5 = this.zzg;
            if (i5 > 2000) {
                int i6 = i5 - 2000;
                zzwo zzwo2 = (zzwo) this.zzc.get(0);
                int i7 = zzwo2.zzb;
                if (i7 <= i6) {
                    this.zzg -= i7;
                    this.zzc.remove(0);
                    int i8 = this.zzh;
                    if (i8 < 5) {
                        zzwo[] zzwoArr2 = this.zzd;
                        this.zzh = i8 + 1;
                        zzwoArr2[i8] = zzwo2;
                    }
                } else {
                    zzwo2.zzb = i7 - i6;
                    this.zzg -= i6;
                }
            } else {
                return;
            }
        }
    }

    public final void zzc() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }
}
