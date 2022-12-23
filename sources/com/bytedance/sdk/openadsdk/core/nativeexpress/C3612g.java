package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.p091a.p093b.C2603a;
import com.bytedance.sdk.component.adexpress.p096c.C2643c;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.core.C3728w;
import com.bytedance.sdk.openadsdk.core.nativeexpress.p161a.C3594a;
import com.bytedance.sdk.openadsdk.core.p151e.C3484k;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.widget.p166a.C3749d;
import com.bytedance.sdk.openadsdk.p130b.C3171n;
import com.bytedance.sdk.openadsdk.p167d.C3769a;
import java.io.InputStream;
import java.util.Iterator;

/* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.g */
/* compiled from: ExpressClient */
public class C3612g extends C3749d {

    /* renamed from: a */
    private C3498n f9154a;

    public C3612g(Context context, C3728w wVar, C3498n nVar, C3171n nVar2) {
        super(context, wVar, nVar.mo19622Y(), nVar2, false);
        this.f9154a = nVar;
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        try {
            return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
        } catch (Throwable th) {
            C2975l.m8388c("ExpressClient", "shouldInterceptRequest error1", th);
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            WebResourceResponse a = m11426a(webView, str);
            m11428a(currentTimeMillis, System.currentTimeMillis(), str, a != null ? 1 : 2);
            if (a != null) {
                return a;
            }
        } catch (Throwable th) {
            C2975l.m8388c("ExpressClient", "shouldInterceptRequest error2", th);
        }
        return super.shouldInterceptRequest(webView, str);
    }

    public void onPageFinished(WebView webView, String str) {
        this.f9745g = false;
        super.onPageFinished(webView, str);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f9746h = false;
        super.onPageStarted(webView, str, bitmap);
    }

    /* renamed from: a */
    private WebResourceResponse m11426a(WebView webView, String str) {
        C3484k kVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C2643c.C2644a a = C2643c.m6902a(str);
        if (a != C2643c.C2644a.IMAGE) {
            Iterator<C3484k> it = this.f9154a.mo19613P().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C3484k next = it.next();
                if (!TextUtils.isEmpty(next.mo19559a()) && !TextUtils.isEmpty(str)) {
                    String a2 = next.mo19559a();
                    if (a2.startsWith("https")) {
                        a2 = a2.replaceFirst("https", "http");
                    }
                    if ((str.startsWith("https") ? str.replaceFirst("https", "http") : str).equals(a2)) {
                        kVar = next;
                        break;
                    }
                }
            }
        }
        if (a == C2643c.C2644a.IMAGE || kVar != null) {
            return m11427a(str, C3594a.m11339a(this.f9154a, str));
        }
        return C2603a.m6636a(str, a, "");
    }

    /* renamed from: a */
    private WebResourceResponse m11427a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            InputStream a = C3769a.m12390a(str, str2);
            if (a != null) {
                return new WebResourceResponse(C2643c.C2644a.IMAGE.mo16812a(), "utf-8", a);
            }
            return null;
        } catch (Throwable th) {
            C2975l.m8388c("ExpressClient", "get image WebResourceResponse error", th);
            return null;
        }
    }

    /* renamed from: a */
    private void m11428a(long j, long j2, String str, int i) {
        if (this.f9744f != null && this.f9744f.mo18788b() != null) {
            C2643c.C2644a a = C2643c.m6902a(str);
            if (a == C2643c.C2644a.HTML) {
                this.f9744f.mo18788b().mo18811a(str, j, j2, i);
            } else if (a == C2643c.C2644a.JS) {
                this.f9744f.mo18788b().mo18818b(str, j, j2, i);
            }
        }
    }
}
