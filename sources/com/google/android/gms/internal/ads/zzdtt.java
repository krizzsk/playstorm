package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdtt implements zzdcn {
    private final zzcli zza;

    zzdtt(zzcli zzcli) {
        this.zza = zzcli;
    }

    public final void zzbq(Context context) {
        zzcli zzcli = this.zza;
        if (zzcli != null) {
            zzcli.destroy();
        }
    }

    public final void zzbs(Context context) {
        zzcli zzcli = this.zza;
        if (zzcli != null) {
            zzcli.onPause();
        }
    }

    public final void zzbt(Context context) {
        zzcli zzcli = this.zza;
        if (zzcli != null) {
            zzcli.onResume();
        }
    }
}
