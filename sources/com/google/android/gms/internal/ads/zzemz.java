package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzemz implements zzems {
    private final zzfbw zza;
    /* access modifiers changed from: private */
    public final zzcnf zzb;
    private final Context zzc;
    /* access modifiers changed from: private */
    public final zzemp zzd;
    /* access modifiers changed from: private */
    public final zzfhs zze;
    private zzcyk zzf;

    public zzemz(zzcnf zzcnf, Context context, zzemp zzemp, zzfbw zzfbw) {
        this.zzb = zzcnf;
        this.zzc = context;
        this.zzd = zzemp;
        this.zza = zzfbw;
        this.zze = zzcnf.zzy();
        zzfbw.zzu(zzemp.zzd());
    }

    public final boolean zza() {
        zzcyk zzcyk = this.zzf;
        return zzcyk != null && zzcyk.zzf();
    }

    public final boolean zzb(zzl zzl, String str, zzemq zzemq, zzemr zzemr) throws RemoteException {
        zzfhq zzfhq;
        zzfhg zzb2 = zzfhf.zzb(this.zzc, 7, 8, zzl);
        zzt.zzp();
        if (zzs.zzD(this.zzc) && zzl.zzs == null) {
            zze.zzg("Failed to load the ad because app ID is missing.");
            this.zzb.zzA().execute(new zzemu(this));
            return false;
        } else if (str == null) {
            zze.zzg("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzA().execute(new zzemv(this));
            return false;
        } else {
            zzfcs.zza(this.zzc, zzl.zzf);
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzhr)).booleanValue() && zzl.zzf) {
                this.zzb.zzk().zzl(true);
            }
            int i = ((zzemt) zzemq).zza;
            zzfbw zzfbw = this.zza;
            zzfbw.zzE(zzl);
            zzfbw.zzz(i);
            zzfby zzG = zzfbw.zzG();
            zzbz zzbz = zzG.zzn;
            if (zzbz != null) {
                this.zzd.zzd().zzi(zzbz);
            }
            zzdls zzh = this.zzb.zzh();
            zzdbc zzdbc = new zzdbc();
            zzdbc.zzc(this.zzc);
            zzdbc.zzf(zzG);
            zzh.zzf(zzdbc.zzg());
            zzdhc zzdhc = new zzdhc();
            zzdhc.zzk(this.zzd.zzd(), this.zzb.zzA());
            zzh.zze(zzdhc.zzn());
            zzh.zzd(this.zzd.zzc());
            zzh.zzc(new zzcvr((ViewGroup) null));
            zzdlt zzg = zzh.zzg();
            if (((Boolean) zzbjh.zzc.zze()).booleanValue()) {
                zzfhq zzf2 = zzg.zzf();
                zzf2.zzh(8);
                zzf2.zzb(zzl.zzp);
                zzfhq = zzf2;
            } else {
                zzfhq = null;
            }
            this.zzb.zzw().zzc(1);
            zzfvk zzfvk = zzcfv.zza;
            zzgqc.zzb(zzfvk);
            ScheduledExecutorService zzB = this.zzb.zzB();
            zzcyz zza2 = zzg.zza();
            zzcyk zzcyk = new zzcyk(zzfvk, zzB, zza2.zzh(zza2.zzi()));
            this.zzf = zzcyk;
            zzcyk.zze(new zzemy(this, zzemr, zzfhq, zzb2, zzg));
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf() {
        this.zzd.zza().zza(zzfcx.zzd(4, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzg() {
        this.zzd.zza().zza(zzfcx.zzd(6, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
    }
}
