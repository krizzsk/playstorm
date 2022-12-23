package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzatk {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = new MediaCodec.CryptoInfo.Pattern(0, 0);

    /* synthetic */ zzatk(MediaCodec.CryptoInfo cryptoInfo, zzatj zzatj) {
        this.zza = cryptoInfo;
    }

    static /* bridge */ /* synthetic */ void zza(zzatk zzatk, int i, int i2) {
        zzatk.zzb.set(0, 0);
        zzatk.zza.setPattern(zzatk.zzb);
    }
}
