package com.fyber.inneractive.sdk.external;

import android.app.Activity;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.config.C4262a0;
import com.fyber.inneractive.sdk.config.C4327r;
import com.fyber.inneractive.sdk.config.C4345y;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.display.C4347a;
import com.fyber.inneractive.sdk.display.C4348b;
import com.fyber.inneractive.sdk.display.C4349c;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.factories.C4400c;
import com.fyber.inneractive.sdk.flow.C4419j;
import com.fyber.inneractive.sdk.flow.C4429p;
import com.fyber.inneractive.sdk.flow.C4449x;
import com.fyber.inneractive.sdk.interfaces.C4455c;
import com.fyber.inneractive.sdk.network.C4567p;
import com.fyber.inneractive.sdk.network.C4569q;
import com.fyber.inneractive.sdk.p189dv.C4350a;
import com.fyber.inneractive.sdk.response.C5291e;
import com.fyber.inneractive.sdk.util.C5370s;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;

public class InneractiveFullscreenUnitController extends C4449x<InneractiveFullscreenAdEventsListener> implements InneractiveFullscreenAdActivity.FullScreenRendererProvider, InneractiveFullscreenAdActivity.OnInneractiveFullscreenAdDestroyListener {

    /* renamed from: a */
    public boolean f10833a = false;

    /* renamed from: b */
    public InneractiveFullScreenAdRewardedListener f10834b;

    /* renamed from: c */
    public final C4455c.C4457b f10835c = new C4391a();
    public C4455c mRenderer;

    public static class AdExpiredError extends InneractiveUnitController.AdDisplayError {
        public AdExpiredError(String str) {
            super(str);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController$a */
    public class C4391a implements C4455c.C4457b {
        public C4391a() {
        }

        /* renamed from: a */
        public void mo24529a() {
            C4429p pVar = (C4429p) C5370s.m16784a(InneractiveFullscreenUnitController.this.mAdSpot);
            InneractiveFullScreenAdRewardedListener inneractiveFullScreenAdRewardedListener = InneractiveFullscreenUnitController.this.f10834b;
            if (inneractiveFullScreenAdRewardedListener != null && pVar != null) {
                inneractiveFullScreenAdRewardedListener.onAdRewarded(pVar);
            }
        }
    }

    public void destroy() {
        C4455c cVar = this.mRenderer;
        if (cVar != null) {
            cVar.destroy();
            this.mRenderer = null;
        }
        super.destroy();
    }

    public C4455c getFullscreenRenderer() {
        return this.mRenderer;
    }

    public InneractiveFullScreenAdRewardedListener getRewardedListener() {
        return this.f10834b;
    }

    public boolean isAvailable() {
        C4429p pVar = (C4429p) C5370s.m16784a(this.mAdSpot);
        return pVar != null && pVar.isReady();
    }

    public void onActivityDestroyed(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.f10833a = false;
    }

    public void setRewardedListener(InneractiveFullScreenAdRewardedListener inneractiveFullScreenAdRewardedListener) {
        this.f10834b = inneractiveFullScreenAdRewardedListener;
    }

    public void show(Activity activity) {
        C4347a aVar;
        if (activity == null) {
            IAlog.m16703e("show() called with a null activity", new Object[0]);
        } else if (!this.f10833a) {
            InneractiveAdSpot adSpot = getAdSpot();
            if (adSpot == null) {
                IAlog.m16703e("InneractiveFullscreenUnitController was not attached to an ad spot", new Object[0]);
                return;
            }
            C4419j adContent = adSpot.getAdContent();
            if (adContent != null) {
                C4567p pVar = C4567p.IA_PUBLISHER_REQUESTED_SHOW;
                InneractiveAdRequest inneractiveAdRequest = adContent.f10913a;
                C5291e c = adContent.mo24367c();
                JSONArray c2 = adContent.f10915c.mo24342c();
                C4569q.C4570a aVar2 = new C4569q.C4570a(c);
                aVar2.f11365c = pVar;
                aVar2.f11363a = inneractiveAdRequest;
                aVar2.f11366d = c2;
                aVar2.mo24768a((String) null);
            }
            if (!adSpot.isReady()) {
                EL el = this.mEventsListener;
                if (el != null) {
                    ((InneractiveFullscreenAdEventsListener) el).onAdEnteredErrorState(adSpot, new AdExpiredError("Ad Expired"));
                    return;
                }
                return;
            }
            if (this.mRenderer == null) {
                this.mRenderer = C4400c.C4402b.f10860a.mo24561a(getAdSpot());
            }
            selectContentController();
            if (adContent instanceof C4350a) {
                aVar = new C4348b();
            } else {
                aVar = new C4349c();
            }
            aVar.mo24364a(activity, adSpot, adSpot.getLocalUniqueId());
            this.f10833a = true;
            C4455c cVar = this.mRenderer;
            if (cVar != null) {
                cVar.mo24414a(this.f10835c);
            }
        } else {
            IAlog.m16703e("InneractiveFullscreenUnitController->show(android.content.Context) called while an ad is already showing", new Object[0]);
        }
    }

    public boolean supports(InneractiveAdSpot inneractiveAdSpot) {
        C4345y yVar = (C4345y) inneractiveAdSpot.getAdContent().f10916d;
        if (yVar.f10749e != null) {
            return false;
        }
        C4327r rVar = yVar.f10747c;
        if (rVar != null && UnitDisplayType.INTERSTITIAL.equals(rVar.f10691b)) {
            return true;
        }
        C4262a0 a0Var = yVar.f10750f;
        if (a0Var == null || (!UnitDisplayType.REWARDED.equals(a0Var.f10579j) && !UnitDisplayType.INTERSTITIAL.equals(a0Var.f10579j) && !UnitDisplayType.VERTICAL.equals(a0Var.f10579j))) {
            return false;
        }
        return true;
    }

    public boolean supportsRefresh() {
        return false;
    }
}
