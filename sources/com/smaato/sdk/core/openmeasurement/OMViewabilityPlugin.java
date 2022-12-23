package com.smaato.sdk.core.openmeasurement;

import android.content.Context;
import com.iab.omid.library.smaato.Omid;
import com.iab.omid.library.smaato.adsession.Partner;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.core.p379di.DiRegistry;
import com.smaato.sdk.core.util.Threads;

public final class OMViewabilityPlugin implements ViewabilityPlugin {
    public String getName() {
        return CampaignEx.KEY_OMID;
    }

    public void init(Context context) {
        Threads.runOnUi(new Runnable(context) {
            public final /* synthetic */ Context f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                Omid.activate(this.f$0);
            }
        });
    }

    public DiRegistry diRegistry() {
        return DiRegistry.m32956of($$Lambda$OMViewabilityPlugin$xEmP1SwIkGW__1LC3MYs4FVnHNs.INSTANCE);
    }

    static /* synthetic */ void lambda$diRegistry$8(DiRegistry diRegistry) {
        diRegistry.registerSingletonFactory(Partner.class, $$Lambda$OMViewabilityPlugin$hZplOZEMOL3f4HqsONQN5HQh4cc.INSTANCE);
        diRegistry.registerFactory(OMWebViewViewabilityTracker.class, $$Lambda$OMViewabilityPlugin$etUBop6MWhdDF7nDu2ZqTpRo5E.INSTANCE);
        diRegistry.registerFactory(OMVideoViewabilityTracker.class, $$Lambda$OMViewabilityPlugin$rXW_vPHyvsrn1Tem6Pn7Qiw6FDE.INSTANCE);
        diRegistry.registerFactory(OMImageViewabilityTracker.class, $$Lambda$OMViewabilityPlugin$JtYGph0nDn9YoLokpSR4zeZNjY0.INSTANCE);
        diRegistry.registerFactory(OMVideoResourceMapper.class, $$Lambda$OMViewabilityPlugin$IkrTqkixI6n_mWLEwHCnTJfwIA.INSTANCE);
        diRegistry.registerFactory(OMImageResourceMapper.class, $$Lambda$OMViewabilityPlugin$nJbrOE2MfREmg5R2W1C8jsBRs.INSTANCE);
        diRegistry.registerSingletonFactory("OMID_JS", String.class, $$Lambda$OMViewabilityPlugin$vjDhSboxjxkp3IbJffSJNtZzDRI.INSTANCE);
    }

    static /* synthetic */ OMWebViewViewabilityTracker lambda$diRegistry$2(DiConstructor diConstructor) {
        return new OMWebViewViewabilityTracker((Partner) diConstructor.get(Partner.class), "");
    }

    static /* synthetic */ OMVideoViewabilityTracker lambda$diRegistry$3(DiConstructor diConstructor) {
        return new OMVideoViewabilityTracker((Partner) diConstructor.get(Partner.class), (String) diConstructor.get("OMID_JS", String.class), "", (OMVideoResourceMapper) diConstructor.get(OMVideoResourceMapper.class));
    }

    static /* synthetic */ OMImageViewabilityTracker lambda$diRegistry$4(DiConstructor diConstructor) {
        return new OMImageViewabilityTracker((Partner) diConstructor.get(Partner.class), (String) diConstructor.get("OMID_JS", String.class), "", (OMImageResourceMapper) diConstructor.get(OMImageResourceMapper.class));
    }

    static /* synthetic */ OMVideoResourceMapper lambda$diRegistry$5(DiConstructor diConstructor) {
        return new OMVideoResourceMapper(CampaignEx.KEY_OMID);
    }

    static /* synthetic */ OMImageResourceMapper lambda$diRegistry$6(DiConstructor diConstructor) {
        return new OMImageResourceMapper();
    }
}
