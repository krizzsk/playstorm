package com.vungle.warren.model;

import com.vungle.warren.AdConfig;

public class Placement {
    private static final String AD_SIZE = "ad_size";
    public static final int INVALID_INTEGER_VALUE = Integer.MIN_VALUE;
    private static final String SUPPORTED_TEMPLATE_TYPES = "supported_template_types";
    private static final String TAG = "Placement";
    public static final int TYPE_DEFAULT = 0;
    public static final int TYPE_DEPRECATED_TEMPLATE = 2;
    public static final int TYPE_VUNGLE_BANNER = 1;
    public static final int TYPE_VUNGLE_MREC = 3;
    public static final int TYPE_VUNGLE_NATIVE = 4;
    int adRefreshDuration;
    protected AdConfig.AdSize adSize;
    int autoCachePriority;
    boolean autoCached;
    boolean headerBidding;
    String identifier;
    boolean incentivized;
    boolean isValid;
    int maxHbCache;
    int placementAdType = 0;
    protected AdConfig.AdSize recommendedAdSize = AdConfig.AdSize.VUNGLE_DEFAULT;
    long wakeupTime;

    public @interface PlacementAdType {
    }

    public Placement(String str) {
        this.identifier = str;
        this.autoCached = false;
        this.incentivized = false;
        this.headerBidding = false;
    }

