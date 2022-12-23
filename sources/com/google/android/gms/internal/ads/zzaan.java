package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzaan implements zzys {
    public static final zzyz zza = zzaam.zza;
    private final byte[] zzb;
    private final zzdy zzc;
    private final zzza zzd;
    private zzyv zze;
    private zzzz zzf;
    private int zzg;
    private zzbl zzh;
    private zzzf zzi;
    private int zzj;
    private int zzk;
    private zzaal zzl;
    private int zzm;
    private long zzn;

    public zzaan() {
        this(0);
    }

    public zzaan(int i) {
        this.zzb = new byte[42];
        this.zzc = new zzdy(new byte[32768], 0);
        this.zzd = new zzza();
        this.zzg = 0;
    }

    private final long zze(zzdy zzdy, boolean z) {
        boolean z2;
        if (this.zzi != null) {
            int zzc2 = zzdy.zzc();
            while (zzc2 <= zzdy.zzd() - 16) {
                zzdy.zzF(zzc2);
                if (zzzb.zzc(zzdy, this.zzi, this.zzk, this.zzd)) {
                    zzdy.zzF(zzc2);
                    return this.zzd.zza;
                }
                zzc2++;
            }
            if (z) {
                while (zzc2 <= zzdy.zzd() - this.zzj) {
                    zzdy.zzF(zzc2);
                    try {
                        z2 = zzzb.zzc(zzdy, this.zzi, this.zzk, this.zzd);
                    } catch (IndexOutOfBoundsException unused) {
                        z2 = false;
                    }
                    if (zzdy.zzc() <= zzdy.zzd() && z2) {
                        zzdy.zzF(zzc2);
                        return this.zzd.zza;
                    }
                    zzc2++;
                }
                zzdy.zzF(zzdy.zzd());
                return -1;
            }
            zzdy.zzF(zzc2);
            return -1;
        }
        throw null;
    }

    private final void zzf() {
        long j = this.zzn;
        zzzf zzzf = this.zzi;
        int i = zzeg.zza;
        this.zzf.zzs((j * 1000000) / ((long) zzzf.zze), 1, this.zzm, 0, (zzzy) null);
    }

    public final void zzb(zzyv zzyv) {
        this.zze = zzyv;
        this.zzf = zzyv.zzv(0, 1);
        zzyv.zzB();
    }

    public final boolean zzd(zzyt zzyt) throws IOException {
        zzzc.zza(zzyt, false);
        zzdy zzdy = new zzdy(4);
        ((zzym) zzyt).zzm(zzdy.zzH(), 0, 4, false);
        if (zzdy.zzs() == 1716281667) {
            return true;
        }
        return false;
    }

    public final void zzc(long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            this.zzg = 0;
        } else {
            zzaal zzaal = this.zzl;
            if (zzaal != null) {
                zzaal.zzd(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.zzn = j3;
        this.zzm = 0;
        this.zzc.zzC(0);
    }

    public final int zza(zzyt zzyt, zzzs zzzs) throws IOException {
        boolean zzl2;
        zzzv zzzv;
        zzyt zzyt2 = zzyt;
        int i = this.zzg;
        boolean z = true;
        if (i == 0) {
            zzyt.zzj();
            long zze2 = zzyt.zze();
            zzbl zza2 = zzzc.zza(zzyt2, true);
            ((zzym) zzyt2).zzo((int) (zzyt.zze() - zze2), false);
            this.zzh = zza2;
            this.zzg = 1;
            return 0;
        } else if (i == 1) {
            ((zzym) zzyt2).zzm(this.zzb, 0, 42, false);
            zzyt.zzj();
            this.zzg = 2;
            return 0;
        } else if (i == 2) {
            zzdy zzdy = new zzdy(4);
            ((zzym) zzyt2).zzn(zzdy.zzH(), 0, 4, false);
            if (zzdy.zzs() == 1716281667) {
                this.zzg = 3;
                return 0;
            }
            throw zzbp.zza("Failed to read FLAC stream marker.", (Throwable) null);
        } else if (i == 3) {
            zzzf zzzf = this.zzi;
            do {
                zzyt.zzj();
                zzdx zzdx = new zzdx(new byte[4], 4);
                zzym zzym = (zzym) zzyt2;
                zzym.zzm(zzdx.zza, 0, 4, false);
                zzl2 = zzdx.zzl();
                int zzc2 = zzdx.zzc(7);
                int zzc3 = zzdx.zzc(24) + 4;
                if (zzc2 == 0) {
                    byte[] bArr = new byte[38];
                    zzym.zzn(bArr, 0, 38, false);
                    zzzf = new zzzf(bArr, 4);
                } else if (zzzf == null) {
                    throw new IllegalArgumentException();
                } else if (zzc2 == 3) {
                    zzdy zzdy2 = new zzdy(zzc3);
                    zzym.zzn(zzdy2.zzH(), 0, zzc3, false);
                    zzzf = zzzf.zzf(zzzc.zzb(zzdy2));
                } else if (zzc2 == 4) {
                    zzdy zzdy3 = new zzdy(zzc3);
                    zzym.zzn(zzdy3.zzH(), 0, zzc3, false);
                    zzdy3.zzG(4);
                    zzzf = zzzf.zzg(Arrays.asList(zzaaf.zzc(zzdy3, false, false).zzb));
                } else if (zzc2 == 6) {
                    zzdy zzdy4 = new zzdy(zzc3);
                    zzym.zzn(zzdy4.zzH(), 0, zzc3, false);
                    zzdy4.zzG(4);
                    zzzf = zzzf.zze(zzfrh.zzp(zzabh.zzb(zzdy4)));
                } else {
                    zzym.zzo(zzc3, false);
                }
                int i2 = zzeg.zza;
                this.zzi = zzzf;
            } while (!zzl2);
            if (zzzf != null) {
                this.zzj = Math.max(zzzf.zzc, 6);
                this.zzf.zzk(this.zzi.zzc(this.zzb, this.zzh));
                this.zzg = 4;
                return 0;
            }
            throw null;
        } else if (i == 4) {
            zzyt.zzj();
            zzdy zzdy5 = new zzdy(2);
            ((zzym) zzyt2).zzm(zzdy5.zzH(), 0, 2, false);
            int zzo = zzdy5.zzo();
            if ((zzo >> 2) == 16382) {
                zzyt.zzj();
                this.zzk = zzo;
                zzyv zzyv = this.zze;
                int i3 = zzeg.zza;
                long zzf2 = zzyt.zzf();
                long zzd2 = zzyt.zzd();
                zzzf zzzf2 = this.zzi;
                if (zzzf2 != null) {
                    if (zzzf2.zzk != null) {
                        zzzv = new zzzd(zzzf2, zzf2);
                    } else if (zzd2 == -1 || zzzf2.zzj <= 0) {
                        zzzv = new zzzu(zzzf2.zza(), 0);
                    } else {
                        zzaal zzaal = new zzaal(zzzf2, this.zzk, zzf2, zzd2);
                        this.zzl = zzaal;
                        zzzv = zzaal.zzb();
                    }
                    zzyv.zzL(zzzv);
                    this.zzg = 5;
                    return 0;
                }
                throw null;
            }
            zzyt.zzj();
            throw zzbp.zza("First frame does not start with sync code.", (Throwable) null);
        } else if (this.zzf != null) {
            zzzf zzzf3 = this.zzi;
            if (zzzf3 != null) {
                zzaal zzaal2 = this.zzl;
                if (zzaal2 != null && zzaal2.zze()) {
                    return zzaal2.zza(zzyt2, zzzs);
                }
                if (this.zzn == -1) {
                    this.zzn = zzzb.zzb(zzyt2, zzzf3);
                    return 0;
                }
                zzdy zzdy6 = this.zzc;
                int zzd3 = zzdy6.zzd();
                if (zzd3 < 32768) {
                    int zza3 = zzyt2.zza(zzdy6.zzH(), zzd3, 32768 - zzd3);
                    if (zza3 != -1) {
                        z = false;
                    }
                    if (!z) {
                        this.zzc.zzE(zzd3 + zza3);
                    } else if (this.zzc.zza() == 0) {
                        zzf();
                        return -1;
                    }
                } else {
                    z = false;
                }
                zzdy zzdy7 = this.zzc;
                int zzc4 = zzdy7.zzc();
                int i4 = this.zzm;
                int i5 = this.zzj;
                if (i4 < i5) {
                    zzdy7.zzG(Math.min(i5 - i4, zzdy7.zza()));
                }
                long zze3 = zze(this.zzc, z);
                zzdy zzdy8 = this.zzc;
                int zzc5 = zzdy8.zzc() - zzc4;
                zzdy8.zzF(zzc4);
                zzzx.zzb(this.zzf, this.zzc, zzc5);
                this.zzm += zzc5;
                if (zze3 != -1) {
                    zzf();
                    this.zzm = 0;
                    this.zzn = zze3;
                }
                zzdy zzdy9 = this.zzc;
                if (zzdy9.zza() >= 16) {
                    return 0;
                }
                int zza4 = zzdy9.zza();
                System.arraycopy(zzdy9.zzH(), zzdy9.zzc(), zzdy9.zzH(), 0, zza4);
                this.zzc.zzF(0);
                this.zzc.zzE(zza4);
                return 0;
            }
            throw null;
        } else {
            throw null;
        }
    }
}
