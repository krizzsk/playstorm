package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzu;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzegn implements zzeey {
    private final Context zza;
    private final zzdkx zzb;
    private final Executor zzc;
    private final zzfbf zzd;

    public zzegn(Context context, Executor executor, zzdkx zzdkx, zzfbf zzfbf) {
        this.zza = context;
        this.zzb = zzdkx;
        this.zzc = executor;
        this.zzd = zzfbf;
    }

    private static String zzd(zzfbg zzfbg) {
        try {
            return zzfbg.zzw.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    public final zzfvj zza(zzfbs zzfbs, zzfbg zzfbg) {
        String zzd2 = zzd(zzfbg);
        return zzfva.zzn(zzfva.zzi((Object) null), new zzegl(this, zzd2 != null ? Uri.parse(zzd2) : null, zzfbs, zzfbg), this.zzc);
    }

    public final boolean zzb(zzfbs zzfbs, zzfbg zzfbg) {
        Context context = this.zza;
        return (context instanceof Activity) && zzbiw.zzg(context) && !TextUtils.isEmpty(zzd(zzfbg));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvj zzc(Uri uri, zzfbs zzfbs, zzfbg zzfbg, Object obj) throws Exception {
        try {
            CustomTabsIntent build = new CustomTabsIntent.Builder().build();
            build.intent.setData(uri);
            zzc zzc2 = new zzc(build.intent, (zzu) null);
            zzcga zzcga = new zzcga();
            zzdjz zze = this.zzb.zze(new zzcyl(zzfbs, zzfbg, (String) null), new zzdkc(new zzegm(zzcga), (zzcli) null));
            zzcga.zzd(new AdOverlayInfoParcel(zzc2, (zza) null, zze.zza(), (zzw) null, new zzcfo(0, 0, false, false, false), (zzcli) null, (zzdjf) null));
            this.zzd.zza();
            return zzfva.zzi(zze.zzg());
        } catch (Throwable th) {
            zze.zzh("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