    Placement() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0181, code lost:
        if (r8.equals(com.p374my.tracker.ads.AdFormat.BANNER) != false) goto L_0x0185;
     */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x019a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Placement(com.google.gson.JsonObject r8) throws java.lang.IllegalArgumentException {
        /*
            r7 = this;
            r7.<init>()
            r0 = 0
            r7.placementAdType = r0
            com.vungle.warren.AdConfig$AdSize r1 = com.vungle.warren.AdConfig.AdSize.VUNGLE_DEFAULT
            r7.recommendedAdSize = r1
            java.lang.String r1 = "reference_id"
            boolean r2 = r8.has(r1)
            if (r2 == 0) goto L_0x019f
            com.google.gson.JsonElement r1 = r8.get(r1)
            java.lang.String r1 = r1.getAsString()
            r7.identifier = r1
            java.lang.String r1 = "is_auto_cached"
            boolean r2 = r8.has(r1)
            r3 = 1
            if (r2 == 0) goto L_0x0031
            com.google.gson.JsonElement r1 = r8.get(r1)
            boolean r1 = r1.getAsBoolean()
            if (r1 == 0) goto L_0x0031
            r1 = r3
            goto L_0x0032
        L_0x0031:
            r1 = r0
        L_0x0032:
            r7.autoCached = r1
            java.lang.String r1 = "cache_priority"
            boolean r2 = r8.has(r1)
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == 0) goto L_0x0055
            boolean r2 = r7.autoCached
            if (r2 == 0) goto L_0x0055
            com.google.gson.JsonElement r1 = r8.get(r1)     // Catch:{ Exception -> 0x0052 }
            int r1 = r1.getAsInt()     // Catch:{ Exception -> 0x0052 }
            r7.autoCachePriority = r1     // Catch:{ Exception -> 0x0052 }
            if (r1 >= r3) goto L_0x0057
            r7.autoCachePriority = r4     // Catch:{ Exception -> 0x0052 }
            goto L_0x0057
        L_0x0052:
            r7.autoCachePriority = r4
            goto L_0x0057
        L_0x0055:
            r7.autoCachePriority = r4
        L_0x0057:
            java.lang.String r1 = "is_incentivized"
            boolean r2 = r8.has(r1)
            if (r2 == 0) goto L_0x006b
            com.google.gson.JsonElement r1 = r8.get(r1)
            boolean r1 = r1.getAsBoolean()
            if (r1 == 0) goto L_0x006b
            r1 = r3
            goto L_0x006c
        L_0x006b:
            r1 = r0
        L_0x006c:
            r7.incentivized = r1
            java.lang.String r1 = "ad_refresh_duration"
            boolean r2 = r8.has(r1)
            if (r2 == 0) goto L_0x007f
            com.google.gson.JsonElement r1 = r8.get(r1)
            int r1 = r1.getAsInt()
            goto L_0x0080
        L_0x007f:
            r1 = r0
        L_0x0080:
            r7.adRefreshDuration = r1
            java.lang.String r1 = "header_bidding"
            boolean r2 = r8.has(r1)
            if (r2 == 0) goto L_0x0096
            com.google.gson.JsonElement r1 = r8.get(r1)
            boolean r1 = r1.getAsBoolean()
            if (r1 == 0) goto L_0x0096
            r1 = r3
            goto L_0x0097
        L_0x0096:
            r1 = r0
        L_0x0097:
            r7.headerBidding = r1
            java.lang.String r1 = "max_hb_cache"
            boolean r2 = com.vungle.warren.model.JsonUtil.hasNonNull(r8, r1)
            if (r2 == 0) goto L_0x00ca
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            com.google.gson.JsonElement r1 = r8.get(r1)     // Catch:{ NumberFormatException -> 0x00b4 }
            int r1 = r1.getAsInt()     // Catch:{ NumberFormatException -> 0x00b4 }
            r7.maxHbCache = r1     // Catch:{ NumberFormatException -> 0x00b4 }
            if (r1 < 0) goto L_0x00b0
            goto L_0x00b1
        L_0x00b0:
            r1 = r2
        L_0x00b1:
            r7.maxHbCache = r1     // Catch:{ NumberFormatException -> 0x00b4 }
            goto L_0x00ca
        L_0x00b4:
            r1 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r1 = r1.getLocalizedMessage()
            r4[r0] = r1
            java.lang.String r1 = "Can't read int value from JSON: %s"
            java.lang.String r1 = java.lang.String.format(r1, r4)
            java.lang.String r4 = "Placement"
            com.vungle.warren.VungleLogger.error(r3, r4, r4, r1)
            r7.maxHbCache = r2
        L_0x00ca:
            java.lang.String r1 = "supported_template_types"
            boolean r2 = com.vungle.warren.model.JsonUtil.hasNonNull(r8, r1)
            java.lang.String r4 = "banner"
            r5 = 2
            if (r2 == 0) goto L_0x013a
            com.google.gson.JsonArray r1 = r8.getAsJsonArray(r1)
            java.util.Iterator r1 = r1.iterator()
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x013a
            java.lang.Object r1 = r1.next()
            com.google.gson.JsonElement r1 = (com.google.gson.JsonElement) r1
            java.lang.String r1 = r1.getAsString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "SupportedTemplatesTypes : "
            r2.append(r6)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r6 = "PlacementModel"
            android.util.Log.d(r6, r2)
            boolean r2 = r1.equals(r4)
            if (r2 == 0) goto L_0x010c
            r7.placementAdType = r3
            goto L_0x013a
        L_0x010c:
            java.lang.String r2 = "flexfeed"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0138
            java.lang.String r2 = "flexview"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x011d
            goto L_0x0138
        L_0x011d:
            java.lang.String r2 = "mrec"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0129
            r1 = 3
            r7.placementAdType = r1
            goto L_0x013a
        L_0x0129:
            java.lang.String r2 = "native"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0135
            r1 = 4
            r7.placementAdType = r1
            goto L_0x013a
        L_0x0135:
            r7.placementAdType = r0
            goto L_0x013a
        L_0x0138:
            r7.placementAdType = r5
        L_0x013a:
            java.lang.String r1 = "ad_size"
            boolean r2 = com.vungle.warren.model.JsonUtil.hasNonNull(r8, r1)
            if (r2 == 0) goto L_0x019e
            int r2 = r7.placementAdType
            if (r2 != r3) goto L_0x019e
            boolean r2 = r7.isMultipleHBPEnabled()
            if (r2 == 0) goto L_0x019e
            com.google.gson.JsonElement r8 = r8.get(r1)
            java.lang.String r8 = r8.getAsString()
            r1 = -1
            int r2 = r8.hashCode()
            r6 = -1396342996(0xffffffffacc57f2c, float:-5.6131957E-12)
            if (r2 == r6) goto L_0x017d
            r0 = 557834986(0x213fe2ea, float:6.5013635E-19)
            if (r2 == r0) goto L_0x0173
            r0 = 1017009577(0x3c9e55a9, float:0.019327955)
            if (r2 == r0) goto L_0x0169
            goto L_0x0184
        L_0x0169:
            java.lang.String r0 = "banner_short"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0184
            r0 = r3
            goto L_0x0185
        L_0x0173:
            java.lang.String r0 = "banner_leaderboard"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0184
            r0 = r5
            goto L_0x0185
        L_0x017d:
            boolean r8 = r8.equals(r4)
            if (r8 == 0) goto L_0x0184
            goto L_0x0185
        L_0x0184:
            r0 = r1
        L_0x0185:
            if (r0 == 0) goto L_0x019a
            if (r0 == r3) goto L_0x0195
            if (r0 == r5) goto L_0x0190
            com.vungle.warren.AdConfig$AdSize r8 = com.vungle.warren.AdConfig.AdSize.VUNGLE_DEFAULT
            r7.recommendedAdSize = r8
            goto L_0x019e
        L_0x0190:
            com.vungle.warren.AdConfig$AdSize r8 = com.vungle.warren.AdConfig.AdSize.BANNER_LEADERBOARD
            r7.recommendedAdSize = r8
            goto L_0x019e
        L_0x0195:
            com.vungle.warren.AdConfig$AdSize r8 = com.vungle.warren.AdConfig.AdSize.BANNER_SHORT
            r7.recommendedAdSize = r8
            goto L_0x019e
        L_0x019a:
            com.vungle.warren.AdConfig$AdSize r8 = com.vungle.warren.AdConfig.AdSize.BANNER
            r7.recommendedAdSize = r8
        L_0x019e:
            return
        L_0x019f:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Missing placement reference ID, cannot use placement!"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.model.Placement.<init>(com.google.gson.JsonObject):void");
    }

    public void snooze(long j) {
        this.wakeupTime = System.currentTimeMillis() + (j * 1000);
    }

    public long getWakeupTime() {
        return this.wakeupTime;
    }

    public void setWakeupTime(long j) {
        this.wakeupTime = j;
    }

    public String getId() {
        return this.identifier;
    }

    public void setValid(boolean z) {
        this.isValid = z;
    }

    public int getPlacementAdType() {
        return this.placementAdType;
    }

    public AdConfig.AdSize getAdSize() {
        AdConfig.AdSize adSize2 = this.adSize;
        return adSize2 == null ? AdConfig.AdSize.VUNGLE_DEFAULT : adSize2;
    }

    public AdConfig.AdSize getRecommendedAdSize() {
        return this.recommendedAdSize;
    }

    public void setAdSize(AdConfig.AdSize adSize2) {
        this.adSize = adSize2;
    }

    public int getAdRefreshDuration() {
        int i = this.adRefreshDuration;
        if (i <= 0) {
            return 0;
        }
        return i;
    }

    public int getAutoCachePriority() {
        return this.autoCachePriority;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Placement placement = (Placement) obj;
        String str = this.identifier;
        if (str == null ? placement.identifier == null : str.equals(placement.identifier)) {
            return this.placementAdType == placement.placementAdType && this.autoCached == placement.autoCached && this.incentivized == placement.incentivized && this.headerBidding == placement.headerBidding && this.isValid == placement.isValid;
        }
        return false;
    }

    public int hashCode() {
        String str = this.identifier;
        return ((((((((((str != null ? str.hashCode() : 0) * 31) + this.placementAdType) * 31) + (this.autoCached ? 1 : 0)) * 31) + (this.incentivized ? 1 : 0)) * 31) + (this.headerBidding ? 1 : 0)) * 31) + (this.isValid ? 1 : 0);
    }

    public boolean isAutoCached() {
        if (this.maxHbCache == 0 && this.headerBidding) {
            return false;
        }
        if (AdConfig.AdSize.isNonMrecBannerAdSize(this.adSize)) {
            return true;
        }
        return this.autoCached;
    }

    public boolean isIncentivized() {
        return this.incentivized;
    }

    public boolean isHeaderBidding() {
        return this.headerBidding;
    }

    public int getMaxHbCache() {
        return this.maxHbCache;
    }

    public boolean isValid() {
        return this.isValid;
    }

    public String toString() {
        return "Placement{identifier='" + this.identifier + '\'' + ", autoCached=" + this.autoCached + ", incentivized=" + this.incentivized + ", wakeupTime=" + this.wakeupTime + ", adRefreshDuration=" + this.adRefreshDuration + ", autoCachePriority=" + this.autoCachePriority + ", headerBidding=" + this.headerBidding + ", isValid=" + this.isValid + ", placementAdType=" + this.placementAdType + ", adSize=" + this.adSize + ", maxHbCache=" + this.maxHbCache + ", adSize=" + this.adSize + ", recommendedAdSize=" + this.recommendedAdSize + '}';
    }

    public boolean isMultipleHBPEnabled() {
        return this.headerBidding && this.maxHbCache > 0;
    }

    public boolean isSingleHBPEnabled() {
        return this.headerBidding && this.maxHbCache == 1;
    }
}
