package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzctr implements zzdbs, zzddg, zzdcm, zza, zzdci {
    /* access modifiers changed from: private */
    public final Context zza;
    private final Executor zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    /* access modifiers changed from: private */
    public final zzfbs zze;
    /* access modifiers changed from: private */
    public final zzfbg zzf;
    /* access modifiers changed from: private */
    public final zzfic zzg;
    /* access modifiers changed from: private */
    public final zzfch zzh;
    private final zzaoc zzi;
    private final zzbix zzj;
    private final zzfhq zzk;
    private final WeakReference zzl;
    private final WeakReference zzm;
    private boolean zzn;
    private final AtomicBoolean zzo = new AtomicBoolean();
    private final zzbiz zzp;

    zzctr(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzfbs zzfbs, zzfbg zzfbg, zzfic zzfic, zzfch zzfch, View view, zzcli zzcli, zzaoc zzaoc, zzbix zzbix, zzbiz zzbiz, zzfhq zzfhq, byte[] bArr) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = executor2;
        this.zzd = scheduledExecutorService;
        this.zze = zzfbs;
        this.zzf = zzfbg;
        this.zzg = zzfic;
        this.zzh = zzfch;
        this.zzi = zzaoc;
        this.zzl = new WeakReference(view);
        this.zzm = new WeakReference(zzcli);
        this.zzj = zzbix;
        this.zzp = zzbiz;
        this.zzk = zzfhq;
    }

    /* access modifiers changed from: private */
    public final void zzs() {
        int i;
        String zzh2 = ((Boolean) zzay.zzc().zzb(zzbhy.zzcE)).booleanValue() ? this.zzi.zzc().zzh(this.zza, (View) this.zzl.get(), (Activity) null) : null;
        if ((!((Boolean) zzay.zzc().zzb(zzbhy.zzal)).booleanValue() || !this.zze.zzb.zzb.zzg) && ((Boolean) zzbjn.zzh.zze()).booleanValue()) {
            if (((Boolean) zzbjn.zzg.zze()).booleanValue() && ((i = this.zzf.zzb) == 1 || i == 2 || i == 5)) {
                zzcli zzcli = (zzcli) this.zzm.get();
            }
            zzfva.zzr((zzfur) zzfva.zzo(zzfur.zzv(zzfva.zzi((Object) null)), ((Long) zzay.zzc().zzb(zzbhy.zzaP)).longValue(), TimeUnit.MILLISECONDS, this.zzd), new zzctq(this, zzh2), this.zzb);
            return;
        }
        zzfch zzfch = this.zzh;
        zzfic zzfic = this.zzg;
        zzfbs zzfbs = this.zze;
        zzfbg zzfbg = this.zzf;
        zzfch.zza(zzfic.zzb(zzfbs, zzfbg, false, zzh2, (String) null, zzfbg.zzd));
    }

    private final void zzt(int i, int i2) {
        View view;
        if (i <= 0 || !((view = (View) this.zzl.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            zzs();
        } else {
            this.zzd.schedule(new zzctk(this, i, i2), (long) i2, TimeUnit.MILLISECONDS);
        }
    }

    public final void onAdClicked() {
        if ((!((Boolean) zzay.zzc().zzb(zzbhy.zzal)).booleanValue() || !this.zze.zzb.zzb.zzg) && ((Boolean) zzbjn.zzd.zze()).booleanValue()) {
            zzfva.zzr(zzfva.zzf(zzfur.zzv(this.zzj.zza()), Throwable.class, zzctl.zza, zzcfv.zzf), new zzctp(this), this.zzb);
            return;
        }
        zzfch zzfch = this.zzh;
        zzfic zzfic = this.zzg;
        zzfbs zzfbs = this.zze;
        zzfbg zzfbg = this.zzf;
        List zza2 = zzfic.zza(zzfbs, zzfbg, zzfbg.zzc);
        int i = 1;
        if (true == zzt.zzo().zzv(this.zza)) {
            i = 2;
        }
        zzfch.zzc(zza2, i);
    }

    public final void zzbv() {
        zzfch zzfch = this.zzh;
        zzfic zzfic = this.zzg;
        zzfbs zzfbs = this.zze;
        zzfbg zzfbg = this.zzf;
        zzfch.zza(zzfic.zza(zzfbs, zzfbg, zzfbg.zzj));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzg() {
        this.zzb.execute(new zzcto(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(int i, int i2) {
        zzt(i - 1, i2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(int i, int i2) {
        this.zzb.execute(new zzctm(this, i, i2));
    }

    public final void zzj() {
    }

    public final void zzk(zze zze2) {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzbo)).booleanValue()) {
            this.zzh.zza(this.zzg.zza(this.zze, this.zzf, zzfic.zzd(2, zze2.zza, this.zzf.zzp)));
        }
    }

    public final void zzl() {
        if (this.zzo.compareAndSet(false, true)) {
            int intValue = ((Integer) zzay.zzc().zzb(zzbhy.zzcH)).intValue();
            if (intValue > 0) {
                zzt(intValue, ((Integer) zzay.zzc().zzb(zzbhy.zzcI)).intValue());
                return;
            }
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzcG)).booleanValue()) {
                this.zzc.execute(new zzctn(this));
            } else {
                zzs();
            }
        }
    }

    public final void zzm() {
    }

    public final synchronized void zzn() {
        if (this.zzn) {
            ArrayList arrayList = new ArrayList(this.zzf.zzd);
            arrayList.addAll(this.zzf.zzg);
            this.zzh.zza(this.zzg.zzb(this.zze, this.zzf, true, (String) null, (String) null, arrayList));
        } else {
            zzfch zzfch = this.zzh;
            zzfic zzfic = this.zzg;
            zzfbs zzfbs = this.zze;
            zzfbg zzfbg = this.zzf;
            zzfch.zza(zzfic.zza(zzfbs, zzfbg, zzfbg.zzn));
            zzfch zzfch2 = this.zzh;
            zzfic zzfic2 = this.zzg;
            zzfbs zzfbs2 = this.zze;
            zzfbg zzfbg2 = this.zzf;
            zzfch2.zza(zzfic2.zza(zzfbs2, zzfbg2, zzfbg2.zzg));
        }
        this.zzn = true;
    }

    public final void zzo() {
    }

    public final void zzp(zzcak zzcak, String str, String str2) {
        zzfch zzfch = this.zzh;
        zzfic zzfic = this.zzg;
        zzfbg zzfbg = this.zzf;
        zzfch.zza(zzfic.zzc(zzfbg, zzfbg.zzi, zzcak));
    }

    public final void zzr() {
        zzfch zzfch = this.zzh;
        zzfic zzfic = this.zzg;
        zzfbs zzfbs = this.zze;
        zzfbg zzfbg = this.zzf;
        zzfch.zza(zzfic.zza(zzfbs, zzfbg, zzfbg.zzh));
    }
}
