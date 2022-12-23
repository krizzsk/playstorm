package com.inmobi.media;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.inmobi.media.bi */
/* compiled from: Click */
public final class C5872bi {

    /* renamed from: a */
    int f14821a;

    /* renamed from: b */
    public String f14822b;

    /* renamed from: c */
    public Map<String, String> f14823c;

    /* renamed from: d */
    long f14824d;

    /* renamed from: e */
    long f14825e;

    /* renamed from: f */
    int f14826f;

    /* renamed from: g */
    AtomicBoolean f14827g;

    /* renamed from: h */
    boolean f14828h;

    /* renamed from: i */
    boolean f14829i;

    C5872bi(String str, boolean z, boolean z2, int i) {
        this(new Random().nextInt() & Integer.MAX_VALUE, str, new HashMap(), z, z2, i, System.currentTimeMillis(), System.currentTimeMillis());
    }

    C5872bi(String str, Map<String, String> map, boolean z, int i) {
        this(new Random().nextInt() & Integer.MAX_VALUE, str, map, z, false, i, System.currentTimeMillis(), System.currentTimeMillis());
    }

    C5872bi(int i, String str, Map<String, String> map, boolean z, boolean z2, int i2, long j, long j2) {
        this.f14821a = i;
        this.f14822b = str;
        this.f14823c = map;
        this.f14824d = j;
        this.f14825e = j2;
        this.f14826f = i2;
        this.f14827g = new AtomicBoolean(false);
        this.f14829i = z;
        this.f14828h = z2;
    }

    /* renamed from: a */
    public final boolean mo34844a(long j) {
        return System.currentTimeMillis() - this.f14825e > j * 1000;
    }
}
