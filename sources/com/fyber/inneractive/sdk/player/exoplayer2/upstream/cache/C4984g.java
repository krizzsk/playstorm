package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.io.File;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.g */
public class C4984g implements Comparable<C4984g> {

    /* renamed from: a */
    public final String f13282a;

    /* renamed from: b */
    public final long f13283b;

    /* renamed from: c */
    public final long f13284c;

    /* renamed from: d */
    public final boolean f13285d;

    /* renamed from: e */
    public final File f13286e;

    /* renamed from: f */
    public final long f13287f;

    public C4984g(String str, long j, long j2, long j3, File file) {
        this.f13282a = str;
        this.f13283b = j;
        this.f13284c = j2;
        this.f13285d = file != null;
        this.f13286e = file;
        this.f13287f = j3;
    }

    /* renamed from: a */
    public int compareTo(C4984g gVar) {
        if (!this.f13282a.equals(gVar.f13282a)) {
            return this.f13282a.compareTo(gVar.f13282a);
        }
        int i = ((this.f13283b - gVar.f13283b) > 0 ? 1 : ((this.f13283b - gVar.f13283b) == 0 ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        return i < 0 ? -1 : 1;
    }
}
