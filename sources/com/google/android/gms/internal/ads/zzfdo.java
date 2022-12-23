package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzfdo implements zzfdn {
    private final ConcurrentHashMap zza;
    private final zzfdu zzb;
    private final zzfdq zzc = new zzfdq();

    public zzfdo(zzfdu zzfdu) {
        this.zza = new ConcurrentHashMap(zzfdu.zzd);
        this.zzb = zzfdu;
    }

    private final void zzf() {
        Parcelable.Creator<zzfdu> creator = zzfdu.CREATOR;
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzfo)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.zzb.zzb);
            sb.append(" PoolCollection");
            sb.append(this.zzc.zzb());
            int i = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((zzfdx) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((zzfdm) entry.getValue()).zzb(); i2++) {
                    sb.append("[O]");
                }
                for (int zzb2 = ((zzfdm) entry.getValue()).zzb(); zzb2 < this.zzb.zzd; zzb2++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((zzfdm) entry.getValue()).zzg());
                sb.append("\n");
            }
            while (i < this.zzb.zzc) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            zze.zze(sb.toString());
        }
    }

    public final zzfdu zza() {
        return this.zzb;
    }

    public final synchronized zzfdw zzb(zzfdx zzfdx) {
        zzfdw zzfdw;
        zzfdm zzfdm = (zzfdm) this.zza.get(zzfdx);
        if (zzfdm != null) {
            zzfdw = zzfdm.zze();
            if (zzfdw == null) {
                this.zzc.zze();
            }
            zzfek zzf = zzfdm.zzf();
            if (zzfdw != null) {
                zzbea zza2 = zzbeg.zza();
                zzbdy zza3 = zzbdz.zza();
                zza3.zzd(2);
                zzbec zza4 = zzbed.zza();
                zza4.zza(zzf.zza);
                zza4.zzb(zzf.zzb);
                zza3.zza(zza4);
                zza2.zza(zza3);
                zzfdw.zza.zzb().zzc().zze((zzbeg) zza2.zzaj());
            }
            zzf();
        } else {
            this.zzc.zzf();
            zzf();
            zzfdw = null;
        }
        return zzfdw;
    }

    @Deprecated
    public final zzfdx zzc(zzl zzl, String str, zzw zzw) {
        return new zzfdy(zzl, str, new zzbzy(this.zzb.zza).zza().zzk, this.zzb.zzf, zzw);
    }

    public final synchronized boolean zzd(zzfdx zzfdx, zzfdw zzfdw) {
        boolean zzh;
        zzfdm zzfdm = (zzfdm) this.zza.get(zzfdx);
        zzfdw.zzd = zzt.zzA().currentTimeMillis();
        if (zzfdm == null) {
            zzfdu zzfdu = this.zzb;
            zzfdm = new zzfdm(zzfdu.zzd, zzfdu.zze * 1000);
            int size = this.zza.size();
            zzfdu zzfdu2 = this.zzb;
            if (size == zzfdu2.zzc) {
                int i = zzfdu2.zzg;
                int i2 = i - 1;
                zzfdx zzfdx2 = null;
                if (i != 0) {
                    long j = Long.MAX_VALUE;
                    if (i2 == 0) {
                        for (Map.Entry entry : this.zza.entrySet()) {
                            if (((zzfdm) entry.getValue()).zzc() < j) {
                                j = ((zzfdm) entry.getValue()).zzc();
                                zzfdx2 = (zzfdx) entry.getKey();
                            }
                        }
                        if (zzfdx2 != null) {
                            this.zza.remove(zzfdx2);
                        }
                    } else if (i2 == 1) {
                        for (Map.Entry entry2 : this.zza.entrySet()) {
                            if (((zzfdm) entry2.getValue()).zzd() < j) {
                                j = ((zzfdm) entry2.getValue()).zzd();
                                zzfdx2 = (zzfdx) entry2.getKey();
                            }
                        }
                        if (zzfdx2 != null) {
                            this.zza.remove(zzfdx2);
                        }
                    } else if (i2 == 2) {
                        int i3 = Integer.MAX_VALUE;
                        for (Map.Entry entry3 : this.zza.entrySet()) {
                            if (((zzfdm) entry3.getValue()).zza() < i3) {
                                i3 = ((zzfdm) entry3.getValue()).zza();
                                zzfdx2 = (zzfdx) entry3.getKey();
                            }
                        }
                        if (zzfdx2 != null) {
                            this.zza.remove(zzfdx2);
                        }
                    }
                    this.zzc.zzg();
                } else {
                    throw null;
                }
            }
            this.zza.put(zzfdx, zzfdm);
            this.zzc.zzd();
        }
        zzh = zzfdm.zzh(zzfdw);
        this.zzc.zzc();
        zzfdp zza2 = this.zzc.zza();
        zzfek zzf = zzfdm.zzf();
        if (zzfdw != null) {
            zzbea zza3 = zzbeg.zza();
            zzbdy zza4 = zzbdz.zza();
            zza4.zzd(2);
            zzbee zza5 = zzbef.zza();
            zza5.zza(zza2.zza);
            zza5.zzb(zza2.zzb);
            zza5.zzc(zzf.zzb);
            zza4.zzc(zza5);
            zza3.zza(zza4);
            zzfdw.zza.zzb().zzc().zzf((zzbeg) zza3.zzaj());
        }
        zzf();
        return zzh;
    }

    public final synchronized boolean zze(zzfdx zzfdx) {
        zzfdm zzfdm = (zzfdm) this.zza.get(zzfdx);
        if (zzfdm == null) {
            return true;
        }
        if (zzfdm.zzb() < this.zzb.zzd) {
            return true;
        }
        return false;
    }
}
