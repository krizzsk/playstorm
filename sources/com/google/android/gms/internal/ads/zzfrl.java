package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfrl extends zzfra {
    @CheckForNull
    Object[] zzd;
    private int zze;

    public zzfrl() {
        super(4);
    }

    public final /* bridge */ /* synthetic */ zzfrb zzb(Object obj) {
        zze(obj);
        return this;
    }

    public final zzfrl zze(Object obj) {
        Object[] objArr;
        int length;
        if (obj == null) {
            throw null;
        } else if (this.zzd == null || zzfrm.zzh(this.zzb) > (length = objArr.length)) {
            this.zzd = null;
            super.zza(obj);
            return this;
        } else {
            (objArr = this.zzd).getClass();
            int i = length - 1;
            int hashCode = obj.hashCode();
            int zza = zzfqz.zza(hashCode);
            while (true) {
                int i2 = zza & i;
                Object[] objArr2 = this.zzd;
                Object obj2 = objArr2[i2];
                if (obj2 != null) {
                    if (obj2.equals(obj)) {
                        break;
                    }
                    zza = i2 + 1;
                } else {
                    objArr2[i2] = obj;
                    this.zze += hashCode;
                    super.zza(obj);
                    break;
                }
            }
            return this;
        }
    }

    public final zzfrl zzf(Iterable iterable) {
        if (this.zzd != null) {
            for (Object zze2 : iterable) {
                zze(zze2);
            }
        } else {
            super.zzc(iterable);
        }
        return this;
    }

    zzfrl(int i) {
        super(i);
        this.zzd = new Object[zzfrm.zzh(i)];
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.google.android.gms.internal.ads.zzfsw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.google.android.gms.internal.ads.zzfrm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.google.android.gms.internal.ads.zzfsw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.google.android.gms.internal.ads.zzfsw} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzfrm zzg() {
        /*
            r9 = this;
            int r0 = r9.zzb
            if (r0 == 0) goto L_0x0056
            r1 = 1
            if (r0 == r1) goto L_0x0048
            java.lang.Object[] r2 = r9.zzd
            if (r2 == 0) goto L_0x0034
            int r0 = com.google.android.gms.internal.ads.zzfrm.zzh(r0)
            java.lang.Object[] r2 = r9.zzd
            int r2 = r2.length
            if (r0 != r2) goto L_0x0034
            int r0 = r9.zzb
            java.lang.Object[] r2 = r9.zza
            int r3 = r2.length
            boolean r3 = com.google.android.gms.internal.ads.zzfrm.zzq(r0, r3)
            if (r3 == 0) goto L_0x0023
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
        L_0x0023:
            r4 = r2
            com.google.android.gms.internal.ads.zzfsw r0 = new com.google.android.gms.internal.ads.zzfsw
            int r5 = r9.zze
            java.lang.Object[] r6 = r9.zzd
            int r2 = r6.length
            int r7 = r2 + -1
            int r8 = r9.zzb
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x0042
        L_0x0034:
            int r0 = r9.zzb
            java.lang.Object[] r2 = r9.zza
            com.google.android.gms.internal.ads.zzfrm r0 = com.google.android.gms.internal.ads.zzfrm.zzp(r0, r2)
            int r2 = r0.size()
            r9.zzb = r2
        L_0x0042:
            r9.zzc = r1
            r1 = 0
            r9.zzd = r1
            return r0
        L_0x0048:
            java.lang.Object[] r0 = r9.zza
            r1 = 0
            r0 = r0[r1]
            r0.getClass()
            com.google.android.gms.internal.ads.zzftd r1 = new com.google.android.gms.internal.ads.zzftd
            r1.<init>(r0)
            return r1
        L_0x0056:
            com.google.android.gms.internal.ads.zzfsw r0 = com.google.android.gms.internal.ads.zzfsw.zza
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfrl.zzg():com.google.android.gms.internal.ads.zzfrm");
    }
}
