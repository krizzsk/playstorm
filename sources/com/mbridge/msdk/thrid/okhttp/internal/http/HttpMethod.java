package com.mbridge.msdk.thrid.okhttp.internal.http;

import androidx.browser.trusted.sharing.ShareTarget;
import com.ironsource.mediationsdk.config.VersionInfo;

public final class HttpMethod {
    public static boolean invalidatesCache(String str) {
        return str.equals(ShareTarget.METHOD_POST) || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    public static boolean requiresRequestBody(String str) {
        return str.equals(ShareTarget.METHOD_POST) || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }

    public static boolean permitsRequestBody(String str) {
        return !str.equals(ShareTarget.METHOD_GET) && !str.equals(VersionInfo.GIT_BRANCH);
    }

    public static boolean redirectsWithBody(String str) {
        return str.equals("PROPFIND");
    }

    public static boolean redirectsToGet(String str) {
        return !str.equals("PROPFIND");
    }

    private HttpMethod() {
    }
}
