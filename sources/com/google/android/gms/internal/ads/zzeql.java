package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.gms.ads.internal.client.zzay;
import com.p374my.tracker.ads.AdFormat;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzeql implements zzetb {
    private final zzfvk zza;
    private final ViewGroup zzb;
    private final Context zzc;
    private final Set zzd;

    public zzeql(zzfvk zzfvk, ViewGroup viewGroup, Context context, Set set) {
        this.zza = zzfvk;
        this.zzd = set;
        this.zzb = viewGroup;
        this.zzc = context;
    }

    public final int zza() {
        return 22;
    }

    public final zzfvj zzb() {
        return this.zza.zzb(new zzeqk(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzeqm zzc() throws Exception {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzeQ)).booleanValue() && this.zzb != null && this.zzd.contains(AdFormat.BANNER)) {
            return new zzeqm(Boolean.valueOf(this.zzb.isHardwareAccelerated()));
        }
        boolean z = null;
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzeR)).booleanValue() && this.zzd.contains("native")) {
            Context context = this.zzc;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                boolean z2 = true;
                if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                    try {
                        if ((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) == 0) {
                            z2 = false;
                        }
                        z = Boolean.valueOf(z2);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                } else {
                    z = true;
                }
                return new zzeqm(z);
            }
        }
        return new zzeqm((Boolean) null);
    }
}
