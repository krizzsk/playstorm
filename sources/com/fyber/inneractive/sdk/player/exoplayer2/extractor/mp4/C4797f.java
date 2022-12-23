package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4723f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4730g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4731h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4767m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4804n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5032i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import java.io.IOException;
import java.util.Stack;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.f */
public final class C4797f implements C4723f, C4767m {

    /* renamed from: p */
    public static final int f12477p = C5049u.m15386a("qt  ");

    /* renamed from: a */
    public final C5036k f12478a = new C5036k(C5032i.f13423a);

    /* renamed from: b */
    public final C5036k f12479b = new C5036k(4);

    /* renamed from: c */
    public final C5036k f12480c = new C5036k(16);

    /* renamed from: d */
    public final Stack<C4784a.C4785a> f12481d = new Stack<>();

    /* renamed from: e */
    public int f12482e;

    /* renamed from: f */
    public int f12483f;

    /* renamed from: g */
    public long f12484g;

    /* renamed from: h */
    public int f12485h;

    /* renamed from: i */
    public C5036k f12486i;

    /* renamed from: j */
    public int f12487j;

    /* renamed from: k */
    public int f12488k;

    /* renamed from: l */
    public C4731h f12489l;

    /* renamed from: m */
    public C4798a[] f12490m;

    /* renamed from: n */
    public long f12491n;

    /* renamed from: o */
    public boolean f12492o;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.f$a */
    public static final class C4798a {

        /* renamed from: a */
        public final C4800h f12493a;

        /* renamed from: b */
        public final C4803k f12494b;

        /* renamed from: c */
        public final C4804n f12495c;

        /* renamed from: d */
        public int f12496d;

        public C4798a(C4800h hVar, C4803k kVar, C4804n nVar) {
            this.f12493a = hVar;
            this.f12494b = kVar;
            this.f12495c = nVar;
        }
    }

    /* renamed from: a */
    public boolean mo25130a() {
        return true;
    }

    /* renamed from: a */
    public boolean mo25166a(C4730g gVar) throws IOException, InterruptedException {
        return C4799g.m14745a(gVar, false);
    }

    /* renamed from: b */
    public void mo25167b() {
    }

    /* renamed from: c */
    public long mo25131c() {
        return this.f12491n;
    }

    /* renamed from: d */
    public final void mo25272d() {
        this.f12482e = 0;
        this.f12485h = 0;
    }

