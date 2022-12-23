package com.bykv.p068vk.openvk.component.video.p069a.p081d;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bykv.p068vk.openvk.component.video.api.C2515a;
import com.bykv.p068vk.openvk.component.video.api.C2518b;
import com.bykv.p068vk.openvk.component.video.api.p085c.C2520a;
import com.bykv.p068vk.openvk.component.video.api.p085c.C2522c;
import com.bykv.p068vk.openvk.component.video.api.p088f.C2536c;
import com.bykv.p068vk.openvk.component.video.api.p088f.C2537d;
import com.bykv.p068vk.openvk.component.video.p069a.p081d.C2487c;
import com.smaato.sdk.video.vast.model.ErrorCode;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bykv.vk.openvk.component.video.a.d.d */
/* compiled from: SSMediaPlayerWrapper */
public class C2495d implements C2487c.C2488a, C2487c.C2489b, C2487c.C2490c, C2487c.C2491d, C2487c.C2492e, C2487c.C2493f, C2487c.C2494g, C2515a, C2537d.C2538a {

    /* renamed from: v */
    private static boolean f5304v = false;

    /* renamed from: x */
    private static final SparseIntArray f5305x = new SparseIntArray();

    /* renamed from: A */
    private C2522c f5306A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f5307B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public volatile int f5308C;

    /* renamed from: D */
    private Surface f5309D;

    /* renamed from: E */
    private Runnable f5310E;

    /* renamed from: F */
    private C2509a f5311F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public boolean f5312G;

    /* renamed from: H */
    private final Object f5313H;

    /* renamed from: I */
    private StringBuilder f5314I;

    /* renamed from: J */
    private long f5315J;

    /* renamed from: K */
    private long f5316K;

    /* renamed from: L */
    private boolean f5317L;

    /* renamed from: a */
    private SurfaceTexture f5318a;

    /* renamed from: b */
    private SurfaceHolder f5319b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f5320c;

    /* renamed from: d */
    private boolean f5321d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C2487c f5322e;

    /* renamed from: f */
    private boolean f5323f;

    /* renamed from: g */
    private boolean f5324g;

    /* renamed from: h */
    private boolean f5325h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f5326i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public volatile int f5327j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public long f5328k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final Handler f5329l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f5330m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public long f5331n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public long f5332o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public long f5333p;

    /* renamed from: q */
    private long f5334q;

    /* renamed from: r */
    private long f5335r;

    /* renamed from: s */
    private boolean f5336s;

    /* renamed from: t */
    private ArrayList<Runnable> f5337t;

    /* renamed from: u */
    private int f5338u;

    /* renamed from: w */
    private String f5339w;

    /* renamed from: y */
    private boolean f5340y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final List<WeakReference<C2515a.C2516a>> f5341z;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m6146a(long j, long j2) {
        for (WeakReference next : this.f5341z) {
            if (!(next == null || next.get() == null)) {
                ((C2515a.C2516a) next.get()).mo16325a((C2515a) this, j, j2);
            }
        }
    }

    public C2495d() {
        boolean z = false;
        this.f5320c = 0;
        this.f5321d = false;
        this.f5322e = null;
        this.f5323f = false;
        this.f5324g = false;
        this.f5327j = ErrorCode.DIFFERENT_LINEARITY_EXPECTED_ERROR;
        this.f5328k = -1;
        this.f5330m = false;
        this.f5331n = 0;
        this.f5332o = Long.MIN_VALUE;
        this.f5333p = 0;
        this.f5334q = 0;
        this.f5335r = 0;
        this.f5338u = 0;
        this.f5339w = "0";
        this.f5341z = Collections.synchronizedList(new ArrayList());
        this.f5306A = null;
        this.f5307B = false;
        this.f5308C = 200;
        this.f5309D = null;
        this.f5310E = new Runnable() {
            public void run() {
                long s = C2495d.this.mo16299s();
                if (s > 0 && Build.VERSION.SDK_INT >= 23 && C2495d.this.mo16292l() && C2495d.this.f5332o != Long.MIN_VALUE) {
                    if (C2495d.this.f5332o == s) {
                        if (!C2495d.this.f5330m && C2495d.this.f5333p >= 400) {
                            C2495d.this.m6154b(701, 800);
                            boolean unused = C2495d.this.f5330m = true;
                        }
                        C2495d dVar = C2495d.this;
                        long unused2 = dVar.f5333p = dVar.f5333p + ((long) C2495d.this.f5308C);
                    } else {
                        if (C2495d.this.f5330m) {
                            C2495d dVar2 = C2495d.this;
                            long unused3 = dVar2.f5331n = dVar2.f5331n + C2495d.this.f5333p;
                            C2495d.this.m6154b(702, 800);
                            C2536c.m6438b("CSJ_VIDEO_MEDIA", "handleMsg:  bufferingDuration =", Long.valueOf(C2495d.this.f5331n), "  bufferCount =", Integer.valueOf(C2495d.this.f5320c));
                        }
                        long unused4 = C2495d.this.f5333p = 0;
                        boolean unused5 = C2495d.this.f5330m = false;
                    }
                }
                if (C2495d.this.mo16297q() > 0) {
                    if (C2495d.this.f5332o != s) {
                        if (C2518b.m6278f()) {
                            C2536c.m6438b("CSJ_VIDEO_MEDIA", "run: lastCur = ", Long.valueOf(C2495d.this.f5332o), "  curPosition = ", Long.valueOf(s));
                        }
                        C2495d dVar3 = C2495d.this;
                        dVar3.m6146a(s, dVar3.mo16297q());
                    }
                    long unused6 = C2495d.this.f5332o = s;
                }
                if (!C2495d.this.mo16288h()) {
                    C2495d.this.f5329l.postDelayed(this, (long) C2495d.this.f5308C);
                    return;
                }
                C2495d dVar4 = C2495d.this;
                dVar4.m6146a(dVar4.mo16297q(), C2495d.this.mo16297q());
            }
        };
        this.f5311F = new C2509a();
        this.f5313H = new Object();
        this.f5314I = null;
        this.f5315J = 0;
        this.f5316K = 0;
        this.f5317L = false;
        this.f5338u = 0;
        HandlerThread handlerThread = new HandlerThread("tt_pangle_thread_SSMediaPlayerWrapper", -1);
        handlerThread.start();
        this.f5329l = new C2537d(handlerThread.getLooper(), this);
        this.f5317L = Build.VERSION.SDK_INT >= 17 ? true : z;
        this.f5329l.post(new Runnable() {
            public void run() {
                C2495d.this.m6173u();
            }
        });
    }

