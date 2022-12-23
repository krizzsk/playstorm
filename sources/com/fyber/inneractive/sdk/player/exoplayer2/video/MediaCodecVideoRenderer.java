package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.fyber.inneractive.sdk.player.exoplayer2.C4697d;
import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.C4701b;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4708c;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4709d;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4876b;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4878c;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5047s;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;

public class MediaCodecVideoRenderer extends C4876b {

    /* renamed from: w0 */
    public static final int[] f13480w0 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: V */
    public final C5064d f13481V;

    /* renamed from: W */
    public final VideoRendererEventListener.EventDispatcher f13482W;

    /* renamed from: X */
    public final long f13483X;

    /* renamed from: Y */
    public final int f13484Y;

    /* renamed from: Z */
    public final boolean f13485Z = m15399A();

    /* renamed from: a0 */
    public C4869i[] f13486a0;

    /* renamed from: b0 */
    public C5051a f13487b0;

    /* renamed from: c0 */
    public Surface f13488c0;

    /* renamed from: d0 */
    public int f13489d0 = 1;

    /* renamed from: e0 */
    public boolean f13490e0;

    /* renamed from: f0 */
    public long f13491f0 = -9223372036854775807L;

    /* renamed from: g0 */
    public long f13492g0;

    /* renamed from: h0 */
    public int f13493h0;

    /* renamed from: i0 */
    public int f13494i0;

    /* renamed from: j0 */
    public int f13495j0;

    /* renamed from: k0 */
    public float f13496k0 = -1.0f;

    /* renamed from: l0 */
    public int f13497l0 = -1;

    /* renamed from: m0 */
    public int f13498m0 = -1;

    /* renamed from: n0 */
    public int f13499n0;

    /* renamed from: o0 */
    public float f13500o0 = -1.0f;

    /* renamed from: p0 */
    public int f13501p0;

    /* renamed from: q0 */
    public int f13502q0;

    /* renamed from: r0 */
    public int f13503r0;

    /* renamed from: s0 */
    public float f13504s0;

    /* renamed from: t0 */
    public boolean f13505t0;

    /* renamed from: u0 */
    public int f13506u0;

    /* renamed from: v0 */
    public C5052b f13507v0;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer$a */
    public static final class C5051a {

        /* renamed from: a */
        public final int f13508a;

        /* renamed from: b */
        public final int f13509b;

        /* renamed from: c */
        public final int f13510c;

        public C5051a(int i, int i2, int i3) {
            this.f13508a = i;
            this.f13509b = i2;
            this.f13510c = i3;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer$b */
    public final class C5052b implements MediaCodec.OnFrameRenderedListener {
        public C5052b(MediaCodec mediaCodec) {
            mediaCodec.setOnFrameRenderedListener(this, new Handler());
        }

        public void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
            MediaCodecVideoRenderer mediaCodecVideoRenderer = MediaCodecVideoRenderer.this;
            if (this == mediaCodecVideoRenderer.f13507v0) {
                mediaCodecVideoRenderer.mo25639C();
            }
        }
    }

    public MediaCodecVideoRenderer(Context context, C4878c cVar, long j, C4708c<C4709d> cVar2, boolean z, Handler handler, VideoRendererEventListener videoRendererEventListener, int i) {
        super(2, cVar, (C4708c<C4709d>) null, z);
        this.f13483X = j;
        this.f13484Y = i;
        this.f13481V = new C5064d(context);
        this.f13482W = new VideoRendererEventListener.EventDispatcher(handler, videoRendererEventListener);
        mo25646z();
    }

    /* renamed from: A */
    public static boolean m15399A() {
        return C5049u.f13471a <= 22 && "foster".equals(C5049u.f13472b) && "NVIDIA".equals(C5049u.f13473c);
    }

    /* renamed from: B */
    public final void mo25638B() {
        if (this.f13493h0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f13482W.droppedFrames(this.f13493h0, elapsedRealtime - this.f13492g0);
            this.f13493h0 = 0;
            this.f13492g0 = elapsedRealtime;
        }
    }

    /* renamed from: C */
    public void mo25639C() {
        if (!this.f13490e0) {
            this.f13490e0 = true;
            this.f13482W.renderedFirstFrame(this.f13488c0);
        }
    }

    /* renamed from: D */
    public final void mo25640D() {
        int i = this.f13497l0;
        if (i != -1 || this.f13498m0 != -1) {
            if (this.f13501p0 != i || this.f13502q0 != this.f13498m0 || this.f13503r0 != this.f13499n0 || this.f13504s0 != this.f13500o0) {
                this.f13482W.videoSizeChanged(i, this.f13498m0, this.f13499n0, this.f13500o0);
                this.f13501p0 = this.f13497l0;
                this.f13502q0 = this.f13498m0;
                this.f13503r0 = this.f13499n0;
                this.f13504s0 = this.f13500o0;
            }
        }
    }

    /* renamed from: E */
    public final void mo25641E() {
        int i = this.f13501p0;
        if (i != -1 || this.f13502q0 != -1) {
            this.f13482W.videoSizeChanged(i, this.f13502q0, this.f13503r0, this.f13504s0);
        }
    }

