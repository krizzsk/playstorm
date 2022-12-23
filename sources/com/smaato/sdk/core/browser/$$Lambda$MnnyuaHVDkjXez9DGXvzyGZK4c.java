package com.smaato.sdk.core.browser;

import android.webkit.WebView;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.core.webview.WebViewHelperUtil;

/* renamed from: com.smaato.sdk.core.browser.-$$Lambda$MnnyuaHVDkjXez9DGXvzyGZK-4c  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$MnnyuaHVDkjXez9DGXvzyGZK4c implements Consumer {
    public static final /* synthetic */ $$Lambda$MnnyuaHVDkjXez9DGXvzyGZK4c INSTANCE = new $$Lambda$MnnyuaHVDkjXez9DGXvzyGZK4c();

    private /* synthetic */ $$Lambda$MnnyuaHVDkjXez9DGXvzyGZK4c() {
    }

    public final void accept(Object obj) {
        WebViewHelperUtil.resetAndDestroyWebViewSafely((WebView) obj);
    }
}
