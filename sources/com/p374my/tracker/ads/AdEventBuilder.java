package com.p374my.tracker.ads;

/* renamed from: com.my.tracker.ads.AdEventBuilder */
public final class AdEventBuilder {

    /* renamed from: a */
    final int f25077a;

    /* renamed from: b */
    final int f25078b;

    /* renamed from: c */
    final double f25079c;

    /* renamed from: d */
    final String f25080d;

    /* renamed from: e */
    String f25081e;

    /* renamed from: f */
    String f25082f;

    /* renamed from: g */
    String f25083g;

    /* renamed from: h */
    String f25084h;

    private AdEventBuilder(int i, int i2, double d, String str) {
        this.f25077a = i;
        this.f25078b = i2;
        this.f25079c = d;
        this.f25080d = str;
    }

    public static AdEventBuilder newClickBuilder(int i) {
        return new AdEventBuilder(18, i, Double.NaN, (String) null);
    }

    public static AdEventBuilder newImpressionBuilder(int i) {
        return new AdEventBuilder(17, i, Double.NaN, (String) null);
    }

    public static AdEventBuilder newRevenueBuilder(int i, double d, String str) {
        return new AdEventBuilder(19, i, d, str);
    }

    public AdEvent build() {
        return new AdEvent(this.f25077a, this.f25078b, this.f25079c, this.f25080d, this.f25081e, this.f25082f, this.f25083g, this.f25084h);
    }

    public AdEventBuilder withAdFormat(String str) {
        this.f25084h = str;
        return this;
    }

    public AdEventBuilder withAdId(String str) {
        this.f25083g = str;
        return this;
    }

    public AdEventBuilder withPlacementId(String str) {
        this.f25082f = str;
        return this;
    }

    public AdEventBuilder withSource(String str) {
        this.f25081e = str;
        return this;
    }
}