    /* renamed from: a */
    public void mo25165a(C4731h hVar) {
        this.f12489l = hVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:134:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0552  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0613  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bd A[Catch:{ all -> 0x022a }] */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x083e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c4 A[Catch:{ all -> 0x022a }] */
    /* JADX WARNING: Removed duplicated region for block: B:437:0x0226 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25271c(long r88) throws com.fyber.inneractive.sdk.player.exoplayer2.C4873l {
        /*
            r87 = this;
            r1 = r87
        L_0x0002:
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r0 = r1.f12481d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0a48
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r0 = r1.f12481d
            java.lang.Object r0 = r0.peek()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r0 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.C4785a) r0
            long r3 = r0.f12379P0
            int r0 = (r3 > r88 ? 1 : (r3 == r88 ? 0 : -1))
            if (r0 != 0) goto L_0x0a48
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r0 = r1.f12481d
            java.lang.Object r0 = r0.pop()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r0 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.C4785a) r0
            int r3 = r0.f12378a
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12290C
            if (r3 != r4) goto L_0x0a2d
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.j r8 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
            r8.<init>()
            int r9 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12287A0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r9 = r0.mo25262d(r9)
            r10 = 12
            r11 = 0
            r12 = 1
            r13 = 0
            if (r9 == 0) goto L_0x0255
            boolean r14 = r1.f12492o
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4787b.f12383a
            if (r14 == 0) goto L_0x0045
            goto L_0x024e
        L_0x0045:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r9 = r9.f12382P0
            r14 = 8
            r9.mo25600e(r14)
        L_0x004c:
            int r15 = r9.mo25588a()
            if (r15 < r14) goto L_0x024e
            int r15 = r9.f13445b
            int r16 = r9.mo25595c()
            int r3 = r9.mo25595c()
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12289B0
            if (r3 != r4) goto L_0x0245
            r9.mo25600e(r15)
            int r15 = r15 + r16
            r9.mo25602f(r10)
        L_0x0068:
            int r3 = r9.f13445b
            if (r3 >= r15) goto L_0x024e
            int r4 = r9.mo25595c()
            int r6 = r9.mo25595c()
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12291C0
            if (r6 != r7) goto L_0x023c
            r9.mo25600e(r3)
            int r3 = r3 + r4
            r9.mo25602f(r14)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x0084:
            int r6 = r9.f13445b
            if (r6 >= r3) goto L_0x022f
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.f12451a
            int r7 = r9.mo25595c()
            int r6 = r6 + r7
            int r7 = r9.mo25595c()
            int r14 = r7 >> 24
            r14 = r14 & 255(0xff, float:3.57E-43)
            r15 = 169(0xa9, float:2.37E-43)
            java.lang.String r2 = "TCON"
            java.lang.String r10 = "MetadataUtil"
            if (r14 == r15) goto L_0x0182
            r15 = 65533(0xfffd, float:9.1831E-41)
            if (r14 != r15) goto L_0x00a6
            goto L_0x0182
        L_0x00a6:
            int r14 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.f12463m     // Catch:{ all -> 0x022a }
            if (r7 != r14) goto L_0x00cc
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.m14733b(r9)     // Catch:{ all -> 0x022a }
            if (r7 <= 0) goto L_0x00ba
            java.lang.String[] r14 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.f12450D     // Catch:{ all -> 0x022a }
            int r15 = r14.length     // Catch:{ all -> 0x022a }
            if (r7 > r15) goto L_0x00ba
            int r7 = r7 + -1
            r7 = r14[r7]     // Catch:{ all -> 0x022a }
            goto L_0x00bb
        L_0x00ba:
            r7 = r11
        L_0x00bb:
            if (r7 == 0) goto L_0x00c4
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r10 = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j     // Catch:{ all -> 0x022a }
            r10.<init>(r2, r11, r7)     // Catch:{ all -> 0x022a }
            goto L_0x021d
        L_0x00c4:
            java.lang.String r2 = "Failed to parse standard genre code"
            android.util.Log.w(r10, r2)     // Catch:{ all -> 0x022a }
            r2 = r11
            goto L_0x021e
        L_0x00cc:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.f12465o     // Catch:{ all -> 0x022a }
            if (r7 != r2) goto L_0x00d8
            java.lang.String r2 = "TPOS"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.m14732a(r7, r2, r9)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x00d8:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.f12466p     // Catch:{ all -> 0x022a }
            if (r7 != r2) goto L_0x00e4
            java.lang.String r2 = "TRCK"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.m14732a(r7, r2, r9)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x00e4:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.f12467q     // Catch:{ all -> 0x022a }
            if (r7 != r2) goto L_0x00f0
            java.lang.String r2 = "TBPM"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.h r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.m14730a(r7, r2, r9, r12, r13)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x00f0:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.f12468r     // Catch:{ all -> 0x022a }
            if (r7 != r2) goto L_0x00fc
            java.lang.String r2 = "TCMP"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.h r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.m14730a(r7, r2, r9, r12, r12)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x00fc:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.f12462l     // Catch:{ all -> 0x022a }
            if (r7 != r2) goto L_0x0109
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.a r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.m14728a(r9)     // Catch:{ all -> 0x022a }
            r9.mo25600e(r6)
            goto L_0x0221
        L_0x0109:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.f12469s     // Catch:{ all -> 0x022a }
            if (r7 != r2) goto L_0x0115
            java.lang.String r2 = "TPE2"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.m14734b(r7, r2, r9)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x0115:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.f12470t     // Catch:{ all -> 0x022a }
            if (r7 != r2) goto L_0x0121
            java.lang.String r2 = "TSOT"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.m14734b(r7, r2, r9)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x0121:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.f12471u     // Catch:{ all -> 0x022a }
            if (r7 != r2) goto L_0x012c
            java.lang.String r2 = "TSO2"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.m14734b(r7, r2, r9)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x012c:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.f12472v     // Catch:{ all -> 0x022a }
            if (r7 != r2) goto L_0x0137
            java.lang.String r2 = "TSOA"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.m14734b(r7, r2, r9)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x0137:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.f12473w     // Catch:{ all -> 0x022a }
            if (r7 != r2) goto L_0x0142
            java.lang.String r2 = "TSOP"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.m14734b(r7, r2, r9)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x0142:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.f12474x     // Catch:{ all -> 0x022a }
            if (r7 != r2) goto L_0x014d
            java.lang.String r2 = "TSOC"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.m14734b(r7, r2, r9)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x014d:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.f12475y     // Catch:{ all -> 0x022a }
            if (r7 != r2) goto L_0x0158
            java.lang.String r2 = "ITUNESADVISORY"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.h r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.m14730a(r7, r2, r9, r13, r13)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x0158:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.f12476z     // Catch:{ all -> 0x022a }
            if (r7 != r2) goto L_0x0163
            java.lang.String r2 = "ITUNESGAPLESS"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.h r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.m14730a(r7, r2, r9, r13, r12)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x0163:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.f12447A     // Catch:{ all -> 0x022a }
            if (r7 != r2) goto L_0x016e
            java.lang.String r2 = "TVSHOWSORT"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.m14734b(r7, r2, r9)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x016e:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.f12448B     // Catch:{ all -> 0x022a }
            if (r7 != r2) goto L_0x0179
            java.lang.String r2 = "TVSHOW"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.m14734b(r7, r2, r9)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x0179:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.f12449C     // Catch:{ all -> 0x022a }
            if (r7 != r2) goto L_0x01f0
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.h r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.m14731a((com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k) r9, (int) r6)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x0182:
            r14 = 16777215(0xffffff, float:2.3509886E-38)
            r14 = r14 & r7
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.f12453c     // Catch:{ all -> 0x022a }
            if (r14 != r15) goto L_0x0191
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.e r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.m14729a((int) r7, (com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k) r9)     // Catch:{ all -> 0x022a }
        L_0x018e:
            r10 = r2
            goto L_0x021d
        L_0x0191:
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.f12451a     // Catch:{ all -> 0x022a }
            if (r14 == r15) goto L_0x0215
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.f12452b     // Catch:{ all -> 0x022a }
            if (r14 != r15) goto L_0x019b
            goto L_0x0215
        L_0x019b:
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.f12458h     // Catch:{ all -> 0x022a }
            if (r14 == r15) goto L_0x020d
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.f12459i     // Catch:{ all -> 0x022a }
            if (r14 != r15) goto L_0x01a5
            goto L_0x020d
        L_0x01a5:
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.f12454d     // Catch:{ all -> 0x022a }
            if (r14 != r15) goto L_0x01b0
            java.lang.String r2 = "TDRC"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.m14734b(r7, r2, r9)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x01b0:
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.f12455e     // Catch:{ all -> 0x022a }
            if (r14 != r15) goto L_0x01bb
            java.lang.String r2 = "TPE1"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.m14734b(r7, r2, r9)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x01bb:
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.f12456f     // Catch:{ all -> 0x022a }
            if (r14 != r15) goto L_0x01c6
            java.lang.String r2 = "TSSE"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.m14734b(r7, r2, r9)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x01c6:
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.f12457g     // Catch:{ all -> 0x022a }
            if (r14 != r15) goto L_0x01d1
            java.lang.String r2 = "TALB"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.m14734b(r7, r2, r9)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x01d1:
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.f12460j     // Catch:{ all -> 0x022a }
            if (r14 != r15) goto L_0x01dc
            java.lang.String r2 = "USLT"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.m14734b(r7, r2, r9)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x01dc:
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.f12461k     // Catch:{ all -> 0x022a }
            if (r14 != r15) goto L_0x01e5
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.m14734b(r7, r2, r9)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x01e5:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.f12464n     // Catch:{ all -> 0x022a }
            if (r14 != r2) goto L_0x01f0
            java.lang.String r2 = "TIT1"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.m14734b(r7, r2, r9)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x01f0:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x022a }
            r2.<init>()     // Catch:{ all -> 0x022a }
            java.lang.String r14 = "Skipped unknown metadata entry: "
            r2.append(r14)     // Catch:{ all -> 0x022a }
            java.lang.String r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.m14699a(r7)     // Catch:{ all -> 0x022a }
            r2.append(r7)     // Catch:{ all -> 0x022a }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x022a }
            android.util.Log.d(r10, r2)     // Catch:{ all -> 0x022a }
            r9.mo25600e(r6)
            r2 = r11
            goto L_0x0221
        L_0x020d:
            java.lang.String r2 = "TCOM"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.m14734b(r7, r2, r9)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x0215:
            java.lang.String r2 = "TIT2"
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4796e.m14734b(r7, r2, r9)     // Catch:{ all -> 0x022a }
            goto L_0x018e
        L_0x021d:
            r2 = r10
        L_0x021e:
            r9.mo25600e(r6)
        L_0x0221:
            if (r2 == 0) goto L_0x0226
            r4.add(r2)
        L_0x0226:
            r10 = 12
            goto L_0x0084
        L_0x022a:
            r0 = move-exception
            r9.mo25600e(r6)
            throw r0
        L_0x022f:
            boolean r2 = r4.isEmpty()
            if (r2 == 0) goto L_0x0236
            goto L_0x024e
        L_0x0236:
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.a r2 = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.a
            r2.<init>((java.util.List<? extends com.fyber.inneractive.sdk.player.exoplayer2.metadata.C4886a.C4888b>) r4)
            goto L_0x024f
        L_0x023c:
            int r4 = r4 + -8
            r9.mo25602f(r4)
            r10 = 12
            goto L_0x0068
        L_0x0245:
            int r2 = r16 + -8
            r9.mo25602f(r2)
            r10 = 12
            goto L_0x004c
        L_0x024e:
            r2 = r11
        L_0x024f:
            if (r2 == 0) goto L_0x0256
            r8.mo25237a(r2)
            goto L_0x0256
        L_0x0255:
            r2 = r11
        L_0x0256:
            r9 = r13
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0261:
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r10 = r0.f12381R0
            int r10 = r10.size()
            if (r9 >= r10) goto L_0x0a09
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r10 = r0.f12381R0
            java.lang.Object r10 = r10.get(r9)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r10 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.C4785a) r10
            int r14 = r10.f12378a
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12294E
            if (r14 == r15) goto L_0x0287
        L_0x0277:
            r18 = r0
            r54 = r2
            r52 = r3
            r20 = r5
            r50 = r6
            r38 = r8
            r55 = r9
            goto L_0x085a
        L_0x0287:
            int r14 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12292D
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r15 = r0.mo25262d(r14)
            boolean r14 = r1.f12492o
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r18 = 0
            r19 = r14
            r14 = r10
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h r14 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4787b.m14706a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.C4785a) r14, (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.C4786b) r15, (long) r16, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C4702a) r18, (boolean) r19)
            if (r14 != 0) goto L_0x02a0
            goto L_0x0277
        L_0x02a0:
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12296F
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r10 = r10.mo25261c(r15)
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12298G
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r10 = r10.mo25261c(r15)
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12300H
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r10 = r10.mo25261c(r15)
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12359q0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r15 = r10.mo25262d(r15)
            if (r15 == 0) goto L_0x02c0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b$c r11 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b$c
            r11.<init>(r15)
            goto L_0x02ce
        L_0x02c0:
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12361r0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r11 = r10.mo25262d(r11)
            if (r11 == 0) goto L_0x0a01
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b$d r15 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b$d
            r15.<init>(r11)
            r11 = r15
        L_0x02ce:
            int r15 = r11.mo25263a()
            if (r15 != 0) goto L_0x02fe
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k r10 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k
            long[] r11 = new long[r13]
            int[] r15 = new int[r13]
            long[] r12 = new long[r13]
            r18 = r0
            int[] r0 = new int[r13]
            r25 = 0
            r22 = r10
            r23 = r11
            r24 = r15
            r26 = r12
            r27 = r0
            r22.<init>(r23, r24, r25, r26, r27)
            r54 = r2
            r52 = r3
            r20 = r5
            r50 = r6
            r38 = r8
            r55 = r9
            r5 = r14
            goto L_0x0856
        L_0x02fe:
            r18 = r0
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12363s0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r0 = r10.mo25262d(r0)
            if (r0 != 0) goto L_0x0310
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12365t0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r0 = r10.mo25262d(r0)
            r12 = 1
            goto L_0x0311
        L_0x0310:
            r12 = r13
        L_0x0311:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = r0.f12382P0
            int r13 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12357p0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r13 = r10.mo25262d(r13)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r13 = r13.f12382P0
            r50 = r6
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12351m0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r6 = r10.mo25262d(r6)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r6 = r6.f12382P0
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12353n0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r7 = r10.mo25262d(r7)
            if (r7 == 0) goto L_0x0332
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r7 = r7.f12382P0
            r20 = r5
            goto L_0x0335
        L_0x0332:
            r20 = r5
            r7 = 0
        L_0x0335:
            int r5 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12355o0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r5 = r10.mo25262d(r5)
            if (r5 == 0) goto L_0x0340
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r5 = r5.f12382P0
            goto L_0x0341
        L_0x0340:
            r5 = 0
        L_0x0341:
            r10 = 12
            r0.mo25600e(r10)
            r52 = r3
            int r3 = r0.mo25611o()
            r13.mo25600e(r10)
            int r4 = r13.mo25611o()
            int r10 = r13.mo25595c()
            r22 = r4
            r4 = 1
            if (r10 != r4) goto L_0x035e
            r10 = r4
            goto L_0x035f
        L_0x035e:
            r10 = 0
        L_0x035f:
            java.lang.String r4 = "first_chunk must be 1"
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a.m15305b(r10, r4)
            r4 = 12
            r6.mo25600e(r4)
            int r10 = r6.mo25611o()
            r17 = 1
            int r10 = r10 + -1
            int r21 = r6.mo25611o()
            r54 = r2
            int r2 = r6.mo25611o()
            if (r5 == 0) goto L_0x0385
            r5.mo25600e(r4)
            int r23 = r5.mo25611o()
            goto L_0x0387
        L_0x0385:
            r23 = 0
        L_0x0387:
            r24 = -1
            if (r7 == 0) goto L_0x03a1
            r7.mo25600e(r4)
            int r25 = r7.mo25611o()
            if (r25 <= 0) goto L_0x039d
            int r26 = r7.mo25611o()
            r17 = 1
            int r26 = r26 + -1
            goto L_0x03a5
        L_0x039d:
            r26 = r24
            r7 = 0
            goto L_0x03a5
        L_0x03a1:
            r26 = r24
            r25 = 0
        L_0x03a5:
            boolean r27 = r11.mo25265c()
            if (r27 == 0) goto L_0x03c1
            com.fyber.inneractive.sdk.player.exoplayer2.i r4 = r14.f12503f
            java.lang.String r4 = r4.f12956f
            r55 = r9
            java.lang.String r9 = "audio/raw"
            boolean r4 = r9.equals(r4)
            if (r4 == 0) goto L_0x03c3
            if (r10 != 0) goto L_0x03c3
            if (r23 != 0) goto L_0x03c3
            if (r25 != 0) goto L_0x03c3
            r4 = 1
            goto L_0x03c4
        L_0x03c1:
            r55 = r9
        L_0x03c3:
            r4 = 0
        L_0x03c4:
            r27 = 0
            if (r4 != 0) goto L_0x0552
            long[] r4 = new long[r15]
            int[] r9 = new int[r15]
            r30 = r10
            long[] r10 = new long[r15]
            int[] r1 = new int[r15]
            r35 = r2
            r56 = r14
            r34 = r21
            r33 = r23
            r42 = r24
            r2 = r26
            r36 = r27
            r38 = r36
            r40 = r38
            r32 = r30
            r14 = 0
            r23 = 0
            r30 = 0
            r31 = 0
            r57 = 0
            r26 = r6
            r21 = r8
            r8 = r25
            r6 = 0
            r25 = 0
        L_0x03f8:
            if (r14 >= r15) goto L_0x04d4
            r86 = r31
            r31 = r15
            r15 = r86
        L_0x0400:
            if (r57 != 0) goto L_0x0449
            r43 = r8
            int r8 = r42 + 1
            if (r8 != r3) goto L_0x040f
            r57 = r30
            r30 = r22
            r22 = 0
            goto L_0x043b
        L_0x040f:
            if (r12 == 0) goto L_0x0416
            long r38 = r0.mo25612p()
            goto L_0x041a
        L_0x0416:
            long r38 = r0.mo25609m()
        L_0x041a:
            if (r8 != r15) goto L_0x0433
            int r30 = r13.mo25611o()
            r15 = 4
            r13.mo25602f(r15)
            int r22 = r22 + -1
            if (r22 <= 0) goto L_0x0431
            int r15 = r13.mo25611o()
            r17 = 1
            int r15 = r15 + -1
            goto L_0x0433
        L_0x0431:
            r15 = r24
        L_0x0433:
            r57 = r30
            r40 = r38
            r30 = r22
            r22 = 1
        L_0x043b:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a.m15304b(r22)
            r42 = r8
            r22 = r30
            r38 = r40
            r8 = r43
            r30 = r57
            goto L_0x0400
        L_0x0449:
            r43 = r8
            if (r5 == 0) goto L_0x045e
        L_0x044d:
            if (r23 != 0) goto L_0x045c
            if (r33 <= 0) goto L_0x045c
            int r23 = r5.mo25611o()
            int r25 = r5.mo25595c()
            int r33 = r33 + -1
            goto L_0x044d
        L_0x045c:
            int r23 = r23 + -1
        L_0x045e:
            r8 = r25
            r4[r14] = r38
            int r25 = r11.mo25264b()
            r9[r14] = r25
            r25 = r4
            r4 = r9[r14]
            if (r4 <= r6) goto L_0x0471
            r4 = r9[r14]
            r6 = r4
        L_0x0471:
            r4 = r11
            r44 = r12
            long r11 = (long) r8
            long r11 = r36 + r11
            r10[r14] = r11
            if (r7 != 0) goto L_0x047d
            r11 = 1
            goto L_0x047e
        L_0x047d:
            r11 = 0
        L_0x047e:
            r1[r14] = r11
            if (r14 != r2) goto L_0x0495
            r11 = 1
            r1[r14] = r11
            int r12 = r43 + -1
            if (r12 <= 0) goto L_0x048e
            int r2 = r7.mo25611o()
            int r2 = r2 - r11
        L_0x048e:
            r43 = r2
            r11 = r35
            r35 = r1
            goto L_0x049d
        L_0x0495:
            r11 = r35
            r12 = r43
            r35 = r1
            r43 = r2
        L_0x049d:
            long r1 = (long) r11
            long r36 = r36 + r1
            int r34 = r34 + -1
            if (r34 != 0) goto L_0x04b3
            if (r32 <= 0) goto L_0x04b3
            int r1 = r26.mo25611o()
            int r2 = r26.mo25611o()
            int r32 = r32 + -1
            r34 = r1
            goto L_0x04b4
        L_0x04b3:
            r2 = r11
        L_0x04b4:
            r1 = r9[r14]
            r11 = r2
            long r1 = (long) r1
            long r38 = r38 + r1
            int r57 = r57 + -1
            int r14 = r14 + 1
            r1 = r35
            r2 = r43
            r35 = r11
            r11 = r4
            r4 = r25
            r25 = r8
            r8 = r12
            r12 = r44
            r86 = r31
            r31 = r15
            r15 = r86
            goto L_0x03f8
        L_0x04d4:
            r35 = r1
            r25 = r4
            r43 = r8
            r31 = r15
            if (r23 != 0) goto L_0x04e0
            r0 = 1
            goto L_0x04e1
        L_0x04e0:
            r0 = 0
        L_0x04e1:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a.m15302a((boolean) r0)
        L_0x04e4:
            if (r33 <= 0) goto L_0x04f8
            int r0 = r5.mo25611o()
            if (r0 != 0) goto L_0x04ee
            r0 = 1
            goto L_0x04ef
        L_0x04ee:
            r0 = 0
        L_0x04ef:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a.m15302a((boolean) r0)
            r5.mo25595c()
            int r33 = r33 + -1
            goto L_0x04e4
        L_0x04f8:
            if (r43 != 0) goto L_0x0506
            if (r34 != 0) goto L_0x0506
            r0 = r57
            if (r0 != 0) goto L_0x0508
            if (r32 == 0) goto L_0x0503
            goto L_0x0508
        L_0x0503:
            r5 = r56
            goto L_0x0548
        L_0x0506:
            r0 = r57
        L_0x0508:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Inconsistent stbl box for track "
            r1.append(r2)
            r5 = r56
            int r2 = r5.f12498a
            r1.append(r2)
            java.lang.String r2 = ": remainingSynchronizationSamples "
            r1.append(r2)
            r12 = r43
            r1.append(r12)
            java.lang.String r2 = ", remainingSamplesAtTimestampDelta "
            r1.append(r2)
            r2 = r34
            r1.append(r2)
            java.lang.String r2 = ", remainingSamplesInChunk "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ", remainingTimestampDeltaChanges "
            r1.append(r0)
            r0 = r32
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "AtomParsers"
            android.util.Log.w(r1, r0)
        L_0x0548:
            r11 = r10
            r4 = r25
            r10 = r9
            r9 = r35
            r35 = r6
            goto L_0x0604
        L_0x0552:
            r21 = r8
            r4 = r11
            r44 = r12
            r5 = r14
            r31 = r15
            long[] r1 = new long[r3]
            int[] r6 = new int[r3]
            r9 = r24
            r10 = r27
            r7 = 0
            r8 = 0
        L_0x0564:
            r12 = 1
            int r9 = r9 + r12
            if (r9 != r3) goto L_0x056b
            r12 = 4
            r14 = 0
            goto L_0x0590
        L_0x056b:
            if (r44 == 0) goto L_0x0572
            long r10 = r0.mo25612p()
            goto L_0x0576
        L_0x0572:
            long r10 = r0.mo25609m()
        L_0x0576:
            if (r9 != r7) goto L_0x058e
            int r8 = r13.mo25611o()
            r12 = 4
            r13.mo25602f(r12)
            int r22 = r22 + -1
            if (r22 <= 0) goto L_0x058b
            int r7 = r13.mo25611o()
            r14 = 1
            int r7 = r7 - r14
            goto L_0x058f
        L_0x058b:
            r7 = r24
            goto L_0x058f
        L_0x058e:
            r12 = 4
        L_0x058f:
            r14 = 1
        L_0x0590:
            if (r14 == 0) goto L_0x0597
            r1[r9] = r10
            r6[r9] = r8
            goto L_0x0564
        L_0x0597:
            int r0 = r4.mo25264b()
            long r7 = (long) r2
            r2 = 8192(0x2000, float:1.14794E-41)
            int r2 = r2 / r0
            r4 = 0
            r9 = 0
        L_0x05a1:
            if (r4 >= r3) goto L_0x05ad
            r10 = r6[r4]
            int r10 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15385a((int) r10, (int) r2)
            int r9 = r9 + r10
            int r4 = r4 + 1
            goto L_0x05a1
        L_0x05ad:
            long[] r4 = new long[r9]
            int[] r10 = new int[r9]
            long[] r11 = new long[r9]
            int[] r9 = new int[r9]
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x05b9:
            if (r12 >= r3) goto L_0x0600
            r22 = r6[r12]
            r23 = r1[r12]
            r86 = r22
            r22 = r1
            r1 = r86
        L_0x05c5:
            if (r1 <= 0) goto L_0x05f4
            int r25 = java.lang.Math.min(r2, r1)
            r4[r15] = r23
            int r26 = r0 * r25
            r10[r15] = r26
            r26 = r0
            r0 = r10[r15]
            int r13 = java.lang.Math.max(r13, r0)
            r29 = r2
            r0 = r3
            long r2 = (long) r14
            long r2 = r2 * r7
            r11[r15] = r2
            r2 = 1
            r9[r15] = r2
            r2 = r10[r15]
            long r2 = (long) r2
            long r23 = r23 + r2
            int r14 = r14 + r25
            int r1 = r1 - r25
            int r15 = r15 + 1
            r3 = r0
            r0 = r26
            r2 = r29
            goto L_0x05c5
        L_0x05f4:
            r26 = r0
            r29 = r2
            r0 = r3
            int r12 = r12 + 1
            r1 = r22
            r0 = r26
            goto L_0x05b9
        L_0x0600:
            r35 = r13
            r36 = r27
        L_0x0604:
            long[] r0 = r5.f12506i
            r1 = 1000000(0xf4240, double:4.940656E-318)
            if (r0 == 0) goto L_0x083e
            boolean r0 = r21.mo25236a()
            if (r0 == 0) goto L_0x0613
            goto L_0x083e
        L_0x0613:
            long[] r0 = r5.f12506i
            int r3 = r0.length
            r6 = 1
            if (r3 != r6) goto L_0x06a3
            int r3 = r5.f12499b
            if (r3 != r6) goto L_0x06a3
            int r3 = r11.length
            r6 = 2
            if (r3 < r6) goto L_0x06a3
            long[] r3 = r5.f12507j
            r6 = 0
            r7 = r3[r6]
            r38 = r0[r6]
            long r12 = r5.f12500c
            long r14 = r5.f12501d
            r40 = r12
            r42 = r14
            long r12 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15388a((long) r38, (long) r40, (long) r42)
            long r12 = r12 + r7
            r14 = r11[r6]
            int r0 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x06a3
            r0 = 1
            r14 = r11[r0]
            int r3 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r3 >= 0) goto L_0x06a3
            int r3 = r11.length
            int r3 = r3 - r0
            r14 = r11[r3]
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x06a3
            int r0 = (r12 > r36 ? 1 : (r12 == r36 ? 0 : -1))
            if (r0 > 0) goto L_0x06a3
            long r38 = r36 - r12
            r0 = 0
            r12 = r11[r0]
            long r40 = r7 - r12
            com.fyber.inneractive.sdk.player.exoplayer2.i r0 = r5.f12503f
            int r0 = r0.f12969s
            long r6 = (long) r0
            long r12 = r5.f12500c
            r42 = r6
            r44 = r12
            long r6 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15388a((long) r40, (long) r42, (long) r44)
            com.fyber.inneractive.sdk.player.exoplayer2.i r0 = r5.f12503f
            int r0 = r0.f12969s
            long r12 = (long) r0
            long r14 = r5.f12500c
            r40 = r12
            r42 = r14
            long r12 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15388a((long) r38, (long) r40, (long) r42)
            int r0 = (r6 > r27 ? 1 : (r6 == r27 ? 0 : -1))
            if (r0 != 0) goto L_0x067b
            int r0 = (r12 > r27 ? 1 : (r12 == r27 ? 0 : -1))
            if (r0 == 0) goto L_0x06a3
        L_0x067b:
            r14 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x06a3
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x06a3
            int r0 = (int) r6
            r3 = r21
            r3.f12129a = r0
            int r0 = (int) r12
            r3.f12130b = r0
            long r6 = r5.f12500c
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15392a((long[]) r11, (long) r1, (long) r6)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k r0 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k
            r32 = r0
            r33 = r4
            r34 = r10
            r36 = r11
            r37 = r9
            r32.<init>(r33, r34, r35, r36, r37)
            goto L_0x06e1
        L_0x06a3:
            r3 = r21
            long[] r0 = r5.f12506i
            int r1 = r0.length
            r2 = 1
            if (r1 != r2) goto L_0x06e6
            r19 = 0
            r1 = r0[r19]
            int r0 = (r1 > r27 ? 1 : (r1 == r27 ? 0 : -1))
            if (r0 != 0) goto L_0x06e6
            r0 = r19
        L_0x06b5:
            int r1 = r11.length
            if (r0 >= r1) goto L_0x06d2
            r1 = r11[r0]
            long[] r6 = r5.f12507j
            r7 = r6[r19]
            long r21 = r1 - r7
            long r1 = r5.f12500c
            r23 = 1000000(0xf4240, double:4.940656E-318)
            r25 = r1
            long r1 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15388a((long) r21, (long) r23, (long) r25)
            r11[r0] = r1
            int r0 = r0 + 1
            r19 = 0
            goto L_0x06b5
        L_0x06d2:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k r0 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k
            r32 = r0
            r33 = r4
            r34 = r10
            r36 = r11
            r37 = r9
            r32.<init>(r33, r34, r35, r36, r37)
        L_0x06e1:
            r10 = r0
            r38 = r3
            goto L_0x0856
        L_0x06e6:
            int r0 = r5.f12499b
            r1 = 1
            if (r0 != r1) goto L_0x06ed
            r0 = 1
            goto L_0x06ee
        L_0x06ed:
            r0 = 0
        L_0x06ee:
            r1 = 0
            r2 = 0
            r6 = 0
            r7 = 0
        L_0x06f2:
            long[] r8 = r5.f12506i
            int r12 = r8.length
            r13 = -1
            if (r1 >= r12) goto L_0x0731
            long[] r12 = r5.f12507j
            r15 = r9
            r21 = r10
            r9 = r12[r1]
            int r12 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r12 == 0) goto L_0x072a
            r36 = r8[r1]
            long r12 = r5.f12500c
            r8 = r15
            long r14 = r5.f12501d
            r38 = r12
            r40 = r14
            long r12 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15388a((long) r36, (long) r38, (long) r40)
            r14 = 1
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15387a(r11, r9, r14, r14)
            long r9 = r9 + r12
            r12 = 0
            int r9 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15387a(r11, r9, r0, r12)
            int r10 = r9 - r15
            int r2 = r2 + r10
            if (r6 == r15) goto L_0x0725
            r6 = 1
            goto L_0x0726
        L_0x0725:
            r6 = 0
        L_0x0726:
            r6 = r6 | r7
            r7 = r6
            r6 = r9
            goto L_0x072b
        L_0x072a:
            r8 = r15
        L_0x072b:
            int r1 = r1 + 1
            r9 = r8
            r10 = r21
            goto L_0x06f2
        L_0x0731:
            r8 = r9
            r21 = r10
            r1 = r31
            if (r2 == r1) goto L_0x073a
            r1 = 1
            goto L_0x073b
        L_0x073a:
            r1 = 0
        L_0x073b:
            r1 = r1 | r7
            if (r1 == 0) goto L_0x0741
            long[] r6 = new long[r2]
            goto L_0x0742
        L_0x0741:
            r6 = r4
        L_0x0742:
            if (r1 == 0) goto L_0x0747
            int[] r7 = new int[r2]
            goto L_0x0749
        L_0x0747:
            r7 = r21
        L_0x0749:
            if (r1 == 0) goto L_0x074d
            r35 = 0
        L_0x074d:
            if (r1 == 0) goto L_0x0752
            int[] r9 = new int[r2]
            goto L_0x0753
        L_0x0752:
            r9 = r8
        L_0x0753:
            long[] r2 = new long[r2]
            r28 = r27
            r32 = r35
            r10 = 0
            r12 = 0
        L_0x075b:
            long[] r15 = r5.f12506i
            int r13 = r15.length
            if (r10 >= r13) goto L_0x080d
            long[] r13 = r5.f12507j
            r33 = r2
            r14 = r3
            r2 = r13[r10]
            r34 = r15[r10]
            r30 = -1
            int r13 = (r2 > r30 ? 1 : (r2 == r30 ? 0 : -1))
            if (r13 == 0) goto L_0x07f3
            r15 = r14
            long r13 = r5.f12500c
            r36 = r8
            r37 = r9
            long r8 = r5.f12501d
            r22 = r34
            r24 = r13
            r26 = r8
            long r8 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15388a((long) r22, (long) r24, (long) r26)
            long r8 = r8 + r2
            r13 = 1
            int r14 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15387a(r11, r2, r13, r13)
            r13 = 0
            int r8 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15387a(r11, r8, r0, r13)
            if (r1 == 0) goto L_0x07a5
            int r9 = r8 - r14
            java.lang.System.arraycopy(r4, r14, r6, r12, r9)
            r13 = r21
            java.lang.System.arraycopy(r13, r14, r7, r12, r9)
            r21 = r0
            r38 = r15
            r0 = r36
            r15 = r37
            java.lang.System.arraycopy(r0, r14, r15, r12, r9)
            goto L_0x07af
        L_0x07a5:
            r38 = r15
            r13 = r21
            r15 = r37
            r21 = r0
            r0 = r36
        L_0x07af:
            r9 = r32
        L_0x07b1:
            if (r14 >= r8) goto L_0x07ef
            r36 = r8
            r32 = r9
            long r8 = r5.f12501d
            r24 = 1000000(0xf4240, double:4.940656E-318)
            r22 = r28
            r26 = r8
            long r8 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15388a((long) r22, (long) r24, (long) r26)
            r22 = r11[r14]
            long r39 = r22 - r2
            r22 = r2
            long r2 = r5.f12500c
            r41 = 1000000(0xf4240, double:4.940656E-318)
            r43 = r2
            long r2 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15388a((long) r39, (long) r41, (long) r43)
            long r8 = r8 + r2
            r33[r12] = r8
            if (r1 == 0) goto L_0x07e3
            r2 = r7[r12]
            r3 = r32
            if (r2 <= r3) goto L_0x07e5
            r9 = r13[r14]
            goto L_0x07e6
        L_0x07e3:
            r3 = r32
        L_0x07e5:
            r9 = r3
        L_0x07e6:
            int r12 = r12 + 1
            int r14 = r14 + 1
            r2 = r22
            r8 = r36
            goto L_0x07b1
        L_0x07ef:
            r3 = r9
            r32 = r3
            goto L_0x07fb
        L_0x07f3:
            r15 = r9
            r38 = r14
            r13 = r21
            r21 = r0
            r0 = r8
        L_0x07fb:
            long r28 = r28 + r34
            int r10 = r10 + 1
            r8 = r0
            r9 = r15
            r0 = r21
            r2 = r33
            r3 = r38
            r21 = r13
            r13 = r30
            goto L_0x075b
        L_0x080d:
            r33 = r2
            r38 = r3
            r15 = r9
            r0 = 0
            r1 = 0
        L_0x0814:
            int r2 = r15.length
            if (r0 >= r2) goto L_0x0826
            if (r1 != 0) goto L_0x0826
            r2 = r15[r0]
            r3 = 1
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0821
            r4 = 1
            goto L_0x0822
        L_0x0821:
            r4 = 0
        L_0x0822:
            r1 = r1 | r4
            int r0 = r0 + 1
            goto L_0x0814
        L_0x0826:
            if (r1 == 0) goto L_0x0836
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k r10 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k
            r29 = r10
            r30 = r6
            r31 = r7
            r34 = r15
            r29.<init>(r30, r31, r32, r33, r34)
            goto L_0x0856
        L_0x0836:
            com.fyber.inneractive.sdk.player.exoplayer2.l r0 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r1 = "The edited sample sequence does not contain a sync sample."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x083e:
            r0 = r9
            r13 = r10
            r38 = r21
            long r6 = r5.f12500c
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15392a((long[]) r11, (long) r1, (long) r6)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k r10 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k
            r32 = r10
            r33 = r4
            r34 = r13
            r36 = r11
            r37 = r0
            r32.<init>(r33, r34, r35, r36, r37)
        L_0x0856:
            int r0 = r10.f12529a
            if (r0 != 0) goto L_0x0867
        L_0x085a:
            r5 = r20
            r0 = r38
            r6 = r50
            r1 = r52
            r21 = r55
            r4 = 0
            goto L_0x09f2
        L_0x0867:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.f$a r0 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.f$a
            r1 = r87
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r2 = r1.f12489l
            int r3 = r5.f12499b
            r13 = r55
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r2 = r2.mo25173a(r13, r3)
            r0.<init>(r5, r10, r2)
            int r3 = r10.f12532d
            int r3 = r3 + 30
            r61 = r3
            com.fyber.inneractive.sdk.player.exoplayer2.i r4 = r5.f12503f
            com.fyber.inneractive.sdk.player.exoplayer2.i r6 = new com.fyber.inneractive.sdk.player.exoplayer2.i
            r55 = r6
            java.lang.String r7 = r4.f12951a
            r56 = r7
            java.lang.String r8 = r4.f12955e
            r57 = r8
            java.lang.String r9 = r4.f12956f
            r58 = r9
            java.lang.String r11 = r4.f12953c
            r59 = r11
            int r12 = r4.f12952b
            r60 = r12
            int r14 = r4.f12960j
            r62 = r14
            int r15 = r4.f12961k
            r63 = r15
            float r1 = r4.f12962l
            r64 = r1
            r21 = r13
            int r13 = r4.f12963m
            r65 = r13
            r83 = r10
            float r10 = r4.f12964n
            r66 = r10
            r84 = r0
            byte[] r0 = r4.f12966p
            r67 = r0
            r85 = r2
            int r2 = r4.f12965o
            r68 = r2
            r22 = r2
            com.fyber.inneractive.sdk.player.exoplayer2.video.b r2 = r4.f12967q
            r69 = r2
            r23 = r2
            int r2 = r4.f12968r
            r70 = r2
            r24 = r2
            int r2 = r4.f12969s
            r71 = r2
            r25 = r2
            int r2 = r4.f12970t
            r72 = r2
            r26 = r2
            int r2 = r4.f12971u
            r73 = r2
            int r2 = r4.f12972v
            r74 = r2
            int r2 = r4.f12974x
            r75 = r2
            r27 = r2
            java.lang.String r2 = r4.f12975y
            r76 = r2
            r28 = r2
            int r2 = r4.f12976z
            r77 = r2
            r30 = r0
            r29 = r1
            long r0 = r4.f12973w
            r78 = r0
            r31 = r0
            java.util.List<byte[]> r0 = r4.f12958h
            r80 = r0
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r0 = r4.f12959i
            r81 = r0
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.a r0 = r4.f12954d
            r82 = r0
            r55.<init>(r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r80, r81, r82)
            int r0 = r5.f12499b
            r1 = 1
            if (r0 != r1) goto L_0x09ce
            boolean r0 = r38.mo25236a()
            if (r0 == 0) goto L_0x095b
            r0 = r38
            int r4 = r0.f12129a
            r73 = r4
            int r4 = r0.f12130b
            r74 = r4
            com.fyber.inneractive.sdk.player.exoplayer2.i r4 = new com.fyber.inneractive.sdk.player.exoplayer2.i
            r55 = r4
            java.util.List<byte[]> r1 = r6.f12958h
            r80 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r1 = r6.f12959i
            r81 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.a r1 = r6.f12954d
            r82 = r1
            r56 = r7
            r57 = r8
            r58 = r9
            r59 = r11
            r60 = r12
            r61 = r3
            r62 = r14
            r63 = r15
            r64 = r29
            r65 = r13
            r66 = r10
            r67 = r30
            r68 = r22
            r69 = r23
            r70 = r24
            r71 = r25
            r72 = r26
            r75 = r27
            r76 = r28
            r77 = r2
            r78 = r31
            r55.<init>(r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r80, r81, r82)
            r6 = r4
            goto L_0x095d
        L_0x095b:
            r0 = r38
        L_0x095d:
            if (r54 == 0) goto L_0x09d0
            com.fyber.inneractive.sdk.player.exoplayer2.i r1 = new com.fyber.inneractive.sdk.player.exoplayer2.i
            r22 = r1
            java.lang.String r2 = r6.f12951a
            r23 = r2
            java.lang.String r2 = r6.f12955e
            r24 = r2
            java.lang.String r2 = r6.f12956f
            r25 = r2
            java.lang.String r2 = r6.f12953c
            r26 = r2
            int r2 = r6.f12952b
            r27 = r2
            int r2 = r6.f12957g
            r28 = r2
            int r2 = r6.f12960j
            r29 = r2
            int r2 = r6.f12961k
            r30 = r2
            float r2 = r6.f12962l
            r31 = r2
            int r2 = r6.f12963m
            r32 = r2
            float r2 = r6.f12964n
            r33 = r2
            byte[] r2 = r6.f12966p
            r34 = r2
            int r2 = r6.f12965o
            r35 = r2
            com.fyber.inneractive.sdk.player.exoplayer2.video.b r2 = r6.f12967q
            r36 = r2
            int r2 = r6.f12968r
            r37 = r2
            int r2 = r6.f12969s
            r38 = r2
            int r2 = r6.f12970t
            r39 = r2
            int r2 = r6.f12971u
            r40 = r2
            int r2 = r6.f12972v
            r41 = r2
            int r2 = r6.f12974x
            r42 = r2
            java.lang.String r2 = r6.f12975y
            r43 = r2
            int r2 = r6.f12976z
            r44 = r2
            long r2 = r6.f12973w
            r45 = r2
            java.util.List<byte[]> r2 = r6.f12958h
            r47 = r2
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r2 = r6.f12959i
            r48 = r2
            r49 = r54
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r47, r48, r49)
            r6 = r1
            goto L_0x09d0
        L_0x09ce:
            r0 = r38
        L_0x09d0:
            r1 = r85
            r1.mo25149a(r6)
            long r1 = r5.f12502e
            r3 = r52
            long r1 = java.lang.Math.max(r3, r1)
            r5 = r20
            r3 = r84
            r5.add(r3)
            r10 = r83
            long[] r3 = r10.f12530b
            r4 = 0
            r6 = r3[r4]
            int r3 = (r6 > r50 ? 1 : (r6 == r50 ? 0 : -1))
            if (r3 >= 0) goto L_0x09f0
            goto L_0x09f2
        L_0x09f0:
            r6 = r50
        L_0x09f2:
            int r9 = r21 + 1
            r8 = r0
            r13 = r4
            r0 = r18
            r11 = 0
            r12 = 1
            r3 = r1
            r2 = r54
            r1 = r87
            goto L_0x0261
        L_0x0a01:
            com.fyber.inneractive.sdk.player.exoplayer2.l r0 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r1 = "Track has no sample table size information"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0a09:
            r1.f12491n = r3
            int r0 = r5.size()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.f$a[] r0 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4797f.C4798a[r0]
            java.lang.Object[] r0 = r5.toArray(r0)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.f$a[] r0 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4797f.C4798a[]) r0
            r1.f12490m = r0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r0 = r1.f12489l
            r0.mo25175c()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r0 = r1.f12489l
            r0.mo25174a(r1)
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r0 = r1.f12481d
            r0.clear()
            r0 = 2
            r1.f12482e = r0
            goto L_0x0002
        L_0x0a2d:
            r18 = r0
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r0 = r1.f12481d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0002
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r0 = r1.f12481d
            java.lang.Object r0 = r0.peek()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r0 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.C4785a) r0
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r0 = r0.f12381R0
            r2 = r18
            r0.add(r2)
            goto L_0x0002
        L_0x0a48:
            int r0 = r1.f12482e
            r2 = 2
            if (r0 == r2) goto L_0x0a50
            r87.mo25272d()
        L_0x0a50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4797f.mo25271c(long):void");
    }

    /* renamed from: a */
    public void mo25164a(long j, long j2) {
        this.f12481d.clear();
        this.f12485h = 0;
        this.f12487j = 0;
        this.f12488k = 0;
        if (j == 0) {
            mo25272d();
            return;
        }
        C4798a[] aVarArr = this.f12490m;
        if (aVarArr != null) {
            for (C4798a aVar : aVarArr) {
                C4803k kVar = aVar.f12494b;
                int a = kVar.mo25274a(j2);
                if (a == -1) {
                    a = kVar.mo25275b(j2);
                }
                aVar.f12496d = a;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:148:0x0190 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02aa A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x018d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo25163a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4730g r24, com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4766l r25) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
        L_0x0006:
            int r3 = r0.f12482e
            r4 = -1
            r5 = 8
            r6 = 1
            if (r3 == 0) goto L_0x0192
            r8 = 262144(0x40000, double:1.295163E-318)
            r10 = 2
            if (r3 == r6) goto L_0x0112
            if (r3 != r10) goto L_0x010c
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r5 = r4
            r3 = 0
        L_0x001d:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.f$a[] r14 = r0.f12490m
            int r15 = r14.length
            if (r3 >= r15) goto L_0x003a
            r14 = r14[r3]
            int r15 = r14.f12496d
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k r14 = r14.f12494b
            int r11 = r14.f12529a
            if (r15 != r11) goto L_0x002d
            goto L_0x0037
        L_0x002d:
            long[] r11 = r14.f12530b
            r14 = r11[r15]
            int r11 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r11 >= 0) goto L_0x0037
            r5 = r3
            r12 = r14
        L_0x0037:
            int r3 = r3 + 1
            goto L_0x001d
        L_0x003a:
            if (r5 != r4) goto L_0x003e
            goto L_0x010b
        L_0x003e:
            r3 = r14[r5]
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r4 = r3.f12495c
            int r5 = r3.f12496d
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k r11 = r3.f12494b
            long[] r12 = r11.f12530b
            r13 = r12[r5]
            int[] r11 = r11.f12531c
            r11 = r11[r5]
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h r12 = r3.f12493a
            int r12 = r12.f12504g
            if (r12 != r6) goto L_0x005a
            r16 = 8
            long r13 = r13 + r16
            int r11 = r11 + -8
        L_0x005a:
            r12 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r12 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b) r12
            r16 = r11
            long r10 = r12.f11871c
            long r10 = r13 - r10
            int r15 = r0.f12487j
            long r6 = (long) r15
            long r10 = r10 + r6
            r6 = 0
            int r6 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x0108
            int r6 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x0073
            goto L_0x0108
        L_0x0073:
            int r2 = (int) r10
            r12.mo25139c(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h r2 = r3.f12493a
            int r2 = r2.f12508k
            if (r2 == 0) goto L_0x00cc
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r6 = r0.f12479b
            byte[] r6 = r6.f13444a
            r7 = 0
            r6[r7] = r7
            r8 = 1
            r6[r8] = r7
            r8 = 2
            r6[r8] = r7
            int r6 = 4 - r2
            r11 = r16
        L_0x008e:
            int r8 = r0.f12487j
            if (r8 >= r11) goto L_0x00e6
            int r8 = r0.f12488k
            if (r8 != 0) goto L_0x00bc
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r8 = r0.f12479b
            byte[] r8 = r8.f13444a
            r12.mo25138b(r8, r6, r2, r7)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r8 = r0.f12479b
            r8.mo25600e(r7)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r8 = r0.f12479b
            int r8 = r8.mo25611o()
            r0.f12488k = r8
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r8 = r0.f12478a
            r8.mo25600e(r7)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r8 = r0.f12478a
            r9 = 4
            r4.mo25150a(r8, r9)
            int r8 = r0.f12487j
            int r8 = r8 + r9
            r0.f12487j = r8
            int r11 = r11 + r6
            goto L_0x008e
        L_0x00bc:
            int r8 = r4.mo25143a(r1, r8, r7)
            int r7 = r0.f12487j
            int r7 = r7 + r8
            r0.f12487j = r7
            int r7 = r0.f12488k
            int r7 = r7 - r8
            r0.f12488k = r7
            r7 = 0
            goto L_0x008e
        L_0x00cc:
            int r2 = r0.f12487j
            r11 = r16
            if (r2 >= r11) goto L_0x00e6
            int r2 = r11 - r2
            r6 = 0
            int r2 = r4.mo25143a(r1, r2, r6)
            int r6 = r0.f12487j
            int r6 = r6 + r2
            r0.f12487j = r6
            int r6 = r0.f12488k
            int r6 = r6 - r2
            r0.f12488k = r6
            r16 = r11
            goto L_0x00cc
        L_0x00e6:
            r20 = r11
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k r1 = r3.f12494b
            long[] r2 = r1.f12533e
            r17 = r2[r5]
            int[] r1 = r1.f12534f
            r19 = r1[r5]
            r21 = 0
            r22 = 0
            r16 = r4
            r16.mo25147a(r17, r19, r20, r21, r22)
            int r1 = r3.f12496d
            r2 = 1
            int r1 = r1 + r2
            r3.f12496d = r1
            r1 = 0
            r0.f12487j = r1
            r0.f12488k = r1
            r4 = 0
            goto L_0x010b
        L_0x0108:
            r2.f12145a = r13
            r4 = 1
        L_0x010b:
            return r4
        L_0x010c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0112:
            long r3 = r0.f12484g
            int r6 = r0.f12485h
            long r10 = (long) r6
            long r3 = r3 - r10
            r7 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r7 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b) r7
            long r10 = r7.f11871c
            long r10 = r10 + r3
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r12 = r0.f12486i
            if (r12 == 0) goto L_0x0174
            byte[] r8 = r12.f13444a
            int r3 = (int) r3
            r4 = 0
            r7.mo25138b(r8, r6, r3, r4)
            int r3 = r0.f12483f
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12328b
            if (r3 != r4) goto L_0x0155
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f12486i
            r3.mo25600e(r5)
            int r4 = r3.mo25595c()
            int r5 = f12477p
            if (r4 != r5) goto L_0x013d
            goto L_0x014f
        L_0x013d:
            r4 = 4
            r3.mo25602f(r4)
        L_0x0141:
            int r4 = r3.mo25588a()
            if (r4 <= 0) goto L_0x0151
            int r4 = r3.mo25595c()
            int r5 = f12477p
            if (r4 != r5) goto L_0x0141
        L_0x014f:
            r3 = 1
            goto L_0x0152
        L_0x0151:
            r3 = 0
        L_0x0152:
            r0.f12492o = r3
            goto L_0x017c
        L_0x0155:
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r3 = r0.f12481d
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x017c
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r3 = r0.f12481d
            java.lang.Object r3 = r3.peek()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.C4785a) r3
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r4 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b
            int r5 = r0.f12483f
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r6 = r0.f12486i
            r4.<init>(r5, r6)
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b> r3 = r3.f12380Q0
            r3.add(r4)
            goto L_0x017c
        L_0x0174:
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 >= 0) goto L_0x017e
            int r3 = (int) r3
            r7.mo25139c(r3)
        L_0x017c:
            r3 = 0
            goto L_0x0181
        L_0x017e:
            r2.f12145a = r10
            r3 = 1
        L_0x0181:
            r0.mo25271c(r10)
            if (r3 == 0) goto L_0x018d
            int r3 = r0.f12482e
            r4 = 2
            if (r3 == r4) goto L_0x018d
            r7 = 1
            goto L_0x018e
        L_0x018d:
            r7 = 0
        L_0x018e:
            if (r7 == 0) goto L_0x0006
            r3 = 1
            return r3
        L_0x0192:
            r3 = r6
            int r6 = r0.f12485h
            if (r6 != 0) goto L_0x01bf
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r6 = r0.f12480c
            byte[] r6 = r6.f13444a
            r7 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r7 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b) r7
            r8 = 0
            boolean r6 = r7.mo25138b(r6, r8, r5, r3)
            if (r6 != 0) goto L_0x01a8
            r6 = r8
            goto L_0x02a8
        L_0x01a8:
            r0.f12485h = r5
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f12480c
            r3.mo25600e(r8)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f12480c
            long r6 = r3.mo25609m()
            r0.f12484g = r6
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f12480c
            int r3 = r3.mo25595c()
            r0.f12483f = r3
        L_0x01bf:
            long r6 = r0.f12484g
            r8 = 1
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x01df
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f12480c
            byte[] r3 = r3.f13444a
            r6 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r6 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b) r6
            r7 = 0
            r6.mo25138b(r3, r5, r5, r7)
            int r3 = r0.f12485h
            int r3 = r3 + r5
            r0.f12485h = r3
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f12480c
            long r6 = r3.mo25612p()
            r0.f12484g = r6
        L_0x01df:
            int r3 = r0.f12483f
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12290C
            if (r3 == r6) goto L_0x01fc
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12294E
            if (r3 == r6) goto L_0x01fc
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12296F
            if (r3 == r6) goto L_0x01fc
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12298G
            if (r3 == r6) goto L_0x01fc
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12300H
            if (r3 == r6) goto L_0x01fc
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12317Q
            if (r3 != r6) goto L_0x01fa
            goto L_0x01fc
        L_0x01fa:
            r7 = 0
            goto L_0x01fd
        L_0x01fc:
            r7 = 1
        L_0x01fd:
            if (r7 == 0) goto L_0x022a
            r3 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b) r3
            long r5 = r3.f11871c
            long r7 = r0.f12484g
            long r5 = r5 + r7
            int r3 = r0.f12485h
            long r7 = (long) r3
            long r5 = r5 - r7
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r3 = r0.f12481d
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r7 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a
            int r8 = r0.f12483f
            r7.<init>(r8, r5)
            r3.add(r7)
            long r7 = r0.f12484g
            int r3 = r0.f12485h
            long r9 = (long) r3
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x0224
            r0.mo25271c(r5)
            goto L_0x0227
        L_0x0224:
            r23.mo25272d()
        L_0x0227:
            r3 = 1
            goto L_0x02a7
        L_0x022a:
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12319S
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12292D
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12320T
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12321U
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12351m0
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12353n0
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12355o0
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12318R
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12357p0
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12359q0
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12361r0
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12363s0
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12365t0
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12316P
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12328b
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12287A0
            if (r3 != r6) goto L_0x026b
            goto L_0x026d
        L_0x026b:
            r7 = 0
            goto L_0x026e
        L_0x026d:
            r7 = 1
        L_0x026e:
            if (r7 == 0) goto L_0x02a1
            int r3 = r0.f12485h
            if (r3 != r5) goto L_0x0276
            r7 = 1
            goto L_0x0277
        L_0x0276:
            r7 = 0
        L_0x0277:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a.m15304b(r7)
            long r6 = r0.f12484g
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 > 0) goto L_0x0285
            r7 = 1
            goto L_0x0286
        L_0x0285:
            r7 = 0
        L_0x0286:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a.m15304b(r7)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = new com.fyber.inneractive.sdk.player.exoplayer2.util.k
            long r6 = r0.f12484g
            int r6 = (int) r6
            r3.<init>((int) r6)
            r0.f12486i = r3
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r6 = r0.f12480c
            byte[] r6 = r6.f13444a
            byte[] r3 = r3.f13444a
            r7 = 0
            java.lang.System.arraycopy(r6, r7, r3, r7, r5)
            r3 = 1
            r0.f12482e = r3
            goto L_0x02a7
        L_0x02a1:
            r3 = 1
            r5 = 0
            r0.f12486i = r5
            r0.f12482e = r3
        L_0x02a7:
            r6 = r3
        L_0x02a8:
            if (r6 != 0) goto L_0x0006
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4797f.mo25163a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l):int");
    }

    /* renamed from: a */
    public long mo25129a(long j) {
        long j2 = Long.MAX_VALUE;
        for (C4798a aVar : this.f12490m) {
            C4803k kVar = aVar.f12494b;
            int a = kVar.mo25274a(j);
            if (a == -1) {
                a = kVar.mo25275b(j);
            }
            long j3 = kVar.f12530b[a];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }
}
