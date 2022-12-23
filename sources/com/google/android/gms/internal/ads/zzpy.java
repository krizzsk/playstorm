package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzpy extends zzgc {
    private long zzf;
    private int zzg;
    private int zzh = 32;

    public zzpy() {
        super(2, 0);
    }

    public final void zzb() {
        super.zzb();
        this.zzg = 0;
    }

    public final int zzl() {
        return this.zzg;
    }

    public final long zzm() {
        return this.zzf;
    }

    public final void zzn(int i) {
        this.zzh = i;
    }

    public final boolean zzo(zzgc zzgc) {
        ByteBuffer byteBuffer;
        zzcw.zzd(!zzgc.zzd(1073741824));
        zzcw.zzd(!zzgc.zzd(268435456));
        zzcw.zzd(!zzgc.zzd(4));
        if (zzp()) {
            if (this.zzg >= this.zzh || zzgc.zzd(Integer.MIN_VALUE) != zzd(Integer.MIN_VALUE)) {
                return false;
            }
            ByteBuffer byteBuffer2 = zzgc.zzb;
            if (!(byteBuffer2 == null || (byteBuffer = this.zzb) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000)) {
                return false;
            }
        }
        int i = this.zzg;
        this.zzg = i + 1;
        if (i == 0) {
            this.zzd = zzgc.zzd;
            if (zzgc.zzd(1)) {
                zzc(1);
            }
        }
        if (zzgc.zzd(Integer.MIN_VALUE)) {
            zzc(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer3 = zzgc.zzb;
        if (byteBuffer3 != null) {
            zzi(byteBuffer3.remaining());
            this.zzb.put(byteBuffer3);
        }
        this.zzf = zzgc.zzd;
        return true;
    }

    public final boolean zzp() {
        return this.zzg > 0;
    }
}
