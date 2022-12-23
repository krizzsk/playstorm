package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzaix;
import com.google.android.gms.internal.ads.zzajb;
import com.google.android.gms.internal.ads.zzaje;
import com.google.android.gms.internal.ads.zzajk;
import com.google.android.gms.internal.ads.zzajp;
import com.google.android.gms.internal.ads.zzajq;
import com.google.android.gms.internal.ads.zzajx;
import com.google.android.gms.internal.ads.zzakb;
import com.google.android.gms.internal.ads.zzakc;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbqe;
import com.google.android.gms.internal.ads.zzcfb;
import java.io.File;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzax extends zzajq {
    private final Context zzc;

    private zzax(Context context, zzajp zzajp) {
        super(zzajp);
        this.zzc = context;
    }

    public static zzaje zzb(Context context) {
        zzaje zzaje = new zzaje(new zzajx(new File(context.getCacheDir(), "admob_volley"), 20971520), new zzax(context, new zzakc((zzakb) null, (SSLSocketFactory) null)), 4);
        zzaje.zzd();
        return zzaje;
    }

    public final zzaix zza(zzajb zzajb) throws zzajk {
        if (zzajb.zza() == 0) {
            if (Pattern.matches((String) zzay.zzc().zzb(zzbhy.zzdx), zzajb.zzk())) {
                zzaw.zzb();
                if (zzcfb.zzq(this.zzc, 13400000)) {
                    zzaix zza = new zzbqe(this.zzc).zza(zzajb);
                    if (zza != null) {
                        zze.zza("Got gmscore asset response: ".concat(String.valueOf(zzajb.zzk())));
                        return zza;
                    }
                    zze.zza("Failed to get gmscore asset response: ".concat(String.valueOf(zzajb.zzk())));
                }
            }
        }
        return super.zza(zzajb);
    }
}
