package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzfwz implements Comparable {
    private final byte[] zza;

    /* synthetic */ zzfwz(byte[] bArr, zzfwy zzfwy) {
        this.zza = Arrays.copyOf(bArr, bArr.length);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzfwz zzfwz = (zzfwz) obj;
        int length = this.zza.length;
        int length2 = zzfwz.zza.length;
        if (length != length2) {
            return length - length2;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.zza;
            if (i >= bArr.length) {
                return 0;
            }
            byte b = bArr[i];
            byte b2 = zzfwz.zza[i];
            if (b != b2) {
                return b - b2;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfwz)) {
            return false;
        }
        return Arrays.equals(this.zza, ((zzfwz) obj).zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        return zzgia.zza(this.zza);
    }
}
