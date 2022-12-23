package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzazw extends zzavq {
    private int zzA;
    private final Context zzb;
    private final zzazy zzc;
    private final zzbag zzd;
    private final boolean zze;
    private final long[] zzf;
    private zzars[] zzg;
    private zzazv zzh;
    private Surface zzi;
    private Surface zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private float zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private float zzu;
    private int zzv;
    private int zzw;
    private int zzx;
    private float zzy;
    private long zzz;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzazw(Context context, zzavs zzavs, long j, Handler handler, zzbah zzbah, int i) {
        super(2, zzavs, (zzats) null, false);
        boolean z = false;
        this.zzb = context.getApplicationContext();
        this.zzc = new zzazy(context);
        this.zzd = new zzbag(handler, zzbah);
        if (zzazn.zza <= 22 && "foster".equals(zzazn.zzb) && "NVIDIA".equals(zzazn.zzc)) {
            z = true;
        }
        this.zze = z;
        this.zzf = new long[10];
        this.zzz = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
        this.zzr = -1;
        this.zzs = -1;
        this.zzu = -1.0f;
        this.zzq = -1.0f;
        zzab();
    }

    private static int zzN(zzars zzars) {
        int i = zzars.zzm;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    private final void zzab() {
        this.zzv = -1;
        this.zzw = -1;
        this.zzy = -1.0f;
        this.zzx = -1;
    }

    private final void zzac() {
        if (this.zzn > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzd.zzd(this.zzn, elapsedRealtime - this.zzm);
            this.zzn = 0;
            this.zzm = elapsedRealtime;
        }
    }

    private final void zzad() {
        int i = this.zzv;
        int i2 = this.zzr;
        if (i != i2 || this.zzw != this.zzs || this.zzx != this.zzt || this.zzy != this.zzu) {
            this.zzd.zzh(i2, this.zzs, this.zzt, this.zzu);
            this.zzv = this.zzr;
            this.zzw = this.zzs;
            this.zzx = this.zzt;
            this.zzy = this.zzu;
        }
    }

    private final void zzae() {
        if (this.zzv != -1 || this.zzw != -1) {
            this.zzd.zzh(this.zzr, this.zzs, this.zzt, this.zzu);
        }
    }

    private static boolean zzaf(long j) {
        return j < -30000;
    }

    private final boolean zzag(boolean z) {
        if (zzazn.zza < 23 || (z && !zzazt.zzb(this.zzb))) {
            return false;
        }
        return true;
    }

    public final boolean zzF() {
        Surface surface;
        if (super.zzF() && (this.zzk || (((surface = this.zzj) != null && this.zzi == surface) || zzU() == null))) {
            this.zzl = -9223372036854775807L;
            return true;
        } else if (this.zzl == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.zzl) {
                return true;
            }
            this.zzl = -9223372036854775807L;
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final int zzH(zzavs zzavs, zzars zzars) throws zzavv {
        boolean z;
        String str = zzars.zzf;
        int i = 0;
        if (!zzazd.zzb(str)) {
            return 0;
        }
        zzatr zzatr = zzars.zzi;
        if (zzatr != null) {
            z = false;
            for (int i2 = 0; i2 < zzatr.zza; i2++) {
                z |= zzatr.zza(i2).zzc;
            }
        } else {
            z = false;
        }
        zzavo zzc2 = zzawa.zzc(str, z);
        if (zzc2 == null) {
            return 1;
        }
        boolean zze2 = zzc2.zze(zzars.zzc);
        if (zze2 && zzars.zzj > 0 && zzars.zzk > 0) {
            if (zzazn.zza >= 21) {
                zze2 = zzc2.zzf(zzars.zzj, zzars.zzk, (double) zzars.zzl);
            } else {
                zze2 = zzars.zzj * zzars.zzk <= zzawa.zza();
                if (!zze2) {
                    Log.d("MediaCodecVideoRenderer", "FalseCheck [legacyFrameSize, " + zzars.zzj + "x" + zzars.zzk + "] [" + zzazn.zze + "]");
                }
            }
        }
        int i3 = true != zzc2.zzb ? 4 : 8;
        if (true == zzc2.zzc) {
            i = 16;
        }
        return (true != zze2 ? 2 : 3) | i3 | i;
    }

    /* access modifiers changed from: package-private */
    public final void zzI() {
        if (!this.zzk) {
            this.zzk = true;
            this.zzd.zzg(this.zzi);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzJ(MediaCodec mediaCodec, int i, long j) {
        zzad();
        zzazl.zza("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        zzazl.zzb();
        this.zza.zzd++;
        this.zzo = 0;
        zzI();
    }

    /* access modifiers changed from: protected */
    public final void zzK(MediaCodec mediaCodec, int i, long j, long j2) {
        zzad();
        zzazl.zza("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        zzazl.zzb();
        this.zza.zzd++;
        this.zzo = 0;
        zzI();
    }

    /* access modifiers changed from: protected */
    public final void zzL(MediaCodec mediaCodec, int i, long j) {
        zzazl.zza("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        zzazl.zzb();
        this.zza.zze++;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzO(com.google.android.gms.internal.ads.zzavo r12, android.media.MediaCodec r13, com.google.android.gms.internal.ads.zzars r14, android.media.MediaCrypto r15) throws com.google.android.gms.internal.ads.zzavv {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.zzars[] r15 = r11.zzg
            int r0 = r14.zzj
            int r1 = r14.zzk
            int r2 = r14.zzg
            r3 = 0
            r4 = -1
            if (r2 != r4) goto L_0x008f
            java.lang.String r2 = r14.zzf
            if (r0 == r4) goto L_0x008e
            if (r1 != r4) goto L_0x0014
            goto L_0x008e
        L_0x0014:
            int r5 = r2.hashCode()
            r6 = 5
            r7 = 1
            r8 = 4
            r9 = 3
            r10 = 2
            switch(r5) {
                case -1664118616: goto L_0x0053;
                case -1662541442: goto L_0x0049;
                case 1187890754: goto L_0x003f;
                case 1331836730: goto L_0x0035;
                case 1599127256: goto L_0x002b;
                case 1599127257: goto L_0x0021;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x005d
        L_0x0021:
            java.lang.String r5 = "video/x-vnd.on2.vp9"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x005d
            r2 = r6
            goto L_0x005e
        L_0x002b:
            java.lang.String r5 = "video/x-vnd.on2.vp8"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x005d
            r2 = r9
            goto L_0x005e
        L_0x0035:
            java.lang.String r5 = "video/avc"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x005d
            r2 = r10
            goto L_0x005e
        L_0x003f:
            java.lang.String r5 = "video/mp4v-es"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x005d
            r2 = r7
            goto L_0x005e
        L_0x0049:
            java.lang.String r5 = "video/hevc"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x005d
            r2 = r8
            goto L_0x005e
        L_0x0053:
            java.lang.String r5 = "video/3gpp"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x005d
            r2 = r3
            goto L_0x005e
        L_0x005d:
            r2 = r4
        L_0x005e:
            if (r2 == 0) goto L_0x0087
            if (r2 == r7) goto L_0x0087
            if (r2 == r10) goto L_0x006e
            if (r2 == r9) goto L_0x0087
            if (r2 == r8) goto L_0x006b
            if (r2 == r6) goto L_0x006b
            goto L_0x008e
        L_0x006b:
            int r2 = r0 * r1
            goto L_0x008a
        L_0x006e:
            java.lang.String r2 = com.google.android.gms.internal.ads.zzazn.zzd
            java.lang.String r5 = "BRAVIA 4K 2015"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0079
            goto L_0x008e
        L_0x0079:
            r2 = 16
            int r5 = com.google.android.gms.internal.ads.zzazn.zzd(r0, r2)
            int r2 = com.google.android.gms.internal.ads.zzazn.zzd(r1, r2)
            int r5 = r5 * r2
            int r2 = r5 * 256
            goto L_0x0089
        L_0x0087:
            int r2 = r0 * r1
        L_0x0089:
            r8 = r10
        L_0x008a:
            int r2 = r2 * r9
            int r8 = r8 + r8
            int r2 = r2 / r8
            goto L_0x008f
        L_0x008e:
            r2 = r4
        L_0x008f:
            int r15 = r15.length
            com.google.android.gms.internal.ads.zzazv r15 = new com.google.android.gms.internal.ads.zzazv
            r15.<init>(r0, r1, r2)
            r11.zzh = r15
            boolean r0 = r11.zze
            android.media.MediaFormat r14 = r14.zzb()
            int r1 = r15.zza
            java.lang.String r2 = "max-width"
            r14.setInteger(r2, r1)
            int r1 = r15.zzb
            java.lang.String r2 = "max-height"
            r14.setInteger(r2, r1)
            int r15 = r15.zzc
            if (r15 == r4) goto L_0x00b4
            java.lang.String r1 = "max-input-size"
            r14.setInteger(r1, r15)
        L_0x00b4:
            if (r0 == 0) goto L_0x00bb
            java.lang.String r15 = "auto-frc"
            r14.setInteger(r15, r3)
        L_0x00bb:
            android.view.Surface r15 = r11.zzi
            if (r15 != 0) goto L_0x00da
            boolean r15 = r12.zzd
            boolean r15 = r11.zzag(r15)
            com.google.android.gms.internal.ads.zzayy.zze(r15)
            android.view.Surface r15 = r11.zzj
            if (r15 != 0) goto L_0x00d6
            android.content.Context r15 = r11.zzb
            boolean r12 = r12.zzd
            com.google.android.gms.internal.ads.zzazt r12 = com.google.android.gms.internal.ads.zzazt.zza(r15, r12)
            r11.zzj = r12
        L_0x00d6:
            android.view.Surface r12 = r11.zzj
            r11.zzi = r12
        L_0x00da:
            android.view.Surface r12 = r11.zzi
            r15 = 0
            r13.configure(r14, r12, r15, r3)
            int r12 = com.google.android.gms.internal.ads.zzazn.zza
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzazw.zzO(com.google.android.gms.internal.ads.zzavo, android.media.MediaCodec, com.google.android.gms.internal.ads.zzars, android.media.MediaCrypto):void");
    }

    /* access modifiers changed from: protected */
    public final void zzP(String str, long j, long j2) {
        this.zzd.zzb(str, j, j2);
    }

    /* access modifiers changed from: protected */
    public final void zzQ(zzars zzars) throws zzare {
        super.zzQ(zzars);
        this.zzd.zzf(zzars);
        float f = zzars.zzn;
        if (f == -1.0f) {
            f = 1.0f;
        }
        this.zzq = f;
        this.zzp = zzN(zzars);
    }

    /* access modifiers changed from: protected */
    public final void zzR(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int i2;
        boolean z = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z = true;
        }
        if (z) {
            i = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            i = mediaFormat.getInteger("width");
        }
        this.zzr = i;
        if (z) {
            i2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            i2 = mediaFormat.getInteger("height");
        }
        this.zzs = i2;
        this.zzu = this.zzq;
        if (zzazn.zza >= 21) {
            int i3 = this.zzp;
            if (i3 == 90 || i3 == 270) {
                int i4 = this.zzr;
                this.zzr = this.zzs;
                this.zzs = i4;
                this.zzu = 1.0f / this.zzu;
            }
        } else {
            this.zzt = this.zzp;
        }
        mediaCodec.setVideoScalingMode(1);
    }

    /* access modifiers changed from: protected */
    public final boolean zzT(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        MediaCodec mediaCodec2 = mediaCodec;
        int i3 = i;
        long j4 = j3;
        while (true) {
            int i4 = this.zzA;
            if (i4 == 0) {
                break;
            }
            long[] jArr = this.zzf;
            long j5 = jArr[0];
            if (j4 < j5) {
                break;
            }
            this.zzz = j5;
            int i5 = i4 - 1;
            this.zzA = i5;
            System.arraycopy(jArr, 1, jArr, 0, i5);
        }
        long j6 = j4 - this.zzz;
        if (z) {
            zzL(mediaCodec2, i3, j6);
            return true;
        }
        long j7 = j4 - j;
        if (this.zzi == this.zzj) {
            if (!zzaf(j7)) {
                return false;
            }
            zzL(mediaCodec2, i3, j6);
            return true;
        } else if (!this.zzk) {
            if (zzazn.zza >= 21) {
                zzK(mediaCodec, i, j6, System.nanoTime());
            } else {
                zzJ(mediaCodec2, i3, j6);
            }
            return true;
        } else if (zzb() != 2) {
            return false;
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long nanoTime = System.nanoTime();
            long zza = this.zzc.zza(j4, ((j7 - ((elapsedRealtime * 1000) - j2)) * 1000) + nanoTime);
            long j8 = (zza - nanoTime) / 1000;
            if (zzaf(j8)) {
                zzazl.zza("dropVideoBuffer");
                mediaCodec2.releaseOutputBuffer(i3, false);
                zzazl.zzb();
                zzatm zzatm = this.zza;
                zzatm.zzf++;
                this.zzn++;
                int i6 = this.zzo + 1;
                this.zzo = i6;
                zzatm.zzg = Math.max(i6, zzatm.zzg);
                if (this.zzn == -1) {
                    zzac();
                }
                return true;
            }
            if (zzazn.zza >= 21) {
                if (j8 < 50000) {
                    zzK(mediaCodec, i, j6, zza);
                    return true;
                }
            } else if (j8 < 30000) {
                if (j8 > 11000) {
                    try {
                        Thread.sleep((j8 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                zzJ(mediaCodec2, i3, j6);
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzX(zzatn zzatn) {
        int i = zzazn.zza;
    }

    /* access modifiers changed from: protected */
    public final void zzY() {
        try {
            super.zzY();
        } finally {
            Surface surface = this.zzj;
            if (surface != null) {
                if (this.zzi == surface) {
                    this.zzi = null;
                }
                surface.release();
                this.zzj = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zzZ(MediaCodec mediaCodec, boolean z, zzars zzars, zzars zzars2) {
        if (!zzars.zzf.equals(zzars2.zzf) || zzN(zzars) != zzN(zzars2)) {
            return false;
        }
        if (!z && (zzars.zzj != zzars2.zzj || zzars.zzk != zzars2.zzk)) {
            return false;
        }
        int i = zzars2.zzj;
        zzazv zzazv = this.zzh;
        return i <= zzazv.zza && zzars2.zzk <= zzazv.zzb && zzars2.zzg <= zzazv.zzc;
    }

    /* access modifiers changed from: protected */
    public final boolean zzaa(zzavo zzavo) {
        return this.zzi != null || zzag(zzavo.zzd);
    }

    public final void zzl(int i, Object obj) throws zzare {
        if (i == 1) {
            Surface surface = (Surface) obj;
            if (surface == null) {
                Surface surface2 = this.zzj;
                if (surface2 != null) {
                    surface = surface2;
                } else {
                    zzavo zzV = zzV();
                    if (zzV != null && zzag(zzV.zzd)) {
                        surface = zzazt.zza(this.zzb, zzV.zzd);
                        this.zzj = surface;
                    }
                }
            }
            if (this.zzi != surface) {
                this.zzi = surface;
                int zzb2 = zzb();
                if (zzb2 == 1 || zzb2 == 2) {
                    MediaCodec zzU = zzU();
                    if (zzazn.zza < 23 || zzU == null || surface == null) {
                        zzY();
                        zzW();
                    } else {
                        zzU.setOutputSurface(surface);
                    }
                }
                if (surface == null || surface == this.zzj) {
                    zzab();
                    this.zzk = false;
                    int i2 = zzazn.zza;
                    return;
                }
                zzae();
                this.zzk = false;
                int i3 = zzazn.zza;
                if (zzb2 == 2) {
                    this.zzl = -9223372036854775807L;
                }
            } else if (surface != null && surface != this.zzj) {
                zzae();
                if (this.zzk) {
                    this.zzd.zzg(this.zzi);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zzn() {
        this.zzr = -1;
        this.zzs = -1;
        this.zzu = -1.0f;
        this.zzq = -1.0f;
        this.zzz = -9223372036854775807L;
        this.zzA = 0;
        zzab();
        this.zzk = false;
        int i = zzazn.zza;
        this.zzc.zzb();
        try {
            super.zzn();
        } finally {
            this.zza.zza();
            this.zzd.zzc(this.zza);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzo(boolean z) throws zzare {
        super.zzo(z);
        int i = zzg().zzb;
        this.zzd.zze(this.zza);
        this.zzc.zzc();
    }

    /* access modifiers changed from: protected */
    public final void zzp(long j, boolean z) throws zzare {
        super.zzp(j, z);
        this.zzk = false;
        int i = zzazn.zza;
        this.zzo = 0;
        int i2 = this.zzA;
        if (i2 != 0) {
            this.zzz = this.zzf[i2 - 1];
            this.zzA = 0;
        }
        this.zzl = -9223372036854775807L;
    }

    /* access modifiers changed from: protected */
    public final void zzq() {
        this.zzn = 0;
        this.zzm = SystemClock.elapsedRealtime();
        this.zzl = -9223372036854775807L;
    }

    /* access modifiers changed from: protected */
    public final void zzr() {
        zzac();
    }

    /* access modifiers changed from: protected */
    public final void zzs(zzars[] zzarsArr, long j) throws zzare {
        this.zzg = zzarsArr;
        if (this.zzz == -9223372036854775807L) {
            this.zzz = j;
            return;
        }
        int i = this.zzA;
        if (i == 10) {
            long j2 = this.zzf[9];
            Log.w("MediaCodecVideoRenderer", "Too many stream changes, so dropping offset: " + j2);
        } else {
            this.zzA = i + 1;
        }
        this.zzf[this.zzA - 1] = j;
    }
}
