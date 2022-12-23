package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import android.media.MediaCodec;
import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.C4871j;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.C4698a;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.C4701b;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4969a;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4971b;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C5001k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.d */
public final class C4717d implements C4804n {

    /* renamed from: a */
    public final C4971b f11876a;

    /* renamed from: b */
    public final int f11877b;

    /* renamed from: c */
    public final C4720c f11878c = new C4720c();

    /* renamed from: d */
    public final LinkedBlockingDeque<C4969a> f11879d = new LinkedBlockingDeque<>();

    /* renamed from: e */
    public final C4719b f11880e = new C4719b();

    /* renamed from: f */
    public final C5036k f11881f = new C5036k(32);

    /* renamed from: g */
    public final AtomicInteger f11882g = new AtomicInteger();

    /* renamed from: h */
    public long f11883h;

    /* renamed from: i */
    public C4869i f11884i;

    /* renamed from: j */
    public long f11885j;

    /* renamed from: k */
    public C4969a f11886k;

    /* renamed from: l */
    public int f11887l;

    /* renamed from: m */
    public boolean f11888m;

    /* renamed from: n */
    public C4721d f11889n;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.d$b */
    public static final class C4719b {

        /* renamed from: a */
        public int f11890a;

        /* renamed from: b */
        public long f11891b;

        /* renamed from: c */
        public long f11892c;

        /* renamed from: d */
        public byte[] f11893d;

