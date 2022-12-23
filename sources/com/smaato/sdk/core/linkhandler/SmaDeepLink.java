package com.smaato.sdk.core.linkhandler;

import android.net.Uri;
import java.util.List;

public class SmaDeepLink {
    public static final String SMAATO_DEEPLINK_SCHEME = "smadl";
    public List<String> fallbackTrackerUrls;
    public String fallbackUrl;
    public List<String> primaryTrackerUrls;
    public String primaryUrl;

    public SmaDeepLink(String str) {
        Uri parse = Uri.parse(str);
        if (parse == null || !SMAATO_DEEPLINK_SCHEME.equals(parse.getScheme()) || !"navigate".equals(parse.getHost())) {
            throw new IllegalArgumentException("Smaato Deeplink should start with smadl://navigate?");
        }
        List<String> queryParameters = parse.getQueryParameters("primaryUrl");
        List<String> queryParameters2 = parse.getQueryParameters("fallbackUrl");
        if (queryParameters.size() != 1) {
            throw new IllegalArgumentException("Smaato Deeplink must contain exactly one primaryUrl");
        } else if (queryParameters2.size() <= 1) {
            this.primaryUrl = queryParameters.get(0);
            if (queryParameters2.size() > 0) {
                this.fallbackUrl = queryParameters2.get(0);
            }
            this.primaryTrackerUrls = parse.getQueryParameters("primaryTracker");
            this.fallbackTrackerUrls = parse.getQueryParameters("fallbackTracker");
        } else {
            throw new IllegalArgumentException("Smaato Deeplink can contain at most one fallbackUrl");
        }
    }
}
