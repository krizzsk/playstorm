package com.amazon.device.ads;

class DtbPricePoint {
    private final DTBAdSize adSize;
    private final String pricePoint;

    DtbPricePoint(String str, String str2, String str3, AdType adType) {
        this.pricePoint = str;
        String[] split = str2.split("x");
        if (split.length == 2) {
            this.adSize = new DTBAdSize(DtbCommonUtils.parseInt(split[0], 0), DtbCommonUtils.parseInt(split[1], 0), adType, str3);
            return;
        }
        throw new IllegalArgumentException("AdSize " + str2 + " is not valid");
    }

    public String getPricePoint() {
        return this.pricePoint;
    }

    public DTBAdSize getAdSize() {
        return this.adSize;
    }

    public String toString() {
        return "DtbPricePoint [pricePoint=" + this.pricePoint + ", adSize=" + this.adSize + "]";
    }
}
