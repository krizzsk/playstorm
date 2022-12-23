package com.fyber.inneractive.sdk.display;

import android.app.Activity;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.C4433s;
import com.fyber.inneractive.sdk.interfaces.C4455c;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.display.b */
public class C4348b extends C4347a implements C4455c.C4456a {

    /* renamed from: a */
    public InneractiveAdSpot f10752a;

    /* renamed from: b */
    public C4455c f10753b;

    /* renamed from: a */
    public void mo24364a(Activity activity, InneractiveAdSpot inneractiveAdSpot, String str) {
        InneractiveAdSpot inneractiveAdSpot2;
        if (TextUtils.isEmpty(str) || (inneractiveAdSpot2 = InneractiveAdSpotManager.get().getSpot(str)) == null || inneractiveAdSpot2.getAdContent() == null) {
            inneractiveAdSpot2 = null;
        }
        this.f10752a = inneractiveAdSpot2;
        if (inneractiveAdSpot2 != null) {
            InneractiveUnitController selectedUnitController = inneractiveAdSpot2.getSelectedUnitController();
            if (selectedUnitController instanceof InneractiveFullscreenAdActivity.FullScreenRendererProvider) {
                C4455c fullscreenRenderer = ((InneractiveFullscreenAdActivity.FullScreenRendererProvider) selectedUnitController).getFullscreenRenderer();
                this.f10753b = fullscreenRenderer;
                if (fullscreenRenderer != null) {
                    InneractiveAdSpot inneractiveAdSpot3 = this.f10752a;
                    C4433s sVar = (C4433s) fullscreenRenderer;
                    sVar.f10920a = inneractiveAdSpot3;
                    sVar.f10921b = inneractiveAdSpot3.getAdContent();
                    sVar.f10922c = inneractiveAdSpot3.getSelectedUnitController().getEventsListener();
                    sVar.f10966u.f14140a = inneractiveAdSpot3;
                    try {
                        this.f10753b.mo24413a(this, activity);
                    } catch (InneractiveUnitController.AdDisplayError e) {
                        IAlog.m16703e("Interstitial Activity: %s", e.getMessage());
                    } catch (Resources.NotFoundException e2) {
                        IAlog.m16703e("Interstitial Activity: %s", e2.getMessage());
                    }
                }
            }
        }
    }

    public void destroy() {
    }

    public void disableCloseButton() {
    }

    public void dismissAd(boolean z) {
        C4455c cVar = this.f10753b;
        if (cVar != null) {
            cVar.destroy();
            this.f10753b = null;
        }
    }

    public View getCloseButton() {
        return null;
    }

    public ViewGroup getLayout() {
        return null;
    }

    public boolean isCloseButtonDisplay() {
        return false;
    }

    public void setActivityOrientation(boolean z, Orientation orientation) {
    }

    public void showCloseButton(boolean z, int i, int i2) {
    }

    public void showCloseCountdown() {
    }

    public void updateCloseCountdown(int i) {
    }

    public boolean wasDismissedByUser() {
        return false;
    }
}
