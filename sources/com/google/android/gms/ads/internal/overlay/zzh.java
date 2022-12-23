package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.zzcli;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzh {
    public final int zza;
    public final ViewGroup.LayoutParams zzb;
    public final ViewGroup zzc;
    public final Context zzd;

    public zzh(zzcli zzcli) throws zzf {
        this.zzb = zzcli.getLayoutParams();
        ViewParent parent = zzcli.getParent();
        this.zzd = zzcli.zzG();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new zzf("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.zzc = viewGroup;
        this.zza = viewGroup.indexOfChild(zzcli.zzH());
        this.zzc.removeView(zzcli.zzH());
        zzcli.zzap(true);
    }
}
