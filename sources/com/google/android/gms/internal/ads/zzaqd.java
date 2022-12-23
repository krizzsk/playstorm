package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzaqd extends zzaqm {
    private final boolean zzi;

    public zzaqd(zzapc zzapc, String str, String str2, zzali zzali, int i, int i2) {
        super(zzapc, "yuf1nsAsFy3olrhDGup7vlloJ0uqB/pCPd1wXjadNbk08Ahzm1ms2kGIpbi3j3n0", "Ja6aP+2sRyo5nxEaCirzMomJuTTHKAyM16vEB9WmdYo=", zzali, i, 61);
        this.zzi = zzapc.zzs();
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zzf.invoke((Object) null, new Object[]{this.zzb.zzb(), Boolean.valueOf(this.zzi)})).longValue();
        synchronized (this.zze) {
            this.zze.zzB(longValue);
        }
    }
}
