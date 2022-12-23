package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzdqu implements zzbam {
    public final /* synthetic */ zzcli zza;

    public /* synthetic */ zzdqu(zzcli zzcli) {
        this.zza = zzcli;
    }

    public final void zzc(zzbal zzbal) {
        zzcli zzcli = this.zza;
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != zzbal.zzj ? "0" : "1");
        zzcli.zzd("onAdVisibilityChanged", hashMap);
    }
}
