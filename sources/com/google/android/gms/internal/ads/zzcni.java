package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzi;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzcni {
    private final zzcfo zza;
    private final Context zzb;
    private final WeakReference zzc;

    /* synthetic */ zzcni(zzcng zzcng, zzcnh zzcnh) {
        this.zza = zzcng.zza;
        this.zzb = zzcng.zzb;
        this.zzc = zzcng.zzc;
    }

    /* access modifiers changed from: package-private */
    public final Context zza() {
        return this.zzb;
    }

    public final zzaoc zzb() {
        return new zzaoc(new zzi(this.zzb, this.zza));
    }

    /* access modifiers changed from: package-private */
    public final zzbkh zzc() {
        return new zzbkh(this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final zzcfo zzd() {
        return this.zza;
    }

    /* access modifiers changed from: package-private */
    public final String zze() {
        return zzt.zzp().zzc(this.zzb, this.zza.zza);
    }

    /* access modifiers changed from: package-private */
    public final WeakReference zzf() {
        return this.zzc;
    }
}
