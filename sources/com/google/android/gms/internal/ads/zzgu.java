package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgu extends zzbr {
    public static final zzl zzd = zzgt.zza;
    public final int zze;
    public final String zzf;
    public final int zzg;
    public final zzad zzh;
    public final int zzi;
    public final zzbi zzj;
    final boolean zzk;

    private zzgu(int i, Throwable th, int i2) {
        this(i, th, (String) null, i2, (String) null, -1, (zzad) null, 4, false);
    }

    public static zzgu zzb(Throwable th, String str, int i, zzad zzad, int i2, boolean z, int i3) {
        return new zzgu(1, th, (String) null, i3, str, i, zzad, zzad == null ? 4 : i2, z);
    }

    public static zzgu zzc(IOException iOException, int i) {
        return new zzgu(0, iOException, i);
    }

    public static zzgu zzd(RuntimeException runtimeException, int i) {
        return new zzgu(2, runtimeException, i);
    }

    /* access modifiers changed from: package-private */
    public final zzgu zza(zzbi zzbi) {
        String message = getMessage();
        int i = zzeg.zza;
        return new zzgu(message, getCause(), this.zzb, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, zzbi, this.zzc, this.zzk);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzgu(int r14, java.lang.Throwable r15, java.lang.String r16, int r17, java.lang.String r18, int r19, com.google.android.gms.internal.ads.zzad r20, int r21, boolean r22) {
        /*
            r13 = this;
            r4 = r14
            if (r4 == 0) goto L_0x003e
            r0 = 1
            if (r4 == r0) goto L_0x000d
            java.lang.String r0 = "Unexpected runtime error"
            r5 = r18
            r6 = r19
            goto L_0x0044
        L_0x000d:
            java.lang.String r0 = java.lang.String.valueOf(r20)
            java.lang.String r1 = com.google.android.gms.internal.ads.zzeg.zzL(r21)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = r18
            r2.append(r5)
            java.lang.String r3 = " error, index="
            r2.append(r3)
            r6 = r19
            r2.append(r6)
            java.lang.String r3 = ", format="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", format_supported="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            goto L_0x0044
        L_0x003e:
            r5 = r18
            r6 = r19
            java.lang.String r0 = "Source error"
        L_0x0044:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0051
            java.lang.String r1 = ": null"
            java.lang.String r0 = r0.concat(r1)
        L_0x0051:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r17
            r4 = r14
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r12 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgu.<init>(int, java.lang.Throwable, java.lang.String, int, java.lang.String, int, com.google.android.gms.internal.ads.zzad, int, boolean):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private zzgu(String str, Throwable th, int i, int i2, String str2, int i3, zzad zzad, int i4, zzbi zzbi, long j, boolean z) {
        super(str, th, i, j);
        boolean z2;
        int i5;
        boolean z3 = z;
        boolean z4 = false;
        if (z3) {
            i5 = i2;
            if (i5 == 1) {
                i5 = 1;
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            i5 = i2;
            z2 = true;
        }
        zzcw.zzd(z2);
        zzcw.zzd(th != null ? true : z4);
        this.zze = i5;
        this.zzf = str2;
        this.zzg = i3;
        this.zzh = zzad;
        this.zzi = i4;
        this.zzj = zzbi;
        this.zzk = z3;
    }
}
