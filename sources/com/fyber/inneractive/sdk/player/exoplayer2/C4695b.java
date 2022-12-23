package com.fyber.inneractive.sdk.player.exoplayer2;

import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import java.util.UUID;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.b */
public final class C4695b {

    /* renamed from: a */
    public static final int f11830a = (C5049u.f13471a < 23 ? 1020 : 6396);

    /* renamed from: b */
    public static final UUID f11831b = new UUID(0, 0);

    static {
        new UUID(1186680826959645954L, -5988876978535335093L);
        new UUID(-1301668207276963122L, -6645017420763422227L);
        new UUID(-7348484286925749626L, -6083546864340672619L);
    }

    /* renamed from: a */
    public static long m14454a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return 1000 * j;
    }

    /* renamed from: b */
    public static long m14455b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j / 1000;
    }
}
