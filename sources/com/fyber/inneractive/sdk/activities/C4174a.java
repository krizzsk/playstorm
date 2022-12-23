package com.fyber.inneractive.sdk.activities;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.C4167R;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.C4419j;
import com.fyber.inneractive.sdk.network.C4567p;
import com.fyber.inneractive.sdk.network.C4569q;
import com.fyber.inneractive.sdk.network.C4574r;
import com.fyber.inneractive.sdk.response.C5291e;
import com.fyber.inneractive.sdk.util.C5320d0;
import com.fyber.inneractive.sdk.util.C5350l;
import com.fyber.inneractive.sdk.util.C5369r0;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.activities.a */
public class C4174a extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ InneractiveInternalBrowserActivity f10342a;

    public C4174a(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f10342a = inneractiveInternalBrowserActivity;
    }

    public void onPageFinished(WebView webView, String str) {
        Drawable drawable;
        Drawable drawable2;
        super.onPageFinished(webView, str);
        if (webView.canGoBack()) {
            drawable = C5350l.m16768d(C4167R.C4168drawable.ia_ib_left_arrow);
        } else {
            drawable = C5350l.m16768d(C4167R.C4168drawable.ia_ib_unleft_arrow);
        }
        this.f10342a.f10333e.setImageDrawable(drawable);
        if (webView.canGoForward()) {
            drawable2 = C5350l.m16768d(C4167R.C4168drawable.ia_ib_right_arrow);
        } else {
            drawable2 = C5350l.m16768d(C4167R.C4168drawable.ia_ib_unright_arrow);
        }
        this.f10342a.f10334f.setImageDrawable(drawable2);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f10342a.f10334f.setImageDrawable(C5350l.m16768d(C4167R.C4168drawable.ia_ib_unright_arrow));
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        IAlog.m16703e("Received Error on WebViewClient: Code: %d, Description: %s, failingUrl: %s", Integer.valueOf(i), str, str2);
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        C4574r.m14050a("WebViewRendererProcessGone", "Web view renderer process has gone. Web view destroyed", (InneractiveAdRequest) null, (C5291e) null);
        this.f10342a.finish();
        return true;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (C5369r0.m16782a(str)) {
            this.f10342a.f10332d.loadUrl("chrome://crash");
            return true;
        }
        C5320d0.C5321a a = C5320d0.m16717a(this.f10342a.getApplicationContext(), str, true, C5320d0.C5324d.DO_NOT_OPEN_IN_INTERNAL_BROWSER, this.f10342a.f10330b);
        if (a.f14158a == C5320d0.C5323c.FAILED) {
            return !str.startsWith("http");
        }
        InneractiveInternalBrowserActivity.InternalBrowserListener internalBrowserListener = InneractiveInternalBrowserActivity.f10328j;
        if (internalBrowserListener != null) {
            internalBrowserListener.onApplicationInBackground();
        }
        InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity = this.f10342a;
        if (!inneractiveInternalBrowserActivity.f10337i) {
            boolean unused = inneractiveInternalBrowserActivity.f10337i = true;
            C4567p pVar = C4567p.FYBER_SUCCESS_CLICK;
            C4419j jVar = this.f10342a.f10329a;
            InneractiveAdRequest inneractiveAdRequest = jVar != null ? jVar.f10913a : null;
            C4569q.C4570a aVar = new C4569q.C4570a(jVar != null ? jVar.mo24367c() : null);
            aVar.f11365c = pVar;
            aVar.f11363a = inneractiveAdRequest;
            aVar.f11366d = null;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", str);
            } catch (Exception unused2) {
                IAlog.m16703e("Got exception adding param to json object: %s, %s", "url", str);
            }
            String str2 = a.f14158a.toString();
            try {
                jSONObject.put("opened_from", str2);
            } catch (Exception unused3) {
                IAlog.m16703e("Got exception adding param to json object: %s, %s", "opened_from", str2);
            }
            try {
                jSONObject.put("opened_by", "internal_browser");
            } catch (Exception unused4) {
                IAlog.m16703e("Got exception adding param to json object: %s, %s", "opened_by", "internal_browser");
            }
            aVar.f11368f.put(jSONObject);
            aVar.mo24768a((String) null);
        }
        this.f10342a.finish();
        return true;
    }
}
