package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdqy {
    private final zzfby zza;
    private final Executor zzb;
    private final zzdto zzc;
    private final zzdsj zzd;
    private final Context zze;
    private final zzdwg zzf;
    private final zzfgo zzg;
    private final zzfig zzh;
    private final zzeen zzi;

    public zzdqy(zzfby zzfby, Executor executor, zzdto zzdto, Context context, zzdwg zzdwg, zzfgo zzfgo, zzfig zzfig, zzeen zzeen, zzdsj zzdsj) {
        this.zza = zzfby;
        this.zzb = executor;
        this.zzc = zzdto;
        this.zze = context;
        this.zzf = zzdwg;
        this.zzg = zzfgo;
        this.zzh = zzfig;
        this.zzi = zzeen;
        this.zzd = zzdsj;
    }

    private final void zzh(zzcli zzcli) {
        zzi(zzcli);
        zzcli.zzaf("/video", zzbok.zzl);
        zzcli.zzaf("/videoMeta", zzbok.zzm);
        zzcli.zzaf("/precache", new zzcjv());
        zzcli.zzaf("/delayPageLoaded", zzbok.zzp);
        zzcli.zzaf("/instrument", zzbok.zzn);
        zzcli.zzaf("/log", zzbok.zzg);
        zzcli.zzaf("/click", zzbok.zza((zzdjf) null));
        if (this.zza.zzb != null) {
            zzcli.zzP().zzC(true);
            zzcli.zzaf("/open", new zzbow((zzb) null, (zzbwo) null, (zzeen) null, (zzdwg) null, (zzfgo) null));
        } else {
            zzcli.zzP().zzC(false);
        }
        if (zzt.zzn().zzu(zzcli.getContext())) {
            zzcli.zzaf("/logScionEvent", new zzbor(zzcli.getContext()));
        }
    }

    private static final void zzi(zzcli zzcli) {
        zzcli.zzaf("/videoClicked", zzbok.zzh);
        zzcli.zzP().zzE(true);
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzcO)).booleanValue()) {
            zzcli.zzaf("/getNativeAdViewSignals", zzbok.zzs);
        }
        zzcli.zzaf("/getNativeClickMeta", zzbok.zzt);
    }

    public final zzfvj zza(JSONObject jSONObject) {
        return zzfva.zzn(zzfva.zzn(zzfva.zzi((Object) null), new zzdqo(this), this.zzb), new zzdqp(this, jSONObject), this.zzb);
    }

    public final zzfvj zzb(String str, String str2, zzfbg zzfbg, zzfbj zzfbj, zzq zzq) {
        return zzfva.zzn(zzfva.zzi((Object) null), new zzdqr(this, zzq, zzfbg, zzfbj, str, str2), this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvj zzc(JSONObject jSONObject, zzcli zzcli) throws Exception {
        zzcfz zza2 = zzcfz.zza(zzcli);
        if (this.zza.zzb != null) {
            zzcli.zzai(zzcmx.zzd());
        } else {
            zzcli.zzai(zzcmx.zze());
        }
        zzcli.zzP().zzz(new zzdqn(this, zzcli, zza2));
        zzcli.zzl("google.afma.nativeAds.renderVideo", jSONObject);
        return zza2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvj zzd(zzq zzq, zzfbg zzfbg, zzfbj zzfbj, String str, String str2, Object obj) throws Exception {
        zzcli zza2 = this.zzc.zza(zzq, zzfbg, zzfbj);
        zzcfz zza3 = zzcfz.zza(zza2);
        if (this.zza.zzb != null) {
            zzh(zza2);
            zza2.zzai(zzcmx.zzd());
        } else {
            zzdsg zzb2 = this.zzd.zzb();
            zzdsg zzdsg = zzb2;
            zzcmv zzP = zza2.zzP();
            zzb zzb3 = r3;
            zzb zzb4 = new zzb(this.zze, (zzccj) null, (zzbzi) null);
            zzP.zzL(zzb2, zzdsg, zzb2, zzb2, zzb2, false, (zzboo) null, zzb3, (zzbwv) null, (zzccj) null, this.zzi, this.zzh, this.zzf, this.zzg, (zzbom) null, zzb2);
            zzi(zza2);
        }
        zza2.zzP().zzz(new zzdqs(this, zza2, zza3));
        zza2.zzad(str, str2, (String) null);
        return zza3;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvj zze(Object obj) throws Exception {
        zzcli zza2 = this.zzc.zza(zzq.zzc(), (zzfbg) null, (zzfbj) null);
        zzcfz zza3 = zzcfz.zza(zza2);
        zzh(zza2);
        zza2.zzP().zzF(new zzdqq(zza3));
        zza2.loadUrl((String) zzay.zzc().zzb(zzbhy.zzcN));
        return zza3;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzcli zzcli, zzcfz zzcfz, boolean z) {
        if (!(this.zza.zza == null || zzcli.zzs() == null)) {
            zzcli.zzs().zzs(this.zza.zza);
        }
        zzcfz.zzb();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(zzcli zzcli, zzcfz zzcfz, boolean z) {
        if (z) {
            if (!(this.zza.zza == null || zzcli.zzs() == null)) {
                zzcli.zzs().zzs(this.zza.zza);
            }
            zzcfz.zzb();
            return;
        }
        zzcfz.zze(new zzeio(1, "Html video Web View failed to load."));
    }
}
