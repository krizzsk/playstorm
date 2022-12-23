package com.smaato.sdk.core.browser;

import android.app.Application;
import android.content.ClipboardManager;
import android.webkit.CookieManager;
import com.smaato.sdk.core.linkhandler.LinkHandler;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.network.UrlCreator;
import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.core.p379di.DiRegistry;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.webview.DiWebViewLayer;

public final class DiBrowserLayer {
    private DiBrowserLayer() {
    }

    public static DiRegistry createRegistry() {
        return DiRegistry.m32956of($$Lambda$DiBrowserLayer$0pdorI6_yUnFA697NyX04olySEY.INSTANCE);
    }

    static /* synthetic */ void lambda$createRegistry$6(DiRegistry diRegistry) {
        diRegistry.registerFactory(CookieSyncManagerHolder.class, $$Lambda$DiBrowserLayer$fldXIZLU94GqmZb1SRDpu1gvT6k.INSTANCE);
        diRegistry.registerFactory(ClipboardManager.class, $$Lambda$DiBrowserLayer$WasbP0rK9S4vFjB9Bd5F1rwos_s.INSTANCE);
        diRegistry.registerFactory(CookieManager.class, $$Lambda$DiBrowserLayer$ckWA2yDOQr9t02L_xS2yYkrdT70.INSTANCE);
        diRegistry.registerFactory(SmaatoCookieManager.class, $$Lambda$DiBrowserLayer$25R3U6II4A51n0QIcAMcvsltfcY.INSTANCE);
        diRegistry.registerFactory(BrowserModel.class, $$Lambda$DiBrowserLayer$7KCHuwf9o2KBNRNDXDm8EbmzM9M.INSTANCE);
        diRegistry.registerFactory(BrowserPresenter.class, $$Lambda$DiBrowserLayer$DTo1sFWRHZ_iGDw43J4NqQT9kk.INSTANCE);
    }

    static /* synthetic */ CookieSyncManagerHolder lambda$createRegistry$0(DiConstructor diConstructor) {
        return new CookieSyncManagerHolder((Application) diConstructor.get(Application.class));
    }

    static /* synthetic */ ClipboardManager lambda$createRegistry$1(DiConstructor diConstructor) {
        return (ClipboardManager) Objects.requireNonNull((ClipboardManager) ((Application) diConstructor.get(Application.class)).getSystemService("clipboard"));
    }

    static /* synthetic */ SmaatoCookieManager lambda$createRegistry$3(DiConstructor diConstructor) {
        return new SmaatoCookieManager((CookieManager) diConstructor.get(CookieManager.class), (CookieSyncManagerHolder) diConstructor.get(CookieSyncManagerHolder.class));
    }

    static /* synthetic */ BrowserModel lambda$createRegistry$4(DiConstructor diConstructor) {
        return new BrowserModel(DiLogLayer.getLoggerFrom(diConstructor), DiWebViewLayer.getBaseWebViewClientFrom(diConstructor), DiWebViewLayer.getBaseWebChromeClientFrom(diConstructor), (SmaatoCookieManager) diConstructor.get(SmaatoCookieManager.class));
    }

    static /* synthetic */ BrowserPresenter lambda$createRegistry$5(DiConstructor diConstructor) {
        return new BrowserPresenter(DiLogLayer.getLoggerFrom(diConstructor), (BrowserModel) diConstructor.get(BrowserModel.class), (UrlCreator) diConstructor.get(UrlCreator.class), (LinkHandler) diConstructor.get(LinkHandler.class), (ClipboardManager) diConstructor.get(ClipboardManager.class));
    }
}
