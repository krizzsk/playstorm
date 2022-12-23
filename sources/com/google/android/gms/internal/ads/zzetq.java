package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzetq implements zzetb {
    private final Context zza;
    private final ScheduledExecutorService zzb;
    private final Executor zzc;
    private final int zzd;
    private final zzcei zze;

    public zzetq(zzcei zzcei, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, byte[] bArr) {
        this.zze = zzcei;
        this.zza = context;
        this.zzb = scheduledExecutorService;
        this.zzc = executor;
        this.zzd = i;
    }

    public final int zza() {
        return 40;
    }

    public final zzfvj zzb() {
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzaO)).booleanValue()) {
            return zzfva.zzh(new Exception("Did not ad Ad ID into query param."));
        }
        return zzfva.zzf((zzfur) zzfva.zzo(zzfva.zzm(zzfur.zzv(this.zze.zza(this.zza, this.zzd)), zzeto.zza, this.zzc), ((Long) zzay.zzc().zzb(zzbhy.zzaP)).longValue(), TimeUnit.MILLISECONDS, this.zzb), Throwable.class, new zzetp(this), this.zzc);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzetr zzc(Throwable th) {
        String str;
        zzaw.zzb();
        ContentResolver contentResolver = this.zza.getContentResolver();
        if (contentResolver == null) {
            str = null;
        } else {
            str = Settings.Secure.getString(contentResolver, "android_id");
        }
        return new zzetr((AdvertisingIdClient.Info) null, str);
    }
}
