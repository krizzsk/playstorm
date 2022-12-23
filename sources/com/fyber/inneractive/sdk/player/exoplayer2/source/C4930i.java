package com.fyber.inneractive.sdk.player.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.support.p003v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.C4864h;
import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.C4871j;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.C4701b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4717d;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4723f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4730g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4731h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4766l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4767m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4804n;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4938l;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4940m;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4942n;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4964e;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4971b;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4996g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C5000j;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C5011t;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C5013v;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C5015x;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5027d;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import java.io.EOFException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.UnknownHostException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.i */
public final class C4930i implements C4940m, C4731h, C5015x.C5016a<C4933c>, C4717d.C4721d {

    /* renamed from: A */
    public boolean f13125A;

    /* renamed from: B */
    public long f13126B;

    /* renamed from: C */
    public long f13127C;

    /* renamed from: D */
    public long f13128D;

    /* renamed from: E */
    public int f13129E;

    /* renamed from: F */
    public boolean f13130F;

    /* renamed from: G */
    public boolean f13131G;

    /* renamed from: a */
    public final Uri f13132a;

    /* renamed from: b */
    public final C4996g f13133b;

    /* renamed from: c */
    public final int f13134c;

    /* renamed from: d */
    public final Handler f13135d;

    /* renamed from: e */
    public final C4938l.C4939a f13136e;

    /* renamed from: f */
    public final C4942n.C4943a f13137f;

    /* renamed from: g */
    public final C4971b f13138g;

    /* renamed from: h */
    public final String f13139h;

    /* renamed from: i */
    public final C5015x f13140i = new C5015x("Loader:ExtractorMediaPeriod");

    /* renamed from: j */
    public final C4934d f13141j;

    /* renamed from: k */
    public final C5027d f13142k;

    /* renamed from: l */
    public final Runnable f13143l;

    /* renamed from: m */
    public final Runnable f13144m;

    /* renamed from: n */
    public final Handler f13145n;

    /* renamed from: o */
    public final SparseArray<C4717d> f13146o;

    /* renamed from: p */
    public C4940m.C4941a f13147p;

    /* renamed from: q */
    public C4767m f13148q;

    /* renamed from: r */
    public boolean f13149r;

    /* renamed from: s */
    public boolean f13150s;

    /* renamed from: t */
    public boolean f13151t;

    /* renamed from: u */
    public boolean f13152u;

    /* renamed from: v */
    public int f13153v;

    /* renamed from: w */
    public C4948s f13154w;

    /* renamed from: x */
    public long f13155x;

    /* renamed from: y */
    public boolean[] f13156y;

    /* renamed from: z */
    public boolean[] f13157z;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.i$a */
    public class C4931a implements Runnable {
        public C4931a() {
        }

