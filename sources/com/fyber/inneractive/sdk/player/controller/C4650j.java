package com.fyber.inneractive.sdk.player.controller;

import android.graphics.Bitmap;
import com.fyber.inneractive.sdk.config.C4345y;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.global.C4309s;
import com.fyber.inneractive.sdk.model.vast.C4493q;
import com.fyber.inneractive.sdk.player.C4591c;
import com.fyber.inneractive.sdk.player.C5066f;
import com.fyber.inneractive.sdk.player.controller.C4660q;
import com.fyber.inneractive.sdk.player.enums.C4668b;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.player.p191ui.C5092a;
import com.fyber.inneractive.sdk.player.p191ui.C5093b;
import com.fyber.inneractive.sdk.player.p191ui.C5100i;
import com.fyber.inneractive.sdk.util.C5364p0;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.controller.j */
public class C4650j extends C4652k<C4660q.C4661a> implements C4660q {

    /* renamed from: A */
    public float f11603A = 0.0f;

    /* renamed from: B */
    public boolean f11604B = false;

    /* renamed from: C */
    public boolean f11605C = false;

    /* renamed from: D */
    public boolean f11606D = false;

    /* renamed from: y */
    public Runnable f11607y;

    /* renamed from: z */
    public float f11608z;

    /* renamed from: com.fyber.inneractive.sdk.player.controller.j$a */
    public class C4651a implements Runnable {
        public C4651a() {
        }

        public void run() {
            C4650j.this.mo24928h(false);
            C4650j.this.f11607y = null;
        }
    }

    public C4650j(C4591c cVar, C5100i iVar, C4345y yVar, C4309s sVar, boolean z) {
        super(cVar, iVar, yVar, sVar, z);
        this.f11608z = ((float) yVar.mo24362b().mo24277b().intValue()) / 100.0f;
        mo24922D();
    }

    /* renamed from: A */
    public final void mo24919A() {
        if (this.f11616g != null && !this.f11606D) {
            mo24921C();
            super.mo24929j();
            ((C4660q.C4661a) this.f11616g).mo24973c();
            IAlog.m16699a("%sopening fullscreen", IAlog.m16696a((Object) this));
            this.f11606D = true;
            C4591c cVar = this.f11610a;
            if (cVar != null) {
                C5066f fVar = (C5066f) cVar;
                fVar.mo24791a(fVar.f13563x, VideoClickOrigin.InvalidOrigin, C4493q.EVENT_FULLSCREEN, C4493q.EVENT_EXPAND);
            }
        }
    }

    /* renamed from: B */
    public final void mo24920B() {
        C4591c cVar;
        C4640g gVar;
        C5100i iVar;
        if (this.f11603A >= this.f11608z && (cVar = this.f11610a) != null && (gVar = cVar.f11406b) != null && !gVar.f11583e.equals(C4668b.f11663i) && (iVar = this.f11613d) != null && !iVar.mo25750d() && this.f11610a.f11406b.f11588j != null) {
            if (((C4345y) this.f11611b).f10750f.f10570a.booleanValue() || this.f11604B) {
                mo24877b(IAConfigManager.f10525J.f10544i.f10682b);
            }
        }
    }

    /* renamed from: C */
    public final void mo24921C() {
        if (this.f11607y != null) {
            IAlog.m16699a("%sCancelling play runnable", IAlog.m16696a((Object) this));
            this.f11613d.removeCallbacks(this.f11607y);
            this.f11607y = null;
        }
    }

