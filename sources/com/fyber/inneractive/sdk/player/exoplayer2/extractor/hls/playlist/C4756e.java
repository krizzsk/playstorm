package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.C4695b;
import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.C4873l;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4702a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C4733b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C4738d;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C4739e;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C4742h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4749a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4751b;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.C4886a;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4926f;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4946q;
import com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.C4921b;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C5015x;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C5020y;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5048t;
import com.fyber.inneractive.sdk.player.exoplayer2.video.C5061b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e */
public final class C4756e implements C5015x.C5016a<C5020y<C4753c>> {

    /* renamed from: a */
    public final Uri f12102a;

    /* renamed from: b */
    public final C4738d f12103b;

    /* renamed from: c */
    public final C4754d f12104c = new C4754d();

    /* renamed from: d */
    public final int f12105d;

    /* renamed from: e */
    public final IdentityHashMap<C4749a.C4750a, C4757a> f12106e = new IdentityHashMap<>();

    /* renamed from: f */
    public final Handler f12107f = new Handler();

    /* renamed from: g */
    public final C4761e f12108g;

    /* renamed from: h */
    public final List<C4758b> f12109h = new ArrayList();

    /* renamed from: i */
    public final C5015x f12110i = new C5015x("HlsPlaylistTracker:MasterPlaylist");

    /* renamed from: j */
    public final C4926f.C4927a f12111j;

    /* renamed from: k */
    public C4749a f12112k;

    /* renamed from: l */
    public C4749a.C4750a f12113l;

    /* renamed from: m */
    public C4751b f12114m;

    /* renamed from: n */
    public boolean f12115n;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e$b */
    public interface C4758b {
        /* renamed from: a */
        void mo25192a(C4749a.C4750a aVar, long j);

