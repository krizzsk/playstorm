package com.fyber.inneractive.sdk.player.controller;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import com.facebook.share.internal.ShareConstants;
import com.fyber.inneractive.sdk.player.controller.C4640g;
import com.fyber.inneractive.sdk.player.enums.C4668b;
import com.fyber.inneractive.sdk.player.mediaplayer.C5076a;
import com.fyber.inneractive.sdk.player.mediaplayer.C5090b;
import com.fyber.inneractive.sdk.player.mediaplayer.C5091c;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.controller.a */
public class C4631a extends C4640g {

    /* renamed from: p */
    public C5076a f11541p;

    /* renamed from: q */
    public int f11542q = 0;

    /* renamed from: r */
    public int f11543r = 2;

    /* renamed from: s */
    public int f11544s = 0;

    /* renamed from: t */
    public boolean f11545t = false;

    public C4631a(Context context) {
        super(context);
        IAlog.m16699a("Creating IAAndroidMediaPlayerController", new Object[0]);
    }

    /* renamed from: a */
    public void mo24857a(int i, boolean z) {
        C5076a aVar = this.f11541p;
        if (aVar != null) {
            IAlog.m16699a("%s seek to called with = %d mPlayAfterSeek = %s", aVar.mo25690c(), Integer.valueOf(i), Boolean.valueOf(z));
            if (!aVar.mo25689b()) {
                IAlog.m16699a("%s seek called when player is not ready!", aVar.mo25690c());
                return;
            }
            C4668b bVar = aVar.f13580b;
            C4668b bVar2 = C4668b.Seeking;
            if (bVar == bVar2) {
                IAlog.m16699a("%s seek called when player is already seeking!", aVar.mo25690c());
                return;
            }
            aVar.mo25685a(bVar2);
            aVar.f13581c = z;
            aVar.mo25686a((Runnable) new C5090b(aVar, i));
        }
    }

    /* renamed from: a */
    public boolean mo24861a() {
        return false;
    }

    /* renamed from: b */
    public void mo24862b() {
        C5076a aVar = this.f11541p;
        if (aVar != null) {
            aVar.reset();
            this.f11541p.release();
            this.f11541p = null;
        }
        super.mo24862b();
    }

    /* renamed from: c */
    public int mo24864c() {
        C5076a aVar = this.f11541p;
        if (aVar != null) {
            return aVar.getCurrentPosition();
        }
        return 0;
    }

    /* renamed from: d */
    public void mo24866d(boolean z) {
        mo24909c(false);
        if (mo24871i() || !this.f11592n) {
            this.f11592n = z;
            C5076a aVar = this.f11541p;
            if (aVar != null) {
                IAlog.m16699a("%s unmute", aVar.mo25690c());
                aVar.f13582d = false;
                if (aVar.mo25689b()) {
                    aVar.mo25686a((Runnable) new C5091c(aVar));
                    return;
                }
                IAlog.m16699a("%s unmute called when player is not ready!", aVar.mo25690c());
            }
        }
    }

    /* renamed from: e */
    public Bitmap mo24867e() {
        return null;
    }

    /* renamed from: f */
    public String mo24868f() {
        return ShareConstants.WEB_DIALOG_PARAM_MEDIA;
    }

    /* renamed from: g */
    public int mo24869g() {
        C5076a aVar = this.f11541p;
        if (aVar != null) {
            return aVar.f13598t;
        }
        return 0;
    }

    /* renamed from: h */
    public int mo24870h() {
        C5076a aVar = this.f11541p;
        if (aVar != null) {
            return aVar.f13597s;
        }
        return 0;
    }

    /* renamed from: i */
    public boolean mo24871i() {
        C5076a aVar = this.f11541p;
        if (aVar != null) {
            return aVar.f13582d;
        }
        return false;
    }

    /* renamed from: k */
    public void mo24872k() {
        C5076a aVar = this.f11541p;
        if (aVar != null) {
            aVar.pause();
        }
    }

    /* renamed from: l */
    public void mo24873l() {
        C5076a aVar = this.f11541p;
        if (aVar != null) {
            aVar.start();
        }
    }

    /* renamed from: b */
    public void mo24863b(boolean z) {
        mo24909c(true);
        if (!mo24871i() || !this.f11592n) {
            this.f11592n = z;
            C5076a aVar = this.f11541p;
            if (aVar != null) {
                aVar.mo25692e();
            }
        }
    }

    /* renamed from: a */
    public void mo24858a(Surface surface) {
        C5076a aVar = this.f11541p;
        if (aVar != null) {
            aVar.setSurface(surface);
        }
    }

    /* renamed from: a */
    public void mo24860a(boolean z) {
        if (this.f11541p == null) {
            IAlog.m16699a("MediaPlayerController: creating media player", new Object[0]);
            this.f11541p = new C5076a(this.f11579a, this, this.f11587i);
        }
    }

    /* renamed from: d */
    public int mo24865d() {
        C5076a aVar = this.f11541p;
        if (aVar != null) {
            return aVar.f13596r;
        }
        return 0;
    }

    /* renamed from: a */
    public void mo24859a(String str, int i) {
        this.f11541p.mo25687a(str);
    }

    /* renamed from: a */
    public void mo24856a(int i) {
        this.f11587i.post(new C4640g.C4642b(i));
        if (i >= mo24865d()) {
            mo24907a(C4668b.f11663i);
        } else if (i == this.f11542q) {
            IAlog.m16699a("%sVideo is stuck! Progress doesn't change", IAlog.m16696a((Object) this));
            int i2 = this.f11544s + 1;
            this.f11544s = i2;
            if (i2 == this.f11543r) {
                mo24907a(C4668b.Buffering);
                this.f11545t = true;
            }
        } else if (this.f11545t) {
            IAlog.m16699a("%sVideo progress was stuck! but now it goes forward. Remove buffering state", IAlog.m16696a((Object) this));
            mo24907a(C4668b.Playing);
            this.f11544s = 0;
            this.f11545t = false;
        }
        this.f11542q = i;
    }
}
