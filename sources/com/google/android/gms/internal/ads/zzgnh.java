package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgnh extends RuntimeException {
    public zzgnh(zzgly zzgly) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzgla zza() {
        return new zzgla(getMessage());
    }
}
