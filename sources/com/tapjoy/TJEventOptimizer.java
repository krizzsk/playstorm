package com.tapjoy;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.tapjoy.TapjoyErrorMessage;
import java.util.concurrent.CountDownLatch;

public class TJEventOptimizer extends WebView {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static String f27396a = "TJEventOptimizer";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static TJEventOptimizer f27397b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static CountDownLatch f27398c;

    /* renamed from: d */
    private Context f27399d;

    /* renamed from: e */
    private TJAdUnitJSBridge f27400e;

    /* synthetic */ TJEventOptimizer(Context context, byte b) {
        this(context);
    }

    private TJEventOptimizer(Context context) {
        super(context);
        this.f27399d = context;
        this.f27400e = new TJAdUnitJSBridge(this.f27399d, (WebView) this);
        try {
            getSettings().setJavaScriptEnabled(true);
            setWebViewClient(new C11385b(this, (byte) 0));
            setWebChromeClient(new C11384a(this, (byte) 0));
            loadUrl(TapjoyConnectCore.getHostURL() + TJAdUnitConstants.EVENTS_PROXY_PATH + TapjoyUtil.convertURLParams(TapjoyConnectCore.getGenericURLParams(), true));
        } catch (Exception e) {
            TapjoyLog.m33199w(f27396a, e.getMessage());
        }
    }

    public static void init(final Context context) {
        TapjoyLog.m33194d(f27396a, "Initializing event optimizer");
        f27398c = new CountDownLatch(1);
        TapjoyUtil.runOnMainThread(new Runnable() {
            public final void run() {
                try {
                    TJEventOptimizer unused = TJEventOptimizer.f27397b = new TJEventOptimizer(context, (byte) 0);
                } catch (Exception e) {
                    TapjoyLog.m33199w(TJEventOptimizer.f27396a, e.getMessage());
                }
                TJEventOptimizer.f27398c.countDown();
            }
        });
        f27398c.await();
        if (f27397b == null) {
            throw new RuntimeException("Failed to init TJEventOptimizer");
        }
    }

    public static TJEventOptimizer getInstance() {
        return f27397b;
    }

    /* renamed from: com.tapjoy.TJEventOptimizer$b */
    class C11385b extends WebViewClient {
        private C11385b() {
        }

        /* synthetic */ C11385b(TJEventOptimizer tJEventOptimizer, byte b) {
            this();
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            TapjoyLog.m33195e(TJEventOptimizer.f27396a, new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Error encountered when instantiating a WebViewClient"));
        }

        public final void onPageFinished(WebView webView, String str) {
            TapjoyLog.m33194d(TJEventOptimizer.f27396a, "boostrap html loaded successfully");
        }

        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (TJEventOptimizer.f27397b != null) {
                ViewGroup viewGroup = (ViewGroup) TJEventOptimizer.f27397b.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(TJEventOptimizer.f27397b);
                }
                TJEventOptimizer.f27397b.destroy();
                TJEventOptimizer unused = TJEventOptimizer.f27397b = null;
            }
            TapjoyLog.m33195e(TJEventOptimizer.f27396a, new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "WebView rendering process exited while instantiating a WebViewClient unexpectedly"));
            return true;
        }
    }

    /* renamed from: com.tapjoy.TJEventOptimizer$a */
    class C11384a extends WebChromeClient {
        private C11384a() {
        }

        /* synthetic */ C11384a(TJEventOptimizer tJEventOptimizer, byte b) {
            this();
        }

        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            String a = TJEventOptimizer.f27396a;
            TapjoyLog.m33194d(a, "JS CONSOLE: " + consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
            return true;
        }
    }
}
