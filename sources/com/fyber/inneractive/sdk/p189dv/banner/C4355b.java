package com.fyber.inneractive.sdk.p189dv.banner;

import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.cache.session.enums.C4250a;
import com.fyber.inneractive.sdk.cache.session.enums.C4251b;
import com.fyber.inneractive.sdk.config.C4345y;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.flow.C4419j;
import com.fyber.inneractive.sdk.flow.C4421l;
import com.fyber.inneractive.sdk.interfaces.C4454b;
import com.fyber.inneractive.sdk.p189dv.C4350a;
import com.fyber.inneractive.sdk.p189dv.C4363f;
import com.fyber.inneractive.sdk.response.C5291e;
import com.fyber.inneractive.sdk.util.C5350l;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.ads.AdView;

/* renamed from: com.fyber.inneractive.sdk.dv.banner.b */
public class C4355b extends C4421l<C4353a, InneractiveAdViewEventsListener> implements C4454b {

    /* renamed from: k */
    public ViewGroup f10763k;

    /* renamed from: a */
    public void mo24374a() {
    }

    /* renamed from: a */
    public void mo24375a(int i) {
    }

    /* renamed from: a */
    public void mo24376a(ViewGroup viewGroup) {
        AdContent adcontent;
        if (this.f10920a == null) {
            IAlog.m16703e("%sYou must set the spot to render before calling renderAd", IAlog.m16696a((Object) this));
        } else if (viewGroup != null && (adcontent = this.f10921b) != null) {
            C4353a aVar = (C4353a) adcontent;
            if (aVar.f10756i != null) {
                aVar.f10755h = this;
                if (aVar.f10759j) {
                    mo24385v();
                    aVar.f10759j = false;
                }
                this.f10763k = viewGroup;
                viewGroup.addView((View) ((C4353a) this.f10921b).f10756i);
            }
        }
    }

    public void destroy() {
        AdContent adcontent = this.f10921b;
        if (adcontent != null) {
            C4353a aVar = (C4353a) adcontent;
            if (aVar.f10756i != null) {
                ((AdView) aVar.f10756i).destroy();
            }
            ((C4353a) this.f10921b).mo24365a();
        }
        ViewGroup viewGroup = this.f10763k;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f10763k = null;
        }
        super.destroy();
    }

    /* renamed from: f */
    public int mo24380f() {
        AdContent adcontent = this.f10921b;
        if (adcontent == null) {
            return 0;
        }
        C4353a aVar = (C4353a) adcontent;
        if (aVar.f10756i == null || ((AdView) aVar.f10756i).getAdSize() == null) {
            return 0;
        }
        return C5350l.m16760b(((AdView) ((C4353a) this.f10921b).f10756i).getAdSize().getWidth());
    }

    /* renamed from: n */
    public void mo24381n() {
    }

    /* renamed from: p */
    public int mo24382p() {
        AdContent adcontent = this.f10921b;
        if (adcontent == null) {
            return 0;
        }
        C4353a aVar = (C4353a) adcontent;
        if (aVar.f10756i == null || ((AdView) aVar.f10756i).getAdSize() == null) {
            return 0;
        }
        return C5350l.m16760b(((AdView) ((C4353a) this.f10921b).f10756i).getAdSize().getHeight());
    }

    /* renamed from: q */
    public void mo24383q() {
    }

    /* renamed from: t */
    public void mo24384t() {
        ViewGroup viewGroup = this.f10763k;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f10763k = null;
        }
    }

    /* renamed from: v */
    public void mo24385v() {
        C4251b bVar;
        mo24595A();
        AdContent adcontent = this.f10921b;
        if (adcontent != null) {
            C4353a aVar = (C4353a) adcontent;
            if (((C4363f) aVar.f10914b) != null) {
                mo24604b((C5291e) (C4363f) aVar.f10914b);
                C4353a aVar2 = (C4353a) this.f10921b;
                if (aVar2.f10916d != null && ((C4345y) aVar2.f10916d).f10747c != null) {
                    C4250a aVar3 = C4250a.IMPRESSION;
                    if (((C4345y) aVar2.f10916d).f10747c.f10691b == UnitDisplayType.MRECT) {
                        bVar = C4251b.RECTANGLE_DISPLAY;
                    } else {
                        bVar = C4251b.BANNER_DISPLAY;
                    }
                    mo24600a(aVar3, bVar);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo24378a(C4419j jVar) {
        return jVar instanceof C4350a;
    }

    /* renamed from: a */
    public boolean mo24377a(View view) {
        ViewGroup viewGroup = this.f10763k;
        return viewGroup != null && viewGroup.equals(view);
    }
}
