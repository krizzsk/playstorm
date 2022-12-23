package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.google.android.exoplayer2.PlaybackException;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfmq {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfmr zzc;
    private final zzfks zzd;
    private final zzfkn zze;
    private zzfmf zzf;
    private final Object zzg = new Object();

    public zzfmq(Context context, zzfmr zzfmr, zzfks zzfks, zzfkn zzfkn) {
        this.zzb = context;
        this.zzc = zzfmr;
        this.zzd = zzfks;
        this.zze = zzfkn;
    }

    private final synchronized Class zzd(zzfmg zzfmg) throws zzfmp {
        String zzk = zzfmg.zza().zzk();
        Class cls = (Class) zza.get(zzk);
        if (cls != null) {
            return cls;
        }
        try {
            if (this.zze.zza(zzfmg.zzc())) {
                File zzb2 = zzfmg.zzb();
                if (!zzb2.exists()) {
                    zzb2.mkdirs();
                }
                Class loadClass = new DexClassLoader(zzfmg.zzc().getAbsolutePath(), zzb2.getAbsolutePath(), (String) null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                zza.put(zzk, loadClass);
                return loadClass;
            }
            throw new zzfmp(2026, "VM did not pass signature verification");
        } catch (GeneralSecurityException e) {
            throw new zzfmp(2026, (Throwable) e);
        } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e2) {
            throw new zzfmp(2008, e2);
        }
    }

    public final zzfkv zza() {
        zzfmf zzfmf;
        synchronized (this.zzg) {
            zzfmf = this.zzf;
        }
        return zzfmf;
    }

    public final zzfmg zzb() {
        synchronized (this.zzg) {
            zzfmf zzfmf = this.zzf;
            if (zzfmf == null) {
                return null;
            }
            zzfmg zzf2 = zzfmf.zzf();
            return zzf2;
        }
    }

    public final boolean zzc(zzfmg zzfmg) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Class zzd2 = zzd(zzfmg);
            zzfmf zzfmf = new zzfmf(zzd2.getDeclaredConstructor(new Class[]{Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE}).newInstance(new Object[]{this.zzb, "msa-r", zzfmg.zze(), null, new Bundle(), 2}), zzfmg, this.zzc, this.zzd);
            if (zzfmf.zzh()) {
                int zze2 = zzfmf.zze();
                if (zze2 == 0) {
                    synchronized (this.zzg) {
                        zzfmf zzfmf2 = this.zzf;
                        if (zzfmf2 != null) {
                            try {
                                zzfmf2.zzg();
                            } catch (zzfmp e) {
                                this.zzd.zzc(e.zza(), -1, e);
                            }
                        }
                        this.zzf = zzfmf;
                    }
                    this.zzd.zzd(3000, System.currentTimeMillis() - currentTimeMillis);
                    return true;
                }
                throw new zzfmp((int) PlaybackException.ERROR_CODE_DECODER_INIT_FAILED, "ci: " + zze2);
            }
            throw new zzfmp((int) TTAdSdk.INIT_LOCAL_FAIL_CODE, "init failed");
        } catch (Exception e2) {
            throw new zzfmp(2004, (Throwable) e2);
        } catch (zzfmp e3) {
            this.zzd.zzc(e3.zza(), System.currentTimeMillis() - currentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.zzd.zzc(4010, System.currentTimeMillis() - currentTimeMillis, e4);
            return false;
        }
    }
}
