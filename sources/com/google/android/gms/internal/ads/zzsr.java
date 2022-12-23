package com.google.android.gms.internal.ads;

import com.facebook.internal.security.CertificateUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzsr implements zzrz, zzry {
    private final zzrz[] zza;
    private final IdentityHashMap zzb;
    private final ArrayList zzc = new ArrayList();
    private final HashMap zzd = new HashMap();
    private zzry zze;
    private zztz zzf;
    private zzrz[] zzg;
    private zztt zzh;
    private final zzrm zzi;

    public zzsr(zzrm zzrm, long[] jArr, zzrz[] zzrzArr, byte... bArr) {
        this.zzi = zzrm;
        this.zza = zzrzArr;
        this.zzh = new zzrl(new zztt[0]);
        this.zzb = new IdentityHashMap();
        this.zzg = new zzrz[0];
        for (int i = 0; i < zzrzArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.zza[i] = new zzsp(zzrzArr[i], j);
            }
        }
    }

    public final long zza(long j, zzjx zzjx) {
        zzrz[] zzrzArr = this.zzg;
        return (zzrzArr.length > 0 ? zzrzArr[0] : this.zza[0]).zza(j, zzjx);
    }

    public final long zzb() {
        return this.zzh.zzb();
    }

    public final long zzc() {
        return this.zzh.zzc();
    }

    public final long zzd() {
        long j = -9223372036854775807L;
        for (zzrz zzrz : this.zzg) {
            long zzd2 = zzrz.zzd();
            if (zzd2 != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    zzrz[] zzrzArr = this.zzg;
                    int length = zzrzArr.length;
                    int i = 0;
                    while (i < length) {
                        zzrz zzrz2 = zzrzArr[i];
                        if (zzrz2 == zzrz) {
                            break;
                        } else if (zzrz2.zze(zzd2) == zzd2) {
                            i++;
                        } else {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = zzd2;
                } else if (zzd2 != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (!(j == -9223372036854775807L || zzrz.zze(j) == j)) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    public final long zze(long j) {
        long zze2 = this.zzg[0].zze(j);
        int i = 1;
        while (true) {
            zzrz[] zzrzArr = this.zzg;
            if (i >= zzrzArr.length) {
                return zze2;
            }
            if (zzrzArr[i].zze(zze2) == zze2) {
                i++;
            } else {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
    }

    public final long zzf(zzvh[] zzvhArr, boolean[] zArr, zztr[] zztrArr, boolean[] zArr2, long j) {
        ArrayList arrayList;
        int i;
        zzvh[] zzvhArr2 = zzvhArr;
        zztr[] zztrArr2 = zztrArr;
        int length = zzvhArr2.length;
        int[] iArr = new int[length];
        int[] iArr2 = new int[length];
        int i2 = 0;
        while (true) {
            int length2 = zzvhArr2.length;
            if (i2 < length2) {
                zztr zztr = zztrArr2[i2];
                Integer num = zztr == null ? null : (Integer) this.zzb.get(zztr);
                if (num == null) {
                    i = -1;
                } else {
                    i = num.intValue();
                }
                iArr[i2] = i;
                iArr2[i2] = -1;
                zzvh zzvh = zzvhArr2[i2];
                if (zzvh != null) {
                    zzck zzck = (zzck) this.zzd.get(zzvh.zze());
                    if (zzck != null) {
                        int i3 = 0;
                        while (true) {
                            zzrz[] zzrzArr = this.zza;
                            if (i3 >= zzrzArr.length) {
                                break;
                            } else if (zzrzArr[i3].zzh().zza(zzck) != -1) {
                                iArr2[i2] = i3;
                                break;
                            } else {
                                i3++;
                            }
                        }
                    } else {
                        throw null;
                    }
                }
                i2++;
            } else {
                this.zzb.clear();
                zztr[] zztrArr3 = new zztr[length2];
                zztr[] zztrArr4 = new zztr[length2];
                zzvh[] zzvhArr3 = new zzvh[length2];
                ArrayList arrayList2 = new ArrayList(this.zza.length);
                long j2 = j;
                int i4 = 0;
                while (i4 < this.zza.length) {
                    for (int i5 = 0; i5 < zzvhArr2.length; i5++) {
                        zztrArr4[i5] = iArr[i5] == i4 ? zztrArr2[i5] : null;
                        if (iArr2[i5] == i4) {
                            zzvh zzvh2 = zzvhArr2[i5];
                            if (zzvh2 != null) {
                                zzck zzck2 = (zzck) this.zzd.get(zzvh2.zze());
                                if (zzck2 != null) {
                                    zzvhArr3[i5] = new zzso(zzvh2, zzck2);
                                } else {
                                    throw null;
                                }
                            } else {
                                throw null;
                            }
                        } else {
                            zzvhArr3[i5] = null;
                        }
                    }
                    int i6 = i4;
                    ArrayList arrayList3 = arrayList2;
                    zztr[] zztrArr5 = zztrArr4;
                    zzvh[] zzvhArr4 = zzvhArr3;
                    long zzf2 = this.zza[i4].zzf(zzvhArr3, zArr, zztrArr4, zArr2, j2);
                    if (i6 == 0) {
                        j2 = zzf2;
                    } else if (zzf2 != j2) {
                        throw new IllegalStateException("Children enabled at different positions.");
                    }
                    boolean z = false;
                    for (int i7 = 0; i7 < zzvhArr2.length; i7++) {
                        boolean z2 = true;
                        if (iArr2[i7] == i6) {
                            zztr zztr2 = zztrArr5[i7];
                            if (zztr2 != null) {
                                zztrArr3[i7] = zztr2;
                                this.zzb.put(zztr2, Integer.valueOf(i6));
                                z = true;
                            } else {
                                throw null;
                            }
                        } else if (iArr[i7] == i6) {
                            if (zztrArr5[i7] != null) {
                                z2 = false;
                            }
                            zzcw.zzf(z2);
                        }
                    }
                    if (z) {
                        arrayList = arrayList3;
                        arrayList.add(this.zza[i6]);
                    } else {
                        arrayList = arrayList3;
                    }
                    i4 = i6 + 1;
                    arrayList2 = arrayList;
                    zztrArr4 = zztrArr5;
                    zzvhArr3 = zzvhArr4;
                }
                System.arraycopy(zztrArr3, 0, zztrArr2, 0, length2);
                zzrz[] zzrzArr2 = (zzrz[]) arrayList2.toArray(new zzrz[0]);
                this.zzg = zzrzArr2;
                this.zzh = new zzrl(zzrzArr2);
                return j2;
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzg(zztt zztt) {
        zzrz zzrz = (zzrz) zztt;
        zzry zzry = this.zze;
        if (zzry != null) {
            zzry.zzg(this);
            return;
        }
        throw null;
    }

    public final zztz zzh() {
        zztz zztz = this.zzf;
        if (zztz != null) {
            return zztz;
        }
        throw null;
    }

    public final void zzi(zzrz zzrz) {
        this.zzc.remove(zzrz);
        if (this.zzc.isEmpty()) {
            int i = 0;
            for (zzrz zzh2 : this.zza) {
                i += zzh2.zzh().zzc;
            }
            zzck[] zzckArr = new zzck[i];
            int i2 = 0;
            int i3 = 0;
            while (true) {
                zzrz[] zzrzArr = this.zza;
                if (i2 >= zzrzArr.length) {
                    break;
                }
                zztz zzh3 = zzrzArr[i2].zzh();
                int i4 = zzh3.zzc;
                int i5 = 0;
                while (i5 < i4) {
                    zzck zzb2 = zzh3.zzb(i5);
                    zzck zzc2 = zzb2.zzc(i2 + CertificateUtil.DELIMITER + zzb2.zzc);
                    this.zzd.put(zzc2, zzb2);
                    zzckArr[i3] = zzc2;
                    i5++;
                    i3++;
                }
                i2++;
            }
            this.zzf = new zztz(zzckArr);
            zzry zzry = this.zze;
            if (zzry != null) {
                zzry.zzi(this);
                return;
            }
            throw null;
        }
    }

    public final void zzj(long j, boolean z) {
        for (zzrz zzj : this.zzg) {
            zzj.zzj(j, false);
        }
    }

    public final void zzk() throws IOException {
        for (zzrz zzk : this.zza) {
            zzk.zzk();
        }
    }

    public final void zzl(zzry zzry, long j) {
        this.zze = zzry;
        Collections.addAll(this.zzc, this.zza);
        for (zzrz zzl : this.zza) {
            zzl.zzl(this, j);
        }
    }

    public final void zzm(long j) {
        this.zzh.zzm(j);
    }

    public final zzrz zzn(int i) {
        zzrz zzrz = this.zza[i];
        return zzrz instanceof zzsp ? ((zzsp) zzrz).zza : zzrz;
    }

    public final boolean zzo(long j) {
        if (this.zzc.isEmpty()) {
            return this.zzh.zzo(j);
        }
        int size = this.zzc.size();
        for (int i = 0; i < size; i++) {
            ((zzrz) this.zzc.get(i)).zzo(j);
        }
        return false;
    }

    public final boolean zzp() {
        return this.zzh.zzp();
    }
}
