package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzftk implements FilenameFilter {
    private final Pattern zza;

    public zzftk(Pattern pattern) {
        if (pattern != null) {
            this.zza = pattern;
            return;
        }
        throw null;
    }

    public final boolean accept(File file, String str) {
        return this.zza.matcher(str).matches();
    }
}
