package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzahp {
    private final List zza;
    private final zzzz[] zzb;

    public zzahp(List list) {
        this.zza = list;
        this.zzb = new zzzz[list.size()];
    }

    public final void zza(long j, zzdy zzdy) {
        if (zzdy.zza() >= 9) {
            int zze = zzdy.zze();
            int zze2 = zzdy.zze();
            int zzk = zzdy.zzk();
            if (zze == 434 && zze2 == 1195456820 && zzk == 3) {
                zzyj.zzb(j, zzdy, this.zzb);
            }
        }
    }

    public final void zzb(zzyv zzyv, zzahm zzahm) {
        for (int i = 0; i < this.zzb.length; i++) {
            zzahm.zzc();
            zzzz zzv = zzyv.zzv(zzahm.zza(), 3);
            zzad zzad = (zzad) this.zza.get(i);
            String str = zzad.zzm;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            zzcw.zze(z, "Invalid closed caption mime type provided: ".concat(String.valueOf(str)));
            zzab zzab = new zzab();
            zzab.zzH(zzahm.zzb());
            zzab.zzS(str);
            zzab.zzU(zzad.zze);
            zzab.zzK(zzad.zzd);
            zzab.zzu(zzad.zzE);
            zzab.zzI(zzad.zzo);
            zzv.zzk(zzab.zzY());
            this.zzb[i] = zzv;
        }
    }
}
