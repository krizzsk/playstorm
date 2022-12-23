package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzehy implements zzefg {
    private final Context zza;
    private final zzdlt zzb;
    /* access modifiers changed from: private */
    public zzbuo zzc;
    private final zzcfo zzd;

    public zzehy(Context context, zzdlt zzdlt, zzcfo zzcfo) {
        this.zza = context;
        this.zzb = zzdlt;
        this.zzd = zzcfo;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfbs zzfbs, zzfbg zzfbg, zzefb zzefb) throws zzfcd, zzeio {
        if (zzfbs.zza.zza.zzg.contains(Integer.toString(6))) {
            zzdng zzs = zzdng.zzs(this.zzc);
            if (zzfbs.zza.zza.zzg.contains(Integer.toString(zzs.zzc()))) {
                zzdni zze = this.zzb.zze(new zzcyl(zzfbs, zzfbg, zzefb.zza), new zzdns(zzs), new zzdpg((zzbul) null, (zzbuk) null, this.zzc, (byte[]) null));
                ((zzegu) zzefb.zzc).zzc(zze.zzh());
                return zze.zza();
            }
            throw new zzeio(1, "No corresponding native ad listener");
        }
        throw new zzeio(2, "Unified must be used for RTB.");
    }

    public final void zzb(zzfbs zzfbs, zzfbg zzfbg, zzefb zzefb) throws zzfcd {
        try {
            ((zzbvs) zzefb.zzb).zzp(zzfbg.zzaa);
            if (this.zzd.zzc < ((Integer) zzay.zzc().zzb(zzbhy.zzbt)).intValue()) {
                ((zzbvs) zzefb.zzb).zzl(zzfbg.zzV, zzfbg.zzw.toString(), zzfbs.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzehx(this, zzefb, (zzehw) null), (zzbuf) zzefb.zzc);
            } else {
                ((zzbvs) zzefb.zzb).zzm(zzfbg.zzV, zzfbg.zzw.toString(), zzfbs.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzehx(this, zzefb, (zzehw) null), (zzbuf) zzefb.zzc, zzfbs.zza.zza.zzi);
            }
        } catch (RemoteException e) {
            throw new zzfcd(e);
        }
    }
}
