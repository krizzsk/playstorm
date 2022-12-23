package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzos implements zzno {
    final /* synthetic */ zzot zza;

    /* synthetic */ zzos(zzot zzot, zzor zzor) {
        this.zza = zzot;
    }

    public final void zza(Exception exc) {
        zzdn.zza("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.zza.zzc.zzb(exc);
    }

    public final void zzb() {
        zzot zzot = this.zza;
        if (zzot.zzl != null) {
            zzot.zzl.zzb();
        }
    }
}
