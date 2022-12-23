package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzgmt {
    private static final Class zza;
    private static final zzgni zzb = zzab(false);
    private static final zzgni zzc = zzab(true);
    private static final zzgni zzd = new zzgnk();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
    }

    public static zzgni zzA() {
        return zzc;
    }

    public static zzgni zzB() {
        return zzd;
    }

    static Object zzC(int i, List list, zzgks zzgks, Object obj, zzgni zzgni) {
        if (zzgks == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (zzgks.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj = zzD(i, intValue, obj, zzgni);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzgks.zza(intValue2)) {
                    obj = zzD(i, intValue2, obj, zzgni);
                    it.remove();
                }
            }
        }
        return obj;
    }

    static Object zzD(int i, int i2, Object obj, zzgni zzgni) {
        if (obj == null) {
            obj = zzgni.zzf();
        }
        zzgni.zzl(obj, i, (long) i2);
        return obj;
    }

    static void zzE(zzgkb zzgkb, Object obj, Object obj2) {
        zzgkb.zza(obj2);
        throw null;
    }

    static void zzF(zzgni zzgni, Object obj, Object obj2) {
        zzgni.zzo(obj, zzgni.zze(zzgni.zzd(obj), zzgni.zzd(obj2)));
    }

    public static void zzG(Class cls) {
        Class cls2;
        if (!zzgko.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean zzH(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static void zzI(zzglt zzglt, Object obj, Object obj2, long j) {
        zzgns.zzv(obj, j, zzglt.zzc(zzgns.zzh(obj, j), zzgns.zzh(obj2, j)));
    }

    public static void zzJ(int i, List list, zzgjw zzgjw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjw.zzc(i, list, z);
        }
    }

    public static void zzK(int i, List list, zzgjw zzgjw) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjw.zze(i, list);
        }
    }

    public static void zzL(int i, List list, zzgjw zzgjw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjw.zzg(i, list, z);
        }
    }

    public static void zzM(int i, List list, zzgjw zzgjw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjw.zzj(i, list, z);
        }
    }

    public static void zzN(int i, List list, zzgjw zzgjw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjw.zzl(i, list, z);
        }
    }

    public static void zzO(int i, List list, zzgjw zzgjw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjw.zzn(i, list, z);
        }
    }

    public static void zzP(int i, List list, zzgjw zzgjw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjw.zzp(i, list, z);
        }
    }

    public static void zzQ(int i, List list, zzgjw zzgjw, zzgmr zzgmr) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                zzgjw.zzq(i, list.get(i2), zzgmr);
            }
        }
    }

    public static void zzR(int i, List list, zzgjw zzgjw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjw.zzs(i, list, z);
        }
    }

    public static void zzS(int i, List list, zzgjw zzgjw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjw.zzu(i, list, z);
        }
    }

    public static void zzT(int i, List list, zzgjw zzgjw, zzgmr zzgmr) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                zzgjw.zzv(i, list.get(i2), zzgmr);
            }
        }
    }

    public static void zzU(int i, List list, zzgjw zzgjw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjw.zzx(i, list, z);
        }
    }

    public static void zzV(int i, List list, zzgjw zzgjw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjw.zzz(i, list, z);
        }
    }

    public static void zzW(int i, List list, zzgjw zzgjw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjw.zzB(i, list, z);
        }
    }

    public static void zzX(int i, List list, zzgjw zzgjw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjw.zzD(i, list, z);
        }
    }

    public static void zzY(int i, List list, zzgjw zzgjw) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjw.zzG(i, list);
        }
    }

    public static void zzZ(int i, List list, zzgjw zzgjw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjw.zzI(i, list, z);
        }
    }

    static int zza(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgjv.zzE(i << 3) + 1);
    }

    public static void zzaa(int i, List list, zzgjw zzgjw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjw.zzK(i, list, z);
        }
    }

    private static zzgni zzab(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzgni) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    static int zzb(List list) {
        return list.size();
    }

    static int zzc(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzD = size * zzgjv.zzD(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzD += zzgjv.zzw((zzgjg) list.get(i2));
        }
        return zzD;
    }

    static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzgjv.zzD(i));
    }

    static int zze(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgkp) {
            zzgkp zzgkp = (zzgkp) list;
            i = 0;
            while (i2 < size) {
                i += zzgjv.zzy(zzgkp.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzgjv.zzy(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzf(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgjv.zzE(i << 3) + 4);
    }

    static int zzg(List list) {
        return list.size() * 4;
    }

    static int zzh(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgjv.zzE(i << 3) + 8);
    }

    static int zzi(List list) {
        return list.size() * 8;
    }

    static int zzj(int i, List list, zzgmr zzgmr) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzgjv.zzx(i, (zzgly) list.get(i3), zzgmr);
        }
        return i2;
    }

    static int zzk(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzl(list) + (size * zzgjv.zzD(i));
    }

    static int zzl(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgkp) {
            zzgkp zzgkp = (zzgkp) list;
            i = 0;
            while (i2 < size) {
                i += zzgjv.zzy(zzgkp.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzgjv.zzy(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzm(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzn(list) + (list.size() * zzgjv.zzD(i));
    }

    static int zzn(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgln) {
            zzgln zzgln = (zzgln) list;
            i = 0;
            while (i2 < size) {
                i += zzgjv.zzF(zzgln.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzgjv.zzF(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    static int zzo(int i, Object obj, zzgmr zzgmr) {
        if (!(obj instanceof zzgle)) {
            return zzgjv.zzE(i << 3) + zzgjv.zzA((zzgly) obj, zzgmr);
        }
        int zzE = zzgjv.zzE(i << 3);
        int zza2 = ((zzgle) obj).zza();
        return zzE + zzgjv.zzE(zza2) + zza2;
    }

    static int zzp(int i, List list, zzgmr zzgmr) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzD = zzgjv.zzD(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof zzgle) {
                i2 = zzgjv.zzz((zzgle) obj);
            } else {
                i2 = zzgjv.zzA((zzgly) obj, zzgmr);
            }
            zzD += i2;
        }
        return zzD;
    }

    static int zzq(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzr(list) + (size * zzgjv.zzD(i));
    }

    static int zzr(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgkp) {
            zzgkp zzgkp = (zzgkp) list;
            i = 0;
            while (i2 < size) {
                int zze = zzgkp.zze(i2);
                i += zzgjv.zzE((zze >> 31) ^ (zze + zze));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i3 = i + zzgjv.zzE((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    static int zzs(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzt(list) + (size * zzgjv.zzD(i));
    }

    static int zzt(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgln) {
            zzgln zzgln = (zzgln) list;
            i = 0;
            while (i2 < size) {
                long zze = zzgln.zze(i2);
                i += zzgjv.zzF((zze >> 63) ^ (zze + zze));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i3 = i + zzgjv.zzF((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    static int zzu(int i, List list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int zzD = zzgjv.zzD(i) * size;
        if (list instanceof zzglg) {
            zzglg zzglg = (zzglg) list;
            while (i4 < size) {
                Object zzf = zzglg.zzf(i4);
                if (zzf instanceof zzgjg) {
                    i3 = zzgjv.zzw((zzgjg) zzf);
                } else {
                    i3 = zzgjv.zzC((String) zzf);
                }
                zzD += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzgjg) {
                    i2 = zzgjv.zzw((zzgjg) obj);
                } else {
                    i2 = zzgjv.zzC((String) obj);
                }
                zzD += i2;
                i4++;
            }
        }
        return zzD;
    }

    static int zzv(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzw(list) + (size * zzgjv.zzD(i));
    }

    static int zzw(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgkp) {
            zzgkp zzgkp = (zzgkp) list;
            i = 0;
            while (i2 < size) {
                i += zzgjv.zzE(zzgkp.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzgjv.zzE(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzx(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzy(list) + (size * zzgjv.zzD(i));
    }

    static int zzy(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgln) {
            zzgln zzgln = (zzgln) list;
            i = 0;
            while (i2 < size) {
                i += zzgjv.zzF(zzgln.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzgjv.zzF(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static zzgni zzz() {
        return zzb;
    }
}
