package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer2.util.MimeTypes;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzot extends zzqj implements zzjc {
    private final Context zzb;
    /* access modifiers changed from: private */
    public final zznk zzc;
    private final zznr zzd;
    private int zze;
    private boolean zzf;
    private zzad zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    /* access modifiers changed from: private */
    public zzjt zzl;

    public zzot(Context context, zzqd zzqd, zzql zzql, boolean z, Handler handler, zznl zznl, zznr zznr) {
        super(1, zzqd, zzql, false, 44100.0f);
        this.zzb = context.getApplicationContext();
        this.zzd = zznr;
        this.zzc = new zznk(handler, zznl);
        zznr.zzn(new zzos(this, (zzor) null));
    }

    private final int zzaw(zzqg zzqg, zzad zzad) {
        if (!"OMX.google.raw.decoder".equals(zzqg.zza) || zzeg.zza >= 24 || (zzeg.zza == 23 && zzeg.zzW(this.zzb))) {
            return zzad.zzn;
        }
        return -1;
    }

    private static List zzax(zzql zzql, zzad zzad, boolean z, zznr zznr) throws zzqs {
        zzqg zzd2;
        String str = zzad.zzm;
        if (str == null) {
            return zzfrh.zzo();
        }
        if (zznr.zzv(zzad) && (zzd2 = zzqy.zzd()) != null) {
            return zzfrh.zzp(zzd2);
        }
        List zzf2 = zzqy.zzf(str, false, false);
        String zze2 = zzqy.zze(zzad);
        if (zze2 == null) {
            return zzfrh.zzm(zzf2);
        }
        List zzf3 = zzqy.zzf(zze2, false, false);
        zzfre zzi2 = zzfrh.zzi();
        zzi2.zzf(zzf2);
        zzi2.zzf(zzf3);
        return zzi2.zzg();
    }

    private final void zzay() {
        long zzb2 = this.zzd.zzb(zzM());
        if (zzb2 != Long.MIN_VALUE) {
            if (!this.zzj) {
                zzb2 = Math.max(this.zzh, zzb2);
            }
            this.zzh = zzb2;
            this.zzj = false;
        }
    }

    public final String zzK() {
        return "MediaCodecAudioRenderer";
    }

    public final boolean zzM() {
        return super.zzM() && this.zzd.zzu();
    }

    public final boolean zzN() {
        return this.zzd.zzt() || super.zzN();
    }

    /* access modifiers changed from: protected */
    public final float zzP(float f, zzad zzad, zzad[] zzadArr) {
        int i = -1;
        for (zzad zzad2 : zzadArr) {
            int i2 = zzad2.zzA;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return ((float) i) * f;
    }

    /* access modifiers changed from: protected */
    public final int zzQ(zzql zzql, zzad zzad) throws zzqs {
        boolean z;
        int i = 128;
        if (!zzbo.zzg(zzad.zzm)) {
            return 128;
        }
        int i2 = zzeg.zza >= 21 ? 32 : 0;
        int i3 = zzad.zzF;
        boolean zzav = zzav(zzad);
        if (zzav && this.zzd.zzv(zzad) && (i3 == 0 || zzqy.zzd() != null)) {
            return i2 | IronSourceConstants.USING_CACHE_FOR_INIT_EVENT;
        }
        if (("audio/raw".equals(zzad.zzm) && !this.zzd.zzv(zzad)) || !this.zzd.zzv(zzeg.zzE(2, zzad.zzz, zzad.zzA))) {
            return 129;
        }
        List zzax = zzax(zzql, zzad, false, this.zzd);
        if (zzax.isEmpty()) {
            return 129;
        }
        if (!zzav) {
            return 130;
        }
        zzqg zzqg = (zzqg) zzax.get(0);
        boolean zzd2 = zzqg.zzd(zzad);
        if (!zzd2) {
            int i4 = 1;
            while (true) {
                if (i4 >= zzax.size()) {
                    break;
                }
                zzqg zzqg2 = (zzqg) zzax.get(i4);
                if (zzqg2.zzd(zzad)) {
                    z = false;
                    zzd2 = true;
                    zzqg = zzqg2;
                    break;
                }
                i4++;
            }
        }
        z = true;
        int i5 = true != zzd2 ? 3 : 4;
        int i6 = 8;
        if (zzd2 && zzqg.zze(zzad)) {
            i6 = 16;
        }
        int i7 = true != zzqg.zzg ? 0 : 64;
        if (true != z) {
            i = 0;
        }
        return i5 | i6 | i2 | i7 | i;
    }

    /* access modifiers changed from: protected */
    public final zzgn zzR(zzqg zzqg, zzad zzad, zzad zzad2) {
        int i;
        int i2;
        zzgn zzb2 = zzqg.zzb(zzad, zzad2);
        int i3 = zzb2.zze;
        if (zzaw(zzqg, zzad2) > this.zze) {
            i3 |= 64;
        }
        String str = zzqg.zza;
        if (i3 != 0) {
            i2 = 0;
            i = i3;
        } else {
            i = 0;
            i2 = zzb2.zzd;
        }
        return new zzgn(str, zzad, zzad2, i2, i);
    }

    /* access modifiers changed from: protected */
    public final zzgn zzS(zzja zzja) throws zzgu {
        zzgn zzS = super.zzS(zzja);
        this.zzc.zzg(zzja.zza, zzS);
        return zzS;
    }

    /* access modifiers changed from: protected */
    public final zzqc zzV(zzqg zzqg, zzad zzad, MediaCrypto mediaCrypto, float f) {
        zzad[] zzJ = zzJ();
        int zzaw = zzaw(zzqg, zzad);
        if (r1 != 1) {
            for (zzad zzad2 : zzJ) {
                if (zzqg.zzb(zzad, zzad2).zzd != 0) {
                    zzaw = Math.max(zzaw, zzaw(zzqg, zzad2));
                }
            }
        }
        this.zze = zzaw;
        this.zzf = zzeg.zza < 24 && "OMX.SEC.aac.dec".equals(zzqg.zza) && "samsung".equals(zzeg.zzc) && (zzeg.zzb.startsWith("zeroflte") || zzeg.zzb.startsWith("herolte") || zzeg.zzb.startsWith("heroqlte"));
        String str = zzqg.zzc;
        int i = this.zze;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", zzad.zzz);
        mediaFormat.setInteger("sample-rate", zzad.zzA);
        zzdp.zzb(mediaFormat, zzad.zzo);
        zzdp.zza(mediaFormat, "max-input-size", i);
        if (zzeg.zza >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f && (zzeg.zza != 23 || (!"ZTE B2017G".equals(zzeg.zzd) && !"AXON 7 mini".equals(zzeg.zzd)))) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (zzeg.zza <= 28 && MimeTypes.AUDIO_AC4.equals(zzad.zzm)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (zzeg.zza >= 24 && this.zzd.zza(zzeg.zzE(4, zzad.zzz, zzad.zzA)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (zzeg.zza >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        this.zzg = (!"audio/raw".equals(zzqg.zzb) || "audio/raw".equals(zzad.zzm)) ? null : zzad;
        return zzqc.zza(zzqg, mediaFormat, zzad, (MediaCrypto) null);
    }

    /* access modifiers changed from: protected */
    public final List zzW(zzql zzql, zzad zzad, boolean z) throws zzqs {
        return zzqy.zzg(zzax(zzql, zzad, false, this.zzd), zzad);
    }

    /* access modifiers changed from: protected */
    public final void zzX(Exception exc) {
        zzdn.zza("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zza(exc);
    }

    /* access modifiers changed from: protected */
    public final void zzY(String str, zzqc zzqc, long j, long j2) {
        this.zzc.zzc(str, j, j2);
    }

    /* access modifiers changed from: protected */
    public final void zzZ(String str) {
        this.zzc.zzd(str);
    }

    public final long zza() {
        if (zzbe() == 2) {
            zzay();
        }
        return this.zzh;
    }

    /* access modifiers changed from: protected */
    public final void zzab() {
        this.zzj = true;
    }

    /* access modifiers changed from: protected */
    public final void zzac() {
        this.zzd.zzf();
    }

    /* access modifiers changed from: protected */
    public final void zzad(zzgc zzgc) {
        if (this.zzi && !zzgc.zzf()) {
            if (Math.abs(zzgc.zzd - this.zzh) > 500000) {
                this.zzh = zzgc.zzd;
            }
            this.zzi = false;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zzag(zzad zzad) {
        return this.zzd.zzv(zzad);
    }

    public final zzbt zzc() {
        return this.zzd.zzc();
    }

    public final void zzg(zzbt zzbt) {
        this.zzd.zzo(zzbt);
    }

    public final zzjc zzi() {
        return this;
    }

    public final void zzp(int i, Object obj) throws zzgu {
        if (i == 2) {
            this.zzd.zzr(((Float) obj).floatValue());
        } else if (i == 3) {
            this.zzd.zzk((zzi) obj);
        } else if (i != 6) {
            switch (i) {
                case 9:
                    this.zzd.zzq(((Boolean) obj).booleanValue());
                    return;
                case 10:
                    this.zzd.zzl(((Integer) obj).intValue());
                    return;
                case 11:
                    this.zzl = (zzjt) obj;
                    return;
                default:
                    return;
            }
        } else {
            this.zzd.zzm((zzj) obj);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzs() {
        this.zzk = true;
        try {
            this.zzd.zze();
            try {
                super.zzs();
            } finally {
                this.zzc.zze(this.zza);
            }
        } catch (Throwable th) {
            super.zzs();
            throw th;
        } finally {
            this.zzc.zze(this.zza);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzt(boolean z, boolean z2) throws zzgu {
        super.zzt(z, z2);
        this.zzc.zzf(this.zza);
        zzk();
        this.zzd.zzp(zzl());
    }

    /* access modifiers changed from: protected */
    public final void zzu(long j, boolean z) throws zzgu {
        super.zzu(j, z);
        this.zzd.zze();
        this.zzh = j;
        this.zzi = true;
        this.zzj = true;
    }

    /* access modifiers changed from: protected */
    public final void zzv() {
        try {
            super.zzv();
            if (this.zzk) {
                this.zzk = false;
                this.zzd.zzj();
            }
        } catch (Throwable th) {
            if (this.zzk) {
                this.zzk = false;
                this.zzd.zzj();
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzw() {
        this.zzd.zzh();
    }

    /* access modifiers changed from: protected */
    public final void zzx() {
        zzay();
        this.zzd.zzg();
    }

    /* access modifiers changed from: protected */
    public final void zzae() throws zzgu {
        try {
            this.zzd.zzi();
        } catch (zznq e) {
            throw zzbg(e, e.zzc, e.zzb, 5002);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zzaf(long j, long j2, zzqe zzqe, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzad zzad) throws zzgu {
        if (byteBuffer == null) {
            throw null;
        } else if (this.zzg == null || (i2 & 2) == 0) {
            if (z) {
                if (zzqe != null) {
                    zzqe.zzn(i, false);
                }
                this.zza.zzf += i3;
                this.zzd.zzf();
                return true;
            }
            try {
                if (!this.zzd.zzs(byteBuffer, j3, i3)) {
                    return false;
                }
                if (zzqe != null) {
                    zzqe.zzn(i, false);
                }
                this.zza.zze += i3;
                return true;
            } catch (zznn e) {
                throw zzbg(e, e.zzc, e.zzb, 5001);
            } catch (zznq e2) {
                throw zzbg(e2, zzad, e2.zzb, 5002);
            }
        } else if (zzqe != null) {
            zzqe.zzn(i, false);
            return true;
        } else {
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzaa(zzad zzad, MediaFormat mediaFormat) throws zzgu {
        int i;
        int i2;
        zzad zzad2 = this.zzg;
        int[] iArr = null;
        if (zzad2 != null) {
            zzad = zzad2;
        } else if (zzaj() != null) {
            if ("audio/raw".equals(zzad.zzm)) {
                i = zzad.zzB;
            } else if (zzeg.zza < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                i = mediaFormat.containsKey("v-bits-per-sample") ? zzeg.zzn(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                i = mediaFormat.getInteger("pcm-encoding");
            }
            zzab zzab = new zzab();
            zzab.zzS("audio/raw");
            zzab.zzN(i);
            zzab.zzC(zzad.zzC);
            zzab.zzD(zzad.zzD);
            zzab.zzw(mediaFormat.getInteger("channel-count"));
            zzab.zzT(mediaFormat.getInteger("sample-rate"));
            zzad zzY = zzab.zzY();
            if (this.zzf && zzY.zzz == 6 && (i2 = zzad.zzz) < 6) {
                iArr = new int[i2];
                for (int i3 = 0; i3 < zzad.zzz; i3++) {
                    iArr[i3] = i3;
                }
            }
            zzad = zzY;
        }
        try {
            this.zzd.zzd(zzad, 0, iArr);
        } catch (zznm e) {
            throw zzbg(e, e.zza, false, 5001);
        }
    }
}
