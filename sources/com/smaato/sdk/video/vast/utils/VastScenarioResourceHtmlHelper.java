package com.smaato.sdk.video.vast.utils;

import android.webkit.URLUtil;
import com.smaato.sdk.video.vast.model.StaticResource;
import java.util.Locale;

final class VastScenarioResourceHtmlHelper {
    static String wrapStaticResourceWithSizeIntoHtml(StaticResource staticResource, String str, String str2) {
        StaticResource.CreativeType creativeType = staticResource.creativeType;
        if (!URLUtil.isValidUrl(staticResource.uri)) {
            return "";
        }
        int i = C113141.f27186xf02e4b7d[creativeType.ordinal()];
        if (i == 1) {
            return String.format(Locale.US, "<html><head></head><body style=\"margin:0;padding:0;-webkit-tap-highlight-color: rgba(0, 0, 0, 0);\"><img src=\"%1$s\" width=\"100%%\" style=\"max-width:100%%;max-height:100%%;\" /></body></html>", new Object[]{staticResource.uri});
        } else if (i == 2) {
            return String.format(Locale.US, "<script src=\"%1$s\"></script>", new Object[]{staticResource.uri});
        } else if (i != 3) {
            return "";
        } else {
            return String.format(Locale.US, "<html><head></head><body style=\"margin:0;padding:0;-webkit-tap-highlight-color: rgba(0, 0, 0, 0);\">%1$s</body></html>", new Object[]{staticResource.uri});
        }
    }

    /* renamed from: com.smaato.sdk.video.vast.utils.VastScenarioResourceHtmlHelper$1 */
    static /* synthetic */ class C113141 {

        /* renamed from: $SwitchMap$com$smaato$sdk$video$vast$model$StaticResource$CreativeType */
        static final /* synthetic */ int[] f27186xf02e4b7d;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.smaato.sdk.video.vast.model.StaticResource$CreativeType[] r0 = com.smaato.sdk.video.vast.model.StaticResource.CreativeType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27186xf02e4b7d = r0
                com.smaato.sdk.video.vast.model.StaticResource$CreativeType r1 = com.smaato.sdk.video.vast.model.StaticResource.CreativeType.IMAGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27186xf02e4b7d     // Catch:{ NoSuchFieldError -> 0x001d }
                com.smaato.sdk.video.vast.model.StaticResource$CreativeType r1 = com.smaato.sdk.video.vast.model.StaticResource.CreativeType.JAVASCRIPT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27186xf02e4b7d     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.smaato.sdk.video.vast.model.StaticResource$CreativeType r1 = com.smaato.sdk.video.vast.model.StaticResource.CreativeType.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.video.vast.utils.VastScenarioResourceHtmlHelper.C113141.<clinit>():void");
        }
    }

    static String wrapHtmlResourceWithSizeIntoHtml(String str, String str2, String str3) {
        return String.format(Locale.US, "<html><head></head><body style=\"margin:0;padding:0;-webkit-tap-highlight-color: rgba(0, 0, 0, 0);\">%1$s</body></html>", new Object[]{str});
    }

    static String wrapIFrameResourceWithSizeIntoHtml(String str, String str2, String str3) {
        return String.format(Locale.US, "<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border:0px;margin:0;padding:0\" width=\"%1$s\" height=\"%2$s\" src=\"%3$s\"></iframe>", new Object[]{str2, str3, str});
    }
}
