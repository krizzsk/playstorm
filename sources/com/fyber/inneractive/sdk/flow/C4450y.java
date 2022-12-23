package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.C4345y;
import com.fyber.inneractive.sdk.config.C4346z;
import com.fyber.inneractive.sdk.config.global.C4309s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.model.vast.C4478b;
import com.fyber.inneractive.sdk.player.C5073i;
import com.fyber.inneractive.sdk.response.C5293g;
import com.fyber.inneractive.sdk.util.C5326e0;

/* renamed from: com.fyber.inneractive.sdk.flow.y */
public class C4450y extends C4419j<C5293g> {

    /* renamed from: g */
    public C5073i f10998g;

    /* renamed from: h */
    public boolean f10999h = false;

    public C4450y(C4346z zVar, C4309s sVar, C5293g gVar, InneractiveAdRequest inneractiveAdRequest) {
        super(zVar, sVar);
        mo24592a(gVar);
        mo24591a(inneractiveAdRequest);
    }

    /* renamed from: a */
    public void mo24365a() {
        C5073i iVar = this.f10998g;
        if (iVar != null) {
            iVar.mo25677a();
            this.f10998g = null;
        }
    }

    /* renamed from: d */
    public boolean mo24373d() {
        C4345y yVar = (C4345y) this.f10916d;
        if (yVar.f10750f == null) {
            return false;
        }
        return C5326e0.m16723a(yVar.f10750f.f10579j);
    }

    /* renamed from: e */
    public boolean mo24368e() {
        return this.f10998g != null;
    }

    /* renamed from: f */
    public String mo24648f() {
        C4478b bVar;
        T t = this.f10914b;
        if (t == null || (bVar = ((C5293g) t).f14094C) == null) {
            return null;
        }
        return bVar.f11061b;
    }

    public boolean isVideoAd() {
        return true;
    }
}