        /* renamed from: c */
        void mo25198c();
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e$c */
    public static final class C4759c extends IOException {
        public C4759c(String str) {
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e$d */
    public static final class C4760d extends IOException {
        public C4760d(String str) {
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e$e */
    public interface C4761e {
    }

    public C4756e(Uri uri, C4738d dVar, C4926f.C4927a aVar, int i, C4761e eVar) {
        this.f12102a = uri;
        this.f12103b = dVar;
        this.f12111j = aVar;
        this.f12105d = i;
        this.f12108g = eVar;
    }

    /* renamed from: a */
    public void mo25217a(C5015x.C5018c cVar, long j, long j2, boolean z) {
        C5020y yVar = (C5020y) cVar;
        this.f12111j.mo25469a(yVar.f13401a, 4, j, j2, yVar.f13406f);
    }

    /* renamed from: b */
    public boolean mo25231b(C4749a.C4750a aVar) {
        int i;
        C4757a aVar2 = this.f12106e.get(aVar);
        if (aVar2.f12119d != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000, C4695b.m14455b(aVar2.f12119d.f12066o));
            C4751b bVar = aVar2.f12119d;
            if (bVar.f12061j || (i = bVar.f12053b) == 2 || i == 1 || aVar2.f12120e + max > elapsedRealtime) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo25216a(C5015x.C5018c cVar, long j, long j2) {
        C5020y yVar;
        C4749a aVar;
        C5020y yVar2 = (C5020y) cVar;
        C4753c cVar2 = (C4753c) yVar2.f13404d;
        boolean z = cVar2 instanceof C4751b;
        if (z) {
            String str = cVar2.f12076a;
            yVar = yVar2;
            C4869i iVar = r5;
            C4869i iVar2 = new C4869i("0", "application/x-mpegURL", (String) null, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (C5061b) null, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, (List<byte[]>) null, (C4702a) null, (C4886a) null);
            List singletonList = Collections.singletonList(new C4749a.C4750a(str, iVar));
            List emptyList = Collections.emptyList();
            aVar = new C4749a((String) null, singletonList, emptyList, emptyList, (C4869i) null, (List<C4869i>) null);
        } else {
            yVar = yVar2;
            aVar = (C4749a) cVar2;
        }
        this.f12112k = aVar;
        this.f12113l = aVar.f12046b.get(0);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(aVar.f12046b);
        arrayList.addAll(aVar.f12047c);
        arrayList.addAll(aVar.f12048d);
        int size = arrayList.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            C4749a.C4750a aVar2 = (C4749a.C4750a) arrayList.get(i);
            this.f12106e.put(aVar2, new C4757a(aVar2, elapsedRealtime));
        }
        C4757a aVar3 = this.f12106e.get(this.f12113l);
        if (z) {
            aVar3.mo25233a((C4751b) cVar2);
        } else {
            aVar3.mo25234b();
        }
        C5020y yVar3 = yVar;
        this.f12111j.mo25471b(yVar3.f13401a, 4, j, j2, yVar3.f13406f);
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e$a */
    public final class C4757a implements C5015x.C5016a<C5020y<C4753c>>, Runnable {

        /* renamed from: a */
        public final C4749a.C4750a f12116a;

        /* renamed from: b */
        public final C5015x f12117b = new C5015x("HlsPlaylistTracker:MediaPlaylist");

        /* renamed from: c */
        public final C5020y<C4753c> f12118c;

        /* renamed from: d */
        public C4751b f12119d;

        /* renamed from: e */
        public long f12120e;

        /* renamed from: f */
        public long f12121f;

        /* renamed from: g */
        public long f12122g;

        /* renamed from: h */
        public long f12123h;

        /* renamed from: i */
        public boolean f12124i;

        /* renamed from: j */
        public IOException f12125j;

        public C4757a(C4749a.C4750a aVar, long j) {
            this.f12116a = aVar;
            this.f12122g = j;
            this.f12118c = new C5020y<>(((C4733b) C4756e.this.f12103b).mo25176a(4), C5048t.m15381a(C4756e.this.f12112k.f12076a, aVar.f12051a), 4, C4756e.this.f12104c);
        }

        /* renamed from: a */
        public void mo25217a(C5015x.C5018c cVar, long j, long j2, boolean z) {
            C5020y yVar = (C5020y) cVar;
            C4756e.this.f12111j.mo25469a(yVar.f13401a, 4, j, j2, yVar.f13406f);
        }

        /* renamed from: b */
        public void mo25234b() {
            this.f12123h = 0;
            if (!this.f12124i && !this.f12117b.mo25567b()) {
                this.f12117b.mo25565a(this.f12118c, this, C4756e.this.f12105d);
            }
        }

        public void run() {
            this.f12124i = false;
            mo25234b();
        }

        /* renamed from: a */
        public void mo25216a(C5015x.C5018c cVar, long j, long j2) {
            C5020y yVar = (C5020y) cVar;
            C4753c cVar2 = (C4753c) yVar.f13404d;
            if (cVar2 instanceof C4751b) {
                mo25233a((C4751b) cVar2);
                C4756e.this.f12111j.mo25471b(yVar.f13401a, 4, j, j2, yVar.f13406f);
                return;
            }
            this.f12125j = new C4873l("Loaded playlist has unexpected type.");
        }

        /* renamed from: a */
        public int mo25213a(C5015x.C5018c cVar, long j, long j2, IOException iOException) {
            C5020y yVar = (C5020y) cVar;
            boolean z = iOException instanceof C4873l;
            C4756e.this.f12111j.mo25470a(yVar.f13401a, 4, j, j2, yVar.f13406f, iOException, z);
            if (z) {
                return 3;
            }
            boolean z2 = true;
            if (C4921b.m15081a(iOException)) {
                mo25232a();
                C4756e eVar = C4756e.this;
                if (eVar.f12113l != this.f12116a || C4756e.m14622a(eVar)) {
                    z2 = false;
                }
            }
            if (z2) {
                return 0;
            }
            return 2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0017, code lost:
            r7 = r1.f12058g;
            r8 = r2.f12058g;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
            r7 = r1.f12064m.size();
            r8 = r2.f12064m.size();
         */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x017b  */
        /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo25233a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4751b r28) {
            /*
                r27 = this;
                r0 = r27
                r1 = r28
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b r2 = r0.f12119d
                long r3 = android.os.SystemClock.elapsedRealtime()
                r0.f12120e = r3
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e r5 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4756e.this
                r5.getClass()
                r28.getClass()
                r6 = 0
                if (r2 == 0) goto L_0x003c
                int r7 = r1.f12058g
                int r8 = r2.f12058g
                if (r7 <= r8) goto L_0x001e
                goto L_0x003c
            L_0x001e:
                if (r7 >= r8) goto L_0x0021
                goto L_0x003a
            L_0x0021:
                java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a> r7 = r1.f12064m
                int r7 = r7.size()
                java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a> r8 = r2.f12064m
                int r8 = r8.size()
                if (r7 > r8) goto L_0x003c
                if (r7 != r8) goto L_0x003a
                boolean r7 = r1.f12061j
                if (r7 == 0) goto L_0x003a
                boolean r7 = r2.f12061j
                if (r7 != 0) goto L_0x003a
                goto L_0x003c
            L_0x003a:
                r7 = r6
                goto L_0x003d
            L_0x003c:
                r7 = 1
            L_0x003d:
                if (r7 != 0) goto L_0x0083
                boolean r5 = r1.f12061j
                if (r5 == 0) goto L_0x007e
                boolean r5 = r2.f12061j
                if (r5 == 0) goto L_0x0048
                goto L_0x007e
            L_0x0048:
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b r5 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b
                r6 = r5
                int r7 = r2.f12053b
                java.lang.String r8 = r2.f12076a
                long r9 = r2.f12054c
                long r11 = r2.f12055d
                boolean r13 = r2.f12056e
                int r14 = r2.f12057f
                int r15 = r2.f12058g
                r24 = r5
                int r5 = r2.f12059h
                r16 = r5
                r25 = r3
                long r3 = r2.f12060i
                r17 = r3
                boolean r3 = r2.f12062k
                r20 = r3
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a r3 = r2.f12063l
                r21 = r3
                java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a> r3 = r2.f12064m
                r22 = r3
                java.util.List<java.lang.String> r3 = r2.f12065n
                r23 = r3
                r19 = 1
                r6.<init>(r7, r8, r9, r11, r13, r14, r15, r16, r17, r19, r20, r21, r22, r23)
                r5 = r24
                goto L_0x010e
            L_0x007e:
                r25 = r3
                r5 = r2
                goto L_0x010e
            L_0x0083:
                r25 = r3
                boolean r3 = r1.f12062k
                if (r3 == 0) goto L_0x008d
                long r3 = r1.f12055d
            L_0x008b:
                r12 = r3
                goto L_0x00b7
            L_0x008d:
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b r3 = r5.f12114m
                if (r3 == 0) goto L_0x0094
                long r3 = r3.f12055d
                goto L_0x0096
            L_0x0094:
                r3 = 0
            L_0x0096:
                if (r2 != 0) goto L_0x0099
                goto L_0x008b
            L_0x0099:
                java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a> r7 = r2.f12064m
                int r7 = r7.size()
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a r8 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4756e.m14621a(r2, r1)
                if (r8 == 0) goto L_0x00ab
                long r3 = r2.f12055d
                long r7 = r8.f12070d
            L_0x00a9:
                long r3 = r3 + r7
                goto L_0x008b
            L_0x00ab:
                int r8 = r1.f12058g
                int r9 = r2.f12058g
                int r8 = r8 - r9
                if (r7 != r8) goto L_0x008b
                long r3 = r2.f12055d
                long r7 = r2.f12066o
                goto L_0x00a9
            L_0x00b7:
                boolean r3 = r1.f12056e
                if (r3 == 0) goto L_0x00bf
                int r3 = r1.f12057f
            L_0x00bd:
                r15 = r3
                goto L_0x00e1
            L_0x00bf:
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b r3 = r5.f12114m
                if (r3 == 0) goto L_0x00c6
                int r3 = r3.f12057f
                goto L_0x00c7
            L_0x00c6:
                r3 = r6
            L_0x00c7:
                if (r2 != 0) goto L_0x00ca
                goto L_0x00bd
            L_0x00ca:
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a r4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4756e.m14621a(r2, r1)
                if (r4 == 0) goto L_0x00bd
                int r3 = r2.f12057f
                int r4 = r4.f12069c
                int r3 = r3 + r4
                java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a> r4 = r1.f12064m
                java.lang.Object r4 = r4.get(r6)
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a r4 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4751b.C4752a) r4
                int r4 = r4.f12069c
                int r3 = r3 - r4
                goto L_0x00bd
            L_0x00e1:
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b r5 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b
                r7 = r5
                int r8 = r1.f12053b
                java.lang.String r9 = r1.f12076a
                long r10 = r1.f12054c
                int r3 = r1.f12058g
                r16 = r3
                int r3 = r1.f12059h
                r17 = r3
                long r3 = r1.f12060i
                r18 = r3
                boolean r3 = r1.f12061j
                r20 = r3
                boolean r3 = r1.f12062k
                r21 = r3
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a r3 = r1.f12063l
                r22 = r3
                java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a> r3 = r1.f12064m
                r23 = r3
                java.util.List<java.lang.String> r3 = r1.f12065n
                r24 = r3
                r14 = 1
                r7.<init>(r8, r9, r10, r12, r14, r15, r16, r17, r18, r20, r21, r22, r23, r24)
            L_0x010e:
                r0.f12119d = r5
                r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                if (r5 == r2) goto L_0x012d
                r1 = 0
                r0.f12125j = r1
                r6 = r25
                r0.f12121f = r6
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4756e.this
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a r2 = r0.f12116a
                boolean r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4756e.m14623a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4756e) r1, (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4749a.C4750a) r2, (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4751b) r5)
                if (r1 == 0) goto L_0x0176
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b r1 = r0.f12119d
                long r1 = r1.f12060i
                goto L_0x0177
            L_0x012d:
                r6 = r25
                boolean r2 = r5.f12061j
                if (r2 != 0) goto L_0x0176
                long r8 = r0.f12121f
                long r6 = r6 - r8
                double r6 = (double) r6
                long r8 = r5.f12060i
                long r8 = com.fyber.inneractive.sdk.player.exoplayer2.C4695b.m14455b(r8)
                double r8 = (double) r8
                r10 = 4615063718147915776(0x400c000000000000, double:3.5)
                double r8 = r8 * r10
                int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r2 <= 0) goto L_0x0154
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e$d r1 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e$d
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a r2 = r0.f12116a
                java.lang.String r2 = r2.f12051a
                r1.<init>(r2)
                r0.f12125j = r1
                r27.mo25232a()
                goto L_0x016e
            L_0x0154:
                int r2 = r1.f12058g
                java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a> r1 = r1.f12064m
                int r1 = r1.size()
                int r2 = r2 + r1
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b r1 = r0.f12119d
                int r1 = r1.f12058g
                if (r2 >= r1) goto L_0x016e
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e$c r1 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e$c
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a r2 = r0.f12116a
                java.lang.String r2 = r2.f12051a
                r1.<init>(r2)
                r0.f12125j = r1
            L_0x016e:
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b r1 = r0.f12119d
                long r1 = r1.f12060i
                r5 = 2
                long r1 = r1 / r5
                goto L_0x0177
            L_0x0176:
                r1 = r3
            L_0x0177:
                int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r3 == 0) goto L_0x0189
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4756e.this
                android.os.Handler r3 = r3.f12107f
                long r1 = com.fyber.inneractive.sdk.player.exoplayer2.C4695b.m14455b(r1)
                boolean r1 = r3.postDelayed(r0, r1)
                r0.f12124i = r1
            L_0x0189:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4756e.C4757a.mo25233a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b):void");
        }

        /* renamed from: a */
        public final void mo25232a() {
            this.f12123h = SystemClock.elapsedRealtime() + 60000;
            C4756e eVar = C4756e.this;
            C4749a.C4750a aVar = this.f12116a;
            int size = eVar.f12109h.size();
            for (int i = 0; i < size; i++) {
                eVar.f12109h.get(i).mo25192a(aVar, 60000);
            }
        }
    }

    /* renamed from: a */
    public int mo25213a(C5015x.C5018c cVar, long j, long j2, IOException iOException) {
        C5020y yVar = (C5020y) cVar;
        IOException iOException2 = iOException;
        boolean z = iOException2 instanceof C4873l;
        this.f12111j.mo25470a(yVar.f13401a, 4, j, j2, yVar.f13406f, iOException2, z);
        return z ? 3 : 0;
    }

    /* renamed from: a */
    public C4751b mo25230a(C4749a.C4750a aVar) {
        C4751b bVar;
        C4757a aVar2 = this.f12106e.get(aVar);
        aVar2.getClass();
        aVar2.f12122g = SystemClock.elapsedRealtime();
        C4751b bVar2 = aVar2.f12119d;
        if (bVar2 != null && this.f12112k.f12046b.contains(aVar) && (((bVar = this.f12114m) == null || !bVar.f12061j) && this.f12106e.get(this.f12113l).f12122g - SystemClock.elapsedRealtime() > 15000)) {
            this.f12113l = aVar;
            this.f12106e.get(aVar).mo25234b();
        }
        return bVar2;
    }

    /* renamed from: a */
    public static boolean m14622a(C4756e eVar) {
        List<C4749a.C4750a> list = eVar.f12112k.f12046b;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            C4757a aVar = eVar.f12106e.get(list.get(i));
            if (elapsedRealtime > aVar.f12123h) {
                eVar.f12113l = aVar.f12116a;
                aVar.mo25234b();
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m14623a(C4756e eVar, C4749a.C4750a aVar, C4751b bVar) {
        C4946q qVar;
        long j;
        C4756e eVar2 = eVar;
        C4749a.C4750a aVar2 = aVar;
        C4751b bVar2 = bVar;
        if (aVar2 == eVar2.f12113l) {
            if (eVar2.f12114m == null) {
                eVar2.f12115n = !bVar2.f12061j;
            }
            eVar2.f12114m = bVar2;
            C4742h hVar = (C4742h) eVar2.f12108g;
            hVar.getClass();
            long j2 = bVar2.f12054c;
            if (hVar.f12007d.f12115n) {
                long j3 = bVar2.f12061j ? bVar2.f12055d + bVar2.f12066o : -9223372036854775807L;
                List<C4751b.C4752a> list = bVar2.f12064m;
                if (j2 == -9223372036854775807L) {
                    if (list.isEmpty()) {
                        j = 0;
                        qVar = new C4946q(j3, bVar2.f12066o, bVar2.f12055d, j, true, !bVar2.f12061j);
                    } else {
                        j2 = list.get(Math.max(0, list.size() - 3)).f12070d;
                    }
                }
                j = j2;
                qVar = new C4946q(j3, bVar2.f12066o, bVar2.f12055d, j, true, !bVar2.f12061j);
            } else {
                long j4 = j2 == -9223372036854775807L ? 0 : j2;
                long j5 = bVar2.f12055d;
                long j6 = bVar2.f12066o;
                qVar = new C4946q(j5 + j6, j6, j5, j4, true, false);
            }
            hVar.f12008e.mo25342a(qVar, new C4739e(hVar.f12007d.f12112k, bVar2));
        }
        int size = eVar2.f12109h.size();
        for (int i = 0; i < size; i++) {
            eVar2.f12109h.get(i).mo25198c();
        }
        if (aVar2 != eVar2.f12113l || bVar2.f12061j) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C4751b.C4752a m14621a(C4751b bVar, C4751b bVar2) {
        int i = bVar2.f12058g - bVar.f12058g;
        List<C4751b.C4752a> list = bVar.f12064m;
        if (i < list.size()) {
            return list.get(i);
        }
        return null;
    }
}
