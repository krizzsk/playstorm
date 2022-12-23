package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfxa {
    private final ConcurrentMap zza = new ConcurrentHashMap();
    private zzfwx zzb;
    private final Class zzc;

    private zzfxa(Class cls) {
        this.zzc = cls;
    }

    public static zzfxa zzc(Class cls) {
        return new zzfxa(cls);
    }

    public final zzfwx zza(Object obj, zzgft zzgft) throws GeneralSecurityException {
        byte[] bArr;
        if (zzgft.zzi() == 3) {
            int zzj = zzgft.zzj() - 2;
            if (zzj != 1) {
                if (zzj != 2) {
                    if (zzj == 3) {
                        bArr = zzfwi.zza;
                    } else if (zzj != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                }
                bArr = ByteBuffer.allocate(5).put((byte) 0).putInt(zzgft.zza()).array();
            } else {
                bArr = ByteBuffer.allocate(5).put((byte) 1).putInt(zzgft.zza()).array();
            }
            zzfwx zzfwx = new zzfwx(obj, bArr, zzgft.zzi(), zzgft.zzj(), zzgft.zza());
            ArrayList arrayList = new ArrayList();
            arrayList.add(zzfwx);
            zzfwz zzfwz = new zzfwz(zzfwx.zzb(), (zzfwy) null);
            List list = (List) this.zza.put(zzfwz, Collections.unmodifiableList(arrayList));
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(list);
                arrayList2.add(zzfwx);
                this.zza.put(zzfwz, Collections.unmodifiableList(arrayList2));
            }
            return zzfwx;
        }
        throw new GeneralSecurityException("only ENABLED key is allowed");
    }

    public final zzfwx zzb() {
        return this.zzb;
    }

    public final Class zzd() {
        return this.zzc;
    }

    public final List zze(byte[] bArr) {
        List list = (List) this.zza.get(new zzfwz(bArr, (zzfwy) null));
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }

    public final void zzf(zzfwx zzfwx) {
        if (zzfwx.zzc() != 3) {
            throw new IllegalArgumentException("the primary entry has to be ENABLED");
        } else if (!zze(zzfwx.zzb()).isEmpty()) {
            this.zzb = zzfwx;
        } else {
            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
        }
    }
}