        /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, boolean], vars: [r5v0 ?, r5v3 ?, r5v5 ?]
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
            	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
            */
        public void run() {
            /*
                r9 = this;
                com.fyber.inneractive.sdk.player.exoplayer2.source.i r0 = com.fyber.inneractive.sdk.player.exoplayer2.source.C4930i.this
                boolean r1 = r0.f13131G
                if (r1 != 0) goto L_0x00af
                boolean r1 = r0.f13150s
                if (r1 != 0) goto L_0x00af
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.m r1 = r0.f13148q
                if (r1 == 0) goto L_0x00af
                boolean r1 = r0.f13149r
                if (r1 != 0) goto L_0x0014
                goto L_0x00af
            L_0x0014:
                android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.d> r1 = r0.f13146o
                int r1 = r1.size()
                r2 = 0
                r3 = r2
            L_0x001c:
                if (r3 >= r1) goto L_0x0031
                android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.d> r4 = r0.f13146o
                java.lang.Object r4 = r4.valueAt(r3)
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.d r4 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4717d) r4
                com.fyber.inneractive.sdk.player.exoplayer2.i r4 = r4.mo25156e()
                if (r4 != 0) goto L_0x002e
                goto L_0x00af
            L_0x002e:
                int r3 = r3 + 1
                goto L_0x001c
            L_0x0031:
                com.fyber.inneractive.sdk.player.exoplayer2.util.d r3 = r0.f13142k
                monitor-enter(r3)
                r3.f13416a = r2     // Catch:{ all -> 0x00ac }
                monitor-exit(r3)
                com.fyber.inneractive.sdk.player.exoplayer2.source.r[] r3 = new com.fyber.inneractive.sdk.player.exoplayer2.source.C4947r[r1]
                boolean[] r4 = new boolean[r1]
                r0.f13157z = r4
                boolean[] r4 = new boolean[r1]
                r0.f13156y = r4
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.m r4 = r0.f13148q
                long r4 = r4.mo25131c()
                r0.f13155x = r4
                r4 = r2
            L_0x004a:
                r5 = 1
                if (r4 >= r1) goto L_0x0080
                android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.d> r6 = r0.f13146o
                java.lang.Object r6 = r6.valueAt(r4)
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.d r6 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4717d) r6
                com.fyber.inneractive.sdk.player.exoplayer2.i r6 = r6.mo25156e()
                com.fyber.inneractive.sdk.player.exoplayer2.source.r r7 = new com.fyber.inneractive.sdk.player.exoplayer2.source.r
                com.fyber.inneractive.sdk.player.exoplayer2.i[] r8 = new com.fyber.inneractive.sdk.player.exoplayer2.C4869i[r5]
                r8[r2] = r6
                r7.<init>(r8)
                r3[r4] = r7
                java.lang.String r6 = r6.f12956f
                boolean r7 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5031h.m15319e(r6)
                if (r7 != 0) goto L_0x0074
                boolean r6 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5031h.m15318d(r6)
                if (r6 == 0) goto L_0x0073
                goto L_0x0074
            L_0x0073:
                r5 = r2
            L_0x0074:
                boolean[] r6 = r0.f13157z
                r6[r4] = r5
                boolean r6 = r0.f13125A
                r5 = r5 | r6
                r0.f13125A = r5
                int r4 = r4 + 1
                goto L_0x004a
            L_0x0080:
                com.fyber.inneractive.sdk.player.exoplayer2.source.s r1 = new com.fyber.inneractive.sdk.player.exoplayer2.source.s
                r1.<init>(r3)
                r0.f13154w = r1
                r0.f13150s = r5
                com.fyber.inneractive.sdk.player.exoplayer2.source.n$a r1 = r0.f13137f
                com.fyber.inneractive.sdk.player.exoplayer2.source.q r2 = new com.fyber.inneractive.sdk.player.exoplayer2.source.q
                long r3 = r0.f13155x
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.m r5 = r0.f13148q
                boolean r5 = r5.mo25130a()
                r2.<init>(r3, r5)
                r3 = 0
                r1.mo25342a(r2, r3)
                com.fyber.inneractive.sdk.player.exoplayer2.source.m$a r1 = r0.f13147p
                com.fyber.inneractive.sdk.player.exoplayer2.h r1 = (com.fyber.inneractive.sdk.player.exoplayer2.C4864h) r1
                android.os.Handler r1 = r1.f12899f
                r2 = 8
                android.os.Message r0 = r1.obtainMessage(r2, r0)
                r0.sendToTarget()
                goto L_0x00af
            L_0x00ac:
                r0 = move-exception
                monitor-exit(r3)
                throw r0
            L_0x00af:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.source.C4930i.C4931a.run():void");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.i$b */
    public class C4932b implements Runnable {
        public C4932b() {
        }

        public void run() {
            C4930i iVar = C4930i.this;
            if (!iVar.f13131G) {
                ((C4864h) iVar.f13147p).mo25345a((C4945p) iVar);
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.i$c */
    public final class C4933c implements C5015x.C5018c {

        /* renamed from: a */
        public final Uri f13160a;

        /* renamed from: b */
        public final C4996g f13161b;

        /* renamed from: c */
        public final C4934d f13162c;

        /* renamed from: d */
        public final C5027d f13163d;

        /* renamed from: e */
        public final C4766l f13164e = new C4766l();

        /* renamed from: f */
        public volatile boolean f13165f;

        /* renamed from: g */
        public boolean f13166g = true;

        /* renamed from: h */
        public long f13167h;

        /* renamed from: i */
        public long f13168i = -1;

        public C4933c(Uri uri, C4996g gVar, C4934d dVar, C5027d dVar2) {
            this.f13160a = (Uri) C5023a.m15300a(uri);
            this.f13161b = (C4996g) C5023a.m15300a(gVar);
            this.f13162c = (C4934d) C5023a.m15300a(dVar);
            this.f13163d = dVar2;
        }

        /* renamed from: a */
        public boolean mo25185a() {
            return this.f13165f;
        }

        /* renamed from: b */
        public void mo25186b() {
            this.f13165f = true;
        }

        public void load() throws IOException, InterruptedException {
            C4715b bVar;
            int i = 0;
            while (i == 0 && !this.f13165f) {
                try {
                    long j = this.f13164e.f12145a;
                    C4996g gVar = this.f13161b;
                    long j2 = j;
                    C5000j jVar = r6;
                    C5000j jVar2 = new C5000j(this.f13160a, (byte[]) null, j, j, -1, C4930i.this.f13139h, 0);
                    long a = gVar.mo24831a(jVar);
                    this.f13168i = a;
                    if (a != -1) {
                        this.f13168i = a + j2;
                    }
                    C4996g gVar2 = this.f13161b;
                    C4715b bVar2 = new C4715b(gVar2, j2, this.f13168i);
                    C4723f a2 = this.f13162c.mo25478a(bVar2, gVar2.mo24832a());
                    if (this.f13166g) {
                        a2.mo25164a(j2, this.f13167h);
                        this.f13166g = false;
                    }
                    while (true) {
                        long j3 = j2;
                        while (i == 0 && !this.f13165f) {
                            C5027d dVar = this.f13163d;
                            synchronized (dVar) {
                                while (!dVar.f13416a) {
                                    dVar.wait();
                                }
                            }
                            i = a2.mo25163a((C4730g) bVar2, this.f13164e);
                            j2 = bVar2.f11871c;
                            if (j2 > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED + j3) {
                                C5027d dVar2 = this.f13163d;
                                synchronized (dVar2) {
                                    try {
                                        dVar2.f13416a = false;
                                    } catch (Throwable th) {
                                        th = th;
                                        bVar = bVar2;
                                        if (!(i == 1 || bVar == null)) {
                                            this.f13164e.f12145a = bVar.f11871c;
                                        }
                                        C5049u.m15390a(this.f13161b);
                                        throw th;
                                    }
                                }
                                C4930i iVar = C4930i.this;
                                iVar.f13145n.post(iVar.f13144m);
                            }
                        }
                    }
                    if (i == 1) {
                        i = 0;
                    } else {
                        this.f13164e.f12145a = bVar2.f11871c;
                    }
                    C5049u.m15390a(this.f13161b);
                } catch (Throwable th2) {
                    th = th2;
                    bVar = null;
                    this.f13164e.f12145a = bVar.f11871c;
                    C5049u.m15390a(this.f13161b);
                    throw th;
                }
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.i$d */
    public static final class C4934d {

        /* renamed from: a */
        public final C4723f[] f13170a;

        /* renamed from: b */
        public final C4731h f13171b;

        /* renamed from: c */
        public C4723f f13172c;

        public C4934d(C4723f[] fVarArr, C4731h hVar) {
            this.f13170a = fVarArr;
            this.f13171b = hVar;
        }

        /* renamed from: a */
        public C4723f mo25478a(C4730g gVar, Uri uri) throws IOException, InterruptedException {
            C4723f fVar = this.f13172c;
            if (fVar != null) {
                return fVar;
            }
            C4723f[] fVarArr = this.f13170a;
            int length = fVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                C4723f fVar2 = fVarArr[i];
                try {
                    if (fVar2.mo25166a(gVar)) {
                        this.f13172c = fVar2;
                        ((C4715b) gVar).f11873e = 0;
                        break;
                    }
                    ((C4715b) gVar).f11873e = 0;
                    i++;
                } catch (EOFException unused) {
                } catch (Throwable th) {
                    ((C4715b) gVar).f11873e = 0;
                    throw th;
                }
            }
            C4723f fVar3 = this.f13172c;
            if (fVar3 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("None of the available extractors (");
                C4723f[] fVarArr2 = this.f13170a;
                int i2 = C5049u.f13471a;
                StringBuilder sb2 = new StringBuilder();
                for (int i3 = 0; i3 < fVarArr2.length; i3++) {
                    sb2.append(fVarArr2[i3].getClass().getSimpleName());
                    if (i3 < fVarArr2.length - 1) {
                        sb2.append(", ");
                    }
                }
                sb.append(sb2.toString());
                sb.append(") could read the stream.");
                throw new C4949t(sb.toString(), uri);
            }
            fVar3.mo25165a(this.f13171b);
            return this.f13172c;
        }
    }

    public C4930i(Uri uri, C4996g gVar, C4723f[] fVarArr, int i, Handler handler, C4938l.C4939a aVar, C4942n.C4943a aVar2, C4971b bVar, String str) {
        this.f13132a = uri;
        this.f13133b = gVar;
        this.f13134c = i;
        this.f13135d = handler;
        this.f13136e = aVar;
        this.f13137f = aVar2;
        this.f13138g = bVar;
        this.f13139h = str;
        this.f13141j = new C4934d(fVarArr, this);
        this.f13142k = new C5027d();
        this.f13143l = new C4931a();
        this.f13144m = new C4932b();
        this.f13145n = new Handler();
        this.f13128D = -9223372036854775807L;
        this.f13146o = new SparseArray<>();
        this.f13126B = -1;
    }

    /* renamed from: a */
    public void mo25217a(C5015x.C5018c cVar, long j, long j2, boolean z) {
        C4933c cVar2 = (C4933c) cVar;
        if (this.f13126B == -1) {
            this.f13126B = cVar2.f13168i;
        }
        if (!z && this.f13153v > 0) {
            int size = this.f13146o.size();
            for (int i = 0; i < size; i++) {
                this.f13146o.valueAt(i).mo25151a(this.f13156y[i]);
            }
            ((C4864h) this.f13147p).mo25345a((C4945p) this);
        }
    }

    /* renamed from: b */
    public C4948s mo25197b() {
        return this.f13154w;
    }

    /* renamed from: c */
    public void mo25175c() {
        this.f13149r = true;
        this.f13145n.post(this.f13143l);
    }

    /* renamed from: c */
    public void mo25199c(long j) {
    }

    /* renamed from: d */
    public long mo25200d() {
        long j;
        if (this.f13130F) {
            return Long.MIN_VALUE;
        }
        if (mo25474i()) {
            return this.f13128D;
        }
        if (this.f13125A) {
            j = Long.MAX_VALUE;
            int size = this.f13146o.size();
            for (int i = 0; i < size; i++) {
                if (this.f13157z[i]) {
                    j = Math.min(j, this.f13146o.valueAt(i).mo25155d());
                }
            }
        } else {
            j = mo25473h();
        }
        return j == Long.MIN_VALUE ? this.f13127C : j;
    }

    /* renamed from: e */
    public void mo25201e() throws IOException {
        this.f13140i.mo25568c();
    }

    /* renamed from: f */
    public long mo25202f() {
        if (!this.f13152u) {
            return -9223372036854775807L;
        }
        this.f13152u = false;
        return this.f13127C;
    }

    /* renamed from: g */
    public final int mo25472g() {
        int size = this.f13146o.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C4717d.C4720c cVar = this.f13146o.valueAt(i2).f11878c;
            i += cVar.f11903j + cVar.f11902i;
        }
        return i;
    }

    /* renamed from: h */
    public final long mo25473h() {
        int size = this.f13146o.size();
        long j = Long.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, this.f13146o.valueAt(i).mo25155d());
        }
        return j;
    }

    /* renamed from: i */
    public final boolean mo25474i() {
        return this.f13128D != -9223372036854775807L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005c, code lost:
        r0 = r9.f13148q;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25475j() {
        /*
            r9 = this;
            com.fyber.inneractive.sdk.player.exoplayer2.source.i$c r6 = new com.fyber.inneractive.sdk.player.exoplayer2.source.i$c
            android.net.Uri r2 = r9.f13132a
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.g r3 = r9.f13133b
            com.fyber.inneractive.sdk.player.exoplayer2.source.i$d r4 = r9.f13141j
            com.fyber.inneractive.sdk.player.exoplayer2.util.d r5 = r9.f13142k
            r0 = r6
            r1 = r9
            r0.<init>(r2, r3, r4, r5)
            boolean r0 = r9.f13150s
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L_0x0045
            boolean r0 = r9.mo25474i()
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a.m15304b(r0)
            long r3 = r9.f13155x
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r5 = 1
            if (r0 == 0) goto L_0x0031
            long r7 = r9.f13128D
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0031
            r9.f13130F = r5
            r9.f13128D = r1
            return
        L_0x0031:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.m r0 = r9.f13148q
            long r3 = r9.f13128D
            long r3 = r0.mo25129a(r3)
            long r7 = r9.f13128D
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.l r0 = r6.f13164e
            r0.f12145a = r3
            r6.f13167h = r7
            r6.f13166g = r5
            r9.f13128D = r1
        L_0x0045:
            int r0 = r9.mo25472g()
            r9.f13129E = r0
            int r0 = r9.f13134c
            r3 = -1
            if (r0 != r3) goto L_0x006c
            boolean r0 = r9.f13150s
            if (r0 == 0) goto L_0x006b
            long r3 = r9.f13126B
            r7 = -1
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x006b
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.m r0 = r9.f13148q
            if (r0 == 0) goto L_0x0069
            long r3 = r0.mo25131c()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            r0 = 6
            goto L_0x006c
        L_0x006b:
            r0 = 3
        L_0x006c:
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.x r1 = r9.f13140i
            r1.mo25565a(r6, r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.source.C4930i.mo25475j():void");
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.i$e */
    public final class C4935e implements C4944o {

        /* renamed from: a */
        public final int f13173a;

        public C4935e(int i) {
            this.f13173a = i;
        }

        /* renamed from: a */
        public void mo25210a() throws IOException {
            C4930i.this.f13140i.mo25568c();
        }

        public boolean isReady() {
            C4930i iVar = C4930i.this;
            return iVar.f13130F || (!iVar.mo25474i() && !iVar.f13146o.valueAt(this.f13173a).mo25157f());
        }

        /* renamed from: a */
        public int mo25209a(C4871j jVar, C4701b bVar, boolean z) {
            C4930i iVar = C4930i.this;
            int i = this.f13173a;
            if (iVar.f13152u || iVar.mo25474i()) {
                return -3;
            }
            return iVar.f13146o.valueAt(i).mo25144a(jVar, bVar, z, iVar.f13130F, iVar.f13127C);
        }

        /* renamed from: a */
        public void mo25211a(long j) {
            C4930i iVar = C4930i.this;
            C4717d valueAt = iVar.f13146o.valueAt(this.f13173a);
            if (!iVar.f13130F || j <= valueAt.mo25155d()) {
                valueAt.mo25152a(j, true);
            } else {
                valueAt.mo25158g();
            }
        }
    }

    /* renamed from: b */
    public long mo25196b(long j) {
        if (!this.f13148q.mo25130a()) {
            j = 0;
        }
        this.f13127C = j;
        int size = this.f13146o.size();
        boolean z = !mo25474i();
        int i = 0;
        while (z && i < size) {
            if (this.f13156y[i]) {
                z = this.f13146o.valueAt(i).mo25152a(j, false);
            }
            i++;
        }
        if (!z) {
            this.f13128D = j;
            this.f13130F = false;
            if (this.f13140i.mo25567b()) {
                this.f13140i.mo25566a();
            } else {
                for (int i2 = 0; i2 < size; i2++) {
                    this.f13146o.valueAt(i2).mo25151a(this.f13156y[i2]);
                }
            }
        }
        this.f13152u = false;
        return j;
    }

    /* renamed from: a */
    public void mo25216a(C5015x.C5018c cVar, long j, long j2) {
        C4933c cVar2 = (C4933c) cVar;
        if (this.f13126B == -1) {
            this.f13126B = cVar2.f13168i;
        }
        this.f13130F = true;
        if (this.f13155x == -9223372036854775807L) {
            long h = mo25473h();
            this.f13155x = h == Long.MIN_VALUE ? 0 : h + 10000;
            this.f13137f.mo25342a(new C4946q(this.f13155x, this.f13148q.mo25130a()), (Object) null);
        }
        ((C4864h) this.f13147p).mo25345a((C4945p) this);
    }

    /* renamed from: a */
    public int mo25213a(C5015x.C5018c cVar, long j, long j2, IOException iOException) {
        C4767m mVar;
        C4933c cVar2 = (C4933c) cVar;
        if (this.f13126B == -1) {
            this.f13126B = cVar2.f13168i;
        }
        Handler handler = this.f13135d;
        if (!(handler == null || this.f13136e == null)) {
            handler.post(new C4937k(this, iOException));
        }
        if ((iOException instanceof C4949t) || (iOException instanceof C5013v) || ((iOException instanceof C5011t) && iOException.getCause() != null && ((iOException.getCause() instanceof MalformedURLException) || (iOException.getCause() instanceof UnknownHostException)))) {
            return 3;
        }
        int i = mo25472g() > this.f13129E ? 1 : 0;
        if (this.f13126B == -1 && ((mVar = this.f13148q) == null || mVar.mo25131c() == -9223372036854775807L)) {
            this.f13127C = 0;
            this.f13152u = this.f13150s;
            int size = this.f13146o.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f13146o.valueAt(i2).mo25151a(!this.f13150s || this.f13156y[i2]);
            }
            cVar2.f13164e.f12145a = 0;
            cVar2.f13167h = 0;
            cVar2.f13166g = true;
        }
        this.f13129E = mo25472g();
        return i;
    }

    /* renamed from: a */
    public void mo25193a(C4940m.C4941a aVar) {
        this.f13147p = aVar;
        C5027d dVar = this.f13142k;
        synchronized (dVar) {
            if (!dVar.f13416a) {
                dVar.f13416a = true;
                dVar.notifyAll();
            }
        }
        mo25475j();
    }

    /* renamed from: a */
    public long mo25190a(C4964e[] eVarArr, boolean[] zArr, C4944o[] oVarArr, boolean[] zArr2, long j) {
        C5023a.m15304b(this.f13150s);
        for (int i = 0; i < eVarArr.length; i++) {
            if (oVarArr[i] != null && (eVarArr[i] == null || !zArr[i])) {
                int i2 = oVarArr[i].f13173a;
                C5023a.m15304b(this.f13156y[i2]);
                this.f13153v--;
                this.f13156y[i2] = false;
                this.f13146o.valueAt(i2).mo25153b();
                oVarArr[i] = null;
            }
        }
        boolean z = false;
        for (int i3 = 0; i3 < eVarArr.length; i3++) {
            if (oVarArr[i3] == null && eVarArr[i3] != null) {
                C4964e eVar = eVarArr[i3];
                C5023a.m15304b(eVar.mo25498f() == 1);
                C5023a.m15304b(eVar.mo25492b(0) == 0);
                int a = this.f13154w.mo25485a(eVar.mo25493b());
                C5023a.m15304b(!this.f13156y[a]);
                this.f13153v++;
                this.f13156y[a] = true;
                oVarArr[i3] = new C4935e(a);
                zArr2[i3] = true;
                z = true;
            }
        }
        if (!this.f13151t) {
            int size = this.f13146o.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (!this.f13156y[i4]) {
                    this.f13146o.valueAt(i4).mo25153b();
                }
            }
        }
        if (this.f13153v == 0) {
            this.f13152u = false;
            if (this.f13140i.mo25567b()) {
                this.f13140i.mo25566a();
            }
        } else if (!this.f13151t ? j != 0 : z) {
            j = mo25196b(j);
            for (int i5 = 0; i5 < oVarArr.length; i5++) {
                if (oVarArr[i5] != null) {
                    zArr2[i5] = true;
                }
            }
        }
        this.f13151t = true;
        return j;
    }

    /* renamed from: a */
    public boolean mo25195a(long j) {
        boolean z = false;
        if (this.f13130F || (this.f13150s && this.f13153v == 0)) {
            return false;
        }
        C5027d dVar = this.f13142k;
        synchronized (dVar) {
            if (!dVar.f13416a) {
                dVar.f13416a = true;
                dVar.notifyAll();
                z = true;
            }
        }
        if (this.f13140i.mo25567b()) {
            return z;
        }
        mo25475j();
        return true;
    }

    /* renamed from: a */
    public long mo25189a() {
        if (this.f13153v == 0) {
            return Long.MIN_VALUE;
        }
        return mo25200d();
    }

    /* renamed from: a */
    public C4804n mo25173a(int i, int i2) {
        C4717d dVar = this.f13146o.get(i);
        if (dVar != null) {
            return dVar;
        }
        C4717d dVar2 = new C4717d(this.f13138g);
        dVar2.f11889n = this;
        this.f13146o.put(i, dVar2);
        return dVar2;
    }

    /* renamed from: a */
    public void mo25174a(C4767m mVar) {
        this.f13148q = mVar;
        this.f13145n.post(this.f13143l);
    }

    /* renamed from: a */
    public void mo25162a(C4869i iVar) {
        this.f13145n.post(this.f13143l);
    }
}
