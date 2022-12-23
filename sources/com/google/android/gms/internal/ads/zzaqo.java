package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzaqo implements PackageManager.OnChecksumsReadyListener {
    public final /* synthetic */ zzfvr zza;

    public /* synthetic */ zzaqo(zzfvr zzfvr) {
        this.zza = zzfvr;
    }

    public final void onChecksumsReady(List list) {
        zzfvr zzfvr = this.zza;
        if (list == null) {
            zzfvr.zzd((Object) null);
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ApkChecksum apkChecksum = (ApkChecksum) list.get(i);
                if (apkChecksum.getType() == 8) {
                    zzfvr.zzd(zzapf.zzc(apkChecksum.getValue()));
                    return;
                }
            }
            zzfvr.zzd((Object) null);
        } catch (Throwable unused) {
            zzfvr.zzd((Object) null);
        }
    }
}
