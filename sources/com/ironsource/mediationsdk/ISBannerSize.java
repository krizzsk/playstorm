package com.ironsource.mediationsdk;

public class ISBannerSize {
    public static final ISBannerSize BANNER = new ISBannerSize("BANNER", 320, 50);
    public static final ISBannerSize LARGE = new ISBannerSize("LARGE", 320, 90);
    public static final ISBannerSize RECTANGLE = new ISBannerSize("RECTANGLE", 300, 250);
    public static final ISBannerSize SMART = new ISBannerSize("SMART", 0, 0);

    /* renamed from: a */
    protected static final ISBannerSize f16451a = new ISBannerSize("LEADERBOARD", 728, 90);

    /* renamed from: b */
    private int f16452b;

    /* renamed from: c */
    private int f16453c;

    /* renamed from: d */
    private String f16454d;

    /* renamed from: e */
    private boolean f16455e;

    public ISBannerSize(int i, int i2) {
        this("CUSTOM", i, i2);
    }

    public ISBannerSize(String str, int i, int i2) {
        this.f16454d = str;
        this.f16452b = i;
        this.f16453c = i2;
    }

    public String getDescription() {
        return this.f16454d;
    }

    public int getHeight() {
        return this.f16453c;
    }

    public int getWidth() {
        return this.f16452b;
    }

    public boolean isAdaptive() {
        return this.f16455e;
    }

    public boolean isSmart() {
        return this.f16454d.equals("SMART");
    }

    public void setAdaptive(boolean z) {
        this.f16455e = z;
    }
}
