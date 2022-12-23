package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfat implements zzems {
    private final Context zza;
    /* access modifiers changed from: private */
    public final Executor zzb;
    private final zzcnf zzc;
    /* access modifiers changed from: private */
    public final zzfaj zzd;
    /* access modifiers changed from: private */
    public final zzeyv zze;
    private final zzfbt zzf;
    /* access modifiers changed from: private */
    public final zzfhs zzg;
    private final zzfbw zzh;
    private zzfvj zzi;

    public zzfat(Context context, Executor executor, zzcnf zzcnf, zzeyv zzeyv, zzfaj zzfaj, zzfbw zzfbw, zzfbt zzfbt) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcnf;
        this.zze = zzeyv;
        this.zzd = zzfaj;
        this.zzh = zzfbw;
        this.zzf = zzfbt;
        this.zzg = zzcnf.zzy();
    }

    /* access modifiers changed from: private */
    public final zzdsw zzk(zzeyt zzeyt) {
        zzfas zzfas = (zzfas) zzeyt;
        zzdsw zzi2 = this.zzc.zzi();
        zzdbc zzdbc = new zzdbc();
        zzdbc.zzc(this.zza);
        zzdbc.zzf(zzfas.zza);
        String str = zzfas.zzb;
        zzdbc.zze(this.zzf);
        zzi2.zzd(zzdbc.zzg());
        zzi2.zzc(new zzdhc().zzn());
        return zzi2;
    }

    public final boolean zza() {
        throw null;
    }

    public final boolean zzb(zzl zzl, String str, zzemq zzemq, zzemr zzemr) throws RemoteException {
        zzfhq zzfhq;
        zzcar zzcar = new zzcar(zzl, str);
        zzfhg zzb2 = zzfhf.zzb(this.zza, 7, 5, zzcar.zza);
        if (zzcar.zzb == null) {
            zze.zzg("Ad unit ID should not be null for rewarded video ad.");
            this.zzb.execute(new zzfam(this));
        } else {
            zzfvj zzfvj = this.zzi;
            if (zzfvj == null || zzfvj.isDone()) {
                if (((Boolean) zzbjh.zzc.zze()).booleanValue()) {
                    zzeyv zzeyv = this.zze;
                    if (zzeyv.zzd() != null) {
                        zzfhq zzh2 = ((zzdsx) zzeyv.zzd()).zzh();
                        zzh2.zzh(5);
                        zzh2.zzb(zzcar.zza.zzp);
                        zzfhq = zzh2;
                        zzfcs.zza(this.zza, zzcar.zza.zzf);
                        if (((Boolean) zzay.zzc().zzb(zzbhy.zzhr)).booleanValue() && zzcar.zza.zzf) {
                            this.zzc.zzk().zzl(true);
                        }
                        zzfbw zzfbw = this.zzh;
                        zzfbw.zzs(zzcar.zzb);
                        zzfbw.zzr(zzq.zzd());
                        zzfbw.zzE(zzcar.zza);
                        zzfby zzG = zzfbw.zzG();
                        zzfas zzfas = new zzfas((zzfar) null);
                        zzfas.zza = zzG;
                        zzfas.zzb = null;
                        zzfvj zzc2 = this.zze.zzc(new zzeyw(zzfas, (zzbzu) null), new zzfan(this), (Object) null);
                        this.zzi = zzc2;
                        zzfva.zzr(zzc2, new zzfaq(this, zzemr, zzfhq, zzb2, zzfas), this.zzb);
                        return true;
                    }
                }
                zzfhq = null;
                zzfcs.zza(this.zza, zzcar.zza.zzf);
                this.zzc.zzk().zzl(true);
                zzfbw zzfbw2 = this.zzh;
                zzfbw2.zzs(zzcar.zzb);
                zzfbw2.zzr(zzq.zzd());
                zzfbw2.zzE(zzcar.zza);
                zzfby zzG2 = zzfbw2.zzG();
                zzfas zzfas2 = new zzfas((zzfar) null);
                zzfas2.zza = zzG2;
                zzfas2.zzb = null;
                zzfvj zzc22 = this.zze.zzc(new zzeyw(zzfas2, (zzbzu) null), new zzfan(this), (Object) null);
                this.zzi = zzc22;
                zzfva.zzr(zzc22, new zzfaq(this, zzemr, zzfhq, zzb2, zzfas2), this.zzb);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzi() {
        this.zzd.zza(zzfcx.zzd(6, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
    }

    /* access modifiers changed from: package-private */
    public final void zzj(int i) {
        this.zzh.zzo().zza(i);
    }
}
