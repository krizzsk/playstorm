package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgka {
    static final zzgka zza = new zzgka(true);
    private static volatile boolean zzb = false;
    private static volatile zzgka zzc;
    private static volatile zzgka zzd;
    private final Map zze;

    zzgka() {
        this.zze = new HashMap();
    }

    public static zzgka zza() {
        zzgka zzgka = zzc;
        if (zzgka == null) {
            synchronized (zzgka.class) {
                zzgka = zzc;
                if (zzgka == null) {
                    zzgka = zza;
                    zzc = zzgka;
                }
            }
        }
        return zzgka;
    }

    public final zzgkm zzc(zzgly zzgly, int i) {
        return (zzgkm) this.zze.get(new zzgjz(zzgly, i));
    }

    zzgka(boolean z) {
        this.zze = Collections.emptyMap();
    }

    public static zzgka zzb() {
        Class<zzgka> cls = zzgka.class;
        zzgka zzgka = zzd;
        if (zzgka != null) {
            return zzgka;
        }
        synchronized (cls) {
            zzgka zzgka2 = zzd;
            if (zzgka2 != null) {
                return zzgka2;
            }
            zzgka zzb2 = zzgki.zzb(cls);
            zzd = zzb2;
            return zzb2;
        }
    }
}
