package com.bytedance.sdk.openadsdk.core.video.p164c;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bykv.p068vk.openvk.component.video.api.C2515a;
import com.bykv.p068vk.openvk.component.video.api.p085c.C2520a;
import com.bykv.p068vk.openvk.component.video.api.p085c.C2522c;
import com.bykv.p068vk.openvk.component.video.api.p086d.C2523a;
import com.bykv.p068vk.openvk.component.video.api.p086d.C2524b;
import com.bykv.p068vk.openvk.component.video.api.p086d.C2526c;
import com.bykv.p068vk.openvk.component.video.api.renderview.C2540b;
import com.bykv.p068vk.openvk.component.video.p069a.p081d.C2495d;
import com.bykv.p068vk.openvk.component.video.p069a.p082e.C2510a;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2979o;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p151e.C3485l;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.C3720d;
import com.bytedance.sdk.openadsdk.core.video.p162a.C3658a;
import com.bytedance.sdk.openadsdk.core.widget.C3761e;
import com.bytedance.sdk.openadsdk.p179k.C3909e;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import com.bytedance.sdk.openadsdk.utils.C4020v;
import java.lang.ref.WeakReference;
import java.util.EnumSet;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.core.video.c.a */
/* compiled from: BaseVideoController */
public abstract class C3670a extends C3658a {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public long f9340A = 0;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public long f9341B = 0;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C2526c.C2527a f9342C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f9343D = false;

    /* renamed from: E */
    private boolean f9344E = false;

    /* renamed from: F */
    private boolean f9345F = false;

    /* renamed from: G */
    private WeakReference<C2526c.C2528b> f9346G;

    /* renamed from: H */
    private int f9347H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public boolean f9348I = false;

    /* renamed from: J */
    private boolean f9349J = true;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public long f9350K;

    /* renamed from: L */
    private boolean f9351L = false;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public boolean f9352M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public final Runnable f9353N = new Runnable() {
        public void run() {
            if (C3670a.this.f9342C != null) {
                C3670a.this.mo18980z();
                C3670a.this.f9342C.mo16462a();
            }
        }
    };

    /* renamed from: O */
    private long f9354O;

