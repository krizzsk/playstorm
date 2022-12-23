package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzakm extends zzgpf implements Closeable {
    private static final zzgpm zza = zzgpm.zzb(zzakm.class);

    public zzakm(zzgpg zzgpg, zzakl zzakl) throws IOException {
        zzf(zzgpg, zzgpg.zzc(), zzakl);
    }

    public final void close() throws IOException {
    }

    public final String toString() {
        String obj = this.zzd.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
