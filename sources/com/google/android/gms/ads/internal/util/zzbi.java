package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzaij;
import com.google.android.gms.internal.ads.zzajf;
import com.google.android.gms.internal.ads.zzajg;
import com.google.android.gms.internal.ads.zzakg;
import com.google.android.gms.internal.ads.zzcfh;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzbi extends zzakg {
    final /* synthetic */ byte[] zza;
    final /* synthetic */ Map zzb;
    final /* synthetic */ zzcfh zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzbi(zzbo zzbo, int i, String str, zzajg zzajg, zzajf zzajf, byte[] bArr, Map map, zzcfh zzcfh) {
        super(i, str, zzajg, zzajf);
        this.zza = bArr;
        this.zzb = map;
        this.zzc = zzcfh;
    }

    public final Map zzl() throws zzaij {
        Map map = this.zzb;
        return map == null ? Collections.emptyMap() : map;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void zzo(Object obj) {
        zzo((String) obj);
    }

    public final byte[] zzx() throws zzaij {
        byte[] bArr = this.zza;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    public final void zzz(String str) {
        this.zzc.zzg(str);
        super.zzo(str);
    }
}