    /* renamed from: P */
    private final BroadcastReceiver f9355P = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            try {
                String action = intent.getAction();
                if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    C3670a.this.mo16437b();
                } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    int i = 0;
                    if (!intent.getBooleanExtra("noConnectivity", false)) {
                        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
                        if (networkInfo != null) {
                            int type = networkInfo.getType();
                            if (type == 1) {
                                i = 4;
                            } else if (type == 0) {
                                i = 1;
                            }
                        } else {
                            i = C2979o.m8409c(context);
                        }
                    }
                    C3670a.this.m11736a(context, i);
                }
            } catch (Throwable unused) {
            }
        }
    };

    /* renamed from: Q */
    private int f9356Q = 1;

    /* renamed from: R */
    private boolean f9357R = false;

    /* renamed from: s */
    protected Map<String, Object> f9358s = null;

    /* renamed from: t */
    protected long f9359t = 0;

    /* renamed from: u */
    protected long f9360u = 0;

    /* renamed from: v */
    protected boolean f9361v = false;

    /* renamed from: w */
    protected boolean f9362w = false;

    /* renamed from: x */
    protected C2522c f9363x;

    /* renamed from: y */
    C2515a.C2516a f9364y = new C2515a.C2516a() {
        /* renamed from: d */
        public void mo16331d(C2515a aVar) {
        }

        /* renamed from: e */
        public void mo16332e(C2515a aVar) {
        }

        /* renamed from: a */
        public void mo16320a(C2515a aVar) {
            C2975l.m8387c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onCompletion: ");
            C3670a.this.f9306k.post(new Runnable() {
                public void run() {
                    C3670a.this.m11711O();
                }
            });
            if (C3670a.this.f9300e.mo19680ax() != null && C3670a.this.f9300e.mo19680ax().mo19977a() != null) {
                C3670a.this.f9300e.mo19680ax().mo19977a().mo20050d(C3670a.this.mo16449g());
                C3670a.this.f9300e.mo19680ax().mo19977a().mo20052e(C3670a.this.mo16449g());
            }
        }

        /* renamed from: a */
        public void mo16324a(C2515a aVar, final long j) {
            C2975l.m8387c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onRenderStart: ");
            C3670a.this.f9306k.post(new Runnable() {
                public void run() {
                    if (C3670a.this.f9299d != null) {
                        C3670a.this.f9299d.mo16427b();
                        C3670a.this.f9306k.removeCallbacks(C3670a.this.f9353N);
                        boolean unused = C3670a.this.f9348I = false;
                    }
                    if (!C3670a.this.f9343D) {
                        C3670a.this.f9360u = j;
                        C3670a.this.mo18978x();
                        C3670a.this.m11726V();
                        boolean unused2 = C3670a.this.f9343D = true;
                        C3670a.this.f9362w = true;
                    }
                }
            });
            long unused = C3670a.this.f9350K = System.currentTimeMillis();
        }

        /* renamed from: b */
        public void mo16328b(C2515a aVar) {
            C2975l.m8387c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onPrepared: ");
            C3670a.this.f9306k.post(new Runnable() {
                public void run() {
                    if (C3670a.this.f9306k != null) {
                        C3670a.this.f9306k.removeCallbacks(C3670a.this.f9353N);
                    }
                    if (C3670a.this.f9299d != null) {
                        C3670a.this.f9299d.mo16427b();
                    }
                }
            });
        }

        /* renamed from: a */
        public void mo16326a(C2515a aVar, final C2520a aVar2) {
            C2975l.m8387c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onError: ");
            if (aVar2 != null) {
                C3670a.this.f9306k.post(new Runnable() {
                    public void run() {
                        C3670a.this.mo18972a(aVar2.mo16333a(), aVar2.mo16334b());
                        C3670a.this.f9306k.removeCallbacks(C3670a.this.f9353N);
                        if (C3670a.this.f9299d != null) {
                            C3670a.this.f9299d.mo16427b();
                        }
                        if (C3670a.this.f9342C != null) {
                            C3670a.this.f9342C.mo16465b(C3670a.this.f9341B, C2510a.m6215a(C3670a.this.f9301f, C3670a.this.f9312q));
                        }
                    }
                });
                aVar2.mo16333a();
                aVar2.mo16335c();
            }
        }

        /* renamed from: a */
        public void mo16327a(C2515a aVar, boolean z) {
            C2975l.m8387c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onSeekCompletion: ");
            C3670a.this.f9306k.post(new Runnable() {
                public void run() {
                    C3670a.this.f9306k.removeCallbacks(C3670a.this.f9353N);
                    if (C3670a.this.f9299d != null) {
                        C3670a.this.f9299d.mo16427b();
                    }
                }
            });
        }

        /* renamed from: c */
        public void mo16330c(C2515a aVar) {
            C2975l.m8387c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onRelease: ");
        }

        /* renamed from: a */
        public void mo16322a(C2515a aVar, int i, int i2) {
            C2975l.m8387c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onVideoSizeChanged: ");
            C3670a.this.f9306k.post(new Runnable() {
                public void run() {
                    if (!C3670a.this.m11714P()) {
                        C3670a.this.m11716Q();
                    } else if (C3670a.this.f9300e != null && (C3485l.m10539b(C3670a.this.f9300e) || C3670a.this.f9352M)) {
                        C3670a.this.mo20280g(true);
                    } else if (C3670a.this.f9300e != null && C3670a.this.f9300e.mo19746t() == 3) {
                        C3670a.this.mo20280g(true);
                    } else if (C3670a.this.f9300e == null || C3670a.this.f9300e.mo19746t() != 0) {
                        C3670a.this.m11719S();
                    } else {
                        C3670a.this.m11722T();
                    }
                }
            });
        }

        /* renamed from: a */
        public void mo16323a(C2515a aVar, int i, int i2, int i3) {
            C2975l.m8387c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onBufferStart: ");
            C3670a.this.f9306k.post(new Runnable() {
                public void run() {
                    if (C3670a.this.f9299d != null) {
                        C3670a.this.f9299d.mo20410u();
                        C3670a.this.m11709N();
                        boolean unused = C3670a.this.f9348I = true;
                    }
                }
            });
        }

        /* renamed from: a */
        public void mo16321a(C2515a aVar, int i) {
            C2975l.m8387c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onBufferEnd: ");
            C3670a.this.f9306k.post(new Runnable() {
                public void run() {
                    if (C3670a.this.f9299d != null) {
                        C3670a.this.f9299d.mo16427b();
                        C3670a.this.f9306k.removeCallbacks(C3670a.this.f9353N);
                        boolean unused = C3670a.this.f9348I = false;
                    }
                }
            });
        }

        /* renamed from: b */
        public void mo16329b(C2515a aVar, int i) {
            C2975l.m8387c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onBufferingUpdate: ");
        }

        /* renamed from: a */
        public void mo16325a(C2515a aVar, long j, long j2) {
            if (Math.abs(j - C3670a.this.f9301f) >= 50) {
                final long j3 = j;
                final long j4 = j2;
                C3670a.this.f9306k.post(new Runnable() {
                    public void run() {
                        C3670a.this.m11733a(j3, j4);
                    }
                });
                if (C3670a.this.f9300e.mo19680ax() != null && C3670a.this.f9300e.mo19680ax().mo19977a() != null) {
                    C3670a.this.f9300e.mo19680ax().mo19977a().mo20037a(j, j2);
                }
            }
        }
    };

    /* renamed from: z */
    private final ViewGroup f9365z;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo18972a(int i, int i2);

    /* renamed from: a */
    public void mo20276a(C2524b bVar, View view, boolean z) {
    }

    /* renamed from: a */
    public void mo16432a(C2526c.C2530d dVar) {
    }

    /* renamed from: d */
    public void mo16445d(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract int mo18974t();

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract void mo18975u();

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract void mo18976v();

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract void mo18977w();

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public abstract void mo18978x();

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract void mo18979y();

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public abstract void mo18980z();

    /* renamed from: H */
    public void mo20269H() {
        C2515a.C2516a aVar = this.f9364y;
        if (aVar != null) {
            aVar.mo16322a((C2515a) null, 0, 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo20280g(boolean z) {
        try {
            C2975l.m8387c("changeVideoSize", "landingPageChangeVideoSize start.......mMaterialMeta.getAdSlot()=" + this.f9300e.mo19754x());
            if (!m11718R() || z) {
                C2975l.m8387c("changeVideoSize", "landingPageChangeVideoSize start check condition complete ... go ..");
                float j = (float) this.f9298c.mo16290j();
                float k = (float) this.f9298c.mo16291k();
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) j, (int) k);
                layoutParams.addRule(13);
                if (mo20271J() != null) {
                    if (mo20271J() instanceof TextureView) {
                        ((TextureView) mo20271J()).setLayoutParams(layoutParams);
                    } else if (mo20271J() instanceof SurfaceView) {
                        ((SurfaceView) mo20271J()).setLayoutParams(layoutParams);
                    }
                    ViewGroup.LayoutParams layoutParams2 = this.f9365z.getLayoutParams();
                    if (this.f9365z.getHeight() > 0) {
                        float min = Math.min(((float) this.f9365z.getWidth()) / j, ((float) this.f9365z.getHeight()) / k);
                        if (layoutParams2 != null) {
                            layoutParams.width = (int) (j * min);
                            layoutParams.height = (int) (k * min);
                            if (mo20271J() instanceof TextureView) {
                                ((TextureView) mo20271J()).setLayoutParams(layoutParams);
                            } else if (mo20271J() instanceof SurfaceView) {
                                ((SurfaceView) mo20271J()).setLayoutParams(layoutParams);
                            }
                            if (this.f9352M) {
                                layoutParams2.width = layoutParams.width;
                                layoutParams2.height = layoutParams.height;
                                this.f9365z.setLayoutParams(layoutParams2);
                            }
                        }
                    }
                }
                C2975l.m8384b("changeVideoSize", "changeVideoSize .... complete ... end !!!");
            }
        } catch (Throwable th) {
            C2975l.m8388c("changeVideoSize", "changeSize error", th);
        }
    }

    /* renamed from: a */
    private void m11735a(Context context) {
        EnumSet<E> noneOf = EnumSet.noneOf(C2524b.C2525a.class);
        noneOf.add(C2524b.C2525a.hideCloseBtn);
        noneOf.add(C2524b.C2525a.hideBackBtn);
        this.f9299d = new C3720d(context.getApplicationContext(), LayoutInflater.from(context.getApplicationContext()).inflate(C2984t.m8433f(context, "tt_video_play_layout_for_live"), (ViewGroup) null, false), true, noneOf, this.f9300e, this);
        this.f9299d.mo20395a((C2523a) this);
    }

    protected C3670a(Context context, ViewGroup viewGroup, C3498n nVar) {
        this.f9356Q = C2979o.m8409c(context);
        this.f9365z = viewGroup;
        this.f9303h = new WeakReference(context);
        this.f9300e = nVar;
        m11735a(context);
        this.f9347H = C4014u.m13223f(this.f9300e);
    }

    /* renamed from: a */
    public boolean mo16436a(C2522c cVar) {
        mo16443c(false);
        if (cVar == null) {
            return false;
        }
        if (this.f9298c == null || !this.f9298c.mo16293m()) {
            this.f9363x = cVar;
            C2975l.m8384b("CSJ_VIDEO_BaseController", "video local url " + cVar.mo16398j());
            if (TextUtils.isEmpty(cVar.mo16398j())) {
                C2975l.m8391e("CSJ_VIDEO_BaseController", "No video info");
                return false;
            }
            mo18979y();
            this.f9361v = !cVar.mo16398j().startsWith("http");
            this.f9309n = cVar.mo16393f();
            if (cVar.mo16389e() > 0) {
                this.f9301f = cVar.mo16389e();
                this.f9302g = this.f9302g > this.f9301f ? this.f9302g : this.f9301f;
            }
            if (this.f9299d != null) {
                this.f9299d.mo16423a();
                this.f9299d.mo20375g();
                this.f9299d.mo20401c(cVar.mo16383c(), cVar.mo16386d());
                this.f9299d.mo20402c(this.f9365z);
            }
            if (!(this.f9298c != null || cVar.mo16400l() == -2 || cVar.mo16400l() == 1)) {
                this.f9298c = new C2495d();
            }
            if (this.f9298c != null) {
                this.f9298c.mo16277a(this.f9364y);
            }
            mo20244A();
            this.f9341B = 0;
            try {
                m11759c(cVar);
                return true;
            } catch (Exception unused) {
                return false;
            }
        } else {
            this.f9298c.mo16272a();
            return true;
        }
    }

    /* renamed from: r */
    public boolean mo16460r() {
        return this.f9348I;
    }

    /* renamed from: e */
    public void mo16447e(boolean z) {
        this.f9349J = z;
    }

    /* renamed from: b */
    public void mo16439b(C2522c cVar) {
        this.f9363x = cVar;
    }

    /* renamed from: l */
    public int mo16454l() {
        return C2510a.m6215a(this.f9302g, this.f9312q);
    }

    /* renamed from: a */
    public void mo16433a(Map<String, Object> map) {
        this.f9358s = map;
    }

    /* renamed from: c */
    private void m11759c(C2522c cVar) throws Exception {
        if (cVar != null) {
            this.f9363x = cVar;
            if (this.f9298c != null) {
                if (this.f9300e != null) {
                    this.f9300e.mo19607J();
                    cVar.mo16388d(String.valueOf(C4014u.m13223f(this.f9300e)));
                }
                cVar.mo16384c(1);
                this.f9298c.mo16278a(cVar);
            }
            this.f9340A = System.currentTimeMillis();
            if (!TextUtils.isEmpty(cVar.mo16398j())) {
                this.f9299d.mo20403d(8);
                this.f9299d.mo20403d(0);
                mo20251a((Runnable) new Runnable() {
                    public void run() {
                        long unused = C3670a.this.f9340A = System.currentTimeMillis();
                        C3670a.this.f9299d.mo20370c(0);
                        if (C3670a.this.f9298c != null && C3670a.this.f9301f == 0) {
                            C3670a.this.f9298c.mo16280a(true, 0, C3670a.this.f9309n);
                        } else if (C3670a.this.f9298c != null) {
                            C3670a.this.f9298c.mo16280a(true, C3670a.this.f9301f, C3670a.this.f9309n);
                        }
                    }
                });
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public void m11709N() {
        int i;
        int t = mo18974t();
        if (t == 2 || t == 1) {
            i = C3578m.m11241h().mo19975y() * 1000;
        } else {
            i = t == 3 ? C3578m.m11241h().mo19938e(String.valueOf(this.f9347H)) : 5;
        }
        this.f9306k.removeCallbacks(this.f9353N);
        this.f9306k.postDelayed(this.f9353N, (long) i);
    }

    /* renamed from: a */
    public void mo16431a(C2526c.C2528b bVar) {
        this.f9346G = new WeakReference<>(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public void m11711O() {
        if (mo20246C() && this.f9299d != null) {
            this.f9306k.removeCallbacks(this.f9353N);
            this.f9299d.mo16427b();
            long currentTimeMillis = System.currentTimeMillis() - this.f9340A;
            this.f9341B = currentTimeMillis;
            C2526c.C2527a aVar = this.f9342C;
            if (aVar != null) {
                aVar.mo16463a(currentTimeMillis, C2510a.m6215a(this.f9301f, this.f9312q));
            }
            if (!this.f9344E) {
                this.f9344E = true;
                m11733a(this.f9312q, this.f9312q);
                long j = this.f9312q;
                this.f9301f = j;
                this.f9302g = j;
                mo18975u();
            }
            this.f9307l = true;
        }
    }

    /* renamed from: a */
    public void mo16430a(C2526c.C2527a aVar) {
        this.f9342C = aVar;
    }

    /* renamed from: b */
    public void mo16437b() {
        if (this.f9298c != null) {
            this.f9298c.mo16281b();
        }
        if (!this.f9344E && this.f9343D) {
            mo18976v();
            if (this.f9300e.mo19680ax() != null && this.f9300e.mo19680ax().mo19977a() != null) {
                this.f9300e.mo19680ax().mo19977a().mo20046b(this.f9301f);
            }
        }
    }

    /* renamed from: d */
    public void mo16444d() {
        if (this.f9299d != null) {
            this.f9299d.mo16423a();
            this.f9299d.mo20408s();
            this.f9299d.mo20411v();
        }
        C2975l.m8380a("CSJ_VIDEO_BaseController", "resumeVideo:  mIsSurfaceValid = ", Boolean.valueOf(this.f9305j));
        if (this.f9298c != null) {
            if (this.f9298c.mo16293m()) {
                if (this.f9305j) {
                    mo20248E();
                } else {
                    mo20252b(this.f9313r);
                }
                C2975l.m8380a("CSJ_VIDEO_BaseController", "resumeVideo: isPaused = true , mIsSurfaceValid = ", Boolean.valueOf(this.f9305j));
            } else {
                this.f9298c.mo16280a(false, this.f9301f, this.f9309n);
            }
        }
        if (!this.f9344E && this.f9343D) {
            mo18977w();
            if (this.f9300e.mo19680ax() != null && this.f9300e.mo19680ax().mo19977a() != null) {
                this.f9300e.mo19680ax().mo19977a().mo20048c(mo16449g());
            }
        }
    }

    /* renamed from: I */
    public void mo20270I() {
        if (!this.f9344E && this.f9343D) {
            mo18977w();
            if (this.f9300e.mo19680ax() != null && this.f9300e.mo19680ax().mo19977a() != null) {
                this.f9300e.mo19680ax().mo19977a().mo20048c(mo16449g());
            }
        }
    }

    /* renamed from: d */
    public void mo20279d(long j) {
        this.f9301f = j;
        this.f9302g = this.f9302g > this.f9301f ? this.f9302g : this.f9301f;
        if (this.f9299d != null) {
            this.f9299d.mo16423a();
        }
        if (this.f9298c != null) {
            this.f9298c.mo16280a(true, this.f9301f, this.f9309n);
        }
    }

    /* renamed from: e */
    public void mo16446e() {
        if (this.f9298c != null) {
            this.f9298c.mo16284d();
            this.f9298c = null;
        }
        if (this.f9299d != null) {
            this.f9299d.mo20377i();
        }
        if (this.f9306k != null) {
            this.f9306k.removeCallbacks(this.f9353N);
            this.f9306k.removeCallbacksAndMessages((Object) null);
        }
    }

    /* renamed from: a */
    public void mo16435a(boolean z, int i) {
        mo16446e();
    }

    /* renamed from: f */
    public void mo16448f() {
        mo16446e();
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public boolean m11714P() {
        if (this.f9300e == null || this.f9300e.mo19670an() == 100.0f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public void m11716Q() {
        try {
            if (mo20271J() != null && this.f9298c != null) {
                if (this.f9365z != null) {
                    int width = this.f9365z.getWidth();
                    int height = this.f9365z.getHeight();
                    float j = (float) this.f9298c.mo16290j();
                    float k = (float) this.f9298c.mo16291k();
                    float f = (float) width;
                    float f2 = (float) height;
                    if (j / (f * 1.0f) <= k / (f2 * 1.0f)) {
                        f = (f2 / (k * 1.0f)) * j;
                    } else {
                        f2 = (f / (j * 1.0f)) * k;
                    }
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) f, (int) f2);
                    layoutParams.addRule(13);
                    if (mo20271J() instanceof TextureView) {
                        ((TextureView) mo20271J()).setLayoutParams(layoutParams);
                    } else if (mo20271J() instanceof SurfaceView) {
                        ((SurfaceView) mo20271J()).setLayoutParams(layoutParams);
                    }
                }
            }
        } catch (Throwable th) {
            C2975l.m8388c("changeVideoSize", "changeVideoSizeSupportInteraction error", th);
        }
    }

    /* renamed from: R */
    private boolean m11718R() throws Throwable {
        if (this.f9303h == null || this.f9303h.get() == null || mo20271J() == null || this.f9298c == null || this.f9300e == null || this.f9300e.mo19604G() != null || this.f9300e.mo19750v() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public void m11719S() {
        try {
            C2975l.m8387c("changeVideoSize", "changeVideoSize start.......mMaterialMeta.getAdSlot()=" + this.f9300e.mo19754x());
            if (!m11718R()) {
                C2975l.m8387c("changeVideoSize", "changeVideoSize start check condition complete ... go ..");
                int[] b = C4020v.m13303b(C3578m.m11231a());
                boolean z = false;
                boolean z2 = this.f9300e.mo19669am() == 1;
                float f = (float) b[0];
                float f2 = (float) b[1];
                float j = (float) this.f9298c.mo16290j();
                float k = (float) this.f9298c.mo16291k();
                if (z2) {
                    if (j > k) {
                        C2975l.m8384b("changeVideoSize", "Separate adaptation for landscape to portrait .....");
                        m11732a(f, f2, j, k, true);
                        return;
                    }
                } else if (j < k) {
                    C2975l.m8384b("changeVideoSize", "Separate adaptation for portrait to landscape.....");
                    m11732a(f, f2, j, k, false);
                    return;
                }
                float f3 = j / k;
                float f4 = f / f2;
                C2975l.m8384b("changeVideoSize", "screenHeight=" + f2 + ",screenWidth=" + f);
                C2975l.m8384b("changeVideoSize", "videoHeight=" + k + ",videoWidth=" + j);
                C2975l.m8384b("changeVideoSize", "video w/h,videoScale=" + f3 + ",screen  w/h .screenScale=" + f4 + ",VERTICAL_SCALE(9:16)=" + 0.5625f + ",HORIZONTAL_SCALE(16:9) =" + 1.7777778f);
                if (z2) {
                    if (f4 < 0.5625f && f3 == 0.5625f) {
                        j = (9.0f * f2) / 16.0f;
                        z = true;
                        k = f2;
                    }
                } else if (f4 > 1.7777778f && f3 == 1.7777778f) {
                    k = (9.0f * f) / 16.0f;
                    z = true;
                    j = f;
                }
                C2975l.m8387c("changeVideoSize", "适配后宽高：videoHeight=" + k + ",videoWidth=" + j);
                if (!z) {
                    C2975l.m8387c("changeVideoSize", " Screen w/h == Video w/h and in other cases，use screen width and height，videoHeight=" + f2 + "，videoWidth=" + f);
                } else {
                    f = j;
                    f2 = k;
                }
                int i = (int) f;
                int i2 = (int) f2;
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i2);
                layoutParams.addRule(13);
                if (mo20271J() != null) {
                    if (mo20271J() instanceof TextureView) {
                        ((TextureView) mo20271J()).setLayoutParams(layoutParams);
                    } else if (mo20271J() instanceof SurfaceView) {
                        ((SurfaceView) mo20271J()).setLayoutParams(layoutParams);
                    }
                    ViewGroup.LayoutParams layoutParams2 = this.f9365z.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.height = i2;
                        layoutParams2.width = i;
                        this.f9365z.setLayoutParams(layoutParams2);
                    }
                }
                C2975l.m8384b("changeVideoSize", "changeVideoSize .... complete ... end !!!");
            }
        } catch (Throwable th) {
            C2975l.m8388c("changeVideoSize", "changeSize error", th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public void m11722T() {
        try {
            if (this.f9303h != null && this.f9303h.get() != null && mo20271J() != null && this.f9298c != null) {
                if (this.f9300e != null) {
                    boolean z = this.f9300e.mo19669am() == 1;
                    int[] b = C4020v.m13303b(C3578m.m11231a());
                    m11732a((float) b[0], (float) b[1], (float) this.f9298c.mo16290j(), (float) this.f9298c.mo16291k(), z);
                    C2975l.m8384b("changeVideoSize", "changeSize=end");
                }
            }
        } catch (Throwable th) {
            C2975l.m8379a("changeVideoSize", "changeSize error", th);
        }
    }

    /* renamed from: a */
    private void m11732a(float f, float f2, float f3, float f4, boolean z) {
        RelativeLayout.LayoutParams layoutParams;
        try {
            C2975l.m8384b("changeVideoSize", "screenWidth=" + f + ",screenHeight=" + f2);
            C2975l.m8384b("changeVideoSize", "videoHeight=" + f4 + ",videoWidth=" + f3);
            if (f3 <= 0.0f || f4 <= 0.0f) {
                f3 = (float) this.f9300e.mo19607J().mo16344c();
                f4 = (float) this.f9300e.mo19607J().mo16341b();
            }
            if (f4 <= 0.0f) {
                return;
            }
            if (f3 > 0.0f) {
                if (z) {
                    if (f3 >= f4) {
                        C2975l.m8384b("changeVideoSize", "Vertical screen mode use video width compute scale value");
                        layoutParams = new RelativeLayout.LayoutParams((int) f, (int) ((f4 * f) / f3));
                        layoutParams.addRule(13);
                    } else {
                        return;
                    }
                } else if (f3 <= f4) {
                    C2975l.m8384b("changeVideoSize", "Landscape screen mode use video height compute scale value");
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) ((f3 * f2) / f4), (int) f2);
                    layoutParams2.addRule(13);
                    layoutParams = layoutParams2;
                } else {
                    return;
                }
                if (mo20271J() == null) {
                    return;
                }
                if (mo20271J() instanceof TextureView) {
                    ((TextureView) mo20271J()).setLayoutParams(layoutParams);
                } else if (mo20271J() instanceof SurfaceView) {
                    ((SurfaceView) mo20271J()).setLayoutParams(layoutParams);
                }
            }
        } catch (Throwable th) {
            C2975l.m8379a("changeVideoSize", "changeSize error", th);
        }
    }

    /* renamed from: a */
    public void mo16413a(C2524b bVar, View view) {
        if (this.f9298c != null && mo20246C()) {
            if (this.f9298c.mo16292l()) {
                mo16437b();
                this.f9299d.mo20400b(true, false);
                this.f9299d.mo20374f();
            } else if (!this.f9298c.mo16293m()) {
                if (this.f9299d != null) {
                    this.f9299d.mo20402c(this.f9365z);
                }
                mo20279d(this.f9301f);
                if (this.f9299d != null) {
                    this.f9299d.mo20400b(false, false);
                }
            } else {
                mo16444d();
                if (this.f9299d != null) {
                    this.f9299d.mo20400b(false, false);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo16408a(C2524b bVar, int i) {
        if (this.f9298c != null) {
            m11734a(this.f9354O, m11755b(i));
        }
    }

    /* renamed from: b */
    public void mo16415b(C2524b bVar, int i) {
        if (this.f9299d != null) {
            this.f9299d.mo20374f();
        }
    }

    /* renamed from: a */
    public void mo16409a(C2524b bVar, int i, boolean z) {
        if (mo20246C()) {
            long n = (long) ((((float) (((long) i) * this.f9312q)) * 1.0f) / ((float) C2984t.m8441n((Context) this.f9303h.get(), "tt_video_progress_max")));
            if (this.f9312q > 0) {
                this.f9354O = (long) ((int) n);
            } else {
                this.f9354O = 0;
            }
            if (this.f9299d != null) {
                this.f9299d.mo20358a(this.f9354O);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11733a(long j, long j2) {
        this.f9301f = j;
        this.f9312q = j2;
        this.f9299d.mo20359a(j, j2);
        this.f9299d.mo20357a(C2510a.m6215a(j, j2));
        try {
            if (this.f9342C != null) {
                this.f9342C.mo16464a(j, j2);
            }
        } catch (Throwable th) {
            C2975l.m8388c("CSJ_VIDEO_BaseController", "onProgressUpdate error: ", th);
        }
    }

    /* renamed from: b */
    public void mo16418b(C2524b bVar, View view) {
        mo20278b(bVar, view, false, false);
    }

    /* renamed from: b */
    public void mo20278b(C2524b bVar, View view, boolean z, boolean z2) {
        if (mo20246C()) {
            mo20253f(!this.f9311p);
            if (!(this.f9303h.get() instanceof Activity)) {
                C2975l.m8384b("CSJ_VIDEO_BaseController", "context is not activity, not support this function.");
                return;
            }
            if (this.f9311p) {
                mo20275a(z ? 8 : 0);
                if (this.f9299d != null) {
                    this.f9299d.mo20362a(this.f9365z);
                    this.f9299d.mo20371c(false);
                }
            } else {
                mo20275a(1);
                if (this.f9299d != null) {
                    this.f9299d.mo20367b(this.f9365z);
                    this.f9299d.mo20371c(false);
                }
            }
            WeakReference<C2526c.C2528b> weakReference = this.f9346G;
            C2526c.C2528b bVar2 = weakReference != null ? (C2526c.C2528b) weakReference.get() : null;
            if (bVar2 != null) {
                bVar2.mo16466a(this.f9311p);
            }
        }
    }

    /* renamed from: a */
    public void mo20275a(int i) {
        if (mo20246C()) {
            boolean z = i == 0 || i == 8;
            Context context = (Context) this.f9303h.get();
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                try {
                    activity.setRequestedOrientation(i);
                } catch (Throwable unused) {
                }
                if (!z) {
                    activity.getWindow().setFlags(1024, 1024);
                } else {
                    activity.getWindow().clearFlags(1024);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo16419c(C2524b bVar, View view) {
        if (this.f9299d != null) {
            this.f9299d.mo20377i();
        }
        mo16435a(true, 3);
    }

    /* renamed from: a */
    public void mo16414a(C2524b bVar, View view, boolean z, boolean z2) {
        if (this.f9308m) {
            mo16437b();
        }
        if (z && !this.f9308m && !mo20272K()) {
            this.f9299d.mo20400b(!mo20273L(), false);
            this.f9299d.mo20366a(z2, true, false);
        }
        if (this.f9298c == null || !this.f9298c.mo16292l()) {
            this.f9299d.mo20374f();
            return;
        }
        this.f9299d.mo20374f();
        this.f9299d.mo20373e();
    }

    /* renamed from: d */
    public void mo16420d(C2524b bVar, View view) {
        if (this.f9311p) {
            mo20253f(false);
            if (this.f9299d != null) {
                this.f9299d.mo20367b(this.f9365z);
            }
            mo20275a(1);
            return;
        }
        mo16435a(true, 3);
    }

    /* renamed from: e */
    public void mo16421e(C2524b bVar, View view) {
        mo20276a(bVar, view, false);
    }

    /* renamed from: J */
    public C2540b mo20271J() {
        if (this.f9303h == null || this.f9303h.get() == null || this.f9299d == null) {
            return null;
        }
        return this.f9299d.mo20406q();
    }

    /* renamed from: K */
    public boolean mo20272K() {
        return this.f9298c.mo16288h();
    }

    /* renamed from: a */
    public void mo16407a() {
        if (this.f9299d != null) {
            this.f9299d.mo20373e();
            this.f9299d.mo16423a();
        }
        if (this.f9299d != null) {
            this.f9299d.mo20411v();
        }
        mo20279d(-1);
    }

    /* renamed from: L */
    public boolean mo20273L() {
        return this.f9298c != null && this.f9298c.mo16292l();
    }

    /* renamed from: a */
    private void m11734a(long j, boolean z) {
        if (this.f9298c != null) {
            if (z) {
                m11724U();
            }
            this.f9298c.mo16273a(j);
        }
    }

    /* renamed from: b */
    private boolean m11755b(int i) {
        return this.f9299d.mo20369b(i);
    }

    /* renamed from: U */
    private void m11724U() {
        if (this.f9299d != null) {
            this.f9299d.mo20370c(0);
            this.f9299d.mo20365a(false, false);
            this.f9299d.mo20371c(false);
            this.f9299d.mo20373e();
            this.f9299d.mo20375g();
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.video.c.a$5 */
    /* compiled from: BaseVideoController */
    static /* synthetic */ class C36845 {

        /* renamed from: a */
        static final /* synthetic */ int[] f9383a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bytedance.sdk.openadsdk.core.widget.e$a[] r0 = com.bytedance.sdk.openadsdk.core.widget.C3761e.C3763a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9383a = r0
                com.bytedance.sdk.openadsdk.core.widget.e$a r1 = com.bytedance.sdk.openadsdk.core.widget.C3761e.C3763a.PAUSE_VIDEO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9383a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.sdk.openadsdk.core.widget.e$a r1 = com.bytedance.sdk.openadsdk.core.widget.C3761e.C3763a.RELEASE_VIDEO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9383a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.sdk.openadsdk.core.widget.e$a r1 = com.bytedance.sdk.openadsdk.core.widget.C3761e.C3763a.START_VIDEO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.video.p164c.C3670a.C36845.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo20277a(C3761e.C3763a aVar, String str) {
        int i = C36845.f9383a[aVar.ordinal()];
        if (i == 1) {
            mo16437b();
        } else if (i == 2) {
            mo16435a(true, 3);
        } else if (i == 3) {
            mo16444d();
            this.f9310o = false;
            this.f9345F = true;
        }
    }

    /* renamed from: b */
    private boolean m11756b(int i, int i2) {
        if (i2 != 4 && i2 != 0) {
            mo16437b();
            this.f9310o = true;
            this.f9345F = false;
            if (!(this.f9299d == null || this.f9300e == null)) {
                return this.f9299d.mo20398a(i, this.f9300e.mo19607J(), true);
            }
        } else if (i2 == 4) {
            this.f9310o = false;
            if (this.f9299d != null) {
                this.f9299d.mo20408s();
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11736a(Context context, int i) {
        if (mo20246C() && this.f9356Q != i) {
            if (!this.f9345F) {
                m11756b(2, i);
            }
            this.f9356Q = i;
        }
    }

    /* renamed from: M */
    public void mo20274M() {
        this.f9352M = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public void m11726V() {
        if (this.f9300e != null) {
            C3578m.m11240g().mo20785a(C3909e.m12827a(this.f9300e.mo19617T(), true, this.f9300e));
        }
    }

    /* renamed from: k */
    public long mo16453k() {
        return mo16449g() + mo16450h();
    }
}
