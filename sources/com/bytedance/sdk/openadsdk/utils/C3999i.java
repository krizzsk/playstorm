package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.core.C3728w;

/* renamed from: com.bytedance.sdk.openadsdk.utils.i */
/* compiled from: JsBridgeUtils */
public class C3999i {
    /* renamed from: a */
    public static void m13114a(Uri uri, C3728w wVar) {
        if (wVar != null && wVar.mo20441a(uri)) {
            try {
                wVar.mo20447b(uri);
            } catch (Exception e) {
                C2975l.m8390d("WebView", "TTAndroidObj handleUri exception: " + e);
            }
        }
    }

    /* renamed from: a */
    public static String m13113a(WebView webView, int i) {
        if (webView == null) {
            return "";
        }
        String userAgentString = webView.getSettings().getUserAgentString();
        if (TextUtils.isEmpty(userAgentString)) {
            return "";
        }
        return userAgentString + " open_news" + " open_news_u_s/" + i;
    }
}
