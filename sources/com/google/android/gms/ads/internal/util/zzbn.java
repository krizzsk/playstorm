package com.google.android.gms.ads.internal.util;

import androidx.browser.trusted.sharing.ShareTarget;
import com.google.android.gms.internal.ads.zzaix;
import com.google.android.gms.internal.ads.zzajb;
import com.google.android.gms.internal.ads.zzajh;
import com.google.android.gms.internal.ads.zzajy;
import com.google.android.gms.internal.ads.zzcfh;
import com.google.android.gms.internal.ads.zzcga;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbn extends zzajb {
    private final zzcga zza;
    private final zzcfh zzb;

    public zzbn(String str, Map map, zzcga zzcga) {
        super(0, str, new zzbm(zzcga));
        this.zza = zzcga;
        zzcfh zzcfh = new zzcfh((String) null);
        this.zzb = zzcfh;
        zzcfh.zzd(str, ShareTarget.METHOD_GET, (Map) null, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    public final zzajh zzh(zzaix zzaix) {
        return zzajh.zzb(zzaix, zzajy.zzb(zzaix));
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void zzo(Object obj) {
        zzaix zzaix = (zzaix) obj;
        this.zzb.zzf(zzaix.zzc, zzaix.zza);
        zzcfh zzcfh = this.zzb;
        byte[] bArr = zzaix.zzb;
        if (zzcfh.zzl() && bArr != null) {
            zzcfh.zzh(bArr);
        }
        this.zza.zzd(zzaix);
    }
}
