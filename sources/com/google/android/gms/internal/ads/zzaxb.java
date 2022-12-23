package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzaxb implements zzawy, zzawx {
    public final zzawy[] zza;
    private final IdentityHashMap zzb = new IdentityHashMap();
    private zzawx zzc;
    private int zzd;
    private zzaxp zze;
    private zzawy[] zzf;
    private zzaxm zzg;

    public zzaxb(zzawy... zzawyArr) {
        this.zza = zzawyArr;
    }

    public final long zzB(zzaxt[] zzaxtArr, boolean[] zArr, zzaxk[] zzaxkArr, boolean[] zArr2, long j) {
        int length;
        int i;
        zzaxt[] zzaxtArr2 = zzaxtArr;
        zzaxk[] zzaxkArr2 = zzaxkArr;
        int length2 = zzaxtArr2.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i2 = 0;
        while (true) {
            length = zzaxtArr2.length;
            if (i2 >= length) {
                break;
            }
            zzaxk zzaxk = zzaxkArr2[i2];
            if (zzaxk == null) {
                i = -1;
            } else {
                i = ((Integer) this.zzb.get(zzaxk)).intValue();
            }
            iArr[i2] = i;
            iArr2[i2] = -1;
            zzaxt zzaxt = zzaxtArr2[i2];
            if (zzaxt != null) {
                zzaxo zzd2 = zzaxt.zzd();
                int i3 = 0;
                while (true) {
                    zzawy[] zzawyArr = this.zza;
                    if (i3 >= zzawyArr.length) {
                        break;
                    } else if (zzawyArr[i3].zzn().zza(zzd2) != -1) {
                        iArr2[i2] = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            i2++;
        }
        this.zzb.clear();
        zzaxk[] zzaxkArr3 = new zzaxk[length];
        zzaxk[] zzaxkArr4 = new zzaxk[length];
        zzaxt[] zzaxtArr3 = new zzaxt[length];
        ArrayList arrayList = new ArrayList(this.zza.length);
        long j2 = j;
        int i4 = 0;
        while (i4 < this.zza.length) {
            for (int i5 = 0; i5 < zzaxtArr2.length; i5++) {
                zzaxt zzaxt2 = null;
                zzaxkArr4[i5] = iArr[i5] == i4 ? zzaxkArr2[i5] : null;
                if (iArr2[i5] == i4) {
                    zzaxt2 = zzaxtArr2[i5];
                }
                zzaxtArr3[i5] = zzaxt2;
            }
            int i6 = i4;
            zzaxt[] zzaxtArr4 = zzaxtArr3;
            ArrayList arrayList2 = arrayList;
            long zzB = this.zza[i4].zzB(zzaxtArr3, zArr, zzaxkArr4, zArr2, j2);
            if (i6 == 0) {
                j2 = zzB;
            } else if (zzB != j2) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z = false;
            for (int i7 = 0; i7 < zzaxtArr2.length; i7++) {
                boolean z2 = true;
                if (iArr2[i7] == i6) {
                    zzayy.zze(zzaxkArr4[i7] != null);
                    zzaxk zzaxk2 = zzaxkArr4[i7];
                    zzaxkArr3[i7] = zzaxk2;
                    this.zzb.put(zzaxk2, Integer.valueOf(i6));
                    z = true;
                } else if (iArr[i7] == i6) {
                    if (zzaxkArr4[i7] != null) {
                        z2 = false;
                    }
                    zzayy.zze(z2);
                }
            }
            if (z) {
                arrayList2.add(this.zza[i6]);
            }
            i4 = i6 + 1;
            arrayList = arrayList2;
            zzaxtArr3 = zzaxtArr4;
            zzaxkArr2 = zzaxkArr;
        }
        zzaxk[] zzaxkArr5 = zzaxkArr2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzaxkArr3, 0, zzaxkArr5, 0, length);
        zzawy[] zzawyArr2 = new zzawy[arrayList3.size()];
        this.zzf = zzawyArr2;
        arrayList3.toArray(zzawyArr2);
        this.zzg = new zzawm(this.zzf);
        return j2;
    }

    public final long zza() {
        return this.zzg.zza();
    }

    public final boolean zzbj(long j) {
        return this.zzg.zzbj(j);
    }

    public final /* bridge */ /* synthetic */ void zze(zzaxm zzaxm) {
        zzawy zzawy = (zzawy) zzaxm;
        if (this.zze != null) {
            this.zzc.zze(this);
        }
    }

    public final void zzf(zzawy zzawy) {
        int i = this.zzd - 1;
        this.zzd = i;
        if (i <= 0) {
            int i2 = 0;
            for (zzawy zzn : this.zza) {
                i2 += zzn.zzn().zzb;
            }
            zzaxo[] zzaxoArr = new zzaxo[i2];
            int i3 = 0;
            for (zzawy zzn2 : this.zza) {
                zzaxp zzn3 = zzn2.zzn();
                int i4 = zzn3.zzb;
                int i5 = 0;
                while (i5 < i4) {
                    zzaxoArr[i3] = zzn3.zzb(i5);
                    i5++;
                    i3++;
                }
            }
            this.zze = new zzaxp(zzaxoArr);
            this.zzc.zzf(this);
        }
    }

    public final long zzg() {
        long j = Long.MAX_VALUE;
        for (zzawy zzg2 : this.zzf) {
            long zzg3 = zzg2.zzg();
            if (zzg3 != Long.MIN_VALUE) {
                j = Math.min(j, zzg3);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final long zzh() {
        long zzh = this.zza[0].zzh();
        int i = 1;
        while (true) {
            zzawy[] zzawyArr = this.zza;
            if (i >= zzawyArr.length) {
                if (zzh != -9223372036854775807L) {
                    zzawy[] zzawyArr2 = this.zzf;
                    int length = zzawyArr2.length;
                    int i2 = 0;
                    while (i2 < length) {
                        zzawy zzawy = zzawyArr2[i2];
                        if (zzawy == this.zza[0] || zzawy.zzi(zzh) == zzh) {
                            i2++;
                        } else {
                            throw new IllegalStateException("Children seeked to different positions");
                        }
                    }
                }
                return zzh;
            } else if (zzawyArr[i].zzh() == -9223372036854775807L) {
                i++;
            } else {
                throw new IllegalStateException("Child reported discontinuity");
            }
        }
    }

    public final long zzi(long j) {
        long zzi = this.zzf[0].zzi(j);
        int i = 1;
        while (true) {
            zzawy[] zzawyArr = this.zzf;
            if (i >= zzawyArr.length) {
                return zzi;
            }
            if (zzawyArr[i].zzi(zzi) == zzi) {
                i++;
            } else {
                throw new IllegalStateException("Children seeked to different positions");
            }
        }
    }

    public final zzaxp zzn() {
        return this.zze;
    }

    public final void zzq(long j) {
        for (zzawy zzq : this.zzf) {
            zzq.zzq(j);
        }
    }

    public final void zzs() throws IOException {
        for (zzawy zzs : this.zza) {
            zzs.zzs();
        }
    }

    public final void zzw(zzawx zzawx, long j) {
        this.zzc = zzawx;
        this.zzd = r0;
        for (zzawy zzw : this.zza) {
            zzw.zzw(this, j);
        }
    }
}
