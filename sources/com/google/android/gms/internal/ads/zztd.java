package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zztd implements zzrz, zzyv, zzwc, zzwh, zztp {
    /* access modifiers changed from: private */
    public static final Map zzb;
    /* access modifiers changed from: private */
    public static final zzad zzc;
    private boolean zzA;
    private int zzB;
    private boolean zzC;
    private boolean zzD;
    private int zzE;
    private long zzF;
    private long zzG;
    private long zzH;
    private boolean zzI;
    private int zzJ;
    private boolean zzK;
    private boolean zzL;
    private final zzwa zzM;
    private final zzvw zzN;
    private final Uri zzd;
    private final zzer zze;
    private final zzpj zzf;
    private final zzsk zzg;
    private final zzpd zzh;
    private final zzsz zzi;
    /* access modifiers changed from: private */
    public final long zzj;
    private final zzwk zzk = new zzwk("ProgressiveMediaPeriod");
    private final zzsu zzl;
    private final zzcz zzm;
    private final Runnable zzn;
    /* access modifiers changed from: private */
    public final Runnable zzo;
    /* access modifiers changed from: private */
    public final Handler zzp;
    private zzry zzq;
    /* access modifiers changed from: private */
    public zzabl zzr;
    private zztq[] zzs;
    private zztb[] zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private zztc zzx;
    private zzzv zzy;
    private long zzz;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_NAME, "1");
        zzb = Collections.unmodifiableMap(hashMap);
        zzab zzab = new zzab();
        zzab.zzH("icy");
        zzab.zzS(MimeTypes.APPLICATION_ICY);
        zzc = zzab.zzY();
    }

    public zztd(Uri uri, zzer zzer, zzsu zzsu, zzpj zzpj, zzpd zzpd, zzwa zzwa, zzsk zzsk, zzsz zzsz, zzvw zzvw, String str, int i, byte[] bArr) {
        this.zzd = uri;
        this.zze = zzer;
        this.zzf = zzpj;
        this.zzh = zzpd;
        this.zzM = zzwa;
        this.zzg = zzsk;
        this.zzi = zzsz;
        this.zzN = zzvw;
        this.zzj = (long) i;
        this.zzl = zzsu;
        this.zzm = new zzcz(zzcx.zza);
        this.zzn = new zzsv(this);
        this.zzo = new zzsw(this);
        this.zzp = zzeg.zzC((Handler.Callback) null);
        this.zzt = new zztb[0];
        this.zzs = new zztq[0];
        this.zzH = -9223372036854775807L;
        this.zzF = -1;
        this.zzz = -9223372036854775807L;
        this.zzB = 1;
    }

    private final int zzN() {
        int i = 0;
        for (zztq zzc2 : this.zzs) {
            i += zzc2.zzc();
        }
        return i;
    }

    /* access modifiers changed from: private */
    public final long zzO() {
        long j = Long.MIN_VALUE;
        for (zztq zzg2 : this.zzs) {
            j = Math.max(j, zzg2.zzg());
        }
        return j;
    }

    private final zzzz zzP(zztb zztb) {
        int length = this.zzs.length;
        for (int i = 0; i < length; i++) {
            if (zztb.equals(this.zzt[i])) {
                return this.zzs[i];
            }
        }
        zzvw zzvw = this.zzN;
        zzpj zzpj = this.zzf;
        zzpd zzpd = this.zzh;
        if (zzpj != null) {
            zztq zztq = new zztq(zzvw, zzpj, zzpd, (byte[]) null);
            zztq.zzu(this);
            int i2 = length + 1;
            zztb[] zztbArr = (zztb[]) Arrays.copyOf(this.zzt, i2);
            zztbArr[length] = zztb;
            this.zzt = (zztb[]) zzeg.zzab(zztbArr);
            zztq[] zztqArr = (zztq[]) Arrays.copyOf(this.zzs, i2);
            zztqArr[length] = zztq;
            this.zzs = (zztq[]) zzeg.zzab(zztqArr);
            return zztq;
        }
        throw null;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private final void zzQ() {
        zzcw.zzf(this.zzv);
        if (this.zzx == null) {
            throw null;
        } else if (this.zzy == null) {
            throw null;
        }
    }

    private final void zzR(zzsy zzsy) {
        if (this.zzF == -1) {
            this.zzF = zzsy.zzm;
        }
    }

    /* access modifiers changed from: private */
    public final void zzS() {
        int i;
        zzbl zzbl;
        if (!this.zzL && !this.zzv && this.zzu && this.zzy != null) {
            zztq[] zztqArr = this.zzs;
            int length = zztqArr.length;
            int i2 = 0;
            while (i2 < length) {
                if (zztqArr[i2].zzh() != null) {
                    i2++;
                } else {
                    return;
                }
            }
            this.zzm.zzc();
            int length2 = this.zzs.length;
            zzck[] zzckArr = new zzck[length2];
            boolean[] zArr = new boolean[length2];
            int i3 = 0;
            while (i3 < length2) {
                zzad zzh2 = this.zzs[i3].zzh();
                if (zzh2 != null) {
                    String str = zzh2.zzm;
                    boolean zzg2 = zzbo.zzg(str);
                    boolean z = zzg2 || zzbo.zzh(str);
                    zArr[i3] = z;
                    this.zzw = z | this.zzw;
                    zzabl zzabl = this.zzr;
                    if (zzabl != null) {
                        if (zzg2 || this.zzt[i3].zzb) {
                            zzbl zzbl2 = zzh2.zzk;
                            if (zzbl2 == null) {
                                zzbl = new zzbl(zzabl);
                            } else {
                                zzbl = zzbl2.zzc(zzabl);
                            }
                            zzab zzb2 = zzh2.zzb();
                            zzb2.zzM(zzbl);
                            zzh2 = zzb2.zzY();
                        }
                        if (zzg2 && zzh2.zzg == -1 && zzh2.zzh == -1 && (i = zzabl.zza) != -1) {
                            zzab zzb3 = zzh2.zzb();
                            zzb3.zzv(i);
                            zzh2 = zzb3.zzY();
                        }
                    }
                    zzckArr[i3] = new zzck(Integer.toString(i3), zzh2.zzc(this.zzf.zza(zzh2)));
                    i3++;
                } else {
                    throw null;
                }
            }
            this.zzx = new zztc(new zztz(zzckArr), zArr);
            this.zzv = true;
            zzry zzry = this.zzq;
            if (zzry != null) {
                zzry.zzi(this);
                return;
            }
            throw null;
        }
    }

    private final void zzT(int i) {
        zzQ();
        zztc zztc = this.zzx;
        boolean[] zArr = zztc.zzd;
        if (!zArr[i]) {
            zzad zzb2 = zztc.zza.zzb(i).zzb(0);
            this.zzg.zzd(zzbo.zzb(zzb2.zzm), zzb2, 0, (Object) null, this.zzG);
            zArr[i] = true;
        }
    }

    private final void zzU(int i) {
        zzQ();
        boolean[] zArr = this.zzx.zzb;
        if (this.zzI && zArr[i] && !this.zzs[i].zzx(false)) {
            this.zzH = 0;
            this.zzI = false;
            this.zzD = true;
            this.zzG = 0;
            this.zzJ = 0;
            for (zztq zzp2 : this.zzs) {
                zzp2.zzp(false);
            }
            zzry zzry = this.zzq;
            if (zzry != null) {
                zzry.zzg(this);
                return;
            }
            throw null;
        }
    }

    private final void zzV() {
        zzsy zzsy = new zzsy(this, this.zzd, this.zze, this.zzl, this, this.zzm);
        if (this.zzv) {
            zzcw.zzf(zzW());
            long j = this.zzz;
            if (j == -9223372036854775807L || this.zzH <= j) {
                zzzv zzzv = this.zzy;
                if (zzzv != null) {
                    zzsy.zzg(zzsy, zzzv.zzg(this.zzH).zza.zzc, this.zzH);
                    for (zztq zzt2 : this.zzs) {
                        zzt2.zzt(this.zzH);
                    }
                    this.zzH = -9223372036854775807L;
                } else {
                    throw null;
                }
            } else {
                this.zzK = true;
                this.zzH = -9223372036854775807L;
                return;
            }
        }
        this.zzJ = zzN();
        long zza = this.zzk.zza(zzsy, this, zzwa.zza(this.zzB));
        zzew zze2 = zzsy.zzl;
        this.zzg.zzl(new zzrs(zzsy.zzb, zze2, zze2.zza, Collections.emptyMap(), zza, 0, 0), 1, -1, (zzad) null, 0, (Object) null, zzsy.zzk, this.zzz);
    }

    private final boolean zzW() {
        return this.zzH != -9223372036854775807L;
    }

    private final boolean zzX() {
        return this.zzD || zzW();
    }

    public final void zzB() {
        this.zzu = true;
        this.zzp.post(this.zzn);
    }

    /* access modifiers changed from: package-private */
    public final void zzE() throws IOException {
        this.zzk.zzi(zzwa.zza(this.zzB));
    }

    /* access modifiers changed from: package-private */
    public final void zzF(int i) throws IOException {
        this.zzs[i].zzm();
        zzE();
    }

    public final /* bridge */ /* synthetic */ void zzG(zzwg zzwg, long j, long j2, boolean z) {
        zzsy zzsy = (zzsy) zzwg;
        zzfs zzf2 = zzsy.zzd;
        zzrs zzrs = new zzrs(zzsy.zzb, zzsy.zzl, zzf2.zzh(), zzf2.zzi(), j, j2, zzf2.zzg());
        long unused = zzsy.zzb;
        this.zzg.zzf(zzrs, 1, -1, (zzad) null, 0, (Object) null, zzsy.zzk, this.zzz);
        if (!z) {
            zzR(zzsy);
            for (zztq zzp2 : this.zzs) {
                zzp2.zzp(false);
            }
            if (this.zzE > 0) {
                zzry zzry = this.zzq;
                if (zzry != null) {
                    zzry.zzg(this);
                    return;
                }
                throw null;
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzH(zzwg zzwg, long j, long j2) {
        zzzv zzzv;
        if (this.zzz == -9223372036854775807L && (zzzv = this.zzy) != null) {
            boolean zzh2 = zzzv.zzh();
            long zzO = zzO();
            long j3 = zzO == Long.MIN_VALUE ? 0 : zzO + 10000;
            this.zzz = j3;
            this.zzi.zza(j3, zzh2, this.zzA);
        }
        zzsy zzsy = (zzsy) zzwg;
        zzfs zzf2 = zzsy.zzd;
        zzrs zzrs = new zzrs(zzsy.zzb, zzsy.zzl, zzf2.zzh(), zzf2.zzi(), j, j2, zzf2.zzg());
        long unused = zzsy.zzb;
        this.zzg.zzh(zzrs, 1, -1, (zzad) null, 0, (Object) null, zzsy.zzk, this.zzz);
        zzR(zzsy);
        this.zzK = true;
        zzry zzry = this.zzq;
        if (zzry != null) {
            zzry.zzg(this);
            return;
        }
        throw null;
    }

    public final void zzI() {
        for (zztq zzo2 : this.zzs) {
            zzo2.zzo();
        }
        this.zzl.zze();
    }

    public final void zzJ(zzad zzad) {
        this.zzp.post(this.zzn);
    }

    public final void zzK() {
        if (this.zzv) {
            for (zztq zzn2 : this.zzs) {
                zzn2.zzn();
            }
        }
        this.zzk.zzj(this);
        this.zzp.removeCallbacksAndMessages((Object) null);
        this.zzq = null;
        this.zzL = true;
    }

    public final void zzL(zzzv zzzv) {
        this.zzp.post(new zzsx(this, zzzv));
    }

    /* access modifiers changed from: package-private */
    public final boolean zzM(int i) {
        return !zzX() && this.zzs[i].zzx(this.zzK);
    }

    public final long zza(long j, zzjx zzjx) {
        long j2;
        long j3 = j;
        zzjx zzjx2 = zzjx;
        zzQ();
        if (!this.zzy.zzh()) {
            return 0;
        }
        zzzt zzg2 = this.zzy.zzg(j3);
        long j4 = zzg2.zza.zzb;
        long j5 = zzg2.zzb.zzb;
        long j6 = zzjx2.zzf;
        if (j6 != 0) {
            j2 = j6;
        } else if (zzjx2.zzg == 0) {
            return j3;
        } else {
            j2 = 0;
        }
        long j7 = j;
        long zzx2 = zzeg.zzx(j7, j2, Long.MIN_VALUE);
        long zzq2 = zzeg.zzq(j7, zzjx2.zzg, Long.MAX_VALUE);
        boolean z = true;
        boolean z2 = zzx2 <= j4 && j4 <= zzq2;
        if (zzx2 > j5 || j5 > zzq2) {
            z = false;
        }
        if (!z2 || !z) {
            if (!z2) {
                return z ? j5 : zzx2;
            }
        } else if (Math.abs(j4 - j3) > Math.abs(j5 - j3)) {
            return j5;
        }
        return j4;
    }

    public final long zzb() {
        long j;
        zzQ();
        boolean[] zArr = this.zzx.zzb;
        if (this.zzK) {
            return Long.MIN_VALUE;
        }
        if (zzW()) {
            return this.zzH;
        }
        if (this.zzw) {
            int length = this.zzs.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i] && !this.zzs[i].zzw()) {
                    j = Math.min(j, this.zzs[i].zzg());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = zzO();
        }
        return j == Long.MIN_VALUE ? this.zzG : j;
    }

    public final long zzc() {
        if (this.zzE == 0) {
            return Long.MIN_VALUE;
        }
        return zzb();
    }

    public final long zzd() {
        if (!this.zzD) {
            return -9223372036854775807L;
        }
        if (!this.zzK && zzN() <= this.zzJ) {
            return -9223372036854775807L;
        }
        this.zzD = false;
        return this.zzG;
    }

    public final long zze(long j) {
        zzQ();
        boolean[] zArr = this.zzx.zzb;
        if (true != this.zzy.zzh()) {
            j = 0;
        }
        this.zzD = false;
        this.zzG = j;
        if (zzW()) {
            this.zzH = j;
            return j;
        }
        if (this.zzB != 7) {
            int length = this.zzs.length;
            int i = 0;
            while (i < length) {
                if (this.zzs[i].zzy(j, false) || (!zArr[i] && this.zzw)) {
                    i++;
                }
            }
            return j;
        }
        this.zzI = false;
        this.zzH = j;
        this.zzK = false;
        zzwk zzwk = this.zzk;
        if (zzwk.zzl()) {
            for (zztq zzj2 : this.zzs) {
                zzj2.zzj();
            }
            this.zzk.zzg();
        } else {
            zzwk.zzh();
            for (zztq zzp2 : this.zzs) {
                zzp2.zzp(false);
            }
        }
        return j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long zzf(com.google.android.gms.internal.ads.zzvh[] r8, boolean[] r9, com.google.android.gms.internal.ads.zztr[] r10, boolean[] r11, long r12) {
        /*
            r7 = this;
            r7.zzQ()
            com.google.android.gms.internal.ads.zztc r0 = r7.zzx
            com.google.android.gms.internal.ads.zztz r1 = r0.zza
            boolean[] r0 = r0.zzc
            int r2 = r7.zzE
            r3 = 0
            r4 = r3
        L_0x000d:
            int r5 = r8.length
            if (r4 >= r5) goto L_0x0035
            r5 = r10[r4]
            if (r5 == 0) goto L_0x0032
            r6 = r8[r4]
            if (r6 == 0) goto L_0x001c
            boolean r6 = r9[r4]
            if (r6 != 0) goto L_0x0032
        L_0x001c:
            com.google.android.gms.internal.ads.zzta r5 = (com.google.android.gms.internal.ads.zzta) r5
            int r5 = r5.zzb
            boolean r6 = r0[r5]
            com.google.android.gms.internal.ads.zzcw.zzf(r6)
            int r6 = r7.zzE
            int r6 = r6 + -1
            r7.zzE = r6
            r0[r5] = r3
            r5 = 0
            r10[r4] = r5
        L_0x0032:
            int r4 = r4 + 1
            goto L_0x000d
        L_0x0035:
            boolean r9 = r7.zzC
            r4 = 0
            r6 = 1
            if (r9 == 0) goto L_0x0041
            if (r2 != 0) goto L_0x003f
            goto L_0x0045
        L_0x003f:
            r9 = r3
            goto L_0x0049
        L_0x0041:
            int r9 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x0047
        L_0x0045:
            r9 = r6
            goto L_0x0049
        L_0x0047:
            r9 = r3
            r12 = r4
        L_0x0049:
            r2 = r3
        L_0x004a:
            int r4 = r8.length
            if (r2 >= r4) goto L_0x00a3
            r4 = r10[r2]
            if (r4 != 0) goto L_0x00a0
            r4 = r8[r2]
            if (r4 == 0) goto L_0x00a0
            int r5 = r4.zzc()
            if (r5 != r6) goto L_0x005d
            r5 = r6
            goto L_0x005e
        L_0x005d:
            r5 = r3
        L_0x005e:
            com.google.android.gms.internal.ads.zzcw.zzf(r5)
            int r5 = r4.zza(r3)
            if (r5 != 0) goto L_0x0069
            r5 = r6
            goto L_0x006a
        L_0x0069:
            r5 = r3
        L_0x006a:
            com.google.android.gms.internal.ads.zzcw.zzf(r5)
            com.google.android.gms.internal.ads.zzck r4 = r4.zze()
            int r4 = r1.zza(r4)
            boolean r5 = r0[r4]
            r5 = r5 ^ r6
            com.google.android.gms.internal.ads.zzcw.zzf(r5)
            int r5 = r7.zzE
            int r5 = r5 + r6
            r7.zzE = r5
            r0[r4] = r6
            com.google.android.gms.internal.ads.zzta r5 = new com.google.android.gms.internal.ads.zzta
            r5.<init>(r7, r4)
            r10[r2] = r5
            r11[r2] = r6
            if (r9 != 0) goto L_0x00a0
            com.google.android.gms.internal.ads.zztq[] r9 = r7.zzs
            r9 = r9[r4]
            boolean r4 = r9.zzy(r12, r6)
            if (r4 != 0) goto L_0x009f
            int r9 = r9.zza()
            if (r9 == 0) goto L_0x009f
            r9 = r6
            goto L_0x00a0
        L_0x009f:
            r9 = r3
        L_0x00a0:
            int r2 = r2 + 1
            goto L_0x004a
        L_0x00a3:
            int r8 = r7.zzE
            if (r8 != 0) goto L_0x00d4
            r7.zzI = r3
            r7.zzD = r3
            com.google.android.gms.internal.ads.zzwk r8 = r7.zzk
            boolean r8 = r8.zzl()
            if (r8 == 0) goto L_0x00c6
            com.google.android.gms.internal.ads.zztq[] r8 = r7.zzs
            int r9 = r8.length
        L_0x00b6:
            if (r3 >= r9) goto L_0x00c0
            r10 = r8[r3]
            r10.zzj()
            int r3 = r3 + 1
            goto L_0x00b6
        L_0x00c0:
            com.google.android.gms.internal.ads.zzwk r8 = r7.zzk
            r8.zzg()
            goto L_0x00e6
        L_0x00c6:
            com.google.android.gms.internal.ads.zztq[] r8 = r7.zzs
            int r9 = r8.length
            r10 = r3
        L_0x00ca:
            if (r10 >= r9) goto L_0x00e6
            r11 = r8[r10]
            r11.zzp(r3)
            int r10 = r10 + 1
            goto L_0x00ca
        L_0x00d4:
            if (r9 == 0) goto L_0x00e6
            long r12 = r7.zze(r12)
        L_0x00da:
            int r8 = r10.length
            if (r3 >= r8) goto L_0x00e6
            r8 = r10[r3]
            if (r8 == 0) goto L_0x00e3
            r11[r3] = r6
        L_0x00e3:
            int r3 = r3 + 1
            goto L_0x00da
        L_0x00e6:
            r7.zzC = r6
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztd.zzf(com.google.android.gms.internal.ads.zzvh[], boolean[], com.google.android.gms.internal.ads.zztr[], boolean[], long):long");
    }

    /* access modifiers changed from: package-private */
    public final int zzg(int i, zzja zzja, zzgc zzgc, int i2) {
        if (zzX()) {
            return -3;
        }
        zzT(i);
        int zzd2 = this.zzs[i].zzd(zzja, zzgc, i2, this.zzK);
        if (zzd2 == -3) {
            zzU(i);
        }
        return zzd2;
    }

    public final zztz zzh() {
        zzQ();
        return this.zzx.zza;
    }

    /* access modifiers changed from: package-private */
    public final int zzi(int i, long j) {
        if (zzX()) {
            return 0;
        }
        zzT(i);
        zztq zztq = this.zzs[i];
        int zzb2 = zztq.zzb(j, this.zzK);
        zztq.zzv(zzb2);
        if (zzb2 != 0) {
            return zzb2;
        }
        zzU(i);
        return 0;
    }

    public final void zzj(long j, boolean z) {
        zzQ();
        if (!zzW()) {
            boolean[] zArr = this.zzx.zzc;
            int length = this.zzs.length;
            for (int i = 0; i < length; i++) {
                this.zzs[i].zzi(j, false, zArr[i]);
            }
        }
    }

    public final void zzk() throws IOException {
        zzE();
        if (this.zzK && !this.zzv) {
            throw zzbp.zza("Loading finished before preparation is complete.", (Throwable) null);
        }
    }

    public final void zzl(zzry zzry, long j) {
        this.zzq = zzry;
        this.zzm.zze();
        zzV();
    }

    public final void zzm(long j) {
    }

    public final boolean zzo(long j) {
        if (this.zzK || this.zzk.zzk() || this.zzI) {
            return false;
        }
        if (this.zzv && this.zzE == 0) {
            return false;
        }
        boolean zze2 = this.zzm.zze();
        if (this.zzk.zzl()) {
            return zze2;
        }
        zzV();
        return true;
    }

    public final boolean zzp() {
        return this.zzk.zzl() && this.zzm.zzd();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzwe zzt(com.google.android.gms.internal.ads.zzwg r27, long r28, long r30, java.io.IOException r32, int r33) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            com.google.android.gms.internal.ads.zzsy r1 = (com.google.android.gms.internal.ads.zzsy) r1
            r0.zzR(r1)
            com.google.android.gms.internal.ads.zzfs r2 = r1.zzd
            com.google.android.gms.internal.ads.zzrs r15 = new com.google.android.gms.internal.ads.zzrs
            long r4 = r1.zzb
            com.google.android.gms.internal.ads.zzew r6 = r1.zzl
            android.net.Uri r7 = r2.zzh()
            java.util.Map r8 = r2.zzi()
            long r13 = r2.zzg()
            r3 = r15
            r9 = r28
            r11 = r30
            r3.<init>(r4, r6, r7, r8, r9, r11, r13)
            com.google.android.gms.internal.ads.zzrx r2 = new com.google.android.gms.internal.ads.zzrx
            long r3 = r1.zzk
            long r22 = com.google.android.gms.internal.ads.zzeg.zzz(r3)
            long r3 = r0.zzz
            long r24 = com.google.android.gms.internal.ads.zzeg.zzz(r3)
            r17 = 1
            r18 = -1
            r19 = 0
            r20 = 0
            r21 = 0
            r16 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r24)
            com.google.android.gms.internal.ads.zzwb r3 = new com.google.android.gms.internal.ads.zzwb
            r14 = r32
            r4 = r33
            r3.<init>(r15, r2, r14, r4)
            java.io.IOException r2 = r3.zzc
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zzbp
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 != 0) goto L_0x008d
            boolean r4 = r2 instanceof java.io.FileNotFoundException
            if (r4 != 0) goto L_0x008d
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zzfj
            if (r4 != 0) goto L_0x008d
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zzwj
            if (r4 != 0) goto L_0x008d
        L_0x006a:
            if (r2 == 0) goto L_0x007f
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zzes
            if (r4 == 0) goto L_0x007a
            r4 = r2
            com.google.android.gms.internal.ads.zzes r4 = (com.google.android.gms.internal.ads.zzes) r4
            int r4 = r4.zza
            r7 = 2008(0x7d8, float:2.814E-42)
            if (r4 != r7) goto L_0x007a
            goto L_0x008d
        L_0x007a:
            java.lang.Throwable r2 = r2.getCause()
            goto L_0x006a
        L_0x007f:
            int r2 = r3.zzd
            int r2 = r2 + -1
            int r2 = r2 * 1000
            r3 = 5000(0x1388, float:7.006E-42)
            int r2 = java.lang.Math.min(r2, r3)
            long r2 = (long) r2
            goto L_0x008e
        L_0x008d:
            r2 = r5
        L_0x008e:
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            r7 = 1
            if (r4 != 0) goto L_0x0096
            com.google.android.gms.internal.ads.zzwe r2 = com.google.android.gms.internal.ads.zzwk.zzd
            goto L_0x00e6
        L_0x0096:
            int r4 = r26.zzN()
            int r8 = r0.zzJ
            r9 = 0
            if (r4 <= r8) goto L_0x00a1
            r8 = r7
            goto L_0x00a2
        L_0x00a1:
            r8 = r9
        L_0x00a2:
            long r10 = r0.zzF
            r12 = -1
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 != 0) goto L_0x00e0
            com.google.android.gms.internal.ads.zzzv r10 = r0.zzy
            if (r10 == 0) goto L_0x00b7
            long r10 = r10.zze()
            int r5 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x00b7
            goto L_0x00e0
        L_0x00b7:
            boolean r4 = r0.zzv
            if (r4 == 0) goto L_0x00c6
            boolean r5 = r26.zzX()
            if (r5 != 0) goto L_0x00c6
            r0.zzI = r7
            com.google.android.gms.internal.ads.zzwe r2 = com.google.android.gms.internal.ads.zzwk.zzc
            goto L_0x00e6
        L_0x00c6:
            r0.zzD = r4
            r4 = 0
            r0.zzG = r4
            r0.zzJ = r9
            com.google.android.gms.internal.ads.zztq[] r6 = r0.zzs
            int r10 = r6.length
            r11 = r9
        L_0x00d2:
            if (r11 >= r10) goto L_0x00dc
            r12 = r6[r11]
            r12.zzp(r9)
            int r11 = r11 + 1
            goto L_0x00d2
        L_0x00dc:
            com.google.android.gms.internal.ads.zzsy.zzg(r1, r4, r4)
            goto L_0x00e2
        L_0x00e0:
            r0.zzJ = r4
        L_0x00e2:
            com.google.android.gms.internal.ads.zzwe r2 = com.google.android.gms.internal.ads.zzwk.zzb(r8, r2)
        L_0x00e6:
            boolean r3 = r2.zzc()
            r16 = r3 ^ 1
            com.google.android.gms.internal.ads.zzsk r3 = r0.zzg
            r5 = 1
            r6 = -1
            r7 = 0
            r8 = 0
            r9 = 0
            long r10 = r1.zzk
            long r12 = r0.zzz
            r4 = r15
            r14 = r32
            r15 = r16
            r3.zzj(r4, r5, r6, r7, r8, r9, r10, r12, r14, r15)
            if (r16 == 0) goto L_0x0106
            long unused = r1.zzb
        L_0x0106:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztd.zzt(com.google.android.gms.internal.ads.zzwg, long, long, java.io.IOException, int):com.google.android.gms.internal.ads.zzwe");
    }

    /* access modifiers changed from: package-private */
    public final zzzz zzu() {
        return zzP(new zztb(0, true));
    }

    public final zzzz zzv(int i, int i2) {
        return zzP(new zztb(i, false));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzC() {
        if (!this.zzL) {
            zzry zzry = this.zzq;
            if (zzry != null) {
                zzry.zzg(this);
                return;
            }
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzD(zzzv zzzv) {
        zzzv zzzv2;
        if (this.zzr == null) {
            zzzv2 = zzzv;
        } else {
            zzzv2 = new zzzu(-9223372036854775807L, 0);
        }
        this.zzy = zzzv2;
        this.zzz = zzzv.zze();
        boolean z = false;
        int i = 1;
        if (this.zzF == -1 && zzzv.zze() == -9223372036854775807L) {
            z = true;
        }
        this.zzA = z;
        if (true == z) {
            i = 7;
        }
        this.zzB = i;
        this.zzi.zza(this.zzz, zzzv.zzh(), this.zzA);
        if (!this.zzv) {
            zzS();
        }
    }
}