    /* renamed from: t */
    private void m6172t() {
        this.f5331n = 0;
        this.f5320c = 0;
        this.f5333p = 0;
        this.f5330m = false;
        this.f5332o = Long.MIN_VALUE;
    }

    /* renamed from: b */
    public void mo16282b(final boolean z) {
        this.f5340y = z;
        C2487c cVar = this.f5322e;
        if (cVar != null) {
            cVar.mo16232a(z);
        } else {
            this.f5329l.post(new Runnable() {
                public void run() {
                    if (C2495d.this.f5322e != null) {
                        C2495d.this.f5322e.mo16232a(z);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m6173u() {
        if (this.f5322e == null) {
            C2485b bVar = new C2485b();
            this.f5322e = bVar;
            this.f5339w = "0";
            bVar.mo16229a((C2487c.C2492e) this);
            this.f5322e.mo16226a((C2487c.C2489b) this);
            this.f5322e.mo16227a((C2487c.C2490c) this);
            this.f5322e.mo16225a((C2487c.C2488a) this);
            this.f5322e.mo16230a((C2487c.C2493f) this);
            this.f5322e.mo16228a((C2487c.C2491d) this);
            this.f5322e.mo16231a((C2487c.C2494g) this);
            try {
                this.f5322e.mo16245c(this.f5323f);
            } catch (Throwable th) {
                C2536c.m6434a("CSJ_VIDEO_MEDIA", "setLooping error: ", th);
            }
            this.f5324g = false;
        }
    }

    /* renamed from: a */
    public void mo16280a(boolean z, long j, boolean z2) {
        C2536c.m6433a("CSJ_VIDEO_MEDIA", "[video] MediaPlayerProxy#start firstSeekToPosition=" + j + ",firstPlay :" + z + ",isPauseOtherMusicVolume=" + z2);
        if (this.f5322e != null) {
            this.f5307B = z2;
            this.f5312G = false;
            mo16279a(z2);
            if (z) {
                C2536c.m6433a("CSJ_VIDEO_MEDIA", "[video] first start , SSMediaPlayer  start method !");
                this.f5328k = j;
                m6174v();
            } else {
                this.f5311F.mo16313a(j);
                if (this.f5340y) {
                    m6155b((Runnable) this.f5311F);
                } else {
                    m6149a((Runnable) this.f5311F);
                }
            }
            this.f5329l.postDelayed(this.f5310E, (long) this.f5308C);
        }
    }

    /* renamed from: a */
    public void mo16272a() {
        Handler handler = this.f5329l;
        if (handler != null) {
            handler.post(new Runnable() {
                public void run() {
                    if (C2495d.this.mo16293m() && C2495d.this.f5322e != null) {
                        try {
                            C2495d.this.f5322e.mo16247e();
                            C2536c.m6436b("CSJ_VIDEO_MEDIA", "resume play exec start ");
                            for (WeakReference weakReference : C2495d.this.f5341z) {
                                if (!(weakReference == null || weakReference.get() == null)) {
                                    ((C2515a.C2516a) weakReference.get()).mo16332e(C2495d.this);
                                }
                            }
                            int unused = C2495d.this.f5327j = 206;
                        } catch (Throwable th) {
                            C2536c.m6438b("CSJ_VIDEO_MEDIA", "play: catch exception ", th.getMessage());
                        }
                    }
                }
            });
        }
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.d.d$a */
    /* compiled from: SSMediaPlayerWrapper */
    class C2509a implements Runnable {

        /* renamed from: b */
        private long f5362b;

        C2509a() {
        }

        /* renamed from: a */
        public void mo16313a(long j) {
            this.f5362b = j;
        }

        public void run() {
            if (C2495d.this.f5322e != null) {
                try {
                    long unused = C2495d.this.f5328k = Math.max(this.f5362b, C2495d.this.f5322e.mo16252i());
                } catch (Throwable th) {
                    C2536c.m6433a("CSJ_VIDEO_MEDIA", "[video] MediaPlayerProxy#start  error: getCurrentPosition :" + th.toString());
                }
            }
            C2495d.this.f5329l.sendEmptyMessageDelayed(100, 0);
            C2536c.m6433a("CSJ_VIDEO_MEDIA", "[video] MediaPlayerProxy#start not first play ! sendMsg --> OP_START , video start to play !");
        }
    }

    /* renamed from: b */
    public void mo16281b() {
        C2536c.m6436b("CSJ_VIDEO_MEDIA", "pause: ");
        this.f5329l.removeMessages(100);
        this.f5312G = true;
        this.f5329l.sendEmptyMessage(101);
    }

    /* renamed from: d */
    public void mo16284d() {
        this.f5327j = ErrorCode.DIFFERENT_SIZE_EXPECTED_ERROR;
        m6142B();
        if (this.f5329l != null) {
            try {
                m6156b("release");
                this.f5329l.removeCallbacksAndMessages((Object) null);
                if (this.f5322e != null) {
                    this.f5326i = true;
                    this.f5329l.sendEmptyMessage(103);
                }
            } catch (Throwable th) {
                m6176x();
                throw th;
            }
            m6176x();
        }
    }

    /* renamed from: v */
    private void m6174v() {
        C2536c.m6433a("CSJ_VIDEO_MEDIA", "[video] MediaPlayerProxy#start first play prepare invoke !");
        m6155b((Runnable) new Runnable() {
            public void run() {
                if (C2495d.this.f5329l != null) {
                    C2495d.this.f5329l.sendEmptyMessage(104);
                    C2536c.m6433a("CSJ_VIDEO_MEDIA", "[video] MediaPlayerProxy#start first play prepare invoke ! sendMsg --> OP_PREPARE_ASYNC");
                }
            }
        });
    }

    /* renamed from: c */
    public void mo16283c() {
        m6155b((Runnable) new Runnable() {
            public void run() {
                if (C2495d.this.f5329l != null) {
                    C2495d.this.f5329l.sendEmptyMessage(105);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo16273a(final long j) {
        if (this.f5327j == 207 || this.f5327j == 206 || this.f5327j == 209) {
            m6155b((Runnable) new Runnable() {
                public void run() {
                    if (C2495d.this.f5329l != null) {
                        C2495d.this.f5329l.obtainMessage(106, Long.valueOf(j)).sendToTarget();
                    }
                }
            });
        }
    }

    /* renamed from: e */
    public boolean mo16285e() {
        return this.f5321d;
    }

    /* renamed from: a */
    public void mo16274a(final SurfaceTexture surfaceTexture) {
        this.f5318a = surfaceTexture;
        mo16282b(true);
        m6155b((Runnable) new Runnable() {
            public void run() {
                C2495d.this.m6173u();
                if (C2495d.this.f5329l != null) {
                    C2495d.this.f5329l.obtainMessage(111, surfaceTexture).sendToTarget();
                }
            }
        });
    }

    /* renamed from: a */
    public void mo16276a(final SurfaceHolder surfaceHolder) {
        this.f5319b = surfaceHolder;
        mo16282b(true);
        m6155b((Runnable) new Runnable() {
            public void run() {
                C2495d.this.m6173u();
                if (C2495d.this.f5329l != null) {
                    C2495d.this.f5329l.obtainMessage(110, surfaceHolder).sendToTarget();
                }
            }
        });
    }

    /* renamed from: a */
    public void mo16278a(final C2522c cVar) {
        this.f5306A = cVar;
        m6155b((Runnable) new Runnable() {
            public void run() {
                C2495d.this.m6173u();
                if (C2495d.this.f5329l != null) {
                    C2495d.this.f5329l.obtainMessage(107, cVar).sendToTarget();
                }
            }
        });
    }

    /* renamed from: l */
    public boolean mo16292l() {
        return (this.f5327j == 206 || this.f5329l.hasMessages(100)) && !this.f5312G;
    }

    /* renamed from: i */
    public boolean mo16289i() {
        return mo16298r() || mo16292l() || mo16293m();
    }

    /* renamed from: m */
    public boolean mo16293m() {
        return (this.f5327j == 207 || this.f5312G) && !this.f5329l.hasMessages(100);
    }

    /* renamed from: n */
    public boolean mo16294n() {
        return this.f5327j == 203;
    }

    /* renamed from: r */
    public boolean mo16298r() {
        return this.f5327j == 205;
    }

    /* renamed from: h */
    public boolean mo16288h() {
        return this.f5327j == 209;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ea, code lost:
        r5 = true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16275a(android.os.Message r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            int r2 = r0.what
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "[video]  execute , mCurrentState = "
            r3.append(r4)
            int r4 = r1.f5327j
            r3.append(r4)
            java.lang.String r4 = " handlerMsg="
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "CSJ_VIDEO_MEDIA"
            com.bykv.p068vk.openvk.component.video.api.p088f.C2536c.m6433a((java.lang.String) r4, (java.lang.String) r3)
            com.bykv.vk.openvk.component.video.a.d.c r3 = r1.f5322e
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L_0x02e7
            int r3 = r0.what
            java.lang.String r7 = "[video] OP_RELEASE execute , releaseMediaplayer !"
            r8 = 203(0xcb, float:2.84E-43)
            r11 = 201(0xc9, float:2.82E-43)
            r12 = 202(0xca, float:2.83E-43)
            r13 = 205(0xcd, float:2.87E-43)
            r14 = 208(0xd0, float:2.91E-43)
            r15 = 209(0xd1, float:2.93E-43)
            r9 = 206(0xce, float:2.89E-43)
            r10 = 207(0xcf, float:2.9E-43)
            switch(r3) {
                case 100: goto L_0x02a6;
                case 101: goto L_0x024c;
                case 102: goto L_0x0238;
                case 103: goto L_0x0201;
                case 104: goto L_0x01e1;
                case 105: goto L_0x01bc;
                case 106: goto L_0x0199;
                case 107: goto L_0x008d;
                case 108: goto L_0x0043;
                case 109: goto L_0x0043;
                case 110: goto L_0x006d;
                case 111: goto L_0x0045;
                default: goto L_0x0043;
            }
        L_0x0043:
            goto L_0x02e7
        L_0x0045:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0065 }
            r7 = 14
            if (r3 < r7) goto L_0x005b
            java.lang.Object r0 = r0.obj     // Catch:{ all -> 0x0065 }
            android.graphics.SurfaceTexture r0 = (android.graphics.SurfaceTexture) r0     // Catch:{ all -> 0x0065 }
            android.view.Surface r3 = new android.view.Surface     // Catch:{ all -> 0x0065 }
            r3.<init>(r0)     // Catch:{ all -> 0x0065 }
            r1.f5309D = r3     // Catch:{ all -> 0x0065 }
            com.bykv.vk.openvk.component.video.a.d.c r0 = r1.f5322e     // Catch:{ all -> 0x0065 }
            r0.mo16239a((android.view.Surface) r3)     // Catch:{ all -> 0x0065 }
        L_0x005b:
            com.bykv.vk.openvk.component.video.a.d.c r0 = r1.f5322e     // Catch:{ all -> 0x0065 }
            r0.mo16244b(r6)     // Catch:{ all -> 0x0065 }
            r16.m6141A()     // Catch:{ all -> 0x0065 }
            goto L_0x02e7
        L_0x0065:
            r0 = move-exception
            java.lang.String r3 = "OP_SET_SURFACE error: "
            com.bykv.p068vk.openvk.component.video.api.p088f.C2536c.m6434a(r4, r3, r0)
            goto L_0x02e7
        L_0x006d:
            java.lang.String r3 = "resumeVideo:  OP_SET_DISPLAY "
            com.bykv.p068vk.openvk.component.video.api.p088f.C2536c.m6436b((java.lang.String) r4, (java.lang.String) r3)
            java.lang.Object r0 = r0.obj     // Catch:{ all -> 0x0085 }
            android.view.SurfaceHolder r0 = (android.view.SurfaceHolder) r0     // Catch:{ all -> 0x0085 }
            com.bykv.vk.openvk.component.video.a.d.c r3 = r1.f5322e     // Catch:{ all -> 0x0085 }
            r3.mo16240a((android.view.SurfaceHolder) r0)     // Catch:{ all -> 0x0085 }
            com.bykv.vk.openvk.component.video.a.d.c r0 = r1.f5322e     // Catch:{ all -> 0x0085 }
            r0.mo16244b(r6)     // Catch:{ all -> 0x0085 }
            r16.m6141A()     // Catch:{ all -> 0x0085 }
            goto L_0x02e7
        L_0x0085:
            r0 = move-exception
            java.lang.String r3 = "OP_SET_DISPLAY error: "
            com.bykv.p068vk.openvk.component.video.api.p088f.C2536c.m6434a(r4, r3, r0)
            goto L_0x02e7
        L_0x008d:
            r16.m6172t()
            int r3 = r1.f5327j
            if (r3 == r11) goto L_0x0098
            int r3 = r1.f5327j
            if (r3 != r8) goto L_0x01ea
        L_0x0098:
            java.lang.Object r0 = r0.obj     // Catch:{ all -> 0x0191 }
            com.bykv.vk.openvk.component.video.api.c.c r0 = (com.bykv.p068vk.openvk.component.video.api.p085c.C2522c) r0     // Catch:{ all -> 0x0191 }
            java.lang.String r3 = r0.mo16373a()     // Catch:{ all -> 0x0191 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0191 }
            if (r3 == 0) goto L_0x00ad
            java.lang.String r3 = com.bykv.p068vk.openvk.component.video.api.C2518b.m6274b()     // Catch:{ all -> 0x0191 }
            r0.mo16376a((java.lang.String) r3)     // Catch:{ all -> 0x0191 }
        L_0x00ad:
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0191 }
            java.lang.String r7 = r0.mo16373a()     // Catch:{ all -> 0x0191 }
            java.lang.String r8 = r0.mo16399k()     // Catch:{ all -> 0x0191 }
            r3.<init>(r7, r8)     // Catch:{ all -> 0x0191 }
            boolean r7 = r3.exists()     // Catch:{ all -> 0x0191 }
            if (r7 == 0) goto L_0x00f2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0191 }
            r0.<init>()     // Catch:{ all -> 0x0191 }
            java.lang.String r7 = "setDataSource： try paly local:"
            r0.append(r7)     // Catch:{ all -> 0x0191 }
            java.lang.String r7 = r3.getAbsolutePath()     // Catch:{ all -> 0x0191 }
            r0.append(r7)     // Catch:{ all -> 0x0191 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0191 }
            com.bykv.p068vk.openvk.component.video.api.p088f.C2536c.m6433a((java.lang.String) r4, (java.lang.String) r0)     // Catch:{ all -> 0x0191 }
            boolean r0 = com.bykv.p068vk.openvk.component.video.api.C2518b.m6276d()     // Catch:{ all -> 0x0191 }
            if (r0 == 0) goto L_0x00e7
            java.lang.String r0 = r3.getAbsolutePath()     // Catch:{ all -> 0x0191 }
            r1.m6150a((java.lang.String) r0)     // Catch:{ all -> 0x0191 }
            goto L_0x018d
        L_0x00e7:
            com.bykv.vk.openvk.component.video.a.d.c r0 = r1.f5322e     // Catch:{ all -> 0x0191 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ all -> 0x0191 }
            r0.mo16243a((java.lang.String) r3)     // Catch:{ all -> 0x0191 }
            goto L_0x018d
        L_0x00f2:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0191 }
            r3.<init>()     // Catch:{ all -> 0x0191 }
            java.lang.String r7 = "setDataSource： paly net:"
            r3.append(r7)     // Catch:{ all -> 0x0191 }
            java.lang.String r7 = r0.mo16398j()     // Catch:{ all -> 0x0191 }
            r3.append(r7)     // Catch:{ all -> 0x0191 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0191 }
            com.bykv.p068vk.openvk.component.video.api.p088f.C2536c.m6433a((java.lang.String) r4, (java.lang.String) r3)     // Catch:{ all -> 0x0191 }
            int r3 = r0.f5394b     // Catch:{ all -> 0x0191 }
            r7 = 23
            if (r3 != r6) goto L_0x0136
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0191 }
            if (r3 >= r7) goto L_0x0136
            com.bykv.vk.openvk.component.video.a.d.c r3 = r1.f5322e     // Catch:{ all -> 0x0191 }
            java.lang.String r7 = r0.mo16398j()     // Catch:{ all -> 0x0191 }
            r3.mo16243a((java.lang.String) r7)     // Catch:{ all -> 0x0191 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0191 }
            r3.<init>()     // Catch:{ all -> 0x0191 }
            java.lang.String r7 = "setDataSource： 直接设置 url"
            r3.append(r7)     // Catch:{ all -> 0x0191 }
            java.lang.String r0 = r0.mo16398j()     // Catch:{ all -> 0x0191 }
            r3.append(r0)     // Catch:{ all -> 0x0191 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0191 }
            com.bykv.p068vk.openvk.component.video.api.p088f.C2536c.m6433a((java.lang.String) r4, (java.lang.String) r0)     // Catch:{ all -> 0x0191 }
            goto L_0x018d
        L_0x0136:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0191 }
            if (r3 < r7) goto L_0x0158
            com.bykv.vk.openvk.component.video.a.d.c r3 = r1.f5322e     // Catch:{ all -> 0x0191 }
            r3.mo16241a((com.bykv.p068vk.openvk.component.video.api.p085c.C2522c) r0)     // Catch:{ all -> 0x0191 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0191 }
            r3.<init>()     // Catch:{ all -> 0x0191 }
            java.lang.String r7 = "setDataSource： 使用MediaDataSource接口 url"
            r3.append(r7)     // Catch:{ all -> 0x0191 }
            java.lang.String r0 = r0.mo16398j()     // Catch:{ all -> 0x0191 }
            r3.append(r0)     // Catch:{ all -> 0x0191 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0191 }
            com.bykv.p068vk.openvk.component.video.api.p088f.C2536c.m6433a((java.lang.String) r4, (java.lang.String) r0)     // Catch:{ all -> 0x0191 }
            goto L_0x018d
        L_0x0158:
            com.bykv.vk.openvk.component.video.a.b.f.a r3 = com.bykv.p068vk.openvk.component.video.p069a.p073b.p079f.C2460a.m5990a()     // Catch:{ all -> 0x0191 }
            java.lang.String r0 = r3.mo16192b(r0)     // Catch:{ all -> 0x0191 }
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0191 }
            java.lang.String r7 = "setDataSource： 本地代理模式 local url = "
            r3[r5] = r7     // Catch:{ all -> 0x0191 }
            r3[r6] = r0     // Catch:{ all -> 0x0191 }
            com.bykv.p068vk.openvk.component.video.api.p088f.C2536c.m6435a((java.lang.String) r4, (java.lang.Object[]) r3)     // Catch:{ all -> 0x0191 }
            if (r0 == 0) goto L_0x0188
            boolean r3 = com.bykv.p068vk.openvk.component.video.api.C2518b.m6276d()     // Catch:{ all -> 0x0191 }
            if (r3 == 0) goto L_0x0188
            java.lang.String r3 = "file"
            boolean r3 = r0.startsWith(r3)     // Catch:{ all -> 0x0191 }
            if (r3 == 0) goto L_0x0188
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ all -> 0x0191 }
            java.lang.String r0 = r0.getPath()     // Catch:{ all -> 0x0191 }
            r1.m6150a((java.lang.String) r0)     // Catch:{ all -> 0x0191 }
            goto L_0x018d
        L_0x0188:
            com.bykv.vk.openvk.component.video.a.d.c r3 = r1.f5322e     // Catch:{ all -> 0x0191 }
            r3.mo16243a((java.lang.String) r0)     // Catch:{ all -> 0x0191 }
        L_0x018d:
            r1.f5327j = r12     // Catch:{ all -> 0x0191 }
            goto L_0x02e7
        L_0x0191:
            r0 = move-exception
            java.lang.String r3 = "OP_SET_DATASOURCE error: "
            com.bykv.p068vk.openvk.component.video.api.p088f.C2536c.m6434a(r4, r3, r0)
            goto L_0x02e7
        L_0x0199:
            int r3 = r1.f5327j
            if (r3 == r9) goto L_0x01a5
            int r3 = r1.f5327j
            if (r3 == r10) goto L_0x01a5
            int r3 = r1.f5327j
            if (r3 != r15) goto L_0x01ea
        L_0x01a5:
            com.bykv.vk.openvk.component.video.a.d.c r3 = r1.f5322e     // Catch:{ all -> 0x01b4 }
            java.lang.Object r0 = r0.obj     // Catch:{ all -> 0x01b4 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x01b4 }
            long r7 = r0.longValue()     // Catch:{ all -> 0x01b4 }
            r3.mo16238a((long) r7)     // Catch:{ all -> 0x01b4 }
            goto L_0x02e7
        L_0x01b4:
            r0 = move-exception
            java.lang.String r3 = "OP_SEEKTO error: "
            com.bykv.p068vk.openvk.component.video.api.p088f.C2536c.m6434a(r4, r3, r0)
            goto L_0x02e7
        L_0x01bc:
            int r0 = r1.f5327j
            if (r0 == r13) goto L_0x01d0
            int r0 = r1.f5327j
            if (r0 == r9) goto L_0x01d0
            int r0 = r1.f5327j
            if (r0 == r14) goto L_0x01d0
            int r0 = r1.f5327j
            if (r0 == r10) goto L_0x01d0
            int r0 = r1.f5327j
            if (r0 != r15) goto L_0x01ea
        L_0x01d0:
            com.bykv.vk.openvk.component.video.a.d.c r0 = r1.f5322e     // Catch:{ all -> 0x01d9 }
            r0.mo16248f()     // Catch:{ all -> 0x01d9 }
            r1.f5327j = r14     // Catch:{ all -> 0x01d9 }
            goto L_0x02e7
        L_0x01d9:
            r0 = move-exception
            java.lang.String r3 = "OP_STOP error: "
            com.bykv.p068vk.openvk.component.video.api.p088f.C2536c.m6434a(r4, r3, r0)
            goto L_0x02e7
        L_0x01e1:
            int r0 = r1.f5327j
            if (r0 == r12) goto L_0x01ed
            int r0 = r1.f5327j
            if (r0 != r14) goto L_0x01ea
            goto L_0x01ed
        L_0x01ea:
            r5 = r6
            goto L_0x02e7
        L_0x01ed:
            com.bykv.vk.openvk.component.video.a.d.c r0 = r1.f5322e     // Catch:{ all -> 0x01f9 }
            r0.mo16251h()     // Catch:{ all -> 0x01f9 }
            java.lang.String r0 = "[video] OP_PREPARE_ASYNC execute , mMediaPlayer real prepareAsync !"
            com.bykv.p068vk.openvk.component.video.api.p088f.C2536c.m6433a((java.lang.String) r4, (java.lang.String) r0)     // Catch:{ all -> 0x01f9 }
            goto L_0x02e7
        L_0x01f9:
            r0 = move-exception
            java.lang.String r3 = "OP_PREPARE_ASYNC error: "
            com.bykv.p068vk.openvk.component.video.api.p088f.C2536c.m6441c(r4, r3, r0)
            goto L_0x02e7
        L_0x0201:
            r16.m6175w()     // Catch:{ all -> 0x0208 }
            com.bykv.p068vk.openvk.component.video.api.p088f.C2536c.m6433a((java.lang.String) r4, (java.lang.String) r7)     // Catch:{ all -> 0x0208 }
            goto L_0x020e
        L_0x0208:
            r0 = move-exception
            java.lang.String r3 = "OP_RELEASE error: "
            com.bykv.p068vk.openvk.component.video.api.p088f.C2536c.m6441c(r4, r3, r0)
        L_0x020e:
            r1.f5326i = r5
            java.util.List<java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.api.a$a>> r0 = r1.f5341z
            java.util.Iterator r0 = r0.iterator()
        L_0x0216:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0234
            java.lang.Object r3 = r0.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            if (r3 == 0) goto L_0x0216
            java.lang.Object r4 = r3.get()
            if (r4 == 0) goto L_0x0216
            java.lang.Object r3 = r3.get()
            com.bykv.vk.openvk.component.video.api.a$a r3 = (com.bykv.p068vk.openvk.component.video.api.C2515a.C2516a) r3
            r3.mo16330c(r1)
            goto L_0x0216
        L_0x0234:
            r1.f5327j = r8
            goto L_0x02e7
        L_0x0238:
            com.bykv.vk.openvk.component.video.a.d.c r0 = r1.f5322e     // Catch:{ all -> 0x0244 }
            r0.mo16255l()     // Catch:{ all -> 0x0244 }
            com.bykv.p068vk.openvk.component.video.api.p088f.C2536c.m6433a((java.lang.String) r4, (java.lang.String) r7)     // Catch:{ all -> 0x0244 }
            r1.f5327j = r11     // Catch:{ all -> 0x0244 }
            goto L_0x02e7
        L_0x0244:
            r0 = move-exception
            java.lang.String r3 = "OP_RESET error: "
            com.bykv.p068vk.openvk.component.video.api.p088f.C2536c.m6434a(r4, r3, r0)
            goto L_0x02e7
        L_0x024c:
            boolean r0 = r1.f5330m
            if (r0 == 0) goto L_0x0257
            long r7 = r1.f5331n
            long r11 = r1.f5333p
            long r7 = r7 + r11
            r1.f5331n = r7
        L_0x0257:
            r1.f5330m = r5
            r7 = 0
            r1.f5333p = r7
            r7 = -9223372036854775808
            r1.f5332o = r7
            int r0 = r1.f5327j
            if (r0 == r9) goto L_0x026d
            int r0 = r1.f5327j
            if (r0 == r10) goto L_0x026d
            int r0 = r1.f5327j
            if (r0 != r15) goto L_0x01ea
        L_0x026d:
            java.lang.String r0 = "[video] OP_PAUSE execute , mMediaPlayer  OP_PAUSE !"
            com.bykv.p068vk.openvk.component.video.api.p088f.C2536c.m6433a((java.lang.String) r4, (java.lang.String) r0)     // Catch:{ all -> 0x029f }
            com.bykv.vk.openvk.component.video.a.d.c r0 = r1.f5322e     // Catch:{ all -> 0x029f }
            r0.mo16250g()     // Catch:{ all -> 0x029f }
            r1.f5327j = r10     // Catch:{ all -> 0x029f }
            r1.f5312G = r5     // Catch:{ all -> 0x029f }
            java.util.List<java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.api.a$a>> r0 = r1.f5341z     // Catch:{ all -> 0x029f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x029f }
        L_0x0281:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x029f }
            if (r3 == 0) goto L_0x02e7
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x029f }
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch:{ all -> 0x029f }
            if (r3 == 0) goto L_0x0281
            java.lang.Object r7 = r3.get()     // Catch:{ all -> 0x029f }
            if (r7 == 0) goto L_0x0281
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x029f }
            com.bykv.vk.openvk.component.video.api.a$a r3 = (com.bykv.p068vk.openvk.component.video.api.C2515a.C2516a) r3     // Catch:{ all -> 0x029f }
            r3.mo16331d(r1)     // Catch:{ all -> 0x029f }
            goto L_0x0281
        L_0x029f:
            r0 = move-exception
            java.lang.String r3 = "OP_PAUSE error: "
            com.bykv.p068vk.openvk.component.video.api.p088f.C2536c.m6434a(r4, r3, r0)
            goto L_0x02e7
        L_0x02a6:
            int r0 = r1.f5327j
            if (r0 == r13) goto L_0x02b2
            int r0 = r1.f5327j
            if (r0 == r10) goto L_0x02b2
            int r0 = r1.f5327j
            if (r0 != r15) goto L_0x01ea
        L_0x02b2:
            com.bykv.vk.openvk.component.video.a.d.c r0 = r1.f5322e     // Catch:{ all -> 0x02e1 }
            r0.mo16247e()     // Catch:{ all -> 0x02e1 }
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02e1 }
            r1.f5335r = r7     // Catch:{ all -> 0x02e1 }
            java.lang.String r0 = "[video] OP_START execute , mMediaPlayer real start !"
            com.bykv.p068vk.openvk.component.video.api.p088f.C2536c.m6433a((java.lang.String) r4, (java.lang.String) r0)     // Catch:{ all -> 0x02e1 }
            r1.f5327j = r9     // Catch:{ all -> 0x02e1 }
            long r7 = r1.f5328k     // Catch:{ all -> 0x02e1 }
            r9 = 0
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x02d7
            com.bykv.vk.openvk.component.video.a.d.c r0 = r1.f5322e     // Catch:{ all -> 0x02e1 }
            long r7 = r1.f5328k     // Catch:{ all -> 0x02e1 }
            r0.mo16238a((long) r7)     // Catch:{ all -> 0x02e1 }
            r7 = -1
            r1.f5328k = r7     // Catch:{ all -> 0x02e1 }
        L_0x02d7:
            com.bykv.vk.openvk.component.video.api.c.c r0 = r1.f5306A     // Catch:{ all -> 0x02e1 }
            if (r0 == 0) goto L_0x02e7
            boolean r0 = r1.f5307B     // Catch:{ all -> 0x02e1 }
            r1.mo16279a((boolean) r0)     // Catch:{ all -> 0x02e1 }
            goto L_0x02e7
        L_0x02e1:
            r0 = move-exception
            java.lang.String r3 = "OP_START error: "
            com.bykv.p068vk.openvk.component.video.api.p088f.C2536c.m6434a(r4, r3, r0)
        L_0x02e7:
            if (r5 == 0) goto L_0x031e
            r0 = 200(0xc8, float:2.8E-43)
            r1.f5327j = r0
            boolean r0 = r1.f5324g
            if (r0 != 0) goto L_0x031e
            com.bykv.vk.openvk.component.video.api.c.a r0 = new com.bykv.vk.openvk.component.video.api.c.a
            r3 = 308(0x134, float:4.32E-43)
            r0.<init>(r3, r2)
            java.util.List<java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.api.a$a>> r2 = r1.f5341z
            java.util.Iterator r2 = r2.iterator()
        L_0x02fe:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x031c
            java.lang.Object r3 = r2.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            if (r3 == 0) goto L_0x02fe
            java.lang.Object r4 = r3.get()
            if (r4 == 0) goto L_0x02fe
            java.lang.Object r3 = r3.get()
            com.bykv.vk.openvk.component.video.api.a$a r3 = (com.bykv.p068vk.openvk.component.video.api.C2515a.C2516a) r3
            r3.mo16326a((com.bykv.p068vk.openvk.component.video.api.C2515a) r1, (com.bykv.p068vk.openvk.component.video.api.p085c.C2520a) r0)
            goto L_0x02fe
        L_0x031c:
            r1.f5324g = r6
        L_0x031e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.p068vk.openvk.component.video.p069a.p081d.C2495d.mo16275a(android.os.Message):void");
    }

    /* renamed from: a */
    private void m6150a(String str) throws Throwable {
        FileInputStream fileInputStream = new FileInputStream(str);
        this.f5322e.mo16242a(fileInputStream.getFD());
        fileInputStream.close();
    }

    /* renamed from: w */
    private void m6175w() {
        C2536c.m6436b("CSJ_VIDEO_MEDIA", "releaseMediaPlayer: ");
        C2487c cVar = this.f5322e;
        if (cVar != null) {
            try {
                cVar.mo16255l();
            } catch (Throwable th) {
                C2536c.m6434a("CSJ_VIDEO_MEDIA", "releaseMediaplayer error1: ", th);
            }
            this.f5322e.mo16226a((C2487c.C2489b) null);
            this.f5322e.mo16231a((C2487c.C2494g) null);
            this.f5322e.mo16225a((C2487c.C2488a) null);
            this.f5322e.mo16228a((C2487c.C2491d) null);
            this.f5322e.mo16227a((C2487c.C2490c) null);
            this.f5322e.mo16229a((C2487c.C2492e) null);
            this.f5322e.mo16230a((C2487c.C2493f) null);
            try {
                this.f5322e.mo16254k();
            } catch (Throwable th2) {
                C2536c.m6434a("CSJ_VIDEO_MEDIA", "releaseMediaplayer error2: ", th2);
            }
        }
    }

    /* renamed from: x */
    private void m6176x() {
        Handler handler = this.f5329l;
        if (handler != null && handler.getLooper() != null) {
            this.f5329l.post(new Runnable() {
                public void run() {
                    if (C2495d.this.f5329l.getLooper() != null) {
                        try {
                            C2536c.m6433a("CSJ_VIDEO_MEDIA", "onDestory............");
                            C2495d.this.f5329l.getLooper().quit();
                        } catch (Throwable th) {
                            C2536c.m6434a("CSJ_VIDEO_MEDIA", "onDestroy error: ", th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo16265a(C2487c cVar, int i) {
        if (this.f5322e == cVar) {
            for (WeakReference next : this.f5341z) {
                if (!(next == null || next.get() == null)) {
                    ((C2515a.C2516a) next.get()).mo16329b(this, i);
                }
            }
        }
    }

    /* renamed from: y */
    private void m6177y() {
        Integer valueOf = Integer.valueOf(f5305x.get(this.f5338u));
        if (valueOf == null) {
            f5305x.put(this.f5338u, 1);
        } else {
            f5305x.put(this.f5338u, Integer.valueOf(valueOf.intValue() + 1).intValue());
        }
    }

    /* renamed from: a */
    public void mo16266a(C2487c cVar) {
        this.f5327j = !this.f5323f ? 209 : 206;
        f5305x.delete(this.f5338u);
        for (WeakReference next : this.f5341z) {
            if (!(next == null || next.get() == null)) {
                ((C2515a.C2516a) next.get()).mo16320a(this);
            }
        }
        m6156b("completion");
    }

    /* renamed from: a */
    public boolean mo16267a(C2487c cVar, int i, int i2) {
        C2536c.m6440c("CSJ_VIDEO_MEDIA", "what=" + i + "extra=" + i2);
        m6177y();
        this.f5327j = 200;
        Handler handler = this.f5329l;
        if (handler != null) {
            handler.removeCallbacks(this.f5310E);
        }
        if (m6151a(i, i2)) {
            m6176x();
        }
        if (!this.f5324g) {
            C2520a aVar = new C2520a(308, i2);
            for (WeakReference next : this.f5341z) {
                if (!(next == null || next.get() == null)) {
                    ((C2515a.C2516a) next.get()).mo16326a((C2515a) this, aVar);
                }
            }
            this.f5324g = true;
            return true;
        }
        C2520a aVar2 = new C2520a(i, i2);
        for (WeakReference next2 : this.f5341z) {
            if (!(next2 == null || next2.get() == null)) {
                ((C2515a.C2516a) next2.get()).mo16326a((C2515a) this, aVar2);
            }
        }
        return true;
    }

    /* renamed from: a */
    private boolean m6151a(int i, int i2) {
        C2536c.m6433a("CSJ_VIDEO_MEDIA", "OnError - Error code: " + i + " Extra code: " + i2);
        boolean z = i == -1010 || i == -1007 || i == -1004 || i == -110 || i == 100 || i == 200;
        if (i2 == 1 || i2 == 700 || i2 == 800) {
            return true;
        }
        return z;
    }

    /* renamed from: b */
    public boolean mo16268b(C2487c cVar, int i, int i2) {
        C2536c.m6440c("CSJ_VIDEO_MEDIA", "what,extra:" + i + "," + i2);
        if (this.f5322e != cVar) {
            return false;
        }
        if (i2 == -1004) {
            C2520a aVar = new C2520a(i, i2);
            for (WeakReference next : this.f5341z) {
                if (!(next == null || next.get() == null)) {
                    ((C2515a.C2516a) next.get()).mo16326a((C2515a) this, aVar);
                }
            }
        }
        m6154b(i, i2);
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m6154b(int i, int i2) {
        String str;
        int i3 = i;
        if (i3 == 701) {
            this.f5315J = SystemClock.elapsedRealtime();
            this.f5320c++;
            for (WeakReference next : this.f5341z) {
                if (!(next == null || next.get() == null)) {
                    ((C2515a.C2516a) next.get()).mo16323a(this, Integer.MAX_VALUE, 0, 0);
                }
            }
            C2536c.m6438b("CSJ_VIDEO_MEDIA", "bufferCount = ", Integer.valueOf(this.f5320c));
        } else if (i3 == 702) {
            if (this.f5315J > 0) {
                str = "CSJ_VIDEO_MEDIA";
                this.f5316K += SystemClock.elapsedRealtime() - this.f5315J;
                this.f5315J = 0;
            } else {
                str = "CSJ_VIDEO_MEDIA";
            }
            for (WeakReference next2 : this.f5341z) {
                if (!(next2 == null || next2.get() == null)) {
                    ((C2515a.C2516a) next2.get()).mo16321a((C2515a) this, Integer.MAX_VALUE);
                }
            }
            C2536c.m6438b(str, "bufferCount = ", Integer.valueOf(this.f5320c), " mBufferTotalTime = ", Long.valueOf(this.f5316K));
        } else {
            String str2 = "CSJ_VIDEO_MEDIA";
            if (this.f5317L && i3 == 3) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.f5335r;
                this.f5321d = true;
                for (WeakReference next3 : this.f5341z) {
                    if (!(next3 == null || next3.get() == null)) {
                        ((C2515a.C2516a) next3.get()).mo16324a((C2515a) this, elapsedRealtime);
                    }
                }
                mo16279a(this.f5307B);
                C2536c.m6436b(str2, "onRenderStart");
            }
        }
    }

    /* renamed from: b */
    public void mo16269b(C2487c cVar) {
        this.f5327j = ErrorCode.INLINE_CATEGORY_VIOLATES_BLOCKED_CATEGORIES_ERROR;
        if (this.f5312G) {
            this.f5329l.post(new Runnable() {
                public void run() {
                    try {
                        C2495d.this.f5322e.mo16250g();
                        int unused = C2495d.this.f5327j = 207;
                        boolean unused2 = C2495d.this.f5312G = false;
                    } catch (Throwable th) {
                        C2536c.m6434a("CSJ_VIDEO_MEDIA", "onPrepared error: ", th);
                    }
                }
            });
        } else {
            Handler handler = this.f5329l;
            handler.sendMessage(handler.obtainMessage(100, -1, -1));
        }
        f5305x.delete(this.f5338u);
        if (!this.f5317L && !this.f5336s) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f5335r;
            for (WeakReference next : this.f5341z) {
                if (!(next == null || next.get() == null)) {
                    ((C2515a.C2516a) next.get()).mo16324a((C2515a) this, elapsedRealtime);
                }
            }
            this.f5321d = true;
            this.f5336s = true;
        }
        for (WeakReference next2 : this.f5341z) {
            if (!(next2 == null || next2.get() == null)) {
                ((C2515a.C2516a) next2.get()).mo16328b(this);
            }
        }
    }

    /* renamed from: c */
    public void mo16270c(C2487c cVar) {
        for (WeakReference next : this.f5341z) {
            if (!(next == null || next.get() == null)) {
                ((C2515a.C2516a) next.get()).mo16327a((C2515a) this, true);
            }
        }
    }

    /* renamed from: a */
    private void m6149a(Runnable runnable) {
        if (this.f5337t == null) {
            this.f5337t = new ArrayList<>();
        }
        this.f5337t.add(runnable);
    }

    /* renamed from: z */
    private void m6178z() {
        if (!this.f5325h) {
            this.f5325h = true;
            Iterator it = new ArrayList(this.f5337t).iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            this.f5337t.clear();
            this.f5325h = false;
        }
    }

    /* renamed from: A */
    private void m6141A() {
        ArrayList<Runnable> arrayList = this.f5337t;
        if (arrayList != null && !arrayList.isEmpty()) {
            m6178z();
        }
    }

    /* renamed from: B */
    private void m6142B() {
        ArrayList<Runnable> arrayList = this.f5337t;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f5337t.clear();
        }
    }

    /* renamed from: b */
    private void m6155b(Runnable runnable) {
        if (runnable != null) {
            if (!this.f5326i) {
                runnable.run();
            } else {
                m6149a(runnable);
            }
        }
    }

    /* renamed from: a */
    public void mo16279a(final boolean z) {
        C2518b.m6275c().post(new Runnable() {
            public void run() {
                C2536c.m6438b("CSJ_VIDEO_MEDIA", "run:before setQuietPlay ", Boolean.valueOf(z));
                if (!C2495d.this.f5326i && C2495d.this.f5327j != 203 && C2495d.this.f5322e != null) {
                    try {
                        C2536c.m6438b("CSJ_VIDEO_MEDIA", "run:exec  setQuietPlay ", Boolean.valueOf(z));
                        boolean unused = C2495d.this.f5307B = z;
                        C2495d.this.f5322e.mo16246d(z);
                    } catch (Throwable th) {
                        C2536c.m6434a("CSJ_VIDEO_MEDIA", "setQuietPlay error: ", th);
                    }
                }
            }
        });
    }

    /* renamed from: b */
    private void m6156b(String str) {
        Handler handler = this.f5329l;
        if (handler != null) {
            handler.removeMessages(ErrorCode.DIFFERENT_LINEARITY_EXPECTED_ERROR);
        }
        synchronized (this.f5313H) {
            if (this.f5314I != null) {
                this.f5314I = null;
            }
        }
    }

    /* renamed from: o */
    public long mo16295o() {
        if (Build.VERSION.SDK_INT < 23) {
            return this.f5316K;
        }
        if (this.f5330m) {
            long j = this.f5333p;
            if (j > 0) {
                return this.f5331n + j;
            }
        }
        return this.f5331n;
    }

    /* renamed from: j */
    public int mo16290j() {
        C2487c cVar = this.f5322e;
        if (cVar != null) {
            return cVar.mo16256m();
        }
        return 0;
    }

    /* renamed from: k */
    public int mo16291k() {
        C2487c cVar = this.f5322e;
        if (cVar != null) {
            return cVar.mo16257n();
        }
        return 0;
    }

    /* renamed from: p */
    public int mo16296p() {
        return this.f5320c;
    }

    /* renamed from: a */
    public void mo16271a(C2487c cVar, int i, int i2, int i3, int i4) {
        for (WeakReference next : this.f5341z) {
            if (!(next == null || next.get() == null)) {
                ((C2515a.C2516a) next.get()).mo16322a((C2515a) this, i, i2);
            }
        }
    }

    /* renamed from: q */
    public long mo16297q() {
        long j = this.f5334q;
        if (j != 0) {
            return j;
        }
        if (this.f5327j == 206 || this.f5327j == 207) {
            try {
                this.f5334q = this.f5322e.mo16253j();
            } catch (Throwable unused) {
            }
        }
        return this.f5334q;
    }

    /* renamed from: s */
    public long mo16299s() {
        if (this.f5327j != 206 && this.f5327j != 207) {
            return 0;
        }
        try {
            return this.f5322e.mo16252i();
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public void mo16277a(C2515a.C2516a aVar) {
        if (aVar != null) {
            for (WeakReference next : this.f5341z) {
                if (next != null && next.get() == aVar) {
                    return;
                }
            }
            this.f5341z.add(new WeakReference(aVar));
        }
    }

    /* renamed from: f */
    public SurfaceHolder mo16286f() {
        return this.f5319b;
    }

    /* renamed from: g */
    public SurfaceTexture mo16287g() {
        return this.f5318a;
    }
}
