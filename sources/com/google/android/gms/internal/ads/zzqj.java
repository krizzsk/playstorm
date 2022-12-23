package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import com.google.android.exoplayer2.PlaybackException;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public abstract class zzqj extends zzgl {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, Ascii.f17948VT, -38, 37, -112, 0, 0, 1, 104, -50, Ascii.f17944SI, 19, 32, 0, 0, 1, 101, -120, -124, Ascii.f17935CR, -50, 113, Ascii.CAN, -96, 0, 47, -65, Ascii.f17938FS, 49, -61, 39, 93, 120};
    private float zzA;
    private ArrayDeque zzB;
    private zzqi zzC;
    private zzqg zzD;
    private int zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private boolean zzK;
    private boolean zzL;
    private boolean zzM;
    private boolean zzN;
    private zzpz zzO;
    private long zzP;
    private int zzQ;
    private int zzR;
    private ByteBuffer zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private boolean zzW;
    private boolean zzX;
    private boolean zzY;
    private int zzZ;
    protected zzgm zza;
    private int zzaa;
    private int zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzae;
    private long zzaf;
    private long zzag;
    private boolean zzah;
    private boolean zzai;
    private boolean zzaj;
    private long zzak;
    private long zzal;
    private int zzam;
    private zzpk zzan;
    private zzpk zzao;
    private final zzqd zzc;
    private final zzql zzd;
    private final float zze;
    private final zzgc zzf;
    private final zzgc zzg;
    private final zzgc zzh;
    private final zzpy zzi;
    private final zzed zzj;
    private final ArrayList zzk;
    private final MediaCodec.BufferInfo zzl;
    private final long[] zzm;
    private final long[] zzn;
    private final long[] zzo;
    private zzad zzp;
    private zzad zzq;
    private MediaCrypto zzr;
    private boolean zzs;
    private long zzt;
    private float zzu;
    private float zzv;
    private zzqe zzw;
    private zzad zzx;
    private MediaFormat zzy;
    private boolean zzz;

    public zzqj(int i, zzqd zzqd, zzql zzql, boolean z, float f) {
        super(i);
        this.zzc = zzqd;
        if (zzql != null) {
            this.zzd = zzql;
            this.zze = f;
            this.zzf = new zzgc(0, 0);
            this.zzg = new zzgc(0, 0);
            this.zzh = new zzgc(2, 0);
            this.zzi = new zzpy();
            this.zzj = new zzed(10);
            this.zzk = new ArrayList();
            this.zzl = new MediaCodec.BufferInfo();
            this.zzu = 1.0f;
            this.zzv = 1.0f;
            this.zzt = -9223372036854775807L;
            this.zzm = new long[10];
            this.zzn = new long[10];
            this.zzo = new long[10];
            this.zzak = -9223372036854775807L;
            this.zzal = -9223372036854775807L;
            this.zzi.zzi(0);
            this.zzi.zzb.order(ByteOrder.nativeOrder());
            this.zzA = -1.0f;
            this.zzE = 0;
            this.zzZ = 0;
            this.zzQ = -1;
            this.zzR = -1;
            this.zzP = -9223372036854775807L;
            this.zzaf = -9223372036854775807L;
            this.zzag = -9223372036854775807L;
            this.zzaa = 0;
            this.zzab = 0;
            return;
        }
        throw null;
    }

    private final void zzT() {
        this.zzX = false;
        this.zzi.zzb();
        this.zzh.zzb();
        this.zzW = false;
        this.zzV = false;
    }

    private final void zzU() throws zzgu {
        if (this.zzac) {
            this.zzaa = 1;
            this.zzab = 3;
            return;
        }
        zzap();
        zzan();
    }

    private final void zzaA() throws zzgu {
        try {
            throw null;
        } catch (MediaCryptoException e) {
            throw zzbg(e, this.zzp, false, PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR);
        }
    }

    private final boolean zzaB() throws zzgu {
        if (this.zzac) {
            this.zzaa = 1;
            if (this.zzG || this.zzI) {
                this.zzab = 3;
                return false;
            }
            this.zzab = 2;
        } else {
            zzaA();
        }
        return true;
    }

    private final boolean zzaC() throws zzgu {
        zzqe zzqe = this.zzw;
        if (zzqe == null || this.zzaa == 2 || this.zzah) {
            return false;
        }
        if (this.zzQ < 0) {
            int zza2 = zzqe.zza();
            this.zzQ = zza2;
            if (zza2 < 0) {
                return false;
            }
            this.zzg.zzb = this.zzw.zzf(zza2);
            this.zzg.zzb();
        }
        if (this.zzaa == 1) {
            if (!this.zzN) {
                this.zzad = true;
                this.zzw.zzj(this.zzQ, 0, 0, 0, 4);
                zzay();
            }
            this.zzaa = 2;
            return false;
        } else if (this.zzL) {
            this.zzL = false;
            this.zzg.zzb.put(zzb);
            this.zzw.zzj(this.zzQ, 0, 38, 0, 0);
            zzay();
            this.zzac = true;
            return true;
        } else {
            if (this.zzZ == 1) {
                for (int i = 0; i < this.zzx.zzo.size(); i++) {
                    this.zzg.zzb.put((byte[]) this.zzx.zzo.get(i));
                }
                this.zzZ = 2;
            }
            int position = this.zzg.zzb.position();
            zzja zzh2 = zzh();
            try {
                int zzbf = zzbf(zzh2, this.zzg, 0);
                if (zzG()) {
                    this.zzag = this.zzaf;
                }
                if (zzbf == -3) {
                    return false;
                }
                if (zzbf == -5) {
                    if (this.zzZ == 2) {
                        this.zzg.zzb();
                        this.zzZ = 1;
                    }
                    zzS(zzh2);
                    return true;
                }
                zzgc zzgc = this.zzg;
                if (zzgc.zzg()) {
                    if (this.zzZ == 2) {
                        zzgc.zzb();
                        this.zzZ = 1;
                    }
                    this.zzah = true;
                    if (!this.zzac) {
                        zzax();
                        return false;
                    }
                    try {
                        if (!this.zzN) {
                            this.zzad = true;
                            this.zzw.zzj(this.zzQ, 0, 0, 0, 4);
                            zzay();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e) {
                        throw zzbg(e, this.zzp, false, zzeg.zzl(e.getErrorCode()));
                    }
                } else if (this.zzac || zzgc.zzh()) {
                    boolean zzk2 = zzgc.zzk();
                    if (zzk2) {
                        zzgc.zza.zzb(position);
                    }
                    if (this.zzF && !zzk2) {
                        ByteBuffer byteBuffer = this.zzg.zzb;
                        byte[] bArr = zzzp.zza;
                        int position2 = byteBuffer.position();
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            int i4 = i2 + 1;
                            if (i4 >= position2) {
                                byteBuffer.clear();
                                break;
                            }
                            byte b = byteBuffer.get(i2) & 255;
                            if (i3 == 3) {
                                if (b == 1) {
                                    if ((byteBuffer.get(i4) & Ascii.f17947US) == 7) {
                                        ByteBuffer duplicate = byteBuffer.duplicate();
                                        duplicate.position(i2 - 3);
                                        duplicate.limit(position2);
                                        byteBuffer.position(0);
                                        byteBuffer.put(duplicate);
                                        break;
                                    }
                                    b = 1;
                                }
                            } else if (b == 0) {
                                i3++;
                            }
                            if (b != 0) {
                                i3 = 0;
                            }
                            i2 = i4;
                        }
                        if (this.zzg.zzb.position() == 0) {
                            return true;
                        }
                        this.zzF = false;
                    }
                    zzgc zzgc2 = this.zzg;
                    long j = zzgc2.zzd;
                    zzpz zzpz = this.zzO;
                    if (zzpz != null) {
                        j = zzpz.zzb(this.zzp, zzgc2);
                        this.zzaf = Math.max(this.zzaf, this.zzO.zza(this.zzp));
                    }
                    long j2 = j;
                    if (this.zzg.zzf()) {
                        this.zzk.add(Long.valueOf(j2));
                    }
                    if (this.zzaj) {
                        this.zzj.zzd(j2, this.zzp);
                        this.zzaj = false;
                    }
                    this.zzaf = Math.max(this.zzaf, j2);
                    this.zzg.zzj();
                    zzgc zzgc3 = this.zzg;
                    if (zzgc3.zze()) {
                        zzam(zzgc3);
                    }
                    zzad(this.zzg);
                    if (zzk2) {
                        try {
                            this.zzw.zzk(this.zzQ, 0, this.zzg.zza, j2, 0);
                        } catch (MediaCodec.CryptoException e2) {
                            throw zzbg(e2, this.zzp, false, zzeg.zzl(e2.getErrorCode()));
                        }
                    } else {
                        this.zzw.zzj(this.zzQ, 0, this.zzg.zzb.limit(), j2, 0);
                    }
                    zzay();
                    this.zzac = true;
                    this.zzZ = 0;
                    this.zza.zzc++;
                    return true;
                } else {
                    zzgc.zzb();
                    if (this.zzZ == 2) {
                        this.zzZ = 1;
                    }
                    return true;
                }
            } catch (zzgb e3) {
                zzX(e3);
                zzaE(0);
                zzab();
                return true;
            }
        }
    }

    private final boolean zzaD() {
        return this.zzR >= 0;
    }

    private final boolean zzaE(int i) throws zzgu {
        zzja zzh2 = zzh();
        this.zzf.zzb();
        int zzbf = zzbf(zzh2, this.zzf, i | 4);
        if (zzbf == -5) {
            zzS(zzh2);
            return true;
        } else if (zzbf != -4 || !this.zzf.zzg()) {
            return false;
        } else {
            this.zzah = true;
            zzax();
            return false;
        }
    }

    private final boolean zzaF(long j) {
        return this.zzt == -9223372036854775807L || SystemClock.elapsedRealtime() - j < this.zzt;
    }

    private final boolean zzaG(zzad zzad2) throws zzgu {
        if (!(zzeg.zza < 23 || this.zzw == null || this.zzab == 3 || zzbe() == 0)) {
            float zzP2 = zzP(this.zzv, zzad2, zzJ());
            float f = this.zzA;
            if (f == zzP2) {
                return true;
            }
            if (zzP2 == -1.0f) {
                zzU();
                return false;
            } else if (f == -1.0f && zzP2 <= this.zze) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", zzP2);
                this.zzw.zzp(bundle);
                this.zzA = zzP2;
            }
        }
        return true;
    }

    private final void zzab() {
        try {
            this.zzw.zzi();
        } finally {
            zzaq();
        }
    }

    protected static boolean zzav(zzad zzad2) {
        return zzad2.zzF == 0;
    }

    /* JADX INFO: finally extract failed */
    private final void zzaw(zzqg zzqg, MediaCrypto mediaCrypto) throws Exception {
        float f;
        zzqe zzqe;
        int i;
        boolean z;
        boolean z2;
        zzqg zzqg2 = zzqg;
        String str = zzqg2.zza;
        float f2 = -1.0f;
        if (zzeg.zza < 23) {
            f = -1.0f;
        } else {
            f = zzP(this.zzv, this.zzp, zzJ());
        }
        if (f > this.zze) {
            f2 = f;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        MediaCodec mediaCodec = null;
        zzqc zzV2 = zzV(zzqg2, this.zzp, (MediaCrypto) null, f2);
        if (zzeg.zza >= 31) {
            zzqh.zza(zzV2, zzl());
        }
        try {
            Trace.beginSection("createCodec:" + str);
            if (zzeg.zza < 23 || zzeg.zza < 31) {
                try {
                    zzqg zzqg3 = zzV2.zza;
                    if (zzqg3 != null) {
                        String str2 = zzqg3.zza;
                        Trace.beginSection("createCodec:".concat(String.valueOf(str2)));
                        MediaCodec createByCodecName = MediaCodec.createByCodecName(str2);
                        Trace.endSection();
                        try {
                            Trace.beginSection("configureCodec");
                            createByCodecName.configure(zzV2.zzb, zzV2.zzd, (MediaCrypto) null, 0);
                            Trace.endSection();
                            Trace.beginSection("startCodec");
                            createByCodecName.start();
                            Trace.endSection();
                            zzqe = new zzra(createByCodecName, (zzqz) null);
                        } catch (IOException | RuntimeException e) {
                            e = e;
                            mediaCodec = createByCodecName;
                            if (mediaCodec != null) {
                                mediaCodec.release();
                            }
                            throw e;
                        }
                    } else {
                        throw null;
                    }
                } catch (IOException | RuntimeException e2) {
                    e = e2;
                }
            } else {
                int zzb2 = zzbo.zzb(zzV2.zzc.zzm);
                Log.i("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(zzeg.zzN(zzb2)));
                zzqe = new zzpp(zzb2, false).zzc(zzV2);
            }
            this.zzw = zzqe;
            Trace.endSection();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.zzD = zzqg2;
            this.zzA = f2;
            this.zzx = this.zzp;
            if (zzeg.zza > 25 || !"OMX.Exynos.avc.dec.secure".equals(str) || (!zzeg.zzd.startsWith("SM-T585") && !zzeg.zzd.startsWith("SM-A510") && !zzeg.zzd.startsWith("SM-A520") && !zzeg.zzd.startsWith("SM-J700"))) {
                i = (zzeg.zza >= 24 || (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) || (!"flounder".equals(zzeg.zzb) && !"flounder_lte".equals(zzeg.zzb) && !"grouper".equals(zzeg.zzb) && !"tilapia".equals(zzeg.zzb))) ? 0 : 1;
            } else {
                i = 2;
            }
            this.zzE = i;
            this.zzF = zzeg.zza < 21 && this.zzx.zzo.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
            this.zzG = zzeg.zza == 19 && zzeg.zzd.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str));
            this.zzH = zzeg.zza == 29 && "c2.android.aac.decoder".equals(str);
            if ((zzeg.zza > 23 || !"OMX.google.vorbis.decoder".equals(str)) && (zzeg.zza > 19 || ((!"hb2000".equals(zzeg.zzb) && !"stvm8".equals(zzeg.zzb)) || (!"OMX.amlogic.avc.decoder.awesome".equals(str) && !"OMX.amlogic.avc.decoder.awesome.secure".equals(str))))) {
                z = false;
            } else {
                z = true;
            }
            this.zzI = z;
            this.zzJ = zzeg.zza == 21 && "OMX.google.aac.decoder".equals(str);
            this.zzK = zzeg.zza < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(zzeg.zzc) && (zzeg.zzb.startsWith("baffin") || zzeg.zzb.startsWith("grand") || zzeg.zzb.startsWith("fortuna") || zzeg.zzb.startsWith("gprimelte") || zzeg.zzb.startsWith("j2y18lte") || zzeg.zzb.startsWith("ms01"));
            String str3 = zzqg2.zza;
            if ((zzeg.zza > 25 || !"OMX.rk.video_decoder.avc".equals(str3)) && ((zzeg.zza > 29 || (!"OMX.broadcom.video_decoder.tunnel".equals(str3) && !"OMX.broadcom.video_decoder.tunnel.secure".equals(str3))) && (!"Amazon".equals(zzeg.zzc) || !"AFTS".equals(zzeg.zzd) || !zzqg2.zzf))) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.zzN = z2;
            this.zzw.zzr();
            if ("c2.android.mp3.decoder".equals(zzqg2.zza)) {
                this.zzO = new zzpz();
            }
            if (zzbe() == 2) {
                this.zzP = SystemClock.elapsedRealtime() + 1000;
            }
            this.zza.zza++;
            zzY(str, zzV2, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    private final void zzay() {
        this.zzQ = -1;
        this.zzg.zzb = null;
    }

    private final void zzaz() {
        this.zzR = -1;
        this.zzS = null;
    }

    public void zzD(float f, float f2) throws zzgu {
        this.zzu = f;
        this.zzv = f2;
        zzaG(this.zzx);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.android.gms.internal.ads.zzqj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.google.android.gms.internal.ads.zzqj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: com.google.android.gms.internal.ads.zzqj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: com.google.android.gms.internal.ads.zzqe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: com.google.android.gms.internal.ads.zzqj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: com.google.android.gms.internal.ads.zzqj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v37, resolved type: android.media.MediaFormat} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v38, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v14, resolved type: com.google.android.gms.internal.ads.zzqj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v79, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v80, resolved type: com.google.android.gms.internal.ads.zzqj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v83, resolved type: com.google.android.gms.internal.ads.zzqj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v84, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v25, resolved type: com.google.android.gms.internal.ads.zzad} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v92, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v93, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v94, resolved type: com.google.android.gms.internal.ads.zzqj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v95, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v96, resolved type: com.google.android.gms.internal.ads.zzqj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v97, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v98, resolved type: com.google.android.gms.internal.ads.zzqj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v99, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v33, resolved type: com.google.android.gms.internal.ads.zzad} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v34, resolved type: com.google.android.gms.internal.ads.zzqj} */
    /* JADX WARNING: type inference failed for: r19v0 */
    /* JADX WARNING: type inference failed for: r19v1 */
    /* JADX WARNING: type inference failed for: r19v3 */
    /* JADX WARNING: type inference failed for: r19v6 */
    /* JADX WARNING: type inference failed for: r19v16 */
    /* JADX WARNING: type inference failed for: r19v19 */
    /* JADX WARNING: type inference failed for: r19v20 */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:175|176|177|178|179|(1:181)|182|183|269|(1:203)|207|218|219) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:94|95|(1:97)(0)) */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0277, code lost:
        if (r15.zzq != null) goto L_0x0279;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x02c5, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:?, code lost:
        zzax();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x02c8, code lost:
        r15 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x02ca, code lost:
        r19 = r19;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x02cc, code lost:
        if (r15.zzai != false) goto L_0x02ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x02ce, code lost:
        zzap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x02d1, code lost:
        r1 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x02d2, code lost:
        r2 = r21;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x02d5, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x02d6, code lost:
        r2 = true;
        r19 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0346, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0347, code lost:
        r1 = r15;
        r19 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007f, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0080, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r15.zzai = true;
        r13 = false;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x012b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x012c, code lost:
        r2 = true;
        r1 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x015c, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        zzax();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0161, code lost:
        if (r15.zzai != false) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0163, code lost:
        zzap();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:175:0x02c5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:94:0x015c */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0176 A[Catch:{ IllegalStateException -> 0x036c }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01af A[Catch:{ IllegalStateException -> 0x036c }] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0326 A[Catch:{ IllegalStateException -> 0x0369 }, LOOP:2: B:85:0x0145->B:201:0x0326, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0331 A[Catch:{ IllegalStateException -> 0x0369 }, LOOP:4: B:203:0x0331->B:206:0x033b, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x032e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0325 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzL(long r24, long r26) throws com.google.android.gms.internal.ads.zzgu {
        /*
            r23 = this;
            r15 = r23
            r14 = 1
            r13 = 0
            boolean r0 = r15.zzai     // Catch:{ IllegalStateException -> 0x036c }
            if (r0 == 0) goto L_0x000c
            r23.zzae()     // Catch:{ IllegalStateException -> 0x036c }
            return
        L_0x000c:
            com.google.android.gms.internal.ads.zzad r0 = r15.zzp     // Catch:{ IllegalStateException -> 0x036c }
            r11 = 2
            if (r0 != 0) goto L_0x0019
            boolean r0 = r15.zzaE(r11)     // Catch:{ IllegalStateException -> 0x036c }
            if (r0 == 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            return
        L_0x0019:
            r23.zzan()     // Catch:{ IllegalStateException -> 0x036c }
            boolean r0 = r15.zzV     // Catch:{ IllegalStateException -> 0x036c }
            if (r0 == 0) goto L_0x0136
            java.lang.String r0 = "bypassRender"
            int r1 = com.google.android.gms.internal.ads.zzeg.zza     // Catch:{ IllegalStateException -> 0x036c }
            android.os.Trace.beginSection(r0)     // Catch:{ IllegalStateException -> 0x036c }
        L_0x0027:
            boolean r0 = r15.zzai     // Catch:{ IllegalStateException -> 0x036c }
            r0 = r0 ^ r14
            com.google.android.gms.internal.ads.zzcw.zzf(r0)     // Catch:{ IllegalStateException -> 0x036c }
            com.google.android.gms.internal.ads.zzpy r0 = r15.zzi     // Catch:{ IllegalStateException -> 0x036c }
            boolean r1 = r0.zzp()     // Catch:{ IllegalStateException -> 0x036c }
            if (r1 == 0) goto L_0x007b
            java.nio.ByteBuffer r7 = r0.zzb     // Catch:{ IllegalStateException -> 0x036c }
            int r8 = r15.zzR     // Catch:{ IllegalStateException -> 0x036c }
            int r10 = r0.zzl()     // Catch:{ IllegalStateException -> 0x036c }
            long r11 = r0.zzd     // Catch:{ IllegalStateException -> 0x036c }
            boolean r16 = r0.zzf()     // Catch:{ IllegalStateException -> 0x036c }
            r6 = 0
            r9 = 0
            boolean r0 = r0.zzg()     // Catch:{ IllegalStateException -> 0x036c }
            com.google.android.gms.internal.ads.zzad r4 = r15.zzq     // Catch:{ IllegalStateException -> 0x036c }
            r1 = r23
            r2 = r24
            r17 = r4
            r4 = r26
            r13 = r16
            r14 = r0
            r15 = r17
            boolean r0 = r1.zzaf(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x0075 }
            if (r0 == 0) goto L_0x006f
            r15 = r23
            com.google.android.gms.internal.ads.zzpy r0 = r15.zzi     // Catch:{ IllegalStateException -> 0x012f }
            long r0 = r0.zzm()     // Catch:{ IllegalStateException -> 0x012f }
            r15.zzao(r0)     // Catch:{ IllegalStateException -> 0x012f }
            com.google.android.gms.internal.ads.zzpy r0 = r15.zzi     // Catch:{ IllegalStateException -> 0x012f }
            r0.zzb()     // Catch:{ IllegalStateException -> 0x012f }
            goto L_0x007b
        L_0x006f:
            r15 = r23
            r13 = 0
            r14 = 1
            goto L_0x0122
        L_0x0075:
            r0 = move-exception
            r2 = 1
            r19 = 0
            goto L_0x02d7
        L_0x007b:
            boolean r0 = r15.zzah     // Catch:{ IllegalStateException -> 0x012f }
            if (r0 == 0) goto L_0x0085
            r14 = 1
            r15.zzai = r14     // Catch:{ IllegalStateException -> 0x012b }
            r13 = 0
            goto L_0x0122
        L_0x0085:
            r14 = 1
            boolean r0 = r15.zzW     // Catch:{ IllegalStateException -> 0x012b }
            if (r0 == 0) goto L_0x0099
            com.google.android.gms.internal.ads.zzpy r0 = r15.zzi     // Catch:{ IllegalStateException -> 0x012b }
            com.google.android.gms.internal.ads.zzgc r1 = r15.zzh     // Catch:{ IllegalStateException -> 0x012b }
            boolean r0 = r0.zzo(r1)     // Catch:{ IllegalStateException -> 0x012b }
            com.google.android.gms.internal.ads.zzcw.zzf(r0)     // Catch:{ IllegalStateException -> 0x012b }
            r13 = 0
            r15.zzW = r13     // Catch:{ IllegalStateException -> 0x036c }
            goto L_0x009a
        L_0x0099:
            r13 = 0
        L_0x009a:
            boolean r0 = r15.zzX     // Catch:{ IllegalStateException -> 0x036c }
            if (r0 == 0) goto L_0x00b2
            com.google.android.gms.internal.ads.zzpy r0 = r15.zzi     // Catch:{ IllegalStateException -> 0x036c }
            boolean r0 = r0.zzp()     // Catch:{ IllegalStateException -> 0x036c }
            if (r0 != 0) goto L_0x0027
            r23.zzT()     // Catch:{ IllegalStateException -> 0x036c }
            r15.zzX = r13     // Catch:{ IllegalStateException -> 0x036c }
            r23.zzan()     // Catch:{ IllegalStateException -> 0x036c }
            boolean r0 = r15.zzV     // Catch:{ IllegalStateException -> 0x036c }
            if (r0 == 0) goto L_0x0122
        L_0x00b2:
            boolean r0 = r15.zzah     // Catch:{ IllegalStateException -> 0x036c }
            r0 = r0 ^ r14
            com.google.android.gms.internal.ads.zzcw.zzf(r0)     // Catch:{ IllegalStateException -> 0x036c }
            com.google.android.gms.internal.ads.zzja r0 = r23.zzh()     // Catch:{ IllegalStateException -> 0x036c }
            com.google.android.gms.internal.ads.zzgc r1 = r15.zzh     // Catch:{ IllegalStateException -> 0x036c }
            r1.zzb()     // Catch:{ IllegalStateException -> 0x036c }
        L_0x00c1:
            com.google.android.gms.internal.ads.zzgc r1 = r15.zzh     // Catch:{ IllegalStateException -> 0x036c }
            r1.zzb()     // Catch:{ IllegalStateException -> 0x036c }
            com.google.android.gms.internal.ads.zzgc r1 = r15.zzh     // Catch:{ IllegalStateException -> 0x036c }
            int r1 = r15.zzbf(r0, r1, r13)     // Catch:{ IllegalStateException -> 0x036c }
            r2 = -5
            if (r1 == r2) goto L_0x0102
            r2 = -4
            if (r1 == r2) goto L_0x00d3
            goto L_0x0105
        L_0x00d3:
            com.google.android.gms.internal.ads.zzgc r1 = r15.zzh     // Catch:{ IllegalStateException -> 0x036c }
            boolean r1 = r1.zzg()     // Catch:{ IllegalStateException -> 0x036c }
            if (r1 == 0) goto L_0x00de
            r15.zzah = r14     // Catch:{ IllegalStateException -> 0x036c }
            goto L_0x0105
        L_0x00de:
            boolean r1 = r15.zzaj     // Catch:{ IllegalStateException -> 0x036c }
            if (r1 == 0) goto L_0x00f0
            com.google.android.gms.internal.ads.zzad r1 = r15.zzp     // Catch:{ IllegalStateException -> 0x036c }
            r2 = 0
            if (r1 == 0) goto L_0x00ef
            r15.zzq = r1     // Catch:{ IllegalStateException -> 0x036c }
            r15.zzaa(r1, r2)     // Catch:{ IllegalStateException -> 0x036c }
            r15.zzaj = r13     // Catch:{ IllegalStateException -> 0x036c }
            goto L_0x00f0
        L_0x00ef:
            throw r2     // Catch:{ IllegalStateException -> 0x036c }
        L_0x00f0:
            com.google.android.gms.internal.ads.zzgc r1 = r15.zzh     // Catch:{ IllegalStateException -> 0x036c }
            r1.zzj()     // Catch:{ IllegalStateException -> 0x036c }
            com.google.android.gms.internal.ads.zzpy r1 = r15.zzi     // Catch:{ IllegalStateException -> 0x036c }
            com.google.android.gms.internal.ads.zzgc r2 = r15.zzh     // Catch:{ IllegalStateException -> 0x036c }
            boolean r1 = r1.zzo(r2)     // Catch:{ IllegalStateException -> 0x036c }
            if (r1 != 0) goto L_0x00c1
            r15.zzW = r14     // Catch:{ IllegalStateException -> 0x036c }
            goto L_0x0105
        L_0x0102:
            r15.zzS(r0)     // Catch:{ IllegalStateException -> 0x036c }
        L_0x0105:
            com.google.android.gms.internal.ads.zzpy r0 = r15.zzi     // Catch:{ IllegalStateException -> 0x036c }
            boolean r1 = r0.zzp()     // Catch:{ IllegalStateException -> 0x036c }
            if (r1 == 0) goto L_0x0110
            r0.zzj()     // Catch:{ IllegalStateException -> 0x036c }
        L_0x0110:
            com.google.android.gms.internal.ads.zzpy r0 = r15.zzi     // Catch:{ IllegalStateException -> 0x036c }
            boolean r0 = r0.zzp()     // Catch:{ IllegalStateException -> 0x036c }
            if (r0 != 0) goto L_0x0027
            boolean r0 = r15.zzah     // Catch:{ IllegalStateException -> 0x036c }
            if (r0 != 0) goto L_0x0027
            boolean r0 = r15.zzX     // Catch:{ IllegalStateException -> 0x036c }
            if (r0 == 0) goto L_0x0122
            goto L_0x0027
        L_0x0122:
            android.os.Trace.endSection()     // Catch:{ IllegalStateException -> 0x036c }
            r19 = r13
            r2 = r14
            r1 = r15
            goto L_0x0361
        L_0x012b:
            r0 = move-exception
            r2 = r14
            r1 = r15
            goto L_0x0132
        L_0x012f:
            r0 = move-exception
            r1 = r15
            r2 = 1
        L_0x0132:
            r19 = 0
            goto L_0x0371
        L_0x0136:
            com.google.android.gms.internal.ads.zzqe r0 = r15.zzw     // Catch:{ IllegalStateException -> 0x036c }
            if (r0 == 0) goto L_0x034f
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0349 }
            java.lang.String r0 = "drainAndFeed"
            int r1 = com.google.android.gms.internal.ads.zzeg.zza     // Catch:{ IllegalStateException -> 0x0349 }
            android.os.Trace.beginSection(r0)     // Catch:{ IllegalStateException -> 0x0349 }
        L_0x0145:
            boolean r0 = r23.zzaD()     // Catch:{ IllegalStateException -> 0x0349 }
            if (r0 != 0) goto L_0x0282
            boolean r0 = r15.zzJ     // Catch:{ IllegalStateException -> 0x036c }
            if (r0 == 0) goto L_0x016c
            boolean r0 = r15.zzad     // Catch:{ IllegalStateException -> 0x036c }
            if (r0 == 0) goto L_0x016c
            com.google.android.gms.internal.ads.zzqe r0 = r15.zzw     // Catch:{ IllegalStateException -> 0x015c }
            android.media.MediaCodec$BufferInfo r1 = r15.zzl     // Catch:{ IllegalStateException -> 0x015c }
            int r0 = r0.zzb(r1)     // Catch:{ IllegalStateException -> 0x015c }
            goto L_0x0174
        L_0x015c:
            r23.zzax()     // Catch:{ IllegalStateException -> 0x036c }
            boolean r0 = r15.zzai     // Catch:{ IllegalStateException -> 0x036c }
            if (r0 == 0) goto L_0x0166
            r23.zzap()     // Catch:{ IllegalStateException -> 0x036c }
        L_0x0166:
            r2 = r9
            r19 = r13
            r1 = r15
            goto L_0x0331
        L_0x016c:
            com.google.android.gms.internal.ads.zzqe r0 = r15.zzw     // Catch:{ IllegalStateException -> 0x036c }
            android.media.MediaCodec$BufferInfo r1 = r15.zzl     // Catch:{ IllegalStateException -> 0x036c }
            int r0 = r0.zzb(r1)     // Catch:{ IllegalStateException -> 0x036c }
        L_0x0174:
            if (r0 >= 0) goto L_0x01af
            r1 = -2
            if (r0 != r1) goto L_0x019f
            r15.zzae = r14     // Catch:{ IllegalStateException -> 0x036c }
            com.google.android.gms.internal.ads.zzqe r0 = r15.zzw     // Catch:{ IllegalStateException -> 0x036c }
            android.media.MediaFormat r0 = r0.zzc()     // Catch:{ IllegalStateException -> 0x036c }
            int r1 = r15.zzE     // Catch:{ IllegalStateException -> 0x036c }
            if (r1 == 0) goto L_0x019a
            java.lang.String r1 = "width"
            int r1 = r0.getInteger(r1)     // Catch:{ IllegalStateException -> 0x036c }
            r2 = 32
            if (r1 != r2) goto L_0x019a
            java.lang.String r1 = "height"
            int r1 = r0.getInteger(r1)     // Catch:{ IllegalStateException -> 0x036c }
            if (r1 != r2) goto L_0x019a
            r15.zzM = r14     // Catch:{ IllegalStateException -> 0x036c }
            goto L_0x01ba
        L_0x019a:
            r15.zzy = r0     // Catch:{ IllegalStateException -> 0x036c }
            r15.zzz = r14     // Catch:{ IllegalStateException -> 0x036c }
            goto L_0x01ba
        L_0x019f:
            boolean r0 = r15.zzN     // Catch:{ IllegalStateException -> 0x036c }
            if (r0 == 0) goto L_0x0166
            boolean r0 = r15.zzah     // Catch:{ IllegalStateException -> 0x036c }
            if (r0 != 0) goto L_0x01ab
            int r0 = r15.zzaa     // Catch:{ IllegalStateException -> 0x036c }
            if (r0 != r11) goto L_0x0166
        L_0x01ab:
            r23.zzax()     // Catch:{ IllegalStateException -> 0x036c }
            goto L_0x0166
        L_0x01af:
            boolean r1 = r15.zzM     // Catch:{ IllegalStateException -> 0x036c }
            if (r1 == 0) goto L_0x01c1
            r15.zzM = r13     // Catch:{ IllegalStateException -> 0x036c }
            com.google.android.gms.internal.ads.zzqe r1 = r15.zzw     // Catch:{ IllegalStateException -> 0x036c }
            r1.zzn(r0, r13)     // Catch:{ IllegalStateException -> 0x036c }
        L_0x01ba:
            r2 = r9
            r0 = r11
            r19 = r13
            r1 = r15
            goto L_0x031f
        L_0x01c1:
            android.media.MediaCodec$BufferInfo r1 = r15.zzl     // Catch:{ IllegalStateException -> 0x036c }
            int r1 = r1.size     // Catch:{ IllegalStateException -> 0x036c }
            if (r1 != 0) goto L_0x01d3
            android.media.MediaCodec$BufferInfo r1 = r15.zzl     // Catch:{ IllegalStateException -> 0x036c }
            int r1 = r1.flags     // Catch:{ IllegalStateException -> 0x036c }
            r1 = r1 & 4
            if (r1 == 0) goto L_0x01d3
            r23.zzax()     // Catch:{ IllegalStateException -> 0x036c }
            goto L_0x0166
        L_0x01d3:
            r15.zzR = r0     // Catch:{ IllegalStateException -> 0x036c }
            com.google.android.gms.internal.ads.zzqe r1 = r15.zzw     // Catch:{ IllegalStateException -> 0x036c }
            java.nio.ByteBuffer r0 = r1.zzg(r0)     // Catch:{ IllegalStateException -> 0x036c }
            r15.zzS = r0     // Catch:{ IllegalStateException -> 0x036c }
            if (r0 == 0) goto L_0x01f4
            android.media.MediaCodec$BufferInfo r1 = r15.zzl     // Catch:{ IllegalStateException -> 0x036c }
            int r1 = r1.offset     // Catch:{ IllegalStateException -> 0x036c }
            r0.position(r1)     // Catch:{ IllegalStateException -> 0x036c }
            java.nio.ByteBuffer r0 = r15.zzS     // Catch:{ IllegalStateException -> 0x036c }
            android.media.MediaCodec$BufferInfo r1 = r15.zzl     // Catch:{ IllegalStateException -> 0x036c }
            int r1 = r1.offset     // Catch:{ IllegalStateException -> 0x036c }
            android.media.MediaCodec$BufferInfo r2 = r15.zzl     // Catch:{ IllegalStateException -> 0x036c }
            int r2 = r2.size     // Catch:{ IllegalStateException -> 0x036c }
            int r1 = r1 + r2
            r0.limit(r1)     // Catch:{ IllegalStateException -> 0x036c }
        L_0x01f4:
            boolean r0 = r15.zzK     // Catch:{ IllegalStateException -> 0x036c }
            if (r0 == 0) goto L_0x0219
            android.media.MediaCodec$BufferInfo r0 = r15.zzl     // Catch:{ IllegalStateException -> 0x036c }
            long r0 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x036c }
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0219
            android.media.MediaCodec$BufferInfo r0 = r15.zzl     // Catch:{ IllegalStateException -> 0x036c }
            int r0 = r0.flags     // Catch:{ IllegalStateException -> 0x036c }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0219
            long r0 = r15.zzaf     // Catch:{ IllegalStateException -> 0x036c }
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0219
            android.media.MediaCodec$BufferInfo r2 = r15.zzl     // Catch:{ IllegalStateException -> 0x036c }
            r2.presentationTimeUs = r0     // Catch:{ IllegalStateException -> 0x036c }
        L_0x0219:
            android.media.MediaCodec$BufferInfo r0 = r15.zzl     // Catch:{ IllegalStateException -> 0x036c }
            long r0 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x036c }
            java.util.ArrayList r2 = r15.zzk     // Catch:{ IllegalStateException -> 0x036c }
            int r2 = r2.size()     // Catch:{ IllegalStateException -> 0x036c }
            r3 = r13
        L_0x0224:
            if (r3 >= r2) goto L_0x0240
            java.util.ArrayList r4 = r15.zzk     // Catch:{ IllegalStateException -> 0x036c }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ IllegalStateException -> 0x036c }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ IllegalStateException -> 0x036c }
            long r4 = r4.longValue()     // Catch:{ IllegalStateException -> 0x036c }
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x023d
            java.util.ArrayList r0 = r15.zzk     // Catch:{ IllegalStateException -> 0x036c }
            r0.remove(r3)     // Catch:{ IllegalStateException -> 0x036c }
            r0 = r14
            goto L_0x0241
        L_0x023d:
            int r3 = r3 + 1
            goto L_0x0224
        L_0x0240:
            r0 = r13
        L_0x0241:
            r15.zzT = r0     // Catch:{ IllegalStateException -> 0x036c }
            long r0 = r15.zzag     // Catch:{ IllegalStateException -> 0x036c }
            android.media.MediaCodec$BufferInfo r2 = r15.zzl     // Catch:{ IllegalStateException -> 0x036c }
            long r2 = r2.presentationTimeUs     // Catch:{ IllegalStateException -> 0x036c }
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x024f
            r0 = r14
            goto L_0x0250
        L_0x024f:
            r0 = r13
        L_0x0250:
            r15.zzU = r0     // Catch:{ IllegalStateException -> 0x036c }
            android.media.MediaCodec$BufferInfo r0 = r15.zzl     // Catch:{ IllegalStateException -> 0x036c }
            long r0 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x036c }
            com.google.android.gms.internal.ads.zzed r2 = r15.zzj     // Catch:{ IllegalStateException -> 0x036c }
            java.lang.Object r0 = r2.zzc(r0)     // Catch:{ IllegalStateException -> 0x036c }
            com.google.android.gms.internal.ads.zzad r0 = (com.google.android.gms.internal.ads.zzad) r0     // Catch:{ IllegalStateException -> 0x036c }
            if (r0 != 0) goto L_0x026c
            boolean r1 = r15.zzz     // Catch:{ IllegalStateException -> 0x036c }
            if (r1 == 0) goto L_0x026c
            com.google.android.gms.internal.ads.zzed r0 = r15.zzj     // Catch:{ IllegalStateException -> 0x036c }
            java.lang.Object r0 = r0.zzb()     // Catch:{ IllegalStateException -> 0x036c }
            com.google.android.gms.internal.ads.zzad r0 = (com.google.android.gms.internal.ads.zzad) r0     // Catch:{ IllegalStateException -> 0x036c }
        L_0x026c:
            if (r0 == 0) goto L_0x0271
            r15.zzq = r0     // Catch:{ IllegalStateException -> 0x036c }
            goto L_0x0279
        L_0x0271:
            boolean r0 = r15.zzz     // Catch:{ IllegalStateException -> 0x036c }
            if (r0 == 0) goto L_0x0282
            com.google.android.gms.internal.ads.zzad r0 = r15.zzq     // Catch:{ IllegalStateException -> 0x036c }
            if (r0 == 0) goto L_0x0282
        L_0x0279:
            com.google.android.gms.internal.ads.zzad r0 = r15.zzq     // Catch:{ IllegalStateException -> 0x036c }
            android.media.MediaFormat r1 = r15.zzy     // Catch:{ IllegalStateException -> 0x036c }
            r15.zzaa(r0, r1)     // Catch:{ IllegalStateException -> 0x036c }
            r15.zzz = r13     // Catch:{ IllegalStateException -> 0x036c }
        L_0x0282:
            boolean r0 = r15.zzJ     // Catch:{ IllegalStateException -> 0x0349 }
            if (r0 == 0) goto L_0x02db
            boolean r0 = r15.zzad     // Catch:{ IllegalStateException -> 0x036c }
            if (r0 == 0) goto L_0x02db
            com.google.android.gms.internal.ads.zzqe r6 = r15.zzw     // Catch:{ IllegalStateException -> 0x02c1 }
            java.nio.ByteBuffer r7 = r15.zzS     // Catch:{ IllegalStateException -> 0x02c1 }
            int r8 = r15.zzR     // Catch:{ IllegalStateException -> 0x02c1 }
            android.media.MediaCodec$BufferInfo r0 = r15.zzl     // Catch:{ IllegalStateException -> 0x02c1 }
            int r0 = r0.flags     // Catch:{ IllegalStateException -> 0x02c1 }
            r12 = 1
            android.media.MediaCodec$BufferInfo r1 = r15.zzl     // Catch:{ IllegalStateException -> 0x02c1 }
            long r4 = r1.presentationTimeUs     // Catch:{ IllegalStateException -> 0x02c1 }
            boolean r2 = r15.zzT     // Catch:{ IllegalStateException -> 0x02c1 }
            boolean r3 = r15.zzU     // Catch:{ IllegalStateException -> 0x02c1 }
            com.google.android.gms.internal.ads.zzad r1 = r15.zzq     // Catch:{ IllegalStateException -> 0x02c1 }
            r16 = r1
            r1 = r23
            r17 = r2
            r18 = r3
            r2 = r24
            r19 = r4
            r4 = r26
            r21 = r9
            r9 = r0
            r10 = r12
            r0 = r11
            r11 = r19
            r19 = r13
            r13 = r17
            r14 = r18
            r15 = r16
            boolean r1 = r1.zzaf(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x02c5 }
            goto L_0x0303
        L_0x02c1:
            r21 = r9
            r19 = r13
        L_0x02c5:
            r23.zzax()     // Catch:{ IllegalStateException -> 0x02d5 }
            r15 = r23
            boolean r0 = r15.zzai     // Catch:{ IllegalStateException -> 0x0346 }
            if (r0 == 0) goto L_0x02d1
            r23.zzap()     // Catch:{ IllegalStateException -> 0x0346 }
        L_0x02d1:
            r1 = r15
        L_0x02d2:
            r2 = r21
            goto L_0x0331
        L_0x02d5:
            r0 = move-exception
            r2 = 1
        L_0x02d7:
            r1 = r23
            goto L_0x0371
        L_0x02db:
            r21 = r9
            r0 = r11
            r19 = r13
            com.google.android.gms.internal.ads.zzqe r6 = r15.zzw     // Catch:{ IllegalStateException -> 0x0346 }
            java.nio.ByteBuffer r7 = r15.zzS     // Catch:{ IllegalStateException -> 0x0346 }
            int r8 = r15.zzR     // Catch:{ IllegalStateException -> 0x0346 }
            android.media.MediaCodec$BufferInfo r1 = r15.zzl     // Catch:{ IllegalStateException -> 0x0346 }
            int r9 = r1.flags     // Catch:{ IllegalStateException -> 0x0346 }
            r10 = 1
            android.media.MediaCodec$BufferInfo r1 = r15.zzl     // Catch:{ IllegalStateException -> 0x0346 }
            long r11 = r1.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0346 }
            boolean r13 = r15.zzT     // Catch:{ IllegalStateException -> 0x0346 }
            boolean r14 = r15.zzU     // Catch:{ IllegalStateException -> 0x0346 }
            com.google.android.gms.internal.ads.zzad r4 = r15.zzq     // Catch:{ IllegalStateException -> 0x0346 }
            r1 = r23
            r2 = r24
            r16 = r4
            r4 = r26
            r15 = r16
            boolean r1 = r1.zzaf(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x0342 }
        L_0x0303:
            if (r1 == 0) goto L_0x032e
            r1 = r23
            android.media.MediaCodec$BufferInfo r2 = r1.zzl     // Catch:{ IllegalStateException -> 0x0369 }
            long r2 = r2.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0369 }
            r1.zzao(r2)     // Catch:{ IllegalStateException -> 0x0369 }
            android.media.MediaCodec$BufferInfo r2 = r1.zzl     // Catch:{ IllegalStateException -> 0x0369 }
            int r2 = r2.flags     // Catch:{ IllegalStateException -> 0x0369 }
            r23.zzaz()     // Catch:{ IllegalStateException -> 0x0369 }
            r2 = r2 & 4
            if (r2 == 0) goto L_0x031d
            r23.zzax()     // Catch:{ IllegalStateException -> 0x0369 }
            goto L_0x02d2
        L_0x031d:
            r2 = r21
        L_0x031f:
            boolean r4 = r1.zzaF(r2)     // Catch:{ IllegalStateException -> 0x0369 }
            if (r4 != 0) goto L_0x0326
            goto L_0x0331
        L_0x0326:
            r11 = r0
            r15 = r1
            r9 = r2
            r13 = r19
            r14 = 1
            goto L_0x0145
        L_0x032e:
            r1 = r23
            goto L_0x02d2
        L_0x0331:
            boolean r0 = r23.zzaC()     // Catch:{ IllegalStateException -> 0x0369 }
            if (r0 == 0) goto L_0x033d
            boolean r0 = r1.zzaF(r2)     // Catch:{ IllegalStateException -> 0x0369 }
            if (r0 != 0) goto L_0x0331
        L_0x033d:
            android.os.Trace.endSection()     // Catch:{ IllegalStateException -> 0x0369 }
            r2 = 1
            goto L_0x0361
        L_0x0342:
            r0 = move-exception
            r1 = r23
            goto L_0x036a
        L_0x0346:
            r0 = move-exception
            r1 = r15
            goto L_0x036a
        L_0x0349:
            r0 = move-exception
            r19 = r13
            r1 = r15
            r2 = r14
            goto L_0x0371
        L_0x034f:
            r19 = r13
            r1 = r15
            com.google.android.gms.internal.ads.zzgm r0 = r1.zza     // Catch:{ IllegalStateException -> 0x0369 }
            int r2 = r0.zzd     // Catch:{ IllegalStateException -> 0x0369 }
            int r3 = r23.zzd(r24)     // Catch:{ IllegalStateException -> 0x0369 }
            int r2 = r2 + r3
            r0.zzd = r2     // Catch:{ IllegalStateException -> 0x0369 }
            r2 = 1
            r1.zzaE(r2)     // Catch:{ IllegalStateException -> 0x0367 }
        L_0x0361:
            com.google.android.gms.internal.ads.zzgm r0 = r1.zza     // Catch:{ IllegalStateException -> 0x0367 }
            r0.zza()     // Catch:{ IllegalStateException -> 0x0367 }
            return
        L_0x0367:
            r0 = move-exception
            goto L_0x0371
        L_0x0369:
            r0 = move-exception
        L_0x036a:
            r2 = 1
            goto L_0x0371
        L_0x036c:
            r0 = move-exception
            r19 = r13
            r2 = r14
            r1 = r15
        L_0x0371:
            int r3 = com.google.android.gms.internal.ads.zzeg.zza
            r4 = 21
            if (r3 < r4) goto L_0x037c
            boolean r3 = r0 instanceof android.media.MediaCodec.CodecException
            if (r3 == 0) goto L_0x037c
            goto L_0x0391
        L_0x037c:
            java.lang.StackTraceElement[] r3 = r0.getStackTrace()
            int r5 = r3.length
            if (r5 <= 0) goto L_0x03bd
            r3 = r3[r19]
            java.lang.String r3 = r3.getClassName()
            java.lang.String r5 = "android.media.MediaCodec"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x03bd
        L_0x0391:
            r1.zzX(r0)
            int r3 = com.google.android.gms.internal.ads.zzeg.zza
            if (r3 < r4) goto L_0x03a7
            boolean r3 = r0 instanceof android.media.MediaCodec.CodecException
            if (r3 == 0) goto L_0x03a7
            r3 = r0
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3
            boolean r3 = r3.isRecoverable()
            if (r3 == 0) goto L_0x03a7
            r14 = r2
            goto L_0x03a9
        L_0x03a7:
            r14 = r19
        L_0x03a9:
            if (r14 == 0) goto L_0x03ae
            r23.zzap()
        L_0x03ae:
            com.google.android.gms.internal.ads.zzqg r2 = r1.zzD
            com.google.android.gms.internal.ads.zzqf r0 = r1.zzak(r0, r2)
            com.google.android.gms.internal.ads.zzad r2 = r1.zzp
            r3 = 4003(0xfa3, float:5.61E-42)
            com.google.android.gms.internal.ads.zzgu r0 = r1.zzbg(r0, r2, r14, r3)
            throw r0
        L_0x03bd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqj.zzL(long, long):void");
    }

    public boolean zzM() {
        return this.zzai;
    }

    public boolean zzN() {
        if (this.zzp != null) {
            if (zzI() || zzaD()) {
                return true;
            }
            if (this.zzP != -9223372036854775807L && SystemClock.elapsedRealtime() < this.zzP) {
                return true;
            }
        }
        return false;
    }

    public final int zzO(zzad zzad2) throws zzgu {
        try {
            return zzQ(this.zzd, zzad2);
        } catch (zzqs e) {
            throw zzbg(e, zzad2, false, PlaybackException.ERROR_CODE_DECODER_QUERY_FAILED);
        }
    }

    /* access modifiers changed from: protected */
    public float zzP(float f, zzad zzad2, zzad[] zzadArr) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public abstract int zzQ(zzql zzql, zzad zzad2) throws zzqs;

    /* access modifiers changed from: protected */
    public zzgn zzR(zzqg zzqg, zzad zzad2, zzad zzad3) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005a, code lost:
        if (zzaB() == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0086, code lost:
        if (zzaB() == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0099, code lost:
        if (zzaB() == false) goto L_0x009b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ce A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.ads.zzgn zzS(com.google.android.gms.internal.ads.zzja r13) throws com.google.android.gms.internal.ads.zzgu {
        /*
            r12 = this;
            r0 = 1
            r12.zzaj = r0
            com.google.android.gms.internal.ads.zzad r4 = r13.zza
            r1 = 0
            if (r4 == 0) goto L_0x0106
            java.lang.String r2 = r4.zzm
            r3 = 0
            if (r2 == 0) goto L_0x00fa
            com.google.android.gms.internal.ads.zzpk r13 = r13.zzb
            r12.zzao = r13
            r12.zzp = r4
            boolean r2 = r12.zzV
            if (r2 == 0) goto L_0x001a
            r12.zzX = r0
            return r1
        L_0x001a:
            com.google.android.gms.internal.ads.zzqe r2 = r12.zzw
            if (r2 != 0) goto L_0x0024
            r12.zzB = r1
            r12.zzan()
            return r1
        L_0x0024:
            com.google.android.gms.internal.ads.zzqg r1 = r12.zzD
            com.google.android.gms.internal.ads.zzad r5 = r12.zzx
            com.google.android.gms.internal.ads.zzpk r6 = r12.zzan
            r7 = 23
            if (r6 != r13) goto L_0x00cf
            if (r13 == r6) goto L_0x0037
            int r8 = com.google.android.gms.internal.ads.zzeg.zza
            if (r8 < r7) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r7 = r3
            goto L_0x0038
        L_0x0037:
            r7 = r0
        L_0x0038:
            com.google.android.gms.internal.ads.zzcw.zzf(r7)
            com.google.android.gms.internal.ads.zzgn r7 = r12.zzR(r1, r5, r4)
            int r8 = r7.zzd
            r9 = 3
            r10 = 16
            r11 = 2
            if (r8 == 0) goto L_0x00b2
            if (r8 == r0) goto L_0x0089
            if (r8 == r11) goto L_0x005d
            boolean r0 = r12.zzaG(r4)
            if (r0 != 0) goto L_0x0052
            goto L_0x008f
        L_0x0052:
            r12.zzx = r4
            if (r13 == r6) goto L_0x00b5
            boolean r13 = r12.zzaB()
            if (r13 != 0) goto L_0x00b5
            goto L_0x009b
        L_0x005d:
            boolean r8 = r12.zzaG(r4)
            if (r8 != 0) goto L_0x0064
            goto L_0x008f
        L_0x0064:
            r12.zzY = r0
            r12.zzZ = r0
            int r8 = r12.zzE
            if (r8 == r11) goto L_0x007c
            if (r8 != r0) goto L_0x007b
            int r8 = r4.zzr
            int r10 = r5.zzr
            if (r8 != r10) goto L_0x007b
            int r8 = r4.zzs
            int r10 = r5.zzs
            if (r8 != r10) goto L_0x007b
            goto L_0x007c
        L_0x007b:
            r0 = r3
        L_0x007c:
            r12.zzL = r0
            r12.zzx = r4
            if (r13 == r6) goto L_0x00b5
            boolean r13 = r12.zzaB()
            if (r13 != 0) goto L_0x00b5
            goto L_0x009b
        L_0x0089:
            boolean r8 = r12.zzaG(r4)
            if (r8 != 0) goto L_0x0091
        L_0x008f:
            r6 = r10
            goto L_0x00b6
        L_0x0091:
            r12.zzx = r4
            if (r13 == r6) goto L_0x009d
            boolean r13 = r12.zzaB()
            if (r13 != 0) goto L_0x00b5
        L_0x009b:
            r6 = r11
            goto L_0x00b6
        L_0x009d:
            boolean r13 = r12.zzac
            if (r13 == 0) goto L_0x00b5
            r12.zzaa = r0
            boolean r13 = r12.zzG
            if (r13 != 0) goto L_0x00af
            boolean r13 = r12.zzI
            if (r13 == 0) goto L_0x00ac
            goto L_0x00af
        L_0x00ac:
            r12.zzab = r0
            goto L_0x00b5
        L_0x00af:
            r12.zzab = r9
            goto L_0x009b
        L_0x00b2:
            r12.zzU()
        L_0x00b5:
            r6 = r3
        L_0x00b6:
            int r13 = r7.zzd
            if (r13 == 0) goto L_0x00ce
            com.google.android.gms.internal.ads.zzqe r13 = r12.zzw
            if (r13 != r2) goto L_0x00c2
            int r13 = r12.zzab
            if (r13 != r9) goto L_0x00ce
        L_0x00c2:
            com.google.android.gms.internal.ads.zzgn r13 = new com.google.android.gms.internal.ads.zzgn
            java.lang.String r2 = r1.zza
            r0 = 0
            r1 = r13
            r3 = r5
            r5 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r13
        L_0x00ce:
            return r7
        L_0x00cf:
            if (r13 == 0) goto L_0x00e9
            if (r6 != 0) goto L_0x00d4
            goto L_0x00e9
        L_0x00d4:
            int r13 = com.google.android.gms.internal.ads.zzeg.zza
            if (r13 < r7) goto L_0x00e9
            java.util.UUID r13 = com.google.android.gms.internal.ads.zzm.zze
            java.util.UUID r0 = com.google.android.gms.internal.ads.zzm.zza
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x00e9
            java.util.UUID r13 = com.google.android.gms.internal.ads.zzm.zze
            java.util.UUID r0 = com.google.android.gms.internal.ads.zzm.zza
            r13.equals(r0)
        L_0x00e9:
            r12.zzU()
            com.google.android.gms.internal.ads.zzgn r13 = new com.google.android.gms.internal.ads.zzgn
            java.lang.String r2 = r1.zza
            r0 = 0
            r6 = 128(0x80, float:1.794E-43)
            r1 = r13
            r3 = r5
            r5 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r13
        L_0x00fa:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>()
            r0 = 4005(0xfa5, float:5.612E-42)
            com.google.android.gms.internal.ads.zzgu r13 = r12.zzbg(r13, r4, r3, r0)
            throw r13
        L_0x0106:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqj.zzS(com.google.android.gms.internal.ads.zzja):com.google.android.gms.internal.ads.zzgn");
    }

    /* access modifiers changed from: protected */
    public abstract zzqc zzV(zzqg zzqg, zzad zzad2, MediaCrypto mediaCrypto, float f);

    /* access modifiers changed from: protected */
    public abstract List zzW(zzql zzql, zzad zzad2, boolean z) throws zzqs;

    /* access modifiers changed from: protected */
    public void zzX(Exception exc) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzY(String str, zzqc zzqc, long j, long j2) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzZ(String str) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzaa(zzad zzad2, MediaFormat mediaFormat) throws zzgu {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzac() {
    }

    /* access modifiers changed from: protected */
    public void zzad(zzgc zzgc) throws zzgu {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzae() throws zzgu {
    }

    /* access modifiers changed from: protected */
    public abstract boolean zzaf(long j, long j2, zzqe zzqe, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzad zzad2) throws zzgu;

    /* access modifiers changed from: protected */
    public boolean zzag(zzad zzad2) {
        return false;
    }

    /* access modifiers changed from: protected */
    public final float zzah() {
        return this.zzu;
    }

    /* access modifiers changed from: protected */
    public final long zzai() {
        return this.zzal;
    }

    /* access modifiers changed from: protected */
    public final zzqe zzaj() {
        return this.zzw;
    }

    /* access modifiers changed from: protected */
    public zzqf zzak(Throwable th, zzqg zzqg) {
        return new zzqf(th, zzqg);
    }

    /* access modifiers changed from: protected */
    public final zzqg zzal() {
        return this.zzD;
    }

    /* access modifiers changed from: protected */
    public void zzam(zzgc zzgc) throws zzgu {
    }

    /* access modifiers changed from: protected */
    public final void zzan() throws zzgu {
        zzad zzad2;
        if (this.zzw == null && !this.zzV && (zzad2 = this.zzp) != null) {
            if (this.zzao != null || !zzag(zzad2)) {
                this.zzan = this.zzao;
                String str = this.zzp.zzm;
                if (this.zzan == null || !zzpl.zza) {
                    try {
                        if (this.zzB == null) {
                            List zzW2 = zzW(this.zzd, this.zzp, false);
                            zzW2.isEmpty();
                            this.zzB = new ArrayDeque();
                            if (!zzW2.isEmpty()) {
                                this.zzB.add((zzqg) zzW2.get(0));
                            }
                            this.zzC = null;
                        }
                        if (!this.zzB.isEmpty()) {
                            zzqg zzqg = (zzqg) this.zzB.peekFirst();
                            while (this.zzw == null) {
                                zzqg zzqg2 = (zzqg) this.zzB.peekFirst();
                                if (zzau(zzqg2)) {
                                    try {
                                        zzaw(zzqg2, (MediaCrypto) null);
                                    } catch (Exception e) {
                                        if (zzqg2 == zzqg) {
                                            Log.w("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                                            Thread.sleep(50);
                                            zzaw(zzqg2, (MediaCrypto) null);
                                        } else {
                                            throw e;
                                        }
                                    } catch (Exception e2) {
                                        zzdn.zzb("MediaCodecRenderer", "Failed to initialize decoder: ".concat(String.valueOf(String.valueOf(zzqg2))), e2);
                                        this.zzB.removeFirst();
                                        zzqi zzqi = new zzqi(this.zzp, (Throwable) e2, false, zzqg2);
                                        zzX(zzqi);
                                        zzqi zzqi2 = this.zzC;
                                        if (zzqi2 == null) {
                                            this.zzC = zzqi;
                                        } else {
                                            this.zzC = zzqi.zza(zzqi2, zzqi);
                                        }
                                        if (this.zzB.isEmpty()) {
                                            throw this.zzC;
                                        }
                                    }
                                } else {
                                    return;
                                }
                            }
                            this.zzB = null;
                            return;
                        }
                        throw new zzqi(this.zzp, (Throwable) null, false, -49999);
                    } catch (zzqs e3) {
                        throw new zzqi(this.zzp, (Throwable) e3, false, -49998);
                    } catch (zzqi e4) {
                        throw zzbg(e4, this.zzp, false, PlaybackException.ERROR_CODE_DECODER_INIT_FAILED);
                    }
                } else {
                    zzpb zza2 = this.zzan.zza();
                    throw zzbg(zza2, this.zzp, false, zza2.zza);
                }
            } else {
                zzad zzad3 = this.zzp;
                zzT();
                String str2 = zzad3.zzm;
                if ("audio/mp4a-latm".equals(str2) || "audio/mpeg".equals(str2) || "audio/opus".equals(str2)) {
                    this.zzi.zzn(32);
                } else {
                    this.zzi.zzn(1);
                }
                this.zzV = true;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void zzao(long j) {
        while (true) {
            int i = this.zzam;
            if (i != 0 && j >= this.zzo[0]) {
                long[] jArr = this.zzm;
                this.zzak = jArr[0];
                this.zzal = this.zzn[0];
                int i2 = i - 1;
                this.zzam = i2;
                System.arraycopy(jArr, 1, jArr, 0, i2);
                long[] jArr2 = this.zzn;
                System.arraycopy(jArr2, 1, jArr2, 0, this.zzam);
                long[] jArr3 = this.zzo;
                System.arraycopy(jArr3, 1, jArr3, 0, this.zzam);
                zzac();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zzap() {
        try {
            zzqe zzqe = this.zzw;
            if (zzqe != null) {
                zzqe.zzl();
                this.zza.zzb++;
                zzZ(this.zzD.zza);
            }
        } finally {
            this.zzw = null;
            this.zzr = null;
            this.zzan = null;
            zzar();
        }
    }

    /* access modifiers changed from: protected */
    public void zzaq() {
        zzay();
        zzaz();
        this.zzP = -9223372036854775807L;
        this.zzad = false;
        this.zzac = false;
        this.zzL = false;
        this.zzM = false;
        this.zzT = false;
        this.zzU = false;
        this.zzk.clear();
        this.zzaf = -9223372036854775807L;
        this.zzag = -9223372036854775807L;
        zzpz zzpz = this.zzO;
        if (zzpz != null) {
            zzpz.zzc();
        }
        this.zzaa = 0;
        this.zzab = 0;
        this.zzZ = this.zzY ? 1 : 0;
    }

    /* access modifiers changed from: protected */
    public final void zzar() {
        zzaq();
        this.zzO = null;
        this.zzB = null;
        this.zzD = null;
        this.zzx = null;
        this.zzy = null;
        this.zzz = false;
        this.zzae = false;
        this.zzA = -1.0f;
        this.zzE = 0;
        this.zzF = false;
        this.zzG = false;
        this.zzH = false;
        this.zzI = false;
        this.zzJ = false;
        this.zzK = false;
        this.zzN = false;
        this.zzY = false;
        this.zzZ = 0;
        this.zzs = false;
    }

    /* access modifiers changed from: protected */
    public final boolean zzas() throws zzgu {
        boolean zzat = zzat();
        if (zzat) {
            zzan();
        }
        return zzat;
    }

    /* access modifiers changed from: protected */
    public boolean zzau(zzqg zzqg) {
        return true;
    }

    public final int zze() {
        return 8;
    }

    /* access modifiers changed from: protected */
    public void zzs() {
        this.zzp = null;
        this.zzak = -9223372036854775807L;
        this.zzal = -9223372036854775807L;
        this.zzam = 0;
        zzat();
    }

    /* access modifiers changed from: protected */
    public void zzt(boolean z, boolean z2) throws zzgu {
        this.zza = new zzgm();
    }

    /* access modifiers changed from: protected */
    public void zzu(long j, boolean z) throws zzgu {
        this.zzah = false;
        this.zzai = false;
        if (this.zzV) {
            this.zzi.zzb();
            this.zzh.zzb();
            this.zzW = false;
        } else {
            zzas();
        }
        zzed zzed = this.zzj;
        if (zzed.zza() > 0) {
            this.zzaj = true;
        }
        zzed.zze();
        int i = this.zzam;
        if (i != 0) {
            int i2 = i - 1;
            this.zzal = this.zzn[i2];
            this.zzak = this.zzm[i2];
            this.zzam = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void zzv() {
        try {
            zzT();
            zzap();
        } finally {
            this.zzao = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzy(zzad[] zzadArr, long j, long j2) throws zzgu {
        boolean z = true;
        if (this.zzal == -9223372036854775807L) {
            if (this.zzak != -9223372036854775807L) {
                z = false;
            }
            zzcw.zzf(z);
            this.zzak = j;
            this.zzal = j2;
            return;
        }
        int i = this.zzam;
        if (i == 10) {
            Log.w("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.zzn[9]);
        } else {
            this.zzam = i + 1;
        }
        long[] jArr = this.zzm;
        int i2 = this.zzam - 1;
        jArr[i2] = j;
        this.zzn[i2] = j2;
        this.zzo[i2] = this.zzaf;
    }

    /* access modifiers changed from: protected */
    public final boolean zzat() {
        if (this.zzw == null) {
            return false;
        }
        if (this.zzab == 3 || this.zzG || ((this.zzH && !this.zzae) || (this.zzI && this.zzad))) {
            zzap();
            return true;
        }
        zzab();
        return false;
    }

    private final void zzax() throws zzgu {
        int i = this.zzab;
        if (i == 1) {
            zzab();
        } else if (i == 2) {
            zzab();
            zzaA();
        } else if (i != 3) {
            this.zzai = true;
            zzae();
        } else {
            zzap();
            zzan();
        }
    }
}
