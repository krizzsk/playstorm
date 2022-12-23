package com.smaato.sdk.richmedia.util;

import android.content.Context;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidEnvironmentProperties;

public final class RichMediaHtmlUtils {
    private final boolean loggingEnabled;

    public RichMediaHtmlUtils(Boolean bool) {
        this.loggingEnabled = ((Boolean) Objects.requireNonNull(bool)).booleanValue();
    }

    public String createHtml(String str, Context context, MraidEnvironmentProperties mraidEnvironmentProperties) {
        Objects.requireNonNull(str);
        Objects.requireNonNull(context);
        Objects.requireNonNull(mraidEnvironmentProperties);
        return "<!DOCTYPE html><html style='margin: 0px; padding: 0px; width: 100%; height: 100%;'><head><meta name='viewport' content='initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no'/><style>body {margin: 0px; min-height: 100%%; position: relative; padding: 0px; width: 100%%; height: 100%%;}</style><script src=\"file:///android_asset/mraid.js\"></script><script>" + getMraidEnvironmentDetails(mraidEnvironmentProperties) + "</script></head><body><script src=\"file:///android_asset/omsdk-v1.js\"></script>" + str.replaceAll("mraid.js", "file:///android_asset/mraid.js") + "</body></html>";
    }

    private String getMraidEnvironmentDetails(MraidEnvironmentProperties mraidEnvironmentProperties) {
        StringBuilder sb = new StringBuilder();
        sb.append("window.MRAID_ENV = {\n");
        sb.append(String.format("version:'%s',\n", new Object[]{MraidEnvironmentProperties.VERSION}));
        sb.append(String.format("sdk: '%s',\n", new Object[]{MraidEnvironmentProperties.SDK}));
        sb.append(String.format("sdkVersion: '%s',\n", new Object[]{mraidEnvironmentProperties.sdkVersion}));
        sb.append(String.format("appId: '%s',\n", new Object[]{mraidEnvironmentProperties.appId}));
        Objects.onNotNull(mraidEnvironmentProperties.googleAdId, new Consumer(sb) {
            public final /* synthetic */ StringBuilder f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.append(String.format("ifa: '%s',\n", new Object[]{(String) obj}));
            }
        });
        Objects.onNotNull(mraidEnvironmentProperties.googleDnt, new Consumer(sb) {
            public final /* synthetic */ StringBuilder f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.append(String.format("limitAdTracking: %b,\n", new Object[]{(Boolean) obj}));
            }
        });
        Objects.onNotNull(mraidEnvironmentProperties.coppa, new Consumer(sb) {
            public final /* synthetic */ StringBuilder f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                RichMediaHtmlUtils.lambda$getMraidEnvironmentDetails$2(this.f$0, (Integer) obj);
            }
        });
        sb.append("};");
        return sb.toString();
    }

    static /* synthetic */ void lambda$getMraidEnvironmentDetails$2(StringBuilder sb, Integer num) {
        boolean z = true;
        Object[] objArr = new Object[1];
        if (num.intValue() != 1) {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        sb.append(String.format("coppa: %b,\n", objArr));
    }

    public boolean isLoggingEnabled() {
        return this.loggingEnabled;
    }
}
