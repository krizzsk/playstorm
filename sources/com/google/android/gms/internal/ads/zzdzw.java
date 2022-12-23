package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdzw implements zzgpu {
    private final zzgqh zza;

    public zzdzw(zzgqh zzgqh) {
        this.zza = zzgqh;
    }

    /* renamed from: zza */
    public final ApplicationInfo zzb() {
        ApplicationInfo applicationInfo = ((Context) this.zza.zzb()).getApplicationInfo();
        zzgqc.zzb(applicationInfo);
        return applicationInfo;
    }
}
