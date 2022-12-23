package com.fyber.inneractive.sdk.player.controller;

import android.view.View;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.model.vast.C4479c;
import com.fyber.inneractive.sdk.model.vast.C4493q;
import com.fyber.inneractive.sdk.mraid.C4502a0;
import com.fyber.inneractive.sdk.player.C4591c;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.response.C5295i;
import com.fyber.inneractive.sdk.util.C5320d0;
import com.fyber.inneractive.sdk.util.C5364p0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C5407d;

/* renamed from: com.fyber.inneractive.sdk.player.controller.n */
public class C4657n extends C5407d.C5418k {

    /* renamed from: a */
    public final /* synthetic */ C4652k f11637a;

    public C4657n(C4652k kVar) {
        this.f11637a = kVar;
    }

    /* renamed from: a */
    public void mo24968a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        C4652k kVar = this.f11637a;
        kVar.getClass();
        sb.append(IAlog.m16696a((Object) kVar));
        sb.append("web view callback: onSuspiciousNoUserWebActionDetected");
        IAlog.m16699a(sb.toString(), new Object[0]);
        ListenerT listenert = this.f11637a.f11616g;
        if (listenert != null) {
            listenert.mo24992a(str, str2);
        }
    }

    /* renamed from: b */
    public void mo24970b() {
        C4479c f;
        C4652k kVar = this.f11637a;
        kVar.getClass();
        IAlog.m16699a("%sweb view callback: onClickedAndOpen", IAlog.m16696a((Object) kVar));
        this.f11637a.mo24936a("2");
        C4652k kVar2 = this.f11637a;
        if (kVar2.f11616g != null) {
            C4591c cVar = kVar2.f11610a;
            if (!(cVar == null || (f = cVar.mo24799f()) == null)) {
                this.f11637a.f11610a.mo24791a((C5295i) f, VideoClickOrigin.COMPANION, C4493q.EVENT_CLICK);
            }
            int i = IAlog.f14137a;
            IAlog.m16697a(1, (Exception) null, "AD_CLICKED", new Object[0]);
            this.f11637a.f11616g.mo24996g();
        }
    }

    /* renamed from: a */
    public C5320d0.C5321a mo24961a(String str, C5364p0 p0Var) {
        C4479c f;
        C4652k kVar = this.f11637a;
        kVar.getClass();
        IAlog.m16699a("%sweb view callback: onClicked", IAlog.m16696a((Object) kVar));
        this.f11637a.mo24936a("2");
        C4652k kVar2 = this.f11637a;
        if (kVar2.f11616g == null) {
            return new C5320d0.C5321a(C5320d0.C5323c.FAILED, new Exception("mListener is null, internal SDK fatal error"), "null");
        }
        C4591c cVar = kVar2.f11610a;
        if (!(cVar == null || (f = cVar.mo24799f()) == null)) {
            this.f11637a.f11610a.mo24791a((C5295i) f, VideoClickOrigin.COMPANION, C4493q.EVENT_CLICK);
        }
        int i = IAlog.f14137a;
        IAlog.m16697a(1, (Exception) null, "AD_CLICKED", new Object[0]);
        return this.f11637a.f11616g.mo24990a(str, p0Var);
    }

    /* renamed from: b */
    public void mo24971b(C5407d dVar) {
        ListenerT listenert = this.f11637a.f11616g;
        if (listenert != null) {
            listenert.mo25004r();
        }
    }

    /* renamed from: a */
    public void mo24962a() {
        ListenerT listenert = this.f11637a.f11616g;
        if (listenert != null) {
            listenert.mo24998j();
        }
    }

    /* renamed from: a */
    public boolean mo24969a(String str) {
        View endCardView = this.f11637a.f11613d.getEndCardView();
        ListenerT listenert = this.f11637a.f11616g;
        if (listenert == null) {
            return false;
        }
        listenert.mo24991a(endCardView, str);
        return true;
    }

    /* renamed from: a */
    public void mo24963a(InneractiveUnitController.AdDisplayError adDisplayError) {
        ListenerT listenert = this.f11637a.f11616g;
        if (listenert != null) {
            listenert.onPlayerError();
        }
    }

    /* renamed from: a */
    public void mo24964a(C5407d dVar) {
        ListenerT listenert = this.f11637a.f11616g;
        if (listenert != null) {
            listenert.mo25004r();
        }
    }

    /* renamed from: a */
    public void mo24965a(C5407d dVar, C4502a0 a0Var) {
        ListenerT listenert = this.f11637a.f11616g;
        if (listenert != null) {
            listenert.mo24999k();
        }
    }

    /* renamed from: a */
    public void mo24966a(C5407d dVar, boolean z) {
        C4652k kVar = this.f11637a;
        kVar.getClass();
        IAlog.m16699a("%sonCustomCloseButtonAvailableEnabled : %s", IAlog.m16696a((Object) kVar), Boolean.valueOf(z));
        ListenerT listenert = this.f11637a.f11616g;
        if (listenert != null && z) {
            listenert.mo24997h();
        }
    }

    /* renamed from: a */
    public void mo24967a(C5407d dVar, boolean z, Orientation orientation) {
        C4652k kVar = this.f11637a;
        kVar.getClass();
        IAlog.m16699a("%sonOrientationProperties: allowOrientationChange: %s, forceOrientationType: %s", IAlog.m16696a((Object) kVar), Boolean.valueOf(z), orientation.toString());
        ListenerT listenert = this.f11637a.f11616g;
        if (listenert != null) {
            listenert.mo24994a(z, orientation);
        }
    }
}
