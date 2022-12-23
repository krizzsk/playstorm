package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzcdr implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzcds zza;
    private final String zzb;

    public zzcdr(zzcds zzcds, String str) {
        this.zza = zzcds;
        this.zzb = str;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.zza) {
            for (zzcdq zzcdq : this.zza.zzb) {
                zzcdq.zza.zzb(zzcdq.zzb, sharedPreferences, this.zzb, str);
            }
        }
    }
}
