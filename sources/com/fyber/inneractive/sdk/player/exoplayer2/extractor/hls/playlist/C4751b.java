package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b */
public final class C4751b extends C4753c {

    /* renamed from: b */
    public final int f12053b;

    /* renamed from: c */
    public final long f12054c;

    /* renamed from: d */
    public final long f12055d;

    /* renamed from: e */
    public final boolean f12056e;

    /* renamed from: f */
    public final int f12057f;

    /* renamed from: g */
    public final int f12058g;

    /* renamed from: h */
    public final int f12059h;

    /* renamed from: i */
    public final long f12060i;

    /* renamed from: j */
    public final boolean f12061j;

    /* renamed from: k */
    public final boolean f12062k;

    /* renamed from: l */
    public final C4752a f12063l;

    /* renamed from: m */
    public final List<C4752a> f12064m;

    /* renamed from: n */
    public final List<String> f12065n;

    /* renamed from: o */
    public final long f12066o;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a */
    public static final class C4752a implements Comparable<Long> {

        /* renamed from: a */
        public final String f12067a;

        /* renamed from: b */
        public final long f12068b;

        /* renamed from: c */
        public final int f12069c;

        /* renamed from: d */
        public final long f12070d;

        /* renamed from: e */
        public final boolean f12071e;

        /* renamed from: f */
        public final String f12072f;

        /* renamed from: g */
        public final String f12073g;

        /* renamed from: h */
        public final long f12074h;

        /* renamed from: i */
        public final long f12075i;

        public C4752a(String str, long j, int i, long j2, boolean z, String str2, String str3, long j3, long j4) {
            this.f12067a = str;
            this.f12068b = j;
            this.f12069c = i;
            this.f12070d = j2;
            this.f12071e = z;
            this.f12072f = str2;
            this.f12073g = str3;
            this.f12074h = j3;
            this.f12075i = j4;
        }

        public int compareTo(Object obj) {
            Long l = (Long) obj;
            if (this.f12070d > l.longValue()) {
                return 1;
            }
            return this.f12070d < l.longValue() ? -1 : 0;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4751b(int i, String str, long j, long j2, boolean z, int i2, int i3, int i4, long j3, boolean z2, boolean z3, C4752a aVar, List<C4752a> list, List<String> list2) {
        super(str);
        String str2 = str;
        this.f12053b = i;
        this.f12055d = j2;
        this.f12056e = z;
        this.f12057f = i2;
        this.f12058g = i3;
        this.f12059h = i4;
        this.f12060i = j3;
        this.f12061j = z2;
        this.f12062k = z3;
        this.f12063l = aVar;
        this.f12064m = Collections.unmodifiableList(list);
        if (!list.isEmpty()) {
            C4752a aVar2 = list.get(list.size() - 1);
            this.f12066o = aVar2.f12070d + aVar2.f12068b;
        } else {
            this.f12066o = 0;
        }
        this.f12054c = j == -9223372036854775807L ? -9223372036854775807L : j >= 0 ? j : this.f12066o + j;
        this.f12065n = Collections.unmodifiableList(list2);
    }
}
