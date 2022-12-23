package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbo;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzab;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzs;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.ads.internal.overlay.zzv;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzble;
import com.google.android.gms.internal.ads.zzblk;
import com.google.android.gms.internal.ads.zzbpg;
import com.google.android.gms.internal.ads.zzbpj;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzbxk;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzcan;
import com.google.android.gms.internal.ads.zzcbd;
import com.google.android.gms.internal.ads.zzcdz;
import com.google.android.gms.internal.ads.zzcfo;
import com.google.android.gms.internal.ads.zzcnf;
import com.google.android.gms.internal.ads.zzdoa;
import com.google.android.gms.internal.ads.zzdoc;
import com.google.android.gms.internal.ads.zzdxo;
import com.google.android.gms.internal.ads.zzelg;
import com.google.android.gms.internal.ads.zzewe;
import com.google.android.gms.internal.ads.zzewf;
import com.google.android.gms.internal.ads.zzexs;
import com.google.android.gms.internal.ads.zzezl;
import com.google.android.gms.internal.ads.zzfaz;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public class ClientApi extends zzcb {
    public final zzbo zzb(IObjectWrapper iObjectWrapper, String str, zzbtz zzbtz, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return new zzelg(zzcnf.zza(context, zzbtz, i), context, str);
    }

    public final zzbs zzc(IObjectWrapper iObjectWrapper, zzq zzq, String str, zzbtz zzbtz, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzewe zzr = zzcnf.zza(context, zzbtz, i).zzr();
        zzr.zza(str);
        zzr.zzb(context);
        zzewf zzc = zzr.zzc();
        if (i >= ((Integer) zzay.zzc().zzb(zzbhy.zzej)).intValue()) {
            return zzc.zzb();
        }
        return zzc.zza();
    }

    public final zzbs zzd(IObjectWrapper iObjectWrapper, zzq zzq, String str, zzbtz zzbtz, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzexs zzs = zzcnf.zza(context, zzbtz, i).zzs();
        zzs.zzc(context);
        zzs.zza(zzq);
        zzs.zzb(str);
        return zzs.zzd().zza();
    }

    public final zzbs zze(IObjectWrapper iObjectWrapper, zzq zzq, String str, zzbtz zzbtz, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzezl zzt = zzcnf.zza(context, zzbtz, i).zzt();
        zzt.zzc(context);
        zzt.zza(zzq);
        zzt.zzb(str);
        return zzt.zzd().zza();
    }

    public final zzbs zzf(IObjectWrapper iObjectWrapper, zzq zzq, String str, int i) {
        return new zzs((Context) ObjectWrapper.unwrap(iObjectWrapper), zzq, str, new zzcfo(221310000, i, true, false));
    }

    public final zzcm zzg(IObjectWrapper iObjectWrapper, int i) {
        return zzcnf.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), (zzbtz) null, i).zzb();
    }

    public final zzble zzh(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzdoc((FrameLayout) ObjectWrapper.unwrap(iObjectWrapper), (FrameLayout) ObjectWrapper.unwrap(iObjectWrapper2), 221310000);
    }

    public final zzblk zzi(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzdoa((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    public final zzbpj zzj(IObjectWrapper iObjectWrapper, zzbtz zzbtz, int i, zzbpg zzbpg) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzdxo zzj = zzcnf.zza(context, zzbtz, i).zzj();
        zzj.zzb(context);
        zzj.zza(zzbpg);
        return zzj.zzc().zzd();
    }

    public final zzbxk zzk(IObjectWrapper iObjectWrapper, zzbtz zzbtz, int i) {
        return zzcnf.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbtz, i).zzl();
    }

    public final zzbxu zzl(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        AdOverlayInfoParcel zza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (zza == null) {
            return new zzt(activity);
        }
        int i = zza.zzk;
        if (i == 1) {
            return new zzs(activity);
        }
        if (i == 2) {
            return new zzab(activity);
        }
        if (i == 3) {
            return new zzac(activity);
        }
        if (i != 4) {
            return i != 5 ? new zzt(activity) : new zzz(activity);
        }
        return new zzv(activity, zza);
    }

    public final zzcan zzm(IObjectWrapper iObjectWrapper, zzbtz zzbtz, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfaz zzu = zzcnf.zza(context, zzbtz, i).zzu();
        zzu.zzb(context);
        return zzu.zzc().zzb();
    }

    public final zzcbd zzn(IObjectWrapper iObjectWrapper, String str, zzbtz zzbtz, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfaz zzu = zzcnf.zza(context, zzbtz, i).zzu();
        zzu.zzb(context);
        zzu.zza(str);
        return zzu.zzc().zza();
    }

    public final zzcdz zzo(IObjectWrapper iObjectWrapper, zzbtz zzbtz, int i) {
        return zzcnf.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbtz, i).zzo();
    }
}
