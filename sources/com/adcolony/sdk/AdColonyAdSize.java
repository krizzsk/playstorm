package com.adcolony.sdk;

public class AdColonyAdSize {
    public static final AdColonyAdSize BANNER = new AdColonyAdSize(320, 50);
    public static final AdColonyAdSize LEADERBOARD = new AdColonyAdSize(728, 90);
    public static final AdColonyAdSize MEDIUM_RECTANGLE = new AdColonyAdSize(300, 250);
    public static final AdColonyAdSize SKYSCRAPER = new AdColonyAdSize(160, 600);

    /* renamed from: a */
    int f87a;

    /* renamed from: b */
    int f88b;

    public AdColonyAdSize(int i, int i2) {
        this.f87a = i;
        this.f88b = i2;
    }

    public int getHeight() {
        return this.f88b;
    }

    public int getWidth() {
        return this.f87a;
    }
}
