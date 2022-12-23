package com.smaato.sdk.core.p378ad;

import com.adjust.sdk.Constants;
import com.smaato.sdk.core.KeyValuePairs;
import com.smaato.sdk.core.api.ApiAdRequest;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.core.util.p382fi.Function;

/* renamed from: com.smaato.sdk.core.ad.AdRequestMapper */
public class AdRequestMapper {
    private final AdLoaderPlugin adLoaderPlugin;
    private final Logger logger;

    public AdRequestMapper(Logger logger2, AdLoaderPlugin adLoaderPlugin2) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.adLoaderPlugin = (AdLoaderPlugin) Objects.requireNonNull(adLoaderPlugin2);
    }

    public ApiAdRequest map(AdRequest adRequest) {
        Objects.requireNonNull(adRequest);
        AdSettings adSettings = adRequest.getAdSettings();
        AdFormat resolveAdFormatToServerAdFormat = this.adLoaderPlugin.resolveAdFormatToServerAdFormat(adSettings.getAdFormat(), this.logger);
        if (resolveAdFormatToServerAdFormat != null) {
            ApiAdRequest.Builder builder = ApiAdRequest.builder();
            fillAdSettingsParams(resolveAdFormatToServerAdFormat, adSettings, builder);
            fillExtraParams(resolveAdFormatToServerAdFormat, builder);
            Objects.onNotNull(adRequest.getKeyValuePairs(), new Consumer() {
                public final void accept(Object obj) {
                    ApiAdRequest.Builder.this.setKeyValuePairs(((KeyValuePairs) obj).getAllKeyValuePairs());
                }
            });
            builder.setIsSplash(adRequest.getIsSplash());
            builder.setVideoSkipInterval(adRequest.getAdSettings().getVideoSkipInterval());
            builder.setDisplayAdCloseInterval(adRequest.getAdSettings().getDisplayAdCloseInterval());
            return builder.build();
        }
        throw new UnresolvedServerAdFormatException();
    }

    private void fillAdSettingsParams(AdFormat adFormat, AdSettings adSettings, ApiAdRequest.Builder builder) {
        builder.setPublisherId(adSettings.getPublisherId()).setAdSpaceId(adSettings.getAdSpaceId()).setAdFormat(ApiUtils.adFormatToApiValue(adFormat)).setAdDimension((String) Objects.transformOrNull(adSettings.getAdDimension(), new Function() {
            public final Object apply(Object obj) {
                return AdRequestMapper.this.mapToApiValue((AdDimension) obj);
            }
        })).setWidth(adSettings.getWidth()).setHeight(adSettings.getHeight()).setMediationNetworkName(adSettings.getMediationNetworkName()).setMediationNetworkSDKVersion(adSettings.getMediationNetworkSDKVersion()).setMediationAdapterVersion(adSettings.getMediationAdapterVersion());
    }

    private void fillExtraParams(AdFormat adFormat, ApiAdRequest.Builder builder) {
        ApiAdRequestExtras apiAdRequestExtras = new ApiAdRequestExtras(adFormat);
        this.adLoaderPlugin.addApiAdRequestExtras(apiAdRequestExtras, this.logger);
        builder.setExtraParameters(apiAdRequestExtras.toMap());
    }

    /* renamed from: com.smaato.sdk.core.ad.AdRequestMapper$1 */
    static /* synthetic */ class C109421 {
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$core$ad$AdDimension;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.smaato.sdk.core.ad.AdDimension[] r0 = com.smaato.sdk.core.p378ad.AdDimension.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$smaato$sdk$core$ad$AdDimension = r0
                com.smaato.sdk.core.ad.AdDimension r1 = com.smaato.sdk.core.p378ad.AdDimension.XX_LARGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdDimension     // Catch:{ NoSuchFieldError -> 0x001d }
                com.smaato.sdk.core.ad.AdDimension r1 = com.smaato.sdk.core.p378ad.AdDimension.X_LARGE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdDimension     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.smaato.sdk.core.ad.AdDimension r1 = com.smaato.sdk.core.p378ad.AdDimension.LARGE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdDimension     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.smaato.sdk.core.ad.AdDimension r1 = com.smaato.sdk.core.p378ad.AdDimension.MEDIUM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdDimension     // Catch:{ NoSuchFieldError -> 0x003e }
                com.smaato.sdk.core.ad.AdDimension r1 = com.smaato.sdk.core.p378ad.AdDimension.SMALL     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdDimension     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.smaato.sdk.core.ad.AdDimension r1 = com.smaato.sdk.core.p378ad.AdDimension.MEDIUM_RECTANGLE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdDimension     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.smaato.sdk.core.ad.AdDimension r1 = com.smaato.sdk.core.p378ad.AdDimension.SKYSCRAPER     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdDimension     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.smaato.sdk.core.ad.AdDimension r1 = com.smaato.sdk.core.p378ad.AdDimension.LEADERBOARD     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdDimension     // Catch:{ NoSuchFieldError -> 0x006c }
                com.smaato.sdk.core.ad.AdDimension r1 = com.smaato.sdk.core.p378ad.AdDimension.FULLSCREEN_PORTRAIT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdDimension     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.smaato.sdk.core.ad.AdDimension r1 = com.smaato.sdk.core.p378ad.AdDimension.FULLSCREEN_LANDSCAPE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdDimension     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.smaato.sdk.core.ad.AdDimension r1 = com.smaato.sdk.core.p378ad.AdDimension.FULLSCREEN_PORTRAIT_TABLET     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdDimension     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.smaato.sdk.core.ad.AdDimension r1 = com.smaato.sdk.core.p378ad.AdDimension.FULLSCREEN_LANDSCAPE_TABLET     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.p378ad.AdRequestMapper.C109421.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public String mapToApiValue(AdDimension adDimension) {
        switch (C109421.$SwitchMap$com$smaato$sdk$core$ad$AdDimension[adDimension.ordinal()]) {
            case 1:
                return "xxlarge";
            case 2:
                return Constants.XLARGE;
            case 3:
                return Constants.LARGE;
            case 4:
                return "medium";
            case 5:
                return Constants.SMALL;
            case 6:
                return "medrect";
            case 7:
                return "sky";
            case 8:
                return "leader";
            case 9:
                return "full_320x480";
            case 10:
                return "full_480x320";
            case 11:
                return "full_768x1024";
            case 12:
                return "full_1024x768";
            default:
                throw new IllegalArgumentException(String.format("Unexpected %s: %s", new Object[]{AdDimension.class.getSimpleName(), adDimension}));
        }
    }

    /* renamed from: com.smaato.sdk.core.ad.AdRequestMapper$UnresolvedServerAdFormatException */
    static final class UnresolvedServerAdFormatException extends RuntimeException {
        UnresolvedServerAdFormatException() {
        }
    }
}
