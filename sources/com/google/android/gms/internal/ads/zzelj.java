package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbf;
import com.google.android.gms.ads.internal.client.zzbi;
import com.google.android.gms.ads.internal.client.zzbr;
import com.google.android.gms.ads.internal.client.zzbw;
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzcg;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzdo;
import com.google.android.gms.ads.internal.client.zzfg;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzelj extends zzbr implements zzdei {
    private final Context zza;
    private final zzexq zzb;
    private final String zzc;
    private final zzemc zzd;
    private zzq zze;
    private final zzfbw zzf;
    private final zzcfo zzg;
    /* access modifiers changed from: private */
    public zzcvu zzh;

    public zzelj(Context context, zzq zzq, String str, zzexq zzexq, zzemc zzemc, zzcfo zzcfo) {
        this.zza = context;
        this.zzb = zzexq;
        this.zze = zzq;
        this.zzc = str;
        this.zzd = zzemc;
        this.zzf = zzexq.zzi();
        this.zzg = zzcfo;
        zzexq.zzp(this);
    }

    private final synchronized void zze(zzq zzq) {
        this.zzf.zzr(zzq);
        this.zzf.zzw(this.zze.zzn);
    }

    private final synchronized boolean zzf(zzl zzl) throws RemoteException {
        if (zzh()) {
            Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        }
        zzt.zzp();
        if (!zzs.zzD(this.zza) || zzl.zzs != null) {
            zzfcs.zza(this.zza, zzl.zzf);
            return this.zzb.zzb(zzl, this.zzc, (zzemq) null, new zzeli(this));
        }
        zze.zzg("Failed to load the ad because app ID is missing.");
        zzemc zzemc = this.zzd;
        if (zzemc != null) {
            zzemc.zza(zzfcx.zzd(4, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
        }
        return false;
    }

    private final boolean zzh() {
        boolean z;
        if (((Boolean) zzbjm.zze.zze()).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbhy.zziq)).booleanValue()) {
                z = true;
                return this.zzg.zzc >= ((Integer) zzay.zzc().zzb(zzbhy.zzir)).intValue() || !z;
            }
        }
        z = false;
        if (this.zzg.zzc >= ((Integer) zzay.zzc().zzb(zzbhy.zzir)).intValue()) {
        }
    }

    public final synchronized void zzA() {
        Preconditions.checkMainThread("recordManualImpression must be called on the main UI thread.");
        zzcvu zzcvu = this.zzh;
        if (zzcvu != null) {
            zzcvu.zzg();
        }
    }

    public final synchronized void zzB() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        zzcvu zzcvu = this.zzh;
        if (zzcvu != null) {
            zzcvu.zzm().zzc((Context) null);
        }
    }

    public final void zzC(zzbc zzbc) {
        if (zzh()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzb.zzo(zzbc);
    }

    public final void zzD(zzbf zzbf) {
        if (zzh()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzd.zze(zzbf);
    }

    public final void zzE(zzbw zzbw) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    public final synchronized void zzF(zzq zzq) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        this.zzf.zzr(zzq);
        this.zze = zzq;
        zzcvu zzcvu = this.zzh;
        if (zzcvu != null) {
            zzcvu.zzh(this.zzb.zzd(), zzq);
        }
    }

    public final void zzG(zzbz zzbz) {
        if (zzh()) {
            Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        }
        this.zzd.zzi(zzbz);
    }

    public final void zzH(zzbci zzbci) {
    }

    public final void zzI(zzw zzw) {
    }

    public final void zzJ(zzcg zzcg) {
    }

    public final void zzK(zzdo zzdo) {
    }

    public final void zzL(boolean z) {
    }

    public final void zzM(zzbyd zzbyd) {
    }

    public final synchronized void zzN(boolean z) {
        if (zzh()) {
            Preconditions.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
        }
        this.zzf.zzy(z);
    }

    public final synchronized void zzO(zzbit zzbit) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzb.zzq(zzbit);
    }

    public final void zzP(zzde zzde) {
        if (zzh()) {
            Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        }
        this.zzd.zzh(zzde);
    }

    public final void zzQ(zzbyg zzbyg, String str) {
    }

    public final void zzR(String str) {
    }

    public final void zzS(zzcaq zzcaq) {
    }

    public final void zzT(String str) {
    }

    public final synchronized void zzU(zzfg zzfg) {
        if (zzh()) {
            Preconditions.checkMainThread("setVideoOptions must be called on the main UI thread.");
        }
        this.zzf.zzF(zzfg);
    }

    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    public final void zzX() {
    }

    public final synchronized boolean zzY() {
        return this.zzb.zza();
    }

    public final boolean zzZ() {
        return false;
    }

    public final synchronized void zza() {
        if (this.zzb.zzr()) {
            zzq zzg2 = this.zzf.zzg();
            zzcvu zzcvu = this.zzh;
            if (!(zzcvu == null || zzcvu.zzf() == null || !this.zzf.zzO())) {
                zzg2 = zzfcc.zza(this.zza, Collections.singletonList(this.zzh.zzf()));
            }
            zze(zzg2);
            try {
                zzf(this.zzf.zze());
            } catch (RemoteException unused) {
                zze.zzj("Failed to refresh the banner ad.");
            }
        } else {
            this.zzb.zzn();
        }
    }

    public final synchronized boolean zzaa(zzl zzl) throws RemoteException {
        zze(this.zze);
        return zzf(zzl);
    }

    public final synchronized void zzab(zzcd zzcd) {
        Preconditions.checkMainThread("setCorrelationIdProvider must be called on the main UI thread");
        this.zzf.zzQ(zzcd);
    }

    public final Bundle zzd() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    public final synchronized zzq zzg() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        zzcvu zzcvu = this.zzh;
        if (zzcvu != null) {
            return zzfcc.zza(this.zza, Collections.singletonList(zzcvu.zze()));
        }
        return this.zzf.zzg();
    }

    public final zzbf zzi() {
        return this.zzd.zzc();
    }

    public final zzbz zzj() {
        return this.zzd.zzd();
    }

    public final synchronized zzdh zzk() {
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzfJ)).booleanValue()) {
            return null;
        }
        zzcvu zzcvu = this.zzh;
        if (zzcvu == null) {
            return null;
        }
        return zzcvu.zzl();
    }

    public final synchronized zzdk zzl() {
        Preconditions.checkMainThread("getVideoController must be called from the main thread.");
        zzcvu zzcvu = this.zzh;
        if (zzcvu == null) {
            return null;
        }
        return zzcvu.zzd();
    }

    public final IObjectWrapper zzn() {
        if (zzh()) {
            Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        }
        return ObjectWrapper.wrap(this.zzb.zzd());
    }

    public final synchronized String zzr() {
        return this.zzc;
    }

    public final synchronized String zzs() {
        zzcvu zzcvu = this.zzh;
        if (zzcvu == null || zzcvu.zzl() == null) {
            return null;
        }
        return zzcvu.zzl().zzg();
    }

    public final synchronized String zzt() {
        zzcvu zzcvu = this.zzh;
        if (zzcvu == null || zzcvu.zzl() == null) {
            return null;
        }
        return zzcvu.zzl().zzg();
    }

    public final synchronized void zzx() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzcvu zzcvu = this.zzh;
        if (zzcvu != null) {
            zzcvu.zzV();
        }
    }

    public final void zzy(zzl zzl, zzbi zzbi) {
    }

    public final synchronized void zzz() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        zzcvu zzcvu = this.zzh;
        if (zzcvu != null) {
            zzcvu.zzm().zzb((Context) null);
        }
    }
}
