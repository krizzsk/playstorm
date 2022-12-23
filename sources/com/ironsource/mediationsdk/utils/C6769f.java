package com.ironsource.mediationsdk.utils;

import java.util.Date;

/* renamed from: com.ironsource.mediationsdk.utils.f */
public final class C6769f {

    /* renamed from: a */
    private long f17696a = new Date().getTime();

    /* renamed from: a */
    public static long m20576a(C6769f fVar) {
        if (fVar == null) {
            return 0;
        }
        return new Date().getTime() - fVar.f17696a;
    }
}