        public C4719b() {
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.d$d */
    public interface C4721d {
        /* renamed from: a */
        void mo25162a(C4869i iVar);
    }

    public C4717d(C4971b bVar) {
        this.f11876a = bVar;
        int a = ((C5001k) bVar).mo25555a();
        this.f11877b = a;
        this.f11887l = a;
    }

    /* renamed from: a */
    public void mo25151a(boolean z) {
        int andSet = this.f11882g.getAndSet(z ? 0 : 2);
        mo25145a();
        C4720c cVar = this.f11878c;
        cVar.f11906m = Long.MIN_VALUE;
        cVar.f11907n = Long.MIN_VALUE;
        if (andSet == 2) {
            this.f11884i = null;
        }
    }

    /* renamed from: b */
    public void mo25153b() {
        if (this.f11882g.getAndSet(2) == 0) {
            mo25145a();
        }
    }

    /* renamed from: c */
    public final void mo25154c() {
        if (!this.f11882g.compareAndSet(1, 0)) {
            mo25145a();
        }
    }

    /* renamed from: d */
    public long mo25155d() {
        long max;
        C4720c cVar = this.f11878c;
        synchronized (cVar) {
            max = Math.max(cVar.f11906m, cVar.f11907n);
        }
        return max;
    }

    /* renamed from: e */
    public C4869i mo25156e() {
        C4869i iVar;
        C4720c cVar = this.f11878c;
        synchronized (cVar) {
            iVar = cVar.f11909p ? null : cVar.f11910q;
        }
        return iVar;
    }

    /* renamed from: f */
    public boolean mo25157f() {
        boolean z;
        C4720c cVar = this.f11878c;
        synchronized (cVar) {
            z = cVar.f11902i == 0;
        }
        return z;
    }

    /* renamed from: g */
    public void mo25158g() {
        long j;
        C4720c cVar = this.f11878c;
        synchronized (cVar) {
            int i = cVar.f11902i;
            if (i == 0) {
                j = -1;
            } else {
                int i2 = cVar.f11904k + i;
                int i3 = cVar.f11894a;
                int i4 = (i2 - 1) % i3;
                cVar.f11904k = i2 % i3;
                cVar.f11903j += i;
                cVar.f11902i = 0;
                j = cVar.f11896c[i4] + ((long) cVar.f11897d[i4]);
            }
        }
        if (j != -1) {
            mo25146a(j);
        }
    }

    /* renamed from: h */
    public final boolean mo25159h() {
        return this.f11882g.compareAndSet(0, 1);
    }

    /* renamed from: a */
    public boolean mo25152a(long j, boolean z) {
        long j2;
        C4720c cVar = this.f11878c;
        synchronized (cVar) {
            if (cVar.f11902i != 0) {
                long[] jArr = cVar.f11899f;
                int i = cVar.f11904k;
                if (j >= jArr[i]) {
                    if (j <= cVar.f11907n || z) {
                        int i2 = -1;
                        int i3 = 0;
                        while (true) {
                            if (i == cVar.f11905l) {
                                break;
                            } else if (cVar.f11899f[i] > j) {
                                break;
                            } else {
                                if ((cVar.f11898e[i] & 1) != 0) {
                                    i2 = i3;
                                }
                                i = (i + 1) % cVar.f11894a;
                                i3++;
                            }
                        }
                        if (i2 != -1) {
                            int i4 = (cVar.f11904k + i2) % cVar.f11894a;
                            cVar.f11904k = i4;
                            cVar.f11903j += i2;
                            cVar.f11902i -= i2;
                            j2 = cVar.f11896c[i4];
                        }
                    }
                }
            }
            j2 = -1;
        }
        if (j2 == -1) {
            return false;
        }
        mo25146a(j2);
        return true;
    }

    /* renamed from: a */
    public int mo25144a(C4871j jVar, C4701b bVar, boolean z, boolean z2, long j) {
        char c;
        int i;
        long j2;
        C4871j jVar2 = jVar;
        C4701b bVar2 = bVar;
        C4720c cVar = this.f11878c;
        C4869i iVar = this.f11884i;
        C4719b bVar3 = this.f11880e;
        synchronized (cVar) {
            if (cVar.f11902i != 0) {
                if (!z) {
                    C4869i[] iVarArr = cVar.f11901h;
                    int i2 = cVar.f11904k;
                    if (iVarArr[i2] == iVar) {
                        if (!(bVar2.f11851c == null && bVar2.f11853e == 0)) {
                            long j3 = cVar.f11899f[i2];
                            bVar2.f11852d = j3;
                            bVar2.f11849a = cVar.f11898e[i2];
                            bVar3.f11890a = cVar.f11897d[i2];
                            bVar3.f11891b = cVar.f11896c[i2];
                            bVar3.f11893d = cVar.f11900g[i2];
                            cVar.f11906m = Math.max(cVar.f11906m, j3);
                            int i3 = cVar.f11902i - 1;
                            cVar.f11902i = i3;
                            int i4 = cVar.f11904k + 1;
                            cVar.f11904k = i4;
                            cVar.f11903j++;
                            if (i4 == cVar.f11894a) {
                                cVar.f11904k = 0;
                            }
                            if (i3 > 0) {
                                j2 = cVar.f11896c[cVar.f11904k];
                            } else {
                                j2 = bVar3.f11891b + ((long) bVar3.f11890a);
                            }
                            bVar3.f11892c = j2;
                            c = 65532;
                        }
                    }
                }
                jVar2.f12977a = cVar.f11901h[cVar.f11904k];
                c = 65531;
            } else if (z2) {
                bVar2.f11849a = 4;
                c = 65532;
            } else {
                C4869i iVar2 = cVar.f11910q;
                if (iVar2 != null && (z || iVar2 != iVar)) {
                    jVar2.f12977a = iVar2;
                    c = 65531;
                }
            }
            c = 65533;
        }
        if (c == 65531) {
            this.f11884i = jVar2.f12977a;
            return -5;
        } else if (c != 65532) {
            if (c == 65533) {
                return -3;
            }
            throw new IllegalStateException();
        } else if (bVar2.mo25109b(4)) {
            return -4;
        } else {
            if (bVar2.f11852d < j) {
                bVar2.f11849a |= Integer.MIN_VALUE;
            }
            if (bVar2.mo25109b(1073741824)) {
                C4719b bVar4 = this.f11880e;
                long j4 = bVar4.f11891b;
                this.f11881f.mo25596c(1);
                mo25148a(j4, this.f11881f.f13444a, 1);
                long j5 = j4 + 1;
                byte b = this.f11881f.f13444a[0];
                boolean z3 = (b & 128) != 0;
                byte b2 = b & Byte.MAX_VALUE;
                C4698a aVar = bVar2.f11850b;
                if (aVar.f11839a == null) {
                    aVar.f11839a = new byte[16];
                }
                mo25148a(j5, aVar.f11839a, (int) b2);
                long j6 = j5 + ((long) b2);
                if (z3) {
                    this.f11881f.mo25596c(2);
                    mo25148a(j6, this.f11881f.f13444a, 2);
                    j6 += 2;
                    i = this.f11881f.mo25613q();
                } else {
                    i = 1;
                }
                C4698a aVar2 = bVar2.f11850b;
                int[] iArr = aVar2.f11842d;
                if (iArr == null || iArr.length < i) {
                    iArr = new int[i];
                }
                int[] iArr2 = aVar2.f11843e;
                if (iArr2 == null || iArr2.length < i) {
                    iArr2 = new int[i];
                }
                if (z3) {
                    int i5 = i * 6;
                    this.f11881f.mo25596c(i5);
                    mo25148a(j6, this.f11881f.f13444a, i5);
                    j6 += (long) i5;
                    this.f11881f.mo25600e(0);
                    for (int i6 = 0; i6 < i; i6++) {
                        iArr[i6] = this.f11881f.mo25613q();
                        iArr2[i6] = this.f11881f.mo25611o();
                    }
                } else {
                    iArr[0] = 0;
                    iArr2[0] = bVar4.f11890a - ((int) (j6 - bVar4.f11891b));
                }
                C4698a aVar3 = bVar2.f11850b;
                byte[] bArr = bVar4.f11893d;
                byte[] bArr2 = aVar3.f11839a;
                aVar3.f11844f = i;
                aVar3.f11842d = iArr;
                aVar3.f11843e = iArr2;
                aVar3.f11840b = bArr;
                aVar3.f11839a = bArr2;
                aVar3.f11841c = 1;
                int i7 = C5049u.f13471a;
                if (i7 >= 16) {
                    MediaCodec.CryptoInfo cryptoInfo = aVar3.f11845g;
                    cryptoInfo.numSubSamples = i;
                    cryptoInfo.numBytesOfClearData = iArr;
                    cryptoInfo.numBytesOfEncryptedData = iArr2;
                    cryptoInfo.key = bArr;
                    cryptoInfo.iv = bArr2;
                    cryptoInfo.mode = 1;
                    if (i7 >= 24) {
                        C4698a.C4700b bVar5 = aVar3.f11846h;
                        bVar5.f11848b.set(0, 0);
                        bVar5.f11847a.setPattern(bVar5.f11848b);
                    }
                }
                long j7 = bVar4.f11891b;
                int i8 = (int) (j6 - j7);
                bVar4.f11891b = j7 + ((long) i8);
                bVar4.f11890a -= i8;
            }
            int i9 = this.f11880e.f11890a;
            ByteBuffer byteBuffer = bVar2.f11851c;
            if (byteBuffer == null) {
                bVar2.f11851c = bVar2.mo25107a(i9);
            } else {
                int capacity = byteBuffer.capacity();
                int position = bVar2.f11851c.position();
                int i10 = i9 + position;
                if (capacity < i10) {
                    ByteBuffer a = bVar2.mo25107a(i10);
                    if (position > 0) {
                        bVar2.f11851c.position(0);
                        bVar2.f11851c.limit(position);
                        a.put(bVar2.f11851c);
                    }
                    bVar2.f11851c = a;
                }
            }
            C4719b bVar6 = this.f11880e;
            long j8 = bVar6.f11891b;
            ByteBuffer byteBuffer2 = bVar2.f11851c;
            int i11 = bVar6.f11890a;
            while (i11 > 0) {
                mo25146a(j8);
                int i12 = (int) (j8 - this.f11883h);
                int min = Math.min(i11, this.f11877b - i12);
                C4969a peek = this.f11879d.peek();
                byteBuffer2.put(peek.f13239a, peek.f13240b + i12, min);
                j8 += (long) min;
                i11 -= min;
            }
            mo25146a(this.f11880e.f11892c);
            return -4;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.d$c */
    public static final class C4720c {

        /* renamed from: a */
        public int f11894a = 1000;

        /* renamed from: b */
        public int[] f11895b = new int[1000];

        /* renamed from: c */
        public long[] f11896c = new long[1000];

        /* renamed from: d */
        public int[] f11897d = new int[1000];

        /* renamed from: e */
        public int[] f11898e = new int[1000];

        /* renamed from: f */
        public long[] f11899f = new long[1000];

        /* renamed from: g */
        public byte[][] f11900g = new byte[1000][];

        /* renamed from: h */
        public C4869i[] f11901h = new C4869i[1000];

        /* renamed from: i */
        public int f11902i;

        /* renamed from: j */
        public int f11903j;

        /* renamed from: k */
        public int f11904k;

        /* renamed from: l */
        public int f11905l;

        /* renamed from: m */
        public long f11906m = Long.MIN_VALUE;

        /* renamed from: n */
        public long f11907n = Long.MIN_VALUE;

        /* renamed from: o */
        public boolean f11908o = true;

        /* renamed from: p */
        public boolean f11909p = true;

        /* renamed from: q */
        public C4869i f11910q;

        /* renamed from: r */
        public int f11911r;

        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
            	at java.base/java.util.Objects.checkIndex(Objects.java:372)
            	at java.base/java.util.ArrayList.get(ArrayList.java:458)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        /* renamed from: a */
        public synchronized void mo25160a(long r6, int r8, long r9, int r11, byte[] r12) {
            /*
                r5 = this;
                monitor-enter(r5)
                boolean r0 = r5.f11908o     // Catch:{ all -> 0x00d6 }
                r1 = 0
                if (r0 == 0) goto L_0x000e
                r0 = r8 & 1
                if (r0 != 0) goto L_0x000c
                monitor-exit(r5)
                return
            L_0x000c:
                r5.f11908o = r1     // Catch:{ all -> 0x00d6 }
            L_0x000e:
                boolean r0 = r5.f11909p     // Catch:{ all -> 0x00d6 }
                r0 = r0 ^ 1
                com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a.m15304b(r0)     // Catch:{ all -> 0x00d6 }
                monitor-enter(r5)     // Catch:{ all -> 0x00d6 }
                long r2 = r5.f11907n     // Catch:{ all -> 0x00d3 }
                long r2 = java.lang.Math.max(r2, r6)     // Catch:{ all -> 0x00d3 }
                r5.f11907n = r2     // Catch:{ all -> 0x00d3 }
                monitor-exit(r5)     // Catch:{ all -> 0x00d6 }
                long[] r0 = r5.f11899f     // Catch:{ all -> 0x00d6 }
                int r2 = r5.f11905l     // Catch:{ all -> 0x00d6 }
                r0[r2] = r6     // Catch:{ all -> 0x00d6 }
                long[] r6 = r5.f11896c     // Catch:{ all -> 0x00d6 }
                r6[r2] = r9     // Catch:{ all -> 0x00d6 }
                int[] r7 = r5.f11897d     // Catch:{ all -> 0x00d6 }
                r7[r2] = r11     // Catch:{ all -> 0x00d6 }
                int[] r7 = r5.f11898e     // Catch:{ all -> 0x00d6 }
                r7[r2] = r8     // Catch:{ all -> 0x00d6 }
                byte[][] r7 = r5.f11900g     // Catch:{ all -> 0x00d6 }
                r7[r2] = r12     // Catch:{ all -> 0x00d6 }
                com.fyber.inneractive.sdk.player.exoplayer2.i[] r7 = r5.f11901h     // Catch:{ all -> 0x00d6 }
                com.fyber.inneractive.sdk.player.exoplayer2.i r8 = r5.f11910q     // Catch:{ all -> 0x00d6 }
                r7[r2] = r8     // Catch:{ all -> 0x00d6 }
                int[] r7 = r5.f11895b     // Catch:{ all -> 0x00d6 }
                int r8 = r5.f11911r     // Catch:{ all -> 0x00d6 }
                r7[r2] = r8     // Catch:{ all -> 0x00d6 }
                int r7 = r5.f11902i     // Catch:{ all -> 0x00d6 }
                int r7 = r7 + 1
                r5.f11902i = r7     // Catch:{ all -> 0x00d6 }
                int r8 = r5.f11894a     // Catch:{ all -> 0x00d6 }
                if (r7 != r8) goto L_0x00c9
                int r7 = r8 + 1000
                int[] r9 = new int[r7]     // Catch:{ all -> 0x00d6 }
                long[] r10 = new long[r7]     // Catch:{ all -> 0x00d6 }
                long[] r11 = new long[r7]     // Catch:{ all -> 0x00d6 }
                int[] r12 = new int[r7]     // Catch:{ all -> 0x00d6 }
                int[] r0 = new int[r7]     // Catch:{ all -> 0x00d6 }
                byte[][] r2 = new byte[r7][]     // Catch:{ all -> 0x00d6 }
                com.fyber.inneractive.sdk.player.exoplayer2.i[] r3 = new com.fyber.inneractive.sdk.player.exoplayer2.C4869i[r7]     // Catch:{ all -> 0x00d6 }
                int r4 = r5.f11904k     // Catch:{ all -> 0x00d6 }
                int r8 = r8 - r4
                java.lang.System.arraycopy(r6, r4, r10, r1, r8)     // Catch:{ all -> 0x00d6 }
                long[] r6 = r5.f11899f     // Catch:{ all -> 0x00d6 }
                int r4 = r5.f11904k     // Catch:{ all -> 0x00d6 }
                java.lang.System.arraycopy(r6, r4, r11, r1, r8)     // Catch:{ all -> 0x00d6 }
                int[] r6 = r5.f11898e     // Catch:{ all -> 0x00d6 }
                int r4 = r5.f11904k     // Catch:{ all -> 0x00d6 }
                java.lang.System.arraycopy(r6, r4, r12, r1, r8)     // Catch:{ all -> 0x00d6 }
                int[] r6 = r5.f11897d     // Catch:{ all -> 0x00d6 }
                int r4 = r5.f11904k     // Catch:{ all -> 0x00d6 }
                java.lang.System.arraycopy(r6, r4, r0, r1, r8)     // Catch:{ all -> 0x00d6 }
                byte[][] r6 = r5.f11900g     // Catch:{ all -> 0x00d6 }
                int r4 = r5.f11904k     // Catch:{ all -> 0x00d6 }
                java.lang.System.arraycopy(r6, r4, r2, r1, r8)     // Catch:{ all -> 0x00d6 }
                com.fyber.inneractive.sdk.player.exoplayer2.i[] r6 = r5.f11901h     // Catch:{ all -> 0x00d6 }
                int r4 = r5.f11904k     // Catch:{ all -> 0x00d6 }
                java.lang.System.arraycopy(r6, r4, r3, r1, r8)     // Catch:{ all -> 0x00d6 }
                int[] r6 = r5.f11895b     // Catch:{ all -> 0x00d6 }
                int r4 = r5.f11904k     // Catch:{ all -> 0x00d6 }
                java.lang.System.arraycopy(r6, r4, r9, r1, r8)     // Catch:{ all -> 0x00d6 }
                int r6 = r5.f11904k     // Catch:{ all -> 0x00d6 }
                long[] r4 = r5.f11896c     // Catch:{ all -> 0x00d6 }
                java.lang.System.arraycopy(r4, r1, r10, r8, r6)     // Catch:{ all -> 0x00d6 }
                long[] r4 = r5.f11899f     // Catch:{ all -> 0x00d6 }
                java.lang.System.arraycopy(r4, r1, r11, r8, r6)     // Catch:{ all -> 0x00d6 }
                int[] r4 = r5.f11898e     // Catch:{ all -> 0x00d6 }
                java.lang.System.arraycopy(r4, r1, r12, r8, r6)     // Catch:{ all -> 0x00d6 }
                int[] r4 = r5.f11897d     // Catch:{ all -> 0x00d6 }
                java.lang.System.arraycopy(r4, r1, r0, r8, r6)     // Catch:{ all -> 0x00d6 }
                byte[][] r4 = r5.f11900g     // Catch:{ all -> 0x00d6 }
                java.lang.System.arraycopy(r4, r1, r2, r8, r6)     // Catch:{ all -> 0x00d6 }
                com.fyber.inneractive.sdk.player.exoplayer2.i[] r4 = r5.f11901h     // Catch:{ all -> 0x00d6 }
                java.lang.System.arraycopy(r4, r1, r3, r8, r6)     // Catch:{ all -> 0x00d6 }
                int[] r4 = r5.f11895b     // Catch:{ all -> 0x00d6 }
                java.lang.System.arraycopy(r4, r1, r9, r8, r6)     // Catch:{ all -> 0x00d6 }
                r5.f11896c = r10     // Catch:{ all -> 0x00d6 }
                r5.f11899f = r11     // Catch:{ all -> 0x00d6 }
                r5.f11898e = r12     // Catch:{ all -> 0x00d6 }
                r5.f11897d = r0     // Catch:{ all -> 0x00d6 }
                r5.f11900g = r2     // Catch:{ all -> 0x00d6 }
                r5.f11901h = r3     // Catch:{ all -> 0x00d6 }
                r5.f11895b = r9     // Catch:{ all -> 0x00d6 }
                r5.f11904k = r1     // Catch:{ all -> 0x00d6 }
                int r6 = r5.f11894a     // Catch:{ all -> 0x00d6 }
                r5.f11905l = r6     // Catch:{ all -> 0x00d6 }
                r5.f11902i = r6     // Catch:{ all -> 0x00d6 }
                r5.f11894a = r7     // Catch:{ all -> 0x00d6 }
                goto L_0x00d1
            L_0x00c9:
                int r2 = r2 + 1
                r5.f11905l = r2     // Catch:{ all -> 0x00d6 }
                if (r2 != r8) goto L_0x00d1
                r5.f11905l = r1     // Catch:{ all -> 0x00d6 }
            L_0x00d1:
                monitor-exit(r5)
                return
            L_0x00d3:
                r6 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x00d6 }
                throw r6     // Catch:{ all -> 0x00d6 }
            L_0x00d6:
                r6 = move-exception
                monitor-exit(r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4717d.C4720c.mo25160a(long, int, long, int, byte[]):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0080, code lost:
            return true;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized boolean mo25161a(long r7) {
            /*
                r6 = this;
                monitor-enter(r6)
                long r0 = r6.f11906m     // Catch:{ all -> 0x0081 }
                int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                r1 = 0
                if (r0 < 0) goto L_0x000a
                monitor-exit(r6)
                return r1
            L_0x000a:
                int r0 = r6.f11902i     // Catch:{ all -> 0x0081 }
            L_0x000c:
                r2 = 1
                if (r0 <= 0) goto L_0x0021
                long[] r3 = r6.f11899f     // Catch:{ all -> 0x0081 }
                int r4 = r6.f11904k     // Catch:{ all -> 0x0081 }
                int r4 = r4 + r0
                int r4 = r4 - r2
                int r5 = r6.f11894a     // Catch:{ all -> 0x0081 }
                int r4 = r4 % r5
                r4 = r3[r4]     // Catch:{ all -> 0x0081 }
                int r3 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r3 < 0) goto L_0x0021
                int r0 = r0 + -1
                goto L_0x000c
            L_0x0021:
                int r7 = r6.f11903j     // Catch:{ all -> 0x0081 }
                int r0 = r0 + r7
                int r8 = r6.f11902i     // Catch:{ all -> 0x0081 }
                int r7 = r7 + r8
                int r7 = r7 - r0
                if (r7 < 0) goto L_0x002d
                if (r7 > r8) goto L_0x002d
                r1 = r2
            L_0x002d:
                com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a.m15302a((boolean) r1)     // Catch:{ all -> 0x0081 }
                if (r7 != 0) goto L_0x0047
                int r7 = r6.f11903j     // Catch:{ all -> 0x0081 }
                if (r7 != 0) goto L_0x0037
                goto L_0x007f
            L_0x0037:
                int r7 = r6.f11905l     // Catch:{ all -> 0x0081 }
                if (r7 != 0) goto L_0x003d
                int r7 = r6.f11894a     // Catch:{ all -> 0x0081 }
            L_0x003d:
                int r7 = r7 - r2
                long[] r8 = r6.f11896c     // Catch:{ all -> 0x0081 }
                r0 = r8[r7]     // Catch:{ all -> 0x0081 }
                int[] r8 = r6.f11897d     // Catch:{ all -> 0x0081 }
                r7 = r8[r7]     // Catch:{ all -> 0x0081 }
                goto L_0x007f
            L_0x0047:
                int r8 = r6.f11902i     // Catch:{ all -> 0x0081 }
                int r8 = r8 - r7
                r6.f11902i = r8     // Catch:{ all -> 0x0081 }
                int r0 = r6.f11905l     // Catch:{ all -> 0x0081 }
                int r1 = r6.f11894a     // Catch:{ all -> 0x0081 }
                int r0 = r0 + r1
                int r0 = r0 - r7
                int r0 = r0 % r1
                r6.f11905l = r0     // Catch:{ all -> 0x0081 }
                r0 = -9223372036854775808
                r6.f11907n = r0     // Catch:{ all -> 0x0081 }
                int r8 = r8 - r2
            L_0x005a:
                if (r8 < 0) goto L_0x0079
                int r7 = r6.f11904k     // Catch:{ all -> 0x0081 }
                int r7 = r7 + r8
                int r0 = r6.f11894a     // Catch:{ all -> 0x0081 }
                int r7 = r7 % r0
                long r0 = r6.f11907n     // Catch:{ all -> 0x0081 }
                long[] r3 = r6.f11899f     // Catch:{ all -> 0x0081 }
                r4 = r3[r7]     // Catch:{ all -> 0x0081 }
                long r0 = java.lang.Math.max(r0, r4)     // Catch:{ all -> 0x0081 }
                r6.f11907n = r0     // Catch:{ all -> 0x0081 }
                int[] r0 = r6.f11898e     // Catch:{ all -> 0x0081 }
                r7 = r0[r7]     // Catch:{ all -> 0x0081 }
                r7 = r7 & r2
                if (r7 == 0) goto L_0x0076
                goto L_0x0079
            L_0x0076:
                int r8 = r8 + -1
                goto L_0x005a
            L_0x0079:
                long[] r7 = r6.f11896c     // Catch:{ all -> 0x0081 }
                int r8 = r6.f11905l     // Catch:{ all -> 0x0081 }
                r0 = r7[r8]     // Catch:{ all -> 0x0081 }
            L_0x007f:
                monitor-exit(r6)
                return r2
            L_0x0081:
                r7 = move-exception
                monitor-exit(r6)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4717d.C4720c.mo25161a(long):boolean");
        }
    }

    /* renamed from: a */
    public final void mo25148a(long j, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            mo25146a(j);
            int i3 = (int) (j - this.f11883h);
            int min = Math.min(i - i2, this.f11877b - i3);
            C4969a peek = this.f11879d.peek();
            System.arraycopy(peek.f13239a, peek.f13240b + i3, bArr, i2, min);
            j += (long) min;
            i2 += min;
        }
    }

    /* renamed from: a */
    public final void mo25146a(long j) {
        int i = ((int) (j - this.f11883h)) / this.f11877b;
        for (int i2 = 0; i2 < i; i2++) {
            C4971b bVar = this.f11876a;
            C4969a remove = this.f11879d.remove();
            C5001k kVar = (C5001k) bVar;
            synchronized (kVar) {
                C4969a[] aVarArr = kVar.f13337d;
                aVarArr[0] = remove;
                kVar.mo25556a(aVarArr);
            }
            this.f11883h += (long) this.f11877b;
        }
    }

    /* renamed from: a */
    public void mo25149a(C4869i iVar) {
        boolean z;
        if (iVar == null) {
            iVar = null;
        }
        C4720c cVar = this.f11878c;
        synchronized (cVar) {
            z = true;
            if (iVar == null) {
                cVar.f11909p = true;
            } else {
                cVar.f11909p = false;
                if (!C5049u.m15393a((Object) iVar, (Object) cVar.f11910q)) {
                    cVar.f11910q = iVar;
                }
            }
            z = false;
        }
        C4721d dVar = this.f11889n;
        if (dVar != null && z) {
            dVar.mo25162a(iVar);
        }
    }

    /* renamed from: a */
    public int mo25143a(C4730g gVar, int i, boolean z) throws IOException, InterruptedException {
        if (!mo25159h()) {
            int b = ((C4715b) gVar).mo25137b(i);
            if (b != -1) {
                return b;
            }
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        try {
            int a = mo25142a(i);
            C4969a aVar = this.f11886k;
            int a2 = ((C4715b) gVar).mo25132a(aVar.f13239a, aVar.f13240b + this.f11887l, a);
            if (a2 != -1) {
                this.f11887l += a2;
                this.f11885j += (long) a2;
                mo25154c();
                return a2;
            } else if (z) {
                return -1;
            } else {
                throw new EOFException();
            }
        } finally {
            mo25154c();
        }
    }

    /* renamed from: a */
    public void mo25150a(C5036k kVar, int i) {
        if (!mo25159h()) {
            kVar.mo25600e(kVar.f13445b + i);
            return;
        }
        while (i > 0) {
            int a = mo25142a(i);
            C4969a aVar = this.f11886k;
            kVar.mo25592a(aVar.f13239a, aVar.f13240b + this.f11887l, a);
            this.f11887l += a;
            this.f11885j += (long) a;
            i -= a;
        }
        mo25154c();
    }

    /* renamed from: a */
    public void mo25147a(long j, int i, int i2, int i3, byte[] bArr) {
        long j2 = j;
        if (!mo25159h()) {
            C4720c cVar = this.f11878c;
            synchronized (cVar) {
                cVar.f11907n = Math.max(cVar.f11907n, j);
            }
            return;
        }
        try {
            if (this.f11888m) {
                if ((i & 1) != 0) {
                    if (this.f11878c.mo25161a(j)) {
                        this.f11888m = false;
                    }
                }
                return;
            }
            long j3 = j2 + 0;
            this.f11878c.mo25160a(j3, i, (this.f11885j - ((long) i2)) - ((long) i3), i2, bArr);
            mo25154c();
        } finally {
            mo25154c();
        }
    }

    /* renamed from: a */
    public final void mo25145a() {
        C4720c cVar = this.f11878c;
        cVar.f11903j = 0;
        cVar.f11904k = 0;
        cVar.f11905l = 0;
        cVar.f11902i = 0;
        cVar.f11908o = true;
        C4971b bVar = this.f11876a;
        LinkedBlockingDeque<C4969a> linkedBlockingDeque = this.f11879d;
        ((C5001k) bVar).mo25556a((C4969a[]) linkedBlockingDeque.toArray(new C4969a[linkedBlockingDeque.size()]));
        this.f11879d.clear();
        ((C5001k) this.f11876a).mo25557b();
        this.f11883h = 0;
        this.f11885j = 0;
        this.f11886k = null;
        this.f11887l = this.f11877b;
    }

    /* renamed from: a */
    public final int mo25142a(int i) {
        C4969a aVar;
        if (this.f11887l == this.f11877b) {
            this.f11887l = 0;
            C5001k kVar = (C5001k) this.f11876a;
            synchronized (kVar) {
                kVar.f13339f++;
                int i2 = kVar.f13340g;
                if (i2 > 0) {
                    C4969a[] aVarArr = kVar.f13341h;
                    int i3 = i2 - 1;
                    kVar.f13340g = i3;
                    aVar = aVarArr[i3];
                    aVarArr[i3] = null;
                } else {
                    aVar = new C4969a(new byte[kVar.f13335b], 0);
                }
            }
            this.f11886k = aVar;
            this.f11879d.add(aVar);
        }
        return Math.min(i, this.f11877b - this.f11887l);
    }
}
