package com.bytedance.sdk.component.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.webkit.DownloadListener;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.component.utils.C2986v;
import com.bytedance.sdk.component.widget.p127a.C2995a;
import com.bytedance.sdk.component.widget.p128b.C2997a;
import com.facebook.share.internal.ShareInternalUtility;
import java.lang.reflect.Method;
import java.util.Map;
import org.json.JSONObject;

public class SSWebView extends FrameLayout {

    /* renamed from: a */
    private C2997a f6768a;

    /* renamed from: b */
    private String f6769b;

    /* renamed from: c */
    private JSONObject f6770c;

    /* renamed from: d */
    private boolean f6771d;

    /* renamed from: e */
    private float f6772e;

    /* renamed from: f */
    private float f6773f;

    /* renamed from: g */
    private long f6774g;

    /* renamed from: h */
    private long f6775h;

    /* renamed from: i */
    private long f6776i;

    /* renamed from: j */
    private boolean f6777j;

    /* renamed from: k */
    private WebView f6778k;

    /* renamed from: l */
    private float f6779l;

    /* renamed from: m */
    private float f6780m;

    /* renamed from: n */
    private C2993b f6781n;

    /* renamed from: o */
    private C2986v f6782o;

    /* renamed from: p */
    private AttributeSet f6783p;

    /* renamed from: q */
    private Context f6784q;

    /* renamed from: r */
    private C2994c f6785r;

    /* renamed from: com.bytedance.sdk.component.widget.SSWebView$b */
    public interface C2993b {
    }

    /* renamed from: com.bytedance.sdk.component.widget.SSWebView$c */
    public interface C2994c {
        /* renamed from: a */
        void mo17994a(boolean z);
    }

    public SSWebView(Context context) {
        super(m8476a(context));
        this.f6772e = 0.0f;
        this.f6773f = 0.0f;
        this.f6774g = 0;
        this.f6775h = 0;
        this.f6776i = 0;
        this.f6777j = false;
        this.f6779l = 20.0f;
        this.f6780m = 50.0f;
        try {
            this.f6778k = new WebView(m8476a(context));
            mo17930b();
        } catch (Throwable unused) {
        }
        m8478b(m8476a(context));
    }

    public SSWebView(Context context, AttributeSet attributeSet) {
        super(m8476a(context), attributeSet);
        this.f6772e = 0.0f;
        this.f6773f = 0.0f;
        this.f6774g = 0;
        this.f6775h = 0;
        this.f6776i = 0;
        boolean z = false;
        this.f6777j = false;
        this.f6779l = 20.0f;
        this.f6780m = 50.0f;
        try {
            if (C2995a.m8507a().mo17996b() != null && C2995a.m8507a().mo17996b().mo17998a()) {
                int h = C2984t.m8435h(context, "tt_delay_init");
                int i = 0;
                boolean z2 = false;
                while (i < attributeSet.getAttributeCount()) {
                    try {
                        if (attributeSet.getAttributeNameResource(i) == h) {
                            z2 = attributeSet.getAttributeBooleanValue(i, false);
                        }
                        i++;
                    } catch (Throwable unused) {
                    }
                }
                z = z2;
            }
        } catch (Throwable unused2) {
        }
        this.f6784q = context;
        if (!z) {
            this.f6783p = attributeSet;
            mo17923a();
        }
    }

    public SSWebView(Context context, AttributeSet attributeSet, int i) {
        super(m8476a(context), attributeSet, i);
        this.f6772e = 0.0f;
        this.f6773f = 0.0f;
        this.f6774g = 0;
        this.f6775h = 0;
        this.f6776i = 0;
        this.f6777j = false;
        this.f6779l = 20.0f;
        this.f6780m = 50.0f;
        try {
            this.f6778k = new WebView(m8476a(context), attributeSet, i);
            mo17930b();
        } catch (Throwable unused) {
        }
        m8478b(m8476a(context));
    }

    /* renamed from: a */
    private static Context m8476a(Context context) {
        return (Build.VERSION.SDK_INT < 21 || Build.VERSION.SDK_INT >= 23) ? context : context.createConfigurationContext(new Configuration());
    }

