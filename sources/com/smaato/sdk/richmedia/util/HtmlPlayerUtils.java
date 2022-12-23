package com.smaato.sdk.richmedia.util;

import com.adjust.sdk.Constants;
import com.smaato.sdk.core.flow.Flow;
import com.smaato.sdk.core.flow.Function1;
import com.smaato.sdk.core.p378ad.AdDimension;
import com.smaato.sdk.richmedia.p387ad.RichMediaAdObject;
import kotlin.text.Typography;

public class HtmlPlayerUtils {
    private static final AdDimension DEFAULT_AD_DIMENSION = AdDimension.MEDIUM_RECTANGLE;
    private final OutstreamAdTemplateResourceCache outstreamAdTemplateResourceCache;

    private String wrapIntoRichMediaForNativeVideo(String str) {
        return str;
    }

    public HtmlPlayerUtils(OutstreamAdTemplateResourceCache outstreamAdTemplateResourceCache2) {
        this.outstreamAdTemplateResourceCache = outstreamAdTemplateResourceCache2;
    }

    public Flow<String> vastToRichMedia(String str, int i, int i2) {
        return this.outstreamAdTemplateResourceCache.get().map(new Function1(str, i, i2) {
            public final /* synthetic */ String f$1;
            public final /* synthetic */ int f$2;
            public final /* synthetic */ int f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final Object apply(Object obj) {
                return HtmlPlayerUtils.this.lambda$vastToRichMedia$0$HtmlPlayerUtils(this.f$1, this.f$2, this.f$3, (String) obj);
            }
        });
    }

    public /* synthetic */ String lambda$vastToRichMedia$0$HtmlPlayerUtils(String str, int i, int i2, String str2) throws Throwable {
        return wrapIntoRichMediaResponse(str2.replace("$$$vast$$$", str), i, i2);
    }

    public String vastToRichMediaForNativeVideo(String str) {
        return wrapIntoRichMediaForNativeVideo(this.outstreamAdTemplateResourceCache.getBlocking().replace("$$$vast$$$", str));
    }

    public AdDimension getAdDimension(String str) {
        if (str == null) {
            return DEFAULT_AD_DIMENSION;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1762874990:
                if (str.equals("full_1024x768")) {
                    c = 0;
                    break;
                }
                break;
            case -1630467013:
                if (str.equals("xxlarge")) {
                    c = 1;
                    break;
                }
                break;
            case -1106754295:
                if (str.equals("leader")) {
                    c = 2;
                    break;
                }
                break;
            case -1078030475:
                if (str.equals("medium")) {
                    c = 3;
                    break;
                }
                break;
            case -756726333:
                if (str.equals(Constants.XLARGE)) {
                    c = 4;
                    break;
                }
                break;
            case 113953:
                if (str.equals("sky")) {
                    c = 5;
                    break;
                }
                break;
            case 102742843:
                if (str.equals(Constants.LARGE)) {
                    c = 6;
                    break;
                }
                break;
            case 109548807:
                if (str.equals(Constants.SMALL)) {
                    c = 7;
                    break;
                }
                break;
            case 667133493:
                if (str.equals("full_320x480")) {
                    c = 8;
                    break;
                }
                break;
            case 941046192:
                if (str.equals("medrect")) {
                    c = 9;
                    break;
                }
                break;
            case 1366559536:
                if (str.equals("full_768x1024")) {
                    c = 10;
                    break;
                }
                break;
            case 1726410933:
                if (str.equals("full_480x320")) {
                    c = 11;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return AdDimension.FULLSCREEN_LANDSCAPE_TABLET;
            case 1:
                return AdDimension.XX_LARGE;
            case 2:
                return AdDimension.LEADERBOARD;
            case 3:
                return AdDimension.MEDIUM;
            case 4:
                return AdDimension.X_LARGE;
            case 5:
                return AdDimension.SKYSCRAPER;
            case 6:
                return AdDimension.LARGE;
            case 7:
                return AdDimension.SMALL;
            case 8:
                return AdDimension.FULLSCREEN_PORTRAIT;
            case 9:
                return AdDimension.MEDIUM_RECTANGLE;
            case 10:
                return AdDimension.FULLSCREEN_PORTRAIT_TABLET;
            case 11:
                return AdDimension.FULLSCREEN_LANDSCAPE;
            default:
                return DEFAULT_AD_DIMENSION;
        }
    }

    private String wrapIntoRichMediaResponse(String str, int i, int i2) {
        return String.format("{\n\"richmedia\": {\n\"mediadata\": {\n\"content\": \"%s\",\n\"w\": " + i + ",\n\"h\": " + i2 + "\n},\n\"impressiontrackers\": [\"%s\"],\n\"clicktrackers\": [\"%s\"]\n}}", new Object[]{str.replace(Typography.quote, '\'').replace(10, ' '), RichMediaAdObject.IGNORE_URL, RichMediaAdObject.IGNORE_URL});
    }
}
