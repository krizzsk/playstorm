package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgkk;
import com.google.android.gms.internal.ads.zzgko;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public abstract class zzgko<MessageType extends zzgko<MessageType, BuilderType>, BuilderType extends zzgkk<MessageType, BuilderType>> extends zzgip<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    protected zzgnj zzc = zzgnj.zzc();
    protected int zzd = -1;

    private static zzgko zza(zzgko zzgko) throws zzgla {
        if (zzgko == null || zzgko.zzaP()) {
            return zzgko;
        }
        zzgla zza = new zzgnh(zzgko).zza();
        zza.zzh(zzgko);
        throw zza;
    }

    protected static zzgko zzaA(zzgko zzgko, byte[] bArr) throws zzgla {
        zzgko zzc2 = zzc(zzgko, bArr, 0, bArr.length, zzgka.zza());
        zza(zzc2);
        return zzc2;
    }

    protected static zzgko zzaB(zzgko zzgko, zzgjg zzgjg, zzgka zzgka) throws zzgla {
        zzgjo zzl = zzgjg.zzl();
        zzgko zzgko2 = (zzgko) zzgko.zzb(4, (Object) null, (Object) null);
        try {
            zzgmr zzb2 = zzgmg.zza().zzb(zzgko2.getClass());
            zzb2.zzh(zzgko2, zzgjp.zzq(zzl), zzgka);
            zzb2.zzf(zzgko2);
            try {
                zzl.zzz(0);
                zza(zzgko2);
                return zzgko2;
            } catch (zzgla e) {
                e.zzh(zzgko2);
                throw e;
            }
        } catch (zzgla e2) {
            e = e2;
            if (e.zzl()) {
                e = new zzgla((IOException) e);
            }
            e.zzh(zzgko2);
            throw e;
        } catch (zzgnh e3) {
            zzgla zza = e3.zza();
            zza.zzh(zzgko2);
            throw zza;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzgla) {
                throw ((zzgla) e4.getCause());
            }
            zzgla zzgla = new zzgla(e4);
            zzgla.zzh(zzgko2);
            throw zzgla;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzgla) {
                throw ((zzgla) e5.getCause());
            }
            throw e5;
        }
    }

    protected static zzgko zzaC(zzgko zzgko, InputStream inputStream, zzgka zzgka) throws zzgla {
        zzgjo zzH = zzgjo.zzH(inputStream, 4096);
        zzgko zzgko2 = (zzgko) zzgko.zzb(4, (Object) null, (Object) null);
        try {
            zzgmr zzb2 = zzgmg.zza().zzb(zzgko2.getClass());
            zzb2.zzh(zzgko2, zzgjp.zzq(zzH), zzgka);
            zzb2.zzf(zzgko2);
            zza(zzgko2);
            return zzgko2;
        } catch (zzgla e) {
            e = e;
            if (e.zzl()) {
                e = new zzgla((IOException) e);
            }
            e.zzh(zzgko2);
            throw e;
        } catch (zzgnh e2) {
            zzgla zza = e2.zza();
            zza.zzh(zzgko2);
            throw zza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzgla) {
                throw ((zzgla) e3.getCause());
            }
            zzgla zzgla = new zzgla(e3);
            zzgla.zzh(zzgko2);
            throw zzgla;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzgla) {
                throw ((zzgla) e4.getCause());
            }
            throw e4;
        }
    }

    protected static zzgko zzaD(zzgko zzgko, byte[] bArr, zzgka zzgka) throws zzgla {
        zzgko zzc2 = zzc(zzgko, bArr, 0, bArr.length, zzgka);
        zza(zzc2);
        return zzc2;
    }

    protected static zzgkt zzaE() {
        return zzgkp.zzf();
    }

    protected static zzgkt zzaF(zzgkt zzgkt) {
        int size = zzgkt.size();
        return zzgkt.zzg(size == 0 ? 10 : size + size);
    }

    protected static zzgkw zzaG() {
        return zzgln.zzf();
    }

    protected static zzgkx zzaH() {
        return zzgmh.zze();
    }

    protected static zzgkx zzaI(zzgkx zzgkx) {
        int size = zzgkx.size();
        return zzgkx.zzd(size == 0 ? 10 : size + size);
    }

    static Object zzaL(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static Object zzaM(zzgly zzgly, String str, Object[] objArr) {
        return new zzgmi(zzgly, str, objArr);
    }

    protected static void zzaN(Class cls, zzgko zzgko) {
        zzb.put(cls, zzgko);
    }

    static zzgko zzay(Class cls) {
        zzgko zzgko = (zzgko) zzb.get(cls);
        if (zzgko == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzgko = (zzgko) zzb.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzgko == null) {
            zzgko = (zzgko) ((zzgko) zzgns.zzg(cls)).zzb(6, (Object) null, (Object) null);
            if (zzgko != null) {
                zzb.put(cls, zzgko);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzgko;
    }

    protected static zzgko zzaz(zzgko zzgko, zzgjg zzgjg) throws zzgla {
        zzgka zza = zzgka.zza();
        zzgjo zzl = zzgjg.zzl();
        zzgko zzgko2 = (zzgko) zzgko.zzb(4, (Object) null, (Object) null);
        try {
            zzgmr zzb2 = zzgmg.zza().zzb(zzgko2.getClass());
            zzb2.zzh(zzgko2, zzgjp.zzq(zzl), zza);
            zzb2.zzf(zzgko2);
            try {
                zzl.zzz(0);
                zza(zzgko2);
                zza(zzgko2);
                return zzgko2;
            } catch (zzgla e) {
                e.zzh(zzgko2);
                throw e;
            }
        } catch (zzgla e2) {
            e = e2;
            if (e.zzl()) {
                e = new zzgla((IOException) e);
            }
            e.zzh(zzgko2);
            throw e;
        } catch (zzgnh e3) {
            zzgla zza2 = e3.zza();
            zza2.zzh(zzgko2);
            throw zza2;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzgla) {
                throw ((zzgla) e4.getCause());
            }
            zzgla zzgla = new zzgla(e4);
            zzgla.zzh(zzgko2);
            throw zzgla;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzgla) {
                throw ((zzgla) e5.getCause());
            }
            throw e5;
        }
    }

    private static zzgko zzc(zzgko zzgko, byte[] bArr, int i, int i2, zzgka zzgka) throws zzgla {
        zzgko zzgko2 = (zzgko) zzgko.zzb(4, (Object) null, (Object) null);
        try {
            zzgmr zzb2 = zzgmg.zza().zzb(zzgko2.getClass());
            zzb2.zzi(zzgko2, bArr, 0, i2, new zzgis(zzgka));
            zzb2.zzf(zzgko2);
            if (zzgko2.zza == 0) {
                return zzgko2;
            }
            throw new RuntimeException();
        } catch (zzgla e) {
            e = e;
            if (e.zzl()) {
                e = new zzgla((IOException) e);
            }
            e.zzh(zzgko2);
            throw e;
        } catch (zzgnh e2) {
            zzgla zza = e2.zza();
            zza.zzh(zzgko2);
            throw zza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzgla) {
                throw ((zzgla) e3.getCause());
            }
            zzgla zzgla = new zzgla(e3);
            zzgla.zzh(zzgko2);
            throw zzgla;
        } catch (IndexOutOfBoundsException unused) {
            zzgla zzj = zzgla.zzj();
            zzj.zzh(zzgko2);
            throw zzj;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzgmg.zza().zzb(getClass()).zzj(this, (zzgko) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zzb2 = zzgmg.zza().zzb(getClass()).zzb(this);
        this.zza = zzb2;
        return zzb2;
    }

    public final String toString() {
        return zzgma.zza(this, super.toString());
    }

    public final /* synthetic */ zzglx zzaJ() {
        return (zzgkk) zzb(5, (Object) null, (Object) null);
    }

    public final /* synthetic */ zzglx zzaK() {
        zzgkk zzgkk = (zzgkk) zzb(5, (Object) null, (Object) null);
        zzgkk.zzah(this);
        return zzgkk;
    }

    public final void zzaO(zzgjv zzgjv) throws IOException {
        zzgmg.zza().zzb(getClass()).zzn(this, zzgjw.zza(zzgjv));
    }

    public final boolean zzaP() {
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) zzb(1, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zzgmg.zza().zzb(getClass()).zzk(this);
        if (!booleanValue) {
            return zzk;
        }
        zzb(2, true != zzk ? null : this, (Object) null);
        return zzk;
    }

    /* access modifiers changed from: package-private */
    public final int zzap() {
        return this.zzd;
    }

    /* access modifiers changed from: package-private */
    public final void zzas(int i) {
        this.zzd = i;
    }

    public final int zzav() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int zza = zzgmg.zza().zzb(getClass()).zza(this);
        this.zzd = zza;
        return zza;
    }

    /* access modifiers changed from: protected */
    public final zzgkk zzaw() {
        return (zzgkk) zzb(5, (Object) null, (Object) null);
    }

    public final zzgkk zzax() {
        zzgkk zzgkk = (zzgkk) zzb(5, (Object) null, (Object) null);
        zzgkk.zzah(this);
        return zzgkk;
    }

    /* access modifiers changed from: protected */
    public abstract Object zzb(int i, Object obj, Object obj2);

    public final /* synthetic */ zzgly zzbh() {
        return (zzgko) zzb(6, (Object) null, (Object) null);
    }
}
