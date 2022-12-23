package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.browser.trusted.sharing.ShareTarget;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzaij;
import com.google.android.gms.internal.ads.zzaje;
import com.google.android.gms.internal.ads.zzajp;
import com.google.android.gms.internal.ads.zzaki;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzcfh;
import com.google.android.gms.internal.ads.zzcga;
import com.google.android.gms.internal.ads.zzfvj;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbo {
    @Deprecated
    public static final zzbj zza = new zzbg();
    private static zzaje zzb;
    private static final Object zzc = new Object();

    public zzbo(Context context) {
        zzaje zzaje;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (zzc) {
            if (zzb == null) {
                zzbhy.zzc(context);
                if (!ClientLibraryUtils.isPackageSide()) {
                    if (((Boolean) zzay.zzc().zzb(zzbhy.zzdw)).booleanValue()) {
                        zzaje = zzax.zzb(context);
                        zzb = zzaje;
                    }
                }
                zzaje = zzaki.zza(context, (zzajp) null);
                zzb = zzaje;
            }
        }
    }

    public final zzfvj zza(String str) {
        zzcga zzcga = new zzcga();
        zzb.zza(new zzbn(str, (Map) null, zzcga));
        return zzcga;
    }

    public final zzfvj zzb(int i, String str, Map map, byte[] bArr) {
        String str2 = str;
        zzbl zzbl = new zzbl((zzbk) null);
        zzbh zzbh = new zzbh(this, str2, zzbl);
        zzcfh zzcfh = new zzcfh((String) null);
        zzbi zzbi = new zzbi(this, i, str, zzbl, zzbh, bArr, map, zzcfh);
        if (zzcfh.zzl()) {
            try {
                zzcfh.zzd(str2, ShareTarget.METHOD_GET, zzbi.zzl(), zzbi.zzx());
            } catch (zzaij e) {
                zze.zzj(e.getMessage());
            }
        }
        zzb.zza(zzbi);
        return zzbl;
    }
}
