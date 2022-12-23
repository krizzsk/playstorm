package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfxi {
    private static final Logger zza = Logger.getLogger(zzfxi.class.getName());
    private static final ConcurrentMap zzb = new ConcurrentHashMap();
    private static final ConcurrentMap zzc = new ConcurrentHashMap();
    private static final ConcurrentMap zzd = new ConcurrentHashMap();
    private static final ConcurrentMap zze = new ConcurrentHashMap();
    private static final ConcurrentMap zzf = new ConcurrentHashMap();
    private static final ConcurrentMap zzg = new ConcurrentHashMap();

    private zzfxi() {
    }

    @Deprecated
    public static zzfwg zza(String str) throws GeneralSecurityException {
        if (str != null) {
            zzfwg zzfwg = (zzfwg) zze.get(str.toLowerCase(Locale.US));
            if (zzfwg != null) {
                return zzfwg;
            }
            String format = String.format("no catalogue found for %s. ", new Object[]{str});
            if (str.toLowerCase(Locale.US).startsWith("tinkaead")) {
                format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
            }
            if (str.toLowerCase(Locale.US).startsWith("tinkdeterministicaead")) {
                format = String.valueOf(format).concat("Maybe call DeterministicAeadConfig.register().");
            } else if (str.toLowerCase(Locale.US).startsWith("tinkstreamingaead")) {
                format = String.valueOf(format).concat("Maybe call StreamingAeadConfig.register().");
            } else if (str.toLowerCase(Locale.US).startsWith("tinkhybriddecrypt") || str.toLowerCase(Locale.US).startsWith("tinkhybridencrypt")) {
                format = String.valueOf(format).concat("Maybe call HybridConfig.register().");
            } else if (str.toLowerCase(Locale.US).startsWith("tinkmac")) {
                format = String.valueOf(format).concat("Maybe call MacConfig.register().");
            } else if (str.toLowerCase(Locale.US).startsWith("tinkpublickeysign") || str.toLowerCase(Locale.US).startsWith("tinkpublickeyverify")) {
                format = String.valueOf(format).concat("Maybe call SignatureConfig.register().");
            } else if (str.toLowerCase(Locale.US).startsWith("tink")) {
                format = String.valueOf(format).concat("Maybe call TinkConfig.register().");
            }
            throw new GeneralSecurityException(format);
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }

    public static zzfwm zzb(String str) throws GeneralSecurityException {
        return zzp(str).zzb();
    }

    public static synchronized zzgfh zzc(zzgfm zzgfm) throws GeneralSecurityException {
        zzgfh zza2;
        synchronized (zzfxi.class) {
            zzfwm zzb2 = zzb(zzgfm.zzf());
            if (((Boolean) zzd.get(zzgfm.zzf())).booleanValue()) {
                zza2 = zzb2.zza(zzgfm.zze());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzgfm.zzf())));
            }
        }
        return zza2;
    }

    public static synchronized zzgly zzd(zzgfm zzgfm) throws GeneralSecurityException {
        zzgly zzb2;
        synchronized (zzfxi.class) {
            zzfwm zzb3 = zzb(zzgfm.zzf());
            if (((Boolean) zzd.get(zzgfm.zzf())).booleanValue()) {
                zzb2 = zzb3.zzb(zzgfm.zze());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzgfm.zzf())));
            }
        }
        return zzb2;
    }

    public static Class zze(Class cls) {
        zzfxb zzfxb = (zzfxb) zzf.get(cls);
        if (zzfxb == null) {
            return null;
        }
        return zzfxb.zza();
    }

    public static Object zzf(zzgfh zzgfh, Class cls) throws GeneralSecurityException {
        return zzq(zzgfh.zzf(), zzgfh.zze(), cls);
    }

    public static Object zzg(String str, zzgly zzgly, Class cls) throws GeneralSecurityException {
        return zzo(str, cls).zze(zzgly);
    }

    public static Object zzh(String str, byte[] bArr, Class cls) throws GeneralSecurityException {
        return zzq(str, zzgjg.zzv(bArr), cls);
    }

    public static Object zzi(zzfxa zzfxa, Class cls) throws GeneralSecurityException {
        zzfxb zzfxb = (zzfxb) zzf.get(cls);
        if (zzfxb == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(String.valueOf(zzfxa.zzd().getName())));
        } else if (zzfxb.zza().equals(zzfxa.zzd())) {
            return zzfxb.zzc(zzfxa);
        } else {
            String obj = zzfxb.zza().toString();
            String obj2 = zzfxa.zzd().toString();
            throw new GeneralSecurityException("Wrong input primitive class, expected " + obj + ", got " + obj2);
        }
    }

    static synchronized Map zzj() {
        Map unmodifiableMap;
        synchronized (zzfxi.class) {
            unmodifiableMap = Collections.unmodifiableMap(zzg);
        }
        return unmodifiableMap;
    }

    public static synchronized void zzk(zzgas zzgas, zzgar zzgar, boolean z) throws GeneralSecurityException {
        Class zzd2;
        synchronized (zzfxi.class) {
            String zzc2 = zzgas.zzc();
            String zzc3 = zzgar.zzc();
            zzr(zzc2, zzgas.getClass(), zzgas.zza().zzc(), true);
            zzr(zzc3, zzgar.getClass(), Collections.emptyMap(), false);
            if (!zzc2.equals(zzc3)) {
                int zze2 = zzgar.zze();
                if (!zzfzc.zza(1)) {
                    String valueOf = String.valueOf(zzgas.getClass());
                    throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
                } else if (zzfzc.zza(zze2)) {
                    if (zzb.containsKey(zzc2) && (zzd2 = ((zzfxh) zzb.get(zzc2)).zzd()) != null) {
                        if (!zzd2.getName().equals(zzgar.getClass().getName())) {
                            Logger logger = zza;
                            Level level = Level.WARNING;
                            logger.logp(level, "com.google.crypto.tink.Registry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + zzc2 + " with inconsistent public key type " + zzc3);
                            throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", new Object[]{zzgas.getClass().getName(), zzd2.getName(), zzgar.getClass().getName()}));
                        }
                    }
                    if (!zzb.containsKey(zzc2) || ((zzfxh) zzb.get(zzc2)).zzd() == null) {
                        zzb.put(zzc2, new zzfxf(zzgas, zzgar));
                        zzc.put(zzc2, new zzfxg(zzgas));
                        zzs(zzgas.zzc(), zzgas.zza().zzc());
                    }
                    zzd.put(zzc2, true);
                    if (!zzb.containsKey(zzc3)) {
                        zzb.put(zzc3, new zzfxe(zzgar));
                    }
                    zzd.put(zzc3, false);
                } else {
                    String valueOf2 = String.valueOf(zzgar.getClass());
                    throw new GeneralSecurityException("failed to register key manager " + valueOf2 + " as it is not FIPS compatible.");
                }
            } else {
                throw new GeneralSecurityException("Private and public key type must be different.");
            }
        }
    }

    public static synchronized void zzm(zzgar zzgar, boolean z) throws GeneralSecurityException {
        synchronized (zzfxi.class) {
            String zzc2 = zzgar.zzc();
            zzr(zzc2, zzgar.getClass(), zzgar.zza().zzc(), true);
            if (zzfzc.zza(zzgar.zze())) {
                if (!zzb.containsKey(zzc2)) {
                    zzb.put(zzc2, new zzfxe(zzgar));
                    zzc.put(zzc2, new zzfxg(zzgar));
                    zzs(zzc2, zzgar.zza().zzc());
                }
                zzd.put(zzc2, true);
            } else {
                String valueOf = String.valueOf(zzgar.getClass());
                throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
            }
        }
    }

    public static synchronized void zzn(zzfxb zzfxb) throws GeneralSecurityException {
        synchronized (zzfxi.class) {
            if (zzfxb != null) {
                Class zzb2 = zzfxb.zzb();
                if (zzf.containsKey(zzb2)) {
                    zzfxb zzfxb2 = (zzfxb) zzf.get(zzb2);
                    if (!zzfxb.getClass().getName().equals(zzfxb2.getClass().getName())) {
                        zza.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(zzb2.toString()));
                        throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", new Object[]{zzb2.getName(), zzfxb2.getClass().getName(), zzfxb.getClass().getName()}));
                    }
                }
                zzf.put(zzb2, zzfxb);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    private static zzfwm zzo(String str, Class cls) throws GeneralSecurityException {
        zzfxh zzp = zzp(str);
        if (zzp.zze().contains(cls)) {
            return zzp.zza(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zzp.zzc());
        Set<Class> zze2 = zzp.zze();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class cls2 : zze2) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + valueOf + ", supported primitives: " + sb2);
    }

    private static synchronized zzfxh zzp(String str) throws GeneralSecurityException {
        zzfxh zzfxh;
        synchronized (zzfxi.class) {
            if (zzb.containsKey(str)) {
                zzfxh = (zzfxh) zzb.get(str);
            } else {
                throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
            }
        }
        return zzfxh;
    }

    private static Object zzq(String str, zzgjg zzgjg, Class cls) throws GeneralSecurityException {
        return zzo(str, cls).zzd(zzgjg);
    }

    private static synchronized void zzr(String str, Class cls, Map map, boolean z) throws GeneralSecurityException {
        synchronized (zzfxi.class) {
            zzfxh zzfxh = (zzfxh) zzb.get(str);
            if (zzfxh != null) {
                if (!zzfxh.zzc().equals(cls)) {
                    zza.logp(Level.WARNING, "com.google.crypto.tink.Registry", "ensureKeyManagerInsertable", "Attempted overwrite of a registered key manager for key type ".concat(str));
                    throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{str, zzfxh.zzc().getName(), cls.getName()}));
                }
            }
            if (z) {
                if (zzd.containsKey(str)) {
                    if (!((Boolean) zzd.get(str)).booleanValue()) {
                        throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                    }
                }
                if (zzb.containsKey(str)) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!zzg.containsKey(entry.getKey())) {
                            throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                        }
                    }
                } else {
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (zzg.containsKey(entry2.getKey())) {
                            throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [com.google.android.gms.internal.ads.zzgly, java.lang.Object] */
    private static void zzs(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            zzg.put((String) entry.getKey(), zzfwp.zze(str, ((zzgao) entry.getValue()).zza.zzau(), ((zzgao) entry.getValue()).zzb));
        }
    }

    public static synchronized void zzl(zzfwm zzfwm, boolean z) throws GeneralSecurityException {
        synchronized (zzfxi.class) {
            if (zzfwm != null) {
                String zzf2 = zzfwm.zzf();
                zzr(zzf2, zzfwm.getClass(), Collections.emptyMap(), z);
                zzb.putIfAbsent(zzf2, new zzfxd(zzfwm));
                zzd.put(zzf2, Boolean.valueOf(z));
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }
}
