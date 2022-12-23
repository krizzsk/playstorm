package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbf {
    /* access modifiers changed from: private */
    public CharSequence zza;
    /* access modifiers changed from: private */
    public CharSequence zzb;
    /* access modifiers changed from: private */
    public CharSequence zzc;
    /* access modifiers changed from: private */
    public CharSequence zzd;
    /* access modifiers changed from: private */
    public CharSequence zze;
    /* access modifiers changed from: private */
    public byte[] zzf;
    /* access modifiers changed from: private */
    public Integer zzg;
    /* access modifiers changed from: private */
    public Integer zzh;
    /* access modifiers changed from: private */
    public Integer zzi;
    /* access modifiers changed from: private */
    public Integer zzj;
    /* access modifiers changed from: private */
    public Integer zzk;
    /* access modifiers changed from: private */
    public Integer zzl;
    /* access modifiers changed from: private */
    public Integer zzm;
    /* access modifiers changed from: private */
    public Integer zzn;
    /* access modifiers changed from: private */
    public Integer zzo;
    /* access modifiers changed from: private */
    public CharSequence zzp;
    /* access modifiers changed from: private */
    public CharSequence zzq;
    /* access modifiers changed from: private */
    public CharSequence zzr;
    /* access modifiers changed from: private */
    public CharSequence zzs;
    /* access modifiers changed from: private */
    public CharSequence zzt;

    public zzbf() {
    }

    /* synthetic */ zzbf(zzbh zzbh, zzbe zzbe) {
        this.zza = zzbh.zzc;
        this.zzb = zzbh.zzd;
        this.zzc = zzbh.zze;
        this.zzd = zzbh.zzf;
        this.zze = zzbh.zzg;
        this.zzf = zzbh.zzh;
        this.zzg = zzbh.zzi;
        this.zzh = zzbh.zzj;
        this.zzi = zzbh.zzk;
        this.zzj = zzbh.zzm;
        this.zzk = zzbh.zzn;
        this.zzl = zzbh.zzo;
        this.zzm = zzbh.zzp;
        this.zzn = zzbh.zzq;
        this.zzo = zzbh.zzr;
        this.zzp = zzbh.zzs;
        this.zzq = zzbh.zzt;
        this.zzr = zzbh.zzu;
        this.zzs = zzbh.zzv;
        this.zzt = zzbh.zzw;
    }

    public final zzbf zza(byte[] bArr, int i) {
        if (this.zzf == null || zzeg.zzS(Integer.valueOf(i), 3) || !zzeg.zzS(this.zzg, 3)) {
            this.zzf = (byte[]) bArr.clone();
            this.zzg = Integer.valueOf(i);
        }
        return this;
    }

    public final zzbf zzb(zzbh zzbh) {
        CharSequence charSequence = zzbh.zzc;
        if (charSequence != null) {
            this.zza = charSequence;
        }
        CharSequence charSequence2 = zzbh.zzd;
        if (charSequence2 != null) {
            this.zzb = charSequence2;
        }
        CharSequence charSequence3 = zzbh.zze;
        if (charSequence3 != null) {
            this.zzc = charSequence3;
        }
        CharSequence charSequence4 = zzbh.zzf;
        if (charSequence4 != null) {
            this.zzd = charSequence4;
        }
        CharSequence charSequence5 = zzbh.zzg;
        if (charSequence5 != null) {
            this.zze = charSequence5;
        }
        byte[] bArr = zzbh.zzh;
        if (bArr != null) {
            zzf(bArr, zzbh.zzi);
        }
        Integer num = zzbh.zzj;
        if (num != null) {
            this.zzh = num;
        }
        Integer num2 = zzbh.zzk;
        if (num2 != null) {
            this.zzi = num2;
        }
        Integer num3 = zzbh.zzl;
        if (num3 != null) {
            this.zzj = num3;
        }
        Integer num4 = zzbh.zzm;
        if (num4 != null) {
            this.zzj = num4;
        }
        Integer num5 = zzbh.zzn;
        if (num5 != null) {
            this.zzk = num5;
        }
        Integer num6 = zzbh.zzo;
        if (num6 != null) {
            this.zzl = num6;
        }
        Integer num7 = zzbh.zzp;
        if (num7 != null) {
            this.zzm = num7;
        }
        Integer num8 = zzbh.zzq;
        if (num8 != null) {
            this.zzn = num8;
        }
        Integer num9 = zzbh.zzr;
        if (num9 != null) {
            this.zzo = num9;
        }
        CharSequence charSequence6 = zzbh.zzs;
        if (charSequence6 != null) {
            this.zzp = charSequence6;
        }
        CharSequence charSequence7 = zzbh.zzt;
        if (charSequence7 != null) {
            this.zzq = charSequence7;
        }
        CharSequence charSequence8 = zzbh.zzu;
        if (charSequence8 != null) {
            this.zzr = charSequence8;
        }
        CharSequence charSequence9 = zzbh.zzv;
        if (charSequence9 != null) {
            this.zzs = charSequence9;
        }
        CharSequence charSequence10 = zzbh.zzw;
        if (charSequence10 != null) {
            this.zzt = charSequence10;
        }
        return this;
    }

    public final zzbf zzc(CharSequence charSequence) {
        this.zzd = charSequence;
        return this;
    }

    public final zzbf zzd(CharSequence charSequence) {
        this.zzc = charSequence;
        return this;
    }

    public final zzbf zze(CharSequence charSequence) {
        this.zzb = charSequence;
        return this;
    }

    public final zzbf zzf(byte[] bArr, Integer num) {
        this.zzf = (byte[]) bArr.clone();
        this.zzg = num;
        return this;
    }

    public final zzbf zzg(CharSequence charSequence) {
        this.zzq = charSequence;
        return this;
    }

    public final zzbf zzh(CharSequence charSequence) {
        this.zzr = charSequence;
        return this;
    }

    public final zzbf zzi(CharSequence charSequence) {
        this.zze = charSequence;
        return this;
    }

    public final zzbf zzj(CharSequence charSequence) {
        this.zzs = charSequence;
        return this;
    }

    public final zzbf zzk(Integer num) {
        this.zzl = num;
        return this;
    }

    public final zzbf zzl(Integer num) {
        this.zzk = num;
        return this;
    }

    public final zzbf zzm(Integer num) {
        this.zzj = num;
        return this;
    }

    public final zzbf zzn(Integer num) {
        this.zzo = num;
        return this;
    }

    public final zzbf zzo(Integer num) {
        this.zzn = num;
        return this;
    }

    public final zzbf zzp(Integer num) {
        this.zzm = num;
        return this;
    }

    public final zzbf zzq(CharSequence charSequence) {
        this.zzt = charSequence;
        return this;
    }

    public final zzbf zzr(CharSequence charSequence) {
        this.zza = charSequence;
        return this;
    }

    public final zzbf zzs(Integer num) {
        this.zzi = num;
        return this;
    }

    public final zzbf zzt(Integer num) {
        this.zzh = num;
        return this;
    }

    public final zzbf zzu(CharSequence charSequence) {
        this.zzp = charSequence;
        return this;
    }

    public final zzbh zzv() {
        return new zzbh(this);
    }
}
