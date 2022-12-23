package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzchg {
    private final Context zza;
    private final zzchr zzb;
    private final ViewGroup zzc;
    private zzchf zzd;

    public zzchg(Context context, ViewGroup viewGroup, zzcli zzcli) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = viewGroup;
        this.zzb = zzcli;
        this.zzd = null;
    }

    public final zzchf zza() {
        return this.zzd;
    }

    public final void zzb(int i, int i2, int i3, int i4) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzchf zzchf = this.zzd;
        if (zzchf != null) {
            zzchf.zzE(i, i2, i3, i4);
        }
    }

    public final void zzc(int i, int i2, int i3, int i4, int i5, boolean z, zzchq zzchq) {
        if (this.zzd == null) {
            zzbif.zza(this.zzb.zzo().zza(), this.zzb.zzn(), "vpr2");
            Context context = this.zza;
            zzchr zzchr = this.zzb;
            zzchf zzchf = new zzchf(context, zzchr, i5, z, zzchr.zzo().zza(), zzchq);
            this.zzd = zzchf;
            this.zzc.addView(zzchf, 0, new ViewGroup.LayoutParams(-1, -1));
            int i6 = i;
            int i7 = i2;
            int i8 = i3;
            int i9 = i4;
            this.zzd.zzE(i, i2, i3, i4);
            this.zzb.zzB(false);
        }
    }

    public final void zzd() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzchf zzchf = this.zzd;
        if (zzchf != null) {
            zzchf.zzn();
            this.zzc.removeView(this.zzd);
            this.zzd = null;
        }
    }

    public final void zze() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzchf zzchf = this.zzd;
        if (zzchf != null) {
            zzchf.zzt();
        }
    }

    public final void zzf(int i) {
        zzchf zzchf = this.zzd;
        if (zzchf != null) {
            zzchf.zzB(i);
        }
    }
}
