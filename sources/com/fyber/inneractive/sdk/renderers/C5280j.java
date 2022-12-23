package com.fyber.inneractive.sdk.renderers;

import android.view.View;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.cache.session.enums.C4250a;
import com.fyber.inneractive.sdk.cache.session.enums.C4251b;
import com.fyber.inneractive.sdk.config.C4345y;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveNativeAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.C4419j;
import com.fyber.inneractive.sdk.flow.C4433s;
import com.fyber.inneractive.sdk.flow.C4450y;
import com.fyber.inneractive.sdk.interfaces.C4455c;
import com.fyber.inneractive.sdk.model.vast.C4478b;
import com.fyber.inneractive.sdk.model.vast.C4479c;
import com.fyber.inneractive.sdk.model.vast.C4484h;
import com.fyber.inneractive.sdk.player.C5073i;
import com.fyber.inneractive.sdk.response.C5293g;
import com.fyber.inneractive.sdk.util.C5320d0;
import com.fyber.inneractive.sdk.util.C5325e;
import com.fyber.inneractive.sdk.util.C5364p0;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.renderers.j */
public class C5280j extends C4433s<C4450y, InneractiveNativeAdEventsListener> implements C4455c {

    /* renamed from: w */
    public boolean f14015w = false;

    /* renamed from: E */
    public boolean mo24407E() {
        return false;
    }

    /* renamed from: G */
    public int mo24408G() {
        return 0;
    }

    /* renamed from: H */
    public int mo24409H() {
        return 0;
    }

    /* renamed from: I */
    public long mo24410I() {
        return 0;
    }

    /* renamed from: J */
    public boolean mo24411J() {
        return false;
    }

    /* renamed from: L */
    public final void mo26345L() {
        AdContent adcontent = this.f10921b;
        if (adcontent != null) {
            C4450y yVar = (C4450y) adcontent;
            if (yVar.f10916d != null && ((C4345y) yVar.f10916d).f10747c != null) {
                IAConfigManager.f10525J.f10559x.mo24285a(((C4345y) yVar.f10916d).f10747c.f10691b == UnitDisplayType.REWARDED ? C4251b.REWARDED_VIDEO : C4251b.INTERSTITIAL_VIDEO, C4250a.CLICK);
            }
        }
    }

    /* renamed from: a */
    public long mo24412a(long j) {
        return 0;
    }

    /* renamed from: a */
    public C5320d0.C5321a mo26346a(C5364p0 p0Var, C5325e eVar) {
        mo26345L();
        throw null;
    }

    /* renamed from: a */
    public void mo24414a(C4455c.C4457b bVar) {
    }

    /* renamed from: a */
    public void mo26350a(boolean z) {
    }

    /* renamed from: a */
    public void mo26351a(boolean z, Orientation orientation) {
    }

    /* renamed from: b */
    public void mo24415b() {
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo24416b(C4419j jVar) {
        C4450y yVar = (C4450y) jVar;
        return false;
    }

    public void destroy() {
        if (!this.f14015w) {
            mo24419m();
        }
        this.f10921b = null;
        super.destroy();
    }

    /* renamed from: e */
    public void mo26352e() {
    }

    /* renamed from: g */
    public void mo26353g() {
        C4479c cVar;
        C4484h hVar;
        AdContent adcontent = this.f10921b;
        if (adcontent != null) {
            C4450y yVar = (C4450y) adcontent;
            if (yVar.f10913a != null && yVar.f10914b != null) {
                String str = null;
                C4478b bVar = ((C5293g) yVar.f10914b).f14094C;
                if (!(bVar == null || (cVar = bVar.f11066g) == null || (hVar = cVar.f11070b) == null)) {
                    str = hVar.toString();
                }
                mo24603a(str);
            }
        }
    }

    /* renamed from: j */
    public void mo26355j() {
        mo24601a((InneractiveUnitController.AdDisplayError) new WebViewRendererProcessHasGoneError());
    }

    /* renamed from: k */
    public void mo26356k() {
    }

    /* renamed from: l */
    public void mo26357l() {
    }

    /* renamed from: m */
    public void mo24419m() {
        this.f14015w = true;
        AdContent adcontent = this.f10921b;
        if (adcontent != null) {
            C5073i iVar = ((C4450y) adcontent).f10998g;
        }
        IAlog.m16699a("%sunit controller is null!", IAlog.m16696a((Object) this));
    }

    /* renamed from: o */
    public void mo24629o() {
    }

    public void onCompleted() {
    }

    public void onPlayerError() {
    }

    public void onProgress(int i, int i2) {
    }

    /* renamed from: r */
    public void mo26361r() {
        mo24609z();
    }

    /* renamed from: s */
    public void mo24630s() {
    }

    /* renamed from: u */
    public boolean mo24421u() {
        return false;
    }

    /* renamed from: h */
    public void mo26354h() {
        IAlog.m16699a("%snShownCloseButton", IAlog.m16696a((Object) this));
    }

    /* renamed from: a */
    public void mo26349a(String str, String str2) {
        IAlog.m16699a(IAlog.m16696a((Object) this) + "full screen video ad renderer callback: onSuspiciousNoUserWebActionDetected", new Object[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        r2 = (r2 = r2.f11066g).f11070b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fyber.inneractive.sdk.util.C5320d0.C5321a mo26347a(java.lang.String r2, com.fyber.inneractive.sdk.util.C5364p0 r3) {
        /*
            r1 = this;
            AdContent r2 = r1.f10921b
            r3 = 0
            if (r2 == 0) goto L_0x002f
            com.fyber.inneractive.sdk.flow.y r2 = (com.fyber.inneractive.sdk.flow.C4450y) r2
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r0 = r2.f10913a
            if (r0 == 0) goto L_0x002f
            T r2 = r2.f10914b
            if (r2 == 0) goto L_0x002f
            r1.mo26345L()
            AdContent r2 = r1.f10921b
            com.fyber.inneractive.sdk.flow.y r2 = (com.fyber.inneractive.sdk.flow.C4450y) r2
            T r2 = r2.f10914b
            com.fyber.inneractive.sdk.response.g r2 = (com.fyber.inneractive.sdk.response.C5293g) r2
            com.fyber.inneractive.sdk.model.vast.b r2 = r2.f14094C
            if (r2 == 0) goto L_0x002b
            com.fyber.inneractive.sdk.model.vast.c r2 = r2.f11066g
            if (r2 == 0) goto L_0x002b
            com.fyber.inneractive.sdk.model.vast.h r2 = r2.f11070b
            if (r2 == 0) goto L_0x002b
            java.lang.String r2 = r2.toString()
            goto L_0x002c
        L_0x002b:
            r2 = r3
        L_0x002c:
            r1.mo24603a((java.lang.String) r2)
        L_0x002f:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.renderers.C5280j.mo26347a(java.lang.String, com.fyber.inneractive.sdk.util.p0):com.fyber.inneractive.sdk.util.d0$a");
    }

    /* renamed from: a */
    public void mo26348a(View view, String str) {
        if (view != null && view.getContext() != null) {
            InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(view.getContext(), str);
            mo24609z();
        }
    }
}
