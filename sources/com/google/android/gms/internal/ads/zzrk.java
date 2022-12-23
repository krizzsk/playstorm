package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public abstract class zzrk extends zzrc {
    private final HashMap zza = new HashMap();
    private Handler zzb;
    private zzft zzc;

    protected zzrk() {
    }

    /* access modifiers changed from: protected */
    public final void zzj() {
        for (zzrj zzrj : this.zza.values()) {
            zzrj.zza.zzi(zzrj.zzb);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzl() {
        for (zzrj zzrj : this.zza.values()) {
            zzrj.zza.zzk(zzrj.zzb);
        }
    }

    /* access modifiers changed from: protected */
    public void zzn(zzft zzft) {
        this.zzc = zzft;
        this.zzb = zzeg.zzC((Handler.Callback) null);
    }

    /* access modifiers changed from: protected */
    public void zzq() {
        for (zzrj zzrj : this.zza.values()) {
            zzrj.zza.zzp(zzrj.zzb);
            zzrj.zza.zzs(zzrj.zzc);
            zzrj.zza.zzr(zzrj.zzc);
        }
        this.zza.clear();
    }

    /* access modifiers changed from: protected */
    public zzsb zzv(Object obj, zzsb zzsb) {
        throw null;
    }

    public void zzw() throws IOException {
        for (zzrj zzrj : this.zza.values()) {
            zzrj.zza.zzw();
        }
    }

    /* access modifiers changed from: protected */
    public abstract void zzx(Object obj, zzsd zzsd, zzci zzci);

    /* access modifiers changed from: protected */
    public final void zzy(Object obj, zzsd zzsd) {
        zzcw.zzd(!this.zza.containsKey(obj));
        zzrh zzrh = new zzrh(this, obj);
        zzri zzri = new zzri(this, obj);
        this.zza.put(obj, new zzrj(zzsd, zzrh, zzri));
        Handler handler = this.zzb;
        if (handler != null) {
            zzsd.zzh(handler, zzri);
            Handler handler2 = this.zzb;
            if (handler2 != null) {
                zzsd.zzg(handler2, zzri);
                zzsd.zzm(zzrh, this.zzc, zzb());
                if (!zzt()) {
                    zzsd.zzi(zzrh);
                    return;
                }
                return;
            }
            throw null;
        }
        throw null;
    }
}
