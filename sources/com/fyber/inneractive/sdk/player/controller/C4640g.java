package com.fyber.inneractive.sdk.player.controller;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.measurement.C4466g;
import com.fyber.inneractive.sdk.player.C4591c;
import com.fyber.inneractive.sdk.player.C4665e;
import com.fyber.inneractive.sdk.player.enums.C4668b;
import com.fyber.inneractive.sdk.player.mediaplayer.C5076a;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.fyber.inneractive.sdk.player.controller.g */
public abstract class C4640g implements C5076a.C5088l {

    /* renamed from: a */
    public Context f11579a = null;

    /* renamed from: b */
    public List<C4646f> f11580b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public List<C4645e> f11581c = new CopyOnWriteArrayList();

    /* renamed from: d */
    public C4647g f11582d;

    /* renamed from: e */
    public C4668b f11583e = C4668b.Idle;

    /* renamed from: f */
    public C4644d f11584f;

    /* renamed from: g */
    public boolean f11585g;

    /* renamed from: h */
    public C4665e f11586h;

    /* renamed from: i */
    public Handler f11587i;

    /* renamed from: j */
    public TextureView f11588j;

    /* renamed from: k */
    public SurfaceTexture f11589k;

    /* renamed from: l */
    public Surface f11590l;

    /* renamed from: m */
    public TextureView.SurfaceTextureListener f11591m;

    /* renamed from: n */
    public boolean f11592n = false;

    /* renamed from: o */
    public boolean f11593o;

    /* renamed from: com.fyber.inneractive.sdk.player.controller.g$a */
    public class C4641a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Exception f11594a;

        public C4641a(Exception exc) {
            this.f11594a = exc;
        }

