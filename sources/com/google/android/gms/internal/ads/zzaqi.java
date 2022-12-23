package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzaqi extends zzaqm {
    public zzaqi(zzapc zzapc, String str, String str2, zzali zzali, int i, int i2) {
        super(zzapc, "vIuyJgkXAuHDOYyZs/XS63TUqVD1sO0CQ+HhaScCOnqgG3I71zSq+SxqNmjD4E1e", "PYnCLpLLKhA0q7i2li/Zt4bu8StAsClZCXaLnFnfz+0=", zzali, i, 48);
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzac(3);
        boolean booleanValue = ((Boolean) this.zzf.invoke((Object) null, new Object[]{this.zzb.zzb()})).booleanValue();
        synchronized (this.zze) {
            if (booleanValue) {
                this.zze.zzac(2);
            } else {
                this.zze.zzac(1);
            }
        }
    }
}
