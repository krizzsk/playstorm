package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
class zzfwo implements zzfwm {
    private final zzgar zza;
    private final Class zzb;

    public zzfwo(zzgar zzgar, Class cls) {
        if (zzgar.zzl().contains(cls) || Void.class.equals(cls)) {
            this.zza = zzgar;
            this.zzb = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[]{zzgar.toString(), cls.getName()}));
    }

    private final zzfwn zzg() {
        return new zzfwn(this.zza.zza());
    }

    private final Object zzh(zzgly zzgly) throws GeneralSecurityException {
        if (!Void.class.equals(this.zzb)) {
            this.zza.zzd(zzgly);
            return this.zza.zzk(zzgly, this.zzb);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    public final zzgfh zza(zzgjg zzgjg) throws GeneralSecurityException {
        try {
            zzgly zza2 = zzg().zza(zzgjg);
            zzgfg zza3 = zzgfh.zza();
            zza3.zza(this.zza.zzc());
            zza3.zzb(zza2.zzaq());
            zza3.zzc(this.zza.zzf());
            return (zzgfh) zza3.zzaj();
        } catch (zzgla e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    public final zzgly zzb(zzgjg zzgjg) throws GeneralSecurityException {
        try {
            return zzg().zza(zzgjg);
        } catch (zzgla e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(String.valueOf(this.zza.zza().zzg().getName())), e);
        }
    }

    public final Class zzc() {
        return this.zzb;
    }

    public final Object zzd(zzgjg zzgjg) throws GeneralSecurityException {
        try {
            return zzh(this.zza.zzb(zzgjg));
        } catch (zzgla e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(String.valueOf(this.zza.zzj().getName())), e);
        }
    }

    public final Object zze(zzgly zzgly) throws GeneralSecurityException {
        String concat = "Expected proto of type ".concat(String.valueOf(this.zza.zzj().getName()));
        if (this.zza.zzj().isInstance(zzgly)) {
            return zzh(zzgly);
        }
        throw new GeneralSecurityException(concat);
    }

    public final String zzf() {
        return this.zza.zzc();
    }
}
