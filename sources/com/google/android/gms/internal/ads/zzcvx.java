package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzcvx extends zzcvu {
    private final Context zzc;
    private final View zzd;
    private final zzcli zze;
    private final zzfbh zzf;
    private final zzcxu zzg;
    private final zzdnr zzh;
    private final zzdjh zzi;
    private final zzgpo zzj;
    private final Executor zzk;
    private zzq zzl;

    zzcvx(zzcxv zzcxv, Context context, zzfbh zzfbh, View view, zzcli zzcli, zzcxu zzcxu, zzdnr zzdnr, zzdjh zzdjh, zzgpo zzgpo, Executor executor) {
        super(zzcxv);
        this.zzc = context;
        this.zzd = view;
        this.zze = zzcli;
        this.zzf = zzfbh;
        this.zzg = zzcxu;
        this.zzh = zzdnr;
        this.zzi = zzdjh;
        this.zzj = zzgpo;
        this.zzk = executor;
    }

    public static /* synthetic */ void zzi(zzcvx zzcvx) {
        zzdnr zzdnr = zzcvx.zzh;
        if (zzdnr.zze() != null) {
            try {
                zzdnr.zze().zze((zzbs) zzcvx.zzj.zzb(), ObjectWrapper.wrap(zzcvx.zzc));
            } catch (RemoteException e) {
                zze.zzh("RemoteException when notifyAdLoad is called", e);
            }
        }
    }

    public final void zzW() {
        this.zzk.execute(new zzcvw(this));
        super.zzW();
    }

    public final int zza() {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzgy)).booleanValue() && this.zzb.zzai) {
            if (!((Boolean) zzay.zzc().zzb(zzbhy.zzgz)).booleanValue()) {
                return 0;
            }
        }
        return this.zza.zzb.zzb.zzc;
    }

    public final View zzc() {
        return this.zzd;
    }

    public final zzdk zzd() {
        try {
            return this.zzg.zza();
        } catch (zzfcd unused) {
            return null;
        }
    }

    public final zzfbh zze() {
        zzq zzq = this.zzl;
        if (zzq != null) {
            return zzfcc.zzc(zzq);
        }
        zzfbg zzfbg = this.zzb;
        if (zzfbg.zzad) {
            for (String str : zzfbg.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            return new zzfbh(this.zzd.getWidth(), this.zzd.getHeight(), false);
        }
        return zzfcc.zzb(this.zzb.zzs, this.zzf);
    }

    public final zzfbh zzf() {
        return this.zzf;
    }

    public final void zzg() {
        this.zzi.zza();
    }

    public final void zzh(ViewGroup viewGroup, zzq zzq) {
        zzcli zzcli;
        if (viewGroup != null && (zzcli = this.zze) != null) {
            zzcli.zzai(zzcmx.zzc(zzq));
            viewGroup.setMinimumHeight(zzq.zzc);
            viewGroup.setMinimumWidth(zzq.zzf);
            this.zzl = zzq;
        }
    }
}
