package com.amazon.device.ads;

import com.tapjoy.TJAdUnitConstants;

enum MraidPlacementType {
    UNKNOWN,
    INLINE,
    INTERSTITIAL;

    /* renamed from: com.amazon.device.ads.MraidPlacementType$1 */
    static /* synthetic */ class C11621 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$MraidPlacementType = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.amazon.device.ads.MraidPlacementType[] r0 = com.amazon.device.ads.MraidPlacementType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$amazon$device$ads$MraidPlacementType = r0
                com.amazon.device.ads.MraidPlacementType r1 = com.amazon.device.ads.MraidPlacementType.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$amazon$device$ads$MraidPlacementType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.amazon.device.ads.MraidPlacementType r1 = com.amazon.device.ads.MraidPlacementType.INLINE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$amazon$device$ads$MraidPlacementType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.amazon.device.ads.MraidPlacementType r1 = com.amazon.device.ads.MraidPlacementType.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.MraidPlacementType.C11621.<clinit>():void");
        }
    }

    public String toString() {
        int i = C11621.$SwitchMap$com$amazon$device$ads$MraidPlacementType[ordinal()];
        if (i == 1) {
            return "unknown";
        }
        if (i != 2) {
            return i != 3 ? "" : "interstitial";
        }
        return TJAdUnitConstants.String.INLINE;
    }
}
