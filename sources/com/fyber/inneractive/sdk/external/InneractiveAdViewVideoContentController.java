package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.C4450y;
import com.fyber.inneractive.sdk.flow.C4451z;
import com.fyber.inneractive.sdk.renderers.C5284m;
import java.lang.ref.WeakReference;

public class InneractiveAdViewVideoContentController extends C4451z {
    public boolean canControl(InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent() instanceof C4450y;
    }

    public void pauseVideo() {
    }

    public void playVideo() {
    }

    public void setControlledRenderer(C5284m mVar) {
        new WeakReference(mVar);
    }
}