    /* renamed from: a */
    private void m8477a(MotionEvent motionEvent) {
        if (this.f6771d && this.f6768a != null) {
            if ((this.f6769b != null || this.f6770c != null) && motionEvent != null) {
                try {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        this.f6772e = motionEvent.getRawX();
                        this.f6773f = motionEvent.getRawY();
                        this.f6774g = System.currentTimeMillis();
                        this.f6770c = new JSONObject();
                        if (this.f6778k != null) {
                            this.f6778k.setTag(C2984t.m8432e(getContext(), "tt_id_click_begin"), Long.valueOf(this.f6774g));
                        }
                    } else if (action == 1 || action == 3) {
                        this.f6770c.put("start_x", String.valueOf(this.f6772e));
                        this.f6770c.put("start_y", String.valueOf(this.f6773f));
                        this.f6770c.put("offset_x", String.valueOf(motionEvent.getRawX() - this.f6772e));
                        this.f6770c.put("offset_y", String.valueOf(motionEvent.getRawY() - this.f6773f));
                        this.f6770c.put("url", String.valueOf(getUrl()));
                        this.f6770c.put("tag", "");
                        this.f6775h = System.currentTimeMillis();
                        if (this.f6778k != null) {
                            this.f6778k.setTag(C2984t.m8432e(getContext(), "tt_id_click_end"), Long.valueOf(this.f6775h));
                        }
                        this.f6770c.put("down_time", this.f6774g);
                        this.f6770c.put("up_time", this.f6775h);
                        if (C2995a.m8507a().mo17996b() != null && this.f6776i != this.f6774g) {
                            this.f6776i = this.f6774g;
                            C2995a.m8507a().mo17996b().mo17997a(this.f6768a, this.f6769b, "in_web_click", this.f6770c, this.f6775h - this.f6774g);
                        }
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* renamed from: b */
    private void m8478b(Context context) {
        m8480c(context);
        m8483p();
        m8482o();
    }

    /* renamed from: b */
    private static boolean m8479b(View view) {
        try {
            Class<?> loadClass = view.getClass().getClassLoader().loadClass("androidx.viewpager.widget.ViewPager");
            if (loadClass != null && loadClass.isInstance(view)) {
                return true;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            Class<?> loadClass2 = view.getClass().getClassLoader().loadClass("androidx.viewpager.widget.ViewPager");
            return loadClass2 != null && loadClass2.isInstance(view);
        } catch (Throwable th2) {
            th2.printStackTrace();
            return false;
        }
    }

    /* renamed from: c */
    private static void m8480c(Context context) {
        if (Build.VERSION.SDK_INT == 17 && context != null) {
            try {
                AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
                if (accessibilityManager == null) {
                    return;
                }
                if (accessibilityManager.isEnabled()) {
                    Method declaredMethod = accessibilityManager.getClass().getDeclaredMethod("setState", new Class[]{Integer.TYPE});
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(accessibilityManager, new Object[]{0});
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: c */
    private static boolean m8481c(View view) {
        try {
            Class<?> loadClass = view.getClass().getClassLoader().loadClass("androidx.core.view.ScrollingView");
            if (loadClass != null && loadClass.isInstance(view)) {
                return true;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            Class<?> loadClass2 = view.getClass().getClassLoader().loadClass("androidx.core.view.ScrollingView");
            return loadClass2 != null && loadClass2.isInstance(view);
        } catch (Throwable th2) {
            th2.printStackTrace();
            return false;
        }
    }

    /* renamed from: o */
    private void m8482o() {
        try {
            this.f6778k.removeJavascriptInterface("searchBoxJavaBridge_");
            this.f6778k.removeJavascriptInterface("accessibility");
            this.f6778k.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable unused) {
        }
    }

    /* renamed from: p */
    private void m8483p() {
        try {
            WebSettings settings = this.f6778k.getSettings();
            if (settings != null) {
                settings.setSavePassword(false);
            }
        } catch (Throwable unused) {
        }
    }

    public static void setDataDirectorySuffix(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            WebView.setDataDirectorySuffix(str);
        }
    }

    private void setJavaScriptEnabled(String str) {
        WebSettings settings;
        try {
            if (!TextUtils.isEmpty(str) && (settings = this.f6778k.getSettings()) != null) {
                settings.setJavaScriptEnabled(!Uri.parse(str).getScheme().equals(ShareInternalUtility.STAGING_PARAM));
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ViewParent mo17922a(View view) {
        ViewParent parent = view.getParent();
        if ((parent instanceof AbsListView) || (parent instanceof ScrollView) || (parent instanceof HorizontalScrollView) || !(parent instanceof View)) {
            return parent;
        }
        View view2 = (View) parent;
        return (m8479b(view2) || m8481c(view2)) ? parent : mo17922a(view2);
    }

    /* renamed from: a */
    public void mo17923a() {
        try {
            this.f6778k = this.f6783p == null ? new WebView(m8476a(this.f6784q)) : new WebView(m8476a(this.f6784q), this.f6783p);
            mo17930b();
            m8478b(m8476a(this.f6784q));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo17924a(Object obj, String str) {
        try {
            this.f6778k.addJavascriptInterface(obj, str);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo17925a(String str) {
        try {
            setJavaScriptEnabled(str);
            this.f6778k.loadUrl(str);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo17926a(String str, ValueCallback<String> valueCallback) {
        try {
            if (Build.VERSION.SDK_INT >= 19) {
                this.f6778k.evaluateJavascript(str, valueCallback);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo17927a(String str, String str2, String str3, String str4, String str5) {
        try {
            setJavaScriptEnabled(str);
            this.f6778k.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo17928a(String str, Map<String, String> map) {
        try {
            setJavaScriptEnabled(str);
            this.f6778k.loadUrl(str, map);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo17929a(boolean z) {
        try {
            this.f6778k.clearCache(z);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public void mo17930b() {
        if (this.f6778k != null) {
            removeAllViews();
            setBackground((Drawable) null);
            try {
                this.f6778k.setId(C2984t.m8432e(getContext(), "tt_id_root_web_view"));
            } catch (Throwable unused) {
            }
            addView(this.f6778k, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    /* renamed from: b */
    public void mo17931b(String str) {
        try {
            this.f6778k.removeJavascriptInterface(str);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public void mo17932c() {
        try {
            this.f6778k.stopLoading();
        } catch (Throwable unused) {
        }
    }

    public void computeScroll() {
        try {
            this.f6778k.computeScroll();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    public void mo17934d() {
        try {
            this.f6778k.reload();
        } catch (Throwable unused) {
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C2994c cVar = this.f6785r;
        if (cVar != null) {
            cVar.mo17994a(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e */
    public boolean mo17936e() {
        try {
            return this.f6778k.canGoBack();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: f */
    public void mo17937f() {
        try {
            this.f6778k.goBack();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: g */
    public boolean mo17938g() {
        try {
            return this.f6778k.canGoForward();
        } catch (Throwable unused) {
            return false;
        }
    }

    public int getContentHeight() {
        try {
            return this.f6778k.getContentHeight();
        } catch (Throwable unused) {
            return 1;
        }
    }

    public C2997a getMaterialMeta() {
        return this.f6768a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        r1 = r3.f6778k.getUrl();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getOriginalUrl() {
        /*
            r3 = this;
            android.webkit.WebView r0 = r3.f6778k     // Catch:{ all -> 0x0022 }
            java.lang.String r0 = r0.getOriginalUrl()     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0021
            java.lang.String r1 = "data:text/html"
            boolean r1 = r0.startsWith(r1)     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0021
            android.webkit.WebView r1 = r3.f6778k     // Catch:{ all -> 0x0022 }
            java.lang.String r1 = r1.getUrl()     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0021
            java.lang.String r2 = "file://"
            boolean r2 = r1.startsWith(r2)     // Catch:{ all -> 0x0022 }
            if (r2 == 0) goto L_0x0021
            r0 = r1
        L_0x0021:
            return r0
        L_0x0022:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.widget.SSWebView.getOriginalUrl():java.lang.String");
    }

    public int getProgress() {
        try {
            return this.f6778k.getProgress();
        } catch (Throwable unused) {
            return 100;
        }
    }

    public String getTag() {
        return this.f6769b;
    }

    public String getUrl() {
        try {
            return this.f6778k.getUrl();
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getUserAgentString() {
        try {
            return this.f6778k.getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public WebView getWebView() {
        return this.f6778k;
    }

    /* renamed from: h */
    public void mo17947h() {
        try {
            this.f6778k.goForward();
        } catch (Throwable unused) {
        }
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    /* renamed from: i */
    public void mo17949i() {
        WebView webView = this.f6778k;
        if (webView != null) {
            webView.onResume();
        }
    }

    /* renamed from: j */
    public void mo17950j() {
        try {
            this.f6778k.clearHistory();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: k */
    public void mo17951k() {
        try {
            this.f6778k.onPause();
            if (this.f6785r != null) {
                this.f6785r.mo17994a(false);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: l */
    public void mo17952l() {
        try {
            this.f6778k.destroy();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: m */
    public void mo17953m() {
        try {
            this.f6778k.clearView();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: n */
    public void mo17954n() {
        try {
            this.f6778k.pauseTimers();
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2986v vVar = this.f6782o;
        if (vVar != null) {
            vVar.mo17917b();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewParent a;
        try {
            m8477a(motionEvent);
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            if ((motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 0) && this.f6777j && (a = mo17922a((View) this)) != null) {
                a.requestDisallowInterceptTouchEvent(true);
            }
            return onInterceptTouchEvent;
        } catch (Throwable unused) {
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public void onWindowFocusChanged(boolean z) {
        C2986v vVar = this.f6782o;
        if (vVar == null) {
            return;
        }
        if (z) {
            vVar.mo17914a();
        } else {
            vVar.mo17917b();
        }
    }

    public void removeAllViews() {
        try {
            this.f6778k.removeAllViews();
        } catch (Throwable unused) {
        }
    }

    public void setAllowFileAccess(boolean z) {
        try {
            this.f6778k.getSettings().setAllowFileAccess(z);
        } catch (Throwable unused) {
        }
    }

    public void setAlpha(float f) {
        try {
            super.setAlpha(f);
            this.f6778k.setAlpha(f);
        } catch (Throwable unused) {
        }
    }

    public void setAppCacheEnabled(boolean z) {
        try {
            this.f6778k.getSettings().setAppCacheEnabled(z);
        } catch (Throwable unused) {
        }
    }

    public void setBackgroundColor(int i) {
        try {
            this.f6778k.setBackgroundColor(i);
        } catch (Throwable unused) {
        }
    }

    public void setBuiltInZoomControls(boolean z) {
        try {
            this.f6778k.getSettings().setBuiltInZoomControls(z);
        } catch (Throwable unused) {
        }
    }

    public void setCacheMode(int i) {
        try {
            this.f6778k.getSettings().setCacheMode(i);
        } catch (Throwable unused) {
        }
    }

    public void setDatabaseEnabled(boolean z) {
        try {
            this.f6778k.getSettings().setDatabaseEnabled(z);
        } catch (Throwable unused) {
        }
    }

    public void setDefaultFontSize(int i) {
        try {
            this.f6778k.getSettings().setDefaultFontSize(i);
        } catch (Throwable unused) {
        }
    }

    public void setDefaultTextEncodingName(String str) {
        try {
            this.f6778k.getSettings().setDefaultTextEncodingName(str);
        } catch (Throwable unused) {
        }
    }

    public void setDisplayZoomControls(boolean z) {
        try {
            this.f6778k.getSettings().setDisplayZoomControls(z);
        } catch (Throwable unused) {
        }
    }

    public void setDomStorageEnabled(boolean z) {
        try {
            this.f6778k.getSettings().setDomStorageEnabled(z);
        } catch (Throwable unused) {
        }
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        try {
            this.f6778k.setDownloadListener(downloadListener);
        } catch (Throwable unused) {
        }
    }

    public void setIsPreventTouchEvent(boolean z) {
        this.f6777j = z;
    }

    public void setJavaScriptCanOpenWindowsAutomatically(boolean z) {
        try {
            this.f6778k.getSettings().setJavaScriptCanOpenWindowsAutomatically(z);
        } catch (Throwable unused) {
        }
    }

    public void setJavaScriptEnabled(boolean z) {
        try {
            this.f6778k.getSettings().setJavaScriptEnabled(z);
        } catch (Throwable unused) {
        }
    }

    public void setLandingPage(boolean z) {
        this.f6771d = z;
    }

    public void setLayerType(int i, Paint paint) {
        try {
            this.f6778k.setLayerType(i, paint);
        } catch (Throwable unused) {
        }
    }

    public void setLayoutAlgorithm(WebSettings.LayoutAlgorithm layoutAlgorithm) {
        try {
            this.f6778k.getSettings().setLayoutAlgorithm(layoutAlgorithm);
        } catch (Throwable unused) {
        }
    }

    public void setLoadWithOverviewMode(boolean z) {
        try {
            this.f6778k.getSettings().setLoadWithOverviewMode(z);
        } catch (Throwable unused) {
        }
    }

    public void setMaterialMeta(C2997a aVar) {
        this.f6768a = aVar;
    }

    public void setMixedContentMode(int i) {
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f6778k.getSettings().setMixedContentMode(i);
            }
        } catch (Throwable unused) {
        }
    }

    public void setNetworkAvailable(boolean z) {
        try {
            this.f6778k.setNetworkAvailable(z);
        } catch (Throwable unused) {
        }
    }

    public void setOnShakeListener(C2993b bVar) {
        this.f6781n = bVar;
    }

    public void setOverScrollMode(int i) {
        try {
            this.f6778k.setOverScrollMode(i);
            super.setOverScrollMode(i);
        } catch (Throwable unused) {
        }
    }

    public void setShakeValue(float f) {
        this.f6779l = f;
    }

    public void setSupportZoom(boolean z) {
        try {
            this.f6778k.getSettings().setSupportZoom(z);
        } catch (Throwable unused) {
        }
    }

    public void setTag(String str) {
        this.f6769b = str;
    }

    public void setTouchStateListener(C2994c cVar) {
        this.f6785r = cVar;
    }

    public void setUseWideViewPort(boolean z) {
        try {
            this.f6778k.getSettings().setUseWideViewPort(z);
        } catch (Throwable unused) {
        }
    }

    public void setUserAgentString(String str) {
        try {
            this.f6778k.getSettings().setUserAgentString(str);
        } catch (Throwable unused) {
        }
    }

    public void setVisibility(int i) {
        try {
            super.setVisibility(i);
            this.f6778k.setVisibility(i);
        } catch (Throwable unused) {
        }
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            this.f6778k.setWebChromeClient(webChromeClient);
        } catch (Throwable unused) {
        }
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        try {
            if (webViewClient instanceof C2994c) {
                setTouchStateListener((C2994c) webViewClient);
            } else {
                setTouchStateListener((C2994c) null);
            }
            if (webViewClient == null) {
                webViewClient = new C2992a();
            }
            this.f6778k.setWebViewClient(webViewClient);
        } catch (Throwable unused) {
        }
    }

    public void setWriggleValue(float f) {
        this.f6780m = f;
    }

    /* renamed from: com.bytedance.sdk.component.widget.SSWebView$a */
    public static class C2992a extends WebViewClient {
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (Build.VERSION.SDK_INT < 26) {
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            }
            if (!renderProcessGoneDetail.didCrash()) {
                if (webView != null) {
                    ViewGroup viewGroup = (ViewGroup) webView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(webView);
                    }
                    webView.destroy();
                }
                return true;
            }
            if (webView != null) {
                ViewGroup viewGroup2 = (ViewGroup) webView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(webView);
                }
                webView.destroy();
            }
            return true;
        }
    }
}
