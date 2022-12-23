package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public abstract class zzfke extends zzfkf {
    protected final HashSet zza;
    protected final JSONObject zzb;
    protected final long zzc;

    public zzfke(zzfjx zzfjx, HashSet hashSet, JSONObject jSONObject, long j, byte[] bArr) {
        super(zzfjx, (byte[]) null);
        this.zza = new HashSet(hashSet);
        this.zzb = jSONObject;
        this.zzc = j;
    }
}
