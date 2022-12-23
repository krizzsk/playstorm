package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzapr extends zzaqm {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzapr(zzapc zzapc, String str, String str2, zzali zzali, int i, int i2) {
        super(zzapc, "4qo7ydIZUH0p5YejDx/8wjt7DkOxdD2eNzq7zPXjrFqYSIF2FJuHDk9SiXwd9Q5H", "6AMFYAA1mweGFVX4poqZeQeR2M0TfYtYyjbhtBhim8Y=", zzali, i, 44);
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
            this.zze.zzn(zzi.longValue());
        }
    }
}
