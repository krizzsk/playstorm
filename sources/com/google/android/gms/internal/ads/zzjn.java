package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzjn {
    private final zzmv zza;
    private final List zzb = new ArrayList();
    private final IdentityHashMap zzc = new IdentityHashMap();
    private final Map zzd = new HashMap();
    private final zzjm zze;
    /* access modifiers changed from: private */
    public final zzsk zzf = new zzsk();
    /* access modifiers changed from: private */
    public final zzpd zzg = new zzpd();
    private final HashMap zzh = new HashMap();
    private final Set zzi = new HashSet();
    private boolean zzj;
    private zzft zzk;
    private zztu zzl = new zztu(0);

    public zzjn(zzjm zzjm, zzki zzki, Handler handler, zzmv zzmv) {
        this.zza = zzmv;
        this.zze = zzjm;
        this.zzf.zzb(handler, zzki);
        this.zzg.zzb(handler, zzki);
    }

    private final void zzp(int i, int i2) {
        while (i < this.zzb.size()) {
            ((zzjl) this.zzb.get(i)).zzd += i2;
            i++;
        }
    }

    private final void zzq(zzjl zzjl) {
        zzjk zzjk = (zzjk) this.zzh.get(zzjl);
        if (zzjk != null) {
            zzjk.zza.zzi(zzjk.zzb);
        }
    }

    private final void zzr() {
        Iterator it = this.zzi.iterator();
        while (it.hasNext()) {
            zzjl zzjl = (zzjl) it.next();
            if (zzjl.zzc.isEmpty()) {
                zzq(zzjl);
                it.remove();
            }
        }
    }

    private final void zzs(zzjl zzjl) {
        if (zzjl.zze && zzjl.zzc.isEmpty()) {
            zzjk zzjk = (zzjk) this.zzh.remove(zzjl);
            if (zzjk != null) {
                zzjk.zza.zzp(zzjk.zzb);
                zzjk.zza.zzs(zzjk.zzc);
                zzjk.zza.zzr(zzjk.zzc);
                this.zzi.remove(zzjl);
                return;
            }
            throw null;
        }
    }

    private final void zzt(zzjl zzjl) {
        zzrw zzrw = zzjl.zza;
        zzji zzji = new zzji(this);
        zzjj zzjj = new zzjj(this, zzjl);
        this.zzh.put(zzjl, new zzjk(zzrw, zzji, zzjj));
        zzrw.zzh(new Handler(zzeg.zzD(), (Handler.Callback) null), zzjj);
        zzrw.zzg(new Handler(zzeg.zzD(), (Handler.Callback) null), zzjj);
        zzrw.zzm(zzji, this.zzk, this.zza);
    }

    private final void zzu(int i, int i2) {
        while (true) {
            i2--;
            if (i2 >= i) {
                zzjl zzjl = (zzjl) this.zzb.remove(i2);
                this.zzd.remove(zzjl.zzb);
                zzp(i2, -zzjl.zza.zzA().zzc());
                zzjl.zze = true;
                if (this.zzj) {
                    zzs(zzjl);
                }
            } else {
                return;
            }
        }
    }

    public final int zza() {
        return this.zzb.size();
    }

    public final zzci zzb() {
        if (this.zzb.isEmpty()) {
            return zzci.zza;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.zzb.size(); i2++) {
            zzjl zzjl = (zzjl) this.zzb.get(i2);
            zzjl.zzd = i;
            i += zzjl.zza.zzA().zzc();
        }
        return new zzjs(this.zzb, this.zzl, (byte[]) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzsd zzsd, zzci zzci) {
        this.zze.zzh();
    }

    public final void zzf(zzft zzft) {
        zzcw.zzf(!this.zzj);
        this.zzk = zzft;
        for (int i = 0; i < this.zzb.size(); i++) {
            zzjl zzjl = (zzjl) this.zzb.get(i);
            zzt(zzjl);
            this.zzi.add(zzjl);
        }
        this.zzj = true;
    }

    public final void zzg() {
        for (zzjk zzjk : this.zzh.values()) {
            try {
                zzjk.zza.zzp(zzjk.zzb);
            } catch (RuntimeException e) {
                zzdn.zza("MediaSourceList", "Failed to release child source.", e);
            }
            zzjk.zza.zzs(zzjk.zzc);
            zzjk.zza.zzr(zzjk.zzc);
        }
        this.zzh.clear();
        this.zzi.clear();
        this.zzj = false;
    }

    public final void zzh(zzrz zzrz) {
        zzjl zzjl = (zzjl) this.zzc.remove(zzrz);
        if (zzjl != null) {
            zzjl.zza.zzB(zzrz);
            zzjl.zzc.remove(((zzrt) zzrz).zza);
            if (!this.zzc.isEmpty()) {
                zzr();
            }
            zzs(zzjl);
            return;
        }
        throw null;
    }

    public final boolean zzi() {
        return this.zzj;
    }

    public final zzci zzj(int i, List list, zztu zztu) {
        if (!list.isEmpty()) {
            this.zzl = zztu;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                zzjl zzjl = (zzjl) list.get(i2 - i);
                if (i2 > 0) {
                    zzjl zzjl2 = (zzjl) this.zzb.get(i2 - 1);
                    zzjl.zzc(zzjl2.zzd + zzjl2.zza.zzA().zzc());
                } else {
                    zzjl.zzc(0);
                }
                zzp(i2, zzjl.zza.zzA().zzc());
                this.zzb.add(i2, zzjl);
                this.zzd.put(zzjl.zzb, zzjl);
                if (this.zzj) {
                    zzt(zzjl);
                    if (this.zzc.isEmpty()) {
                        this.zzi.add(zzjl);
                    } else {
                        zzq(zzjl);
                    }
                }
            }
        }
        return zzb();
    }

    public final zzci zzk(int i, int i2, int i3, zztu zztu) {
        zzcw.zzd(zza() >= 0);
        this.zzl = null;
        return zzb();
    }

    public final zzci zzl(int i, int i2, zztu zztu) {
        boolean z = false;
        if (i >= 0 && i <= i2 && i2 <= zza()) {
            z = true;
        }
        zzcw.zzd(z);
        this.zzl = zztu;
        zzu(i, i2);
        return zzb();
    }

    public final zzci zzm(List list, zztu zztu) {
        zzu(0, this.zzb.size());
        return zzj(this.zzb.size(), list, zztu);
    }

    public final zzci zzn(zztu zztu) {
        int zza2 = zza();
        if (zztu.zzc() != zza2) {
            zztu = zztu.zzf().zzg(0, zza2);
        }
        this.zzl = zztu;
        return zzb();
    }

    public final zzrz zzo(zzsb zzsb, zzvw zzvw, long j) {
        Object obj = ((Pair) zzsb.zza).first;
        zzsb zzc2 = zzsb.zzc(((Pair) zzsb.zza).second);
        zzjl zzjl = (zzjl) this.zzd.get(obj);
        if (zzjl != null) {
            this.zzi.add(zzjl);
            zzjk zzjk = (zzjk) this.zzh.get(zzjl);
            if (zzjk != null) {
                zzjk.zza.zzk(zzjk.zzb);
            }
            zzjl.zzc.add(zzc2);
            zzrt zzC = zzjl.zza.zzD(zzc2, zzvw, j);
            this.zzc.put(zzC, zzjl);
            zzr();
            return zzC;
        }
        throw null;
    }
}
