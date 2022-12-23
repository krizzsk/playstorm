package com.google.android.gms.internal.ads;

import androidx.core.view.MotionEventCompat;
import java.nio.ByteBuffer;
import java.util.Date;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzakr extends zzgpd {
    private Date zza;
    private Date zzh;
    private long zzi;
    private long zzj;
    private double zzk = 1.0d;
    private float zzl = 1.0f;
    private zzgpn zzm = zzgpn.zza;
    private long zzn;

    public zzakr() {
        super("mvhd");
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.zza + ";modificationTime=" + this.zzh + ";timescale=" + this.zzi + ";duration=" + this.zzj + ";rate=" + this.zzk + ";volume=" + this.zzl + ";matrix=" + this.zzm + ";nextTrackId=" + this.zzn + "]";
    }

    public final long zzd() {
        return this.zzj;
    }

    public final long zze() {
        return this.zzi;
    }

    public final void zzf(ByteBuffer byteBuffer) {
        zzi(byteBuffer);
        if (zzh() == 1) {
            this.zza = zzgpi.zza(zzakn.zzf(byteBuffer));
            this.zzh = zzgpi.zza(zzakn.zzf(byteBuffer));
            this.zzi = zzakn.zze(byteBuffer);
            this.zzj = zzakn.zzf(byteBuffer);
        } else {
            this.zza = zzgpi.zza(zzakn.zze(byteBuffer));
            this.zzh = zzgpi.zza(zzakn.zze(byteBuffer));
            this.zzi = zzakn.zze(byteBuffer);
            this.zzj = zzakn.zze(byteBuffer);
        }
        this.zzk = zzakn.zzb(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.zzl = ((float) ((short) ((bArr[1] & 255) | ((short) ((bArr[0] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK))))) / 256.0f;
        zzakn.zzd(byteBuffer);
        zzakn.zze(byteBuffer);
        zzakn.zze(byteBuffer);
        double zzb = zzakn.zzb(byteBuffer);
        double zzb2 = zzakn.zzb(byteBuffer);
        double zza2 = zzakn.zza(byteBuffer);
        this.zzm = new zzgpn(zzb, zzb2, zzakn.zzb(byteBuffer), zzakn.zzb(byteBuffer), zza2, zzakn.zza(byteBuffer), zzakn.zza(byteBuffer), zzakn.zzb(byteBuffer), zzakn.zzb(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.zzn = zzakn.zze(byteBuffer);
    }
}
