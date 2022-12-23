package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbf;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzexq implements zzems {
    private final Context zza;
    /* access modifiers changed from: private */
    public final Executor zzb;
    private final zzcnf zzc;
    /* access modifiers changed from: private */
    public final zzemc zzd;
    /* access modifiers changed from: private */
    public final zzemg zze;
    /* access modifiers changed from: private */
    public final ViewGroup zzf;
    private zzbit zzg;
    /* access modifiers changed from: private */
    public final zzdeh zzh;
    /* access modifiers changed from: private */
    public final zzfhs zzi;
    /* access modifiers changed from: private */
    public final zzdgn zzj;
    private final zzfbw zzk;
    /* access modifiers changed from: private */
    public zzfvj zzl;

    public zzexq(Context context, Executor executor, zzq zzq, zzcnf zzcnf, zzemc zzemc, zzemg zzemg, zzfbw zzfbw, zzdgn zzdgn) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcnf;
        this.zzd = zzemc;
        this.zze = zzemg;
        this.zzk = zzfbw;
        this.zzh = zzcnf.zzf();
        this.zzi = zzcnf.zzy();
        this.zzf = new FrameLayout(context);
        this.zzj = zzdgn;
        zzfbw.zzr(zzq);
    }

    public final boolean zza() {
        zzfvj zzfvj = this.zzl;
        return zzfvj != null && !zzfvj.isDone();
    }

    public final boolean zzb(zzl zzl2, String str, zzemq zzemq, zzemr zzemr) throws RemoteException {
        zzcwr zzcwr;
        zzfhq zzfhq;
        zzfhg zzb2 = zzfhf.zzb(this.zza, 7, 3, zzl2);
        if (str == null) {
            zze.zzg("Ad unit ID should not be null for banner ad.");
            this.zzb.execute(new zzexm(this));
            return false;
        } else if (zza()) {
            return false;
        } else {
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzhr)).booleanValue() && zzl2.zzf) {
                this.zzc.zzk().zzl(true);
            }
            zzfbw zzfbw = this.zzk;
            zzfbw.zzs(str);
            zzfbw.zzE(zzl2);
            zzfby zzG = zzfbw.zzG();
            if (!((Boolean) zzbjt.zzc.zze()).booleanValue() || !this.zzk.zzg().zzk) {
                if (((Boolean) zzay.zzc().zzb(zzbhy.zzgL)).booleanValue()) {
                    zzcwq zze2 = this.zzc.zze();
                    zzdbc zzdbc = new zzdbc();
                    zzdbc.zzc(this.zza);
                    zzdbc.zzf(zzG);
                    zze2.zzi(zzdbc.zzg());
                    zzdhc zzdhc = new zzdhc();
                    zzdhc.zzj(this.zzd, this.zzb);
                    zzdhc.zzk(this.zzd, this.zzb);
                    zze2.zzf(zzdhc.zzn());
                    zze2.zze(new zzekm(this.zzg));
                    zze2.zzd(new zzdlo(zzdnr.zza, (zzbf) null));
                    zze2.zzg(new zzcxo(this.zzh, this.zzj));
                    zze2.zzc(new zzcvr(this.zzf));
                    zzcwr = zze2.zzj();
                } else {
                    zzcwq zze3 = this.zzc.zze();
                    zzdbc zzdbc2 = new zzdbc();
                    zzdbc2.zzc(this.zza);
                    zzdbc2.zzf(zzG);
                    zze3.zzi(zzdbc2.zzg());
                    zzdhc zzdhc2 = new zzdhc();
                    zzdhc2.zzj(this.zzd, this.zzb);
                    zzdhc2.zza(this.zzd, this.zzb);
                    zzdhc2.zza(this.zze, this.zzb);
                    zzdhc2.zzl(this.zzd, this.zzb);
                    zzdhc2.zzd(this.zzd, this.zzb);
                    zzdhc2.zze(this.zzd, this.zzb);
                    zzdhc2.zzf(this.zzd, this.zzb);
                    zzdhc2.zzb(this.zzd, this.zzb);
                    zzdhc2.zzk(this.zzd, this.zzb);
                    zzdhc2.zzi(this.zzd, this.zzb);
                    zze3.zzf(zzdhc2.zzn());
                    zze3.zze(new zzekm(this.zzg));
                    zze3.zzd(new zzdlo(zzdnr.zza, (zzbf) null));
                    zze3.zzg(new zzcxo(this.zzh, this.zzj));
                    zze3.zzc(new zzcvr(this.zzf));
                    zzcwr = zze3.zzj();
                }
                zzcwr zzcwr2 = zzcwr;
                if (((Boolean) zzbjh.zzc.zze()).booleanValue()) {
                    zzfhq zzj2 = zzcwr2.zzj();
                    zzj2.zzh(3);
                    zzj2.zzb(zzl2.zzp);
                    zzfhq = zzj2;
                } else {
                    zzfhq = null;
                }
                zzcyz zzd2 = zzcwr2.zzd();
                zzfvj zzh2 = zzd2.zzh(zzd2.zzi());
                this.zzl = zzh2;
                zzfva.zzr(zzh2, new zzexp(this, zzemr, zzfhq, zzb2, zzcwr2), this.zzb);
                return true;
            }
            zzemc zzemc = this.zzd;
            if (zzemc != null) {
                zzemc.zza(zzfcx.zzd(7, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
            }
            return false;
        }
    }

    public final ViewGroup zzd() {
        return this.zzf;
    }

    public final zzfbw zzi() {
        return this.zzk;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm() {
        this.zzd.zza(zzfcx.zzd(6, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
    }

    public final void zzn() {
        this.zzh.zzd(this.zzj.zzc());
    }

    public final void zzo(zzbc zzbc) {
        this.zze.zza(zzbc);
    }

    public final void zzp(zzdei zzdei) {
        this.zzh.zzj(zzdei, this.zzb);
    }

    public final void zzq(zzbit zzbit) {
        this.zzg = zzbit;
    }

    public final boolean zzr() {
        ViewParent parent = this.zzf.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        zzt.zzp();
        return zzs.zzR(view, view.getContext());
    }
}
