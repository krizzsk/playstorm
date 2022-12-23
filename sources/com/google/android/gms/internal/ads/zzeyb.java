package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzl;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzeyb implements zzeyv {
    private final zzeyv zza;
    private final zzeyv zzb;
    private final zzfej zzc;
    private final String zzd;
    private zzdbb zze;
    private final Executor zzf;

    public zzeyb(zzeyv zzeyv, zzeyv zzeyv2, zzfej zzfej, String str, Executor executor) {
        this.zza = zzeyv;
        this.zzb = zzeyv2;
        this.zzc = zzfej;
        this.zzd = str;
        this.zzf = executor;
    }

    private final zzfvj zzg(zzfdw zzfdw, zzeyw zzeyw) {
        zzdbb zzdbb = zzfdw.zza;
        this.zze = zzdbb;
        if (zzfdw.zzc != null) {
            if (zzdbb.zzf() != null) {
                zzfdw.zzc.zzo().zzbL(zzfdw.zza.zzf());
            }
            return zzfva.zzi(zzfdw.zzc);
        }
        zzdbb.zzb().zzk(zzfdw.zzb);
        return ((zzeyl) this.zza).zzb(zzeyw, (zzeyu) null, zzfdw.zza);
    }

    /* renamed from: zza */
    public final synchronized zzdbb zzd() {
        return this.zze;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvj zzb(zzeyw zzeyw, zzeya zzeya, zzeyu zzeyu, zzdbb zzdbb, zzeyg zzeyg) throws Exception {
        if (zzeyg != null) {
            zzeya zzeya2 = new zzeya(zzeya.zza, zzeya.zzb, zzeya.zzc, zzeya.zzd, zzeya.zze, zzeya.zzf, zzeyg.zza);
            if (zzeyg.zzc != null) {
                this.zze = null;
                this.zzc.zze(zzeya2);
                return zzg(zzeyg.zzc, zzeyw);
            }
            zzfvj zza2 = this.zzc.zza(zzeya2);
            if (zza2 != null) {
                this.zze = null;
                return zzfva.zzn(zza2, new zzexx(this), this.zzf);
            }
            this.zzc.zze(zzeya2);
            zzeyw = new zzeyw(zzeyw.zzb, zzeyg.zzb);
        }
        zzfvj zzb2 = ((zzeyl) this.zza).zzb(zzeyw, zzeyu, zzdbb);
        this.zze = zzdbb;
        return zzb2;
    }

    public final /* bridge */ /* synthetic */ zzfvj zzc(zzeyw zzeyw, zzeyu zzeyu, Object obj) {
        return zzf(zzeyw, zzeyu, (zzdbb) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvj zze(zzfeg zzfeg) throws Exception {
        zzfei zzfei;
        if (zzfeg == null || zzfeg.zza == null || (zzfei = zzfeg.zzb) == null) {
            throw new zzdzk(1, "Empty prefetch");
        }
        zzbea zza2 = zzbeg.zza();
        zzbdy zza3 = zzbdz.zza();
        zza3.zzd(2);
        zza3.zzb(zzbed.zzd());
        zza2.zza(zza3);
        zzfeg.zza.zza.zzb().zzc().zzi((zzbeg) zza2.zzaj());
        return zzg(zzfeg.zza, ((zzeya) zzfei).zzb);
    }

    public final synchronized zzfvj zzf(zzeyw zzeyw, zzeyu zzeyu, zzdbb zzdbb) {
        zzeyw zzeyw2 = zzeyw;
        zzeyu zzeyu2 = zzeyu;
        synchronized (this) {
            zzdba zza2 = zzeyu2.zza(zzeyw2.zzb);
            zza2.zza(new zzeyc(this.zzd));
            zzdbb zzdbb2 = (zzdbb) zza2.zzh();
            zzdbb2.zzg();
            zzdbb2.zzg();
            zzl zzl = zzdbb2.zzg().zzd;
            if (zzl.zzs == null) {
                if (zzl.zzx == null) {
                    zzfby zzg = zzdbb2.zzg();
                    zzeyu zzeyu3 = zzeyu;
                    zzeyw zzeyw3 = zzeyw;
                    zzfvj zzn = zzfva.zzn(zzfur.zzv(((zzeyh) this.zzb).zzb(zzeyw2, zzeyu2, zzdbb2)), new zzexy(this, zzeyw, new zzeya(zzeyu3, zzeyw3, zzg.zzd, zzg.zzf, this.zzf, zzg.zzj, (zzfdx) null), zzeyu, zzdbb2), this.zzf);
                    return zzn;
                }
            }
            this.zze = zzdbb2;
            zzfvj zzb2 = ((zzeyl) this.zza).zzb(zzeyw2, zzeyu2, zzdbb2);
            return zzb2;
        }
    }
}
