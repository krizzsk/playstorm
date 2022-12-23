package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzant implements zzfmn {
    final /* synthetic */ zzfkn zza;

    zzant(zzanv zzanv, zzfkn zzfkn) {
        this.zza = zzfkn;
    }

    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
