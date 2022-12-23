package com.fyber.inneractive.sdk.player.exoplayer2;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.p */
public abstract class C4913p {

    /* renamed from: a */
    public static final C4913p f13076a = new C4914a();

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.p$a */
    public class C4914a extends C4913p {
        /* renamed from: a */
        public int mo25457a() {
            return 0;
        }

        /* renamed from: a */
        public int mo25458a(Object obj) {
            return -1;
        }

        /* renamed from: a */
        public C4916c mo25461a(int i, C4916c cVar, boolean z, long j) {
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: b */
        public int mo25462b() {
            return 0;
        }

        /* renamed from: a */
        public C4915b mo25459a(int i, C4915b bVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.p$b */
    public static final class C4915b {

        /* renamed from: a */
        public Object f13077a;

        /* renamed from: b */
        public Object f13078b;

        /* renamed from: c */
        public int f13079c;

        /* renamed from: d */
        public long f13080d;

        /* renamed from: e */
        public long f13081e;
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.p$c */
    public static final class C4916c {

        /* renamed from: a */
        public Object f13082a;

        /* renamed from: b */
        public boolean f13083b;

        /* renamed from: c */
        public int f13084c;

        /* renamed from: d */
        public int f13085d;

        /* renamed from: e */
        public long f13086e;

        /* renamed from: f */
        public long f13087f;

        /* renamed from: g */
        public long f13088g;
    }

    /* renamed from: a */
    public abstract int mo25457a();

    /* renamed from: a */
    public abstract int mo25458a(Object obj);

    /* renamed from: a */
    public abstract C4915b mo25459a(int i, C4915b bVar, boolean z);

    /* renamed from: a */
    public final C4916c mo25460a(int i, C4916c cVar) {
        return mo25461a(i, cVar, false, 0);
    }

    /* renamed from: a */
    public abstract C4916c mo25461a(int i, C4916c cVar, boolean z, long j);

    /* renamed from: b */
    public abstract int mo25462b();

    /* renamed from: c */
    public final boolean mo25463c() {
        return mo25462b() == 0;
    }
}
