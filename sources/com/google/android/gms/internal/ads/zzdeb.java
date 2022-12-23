package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdeb extends zzdhb implements zzdcm, zzddr {
    private final zzfbg zzb;
    private final AtomicBoolean zzc = new AtomicBoolean();

    public zzdeb(Set set, zzfbg zzfbg) {
        super(set);
        this.zzb = zzfbg;
    }

    private final void zzb() {
        zzs zzs;
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzgx)).booleanValue() && this.zzc.compareAndSet(false, true) && (zzs = this.zzb.zzag) != null && zzs.zza == 3) {
            zzo(new zzdea(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzded zzded) throws Exception {
        zzded.zzg(this.zzb.zzag);
    }

    public final void zzh() {
        if (this.zzb.zzb == 1) {
            zzb();
        }
    }

    public final void zzl() {
        int i = this.zzb.zzb;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            zzb();
        }
    }
}
