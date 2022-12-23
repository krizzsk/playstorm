package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfig {
    private final Context zza;
    private final Executor zzb;
    private final zzcfn zzc;
    private final zzfhs zzd;

    zzfig(Context context, Executor executor, zzcfn zzcfn, zzfhs zzfhs) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcfn;
        this.zzd = zzfhs;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(String str) {
        this.zzc.zza(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(String str, zzfhq zzfhq) {
        zzfhg zza2 = zzfhf.zza(this.zza, 14);
        zza2.zzf();
        zza2.zze(this.zzc.zza(str));
        if (zzfhq == null) {
            this.zzd.zzb(zza2.zzj());
            return;
        }
        zzfhq.zza(zza2);
        zzfhq.zzg();
    }

    public final void zzc(String str, zzfhq zzfhq) {
        if (!zzfhs.zza() || !((Boolean) zzbjh.zzd.zze()).booleanValue()) {
            this.zzb.execute(new zzfie(this, str));
        } else {
            this.zzb.execute(new zzfif(this, str, zzfhq));
        }
    }

    public final void zzd(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzc((String) it.next(), (zzfhq) null);
        }
    }
}
