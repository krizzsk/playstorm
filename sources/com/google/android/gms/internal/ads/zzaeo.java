package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzaeo implements zzys, zzzv {
    public static final zzyz zza = zzael.zza;
    private final zzdy zzb;
    private final zzdy zzc;
    private final zzdy zzd;
    private final zzdy zze;
    private final ArrayDeque zzf;
    private final zzaer zzg;
    private final List zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private int zzl;
    private zzdy zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private zzyv zzr;
    private zzaen[] zzs;
    private long[][] zzt;
    private int zzu;
    private long zzv;
    private int zzw;
    private zzacs zzx;

    public zzaeo() {
        this(0);
    }

    private static int zzf(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int zzi(zzaew zzaew, long j) {
        int zza2 = zzaew.zza(j);
        return zza2 == -1 ? zzaew.zzb(j) : zza2;
    }

    private static long zzj(zzaew zzaew, long j, long j2) {
        int zzi2 = zzi(zzaew, j);
        if (zzi2 == -1) {
            return j2;
        }
        return Math.min(zzaew.zzc[zzi2], j2);
    }

    private final void zzk() {
        this.zzi = 0;
        this.zzl = 0;
    }

    private final void zzl(long j) throws zzbp {
        zzbl zzbl;
        zzbl zzbl2;
        long j2;
        int i;
        List list;
        int i2;
        int i3;
        while (!this.zzf.isEmpty() && ((zzadu) this.zzf.peek()).zza == j) {
            zzadu zzadu = (zzadu) this.zzf.pop();
            if (zzadu.zzd == 1836019574) {
                ArrayList arrayList = new ArrayList();
                boolean z = this.zzw == 1;
                zzzh zzzh = new zzzh();
                zzadv zzb2 = zzadu.zzb(Atom.TYPE_udta);
                if (zzb2 != null) {
                    Pair zza2 = zzaed.zza(zzb2);
                    zzbl zzbl3 = (zzbl) zza2.first;
                    zzbl zzbl4 = (zzbl) zza2.second;
                    if (zzbl3 != null) {
                        zzzh.zzb(zzbl3);
                    }
                    zzbl2 = zzbl4;
                    zzbl = zzbl3;
                } else {
                    zzbl2 = null;
                    zzbl = null;
                }
                zzadu zza3 = zzadu.zza(Atom.TYPE_meta);
                long j3 = -9223372036854775807L;
                zzbl zzb3 = zza3 != null ? zzaed.zzb(zza3) : null;
                List zzc2 = zzaed.zzc(zzadu, zzzh, -9223372036854775807L, (zzv) null, false, z, zzaem.zza);
                int size = zzc2.size();
                long j4 = -9223372036854775807L;
                int i4 = 0;
                int i5 = -1;
                while (true) {
                    j2 = 0;
                    if (i4 >= size) {
                        break;
                    }
                    zzaew zzaew = (zzaew) zzc2.get(i4);
                    if (zzaew.zzb == 0) {
                        list = zzc2;
                        i = size;
                    } else {
                        zzaet zzaet = zzaew.zza;
                        list = zzc2;
                        long j5 = zzaet.zze;
                        if (j5 == j3) {
                            j5 = zzaew.zzh;
                        }
                        long max = Math.max(j4, j5);
                        i = size;
                        zzaen zzaen = new zzaen(zzaet, zzaew, this.zzr.zzv(i4, zzaet.zzb));
                        if ("audio/true-hd".equals(zzaet.zzf.zzm)) {
                            i2 = zzaew.zze * 16;
                        } else {
                            i2 = zzaew.zze + 30;
                        }
                        zzab zzb4 = zzaet.zzf.zzb();
                        zzb4.zzL(i2);
                        long j6 = max;
                        if (zzaet.zzb == 2 && j5 > 0 && (i3 = zzaew.zzb) > 1) {
                            zzb4.zzE(((float) i3) / (((float) j5) / 1000000.0f));
                        }
                        int i6 = zzaet.zzb;
                        int i7 = zzaek.zzb;
                        if (i6 == 1 && zzzh.zza()) {
                            zzb4.zzC(zzzh.zza);
                            zzb4.zzD(zzzh.zzb);
                        }
                        int i8 = zzaet.zzb;
                        zzbl[] zzblArr = new zzbl[2];
                        zzblArr[0] = zzbl2;
                        zzblArr[1] = this.zzh.isEmpty() ? null : new zzbl(this.zzh);
                        zzbl zzbl5 = new zzbl(new zzbk[0]);
                        if (i8 == 1) {
                            if (zzbl != null) {
                                zzbl5 = zzbl;
                            }
                        } else if (i8 == 2 && zzb3 != null) {
                            int i9 = 0;
                            while (true) {
                                if (i9 >= zzb3.zza()) {
                                    break;
                                }
                                zzbk zzb5 = zzb3.zzb(i9);
                                if (zzb5 instanceof zzacp) {
                                    zzacp zzacp = (zzacp) zzb5;
                                    if (MdtaMetadataEntry.KEY_ANDROID_CAPTURE_FPS.equals(zzacp.zza)) {
                                        zzbl5 = new zzbl(zzacp);
                                        break;
                                    }
                                }
                                i9++;
                            }
                        }
                        for (int i10 = 0; i10 < 2; i10++) {
                            zzbl5 = zzbl5.zzd(zzblArr[i10]);
                        }
                        if (zzbl5.zza() > 0) {
                            zzb4.zzM(zzbl5);
                        }
                        zzaen.zzc.zzk(zzb4.zzY());
                        if (zzaet.zzb == 2) {
                            if (i5 == -1) {
                                i5 = arrayList.size();
                            }
                        }
                        arrayList.add(zzaen);
                        j4 = j6;
                    }
                    i4++;
                    zzc2 = list;
                    size = i;
                    j3 = -9223372036854775807L;
                }
                this.zzu = i5;
                this.zzv = j4;
                zzaen[] zzaenArr = (zzaen[]) arrayList.toArray(new zzaen[0]);
                this.zzs = zzaenArr;
                int length = zzaenArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i11 = 0; i11 < zzaenArr.length; i11++) {
                    jArr[i11] = new long[zzaenArr[i11].zzb.zzb];
                    jArr2[i11] = zzaenArr[i11].zzb.zzf[0];
                }
                int i12 = 0;
                while (i12 < zzaenArr.length) {
                    long j7 = Long.MAX_VALUE;
                    int i13 = -1;
                    for (int i14 = 0; i14 < zzaenArr.length; i14++) {
                        if (!zArr[i14]) {
                            long j8 = jArr2[i14];
                            if (j8 <= j7) {
                                i13 = i14;
                                j7 = j8;
                            }
                        }
                    }
                    int i15 = iArr[i13];
                    long[] jArr3 = jArr[i13];
                    jArr3[i15] = j2;
                    zzaew zzaew2 = zzaenArr[i13].zzb;
                    j2 += (long) zzaew2.zzd[i15];
                    int i16 = i15 + 1;
                    iArr[i13] = i16;
                    if (i16 < jArr3.length) {
                        jArr2[i13] = zzaew2.zzf[i16];
                    } else {
                        zArr[i13] = true;
                        i12++;
                    }
                }
                this.zzt = jArr;
                this.zzr.zzB();
                this.zzr.zzL(this);
                this.zzf.clear();
                this.zzi = 2;
            } else if (!this.zzf.isEmpty()) {
                ((zzadu) this.zzf.peek()).zzc(zzadu);
            }
        }
        if (this.zzi != 2) {
            zzk();
        }
    }

    public final void zzb(zzyv zzyv) {
        this.zzr = zzyv;
    }

    public final void zzc(long j, long j2) {
        this.zzf.clear();
        this.zzl = 0;
        this.zzn = -1;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        if (j == 0) {
            zzk();
            return;
        }
        for (zzaen zzaen : this.zzs) {
            zzaew zzaew = zzaen.zzb;
            int zza2 = zzaew.zza(j2);
            if (zza2 == -1) {
                zza2 = zzaew.zzb(j2);
            }
            zzaen.zze = zza2;
            zzaaa zzaaa = zzaen.zzd;
            if (zzaaa != null) {
                zzaaa.zzb();
            }
        }
    }

    public final boolean zzd(zzyt zzyt) throws IOException {
        return zzaes.zzb(zzyt, false);
    }

    public final long zze() {
        return this.zzv;
    }

    public final zzzt zzg(long j) {
        long j2;
        long j3;
        int zzb2;
        zzaen[] zzaenArr = this.zzs;
        if (zzaenArr.length == 0) {
            zzzw zzzw = zzzw.zza;
            return new zzzt(zzzw, zzzw);
        }
        int i = this.zzu;
        long j4 = -1;
        if (i != -1) {
            zzaew zzaew = zzaenArr[i].zzb;
            int zzi2 = zzi(zzaew, j);
            if (zzi2 == -1) {
                zzzw zzzw2 = zzzw.zza;
                return new zzzt(zzzw2, zzzw2);
            }
            long j5 = zzaew.zzf[zzi2];
            j2 = zzaew.zzc[zzi2];
            if (j5 >= j || zzi2 >= zzaew.zzb - 1 || (zzb2 = zzaew.zzb(j)) == -1 || zzb2 == zzi2) {
                j3 = -9223372036854775807L;
            } else {
                j3 = zzaew.zzf[zzb2];
                j4 = zzaew.zzc[zzb2];
            }
            j = j5;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            zzaen[] zzaenArr2 = this.zzs;
            if (i2 >= zzaenArr2.length) {
                break;
            }
            if (i2 != this.zzu) {
                zzaew zzaew2 = zzaenArr2[i2].zzb;
                long zzj2 = zzj(zzaew2, j, j2);
                if (j3 != -9223372036854775807L) {
                    j4 = zzj(zzaew2, j3, j4);
                }
                j2 = zzj2;
            }
            i2++;
        }
        zzzw zzzw3 = new zzzw(j, j2);
        if (j3 == -9223372036854775807L) {
            return new zzzt(zzzw3, zzzw3);
        }
        return new zzzt(zzzw3, new zzzw(j3, j4));
    }

    public final boolean zzh() {
        return true;
    }

    public zzaeo(int i) {
        this.zzi = 0;
        this.zzg = new zzaer();
        this.zzh = new ArrayList();
        this.zze = new zzdy(16);
        this.zzf = new ArrayDeque();
        this.zzb = new zzdy(zzzp.zza);
        this.zzc = new zzdy(4);
        this.zzd = new zzdy();
        this.zzn = -1;
        this.zzr = zzyv.zza;
        this.zzs = new zzaen[0];
    }

    /* JADX WARNING: Removed duplicated region for block: B:211:0x0085 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(com.google.android.gms.internal.ads.zzyt r33, com.google.android.gms.internal.ads.zzzs r34) throws java.io.IOException {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            r2 = r34
        L_0x0006:
            int r3 = r0.zzi
            r4 = 1718909296(0x66747970, float:2.8862439E23)
            r6 = 0
            r8 = -1
            r9 = 8
            r10 = 1
            if (r3 == 0) goto L_0x0250
            r13 = 262144(0x40000, double:1.295163E-318)
            if (r3 == r10) goto L_0x01d0
            long r3 = r33.zzf()
            int r9 = r0.zzn
            if (r9 != r8) goto L_0x00a3
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r20 = r8
            r27 = r20
            r21 = r10
            r24 = r21
            r18 = r16
            r22 = r18
            r25 = r22
            r9 = 0
        L_0x0034:
            com.google.android.gms.internal.ads.zzaen[] r5 = r0.zzs
            int r15 = r5.length
            if (r9 >= r15) goto L_0x0088
            r5 = r5[r9]
            int r15 = r5.zze
            com.google.android.gms.internal.ads.zzaew r5 = r5.zzb
            int r12 = r5.zzb
            if (r15 != r12) goto L_0x0044
            goto L_0x0085
        L_0x0044:
            long[] r5 = r5.zzc
            r28 = r5[r15]
            long[][] r5 = r0.zzt
            java.lang.Object r5 = com.google.android.gms.internal.ads.zzeg.zzG(r5)
            long[][] r5 = (long[][]) r5
            r5 = r5[r9]
            r30 = r5[r15]
            long r28 = r28 - r3
            int r5 = (r28 > r6 ? 1 : (r28 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x0061
            int r5 = (r28 > r13 ? 1 : (r28 == r13 ? 0 : -1))
            if (r5 < 0) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            r5 = 0
            goto L_0x0062
        L_0x0061:
            r5 = r10
        L_0x0062:
            if (r5 != 0) goto L_0x0068
            if (r24 != 0) goto L_0x0070
            r12 = 0
            goto L_0x006a
        L_0x0068:
            r12 = r24
        L_0x006a:
            if (r5 != r12) goto L_0x0079
            int r15 = (r28 > r22 ? 1 : (r28 == r22 ? 0 : -1))
            if (r15 >= 0) goto L_0x0079
        L_0x0070:
            r24 = r5
            r20 = r9
            r22 = r28
            r25 = r30
            goto L_0x007b
        L_0x0079:
            r24 = r12
        L_0x007b:
            int r12 = (r30 > r18 ? 1 : (r30 == r18 ? 0 : -1))
            if (r12 >= 0) goto L_0x0085
            r21 = r5
            r27 = r9
            r18 = r30
        L_0x0085:
            int r9 = r9 + 1
            goto L_0x0034
        L_0x0088:
            int r5 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r5 == 0) goto L_0x009b
            if (r21 == 0) goto L_0x009b
            r15 = 10485760(0xa00000, double:5.180654E-317)
            long r18 = r18 + r15
            int r5 = (r25 > r18 ? 1 : (r25 == r18 ? 0 : -1))
            if (r5 >= 0) goto L_0x0098
            goto L_0x009b
        L_0x0098:
            r9 = r27
            goto L_0x009d
        L_0x009b:
            r9 = r20
        L_0x009d:
            r0.zzn = r9
            if (r9 != r8) goto L_0x00a3
            goto L_0x01cf
        L_0x00a3:
            com.google.android.gms.internal.ads.zzaen[] r5 = r0.zzs
            r5 = r5[r9]
            com.google.android.gms.internal.ads.zzzz r9 = r5.zzc
            int r12 = r5.zze
            com.google.android.gms.internal.ads.zzaew r15 = r5.zzb
            long[] r8 = r15.zzc
            r10 = r8[r12]
            int[] r8 = r15.zzd
            r8 = r8[r12]
            com.google.android.gms.internal.ads.zzaaa r15 = r5.zzd
            long r3 = r10 - r3
            int r13 = r0.zzo
            long r13 = (long) r13
            long r3 = r3 + r13
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x01cc
            r6 = 262144(0x40000, double:1.295163E-318)
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x00ca
            goto L_0x01cc
        L_0x00ca:
            com.google.android.gms.internal.ads.zzaet r2 = r5.zza
            int r2 = r2.zzg
            r6 = 1
            if (r2 != r6) goto L_0x00d6
            r6 = 8
            long r3 = r3 + r6
            int r8 = r8 + -8
        L_0x00d6:
            int r2 = (int) r3
            r1.zzk(r2)
            com.google.android.gms.internal.ads.zzaet r2 = r5.zza
            int r3 = r2.zzj
            if (r3 == 0) goto L_0x0140
            com.google.android.gms.internal.ads.zzdy r2 = r0.zzc
            byte[] r2 = r2.zzH()
            r4 = 0
            r2[r4] = r4
            r6 = 1
            r2[r6] = r4
            r6 = 2
            r2[r6] = r4
            int r4 = 4 - r3
        L_0x00f1:
            int r6 = r0.zzp
            if (r6 >= r8) goto L_0x0183
            int r6 = r0.zzq
            if (r6 != 0) goto L_0x012b
            r1.zzi(r2, r4, r3)
            int r6 = r0.zzo
            int r6 = r6 + r3
            r0.zzo = r6
            com.google.android.gms.internal.ads.zzdy r6 = r0.zzc
            r7 = 0
            r6.zzF(r7)
            com.google.android.gms.internal.ads.zzdy r6 = r0.zzc
            int r6 = r6.zze()
            if (r6 < 0) goto L_0x0123
            r0.zzq = r6
            com.google.android.gms.internal.ads.zzdy r6 = r0.zzb
            r6.zzF(r7)
            com.google.android.gms.internal.ads.zzdy r6 = r0.zzb
            r10 = 4
            com.google.android.gms.internal.ads.zzzx.zzb(r9, r6, r10)
            int r6 = r0.zzp
            int r6 = r6 + r10
            r0.zzp = r6
            int r8 = r8 + r4
            goto L_0x00f1
        L_0x0123:
            java.lang.String r1 = "Invalid NAL length"
            r2 = 0
            com.google.android.gms.internal.ads.zzbp r1 = com.google.android.gms.internal.ads.zzbp.zza(r1, r2)
            throw r1
        L_0x012b:
            r7 = 0
            int r6 = com.google.android.gms.internal.ads.zzzx.zza(r9, r1, r6, r7)
            int r7 = r0.zzo
            int r7 = r7 + r6
            r0.zzo = r7
            int r7 = r0.zzp
            int r7 = r7 + r6
            r0.zzp = r7
            int r7 = r0.zzq
            int r7 = r7 - r6
            r0.zzq = r7
            goto L_0x00f1
        L_0x0140:
            com.google.android.gms.internal.ads.zzad r2 = r2.zzf
            java.lang.String r2 = r2.zzm
            java.lang.String r3 = "audio/ac4"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0163
            int r2 = r0.zzp
            if (r2 != 0) goto L_0x0160
            com.google.android.gms.internal.ads.zzdy r2 = r0.zzd
            com.google.android.gms.internal.ads.zzya.zzb(r8, r2)
            com.google.android.gms.internal.ads.zzdy r2 = r0.zzd
            r3 = 7
            com.google.android.gms.internal.ads.zzzx.zzb(r9, r2, r3)
            int r2 = r0.zzp
            int r2 = r2 + r3
            r0.zzp = r2
        L_0x0160:
            int r8 = r8 + 7
            goto L_0x0168
        L_0x0163:
            if (r15 == 0) goto L_0x0168
            r15.zzd(r1)
        L_0x0168:
            int r2 = r0.zzp
            if (r2 >= r8) goto L_0x0183
            int r2 = r8 - r2
            r3 = 0
            int r2 = com.google.android.gms.internal.ads.zzzx.zza(r9, r1, r2, r3)
            int r3 = r0.zzo
            int r3 = r3 + r2
            r0.zzo = r3
            int r3 = r0.zzp
            int r3 = r3 + r2
            r0.zzp = r3
            int r3 = r0.zzq
            int r3 = r3 - r2
            r0.zzq = r3
            goto L_0x0168
        L_0x0183:
            com.google.android.gms.internal.ads.zzaew r1 = r5.zzb
            long[] r2 = r1.zzf
            r3 = r2[r12]
            int[] r1 = r1.zzg
            r1 = r1[r12]
            if (r15 == 0) goto L_0x01ac
            r21 = 0
            r22 = 0
            r2 = r15
            r16 = r9
            r17 = r3
            r19 = r1
            r20 = r8
            r15.zzc(r16, r17, r19, r20, r21, r22)
            r1 = 1
            int r12 = r12 + r1
            com.google.android.gms.internal.ads.zzaew r1 = r5.zzb
            int r1 = r1.zzb
            if (r12 != r1) goto L_0x01ba
            r1 = 0
            r2.zza(r9, r1)
            goto L_0x01ba
        L_0x01ac:
            r20 = 0
            r21 = 0
            r15 = r9
            r16 = r3
            r18 = r1
            r19 = r8
            r15.zzs(r16, r18, r19, r20, r21)
        L_0x01ba:
            int r1 = r5.zze
            r2 = 1
            int r1 = r1 + r2
            r5.zze = r1
            r1 = -1
            r0.zzn = r1
            r1 = 0
            r0.zzo = r1
            r0.zzp = r1
            r0.zzq = r1
            r8 = 0
            goto L_0x01cf
        L_0x01cc:
            r2.zza = r10
            r8 = 1
        L_0x01cf:
            return r8
        L_0x01d0:
            long r5 = r0.zzk
            int r3 = r0.zzl
            long r7 = (long) r3
            long r5 = r5 - r7
            long r7 = r33.zzf()
            long r7 = r7 + r5
            com.google.android.gms.internal.ads.zzdy r3 = r0.zzm
            if (r3 == 0) goto L_0x022f
            byte[] r10 = r3.zzH()
            int r11 = r0.zzl
            int r5 = (int) r5
            r1.zzi(r10, r11, r5)
            int r5 = r0.zzj
            if (r5 != r4) goto L_0x0214
            r3.zzF(r9)
            int r4 = r3.zze()
            int r4 = zzf(r4)
            if (r4 == 0) goto L_0x01fb
            goto L_0x0211
        L_0x01fb:
            r4 = 4
            r3.zzG(r4)
        L_0x01ff:
            int r4 = r3.zza()
            if (r4 <= 0) goto L_0x0210
            int r4 = r3.zze()
            int r4 = zzf(r4)
            if (r4 == 0) goto L_0x01ff
            goto L_0x0211
        L_0x0210:
            r4 = 0
        L_0x0211:
            r0.zzw = r4
            goto L_0x023a
        L_0x0214:
            java.util.ArrayDeque r4 = r0.zzf
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x023a
            java.util.ArrayDeque r4 = r0.zzf
            java.lang.Object r4 = r4.peek()
            com.google.android.gms.internal.ads.zzadu r4 = (com.google.android.gms.internal.ads.zzadu) r4
            com.google.android.gms.internal.ads.zzadv r5 = new com.google.android.gms.internal.ads.zzadv
            int r6 = r0.zzj
            r5.<init>(r6, r3)
            r4.zzd(r5)
            goto L_0x023a
        L_0x022f:
            r3 = 262144(0x40000, double:1.295163E-318)
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x023c
            int r3 = (int) r5
            r1.zzk(r3)
        L_0x023a:
            r11 = 0
            goto L_0x0244
        L_0x023c:
            long r3 = r33.zzf()
            long r3 = r3 + r5
            r2.zza = r3
            r11 = 1
        L_0x0244:
            r0.zzl(r7)
            if (r11 == 0) goto L_0x0006
            int r3 = r0.zzi
            r4 = 2
            if (r3 == r4) goto L_0x0006
            r3 = 1
            return r3
        L_0x0250:
            r3 = r10
            int r5 = r0.zzl
            if (r5 != 0) goto L_0x027b
            com.google.android.gms.internal.ads.zzdy r5 = r0.zze
            byte[] r5 = r5.zzH()
            r8 = 0
            boolean r5 = r1.zzn(r5, r8, r9, r3)
            if (r5 != 0) goto L_0x0264
            r3 = -1
            return r3
        L_0x0264:
            r0.zzl = r9
            com.google.android.gms.internal.ads.zzdy r3 = r0.zze
            r3.zzF(r8)
            com.google.android.gms.internal.ads.zzdy r3 = r0.zze
            long r10 = r3.zzs()
            r0.zzk = r10
            com.google.android.gms.internal.ads.zzdy r3 = r0.zze
            int r3 = r3.zze()
            r0.zzj = r3
        L_0x027b:
            long r10 = r0.zzk
            r12 = 1
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 != 0) goto L_0x029a
            com.google.android.gms.internal.ads.zzdy r3 = r0.zze
            byte[] r3 = r3.zzH()
            r1.zzi(r3, r9, r9)
            int r3 = r0.zzl
            int r3 = r3 + r9
            r0.zzl = r3
            com.google.android.gms.internal.ads.zzdy r3 = r0.zze
            long r5 = r3.zzt()
            r0.zzk = r5
            goto L_0x02c5
        L_0x029a:
            int r3 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x02c5
            long r5 = r33.zzd()
            r7 = -1
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x02b6
            java.util.ArrayDeque r3 = r0.zzf
            java.lang.Object r3 = r3.peek()
            com.google.android.gms.internal.ads.zzadu r3 = (com.google.android.gms.internal.ads.zzadu) r3
            if (r3 == 0) goto L_0x02b5
            long r5 = r3.zza
            goto L_0x02b6
        L_0x02b5:
            r5 = r7
        L_0x02b6:
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x02c5
            long r7 = r33.zzf()
            long r5 = r5 - r7
            int r3 = r0.zzl
            long r7 = (long) r3
            long r5 = r5 + r7
            r0.zzk = r5
        L_0x02c5:
            long r5 = r0.zzk
            int r3 = r0.zzl
            long r7 = (long) r3
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 < 0) goto L_0x0402
            int r5 = r0.zzj
            r6 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r7 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r5 == r6) goto L_0x03b0
            r6 = 1953653099(0x7472616b, float:7.681346E31)
            if (r5 == r6) goto L_0x03b0
            r6 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r5 == r6) goto L_0x03b0
            r6 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r5 == r6) goto L_0x03b0
            r6 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r5 == r6) goto L_0x03b0
            r6 = 1701082227(0x65647473, float:6.742798E22)
            if (r5 == r6) goto L_0x03b0
            if (r5 != r7) goto L_0x02f5
            goto L_0x03b0
        L_0x02f5:
            r6 = 1835296868(0x6d646864, float:4.418049E27)
            if (r5 == r6) goto L_0x037c
            r6 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r5 == r6) goto L_0x037c
            r6 = 1751411826(0x68646c72, float:4.3148E24)
            if (r5 == r6) goto L_0x037c
            r6 = 1937011556(0x73747364, float:1.9367383E31)
            if (r5 == r6) goto L_0x037c
            r6 = 1937011827(0x73747473, float:1.9367711E31)
            if (r5 == r6) goto L_0x037c
            r6 = 1937011571(0x73747373, float:1.9367401E31)
            if (r5 == r6) goto L_0x037c
            r6 = 1668576371(0x63747473, float:4.5093966E21)
            if (r5 == r6) goto L_0x037c
            r6 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r5 == r6) goto L_0x037c
            r6 = 1937011555(0x73747363, float:1.9367382E31)
            if (r5 == r6) goto L_0x037c
            r6 = 1937011578(0x7374737a, float:1.936741E31)
            if (r5 == r6) goto L_0x037c
            r6 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r5 == r6) goto L_0x037c
            r6 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r5 == r6) goto L_0x037c
            r6 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r5 == r6) goto L_0x037c
            r6 = 1953196132(0x746b6864, float:7.46037E31)
            if (r5 == r6) goto L_0x037c
            if (r5 == r4) goto L_0x037c
            r4 = 1969517665(0x75647461, float:2.8960062E32)
            if (r5 == r4) goto L_0x037c
            r4 = 1801812339(0x6b657973, float:2.7741754E26)
            if (r5 == r4) goto L_0x037c
            r4 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r5 != r4) goto L_0x034d
            goto L_0x037c
        L_0x034d:
            long r3 = r33.zzf()
            int r5 = r0.zzl
            long r5 = (long) r5
            long r10 = r3 - r5
            int r3 = r0.zzj
            r4 = 1836086884(0x6d707664, float:4.6512205E27)
            if (r3 != r4) goto L_0x0374
            com.google.android.gms.internal.ads.zzacs r3 = new com.google.android.gms.internal.ads.zzacs
            r8 = 0
            long r14 = r10 + r5
            long r12 = r0.zzk
            long r4 = r12 - r5
            r7 = r3
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r16 = r4
            r7.<init>(r8, r10, r12, r14, r16)
            r0.zzx = r3
        L_0x0374:
            r3 = 0
            r0.zzm = r3
            r3 = 1
            r0.zzi = r3
            goto L_0x0006
        L_0x037c:
            if (r3 != r9) goto L_0x0380
            r3 = 1
            goto L_0x0381
        L_0x0380:
            r3 = 0
        L_0x0381:
            com.google.android.gms.internal.ads.zzcw.zzf(r3)
            long r3 = r0.zzk
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x038f
            r3 = 1
            goto L_0x0390
        L_0x038f:
            r3 = 0
        L_0x0390:
            com.google.android.gms.internal.ads.zzcw.zzf(r3)
            com.google.android.gms.internal.ads.zzdy r3 = new com.google.android.gms.internal.ads.zzdy
            long r4 = r0.zzk
            int r4 = (int) r4
            r3.<init>((int) r4)
            com.google.android.gms.internal.ads.zzdy r4 = r0.zze
            byte[] r4 = r4.zzH()
            byte[] r5 = r3.zzH()
            r6 = 0
            java.lang.System.arraycopy(r4, r6, r5, r6, r9)
            r0.zzm = r3
            r3 = 1
            r0.zzi = r3
            goto L_0x0006
        L_0x03b0:
            long r3 = r33.zzf()
            long r5 = r0.zzk
            int r8 = r0.zzl
            long r10 = (long) r8
            long r3 = r3 + r5
            long r3 = r3 - r10
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x03e3
            int r5 = r0.zzj
            if (r5 != r7) goto L_0x03e3
            com.google.android.gms.internal.ads.zzdy r5 = r0.zzd
            r5.zzC(r9)
            com.google.android.gms.internal.ads.zzdy r5 = r0.zzd
            byte[] r5 = r5.zzH()
            r6 = 0
            r1.zzh(r5, r6, r9)
            com.google.android.gms.internal.ads.zzdy r5 = r0.zzd
            com.google.android.gms.internal.ads.zzaed.zzd(r5)
            com.google.android.gms.internal.ads.zzdy r5 = r0.zzd
            int r5 = r5.zzc()
            r1.zzk(r5)
            r33.zzj()
        L_0x03e3:
            java.util.ArrayDeque r5 = r0.zzf
            com.google.android.gms.internal.ads.zzadu r6 = new com.google.android.gms.internal.ads.zzadu
            int r7 = r0.zzj
            r6.<init>(r7, r3)
            r5.push(r6)
            long r5 = r0.zzk
            int r7 = r0.zzl
            long r7 = (long) r7
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x03fd
            r0.zzl(r3)
            goto L_0x0006
        L_0x03fd:
            r32.zzk()
            goto L_0x0006
        L_0x0402:
            java.lang.String r1 = "Atom size less than header length (unsupported)."
            com.google.android.gms.internal.ads.zzbp r1 = com.google.android.gms.internal.ads.zzbp.zzc(r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaeo.zza(com.google.android.gms.internal.ads.zzyt, com.google.android.gms.internal.ads.zzzs):int");
    }
}
