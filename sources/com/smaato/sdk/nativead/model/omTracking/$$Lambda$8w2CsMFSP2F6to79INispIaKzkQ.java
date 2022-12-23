package com.smaato.sdk.nativead.model.omTracking;

import com.smaato.sdk.core.openmeasurement.ViewabilityTracker;
import com.smaato.sdk.core.util.p382fi.Consumer;

/* renamed from: com.smaato.sdk.nativead.model.omTracking.-$$Lambda$8w2CsMFSP2F6to79INispIaKzkQ  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$8w2CsMFSP2F6to79INispIaKzkQ implements Consumer {
    public static final /* synthetic */ $$Lambda$8w2CsMFSP2F6to79INispIaKzkQ INSTANCE = new $$Lambda$8w2CsMFSP2F6to79INispIaKzkQ();

    private /* synthetic */ $$Lambda$8w2CsMFSP2F6to79INispIaKzkQ() {
    }

    public final void accept(Object obj) {
        ((ViewabilityTracker) obj).stopTracking();
    }
}
