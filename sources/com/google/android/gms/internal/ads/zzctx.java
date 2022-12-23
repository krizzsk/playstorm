package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzctx {
    private final String zza;
    private final zzbti zzb;
    /* access modifiers changed from: private */
    public final Executor zzc;
    /* access modifiers changed from: private */
    public zzcuc zzd;
    private final zzbol zze = new zzctu(this);
    private final zzbol zzf = new zzctw(this);

    public zzctx(String str, zzbti zzbti, Executor executor) {
        this.zza = str;
        this.zzb = zzbti;
        this.zzc = executor;
    }

    static /* bridge */ /* synthetic */ boolean zzg(zzctx zzctx, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(zzctx.zza);
    }

    public final void zzc(zzcuc zzcuc) {
        this.zzb.zzb("/updateActiveView", this.zze);
        this.zzb.zzb("/untrackActiveViewUnit", this.zzf);
        this.zzd = zzcuc;
    }

    public final void zzd(zzcli zzcli) {
        zzcli.zzaf("/updateActiveView", this.zze);
        zzcli.zzaf("/untrackActiveViewUnit", this.zzf);
    }

    public final void zze() {
        this.zzb.zzc("/updateActiveView", this.zze);
        this.zzb.zzc("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzf(zzcli zzcli) {
        zzcli.zzaw("/updateActiveView", this.zze);
        zzcli.zzaw("/untrackActiveViewUnit", this.zzf);
    }
}
