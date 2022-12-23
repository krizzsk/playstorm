package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzgkf {
    private static final zzgkf zzb = new zzgkf(true);
    final zzgne zza = new zzgmu(16);
    private boolean zzc;
    private boolean zzd;

    private zzgkf() {
    }

    public static zzgkf zza() {
        throw null;
    }

    private static final void zzd(zzgke zzgke, Object obj) {
        boolean z;
        zzgny zzb2 = zzgke.zzb();
        zzgky.zze(obj);
        zzgny zzgny = zzgny.DOUBLE;
        zzgnz zzgnz = zzgnz.INT;
        switch (zzb2.zza().ordinal()) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof zzgjg) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof zzgkq)) {
                    return;
                }
            case 8:
                if ((obj instanceof zzgly) || (obj instanceof zzgld)) {
                    return;
                }
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzgke.zza()), zzgke.zzb().zza(), obj.getClass().getName()}));
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzgkf zzgkf = new zzgkf();
        for (int i = 0; i < this.zza.zzb(); i++) {
            Map.Entry zzg = this.zza.zzg(i);
            zzgkf.zzc((zzgke) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzgkf.zzc((zzgke) entry.getKey(), entry.getValue());
        }
        zzgkf.zzd = this.zzd;
        return zzgkf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgkf)) {
            return false;
        }
        return this.zza.equals(((zzgkf) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (!this.zzc) {
            this.zza.zza();
            this.zzc = true;
        }
    }

    public final void zzc(zzgke zzgke, Object obj) {
        if (!zzgke.zzc()) {
            zzd(zzgke, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                zzd(zzgke, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzgld) {
            this.zzd = true;
        }
        this.zza.put(zzgke, obj);
    }

    private zzgkf(boolean z) {
        zzb();
        zzb();
    }
}
