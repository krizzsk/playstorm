package com.ironsource.mediationsdk.model;

public class Placement {

    /* renamed from: a */
    private int f17471a;

    /* renamed from: b */
    private String f17472b;

    /* renamed from: c */
    private boolean f17473c;

    /* renamed from: d */
    private String f17474d;

    /* renamed from: e */
    private int f17475e;

    /* renamed from: f */
    private C6701k f17476f;

    public Placement(int i, String str, boolean z, String str2, int i2, C6701k kVar) {
        this.f17471a = i;
        this.f17472b = str;
        this.f17473c = z;
        this.f17474d = str2;
        this.f17475e = i2;
        this.f17476f = kVar;
    }

    public Placement(InterstitialPlacement interstitialPlacement) {
        this.f17471a = interstitialPlacement.getPlacementId();
        this.f17472b = interstitialPlacement.getPlacementName();
        this.f17473c = interstitialPlacement.isDefault();
        this.f17476f = interstitialPlacement.getPlacementAvailabilitySettings();
    }

    public C6701k getPlacementAvailabilitySettings() {
        return this.f17476f;
    }

    public int getPlacementId() {
        return this.f17471a;
    }

    public String getPlacementName() {
        return this.f17472b;
    }

    public int getRewardAmount() {
        return this.f17475e;
    }

    public String getRewardName() {
        return this.f17474d;
    }

    public boolean isDefault() {
        return this.f17473c;
    }

    public String toString() {
        return "placement name: " + this.f17472b + ", reward name: " + this.f17474d + " , amount: " + this.f17475e;
    }
}
