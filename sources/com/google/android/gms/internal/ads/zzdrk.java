package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdrk extends zzblt {
    private final Context zza;
    private final zzdng zzb;
    private zzdog zzc;
    /* access modifiers changed from: private */
    public zzdnb zzd;

    public zzdrk(Context context, zzdng zzdng, zzdog zzdog, zzdnb zzdnb) {
        this.zza = context;
        this.zzb = zzdng;
        this.zzc = zzdog;
        this.zzd = zzdnb;
    }

    public final zzdk zze() {
        return this.zzb.zzj();
    }

    public final zzbla zzf(String str) {
        return (zzbla) this.zzb.zzh().get(str);
    }

    public final IObjectWrapper zzg() {
        return ObjectWrapper.wrap(this.zza);
    }

    public final String zzh() {
        return this.zzb.zzy();
    }

    public final String zzi(String str) {
        return (String) this.zzb.zzi().get(str);
    }

    public final List zzj() {
        SimpleArrayMap zzh = this.zzb.zzh();
        SimpleArrayMap zzi = this.zzb.zzi();
        String[] strArr = new String[(zzh.size() + zzi.size())];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < zzh.size()) {
            strArr[i3] = (String) zzh.keyAt(i2);
            i2++;
            i3++;
        }
        while (i < zzi.size()) {
            strArr[i3] = (String) zzi.keyAt(i);
            i++;
            i3++;
        }
        return Arrays.asList(strArr);
    }

    public final void zzk() {
        zzdnb zzdnb = this.zzd;
        if (zzdnb != null) {
            zzdnb.zzV();
        }
        this.zzd = null;
        this.zzc = null;
    }

    public final void zzl() {
        String zzA = this.zzb.zzA();
        if ("Google".equals(zzA)) {
            zze.zzj("Illegal argument specified for omid partner name.");
        } else if (TextUtils.isEmpty(zzA)) {
            zze.zzj("Not starting OMID session. OM partner name has not been configured.");
        } else {
            zzdnb zzdnb = this.zzd;
            if (zzdnb != null) {
                zzdnb.zzq(zzA, false);
            }
        }
    }

    public final void zzm(String str) {
        zzdnb zzdnb = this.zzd;
        if (zzdnb != null) {
            zzdnb.zzy(str);
        }
    }

    public final void zzn() {
        zzdnb zzdnb = this.zzd;
        if (zzdnb != null) {
            zzdnb.zzB();
        }
    }

    public final void zzo(IObjectWrapper iObjectWrapper) {
        zzdnb zzdnb;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if ((unwrap instanceof View) && this.zzb.zzu() != null && (zzdnb = this.zzd) != null) {
            zzdnb.zzC((View) unwrap);
        }
    }

    public final boolean zzp() {
        zzdnb zzdnb = this.zzd;
        if ((zzdnb == null || zzdnb.zzO()) && this.zzb.zzq() != null && this.zzb.zzr() == null) {
            return true;
        }
        return false;
    }

    public final boolean zzq(IObjectWrapper iObjectWrapper) {
        zzdog zzdog;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof ViewGroup) || (zzdog = this.zzc) == null || !zzdog.zzf((ViewGroup) unwrap)) {
            return false;
        }
        this.zzb.zzr().zzaq(new zzdrj(this));
        return true;
    }

    public final boolean zzr() {
        IObjectWrapper zzu = this.zzb.zzu();
        if (zzu != null) {
            zzt.zzh().zzd(zzu);
            if (this.zzb.zzq() == null) {
                return true;
            }
            this.zzb.zzq().zzd("onSdkLoaded", new ArrayMap());
            return true;
        }
        zze.zzj("Trying to start OMID session before creation.");
        return false;
    }
}
