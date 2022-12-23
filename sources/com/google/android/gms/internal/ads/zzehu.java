package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbu;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzehu implements zzefg {
    private final Context zza;
    private final zzdlt zzb;
    private final Executor zzc;

    public zzehu(Context context, zzdlt zzdlt, Executor executor) {
        this.zza = context;
        this.zzb = zzdlt;
        this.zzc = executor;
    }

    private static final boolean zzc(zzfbs zzfbs, int i) {
        return zzfbs.zza.zza.zzg.contains(Integer.toString(i));
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfbs zzfbs, zzfbg zzfbg, zzefb zzefb) throws zzfcd, zzeio {
        zzdng zzdng;
        zzbuk zzB = ((zzfct) zzefb.zzb).zzB();
        zzbul zzC = ((zzfct) zzefb.zzb).zzC();
        zzbuo zzd = ((zzfct) zzefb.zzb).zzd();
        if (zzd != null && zzc(zzfbs, 6)) {
            zzdng = zzdng.zzs(zzd);
        } else if (zzB != null && zzc(zzfbs, 6)) {
            zzdng = zzdng.zzad(zzB);
        } else if (zzB != null && zzc(zzfbs, 2)) {
            zzdng = zzdng.zzab(zzB);
        } else if (zzC != null && zzc(zzfbs, 6)) {
            zzdng = zzdng.zzae(zzC);
        } else if (zzC == null || !zzc(zzfbs, 1)) {
            throw new zzeio(1, "No native ad mappers");
        } else {
            zzdng = zzdng.zzac(zzC);
        }
        if (zzfbs.zza.zza.zzg.contains(Integer.toString(zzdng.zzc()))) {
            zzdni zze = this.zzb.zze(new zzcyl(zzfbs, zzfbg, zzefb.zza), new zzdns(zzdng), new zzdpg(zzC, zzB, zzd, (byte[]) null));
            ((zzegu) zzefb.zzc).zzc(zze.zzi());
            zze.zzd().zzj(new zzcti((zzfct) zzefb.zzb), this.zzc);
            return zze.zza();
        }
        throw new zzeio(1, "No corresponding native ad listener");
    }

    public final void zzb(zzfbs zzfbs, zzfbg zzfbg, zzefb zzefb) throws zzfcd {
        zzfby zzfby = zzfbs.zza.zza;
        ((zzfct) zzefb.zzb).zzo(this.zza, zzfbs.zza.zza.zzd, zzfbg.zzw.toString(), zzbu.zzl(zzfbg.zzt), (zzbuf) zzefb.zzc, zzfby.zzi, zzfby.zzg);
    }
}
