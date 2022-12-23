package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzaps extends zzaqm {
    private final long zzi;

    public zzaps(zzapc zzapc, String str, String str2, zzali zzali, long j, int i, int i2) {
        super(zzapc, "9aN5Cm+1eB8M6WEeTCyHrcP34KU7gU8jlMBy6C9bmSWwJjNodfWmCfc45rNGVCVv", "hM2f+ZpOxGYOaoXhhqTEB4E2d1ZW9gQWshCuliQN60Y=", zzali, i, 25);
        this.zzi = j;
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zzf.invoke((Object) null, new Object[0])).longValue();
        synchronized (this.zze) {
            this.zze.zzs(longValue);
            long j = this.zzi;
            if (j != 0) {
                this.zze.zzQ(longValue - j);
                this.zze.zzR(this.zzi);
            }
        }
    }
}
