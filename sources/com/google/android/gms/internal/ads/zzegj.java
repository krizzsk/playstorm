package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzegj implements zzefg {
    private final Context zza;
    private final zzcwr zzb;
    /* access modifiers changed from: private */
    public View zzc;
    /* access modifiers changed from: private */
    public zzbui zzd;

    public zzegj(Context context, zzcwr zzcwr) {
        this.zza = context;
        this.zzb = zzcwr;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfbs zzfbs, zzfbg zzfbg, zzefb zzefb) throws zzfcd, zzeio {
        View view;
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzgy)).booleanValue() || !zzfbg.zzai) {
            view = this.zzc;
        } else {
            try {
                view = (View) ObjectWrapper.unwrap(this.zzd.zze());
                boolean zzf = this.zzd.zzf();
                if (view == null) {
                    throw new zzfcd(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                } else if (zzf) {
                    try {
                        view = (View) zzfva.zzn(zzfva.zzi((Object) null), new zzegf(this, view, zzfbg), zzcfv.zze).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzfcd(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zzfcd(e2);
            }
        }
        zzcvv zza2 = this.zzb.zza(new zzcyl(zzfbs, zzfbg, zzefb.zza), new zzcwb(view, (zzcli) null, new zzegg(zzefb), (zzfbh) zzfbg.zzv.get(0)));
        zza2.zzg().zza(view);
        ((zzegu) zzefb.zzc).zzc(zza2.zzh());
        return zza2.zza();
    }

    public final void zzb(zzfbs zzfbs, zzfbg zzfbg, zzefb zzefb) throws zzfcd {
        try {
            ((zzbvs) zzefb.zzb).zzp(zzfbg.zzaa);
            if (!((Boolean) zzay.zzc().zzb(zzbhy.zzgy)).booleanValue() || !zzfbg.zzai) {
                ((zzbvs) zzefb.zzb).zzi(zzfbg.zzV, zzfbg.zzw.toString(), zzfbs.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzegi(this, zzefb, (zzegh) null), (zzbuf) zzefb.zzc, zzfbs.zza.zza.zze);
            } else {
                ((zzbvs) zzefb.zzb).zzj(zzfbg.zzV, zzfbg.zzw.toString(), zzfbs.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzegi(this, zzefb, (zzegh) null), (zzbuf) zzefb.zzc, zzfbs.zza.zza.zze);
            }
        } catch (RemoteException e) {
            throw new zzfcd(e);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvj zzc(View view, zzfbg zzfbg, Object obj) throws Exception {
        return zzfva.zzi(zzcxi.zza(this.zza, view, zzfbg));
    }
}
