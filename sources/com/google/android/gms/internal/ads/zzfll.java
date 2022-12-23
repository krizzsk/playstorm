package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfll {
    private final Context zza;
    private final Executor zzb;
    private final zzfks zzc;
    private final zzfku zzd;
    private final zzflk zze;
    private final zzflk zzf;
    private Task zzg;
    private Task zzh;

    zzfll(Context context, Executor executor, zzfks zzfks, zzfku zzfku, zzfli zzfli, zzflj zzflj) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfks;
        this.zzd = zzfku;
        this.zze = zzfli;
        this.zzf = zzflj;
    }

    public static zzfll zze(Context context, Executor executor, zzfks zzfks, zzfku zzfku) {
        zzfll zzfll = new zzfll(context, executor, zzfks, zzfku, new zzfli(), new zzflj());
        if (zzfll.zzd.zzd()) {
            zzfll.zzg = zzfll.zzh(new zzflf(zzfll));
        } else {
            zzfll.zzg = Tasks.forResult(zzfll.zze.zza());
        }
        zzfll.zzh = zzfll.zzh(new zzflg(zzfll));
        return zzfll;
    }

    private static zzaly zzg(Task task, zzaly zzaly) {
        if (!task.isSuccessful()) {
            return zzaly;
        }
        return (zzaly) task.getResult();
    }

    private final Task zzh(Callable callable) {
        return Tasks.call(this.zzb, callable).addOnFailureListener(this.zzb, (OnFailureListener) new zzflh(this));
    }

    public final zzaly zza() {
        return zzg(this.zzg, this.zze.zza());
    }

    public final zzaly zzb() {
        return zzg(this.zzh, this.zzf.zza());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzaly zzc() throws Exception {
        Context context = this.zza;
        zzali zza2 = zzaly.zza();
        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
        String id = advertisingIdInfo.getId();
        if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID fromString = UUID.fromString(id);
            byte[] bArr = new byte[16];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.putLong(fromString.getMostSignificantBits());
            wrap.putLong(fromString.getLeastSignificantBits());
            id = Base64.encodeToString(bArr, 11);
        }
        if (id != null) {
            zza2.zzr(id);
            zza2.zzq(advertisingIdInfo.isLimitAdTrackingEnabled());
            zza2.zzY(6);
        }
        return (zzaly) zza2.zzaj();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzaly zzd() throws Exception {
        Context context = this.zza;
        return zzfla.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.zzc.zzc(2025, -1, exc);
    }
}
