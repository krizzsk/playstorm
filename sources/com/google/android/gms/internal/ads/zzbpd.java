package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.p196h5.OnH5AdsEventListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public final class zzbpd extends zzbpf {
    private final OnH5AdsEventListener zza;

    public zzbpd(OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = onH5AdsEventListener;
    }

    public final void zzb(String str) {
        this.zza.onH5AdsEvent(str);
    }
}
