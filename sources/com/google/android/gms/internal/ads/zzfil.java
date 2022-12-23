package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public abstract class zzfil {
    public abstract void zzb(View view, zzfir zzfir, String str);

    public abstract void zzc();

    public abstract void zzd(View view);

    public abstract void zze();

    public static zzfil zza(zzfim zzfim, zzfin zzfin) {
        if (zzfij.zzb()) {
            return new zzfip(zzfim, zzfin);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }
}
