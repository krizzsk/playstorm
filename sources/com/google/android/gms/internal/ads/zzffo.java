package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzffo {
    public static final zzffv zza(Callable callable, Object obj, zzffw zzffw) {
        return zzb(callable, zzffw.zzb, obj, zzffw);
    }

    public static final zzffv zzb(Callable callable, zzfvk zzfvk, Object obj, zzffw zzffw) {
        return new zzffv(zzffw, obj, (String) null, zzffw.zza, Collections.emptyList(), zzfvk.zzb(callable), (zzffu) null);
    }

    public static final zzffv zzc(zzfvj zzfvj, Object obj, zzffw zzffw) {
        return new zzffv(zzffw, obj, (String) null, zzffw.zza, Collections.emptyList(), zzfvj, (zzffu) null);
    }

    public static final zzffv zzd(zzffi zzffi, zzfvk zzfvk, Object obj, zzffw zzffw) {
        return zzb(new zzffn(zzffi), zzfvk, obj, zzffw);
    }
}
