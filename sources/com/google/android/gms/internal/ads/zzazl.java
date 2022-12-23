package com.google.android.gms.internal.ads;

import android.os.Trace;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzazl {
    public static void zza(String str) {
        if (zzazn.zza >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void zzb() {
        if (zzazn.zza >= 18) {
            Trace.endSection();
        }
    }
}
