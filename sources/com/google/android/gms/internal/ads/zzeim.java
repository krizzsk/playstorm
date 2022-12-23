package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzeim {
    private final zzfcn zza;
    private final zzdty zzb;
    private final zzdwg zzc;
    private final zzfgo zzd;

    public zzeim(zzfcn zzfcn, zzdty zzdty, zzdwg zzdwg, zzfgo zzfgo) {
        this.zza = zzfcn;
        this.zzb = zzdty;
        this.zzc = zzdwg;
        this.zzd = zzfgo;
    }

    public final void zza(zzfbj zzfbj, zzfbg zzfbg, int i, @Nullable zzefc zzefc, long j) {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzhf)).booleanValue()) {
            zzfgn zzb2 = zzfgn.zzb("adapter_status");
            zzb2.zzg(zzfbj);
            zzb2.zzf(zzfbg);
            zzb2.zza("adapter_l", String.valueOf(j));
            zzb2.zza("sc", Integer.toString(i));
            if (zzefc != null) {
                zzb2.zza("arec", Integer.toString(zzefc.zzb().zza));
                String zza2 = this.zza.zza(zzefc.getMessage());
                if (zza2 != null) {
                    zzb2.zza("areec", zza2);
                }
            }
            zzdtx zzb3 = this.zzb.zzb(zzfbg.zzu);
            if (zzb3 != null) {
                zzb2.zza("ancn", zzb3.zza);
                zzbwf zzbwf = zzb3.zzb;
                if (zzbwf != null) {
                    zzb2.zza("adapter_v", zzbwf.toString());
                }
                zzbwf zzbwf2 = zzb3.zzc;
                if (zzbwf2 != null) {
                    zzb2.zza("adapter_sv", zzbwf2.toString());
                }
            }
            this.zzd.zzb(zzb2);
            return;
        }
        zzdwf zza3 = this.zzc.zza();
        zza3.zze(zzfbj);
        zza3.zzd(zzfbg);
        zza3.zzb("action", "adapter_status");
        zza3.zzb("adapter_l", String.valueOf(j));
        zza3.zzb("sc", Integer.toString(i));
        if (zzefc != null) {
            zza3.zzb("arec", Integer.toString(zzefc.zzb().zza));
            String zza4 = this.zza.zza(zzefc.getMessage());
            if (zza4 != null) {
                zza3.zzb("areec", zza4);
            }
        }
        zzdtx zzb4 = this.zzb.zzb(zzfbg.zzu);
        if (zzb4 != null) {
            zza3.zzb("ancn", zzb4.zza);
            zzbwf zzbwf3 = zzb4.zzb;
            if (zzbwf3 != null) {
                zza3.zzb("adapter_v", zzbwf3.toString());
            }
            zzbwf zzbwf4 = zzb4.zzc;
            if (zzbwf4 != null) {
                zza3.zzb("adapter_sv", zzbwf4.toString());
            }
        }
        zza3.zzg();
    }
}
