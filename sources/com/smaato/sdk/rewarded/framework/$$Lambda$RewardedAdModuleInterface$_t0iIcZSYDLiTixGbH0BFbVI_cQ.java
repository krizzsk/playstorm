package com.smaato.sdk.rewarded.framework;

import com.smaato.sdk.core.p379di.DiRegistry;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.rewarded.DiRewardedAds;

/* renamed from: com.smaato.sdk.rewarded.framework.-$$Lambda$RewardedAdModuleInterface$_t0iIcZSYDLiTixGbH0BFbVI_cQ  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RewardedAdModuleInterface$_t0iIcZSYDLiTixGbH0BFbVI_cQ implements Consumer {
    public static final /* synthetic */ $$Lambda$RewardedAdModuleInterface$_t0iIcZSYDLiTixGbH0BFbVI_cQ INSTANCE = new $$Lambda$RewardedAdModuleInterface$_t0iIcZSYDLiTixGbH0BFbVI_cQ();

    private /* synthetic */ $$Lambda$RewardedAdModuleInterface$_t0iIcZSYDLiTixGbH0BFbVI_cQ() {
    }

    public final void accept(Object obj) {
        ((DiRegistry) obj).addFrom(DiRewardedAds.createRewardedAdsRegistry());
    }
}
