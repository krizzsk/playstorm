package com.bykv.p068vk.openvk.component.video.p069a.p081d;

import com.bykv.p068vk.openvk.component.video.api.p088f.C2536c;
import com.bykv.p068vk.openvk.component.video.p069a.p081d.C2487c;

/* renamed from: com.bykv.vk.openvk.component.video.a.d.a */
/* compiled from: AbstractMediaPlayer */
public abstract class C2484a implements C2487c {

    /* renamed from: a */
    protected boolean f5289a = false;

    /* renamed from: b */
    private C2487c.C2492e f5290b;

    /* renamed from: c */
    private C2487c.C2489b f5291c;

    /* renamed from: d */
    private C2487c.C2488a f5292d;

    /* renamed from: e */
    private C2487c.C2493f f5293e;

    /* renamed from: f */
    private C2487c.C2494g f5294f;

    /* renamed from: g */
    private C2487c.C2490c f5295g;

    /* renamed from: h */
    private C2487c.C2491d f5296h;

    /* renamed from: a */
    public final void mo16229a(C2487c.C2492e eVar) {
        this.f5290b = eVar;
    }

    /* renamed from: a */
    public final void mo16226a(C2487c.C2489b bVar) {
        this.f5291c = bVar;
    }

    /* renamed from: a */
    public final void mo16225a(C2487c.C2488a aVar) {
        this.f5292d = aVar;
    }

    /* renamed from: a */
    public final void mo16230a(C2487c.C2493f fVar) {
        this.f5293e = fVar;
    }

    /* renamed from: a */
    public final void mo16227a(C2487c.C2490c cVar) {
        this.f5295g = cVar;
    }

    /* renamed from: a */
    public final void mo16228a(C2487c.C2491d dVar) {
        this.f5296h = dVar;
    }

    /* renamed from: a */
    public final void mo16231a(C2487c.C2494g gVar) {
        this.f5294f = gVar;
    }

    /* renamed from: a */
    public void mo16222a() {
        this.f5290b = null;
        this.f5292d = null;
        this.f5291c = null;
        this.f5293e = null;
        this.f5294f = null;
        this.f5295g = null;
        this.f5296h = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo16234b() {
        try {
            if (this.f5290b != null) {
                this.f5290b.mo16269b(this);
            }
        } catch (Throwable th) {
            C2536c.m6441c("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnPrepared error: ", th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo16236c() {
        try {
            if (this.f5291c != null) {
                this.f5291c.mo16266a(this);
            }
        } catch (Throwable th) {
            C2536c.m6441c("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnCompletion error: ", th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16223a(int i) {
        try {
            if (this.f5292d != null) {
                this.f5292d.mo16265a(this, i);
            }
        } catch (Throwable th) {
            C2536c.m6441c("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnBufferingUpdate error: ", th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo16237d() {
        try {
            if (this.f5293e != null) {
                this.f5293e.mo16270c(this);
            }
        } catch (Throwable th) {
            C2536c.m6441c("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnSeekComplete error: ", th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16224a(int i, int i2, int i3, int i4) {
        try {
            if (this.f5294f != null) {
                this.f5294f.mo16271a(this, i, i2, i3, i4);
            }
        } catch (Throwable th) {
            C2536c.m6441c("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnVideoSizeChanged error: ", th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo16233a(int i, int i2) {
        try {
            return this.f5295g != null && this.f5295g.mo16267a(this, i, i2);
        } catch (Throwable th) {
            C2536c.m6441c("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnError error: ", th);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo16235b(int i, int i2) {
        try {
            return this.f5296h != null && this.f5296h.mo16268b(this, i, i2);
        } catch (Throwable th) {
            C2536c.m6441c("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnInfo error: ", th);
            return false;
        }
    }

    /* renamed from: a */
    public void mo16232a(boolean z) {
        this.f5289a = z;
    }
}
