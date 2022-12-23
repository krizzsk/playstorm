package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzfuw;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzy implements zzfuw {
    final /* synthetic */ zzz zza;

    zzy(zzz zzz) {
        this.zza = zzz;
    }

    public final void zza(Throwable th) {
        zzt.zzo().zzt(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        zzz zzz = this.zza;
        zzf.zzc(zzz.zzr, zzz.zzj, "sgf", new Pair("sgf_reason", th.getMessage()));
        zze.zzh("Failed to initialize webview for loading SDKCore. ", th);
    }

    public final /* synthetic */ void zzb(Object obj) {
        zzal zzal = (zzal) obj;
        zze.zze("Initialized webview successfully for SDKCore.");
    }
}
