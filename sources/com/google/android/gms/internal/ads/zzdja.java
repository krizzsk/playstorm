package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdja extends zzdhb implements zzbam {
    private final Map zzb = new WeakHashMap(1);
    private final Context zzc;
    private final zzfbg zzd;

    public zzdja(Context context, Set set, zzfbg zzfbg) {
        super(set);
        this.zzc = context;
        this.zzd = zzfbg;
    }

    public final synchronized void zza(View view) {
        zzban zzban = (zzban) this.zzb.get(view);
        if (zzban == null) {
            zzban = new zzban(this.zzc, view);
            zzban.zzc(this);
            this.zzb.put(view, zzban);
        }
        if (this.zzd.zzY) {
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzbh)).booleanValue()) {
                zzban.zzg(((Long) zzay.zzc().zzb(zzbhy.zzbg)).longValue());
                return;
            }
        }
        zzban.zzf();
    }

    public final synchronized void zzb(View view) {
        if (this.zzb.containsKey(view)) {
            ((zzban) this.zzb.get(view)).zze(this);
            this.zzb.remove(view);
        }
    }

    public final synchronized void zzc(zzbal zzbal) {
        zzo(new zzdiz(zzbal));
    }
}
