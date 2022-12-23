package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.util.TreeSet;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h */
public final class C4985h {

    /* renamed from: a */
    public final int f13288a;

    /* renamed from: b */
    public final String f13289b;

    /* renamed from: c */
    public final TreeSet<C4990l> f13290c = new TreeSet<>();

    /* renamed from: d */
    public long f13291d;

    public C4985h(int i, String str, long j) {
        this.f13288a = i;
        this.f13289b = str;
        this.f13291d = j;
    }

    /* renamed from: a */
    public int mo25534a() {
        long j = this.f13291d;
        return (((this.f13288a * 31) + this.f13289b.hashCode()) * 31) + ((int) (j ^ (j >>> 32)));
    }
}
