package com.smaato.sdk.core.browser;

import android.content.Intent;

public interface BrowserView {
    void closeBrowser();

    void hideProgressIndicator();

    void launchExternalBrowser(Intent intent);

    void redirectToExternalApp(Intent intent);

    void setPageNavigationBackEnabled(boolean z);

    void setPageNavigationForwardEnabled(boolean z);

    void showConnectionSecure(boolean z);

    void showHostname(String str);

    void showProgressIndicator();

    void updateProgressIndicator(int i);
}
