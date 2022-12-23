package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbqe implements zzaiu {
    /* access modifiers changed from: private */
    public volatile zzbpr zza;
    private final Context zzb;

    public zzbqe(Context context) {
        this.zzb = context;
    }

    static /* bridge */ /* synthetic */ void zzc(zzbqe zzbqe) {
        if (zzbqe.zza != null) {
            zzbqe.zza.disconnect();
            Binder.flushPendingCommands();
        }
    }

    public final zzaix zza(zzajb zzajb) throws zzajk {
        Parcelable.Creator<zzbps> creator = zzbps.CREATOR;
        Map zzl = zzajb.zzl();
        int size = zzl.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        int i2 = 0;
        for (Map.Entry entry : zzl.entrySet()) {
            strArr[i2] = (String) entry.getKey();
            strArr2[i2] = (String) entry.getValue();
            i2++;
        }
        zzbps zzbps = new zzbps(zzajb.zzk(), strArr, strArr2);
        long elapsedRealtime = zzt.zzA().elapsedRealtime();
        try {
            zzcga zzcga = new zzcga();
            this.zza = new zzbpr(this.zzb, zzt.zzt().zzb(), new zzbqc(this, zzcga), new zzbqd(this, zzcga));
            this.zza.checkAvailabilityAndConnect();
            zzfvj zzo = zzfva.zzo(zzfva.zzn(zzcga, new zzbqa(this, zzbps), zzcfv.zza), (long) ((Integer) zzay.zzc().zzb(zzbhy.zzdy)).intValue(), TimeUnit.MILLISECONDS, zzcfv.zzd);
            zzo.zzc(new zzbqb(this), zzcfv.zza);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzo.get();
            long elapsedRealtime2 = zzt.zzA().elapsedRealtime();
            zze.zza("Http assets remote cache took " + (elapsedRealtime2 - elapsedRealtime) + "ms");
            zzbpu zzbpu = (zzbpu) new zzbzs(parcelFileDescriptor).zza(zzbpu.CREATOR);
            if (zzbpu == null) {
                return null;
            }
            if (zzbpu.zza) {
                throw new zzajk(zzbpu.zzb);
            } else if (zzbpu.zze.length != zzbpu.zzf.length) {
                return null;
            } else {
                HashMap hashMap = new HashMap();
                while (true) {
                    String[] strArr3 = zzbpu.zze;
                    if (i >= strArr3.length) {
                        return new zzaix(zzbpu.zzc, zzbpu.zzd, (Map) hashMap, zzbpu.zzg, zzbpu.zzh);
                    }
                    hashMap.put(strArr3[i], zzbpu.zzf[i]);
                    i++;
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
            long elapsedRealtime3 = zzt.zzA().elapsedRealtime();
            zze.zza("Http assets remote cache took " + (elapsedRealtime3 - elapsedRealtime) + "ms");
            return null;
        } catch (Throwable th) {
            long elapsedRealtime4 = zzt.zzA().elapsedRealtime();
            zze.zza("Http assets remote cache took " + (elapsedRealtime4 - elapsedRealtime) + "ms");
            throw th;
        }
    }
}
