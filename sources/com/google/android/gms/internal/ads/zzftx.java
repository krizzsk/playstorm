package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
abstract class zzftx extends zzfuq implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    @CheckForNull
    zzfvj zza;
    @CheckForNull
    Object zzb;

    zzftx(zzfvj zzfvj, Object obj) {
        if (zzfvj != null) {
            this.zza = zzfvj;
            if (obj != null) {
                this.zzb = obj;
                return;
            }
            throw null;
        }
        throw null;
    }

    public final void run() {
        zzfvj zzfvj = this.zza;
        Object obj = this.zzb;
        boolean z = true;
        boolean isCancelled = isCancelled() | (zzfvj == null);
        if (obj != null) {
            z = false;
        }
        if (!isCancelled && !z) {
            this.zza = null;
            if (zzfvj.isCancelled()) {
                zzt(zzfvj);
                return;
            }
            try {
                try {
                    Object zzf = zzf(obj, zzfva.zzp(zzfvj));
                    this.zzb = null;
                    zzg(zzf);
                } catch (Throwable th) {
                    this.zzb = null;
                    throw th;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e) {
                zze(e.getCause());
            } catch (RuntimeException e2) {
                zze(e2);
            } catch (Error e3) {
                zze(e3);
            }
        }
    }

    /* access modifiers changed from: protected */
    @CheckForNull
    public final String zza() {
        String str;
        zzfvj zzfvj = this.zza;
        Object obj = this.zzb;
        String zza2 = super.zza();
        if (zzfvj != null) {
            String obj2 = zzfvj.toString();
            StringBuilder sb = new StringBuilder(obj2.length() + 16);
            sb.append("inputFuture=[");
            sb.append(obj2);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = "";
        }
        if (obj != null) {
            String obj3 = obj.toString();
            StringBuilder sb2 = new StringBuilder(str.length() + 11 + obj3.length());
            sb2.append(str);
            sb2.append("function=[");
            sb2.append(obj3);
            sb2.append("]");
            return sb2.toString();
        } else if (zza2 != null) {
            return zza2.length() != 0 ? str.concat(zza2) : new String(str);
        } else {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzb() {
        zzs(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    /* access modifiers changed from: package-private */
    public abstract Object zzf(Object obj, Object obj2) throws Exception;

    /* access modifiers changed from: package-private */
    public abstract void zzg(Object obj);
}
