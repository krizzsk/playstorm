package com.applovin.mediation.nativeAds.adPlacer;

import com.applovin.impl.sdk.C2092v;
import java.util.Set;
import java.util.TreeSet;

public class MaxAdPlacerSettings {
    public static final int MIN_REPEATING_INTERVAL = 2;

    /* renamed from: a */
    private final String f4488a;

    /* renamed from: b */
    private final Set<Integer> f4489b = new TreeSet();

    /* renamed from: c */
    private int f4490c = 0;

    /* renamed from: d */
    private int f4491d = 256;

    /* renamed from: e */
    private int f4492e = 4;

    public MaxAdPlacerSettings(String str) {
        this.f4488a = str;
    }

    public void addFixedPosition(int i) {
        this.f4489b.add(Integer.valueOf(i));
    }

    public String getAdUnitId() {
        return this.f4488a;
    }

    public Set<Integer> getFixedPositions() {
        return this.f4489b;
    }

    public int getMaxAdCount() {
        return this.f4491d;
    }

    public int getMaxPreloadedAdCount() {
        return this.f4492e;
    }

    public int getRepeatingInterval() {
        return this.f4490c;
    }

    public boolean hasValidPositioning() {
        return !this.f4489b.isEmpty() || isRepeatingEnabled();
    }

    public boolean isRepeatingEnabled() {
        return this.f4490c >= 2;
    }

    public void resetFixedPositions() {
        this.f4489b.clear();
    }

    public void setMaxAdCount(int i) {
        this.f4491d = i;
    }

    public void setMaxPreloadedAdCount(int i) {
        this.f4492e = i;
    }

    public void setRepeatingInterval(int i) {
        if (i >= 2) {
            this.f4490c = i;
            C2092v.m5050f("MaxAdPlacerSettings", "Repeating interval set to " + i);
            return;
        }
        this.f4490c = 0;
        C2092v.m5052h("MaxAdPlacerSettings", "Repeating interval has been disabled, since it has been set to " + i + ", which is less than minimum value of " + 2);
    }

    public String toString() {
        return "MaxAdPlacerSettings{adUnitId='" + this.f4488a + '\'' + ", fixedPositions=" + this.f4489b + ", repeatingInterval=" + this.f4490c + ", maxAdCount=" + this.f4491d + ", maxPreloadedAdCount=" + this.f4492e + '}';
    }
}
