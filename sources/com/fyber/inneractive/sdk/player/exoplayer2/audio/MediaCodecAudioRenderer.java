package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.support.p003v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.Surface;
import com.fyber.inneractive.sdk.player.exoplayer2.C4697d;
import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.C4874m;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.C4681c;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4708c;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4709d;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4875a;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4876b;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4878c;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4880d;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5030g;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

public class MediaCodecAudioRenderer extends C4876b implements C5030g {

    /* renamed from: V */
    public final AudioRendererEventListener.EventDispatcher f11690V;

    /* renamed from: W */
    public final C4681c f11691W;

    /* renamed from: X */
    public boolean f11692X;

    /* renamed from: Y */
    public int f11693Y;

    /* renamed from: Z */
    public int f11694Z;

    /* renamed from: a0 */
    public long f11695a0;

    /* renamed from: b0 */
    public boolean f11696b0;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.MediaCodecAudioRenderer$b */
    public final class C4677b implements C4681c.C4687f {
        public C4677b() {
        }
    }

    public MediaCodecAudioRenderer(C4878c cVar, C4708c<C4709d> cVar2, boolean z, Handler handler, AudioRendererEventListener audioRendererEventListener) {
        this(cVar, cVar2, z, (Handler) null, (AudioRendererEventListener) null, new C4679b[0]);
    }

