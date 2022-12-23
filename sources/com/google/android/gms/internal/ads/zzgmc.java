package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzgmc implements zzgmr {
    private final zzgly zza;
    private final zzgni zzb;
    private final boolean zzc;
    private final zzgkb zzd;

    private zzgmc(zzgni zzgni, zzgkb zzgkb, zzgly zzgly) {
        this.zzb = zzgni;
        this.zzc = zzgkb.zzh(zzgly);
        this.zzd = zzgkb;
        this.zza = zzgly;
    }

    static zzgmc zzc(zzgni zzgni, zzgkb zzgkb, zzgly zzgly) {
        return new zzgmc(zzgni, zzgkb, zzgly);
    }

    public final int zza(Object obj) {
        zzgni zzgni = this.zzb;
        int zzb2 = zzgni.zzb(zzgni.zzd(obj));
        if (!this.zzc) {
            return zzb2;
        }
        this.zzd.zza(obj);
        throw null;
    }

    public final int zzb(Object obj) {
        int hashCode = this.zzb.zzd(obj).hashCode();
        if (!this.zzc) {
            return hashCode;
        }
        this.zzd.zza(obj);
        throw null;
    }

    public final Object zze() {
        return this.zza.zzaJ().zzal();
    }

    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zze(obj);
    }

    public final void zzg(Object obj, Object obj2) {
        zzgmt.zzF(this.zzb, obj, obj2);
        if (this.zzc) {
            zzgmt.zzE(this.zzd, obj, obj2);
        }
    }

    public final void zzh(Object obj, zzgmj zzgmj, zzgka zzgka) throws IOException {
        boolean z;
        zzgni zzgni = this.zzb;
        zzgkb zzgkb = this.zzd;
        Object zzc2 = zzgni.zzc(obj);
        zzgkf zzb2 = zzgkb.zzb(obj);
        while (zzgmj.zzc() != Integer.MAX_VALUE) {
            int zzd2 = zzgmj.zzd();
            if (zzd2 != 11) {
                if ((zzd2 & 7) == 2) {
                    Object zzc3 = zzgkb.zzc(zzgka, this.zza, zzd2 >>> 3);
                    if (zzc3 != null) {
                        zzgkb.zzf(zzgmj, zzc3, zzgka, zzb2);
                    } else {
                        z = zzgni.zzp(zzc2, zzgmj);
                    }
                } else {
                    z = zzgmj.zzO();
                }
                if (!z) {
                    zzgni.zzn(obj, zzc2);
                    return;
                }
            } else {
                int i = 0;
                Object obj2 = null;
                zzgjg zzgjg = null;
                while (true) {
                    try {
                        if (zzgmj.zzc() == Integer.MAX_VALUE) {
                            break;
                        }
                        int zzd3 = zzgmj.zzd();
                        if (zzd3 == 16) {
                            i = zzgmj.zzj();
                            obj2 = zzgkb.zzc(zzgka, this.zza, i);
                        } else if (zzd3 == 26) {
                            if (obj2 != null) {
                                zzgkb.zzf(zzgmj, obj2, zzgka, zzb2);
                            } else {
                                zzgjg = zzgmj.zzp();
                            }
                        } else if (!zzgmj.zzO()) {
                            break;
                        }
                    } catch (Throwable th) {
                        zzgni.zzn(obj, zzc2);
                        throw th;
                    }
                }
                if (zzgmj.zzd() != 12) {
                    throw zzgla.zzb();
                } else if (zzgjg != null) {
                    if (obj2 != null) {
                        zzgkb.zzg(zzgjg, obj2, zzgka, zzb2);
                    } else {
                        zzgni.zzk(zzc2, i, zzgjg);
                    }
                }
            }
        }
        zzgni.zzn(obj, zzc2);
    }

    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzgis zzgis) throws IOException {
        zzgko zzgko = (zzgko) obj;
        if (zzgko.zzc == zzgnj.zzc()) {
            zzgko.zzc = zzgnj.zze();
        }
        zzgkl zzgkl = (zzgkl) obj;
        throw null;
    }

    public final boolean zzj(Object obj, Object obj2) {
        if (!this.zzb.zzd(obj).equals(this.zzb.zzd(obj2))) {
            return false;
        }
        if (!this.zzc) {
            return true;
        }
        this.zzd.zza(obj);
        this.zzd.zza(obj2);
        throw null;
    }

    public final boolean zzk(Object obj) {
        this.zzd.zza(obj);
        throw null;
    }

    public final void zzn(Object obj, zzgjw zzgjw) throws IOException {
        this.zzd.zza(obj);
        throw null;
    }
}
