package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.utils.C4003m;
import java.util.HashSet;

/* renamed from: com.bytedance.sdk.openadsdk.core.z */
/* compiled from: WebViewTweaker */
public class C3768z {

    /* renamed from: a */
    private static final boolean f9810a = (Build.VERSION.SDK_INT >= 16 && C4003m.m13129e());

    /* renamed from: b */
    private static final boolean f9811b = m12386a();

    /* renamed from: c */
    private static int f9812c = -1;

    /* renamed from: d */
    private static int f9813d = -1;

    /* renamed from: e */
    private static int f9814e = -1;

    /* renamed from: f */
    private static Handler f9815f = null;

    /* renamed from: g */
    private static final HashSet<String> f9816g;

    /* renamed from: h */
    private static final HashSet<String> f9817h;

    static {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("HUAWEI C8812");
        hashSet.add("HUAWEI C8812E");
        hashSet.add("HUAWEI C8825D");
        hashSet.add("HUAWEI U8825D");
        hashSet.add("HUAWEI C8950D");
        hashSet.add("HUAWEI U8950D");
        f9816g = hashSet;
        HashSet<String> hashSet2 = new HashSet<>();
        hashSet2.add("ZTE V955");
        hashSet2.add("ZTE N881E");
        hashSet2.add("ZTE N881F");
        hashSet2.add("ZTE N880G");
        hashSet2.add("ZTE N880F");
        hashSet2.add("ZTE V889F");
        f9817h = hashSet2;
    }

    /* renamed from: a */
    public static void m12384a(Context context, WebView webView) {
        if (context != null && webView != null && (context instanceof Activity)) {
            Activity activity = (Activity) context;
            if (activity.isFinishing()) {
                try {
                    webView.loadUrl("about:blank");
                    if (f9814e > 0) {
                        View rootView = webView.getRootView();
                        if (rootView instanceof ViewGroup) {
                            View childAt = ((ViewGroup) rootView).getChildAt(0);
                            childAt.setDrawingCacheEnabled(true);
                            Bitmap createBitmap = Bitmap.createBitmap(childAt.getDrawingCache());
                            childAt.setDrawingCacheEnabled(false);
                            ImageView imageView = new ImageView(activity);
                            imageView.setImageBitmap(createBitmap);
                            imageView.setVisibility(0);
                            ((ViewGroup) rootView).addView(imageView, new ViewGroup.LayoutParams(-1, -1));
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m12386a() {
        return f9810a || (Build.VERSION.SDK_INT == 16 && "ZTE N5".equals(Build.MODEL));
    }

    /* renamed from: a */
    public static void m12385a(WebView webView) {
        if (webView != null) {
            webView.setWebChromeClient((WebChromeClient) null);
            webView.setWebViewClient((WebViewClient) null);
            ViewParent parent = webView.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(webView);
            }
            webView.removeAllViews();
            try {
                webView.destroy();
            } catch (Throwable unused) {
            }
        }
    }
}