        public void run() {
            C4640g gVar = C4640g.this;
            if (!gVar.f11585g) {
                try {
                    List<C4646f> list = gVar.f11580b;
                    if (list != null) {
                        for (C4646f a : list) {
                            a.mo24792a(this.f11594a);
                        }
                    }
                } catch (Exception e) {
                    if (IAlog.f14137a <= 3) {
                        C4640g gVar2 = C4640g.this;
                        gVar2.getClass();
                        IAlog.m16699a("%sonPlayerError callback threw an exception!", IAlog.m16696a((Object) gVar2));
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.controller.g$b */
    public class C4642b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f11596a;

        public C4642b(int i) {
            this.f11596a = i;
        }

        public void run() {
            try {
                List<C4645e> list = C4640g.this.f11581c;
                if (list != null) {
                    for (C4645e a : list) {
                        a.mo24914a(this.f11596a);
                    }
                }
            } catch (Exception e) {
                if (IAlog.f14137a <= 3) {
                    C4640g gVar = C4640g.this;
                    gVar.getClass();
                    IAlog.m16699a("%sonPlayerProgress callback threw an exception!", IAlog.m16696a((Object) gVar));
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.controller.g$c */
    public class C4643c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C4668b f11598a;

        public C4643c(C4668b bVar) {
            this.f11598a = bVar;
        }

        public void run() {
            C4640g gVar;
            TextureView textureView;
            TextureView textureView2;
            TextureView textureView3;
            try {
                List<C4646f> list = C4640g.this.f11580b;
                if (list != null) {
                    for (C4646f a : list) {
                        a.mo24915a(this.f11598a);
                    }
                }
                C4668b bVar = this.f11598a;
                if (bVar == C4668b.Idle || bVar == C4668b.Error || bVar == C4668b.f11663i) {
                    C4640g gVar2 = C4640g.this;
                    if (!(gVar2.f11589k == null || (textureView3 = gVar2.f11588j) == null || textureView3.getParent() == null)) {
                        ((ViewGroup) C4640g.this.f11588j.getParent()).removeView(C4640g.this.f11588j);
                    }
                    gVar = C4640g.this;
                    gVar.f11588j = null;
                    gVar.f11589k = null;
                }
            } catch (Exception e) {
                if (IAlog.f14137a <= 3) {
                    C4640g gVar3 = C4640g.this;
                    gVar3.getClass();
                    IAlog.m16699a("%sonPlayerStateChanged callback threw an exception!", IAlog.m16696a((Object) gVar3));
                    e.printStackTrace();
                }
                C4668b bVar2 = this.f11598a;
                if (bVar2 == C4668b.Idle || bVar2 == C4668b.Error || bVar2 == C4668b.f11663i) {
                    C4640g gVar4 = C4640g.this;
                    if (!(gVar4.f11589k == null || (textureView = gVar4.f11588j) == null || textureView.getParent() == null)) {
                        ((ViewGroup) C4640g.this.f11588j.getParent()).removeView(C4640g.this.f11588j);
                    }
                    gVar = C4640g.this;
                    gVar.f11588j = null;
                }
            } catch (Throwable th) {
                C4668b bVar3 = this.f11598a;
                if (bVar3 == C4668b.Idle || bVar3 == C4668b.Error || bVar3 == C4668b.f11663i) {
                    C4640g gVar5 = C4640g.this;
                    if (!(gVar5.f11589k == null || (textureView2 = gVar5.f11588j) == null || textureView2.getParent() == null)) {
                        ((ViewGroup) C4640g.this.f11588j.getParent()).removeView(C4640g.this.f11588j);
                    }
                    C4640g gVar6 = C4640g.this;
                    gVar6.f11588j = null;
                    gVar6.f11589k = null;
                }
                throw th;
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.controller.g$d */
    public interface C4644d {
    }

    /* renamed from: com.fyber.inneractive.sdk.player.controller.g$e */
    public interface C4645e {
        /* renamed from: a */
        void mo24914a(int i);
    }

    /* renamed from: com.fyber.inneractive.sdk.player.controller.g$f */
    public interface C4646f {
        /* renamed from: a */
        void mo24915a(C4668b bVar);

        /* renamed from: a */
        void mo24792a(Exception exc);

        /* renamed from: e */
        void mo24916e();

        /* renamed from: e */
        void mo24798e(boolean z);
    }

    /* renamed from: com.fyber.inneractive.sdk.player.controller.g$g */
    public interface C4647g {
    }

    public C4640g(Context context) {
        this.f11579a = context.getApplicationContext();
        this.f11587i = new Handler(context.getMainLooper());
        this.f11586h = new C4665e(this);
        mo24860a(true);
    }

    /* renamed from: a */
    public abstract void mo24857a(int i, boolean z);

    /* renamed from: a */
    public abstract void mo24858a(Surface surface);

    /* renamed from: a */
    public abstract void mo24859a(String str, int i);

    /* renamed from: a */
    public abstract void mo24860a(boolean z);

    /* renamed from: a */
    public abstract boolean mo24861a();

    /* renamed from: b */
    public abstract void mo24863b(boolean z);

    /* renamed from: c */
    public abstract int mo24864c();

    /* renamed from: c */
    public final void mo24909c(boolean z) {
        C4466g gVar;
        C4644d dVar = this.f11584f;
        if (dVar != null && (gVar = C4591c.this.f11413i) != null) {
            if (z) {
                if (gVar.f11015c != null) {
                    IAlog.m16699a("%s mute", "OMVideo");
                    try {
                        gVar.f11015c.volumeChange(0.0f);
                    } catch (Throwable th) {
                        gVar.mo24663a(th);
                    }
                }
            } else if (gVar.f11015c != null) {
                IAlog.m16699a("%s unMute", "OMVideo");
                try {
                    gVar.f11015c.volumeChange(1.0f);
                } catch (Throwable th2) {
                    gVar.mo24663a(th2);
                }
            }
        }
    }

    /* renamed from: d */
    public abstract int mo24865d();

    /* renamed from: d */
    public abstract void mo24866d(boolean z);

    /* renamed from: e */
    public abstract Bitmap mo24867e();

    /* renamed from: f */
    public abstract String mo24868f();

    /* renamed from: g */
    public abstract int mo24869g();

    /* renamed from: h */
    public abstract int mo24870h();

    /* renamed from: i */
    public abstract boolean mo24871i();

    /* renamed from: j */
    public boolean mo24888j() {
        return this.f11583e == C4668b.Playing;
    }

    /* renamed from: k */
    public abstract void mo24872k();

    /* renamed from: l */
    public abstract void mo24873l();

    /* renamed from: m */
    public void mo24910m() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        C4665e eVar = this.f11586h;
        if (eVar != null && (scheduledThreadPoolExecutor = eVar.f11643b) != null) {
            scheduledThreadPoolExecutor.shutdownNow();
            eVar.f11643b = null;
        }
    }

    /* renamed from: a */
    public void mo24908a(Exception exc) {
        mo24907a(C4668b.Error);
        IAlog.m16699a("%sonPlayerError called with: %s for onPlayerError", IAlog.m16696a((Object) this), exc);
        this.f11587i.post(new C4641a(exc));
        mo24910m();
    }

    /* renamed from: b */
    public void mo24862b() {
        IAlog.m16699a("%sdestroy started", IAlog.m16696a((Object) this));
        mo24910m();
        this.f11586h = null;
        Handler handler = this.f11587i;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
        List<C4646f> list = this.f11580b;
        if (list != null) {
            list.clear();
        }
        this.f11580b = null;
        this.f11584f = null;
        this.f11585g = true;
        IAlog.m16699a("%sdestroy finished", IAlog.m16696a((Object) this));
    }

    /* renamed from: a */
    public void mo24856a(int i) {
        this.f11587i.post(new C4642b(i));
    }

    /* renamed from: a */
    public void mo24907a(C4668b bVar) {
        if (bVar != this.f11583e) {
            this.f11583e = bVar;
            if (bVar == C4668b.Playing) {
                C4665e eVar = this.f11586h;
                if (eVar != null && eVar.f11643b == null) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
                    eVar.f11643b = scheduledThreadPoolExecutor;
                    scheduledThreadPoolExecutor.scheduleAtFixedRate(eVar.f11644c, (long) 100, (long) 1000, TimeUnit.MILLISECONDS);
                }
            } else if (bVar == C4668b.Paused || bVar == C4668b.Idle || bVar == C4668b.f11663i) {
                mo24910m();
            }
            this.f11587i.post(new C4643c(bVar));
        }
    }
}
