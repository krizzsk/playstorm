package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public abstract class zzrc implements zzsd {
    private final ArrayList zza = new ArrayList(1);
    private final HashSet zzb = new HashSet(1);
    private final zzsk zzc = new zzsk();
    private final zzpd zzd = new zzpd();
    private Looper zze;
    private zzci zzf;
    private zzmv zzg;

    public final /* synthetic */ zzci zzG() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final zzmv zzb() {
        zzmv zzmv = this.zzg;
        zzcw.zzb(zzmv);
        return zzmv;
    }

    /* access modifiers changed from: protected */
    public final zzpd zzc(zzsb zzsb) {
        return this.zzd.zza(0, zzsb);
    }

    /* access modifiers changed from: protected */
    public final zzpd zzd(int i, zzsb zzsb) {
        return this.zzd.zza(i, zzsb);
    }

    /* access modifiers changed from: protected */
    public final zzsk zze(zzsb zzsb) {
        return this.zzc.zza(0, zzsb, 0);
    }

    /* access modifiers changed from: protected */
    public final zzsk zzf(int i, zzsb zzsb, long j) {
        return this.zzc.zza(i, zzsb, 0);
    }

    public final void zzi(zzsc zzsc) {
        boolean isEmpty = this.zzb.isEmpty();
        this.zzb.remove(zzsc);
        if ((!isEmpty) && this.zzb.isEmpty()) {
            zzj();
        }
    }

    /* access modifiers changed from: protected */
    public void zzj() {
    }

    public final void zzk(zzsc zzsc) {
        if (this.zze != null) {
            boolean isEmpty = this.zzb.isEmpty();
            this.zzb.add(zzsc);
            if (isEmpty) {
                zzl();
                return;
            }
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzl() {
    }

    public final void zzm(zzsc zzsc, zzft zzft, zzmv zzmv) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.zze;
        boolean z = true;
        if (!(looper == null || looper == myLooper)) {
            z = false;
        }
        zzcw.zzd(z);
        this.zzg = zzmv;
        zzci zzci = this.zzf;
        this.zza.add(zzsc);
        if (this.zze == null) {
            this.zze = myLooper;
            this.zzb.add(zzsc);
            zzn(zzft);
        } else if (zzci != null) {
            zzk(zzsc);
            zzsc.zza(this, zzci);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void zzn(zzft zzft);

    /* access modifiers changed from: protected */
    public final void zzo(zzci zzci) {
        this.zzf = zzci;
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zzsc) arrayList.get(i)).zza(this, zzci);
        }
    }

    public final void zzp(zzsc zzsc) {
        this.zza.remove(zzsc);
        if (this.zza.isEmpty()) {
            this.zze = null;
            this.zzf = null;
            this.zzg = null;
            this.zzb.clear();
            zzq();
            return;
        }
        zzi(zzsc);
    }

    /* access modifiers changed from: protected */
    public abstract void zzq();

    public final void zzr(zzpe zzpe) {
        this.zzd.zzc(zzpe);
    }

    public final void zzs(zzsl zzsl) {
        this.zzc.zzm(zzsl);
    }

    /* access modifiers changed from: protected */
    public final boolean zzt() {
        return !this.zzb.isEmpty();
    }

    public final /* synthetic */ boolean zzu() {
        return true;
    }

    public final void zzg(Handler handler, zzpe zzpe) {
        if (zzpe != null) {
            this.zzd.zzb(handler, zzpe);
            return;
        }
        throw null;
    }

    public final void zzh(Handler handler, zzsl zzsl) {
        if (zzsl != null) {
            this.zzc.zzb(handler, zzsl);
            return;
        }
        throw null;
    }
}
