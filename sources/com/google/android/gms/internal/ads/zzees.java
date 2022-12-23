package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.tapjoy.TapjoyConstants;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzees implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzeen zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzdwg zzc;
    public final /* synthetic */ Activity zzd;
    public final /* synthetic */ zzfgo zze;
    public final /* synthetic */ zzl zzf;

    public /* synthetic */ zzees(zzeen zzeen, String str, zzdwg zzdwg, Activity activity, zzfgo zzfgo, zzl zzl) {
        this.zza = zzeen;
        this.zzb = str;
        this.zzc = zzdwg;
        this.zzd = activity;
        this.zze = zzfgo;
        this.zzf = zzl;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        zzeen zzeen = this.zza;
        String str = this.zzb;
        zzdwg zzdwg = this.zzc;
        Activity activity = this.zzd;
        zzfgo zzfgo = this.zze;
        zzl zzl = this.zzf;
        zzeen.zzc(str);
        if (zzdwg != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("dialog_action", TapjoyConstants.TJC_FULLSCREEN_AD_DISMISS_URL);
            zzeev.zzd(activity, zzdwg, zzfgo, zzeen, str, "dialog_click", hashMap);
        }
        if (zzl != null) {
            zzl.zzb();
        }
    }
}
