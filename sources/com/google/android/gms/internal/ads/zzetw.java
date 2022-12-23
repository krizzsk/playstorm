package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzetw implements zzetb {
    private final Executor zza;
    private final String zzb;
    private final PackageInfo zzc;
    private final zzcei zzd;

    public zzetw(zzcei zzcei, Executor executor, String str, PackageInfo packageInfo, int i, byte[] bArr) {
        this.zzd = zzcei;
        this.zza = executor;
        this.zzb = str;
        this.zzc = packageInfo;
    }

    public final int zza() {
        return 41;
    }

    public final zzfvj zzb() {
        return zzfva.zzg(zzfva.zzm(zzfva.zzi(this.zzb), zzetu.zza, this.zza), Throwable.class, new zzetv(this), this.zza);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvj zzc(Throwable th) throws Exception {
        return zzfva.zzi(new zzetx(this.zzb));
    }
}
