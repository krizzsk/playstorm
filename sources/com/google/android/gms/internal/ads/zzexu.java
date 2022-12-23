package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzexu implements zzfuh {
    public final /* synthetic */ zzexw zza;
    public final /* synthetic */ zzfdw zzb;
    public final /* synthetic */ zzcyz zzc;

    public /* synthetic */ zzexu(zzexw zzexw, zzfdw zzfdw, zzcyz zzcyz) {
        this.zza = zzexw;
        this.zzb = zzfdw;
        this.zzc = zzcyz;
    }

    public final zzfvj zza(Object obj) {
        zzfdw zzfdw = this.zzb;
        zzcyz zzcyz = this.zzc;
        zzfbs zzfbs = (zzfbs) obj;
        zzfdw.zzb = zzfbs;
        Iterator it = zzfbs.zzb.zza.iterator();
        boolean z = false;
        loop0:
        while (true) {
            if (it.hasNext()) {
                Iterator it2 = ((zzfbg) it.next()).zza.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                            break loop0;
                        }
                        z = true;
                    }
                }
            } else if (z) {
                return zzcyz.zzh(zzfva.zzi(zzfbs));
            }
        }
        return zzfva.zzi((Object) null);
    }
}
