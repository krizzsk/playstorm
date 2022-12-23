package com.ironsource.mediationsdk.model;

public class InterstitialPlacement {

    /* renamed from: a */
    private int f17453a;

    /* renamed from: b */
    private String f17454b;

    /* renamed from: c */
    private boolean f17455c;

    /* renamed from: d */
    private C6701k f17456d;

    public InterstitialPlacement(int i, String str, boolean z, C6701k kVar) {
        this.f17453a = i;
        this.f17454b = str;
        this.f17455c = z;
        this.f17456d = kVar;
    }

    public C6701k getPlacementAvailabilitySettings() {
        return this.f17456d;
    }

    public int getPlacementId() {
        return this.f17453a;
    }

    public String getPlacementName() {
        return this.f17454b;
    }

    public boolean isDefault() {
        return this.f17455c;
    }

    public String toString() {
        return "placement name: " + this.f17454b;
    }
}
