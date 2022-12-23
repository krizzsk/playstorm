package com.amazon.device.ads;

import org.json.JSONObject;

public class DTBAdSize {
    public static final String AAX_INTERSTITIAL_AD_SIZE = "interstitial";
    private final AdType adType;
    private final int height;
    private JSONObject pubSettings;
    private final String slotUUID;
    private final int width;

    public DTBAdSize(int i, int i2, String str) {
        this(i, i2, AdType.DISPLAY, str, (JSONObject) null);
        if (i == 9999 || i2 == 9999) {
            throw new IllegalArgumentException("Invalid size passed, Please use DTBInterstitialAdSize for interstitial ads.");
        }
    }

    protected DTBAdSize(int i, int i2, AdType adType2, String str, JSONObject jSONObject) {
        if (i < 0 || i2 < 0 || DtbCommonUtils.isNullOrEmpty(str)) {
            throw new IllegalArgumentException("Invalid parameter(s) passed to DTBAdSize constructor.");
        }
        this.width = i;
        this.height = i2;
        this.adType = adType2;
        this.slotUUID = str;
        this.pubSettings = jSONObject;
    }

    protected DTBAdSize(int i, int i2, AdType adType2, String str) {
        this(i, i2, adType2, str, (JSONObject) null);
        if (i < 0 || i2 < 0 || DtbCommonUtils.isNullOrEmpty(str)) {
            throw new IllegalArgumentException("Invalid parameter(s) passed to DTBAdSize constructor.");
        }
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public boolean isInterstitialAd() {
        return this.adType.equals(AdType.INTERSTITIAL);
    }

    public AdType getDTBAdType() {
        return this.adType;
    }

    public String getSlotUUID() {
        return this.slotUUID;
    }

    public JSONObject getPubSettings() {
        return this.pubSettings;
    }

    public void setPubSettings(JSONObject jSONObject) {
        this.pubSettings = jSONObject;
    }

    public int hashCode() {
        return ((this.height + 31) * 31) + this.width;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DTBAdSize dTBAdSize = (DTBAdSize) obj;
        return this.height == dTBAdSize.height && this.width == dTBAdSize.width;
    }

    public String toString() {
        return "DTBAdSize [" + this.width + "x" + this.height + ", adType=" + this.adType + ", slotUUID=" + this.slotUUID + "]";
    }

    public static final class DTBInterstitialAdSize extends DTBAdSize {
        public DTBInterstitialAdSize(String str) {
            super(9999, 9999, AdType.INTERSTITIAL, str, (JSONObject) null);
        }
    }

    public static final class DTBVideo extends DTBAdSize {
        public DTBVideo(int i, int i2, String str) {
            super(i, i2, AdType.VIDEO, str, (JSONObject) null);
        }

        public DTBVideo(int i, int i2, String str, JSONObject jSONObject) {
            super(i, i2, AdType.VIDEO, str, jSONObject);
        }
    }
}
