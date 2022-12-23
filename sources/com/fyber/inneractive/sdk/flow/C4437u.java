package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.C4345y;
import com.fyber.inneractive.sdk.config.C4346z;
import com.fyber.inneractive.sdk.config.global.C4309s;
import com.fyber.inneractive.sdk.p192ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.response.C5292f;

/* renamed from: com.fyber.inneractive.sdk.flow.u */
public class C4437u extends C4419j<C5292f> {

    /* renamed from: g */
    public IAmraidWebViewController f10971g;

    public C4437u(C4346z zVar, C4309s sVar) {
        super(zVar, sVar);
    }

    /* renamed from: a */
    public void mo24365a() {
        IAmraidWebViewController iAmraidWebViewController = this.f10971g;
        if (iAmraidWebViewController != null) {
            iAmraidWebViewController.mo26558k();
            this.f10971g.mo26420l();
            this.f10971g = null;
        }
    }

    /* renamed from: d */
    public boolean mo24373d() {
        C4346z zVar = this.f10916d;
        if (zVar == null) {
            return false;
        }
        C4345y yVar = (C4345y) zVar;
        if (yVar.f10747c == null || yVar.f10747c.f10691b == null) {
            return false;
        }
        return yVar.f10747c.f10691b.isFullscreenUnit();
    }

    /* renamed from: e */
    public boolean mo24368e() {
        IAmraidWebViewController iAmraidWebViewController = this.f10971g;
        if (iAmraidWebViewController != null) {
            if (iAmraidWebViewController.f14280b != null) {
                return true;
            }
        }
        return false;
    }

    public boolean isVideoAd() {
        return false;
    }
}
