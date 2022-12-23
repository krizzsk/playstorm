package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzd;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzc;
import com.google.android.gms.ads.nonagon.signalgeneration.zzg;
import com.google.android.gms.ads.nonagon.signalgeneration.zzz;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public abstract class zzcnf implements zzcsl {
    @Nullable
    private static zzcnf zza;

    private static synchronized zzcnf zzC(Context context, @Nullable zzbtz zzbtz, int i, boolean z, int i2, zzcrc zzcrc) {
        synchronized (zzcnf.class) {
            zzcnf zzcnf = zza;
            if (zzcnf != null) {
                return zzcnf;
            }
            zzbhy.zzc(context);
            zzfcr zzd = zzfcr.zzd(context);
            zzcfo zzc = zzd.zzc(221310000, false, i2);
            zzd.zze(zzbtz);
            zzcpn zzcpn = new zzcpn((zzcpm) null);
            zzcng zzcng = new zzcng();
            zzcng.zzd(zzc);
            zzcng.zzc(context);
            zzcpn.zzb(new zzcni(zzcng, (zzcnh) null));
            zzcpn.zzc(new zzcrd(zzcrc));
            zzcnf zza2 = zzcpn.zza();
            zzt.zzo().zzr(context, zzc);
            zzt.zzc().zzi(context);
            zzt.zzp().zzj(context);
            zzt.zzp().zzi(context);
            zzd.zza(context);
            zzt.zzb().zzd(context);
            zzt.zzv().zzb(context);
            zzcdo.zzd(context);
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzff)).booleanValue()) {
                if (!((Boolean) zzay.zzc().zzb(zzbhy.zzas)).booleanValue()) {
                    zzbdl zzbdl = new zzbdl(new zzbdr(context));
                    zzedn zzedn = new zzedn(new zzedj(context), zza2.zzz());
                    zzt.zzp();
                    new zzeef(context, zzc, zzbdl, zzedn, UUID.randomUUID().toString(), zza2.zzx()).zzb(zzt.zzo().zzh().zzP());
                }
            }
            zza = zza2;
            return zza2;
        }
    }

    public static zzcnf zza(Context context, @Nullable zzbtz zzbtz, int i) {
        return zzC(context, zzbtz, 221310000, false, i, new zzcof());
    }

    public abstract Executor zzA();

    public abstract ScheduledExecutorService zzB();

    public abstract zzcro zzb();

    public abstract zzcuw zzc();

    public abstract zzcvh zzd();

    public abstract zzcwq zze();

    public abstract zzdeh zzf();

    public abstract zzdkw zzg();

    public abstract zzdls zzh();

    public abstract zzdsw zzi();

    public abstract zzdxo zzj();

    public abstract zzdza zzk();

    public abstract zzeev zzl();

    public abstract zzc zzm();

    public abstract zzg zzn();

    public abstract zzz zzo();

    public final zzett zzp(zzbzu zzbzu, int i) {
        return zzq(new zzevf(zzbzu, i));
    }

    /* access modifiers changed from: protected */
    public abstract zzett zzq(zzevf zzevf);

    public abstract zzewe zzr();

    public abstract zzexs zzs();

    public abstract zzezl zzt();

    public abstract zzfaz zzu();

    public abstract zzfck zzv();

    public abstract zzfcu zzw();

    public abstract zzfgo zzx();

    public abstract zzfhs zzy();

    public abstract zzfvk zzz();
}