    /* renamed from: b */
    public boolean mo25056b() {
        if (this.f13004Q) {
            C4681c cVar = this.f11691W;
            if (!cVar.mo25082e() || (cVar.f11728X && !cVar.mo25081d())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public C4874m mo25057i() {
        return this.f11691W.f11752s;
    }

    public boolean isReady() {
        return this.f11691W.mo25081d() || super.isReady();
    }

    /* renamed from: j */
    public C5030g mo25021j() {
        return this;
    }

    /* renamed from: o */
    public long mo25059o() {
        long j;
        long j2;
        long j3;
        long j4;
        C4681c cVar = this.f11691W;
        boolean b = mo25056b();
        if (!(cVar.mo25082e() && cVar.f11716L != 0)) {
            j2 = Long.MIN_VALUE;
            j = Long.MIN_VALUE;
        } else {
            if (cVar.f11742i.getPlayState() == 3) {
                C4681c.C4683b bVar = cVar.f11740g;
                long a = (bVar.mo25090a() * 1000000) / ((long) bVar.f11764c);
                if (a != 0) {
                    long nanoTime = System.nanoTime() / 1000;
                    if (nanoTime - cVar.f11705A >= 30000) {
                        long[] jArr = cVar.f11739f;
                        int i = cVar.f11757x;
                        jArr[i] = a - nanoTime;
                        cVar.f11757x = (i + 1) % 10;
                        int i2 = cVar.f11758y;
                        if (i2 < 10) {
                            cVar.f11758y = i2 + 1;
                        }
                        cVar.f11705A = nanoTime;
                        cVar.f11759z = 0;
                        int i3 = 0;
                        while (true) {
                            int i4 = cVar.f11758y;
                            if (i3 >= i4) {
                                break;
                            }
                            cVar.f11759z += cVar.f11739f[i3] / ((long) i4);
                            i3++;
                        }
                    }
                    if (!cVar.mo25083f() && nanoTime - cVar.f11707C >= 500000) {
                        boolean d = cVar.f11740g.mo25094d();
                        cVar.f11706B = d;
                        if (d) {
                            long c = cVar.f11740g.mo25093c() / 1000;
                            long b2 = cVar.f11740g.mo25092b();
                            if (c < cVar.f11718N) {
                                cVar.f11706B = false;
                            } else if (Math.abs(c - nanoTime) > 5000000) {
                                Log.w("AudioTrack", "Spurious audio timestamp (system clock mismatch): " + b2 + ", " + c + ", " + nanoTime + ", " + a + ", " + cVar.mo25076b() + ", " + cVar.mo25079c());
                                cVar.f11706B = false;
                            } else {
                                long j5 = b2;
                                if (Math.abs(cVar.mo25077b(j5) - a) > 5000000) {
                                    Log.w("AudioTrack", "Spurious audio timestamp (frame position mismatch): " + j5 + ", " + c + ", " + nanoTime + ", " + a + ", " + cVar.mo25076b() + ", " + cVar.mo25079c());
                                    cVar.f11706B = false;
                                }
                            }
                        }
                        Method method = cVar.f11708D;
                        if (method != null && !cVar.f11748o) {
                            try {
                                long intValue = (((long) ((Integer) method.invoke(cVar.f11742i, (Object[]) null)).intValue()) * 1000) - cVar.f11750q;
                                cVar.f11719O = intValue;
                                long max = Math.max(intValue, 0);
                                cVar.f11719O = max;
                                if (max > 5000000) {
                                    Log.w("AudioTrack", "Ignoring impossibly large audio latency: " + cVar.f11719O);
                                    cVar.f11719O = 0;
                                }
                            } catch (Exception unused) {
                                cVar.f11708D = null;
                            }
                        }
                        cVar.f11707C = nanoTime;
                    }
                }
            }
            long nanoTime2 = System.nanoTime() / 1000;
            if (cVar.f11706B) {
                j3 = cVar.mo25077b(cVar.f11740g.mo25092b() + cVar.mo25071a(nanoTime2 - (cVar.f11740g.mo25093c() / 1000)));
            } else {
                if (cVar.f11758y == 0) {
                    C4681c.C4683b bVar2 = cVar.f11740g;
                    j3 = (bVar2.mo25090a() * 1000000) / ((long) bVar2.f11764c);
                } else {
                    j3 = nanoTime2 + cVar.f11759z;
                }
                if (!b) {
                    j3 -= cVar.f11719O;
                }
            }
            long j6 = cVar.f11717M;
            while (!cVar.f11741h.isEmpty() && j3 >= cVar.f11741h.getFirst().f11777c) {
                C4681c.C4688g remove = cVar.f11741h.remove();
                cVar.f11752s = remove.f11775a;
                cVar.f11754u = remove.f11777c;
                cVar.f11753t = remove.f11776b - cVar.f11717M;
            }
            if (cVar.f11752s.f12979a == 1.0f) {
                j4 = (j3 + cVar.f11753t) - cVar.f11754u;
            } else {
                if (cVar.f11741h.isEmpty()) {
                    C4694h hVar = cVar.f11733b;
                    long j7 = hVar.f11828k;
                    if (j7 >= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
                        j4 = cVar.f11753t + C5049u.m15388a(j3 - cVar.f11754u, hVar.f11827j, j7);
                    }
                }
                j4 = cVar.f11753t + ((long) (((double) cVar.f11752s.f12979a) * ((double) (j3 - cVar.f11754u))));
            }
            j = j6 + j4;
            j2 = Long.MIN_VALUE;
        }
        if (j != j2) {
            if (!this.f11696b0) {
                j = Math.max(this.f11695a0, j);
            }
            this.f11695a0 = j;
            this.f11696b0 = false;
        }
        return this.f11695a0;
    }

    /* renamed from: p */
    public void mo25026p() {
        try {
            C4681c cVar = this.f11691W;
            cVar.mo25085h();
            for (C4679b g : cVar.f11735c) {
                g.mo25070g();
            }
            cVar.f11730Z = 0;
            cVar.f11729Y = false;
            try {
                super.mo25026p();
            } finally {
                this.f13007T.ensureUpdated();
                this.f11690V.disabled(this.f13007T);
            }
        } catch (Throwable th) {
            super.mo25026p();
            throw th;
        } finally {
            this.f13007T.ensureUpdated();
            this.f11690V.disabled(this.f13007T);
        }
    }

    /* renamed from: q */
    public void mo25027q() {
        this.f11691W.mo25084g();
    }

    /* renamed from: r */
    public void mo25028r() {
        C4681c cVar = this.f11691W;
        cVar.f11729Y = false;
        if (cVar.mo25082e()) {
            cVar.mo25087j();
            C4681c.C4683b bVar = cVar.f11740g;
            if (bVar.f11768g == -9223372036854775807L) {
                bVar.f11762a.pause();
            }
        }
    }

    /* renamed from: w */
    public void mo25060w() throws C4697d {
        try {
            C4681c cVar = this.f11691W;
            if (cVar.f11728X) {
                return;
            }
            if (cVar.mo25082e()) {
                if (cVar.mo25074a()) {
                    C4681c.C4683b bVar = cVar.f11740g;
                    long c = cVar.mo25079c();
                    bVar.f11769h = bVar.mo25090a();
                    bVar.f11768g = SystemClock.elapsedRealtime() * 1000;
                    bVar.f11770i = c;
                    bVar.f11762a.stop();
                    cVar.f11756w = 0;
                    cVar.f11728X = true;
                }
            }
        } catch (C4681c.C4689h e) {
            throw C4697d.m14459a(e, this.f11668c);
        }
    }

    public MediaCodecAudioRenderer(C4878c cVar, C4708c cVar2, boolean z, Handler handler, AudioRendererEventListener audioRendererEventListener, C4679b... bVarArr) {
        super(1, cVar, cVar2, z);
        this.f11691W = new C4681c(bVarArr, new C4677b());
        this.f11690V = new AudioRendererEventListener.EventDispatcher(handler, audioRendererEventListener);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        if (r4 == false) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x013f, code lost:
        if (r10 == false) goto L_0x0142;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo25047a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4878c r10, com.fyber.inneractive.sdk.player.exoplayer2.C4869i r11) throws com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4880d.C4882b {
        /*
            r9 = this;
            java.lang.String r0 = r11.f12956f
            boolean r1 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5031h.m15318d(r0)
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.f13471a
            r3 = 16
            r4 = 21
            if (r1 < r4) goto L_0x0014
            r5 = r3
            goto L_0x0015
        L_0x0014:
            r5 = r2
        L_0x0015:
            com.fyber.inneractive.sdk.player.exoplayer2.audio.c r6 = r9.f11691W
            r6.getClass()
            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a r10 = r10.mo25395a(r0, r2)
            r0 = 1
            if (r10 != 0) goto L_0x0022
            return r0
        L_0x0022:
            if (r1 < r4) goto L_0x0141
            int r4 = r11.f12969s
            r6 = -1
            if (r4 == r6) goto L_0x005e
            android.media.MediaCodecInfo$CodecCapabilities r7 = r10.f12986e
            if (r7 != 0) goto L_0x0034
            java.lang.String r4 = "sampleRate.caps"
            r10.mo25385a((java.lang.String) r4)
        L_0x0032:
            r4 = r2
            goto L_0x005c
        L_0x0034:
            android.media.MediaCodecInfo$AudioCapabilities r7 = r7.getAudioCapabilities()
            if (r7 != 0) goto L_0x0040
            java.lang.String r4 = "sampleRate.aCaps"
            r10.mo25385a((java.lang.String) r4)
            goto L_0x0032
        L_0x0040:
            boolean r7 = r7.isSampleRateSupported(r4)
            if (r7 != 0) goto L_0x005b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "sampleRate.support, "
            r7.append(r8)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r10.mo25385a((java.lang.String) r4)
            goto L_0x0032
        L_0x005b:
            r4 = r0
        L_0x005c:
            if (r4 == 0) goto L_0x0142
        L_0x005e:
            int r11 = r11.f12968r
            if (r11 == r6) goto L_0x0141
            android.media.MediaCodecInfo$CodecCapabilities r4 = r10.f12986e
            if (r4 != 0) goto L_0x006e
            java.lang.String r11 = "channelCount.caps"
            r10.mo25385a((java.lang.String) r11)
        L_0x006b:
            r10 = r2
            goto L_0x013f
        L_0x006e:
            android.media.MediaCodecInfo$AudioCapabilities r4 = r4.getAudioCapabilities()
            if (r4 != 0) goto L_0x007a
            java.lang.String r11 = "channelCount.aCaps"
            r10.mo25385a((java.lang.String) r11)
            goto L_0x006b
        L_0x007a:
            java.lang.String r6 = r10.f12982a
            java.lang.String r7 = r10.f12985d
            int r4 = r4.getMaxInputChannelCount()
            if (r4 > r0) goto L_0x0126
            r8 = 26
            if (r1 < r8) goto L_0x008c
            if (r4 <= 0) goto L_0x008c
            goto L_0x0126
        L_0x008c:
            java.lang.String r1 = "audio/mpeg"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0126
            java.lang.String r1 = "audio/3gpp"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0126
            java.lang.String r1 = "audio/amr-wb"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0126
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0126
            java.lang.String r1 = "audio/vorbis"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0126
            java.lang.String r1 = "audio/opus"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0126
            java.lang.String r1 = "audio/raw"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0126
            java.lang.String r1 = "audio/flac"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0126
            java.lang.String r1 = "audio/g711-alaw"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0126
            java.lang.String r1 = "audio/g711-mlaw"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0126
            java.lang.String r1 = "audio/gsm"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x00e5
            goto L_0x0126
        L_0x00e5:
            java.lang.String r1 = "audio/ac3"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x00ef
            r3 = 6
            goto L_0x00fa
        L_0x00ef:
            java.lang.String r1 = "audio/eac3"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x00f8
            goto L_0x00fa
        L_0x00f8:
            r3 = 30
        L_0x00fa:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = "AssumedMaxChannelAdjustment: "
            r1.append(r7)
            r1.append(r6)
            java.lang.String r6 = ", ["
            r1.append(r6)
            r1.append(r4)
            java.lang.String r4 = " to "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r4 = "]"
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = "MediaCodecInfo"
            android.util.Log.w(r4, r1)
            r4 = r3
        L_0x0126:
            if (r4 >= r11) goto L_0x013e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "channelCount.support, "
            r1.append(r3)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r10.mo25385a((java.lang.String) r11)
            goto L_0x006b
        L_0x013e:
            r10 = r0
        L_0x013f:
            if (r10 == 0) goto L_0x0142
        L_0x0141:
            r2 = r0
        L_0x0142:
            if (r2 == 0) goto L_0x0146
            r10 = 3
            goto L_0x0147
        L_0x0146:
            r10 = 2
        L_0x0147:
            r11 = r5 | 4
            r10 = r10 | r11
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.MediaCodecAudioRenderer.mo25047a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c, com.fyber.inneractive.sdk.player.exoplayer2.i):int");
    }

    /* renamed from: a */
    public C4875a mo25049a(C4878c cVar, C4869i iVar, boolean z) throws C4880d.C4882b {
        String str = iVar.f12956f;
        this.f11691W.getClass();
        return cVar.mo25395a(iVar.f12956f, z);
    }

    /* renamed from: a */
    public void mo25053a(C4875a aVar, MediaCodec mediaCodec, C4869i iVar, MediaCrypto mediaCrypto) {
        boolean z;
        String str = aVar.f12982a;
        if (C5049u.f13471a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(C5049u.f13473c)) {
            String str2 = C5049u.f13472b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z = true;
                this.f11692X = z;
                mediaCodec.configure(iVar.mo25373a(), (Surface) null, (MediaCrypto) null, 0);
            }
        }
        z = false;
        this.f11692X = z;
        mediaCodec.configure(iVar.mo25373a(), (Surface) null, (MediaCrypto) null, 0);
    }

    /* renamed from: a */
    public void mo25054a(String str, long j, long j2) {
        this.f11690V.decoderInitialized(str, j, j2);
    }

    /* renamed from: a */
    public void mo25052a(C4869i iVar) throws C4697d {
        super.mo25052a(iVar);
        this.f11690V.inputFormatChanged(iVar);
        this.f11693Y = "audio/raw".equals(iVar.f12956f) ? iVar.f12970t : 2;
        this.f11694Z = iVar.f12968r;
    }

    /* renamed from: a */
    public void mo25051a(MediaCodec mediaCodec, MediaFormat mediaFormat) throws C4697d {
        int[] iArr;
        int i;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (!this.f11692X || integer != 6 || (i = this.f11694Z) >= 6) {
            iArr = null;
        } else {
            iArr = new int[i];
            for (int i2 = 0; i2 < this.f11694Z; i2++) {
                iArr[i2] = i2;
            }
        }
        try {
            this.f11691W.mo25073a("audio/raw", integer, integer2, this.f11693Y, 0, iArr);
        } catch (C4681c.C4685d e) {
            throw C4697d.m14459a(e, this.f11668c);
        }
    }

    /* renamed from: a */
    public void mo25010a(long j, boolean z) throws C4697d {
        super.mo25010a(j, z);
        this.f11691W.mo25085h();
        this.f11695a0 = j;
        this.f11696b0 = true;
    }

    /* renamed from: a */
    public C4874m mo25048a(C4874m mVar) {
        return this.f11691W.mo25072a(mVar);
    }

    /* renamed from: a */
    public boolean mo25055a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws C4697d {
        if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.f13007T.skippedOutputBufferCount++;
            C4681c cVar = this.f11691W;
            if (cVar.f11716L == 1) {
                cVar.f11716L = 2;
            }
            return true;
        }
        try {
            if (!this.f11691W.mo25075a(byteBuffer, j3)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i, false);
            this.f13007T.renderedOutputBufferCount++;
            return true;
        } catch (C4681c.C4686e | C4681c.C4689h e) {
            throw C4697d.m14459a(e, this.f11668c);
        }
    }

    /* renamed from: a */
    public void mo25012a(boolean z) throws C4697d {
        DecoderCounters decoderCounters = new DecoderCounters();
        this.f13007T = decoderCounters;
        this.f11690V.enabled(decoderCounters);
        int i = this.f11667b.f13075a;
        boolean z2 = false;
        if (i != 0) {
            C4681c cVar = this.f11691W;
            cVar.getClass();
            if (C5049u.f13471a >= 21) {
                z2 = true;
            }
            C5023a.m15304b(z2);
            if (!cVar.f11732a0 || cVar.f11730Z != i) {
                cVar.f11732a0 = true;
                cVar.f11730Z = i;
                cVar.mo25085h();
                return;
            }
            return;
        }
        C4681c cVar2 = this.f11691W;
        if (cVar2.f11732a0) {
            cVar2.f11732a0 = false;
            cVar2.f11730Z = 0;
            cVar2.mo25085h();
        }
    }

    /* renamed from: a */
    public void mo25050a(int i, Object obj) throws C4697d {
        if (i == 2) {
            C4681c cVar = this.f11691W;
            float floatValue = ((Float) obj).floatValue();
            if (cVar.f11720P != floatValue) {
                cVar.f11720P = floatValue;
                cVar.mo25088k();
            }
        } else if (i == 3) {
            int intValue = ((Integer) obj).intValue();
            C4681c cVar2 = this.f11691W;
            if (cVar2.f11747n != intValue) {
                cVar2.f11747n = intValue;
                if (!cVar2.f11732a0) {
                    cVar2.mo25085h();
                    cVar2.f11730Z = 0;
                }
            }
        }
    }
}
