package com.bytedance.sdk.openadsdk.utils;

import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.common.net.HttpHeaders;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.utils.j */
/* compiled from: NetUtils */
public class C4000j {
    /* renamed from: a */
    public static void m13115a(SSWebView sSWebView, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(HttpHeaders.REFERER, TTAdConstant.REQUEST_HEAD_REFERER);
        sSWebView.mo17928a(str, (Map<String, String>) hashMap);
    }
}
