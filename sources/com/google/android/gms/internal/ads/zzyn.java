package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzyn {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private Constructor zzb;

    public final zzys zza(int i) {
        Constructor constructor;
        synchronized (this.zza) {
            if (this.zza.get()) {
                constructor = this.zzb;
            } else {
                try {
                    if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke((Object) null, new Object[0]))) {
                        this.zzb = Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzys.class).getConstructor(new Class[]{Integer.TYPE});
                    }
                } catch (ClassNotFoundException unused) {
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating FLAC extension", e);
                }
                this.zza.set(true);
                constructor = this.zzb;
            }
        }
        if (constructor == null) {
            return null;
        }
        try {
            return (zzys) constructor.newInstance(new Object[]{0});
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating FLAC extractor", e2);
        }
    }
}
