package com.smaato.sdk.core.p378ad;

import com.smaato.sdk.core.network.Headers;
import com.smaato.sdk.core.util.HeaderUtils;
import com.smaato.sdk.core.util.Joiner;
import java.util.List;
import java.util.Map;

/* renamed from: com.smaato.sdk.core.ad.ApiUtils */
public final class ApiUtils {
    private static final HeaderUtils HEADER_UTILS = new HeaderUtils();

    private ApiUtils() {
    }

    public static String retrieveSessionId(Map<String, List<String>> map) {
        return HEADER_UTILS.extractHeaderMultiValue(map, "X-SMT-SessionId");
    }

    public static String retrieveSessionId(Headers headers) {
        List<String> values = headers.values("X-SMT-SessionId");
        if (values.isEmpty()) {
            return null;
        }
        return Joiner.join((CharSequence) "", (Iterable) values);
    }

    public static String retrieveImpressionCountingType(Headers headers) {
        List<String> values = headers.values("X-SMT-Impression-Measurement");
        if (values.isEmpty()) {
            return null;
        }
        return values.get(0);
    }

    public static String retrieveSci(Map<String, List<String>> map) {
        return HEADER_UTILS.extractHeaderMultiValue(map, "SCI");
    }

    public static String retrieveSci(Headers headers) {
        List<String> values = headers.values("SCI");
        if (values.isEmpty()) {
            return null;
        }
        return Joiner.join((CharSequence) "", (Iterable) values);
    }

    public static String retrieveCsm(Map<String, List<String>> map) {
        return HEADER_UTILS.extractHeaderMultiValue(map, "X-SMT-CSM");
    }

    /* renamed from: com.smaato.sdk.core.ad.ApiUtils$1 */
    static /* synthetic */ class C109441 {
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$core$ad$AdFormat;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.smaato.sdk.core.ad.AdFormat[] r0 = com.smaato.sdk.core.p378ad.AdFormat.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$smaato$sdk$core$ad$AdFormat = r0
                com.smaato.sdk.core.ad.AdFormat r1 = com.smaato.sdk.core.p378ad.AdFormat.DISPLAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdFormat     // Catch:{ NoSuchFieldError -> 0x001d }
                com.smaato.sdk.core.ad.AdFormat r1 = com.smaato.sdk.core.p378ad.AdFormat.STATIC_IMAGE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdFormat     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.smaato.sdk.core.ad.AdFormat r1 = com.smaato.sdk.core.p378ad.AdFormat.RICH_MEDIA     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdFormat     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.smaato.sdk.core.ad.AdFormat r1 = com.smaato.sdk.core.p378ad.AdFormat.VIDEO     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdFormat     // Catch:{ NoSuchFieldError -> 0x003e }
                com.smaato.sdk.core.ad.AdFormat r1 = com.smaato.sdk.core.p378ad.AdFormat.NATIVE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdFormat     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.smaato.sdk.core.ad.AdFormat r1 = com.smaato.sdk.core.p378ad.AdFormat.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.p378ad.ApiUtils.C109441.<clinit>():void");
        }
    }

    public static String adFormatToApiValue(AdFormat adFormat) {
        switch (C109441.$SwitchMap$com$smaato$sdk$core$ad$AdFormat[adFormat.ordinal()]) {
            case 1:
                return "display";
            case 2:
                return "img";
            case 3:
                return "richmedia";
            case 4:
                return "video";
            case 5:
                return "native";
            case 6:
                return "interstitial";
            default:
                throw new IllegalArgumentException(String.format("Unexpected %s: %s", new Object[]{AdFormat.class.getSimpleName(), adFormat}));
        }
    }
}
