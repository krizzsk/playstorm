package com.smaato.sdk.core.openmeasurement;

import android.util.Log;
import android.view.View;
import com.iab.omid.library.smaato.adsession.AdEvents;
import com.iab.omid.library.smaato.adsession.AdSession;
import com.iab.omid.library.smaato.adsession.FriendlyObstructionPurpose;

abstract class BaseOMViewabilityTracker implements ViewabilityTracker {
    protected AdEvents adEvents;
    protected AdSession adSession;

    BaseOMViewabilityTracker() {
    }

    public void startTracking() {
        AdSession adSession2 = this.adSession;
        if (adSession2 != null) {
            adSession2.start();
        }
        Log.i("OMTracker", "startTracking");
    }

    public void stopTracking() {
        Log.i("OMTracker", "stopTracking");
        AdSession adSession2 = this.adSession;
        if (adSession2 != null) {
            adSession2.finish();
            this.adSession = null;
            this.adEvents = null;
        }
    }

    public void trackImpression() {
        Log.i("OMTracker", "trackImpression");
        AdEvents adEvents2 = this.adEvents;
        if (adEvents2 != null) {
            adEvents2.impressionOccurred();
        }
    }

    public void trackLoaded() {
        Log.i("OMTracker", "trackLoaded");
        AdEvents adEvents2 = this.adEvents;
        if (adEvents2 != null) {
            adEvents2.loaded();
        }
    }

    public void registerFriendlyObstruction(View view) {
        Log.i("OMTracker", "registerFriendlyObstruction");
        AdSession adSession2 = this.adSession;
        if (adSession2 != null) {
            adSession2.addFriendlyObstruction(view, FriendlyObstructionPurpose.OTHER, (String) null);
        }
    }

    public void removeFriendlyObstruction(View view) {
        Log.i("OMTracker", "removeFriendlyObstruction");
        AdSession adSession2 = this.adSession;
        if (adSession2 != null) {
            adSession2.removeFriendlyObstruction(view);
        }
    }
}
