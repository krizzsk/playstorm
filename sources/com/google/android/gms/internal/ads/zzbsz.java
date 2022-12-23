package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbb;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbsz {
    static final zzbb zza = new zzbsx();
    static final zzbb zzb = new zzbsy();
    private final zzbsl zzc;

    public zzbsz(Context context, zzcfo zzcfo, String str, @Nullable zzfhs zzfhs) {
        this.zzc = new zzbsl(context, zzcfo, str, zza, zzb, zzfhs);
    }

    public final zzbsp zza(String str, zzbss zzbss, zzbsr zzbsr) {
        return new zzbtd(this.zzc, str, zzbss, zzbsr);
    }

    public final zzbti zzb() {
        return new zzbti(this.zzc);
    }
}
