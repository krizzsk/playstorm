package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzaqg extends zzaqm {
    private final zzapj zzi;
    private long zzj;

    public zzaqg(zzapc zzapc, String str, String str2, zzali zzali, int i, int i2, zzapj zzapj) {
        super(zzapc, "JlKpVe7xzQtZywdnv0ux4JrKILbEoPGtNuq/lCSZezm3ZqhaJyVFDnkCoxXLf/KG", "V8HYPAghzWHqrIy38Vh6p4w3eeyqyQ2rIl2LLOtw9JM=", zzali, i, 53);
        this.zzi = zzapj;
        if (zzapj != null) {
            this.zzj = zzapj.zza();
        }
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzi != null) {
            this.zze.zzM(((Long) this.zzf.invoke((Object) null, new Object[]{Long.valueOf(this.zzj)})).longValue());
        }
    }
}
