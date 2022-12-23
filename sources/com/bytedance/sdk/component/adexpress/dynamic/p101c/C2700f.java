package com.bytedance.sdk.component.adexpress.dynamic.p101c;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.amazon.aps.shared.APSAnalytics;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h;
import com.bytedance.sdk.component.adexpress.dynamic.p102d.C2713b;
import com.bytedance.sdk.component.adexpress.p091a.p092a.C2599a;
import com.bytedance.sdk.component.adexpress.p091a.p093b.C2605b;
import com.bytedance.sdk.component.adexpress.p095b.C2633l;
import com.bytedance.sdk.component.adexpress.p096c.C2642b;
import com.bytedance.sdk.component.utils.C2963e;
import com.bytedance.sdk.component.utils.C2968h;
import com.bytedance.sdk.component.utils.C2971k;
import com.bytedance.sdk.component.widget.SSWebView;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.c.f */
/* compiled from: DynamicJsParser */
public class C2700f implements C2707i {

    /* renamed from: e */
    private static String f5930e;

    /* renamed from: f */
    private static final Set<String> f5931f = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"dislike", "close", "close-fill"})));
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f5932a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public SSWebView f5933b;

    /* renamed from: c */
    private String f5934c;

    /* renamed from: d */
    private C2713b f5935d;

    public C2700f(Context context, String str) {
        this.f5932a = context;
        this.f5934c = str;
        SSWebView sSWebView = new SSWebView(this.f5932a);
        this.f5933b = sSWebView;
        sSWebView.setJavaScriptEnabled(true);
        if (Build.VERSION.SDK_INT >= 17) {
            this.f5933b.mo17924a((Object) new C2702a(), "JS_DYNAMIC_LAYOUT_OBJ");
        }
        this.f5933b.mo17925a("about:blank");
        m7308a();
    }

    /* renamed from: a */
    public static void m7310a(String str) {
        f5930e = str;
    }

    /* renamed from: a */
    private void m7308a() {
        if (!m7321i() || Build.VERSION.SDK_INT < 19) {
            m7313b();
        } else {
            m7315c();
        }
        m7313b();
    }

    /* renamed from: b */
    private void m7313b() {
        SSWebView sSWebView;
        String e = m7317e();
        if (!TextUtils.isEmpty(e) && (sSWebView = this.f5933b) != null) {
            C2971k.m8372a(sSWebView.getWebView(), e);
        }
    }

    /* renamed from: c */
    private void m7315c() {
        try {
            String f = m7318f();
            String h = m7320h();
            if (TextUtils.isEmpty(h)) {
                m7313b();
                return;
            }
            SSWebView sSWebView = this.f5933b;
            sSWebView.mo17926a(f + h, (ValueCallback<String>) null);
        } catch (Throwable unused) {
            m7313b();
        }
    }

    /* renamed from: a */
    public void mo17198a(C2713b bVar) {
        this.f5935d = bVar;
    }

    /* renamed from: a */
    public void mo17197a(C2633l lVar) {
        C2713b bVar;
        if (TextUtils.isEmpty(f5930e) && (bVar = this.f5935d) != null) {
            bVar.mo16874a((C2688h) null);
            m7319g();
        }
        C2710l.m7357b(m7312b(lVar));
        m7316d();
    }

    /* renamed from: b */
    private String m7312b(C2633l lVar) {
        return lVar == null ? "" : lVar.mo16766r();
    }

    /* renamed from: d */
    private void m7316d() {
        String str = "javascript:var res = getLayoutInfo(" + this.f5934c + ");window." + "JS_DYNAMIC_LAYOUT_OBJ" + ".calculateResult(JSON.stringify(res));";
        SSWebView sSWebView = this.f5933b;
        if (sSWebView != null) {
            C2971k.m8372a(sSWebView.getWebView(), str);
        }
    }

    /* renamed from: e */
    private static String m7317e() {
        String str;
        if (TextUtils.isEmpty(f5930e)) {
            return null;
        }
        String f = m7318f();
        if (m7321i()) {
            str = "(function () {var se = document.createElement('script');se.type = 'text/javascript';se.src = '" + ("file//" + C2605b.m6655f() + "/" + C2963e.m8350a(f5930e)) + "';document.body.appendChild(se);})();";
        } else {
            str = "(function () {var JS_TTDYNAMIC_URL = '" + f5930e + "';var xhrObj = new XMLHttpRequest();xhrObj.open('GET', JS_TTDYNAMIC_URL, false);xhrObj.send('');var se = document.createElement('script');se.type = 'text/javascript';se.text = xhrObj.responseText;document.getElementsByTagName('head')[0].appendChild(se);})();";
        }
        return "javascript:" + f + str;
    }

    /* renamed from: f */
    private static String m7318f() {
        return "var global = Function('return this')();global.jsCoreGlobal = {width:" + C2642b.m6898b(C2599a.m6611a().mo16628c().mo16636b(), (float) C2642b.m6896a(C2599a.m6611a().mo16628c().mo16636b())) + ",height:" + C2642b.m6898b(C2599a.m6611a().mo16628c().mo16636b(), (float) C2642b.m6897b(C2599a.m6611a().mo16628c().mo16636b())) + ",os:'Android'};global.systemFontSizeRatioNative = " + 1.2d + ";";
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.c.f$a */
    /* compiled from: DynamicJsParser */
    private class C2702a {
        @JavascriptInterface
        public double systemFontSizeRatioNative() {
            return 1.2d;
        }

        private C2702a() {
        }

        @JavascriptInterface
        public String jsCoreGlobal() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("width", C2642b.m6898b(C2700f.this.f5932a, (float) C2642b.m6896a(C2700f.this.f5932a)));
                jSONObject.put("height", C2642b.m6898b(C2700f.this.f5932a, (float) C2642b.m6897b(C2700f.this.f5932a)));
                jSONObject.put("os", APSAnalytics.OS_NAME);
            } catch (Exception unused) {
            }
            return jSONObject.toString();
        }

        @JavascriptInterface
        public String getDomSizeFromNative(String str, String str2, String str3, boolean z, boolean z2, int i) {
            return C2710l.m7356b(str, str2, str3, z, z2, i);
        }

        @JavascriptInterface
        public void calculateResult(String str) {
            C2700f.this.m7314b(str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m7314b(String str) {
        C2688h hVar = new C2688h();
        try {
            C2688h.m7230a(new JSONObject(str), hVar, (C2688h) null);
        } catch (Exception unused) {
            hVar = null;
        }
        C2713b bVar = this.f5935d;
        if (bVar != null) {
            bVar.mo16874a(hVar);
        }
        m7319g();
    }

    /* renamed from: g */
    private void m7319g() {
        C2968h.m8367b().post(new Runnable() {
            public void run() {
                if (C2700f.this.f5933b != null) {
                    C2700f.this.f5933b.mo17952l();
                }
                SSWebView unused = C2700f.this.f5933b = null;
            }
        });
    }

    /* renamed from: h */
    private String m7320h() {
        try {
            return mo17196a((InputStream) new FileInputStream(C2605b.m6655f() + "/" + C2963e.m8350a(f5930e)));
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: i */
    private static boolean m7321i() {
        if (TextUtils.isEmpty(f5930e)) {
            return false;
        }
        String a = C2963e.m8350a(f5930e);
        if (TextUtils.isEmpty(a)) {
            return false;
        }
        return new File(C2605b.m6655f(), a).exists();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0042 A[SYNTHETIC, Splitter:B:25:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x004c A[SYNTHETIC, Splitter:B:30:0x004c] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo17196a(java.io.InputStream r8) {
        /*
            r7 = this;
            java.lang.String r0 = "is error"
            java.lang.String r1 = "br error"
            java.lang.String r2 = "TemplateToModelParser"
            r3 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0039 }
            r4.<init>()     // Catch:{ all -> 0x0039 }
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ all -> 0x0039 }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ all -> 0x0039 }
            r6.<init>(r8)     // Catch:{ all -> 0x0039 }
            r5.<init>(r6)     // Catch:{ all -> 0x0039 }
        L_0x0016:
            java.lang.String r6 = r5.readLine()     // Catch:{ all -> 0x0037 }
            if (r6 == 0) goto L_0x0020
            r4.append(r6)     // Catch:{ all -> 0x0037 }
            goto L_0x0016
        L_0x0020:
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0037 }
            r5.close()     // Catch:{ all -> 0x0028 }
            goto L_0x002c
        L_0x0028:
            r4 = move-exception
            com.bytedance.sdk.component.utils.C2975l.m8379a(r2, r1, r4)
        L_0x002c:
            if (r8 == 0) goto L_0x0036
            r8.close()     // Catch:{ all -> 0x0032 }
            goto L_0x0036
        L_0x0032:
            r8 = move-exception
            com.bytedance.sdk.component.utils.C2975l.m8379a(r2, r0, r8)
        L_0x0036:
            return r3
        L_0x0037:
            r4 = move-exception
            goto L_0x003b
        L_0x0039:
            r4 = move-exception
            r5 = r3
        L_0x003b:
            java.lang.String r6 = "readStream error"
            com.bytedance.sdk.component.utils.C2975l.m8379a(r2, r6, r4)     // Catch:{ all -> 0x0055 }
            if (r5 == 0) goto L_0x004a
            r5.close()     // Catch:{ all -> 0x0046 }
            goto L_0x004a
        L_0x0046:
            r4 = move-exception
            com.bytedance.sdk.component.utils.C2975l.m8379a(r2, r1, r4)
        L_0x004a:
            if (r8 == 0) goto L_0x0054
            r8.close()     // Catch:{ all -> 0x0050 }
            goto L_0x0054
        L_0x0050:
            r8 = move-exception
            com.bytedance.sdk.component.utils.C2975l.m8379a(r2, r0, r8)
        L_0x0054:
            return r3
        L_0x0055:
            r3 = move-exception
            if (r5 == 0) goto L_0x0060
            r5.close()     // Catch:{ all -> 0x005c }
            goto L_0x0060
        L_0x005c:
            r4 = move-exception
            com.bytedance.sdk.component.utils.C2975l.m8379a(r2, r1, r4)
        L_0x0060:
            if (r8 == 0) goto L_0x006a
            r8.close()     // Catch:{ all -> 0x0066 }
            goto L_0x006a
        L_0x0066:
            r8 = move-exception
            com.bytedance.sdk.component.utils.C2975l.m8379a(r2, r0, r8)
        L_0x006a:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.p101c.C2700f.mo17196a(java.io.InputStream):java.lang.String");
    }
}
