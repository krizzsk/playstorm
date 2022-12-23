package com.applovin.impl.mediation;

import com.applovin.mediation.MaxReward;

public class MaxRewardImpl implements MaxReward {

    /* renamed from: a */
    private final String f2020a;

    /* renamed from: b */
    private final int f2021b;

    private MaxRewardImpl(int i, String str) {
        if (i >= 0) {
            this.f2020a = str;
            this.f2021b = i;
            return;
        }
        throw new IllegalArgumentException("Reward amount must be greater than or equal to 0");
    }

    public static MaxReward create(int i, String str) {
        return new MaxRewardImpl(i, str);
    }

    public static MaxReward createDefault() {
        return create(0, "");
    }

    public final int getAmount() {
        return this.f2021b;
    }

    public final String getLabel() {
        return this.f2020a;
    }

    public String toString() {
        return "MaxReward{amount=" + this.f2021b + ", label=" + this.f2020a + "}";
    }
}
