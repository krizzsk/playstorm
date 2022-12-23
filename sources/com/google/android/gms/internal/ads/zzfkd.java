package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfkd implements zzfji {
    private static final zzfkd zza = new zzfkd();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public static Handler zzc = null;
    /* access modifiers changed from: private */
    public static final Runnable zzd = new zzfjz();
    /* access modifiers changed from: private */
    public static final Runnable zze = new zzfka();
    private final List zzf = new ArrayList();
    private int zzg;
    private final zzfjk zzh = new zzfjk();
    private final zzfjw zzi = new zzfjw();
    /* access modifiers changed from: private */
    public final zzfjx zzj = new zzfjx(new zzfkg());
    private long zzk;

    zzfkd() {
    }

    public static zzfkd zzd() {
        return zza;
    }

    static /* bridge */ /* synthetic */ void zzg(zzfkd zzfkd) {
        zzfkd.zzg = 0;
        zzfkd.zzk = System.nanoTime();
        zzfkd.zzi.zzi();
        long nanoTime = System.nanoTime();
        zzfjj zza2 = zzfkd.zzh.zza();
        if (zzfkd.zzi.zze().size() > 0) {
            Iterator it = zzfkd.zzi.zze().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject zza3 = zzfjr.zza(0, 0, 0, 0);
                View zza4 = zzfkd.zzi.zza(str);
                zzfjj zzb2 = zzfkd.zzh.zzb();
                String zzc2 = zzfkd.zzi.zzc(str);
                if (zzc2 != null) {
                    JSONObject zza5 = zzb2.zza(zza4);
                    zzfjr.zzb(zza5, str);
                    zzfjr.zze(zza5, zzc2);
                    zzfjr.zzc(zza3, zza5);
                }
                zzfjr.zzh(zza3);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                zzfkd.zzj.zzc(zza3, hashSet, nanoTime);
            }
        }
        if (zzfkd.zzi.zzf().size() > 0) {
            JSONObject zza6 = zzfjr.zza(0, 0, 0, 0);
            zzfkd.zzk((View) null, zza2, zza6, 1);
            zzfjr.zzh(zza6);
            zzfkd.zzj.zzd(zza6, zzfkd.zzi.zzf(), nanoTime);
        } else {
            zzfkd.zzj.zzb();
        }
        zzfkd.zzi.zzg();
        long nanoTime2 = System.nanoTime() - zzfkd.zzk;
        if (zzfkd.zzf.size() > 0) {
            for (zzfkc zzfkc : zzfkd.zzf) {
                int i = zzfkd.zzg;
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                zzfkc.zzb();
                if (zzfkc instanceof zzfkb) {
                    int i2 = zzfkd.zzg;
                    ((zzfkb) zzfkc).zza();
                }
            }
        }
    }

    private final void zzk(View view, zzfjj zzfjj, JSONObject jSONObject, int i) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        zzfjj.zzb(view, jSONObject, this, z);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zze);
            zzc = null;
        }
    }

    public final void zza(View view, zzfjj zzfjj, JSONObject jSONObject) {
        int zzj2;
        if (zzfju.zzb(view) == null && (zzj2 = this.zzi.zzj(view)) != 3) {
            JSONObject zza2 = zzfjj.zza(view);
            zzfjr.zzc(jSONObject, zza2);
            String zzd2 = this.zzi.zzd(view);
            if (zzd2 != null) {
                zzfjr.zzb(zza2, zzd2);
                this.zzi.zzh();
            } else {
                zzfjv zzb2 = this.zzi.zzb(view);
                if (zzb2 != null) {
                    zzfjr.zzd(zza2, zzb2);
                }
                zzk(view, zzfjj, zza2, zzj2);
            }
            this.zzg++;
        }
    }

    public final void zzh() {
        zzl();
    }

    public final void zzi() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzd);
            zzc.postDelayed(zze, 200);
        }
    }

    public final void zzj() {
        zzl();
        this.zzf.clear();
        zzb.post(new zzfjy(this));
    }
}
