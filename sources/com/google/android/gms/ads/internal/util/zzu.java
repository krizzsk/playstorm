package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzcfb;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public class zzu extends zzt {
    static final boolean zzf(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    public final boolean zze(Activity activity, Configuration configuration) {
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzdQ)).booleanValue()) {
            return false;
        }
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzdS)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        zzaw.zzb();
        int zzv = zzcfb.zzv(activity, configuration.screenHeightDp);
        int zzv2 = zzcfb.zzv(activity, configuration.screenWidthDp);
        zzt.zzp();
        DisplayMetrics zzr = zzs.zzr((WindowManager) activity.getApplicationContext().getSystemService("window"));
        int i = zzr.heightPixels;
        int i2 = zzr.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int round = ((int) Math.round(((double) activity.getResources().getDisplayMetrics().density) + 0.5d)) * ((Integer) zzay.zzc().zzb(zzbhy.zzdO)).intValue();
        if (!zzf(i, zzv + dimensionPixelSize, round)) {
            return true;
        }
        if (zzf(i2, zzv2, round)) {
            return false;
        }
        return true;
    }
}
