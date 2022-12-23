package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.C4695b;
import com.fyber.inneractive.sdk.player.exoplayer2.C4874m;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.MediaCodecAudioRenderer;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.c */
public final class C4681c {

    /* renamed from: A */
    public long f11705A;

    /* renamed from: B */
    public boolean f11706B;

    /* renamed from: C */
    public long f11707C;

    /* renamed from: D */
    public Method f11708D;

    /* renamed from: E */
    public int f11709E;

    /* renamed from: F */
    public long f11710F;

    /* renamed from: G */
    public long f11711G;

    /* renamed from: H */
    public int f11712H;

    /* renamed from: I */
    public long f11713I;

    /* renamed from: J */
    public long f11714J;

    /* renamed from: K */
    public int f11715K;

    /* renamed from: L */
    public int f11716L;

    /* renamed from: M */
    public long f11717M;

    /* renamed from: N */
    public long f11718N;

    /* renamed from: O */
    public long f11719O;

    /* renamed from: P */
    public float f11720P;

    /* renamed from: Q */
    public C4679b[] f11721Q;

    /* renamed from: R */
    public ByteBuffer[] f11722R;

    /* renamed from: S */
    public ByteBuffer f11723S;

    /* renamed from: T */
    public ByteBuffer f11724T;

    /* renamed from: U */
    public byte[] f11725U;

    /* renamed from: V */
    public int f11726V;

    /* renamed from: W */
    public int f11727W;

    /* renamed from: X */
    public boolean f11728X;

    /* renamed from: Y */
    public boolean f11729Y;

    /* renamed from: Z */
    public int f11730Z;

    /* renamed from: a */
    public final C4690d f11731a;

    /* renamed from: a0 */
    public boolean f11732a0;

    /* renamed from: b */
    public final C4694h f11733b;

    /* renamed from: b0 */
    public boolean f11734b0;

    /* renamed from: c */
    public final C4679b[] f11735c;

    /* renamed from: c0 */
    public long f11736c0;

    /* renamed from: d */
    public final C4687f f11737d;

    /* renamed from: e */
    public final ConditionVariable f11738e = new ConditionVariable(true);

    /* renamed from: f */
    public final long[] f11739f;

    /* renamed from: g */
    public final C4683b f11740g;

    /* renamed from: h */
    public final LinkedList<C4688g> f11741h;

    /* renamed from: i */
    public AudioTrack f11742i;

    /* renamed from: j */
    public int f11743j;

    /* renamed from: k */
    public int f11744k;

    /* renamed from: l */
    public int f11745l;

    /* renamed from: m */
    public int f11746m;

    /* renamed from: n */
    public int f11747n;

    /* renamed from: o */
    public boolean f11748o;

    /* renamed from: p */
    public int f11749p;

    /* renamed from: q */
    public long f11750q;

    /* renamed from: r */
    public C4874m f11751r;

    /* renamed from: s */
    public C4874m f11752s;

    /* renamed from: t */
    public long f11753t;

    /* renamed from: u */
    public long f11754u;

    /* renamed from: v */
    public ByteBuffer f11755v;

    /* renamed from: w */
    public int f11756w;

    /* renamed from: x */
    public int f11757x;

    /* renamed from: y */
    public int f11758y;

    /* renamed from: z */
    public long f11759z;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.c$a */
    public class C4682a extends Thread {

        /* renamed from: a */
        public final /* synthetic */ AudioTrack f11760a;

        public C4682a(AudioTrack audioTrack) {
            this.f11760a = audioTrack;
        }

