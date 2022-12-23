package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzean implements zzebl {
    /* access modifiers changed from: private */
    public static final Pattern zza = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzdzo zzb;
    private final zzfvk zzc;
    private final zzfby zzd;
    private final ScheduledExecutorService zze;
    /* access modifiers changed from: private */
    public final zzedr zzf;
    private final zzfhq zzg;
    private final Context zzh;

    zzean(Context context, zzfby zzfby, zzdzo zzdzo, zzfvk zzfvk, ScheduledExecutorService scheduledExecutorService, zzedr zzedr, zzfhq zzfhq) {
        this.zzh = context;
        this.zzd = zzfby;
        this.zzb = zzdzo;
        this.zzc = zzfvk;
        this.zze = scheduledExecutorService;
        this.zzf = zzedr;
        this.zzg = zzfhq;
    }

    public final zzfvj zzb(zzbzu zzbzu) {
        zzfvj zzb2 = this.zzb.zzb(zzbzu);
        zzfhg zza2 = zzfhf.zza(this.zzh, 11);
        zzfhp.zzc(zzb2, zza2);
        zzfvj zzn = zzfva.zzn(zzb2, new zzeak(this), this.zzc);
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzew)).booleanValue()) {
            zzn = zzfva.zzg(zzfva.zzo(zzn, (long) ((Integer) zzay.zzc().zzb(zzbhy.zzex)).intValue(), TimeUnit.SECONDS, this.zze), TimeoutException.class, zzeal.zza, zzcfv.zzf);
        }
        zzfhp.zza(zzn, this.zzg, zza2);
        zzfva.zzr(zzn, new zzeam(this), zzcfv.zzf);
        return zzn;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvj zzc(InputStream inputStream) throws Exception {
        return zzfva.zzi(new zzfbs(new zzfbp(this.zzd), zzfbr.zza(new InputStreamReader(inputStream))));
    }
}
