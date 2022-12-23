package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzg {
    public static void zza(AudioAttributes.Builder builder, int i) {
        try {
            builder.getClass().getMethod("setSpatializationBehavior", new Class[]{Integer.TYPE}).invoke(builder, new Object[]{Integer.valueOf(i)});
        } catch (Exception unused) {
        }
    }
}
