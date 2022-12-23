package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzeil {
    /* access modifiers changed from: private */
    public final Clock zza;
    /* access modifiers changed from: private */
    public final zzeim zzb;
    /* access modifiers changed from: private */
    public final zzfig zzc;
    private final List zzd = Collections.synchronizedList(new ArrayList());
    /* access modifiers changed from: private */
    public final boolean zze;
    /* access modifiers changed from: private */
    public final zzefd zzf;

    public zzeil(Clock clock, zzeim zzeim, zzefd zzefd, zzfig zzfig) {
        this.zza = clock;
        this.zzb = zzeim;
        this.zze = ((Boolean) zzay.zzc().zzb(zzbhy.zzfO)).booleanValue();
        this.zzf = zzefd;
        this.zzc = zzfig;
    }

    static /* bridge */ /* synthetic */ void zzg(zzeil zzeil, String str, int i, long j, String str2) {
        String str3 = str + "." + i + "." + j;
        if (!TextUtils.isEmpty(str2)) {
            str3 = str3 + "." + str2;
        }
        zzeil.zzd.add(str3);
    }

    /* access modifiers changed from: package-private */
    public final zzfvj zze(zzfbs zzfbs, zzfbg zzfbg, zzfvj zzfvj, zzfic zzfic) {
        zzfbj zzfbj = zzfbs.zzb.zzb;
        long elapsedRealtime = this.zza.elapsedRealtime();
        String str = zzfbg.zzx;
        if (str != null) {
            zzfva.zzr(zzfvj, new zzeik(this, elapsedRealtime, str, zzfbg, zzfbj, zzfic, zzfbs), zzcfv.zzf);
        }
        return zzfvj;
    }

    public final String zzf() {
        return TextUtils.join("_", this.zzd);
    }
}
