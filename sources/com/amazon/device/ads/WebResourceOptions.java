package com.amazon.device.ads;

class WebResourceOptions {
    private static String cdnHost = null;
    private static String[] jsNames = {"aps-mraid.js", "dtb-m.js", "omsdk-v1.js"};
    private static boolean useLocalOnly = false;

    WebResourceOptions() {
    }

    static void setCDNHost(String str) {
        if (!str.equals(cdnHost) && cdnHost != null) {
            cdnHost = str;
            DtbSharedPreferences.getInstance().resetWebResoucesLastPing();
            WebResourceService.getInstance().deleteWebDirContent();
        }
    }

    static String getCDNHost(String str) {
        String str2 = cdnHost;
        if (str2 == null) {
            str2 = "c.amazon-adsystem.com/";
        }
        if ("omsdk-v1.js".equals(str)) {
            str2 = "dcqi4aodgg8tv.cloudfront.net/resources/omsdk/1_3_28";
        }
        if (str2.endsWith("/")) {
            return str2;
        }
        return str2 + "/";
    }

    static void setCDNResources(String[] strArr) {
        jsNames = strArr;
    }

    static String[] getCDNResources() {
        return jsNames;
    }

    static void setLocalSourcesOnly(boolean z) {
        useLocalOnly = z;
    }

    static boolean isLocalSourcesOnly() {
        return useLocalOnly;
    }
}
