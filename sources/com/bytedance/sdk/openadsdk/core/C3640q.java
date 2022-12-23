package com.bytedance.sdk.openadsdk.core;

import android.webkit.WebView;
import com.bytedance.sdk.component.utils.C2975l;

/* renamed from: com.bytedance.sdk.openadsdk.core.q */
/* compiled from: SSWebSettings */
public class C3640q {
    /* renamed from: a */
    public static void m11576a(WebView webView) {
        if (webView != null) {
            try {
                webView.removeJavascriptInterface("searchBoxJavaBridge_");
                webView.removeJavascriptInterface("accessibility");
                webView.removeJavascriptInterface("accessibilityTraversal");
            } catch (Throwable th) {
                C2975l.m8383b(th.toString());
            }
        }
    }
}
