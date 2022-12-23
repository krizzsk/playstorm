package com.smaato.sdk.core.webview;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.core.webview.BaseWebChromeClient;

public class BaseWebChromeClient extends WebChromeClient {
    private WebChromeClientCallback webChromeClientCallback;

    public interface WebChromeClientCallback {
        void onProgressChanged(int i);
    }

    public void setWebChromeClientCallback(WebChromeClientCallback webChromeClientCallback2) {
        this.webChromeClientCallback = webChromeClientCallback2;
    }

    public void onProgressChanged(WebView webView, int i) {
        Objects.onNotNull(this.webChromeClientCallback, new Consumer(i) {
            public final /* synthetic */ int f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((BaseWebChromeClient.WebChromeClientCallback) obj).onProgressChanged(this.f$0);
            }
        });
    }
}
