package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public abstract class zzvn {
    private zzvm zza;
    private zzvv zzb;

    public boolean zzh() {
        throw null;
    }

    public abstract zzvo zzj(zzjv[] zzjvArr, zztz zztz, zzsb zzsb, zzci zzci) throws zzgu;

    public abstract void zzk(Object obj);

    /* access modifiers changed from: protected */
    public final zzvv zzl() {
        zzvv zzvv = this.zzb;
        if (zzvv != null) {
            return zzvv;
        }
        throw null;
    }

    public final void zzm(zzvm zzvm, zzvv zzvv) {
        this.zza = zzvm;
        this.zzb = zzvv;
    }

    /* access modifiers changed from: protected */
    public final void zzn() {
        zzvm zzvm = this.zza;
        if (zzvm != null) {
            zzvm.zzj();
        }
    }
}
