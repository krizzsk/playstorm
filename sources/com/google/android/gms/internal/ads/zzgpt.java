package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgpt implements zzgqh, zzgpo {
    private static final Object zza = new Object();
    private volatile zzgqh zzb;
    private volatile Object zzc = zza;

    private zzgpt(zzgqh zzgqh) {
        this.zzb = zzgqh;
    }

    public static zzgpo zza(zzgqh zzgqh) {
        if (zzgqh instanceof zzgpo) {
            return (zzgpo) zzgqh;
        }
        if (zzgqh != null) {
            return new zzgpt(zzgqh);
        }
        throw null;
    }

    public static zzgqh zzc(zzgqh zzgqh) {
        if (zzgqh == null) {
            throw null;
        } else if (zzgqh instanceof zzgpt) {
            return zzgqh;
        } else {
            return new zzgpt(zzgqh);
        }
    }

    public final Object zzb() {
        Object obj = this.zzc;
        if (obj == zza) {
            synchronized (this) {
                obj = this.zzc;
                if (obj == zza) {
                    obj = this.zzb.zzb();
                    Object obj2 = this.zzc;
                    if (obj2 != zza) {
                        if (obj2 != obj) {
                            String valueOf = String.valueOf(obj2);
                            String valueOf2 = String.valueOf(obj);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 118 + String.valueOf(valueOf2).length());
                            sb.append("Scoped provider was invoked recursively returning different results: ");
                            sb.append(valueOf);
                            sb.append(" & ");
                            sb.append(valueOf2);
                            sb.append(". This is likely due to a circular dependency.");
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    this.zzc = obj;
                    this.zzb = null;
                }
            }
        }
        return obj;
    }
}
