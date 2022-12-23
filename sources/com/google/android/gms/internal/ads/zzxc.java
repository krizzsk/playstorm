package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.WindowManager;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzxc implements zzxb {
    private final WindowManager zza;

    private zzxc(WindowManager windowManager) {
        this.zza = windowManager;
    }

    public static zzxb zzc(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            return new zzxc(windowManager);
        }
        return null;
    }

    public final void zza() {
    }

    public final void zzb(zzwz zzwz) {
        zzxf.zzb(zzwz.zza, this.zza.getDefaultDisplay());
    }
}
