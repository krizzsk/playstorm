package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4730g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4731h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4767m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4804n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h */
public abstract class C4814h {

    /* renamed from: a */
    public C4810d f12572a;

    /* renamed from: b */
    public C4804n f12573b;

    /* renamed from: c */
    public C4731h f12574c;

    /* renamed from: d */
    public C4812f f12575d;

    /* renamed from: e */
    public long f12576e;

    /* renamed from: f */
    public long f12577f;

    /* renamed from: g */
    public long f12578g;

    /* renamed from: h */
    public int f12579h;

    /* renamed from: i */
    public int f12580i;

    /* renamed from: j */
    public C4815a f12581j;

    /* renamed from: k */
    public long f12582k;

    /* renamed from: l */
    public boolean f12583l;

    /* renamed from: m */
    public boolean f12584m;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h$a */
    public static class C4815a {

        /* renamed from: a */
        public C4869i f12585a;

        /* renamed from: b */
        public C4812f f12586b;
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h$b */
    public static final class C4816b implements C4812f {
        /* renamed from: a */
        public long mo25276a(C4730g gVar) throws IOException, InterruptedException {
            return -1;
        }

        /* renamed from: b */
        public C4767m mo25278b() {
            return new C4767m.C4768a(-9223372036854775807L);
        }

        /* renamed from: c */
        public long mo25279c(long j) {
            return 0;
        }
    }

    /* renamed from: a */
    public abstract long mo25280a(C5036k kVar);

    /* renamed from: a */
    public void mo25281a(boolean z) {
        if (z) {
            this.f12581j = new C4815a();
            this.f12577f = 0;
            this.f12579h = 0;
        } else {
            this.f12579h = 1;
        }
        this.f12576e = -1;
        this.f12578g = 0;
    }

    /* renamed from: a */
    public abstract boolean mo25282a(C5036k kVar, long j, C4815a aVar) throws IOException, InterruptedException;

    /* renamed from: b */
    public void mo25289b(long j) {
        this.f12578g = j;
    }

    /* renamed from: a */
    public long mo25288a(long j) {
        return (((long) this.f12580i) * j) / 1000000;
    }
}
