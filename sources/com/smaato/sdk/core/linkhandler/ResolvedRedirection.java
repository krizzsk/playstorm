package com.smaato.sdk.core.linkhandler;

public class ResolvedRedirection {
    boolean lastRedirectionFailed;
    String url;

    public ResolvedRedirection(String str) {
        this.url = str;
    }

    public ResolvedRedirection(String str, boolean z) {
        this.url = str;
        this.lastRedirectionFailed = z;
    }
}
