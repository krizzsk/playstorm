package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzaav implements zzys {
    private final zzdy zza = new zzdy(6);
    private zzyv zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private long zzf = -1;
    private zzacs zzg;
    private zzyt zzh;
    private zzaay zzi;
    private zzaeo zzj;

    private final int zze(zzyt zzyt) throws IOException {
        this.zza.zzC(2);
        ((zzym) zzyt).zzm(this.zza.zzH(), 0, 2, false);
        return this.zza.zzo();
    }

    private final void zzf() {
        zzg(new zzbk[0]);
        zzyv zzyv = this.zzb;
        if (zzyv != null) {
            zzyv.zzB();
            this.zzb.zzL(new zzzu(-9223372036854775807L, 0));
            this.zzc = 6;
            return;
        }
        throw null;
    }

    public final int zza(zzyt zzyt, zzzs zzzs) throws IOException {
        String zzv;
        zzaax zza2;
        long j;
        zzyt zzyt2 = zzyt;
        zzzs zzzs2 = zzzs;
        int i = this.zzc;
        if (i == 0) {
            this.zza.zzC(2);
            ((zzym) zzyt2).zzn(this.zza.zzH(), 0, 2, false);
            int zzo = this.zza.zzo();
            this.zzd = zzo;
            if (zzo == 65498) {
                if (this.zzf != -1) {
                    this.zzc = 4;
                } else {
                    zzf();
                }
            } else if ((zzo < 65488 || zzo > 65497) && zzo != 65281) {
                this.zzc = 1;
            }
            return 0;
        } else if (i != 1) {
            zzacs zzacs = null;
            if (i == 2) {
                if (this.zzd == 65505) {
                    zzdy zzdy = new zzdy(this.zze);
                    ((zzym) zzyt2).zzn(zzdy.zzH(), 0, this.zze, false);
                    if (this.zzg == null && "http://ns.adobe.com/xap/1.0/".equals(zzdy.zzv(0)) && (zzv = zzdy.zzv(0)) != null) {
                        long zzd2 = zzyt.zzd();
                        if (!(zzd2 == -1 || (zza2 = zzabb.zza(zzv)) == null || zza2.zzb.size() < 2)) {
                            long j2 = -1;
                            long j3 = -1;
                            long j4 = -1;
                            long j5 = -1;
                            boolean z = false;
                            for (int size = zza2.zzb.size() - 1; size >= 0; size--) {
                                zzaaw zzaaw = (zzaaw) zza2.zzb.get(size);
                                z |= "video/mp4".equals(zzaaw.zza);
                                if (size == 0) {
                                    zzd2 -= zzaaw.zzd;
                                    j = 0;
                                } else {
                                    j = zzd2 - zzaaw.zzc;
                                }
                                long j6 = zzd2;
                                zzd2 = j;
                                long j7 = j6;
                                if (z && zzd2 != j7) {
                                    j5 = j7 - zzd2;
                                    j4 = zzd2;
                                    z = false;
                                }
                                if (size == 0) {
                                    j3 = j7;
                                }
                                if (size == 0) {
                                    j2 = zzd2;
                                }
                            }
                            zzacs = (j4 == -1 || j5 == -1 || j2 == -1 || j3 == -1) ? null : new zzacs(j2, j3, zza2.zza, j4, j5);
                        }
                        this.zzg = zzacs;
                        if (zzacs != null) {
                            this.zzf = zzacs.zzd;
                        }
                    }
                } else {
                    ((zzym) zzyt2).zzo(this.zze, false);
                }
                this.zzc = 0;
                return 0;
            } else if (i == 4) {
                long zzf2 = zzyt.zzf();
                long j8 = this.zzf;
                if (zzf2 == j8) {
                    if (!zzyt2.zzm(this.zza.zzH(), 0, 1, true)) {
                        zzf();
                    } else {
                        zzyt.zzj();
                        if (this.zzj == null) {
                            this.zzj = new zzaeo(0);
                        }
                        zzaay zzaay = new zzaay(zzyt2, this.zzf);
                        this.zzi = zzaay;
                        if (this.zzj.zzd(zzaay)) {
                            zzaeo zzaeo = this.zzj;
                            long j9 = this.zzf;
                            zzyv zzyv = this.zzb;
                            if (zzyv != null) {
                                zzaeo.zzb(new zzaba(j9, zzyv));
                                zzbk[] zzbkArr = new zzbk[1];
                                zzacs zzacs2 = this.zzg;
                                if (zzacs2 != null) {
                                    zzbkArr[0] = zzacs2;
                                    zzg(zzbkArr);
                                    this.zzc = 5;
                                } else {
                                    throw null;
                                }
                            } else {
                                throw null;
                            }
                        } else {
                            zzf();
                        }
                    }
                    return 0;
                }
                zzzs2.zza = j8;
                return 1;
            } else if (i == 5) {
                if (this.zzi == null || zzyt2 != this.zzh) {
                    this.zzh = zzyt2;
                    this.zzi = new zzaay(zzyt2, this.zzf);
                }
                zzaeo zzaeo2 = this.zzj;
                if (zzaeo2 != null) {
                    int zza3 = zzaeo2.zza(this.zzi, zzzs2);
                    if (zza3 == 1) {
                        zzzs2.zza += this.zzf;
                    }
                    return zza3;
                }
                throw null;
            } else if (i == 6) {
                return -1;
            } else {
                throw new IllegalStateException();
            }
        } else {
            this.zza.zzC(2);
            ((zzym) zzyt2).zzn(this.zza.zzH(), 0, 2, false);
            this.zze = this.zza.zzo() - 2;
            this.zzc = 2;
            return 0;
        }
    }

    public final void zzb(zzyv zzyv) {
        this.zzb = zzyv;
    }

    public final boolean zzd(zzyt zzyt) throws IOException {
        if (zze(zzyt) != 65496) {
            return false;
        }
        int zze2 = zze(zzyt);
        this.zzd = zze2;
        if (zze2 == 65504) {
            this.zza.zzC(2);
            zzym zzym = (zzym) zzyt;
            zzym.zzm(this.zza.zzH(), 0, 2, false);
            zzym.zzl(this.zza.zzo() - 2, false);
            zze2 = zze(zzyt);
            this.zzd = zze2;
        }
        if (zze2 == 65505) {
            zzym zzym2 = (zzym) zzyt;
            zzym2.zzl(2, false);
            this.zza.zzC(6);
            zzym2.zzm(this.zza.zzH(), 0, 6, false);
            if (this.zza.zzs() == 1165519206 && this.zza.zzo() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void zzc(long j, long j2) {
        if (j == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzaeo zzaeo = this.zzj;
            if (zzaeo != null) {
                zzaeo.zzc(j, j2);
                return;
            }
            throw null;
        }
    }

    private final void zzg(zzbk... zzbkArr) {
        zzyv zzyv = this.zzb;
        if (zzyv != null) {
            zzzz zzv = zzyv.zzv(1024, 4);
            zzab zzab = new zzab();
            zzab.zzz(MimeTypes.IMAGE_JPEG);
            zzab.zzM(new zzbl(zzbkArr));
            zzv.zzk(zzab.zzY());
            return;
        }
        throw null;
    }
}
