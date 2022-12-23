package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public class zzgpc extends zzgpf implements zzako {
    zzakp zza;
    protected final String zzb = "moov";

    public zzgpc(String str) {
    }

    public final String zza() {
        return this.zzb;
    }

    public final void zzb(zzgpg zzgpg, ByteBuffer byteBuffer, long j, zzakl zzakl) throws IOException {
        zzgpg.zzb();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.zzd = zzgpg;
        this.zzf = zzgpg.zzb();
        zzgpg.zze(zzgpg.zzb() + j);
        this.zzg = zzgpg.zzb();
        this.zzc = zzakl;
    }

    public final void zzc(zzakp zzakp) {
        this.zza = zzakp;
    }
}
