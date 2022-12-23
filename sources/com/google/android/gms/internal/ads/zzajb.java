package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public abstract class zzajb implements Comparable {
    /* access modifiers changed from: private */
    public final zzajm zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;
    private final zzajf zzf;
    private Integer zzg;
    private zzaje zzh;
    private boolean zzi;
    private zzaik zzj;
    private zzaja zzk;
    private final zzaip zzl;

    public zzajb(int i, String str, zzajf zzajf) {
        Uri parse;
        String host;
        this.zza = zzajm.zza ? new zzajm() : null;
        this.zze = new Object();
        int i2 = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i;
        this.zzc = str;
        this.zzf = zzajf;
        this.zzl = new zzaip();
        if (!(TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null)) {
            i2 = host.hashCode();
        }
        this.zzd = i2;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzajb) obj).zzg.intValue();
    }

    public final String toString() {
        String hexString = Integer.toHexString(this.zzd);
        zzw();
        String str = this.zzc;
        Integer num = this.zzg;
        return "[ ] " + str + " " + "0x".concat(String.valueOf(hexString)) + " NORMAL " + num;
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzl.zzb();
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzaik zzd() {
        return this.zzj;
    }

    public final zzajb zze(zzaik zzaik) {
        this.zzj = zzaik;
        return this;
    }

    public final zzajb zzf(zzaje zzaje) {
        this.zzh = zzaje;
        return this;
    }

    public final zzajb zzg(int i) {
        this.zzg = Integer.valueOf(i);
        return this;
    }

    /* access modifiers changed from: protected */
    public abstract zzajh zzh(zzaix zzaix);

    public final String zzj() {
        String str = this.zzc;
        if (this.zzb == 0) {
            return str;
        }
        String num = Integer.toString(1);
        return num + "-" + str;
    }

    public final String zzk() {
        return this.zzc;
    }

    public Map zzl() throws zzaij {
        return Collections.emptyMap();
    }

    public final void zzm(String str) {
        if (zzajm.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    public final void zzn(zzajk zzajk) {
        zzajf zzajf;
        synchronized (this.zze) {
            zzajf = this.zzf;
        }
        if (zzajf != null) {
            zzajf.zza(zzajk);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void zzo(Object obj);

    /* access modifiers changed from: package-private */
    public final void zzp(String str) {
        zzaje zzaje = this.zzh;
        if (zzaje != null) {
            zzaje.zzb(this);
        }
        if (zzajm.zza) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzaiz(this, str, id));
                return;
            }
            this.zza.zza(str, id);
            this.zza.zzb(toString());
        }
    }

    public final void zzq() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzr() {
        zzaja zzaja;
        synchronized (this.zze) {
            zzaja = this.zzk;
        }
        if (zzaja != null) {
            zzaja.zza(this);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzs(zzajh zzajh) {
        zzaja zzaja;
        synchronized (this.zze) {
            zzaja = this.zzk;
        }
        if (zzaja != null) {
            zzaja.zzb(this, zzajh);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzt(int i) {
        zzaje zzaje = this.zzh;
        if (zzaje != null) {
            zzaje.zzc(this, i);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzu(zzaja zzaja) {
        synchronized (this.zze) {
            this.zzk = zzaja;
        }
    }

    public final boolean zzv() {
        boolean z;
        synchronized (this.zze) {
            z = this.zzi;
        }
        return z;
    }

    public final boolean zzw() {
        synchronized (this.zze) {
        }
        return false;
    }

    public byte[] zzx() throws zzaij {
        return null;
    }

    public final zzaip zzy() {
        return this.zzl;
    }
}
