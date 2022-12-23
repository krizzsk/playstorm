package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zznq extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzad zzc;

    public zznq(int i, zzad zzad, boolean z) {
        super("AudioTrack write failed: " + i);
        this.zzb = z;
        this.zza = i;
        this.zzc = zzad;
    }
}
