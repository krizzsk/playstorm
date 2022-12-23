package com.tapjoy;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.VideoView;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import com.tapjoy.TJAdUnitJSBridge;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.internal.C11636fo;
import com.tapjoy.internal.C11656ga;
import com.tapjoy.internal.C11676gi;
import com.tapjoy.internal.C11745hx;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import org.json.JSONObject;

public class TJAdUnit implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener {

    /* renamed from: a */
    public static TJVideoListener f27199a;

    /* renamed from: A */
    private int f27200A = -1;

    /* renamed from: B */
    private int f27201B;

    /* renamed from: C */
    private int f27202C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f27203D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public boolean f27204E;

    /* renamed from: F */
    private C11636fo f27205F;

    /* renamed from: G */
    private C11656ga f27206G;

    /* renamed from: H */
    private final Runnable f27207H = new Runnable() {
        public final void run() {
            int streamVolume = TJAdUnit.this.f27226p.getStreamVolume(3);
            if (TJAdUnit.this.f27227q != streamVolume) {
                int unused = TJAdUnit.this.f27227q = streamVolume;
                TJAdUnit.this.f27217g.onVolumeChanged();
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: I */
    public final Runnable f27208I = new Runnable() {
        public final void run() {
            if (TJAdUnit.this.f27212b.getCurrentPosition() != 0) {
                if (!TJAdUnit.this.f27223m) {
                    boolean unused = TJAdUnit.this.f27223m = true;
                }
                TJAdUnit.this.f27217g.onVideoStarted(TJAdUnit.this.f27221k);
                TJAdUnit.this.f27209J.run();
            } else if (!TJAdUnit.this.f27203D) {
                TJAdUnit.this.f27213c.postDelayed(TJAdUnit.this.f27208I, 200);
            } else {
                boolean unused2 = TJAdUnit.this.f27204E = true;
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: J */
    public final Runnable f27209J = new Runnable() {
        public final void run() {
            TJAdUnit.this.f27217g.onVideoProgress(TJAdUnit.this.f27212b.getCurrentPosition());
            TJAdUnit.this.f27213c.postDelayed(TJAdUnit.this.f27209J, 500);
        }
    };

    /* renamed from: K */
    private WebViewClient f27210K = new WebViewClient() {
        public final void onLoadResource(WebView webView, String str) {
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return m33046a(str);
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return m33046a(webResourceRequest.getUrl().toString());
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            TapjoyLog.m33194d("TJAdUnit", "onPageStarted: ".concat(String.valueOf(str)));
            if (TJAdUnit.this.f27217g != null) {
                TJAdUnit.this.f27217g.allowRedirect = true;
                TJAdUnit.this.f27217g.customClose = false;
                TJAdUnit.this.f27217g.closeRequested = false;
                TJAdUnit.this.m33011b();
            }
        }

        public final void onPageFinished(WebView webView, String str) {
            TapjoyLog.m33194d("TJAdUnit", "onPageFinished: ".concat(String.valueOf(str)));
            if (TJAdUnit.this.f27216f != null) {
                TJAdUnit.this.f27216f.setProgressSpinnerVisibility(false);
            }
            boolean unused = TJAdUnit.this.f27236z = true;
            if (TJAdUnit.this.f27232v) {
                TJAdUnit.this.m33006a();
            }
            if (TJAdUnit.this.f27217g != null) {
                TJAdUnit.this.f27217g.flushMessageQueue();
            }
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            TapjoyLog.m33194d("TJAdUnit", "error:".concat(String.valueOf(str)));
            if (TJAdUnit.this.f27216f != null) {
                TJAdUnit.this.f27216f.showErrorDialog();
            }
            if (TJAdUnit.this.getSdkBeacon() != null) {
                TJAdUnit.this.getSdkBeacon().mo72531a("loadFailure");
            }
            super.onReceivedError(webView, i, str, str2);
        }

        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            TapjoyLog.m33195e("TJAdUnit", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "WebView rendering process exited while instantiating a WebViewClient unexpectedly"));
            if (TJAdUnit.this.getSdkBeacon() != null) {
                TJAdUnit.this.getSdkBeacon().mo72531a("terminated");
            }
            if (TJAdUnit.this.f27212b != null && (TJAdUnit.this.f27223m || TJAdUnit.this.f27212b.getDuration() > 0)) {
                boolean unused = TJAdUnit.this.f27223m = false;
                boolean unused2 = TJAdUnit.this.f27222l = true;
                TJAdUnit.this.fireOnVideoError("WebView loading while trying to play video.");
            }
            if (TJAdUnit.this.f27218h != null) {
                ViewGroup viewGroup = (ViewGroup) TJAdUnit.this.f27218h.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(TJAdUnit.this.f27218h);
                }
                TJAdUnit.this.f27218h.removeAllViews();
                TJAdUnit.this.f27218h.destroy();
                TJWebView unused3 = TJAdUnit.this.f27218h = null;
            }
            if (TJAdUnit.this.f27219i != null) {
                ViewGroup viewGroup2 = (ViewGroup) TJAdUnit.this.f27219i.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(TJAdUnit.this.f27219i);
                }
                TJAdUnit.this.f27219i.removeAllViews();
                TJAdUnit.this.f27219i.destroy();
                TJWebView unused4 = TJAdUnit.this.f27219i = null;
            }
            if (TJAdUnit.this.f27217g != null) {
                TJAdUnit.this.f27217g.cleanUpJSBridge();
                TJAdUnitJSBridge unused5 = TJAdUnit.this.f27217g = null;
            }
            if (TJAdUnit.this.f27216f != null) {
                TJAdUnit.this.f27216f.finish();
            }
            return true;
        }

        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            TapjoyCachedAssetData cachedDataForURL;
            WebResourceResponse a;
            if (TapjoyCache.getInstance() == null || (cachedDataForURL = TapjoyCache.getInstance().getCachedDataForURL(str)) == null || (a = m33045a(cachedDataForURL)) == null) {
                return super.shouldInterceptRequest(webView, str);
            }
            TapjoyLog.m33194d("TJAdUnit", "Reading request for " + str + " from cache -- localPath: " + cachedDataForURL.getLocalFilePath());
            return a;
        }

        /* renamed from: a */
        private boolean m33046a(String str) {
            if (!TJAdUnit.this.m33024f() || !URLUtil.isValidUrl(str)) {
                if (TJAdUnit.this.f27216f != null) {
                    TJAdUnit.this.f27216f.showErrorDialog();
                }
                return true;
            } else if (TJAdUnit.m33014b(str)) {
                return false;
            } else {
                if (TJAdUnit.this.f27217g.allowRedirect) {
                    Uri parse = Uri.parse(str);
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.VIEW");
                    intent.setData(parse);
                    intent.addFlags(268435456);
                    if (TJAdUnit.this.f27219i.getContext() != null) {
                        try {
                            TJAdUnit.this.f27219i.getContext().startActivity(intent);
                            return true;
                        } catch (Exception e) {
                            TapjoyLog.m33196e("TJAdUnit", "Exception in loading URL. " + e.getMessage());
                        }
                    }
                } else if (str.startsWith("javascript:") && Build.VERSION.SDK_INT >= 19) {
                    try {
                        TJAdUnit.this.f27219i.evaluateJavascript(str.replaceFirst("javascript:", ""), (ValueCallback) null);
                        return true;
                    } catch (Exception e2) {
                        TapjoyLog.m33196e("TJAdUnit", "Exception in evaluateJavascript. Device not supported. " + e2.toString());
                    }
                }
                return false;
            }
        }

        /* renamed from: a */
        private static WebResourceResponse m33045a(TapjoyCachedAssetData tapjoyCachedAssetData) {
            if (tapjoyCachedAssetData == null) {
                return null;
            }
            try {
                return new WebResourceResponse(tapjoyCachedAssetData.getMimeType(), "UTF-8", new FileInputStream(tapjoyCachedAssetData.getLocalFilePath()));
            } catch (Exception unused) {
                return null;
            }
        }
    };

    /* renamed from: L */
    private WebChromeClient f27211L = new WebChromeClient() {
        public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            TapjoyLog.m33194d("TJAdUnit", str2);
            return false;
        }

        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            if (!TJAdUnit.this.f27217g.closeRequested) {
                return true;
            }
            String[] strArr = {"Uncaught", "uncaught", "Error", "error", "not defined"};
            if (TJAdUnit.this.f27216f == null) {
                return true;
            }
            for (int i = 0; i < 5; i++) {
                if (consoleMessage.message().contains(strArr[i])) {
                    TJAdUnit.this.f27216f.handleClose();
                    return true;
                }
            }
            return true;
        }
    };

    /* renamed from: b */
    VideoView f27212b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Handler f27213c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private TJAdUnitWebViewListener f27214d;

    /* renamed from: e */
    private TJAdUnitVideoListener f27215e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public TJAdUnitActivity f27216f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public TJAdUnitJSBridge f27217g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public TJWebView f27218h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public TJWebView f27219i;

    /* renamed from: j */
    private MediaPlayer f27220j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f27221k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f27222l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f27223m;

    /* renamed from: n */
    private boolean f27224n;
    @Nullable

    /* renamed from: o */
    private ScheduledFuture<?> f27225o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public AudioManager f27226p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f27227q = 0;

    /* renamed from: r */
    private int f27228r;

    /* renamed from: s */
    private boolean f27229s;

    /* renamed from: t */
    private boolean f27230t;

    /* renamed from: u */
    private boolean f27231u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f27232v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public boolean f27233w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f27234x;

    /* renamed from: y */
    private volatile boolean f27235y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f27236z;

    public interface TJAdUnitVideoListener {
        void onVideoCompleted();

        void onVideoError(String str);

        void onVideoStart();
    }

    public interface TJAdUnitWebViewListener {
        void onClick();

        void onClosed();

        void onContentReady();
    }

    /* renamed from: a */
    private static boolean m33007a(int i) {
        return i == 0 || i == 8 || i == 6 || i == 11;
    }

    /* renamed from: b */
    private static boolean m33012b(int i) {
        return i == 1 || i == 9 || i == 7 || i == 12;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo71671a(Context context) {
        if (Looper.myLooper() == Looper.getMainLooper() && !this.f27235y && context != null) {
            TapjoyLog.m33194d("TJAdUnit", "Constructing ad unit");
            this.f27235y = true;
            try {
                TJWebView tJWebView = new TJWebView(context);
                this.f27218h = tJWebView;
                tJWebView.loadDataWithBaseURL((String) null, "<!DOCTYPE html><html><head><title>Tapjoy Background Webview</title></head></html>", "text/html", "utf-8", (String) null);
                TJWebView tJWebView2 = new TJWebView(context);
                this.f27219i = tJWebView2;
                tJWebView2.setWebViewClient(this.f27210K);
                this.f27219i.setWebChromeClient(this.f27211L);
                VideoView videoView = new VideoView(context);
                this.f27212b = videoView;
                videoView.setOnCompletionListener(this);
                this.f27212b.setOnErrorListener(this);
                this.f27212b.setOnPreparedListener(this);
                this.f27212b.setVisibility(4);
                this.f27217g = new TJAdUnitJSBridge(context, this);
                if (context instanceof TJAdUnitActivity) {
                    setAdUnitActivity((TJAdUnitActivity) context);
                }
            } catch (Exception e) {
                TapjoyLog.m33199w("TJAdUnit", e.getMessage());
                return false;
            }
        }
        return this.f27235y;
    }

    public boolean preload(TJPlacementData tJPlacementData, Context context) {
        if (this.f27233w || !tJPlacementData.isPrerenderingRequested() || !TJPlacementManager.canPreRenderPlacement() || TapjoyConnectCore.isViewOpen()) {
            fireContentReady();
            return false;
        }
        TapjoyLog.m33197i("TJAdUnit", "Pre-rendering ad unit for placement: " + tJPlacementData.getPlacementName());
        TJPlacementManager.incrementPlacementPreRenderCount();
        load(tJPlacementData, true, context);
        return true;
    }

    public void load(final TJPlacementData tJPlacementData, final boolean z, final Context context) {
        this.f27233w = false;
        TapjoyUtil.runOnMainThread(new Runnable() {
            public final void run() {
                if (TJAdUnit.this.mo71671a(context)) {
                    TapjoyLog.m33197i("TJAdUnit", "Loading ad unit content");
                    boolean z = true;
                    boolean unused = TJAdUnit.this.f27233w = true;
                    try {
                        if (!TextUtils.isEmpty(tJPlacementData.getRedirectURL())) {
                            if (tJPlacementData.isPreloadDisabled()) {
                                TJAdUnit.this.f27219i.postUrl(tJPlacementData.getRedirectURL(), (byte[]) null);
                            } else {
                                TJAdUnit.this.f27219i.loadUrl(tJPlacementData.getRedirectURL());
                            }
                        } else if (tJPlacementData.getBaseURL() == null || tJPlacementData.getHttpResponse() == null) {
                            TapjoyLog.m33195e("TJAdUnit", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Error loading ad unit content"));
                            boolean unused2 = TJAdUnit.this.f27233w = false;
                        } else {
                            TJAdUnit.this.f27219i.loadDataWithBaseURL(tJPlacementData.getBaseURL(), tJPlacementData.getHttpResponse(), "text/html", "utf-8", (String) null);
                        }
                    } catch (Exception unused3) {
                        TapjoyLog.m33195e("TJAdUnit", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Error loading ad unit content"));
                        boolean unused4 = TJAdUnit.this.f27233w = false;
                    }
                    TJAdUnit tJAdUnit = TJAdUnit.this;
                    if (!tJAdUnit.f27233w || !z) {
                        z = false;
                    }
                    boolean unused5 = tJAdUnit.f27234x = z;
                }
            }
        });
    }

    public void resume(TJAdUnitSaveStateData tJAdUnitSaveStateData) {
        TJAdUnitJSBridge tJAdUnitJSBridge = this.f27217g;
        if (tJAdUnitJSBridge == null) {
            TJAdUnitActivity tJAdUnitActivity = this.f27216f;
            if (tJAdUnitActivity != null) {
                tJAdUnitActivity.finish();
                TapjoyLog.m33199w("TJAdUnit", "Failed to resume TJAdUnit. TJAdUnitBridge is null.");
                return;
            }
            return;
        }
        if (tJAdUnitJSBridge.didLaunchOtherActivity) {
            TapjoyLog.m33194d("TJAdUnit", "onResume bridge.didLaunchOtherActivity callbackID: " + this.f27217g.otherActivityCallbackID);
            TJAdUnitJSBridge tJAdUnitJSBridge2 = this.f27217g;
            tJAdUnitJSBridge2.invokeJSCallback(tJAdUnitJSBridge2.otherActivityCallbackID, Boolean.TRUE);
            this.f27217g.didLaunchOtherActivity = false;
        }
        this.f27203D = false;
        this.f27217g.setEnabled(true);
        if (tJAdUnitSaveStateData != null) {
            int i = tJAdUnitSaveStateData.seekTime;
            this.f27221k = i;
            this.f27212b.seekTo(i);
            if (this.f27220j != null) {
                this.f27229s = tJAdUnitSaveStateData.isVideoMuted;
            }
        }
        if (this.f27204E) {
            this.f27204E = false;
            this.f27213c.postDelayed(this.f27208I, 200);
        }
    }

    public void pause() {
        this.f27203D = true;
        TJAdUnitJSBridge tJAdUnitJSBridge = this.f27217g;
        if (tJAdUnitJSBridge != null) {
            tJAdUnitJSBridge.setEnabled(false);
        }
        pauseVideo();
    }

    public void invokeBridgeCallback(String str, Object... objArr) {
        TJAdUnitJSBridge tJAdUnitJSBridge = this.f27217g;
        if (tJAdUnitJSBridge != null && str != null) {
            tJAdUnitJSBridge.invokeJSCallback(str, objArr);
        }
    }

    public void destroy() {
        TJAdUnitJSBridge tJAdUnitJSBridge = this.f27217g;
        if (tJAdUnitJSBridge != null) {
            tJAdUnitJSBridge.destroy();
        }
        m33019d();
        TJWebView tJWebView = this.f27218h;
        if (tJWebView != null) {
            tJWebView.removeAllViews();
            this.f27218h = null;
        }
        TJWebView tJWebView2 = this.f27219i;
        if (tJWebView2 != null) {
            tJWebView2.removeAllViews();
            this.f27219i = null;
        }
        this.f27235y = false;
        this.f27232v = false;
        setAdUnitActivity((TJAdUnitActivity) null);
        m33011b();
        this.f27220j = null;
        TJAdUnitWebViewListener tJAdUnitWebViewListener = this.f27214d;
        if (tJAdUnitWebViewListener != null) {
            tJAdUnitWebViewListener.onClosed();
        }
        resetContentLoadState();
    }

    public void resetContentLoadState() {
        this.f27233w = false;
        this.f27236z = false;
        this.f27234x = false;
        this.f27200A = -1;
        this.f27231u = false;
        this.f27229s = false;
    }

    public void setVisible(boolean z) {
        this.f27217g.notifyOrientationChanged(getScreenOrientationString(), this.f27201B, this.f27202C);
        this.f27232v = z;
        if (z && this.f27236z) {
            m33006a();
        }
    }

    public void fireContentReady() {
        TJAdUnitWebViewListener tJAdUnitWebViewListener = this.f27214d;
        if (tJAdUnitWebViewListener != null) {
            tJAdUnitWebViewListener.onContentReady();
        }
    }

    public void fireOnClick() {
        TJAdUnitWebViewListener tJAdUnitWebViewListener = this.f27214d;
        if (tJAdUnitWebViewListener != null) {
            tJAdUnitWebViewListener.onClick();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m33006a() {
        TJAdUnitJSBridge tJAdUnitJSBridge = this.f27217g;
        if (tJAdUnitJSBridge != null) {
            tJAdUnitJSBridge.display();
        }
    }

    public void closeRequested(boolean z) {
        this.f27217g.closeRequested(Boolean.valueOf(z));
    }

    public void setOrientation(int i) {
        TJAdUnitActivity tJAdUnitActivity = this.f27216f;
        if (tJAdUnitActivity != null) {
            int c = m33015c();
            int i2 = this.f27200A;
            if (i2 != -1) {
                c = i2;
            }
            if ((m33007a(c) && m33007a(i)) || (m33012b(c) && m33012b(i))) {
                i = c;
            }
            tJAdUnitActivity.setRequestedOrientation(i);
            this.f27200A = i;
            this.f27231u = true;
        }
    }

    public void unsetOrientation() {
        TJAdUnitActivity tJAdUnitActivity = this.f27216f;
        if (tJAdUnitActivity != null) {
            tJAdUnitActivity.setRequestedOrientation(-1);
        }
        this.f27200A = -1;
        this.f27231u = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m33011b() {
        TapjoyLog.m33194d("TJAdUnit", "detachVolumeListener");
        ScheduledFuture<?> scheduledFuture = this.f27225o;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f27225o = null;
        }
        this.f27226p = null;
    }

    /* renamed from: c */
    private int m33015c() {
        TJAdUnitActivity tJAdUnitActivity = this.f27216f;
        if (tJAdUnitActivity == null) {
            return -1;
        }
        int rotation = tJAdUnitActivity.getWindowManager().getDefaultDisplay().getRotation();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        tJAdUnitActivity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.f27201B = displayMetrics.widthPixels;
        this.f27202C = displayMetrics.heightPixels;
        if (((rotation == 0 || rotation == 2) && this.f27202C > this.f27201B) || ((rotation == 1 || rotation == 3) && this.f27201B > this.f27202C)) {
            if (rotation != 0) {
                if (rotation != 1) {
                    if (rotation != 2) {
                        if (rotation == 3) {
                            return 8;
                        }
                    }
                }
                return 0;
            }
            return 1;
        }
        if (rotation != 0) {
            if (rotation != 1) {
                if (rotation == 2) {
                    return 8;
                }
                if (rotation != 3) {
                    TapjoyLog.m33199w("TJAdUnit", "Unknown screen orientation. Defaulting to landscape.");
                }
            }
            return 1;
        }
        return 0;
        return 9;
    }

    public void setAdUnitActivity(TJAdUnitActivity tJAdUnitActivity) {
        this.f27216f = tJAdUnitActivity;
        TJAdUnitJSBridge tJAdUnitJSBridge = this.f27217g;
        if (tJAdUnitJSBridge != null) {
            tJAdUnitJSBridge.setAdUnitActivity(tJAdUnitActivity);
        }
    }

    public void setAdContentTracker(C11636fo foVar) {
        this.f27205F = foVar;
    }

    public void setBackgroundColor(final String str, final TJAdUnitJSBridge.AdUnitAsyncTaskListner adUnitAsyncTaskListner) {
        TapjoyUtil.runOnMainThread(new Runnable() {
            public final void run() {
                try {
                    TapjoyLog.m33194d("TJAdUnit", "setBackgroundColor: " + str);
                    TJAdUnit.this.f27218h.setBackgroundColor(Color.parseColor(str));
                    adUnitAsyncTaskListner.onComplete(true);
                } catch (Exception unused) {
                    TapjoyLog.m33194d("TJAdUnit", "Error setting background color. backgroundWebView: " + TJAdUnit.this.f27218h + ", hexColor: " + str);
                    adUnitAsyncTaskListner.onComplete(false);
                }
            }
        });
    }

    public void setBackgroundContent(final String str, final TJAdUnitJSBridge.AdUnitAsyncTaskListner adUnitAsyncTaskListner) {
        TapjoyUtil.runOnMainThread(new Runnable() {
            public final void run() {
                try {
                    TapjoyLog.m33194d("TJAdUnit", "setBackgroundContent: " + str);
                    TJAdUnit.this.f27218h.loadDataWithBaseURL((String) null, str, "text/html", "utf-8", (String) null);
                    adUnitAsyncTaskListner.onComplete(true);
                } catch (Exception unused) {
                    TapjoyLog.m33194d("TJAdUnit", "Error setting background content. backgroundWebView: " + TJAdUnit.this.f27218h + ", content: " + str);
                    adUnitAsyncTaskListner.onComplete(false);
                }
            }
        });
    }

    public void setWebViewListener(TJAdUnitWebViewListener tJAdUnitWebViewListener) {
        this.f27214d = tJAdUnitWebViewListener;
    }

    public void setVideoListener(TJAdUnitVideoListener tJAdUnitVideoListener) {
        this.f27215e = tJAdUnitVideoListener;
    }

    public int getLockedOrientation() {
        return this.f27200A;
    }

    public int getScreenWidth() {
        return this.f27201B;
    }

    public int getScreenHeight() {
        return this.f27202C;
    }

    public String getScreenOrientationString() {
        return m33007a(m33015c()) ? "landscape" : "portrait";
    }

    public boolean hasCalledLoad() {
        return this.f27233w;
    }

    public boolean isPrerendered() {
        return this.f27234x;
    }

    public boolean isLockedOrientation() {
        return this.f27231u;
    }

    public TJWebView getBackgroundWebView() {
        return this.f27218h;
    }

    public TJWebView getWebView() {
        return this.f27219i;
    }

    public boolean getCloseRequested() {
        return this.f27217g.closeRequested;
    }

    public void loadVideoUrl(final String str, final TJAdUnitJSBridge.AdUnitAsyncTaskListner adUnitAsyncTaskListner) {
        TapjoyUtil.runOnMainThread(new Runnable() {
            public final void run() {
                if (TJAdUnit.this.f27212b != null) {
                    TapjoyLog.m33197i("TJAdUnit", "loadVideoUrl: " + str);
                    TJAdUnit.this.f27212b.setVideoPath(str);
                    TJAdUnit.this.f27212b.setVisibility(0);
                    TJAdUnit.this.f27212b.seekTo(0);
                    adUnitAsyncTaskListner.onComplete(true);
                    return;
                }
                adUnitAsyncTaskListner.onComplete(false);
            }
        });
    }

    public boolean playVideo() {
        TapjoyLog.m33197i("TJAdUnit", MraidJsMethods.PLAY_VIDEO);
        VideoView videoView = this.f27212b;
        if (videoView == null) {
            return false;
        }
        videoView.start();
        this.f27224n = false;
        this.f27213c.postDelayed(this.f27208I, 200);
        return true;
    }

    public boolean pauseVideo() {
        m33019d();
        VideoView videoView = this.f27212b;
        if (videoView == null || !videoView.isPlaying()) {
            return false;
        }
        this.f27212b.pause();
        this.f27221k = this.f27212b.getCurrentPosition();
        TapjoyLog.m33197i("TJAdUnit", "Video paused at: " + this.f27221k);
        this.f27217g.onVideoPaused(this.f27221k);
        return true;
    }

    public void clearVideo(final TJAdUnitJSBridge.AdUnitAsyncTaskListner adUnitAsyncTaskListner, final boolean z) {
        if (this.f27212b != null) {
            m33019d();
            TapjoyUtil.runOnMainThread(new Runnable() {
                public final void run() {
                    TJAdUnit.this.f27212b.setVisibility(z ? 0 : 4);
                    TJAdUnit.this.f27212b.stopPlayback();
                    boolean unused = TJAdUnit.this.f27223m = false;
                    boolean unused2 = TJAdUnit.this.f27222l = false;
                    int unused3 = TJAdUnit.this.f27221k = 0;
                    adUnitAsyncTaskListner.onComplete(true);
                }
            });
            return;
        }
        adUnitAsyncTaskListner.onComplete(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo71670a(boolean z) {
        MediaPlayer mediaPlayer = this.f27220j;
        if (mediaPlayer != null) {
            if (z) {
                mediaPlayer.setVolume(0.0f, 0.0f);
            } else {
                mediaPlayer.setVolume(1.0f, 1.0f);
            }
            if (this.f27230t != z) {
                this.f27230t = z;
                this.f27217g.onVolumeChanged();
                return;
            }
            return;
        }
        this.f27229s = z;
    }

    public void attachVolumeListener(boolean z, int i) {
        TJAdUnitActivity tJAdUnitActivity;
        TapjoyLog.m33194d("TJAdUnit", "attachVolumeListener: isAttached=" + z + "; interval=" + i);
        m33011b();
        if (z && (tJAdUnitActivity = this.f27216f) != null) {
            AudioManager audioManager = (AudioManager) tJAdUnitActivity.getSystemService("audio");
            this.f27226p = audioManager;
            this.f27227q = audioManager.getStreamVolume(3);
            this.f27228r = this.f27226p.getStreamMaxVolume(3);
            long j = (long) i;
            this.f27225o = C11745hx.f28608a.scheduleWithFixedDelay(this.f27207H, j, j, TimeUnit.MILLISECONDS);
        }
    }

    public VideoView getVideoView() {
        return this.f27212b;
    }

    public int getVideoSeekTime() {
        return this.f27221k;
    }

    public boolean isVideoComplete() {
        return this.f27224n;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        TapjoyLog.m33197i("TJAdUnit", "video -- onPrepared");
        final int duration = this.f27212b.getDuration();
        final int measuredWidth = this.f27212b.getMeasuredWidth();
        final int measuredHeight = this.f27212b.getMeasuredHeight();
        this.f27220j = mediaPlayer;
        boolean z = this.f27229s;
        if (z) {
            mo71670a(z);
        }
        if (this.f27221k <= 0 || this.f27212b.getCurrentPosition() == this.f27221k) {
            TJAdUnitJSBridge tJAdUnitJSBridge = this.f27217g;
            if (tJAdUnitJSBridge != null) {
                tJAdUnitJSBridge.onVideoReady(duration, measuredWidth, measuredHeight);
            }
        } else {
            this.f27220j.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() {
                public final void onSeekComplete(MediaPlayer mediaPlayer) {
                    TJAdUnit.this.f27217g.onVideoReady(duration, measuredWidth, measuredHeight);
                }
            });
        }
        this.f27220j.setOnInfoListener(this);
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        String str;
        TapjoyLog.m33195e("TJAdUnit", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Error encountered when instantiating the VideoView: " + i + " - " + i2));
        this.f27222l = true;
        m33019d();
        String str2 = (i != 100 ? "MEDIA_ERROR_UNKNOWN" : "MEDIA_ERROR_SERVER_DIED") + " -- ";
        if (i2 == -1010) {
            str = str2 + "MEDIA_ERROR_UNSUPPORTED";
        } else if (i2 == -1007) {
            str = str2 + "MEDIA_ERROR_MALFORMED";
        } else if (i2 == -1004) {
            str = str2 + "MEDIA_ERROR_IO";
        } else if (i2 != -110) {
            str = str2 + "MEDIA_ERROR_EXTRA_UNKNOWN";
        } else {
            str = str2 + "MEDIA_ERROR_TIMED_OUT";
        }
        this.f27217g.onVideoError(str);
        if (i == 1 || i2 == -1004) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m33019d() {
        this.f27213c.removeCallbacks(this.f27208I);
        this.f27213c.removeCallbacks(this.f27209J);
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        TapjoyLog.m33197i("TJAdUnit", "video -- onCompletion");
        m33019d();
        this.f27224n = true;
        if (!this.f27222l) {
            this.f27217g.onVideoCompletion();
        }
        this.f27222l = false;
    }

    public void fireOnVideoStart() {
        TapjoyLog.m33198v("TJAdUnit", "Firing onVideoStart");
        if (getPublisherVideoListener() != null) {
            getPublisherVideoListener().onVideoStart();
        }
        TJAdUnitVideoListener tJAdUnitVideoListener = this.f27215e;
        if (tJAdUnitVideoListener != null) {
            tJAdUnitVideoListener.onVideoStart();
        }
    }

    public void fireOnVideoError(String str) {
        TapjoyLog.m33196e("TJAdUnit", "Firing onVideoError with error: ".concat(String.valueOf(str)));
        if (getPublisherVideoListener() != null) {
            getPublisherVideoListener().onVideoError(3);
        }
        TJAdUnitVideoListener tJAdUnitVideoListener = this.f27215e;
        if (tJAdUnitVideoListener != null) {
            tJAdUnitVideoListener.onVideoError(str);
        }
    }

    public void fireOnVideoComplete() {
        TapjoyLog.m33198v("TJAdUnit", "Firing onVideoComplete");
        if (getPublisherVideoListener() != null) {
            getPublisherVideoListener().onVideoComplete();
        }
        TJAdUnitVideoListener tJAdUnitVideoListener = this.f27215e;
        if (tJAdUnitVideoListener != null) {
            tJAdUnitVideoListener.onVideoCompleted();
        }
    }

    public float getVolume() {
        return ((float) this.f27227q) / ((float) this.f27228r);
    }

    public boolean isMuted() {
        return this.f27230t;
    }

    public void startAdContentTracking(String str, JSONObject jSONObject) {
        C11636fo foVar = this.f27205F;
        if (foVar != null) {
            foVar.mo72502a(str, jSONObject);
        }
    }

    public void endAdContentTracking(String str, JSONObject jSONObject) {
        if (this.f27205F != null) {
            m33021e();
            this.f27205F.mo72503b(str, jSONObject);
        }
    }

    public void sendAdContentTracking(String str, JSONObject jSONObject) {
        if (this.f27205F != null) {
            m33021e();
            C11636fo foVar = this.f27205F;
            Map<String, Object> a = C11636fo.m33798a(jSONObject);
            C11676gi.m33889e(str).mo72568a(foVar.f28321a).mo72568a(a).mo72571b(C11636fo.m33799b(jSONObject)).mo72572c();
        }
    }

    /* renamed from: e */
    private void m33021e() {
        C11636fo foVar = this.f27205F;
        if (foVar != null) {
            foVar.mo72515a("prerendered", Boolean.valueOf(this.f27234x));
        }
    }

    public void setSdkBeacon(C11656ga gaVar) {
        this.f27206G = gaVar;
        if (gaVar != null && this.f27232v) {
            gaVar.mo72530a();
        }
    }

    public C11656ga getSdkBeacon() {
        return this.f27206G;
    }

    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        String str;
        if (i == 3) {
            str = "MEDIA_INFO_VIDEO_RENDERING_START";
        } else if (i != 801) {
            switch (i) {
                case 700:
                    str = "MEDIA_INFO_VIDEO_TRACK_LAGGING";
                    break;
                case 701:
                    str = "MEDIA_INFO_BUFFERING_START";
                    break;
                case 702:
                    str = "MEDIA_INFO_BUFFERING_END";
                    break;
                default:
                    str = "";
                    break;
            }
        } else {
            str = "MEDIA_INFO_NOT_SEEKABLE";
        }
        this.f27217g.onVideoInfo(str);
        return false;
    }

    public TJVideoListener getPublisherVideoListener() {
        return f27199a;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m33014b(String str) {
        try {
            String host = new URL(TapjoyConnectCore.getHostURL()).getHost();
            if ((host == null || !str.contains(host)) && !str.contains(TapjoyConnectCore.getRedirectDomain()) && !str.contains(TapjoyUtil.getRedirectDomain(TapjoyConnectCore.getPlacementURL()))) {
                return false;
            }
            return true;
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public boolean m33024f() {
        NetworkInfo activeNetworkInfo;
        try {
            if (this.f27219i.getContext() == null || (activeNetworkInfo = ((ConnectivityManager) this.f27219i.getContext().getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable() || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            TapjoyLog.m33194d("TJAdUnit", "Exception getting NetworkInfo: " + e.getLocalizedMessage());
        }
        return false;
    }

    public void notifyOrientationChanged() {
        this.f27217g.notifyOrientationChanged(getScreenOrientationString(), this.f27201B, this.f27202C);
    }
}
