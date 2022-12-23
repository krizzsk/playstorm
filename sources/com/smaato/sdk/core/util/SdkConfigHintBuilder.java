package com.smaato.sdk.core.util;

import com.smaato.sdk.core.p378ad.AdFormat;

public class SdkConfigHintBuilder {

    /* renamed from: com.smaato.sdk.core.util.SdkConfigHintBuilder$1 */
    static /* synthetic */ class C110371 {
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$core$ad$AdFormat;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.smaato.sdk.core.ad.AdFormat[] r0 = com.smaato.sdk.core.p378ad.AdFormat.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$smaato$sdk$core$ad$AdFormat = r0
                com.smaato.sdk.core.ad.AdFormat r1 = com.smaato.sdk.core.p378ad.AdFormat.RICH_MEDIA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdFormat     // Catch:{ NoSuchFieldError -> 0x001d }
                com.smaato.sdk.core.ad.AdFormat r1 = com.smaato.sdk.core.p378ad.AdFormat.VIDEO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.util.SdkConfigHintBuilder.C110371.<clinit>():void");
        }
    }

    public String buildSdkModuleMissedHintForAdFormat(AdFormat adFormat) {
        String str;
        String str2;
        int i = C110371.$SwitchMap$com$smaato$sdk$core$ad$AdFormat[adFormat.ordinal()];
        if (i == 1) {
            str = "Rich Media";
            str2 = "com.smaato.sdk.richmedia:module-richmedia";
        } else if (i != 2) {
            return "";
        } else {
            str = "Video";
            str2 = "com.smaato.sdk.vast:module-video";
        }
        return String.format("In order to show %s ads, add %s SOMA SDK module to your app build configuration", new Object[]{str, str2});
    }
}
