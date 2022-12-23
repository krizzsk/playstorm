package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public abstract class zzfrm extends zzfrc implements Set {
    @CheckForNull
    private transient zzfrh zza;

    zzfrm() {
    }

    static int zzh(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (((double) highestOneBit) * 0.7d < ((double) max));
            return highestOneBit;
        }
        zzfos.zzf(max < 1073741824, "collection too large");
        return 1073741824;
    }

    public static zzfrl zzj(int i) {
        return new zzfrl(i);
    }

    public static zzfrm zzl(Collection collection) {
        Object[] array = collection.toArray();
        return zzp(array.length, array);
    }

    @SafeVarargs
    public static zzfrm zzm(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, 6);
        return zzp(12, objArr2);
    }

    /* access modifiers changed from: private */
    public static boolean zzq(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfrm) || !zzo() || !((zzfrm) obj).zzo() || hashCode() == obj.hashCode()) {
            return zzftc.zzc(this, obj);
        }
        return false;
    }

    public int hashCode() {
        return zzftc.zza(this);
    }

    public zzfrh zzd() {
        zzfrh zzfrh = this.zza;
        if (zzfrh != null) {
            return zzfrh;
        }
        zzfrh zzi = zzi();
        this.zza = zzi;
        return zzi;
    }

    /* renamed from: zze */
    public abstract zzftg iterator();

    /* access modifiers changed from: package-private */
    public zzfrh zzi() {
        return zzfrh.zzj(toArray());
    }

    /* access modifiers changed from: package-private */
    public boolean zzo() {
        return false;
    }

    /* access modifiers changed from: private */
    public static zzfrm zzp(int i, Object... objArr) {
        if (i == 0) {
            return zzfsw.zza;
        }
        if (i != 1) {
            int zzh = zzh(i);
            Object[] objArr2 = new Object[zzh];
            int i2 = zzh - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj = objArr[i5];
                zzfso.zza(obj, i5);
                int hashCode = obj.hashCode();
                int zza2 = zzfqz.zza(hashCode);
                while (true) {
                    int i6 = zza2 & i2;
                    Object obj2 = objArr2[i6];
                    if (obj2 == null) {
                        objArr[i4] = obj;
                        objArr2[i6] = obj;
                        i3 += hashCode;
                        i4++;
                        break;
                    } else if (obj2.equals(obj)) {
                        break;
                    } else {
                        zza2++;
                    }
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                Object obj3 = objArr[0];
                obj3.getClass();
                return new zzftd(obj3);
            } else if (zzh(i4) < zzh / 2) {
                return zzp(i4, objArr);
            } else {
                if (zzq(i4, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new zzfsw(objArr, i3, objArr2, i2, i4);
            }
        } else {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new zzftd(obj4);
        }
    }
}
