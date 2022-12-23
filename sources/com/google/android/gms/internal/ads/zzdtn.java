package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzb;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdtn {
    private final zzdbq zza;
    private final zzdjd zzb;
    /* access modifiers changed from: private */
    public final zzdcz zzc;
    private final zzddm zzd;
    private final zzddy zze;
    private final zzdgl zzf;
    private final Executor zzg;
    private final zzdja zzh;
    private final zzcuc zzi;
    private final zzb zzj;
    private final zzccj zzk;
    private final zzaoc zzl;
    /* access modifiers changed from: private */
    public final zzdgc zzm;
    private final zzeen zzn;
    private final zzfig zzo;
    private final zzdwg zzp;
    private final zzfgo zzq;

    public zzdtn(zzdbq zzdbq, zzdcz zzdcz, zzddm zzddm, zzddy zzddy, zzdgl zzdgl, Executor executor, zzdja zzdja, zzcuc zzcuc, zzb zzb2, zzccj zzccj, zzaoc zzaoc, zzdgc zzdgc, zzeen zzeen, zzfig zzfig, zzdwg zzdwg, zzfgo zzfgo, zzdjd zzdjd) {
        this.zza = zzdbq;
        this.zzc = zzdcz;
        this.zzd = zzddm;
        this.zze = zzddy;
        this.zzf = zzdgl;
        this.zzg = executor;
        this.zzh = zzdja;
        this.zzi = zzcuc;
        this.zzj = zzb2;
        this.zzk = zzccj;
        this.zzl = zzaoc;
        this.zzm = zzdgc;
        this.zzn = zzeen;
        this.zzo = zzfig;
        this.zzp = zzdwg;
        this.zzq = zzfgo;
        this.zzb = zzdjd;
    }

    public static final zzfvj zzj(zzcli zzcli, String str, String str2) {
        zzcga zzcga = new zzcga();
        zzcli.zzP().zzz(new zzdtl(zzcga));
        zzcli.zzad(str, str2, (String) null);
        return zzcga;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc() {
        this.zza.onAdClicked();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(String str, String str2) {
        this.zzf.zzbD(str, str2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze() {
        this.zzc.zzb();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(View view) {
        this.zzj.zza();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(zzcli zzcli, zzcli zzcli2, Map map) {
        this.zzi.zzh(zzcli);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean zzh(View view, MotionEvent motionEvent) {
        this.zzj.zza();
        return false;
    }

    public final void zzi(zzcli zzcli, boolean z, zzboo zzboo) {
        zzany zzc2;
        zzcli zzcli2 = zzcli;
        zzcmv zzP = zzcli.zzP();
        zzdte zzdte = r4;
        zzdte zzdte2 = new zzdte(this);
        zzddm zzddm = this.zzd;
        zzddy zzddy = this.zze;
        zzdtf zzdtf = r7;
        zzdtf zzdtf2 = new zzdtf(this);
        zzdtg zzdtg = r10;
        zzdtg zzdtg2 = new zzdtg(this);
        zzb zzb2 = this.zzj;
        zzdtm zzdtm = r12;
        zzdtm zzdtm2 = new zzdtm(this);
        zzP.zzL(zzdte, zzddm, zzddy, zzdtf, zzdtg, z, zzboo, zzb2, zzdtm, this.zzk, this.zzn, this.zzo, this.zzp, this.zzq, (zzbom) null, this.zzb);
        zzcli zzcli3 = zzcli;
        zzcli3.setOnTouchListener(new zzdth(this));
        zzcli3.setOnClickListener(new zzdti(this));
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzcf)).booleanValue() && (zzc2 = this.zzl.zzc()) != null) {
            zzc2.zzn((View) zzcli3);
        }
        this.zzh.zzj(zzcli3, this.zzg);
        this.zzh.zzj(new zzdtj(zzcli3), this.zzg);
        this.zzh.zza((View) zzcli3);
        zzcli3.zzaf("/trackActiveViewUnit", new zzdtk(this, zzcli3));
        this.zzi.zzi(zzcli3);
    }
}
