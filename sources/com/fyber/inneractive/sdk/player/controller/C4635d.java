package com.fyber.inneractive.sdk.player.controller;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.fyber.inneractive.sdk.config.global.C4309s;
import com.fyber.inneractive.sdk.player.cache.C4607d;
import com.fyber.inneractive.sdk.player.cache.C4614h;
import com.fyber.inneractive.sdk.player.cache.C4629n;
import com.fyber.inneractive.sdk.player.enums.C4668b;
import com.fyber.inneractive.sdk.player.exoplayer2.C4695b;
import com.fyber.inneractive.sdk.player.exoplayer2.C4696c;
import com.fyber.inneractive.sdk.player.exoplayer2.C4710e;
import com.fyber.inneractive.sdk.player.exoplayer2.C4863g;
import com.fyber.inneractive.sdk.player.exoplayer2.C4911n;
import com.fyber.inneractive.sdk.player.exoplayer2.C4913p;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.MediaCodecAudioRenderer;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4708c;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4709d;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4878c;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4942n;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4948s;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4957b;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4964e;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C5001k;
import com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer;
import com.fyber.inneractive.sdk.util.C5357n;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.controller.d */
public class C4635d extends C4640g implements C4607d.C4609b, C4607d.C4610c {

    /* renamed from: A */
    public boolean f11553A;

    /* renamed from: B */
    public final boolean f11554B;

    /* renamed from: C */
    public Bitmap f11555C;

    /* renamed from: D */
    public int f11556D;

    /* renamed from: E */
    public String f11557E;

    /* renamed from: F */
    public final List<C4614h> f11558F;

    /* renamed from: G */
    public C4942n f11559G;

    /* renamed from: H */
    public boolean f11560H;

    /* renamed from: I */
    public int f11561I;

    /* renamed from: p */
    public final int f11562p;

    /* renamed from: q */
    public final C4309s f11563q;

    /* renamed from: r */
    public final int f11564r;

    /* renamed from: s */
    public C4710e f11565s;

    /* renamed from: t */
    public int f11566t = 0;

    /* renamed from: u */
    public int f11567u = 0;

    /* renamed from: v */
    public boolean f11568v = false;

    /* renamed from: w */
    public Surface f11569w;

    /* renamed from: x */
    public C4911n[] f11570x;

    /* renamed from: y */
    public Handler f11571y;

    /* renamed from: z */
    public C4662r f11572z;

    /* renamed from: com.fyber.inneractive.sdk.player.controller.d$a */
    public class C4636a implements Runnable {
        public C4636a() {
        }

