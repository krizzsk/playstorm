package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzepi implements zzetb {
    private final zzeyc zza;

    zzepi(zzeyc zzeyc) {
        this.zza = zzeyc;
    }

    public final int zza() {
        return 15;
    }

    public final zzfvj zzb() {
        zzeyc zzeyc = this.zza;
        zzeph zzeph = null;
        if (!(zzeyc == null || zzeyc.zza() == null || zzeyc.zza().isEmpty())) {
            zzeph = new zzeph(this);
        }
        return zzfva.zzi(zzeph);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(Bundle bundle) {
        bundle.putString("key_schema", this.zza.zza());
    }
}
