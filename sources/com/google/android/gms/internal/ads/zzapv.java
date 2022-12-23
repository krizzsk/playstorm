package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzapv extends zzaqm {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzapv(zzapc zzapc, String str, String str2, zzali zzali, int i, int i2) {
        super(zzapc, "UloSfoTFTeHwqhun6eFIktptgYL2IDO82d0FsFWUGkksiDJXPejv+whIfZ+2Wfan", "7xM/jp1ssnTHy48Ysast7LrhX+6n3G9zqz4TlIUZi1E=", zzali, i, 22);
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzi == null) {
            synchronized (zzj) {
                if (zzi == null) {
                    zzi = (Long) this.zzf.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzv(zzi.longValue());
        }
    }
}
