package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzaql {
    protected static final String zza = zzaql.class.getSimpleName();
    private final zzapc zzb;
    private final String zzc;
    private final String zzd;
    private volatile Method zze = null;
    private final Class[] zzf;
    private final CountDownLatch zzg = new CountDownLatch(1);

    public zzaql(zzapc zzapc, String str, String str2, Class... clsArr) {
        this.zzb = zzapc;
        this.zzc = str;
        this.zzd = str2;
        this.zzf = clsArr;
        zzapc.zzk().submit(new zzaqk(this));
    }

    static /* bridge */ /* synthetic */ void zzb(zzaql zzaql) {
        CountDownLatch countDownLatch;
        try {
            zzapc zzapc = zzaql.zzb;
            Class loadClass = zzapc.zzi().loadClass(zzaql.zzc(zzapc.zzu(), zzaql.zzc));
            if (loadClass == null) {
                countDownLatch = zzaql.zzg;
            } else {
                zzaql.zze = loadClass.getMethod(zzaql.zzc(zzaql.zzb.zzu(), zzaql.zzd), zzaql.zzf);
                if (zzaql.zze == null) {
                    countDownLatch = zzaql.zzg;
                }
                countDownLatch = zzaql.zzg;
            }
        } catch (zzaoh | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException unused) {
        } catch (NullPointerException unused2) {
            countDownLatch = zzaql.zzg;
        } catch (Throwable th) {
            zzaql.zzg.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }

    private final String zzc(byte[] bArr, String str) throws zzaoh, UnsupportedEncodingException {
        return new String(this.zzb.zze().zzb(bArr, str), "UTF-8");
    }

    public final Method zza() {
        if (this.zze != null) {
            return this.zze;
        }
        try {
            if (!this.zzg.await(2, TimeUnit.SECONDS)) {
                return null;
            }
            return this.zze;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
