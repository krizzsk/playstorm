package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public enum zzgny {
    DOUBLE(zzgnz.DOUBLE, 1),
    FLOAT(zzgnz.FLOAT, 5),
    INT64(zzgnz.LONG, 0),
    UINT64(zzgnz.LONG, 0),
    INT32(zzgnz.INT, 0),
    FIXED64(zzgnz.LONG, 1),
    FIXED32(zzgnz.INT, 5),
    BOOL(zzgnz.BOOLEAN, 0),
    STRING(zzgnz.STRING, 2),
    GROUP(zzgnz.MESSAGE, 3),
    MESSAGE(zzgnz.MESSAGE, 2),
    BYTES(zzgnz.BYTE_STRING, 2),
    UINT32(zzgnz.INT, 0),
    ENUM(zzgnz.ENUM, 0),
    SFIXED32(zzgnz.INT, 5),
    SFIXED64(zzgnz.LONG, 1),
    SINT32(zzgnz.INT, 0),
    SINT64(zzgnz.LONG, 0);
    
    private final zzgnz zzt;

    private zzgny(zzgnz zzgnz, int i) {
        this.zzt = zzgnz;
    }

    public final zzgnz zza() {
        return this.zzt;
    }
}
