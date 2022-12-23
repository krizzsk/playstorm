package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.C4669a;
import com.fyber.inneractive.sdk.player.exoplayer2.C4697d;
import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.C4871j;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.C4701b;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4706b;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4708c;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4709d;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4880d;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b */
public abstract class C4876b extends C4669a {

    /* renamed from: U */
    public static final byte[] f12987U;

    /* renamed from: A */
    public boolean f12988A;

    /* renamed from: B */
    public boolean f12989B;

    /* renamed from: C */
    public boolean f12990C;

    /* renamed from: D */
    public boolean f12991D;

    /* renamed from: E */
    public ByteBuffer[] f12992E;

    /* renamed from: F */
    public ByteBuffer[] f12993F;

    /* renamed from: G */
    public long f12994G;

    /* renamed from: H */
    public int f12995H;

    /* renamed from: I */
    public int f12996I;

    /* renamed from: J */
    public boolean f12997J;

    /* renamed from: K */
    public boolean f12998K;

    /* renamed from: L */
    public int f12999L;

    /* renamed from: M */
    public int f13000M;

    /* renamed from: N */
    public boolean f13001N;

    /* renamed from: O */
    public boolean f13002O;

    /* renamed from: P */
    public boolean f13003P;

    /* renamed from: Q */
    public boolean f13004Q;

    /* renamed from: R */
    public boolean f13005R;

    /* renamed from: S */
    public boolean f13006S;

    /* renamed from: T */
    public DecoderCounters f13007T;

    /* renamed from: i */
    public final C4878c f13008i;

    /* renamed from: j */
    public final C4708c<C4709d> f13009j;

    /* renamed from: k */
    public final boolean f13010k;

    /* renamed from: l */
    public final C4701b f13011l;

    /* renamed from: m */
    public final C4701b f13012m;

    /* renamed from: n */
    public final C4871j f13013n;

    /* renamed from: o */
    public final List<Long> f13014o;

    /* renamed from: p */
    public final MediaCodec.BufferInfo f13015p;

    /* renamed from: q */
    public C4869i f13016q;

    /* renamed from: r */
    public MediaCodec f13017r;

    /* renamed from: s */
    public C4706b<C4709d> f13018s;

    /* renamed from: t */
    public C4706b<C4709d> f13019t;

    /* renamed from: u */
    public boolean f13020u;

    /* renamed from: v */
    public boolean f13021v;

    /* renamed from: w */
    public boolean f13022w;

    /* renamed from: x */
    public boolean f13023x;

    /* renamed from: y */
    public boolean f13024y;

    /* renamed from: z */
    public boolean f13025z;

