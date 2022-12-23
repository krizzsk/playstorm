package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzqc {
    public final zzqg zza;
    public final MediaFormat zzb;
    public final zzad zzc;
    public final Surface zzd;
    public final MediaCrypto zze = null;

    private zzqc(zzqg zzqg, MediaFormat mediaFormat, zzad zzad, Surface surface, MediaCrypto mediaCrypto, int i) {
        this.zza = zzqg;
        this.zzb = mediaFormat;
        this.zzc = zzad;
        this.zzd = surface;
    }

    public static zzqc zza(zzqg zzqg, MediaFormat mediaFormat, zzad zzad, MediaCrypto mediaCrypto) {
        return new zzqc(zzqg, mediaFormat, zzad, (Surface) null, (MediaCrypto) null, 0);
    }

    public static zzqc zzb(zzqg zzqg, MediaFormat mediaFormat, zzad zzad, Surface surface, MediaCrypto mediaCrypto) {
        return new zzqc(zzqg, mediaFormat, zzad, surface, (MediaCrypto) null, 0);
    }
}
