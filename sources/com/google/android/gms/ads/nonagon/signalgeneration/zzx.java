package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbyj;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzfhq;
import com.google.android.gms.internal.ads.zzfuw;
import java.util.List;
import javax.annotation.Nonnull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzx implements zzfuw {
    final /* synthetic */ zzbyj zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzz zzc;

    zzx(zzz zzz, zzbyj zzbyj, boolean z) {
        this.zzc = zzz;
        this.zza = zzbyj;
        this.zzb = z;
    }

    public final void zza(Throwable th) {
        try {
            zzbyj zzbyj = this.zza;
            String message = th.getMessage();
            zzbyj.zze("Internal error: " + message);
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(@Nonnull Object obj) {
        List<Uri> list = (List) obj;
        try {
            zzz.zzE(this.zzc, list);
            this.zza.zzf(list);
            if (this.zzc.zzu || this.zzb) {
                for (Uri uri : list) {
                    if (this.zzc.zzM(uri)) {
                        zzz zzz = this.zzc;
                        this.zzc.zzs.zzc(zzz.zzV(uri, zzz.zzC, "1").toString(), (zzfhq) null);
                    } else {
                        if (((Boolean) zzay.zzc().zzb(zzbhy.zzgt)).booleanValue()) {
                            this.zzc.zzs.zzc(uri.toString(), (zzfhq) null);
                        }
                    }
                }
            }
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
        }
    }
}
