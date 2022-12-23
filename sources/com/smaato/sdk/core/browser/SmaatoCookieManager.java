package com.smaato.sdk.core.browser;

import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p382fi.Consumer;

public class SmaatoCookieManager {
    private final CookieManager cookieManager;
    private final CookieSyncManagerHolder cookieSyncManagerHolder;

    public SmaatoCookieManager(CookieManager cookieManager2, CookieSyncManagerHolder cookieSyncManagerHolder2) {
        this.cookieManager = (CookieManager) Objects.requireNonNull(cookieManager2, "Parameter cookieManager cannot be null for SmaatoCookieManager::new");
        this.cookieSyncManagerHolder = (CookieSyncManagerHolder) Objects.requireNonNull(cookieSyncManagerHolder2, "Parameter cookieSyncManagerHolder cannot be null for SmaatoCookieManager::new");
    }

    public void setupCookiePolicy(WebView webView) {
        Objects.requireNonNull(webView, "Parameter webView cannot be null for SmaatoCookieManager::setupCookiePolicy");
        if (Build.VERSION.SDK_INT >= 21) {
            this.cookieManager.setAcceptThirdPartyCookies(webView, true);
        }
    }

    public void forceCookieSync() {
        if (Build.VERSION.SDK_INT < 21) {
            callOnCookieSyncManager($$Lambda$SmaatoCookieManager$3mY5KtXw7WSTiZjpr5J4GiRUs4w.INSTANCE);
        } else {
            this.cookieManager.flush();
        }
    }

    public void startSync() {
        if (Build.VERSION.SDK_INT < 21) {
            callOnCookieSyncManager($$Lambda$SmaatoCookieManager$mIJ4sY492qGdEvdQ5h6015vXGI.INSTANCE);
        }
    }

    public void stopSync() {
        if (Build.VERSION.SDK_INT < 21) {
            callOnCookieSyncManager($$Lambda$SmaatoCookieManager$o5NiJHDCL25JDPEJdVszPKwKNQ.INSTANCE);
        }
    }

    private void callOnCookieSyncManager(Consumer<CookieSyncManager> consumer) {
        CookieSyncManager cookieSyncManager = this.cookieSyncManagerHolder.getCookieSyncManager();
        if (cookieSyncManager != null) {
            consumer.accept(cookieSyncManager);
            return;
        }
        throw new IllegalStateException("CookieSyncManager is expected to be present on API < 21");
    }
}