        public void run() {
            try {
                this.f11760a.flush();
                this.f11760a.release();
            } finally {
                C4681c.this.f11738e.open();
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.c$b */
    public static class C4683b {

        /* renamed from: a */
        public AudioTrack f11762a;

        /* renamed from: b */
        public boolean f11763b;

        /* renamed from: c */
        public int f11764c;

        /* renamed from: d */
        public long f11765d;

        /* renamed from: e */
        public long f11766e;

        /* renamed from: f */
        public long f11767f;

        /* renamed from: g */
        public long f11768g;

        /* renamed from: h */
        public long f11769h;

        /* renamed from: i */
        public long f11770i;

        public C4683b() {
        }

        /* renamed from: a */
        public void mo25091a(AudioTrack audioTrack, boolean z) {
            this.f11762a = audioTrack;
            this.f11763b = z;
            this.f11768g = -9223372036854775807L;
            this.f11765d = 0;
            this.f11766e = 0;
            this.f11767f = 0;
            if (audioTrack != null) {
                this.f11764c = audioTrack.getSampleRate();
            }
        }

        /* renamed from: b */
        public long mo25092b() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public long mo25093c() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public boolean mo25094d() {
            return false;
        }

        public /* synthetic */ C4683b(C4682a aVar) {
            this();
        }

        /* renamed from: a */
        public long mo25090a() {
            if (this.f11768g != -9223372036854775807L) {
                return Math.min(this.f11770i, this.f11769h + ((((SystemClock.elapsedRealtime() * 1000) - this.f11768g) * ((long) this.f11764c)) / 1000000));
            }
            int playState = this.f11762a.getPlayState();
            if (playState == 1) {
                return 0;
            }
            long playbackHeadPosition = ((long) this.f11762a.getPlaybackHeadPosition()) & 4294967295L;
            if (this.f11763b) {
                if (playState == 2 && playbackHeadPosition == 0) {
                    this.f11767f = this.f11765d;
                }
                playbackHeadPosition += this.f11767f;
            }
            if (this.f11765d > playbackHeadPosition) {
                this.f11766e++;
            }
            this.f11765d = playbackHeadPosition;
            return playbackHeadPosition + (this.f11766e << 32);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.c$c */
    public static class C4684c extends C4683b {

        /* renamed from: j */
        public final AudioTimestamp f11771j = new AudioTimestamp();

        /* renamed from: k */
        public long f11772k;

        /* renamed from: l */
        public long f11773l;

        /* renamed from: m */
        public long f11774m;

        public C4684c() {
            super((C4682a) null);
        }

        /* renamed from: a */
        public void mo25091a(AudioTrack audioTrack, boolean z) {
            super.mo25091a(audioTrack, z);
            this.f11772k = 0;
            this.f11773l = 0;
            this.f11774m = 0;
        }

        /* renamed from: b */
        public long mo25092b() {
            return this.f11774m;
        }

        /* renamed from: c */
        public long mo25093c() {
            return this.f11771j.nanoTime;
        }

        /* renamed from: d */
        public boolean mo25094d() {
            boolean timestamp = this.f11762a.getTimestamp(this.f11771j);
            if (timestamp) {
                long j = this.f11771j.framePosition;
                if (this.f11773l > j) {
                    this.f11772k++;
                }
                this.f11773l = j;
                this.f11774m = j + (this.f11772k << 32);
            }
            return timestamp;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.c$d */
    public static final class C4685d extends Exception {
        public C4685d(Throwable th) {
            super(th);
        }

        public C4685d(String str) {
            super(str);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.c$e */
    public static final class C4686e extends Exception {
        public C4686e(int i, int i2, int i3, int i4) {
            super("AudioTrack init failed: " + i + ", Config(" + i2 + ", " + i3 + ", " + i4 + ")");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.c$f */
    public interface C4687f {
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.c$g */
    public static final class C4688g {

        /* renamed from: a */
        public final C4874m f11775a;

        /* renamed from: b */
        public final long f11776b;

        /* renamed from: c */
        public final long f11777c;

        public C4688g(C4874m mVar, long j, long j2) {
            this.f11775a = mVar;
            this.f11776b = j;
            this.f11777c = j2;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.c$h */
    public static final class C4689h extends Exception {
        public C4689h(int i) {
            super("AudioTrack write failed: " + i);
        }
    }

    public C4681c(C4679b[] bVarArr, C4687f fVar) {
        this.f11737d = fVar;
        if (C5049u.f13471a >= 18) {
            try {
                this.f11708D = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (C5049u.f13471a >= 19) {
            this.f11740g = new C4684c();
        } else {
            this.f11740g = new C4683b((C4682a) null);
        }
        C4690d dVar = new C4690d();
        this.f11731a = dVar;
        C4694h hVar = new C4694h();
        this.f11733b = hVar;
        C4679b[] bVarArr2 = new C4679b[(bVarArr.length + 3)];
        this.f11735c = bVarArr2;
        bVarArr2[0] = new C4692f();
        bVarArr2[1] = dVar;
        System.arraycopy(bVarArr, 0, bVarArr2, 2, bVarArr.length);
        bVarArr2[bVarArr.length + 2] = hVar;
        this.f11739f = new long[10];
        this.f11720P = 1.0f;
        this.f11716L = 0;
        this.f11747n = 3;
        this.f11730Z = 0;
        this.f11752s = C4874m.f12978d;
        this.f11727W = -1;
        this.f11721Q = new C4679b[0];
        this.f11722R = new ByteBuffer[0];
        this.f11741h = new LinkedList<>();
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x00cc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00cd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25073a(java.lang.String r10, int r11, int r12, int r13, int r14, int[] r15) throws com.fyber.inneractive.sdk.player.exoplayer2.audio.C4681c.C4685d {
        /*
            r9 = this;
            java.lang.String r0 = "audio/raw"
            boolean r0 = r0.equals(r10)
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x000f
            int r10 = m14392a((java.lang.String) r10)
            goto L_0x0010
        L_0x000f:
            r10 = r13
        L_0x0010:
            r2 = 0
            if (r0 != 0) goto L_0x0049
            int r13 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15394b(r13, r11)
            r9.f11709E = r13
            com.fyber.inneractive.sdk.player.exoplayer2.audio.d r13 = r9.f11731a
            r13.f11780d = r15
            com.fyber.inneractive.sdk.player.exoplayer2.audio.b[] r13 = r9.f11735c
            int r15 = r13.length
            r3 = r2
            r4 = r3
        L_0x0022:
            if (r3 >= r15) goto L_0x0043
            r5 = r13[r3]
            boolean r6 = r5.mo25063a(r12, r11, r10)     // Catch:{ a -> 0x003c }
            r4 = r4 | r6
            boolean r6 = r5.mo25066d()
            if (r6 == 0) goto L_0x0039
            int r11 = r5.mo25068f()
            int r10 = r5.mo25067e()
        L_0x0039:
            int r3 = r3 + 1
            goto L_0x0022
        L_0x003c:
            r10 = move-exception
            com.fyber.inneractive.sdk.player.exoplayer2.audio.c$d r11 = new com.fyber.inneractive.sdk.player.exoplayer2.audio.c$d
            r11.<init>((java.lang.Throwable) r10)
            throw r11
        L_0x0043:
            if (r4 == 0) goto L_0x004a
            r9.mo25086i()
            goto L_0x004a
        L_0x0049:
            r4 = r2
        L_0x004a:
            r13 = 252(0xfc, float:3.53E-43)
            r15 = 12
            switch(r11) {
                case 1: goto L_0x007b;
                case 2: goto L_0x0079;
                case 3: goto L_0x0076;
                case 4: goto L_0x0073;
                case 5: goto L_0x0070;
                case 6: goto L_0x006e;
                case 7: goto L_0x006b;
                case 8: goto L_0x0068;
                default: goto L_0x0051;
            }
        L_0x0051:
            com.fyber.inneractive.sdk.player.exoplayer2.audio.c$d r10 = new com.fyber.inneractive.sdk.player.exoplayer2.audio.c$d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Unsupported channel count: "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.<init>((java.lang.String) r11)
            throw r10
        L_0x0068:
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.C4695b.f11830a
            goto L_0x007c
        L_0x006b:
            r3 = 1276(0x4fc, float:1.788E-42)
            goto L_0x007c
        L_0x006e:
            r3 = r13
            goto L_0x007c
        L_0x0070:
            r3 = 220(0xdc, float:3.08E-43)
            goto L_0x007c
        L_0x0073:
            r3 = 204(0xcc, float:2.86E-43)
            goto L_0x007c
        L_0x0076:
            r3 = 28
            goto L_0x007c
        L_0x0079:
            r3 = r15
            goto L_0x007c
        L_0x007b:
            r3 = 4
        L_0x007c:
            int r5 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.f13471a
            r6 = 23
            r7 = 5
            if (r5 > r6) goto L_0x00a3
            java.lang.String r6 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.f13472b
            java.lang.String r8 = "foster"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x00a3
            java.lang.String r6 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.f13473c
            java.lang.String r8 = "NVIDIA"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x00a3
            r6 = 3
            if (r11 == r6) goto L_0x00a4
            if (r11 == r7) goto L_0x00a4
            r13 = 7
            if (r11 == r13) goto L_0x00a0
            goto L_0x00a3
        L_0x00a0:
            int r13 = com.fyber.inneractive.sdk.player.exoplayer2.C4695b.f11830a
            goto L_0x00a4
        L_0x00a3:
            r13 = r3
        L_0x00a4:
            r3 = 25
            if (r5 > r3) goto L_0x00b7
            java.lang.String r3 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.f13472b
            java.lang.String r5 = "fugu"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x00b7
            if (r0 == 0) goto L_0x00b7
            if (r11 != r1) goto L_0x00b7
            goto L_0x00b8
        L_0x00b7:
            r15 = r13
        L_0x00b8:
            if (r4 != 0) goto L_0x00cd
            boolean r13 = r9.mo25082e()
            if (r13 == 0) goto L_0x00cd
            int r13 = r9.f11745l
            if (r13 != r10) goto L_0x00cd
            int r13 = r9.f11743j
            if (r13 != r12) goto L_0x00cd
            int r13 = r9.f11744k
            if (r13 != r15) goto L_0x00cd
            return
        L_0x00cd:
            r9.mo25085h()
            r9.f11745l = r10
            r9.f11748o = r0
            r9.f11743j = r12
            r9.f11744k = r15
            r13 = 2
            if (r0 == 0) goto L_0x00dc
            goto L_0x00dd
        L_0x00dc:
            r10 = r13
        L_0x00dd:
            r9.f11746m = r10
            int r10 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15394b(r13, r11)
            r9.f11712H = r10
            if (r14 == 0) goto L_0x00ea
            r9.f11749p = r14
            goto L_0x0134
        L_0x00ea:
            if (r0 == 0) goto L_0x00ff
            int r10 = r9.f11746m
            if (r10 == r7) goto L_0x00fa
            r11 = 6
            if (r10 != r11) goto L_0x00f4
            goto L_0x00fa
        L_0x00f4:
            r10 = 49152(0xc000, float:6.8877E-41)
            r9.f11749p = r10
            goto L_0x0134
        L_0x00fa:
            r10 = 20480(0x5000, float:2.8699E-41)
            r9.f11749p = r10
            goto L_0x0134
        L_0x00ff:
            int r10 = r9.f11746m
            int r10 = android.media.AudioTrack.getMinBufferSize(r12, r15, r10)
            r11 = -2
            if (r10 == r11) goto L_0x0109
            goto L_0x010a
        L_0x0109:
            r1 = r2
        L_0x010a:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a.m15304b(r1)
            int r11 = r10 * 4
            r12 = 250000(0x3d090, double:1.235164E-318)
            long r12 = r9.mo25071a((long) r12)
            int r12 = (int) r12
            int r13 = r9.f11712H
            int r12 = r12 * r13
            long r13 = (long) r10
            r1 = 750000(0xb71b0, double:3.70549E-318)
            long r1 = r9.mo25071a((long) r1)
            int r10 = r9.f11712H
            long r3 = (long) r10
            long r1 = r1 * r3
            long r13 = java.lang.Math.max(r13, r1)
            int r10 = (int) r13
            if (r11 >= r12) goto L_0x012f
            r11 = r12
            goto L_0x0132
        L_0x012f:
            if (r11 <= r10) goto L_0x0132
            r11 = r10
        L_0x0132:
            r9.f11749p = r11
        L_0x0134:
            if (r0 == 0) goto L_0x013c
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0146
        L_0x013c:
            int r10 = r9.f11749p
            int r11 = r9.f11712H
            int r10 = r10 / r11
            long r10 = (long) r10
            long r10 = r9.mo25077b(r10)
        L_0x0146:
            r9.f11750q = r10
            com.fyber.inneractive.sdk.player.exoplayer2.m r10 = r9.f11752s
            r9.mo25072a((com.fyber.inneractive.sdk.player.exoplayer2.C4874m) r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.C4681c.mo25073a(java.lang.String, int, int, int, int, int[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d5, code lost:
        if (r11 < r10) goto L_0x0075;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0110  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo25078b(java.nio.ByteBuffer r9, long r10) throws com.fyber.inneractive.sdk.player.exoplayer2.audio.C4681c.C4689h {
        /*
            r8 = this;
            boolean r0 = r9.hasRemaining()
            r1 = 1
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.nio.ByteBuffer r0 = r8.f11724T
            r2 = 21
            r3 = 0
            if (r0 == 0) goto L_0x0018
            if (r0 != r9) goto L_0x0013
            r0 = r1
            goto L_0x0014
        L_0x0013:
            r0 = r3
        L_0x0014:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a.m15302a((boolean) r0)
            goto L_0x003b
        L_0x0018:
            r8.f11724T = r9
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.f13471a
            if (r0 >= r2) goto L_0x003b
            int r0 = r9.remaining()
            byte[] r4 = r8.f11725U
            if (r4 == 0) goto L_0x0029
            int r4 = r4.length
            if (r4 >= r0) goto L_0x002d
        L_0x0029:
            byte[] r4 = new byte[r0]
            r8.f11725U = r4
        L_0x002d:
            int r4 = r9.position()
            byte[] r5 = r8.f11725U
            r9.get(r5, r3, r0)
            r9.position(r4)
            r8.f11726V = r3
        L_0x003b:
            int r0 = r9.remaining()
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.f13471a
            if (r4 >= r2) goto L_0x0078
            long r10 = r8.f11713I
            com.fyber.inneractive.sdk.player.exoplayer2.audio.c$b r2 = r8.f11740g
            long r4 = r2.mo25090a()
            int r2 = r8.f11712H
            long r6 = (long) r2
            long r4 = r4 * r6
            long r10 = r10 - r4
            int r10 = (int) r10
            int r11 = r8.f11749p
            int r11 = r11 - r10
            if (r11 <= 0) goto L_0x0075
            int r10 = java.lang.Math.min(r0, r11)
            android.media.AudioTrack r11 = r8.f11742i
            byte[] r2 = r8.f11725U
            int r4 = r8.f11726V
            int r10 = r11.write(r2, r4, r10)
            if (r10 <= 0) goto L_0x00ed
            int r11 = r8.f11726V
            int r11 = r11 + r10
            r8.f11726V = r11
            int r11 = r9.position()
            int r11 = r11 + r10
            r9.position(r11)
            goto L_0x00ed
        L_0x0075:
            r10 = r3
            goto L_0x00ed
        L_0x0078:
            boolean r2 = r8.f11732a0
            if (r2 == 0) goto L_0x00e7
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0087
            r2 = r1
            goto L_0x0088
        L_0x0087:
            r2 = r3
        L_0x0088:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a.m15304b(r2)
            android.media.AudioTrack r2 = r8.f11742i
            java.nio.ByteBuffer r4 = r8.f11755v
            if (r4 != 0) goto L_0x00a6
            r4 = 16
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            r8.f11755v = r4
            java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN
            r4.order(r5)
            java.nio.ByteBuffer r4 = r8.f11755v
            r5 = 1431633921(0x55550001, float:1.46372496E13)
            r4.putInt(r5)
        L_0x00a6:
            int r4 = r8.f11756w
            if (r4 != 0) goto L_0x00c1
            java.nio.ByteBuffer r4 = r8.f11755v
            r5 = 4
            r4.putInt(r5, r0)
            java.nio.ByteBuffer r4 = r8.f11755v
            r5 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r5
            r5 = 8
            r4.putLong(r5, r10)
            java.nio.ByteBuffer r10 = r8.f11755v
            r10.position(r3)
            r8.f11756w = r0
        L_0x00c1:
            java.nio.ByteBuffer r10 = r8.f11755v
            int r10 = r10.remaining()
            if (r10 <= 0) goto L_0x00d8
            java.nio.ByteBuffer r11 = r8.f11755v
            int r11 = r2.write(r11, r10, r1)
            if (r11 >= 0) goto L_0x00d5
            r8.f11756w = r3
            r10 = r11
            goto L_0x00ed
        L_0x00d5:
            if (r11 >= r10) goto L_0x00d8
            goto L_0x0075
        L_0x00d8:
            int r10 = r2.write(r9, r0, r1)
            if (r10 >= 0) goto L_0x00e1
            r8.f11756w = r3
            goto L_0x00ed
        L_0x00e1:
            int r9 = r8.f11756w
            int r9 = r9 - r10
            r8.f11756w = r9
            goto L_0x00ed
        L_0x00e7:
            android.media.AudioTrack r10 = r8.f11742i
            int r10 = r10.write(r9, r0, r1)
        L_0x00ed:
            long r4 = android.os.SystemClock.elapsedRealtime()
            r8.f11736c0 = r4
            if (r10 < 0) goto L_0x0110
            boolean r9 = r8.f11748o
            if (r9 != 0) goto L_0x00ff
            long r4 = r8.f11713I
            long r6 = (long) r10
            long r4 = r4 + r6
            r8.f11713I = r4
        L_0x00ff:
            if (r10 != r0) goto L_0x010f
            if (r9 == 0) goto L_0x010b
            long r9 = r8.f11714J
            int r11 = r8.f11715K
            long r2 = (long) r11
            long r9 = r9 + r2
            r8.f11714J = r9
        L_0x010b:
            r9 = 0
            r8.f11724T = r9
            return r1
        L_0x010f:
            return r3
        L_0x0110:
            com.fyber.inneractive.sdk.player.exoplayer2.audio.c$h r9 = new com.fyber.inneractive.sdk.player.exoplayer2.audio.c$h
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.C4681c.mo25078b(java.nio.ByteBuffer, long):boolean");
    }

    /* renamed from: c */
    public final void mo25080c(long j) throws C4689h {
        ByteBuffer byteBuffer;
        int length = this.f11721Q.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f11722R[i - 1];
            } else {
                byteBuffer = this.f11723S;
                if (byteBuffer == null) {
                    byteBuffer = C4679b.f11704a;
                }
            }
            if (i == length) {
                mo25078b(byteBuffer, j);
            } else {
                C4679b bVar = this.f11721Q[i];
                bVar.mo25062a(byteBuffer);
                ByteBuffer a = bVar.mo25061a();
                this.f11722R[i] = a;
                if (a.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    public boolean mo25081d() {
        if (mo25082e()) {
            if (mo25079c() > this.f11740g.mo25090a()) {
                return true;
            }
            if (mo25083f() && this.f11742i.getPlayState() == 2 && this.f11742i.getPlaybackHeadPosition() == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo25082e() {
        return this.f11742i != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.f11746m;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo25083f() {
        /*
            r2 = this;
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.f13471a
            r1 = 23
            if (r0 >= r1) goto L_0x0010
            int r0 = r2.f11746m
            r1 = 5
            if (r0 == r1) goto L_0x000e
            r1 = 6
            if (r0 != r1) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.C4681c.mo25083f():boolean");
    }

    /* renamed from: g */
    public void mo25084g() {
        this.f11729Y = true;
        if (mo25082e()) {
            this.f11718N = System.nanoTime() / 1000;
            this.f11742i.play();
        }
    }

    /* renamed from: h */
    public void mo25085h() {
        if (mo25082e()) {
            this.f11710F = 0;
            this.f11711G = 0;
            this.f11713I = 0;
            this.f11714J = 0;
            this.f11715K = 0;
            C4874m mVar = this.f11751r;
            if (mVar != null) {
                this.f11752s = mVar;
                this.f11751r = null;
            } else if (!this.f11741h.isEmpty()) {
                this.f11752s = this.f11741h.getLast().f11775a;
            }
            this.f11741h.clear();
            this.f11753t = 0;
            this.f11754u = 0;
            this.f11723S = null;
            this.f11724T = null;
            int i = 0;
            while (true) {
                C4679b[] bVarArr = this.f11721Q;
                if (i >= bVarArr.length) {
                    break;
                }
                C4679b bVar = bVarArr[i];
                bVar.flush();
                this.f11722R[i] = bVar.mo25061a();
                i++;
            }
            this.f11728X = false;
            this.f11727W = -1;
            this.f11755v = null;
            this.f11756w = 0;
            this.f11716L = 0;
            this.f11719O = 0;
            mo25087j();
            if (this.f11742i.getPlayState() == 3) {
                this.f11742i.pause();
            }
            AudioTrack audioTrack = this.f11742i;
            this.f11742i = null;
            this.f11740g.mo25091a((AudioTrack) null, false);
            this.f11738e.close();
            new C4682a(audioTrack).start();
        }
    }

    /* renamed from: i */
    public final void mo25086i() {
        ArrayList arrayList = new ArrayList();
        for (C4679b bVar : this.f11735c) {
            if (bVar.mo25066d()) {
                arrayList.add(bVar);
            } else {
                bVar.flush();
            }
        }
        int size = arrayList.size();
        this.f11721Q = (C4679b[]) arrayList.toArray(new C4679b[size]);
        this.f11722R = new ByteBuffer[size];
        for (int i = 0; i < size; i++) {
            C4679b bVar2 = this.f11721Q[i];
            bVar2.flush();
            this.f11722R[i] = bVar2.mo25061a();
        }
    }

    /* renamed from: j */
    public final void mo25087j() {
        this.f11759z = 0;
        this.f11758y = 0;
        this.f11757x = 0;
        this.f11705A = 0;
        this.f11706B = false;
        this.f11707C = 0;
    }

    /* renamed from: k */
    public final void mo25088k() {
        if (mo25082e()) {
            if (C5049u.f13471a >= 21) {
                this.f11742i.setVolume(this.f11720P);
                return;
            }
            AudioTrack audioTrack = this.f11742i;
            float f = this.f11720P;
            audioTrack.setStereoVolume(f, f);
        }
    }

    /* renamed from: c */
    public final long mo25079c() {
        return this.f11748o ? this.f11714J : this.f11713I / ((long) this.f11712H);
    }

    /* renamed from: b */
    public final long mo25077b(long j) {
        return (j * 1000000) / ((long) this.f11743j);
    }

    /* renamed from: b */
    public final long mo25076b() {
        return this.f11748o ? this.f11711G : this.f11710F / ((long) this.f11709E);
    }

    /* renamed from: a */
    public boolean mo25075a(ByteBuffer byteBuffer, long j) throws C4686e, C4689h {
        int i;
        int i2;
        ByteBuffer byteBuffer2 = byteBuffer;
        long j2 = j;
        ByteBuffer byteBuffer3 = this.f11723S;
        C5023a.m15302a(byteBuffer3 == null || byteBuffer2 == byteBuffer3);
        if (!mo25082e()) {
            this.f11738e.block();
            if (this.f11732a0) {
                this.f11742i = new AudioTrack(new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(16).build(), new AudioFormat.Builder().setChannelMask(this.f11744k).setEncoding(this.f11746m).setSampleRate(this.f11743j).build(), this.f11749p, 1, this.f11730Z);
            } else if (this.f11730Z == 0) {
                this.f11742i = new AudioTrack(this.f11747n, this.f11743j, this.f11744k, this.f11746m, this.f11749p, 1);
            } else {
                this.f11742i = new AudioTrack(this.f11747n, this.f11743j, this.f11744k, this.f11746m, this.f11749p, 1, this.f11730Z);
            }
            int state = this.f11742i.getState();
            if (state == 1) {
                int audioSessionId = this.f11742i.getAudioSessionId();
                if (this.f11730Z != audioSessionId) {
                    this.f11730Z = audioSessionId;
                    MediaCodecAudioRenderer.C4677b bVar = (MediaCodecAudioRenderer.C4677b) this.f11737d;
                    MediaCodecAudioRenderer.this.f11690V.audioSessionId(audioSessionId);
                    MediaCodecAudioRenderer.this.getClass();
                }
                this.f11740g.mo25091a(this.f11742i, mo25083f());
                mo25088k();
                this.f11734b0 = false;
                if (this.f11729Y) {
                    mo25084g();
                }
            } else {
                try {
                    this.f11742i.release();
                } catch (Exception unused) {
                } finally {
                    this.f11742i = null;
                }
                throw new C4686e(state, this.f11743j, this.f11744k, this.f11749p);
            }
        }
        if (mo25083f()) {
            if (this.f11742i.getPlayState() == 2) {
                this.f11734b0 = false;
                return false;
            } else if (this.f11742i.getPlayState() == 1 && this.f11740g.mo25090a() != 0) {
                return false;
            }
        }
        boolean z = this.f11734b0;
        boolean d = mo25081d();
        this.f11734b0 = d;
        if (z && !d && this.f11742i.getPlayState() != 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f11736c0;
            MediaCodecAudioRenderer.C4677b bVar2 = (MediaCodecAudioRenderer.C4677b) this.f11737d;
            MediaCodecAudioRenderer.this.f11690V.audioTrackUnderrun(this.f11749p, C4695b.m14455b(this.f11750q), elapsedRealtime);
            MediaCodecAudioRenderer.this.getClass();
        }
        if (this.f11723S == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.f11748o && this.f11715K == 0) {
                int i3 = this.f11746m;
                int i4 = 6;
                if (i3 == 7 || i3 == 8) {
                    int position = byteBuffer.position();
                    i2 = ((((byteBuffer2.get(position + 5) & 252) >> 2) | ((byteBuffer2.get(position + 4) & 1) << 6)) + 1) * 32;
                } else if (i3 == 5) {
                    i2 = 1536;
                } else if (i3 == 6) {
                    if (((byteBuffer2.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
                        i4 = C4678a.f11698a[(byteBuffer2.get(byteBuffer.position() + 4) & 48) >> 4];
                    }
                    i2 = i4 * 256;
                } else {
                    throw new IllegalStateException("Unexpected audio encoding: " + i3);
                }
                this.f11715K = i2;
            }
            if (this.f11751r != null) {
                if (!mo25074a()) {
                    return false;
                }
                this.f11741h.add(new C4688g(this.f11751r, Math.max(0, j2), mo25077b(mo25079c())));
                this.f11751r = null;
                mo25086i();
            }
            if (this.f11716L == 0) {
                this.f11717M = Math.max(0, j2);
                this.f11716L = 1;
            } else {
                long b = this.f11717M + mo25077b(mo25076b());
                if (this.f11716L != 1 || Math.abs(b - j2) <= 200000) {
                    i = 2;
                } else {
                    Log.e("AudioTrack", "Discontinuity detected [expected " + b + ", got " + j2 + "]");
                    i = 2;
                    this.f11716L = 2;
                }
                if (this.f11716L == i) {
                    this.f11717M += j2 - b;
                    this.f11716L = 1;
                    MediaCodecAudioRenderer.C4677b bVar3 = (MediaCodecAudioRenderer.C4677b) this.f11737d;
                    MediaCodecAudioRenderer.this.getClass();
                    boolean unused2 = MediaCodecAudioRenderer.this.f11696b0 = true;
                }
            }
            if (this.f11748o) {
                this.f11711G += (long) this.f11715K;
            } else {
                this.f11710F += (long) byteBuffer.remaining();
            }
            this.f11723S = byteBuffer2;
        }
        if (this.f11748o) {
            mo25078b(this.f11723S, j2);
        } else {
            mo25080c(j2);
        }
        if (this.f11723S.hasRemaining()) {
            return false;
        }
        this.f11723S = null;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo25074a() throws com.fyber.inneractive.sdk.player.exoplayer2.audio.C4681c.C4689h {
        /*
            r9 = this;
            int r0 = r9.f11727W
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x0014
            boolean r0 = r9.f11748o
            if (r0 == 0) goto L_0x000f
            com.fyber.inneractive.sdk.player.exoplayer2.audio.b[] r0 = r9.f11721Q
            int r0 = r0.length
            goto L_0x0010
        L_0x000f:
            r0 = r3
        L_0x0010:
            r9.f11727W = r0
        L_0x0012:
            r0 = r2
            goto L_0x0015
        L_0x0014:
            r0 = r3
        L_0x0015:
            int r4 = r9.f11727W
            com.fyber.inneractive.sdk.player.exoplayer2.audio.b[] r5 = r9.f11721Q
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x0038
            r4 = r5[r4]
            if (r0 == 0) goto L_0x0028
            r4.mo25065c()
        L_0x0028:
            r9.mo25080c(r7)
            boolean r0 = r4.mo25064b()
            if (r0 != 0) goto L_0x0032
            return r3
        L_0x0032:
            int r0 = r9.f11727W
            int r0 = r0 + r2
            r9.f11727W = r0
            goto L_0x0012
        L_0x0038:
            java.nio.ByteBuffer r0 = r9.f11724T
            if (r0 == 0) goto L_0x0044
            r9.mo25078b(r0, r7)
            java.nio.ByteBuffer r0 = r9.f11724T
            if (r0 == 0) goto L_0x0044
            return r3
        L_0x0044:
            r9.f11727W = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.C4681c.mo25074a():boolean");
    }

    /* renamed from: a */
    public C4874m mo25072a(C4874m mVar) {
        if (this.f11748o) {
            C4874m mVar2 = C4874m.f12978d;
            this.f11752s = mVar2;
            return mVar2;
        }
        C4694h hVar = this.f11733b;
        float f = mVar.f12979a;
        hVar.getClass();
        int i = C5049u.f13471a;
        float max = Math.max(0.1f, Math.min(f, 8.0f));
        hVar.f11822e = max;
        C4694h hVar2 = this.f11733b;
        float f2 = mVar.f12980b;
        hVar2.getClass();
        hVar2.f11823f = Math.max(0.1f, Math.min(f2, 8.0f));
        C4874m mVar3 = new C4874m(max, f2);
        C4874m mVar4 = this.f11751r;
        if (mVar4 == null) {
            if (!this.f11741h.isEmpty()) {
                mVar4 = this.f11741h.getLast().f11775a;
            } else {
                mVar4 = this.f11752s;
            }
        }
        if (!mVar3.equals(mVar4)) {
            if (mo25082e()) {
                this.f11751r = mVar3;
            } else {
                this.f11752s = mVar3;
            }
        }
        return this.f11752s;
    }

    /* renamed from: a */
    public final long mo25071a(long j) {
        return (j * ((long) this.f11743j)) / 1000000;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m14392a(java.lang.String r5) {
        /*
            r5.getClass()
            int r0 = r5.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            switch(r0) {
                case -1095064472: goto L_0x0030;
                case 187078296: goto L_0x0025;
                case 1504578661: goto L_0x001a;
                case 1505942594: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x003b
        L_0x000f:
            java.lang.String r0 = "audio/vnd.dts.hd"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0018
            goto L_0x003b
        L_0x0018:
            r5 = r1
            goto L_0x003c
        L_0x001a:
            java.lang.String r0 = "audio/eac3"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0023
            goto L_0x003b
        L_0x0023:
            r5 = r2
            goto L_0x003c
        L_0x0025:
            java.lang.String r0 = "audio/ac3"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x002e
            goto L_0x003b
        L_0x002e:
            r5 = r3
            goto L_0x003c
        L_0x0030:
            java.lang.String r0 = "audio/vnd.dts"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r5 = r4
            goto L_0x003c
        L_0x003b:
            r5 = -1
        L_0x003c:
            if (r5 == 0) goto L_0x004c
            if (r5 == r3) goto L_0x004a
            if (r5 == r2) goto L_0x0048
            if (r5 == r1) goto L_0x0045
            return r4
        L_0x0045:
            r5 = 8
            return r5
        L_0x0048:
            r5 = 6
            return r5
        L_0x004a:
            r5 = 5
            return r5
        L_0x004c:
            r5 = 7
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.C4681c.m14392a(java.lang.String):int");
    }
}
