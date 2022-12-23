package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdzu implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;

    public zzdzu(zzgqh zzgqh, zzgqh zzgqh2) {
        this.zza = zzgqh;
        this.zzb = zzgqh2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        CookieManager zzb2 = zzt.zzq().zzb((Context) this.zzb.zzb());
        zzffy zzffy = zzffy.WEBVIEW_COOKIE;
        return zzffo.zza(new zzdzr(zzb2), zzffy, (zzfge) this.zza.zzb()).zzi(1, TimeUnit.SECONDS).zzc(Exception.class, new zzffr(zzdzs.zza)).zza();
    }
}
