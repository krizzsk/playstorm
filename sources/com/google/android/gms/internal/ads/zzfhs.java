package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfhs implements Runnable {
    public static Boolean zza;
    private final Context zzb;
    private final zzcfo zzc;
    private final zzfhx zzd = zzfia.zzc();
    private String zze;
    private int zzf;
    private final zzdty zzg;
    private boolean zzh = false;
    private final zzecs zzi;
    private final zzcag zzj;

    public zzfhs(Context context, zzcfo zzcfo, zzdty zzdty, zzecs zzecs, zzcag zzcag, byte[] bArr) {
        this.zzb = context;
        this.zzc = zzcfo;
        this.zzg = zzdty;
        this.zzi = zzecs;
        this.zzj = zzcag;
    }

    public static synchronized boolean zza() {
        boolean booleanValue;
        synchronized (zzfhs.class) {
            if (zza == null) {
                boolean z = false;
                if (!((Boolean) zzbjh.zzb.zze()).booleanValue()) {
                    zza = false;
                } else {
                    if (Math.random() < ((Double) zzbjh.zza.zze()).doubleValue()) {
                        z = true;
                    }
                    zza = Boolean.valueOf(z);
                }
            }
            booleanValue = zza.booleanValue();
        }
        return booleanValue;
    }

    private final synchronized void zzc() {
        if (!this.zzh) {
            this.zzh = true;
            if (zza()) {
                zzt.zzp();
                this.zze = zzs.zzo(this.zzb);
                this.zzf = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzb);
                long intValue = (long) ((Integer) zzay.zzc().zzb(zzbhy.zzhk)).intValue();
                zzcfv.zzd.scheduleAtFixedRate(this, intValue, intValue, TimeUnit.MILLISECONDS);
            }
        }
    }

    private final synchronized void zzd() {
        try {
            new zzecr(this.zzb, this.zzc.zza, this.zzj, Binder.getCallingUid(), (byte[]) null).zza(new zzecp((String) zzay.zzc().zzb(zzbhy.zzhj), 60000, new HashMap(), ((zzfia) this.zzd.zzaj()).zzau(), "application/x-protobuf"));
            this.zzd.zzc();
        } catch (Exception e) {
            if (!(e instanceof zzdzk) || ((zzdzk) e).zza() != 3) {
                zzt.zzo().zzs(e, "CuiMonitor.sendCuiPing");
            } else {
                this.zzd.zzc();
            }
        }
    }

    public final synchronized void run() {
        if (zza()) {
            if (this.zzd.zza() != 0) {
                zzd();
            }
        }
    }

    public final synchronized void zzb(zzfhk zzfhk) {
        if (!this.zzh) {
            zzc();
        }
        if (zza()) {
            if (zzfhk != null) {
                if (this.zzd.zza() < ((Integer) zzay.zzc().zzb(zzbhy.zzhl)).intValue()) {
                    zzfhx zzfhx = this.zzd;
                    zzfhy zza2 = zzfhz.zza();
                    zzfhu zza3 = zzfhv.zza();
                    zza3.zzo(zzfhk.zzh());
                    zza3.zzl(zzfhk.zzg());
                    zza3.zze(zzfhk.zzb());
                    zza3.zzq(3);
                    zza3.zzk(this.zzc.zza);
                    zza3.zza(this.zze);
                    zza3.zzi(Build.VERSION.RELEASE);
                    zza3.zzm(Build.VERSION.SDK_INT);
                    zza3.zzp(zzfhk.zzj());
                    zza3.zzh(zzfhk.zza());
                    zza3.zzc((long) this.zzf);
                    zza3.zzn(zzfhk.zzi());
                    zza3.zzb(zzfhk.zzc());
                    zza3.zzd(zzfhk.zzd());
                    zza3.zzf(zzfhk.zze());
                    zza3.zzg(this.zzg.zzc(zzfhk.zze()));
                    zza3.zzj(zzfhk.zzf());
                    zza2.zza(zza3);
                    zzfhx.zzb(zza2);
                }
            }
        }
    }
}
