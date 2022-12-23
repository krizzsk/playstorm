package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzemf implements zzded {
    private final AtomicReference zza = new AtomicReference();

    public final void zza(zzde zzde) {
        this.zza.set(zzde);
    }

    public final void zzg(zzs zzs) {
        zzeyj.zza(this.zza, new zzeme(zzs));
    }
}
