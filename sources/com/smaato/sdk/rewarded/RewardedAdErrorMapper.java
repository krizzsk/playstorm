package com.smaato.sdk.rewarded;

import com.smaato.sdk.core.p378ad.AdLoader;
import com.smaato.sdk.core.util.Objects;

class RewardedAdErrorMapper {
    RewardedAdErrorMapper() {
    }

    public RewardedError map(AdLoader.Error error) {
        Objects.requireNonNull(error, "Parameter adLoaderError cannot be null for BannerErrorMapperUtil::map");
        switch (C111581.$SwitchMap$com$smaato$sdk$core$ad$AdLoader$Error[error.ordinal()]) {
            case 1:
            case 2:
                return RewardedError.NO_AD_AVAILABLE;
            case 3:
                return RewardedError.INVALID_REQUEST;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return RewardedError.INTERNAL_ERROR;
            case 10:
                return RewardedError.CACHE_LIMIT_REACHED;
            case 11:
            case 12:
                return RewardedError.NETWORK_ERROR;
            case 13:
                return RewardedError.CREATIVE_RESOURCE_EXPIRED;
            default:
                return RewardedError.INTERNAL_ERROR;
        }
    }

    /* renamed from: com.smaato.sdk.rewarded.RewardedAdErrorMapper$1 */
    static /* synthetic */ class C111581 {
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$core$ad$AdLoader$Error;

        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|(3:27|28|30)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|30) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.smaato.sdk.core.ad.AdLoader$Error[] r0 = com.smaato.sdk.core.p378ad.AdLoader.Error.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$smaato$sdk$core$ad$AdLoader$Error = r0
                com.smaato.sdk.core.ad.AdLoader$Error r1 = com.smaato.sdk.core.p378ad.AdLoader.Error.NO_AD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdLoader$Error     // Catch:{ NoSuchFieldError -> 0x001d }
                com.smaato.sdk.core.ad.AdLoader$Error r1 = com.smaato.sdk.core.p378ad.AdLoader.Error.NO_MANDATORY_CACHE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdLoader$Error     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.smaato.sdk.core.ad.AdLoader$Error r1 = com.smaato.sdk.core.p378ad.AdLoader.Error.BAD_REQUEST     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdLoader$Error     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.smaato.sdk.core.ad.AdLoader$Error r1 = com.smaato.sdk.core.p378ad.AdLoader.Error.PRESENTER_BUILDER_GENERIC     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdLoader$Error     // Catch:{ NoSuchFieldError -> 0x003e }
                com.smaato.sdk.core.ad.AdLoader$Error r1 = com.smaato.sdk.core.p378ad.AdLoader.Error.INVALID_RESPONSE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdLoader$Error     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.smaato.sdk.core.ad.AdLoader$Error r1 = com.smaato.sdk.core.p378ad.AdLoader.Error.API     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdLoader$Error     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.smaato.sdk.core.ad.AdLoader$Error r1 = com.smaato.sdk.core.p378ad.AdLoader.Error.CONFIGURATION_ERROR     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdLoader$Error     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.smaato.sdk.core.ad.AdLoader$Error r1 = com.smaato.sdk.core.p378ad.AdLoader.Error.INTERNAL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdLoader$Error     // Catch:{ NoSuchFieldError -> 0x006c }
                com.smaato.sdk.core.ad.AdLoader$Error r1 = com.smaato.sdk.core.p378ad.AdLoader.Error.TTL_EXPIRED     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdLoader$Error     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.smaato.sdk.core.ad.AdLoader$Error r1 = com.smaato.sdk.core.p378ad.AdLoader.Error.CACHE_LIMIT_REACHED     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdLoader$Error     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.smaato.sdk.core.ad.AdLoader$Error r1 = com.smaato.sdk.core.p378ad.AdLoader.Error.NETWORK     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdLoader$Error     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.smaato.sdk.core.ad.AdLoader$Error r1 = com.smaato.sdk.core.p378ad.AdLoader.Error.NO_CONNECTION     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdLoader$Error     // Catch:{ NoSuchFieldError -> 0x009c }
                com.smaato.sdk.core.ad.AdLoader$Error r1 = com.smaato.sdk.core.p378ad.AdLoader.Error.CREATIVE_RESOURCE_EXPIRED     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdLoader$Error     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.smaato.sdk.core.ad.AdLoader$Error r1 = com.smaato.sdk.core.p378ad.AdLoader.Error.CANCELLED     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.rewarded.RewardedAdErrorMapper.C111581.<clinit>():void");
        }
    }
}
