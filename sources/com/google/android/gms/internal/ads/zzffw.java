package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public abstract class zzffw {
    /* access modifiers changed from: private */
    public static final zzfvj zza = zzfva.zzi((Object) null);
    /* access modifiers changed from: private */
    public final zzfvk zzb;
    /* access modifiers changed from: private */
    public final ScheduledExecutorService zzc;
    /* access modifiers changed from: private */
    public final zzffx zzd;

    public zzffw(zzfvk zzfvk, ScheduledExecutorService scheduledExecutorService, zzffx zzffx) {
        this.zzb = zzfvk;
        this.zzc = scheduledExecutorService;
        this.zzd = zzffx;
    }

    public final zzffm zza(Object obj, zzfvj... zzfvjArr) {
        return new zzffm(this, obj, Arrays.asList(zzfvjArr), (zzffl) null);
    }

    public final zzffv zzb(Object obj, zzfvj zzfvj) {
        return new zzffv(this, obj, (String) null, zzfvj, Collections.singletonList(zzfvj), zzfvj, (zzffu) null);
    }

    /* access modifiers changed from: protected */
    public abstract String zzf(Object obj);
}
