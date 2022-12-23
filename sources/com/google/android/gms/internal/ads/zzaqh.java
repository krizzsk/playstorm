package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzaqh extends zzaqm {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzaqh(zzapc zzapc, String str, String str2, zzali zzali, int i, int i2) {
        super(zzapc, "95m8nxzquSP6UteH+ctwS+fnWW3e+ARzjY5ilI8E7MqGTZUjuLdEgCnwSuHZqZih", "hyYn+RjvP2onIyOXybEZ6mkvLCHC0SlFWfJn2VBlQ1U=", zzali, i, 33);
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
            this.zze.zzS(zzi.longValue());
        }
    }
}
