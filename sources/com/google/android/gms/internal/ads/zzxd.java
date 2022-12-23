package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Display;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzxd implements DisplayManager.DisplayListener, zzxb {
    private final DisplayManager zza;
    private zzwz zzb;

    private zzxd(DisplayManager displayManager) {
        this.zza = displayManager;
    }

    public static zzxb zzc(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            return new zzxd(displayManager);
        }
        return null;
    }

    private final Display zzd() {
        return this.zza.getDisplay(0);
    }

    public final void onDisplayAdded(int i) {
    }

    public final void onDisplayChanged(int i) {
        zzwz zzwz = this.zzb;
        if (zzwz != null && i == 0) {
            zzxf.zzb(zzwz.zza, zzd());
        }
    }

    public final void onDisplayRemoved(int i) {
    }

    public final void zza() {
        this.zza.unregisterDisplayListener(this);
        this.zzb = null;
    }

    public final void zzb(zzwz zzwz) {
        this.zzb = zzwz;
        this.zza.registerDisplayListener(this, zzeg.zzC((Handler.Callback) null));
        zzxf.zzb(zzwz.zza, zzd());
    }
}
