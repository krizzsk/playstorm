package com.smaato.sdk.nativead.model.omTracking;

import android.util.Log;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.smaato.sdk.core.openmeasurement.OMImageViewabilityTracker;
import com.smaato.sdk.core.openmeasurement.OMWebViewViewabilityTracker;
import com.smaato.sdk.core.openmeasurement.ViewabilityTracker;
import com.smaato.sdk.core.openmeasurement.ViewabilityVerificationResource;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.richmedia.widget.RichMediaWebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OMTrackingRemoteSource {
    OMImageViewabilityTracker omImageViewabilityTracker;

    public OMTrackingRemoteSource(OMImageViewabilityTracker oMImageViewabilityTracker) {
        this.omImageViewabilityTracker = oMImageViewabilityTracker;
    }

    public void replaceTrackers(OMImageViewabilityTracker oMImageViewabilityTracker) {
        this.omImageViewabilityTracker = oMImageViewabilityTracker;
    }

    public ViewabilityTracker getViewabilityTracker(View view, boolean z, String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        this.omImageViewabilityTracker.registerAdView(view, getViewabilityResourcesMap(str));
        this.omImageViewabilityTracker.startTracking();
        return this.omImageViewabilityTracker;
    }

    public void trackOMAdLoaded(ViewabilityTracker viewabilityTracker) {
        Objects.onNotNull(viewabilityTracker, $$Lambda$m2pbFylthpXlxJaVYmV5xY5yR38.INSTANCE);
    }

    public void trackOMImpression(ViewabilityTracker viewabilityTracker) {
        Objects.onNotNull(viewabilityTracker, $$Lambda$lU8Yt26ymLoNLUcz2zosmsLUwk.INSTANCE);
    }

    public void trackOMUpdateView(ViewabilityTracker viewabilityTracker, RichMediaWebView richMediaWebView) {
        if (viewabilityTracker instanceof OMWebViewViewabilityTracker) {
            ((OMWebViewViewabilityTracker) viewabilityTracker).updateAdView(richMediaWebView);
        }
    }

    public void stopOMTracking(ViewabilityTracker viewabilityTracker) {
        Objects.onNotNull(viewabilityTracker, $$Lambda$8w2CsMFSP2F6to79INispIaKzkQ.INSTANCE);
    }

    private Map<String, List<ViewabilityVerificationResource>> getViewabilityResourcesMap(String str) {
        HashMap hashMap = new HashMap();
        try {
            ViewabilityVerificationResource viewabilityVerificationResource = new ViewabilityVerificationResource("iabtechlab.com-omid", str, "", "iabtechlab-smaato", true);
            ArrayList arrayList = new ArrayList();
            arrayList.add(viewabilityVerificationResource);
            hashMap.put(CampaignEx.KEY_OMID, arrayList);
        } catch (Exception e) {
            e.printStackTrace();
            Log.e(OMTrackingRemoteSource.class.getSimpleName(), "error while getting visibility map", e);
        }
        return hashMap;
    }
}
