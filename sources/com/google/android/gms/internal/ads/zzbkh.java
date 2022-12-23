package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public final class zzbkh {
    private final Context zza;

    public zzbkh(Context context) {
        this.zza = context;
    }

    public final void zza(zzbze zzbze) {
        try {
            ((zzbki) zzcfm.zzb(this.zza, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", zzbkg.zza)).zze(zzbze);
        } catch (zzcfl e) {
            zzcfi.zzj("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e.getMessage())));
        } catch (RemoteException e2) {
            zzcfi.zzj("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e2.getMessage())));
        }
    }
}
