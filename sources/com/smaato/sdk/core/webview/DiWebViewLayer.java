package com.smaato.sdk.core.webview;

import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.core.p379di.DiRegistry;

public final class DiWebViewLayer {
    private DiWebViewLayer() {
    }

    public static DiRegistry createRegistry() {
        return DiRegistry.m32956of($$Lambda$DiWebViewLayer$e2_U8Bj31iwiNmmNRxx0bFlgvoE.INSTANCE);
    }

    static /* synthetic */ void lambda$createRegistry$2(DiRegistry diRegistry) {
        diRegistry.registerFactory(BaseWebViewClient.class, $$Lambda$DiWebViewLayer$zP45ZxnC_7ReyhwUAxZBAYFdbuE.INSTANCE);
        diRegistry.registerFactory(BaseWebChromeClient.class, $$Lambda$DiWebViewLayer$PNtCdB9ARQHOMiaRYO_qE9dKAz0.INSTANCE);
    }

    static /* synthetic */ BaseWebViewClient lambda$createRegistry$0(DiConstructor diConstructor) {
        return new BaseWebViewClient();
    }

    static /* synthetic */ BaseWebChromeClient lambda$createRegistry$1(DiConstructor diConstructor) {
        return new BaseWebChromeClient();
    }

    public static BaseWebViewClient getBaseWebViewClientFrom(DiConstructor diConstructor) {
        return (BaseWebViewClient) diConstructor.get(BaseWebViewClient.class);
    }

    public static BaseWebChromeClient getBaseWebChromeClientFrom(DiConstructor diConstructor) {
        return (BaseWebChromeClient) diConstructor.get(BaseWebChromeClient.class);
    }
}
