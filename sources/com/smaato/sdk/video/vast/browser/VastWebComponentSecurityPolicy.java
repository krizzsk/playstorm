package com.smaato.sdk.video.vast.browser;

import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.UrlCreator;
import com.smaato.sdk.core.util.Objects;

public class VastWebComponentSecurityPolicy {
    private final String baseUrl;
    private final Boolean isHttpsOnly;
    private final Logger logger;
    private final UrlCreator urlCreator;

    public VastWebComponentSecurityPolicy(Logger logger2, String str, UrlCreator urlCreator2, Boolean bool) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.baseUrl = (String) Objects.requireNonNull(str);
        this.urlCreator = (UrlCreator) Objects.requireNonNull(urlCreator2);
        this.isHttpsOnly = bool;
    }

    public boolean validateUrl(String str) {
        if (!this.urlCreator.isSupportedForNetworking(str)) {
            return true;
        }
        String extractScheme = this.urlCreator.extractScheme(str);
        boolean z = this.urlCreator.isSecureScheme(extractScheme) || (this.urlCreator.isInsecureScheme(extractScheme) && !this.isHttpsOnly.booleanValue());
        if (!z) {
            this.logger.error(LogDomain.VAST, "Invalid url or violation of httpsOnly rule: Url: %s , isHttpsOnly: %s", str, this.isHttpsOnly);
        }
        return z;
    }
}
