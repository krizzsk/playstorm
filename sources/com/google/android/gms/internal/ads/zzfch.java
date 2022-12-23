package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfch {
    private final zzfbg zza;
    private final zzfbj zzb;
    private final zzeen zzc;
    private final zzfig zzd;
    private final zzfhq zze;

    public zzfch(zzeen zzeen, zzfig zzfig, zzfbg zzfbg, zzfbj zzfbj, zzfhq zzfhq) {
        this.zza = zzfbg;
        this.zzb = zzfbj;
        this.zzc = zzeen;
        this.zzd = zzfig;
        this.zze = zzfhq;
    }

    public final void zza(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), 2);
        }
    }

    public final void zzb(String str, int i) {
        if (!this.zza.zzak) {
            this.zzd.zzc(str, this.zze);
            return;
        }
        this.zzc.zzd(new zzeep(zzt.zzA().currentTimeMillis(), this.zzb.zzb, str, i));
    }

    public final void zzc(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), i);
        }
    }
}
