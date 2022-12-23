package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzate extends zzavq implements zzazc {
    /* access modifiers changed from: private */
    public final zzaso zzb;
    private final zzata zzc = new zzata((zzasf) null, new zzash[0], new zzatd(this, (zzatc) null));
    private boolean zzd;
    private int zze;
    private int zzf;
    private long zzg;
    /* access modifiers changed from: private */
    public boolean zzh;

    public zzate(zzavs zzavs, zzats zzats, boolean z, Handler handler, zzasp zzasp) {
        super(1, zzavs, (zzats) null, true);
        this.zzb = new zzaso(handler, zzasp);
    }

    public final boolean zzE() {
        return super.zzE() && this.zzc.zzo();
    }

    public final boolean zzF() {
        return this.zzc.zzn() || super.zzF();
    }

    /* access modifiers changed from: protected */
    public final int zzH(zzavs zzavs, zzars zzars) throws zzavv {
        int i;
        int i2;
        String str = zzars.zzf;
        if (!zzazd.zza(str)) {
            return 0;
        }
        int i3 = zzazn.zza >= 21 ? 16 : 0;
        zzavo zzc2 = zzawa.zzc(str, false);
        if (zzc2 == null) {
            return 1;
        }
        int i4 = 2;
        if (zzazn.zza < 21 || (((i = zzars.zzs) == -1 || zzc2.zzd(i)) && ((i2 = zzars.zzr) == -1 || zzc2.zzc(i2)))) {
            i4 = 3;
        }
        return i3 | 4 | i4;
    }

    public final long zzI() {
        long zza = this.zzc.zza(zzE());
        if (zza != Long.MIN_VALUE) {
            if (!this.zzh) {
                zza = Math.max(this.zzg, zza);
            }
            this.zzg = zza;
            this.zzh = false;
        }
        return this.zzg;
    }

    public final zzarw zzJ() {
        return this.zzc.zzc();
    }

    public final zzarw zzK(zzarw zzarw) {
        return this.zzc.zzd(zzarw);
    }

    /* access modifiers changed from: protected */
    public final zzavo zzM(zzavs zzavs, zzars zzars, boolean z) throws zzavv {
        return super.zzM(zzavs, zzars, false);
    }

    /* access modifiers changed from: protected */
    public final void zzO(zzavo zzavo, MediaCodec mediaCodec, zzars zzars, MediaCrypto mediaCrypto) {
        String str = zzavo.zza;
        boolean z = true;
        if (zzazn.zza >= 24 || !"OMX.SEC.aac.dec".equals(str) || !"samsung".equals(zzazn.zzc) || (!zzazn.zzb.startsWith("zeroflte") && !zzazn.zzb.startsWith("herolte") && !zzazn.zzb.startsWith("heroqlte"))) {
            z = false;
        }
        this.zzd = z;
        mediaCodec.configure(zzars.zzb(), (Surface) null, (MediaCrypto) null, 0);
    }

    /* access modifiers changed from: protected */
    public final void zzP(String str, long j, long j2) {
        this.zzb.zzd(str, j, j2);
    }

    /* access modifiers changed from: protected */
    public final void zzQ(zzars zzars) throws zzare {
        super.zzQ(zzars);
        this.zzb.zzg(zzars);
        this.zze = "audio/raw".equals(zzars.zzf) ? zzars.zzt : 2;
        this.zzf = zzars.zzr;
    }

    /* access modifiers changed from: protected */
    public final void zzR(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzare {
        int[] iArr;
        int i;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (!this.zzd || integer != 6) {
            i = integer;
            iArr = null;
        } else {
            int i2 = this.zzf;
            if (i2 < 6) {
                int[] iArr2 = new int[i2];
                for (int i3 = 0; i3 < this.zzf; i3++) {
                    iArr2[i3] = i3;
                }
                iArr = iArr2;
            } else {
                iArr = null;
            }
            i = 6;
        }
        try {
            this.zzc.zze("audio/raw", i, integer2, this.zze, 0, iArr);
        } catch (zzasu e) {
            throw zzare.zza(e, zza());
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zzT(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws zzare {
        if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.zza.zze++;
            this.zzc.zzf();
            return true;
        }
        try {
            if (!this.zzc.zzm(byteBuffer, j3)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i, false);
            this.zza.zzd++;
            return true;
        } catch (zzasv | zzasz e) {
            throw zzare.zza(e, zza());
        }
    }

    public final zzazc zzi() {
        return this;
    }

    public final void zzl(int i, Object obj) throws zzare {
        if (i == 2) {
            this.zzc.zzl(((Float) obj).floatValue());
        }
    }

    /* access modifiers changed from: protected */
    public final void zzn() {
        try {
            this.zzc.zzj();
            try {
                super.zzn();
            } finally {
                this.zza.zza();
                this.zzb.zze(this.zza);
            }
        } catch (Throwable th) {
            super.zzn();
            throw th;
        } finally {
            this.zza.zza();
            this.zzb.zze(this.zza);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzo(boolean z) throws zzare {
        super.zzo(z);
        this.zzb.zzf(this.zza);
        int i = zzg().zzb;
    }

    /* access modifiers changed from: protected */
    public final void zzp(long j, boolean z) throws zzare {
        super.zzp(j, z);
        this.zzc.zzk();
        this.zzg = j;
        this.zzh = true;
    }

    /* access modifiers changed from: protected */
    public final void zzq() {
        this.zzc.zzh();
    }

    /* access modifiers changed from: protected */
    public final void zzr() {
        this.zzc.zzg();
    }

    /* access modifiers changed from: protected */
    public final void zzS() throws zzare {
        try {
            this.zzc.zzi();
        } catch (zzasz e) {
            throw zzare.zza(e, zza());
        }
    }
}
