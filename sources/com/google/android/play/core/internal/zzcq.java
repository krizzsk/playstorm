package com.google.android.play.core.internal;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final class zzcq implements zzcs, zzco {
    private static final Object zza = new Object();
    private volatile zzcs zzb;
    private volatile Object zzc = zza;

    private zzcq(zzcs zzcs) {
        this.zzb = zzcs;
    }

    public static zzco zzb(zzcs zzcs) {
        if (zzcs instanceof zzco) {
            return (zzco) zzcs;
        }
        if (zzcs != null) {
            return new zzcq(zzcs);
        }
        throw null;
    }

    public static zzcs zzc(zzcs zzcs) {
        if (zzcs == null) {
            throw null;
        } else if (zzcs instanceof zzcq) {
            return zzcs;
        } else {
            return new zzcq(zzcs);
        }
    }

    public final Object zza() {
        Object obj = this.zzc;
        if (obj == zza) {
            synchronized (this) {
                obj = this.zzc;
                if (obj == zza) {
                    obj = this.zzb.zza();
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
