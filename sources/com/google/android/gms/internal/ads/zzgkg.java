package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public enum zzgkg {
    DOUBLE(0, 1, zzglc.DOUBLE),
    FLOAT(1, 1, zzglc.FLOAT),
    INT64(2, 1, zzglc.LONG),
    UINT64(3, 1, zzglc.LONG),
    INT32(4, 1, zzglc.INT),
    FIXED64(5, 1, zzglc.LONG),
    FIXED32(6, 1, zzglc.INT),
    BOOL(7, 1, zzglc.BOOLEAN),
    STRING(8, 1, zzglc.STRING),
    MESSAGE(9, 1, zzglc.MESSAGE),
    BYTES(10, 1, zzglc.BYTE_STRING),
    UINT32(11, 1, zzglc.INT),
    ENUM(12, 1, zzglc.ENUM),
    SFIXED32(13, 1, zzglc.INT),
    SFIXED64(14, 1, zzglc.LONG),
    SINT32(15, 1, zzglc.INT),
    SINT64(16, 1, zzglc.LONG),
    GROUP(17, 1, zzglc.MESSAGE),
    DOUBLE_LIST(18, 2, zzglc.DOUBLE),
    FLOAT_LIST(19, 2, zzglc.FLOAT),
    INT64_LIST(20, 2, zzglc.LONG),
    UINT64_LIST(21, 2, zzglc.LONG),
    INT32_LIST(22, 2, zzglc.INT),
    FIXED64_LIST(23, 2, zzglc.LONG),
    FIXED32_LIST(24, 2, zzglc.INT),
    BOOL_LIST(25, 2, zzglc.BOOLEAN),
    STRING_LIST(26, 2, zzglc.STRING),
    MESSAGE_LIST(27, 2, zzglc.MESSAGE),
    BYTES_LIST(28, 2, zzglc.BYTE_STRING),
    UINT32_LIST(29, 2, zzglc.INT),
    ENUM_LIST(30, 2, zzglc.ENUM),
    SFIXED32_LIST(31, 2, zzglc.INT),
    SFIXED64_LIST(32, 2, zzglc.LONG),
    SINT32_LIST(33, 2, zzglc.INT),
    SINT64_LIST(34, 2, zzglc.LONG),
    DOUBLE_LIST_PACKED(35, 3, zzglc.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, zzglc.FLOAT),
    INT64_LIST_PACKED(37, 3, zzglc.LONG),
    UINT64_LIST_PACKED(38, 3, zzglc.LONG),
    INT32_LIST_PACKED(39, 3, zzglc.INT),
    FIXED64_LIST_PACKED(40, 3, zzglc.LONG),
    FIXED32_LIST_PACKED(41, 3, zzglc.INT),
    BOOL_LIST_PACKED(42, 3, zzglc.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, zzglc.INT),
    ENUM_LIST_PACKED(44, 3, zzglc.ENUM),
    SFIXED32_LIST_PACKED(45, 3, zzglc.INT),
    SFIXED64_LIST_PACKED(46, 3, zzglc.LONG),
    SINT32_LIST_PACKED(47, 3, zzglc.INT),
    SINT64_LIST_PACKED(48, 3, zzglc.LONG),
    GROUP_LIST(49, 2, zzglc.MESSAGE),
    MAP(50, 4, zzglc.VOID);
    
    private static final zzgkg[] zzZ = null;
    private final zzglc zzab;
    private final int zzac;
    private final Class zzad;

    static {
        int i;
        zzZ = new zzgkg[r1];
        for (zzgkg zzgkg : values()) {
            zzZ[zzgkg.zzac] = zzgkg;
        }
    }

    private zzgkg(int i, int i2, zzglc zzglc) {
        this.zzac = i;
        this.zzab = zzglc;
        zzglc zzglc2 = zzglc.VOID;
        int i3 = i2 - 1;
        if (i3 == 1) {
            this.zzad = zzglc.zza();
        } else if (i3 != 3) {
            this.zzad = null;
        } else {
            this.zzad = zzglc.zza();
        }
        if (i2 == 1) {
            zzglc.ordinal();
        }
    }

    public final int zza() {
        return this.zzac;
    }
}
