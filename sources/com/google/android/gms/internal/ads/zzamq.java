package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzamq implements Runnable {
    private zzamq() {
    }

    /* synthetic */ zzamq(zzamp zzamp) {
    }

    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzamr.zzc = MessageDigest.getInstance(SameMD5.TAG);
            countDownLatch = zzamr.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzamr.zzb;
        } catch (Throwable th) {
            zzamr.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
