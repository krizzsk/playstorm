package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdb;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfax extends zzcbc {
    private final zzfat zza;
    private final zzfaj zzb;
    private final String zzc;
    private final zzfbt zzd;
    private final Context zze;
    private final zzcfo zzf;
    /* access modifiers changed from: private */
    public zzdss zzg;
    private boolean zzh = ((Boolean) zzay.zzc().zzb(zzbhy.zzaA)).booleanValue();

    public zzfax(String str, zzfat zzfat, Context context, zzfaj zzfaj, zzfbt zzfbt, zzcfo zzcfo) {
        this.zzc = str;
        this.zza = zzfat;
        this.zzb = zzfaj;
        this.zzd = zzfbt;
        this.zze = context;
        this.zzf = zzcfo;
    }

    private final synchronized void zzt(zzl zzl, zzcbk zzcbk, int i) throws RemoteException {
        boolean z = false;
        if (((Boolean) zzbjm.zzi.zze()).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbhy.zziq)).booleanValue()) {
                z = true;
            }
        }
        if (this.zzf.zzc < ((Integer) zzay.zzc().zzb(zzbhy.zzir)).intValue() || !z) {
            Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        }
        this.zzb.zze(zzcbk);
        zzt.zzp();
        if (zzs.zzD(this.zze)) {
            if (zzl.zzs == null) {
                zze.zzg("Failed to load the ad because app ID is missing.");
                this.zzb.zza(zzfcx.zzd(4, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
                return;
            }
        }
        if (this.zzg == null) {
            zzfal zzfal = new zzfal((String) null);
            this.zza.zzj(i);
            this.zza.zzb(zzl, this.zzc, zzfal, new zzfaw(this));
        }
    }

    public final Bundle zzb() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdss zzdss = this.zzg;
        return zzdss != null ? zzdss.zza() : new Bundle();
    }

    public final zzdh zzc() {
        zzdss zzdss;
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzfJ)).booleanValue() && (zzdss = this.zzg) != null) {
            return zzdss.zzl();
        }
        return null;
    }

    public final zzcba zzd() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdss zzdss = this.zzg;
        if (zzdss != null) {
            return zzdss.zzc();
        }
        return null;
    }

    public final synchronized String zze() throws RemoteException {
        zzdss zzdss = this.zzg;
        if (zzdss == null || zzdss.zzl() == null) {
            return null;
        }
        return zzdss.zzl().zzg();
    }

    public final synchronized void zzf(zzl zzl, zzcbk zzcbk) throws RemoteException {
        zzt(zzl, zzcbk, 2);
    }

    public final synchronized void zzg(zzl zzl, zzcbk zzcbk) throws RemoteException {
        zzt(zzl, zzcbk, 3);
    }

    public final synchronized void zzh(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzh = z;
    }

    public final void zzi(zzdb zzdb) {
        if (zzdb == null) {
            this.zzb.zzb((zzfkm) null);
        } else {
            this.zzb.zzb(new zzfav(this, zzdb));
        }
    }

    public final void zzj(zzde zzde) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        this.zzb.zzc(zzde);
    }

    public final void zzk(zzcbg zzcbg) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzd(zzcbg);
    }

    public final synchronized void zzl(zzcbr zzcbr) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzfbt zzfbt = this.zzd;
        zzfbt.zza = zzcbr.zza;
        zzfbt.zzb = zzcbr.zzb;
    }

    public final synchronized void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzn(iObjectWrapper, this.zzh);
    }

    public final synchronized void zzn(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzg == null) {
            zze.zzj("Rewarded can not be shown before loaded");
            this.zzb.zzk(zzfcx.zzd(9, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
            return;
        }
        this.zzg.zzg(z, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final boolean zzo() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdss zzdss = this.zzg;
        return zzdss != null && !zzdss.zze();
    }

    public final void zzp(zzcbl zzcbl) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzi(zzcbl);
    }
}
