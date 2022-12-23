package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzazt extends Surface {
    private static boolean zza;
    private static boolean zzb;
    private final zzazr zzc;
    private boolean zzd;

    /* synthetic */ zzazt(zzazr zzazr, SurfaceTexture surfaceTexture, boolean z, zzazs zzazs) {
        super(surfaceTexture);
        this.zzc = zzazr;
    }

    public static zzazt zza(Context context, boolean z) {
        if (zzazn.zza >= 17) {
            boolean z2 = true;
            if (z && !zzb(context)) {
                z2 = false;
            }
            zzayy.zze(z2);
            return new zzazr().zza(z);
        }
        throw new UnsupportedOperationException("Unsupported prior to API level 17");
    }

    public static synchronized boolean zzb(Context context) {
        boolean z;
        synchronized (zzazt.class) {
            if (!zzb) {
                if (zzazn.zza >= 17) {
                    boolean z2 = false;
                    String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                        if (zzazn.zza != 24 || ((!zzazn.zzd.startsWith("SM-G950") && !zzazn.zzd.startsWith("SM-G955")) || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance"))) {
                            z2 = true;
                        }
                    }
                    zza = z2;
                }
                zzb = true;
            }
            z = zza;
        }
        return z;
    }

    public final void release() {
        super.release();
        synchronized (this.zzc) {
            if (!this.zzd) {
                this.zzc.zzb();
                this.zzd = true;
            }
        }
    }
}
