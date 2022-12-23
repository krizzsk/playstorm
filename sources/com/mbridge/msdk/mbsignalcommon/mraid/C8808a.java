package com.mbridge.msdk.mbsignalcommon.mraid;

import android.webkit.WebView;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.mbsignalcommon.mraid.a */
/* compiled from: CallMraidJS */
public final class C8808a {

    /* renamed from: com.mbridge.msdk.mbsignalcommon.mraid.a$a */
    /* compiled from: CallMraidJS */
    private static class C8809a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C8808a f21415a = new C8808a();
    }

    /* renamed from: a */
    public static C8808a m25622a() {
        return C8809a.f21415a;
    }

    /* renamed from: a */
    public final void mo58251a(WebView webView) {
        m25623c(webView, "javascript:window.mraidbridge.fireReadyEvent();");
    }

    /* renamed from: a */
    public final void mo58257a(WebView webView, Map<String, Object> map) {
        if (map != null && map.size() != 0) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry next : map.entrySet()) {
                try {
                    jSONObject.put((String) next.getKey(), next.getValue());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            m25623c(webView, String.format("javascript:window.mraidbridge.fireChangeEvent(%s);", new Object[]{jSONObject.toString()}));
        }
    }

    /* renamed from: a */
    public final void mo58256a(WebView webView, String str, String str2) {
        m25623c(webView, String.format("javascript:window.mraidbridge.fireErrorEvent('%1s', '%2s');", new Object[]{str2, str}));
    }

    /* renamed from: a */
    public final void mo58253a(WebView webView, float f, float f2) {
        m25623c(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.notifySizeChangeEvent(%.1f, %.1f);", new Object[]{Float.valueOf(f), Float.valueOf(f2)}));
    }

    /* renamed from: a */
    public final void mo58252a(WebView webView, double d) {
        m25623c(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.audioVolumeChange(%s);", new Object[]{Double.valueOf(d)}));
    }

    /* renamed from: b */
    public final void mo58258b(WebView webView, float f, float f2) {
        m25623c(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setScreenSize(%.1f, %.1f);", new Object[]{Float.valueOf(f), Float.valueOf(f2)}));
    }

    /* renamed from: c */
    public final void mo58261c(WebView webView, float f, float f2) {
        m25623c(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setMaxSize(%.1f, %.1f);", new Object[]{Float.valueOf(f), Float.valueOf(f2)}));
    }

    /* renamed from: a */
    public final void mo58254a(WebView webView, float f, float f2, float f3, float f4) {
        m25623c(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setDefaultPosition(%.1f, %.1f, %.1f, %.1f);", new Object[]{Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)}));
    }

    /* renamed from: b */
    public final void mo58259b(WebView webView, float f, float f2, float f3, float f4) {
        m25623c(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setCurrentPosition(%.1f, %.1f, %.1f, %.1f);", new Object[]{Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)}));
    }

    /* renamed from: a */
    public final void mo58255a(WebView webView, String str) {
        m25623c(webView, String.format("javascript:window.mraidbridge.nativeCallComplete('%s');", new Object[]{str}));
    }

    /* renamed from: b */
    public final void mo58260b(WebView webView, String str) {
        m25623c(webView, String.format("javascript:window.mraidbridge.setIsViewable(%s);", new Object[]{str}));
    }

    /* renamed from: c */
    private void m25623c(WebView webView, String str) {
        if (webView != null) {
            try {
                webView.loadUrl(str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
