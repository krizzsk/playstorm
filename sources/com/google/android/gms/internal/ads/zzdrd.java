package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdrd extends zzbqt implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzbkl {
    private View zza;
    private zzdk zzb;
    private zzdnb zzc;
    private boolean zzd = false;
    private boolean zze = false;

    public zzdrd(zzdnb zzdnb, zzdng zzdng) {
        this.zza = zzdng.zzf();
        this.zzb = zzdng.zzj();
        this.zzc = zzdnb;
        if (zzdng.zzr() != null) {
            zzdng.zzr().zzao(this);
        }
    }

    private final void zzg() {
        View view;
        zzdnb zzdnb = this.zzc;
        if (zzdnb != null && (view = this.zza) != null) {
            zzdnb.zzv(view, Collections.emptyMap(), Collections.emptyMap(), zzdnb.zzP(this.zza));
        }
    }

    private final void zzh() {
        View view = this.zza;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.zza);
            }
        }
    }

    private static final void zzi(zzbqx zzbqx, int i) {
        try {
            zzbqx.zze(i);
        } catch (RemoteException e) {
            zze.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void onGlobalLayout() {
        zzg();
    }

    public final void onScrollChanged() {
        zzg();
    }

    public final zzdk zzb() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (!this.zzd) {
            return this.zzb;
        }
        zze.zzg("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    public final zzbkx zzc() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            zze.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzdnb zzdnb = this.zzc;
        if (zzdnb == null || zzdnb.zza() == null) {
            return null;
        }
        return zzdnb.zza().zza();
    }

    public final void zzd() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzh();
        zzdnb zzdnb = this.zzc;
        if (zzdnb != null) {
            zzdnb.zzV();
        }
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        this.zzd = true;
    }

    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzf(iObjectWrapper, new zzdrc(this));
    }

    public final void zzf(IObjectWrapper iObjectWrapper, zzbqx zzbqx) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            zze.zzg("Instream ad can not be shown after destroy().");
            zzi(zzbqx, 2);
            return;
        }
        View view = this.zza;
        if (view == null || this.zzb == null) {
            zze.zzg("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
            zzi(zzbqx, 0);
        } else if (this.zze) {
            zze.zzg("Instream ad should not be used again.");
            zzi(zzbqx, 1);
        } else {
            this.zze = true;
            zzh();
            ((ViewGroup) ObjectWrapper.unwrap(iObjectWrapper)).addView(this.zza, new ViewGroup.LayoutParams(-1, -1));
            zzt.zzx();
            zzcgi.zza(this.zza, this);
            zzt.zzx();
            zzcgi.zzb(this.zza, this);
            zzg();
            try {
                zzbqx.zzf();
            } catch (RemoteException e) {
                zze.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
