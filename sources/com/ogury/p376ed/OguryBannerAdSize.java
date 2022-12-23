package com.ogury.p376ed;

/* renamed from: com.ogury.ed.OguryBannerAdSize */
public enum OguryBannerAdSize {
    MPU_300x250(300, 250),
    SMALL_BANNER_320x50(320, 50);
    
    private final int height;
    private final int width;

    private OguryBannerAdSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }
}
