package com.smaato.sdk.rewarded;

import com.smaato.sdk.core.util.Objects;

public final class RewardedRequestError {
    private final String adSpaceId;
    private final String publisherId;
    private final RewardedError rewardedError;

    RewardedRequestError(RewardedError rewardedError2, String str, String str2) {
        this.rewardedError = (RewardedError) Objects.requireNonNull(rewardedError2);
        this.publisherId = str;
        this.adSpaceId = str2;
    }

    public String getPublisherId() {
        return this.publisherId;
    }

    public String getAdSpaceId() {
        return this.adSpaceId;
    }

    public RewardedError getRewardedError() {
        return this.rewardedError;
    }
}
