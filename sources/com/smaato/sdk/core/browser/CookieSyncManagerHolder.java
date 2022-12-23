package com.smaato.sdk.core.browser;

import android.app.Application;
import android.os.Build;
import android.webkit.CookieSyncManager;

public final class CookieSyncManagerHolder {
    private final CookieSyncManager cookieSyncManager;

    public CookieSyncManagerHolder(Application application) {
        if (Build.VERSION.SDK_INT < 21) {
            this.cookieSyncManager = CookieSyncManager.createInstance(application);
        } else {
            this.cookieSyncManager = null;
        }
    }

    public CookieSyncManager getCookieSyncManager() {
        return this.cookieSyncManager;
    }
}
