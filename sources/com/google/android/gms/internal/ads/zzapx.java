package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzapx extends zzaqm {
    private final zzaog zzi;
    private final long zzj;
    private final long zzk;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzapx(zzapc zzapc, String str, String str2, zzali zzali, int i, int i2, zzaog zzaog, long j, long j2) {
        super(zzapc, "gwRPz8bLLKP2CNEw52CWr8qH7aLQJQgZH2Do8dWUF6DoOxZ/M4tgY0r5mQPR4CHj", "wXdYywy2LsdIoEkljSZxSgKQk9kgrY0qof3Oat1MHRk=", zzali, i, 11);
        this.zzi = zzaog;
        this.zzj = j;
        this.zzk = j2;
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzaog zzaog = this.zzi;
        if (zzaog != null) {
            zzaoe zzaoe = new zzaoe((String) this.zzf.invoke((Object) null, new Object[]{zzaog.zzb(), Long.valueOf(this.zzj), Long.valueOf(this.zzk)}));
            synchronized (this.zze) {
                this.zze.zzw(zzaoe.zza.longValue());
                if (zzaoe.zzb.longValue() >= 0) {
                    this.zze.zzN(zzaoe.zzb.longValue());
                }
                if (zzaoe.zzc.longValue() >= 0) {
                    this.zze.zzf(zzaoe.zzc.longValue());
                }
            }
        }
    }
}
