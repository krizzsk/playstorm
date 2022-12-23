package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzbns implements zzfoi {
    public final /* synthetic */ String zza;

    public /* synthetic */ zzbns(String str) {
        this.zza = str;
    }

    public final Object apply(Object obj) {
        String str = this.zza;
        Throwable th = (Throwable) obj;
        zzbol zzbol = zzbok.zza;
        if (((Boolean) zzbjn.zzk.zze()).booleanValue()) {
            zzt.zzo().zzt(th, "prepareClickUrl.attestation2");
        }
        return str;
    }
}
