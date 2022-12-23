package com.smaato.sdk.core.p378ad;

import com.smaato.sdk.core.AdContentRating;

/* renamed from: com.smaato.sdk.core.ad.RequestInfoMapper */
public final class RequestInfoMapper {
    public Integer mapToApiValue(GeoType geoType) {
        int i = C109461.$SwitchMap$com$smaato$sdk$core$ad$GeoType[geoType.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return 3;
        }
        throw new IllegalArgumentException(String.format("Unexpected %s: %s", new Object[]{GeoType.class.getSimpleName(), geoType}));
    }

    /* renamed from: com.smaato.sdk.core.ad.RequestInfoMapper$1 */
    static /* synthetic */ class C109461 {
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$core$AdContentRating;
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$core$ad$GeoType;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        static {
            /*
                com.smaato.sdk.core.AdContentRating[] r0 = com.smaato.sdk.core.AdContentRating.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$smaato$sdk$core$AdContentRating = r0
                r1 = 1
                com.smaato.sdk.core.AdContentRating r2 = com.smaato.sdk.core.AdContentRating.MAX_AD_CONTENT_RATING_G     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$com$smaato$sdk$core$AdContentRating     // Catch:{ NoSuchFieldError -> 0x001d }
                com.smaato.sdk.core.AdContentRating r3 = com.smaato.sdk.core.AdContentRating.MAX_AD_CONTENT_RATING_PG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$com$smaato$sdk$core$AdContentRating     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.smaato.sdk.core.AdContentRating r4 = com.smaato.sdk.core.AdContentRating.MAX_AD_CONTENT_RATING_T     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = $SwitchMap$com$smaato$sdk$core$AdContentRating     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.smaato.sdk.core.AdContentRating r4 = com.smaato.sdk.core.AdContentRating.MAX_AD_CONTENT_RATING_MA     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.smaato.sdk.core.ad.GeoType[] r3 = com.smaato.sdk.core.p378ad.GeoType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                $SwitchMap$com$smaato$sdk$core$ad$GeoType = r3
                com.smaato.sdk.core.ad.GeoType r4 = com.smaato.sdk.core.p378ad.GeoType.GPS     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = $SwitchMap$com$smaato$sdk$core$ad$GeoType     // Catch:{ NoSuchFieldError -> 0x004e }
                com.smaato.sdk.core.ad.GeoType r3 = com.smaato.sdk.core.p378ad.GeoType.IP_ADDRESS     // Catch:{ NoSuchFieldError -> 0x004e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$GeoType     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.smaato.sdk.core.ad.GeoType r1 = com.smaato.sdk.core.p378ad.GeoType.USER_PROVIDED     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.p378ad.RequestInfoMapper.C109461.<clinit>():void");
        }
    }

    public String mapToApiValue(AdContentRating adContentRating) {
        int i = C109461.$SwitchMap$com$smaato$sdk$core$AdContentRating[adContentRating.ordinal()];
        if (i == 1) {
            return "G";
        }
        if (i == 2) {
            return "PG";
        }
        if (i == 3) {
            return "T";
        }
        if (i == 4) {
            return "MA";
        }
        throw new IllegalArgumentException(String.format("Unexpected %s: %s", new Object[]{AdContentRating.class.getSimpleName(), adContentRating}));
    }
}
