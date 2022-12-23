package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzuu extends zzcp {
    public static final zzuu zzC;
    @Deprecated
    public static final zzuu zzD;
    public static final zzl zzE = zzus.zza;
    public final int zzF;
    public final boolean zzG;
    public final boolean zzH;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    /* access modifiers changed from: private */
    public final SparseArray zzS;
    /* access modifiers changed from: private */
    public final SparseBooleanArray zzT;

    static {
        zzuu zzuu = new zzuu(new zzuw());
        zzC = zzuu;
        zzD = zzuu;
    }

    private zzuu(zzuw zzuw) {
        super(zzuw);
        this.zzG = zzuw.zza;
        this.zzH = false;
        this.zzI = zzuw.zzb;
        this.zzJ = false;
        this.zzK = zzuw.zzc;
        this.zzL = false;
        this.zzM = false;
        this.zzN = false;
        this.zzO = false;
        this.zzF = 0;
        this.zzP = zzuw.zzd;
        this.zzQ = false;
        this.zzR = zzuw.zze;
        this.zzS = zzuw.zzf;
        this.zzT = zzuw.zzg;
    }

    public static zzuu zzc(Context context) {
        return new zzuu(new zzuw(context));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzuu zzuu = (zzuu) obj;
            if (super.equals(zzuu) && this.zzG == zzuu.zzG && this.zzI == zzuu.zzI && this.zzK == zzuu.zzK && this.zzP == zzuu.zzP && this.zzR == zzuu.zzR) {
                SparseBooleanArray sparseBooleanArray = this.zzT;
                SparseBooleanArray sparseBooleanArray2 = zzuu.zzT;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = this.zzS;
                            SparseArray sparseArray2 = zzuu.zzS;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                int i2 = 0;
                                while (i2 < size2) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i2);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                zztz zztz = (zztz) entry.getKey();
                                                if (map2.containsKey(zztz)) {
                                                    if (!zzeg.zzS(entry.getValue(), map2.get(zztz))) {
                                                    }
                                                }
                                            }
                                            i2++;
                                        }
                                    }
                                }
                                return true;
                            }
                        } else if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((super.hashCode() + 31) * 31) + (this.zzG ? 1 : 0)) * 961) + (this.zzI ? 1 : 0)) * 961) + (this.zzK ? 1 : 0)) * 887503681) + (this.zzP ? 1 : 0)) * 961) + (this.zzR ? 1 : 0);
    }

    public final zzuw zzd() {
        return new zzuw(this, (zzuv) null);
    }

    @Deprecated
    public final zzuy zze(int i, zztz zztz) {
        Map map = (Map) this.zzS.get(i);
        if (map != null) {
            return (zzuy) map.get(zztz);
        }
        return null;
    }

    public final boolean zzf(int i) {
        return this.zzT.get(i);
    }

    @Deprecated
    public final boolean zzg(int i, zztz zztz) {
        Map map = (Map) this.zzS.get(i);
        return map != null && map.containsKey(zztz);
    }
}
