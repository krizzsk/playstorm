package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzdqf implements zzfuh {
    public final /* synthetic */ zzfvj zza;

    public /* synthetic */ zzdqf(zzfvj zzfvj) {
        this.zza = zzfvj;
    }

    public final zzfvj zza(Object obj) {
        zzfvj zzfvj = this.zza;
        zzcli zzcli = (zzcli) obj;
        if (zzcli != null && zzcli.zzs() != null) {
            return zzfvj;
        }
        throw new zzeio(1, "Retrieve video view in html5 ad response failed.");
    }
}
