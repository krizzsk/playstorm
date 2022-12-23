package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public class zzqf extends zzga {
    public final zzqg zza;
    public final String zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzqf(Throwable th, zzqg zzqg) {
        super("Decoder failed: ".concat(String.valueOf(zzqg == null ? null : zzqg.zza)), th);
        String str = null;
        this.zza = zzqg;
        if (zzeg.zza >= 21 && (th instanceof MediaCodec.CodecException)) {
            str = ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.zzb = str;
    }
}
