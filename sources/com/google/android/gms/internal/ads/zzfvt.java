package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzfvt implements Runnable {
    @CheckForNull
    zzfvv zza;

    zzfvt(zzfvv zzfvv) {
        this.zza = zzfvv;
    }

    public final void run() {
        zzfvj zzf;
        String str;
        zzfvv zzfvv = this.zza;
        if (zzfvv != null && (zzf = zzfvv.zza) != null) {
            this.zza = null;
            if (zzf.isDone()) {
                zzfvv.zzt(zzf);
                return;
            }
            try {
                ScheduledFuture zzw = zzfvv.zzb;
                ScheduledFuture unused = zzfvv.zzb = null;
                str = "Timed out";
                if (zzw != null) {
                    long abs = Math.abs(zzw.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        StringBuilder sb = new StringBuilder(75);
                        sb.append(str);
                        sb.append(" (timeout delayed by ");
                        sb.append(abs);
                        sb.append(" ms after scheduled time)");
                        str = sb.toString();
                    }
                }
                String obj = zzf.toString();
                StringBuilder sb2 = new StringBuilder(str.length() + 2 + obj.length());
                sb2.append(str);
                sb2.append(": ");
                sb2.append(obj);
                zzfvv.zze(new zzfvu(sb2.toString(), (zzfvs) null));
                zzf.cancel(true);
            } catch (Throwable th) {
                zzf.cancel(true);
                throw th;
            }
        }
    }
}
