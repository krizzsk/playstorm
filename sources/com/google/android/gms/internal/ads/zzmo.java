package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzmo {
    final /* synthetic */ zzmp zza;
    /* access modifiers changed from: private */
    public final String zzb;
    /* access modifiers changed from: private */
    public int zzc;
    /* access modifiers changed from: private */
    public long zzd;
    /* access modifiers changed from: private */
    public zzsb zze;
    /* access modifiers changed from: private */
    public boolean zzf;
    /* access modifiers changed from: private */
    public boolean zzg;

    public zzmo(zzmp zzmp, String str, int i, zzsb zzsb) {
        this.zza = zzmp;
        this.zzb = str;
        this.zzc = i;
        this.zzd = zzsb == null ? -1 : zzsb.zzd;
        if (zzsb != null && zzsb.zzb()) {
            this.zze = zzsb;
        }
    }

    public final void zzg(int i, zzsb zzsb) {
        if (this.zzd == -1 && i == this.zzc && zzsb != null) {
            this.zzd = zzsb.zzd;
        }
    }

    public final boolean zzj(int i, zzsb zzsb) {
        if (zzsb == null) {
            return i == this.zzc;
        }
        zzsb zzsb2 = this.zze;
        return zzsb2 == null ? !zzsb.zzb() && zzsb.zzd == this.zzd : zzsb.zzd == zzsb2.zzd && zzsb.zzb == zzsb2.zzb && zzsb.zzc == zzsb2.zzc;
    }

    public final boolean zzk(zzkj zzkj) {
        long j = this.zzd;
        if (j == -1) {
            return false;
        }
        zzsb zzsb = zzkj.zzd;
        if (zzsb == null) {
            return this.zzc != zzkj.zzc;
        }
        if (zzsb.zzd > j) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        int zza2 = zzkj.zzb.zza(zzsb.zza);
        int zza3 = zzkj.zzb.zza(this.zze.zza);
        zzsb zzsb2 = zzkj.zzd;
        if (zzsb2.zzd < this.zze.zzd || zza2 < zza3) {
            return false;
        }
        if (zza2 > zza3) {
            return true;
        }
        if (zzsb2.zzb()) {
            zzsb zzsb3 = zzkj.zzd;
            int i = zzsb3.zzb;
            int i2 = zzsb3.zzc;
            zzsb zzsb4 = this.zze;
            int i3 = zzsb4.zzb;
            if (i > i3 || (i == i3 && i2 > zzsb4.zzc)) {
                return true;
            }
            return false;
        }
        int i4 = zzkj.zzd.zze;
        return i4 == -1 || i4 > this.zze.zzb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 < r8.zzc()) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzl(com.google.android.gms.internal.ads.zzci r7, com.google.android.gms.internal.ads.zzci r8) {
        /*
            r6 = this;
            int r0 = r6.zzc
            int r1 = r7.zzc()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L_0x0013
            int r7 = r8.zzc()
            if (r0 >= r7) goto L_0x0011
            goto L_0x004a
        L_0x0011:
            r0 = r3
            goto L_0x004a
        L_0x0013:
            com.google.android.gms.internal.ads.zzmp r1 = r6.zza
            com.google.android.gms.internal.ads.zzch r1 = r1.zzc
            r4 = 0
            r7.zze(r0, r1, r4)
            com.google.android.gms.internal.ads.zzmp r0 = r6.zza
            com.google.android.gms.internal.ads.zzch r0 = r0.zzc
            int r0 = r0.zzo
        L_0x0026:
            com.google.android.gms.internal.ads.zzmp r1 = r6.zza
            com.google.android.gms.internal.ads.zzch r1 = r1.zzc
            int r1 = r1.zzp
            if (r0 > r1) goto L_0x0011
            java.lang.Object r1 = r7.zzf(r0)
            int r1 = r8.zza(r1)
            if (r1 == r3) goto L_0x0047
            com.google.android.gms.internal.ads.zzmp r7 = r6.zza
            com.google.android.gms.internal.ads.zzcf r7 = r7.zzd
            com.google.android.gms.internal.ads.zzcf r7 = r8.zzd(r1, r7, r2)
            int r0 = r7.zzd
            goto L_0x004a
        L_0x0047:
            int r0 = r0 + 1
            goto L_0x0026
        L_0x004a:
            r6.zzc = r0
            if (r0 != r3) goto L_0x004f
            return r2
        L_0x004f:
            com.google.android.gms.internal.ads.zzsb r7 = r6.zze
            r0 = 1
            if (r7 != 0) goto L_0x0055
            return r0
        L_0x0055:
            java.lang.Object r7 = r7.zza
            int r7 = r8.zza(r7)
            if (r7 == r3) goto L_0x005e
            return r0
        L_0x005e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmo.zzl(com.google.android.gms.internal.ads.zzci, com.google.android.gms.internal.ads.zzci):boolean");
    }
}