    static {
        int i = C5049u.f13471a;
        byte[] bArr = new byte[38];
        for (int i2 = 0; i2 < 38; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) ((Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i3), 16) << 4) + Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i3 + 1), 16));
        }
        f12987U = bArr;
    }

    public C4876b(int i, C4878c cVar, C4708c<C4709d> cVar2, boolean z) {
        super(i);
        C5023a.m15304b(C5049u.f13471a >= 16);
        this.f13008i = (C4878c) C5023a.m15300a(cVar);
        this.f13009j = cVar2;
        this.f13010k = z;
        this.f13011l = new C4701b(0);
        this.f13012m = C4701b.m14461b();
        this.f13013n = new C4871j();
        this.f13014o = new ArrayList();
        this.f13015p = new MediaCodec.BufferInfo();
        this.f12999L = 0;
        this.f13000M = 0;
    }

    /* renamed from: a */
    public abstract int mo25047a(C4878c cVar, C4869i iVar) throws C4880d.C4882b;

    /* renamed from: a */
    public C4875a mo25049a(C4878c cVar, C4869i iVar, boolean z) throws C4880d.C4882b {
        return cVar.mo25395a(iVar.f12956f, z);
    }

    /* renamed from: a */
    public abstract void mo25051a(MediaCodec mediaCodec, MediaFormat mediaFormat) throws C4697d;

    /* renamed from: a */
    public void mo25388a(C4701b bVar) {
    }

    /* renamed from: a */
    public abstract void mo25053a(C4875a aVar, MediaCodec mediaCodec, C4869i iVar, MediaCrypto mediaCrypto) throws C4880d.C4882b;

    /* renamed from: a */
    public abstract void mo25054a(String str, long j, long j2);

    /* renamed from: a */
    public abstract boolean mo25055a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws C4697d;

    /* renamed from: a */
    public boolean mo25389a(MediaCodec mediaCodec, boolean z, C4869i iVar, C4869i iVar2) {
        return false;
    }

    /* renamed from: b */
    public boolean mo25056b() {
        return this.f13004Q;
    }

    public boolean isReady() {
        if (this.f13016q != null && !this.f13005R) {
            if ((this.f11672g ? this.f11673h : this.f11670e.isReady()) || this.f12996I >= 0 || (this.f12994G != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f12994G)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public void mo25026p() {
        this.f13016q = null;
        try {
            mo25393v();
            try {
                C4706b<C4709d> bVar = this.f13018s;
                if (bVar != null) {
                    this.f13009j.mo25128a(bVar);
                }
                try {
                    C4706b<C4709d> bVar2 = this.f13019t;
                    if (!(bVar2 == null || bVar2 == this.f13018s)) {
                        this.f13009j.mo25128a(bVar2);
                    }
                } finally {
                    this.f13018s = null;
                    this.f13019t = null;
                }
            } catch (Throwable th) {
                C4706b<C4709d> bVar3 = this.f13019t;
                if (!(bVar3 == null || bVar3 == this.f13018s)) {
                    this.f13009j.mo25128a(bVar3);
                }
                throw th;
            } finally {
                this.f13018s = null;
                this.f13019t = null;
            }
        } catch (Throwable th2) {
            try {
                C4706b<C4709d> bVar4 = this.f13019t;
                if (!(bVar4 == null || bVar4 == this.f13018s)) {
                    this.f13009j.mo25128a(bVar4);
                }
                throw th2;
            } finally {
                this.f13018s = null;
                this.f13019t = null;
            }
        } finally {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:82:0x0139 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x013a  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo25390s() throws com.fyber.inneractive.sdk.player.exoplayer2.C4697d {
        /*
            r15 = this;
            android.media.MediaCodec r0 = r15.f13017r
            r1 = 0
            if (r0 == 0) goto L_0x0208
            int r2 = r15.f13000M
            r3 = 2
            if (r2 == r3) goto L_0x0208
            boolean r2 = r15.f13003P
            if (r2 == 0) goto L_0x0010
            goto L_0x0208
        L_0x0010:
            int r2 = r15.f12995H
            if (r2 >= 0) goto L_0x002a
            r4 = 0
            int r0 = r0.dequeueInputBuffer(r4)
            r15.f12995H = r0
            if (r0 >= 0) goto L_0x001f
            return r1
        L_0x001f:
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r2 = r15.f13011l
            java.nio.ByteBuffer[] r4 = r15.f12992E
            r0 = r4[r0]
            r2.f11851c = r0
            r2.mo25108a()
        L_0x002a:
            int r0 = r15.f13000M
            r2 = -1
            r4 = 1
            if (r0 != r4) goto L_0x0048
            boolean r0 = r15.f13024y
            if (r0 == 0) goto L_0x0035
            goto L_0x0045
        L_0x0035:
            r15.f13002O = r4
            android.media.MediaCodec r5 = r15.f13017r
            int r6 = r15.f12995H
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 4
            r5.queueInputBuffer(r6, r7, r8, r9, r11)
            r15.f12995H = r2
        L_0x0045:
            r15.f13000M = r3
            return r1
        L_0x0048:
            boolean r0 = r15.f12990C
            if (r0 == 0) goto L_0x0068
            r15.f12990C = r1
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r15.f13011l
            java.nio.ByteBuffer r0 = r0.f11851c
            byte[] r1 = f12987U
            r0.put(r1)
            android.media.MediaCodec r5 = r15.f13017r
            int r6 = r15.f12995H
            int r8 = r1.length
            r7 = 0
            r9 = 0
            r11 = 0
            r5.queueInputBuffer(r6, r7, r8, r9, r11)
            r15.f12995H = r2
            r15.f13001N = r4
            return r4
        L_0x0068:
            boolean r0 = r15.f13005R
            if (r0 == 0) goto L_0x006f
            r0 = -4
            r5 = r1
            goto L_0x00a7
        L_0x006f:
            int r0 = r15.f12999L
            if (r0 != r4) goto L_0x0094
            r0 = r1
        L_0x0074:
            com.fyber.inneractive.sdk.player.exoplayer2.i r5 = r15.f13016q
            java.util.List<byte[]> r5 = r5.f12958h
            int r5 = r5.size()
            if (r0 >= r5) goto L_0x0092
            com.fyber.inneractive.sdk.player.exoplayer2.i r5 = r15.f13016q
            java.util.List<byte[]> r5 = r5.f12958h
            java.lang.Object r5 = r5.get(r0)
            byte[] r5 = (byte[]) r5
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r6 = r15.f13011l
            java.nio.ByteBuffer r6 = r6.f11851c
            r6.put(r5)
            int r0 = r0 + 1
            goto L_0x0074
        L_0x0092:
            r15.f12999L = r3
        L_0x0094:
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r15.f13011l
            java.nio.ByteBuffer r0 = r0.f11851c
            int r0 = r0.position()
            com.fyber.inneractive.sdk.player.exoplayer2.j r5 = r15.f13013n
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r6 = r15.f13011l
            int r5 = r15.mo25007a((com.fyber.inneractive.sdk.player.exoplayer2.C4871j) r5, (com.fyber.inneractive.sdk.player.exoplayer2.decoder.C4701b) r6, (boolean) r1)
            r14 = r5
            r5 = r0
            r0 = r14
        L_0x00a7:
            r6 = -3
            if (r0 != r6) goto L_0x00ab
            return r1
        L_0x00ab:
            r6 = -5
            if (r0 != r6) goto L_0x00c1
            int r0 = r15.f12999L
            if (r0 != r3) goto L_0x00b9
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r15.f13011l
            r0.mo25108a()
            r15.f12999L = r4
        L_0x00b9:
            com.fyber.inneractive.sdk.player.exoplayer2.j r0 = r15.f13013n
            com.fyber.inneractive.sdk.player.exoplayer2.i r0 = r0.f12977a
            r15.mo25052a((com.fyber.inneractive.sdk.player.exoplayer2.C4869i) r0)
            return r4
        L_0x00c1:
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r15.f13011l
            r6 = 4
            boolean r0 = r0.mo25109b(r6)
            if (r0 == 0) goto L_0x00fd
            int r0 = r15.f12999L
            if (r0 != r3) goto L_0x00d5
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r15.f13011l
            r0.mo25108a()
            r15.f12999L = r4
        L_0x00d5:
            r15.f13003P = r4
            boolean r0 = r15.f13001N
            if (r0 != 0) goto L_0x00df
            r15.mo25392u()
            return r1
        L_0x00df:
            boolean r0 = r15.f13024y     // Catch:{ CryptoException -> 0x00f5 }
            if (r0 == 0) goto L_0x00e4
            goto L_0x00f4
        L_0x00e4:
            r15.f13002O = r4     // Catch:{ CryptoException -> 0x00f5 }
            android.media.MediaCodec r5 = r15.f13017r     // Catch:{ CryptoException -> 0x00f5 }
            int r6 = r15.f12995H     // Catch:{ CryptoException -> 0x00f5 }
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 4
            r5.queueInputBuffer(r6, r7, r8, r9, r11)     // Catch:{ CryptoException -> 0x00f5 }
            r15.f12995H = r2     // Catch:{ CryptoException -> 0x00f5 }
        L_0x00f4:
            return r1
        L_0x00f5:
            r0 = move-exception
            int r1 = r15.f11668c
            com.fyber.inneractive.sdk.player.exoplayer2.d r0 = com.fyber.inneractive.sdk.player.exoplayer2.C4697d.m14459a(r0, r1)
            throw r0
        L_0x00fd:
            boolean r0 = r15.f13006S
            if (r0 == 0) goto L_0x0115
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r15.f13011l
            boolean r0 = r0.mo25109b(r4)
            if (r0 != 0) goto L_0x0115
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r15.f13011l
            r0.mo25108a()
            int r0 = r15.f12999L
            if (r0 != r3) goto L_0x0114
            r15.f12999L = r4
        L_0x0114:
            return r4
        L_0x0115:
            r15.f13006S = r1
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r15.f13011l
            r3 = 1073741824(0x40000000, float:2.0)
            boolean r0 = r0.mo25109b(r3)
            com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r3 = r15.f13018s
            if (r3 != 0) goto L_0x0124
            goto L_0x0134
        L_0x0124:
            int r3 = r3.mo25123a()
            if (r3 == 0) goto L_0x01fb
            if (r3 == r6) goto L_0x0134
            if (r0 != 0) goto L_0x0132
            boolean r3 = r15.f13010k
            if (r3 != 0) goto L_0x0134
        L_0x0132:
            r3 = r4
            goto L_0x0135
        L_0x0134:
            r3 = r1
        L_0x0135:
            r15.f13005R = r3
            if (r3 == 0) goto L_0x013a
            return r1
        L_0x013a:
            boolean r3 = r15.f13021v
            if (r3 == 0) goto L_0x018f
            if (r0 != 0) goto L_0x018f
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r3 = r15.f13011l
            java.nio.ByteBuffer r3 = r3.f11851c
            byte[] r6 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5032i.f13423a
            int r6 = r3.position()
            r7 = r1
            r8 = r7
        L_0x014c:
            int r9 = r7 + 1
            if (r9 >= r6) goto L_0x017f
            byte r10 = r3.get(r7)
            r10 = r10 & 255(0xff, float:3.57E-43)
            r11 = 3
            if (r8 != r11) goto L_0x0176
            if (r10 != r4) goto L_0x017a
            byte r12 = r3.get(r9)
            r12 = r12 & 31
            r13 = 7
            if (r12 != r13) goto L_0x017a
            java.nio.ByteBuffer r8 = r3.duplicate()
            int r7 = r7 - r11
            r8.position(r7)
            r8.limit(r6)
            r3.position(r1)
            r3.put(r8)
            goto L_0x0182
        L_0x0176:
            if (r10 != 0) goto L_0x017a
            int r8 = r8 + 1
        L_0x017a:
            if (r10 == 0) goto L_0x017d
            r8 = r1
        L_0x017d:
            r7 = r9
            goto L_0x014c
        L_0x017f:
            r3.clear()
        L_0x0182:
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r3 = r15.f13011l
            java.nio.ByteBuffer r3 = r3.f11851c
            int r3 = r3.position()
            if (r3 != 0) goto L_0x018d
            return r4
        L_0x018d:
            r15.f13021v = r1
        L_0x018f:
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r3 = r15.f13011l     // Catch:{ CryptoException -> 0x01f3 }
            long r10 = r3.f11852d     // Catch:{ CryptoException -> 0x01f3 }
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            boolean r3 = r3.mo25109b(r6)     // Catch:{ CryptoException -> 0x01f3 }
            if (r3 == 0) goto L_0x01a4
            java.util.List<java.lang.Long> r3 = r15.f13014o     // Catch:{ CryptoException -> 0x01f3 }
            java.lang.Long r6 = java.lang.Long.valueOf(r10)     // Catch:{ CryptoException -> 0x01f3 }
            r3.add(r6)     // Catch:{ CryptoException -> 0x01f3 }
        L_0x01a4:
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r3 = r15.f13011l     // Catch:{ CryptoException -> 0x01f3 }
            java.nio.ByteBuffer r3 = r3.f11851c     // Catch:{ CryptoException -> 0x01f3 }
            r3.flip()     // Catch:{ CryptoException -> 0x01f3 }
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r3 = r15.f13011l     // Catch:{ CryptoException -> 0x01f3 }
            r15.mo25388a((com.fyber.inneractive.sdk.player.exoplayer2.decoder.C4701b) r3)     // Catch:{ CryptoException -> 0x01f3 }
            if (r0 == 0) goto L_0x01d4
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r15.f13011l     // Catch:{ CryptoException -> 0x01f3 }
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.a r0 = r0.f11850b     // Catch:{ CryptoException -> 0x01f3 }
            android.media.MediaCodec$CryptoInfo r9 = r0.f11845g     // Catch:{ CryptoException -> 0x01f3 }
            if (r5 != 0) goto L_0x01bb
            goto L_0x01ca
        L_0x01bb:
            int[] r0 = r9.numBytesOfClearData     // Catch:{ CryptoException -> 0x01f3 }
            if (r0 != 0) goto L_0x01c3
            int[] r0 = new int[r4]     // Catch:{ CryptoException -> 0x01f3 }
            r9.numBytesOfClearData = r0     // Catch:{ CryptoException -> 0x01f3 }
        L_0x01c3:
            int[] r0 = r9.numBytesOfClearData     // Catch:{ CryptoException -> 0x01f3 }
            r3 = r0[r1]     // Catch:{ CryptoException -> 0x01f3 }
            int r3 = r3 + r5
            r0[r1] = r3     // Catch:{ CryptoException -> 0x01f3 }
        L_0x01ca:
            android.media.MediaCodec r6 = r15.f13017r     // Catch:{ CryptoException -> 0x01f3 }
            int r7 = r15.f12995H     // Catch:{ CryptoException -> 0x01f3 }
            r8 = 0
            r12 = 0
            r6.queueSecureInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ CryptoException -> 0x01f3 }
            goto L_0x01e5
        L_0x01d4:
            android.media.MediaCodec r6 = r15.f13017r     // Catch:{ CryptoException -> 0x01f3 }
            int r7 = r15.f12995H     // Catch:{ CryptoException -> 0x01f3 }
            r8 = 0
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r15.f13011l     // Catch:{ CryptoException -> 0x01f3 }
            java.nio.ByteBuffer r0 = r0.f11851c     // Catch:{ CryptoException -> 0x01f3 }
            int r9 = r0.limit()     // Catch:{ CryptoException -> 0x01f3 }
            r12 = 0
            r6.queueInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ CryptoException -> 0x01f3 }
        L_0x01e5:
            r15.f12995H = r2     // Catch:{ CryptoException -> 0x01f3 }
            r15.f13001N = r4     // Catch:{ CryptoException -> 0x01f3 }
            r15.f12999L = r1     // Catch:{ CryptoException -> 0x01f3 }
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters r0 = r15.f13007T     // Catch:{ CryptoException -> 0x01f3 }
            int r1 = r0.inputBufferCount     // Catch:{ CryptoException -> 0x01f3 }
            int r1 = r1 + r4
            r0.inputBufferCount = r1     // Catch:{ CryptoException -> 0x01f3 }
            return r4
        L_0x01f3:
            r0 = move-exception
            int r1 = r15.f11668c
            com.fyber.inneractive.sdk.player.exoplayer2.d r0 = com.fyber.inneractive.sdk.player.exoplayer2.C4697d.m14459a(r0, r1)
            throw r0
        L_0x01fb:
            com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r0 = r15.f13018s
            r0.mo25126c()
            int r0 = r15.f11668c
            r1 = 0
            com.fyber.inneractive.sdk.player.exoplayer2.d r0 = com.fyber.inneractive.sdk.player.exoplayer2.C4697d.m14459a(r1, r0)
            throw r0
        L_0x0208:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4876b.mo25390s():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0166  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25391t() throws com.fyber.inneractive.sdk.player.exoplayer2.C4697d {
        /*
            r12 = this;
            boolean r0 = r12.mo25394x()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r0 = r12.f13019t
            r12.f13018s = r0
            com.fyber.inneractive.sdk.player.exoplayer2.i r1 = r12.f13016q
            java.lang.String r1 = r1.f12956f
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x003d
            int r0 = r0.mo25123a()
            if (r0 == 0) goto L_0x0031
            r4 = 3
            if (r0 == r4) goto L_0x0021
            r4 = 4
            if (r0 != r4) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            return
        L_0x0021:
            com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r0 = r12.f13018s
            com.fyber.inneractive.sdk.player.exoplayer2.drm.d r0 = r0.mo25125b()
            r0.getClass()
            com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r0 = r12.f13018s
            boolean r0 = r0.mo25124a(r1)
            goto L_0x003e
        L_0x0031:
            com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r0 = r12.f13018s
            r0.mo25126c()
            int r0 = r12.f11668c
            com.fyber.inneractive.sdk.player.exoplayer2.d r0 = com.fyber.inneractive.sdk.player.exoplayer2.C4697d.m14459a(r2, r0)
            throw r0
        L_0x003d:
            r0 = r3
        L_0x003e:
            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c r4 = r12.f13008i     // Catch:{ b -> 0x0217 }
            com.fyber.inneractive.sdk.player.exoplayer2.i r5 = r12.f13016q     // Catch:{ b -> 0x0217 }
            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a r4 = r12.mo25049a((com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4878c) r4, (com.fyber.inneractive.sdk.player.exoplayer2.C4869i) r5, (boolean) r0)     // Catch:{ b -> 0x0217 }
            if (r4 != 0) goto L_0x0079
            if (r0 == 0) goto L_0x0079
            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c r4 = r12.f13008i     // Catch:{ b -> 0x0217 }
            com.fyber.inneractive.sdk.player.exoplayer2.i r5 = r12.f13016q     // Catch:{ b -> 0x0217 }
            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a r4 = r12.mo25049a((com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4878c) r4, (com.fyber.inneractive.sdk.player.exoplayer2.C4869i) r5, (boolean) r3)     // Catch:{ b -> 0x0217 }
            if (r4 == 0) goto L_0x0079
            java.lang.String r5 = "MediaCodecRenderer"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ b -> 0x0217 }
            r6.<init>()     // Catch:{ b -> 0x0217 }
            java.lang.String r7 = "Drm session requires secure decoder for "
            r6.append(r7)     // Catch:{ b -> 0x0217 }
            r6.append(r1)     // Catch:{ b -> 0x0217 }
            java.lang.String r1 = ", but no secure decoder available. Trying to proceed with "
            r6.append(r1)     // Catch:{ b -> 0x0217 }
            java.lang.String r1 = r4.f12982a     // Catch:{ b -> 0x0217 }
            r6.append(r1)     // Catch:{ b -> 0x0217 }
            java.lang.String r1 = "."
            r6.append(r1)     // Catch:{ b -> 0x0217 }
            java.lang.String r1 = r6.toString()     // Catch:{ b -> 0x0217 }
            android.util.Log.w(r5, r1)     // Catch:{ b -> 0x0217 }
        L_0x0079:
            if (r4 == 0) goto L_0x0206
            java.lang.String r1 = r4.f12982a
            boolean r5 = r4.f12983b
            r12.f13020u = r5
            com.fyber.inneractive.sdk.player.exoplayer2.i r5 = r12.f13016q
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.f13471a
            r7 = 21
            r11 = 1
            if (r6 >= r7) goto L_0x009c
            java.util.List<byte[]> r5 = r5.f12958h
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x009c
            java.lang.String r5 = "OMX.MTK.VIDEO.DECODER.AVC"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x009c
            r5 = r11
            goto L_0x009d
        L_0x009c:
            r5 = r3
        L_0x009d:
            r12.f13021v = r5
            r5 = 19
            r8 = 18
            if (r6 < r8) goto L_0x00d6
            if (r6 != r8) goto L_0x00b7
            java.lang.String r9 = "OMX.SEC.avc.dec"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x00d6
            java.lang.String r9 = "OMX.SEC.avc.dec.secure"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x00d6
        L_0x00b7:
            if (r6 != r5) goto L_0x00d4
            java.lang.String r9 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.f13474d
            java.lang.String r10 = "SM-G800"
            boolean r9 = r9.startsWith(r10)
            if (r9 == 0) goto L_0x00d4
            java.lang.String r9 = "OMX.Exynos.avc.dec"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x00d6
            java.lang.String r9 = "OMX.Exynos.avc.dec.secure"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L_0x00d4
            goto L_0x00d6
        L_0x00d4:
            r9 = r3
            goto L_0x00d7
        L_0x00d6:
            r9 = r11
        L_0x00d7:
            r12.f13022w = r9
            r9 = 24
            if (r6 >= r9) goto L_0x0111
            java.lang.String r9 = "OMX.Nvidia.h264.decode"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x00ed
            java.lang.String r9 = "OMX.Nvidia.h264.decode.secure"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L_0x0111
        L_0x00ed:
            java.lang.String r9 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.f13472b
            java.lang.String r10 = "flounder"
            boolean r10 = r10.equals(r9)
            if (r10 != 0) goto L_0x010f
            java.lang.String r10 = "flounder_lte"
            boolean r10 = r10.equals(r9)
            if (r10 != 0) goto L_0x010f
            java.lang.String r10 = "grouper"
            boolean r10 = r10.equals(r9)
            if (r10 != 0) goto L_0x010f
            java.lang.String r10 = "tilapia"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L_0x0111
        L_0x010f:
            r9 = r11
            goto L_0x0112
        L_0x0111:
            r9 = r3
        L_0x0112:
            r12.f13023x = r9
            r9 = 17
            if (r6 > r9) goto L_0x012a
            java.lang.String r9 = "OMX.rk.video_decoder.avc"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x0128
            java.lang.String r9 = "OMX.allwinner.video.decoder.avc"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L_0x012a
        L_0x0128:
            r9 = r11
            goto L_0x012b
        L_0x012a:
            r9 = r3
        L_0x012b:
            r12.f13024y = r9
            r9 = 23
            if (r6 > r9) goto L_0x0139
            java.lang.String r9 = "OMX.google.vorbis.decoder"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x0155
        L_0x0139:
            if (r6 > r5) goto L_0x0157
            java.lang.String r5 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.f13472b
            java.lang.String r9 = "hb2000"
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L_0x0157
            java.lang.String r5 = "OMX.amlogic.avc.decoder.awesome"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0155
            java.lang.String r5 = "OMX.amlogic.avc.decoder.awesome.secure"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0157
        L_0x0155:
            r5 = r11
            goto L_0x0158
        L_0x0157:
            r5 = r3
        L_0x0158:
            r12.f13025z = r5
            if (r6 != r7) goto L_0x0166
            java.lang.String r5 = "OMX.google.aac.decoder"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0166
            r5 = r11
            goto L_0x0167
        L_0x0166:
            r5 = r3
        L_0x0167:
            r12.f12988A = r5
            com.fyber.inneractive.sdk.player.exoplayer2.i r5 = r12.f13016q
            if (r6 > r8) goto L_0x017a
            int r5 = r5.f12968r
            if (r5 != r11) goto L_0x017a
            java.lang.String r5 = "OMX.MTK.AUDIO.DECODER.MP3"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x017a
            r3 = r11
        L_0x017a:
            r12.f12989B = r3
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x01f7 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01f7 }
            r3.<init>()     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r7 = "createCodec:"
            r3.append(r7)     // Catch:{ Exception -> 0x01f7 }
            r3.append(r1)     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01f7 }
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5047s.m15380a(r3)     // Catch:{ Exception -> 0x01f7 }
            android.media.MediaCodec r3 = android.media.MediaCodec.createByCodecName(r1)     // Catch:{ Exception -> 0x01f7 }
            r12.f13017r = r3     // Catch:{ Exception -> 0x01f7 }
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5047s.m15379a()     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r3 = "configureCodec"
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5047s.m15380a(r3)     // Catch:{ Exception -> 0x01f7 }
            android.media.MediaCodec r3 = r12.f13017r     // Catch:{ Exception -> 0x01f7 }
            com.fyber.inneractive.sdk.player.exoplayer2.i r7 = r12.f13016q     // Catch:{ Exception -> 0x01f7 }
            r12.mo25053a((com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4875a) r4, (android.media.MediaCodec) r3, (com.fyber.inneractive.sdk.player.exoplayer2.C4869i) r7, (android.media.MediaCrypto) r2)     // Catch:{ Exception -> 0x01f7 }
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5047s.m15379a()     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r2 = "startCodec"
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5047s.m15380a(r2)     // Catch:{ Exception -> 0x01f7 }
            android.media.MediaCodec r2 = r12.f13017r     // Catch:{ Exception -> 0x01f7 }
            r2.start()     // Catch:{ Exception -> 0x01f7 }
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5047s.m15379a()     // Catch:{ Exception -> 0x01f7 }
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x01f7 }
            long r9 = r7 - r5
            r5 = r12
            r6 = r1
            r5.mo25054a((java.lang.String) r6, (long) r7, (long) r9)     // Catch:{ Exception -> 0x01f7 }
            android.media.MediaCodec r2 = r12.f13017r     // Catch:{ Exception -> 0x01f7 }
            java.nio.ByteBuffer[] r2 = r2.getInputBuffers()     // Catch:{ Exception -> 0x01f7 }
            r12.f12992E = r2     // Catch:{ Exception -> 0x01f7 }
            android.media.MediaCodec r2 = r12.f13017r     // Catch:{ Exception -> 0x01f7 }
            java.nio.ByteBuffer[] r2 = r2.getOutputBuffers()     // Catch:{ Exception -> 0x01f7 }
            r12.f12993F = r2     // Catch:{ Exception -> 0x01f7 }
            int r0 = r12.f11669d
            r1 = 2
            if (r0 != r1) goto L_0x01e1
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r2
            goto L_0x01e6
        L_0x01e1:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x01e6:
            r12.f12994G = r0
            r0 = -1
            r12.f12995H = r0
            r12.f12996I = r0
            r12.f13006S = r11
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters r0 = r12.f13007T
            int r1 = r0.decoderInitCount
            int r1 = r1 + r11
            r0.decoderInitCount = r1
            return
        L_0x01f7:
            r2 = move-exception
            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b$a r3 = new com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b$a
            com.fyber.inneractive.sdk.player.exoplayer2.i r4 = r12.f13016q
            r3.<init>((com.fyber.inneractive.sdk.player.exoplayer2.C4869i) r4, (java.lang.Throwable) r2, (boolean) r0, (java.lang.String) r1)
            int r0 = r12.f11668c
            com.fyber.inneractive.sdk.player.exoplayer2.d r0 = com.fyber.inneractive.sdk.player.exoplayer2.C4697d.m14459a(r3, r0)
            throw r0
        L_0x0206:
            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b$a r1 = new com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b$a
            com.fyber.inneractive.sdk.player.exoplayer2.i r3 = r12.f13016q
            r4 = -49999(0xffffffffffff3cb1, float:NaN)
            r1.<init>((com.fyber.inneractive.sdk.player.exoplayer2.C4869i) r3, (java.lang.Throwable) r2, (boolean) r0, (int) r4)
            int r0 = r12.f11668c
            com.fyber.inneractive.sdk.player.exoplayer2.d r0 = com.fyber.inneractive.sdk.player.exoplayer2.C4697d.m14459a(r1, r0)
            throw r0
        L_0x0217:
            r1 = move-exception
            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b$a r2 = new com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b$a
            com.fyber.inneractive.sdk.player.exoplayer2.i r3 = r12.f13016q
            r4 = -49998(0xffffffffffff3cb2, float:NaN)
            r2.<init>((com.fyber.inneractive.sdk.player.exoplayer2.C4869i) r3, (java.lang.Throwable) r1, (boolean) r0, (int) r4)
            int r0 = r12.f11668c
            com.fyber.inneractive.sdk.player.exoplayer2.d r0 = com.fyber.inneractive.sdk.player.exoplayer2.C4697d.m14459a(r2, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4876b.mo25391t():void");
    }

    /* renamed from: u */
    public final void mo25392u() throws C4697d {
        if (this.f13000M == 2) {
            mo25393v();
            mo25391t();
            return;
        }
        this.f13004Q = true;
        mo25060w();
    }

    /* renamed from: v */
    public void mo25393v() {
        if (this.f13017r != null) {
            this.f12994G = -9223372036854775807L;
            this.f12995H = -1;
            this.f12996I = -1;
            this.f13005R = false;
            this.f12997J = false;
            this.f13014o.clear();
            this.f12992E = null;
            this.f12993F = null;
            this.f12998K = false;
            this.f13001N = false;
            this.f13020u = false;
            this.f13021v = false;
            this.f13022w = false;
            this.f13023x = false;
            this.f13024y = false;
            this.f13025z = false;
            this.f12989B = false;
            this.f12990C = false;
            this.f12991D = false;
            this.f13002O = false;
            this.f12999L = 0;
            this.f13000M = 0;
            this.f13007T.decoderReleaseCount++;
            this.f13011l.f11851c = null;
            try {
                this.f13017r.stop();
                try {
                    this.f13017r.release();
                    this.f13017r = null;
                    C4706b<C4709d> bVar = this.f13018s;
                    if (bVar != null && this.f13019t != bVar) {
                        try {
                            this.f13009j.mo25128a(bVar);
                        } finally {
                            this.f13018s = null;
                        }
                    }
                } catch (Throwable th) {
                    this.f13017r = null;
                    C4706b<C4709d> bVar2 = this.f13018s;
                    if (!(bVar2 == null || this.f13019t == bVar2)) {
                        this.f13009j.mo25128a(bVar2);
                    }
                    throw th;
                } finally {
                    this.f13018s = null;
                }
            } catch (Throwable th2) {
                this.f13017r = null;
                C4706b<C4709d> bVar3 = this.f13018s;
                if (!(bVar3 == null || this.f13019t == bVar3)) {
                    try {
                        this.f13009j.mo25128a(bVar3);
                    } finally {
                        this.f13018s = null;
                    }
                }
                throw th2;
            } finally {
            }
        }
    }

    /* renamed from: w */
    public void mo25060w() throws C4697d {
    }

    /* renamed from: x */
    public boolean mo25394x() {
        return this.f13017r == null && this.f13016q != null;
    }

    /* renamed from: a */
    public void mo25010a(long j, boolean z) throws C4697d {
        this.f13003P = false;
        this.f13004Q = false;
        if (this.f13017r != null) {
            this.f12994G = -9223372036854775807L;
            this.f12995H = -1;
            this.f12996I = -1;
            this.f13006S = true;
            this.f13005R = false;
            this.f12997J = false;
            this.f13014o.clear();
            this.f12990C = false;
            this.f12991D = false;
            if (this.f13022w || (this.f13025z && this.f13002O)) {
                mo25393v();
                mo25391t();
            } else if (this.f13000M != 0) {
                mo25393v();
                mo25391t();
            } else {
                this.f13017r.flush();
                this.f13001N = false;
            }
            if (this.f12998K && this.f13016q != null) {
                this.f12999L = 1;
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b$a */
    public static class C4877a extends Exception {
        public C4877a(C4869i iVar, Throwable th, boolean z, int i) {
            super("Decoder init failed: [" + i + "], " + iVar, th);
            String str = iVar.f12956f;
            m15009a(i);
        }

        /* renamed from: a */
        public static String m15010a(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        /* renamed from: a */
        public static String m15009a(int i) {
            String str = i < 0 ? "neg_" : "";
            return "com.google.android.exoplayer.MediaCodecTrackRenderer_" + str + Math.abs(i);
        }

        public C4877a(C4869i iVar, Throwable th, boolean z, String str) {
            super("Decoder init failed: " + str + ", " + iVar, th);
            String str2 = iVar.f12956f;
            if (C5049u.f13471a >= 21) {
                m15010a(th);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x0184 A[LOOP:0: B:14:0x0047->B:84:0x0184, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0187 A[EDGE_INSN: B:95:0x0187->B:85:0x0187 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25387a(long r18, long r20) throws com.fyber.inneractive.sdk.player.exoplayer2.C4697d {
        /*
            r17 = this;
            r12 = r17
            boolean r0 = r12.f13004Q
            if (r0 == 0) goto L_0x000a
            r17.mo25060w()
            return
        L_0x000a:
            com.fyber.inneractive.sdk.player.exoplayer2.i r0 = r12.f13016q
            r1 = -4
            r2 = -5
            r13 = 4
            r14 = 1
            if (r0 != 0) goto L_0x003a
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r12.f13012m
            r0.mo25108a()
            com.fyber.inneractive.sdk.player.exoplayer2.j r0 = r12.f13013n
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r3 = r12.f13012m
            int r0 = r12.mo25007a((com.fyber.inneractive.sdk.player.exoplayer2.C4871j) r0, (com.fyber.inneractive.sdk.player.exoplayer2.decoder.C4701b) r3, (boolean) r14)
            if (r0 != r2) goto L_0x0029
            com.fyber.inneractive.sdk.player.exoplayer2.j r0 = r12.f13013n
            com.fyber.inneractive.sdk.player.exoplayer2.i r0 = r0.f12977a
            r12.mo25052a((com.fyber.inneractive.sdk.player.exoplayer2.C4869i) r0)
            goto L_0x003a
        L_0x0029:
            if (r0 != r1) goto L_0x0039
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r12.f13012m
            boolean r0 = r0.mo25109b(r13)
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a.m15304b(r0)
            r12.f13003P = r14
            r17.mo25392u()
        L_0x0039:
            return
        L_0x003a:
            r17.mo25391t()
            android.media.MediaCodec r0 = r12.f13017r
            r15 = 0
            if (r0 == 0) goto L_0x0192
            java.lang.String r0 = "drainAndFeed"
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5047s.m15380a(r0)
        L_0x0047:
            int r0 = r12.f12996I
            r11 = -1
            if (r0 >= 0) goto L_0x0129
            boolean r0 = r12.f12988A
            r1 = 0
            if (r0 == 0) goto L_0x006d
            boolean r0 = r12.f13002O
            if (r0 == 0) goto L_0x006d
            android.media.MediaCodec r0 = r12.f13017r     // Catch:{ IllegalStateException -> 0x0061 }
            android.media.MediaCodec$BufferInfo r3 = r12.f13015p     // Catch:{ IllegalStateException -> 0x0061 }
            int r0 = r0.dequeueOutputBuffer(r3, r1)     // Catch:{ IllegalStateException -> 0x0061 }
            r12.f12996I = r0     // Catch:{ IllegalStateException -> 0x0061 }
            goto L_0x0077
        L_0x0061:
            r17.mo25392u()
            boolean r0 = r12.f13004Q
            if (r0 == 0) goto L_0x0181
            r17.mo25393v()
            goto L_0x0181
        L_0x006d:
            android.media.MediaCodec r0 = r12.f13017r
            android.media.MediaCodec$BufferInfo r3 = r12.f13015p
            int r0 = r0.dequeueOutputBuffer(r3, r1)
            r12.f12996I = r0
        L_0x0077:
            int r0 = r12.f12996I
            if (r0 < 0) goto L_0x00d8
            boolean r1 = r12.f12991D
            if (r1 == 0) goto L_0x008a
            r12.f12991D = r15
            android.media.MediaCodec r1 = r12.f13017r
            r1.releaseOutputBuffer(r0, r15)
            r12.f12996I = r11
            goto L_0x0182
        L_0x008a:
            android.media.MediaCodec$BufferInfo r1 = r12.f13015p
            int r2 = r1.flags
            r2 = r2 & r13
            if (r2 == 0) goto L_0x0098
            r17.mo25392u()
            r12.f12996I = r11
            goto L_0x0181
        L_0x0098:
            java.nio.ByteBuffer[] r2 = r12.f12993F
            r0 = r2[r0]
            if (r0 == 0) goto L_0x00ad
            int r1 = r1.offset
            r0.position(r1)
            android.media.MediaCodec$BufferInfo r1 = r12.f13015p
            int r2 = r1.offset
            int r1 = r1.size
            int r2 = r2 + r1
            r0.limit(r2)
        L_0x00ad:
            android.media.MediaCodec$BufferInfo r0 = r12.f13015p
            long r0 = r0.presentationTimeUs
            java.util.List<java.lang.Long> r2 = r12.f13014o
            int r2 = r2.size()
            r3 = r15
        L_0x00b8:
            if (r3 >= r2) goto L_0x00d4
            java.util.List<java.lang.Long> r4 = r12.f13014o
            java.lang.Object r4 = r4.get(r3)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x00d1
            java.util.List<java.lang.Long> r0 = r12.f13014o
            r0.remove(r3)
            r0 = r14
            goto L_0x00d5
        L_0x00d1:
            int r3 = r3 + 1
            goto L_0x00b8
        L_0x00d4:
            r0 = r15
        L_0x00d5:
            r12.f12997J = r0
            goto L_0x0129
        L_0x00d8:
            r1 = -2
            if (r0 != r1) goto L_0x010b
            android.media.MediaCodec r0 = r12.f13017r
            android.media.MediaFormat r0 = r0.getOutputFormat()
            boolean r1 = r12.f13023x
            if (r1 == 0) goto L_0x00fb
            java.lang.String r1 = "width"
            int r1 = r0.getInteger(r1)
            r2 = 32
            if (r1 != r2) goto L_0x00fb
            java.lang.String r1 = "height"
            int r1 = r0.getInteger(r1)
            if (r1 != r2) goto L_0x00fb
            r12.f12991D = r14
            goto L_0x0182
        L_0x00fb:
            boolean r1 = r12.f12989B
            if (r1 == 0) goto L_0x0104
            java.lang.String r1 = "channel-count"
            r0.setInteger(r1, r14)
        L_0x0104:
            android.media.MediaCodec r1 = r12.f13017r
            r12.mo25051a((android.media.MediaCodec) r1, (android.media.MediaFormat) r0)
            goto L_0x0182
        L_0x010b:
            r1 = -3
            if (r0 != r1) goto L_0x0118
            android.media.MediaCodec r0 = r12.f13017r
            java.nio.ByteBuffer[] r0 = r0.getOutputBuffers()
            r12.f12993F = r0
            goto L_0x0182
        L_0x0118:
            boolean r0 = r12.f13024y
            if (r0 == 0) goto L_0x0181
            boolean r0 = r12.f13003P
            if (r0 != 0) goto L_0x0125
            int r0 = r12.f13000M
            r1 = 2
            if (r0 != r1) goto L_0x0181
        L_0x0125:
            r17.mo25392u()
            goto L_0x0181
        L_0x0129:
            boolean r0 = r12.f12988A
            if (r0 == 0) goto L_0x015c
            boolean r0 = r12.f13002O
            if (r0 == 0) goto L_0x015c
            android.media.MediaCodec r5 = r12.f13017r     // Catch:{ IllegalStateException -> 0x0151 }
            java.nio.ByteBuffer[] r0 = r12.f12993F     // Catch:{ IllegalStateException -> 0x0151 }
            int r7 = r12.f12996I     // Catch:{ IllegalStateException -> 0x0151 }
            r6 = r0[r7]     // Catch:{ IllegalStateException -> 0x0151 }
            android.media.MediaCodec$BufferInfo r0 = r12.f13015p     // Catch:{ IllegalStateException -> 0x0151 }
            int r8 = r0.flags     // Catch:{ IllegalStateException -> 0x0151 }
            long r9 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0151 }
            boolean r3 = r12.f12997J     // Catch:{ IllegalStateException -> 0x0151 }
            r0 = r17
            r1 = r18
            r16 = r3
            r3 = r20
            r14 = r11
            r11 = r16
            boolean r0 = r0.mo25055a(r1, r3, r5, r6, r7, r8, r9, r11)     // Catch:{ IllegalStateException -> 0x0151 }
            goto L_0x0177
        L_0x0151:
            r17.mo25392u()
            boolean r0 = r12.f13004Q
            if (r0 == 0) goto L_0x0181
            r17.mo25393v()
            goto L_0x0181
        L_0x015c:
            r14 = r11
            android.media.MediaCodec r5 = r12.f13017r
            java.nio.ByteBuffer[] r0 = r12.f12993F
            int r7 = r12.f12996I
            r6 = r0[r7]
            android.media.MediaCodec$BufferInfo r0 = r12.f13015p
            int r8 = r0.flags
            long r9 = r0.presentationTimeUs
            boolean r11 = r12.f12997J
            r0 = r17
            r1 = r18
            r3 = r20
            boolean r0 = r0.mo25055a(r1, r3, r5, r6, r7, r8, r9, r11)
        L_0x0177:
            if (r0 == 0) goto L_0x0181
            android.media.MediaCodec$BufferInfo r0 = r12.f13015p
            long r0 = r0.presentationTimeUs
            r12.f12996I = r14
            r14 = 1
            goto L_0x0182
        L_0x0181:
            r14 = r15
        L_0x0182:
            if (r14 == 0) goto L_0x0187
            r14 = 1
            goto L_0x0047
        L_0x0187:
            boolean r0 = r17.mo25390s()
            if (r0 == 0) goto L_0x018e
            goto L_0x0187
        L_0x018e:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5047s.m15379a()
            goto L_0x01c3
        L_0x0192:
            com.fyber.inneractive.sdk.player.exoplayer2.source.o r0 = r12.f11670e
            long r3 = r12.f11671f
            long r3 = r18 - r3
            r0.mo25211a(r3)
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r12.f13012m
            r0.mo25108a()
            com.fyber.inneractive.sdk.player.exoplayer2.j r0 = r12.f13013n
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r3 = r12.f13012m
            int r0 = r12.mo25007a((com.fyber.inneractive.sdk.player.exoplayer2.C4871j) r0, (com.fyber.inneractive.sdk.player.exoplayer2.decoder.C4701b) r3, (boolean) r15)
            if (r0 != r2) goto L_0x01b2
            com.fyber.inneractive.sdk.player.exoplayer2.j r0 = r12.f13013n
            com.fyber.inneractive.sdk.player.exoplayer2.i r0 = r0.f12977a
            r12.mo25052a((com.fyber.inneractive.sdk.player.exoplayer2.C4869i) r0)
            goto L_0x01c3
        L_0x01b2:
            if (r0 != r1) goto L_0x01c3
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r12.f13012m
            boolean r0 = r0.mo25109b(r13)
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a.m15304b(r0)
            r0 = 1
            r12.f13003P = r0
            r17.mo25392u()
        L_0x01c3:
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters r0 = r12.f13007T
            r0.ensureUpdated()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4876b.mo25387a(long, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006f, code lost:
        if (r5.f12961k == r0.f12961k) goto L_0x0073;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25052a(com.fyber.inneractive.sdk.player.exoplayer2.C4869i r5) throws com.fyber.inneractive.sdk.player.exoplayer2.C4697d {
        /*
            r4 = this;
            com.fyber.inneractive.sdk.player.exoplayer2.i r0 = r4.f13016q
            r4.f13016q = r5
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r5 = r5.f12959i
            r1 = 0
            if (r0 != 0) goto L_0x000b
            r2 = r1
            goto L_0x000d
        L_0x000b:
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r2 = r0.f12959i
        L_0x000d:
            boolean r5 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15393a((java.lang.Object) r5, (java.lang.Object) r2)
            r2 = 1
            r5 = r5 ^ r2
            if (r5 == 0) goto L_0x0047
            com.fyber.inneractive.sdk.player.exoplayer2.i r5 = r4.f13016q
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r5 = r5.f12959i
            if (r5 == 0) goto L_0x0045
            com.fyber.inneractive.sdk.player.exoplayer2.drm.c<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r5 = r4.f13009j
            if (r5 == 0) goto L_0x0037
            android.os.Looper r1 = android.os.Looper.myLooper()
            com.fyber.inneractive.sdk.player.exoplayer2.i r3 = r4.f13016q
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r3 = r3.f12959i
            com.fyber.inneractive.sdk.player.exoplayer2.drm.b r5 = r5.mo25127a(r1, r3)
            r4.f13019t = r5
            com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r1 = r4.f13018s
            if (r5 != r1) goto L_0x0047
            com.fyber.inneractive.sdk.player.exoplayer2.drm.c<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r1 = r4.f13009j
            r1.mo25128a(r5)
            goto L_0x0047
        L_0x0037:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r5.<init>(r0)
            int r0 = r4.f11668c
            com.fyber.inneractive.sdk.player.exoplayer2.d r5 = com.fyber.inneractive.sdk.player.exoplayer2.C4697d.m14459a(r5, r0)
            throw r5
        L_0x0045:
            r4.f13019t = r1
        L_0x0047:
            com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r5 = r4.f13019t
            com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r1 = r4.f13018s
            if (r5 != r1) goto L_0x0076
            android.media.MediaCodec r5 = r4.f13017r
            if (r5 == 0) goto L_0x0076
            boolean r1 = r4.f13020u
            com.fyber.inneractive.sdk.player.exoplayer2.i r3 = r4.f13016q
            boolean r5 = r4.mo25389a((android.media.MediaCodec) r5, (boolean) r1, (com.fyber.inneractive.sdk.player.exoplayer2.C4869i) r0, (com.fyber.inneractive.sdk.player.exoplayer2.C4869i) r3)
            if (r5 == 0) goto L_0x0076
            r4.f12998K = r2
            r4.f12999L = r2
            boolean r5 = r4.f13023x
            if (r5 == 0) goto L_0x0072
            com.fyber.inneractive.sdk.player.exoplayer2.i r5 = r4.f13016q
            int r1 = r5.f12960j
            int r3 = r0.f12960j
            if (r1 != r3) goto L_0x0072
            int r5 = r5.f12961k
            int r0 = r0.f12961k
            if (r5 != r0) goto L_0x0072
            goto L_0x0073
        L_0x0072:
            r2 = 0
        L_0x0073:
            r4.f12990C = r2
            goto L_0x0083
        L_0x0076:
            boolean r5 = r4.f13001N
            if (r5 == 0) goto L_0x007d
            r4.f13000M = r2
            goto L_0x0083
        L_0x007d:
            r4.mo25393v()
            r4.mo25391t()
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4876b.mo25052a(com.fyber.inneractive.sdk.player.exoplayer2.i):void");
    }
}