    /* renamed from: F */
    public final void mo25642F() {
        this.f13491f0 = this.f13483X > 0 ? SystemClock.elapsedRealtime() + this.f13483X : -9223372036854775807L;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0225  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo25047a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4878c r18, com.fyber.inneractive.sdk.player.exoplayer2.C4869i r19) throws com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4880d.C4882b {
        /*
            r17 = this;
            r0 = r19
            java.lang.String r1 = r0.f12956f
            boolean r2 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5031h.m15319e(r1)
            r3 = 0
            if (r2 != 0) goto L_0x000c
            return r3
        L_0x000c:
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r2 = r0.f12959i
            if (r2 == 0) goto L_0x0023
            r4 = r3
            r5 = r4
        L_0x0012:
            int r6 = r2.f11856c
            if (r4 >= r6) goto L_0x0020
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b[] r6 = r2.f11854a
            r6 = r6[r4]
            boolean r6 = r6.f11861e
            r5 = r5 | r6
            int r4 = r4 + 1
            goto L_0x0012
        L_0x0020:
            r2 = r18
            goto L_0x0026
        L_0x0023:
            r2 = r18
            r5 = r3
        L_0x0026:
            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a r1 = r2.mo25395a(r1, r5)
            r2 = 1
            if (r1 != 0) goto L_0x002e
            return r2
        L_0x002e:
            java.lang.String r4 = r0.f12953c
            r5 = 16
            r6 = 4
            r7 = 3
            r8 = 2
            if (r4 == 0) goto L_0x026f
            java.lang.String r9 = r1.f12985d
            if (r9 != 0) goto L_0x003d
            goto L_0x026f
        L_0x003d:
            java.lang.String r9 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5031h.m15315a(r4)
            if (r9 != 0) goto L_0x0045
            goto L_0x026f
        L_0x0045:
            java.lang.String r10 = r1.f12985d
            boolean r10 = r10.equals(r9)
            java.lang.String r11 = ", "
            if (r10 != 0) goto L_0x006b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "codec.mime "
            r10.append(r12)
            r10.append(r4)
            r10.append(r11)
            r10.append(r9)
            java.lang.String r4 = r10.toString()
            r1.mo25385a((java.lang.String) r4)
            goto L_0x0270
        L_0x006b:
            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a r10 = com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4880d.f13027a
            java.lang.String r10 = "\\."
            java.lang.String[] r10 = r4.split(r10)
            r12 = r10[r3]
            r12.getClass()
            r13 = -1
            int r14 = r12.hashCode()
            switch(r14) {
                case 3006243: goto L_0x00a2;
                case 3006244: goto L_0x0097;
                case 3199032: goto L_0x008c;
                case 3214780: goto L_0x0081;
                default: goto L_0x0080;
            }
        L_0x0080:
            goto L_0x00ac
        L_0x0081:
            java.lang.String r14 = "hvc1"
            boolean r12 = r12.equals(r14)
            if (r12 != 0) goto L_0x008a
            goto L_0x00ac
        L_0x008a:
            r13 = r7
            goto L_0x00ac
        L_0x008c:
            java.lang.String r14 = "hev1"
            boolean r12 = r12.equals(r14)
            if (r12 != 0) goto L_0x0095
            goto L_0x00ac
        L_0x0095:
            r13 = r8
            goto L_0x00ac
        L_0x0097:
            java.lang.String r14 = "avc2"
            boolean r12 = r12.equals(r14)
            if (r12 != 0) goto L_0x00a0
            goto L_0x00ac
        L_0x00a0:
            r13 = r2
            goto L_0x00ac
        L_0x00a2:
            java.lang.String r14 = "avc1"
            boolean r12 = r12.equals(r14)
            if (r12 != 0) goto L_0x00ab
            goto L_0x00ac
        L_0x00ab:
            r13 = r3
        L_0x00ac:
            java.lang.String r14 = "MediaCodecUtil"
            if (r13 == 0) goto L_0x0151
            if (r13 == r2) goto L_0x0151
            if (r13 == r8) goto L_0x00b8
            if (r13 == r7) goto L_0x00b8
            goto L_0x0168
        L_0x00b8:
            int r13 = r10.length
            java.lang.String r15 = "Ignoring malformed HEVC codec string: "
            if (r13 >= r6) goto L_0x00d1
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r15)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            android.util.Log.w(r14, r10)
            goto L_0x0168
        L_0x00d1:
            java.util.regex.Pattern r13 = com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4880d.f13028b
            r12 = r10[r2]
            java.util.regex.Matcher r12 = r13.matcher(r12)
            boolean r13 = r12.matches()
            if (r13 != 0) goto L_0x00f3
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r15)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            android.util.Log.w(r14, r10)
            goto L_0x0168
        L_0x00f3:
            java.lang.String r13 = r12.group(r2)
            java.lang.String r15 = "1"
            boolean r15 = r15.equals(r13)
            if (r15 == 0) goto L_0x0101
            r13 = r2
            goto L_0x010a
        L_0x0101:
            java.lang.String r15 = "2"
            boolean r15 = r15.equals(r13)
            if (r15 == 0) goto L_0x013c
            r13 = r8
        L_0x010a:
            java.util.Map<java.lang.String, java.lang.Integer> r15 = com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4880d.f13032f
            r10 = r10[r7]
            java.util.HashMap r15 = (java.util.HashMap) r15
            java.lang.Object r10 = r15.get(r10)
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 != 0) goto L_0x0131
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r13 = "Unknown HEVC level string: "
            r10.append(r13)
            java.lang.String r12 = r12.group(r2)
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            android.util.Log.w(r14, r10)
            goto L_0x0168
        L_0x0131:
            android.util.Pair r12 = new android.util.Pair
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12.<init>(r13, r10)
            goto L_0x0222
        L_0x013c:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "Unknown HEVC profile string: "
            r10.append(r12)
            r10.append(r13)
            java.lang.String r10 = r10.toString()
            android.util.Log.w(r14, r10)
            goto L_0x0168
        L_0x0151:
            int r12 = r10.length
            java.lang.String r13 = "Ignoring malformed AVC codec string: "
            if (r12 >= r8) goto L_0x016b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r13)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            android.util.Log.w(r14, r10)
        L_0x0168:
            r12 = 0
            goto L_0x0222
        L_0x016b:
            r12 = r10[r2]     // Catch:{ NumberFormatException -> 0x020e }
            int r12 = r12.length()     // Catch:{ NumberFormatException -> 0x020e }
            r15 = 6
            if (r12 != r15) goto L_0x0191
            r12 = r10[r2]     // Catch:{ NumberFormatException -> 0x020e }
            java.lang.String r12 = r12.substring(r3, r8)     // Catch:{ NumberFormatException -> 0x020e }
            int r12 = java.lang.Integer.parseInt(r12, r5)     // Catch:{ NumberFormatException -> 0x020e }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ NumberFormatException -> 0x020e }
            r10 = r10[r2]     // Catch:{ NumberFormatException -> 0x020e }
            java.lang.String r10 = r10.substring(r6)     // Catch:{ NumberFormatException -> 0x020e }
            int r10 = java.lang.Integer.parseInt(r10, r5)     // Catch:{ NumberFormatException -> 0x020e }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ NumberFormatException -> 0x020e }
            goto L_0x01a8
        L_0x0191:
            int r12 = r10.length     // Catch:{ NumberFormatException -> 0x020e }
            if (r12 < r7) goto L_0x01fa
            r12 = r10[r2]     // Catch:{ NumberFormatException -> 0x020e }
            int r12 = java.lang.Integer.parseInt(r12)     // Catch:{ NumberFormatException -> 0x020e }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ NumberFormatException -> 0x020e }
            r10 = r10[r8]     // Catch:{ NumberFormatException -> 0x020e }
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x020e }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ NumberFormatException -> 0x020e }
        L_0x01a8:
            android.util.SparseIntArray r13 = com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4880d.f13030d
            int r15 = r12.intValue()
            int r13 = r13.get(r15)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            if (r13 != 0) goto L_0x01cd
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r13 = "Unknown AVC profile: "
            r10.append(r13)
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            android.util.Log.w(r14, r10)
            goto L_0x0168
        L_0x01cd:
            android.util.SparseIntArray r12 = com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4880d.f13031e
            int r15 = r10.intValue()
            int r12 = r12.get(r15)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            if (r12 != 0) goto L_0x01f3
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Unknown AVC level: "
            r12.append(r13)
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            android.util.Log.w(r14, r10)
            goto L_0x0168
        L_0x01f3:
            android.util.Pair r10 = new android.util.Pair
            r10.<init>(r13, r12)
            r12 = r10
            goto L_0x0222
        L_0x01fa:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x020e }
            r10.<init>()     // Catch:{ NumberFormatException -> 0x020e }
            r10.append(r13)     // Catch:{ NumberFormatException -> 0x020e }
            r10.append(r4)     // Catch:{ NumberFormatException -> 0x020e }
            java.lang.String r10 = r10.toString()     // Catch:{ NumberFormatException -> 0x020e }
            android.util.Log.w(r14, r10)     // Catch:{ NumberFormatException -> 0x020e }
            goto L_0x0168
        L_0x020e:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r13)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            android.util.Log.w(r14, r10)
            goto L_0x0168
        L_0x0222:
            if (r12 != 0) goto L_0x0225
            goto L_0x026f
        L_0x0225:
            android.media.MediaCodecInfo$CodecCapabilities r10 = r1.f12986e
            if (r10 == 0) goto L_0x022d
            android.media.MediaCodecInfo$CodecProfileLevel[] r10 = r10.profileLevels
            if (r10 != 0) goto L_0x022f
        L_0x022d:
            android.media.MediaCodecInfo$CodecProfileLevel[] r10 = new android.media.MediaCodecInfo.CodecProfileLevel[r3]
        L_0x022f:
            int r13 = r10.length
            r14 = r3
        L_0x0231:
            if (r14 >= r13) goto L_0x0253
            r15 = r10[r14]
            int r2 = r15.profile
            java.lang.Object r3 = r12.first
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r2 != r3) goto L_0x024e
            int r2 = r15.level
            java.lang.Object r3 = r12.second
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r2 < r3) goto L_0x024e
            goto L_0x026f
        L_0x024e:
            int r14 = r14 + 1
            r2 = 1
            r3 = 0
            goto L_0x0231
        L_0x0253:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "codec.profileLevel, "
            r2.append(r3)
            r2.append(r4)
            r2.append(r11)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            r1.mo25385a((java.lang.String) r2)
            r3 = 0
            goto L_0x0270
        L_0x026f:
            r3 = 1
        L_0x0270:
            if (r3 == 0) goto L_0x02c6
            int r2 = r0.f12960j
            if (r2 <= 0) goto L_0x02c6
            int r4 = r0.f12961k
            if (r4 <= 0) goto L_0x02c6
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.f13471a
            r9 = 21
            if (r3 < r9) goto L_0x0288
            float r0 = r0.f12962l
            double r9 = (double) r0
            boolean r3 = r1.mo25386a(r2, r4, r9)
            goto L_0x02c6
        L_0x0288:
            int r2 = r2 * r4
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4880d.m15013a()
            if (r2 > r3) goto L_0x0291
            r2 = 1
            goto L_0x0292
        L_0x0291:
            r2 = 0
        L_0x0292:
            if (r2 != 0) goto L_0x02c5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "FalseCheck [legacyFrameSize, "
            r3.append(r4)
            int r4 = r0.f12960j
            r3.append(r4)
            java.lang.String r4 = "x"
            r3.append(r4)
            int r0 = r0.f12961k
            r3.append(r0)
            java.lang.String r0 = "] ["
            r3.append(r0)
            java.lang.String r0 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.f13475e
            r3.append(r0)
            java.lang.String r0 = "]"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "MediaCodecVideoRenderer"
            android.util.Log.d(r3, r0)
        L_0x02c5:
            r3 = r2
        L_0x02c6:
            boolean r0 = r1.f12983b
            if (r0 == 0) goto L_0x02cc
            r6 = 8
        L_0x02cc:
            boolean r0 = r1.f12984c
            if (r0 == 0) goto L_0x02d3
            r16 = r5
            goto L_0x02d5
        L_0x02d3:
            r16 = 0
        L_0x02d5:
            if (r3 == 0) goto L_0x02d8
            goto L_0x02d9
        L_0x02d8:
            r7 = r8
        L_0x02d9:
            r0 = r6 | r16
            r0 = r0 | r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer.mo25047a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c, com.fyber.inneractive.sdk.player.exoplayer2.i):int");
    }

    public boolean isReady() {
        if ((this.f13490e0 || super.mo25394x()) && super.isReady()) {
            this.f13491f0 = -9223372036854775807L;
            return true;
        } else if (this.f13491f0 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f13491f0) {
                return true;
            }
            this.f13491f0 = -9223372036854775807L;
            return false;
        }
    }

    /* renamed from: p */
    public void mo25026p() {
        this.f13497l0 = -1;
        this.f13498m0 = -1;
        this.f13500o0 = -1.0f;
        this.f13496k0 = -1.0f;
        mo25646z();
        mo25645y();
        C5064d dVar = this.f13481V;
        dVar.getClass();
        dVar.f13544a.f13556b.sendEmptyMessage(2);
        this.f13507v0 = null;
        try {
            super.mo25026p();
        } finally {
            this.f13007T.ensureUpdated();
            this.f13482W.disabled(this.f13007T);
        }
    }

    /* renamed from: q */
    public void mo25027q() {
        this.f13493h0 = 0;
        this.f13492g0 = SystemClock.elapsedRealtime();
    }

    /* renamed from: r */
    public void mo25028r() {
        this.f13491f0 = -9223372036854775807L;
        mo25638B();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f13488c0;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo25394x() {
        /*
            r1 = this;
            boolean r0 = super.mo25394x()
            if (r0 == 0) goto L_0x0012
            android.view.Surface r0 = r1.f13488c0
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isValid()
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer.mo25394x():boolean");
    }

    /* renamed from: y */
    public final void mo25645y() {
        MediaCodec mediaCodec;
        this.f13490e0 = false;
        if (C5049u.f13471a >= 23 && this.f13505t0 && (mediaCodec = this.f13017r) != null) {
            this.f13507v0 = new C5052b(mediaCodec);
        }
    }

    /* renamed from: z */
    public final void mo25646z() {
        this.f13501p0 = -1;
        this.f13502q0 = -1;
        this.f13504s0 = -1.0f;
        this.f13503r0 = -1;
    }

    /* renamed from: a */
    public void mo25013a(C4869i[] iVarArr) throws C4697d {
        this.f13486a0 = iVarArr;
    }

    /* renamed from: a */
    public void mo25010a(long j, boolean z) throws C4697d {
        super.mo25010a(j, z);
        mo25645y();
        this.f13494i0 = 0;
        if (z) {
            mo25642F();
        } else {
            this.f13491f0 = -9223372036854775807L;
        }
    }

    /* renamed from: a */
    public void mo25050a(int i, Object obj) throws C4697d {
        if (i == 1) {
            Surface surface = (Surface) obj;
            if (this.f13488c0 != surface) {
                this.f13488c0 = surface;
                int i2 = this.f11669d;
                if (i2 == 1 || i2 == 2) {
                    MediaCodec mediaCodec = this.f13017r;
                    if (C5049u.f13471a < 23 || mediaCodec == null || surface == null) {
                        mo25393v();
                        mo25391t();
                    } else {
                        mediaCodec.setOutputSurface(surface);
                    }
                }
                if (surface != null) {
                    mo25641E();
                    mo25645y();
                    if (i2 == 2) {
                        mo25642F();
                        return;
                    }
                    return;
                }
                mo25646z();
                mo25645y();
            } else if (surface != null) {
                mo25641E();
                if (this.f13490e0) {
                    this.f13482W.renderedFirstFrame(this.f13488c0);
                }
            }
        } else if (i == 4) {
            int intValue = ((Integer) obj).intValue();
            this.f13489d0 = intValue;
            MediaCodec mediaCodec2 = this.f13017r;
            if (mediaCodec2 != null) {
                mediaCodec2.setVideoScalingMode(intValue);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0135, code lost:
        r14 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00ff A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0127 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25053a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4875a r23, android.media.MediaCodec r24, com.fyber.inneractive.sdk.player.exoplayer2.C4869i r25, android.media.MediaCrypto r26) throws com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4880d.C4882b {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            com.fyber.inneractive.sdk.player.exoplayer2.i[] r4 = r0.f13486a0
            int r5 = r3.f12960j
            int r6 = r3.f12961k
            int r7 = r3.f12957g
            r8 = -1
            if (r7 == r8) goto L_0x0014
            goto L_0x001a
        L_0x0014:
            java.lang.String r7 = r3.f12956f
            int r7 = m15400a((java.lang.String) r7, (int) r5, (int) r6)
        L_0x001a:
            int r9 = r4.length
            r11 = 1
            if (r9 != r11) goto L_0x0025
            com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer$a r1 = new com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer$a
            r1.<init>(r5, r6, r7)
            goto L_0x016d
        L_0x0025:
            int r9 = r4.length
            r13 = 0
            r14 = 0
        L_0x0028:
            if (r13 >= r9) goto L_0x0062
            r15 = r4[r13]
            boolean r10 = r1.f12983b
            boolean r10 = m15401a((boolean) r10, (com.fyber.inneractive.sdk.player.exoplayer2.C4869i) r3, (com.fyber.inneractive.sdk.player.exoplayer2.C4869i) r15)
            if (r10 == 0) goto L_0x005e
            int r10 = r15.f12960j
            if (r10 == r8) goto L_0x003f
            int r11 = r15.f12961k
            if (r11 != r8) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r11 = 0
            goto L_0x0040
        L_0x003f:
            r11 = 1
        L_0x0040:
            r14 = r14 | r11
            int r5 = java.lang.Math.max(r5, r10)
            int r10 = r15.f12961k
            int r6 = java.lang.Math.max(r6, r10)
            int r10 = r15.f12957g
            if (r10 == r8) goto L_0x0050
            goto L_0x005a
        L_0x0050:
            java.lang.String r10 = r15.f12956f
            int r11 = r15.f12960j
            int r15 = r15.f12961k
            int r10 = m15400a((java.lang.String) r10, (int) r11, (int) r15)
        L_0x005a:
            int r7 = java.lang.Math.max(r7, r10)
        L_0x005e:
            int r13 = r13 + 1
            r11 = 1
            goto L_0x0028
        L_0x0062:
            if (r14 == 0) goto L_0x0168
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "Resolutions unknown. Codec max resolution: "
            r4.append(r9)
            r4.append(r5)
            java.lang.String r9 = "x"
            r4.append(r9)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.String r10 = "MediaCodecVideoRenderer"
            android.util.Log.w(r10, r4)
            int r4 = r3.f12961k
            int r11 = r3.f12960j
            if (r4 <= r11) goto L_0x008a
            r13 = 1
            goto L_0x008b
        L_0x008a:
            r13 = 0
        L_0x008b:
            if (r13 == 0) goto L_0x008f
            r14 = r4
            goto L_0x0090
        L_0x008f:
            r14 = r11
        L_0x0090:
            if (r13 == 0) goto L_0x0093
            r4 = r11
        L_0x0093:
            float r11 = (float) r4
            float r15 = (float) r14
            float r11 = r11 / r15
            int[] r15 = f13480w0
            int r12 = r15.length
            r8 = 0
        L_0x009a:
            if (r8 >= r12) goto L_0x0135
            r16 = r12
            r12 = r15[r8]
            r17 = r15
            float r15 = (float) r12
            float r15 = r15 * r11
            int r15 = (int) r15
            if (r12 <= r14) goto L_0x0135
            if (r15 > r4) goto L_0x00ab
            goto L_0x0135
        L_0x00ab:
            r18 = r4
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.f13471a
            r19 = r11
            r11 = 21
            if (r4 < r11) goto L_0x0102
            if (r13 == 0) goto L_0x00b9
            r4 = r15
            goto L_0x00ba
        L_0x00b9:
            r4 = r12
        L_0x00ba:
            if (r13 == 0) goto L_0x00bd
            goto L_0x00be
        L_0x00bd:
            r12 = r15
        L_0x00be:
            android.media.MediaCodecInfo$CodecCapabilities r11 = r1.f12986e
            if (r11 != 0) goto L_0x00cb
            java.lang.String r4 = "align.caps"
            r1.mo25385a((java.lang.String) r4)
        L_0x00c7:
            r20 = r14
            r14 = 0
            goto L_0x00f0
        L_0x00cb:
            android.media.MediaCodecInfo$VideoCapabilities r11 = r11.getVideoCapabilities()
            if (r11 != 0) goto L_0x00d7
            java.lang.String r4 = "align.vCaps"
            r1.mo25385a((java.lang.String) r4)
            goto L_0x00c7
        L_0x00d7:
            int r15 = r11.getWidthAlignment()
            int r11 = r11.getHeightAlignment()
            r20 = r14
            android.graphics.Point r14 = new android.graphics.Point
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15385a((int) r4, (int) r15)
            int r4 = r4 * r15
            int r12 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15385a((int) r12, (int) r11)
            int r12 = r12 * r11
            r14.<init>(r4, r12)
        L_0x00f0:
            float r4 = r3.f12962l
            int r11 = r14.x
            int r12 = r14.y
            r21 = r14
            double r14 = (double) r4
            boolean r4 = r1.mo25386a(r11, r12, r14)
            if (r4 == 0) goto L_0x0127
            r14 = r21
            goto L_0x0136
        L_0x0102:
            r20 = r14
            r4 = 16
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15385a((int) r12, (int) r4)
            int r11 = r11 * r4
            int r12 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15385a((int) r15, (int) r4)
            int r12 = r12 * r4
            int r4 = r11 * r12
            int r14 = com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4880d.m15013a()
            if (r4 > r14) goto L_0x0127
            android.graphics.Point r14 = new android.graphics.Point
            if (r13 == 0) goto L_0x011e
            r1 = r12
            goto L_0x011f
        L_0x011e:
            r1 = r11
        L_0x011f:
            if (r13 == 0) goto L_0x0122
            goto L_0x0123
        L_0x0122:
            r11 = r12
        L_0x0123:
            r14.<init>(r1, r11)
            goto L_0x0136
        L_0x0127:
            int r8 = r8 + 1
            r12 = r16
            r15 = r17
            r4 = r18
            r11 = r19
            r14 = r20
            goto L_0x009a
        L_0x0135:
            r14 = 0
        L_0x0136:
            if (r14 == 0) goto L_0x0168
            int r1 = r14.x
            int r5 = java.lang.Math.max(r5, r1)
            int r1 = r14.y
            int r6 = java.lang.Math.max(r6, r1)
            java.lang.String r1 = r3.f12956f
            int r1 = m15400a((java.lang.String) r1, (int) r5, (int) r6)
            int r7 = java.lang.Math.max(r7, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Codec max resolution adjusted to: "
            r1.append(r4)
            r1.append(r5)
            r1.append(r9)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r10, r1)
        L_0x0168:
            com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer$a r1 = new com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer$a
            r1.<init>(r5, r6, r7)
        L_0x016d:
            r0.f13487b0 = r1
            boolean r4 = r0.f13485Z
            int r5 = r0.f13506u0
            android.media.MediaFormat r3 = r25.mo25373a()
            int r6 = r1.f13508a
            java.lang.String r7 = "max-width"
            r3.setInteger(r7, r6)
            int r6 = r1.f13509b
            java.lang.String r7 = "max-height"
            r3.setInteger(r7, r6)
            int r1 = r1.f13510c
            r6 = -1
            if (r1 == r6) goto L_0x018f
            java.lang.String r6 = "max-input-size"
            r3.setInteger(r6, r1)
        L_0x018f:
            if (r4 == 0) goto L_0x0198
            java.lang.String r1 = "auto-frc"
            r4 = 0
            r3.setInteger(r1, r4)
            goto L_0x0199
        L_0x0198:
            r4 = 0
        L_0x0199:
            if (r5 == 0) goto L_0x01a6
            java.lang.String r1 = "tunneled-playback"
            r6 = 1
            r3.setFeatureEnabled(r1, r6)
            java.lang.String r1 = "audio-session-id"
            r3.setInteger(r1, r5)
        L_0x01a6:
            android.view.Surface r1 = r0.f13488c0
            r5 = 0
            r2.configure(r3, r1, r5, r4)
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.f13471a
            r3 = 23
            if (r1 < r3) goto L_0x01bd
            boolean r1 = r0.f13505t0
            if (r1 == 0) goto L_0x01bd
            com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer$b r1 = new com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer$b
            r1.<init>(r2)
            r0.f13507v0 = r1
        L_0x01bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer.mo25053a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a, android.media.MediaCodec, com.fyber.inneractive.sdk.player.exoplayer2.i, android.media.MediaCrypto):void");
    }

    /* renamed from: a */
    public void mo25054a(String str, long j, long j2) {
        this.f13482W.decoderInitialized(str, j, j2);
    }

    /* renamed from: a */
    public void mo25052a(C4869i iVar) throws C4697d {
        super.mo25052a(iVar);
        this.f13482W.inputFormatChanged(iVar);
        float f = iVar.f12964n;
        if (f == -1.0f) {
            f = 1.0f;
        }
        this.f13496k0 = f;
        int i = iVar.f12963m;
        if (i == -1) {
            i = 0;
        }
        this.f13495j0 = i;
    }

    /* renamed from: a */
    public void mo25388a(C4701b bVar) {
        if (C5049u.f13471a < 23 && this.f13505t0) {
            mo25639C();
        }
    }

    /* renamed from: a */
    public void mo25051a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int i2;
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        if (z) {
            i = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            i = mediaFormat.getInteger("width");
        }
        this.f13497l0 = i;
        if (z) {
            i2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            i2 = mediaFormat.getInteger("height");
        }
        this.f13498m0 = i2;
        float f = this.f13496k0;
        this.f13500o0 = f;
        if (C5049u.f13471a >= 21) {
            int i3 = this.f13495j0;
            if (i3 == 90 || i3 == 270) {
                int i4 = this.f13497l0;
                this.f13497l0 = i2;
                this.f13498m0 = i4;
                this.f13500o0 = 1.0f / f;
            }
        } else {
            this.f13499n0 = this.f13495j0;
        }
        mediaCodec.setVideoScalingMode(this.f13489d0);
    }

    /* renamed from: a */
    public void mo25012a(boolean z) throws C4697d {
        DecoderCounters decoderCounters = new DecoderCounters();
        this.f13007T = decoderCounters;
        int i = this.f11667b.f13075a;
        this.f13506u0 = i;
        this.f13505t0 = i != 0;
        this.f13482W.enabled(decoderCounters);
        C5064d dVar = this.f13481V;
        dVar.f13550g = false;
        dVar.f13544a.f13556b.sendEmptyMessage(1);
    }

    /* renamed from: a */
    public boolean mo25389a(MediaCodec mediaCodec, boolean z, C4869i iVar, C4869i iVar2) {
        if (m15401a(z, iVar, iVar2)) {
            int i = iVar2.f12960j;
            C5051a aVar = this.f13487b0;
            return i <= aVar.f13508a && iVar2.f12961k <= aVar.f13509b && iVar2.f12957g <= aVar.f13510c;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0124  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo25055a(long r20, long r22, android.media.MediaCodec r24, java.nio.ByteBuffer r25, int r26, int r27, long r28, boolean r30) {
        /*
            r19 = this;
            r0 = r19
            r1 = r24
            r2 = r26
            r3 = r28
            r5 = 0
            r6 = 1
            if (r30 == 0) goto L_0x001f
            java.lang.String r3 = "skipVideoBuffer"
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5047s.m15380a(r3)
            r1.releaseOutputBuffer(r2, r5)
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5047s.m15379a()
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters r1 = r0.f13007T
            int r2 = r1.skippedOutputBufferCount
            int r2 = r2 + r6
            r1.skippedOutputBufferCount = r2
            return r6
        L_0x001f:
            boolean r7 = r0.f13490e0
            r8 = 21
            if (r7 != 0) goto L_0x0035
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.f13471a
            if (r3 < r8) goto L_0x0031
            long r3 = java.lang.System.nanoTime()
            r0.mo25644a((android.media.MediaCodec) r1, (int) r2, (long) r3)
            goto L_0x0034
        L_0x0031:
            r0.mo25643a((android.media.MediaCodec) r1, (int) r2)
        L_0x0034:
            return r6
        L_0x0035:
            int r7 = r0.f11669d
            r9 = 2
            if (r7 == r9) goto L_0x003b
            return r5
        L_0x003b:
            long r9 = android.os.SystemClock.elapsedRealtime()
            r11 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r11
            long r9 = r9 - r22
            long r13 = r3 - r20
            long r13 = r13 - r9
            long r9 = java.lang.System.nanoTime()
            long r13 = r13 * r11
            long r13 = r13 + r9
            com.fyber.inneractive.sdk.player.exoplayer2.video.d r7 = r0.f13481V
            r20 = r9
            long r8 = r3 * r11
            boolean r10 = r7.f13550g
            if (r10 == 0) goto L_0x009a
            long r11 = r7.f13547d
            int r10 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r10 == 0) goto L_0x0068
            long r10 = r7.f13553j
            r15 = 1
            long r10 = r10 + r15
            r7.f13553j = r10
            long r10 = r7.f13549f
            r7.f13548e = r10
        L_0x0068:
            long r10 = r7.f13553j
            r15 = 6
            int r12 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r12 < 0) goto L_0x008f
            long r5 = r7.f13552i
            long r5 = r8 - r5
            long r5 = r5 / r10
            long r10 = r7.f13548e
            long r10 = r10 + r5
            boolean r5 = r7.mo25669a(r10, r13)
            if (r5 == 0) goto L_0x0082
            r5 = 0
            r7.f13550g = r5
            goto L_0x009a
        L_0x0082:
            long r5 = r7.f13551h
            long r5 = r5 + r10
            r22 = r13
            long r12 = r7.f13552i
            long r5 = r5 - r12
            r13 = r10
            r10 = r5
            r5 = r22
            goto L_0x009d
        L_0x008f:
            r5 = r13
            boolean r10 = r7.mo25669a(r8, r5)
            if (r10 == 0) goto L_0x009b
            r10 = 0
            r7.f13550g = r10
            goto L_0x009b
        L_0x009a:
            r5 = r13
        L_0x009b:
            r10 = r5
            r13 = r8
        L_0x009d:
            boolean r12 = r7.f13550g
            r0 = 0
            if (r12 != 0) goto L_0x00ac
            r7.f13552i = r8
            r7.f13551h = r5
            r7.f13553j = r0
            r5 = 1
            r7.f13550g = r5
        L_0x00ac:
            r7.f13547d = r3
            r7.f13549f = r13
            com.fyber.inneractive.sdk.player.exoplayer2.video.d$a r3 = r7.f13544a
            if (r3 == 0) goto L_0x00e0
            long r3 = r3.f13555a
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00bb
            goto L_0x00e0
        L_0x00bb:
            com.fyber.inneractive.sdk.player.exoplayer2.video.d$a r0 = r7.f13544a
            long r0 = r0.f13555a
            long r3 = r7.f13545b
            long r5 = r10 - r0
            long r5 = r5 / r3
            long r5 = r5 * r3
            long r0 = r0 + r5
            int r5 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r5 > 0) goto L_0x00cd
            long r3 = r0 - r3
            goto L_0x00d3
        L_0x00cd:
            long r3 = r3 + r0
            r17 = r0
            r0 = r3
            r3 = r17
        L_0x00d3:
            long r5 = r0 - r10
            long r10 = r10 - r3
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 >= 0) goto L_0x00db
            goto L_0x00dc
        L_0x00db:
            r0 = r3
        L_0x00dc:
            long r3 = r7.f13546c
            long r10 = r0 - r3
        L_0x00e0:
            long r0 = r10 - r20
            r3 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r3
            r3 = -30000(0xffffffffffff8ad0, double:NaN)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x00ed
            r3 = 1
            goto L_0x00ee
        L_0x00ed:
            r3 = 0
        L_0x00ee:
            if (r3 == 0) goto L_0x0124
            java.lang.String r0 = "dropVideoBuffer"
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5047s.m15380a(r0)
            r3 = r24
            r0 = 0
            r3.releaseOutputBuffer(r2, r0)
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5047s.m15379a()
            r4 = r19
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters r0 = r4.f13007T
            int r1 = r0.droppedOutputBufferCount
            r5 = 1
            int r1 = r1 + r5
            r0.droppedOutputBufferCount = r1
            int r1 = r4.f13493h0
            int r1 = r1 + r5
            r4.f13493h0 = r1
            int r1 = r4.f13494i0
            int r1 = r1 + r5
            r4.f13494i0 = r1
            int r2 = r0.maxConsecutiveDroppedOutputBufferCount
            int r1 = java.lang.Math.max(r1, r2)
            r0.maxConsecutiveDroppedOutputBufferCount = r1
            int r0 = r4.f13493h0
            int r1 = r4.f13484Y
            if (r0 != r1) goto L_0x0123
            r19.mo25638B()
        L_0x0123:
            return r5
        L_0x0124:
            r4 = r19
            r3 = r24
            r5 = 1
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.f13471a
            r7 = 21
            if (r6 < r7) goto L_0x013a
            r6 = 50000(0xc350, double:2.47033E-319)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x015c
            r4.mo25644a((android.media.MediaCodec) r3, (int) r2, (long) r10)
            return r5
        L_0x013a:
            r5 = 30000(0x7530, double:1.4822E-319)
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x015c
            r5 = 11000(0x2af8, double:5.4347E-320)
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0157
            r5 = 10000(0x2710, double:4.9407E-320)
            long r0 = r0 - r5
            r5 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r5
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0150 }
            goto L_0x0157
        L_0x0150:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0157:
            r4.mo25643a((android.media.MediaCodec) r3, (int) r2)
            r0 = 1
            return r0
        L_0x015c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer.mo25055a(long, long, android.media.MediaCodec, java.nio.ByteBuffer, int, int, long, boolean):boolean");
    }

    /* renamed from: a */
    public final void mo25643a(MediaCodec mediaCodec, int i) {
        mo25640D();
        C5047s.m15380a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        C5047s.m15379a();
        this.f13007T.renderedOutputBufferCount++;
        this.f13494i0 = 0;
        mo25639C();
    }

    /* renamed from: a */
    public final void mo25644a(MediaCodec mediaCodec, int i, long j) {
        mo25640D();
        C5047s.m15380a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j);
        C5047s.m15379a();
        this.f13007T.renderedOutputBufferCount++;
        this.f13494i0 = 0;
        mo25639C();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m15400a(java.lang.String r7, int r8, int r9) {
        /*
            r0 = -1
            if (r8 == r0) goto L_0x0088
            if (r9 != r0) goto L_0x0007
            goto L_0x0088
        L_0x0007:
            r7.getClass()
            int r1 = r7.hashCode()
            r2 = 5
            r3 = 1
            r4 = 4
            r5 = 3
            r6 = 2
            switch(r1) {
                case -1664118616: goto L_0x004e;
                case -1662541442: goto L_0x0043;
                case 1187890754: goto L_0x0038;
                case 1331836730: goto L_0x002d;
                case 1599127256: goto L_0x0022;
                case 1599127257: goto L_0x0017;
                default: goto L_0x0016;
            }
        L_0x0016:
            goto L_0x0059
        L_0x0017:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0020
            goto L_0x0059
        L_0x0020:
            r7 = r2
            goto L_0x005a
        L_0x0022:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x002b
            goto L_0x0059
        L_0x002b:
            r7 = r4
            goto L_0x005a
        L_0x002d:
            java.lang.String r1 = "video/avc"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0036
            goto L_0x0059
        L_0x0036:
            r7 = r5
            goto L_0x005a
        L_0x0038:
            java.lang.String r1 = "video/mp4v-es"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0041
            goto L_0x0059
        L_0x0041:
            r7 = r6
            goto L_0x005a
        L_0x0043:
            java.lang.String r1 = "video/hevc"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x004c
            goto L_0x0059
        L_0x004c:
            r7 = r3
            goto L_0x005a
        L_0x004e:
            java.lang.String r1 = "video/3gpp"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0057
            goto L_0x0059
        L_0x0057:
            r7 = 0
            goto L_0x005a
        L_0x0059:
            r7 = r0
        L_0x005a:
            if (r7 == 0) goto L_0x0082
            if (r7 == r3) goto L_0x0080
            if (r7 == r6) goto L_0x0082
            if (r7 == r5) goto L_0x0067
            if (r7 == r4) goto L_0x0082
            if (r7 == r2) goto L_0x0080
            return r0
        L_0x0067:
            java.lang.String r7 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.f13474d
            java.lang.String r1 = "BRAVIA 4K 2015"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L_0x0072
            return r0
        L_0x0072:
            r7 = 16
            int r8 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15385a((int) r8, (int) r7)
            int r9 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15385a((int) r9, (int) r7)
            int r8 = r8 * r9
            int r8 = r8 * r7
            int r8 = r8 * r7
            goto L_0x0083
        L_0x0080:
            int r8 = r8 * r9
            goto L_0x0084
        L_0x0082:
            int r8 = r8 * r9
        L_0x0083:
            r4 = r6
        L_0x0084:
            int r8 = r8 * r5
            int r4 = r4 * r6
            int r8 = r8 / r4
            return r8
        L_0x0088:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer.m15400a(java.lang.String, int, int):int");
    }

    /* renamed from: a */
    public static boolean m15401a(boolean z, C4869i iVar, C4869i iVar2) {
        if (!iVar.f12956f.equals(iVar2.f12956f)) {
            return false;
        }
        int i = iVar.f12963m;
        if (i == -1) {
            i = 0;
        }
        int i2 = iVar2.f12963m;
        if (i2 == -1) {
            i2 = 0;
        }
        if (i != i2) {
            return false;
        }
        if (z || (iVar.f12960j == iVar2.f12960j && iVar.f12961k == iVar2.f12961k)) {
            return true;
        }
        return false;
    }
}
