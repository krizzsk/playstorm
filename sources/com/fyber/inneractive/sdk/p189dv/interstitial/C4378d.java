package com.fyber.inneractive.sdk.p189dv.interstitial;

import android.app.Activity;
import com.fyber.inneractive.sdk.C4170a;
import com.fyber.inneractive.sdk.cache.session.enums.C4250a;
import com.fyber.inneractive.sdk.cache.session.enums.C4251b;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.C4419j;
import com.fyber.inneractive.sdk.flow.C4433s;
import com.fyber.inneractive.sdk.interfaces.C4455c;
import com.fyber.inneractive.sdk.p189dv.C4363f;
import com.fyber.inneractive.sdk.response.C5291e;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.dv.interstitial.d */
public class C4378d extends C4433s<C4170a, InneractiveFullscreenAdEventsListener> implements C4455c {

    /* renamed from: w */
    public boolean f10786w = false;

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

    /* renamed from: a */
    public long mo24412a(long j) {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.fyber.inneractive.sdk.flow.l, com.fyber.inneractive.sdk.dv.interstitial.a, com.fyber.inneractive.sdk.flow.s, com.fyber.inneractive.sdk.dv.interstitial.d, java.lang.Object] */
    /* renamed from: a */
    public void mo24413a(C4455c.C4456a aVar, Activity activity) throws InneractiveUnitController.AdDisplayError {
        super.mo24413a(aVar, activity);
        if (activity != null) {
            AdContent adcontent = this.f10921b;
            if (adcontent != null) {
                C4170a aVar2 = (C4170a) adcontent;
                if (aVar2.f10756i != null) {
                    aVar2.mo23831a(this, activity);
                    return;
                }
            }
            IAlog.m16703e("%sad content is null aborting", IAlog.m16696a((Object) this));
            throw new InneractiveUnitController.AdDisplayError("Ad content is null");
        }
        IAlog.m16703e("%sYou must pass activity in order to show interstitial", IAlog.m16696a((Object) this));
        throw new InneractiveUnitController.AdDisplayError("No activity context");
    }

    /* renamed from: a */
    public void mo24414a(C4455c.C4457b bVar) {
    }

    /* renamed from: b */
    public void mo24415b() {
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo24416b(C4419j jVar) {
        C4170a aVar = (C4170a) jVar;
        return false;
    }

    /* renamed from: d */
    public void mo24417d() {
        AdContent adcontent = this.f10921b;
        if (adcontent != null) {
            C4170a aVar = (C4170a) adcontent;
            if (((C4363f) aVar.f10914b) != null) {
                mo24602a((C5291e) (C4363f) aVar.f10914b);
            }
        }
        mo24600a(C4250a.CLICK, C4251b.INTERSTITIAL_VIDEO);
        mo24609z();
    }

    /* renamed from: i */
    public void mo24418i() {
        EventsListener eventslistener;
        if (!this.f10786w && (eventslistener = this.f10922c) != null) {
            this.f10786w = true;
            ((InneractiveFullscreenAdEventsListener) eventslistener).onAdDismissed(this.f10920a);
        }
    }

    /* renamed from: m */
    public void mo24419m() {
    }

    public void onReward() {
    }

    /* renamed from: u */
    public boolean mo24421u() {
        return false;
    }

    /* renamed from: v */
    public void mo24422v() {
        AdContent adcontent = this.f10921b;
        if (adcontent != null) {
            mo24604b((C5291e) (C4363f) ((C4170a) adcontent).f10914b);
        }
        mo24600a(C4250a.IMPRESSION, C4251b.INTERSTITIAL_VIDEO);
        mo24595A();
    }
}
