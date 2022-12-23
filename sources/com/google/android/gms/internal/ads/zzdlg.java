package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdlg implements zzddg, zzo {
    IObjectWrapper zza;
    private final Context zzb;
    private final zzcli zzc;
    private final zzfbg zzd;
    private final zzcfo zze;
    private final zzbdv zzf;

    public zzdlg(Context context, zzcli zzcli, zzfbg zzfbg, zzcfo zzcfo, zzbdv zzbdv) {
        this.zzb = context;
        this.zzc = zzcli;
        this.zzd = zzfbg;
        this.zze = zzcfo;
        this.zzf = zzbdv;
    }

    public final void zzb() {
        zzcli zzcli;
        if (this.zza != null && (zzcli = this.zzc) != null) {
            zzcli.zzd("onSdkImpression", new ArrayMap());
        }
    }

    public final void zzbC() {
    }

    public final void zzbK() {
    }

    public final void zzbr() {
    }

    public final void zze() {
    }

    public final void zzf(int i) {
        this.zza = null;
    }

    public final void zzn() {
        zzbxp zzbxp;
        zzbxq zzbxq;
        zzbxq zzbxq2;
        zzbdv zzbdv;
        if ((this.zzf == zzbdv.REWARD_BASED_VIDEO_AD || (zzbdv = this.zzf) == zzbdv.INTERSTITIAL || zzbdv == zzbdv.APP_OPEN) && this.zzd.zzU && this.zzc != null && zzt.zzh().zze(this.zzb)) {
            zzcfo zzcfo = this.zze;
            String str = zzcfo.zzb + "." + zzcfo.zzc;
            String zza2 = this.zzd.zzW.zza();
            if (this.zzd.zzW.zzb() == 1) {
                zzbxp = zzbxp.zzc;
                zzbxq = zzbxq.DEFINED_BY_JAVASCRIPT;
            } else {
                if (this.zzd.zzZ == 2) {
                    zzbxq2 = zzbxq.UNSPECIFIED;
                } else {
                    zzbxq2 = zzbxq.BEGIN_TO_RENDER;
                }
                zzbxq = zzbxq2;
                zzbxp = zzbxp.HTML_DISPLAY;
            }
            IObjectWrapper zza3 = zzt.zzh().zza(str, this.zzc.zzI(), "", "javascript", zza2, zzbxq, zzbxp, this.zzd.zzan);
            this.zza = zza3;
            if (zza3 != null) {
                zzt.zzh().zzc(this.zza, (View) this.zzc);
                this.zzc.zzar(this.zza);
                zzt.zzh().zzd(this.zza);
                this.zzc.zzd("onSdkLoaded", new ArrayMap());
            }
        }
    }
}