    /* renamed from: D */
    public final void mo24922D() {
        C4640g gVar;
        C4591c cVar = this.f11610a;
        if (cVar != null && (gVar = cVar.f11406b) != null && !gVar.f11592n) {
            if (((C4345y) this.f11611b).f10750f.f10573d.booleanValue()) {
                this.f11610a.f11406b.mo24863b(false);
            } else if (!mo24946o()) {
                this.f11610a.f11406b.mo24866d(false);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = r3.f11613d;
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24923E() {
        /*
            r3 = this;
            com.fyber.inneractive.sdk.config.z r0 = r3.f11611b
            com.fyber.inneractive.sdk.config.y r0 = (com.fyber.inneractive.sdk.config.C4345y) r0
            com.fyber.inneractive.sdk.config.a0 r0 = r0.f10750f
            com.fyber.inneractive.sdk.config.enums.TapAction r0 = r0.f10578i
            com.fyber.inneractive.sdk.config.enums.TapAction r1 = com.fyber.inneractive.sdk.config.enums.TapAction.FULLSCREEN
            if (r0 == r1) goto L_0x001b
            com.fyber.inneractive.sdk.player.ui.i r0 = r3.f11613d
            android.widget.ImageView r1 = r0.f13670u
            if (r1 == 0) goto L_0x001b
            r2 = 0
            r1.setVisibility(r2)
            android.widget.ImageView r0 = r0.f13670u
            r0.setSelected(r2)
        L_0x001b:
            r3.mo24948x()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.C4650j.mo24923E():void");
    }

    /* renamed from: a */
    public void mo24891a(boolean z) {
        if (z) {
            mo24925a(this.f11603A);
        }
        super.mo24891a(z);
    }

    /* renamed from: b */
    public void mo24877b(int i) {
        C4640g gVar;
        C4591c cVar = this.f11610a;
        if (cVar != null && (gVar = cVar.f11406b) != null && gVar.f11583e != C4668b.Playing && this.f11607y == null) {
            IAlog.m16699a("%splayVideo %s", IAlog.m16696a((Object) this), this.f11613d);
            if (i == 0) {
                mo24928h(false);
                return;
            }
            C4651a aVar = new C4651a();
            this.f11607y = aVar;
            this.f11613d.postDelayed(aVar, (long) i);
        }
    }

    /* renamed from: c */
    public boolean mo24879c() {
        return true;
    }

    /* renamed from: d */
    public void mo24880d(boolean z) {
        C4640g gVar;
        C4591c cVar = this.f11610a;
        if (!(cVar == null || (gVar = cVar.f11406b) == null || gVar.f11583e.equals(C4668b.f11663i))) {
            mo24923E();
        }
        C4591c cVar2 = this.f11610a;
        Bitmap bitmap = cVar2 != null ? cVar2.f11416l : null;
        if (bitmap != null) {
            this.f11613d.mo25746b(true);
            this.f11613d.setLastFrameBitmap(bitmap);
        }
        super.mo24880d(z);
    }

    public void destroy() {
        mo24921C();
        this.f11616g = null;
        super.destroy();
    }

    /* renamed from: h */
    public void mo24928h(boolean z) {
        C4591c cVar = this.f11610a;
        if (cVar != null && cVar.f11406b != null) {
            mo24922D();
            super.mo24928h(z);
        }
    }

    /* renamed from: i */
    public boolean mo24893i() {
        super.mo24893i();
        C4591c cVar = this.f11610a;
        if (!(cVar == null || cVar.f11406b == null)) {
            IAlog.m16699a("%sconnectToTextureView playing state = %s", IAlog.m16696a((Object) this), this.f11610a.f11406b.f11583e);
            if (this.f11610a.f11406b.mo24888j()) {
                this.f11613d.mo25748c(!this.f11610a.f11415k);
                C5100i iVar = this.f11613d;
                C5093b bVar = new C5093b();
                bVar.f13629b = false;
                iVar.mo25742a(new C5092a(bVar));
                this.f11613d.mo25746b(false);
                mo24922D();
            }
        }
        mo24925a(this.f11603A);
        return true;
    }

    /* renamed from: j */
    public void mo24929j() {
        mo24921C();
        super.mo24929j();
    }

    /* renamed from: l */
    public int mo24894l() {
        return IAConfigManager.f10525J.f10557v.f10660b.mo24345a("VideoAdBufferingTimeout", 5, 1) * 1000;
    }

    /* renamed from: n */
    public int mo24895n() {
        return 0;
    }

    public void pauseVideo() {
        mo24921C();
        super.pauseVideo();
    }

    /* renamed from: r */
    public void mo24897r() {
        mo24919A();
    }

    /* renamed from: s */
    public void mo24930s() {
        mo24942h();
        this.f11613d.mo25744a(false);
        mo24901y();
        mo24921C();
    }

    /* renamed from: t */
    public void mo24898t() {
        C4591c cVar = this.f11610a;
        if (cVar != null && cVar.f11406b != null) {
            mo24893i();
            mo24928h(false);
        }
    }

    /* renamed from: u */
    public void mo24931u() {
        mo24920B();
    }

    /* renamed from: v */
    public void mo24899v() {
        super.mo24899v();
        mo24923E();
        this.f11613d.mo25746b(false);
        this.f11604B = true;
    }

    /* renamed from: w */
    public boolean mo24900w() {
        return false;
    }

    /* renamed from: p */
    public void mo24896p() {
        IAlog.m16699a("%s onBufferingTimeout reached. Skipping to end card", IAlog.m16696a((Object) this));
        if (this.f11613d.f13642e) {
            this.f11630u = true;
            mo24878c(false);
        }
    }

    /* renamed from: a */
    public void mo24890a(C5364p0 p0Var) {
        TapAction tapAction = ((C4345y) this.f11611b).f10750f.f10578i;
        C4591c cVar = this.f11610a;
        if (cVar != null && cVar.f11406b != null && this.f11603A < this.f11608z) {
            return;
        }
        if (tapAction == TapAction.CTR) {
            Bitmap g = mo24940g(false);
            if (mo24937a(false, VideoClickOrigin.CTA, p0Var) && g != null) {
                this.f11613d.setLastFrameBitmap(g);
                this.f11613d.mo25746b(true);
            }
        } else if (tapAction == TapAction.FULLSCREEN) {
            mo24919A();
        } else if (tapAction != TapAction.DO_NOTHING) {
            IAlog.m16699a("%sonVideoClicked called, but we recieved an unknown tap action %s", IAlog.m16696a((Object) this), tapAction);
        } else if (cVar != null) {
            cVar.mo24800g();
        }
    }

    /* renamed from: b */
    public void mo24926b(boolean z) {
        C4591c cVar;
        C4640g gVar;
        this.f11605C = z;
        if (z && (cVar = this.f11610a) != null && (gVar = cVar.f11406b) != null && gVar.f11588j == null && this.f11613d.f13642e && !gVar.f11583e.equals(C4668b.f11663i)) {
            mo24893i();
            mo24925a(this.f11603A);
        }
    }

    /* renamed from: d */
    public void mo24927d() {
        IAlog.m16699a("%sonVideoViewDetachedFromWindow", IAlog.m16696a((Object) this));
        mo24929j();
    }

    /* renamed from: a */
    public void mo24925a(float f) {
        C4640g gVar;
        this.f11603A = f;
        if (IAlog.f14137a >= 3) {
            IAlog.m16701c("%sonVisibilityChanged called with: %s vfpl = %s vfpa = %s", IAlog.m16696a((Object) this), Float.valueOf(f), Float.valueOf(this.f11608z), Float.valueOf(1.0f - this.f11608z));
        }
        C4591c cVar = this.f11610a;
        if (cVar != null && (gVar = cVar.f11406b) != null) {
            if (gVar.f11583e != C4668b.Playing) {
                mo24920B();
            } else if (f <= this.f11608z) {
                IAlog.m16702d("%sonVisibilityChanged pausing player", IAlog.m16696a((Object) this));
                if (this.f11610a.f11406b.f11588j != null) {
                    this.f11604B = false;
                    mo24940g(false);
                    mo24921C();
                    super.pauseVideo();
                    mo24939f(false);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo24924a() {
        C4640g gVar;
        IAlog.m16699a("%sfullscreenExited called", IAlog.m16696a((Object) this));
        this.f11606D = false;
        mo24926b(this.f11605C);
        C4591c cVar = this.f11610a;
        if (cVar != null && (gVar = cVar.f11406b) != null) {
            mo24915a(gVar.f11583e);
            mo24914a(this.f11610a.f11406b.mo24864c());
        }
    }
}
