package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public class zzdzk extends Exception {
    private final int zza;

    public zzdzk(int i) {
        this.zza = i;
    }

    public final int zza() {
        return this.zza;
    }

    public zzdzk(int i, String str) {
        super(str);
        this.zza = i;
    }

    public zzdzk(int i, String str, Throwable th) {
        super(str, th);
        this.zza = 1;
    }
}