        public void run() {
            C4710e eVar = C4635d.this.f11565s;
            if (eVar != null) {
                C4863g gVar = (C4863g) eVar;
                gVar.mo25327a(gVar.mo25326a(), -9223372036854775807L);
                ((C4863g) C4635d.this.f11565s).f12870e.f12899f.sendEmptyMessage(5);
                ((C4863g) C4635d.this.f11565s).mo25330b();
                C4635d.this.f11565s = null;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r6v9, types: [com.fyber.inneractive.sdk.config.global.features.e] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4635d(android.content.Context r5, boolean r6, com.fyber.inneractive.sdk.config.global.C4309s r7) {
        /*
            r4 = this;
            r4.<init>(r5)
            r5 = 0
            r4.f11566t = r5
            r4.f11567u = r5
            r4.f11568v = r5
            r0 = 0
            r4.f11569w = r0
            r4.f11553A = r5
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r4.f11558F = r1
            r4.f11559G = r0
            r4.f11561I = r5
            r4.f11554B = r6
            r4.f11563q = r7
            com.fyber.inneractive.sdk.config.i r6 = com.fyber.inneractive.sdk.config.IAConfigManager.m13429b()
            com.fyber.inneractive.sdk.config.h r6 = r6.mo24350a()
            java.lang.String r1 = "extractor_source_retry_count"
            r2 = 6
            r3 = 3
            int r6 = r6.mo24345a(r1, r2, r3)
            r4.f11564r = r6
            if (r7 != 0) goto L_0x0033
            goto L_0x003c
        L_0x0033:
            java.lang.Class<com.fyber.inneractive.sdk.config.global.features.j> r6 = com.fyber.inneractive.sdk.config.global.features.C4292j.class
            com.fyber.inneractive.sdk.config.global.features.e r6 = r7.mo24338a(r6)
            r0 = r6
            com.fyber.inneractive.sdk.config.global.features.j r0 = (com.fyber.inneractive.sdk.config.global.features.C4292j) r0
        L_0x003c:
            if (r0 != 0) goto L_0x0040
            r6 = r5
            goto L_0x0044
        L_0x0040:
            int r6 = r0.mo24325h()
        L_0x0044:
            r4.f11562p = r6
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "Creating IAExoPlayer2Controller"
            com.fyber.inneractive.sdk.util.IAlog.m16699a(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.C4635d.<init>(android.content.Context, boolean, com.fyber.inneractive.sdk.config.global.s):void");
    }

    /* renamed from: b */
    public void mo24863b(boolean z) {
        mo24909c(true);
        this.f11592n = z;
        C4710e eVar = this.f11565s;
        if (eVar != null && !this.f11553A) {
            C4911n[] nVarArr = this.f11570x;
            if (nVarArr.length >= 2) {
                ((C4863g) eVar).mo25329a(new C4710e.C4713c(nVarArr[1], 2, new Float(0.0f)));
                this.f11568v = true;
            }
        }
    }

    /* renamed from: c */
    public int mo24864c() {
        long j;
        C4710e eVar = this.f11565s;
        if (eVar == null || this.f11553A) {
            return 0;
        }
        C4863g gVar = (C4863g) eVar;
        if (gVar.f12880o.mo25463c() || gVar.f12877l > 0) {
            j = gVar.f12887v;
        } else {
            gVar.f12880o.mo25459a(gVar.f12885t.f12939a, gVar.f12873h, false);
            j = C4695b.m14455b(gVar.f12873h.f13081e) + C4695b.m14455b(gVar.f12885t.f12941c);
        }
        return (int) j;
    }

    /* renamed from: d */
    public void mo24866d(boolean z) {
        mo24909c(false);
        this.f11592n = z;
        if (this.f11565s != null && !this.f11553A) {
            AudioManager audioManager = (AudioManager) this.f11579a.getSystemService("audio");
            int streamVolume = audioManager.getStreamVolume(3);
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            float f = ((float) streamVolume) / ((float) streamMaxVolume);
            IAlog.m16699a(" unmute maxVolume = %d currentVolume = %d targetVolume = %s", Integer.valueOf(streamMaxVolume), Integer.valueOf(streamVolume), Float.valueOf(f));
            if (f == 0.0f) {
                f = 0.1f;
            }
            C4911n[] nVarArr = this.f11570x;
            if (nVarArr.length >= 2) {
                C4710e eVar = this.f11565s;
                ((C4863g) eVar).mo25329a(new C4710e.C4713c(nVarArr[1], 2, new Float(f)));
            }
            this.f11568v = false;
        }
    }

    /* renamed from: e */
    public Bitmap mo24867e() {
        return this.f11555C;
    }

    /* renamed from: f */
    public String mo24868f() {
        return this.f11554B ? "exo_c" : "exo";
    }

    /* renamed from: g */
    public int mo24869g() {
        return this.f11567u;
    }

    /* renamed from: h */
    public int mo24870h() {
        return this.f11566t;
    }

    /* renamed from: i */
    public boolean mo24871i() {
        return this.f11568v;
    }

    /* renamed from: j */
    public boolean mo24888j() {
        if (this.f11565s == null || this.f11553A || this.f11583e != C4668b.Playing) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public void mo24872k() {
        C4668b bVar;
        C4668b bVar2 = this.f11583e;
        if (bVar2 == C4668b.Idle || bVar2 == C4668b.f11663i || bVar2 == (bVar = C4668b.Paused) || bVar2 == C4668b.Prepared) {
            IAlog.m16699a("%s paused called when player is in mState: %s ignoring", IAlog.m16696a((Object) this), bVar2);
            return;
        }
        C4710e eVar = this.f11565s;
        if (eVar != null && !this.f11553A) {
            ((C4863g) eVar).mo25328a(false);
        }
        mo24910m();
        mo24907a(bVar);
    }

    /* renamed from: a */
    public void mo24857a(int i, boolean z) {
        IAlog.m16699a("%sseekTo called with %d playAfterSeek = %s", IAlog.m16696a((Object) this), Integer.valueOf(i), Boolean.valueOf(z));
        C4710e eVar = this.f11565s;
        if (eVar != null && !this.f11553A) {
            ((C4863g) eVar).mo25328a(z);
            C4863g gVar = (C4863g) this.f11565s;
            gVar.mo25327a(gVar.mo25326a(), (long) i);
        }
    }

    /* renamed from: l */
    public void mo24873l() {
        IAlog.m16699a("%sstart called", IAlog.m16696a((Object) this));
        if (this.f11565s != null && !this.f11553A) {
            mo24907a(C4668b.Start_in_progress);
            ((C4863g) this.f11565s).mo25328a(true);
        }
    }

    /* renamed from: b */
    public void mo24862b() {
        if (this.f11565s != null) {
            if (!this.f11553A) {
                this.f11553A = true;
                C5357n.m16773a(new C4636a());
            }
            C4662r rVar = this.f11572z;
            if (rVar != null) {
                rVar.f11639a.clear();
            }
            this.f11572z = null;
        }
        for (C4614h next : this.f11558F) {
            next.mo24842a(next.f11506o);
            C4629n nVar = C4629n.f11534f;
            nVar.f11538d.remove(next.mo24839a());
        }
        this.f11558F.clear();
        super.mo24862b();
    }

    /* renamed from: a */
    public void mo24858a(Surface surface) {
        IAlog.m16699a("%ssetSurface called with %s", IAlog.m16696a((Object) this), surface);
        this.f11569w = surface;
        C4710e eVar = this.f11565s;
        if (eVar != null && !this.f11553A) {
            ((C4863g) eVar).mo25329a(new C4710e.C4713c(this.f11570x[0], 1, surface));
        }
    }

    /* renamed from: a */
    public void mo24860a(boolean z) {
        boolean z2 = z;
        if (this.f11565s == null && !this.f11553A) {
            this.f11560H = z2;
            IAlog.m16699a("%sMediaPlayerController: creating media player", IAlog.m16696a((Object) this));
            C4662r rVar = this.f11572z;
            if (rVar != null) {
                rVar.f11639a.clear();
            }
            this.f11572z = new C4662r(this);
            this.f11571y = new Handler(Looper.getMainLooper());
            C4911n[] nVarArr = new C4911n[(z2 ? 2 : 1)];
            this.f11570x = nVarArr;
            Context context = this.f11579a;
            C4878c cVar = C4878c.f13026a;
            nVarArr[0] = new MediaCodecVideoRenderer(context, cVar, 5000, (C4708c<C4709d>) null, false, this.f11571y, this.f11572z, -1);
            if (z2) {
                this.f11570x[1] = new MediaCodecAudioRenderer(cVar, (C4708c<C4709d>) null, true, (Handler) null, (AudioRendererEventListener) null);
            }
            C4863g gVar = new C4863g(this.f11570x, new C4957b((C4964e.C4965a) null), new C4696c(new C5001k(true, 65536, 0), 15000, 30000, 2500, 5000));
            this.f11565s = gVar;
            gVar.f12871f.add(this.f11572z);
        }
    }

    /* renamed from: d */
    public int mo24865d() {
        long j;
        C4710e eVar = this.f11565s;
        if (eVar == null || this.f11553A) {
            return 0;
        }
        C4863g gVar = (C4863g) eVar;
        if (gVar.f12880o.mo25463c()) {
            j = -9223372036854775807L;
        } else {
            j = C4695b.m14455b(gVar.f12880o.mo25460a(gVar.mo25326a(), gVar.f12872g).f13087f);
        }
        return (int) j;
    }

    /* renamed from: a */
    public void mo24859a(String str, int i) {
        mo24887a(str, i, this.f11554B);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.e} */
    /* JADX WARNING: type inference failed for: r1v2, types: [com.fyber.inneractive.sdk.player.exoplayer2.source.n] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v7, types: [com.fyber.inneractive.sdk.player.cache.e] */
    /* JADX WARNING: type inference failed for: r6v6, types: [com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h] */
    /* JADX WARNING: type inference failed for: r6v7, types: [com.fyber.inneractive.sdk.player.exoplayer2.source.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24887a(java.lang.String r22, int r23, boolean r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            com.fyber.inneractive.sdk.player.exoplayer2.e r3 = r0.f11565s
            if (r3 == 0) goto L_0x00e0
            boolean r3 = r0.f11553A
            if (r3 != 0) goto L_0x00e0
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = 0
            java.lang.String r6 = com.fyber.inneractive.sdk.util.IAlog.m16696a((java.lang.Object) r21)
            r4[r5] = r6
            r5 = 1
            r4[r5] = r1
            java.lang.String r5 = "%sloadMediaPlayerUri called with %s"
            com.fyber.inneractive.sdk.util.IAlog.m16699a(r5, r4)
            r0.f11557E = r1
            r0.f11556D = r2
            android.net.Uri r7 = android.net.Uri.parse(r22)
            r1 = 0
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L_0x003e
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.f13471a
            java.lang.String r4 = r7.getPath()
            if (r4 != 0) goto L_0x0039
            r4 = 3
            goto L_0x0053
        L_0x0039:
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15395b((java.lang.String) r4)
            goto L_0x0053
        L_0x003e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "."
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15395b((java.lang.String) r4)
        L_0x0053:
            boolean r5 = r0.f11554B
            if (r5 == 0) goto L_0x0069
            com.fyber.inneractive.sdk.player.cache.n r5 = com.fyber.inneractive.sdk.player.cache.C4629n.f11534f
            boolean r5 = r5.mo24853a()
            if (r5 == 0) goto L_0x0069
            if (r4 == r3) goto L_0x0069
            com.fyber.inneractive.sdk.player.cache.e r1 = new com.fyber.inneractive.sdk.player.cache.e
            com.fyber.inneractive.sdk.config.global.s r5 = r0.f11563q
            r1.<init>(r0, r0, r2, r5)
            goto L_0x00b8
        L_0x0069:
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.l r2 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.l
            r2.<init>(r1, r1)
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.p r5 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.p
            com.fyber.inneractive.sdk.config.IAConfigManager r6 = com.fyber.inneractive.sdk.config.IAConfigManager.f10525J
            com.fyber.inneractive.sdk.util.u0 r6 = r6.f10560y
            java.lang.String r9 = r6.mo26469a()
            r11 = 2000(0x7d0, float:2.803E-42)
            r12 = 2000(0x7d0, float:2.803E-42)
            r13 = 1
            r8 = r5
            r10 = r2
            r8.<init>(r9, r10, r11, r12, r13)
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.n r6 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.n
            android.content.Context r8 = r0.f11579a
            r6.<init>(r8, r2, r5)
            android.content.Context r2 = r0.f11579a
            java.lang.String r5 = "ia-vid-cache-ex2"
            java.io.File r2 = com.fyber.inneractive.sdk.player.cache.C4629n.m14137a((android.content.Context) r2, (java.lang.String) r5)
            if (r2 == 0) goto L_0x00ba
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.j r5 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.j
            r8 = 10485760(0xa00000, double:5.180654E-317)
            r5.<init>(r8)
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.k r15 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.k
            r15.<init>(r2, r5, r1)
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.e r1 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.e
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.r r17 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.r
            r17.<init>()
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c r2 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c
            r2.<init>(r15, r8)
            r19 = 2
            r20 = 0
            r14 = r1
            r16 = r6
            r18 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20)
        L_0x00b8:
            r8 = r1
            goto L_0x00bb
        L_0x00ba:
            r8 = r6
        L_0x00bb:
            if (r4 == r3) goto L_0x00d0
            com.fyber.inneractive.sdk.player.exoplayer2.source.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.source.l
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.c r9 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.c
            r9.<init>()
            int r10 = r0.f11564r
            android.os.Handler r11 = r0.f11571y
            com.fyber.inneractive.sdk.player.controller.r r12 = r0.f11572z
            r13 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x00db
        L_0x00d0:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h r1 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h
            android.os.Handler r10 = r0.f11571y
            com.fyber.inneractive.sdk.player.controller.r r11 = r0.f11572z
            r9 = 3
            r6 = r1
            r6.<init>((android.net.Uri) r7, (com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4996g.C4997a) r8, (int) r9, (android.os.Handler) r10, (com.fyber.inneractive.sdk.player.exoplayer2.source.C4926f) r11)
        L_0x00db:
            r0.f11559G = r1
            r0.mo24886a((com.fyber.inneractive.sdk.player.exoplayer2.source.C4942n) r1)
        L_0x00e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.C4635d.mo24887a(java.lang.String, int, boolean):void");
    }

    /* renamed from: a */
    public final void mo24886a(C4942n nVar) {
        C4710e eVar = this.f11565s;
        if (eVar != null && nVar != null) {
            C4863g gVar = (C4863g) eVar;
            if (!gVar.f12880o.mo25463c() || gVar.f12881p != null) {
                gVar.f12880o = C4913p.f13076a;
                gVar.f12881p = null;
                Iterator<C4710e.C4711a> it = gVar.f12871f.iterator();
                while (it.hasNext()) {
                    it.next().mo24977a(gVar.f12880o, gVar.f12881p);
                }
            }
            if (gVar.f12874i) {
                gVar.f12874i = false;
                gVar.f12882q = C4948s.f13197d;
                gVar.f12883r = gVar.f12868c;
                gVar.f12867b.mo25506a((Object) null);
                Iterator<C4710e.C4711a> it2 = gVar.f12871f.iterator();
                while (it2.hasNext()) {
                    it2.next().mo24978a(gVar.f12882q, gVar.f12883r);
                }
            }
            gVar.f12878m++;
            gVar.f12870e.f12899f.obtainMessage(0, 1, 0, nVar).sendToTarget();
            mo24907a(C4668b.Preparing);
        }
    }

    /* renamed from: a */
    public boolean mo24861a() {
        return this.f11554B;
    }
}
