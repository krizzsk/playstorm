package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.DownloadListener;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.amazon.aps.shared.APSAnalytics;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.security.CertificateUtil;
import com.facebook.share.internal.ShareInternalUtility;
import com.inmobi.media.C5976de;
import com.ironsource.environment.C6399a;
import com.ironsource.environment.C6408c;
import com.ironsource.environment.C6429h;
import com.ironsource.environment.C6434k;
import com.ironsource.environment.p205e.C6421a;
import com.ironsource.mediationsdk.adunit.p208a.C6590a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.p200d.C6392a;
import com.ironsource.sdk.controller.C8192f;
import com.ironsource.sdk.controller.C8220k;
import com.ironsource.sdk.controller.C8222l;
import com.ironsource.sdk.controller.C8242r;
import com.ironsource.sdk.controller.C8249v;
import com.ironsource.sdk.p286a.C8150a;
import com.ironsource.sdk.p286a.C8151b;
import com.ironsource.sdk.p286a.C8154d;
import com.ironsource.sdk.p286a.C8156f;
import com.ironsource.sdk.p288c.C8166a;
import com.ironsource.sdk.p288c.C8173d;
import com.ironsource.sdk.p288c.C8175e;
import com.ironsource.sdk.p292f.C8336a;
import com.ironsource.sdk.p293g.C8339a;
import com.ironsource.sdk.p293g.C8340b;
import com.ironsource.sdk.p293g.C8342c;
import com.ironsource.sdk.p293g.C8343d;
import com.ironsource.sdk.p293g.C8349e;
import com.ironsource.sdk.p293g.C8350f;
import com.ironsource.sdk.p294h.C8351a;
import com.ironsource.sdk.p294h.C8352b;
import com.ironsource.sdk.p294h.C8355c;
import com.ironsource.sdk.p296j.C8368e;
import com.ironsource.sdk.p296j.C8370g;
import com.ironsource.sdk.p296j.p297a.C8361a;
import com.ironsource.sdk.p296j.p297a.C8362b;
import com.ironsource.sdk.p296j.p297a.C8363c;
import com.ironsource.sdk.p296j.p297a.C8364d;
import com.ironsource.sdk.p298k.C8372b;
import com.ironsource.sdk.p298k.C8376c;
import com.ironsource.sdk.service.C8385a;
import com.ironsource.sdk.service.C8387c;
import com.ironsource.sdk.service.Connectivity.C8380b;
import com.ironsource.sdk.utils.C8391a;
import com.ironsource.sdk.utils.C8392b;
import com.ironsource.sdk.utils.C8395d;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.ReportDBAdapter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.x */
public class C8252x extends WebView implements DownloadListener, C8224m, C8376c {
    /* access modifiers changed from: private */

    /* renamed from: ab */
    public static String f19736ab = "success";
    /* access modifiers changed from: private */

    /* renamed from: ac */
    public static String f19737ac = "fail";

    /* renamed from: b */
    public static String f19738b = "is_store";

    /* renamed from: c */
    public static String f19739c = "external_url";

    /* renamed from: d */
    public static String f19740d = "secondary_web_view";

    /* renamed from: y */
    private static int f19741y;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public String f19742A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public String f19743B;

    /* renamed from: C */
    private Map<String, String> f19744C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C8372b f19745D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public boolean f19746E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public boolean f19747F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public CountDownTimer f19748G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public int f19749H = 50;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public int f19750I = 50;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public String f19751J = C5976de.DEFAULT_POSITION;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public FrameLayout f19752K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public WebChromeClient.CustomViewCallback f19753L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public C8364d f19754M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public C8363c f19755N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public C8368e f19756O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public C8362b f19757P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public Boolean f19758Q = null;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public String f19759R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public C8192f f19760S;

    /* renamed from: T */
    private Object f19761T = new Object();
    /* access modifiers changed from: private */

    /* renamed from: U */
    public boolean f19762U = false;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public C8219j f19763V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public C8191e f19764W;
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public String f19765a = C8252x.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: aa */
    public C8380b f19766aa;
    /* access modifiers changed from: package-private */

    /* renamed from: e */
    public C8273b f19767e;

    /* renamed from: f */
    public CountDownTimer f19768f;

    /* renamed from: g */
    C8272a f19769g;
    /* access modifiers changed from: package-private */

    /* renamed from: h */
    public View f19770h;
    /* access modifiers changed from: package-private */

    /* renamed from: i */
    public FrameLayout f19771i;
    /* access modifiers changed from: package-private */

    /* renamed from: j */
    public C8308g f19772j;

    /* renamed from: k */
    String f19773k;
    /* access modifiers changed from: package-private */

    /* renamed from: l */
    public C8251w f19774l;
    /* access modifiers changed from: package-private */

    /* renamed from: m */
    public C8340b f19775m;
    /* access modifiers changed from: package-private */

    /* renamed from: n */
    public C8240q f19776n;
    /* access modifiers changed from: package-private */

    /* renamed from: o */
    public C8242r f19777o;
    /* access modifiers changed from: package-private */

    /* renamed from: p */
    public C8249v f19778p;
    /* access modifiers changed from: package-private */

    /* renamed from: q */
    public C8220k f19779q;
    /* access modifiers changed from: package-private */

    /* renamed from: r */
    public C8185a f19780r;
    /* access modifiers changed from: package-private */

    /* renamed from: s */
    public C8222l f19781s;

    /* renamed from: t */
    C8312y f19782t;

    /* renamed from: u */
    C8189c f19783u;
    /* access modifiers changed from: package-private */

    /* renamed from: v */
    public C8370g f19784v;

    /* renamed from: w */
    private final C6421a f19785w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public String f19786x = IronSourceConstants.IRONSOURCE_CONFIG_NAME;

    /* renamed from: z */
    private final String f19787z = "We're sorry, some error occurred. we will investigate it";

    /* renamed from: com.ironsource.sdk.controller.x$a */
    class C8272a extends WebChromeClient {
        private C8272a() {
        }

        /* synthetic */ C8272a(C8252x xVar, byte b) {
            this();
        }

        public final View getVideoLoadingProgressView() {
            FrameLayout frameLayout = new FrameLayout(C8252x.this.f19783u.mo56507a());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return frameLayout;
        }

        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Logger.m24028i("MyApplication", consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
            return true;
        }

        public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(this);
            webView2.setWebViewClient(new C8274c(C8252x.this, (byte) 0));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.m24028i("onCreateWindow", "onCreateWindow");
            return true;
        }

        public final void onHideCustomView() {
            Logger.m24028i("Test", "onHideCustomView");
            if (C8252x.this.f19770h != null) {
                C8252x.this.f19770h.setVisibility(8);
                C8252x.this.f19752K.removeView(C8252x.this.f19770h);
                View unused = C8252x.this.f19770h = null;
                C8252x.this.f19752K.setVisibility(8);
                C8252x.this.f19753L.onCustomViewHidden();
                C8252x.this.setVisibility(0);
            }
        }

        public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            Logger.m24028i("Test", "onShowCustomView");
            C8252x.this.setVisibility(8);
            if (C8252x.this.f19770h != null) {
                Logger.m24028i("Test", "mCustomView != null");
                customViewCallback.onCustomViewHidden();
                return;
            }
            Logger.m24028i("Test", "mCustomView == null");
            C8252x.this.f19752K.addView(view);
            View unused = C8252x.this.f19770h = view;
            WebChromeClient.CustomViewCallback unused2 = C8252x.this.f19753L = customViewCallback;
            C8252x.this.f19752K.setVisibility(0);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.x$b */
    static class C8273b {

        /* renamed from: a */
        C8343d.C8348e f19823a;

        /* renamed from: b */
        String f19824b;

        public C8273b(C8343d.C8348e eVar, String str) {
            this.f19823a = eVar;
            this.f19824b = str;
        }
    }

    /* renamed from: com.ironsource.sdk.controller.x$c */
    class C8274c extends WebViewClient {
        private C8274c() {
        }

        /* synthetic */ C8274c(C8252x xVar, byte b) {
            this();
        }

        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            String b = C8252x.this.f19765a;
            Logger.m24026e(b, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Activity a = C8252x.this.f19783u.mo56507a();
            Intent intent = new Intent(a, OpenUrlActivity.class);
            intent.putExtra(C8252x.f19739c, str);
            intent.putExtra(C8252x.f19740d, false);
            a.startActivity(intent);
            return true;
        }
    }

    /* renamed from: com.ironsource.sdk.controller.x$d */
    public class C8275d {

        /* renamed from: com.ironsource.sdk.controller.x$d$a */
        public class C8305a {
            public C8305a() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public final void mo56757a(boolean z, String str, C8350f fVar) {
                fVar.mo56861a(z ? C8252x.f19736ab : C8252x.f19737ac, str);
                C8252x.m23692a(C8252x.this, fVar.toString(), z, (String) null, (String) null);
            }

            /* renamed from: a */
            public final void mo56758a(boolean z, String str, JSONObject jSONObject) {
                String str2;
                if (z) {
                    try {
                        str2 = C8252x.f19736ab;
                    } catch (JSONException e) {
                        e.printStackTrace();
                        e.getMessage();
                        return;
                    }
                } else {
                    str2 = C8252x.f19737ac;
                }
                jSONObject.put(str2, str);
                C8252x.m23692a(C8252x.this, jSONObject.toString(), z, (String) null, (String) null);
            }
        }

        public C8275d() {
        }

        /* renamed from: a */
        private void m23801a(String str, boolean z) {
            C8342c a = C8252x.this.f19763V.mo56571a(C8343d.C8348e.Interstitial, str);
            if (a != null) {
                a.f20024f = z;
            }
        }

        /* renamed from: a */
        private void m23802a(JSONObject jSONObject) {
            try {
                FeaturesManager instance = FeaturesManager.getInstance();
                if (!instance.mo56484a().isEmpty()) {
                    jSONObject.put("nativeFeatures", new JSONArray(instance.mo56484a()));
                }
            } catch (Exception e) {
                C8154d.m23442a(C8156f.f19431m, (Map<String, Object>) new C8150a().mo56415a("callfailreason", e.getMessage()).f19410a);
                Logger.m24024d(C8252x.this.f19765a, "getControllerConfig Error while adding supported features data from FeaturesManager");
            }
        }

        /* renamed from: a */
        private void m23803a(JSONObject jSONObject, String str) {
            if (m23804a(str)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(str);
                    jSONObject.putOpt("testerABGroup", jSONObject2.get("testerABGroup"));
                    jSONObject.putOpt("testFriendlyName", jSONObject2.get("testFriendlyName"));
                } catch (JSONException unused) {
                    Logger.m24024d(C8252x.this.f19765a, "getControllerConfig Error while parsing Tester AB Group parameters");
                }
            }
        }

        /* renamed from: a */
        private static boolean m23804a(String str) {
            if (TextUtils.isEmpty(str) || str.contains("-1")) {
                return false;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return !jSONObject.getString("testerABGroup").isEmpty() && !jSONObject.getString("testFriendlyName").isEmpty();
            } catch (JSONException e) {
                e.printStackTrace();
                return false;
            }
        }

        /* renamed from: b */
        private void m23805b(JSONObject jSONObject) {
            try {
                jSONObject.put("controllerSourceData", C8252x.this.f19760S.mo56521f());
            } catch (Exception unused) {
            }
        }

        @JavascriptInterface
        public void adClicked(String str) {
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "adClicked(" + str + ")");
            C8350f fVar = new C8350f(str);
            String d = fVar.mo56866d("productType");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (!TextUtils.isEmpty(fetchDemandSourceId)) {
                final C8343d.C8348e e = C8252x.m23726h(d);
                final C8361a a = C8252x.this.m23701b(e);
                if (e != null && a != null) {
                    C8252x.this.mo56623c((Runnable) new Runnable() {
                        public final void run() {
                            a.mo56798b(e, fetchDemandSourceId);
                        }
                    });
                }
            }
        }

        @JavascriptInterface
        public void adCredited(String str) {
            final String str2;
            final boolean z;
            final boolean z2;
            C8342c a;
            Log.d(C8252x.this.f19786x, "adCredited(" + str + ")");
            C8350f fVar = new C8350f(str);
            String d = fVar.mo56866d("credits");
            boolean z3 = false;
            final int parseInt = d != null ? Integer.parseInt(d) : 0;
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            final String d2 = fVar.mo56866d("productType");
            if (TextUtils.isEmpty(d2)) {
                Log.d(C8252x.this.f19786x, "adCredited | product type is missing");
            }
            if (!C8343d.C8348e.Interstitial.toString().equalsIgnoreCase(d2)) {
                String d3 = fVar.mo56866d("total");
                final int parseInt2 = d3 != null ? Integer.parseInt(d3) : 0;
                if (!C8343d.C8348e.OfferWall.toString().equalsIgnoreCase(d2)) {
                    z2 = false;
                    z = false;
                    str2 = null;
                } else if (fVar.mo56864b(InAppPurchaseMetaData.KEY_SIGNATURE) || fVar.mo56864b("timestamp") || fVar.mo56864b("totalCreditsFlag")) {
                    C8252x.m23692a(C8252x.this, str, false, "One of the keys are missing: signature/timestamp/totalCreditsFlag", (String) null);
                    return;
                } else {
                    if (fVar.mo56866d(InAppPurchaseMetaData.KEY_SIGNATURE).equalsIgnoreCase(SDKUtils.getMD5(d3 + C8252x.this.f19742A + C8252x.this.f19743B))) {
                        z3 = true;
                    } else {
                        C8252x.m23692a(C8252x.this, str, false, "Controller signature is not equal to SDK signature", (String) null);
                    }
                    boolean e = fVar.mo56867e("totalCreditsFlag");
                    str2 = fVar.mo56866d("timestamp");
                    z = e;
                    z2 = z3;
                }
                if (C8252x.this.mo56620a(d2)) {
                    final String str3 = str;
                    C8252x.this.mo56623c((Runnable) new Runnable() {
                        public final void run() {
                            if (d2.equalsIgnoreCase(C8343d.C8348e.RewardedVideo.toString())) {
                                C8252x.this.f19754M.mo56785a(fetchDemandSourceId, parseInt);
                            } else if (d2.equalsIgnoreCase(C8343d.C8348e.OfferWall.toString()) && z2 && C8252x.this.f19756O.onOWAdCredited(parseInt, parseInt2, z) && !TextUtils.isEmpty(str2)) {
                                if (C8392b.m24037a().mo56913a(str2, C8252x.this.f19742A, C8252x.this.f19743B)) {
                                    C8252x.m23692a(C8252x.this, str3, true, (String) null, (String) null);
                                } else {
                                    C8252x.m23692a(C8252x.this, str3, false, "Time Stamp could not be stored", (String) null);
                                }
                            }
                        }
                    });
                }
            } else if (C8252x.this.mo56620a(C8343d.C8348e.Interstitial.toString()) && (a = C8252x.this.f19763V.mo56571a(C8343d.C8348e.Interstitial, fetchDemandSourceId)) != null) {
                if (a.f20022d != null && a.f20022d.containsKey("rewarded")) {
                    z3 = Boolean.parseBoolean(a.f20022d.get("rewarded"));
                }
                if (z3) {
                    C8252x.this.mo56623c((Runnable) new Runnable() {
                        public final void run() {
                            C8252x.this.f19755N.mo56800b(fetchDemandSourceId, parseInt);
                        }
                    });
                }
            }
        }

        @JavascriptInterface
        public void adUnitsReady(String str) {
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "adUnitsReady(" + str + ")");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C8350f(str));
            final C8339a aVar = new C8339a(str);
            if (!aVar.f20000c) {
                C8252x.m23692a(C8252x.this, str, false, "Num Of Ad Units Do Not Exist", (String) null);
                return;
            }
            C8252x.m23692a(C8252x.this, str, true, (String) null, (String) null);
            String str2 = aVar.f19998a;
            if (C8343d.C8348e.RewardedVideo.toString().equalsIgnoreCase(str2) && C8252x.this.mo56620a(str2)) {
                final int parseInt = Integer.parseInt(aVar.f19999b);
                C8252x.this.mo56623c((Runnable) new Runnable() {
                    public final void run() {
                        if (parseInt > 0) {
                            Log.d(C8252x.this.f19765a, "onRVInitSuccess()");
                            C8252x.this.f19754M.mo56781a(C8343d.C8348e.RewardedVideo, fetchDemandSourceId, aVar);
                            return;
                        }
                        C8252x.this.f19754M.mo56799b(fetchDemandSourceId);
                    }
                });
            }
        }

        @JavascriptInterface
        public void adViewAPI(String str) {
            try {
                String b = C8252x.this.f19765a;
                Logger.m24028i(b, "adViewAPI(" + str + ")");
                C8252x.this.f19780r.mo56503a(new C8350f(str).toString(), new C8305a());
            } catch (Exception e) {
                e.printStackTrace();
                String b2 = C8252x.this.f19765a;
                Logger.m24028i(b2, "adViewAPI failed with exception " + e.getMessage());
            }
        }

        @JavascriptInterface
        public void bannerViewAPI(String str) {
            Logger.m24026e(C8252x.this.f19765a, "bannerViewAPI is not supported in this native version, only adview API");
        }

        @JavascriptInterface
        public void cleanAdInstance(String str) {
            C8343d.C8348e e;
            Map<String, C8342c> a;
            C8342c remove;
            try {
                String b = C8252x.this.f19765a;
                Logger.m24028i(b, "cleanAdInstance(" + str + ")");
                C8350f fVar = new C8350f(str);
                String d = fVar.mo56866d("productType");
                String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
                if (!TextUtils.isEmpty(fetchDemandSourceId) && (e = C8252x.m23726h(d)) != null) {
                    C8219j y = C8252x.this.f19763V;
                    if (!TextUtils.isEmpty(fetchDemandSourceId) && (a = y.mo56573a(e)) != null && (remove = a.remove(fetchDemandSourceId)) != null) {
                        remove.f20025g = null;
                        if (remove.f20022d != null) {
                            remove.f20022d.clear();
                        }
                        remove.f20022d = null;
                    }
                }
            } catch (Exception e2) {
                C8252x.m23692a(C8252x.this, str, false, e2.getMessage(), (String) null);
                e2.printStackTrace();
            }
        }

        @JavascriptInterface
        public void clearLastUpdateTimeData(String str) {
            try {
                C8392b a = C8392b.m24037a();
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) a.f20136a.getAll().keySet().toArray(new String[0]);
                SharedPreferences.Editor edit = a.f20136a.edit();
                for (String str2 : strArr) {
                    if (C8392b.m24039b(str2)) {
                        arrayList.add(str2);
                        edit.remove(str2);
                    }
                }
                edit.apply();
                C8350f fVar = new C8350f(str);
                if (!arrayList.isEmpty()) {
                    fVar.mo56861a("removedAdsLastUpdateTime", arrayList.toString());
                }
                C8252x.m23692a(C8252x.this, fVar.toString(), true, (String) null, (String) null);
            } catch (Exception e) {
                C8252x.m23692a(C8252x.this, str, false, e.getMessage(), (String) null);
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void deleteFile(String str) {
            try {
                String b = C8252x.this.f19765a;
                Logger.m24028i(b, "deleteFile(" + str + ")");
                C8350f fVar = new C8350f(str);
                String d = fVar.mo56866d(ShareInternalUtility.STAGING_PARAM);
                String d2 = fVar.mo56866d("path");
                if (d2 != null) {
                    if (!TextUtils.isEmpty(d)) {
                        C8355c cVar = new C8355c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(C8252x.this.f19759R, d2), d);
                        if (!cVar.exists()) {
                            C8252x.m23692a(C8252x.this, str, false, "File not exist", "1");
                            return;
                        }
                        C8252x.m23692a(C8252x.this, str, IronSourceStorageUtils.deleteFile(cVar), (String) null, (String) null);
                        return;
                    }
                }
                C8252x.m23692a(C8252x.this, str, false, "Missing parameters for file", "1");
            } catch (Exception e) {
                C8252x.m23692a(C8252x.this, str, false, e.getMessage(), (String) null);
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void deleteFolder(String str) {
            try {
                String b = C8252x.this.f19765a;
                Logger.m24028i(b, "deleteFolder(" + str + ")");
                String d = new C8350f(str).mo56866d("path");
                if (d == null) {
                    C8252x.m23692a(C8252x.this, str, false, "Missing parameters for file", "1");
                    return;
                }
                C8355c cVar = new C8355c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(C8252x.this.f19759R, d));
                if (!cVar.exists()) {
                    C8252x.m23692a(C8252x.this, str, false, "Folder not exist", "1");
                    return;
                }
                C8252x.m23692a(C8252x.this, str, IronSourceStorageUtils.deleteFolder(cVar.getPath()), (String) null, (String) null);
            } catch (Exception e) {
                C8252x.m23692a(C8252x.this, str, false, e.getMessage(), (String) null);
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void deviceDataAPI(String str) {
            try {
                String b = C8252x.this.f19765a;
                Logger.m24028i(b, "deviceDataAPI(" + str + ")");
                C8350f fVar = new C8350f(str);
                C8220k I = C8252x.this.f19779q;
                String fVar2 = fVar.toString();
                C8305a aVar = new C8305a();
                JSONObject jSONObject = new JSONObject(fVar2);
                C8220k.C8221a aVar2 = new C8220k.C8221a((byte) 0);
                aVar2.f19653a = jSONObject.optString("deviceDataFunction");
                aVar2.f19654b = jSONObject.optJSONObject("deviceDataParams");
                aVar2.f19655c = jSONObject.optString("success");
                aVar2.f19656d = jSONObject.optString("fail");
                if ("getDeviceData".equals(aVar2.f19653a)) {
                    String str2 = aVar2.f19655c;
                    C8350f fVar3 = new C8350f();
                    fVar3.mo56861a(SDKUtils.encodeString("sdCardAvailable"), SDKUtils.encodeString(String.valueOf(C6429h.m19313d())));
                    fVar3.mo56861a(SDKUtils.encodeString("totalDeviceRAM"), SDKUtils.encodeString(String.valueOf(C6429h.m19312d(I.f19652a))));
                    fVar3.mo56861a(SDKUtils.encodeString("isCharging"), SDKUtils.encodeString(String.valueOf(C6429h.m19316e(I.f19652a))));
                    fVar3.mo56861a(SDKUtils.encodeString("chargingType"), SDKUtils.encodeString(String.valueOf(C6429h.m19318f(I.f19652a))));
                    fVar3.mo56861a(SDKUtils.encodeString("airplaneMode"), SDKUtils.encodeString(String.valueOf(C6429h.m19320g(I.f19652a))));
                    fVar3.mo56861a(SDKUtils.encodeString("stayOnWhenPluggedIn"), SDKUtils.encodeString(String.valueOf(C6429h.m19322h(I.f19652a))));
                    aVar.mo56757a(true, str2, fVar3);
                    return;
                }
                String str3 = C8220k.f19651b;
                Logger.m24028i(str3, "unhandled API request " + fVar2);
            } catch (Exception e) {
                e.printStackTrace();
                String b2 = C8252x.this.f19765a;
                Logger.m24028i(b2, "deviceDataAPI failed with exception " + e.getMessage());
            }
        }

        @JavascriptInterface
        public void displayWebView(String str) {
            int i;
            Logger.m24028i(C8252x.this.f19765a, "displayWebView(" + str + ")");
            C8252x.m23692a(C8252x.this, str, true, (String) null, (String) null);
            C8350f fVar = new C8350f(str);
            boolean booleanValue = ((Boolean) fVar.mo56865c("display")).booleanValue();
            String d = fVar.mo56866d("productType");
            boolean e = fVar.mo56867e("standaloneView");
            String d2 = fVar.mo56866d("adViewId");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            boolean e2 = fVar.mo56867e("ctrWVPauseResume");
            if (booleanValue) {
                boolean unused = C8252x.this.f19762U = fVar.mo56867e("immersive");
                boolean e3 = fVar.mo56867e("activityThemeTranslucent");
                if (C8252x.this.f19772j != C8308g.Display) {
                    C8252x.this.f19772j = C8308g.Display;
                    Logger.m24028i(C8252x.this.f19765a, "State: " + C8252x.this.f19772j);
                    Activity a = C8252x.this.f19783u.mo56507a();
                    String str2 = C8252x.this.f19773k;
                    int k = C6429h.m19328k(a);
                    if (e) {
                        C8216i iVar = new C8216i(a);
                        iVar.addView(C8252x.this.f19771i);
                        iVar.f19645b = C8252x.this;
                        iVar.f19645b.f19784v = iVar;
                        iVar.f19645b.requestFocus();
                        iVar.f19644a = iVar.f19645b.f19783u.mo56507a();
                        if (((((Activity) iVar.f19644a).getWindow().getAttributes().flags & 1024) != 0) || (i = iVar.mo56565a()) <= 0) {
                            i = 0;
                        }
                        int b = iVar.mo56566b();
                        try {
                            if (iVar.f19644a != null) {
                                int o = C6429h.m19336o(iVar.f19644a);
                                if (o == 1) {
                                    iVar.setPadding(0, i, 0, b);
                                } else if (o == 2) {
                                    iVar.setPadding(0, i, b, 0);
                                }
                            }
                        } catch (Exception unused2) {
                        }
                        ((Activity) iVar.f19644a).runOnUiThread(new Runnable() {
                            public final void run(
/*
Method generation error in method: com.ironsource.sdk.controller.i.1.run():void, dex: classes3.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.sdk.controller.i.1.run():void, class status: UNLOADED
                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                            
*/
                        });
                        return;
                    }
                    Intent intent = e3 ? new Intent(a, InterstitialActivity.class) : new Intent(a, ControllerActivity.class);
                    if (C8343d.C8348e.RewardedVideo.toString().equalsIgnoreCase(d)) {
                        if ("application".equals(str2)) {
                            str2 = SDKUtils.translateRequestedOrientation(C6429h.m19332m(a));
                        }
                        intent.putExtra("productType", C8343d.C8348e.RewardedVideo.toString());
                        C8252x.this.f19775m.f20008e = C8343d.C8348e.RewardedVideo.ordinal();
                        C8252x.this.f19775m.f20006c = fetchDemandSourceId;
                        if (C8252x.this.mo56620a(C8343d.C8348e.RewardedVideo.toString())) {
                            C8252x.this.f19754M.mo56804c(C8343d.C8348e.RewardedVideo, fetchDemandSourceId);
                        }
                    } else if (C8343d.C8348e.OfferWall.toString().equalsIgnoreCase(d)) {
                        intent.putExtra("productType", C8343d.C8348e.OfferWall.toString());
                        C8252x.this.f19775m.f20008e = C8343d.C8348e.OfferWall.ordinal();
                    } else if (C8343d.C8348e.Interstitial.toString().equalsIgnoreCase(d)) {
                        if ("application".equals(str2)) {
                            str2 = SDKUtils.translateRequestedOrientation(C6429h.m19332m(a));
                        }
                        intent.putExtra("productType", C8343d.C8348e.Interstitial.toString());
                    }
                    if (d2 != null) {
                        intent.putExtra("adViewId", d2);
                    }
                    intent.putExtra("ctrWVPauseResume", e2);
                    intent.setFlags(536870912);
                    intent.putExtra("immersive", C8252x.this.f19762U);
                    intent.putExtra("orientation_set_flag", str2);
                    intent.putExtra("rotation_set_flag", k);
                    C8273b unused3 = C8252x.this.f19767e = new C8273b(C8252x.m23726h(d), fetchDemandSourceId);
                    a.startActivity(intent);
                    return;
                }
                Logger.m24028i(C8252x.this.f19765a, "State: " + C8252x.this.f19772j);
                return;
            }
            C8252x.this.f19772j = C8308g.Gone;
            C8252x.this.mo56628j();
        }

        @JavascriptInterface
        public void fileSystemAPI(final String str) {
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "fileSystemAPI(" + str + ")");
            C8252x.this.mo56621b((Runnable) new Runnable() {
                public final void run() {
                    JSONObject a;
                    try {
                        C8222l r = C8252x.this.f19781s;
                        JSONObject jSONObject = new JSONObject(str);
                        C8305a aVar = new C8305a();
                        C8225n nVar = new C8225n(jSONObject);
                        C8226o oVar = new C8226o(aVar);
                        try {
                            String str = nVar.f19662a;
                            JSONObject jSONObject2 = nVar.f19663b;
                            char c = 65535;
                            boolean z = false;
                            switch (str.hashCode()) {
                                case -2073025383:
                                    if (str.equals("saveFile")) {
                                        c = 0;
                                        break;
                                    }
                                    break;
                                case -1137024519:
                                    if (str.equals("deleteFolder")) {
                                        c = 2;
                                        break;
                                    }
                                    break;
                                case -318115535:
                                    if (str.equals("getTotalSizeOfFiles")) {
                                        c = 4;
                                        break;
                                    }
                                    break;
                                case 537556755:
                                    if (str.equals("updateAttributesOfFile")) {
                                        c = 5;
                                        break;
                                    }
                                    break;
                                case 1764172231:
                                    if (str.equals("deleteFile")) {
                                        c = 1;
                                        break;
                                    }
                                    break;
                                case 1953259713:
                                    if (str.equals("getFiles")) {
                                        c = 3;
                                        break;
                                    }
                                    break;
                            }
                            if (c != 0) {
                                if (c == 1) {
                                    C8355c a2 = C8222l.m23591a(jSONObject2, r.f19657a);
                                    C8352b bVar = r.f19658b;
                                    if (a2.exists()) {
                                        if (a2.delete()) {
                                            bVar.f20070d.mo56873a(a2.getName());
                                        } else {
                                            throw new Exception("Failed to delete file");
                                        }
                                    }
                                    a = C8222l.m23594a(nVar, a2.mo56870a());
                                } else if (c == 2) {
                                    C8355c b = C8222l.m23595b(jSONObject2, r.f19657a);
                                    C8352b bVar2 = r.f19658b;
                                    if (b.exists()) {
                                        ArrayList<C8355c> filesInFolderRecursive = IronSourceStorageUtils.getFilesInFolderRecursive(b);
                                        if (IronSourceStorageUtils.deleteFolderContentRecursive(b) && b.delete()) {
                                            z = true;
                                        }
                                        if (z) {
                                            bVar2.f20070d.mo56875a(filesInFolderRecursive);
                                        } else {
                                            throw new Exception("Failed to delete folder");
                                        }
                                    }
                                    a = C8222l.m23594a(nVar, b.mo56870a());
                                } else if (c == 3) {
                                    C8355c b2 = C8222l.m23595b(jSONObject2, r.f19657a);
                                    C8352b bVar3 = r.f19658b;
                                    if (b2.exists()) {
                                        a = C8222l.m23594a(nVar, IronSourceStorageUtils.buildFilesMapOfDirectory(b2, bVar3.f20070d.mo56872a()));
                                    } else {
                                        throw new Exception("Folder does not exist");
                                    }
                                } else if (c == 4) {
                                    C8355c b3 = C8222l.m23595b(jSONObject2, r.f19657a);
                                    if (b3.exists()) {
                                        a = C8222l.m23592a(nVar, IronSourceStorageUtils.getTotalSizeOfDir(b3));
                                    } else {
                                        throw new Exception("Folder does not exist");
                                    }
                                } else if (c == 5) {
                                    C8355c a3 = C8222l.m23591a(jSONObject2, r.f19657a);
                                    JSONObject optJSONObject = jSONObject2.optJSONObject("attributesToUpdate");
                                    C8352b bVar4 = r.f19658b;
                                    if (optJSONObject == null) {
                                        throw new Exception("Missing attributes to update");
                                    } else if (!a3.exists()) {
                                        throw new Exception("File does not exist");
                                    } else if (bVar4.f20070d.mo56876b(a3.getName(), optJSONObject)) {
                                        oVar.mo56579a(nVar, C8222l.m23594a(nVar, a3.mo56870a()));
                                        return;
                                    } else {
                                        throw new Exception("Failed to update attribute");
                                    }
                                } else {
                                    return;
                                }
                                oVar.mo56579a(nVar, a);
                                return;
                            }
                            C8355c a4 = C8222l.m23591a(jSONObject2, r.f19657a);
                            String optString = jSONObject2.optString("fileUrl");
                            C8222l.C82231 r5 = new C8376c(oVar, nVar) {

                                /* renamed from: a */
                                private /* synthetic */ C8226o f19659a;

                                /* renamed from: b */
                                private /* synthetic */ C8225n f19660b;

                                /* renamed from: a */
                                public final void mo56576a(
/*
Method generation error in method: com.ironsource.sdk.controller.l.1.a(com.ironsource.sdk.h.c):void, dex: classes3.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.sdk.controller.l.1.a(com.ironsource.sdk.h.c):void, class status: UNLOADED
                                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                
*/

                                /* renamed from: a */
                                public final void mo56577a(
/*
Method generation error in method: com.ironsource.sdk.controller.l.1.a(com.ironsource.sdk.h.c, com.ironsource.sdk.g.e):void, dex: classes3.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.sdk.controller.l.1.a(com.ironsource.sdk.h.c, com.ironsource.sdk.g.e):void, class status: UNLOADED
                                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                
*/
                            };
                            C8352b bVar5 = r.f19658b;
                            if (TextUtils.isEmpty(optString)) {
                                throw new Exception("Missing params for file");
                            } else if (C6429h.m19302a(bVar5.f20068b.f20080b) <= 0) {
                                throw new Exception("no_disk_space");
                            } else if (!SDKUtils.isExternalStorageAvailable()) {
                                throw new Exception("sotrage_unavailable");
                            } else if (C6399a.C64001.m19221b(bVar5.f20067a)) {
                                C8351a aVar2 = bVar5.f20069c;
                                String path = a4.getPath();
                                C8352b.C83531 r8 = new C8376c(r5) {

                                    /* renamed from: a */
                                    private /* synthetic */ C8376c f20071a;

                                    /* renamed from: a */
                                    public final void mo56576a(
/*
Method generation error in method: com.ironsource.sdk.h.b.1.a(com.ironsource.sdk.h.c):void, dex: classes3.dex
                                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.sdk.h.b.1.a(com.ironsource.sdk.h.c):void, class status: UNLOADED
                                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                    
*/

                                    /* renamed from: a */
                                    public final void mo56577a(
/*
Method generation error in method: com.ironsource.sdk.h.b.1.a(com.ironsource.sdk.h.c, com.ironsource.sdk.g.e):void, dex: classes3.dex
                                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.sdk.h.b.1.a(com.ironsource.sdk.h.c, com.ironsource.sdk.g.e):void, class status: UNLOADED
                                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                    
*/
                                };
                                if (path != null) {
                                    aVar2.f20066a.put(path, r8);
                                }
                                if (a4.exists()) {
                                    Message message = new Message();
                                    message.obj = a4;
                                    message.what = 1015;
                                    bVar5.f20069c.sendMessage(message);
                                    return;
                                }
                                bVar5.f20068b.mo56881a(a4, optString, bVar5.f20069c);
                            } else {
                                throw new Exception("no_network_connection");
                            }
                        } catch (Exception e) {
                            oVar.mo56580b(nVar, C8222l.m23593a(nVar, e.getMessage()));
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        Logger.m24028i(C8252x.this.f19765a, "fileSystemAPI failed with exception " + e2.getMessage());
                    }
                }
            });
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0059, code lost:
            if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x005d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x0063  */
        /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        @android.webkit.JavascriptInterface
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void getApplicationInfo(java.lang.String r5) {
            /*
                r4 = this;
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.C8252x.this
                java.lang.String r0 = r0.f19765a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "getApplicationInfo("
                r1.<init>(r2)
                r1.append(r5)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.ironsource.sdk.utils.Logger.m24028i(r0, r1)
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.C8252x.this
                java.lang.String r0 = new com.ironsource.sdk.p293g.C8350f(r5).mo56866d(com.ironsource.sdk.controller.C8252x.f19736ab)
                com.ironsource.sdk.controller.x r1 = com.ironsource.sdk.controller.C8252x.this
                java.lang.String r1 = new com.ironsource.sdk.p293g.C8350f(r5).mo56866d(com.ironsource.sdk.controller.C8252x.f19737ac)
                com.ironsource.sdk.g.f r2 = new com.ironsource.sdk.g.f
                r2.<init>(r5)
                java.lang.String r5 = "productType"
                java.lang.String r5 = r2.mo56866d(r5)
                java.lang.String r2 = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId((com.ironsource.sdk.p293g.C8350f) r2)
                com.ironsource.sdk.controller.x r3 = com.ironsource.sdk.controller.C8252x.this
                java.lang.Object[] r5 = r3.m23715c((java.lang.String) r5, (java.lang.String) r2)
                r2 = 0
                r2 = r5[r2]
                java.lang.String r2 = (java.lang.String) r2
                r3 = 1
                r5 = r5[r3]
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L_0x0055
                boolean r5 = android.text.TextUtils.isEmpty(r1)
                if (r5 != 0) goto L_0x005c
                r0 = r1
                goto L_0x005d
            L_0x0055:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L_0x005c
                goto L_0x005d
            L_0x005c:
                r0 = 0
            L_0x005d:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L_0x0072
                com.ironsource.sdk.controller.x r5 = com.ironsource.sdk.controller.C8252x.this
                java.lang.String r1 = "onGetApplicationInfoSuccess"
                java.lang.String r3 = "onGetApplicationInfoFail"
                java.lang.String r5 = com.ironsource.sdk.controller.C8252x.m23687a((java.lang.String) r0, (java.lang.String) r2, (java.lang.String) r1, (java.lang.String) r3)
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.C8252x.this
                r0.mo56622b((java.lang.String) r5)
            L_0x0072:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.C8252x.C8275d.getApplicationInfo(java.lang.String):void");
        }

        @JavascriptInterface
        public void getCachedFilesMap(String str) {
            C8252x xVar;
            String str2;
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "getCachedFilesMap(" + str + ")");
            String b2 = new C8350f(str).mo56866d(C8252x.f19736ab);
            if (!TextUtils.isEmpty(b2)) {
                C8350f fVar = new C8350f(str);
                if (!fVar.mo56863a("path")) {
                    xVar = C8252x.this;
                    str2 = "path key does not exist";
                } else {
                    String str3 = (String) fVar.mo56865c("path");
                    if (!IronSourceStorageUtils.isPathExist(C8252x.this.f19759R, str3)) {
                        xVar = C8252x.this;
                        str2 = "path file does not exist on disk";
                    } else {
                        C8252x.this.mo56622b(C8252x.m23687a(b2, IronSourceStorageUtils.getCachedFilesMap(C8252x.this.f19759R, str3), "onGetCachedFilesMapSuccess", "onGetCachedFilesMapFail"));
                        return;
                    }
                }
                C8252x.m23692a(xVar, str, false, str2, (String) null);
            }
        }

        @JavascriptInterface
        public void getConnectivityInfo(String str) {
            String str2;
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "getConnectivityInfo(" + str + ")");
            C8350f fVar = new C8350f(str);
            String d = fVar.mo56866d(C8252x.f19736ab);
            String d2 = fVar.mo56866d(C8252x.f19737ac);
            JSONObject jSONObject = new JSONObject();
            if (C8252x.this.f19766aa != null) {
                C8380b m = C8252x.this.f19766aa;
                jSONObject = m.f20100a.mo56890c(C8252x.this.getContext());
            }
            if (jSONObject.length() > 0) {
                str2 = C8252x.m23704b(d, jSONObject.toString());
            } else {
                str2 = C8252x.m23704b(d2, C8252x.m23688a("errMsg", "failed to retrieve connection info", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false));
            }
            C8252x.this.mo56622b(str2);
        }

        @JavascriptInterface
        public void getControllerConfig(String str) {
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "getControllerConfig(" + str + ")");
            String d = new C8350f(str).mo56866d(C8252x.f19736ab);
            if (!TextUtils.isEmpty(d)) {
                JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
                m23802a(controllerConfigAsJSONObject);
                m23803a(controllerConfigAsJSONObject, SDKUtils.getTesterParameters());
                m23805b(controllerConfigAsJSONObject);
                C8252x.this.mo56622b(C8252x.m23704b(d, controllerConfigAsJSONObject.toString()));
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0080 A[Catch:{ Exception -> 0x008c }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        @android.webkit.JavascriptInterface
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void getDemandSourceState(java.lang.String r9) {
            /*
                r8 = this;
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.C8252x.this
                java.lang.String r0 = r0.f19765a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "getMediationState("
                r1.<init>(r2)
                r1.append(r9)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.ironsource.sdk.utils.Logger.m24028i(r0, r1)
                com.ironsource.sdk.g.f r0 = new com.ironsource.sdk.g.f
                r0.<init>(r9)
                java.lang.String r1 = "demandSourceName"
                java.lang.String r2 = r0.mo56866d(r1)
                java.lang.String r3 = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId((com.ironsource.sdk.p293g.C8350f) r0)
                java.lang.String r4 = "productType"
                java.lang.String r0 = r0.mo56866d(r4)
                if (r0 == 0) goto L_0x009a
                if (r2 == 0) goto L_0x009a
                r5 = 0
                com.ironsource.sdk.g.d$e r6 = com.ironsource.sdk.utils.SDKUtils.getProductType(r0)     // Catch:{ Exception -> 0x008c }
                if (r6 == 0) goto L_0x009a
                com.ironsource.sdk.controller.x r7 = com.ironsource.sdk.controller.C8252x.this     // Catch:{ Exception -> 0x008c }
                com.ironsource.sdk.controller.j r7 = r7.f19763V     // Catch:{ Exception -> 0x008c }
                com.ironsource.sdk.g.c r6 = r7.mo56571a(r6, r3)     // Catch:{ Exception -> 0x008c }
                org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x008c }
                r7.<init>()     // Catch:{ Exception -> 0x008c }
                r7.put(r4, r0)     // Catch:{ Exception -> 0x008c }
                r7.put(r1, r2)     // Catch:{ Exception -> 0x008c }
                java.lang.String r0 = "demandSourceId"
                r7.put(r0, r3)     // Catch:{ Exception -> 0x008c }
                if (r6 == 0) goto L_0x0070
                int r0 = r6.f20021c     // Catch:{ Exception -> 0x008c }
                r1 = -1
                if (r0 != r1) goto L_0x005f
                r0 = 1
                goto L_0x0060
            L_0x005f:
                r0 = r5
            L_0x0060:
                if (r0 != 0) goto L_0x0070
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.C8252x.this     // Catch:{ Exception -> 0x008c }
                java.lang.String r0 = new com.ironsource.sdk.p293g.C8350f(r9).mo56866d(com.ironsource.sdk.controller.C8252x.f19736ab)     // Catch:{ Exception -> 0x008c }
                java.lang.String r1 = "state"
                int r2 = r6.f20021c     // Catch:{ Exception -> 0x008c }
                r7.put(r1, r2)     // Catch:{ Exception -> 0x008c }
                goto L_0x0076
            L_0x0070:
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.C8252x.this     // Catch:{ Exception -> 0x008c }
                java.lang.String r0 = new com.ironsource.sdk.p293g.C8350f(r9).mo56866d(com.ironsource.sdk.controller.C8252x.f19737ac)     // Catch:{ Exception -> 0x008c }
            L_0x0076:
                java.lang.String r1 = r7.toString()     // Catch:{ Exception -> 0x008c }
                boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x008c }
                if (r2 != 0) goto L_0x009a
                com.ironsource.sdk.controller.x r2 = com.ironsource.sdk.controller.C8252x.this     // Catch:{ Exception -> 0x008c }
                java.lang.String r0 = com.ironsource.sdk.controller.C8252x.m23704b((java.lang.String) r0, (java.lang.String) r1)     // Catch:{ Exception -> 0x008c }
                com.ironsource.sdk.controller.x r1 = com.ironsource.sdk.controller.C8252x.this     // Catch:{ Exception -> 0x008c }
                r1.mo56622b((java.lang.String) r0)     // Catch:{ Exception -> 0x008c }
                goto L_0x009a
            L_0x008c:
                r0 = move-exception
                com.ironsource.sdk.controller.x r1 = com.ironsource.sdk.controller.C8252x.this
                java.lang.String r2 = r0.getMessage()
                r3 = 0
                com.ironsource.sdk.controller.C8252x.m23692a((com.ironsource.sdk.controller.C8252x) r1, (java.lang.String) r9, (boolean) r5, (java.lang.String) r2, (java.lang.String) r3)
                r0.printStackTrace()
            L_0x009a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.C8252x.C8275d.getDemandSourceState(java.lang.String):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x004e, code lost:
            if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x0052;
         */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        @android.webkit.JavascriptInterface
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void getDeviceStatus(java.lang.String r5) {
            /*
                r4 = this;
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.C8252x.this
                java.lang.String r0 = r0.f19765a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "getDeviceStatus("
                r1.<init>(r2)
                r1.append(r5)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.ironsource.sdk.utils.Logger.m24028i(r0, r1)
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.C8252x.this
                java.lang.String r0 = new com.ironsource.sdk.p293g.C8350f(r5).mo56866d(com.ironsource.sdk.controller.C8252x.f19736ab)
                com.ironsource.sdk.controller.x r1 = com.ironsource.sdk.controller.C8252x.this
                java.lang.String r5 = new com.ironsource.sdk.p293g.C8350f(r5).mo56866d(com.ironsource.sdk.controller.C8252x.f19737ac)
                com.ironsource.sdk.controller.x r1 = com.ironsource.sdk.controller.C8252x.this
                android.content.Context r2 = r1.getContext()
                java.lang.Object[] r1 = r1.m23714c((android.content.Context) r2)
                r2 = 0
                r2 = r1[r2]
                java.lang.String r2 = (java.lang.String) r2
                r3 = 1
                r1 = r1[r3]
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L_0x004a
                boolean r0 = android.text.TextUtils.isEmpty(r5)
                if (r0 != 0) goto L_0x0051
                r0 = r5
                goto L_0x0052
            L_0x004a:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L_0x0051
                goto L_0x0052
            L_0x0051:
                r0 = 0
            L_0x0052:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L_0x0067
                com.ironsource.sdk.controller.x r5 = com.ironsource.sdk.controller.C8252x.this
                java.lang.String r1 = "onGetDeviceStatusSuccess"
                java.lang.String r3 = "onGetDeviceStatusFail"
                java.lang.String r5 = com.ironsource.sdk.controller.C8252x.m23687a((java.lang.String) r0, (java.lang.String) r2, (java.lang.String) r1, (java.lang.String) r3)
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.C8252x.this
                r0.mo56622b((java.lang.String) r5)
            L_0x0067:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.C8252x.C8275d.getDeviceStatus(java.lang.String):void");
        }

        @JavascriptInterface
        public void getDeviceVolume(String str) {
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "getDeviceVolume(" + str + ")");
            try {
                C8391a.m24034a(C8252x.this.f19783u.mo56507a());
                float b2 = C8391a.m24036b(C8252x.this.f19783u.mo56507a());
                C8350f fVar = new C8350f(str);
                fVar.mo56861a("deviceVolume", String.valueOf(b2));
                C8252x.m23692a(C8252x.this, fVar.toString(), true, (String) null, (String) null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void getOrientation(String str) {
            Activity a = C8252x.this.f19783u.mo56507a();
            if (a != null) {
                String b = new C8350f(str).mo56866d(C8252x.f19736ab);
                String jSONObject = SDKUtils.getOrientation(a).toString();
                if (!TextUtils.isEmpty(b)) {
                    C8252x.this.mo56622b(C8252x.m23687a(b, jSONObject, "onGetOrientationSuccess", "onGetOrientationFail"));
                }
            }
        }

        @JavascriptInterface
        public void getUserData(String str) {
            String str2 = str;
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "getUserData(" + str2 + ")");
            C8350f fVar = new C8350f(str2);
            if (!fVar.mo56863a(SDKConstants.PARAM_KEY)) {
                C8252x.m23692a(C8252x.this, str2, false, "key does not exist", (String) null);
                return;
            }
            String b2 = new C8350f(str2).mo56866d(C8252x.f19736ab);
            String d = fVar.mo56866d(SDKConstants.PARAM_KEY);
            String string = C8392b.m24037a().f20136a.getString(d, (String) null);
            if (string == null) {
                string = JsonUtils.EMPTY_JSON;
            }
            C8252x.this.mo56622b(C8252x.m23704b(b2, C8252x.m23688a(d, string, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
        }

        @JavascriptInterface
        public void iabTokenAPI(String str) {
            try {
                String b = C8252x.this.f19765a;
                Logger.m24028i(b, "iabTokenAPI(" + str + ")");
                C8350f fVar = new C8350f(str);
                C8249v q = C8252x.this.f19778p;
                String fVar2 = fVar.toString();
                C8305a aVar = new C8305a();
                JSONObject jSONObject = new JSONObject(fVar2);
                C8249v.C8250a aVar2 = new C8249v.C8250a((byte) 0);
                aVar2.f19732a = jSONObject.optString("functionName");
                aVar2.f19733b = jSONObject.optJSONObject("functionParams");
                aVar2.f19734c = jSONObject.optString("success");
                aVar2.f19735d = jSONObject.optString("fail");
                if ("updateToken".equals(aVar2.f19732a)) {
                    JSONObject jSONObject2 = aVar2.f19733b;
                    C8350f fVar3 = new C8350f();
                    try {
                        C8387c cVar = q.f19728c;
                        C6590a.m20032a("ctgp", jSONObject2);
                        q.f19727b.mo56904a(jSONObject2);
                        aVar.mo56757a(true, aVar2.f19734c, fVar3);
                    } catch (Exception e) {
                        e.printStackTrace();
                        String str2 = C8249v.f19726a;
                        Logger.m24028i(str2, "updateToken exception " + e.getMessage());
                        aVar.mo56757a(false, aVar2.f19735d, fVar3);
                    }
                } else if ("getToken".equals(aVar2.f19732a)) {
                    try {
                        aVar.mo56758a(true, aVar2.f19734c, SDKUtils.getControllerConfigAsJSONObject().optBoolean("oneToken") ? q.mo56612a() : q.f19727b.mo56905b(q.f19729d));
                    } catch (Exception e2) {
                        String str3 = aVar2.f19735d;
                        String message = e2.getMessage();
                        C8350f fVar4 = new C8350f();
                        fVar4.mo56861a(C8252x.f19737ac, str3);
                        fVar4.mo56861a("data", message);
                        C8252x.m23692a(C8252x.this, fVar4.toString(), false, (String) null, (String) null);
                    }
                } else {
                    String str4 = C8249v.f19726a;
                    Logger.m24028i(str4, "unhandled API request " + fVar2);
                }
            } catch (Exception e3) {
                e3.printStackTrace();
                String b2 = C8252x.this.f19765a;
                Logger.m24028i(b2, "iabTokenAPI failed with exception " + e3.getMessage());
            }
        }

        @JavascriptInterface
        public void initController(String str) {
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "initController(" + str + ")");
            C8350f fVar = new C8350f(str);
            if (C8252x.this.f19768f != null) {
                C8252x.this.f19768f.cancel();
                C8252x.this.f19768f = null;
            }
            if (fVar.mo56863a("stage")) {
                String d = fVar.mo56866d("stage");
                if ("ready".equalsIgnoreCase(d)) {
                    boolean unused = C8252x.this.f19746E = true;
                    C8252x.this.f19764W.mo56513b();
                } else if (TJAdUnitConstants.String.VIDEO_LOADED.equalsIgnoreCase(d)) {
                    C8252x.this.f19764W.mo56511a();
                } else if ("failed".equalsIgnoreCase(d)) {
                    String d2 = fVar.mo56866d("errMsg");
                    C8191e h = C8252x.this.f19764W;
                    h.mo56512a("controller js failed to initialize : " + d2);
                } else {
                    Logger.m24028i(C8252x.this.f19765a, "No STAGE mentioned! should not get here!");
                }
            }
        }

        @JavascriptInterface
        public void omidAPI(final String str) {
            C8252x.this.mo56617a((Runnable) new Runnable() {
                public final void run() {
                    try {
                        String b = C8252x.this.f19765a;
                        Logger.m24028i(b, "omidAPI(" + str + ")");
                        C8252x.this.f19776n.mo56593a(new C8350f(str).toString(), new C8305a());
                    } catch (Exception e) {
                        e.printStackTrace();
                        String b2 = C8252x.this.f19765a;
                        Logger.m24028i(b2, "omidAPI failed with exception " + e.getMessage());
                    }
                }
            });
        }

        @JavascriptInterface
        public void onAdWindowsClosed(String str) {
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "onAdWindowsClosed(" + str + ")");
            C8252x.this.f19775m.f20008e = -1;
            C8252x.this.f19775m.f20006c = null;
            C8273b unused = C8252x.this.f19767e = null;
            C8350f fVar = new C8350f(str);
            String d = fVar.mo56866d("productType");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            C8343d.C8348e e = C8252x.m23726h(d);
            String z = C8252x.this.f19786x;
            Log.d(z, "onAdClosed() with type " + e);
            if (C8252x.this.mo56620a(d)) {
                C8252x.this.mo56616a(e, fetchDemandSourceId);
            }
        }

        @JavascriptInterface
        public void onCleanUpNonDisplayBannersSuccess(String str) {
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "onCleanUpNonDisplayBannersSuccess() value=" + str);
        }

        @JavascriptInterface
        public void onGetApplicationInfoFail(String str) {
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "onGetApplicationInfoFail(" + str + ")");
            C8252x.m23692a(C8252x.this, str, true, (String) null, (String) null);
            C8252x.m23712c(C8252x.this, "onGetApplicationInfoFail", str);
        }

        @JavascriptInterface
        public void onGetApplicationInfoSuccess(String str) {
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "onGetApplicationInfoSuccess(" + str + ")");
            C8252x.m23692a(C8252x.this, str, true, (String) null, (String) null);
            C8252x.m23712c(C8252x.this, "onGetApplicationInfoSuccess", str);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapFail(String str) {
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "onGetCachedFilesMapFail(" + str + ")");
            C8252x.m23692a(C8252x.this, str, true, (String) null, (String) null);
            C8252x.m23712c(C8252x.this, "onGetCachedFilesMapFail", str);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapSuccess(String str) {
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "onGetCachedFilesMapSuccess(" + str + ")");
            C8252x.m23692a(C8252x.this, str, true, (String) null, (String) null);
            C8252x.m23712c(C8252x.this, "onGetCachedFilesMapSuccess", str);
        }

        @JavascriptInterface
        public void onGetDeviceStatusFail(String str) {
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "onGetDeviceStatusFail(" + str + ")");
            C8252x.m23692a(C8252x.this, str, true, (String) null, (String) null);
            C8252x.m23712c(C8252x.this, "onGetDeviceStatusFail", str);
        }

        @JavascriptInterface
        public void onGetDeviceStatusSuccess(String str) {
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "onGetDeviceStatusSuccess(" + str + ")");
            C8252x.m23692a(C8252x.this, str, true, (String) null, (String) null);
            C8252x.m23712c(C8252x.this, "onGetDeviceStatusSuccess", str);
        }

        @JavascriptInterface
        public void onGetUserCreditsFail(String str) {
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "onGetUserCreditsFail(" + str + ")");
            final String d = new C8350f(str).mo56866d("errMsg");
            if (C8252x.this.mo56620a(C8343d.C8348e.OfferWall.toString())) {
                C8252x.this.mo56623c((Runnable) new Runnable() {
                    public final void run() {
                        String str = d;
                        if (str == null) {
                            str = "We're sorry, some error occurred. we will investigate it";
                        }
                        C8252x.this.f19756O.onGetOWCreditsFailed(str);
                    }
                });
            }
            C8252x.m23692a(C8252x.this, str, true, (String) null, (String) null);
            C8252x.m23712c(C8252x.this, "onGetUserCreditsFail", str);
        }

        @JavascriptInterface
        public void onInitBannerFail(String str) {
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "onInitBannerFail(" + str + ")");
            C8350f fVar = new C8350f(str);
            final String d = fVar.mo56866d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.m24028i(C8252x.this.f19765a, "onInitBannerFail failed with no demand source");
                return;
            }
            C8342c a = C8252x.this.f19763V.mo56571a(C8343d.C8348e.Banner, fetchDemandSourceId);
            if (a != null) {
                a.mo56846a(3);
            }
            if (C8252x.this.mo56620a(C8343d.C8348e.Banner.toString())) {
                C8252x.this.mo56623c((Runnable) new Runnable() {
                    public final void run() {
                        String str = d;
                        if (str == null) {
                            str = "We're sorry, some error occurred. we will investigate it";
                        }
                        String b = C8252x.this.f19765a;
                        Log.d(b, "onBannerInitFail(message:" + str + ")");
                        C8252x.this.f19757P.mo56782a(C8343d.C8348e.Banner, fetchDemandSourceId, str);
                    }
                });
            }
            C8252x.m23692a(C8252x.this, str, true, (String) null, (String) null);
            C8252x.m23712c(C8252x.this, "onInitBannerFail", str);
        }

        @JavascriptInterface
        public void onInitBannerSuccess(String str) {
            Logger.m24028i(C8252x.this.f19765a, "onInitBannerSuccess()");
            C8252x.m23712c(C8252x.this, "onInitBannerSuccess", "true");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C8350f(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.m24028i(C8252x.this.f19765a, "onInitBannerSuccess failed with no demand source");
            } else if (C8252x.this.mo56620a(C8343d.C8348e.Banner.toString())) {
                C8252x.this.mo56623c((Runnable) new Runnable() {
                    public final void run() {
                        Log.d(C8252x.this.f19765a, "onBannerInitSuccess()");
                        C8252x.this.f19757P.mo56781a(C8343d.C8348e.Banner, fetchDemandSourceId, (C8339a) null);
                    }
                });
            }
        }

        @JavascriptInterface
        public void onInitInterstitialFail(String str) {
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "onInitInterstitialFail(" + str + ")");
            C8350f fVar = new C8350f(str);
            final String d = fVar.mo56866d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.m24028i(C8252x.this.f19765a, "onInitInterstitialSuccess failed with no demand source");
                return;
            }
            C8342c a = C8252x.this.f19763V.mo56571a(C8343d.C8348e.Interstitial, fetchDemandSourceId);
            if (a != null) {
                a.mo56846a(3);
            }
            if (C8252x.this.mo56620a(C8343d.C8348e.Interstitial.toString())) {
                C8252x.this.mo56623c((Runnable) new Runnable() {
                    public final void run() {
                        String str = d;
                        if (str == null) {
                            str = "We're sorry, some error occurred. we will investigate it";
                        }
                        String b = C8252x.this.f19765a;
                        Log.d(b, "onInterstitialInitFail(message:" + str + ")");
                        C8252x.this.f19755N.mo56782a(C8343d.C8348e.Interstitial, fetchDemandSourceId, str);
                    }
                });
            }
            C8252x.m23692a(C8252x.this, str, true, (String) null, (String) null);
            C8252x.m23712c(C8252x.this, "onInitInterstitialFail", str);
        }

        @JavascriptInterface
        public void onInitInterstitialSuccess(String str) {
            Logger.m24028i(C8252x.this.f19765a, "onInitInterstitialSuccess()");
            C8252x.m23712c(C8252x.this, "onInitInterstitialSuccess", "true");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C8350f(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.m24028i(C8252x.this.f19765a, "onInitInterstitialSuccess failed with no demand source");
            } else if (C8252x.this.mo56620a(C8343d.C8348e.Interstitial.toString())) {
                C8252x.this.mo56623c((Runnable) new Runnable() {
                    public final void run() {
                        Log.d(C8252x.this.f19765a, "onInterstitialInitSuccess()");
                        C8252x.this.f19755N.mo56781a(C8343d.C8348e.Interstitial, fetchDemandSourceId, (C8339a) null);
                    }
                });
            }
        }

        @JavascriptInterface
        public void onInitOfferWallFail(String str) {
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "onInitOfferWallFail(" + str + ")");
            C8252x.this.f19775m.f20012i = false;
            final String d = new C8350f(str).mo56866d("errMsg");
            if (C8252x.this.f19775m.f20011h) {
                C8252x.this.f19775m.f20011h = false;
                if (C8252x.this.mo56620a(C8343d.C8348e.OfferWall.toString())) {
                    C8252x.this.mo56623c((Runnable) new Runnable() {
                        public final void run() {
                            String str = d;
                            if (str == null) {
                                str = "We're sorry, some error occurred. we will investigate it";
                            }
                            String b = C8252x.this.f19765a;
                            Log.d(b, "onOfferWallInitFail(message:" + str + ")");
                            C8252x.this.f19756O.onOfferwallInitFail(str);
                        }
                    });
                }
            }
            C8252x.m23692a(C8252x.this, str, true, (String) null, (String) null);
            C8252x.m23712c(C8252x.this, "onInitOfferWallFail", str);
        }

        @JavascriptInterface
        public void onInitOfferWallSuccess(String str) {
            C8252x.m23712c(C8252x.this, "onInitOfferWallSuccess", "true");
            C8252x.this.f19775m.f20012i = true;
            if (C8252x.this.f19775m.f20011h) {
                C8252x.this.f19775m.f20011h = false;
                if (C8252x.this.mo56620a(C8343d.C8348e.OfferWall.toString())) {
                    C8252x.this.mo56623c((Runnable) new Runnable() {
                        public final void run() {
                            Log.d(C8252x.this.f19765a, "onOfferWallInitSuccess()");
                            C8252x.this.f19756O.onOfferwallInitSuccess();
                        }
                    });
                }
            }
        }

        @JavascriptInterface
        public void onInitRewardedVideoFail(String str) {
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "onInitRewardedVideoFail(" + str + ")");
            C8350f fVar = new C8350f(str);
            final String d = fVar.mo56866d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            C8342c a = C8252x.this.f19763V.mo56571a(C8343d.C8348e.RewardedVideo, fetchDemandSourceId);
            if (a != null) {
                a.mo56846a(3);
            }
            if (C8252x.this.mo56620a(C8343d.C8348e.RewardedVideo.toString())) {
                C8252x.this.mo56623c((Runnable) new Runnable() {
                    public final void run() {
                        String str = d;
                        if (str == null) {
                            str = "We're sorry, some error occurred. we will investigate it";
                        }
                        String b = C8252x.this.f19765a;
                        Log.d(b, "onRVInitFail(message:" + str + ")");
                        C8252x.this.f19754M.mo56782a(C8343d.C8348e.RewardedVideo, fetchDemandSourceId, str);
                    }
                });
            }
            C8252x.m23692a(C8252x.this, str, true, (String) null, (String) null);
            C8252x.m23712c(C8252x.this, "onInitRewardedVideoFail", str);
        }

        @JavascriptInterface
        public void onLoadBannerFail(String str) {
            Logger.m24028i(C8252x.this.f19765a, "onLoadBannerFail()");
            C8350f fVar = new C8350f(str);
            final String d = fVar.mo56866d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            C8252x.m23692a(C8252x.this, str, true, (String) null, (String) null);
            if (!TextUtils.isEmpty(fetchDemandSourceId) && C8252x.this.mo56620a(C8343d.C8348e.Banner.toString())) {
                C8252x.this.mo56623c((Runnable) new Runnable() {
                    public final void run() {
                        Log.d(C8252x.this.f19765a, "onLoadBannerFail()");
                        String str = d;
                        if (str == null) {
                            str = "We're sorry, some error occurred. we will investigate it";
                        }
                        C8252x.this.f19757P.mo56810d(fetchDemandSourceId, str);
                    }
                });
            }
        }

        @JavascriptInterface
        public void onLoadBannerSuccess(String str) {
            Logger.m24028i(C8252x.this.f19765a, "onLoadBannerSuccess()");
            C8350f fVar = new C8350f(str);
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            String d = fVar.mo56866d("adViewId");
            C8252x.m23692a(C8252x.this, str, true, (String) null, (String) null);
            C8175e a = C8173d.m23494a().mo56456a(d);
            if (a == null) {
                C8362b E = C8252x.this.f19757P;
                E.mo56810d(fetchDemandSourceId, "not found view for the current adViewId= " + d);
            } else if (a instanceof C8166a) {
                final C8166a aVar = (C8166a) a;
                if (C8252x.this.mo56620a(C8343d.C8348e.Banner.toString())) {
                    C8252x.this.mo56623c((Runnable) new Runnable() {
                        public final void run() {
                            Log.d(C8252x.this.f19765a, "onBannerLoadSuccess()");
                            C8252x.this.f19757P.mo56786a(fetchDemandSourceId, aVar);
                        }
                    });
                }
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialFail(String str) {
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "onLoadInterstitialFail(" + str + ")");
            C8350f fVar = new C8350f(str);
            final String d = fVar.mo56866d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            C8252x.m23692a(C8252x.this, str, true, (String) null, (String) null);
            if (!TextUtils.isEmpty(fetchDemandSourceId)) {
                m23801a(fetchDemandSourceId, false);
                if (C8252x.this.mo56620a(C8343d.C8348e.Interstitial.toString())) {
                    C8252x.this.mo56623c((Runnable) new Runnable() {
                        public final void run() {
                            String str = d;
                            if (str == null) {
                                str = "We're sorry, some error occurred. we will investigate it";
                            }
                            C8252x.this.f19755N.mo56801b(fetchDemandSourceId, str);
                        }
                    });
                }
                C8252x.m23712c(C8252x.this, "onLoadInterstitialFail", "true");
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialSuccess(String str) {
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "onLoadInterstitialSuccess(" + str + ")");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C8350f(str));
            m23801a(fetchDemandSourceId, true);
            C8252x.m23692a(C8252x.this, str, true, (String) null, (String) null);
            if (C8252x.this.mo56620a(C8343d.C8348e.Interstitial.toString())) {
                C8252x.this.mo56623c((Runnable) new Runnable() {
                    public final void run() {
                        C8252x.this.f19755N.mo56805c(fetchDemandSourceId);
                    }
                });
            }
            C8252x.m23712c(C8252x.this, "onLoadInterstitialSuccess", "true");
        }

        @JavascriptInterface
        public void onOfferWallGeneric(String str) {
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "onOfferWallGeneric(" + str + ")");
        }

        @JavascriptInterface
        public void onShowInterstitialFail(String str) {
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "onShowInterstitialFail(" + str + ")");
            C8350f fVar = new C8350f(str);
            final String d = fVar.mo56866d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            C8252x.m23692a(C8252x.this, str, true, (String) null, (String) null);
            if (!TextUtils.isEmpty(fetchDemandSourceId)) {
                m23801a(fetchDemandSourceId, false);
                if (C8252x.this.mo56620a(C8343d.C8348e.Interstitial.toString())) {
                    C8252x.this.mo56623c((Runnable) new Runnable() {
                        public final void run() {
                            String str = d;
                            if (str == null) {
                                str = "We're sorry, some error occurred. we will investigate it";
                            }
                            C8252x.this.f19755N.mo56806c(fetchDemandSourceId, str);
                        }
                    });
                }
                C8252x.m23712c(C8252x.this, "onShowInterstitialFail", str);
            }
        }

        @JavascriptInterface
        public void onShowInterstitialSuccess(String str) {
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "onShowInterstitialSuccess(" + str + ")");
            C8252x.m23692a(C8252x.this, str, true, (String) null, (String) null);
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C8350f(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.m24028i(C8252x.this.f19765a, "onShowInterstitialSuccess called with no demand");
                return;
            }
            C8252x.this.f19775m.f20008e = C8343d.C8348e.Interstitial.ordinal();
            C8252x.this.f19775m.f20006c = fetchDemandSourceId;
            if (C8252x.this.mo56620a(C8343d.C8348e.Interstitial.toString())) {
                C8252x.this.mo56623c((Runnable) new Runnable() {
                    public final void run() {
                        C8252x.this.f19755N.mo56804c(C8343d.C8348e.Interstitial, fetchDemandSourceId);
                        C8252x.this.f19755N.mo56809d(fetchDemandSourceId);
                    }
                });
                C8252x.m23712c(C8252x.this, "onShowInterstitialSuccess", str);
            }
            m23801a(fetchDemandSourceId, false);
        }

        @JavascriptInterface
        public void onShowOfferWallFail(String str) {
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "onShowOfferWallFail(" + str + ")");
            final String d = new C8350f(str).mo56866d("errMsg");
            if (C8252x.this.mo56620a(C8343d.C8348e.OfferWall.toString())) {
                C8252x.this.mo56623c((Runnable) new Runnable() {
                    public final void run() {
                        String str = d;
                        if (str == null) {
                            str = "We're sorry, some error occurred. we will investigate it";
                        }
                        C8252x.this.f19756O.onOWShowFail(str);
                    }
                });
            }
            C8252x.m23692a(C8252x.this, str, true, (String) null, (String) null);
            C8252x.m23712c(C8252x.this, "onShowOfferWallFail", str);
        }

        @JavascriptInterface
        public void onShowOfferWallSuccess(String str) {
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "onShowOfferWallSuccess(" + str + ")");
            C8252x.this.f19775m.f20008e = C8343d.C8348e.OfferWall.ordinal();
            final String valueFromJsonObject = SDKUtils.getValueFromJsonObject(str, ReportDBAdapter.ReportColumns.COLUMN_PLACEMENT_ID);
            if (C8252x.this.mo56620a(C8343d.C8348e.OfferWall.toString())) {
                C8252x.this.mo56623c((Runnable) new Runnable() {
                    public final void run() {
                        C8252x.this.f19756O.onOWShowSuccess(valueFromJsonObject);
                    }
                });
            }
            C8252x.m23692a(C8252x.this, str, true, (String) null, (String) null);
            C8252x.m23712c(C8252x.this, "onShowOfferWallSuccess", str);
        }

        @JavascriptInterface
        public void onShowRewardedVideoFail(String str) {
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "onShowRewardedVideoFail(" + str + ")");
            C8350f fVar = new C8350f(str);
            final String d = fVar.mo56866d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (C8252x.this.mo56620a(C8343d.C8348e.RewardedVideo.toString())) {
                C8252x.this.mo56623c((Runnable) new Runnable() {
                    public final void run() {
                        String str = d;
                        if (str == null) {
                            str = "We're sorry, some error occurred. we will investigate it";
                        }
                        String b = C8252x.this.f19765a;
                        Log.d(b, "onRVShowFail(message:" + d + ")");
                        C8252x.this.f19754M.mo56787a(fetchDemandSourceId, str);
                    }
                });
            }
            C8252x.m23692a(C8252x.this, str, true, (String) null, (String) null);
            C8252x.m23712c(C8252x.this, "onShowRewardedVideoFail", str);
        }

        @JavascriptInterface
        public void onShowRewardedVideoSuccess(String str) {
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "onShowRewardedVideoSuccess(" + str + ")");
            C8252x.m23692a(C8252x.this, str, true, (String) null, (String) null);
            C8252x.m23712c(C8252x.this, "onShowRewardedVideoSuccess", str);
        }

        @JavascriptInterface
        public void onVideoStatusChanged(String str) {
            String b = C8252x.this.f19765a;
            Log.d(b, "onVideoStatusChanged(" + str + ")");
            C8350f fVar = new C8350f(str);
            String d = fVar.mo56866d("productType");
            if (C8252x.this.f19774l != null && !TextUtils.isEmpty(d)) {
                String d2 = fVar.mo56866d("status");
                if ("started".equalsIgnoreCase(d2)) {
                    C8252x.this.f19774l.onVideoStarted();
                } else if (TJAdUnitConstants.String.VIDEO_PAUSED.equalsIgnoreCase(d2)) {
                    C8252x.this.f19774l.onVideoPaused();
                } else if (TJAdUnitConstants.String.VIDEO_PLAYING.equalsIgnoreCase(d2)) {
                    C8252x.this.f19774l.onVideoResumed();
                } else if ("ended".equalsIgnoreCase(d2)) {
                    C8252x.this.f19774l.onVideoEnded();
                } else if (TJAdUnitConstants.String.VIDEO_STOPPED.equalsIgnoreCase(d2)) {
                    C8252x.this.f19774l.onVideoStopped();
                } else {
                    String b2 = C8252x.this.f19765a;
                    Logger.m24028i(b2, "onVideoStatusChanged: unknown status: " + d2);
                }
            }
        }

        @JavascriptInterface
        public void openUrl(String str) {
            Logger.m24028i(C8252x.this.f19765a, "openUrl(" + str + ")");
            C8350f fVar = new C8350f(str);
            String d = fVar.mo56866d("url");
            String d2 = fVar.mo56866d("method");
            String d3 = fVar.mo56866d(CampaignEx.JSON_KEY_PACKAGE_NAME);
            Activity a = C8252x.this.f19783u.mo56507a();
            try {
                String lowerCase = d2.toLowerCase();
                char c = 65535;
                int hashCode = lowerCase.hashCode();
                if (hashCode != -1455867212) {
                    if (hashCode != 109770977) {
                        if (hashCode == 1224424441) {
                            if (lowerCase.equals("webview")) {
                                c = 1;
                            }
                        }
                    } else if (lowerCase.equals("store")) {
                        c = 2;
                    }
                } else if (lowerCase.equals("external_browser")) {
                    c = 0;
                }
                if (c == 0) {
                    C6399a.C64001.m19217a(a, d, d3);
                } else if (c == 1) {
                    Intent intent = new Intent(a, OpenUrlActivity.class);
                    intent.putExtra(C8252x.f19739c, d);
                    intent.putExtra(C8252x.f19740d, true);
                    intent.putExtra("immersive", C8252x.this.f19762U);
                    a.startActivity(intent);
                } else if (c == 2) {
                    Intent intent2 = new Intent(a, OpenUrlActivity.class);
                    intent2.putExtra(C8252x.f19739c, d);
                    intent2.putExtra(C8252x.f19738b, true);
                    intent2.putExtra(C8252x.f19740d, true);
                    a.startActivity(intent2);
                }
            } catch (Exception e) {
                C8252x.m23692a(C8252x.this, str, false, e.getMessage(), (String) null);
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void pauseControllerWebview() {
            C8252x.this.mo56617a((Runnable) new Runnable() {
                public final void run() {
                    C8252x.this.mo56629k();
                }
            });
        }

        @JavascriptInterface
        public void permissionsAPI(String str) {
            C8350f fVar;
            String str2;
            try {
                String b = C8252x.this.f19765a;
                Logger.m24028i(b, "permissionsAPI(" + str + ")");
                C8350f fVar2 = new C8350f(str);
                C8242r H = C8252x.this.f19777o;
                String fVar3 = fVar2.toString();
                C8305a aVar = new C8305a();
                JSONObject jSONObject = new JSONObject(fVar3);
                C8242r.C8243a aVar2 = new C8242r.C8243a((byte) 0);
                aVar2.f19710a = jSONObject.optString("functionName");
                aVar2.f19711b = jSONObject.optJSONObject("functionParams");
                aVar2.f19712c = jSONObject.optString("success");
                aVar2.f19713d = jSONObject.optString("fail");
                if ("getPermissions".equals(aVar2.f19710a)) {
                    JSONObject jSONObject2 = aVar2.f19711b;
                    fVar = new C8350f();
                    try {
                        fVar.mo56862a("permissions", C6408c.m19237a(H.f19709a, jSONObject2.getJSONArray("permissions")));
                        aVar.mo56757a(true, aVar2.f19712c, fVar);
                    } catch (Exception e) {
                        e.printStackTrace();
                        String str3 = C8242r.f19708b;
                        Logger.m24028i(str3, "PermissionsJSAdapter getPermissions JSON Exception when getting permissions parameter " + e.getMessage());
                        fVar.mo56861a("errMsg", e.getMessage());
                        str2 = aVar2.f19713d;
                        aVar.mo56757a(false, str2, fVar);
                    }
                } else if ("isPermissionGranted".equals(aVar2.f19710a)) {
                    JSONObject jSONObject3 = aVar2.f19711b;
                    fVar = new C8350f();
                    try {
                        String string = jSONObject3.getString("permission");
                        fVar.mo56861a("permission", string);
                        if (C6408c.m19238a(H.f19709a, string)) {
                            fVar.mo56861a("status", String.valueOf(C6408c.m19240b(H.f19709a, string)));
                            aVar.mo56757a(true, aVar2.f19712c, fVar);
                            return;
                        }
                        fVar.mo56861a("status", "unhandledPermission");
                        aVar.mo56757a(false, aVar2.f19713d, fVar);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        fVar.mo56861a("errMsg", e2.getMessage());
                        str2 = aVar2.f19713d;
                        aVar.mo56757a(false, str2, fVar);
                    }
                } else {
                    String str4 = C8242r.f19708b;
                    Logger.m24028i(str4, "PermissionsJSAdapter unhandled API request " + fVar3);
                }
            } catch (Exception e3) {
                e3.printStackTrace();
                String b2 = C8252x.this.f19765a;
                Logger.m24028i(b2, "permissionsAPI failed with exception " + e3.getMessage());
            }
        }

        @JavascriptInterface
        public void postAdEventNotification(String str) {
            String str2 = str;
            try {
                String b = C8252x.this.f19765a;
                Logger.m24028i(b, "postAdEventNotification(" + str2 + ")");
                C8350f fVar = new C8350f(str2);
                final String d = fVar.mo56866d("eventName");
                if (TextUtils.isEmpty(d)) {
                    C8252x.m23692a(C8252x.this, str2, false, "eventName does not exist", (String) null);
                    return;
                }
                String d2 = fVar.mo56866d("dsName");
                String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
                String str3 = !TextUtils.isEmpty(fetchDemandSourceId) ? fetchDemandSourceId : d2;
                JSONObject jSONObject = (JSONObject) fVar.mo56865c("extData");
                String d3 = fVar.mo56866d("productType");
                C8343d.C8348e e = C8252x.m23726h(d3);
                if (C8252x.this.mo56620a(d3)) {
                    String b2 = new C8350f(str2).mo56866d(C8252x.f19736ab);
                    if (!TextUtils.isEmpty(b2)) {
                        C8252x.this.mo56622b(C8252x.m23687a(b2, C8252x.m23688a("productType", d3, "eventName", d, "demandSourceName", d2, "demandSourceId", str3, (String) null, false), "postAdEventNotificationSuccess", "postAdEventNotificationFail"));
                    }
                    final C8343d.C8348e eVar = e;
                    final String str4 = str3;
                    final JSONObject jSONObject2 = jSONObject;
                    C8252x.this.mo56623c((Runnable) new Runnable() {
                        public final void run() {
                            if (eVar == C8343d.C8348e.Interstitial || eVar == C8343d.C8348e.RewardedVideo || eVar == C8343d.C8348e.Banner) {
                                C8361a a = C8252x.this.m23701b(eVar);
                                if (a != null) {
                                    a.mo56783a(eVar, str4, d, jSONObject2);
                                }
                            } else if (eVar == C8343d.C8348e.OfferWall) {
                                C8252x.this.f19756O.onOfferwallEventNotificationReceived(d, jSONObject2);
                            }
                        }
                    });
                    return;
                }
                C8252x.m23692a(C8252x.this, str2, false, "productType does not exist", (String) null);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        @JavascriptInterface
        public void removeCloseEventHandler(String str) {
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "removeCloseEventHandler(" + str + ")");
            if (C8252x.this.f19748G != null) {
                C8252x.this.f19748G.cancel();
            }
            boolean unused = C8252x.this.f19747F = true;
        }

        @JavascriptInterface
        public void removeMessagingInterface(String str) {
            C8252x.this.mo56617a((Runnable) new Runnable() {
                public final void run() {
                    C8252x.this.removeJavascriptInterface("GenerateTokenForMessaging");
                }
            });
        }

        @JavascriptInterface
        public void requestToDestroyBanner(String str) {
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "onCleanUpNonDisplayBannersFail() value=" + str);
        }

        @JavascriptInterface
        public void resumeControllerWebview() {
            C8252x.this.mo56617a((Runnable) new Runnable() {
                public final void run() {
                    C8252x.this.mo56630l();
                }
            });
        }

        @JavascriptInterface
        public void saveFile(String str) {
            try {
                String b = C8252x.this.f19765a;
                Logger.m24028i(b, "saveFile(" + str + ")");
                C8350f fVar = new C8350f(str);
                String d = fVar.mo56866d("path");
                String d2 = fVar.mo56866d(ShareInternalUtility.STAGING_PARAM);
                if (TextUtils.isEmpty(d2)) {
                    C8252x.m23692a(C8252x.this, str, false, "Missing parameters for file", "1");
                    return;
                }
                C8355c cVar = new C8355c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(C8252x.this.f19759R, d), SDKUtils.getFileName(d2));
                if (C6429h.m19302a(C8252x.this.f19759R) <= 0) {
                    C8252x.m23692a(C8252x.this, str, false, "no_disk_space", (String) null);
                } else if (!SDKUtils.isExternalStorageAvailable()) {
                    C8252x.m23692a(C8252x.this, str, false, "sotrage_unavailable", (String) null);
                } else if (cVar.exists()) {
                    C8252x.m23692a(C8252x.this, str, false, "file_already_exist", (String) null);
                } else if (!C6399a.C64001.m19221b(C8252x.this.getContext())) {
                    C8252x.m23692a(C8252x.this, str, false, "no_network_connection", (String) null);
                } else {
                    C8252x.m23692a(C8252x.this, str, true, (String) null, (String) null);
                    C8372b o = C8252x.this.f19745D;
                    o.mo56881a(cVar, d2, o.f20079a);
                }
            } catch (Exception e) {
                C8252x.m23692a(C8252x.this, str, false, e.getMessage(), (String) null);
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void setBackButtonState(String str) {
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "setBackButtonState(" + str + ")");
            String d = new C8350f(str).mo56866d("state");
            SharedPreferences.Editor edit = C8392b.m24037a().f20136a.edit();
            edit.putString("back_button_state", d);
            edit.apply();
        }

        @JavascriptInterface
        public void setForceClose(String str) {
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "setForceClose(" + str + ")");
            C8350f fVar = new C8350f(str);
            String d = fVar.mo56866d("width");
            String d2 = fVar.mo56866d("height");
            int unused = C8252x.this.f19749H = Integer.parseInt(d);
            int unused2 = C8252x.this.f19750I = Integer.parseInt(d2);
            String unused3 = C8252x.this.f19751J = fVar.mo56866d("position");
        }

        @JavascriptInterface
        public void setMixedContentAlwaysAllow(String str) {
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "setMixedContentAlwaysAllow(" + str + ")");
            C8252x.this.mo56617a((Runnable) new Runnable() {
                public final void run() {
                    if (Build.VERSION.SDK_INT >= 21) {
                        C8252x.this.getSettings().setMixedContentMode(0);
                    }
                }
            });
        }

        @JavascriptInterface
        public void setOrientation(String str) {
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "setOrientation(" + str + ")");
            String d = new C8350f(str).mo56866d("orientation");
            C8252x.this.f19773k = d;
            if (C8252x.this.f19784v != null) {
                C8252x.this.f19784v.onOrientationChanged(d, C6429h.m19328k(C8252x.this.getContext()));
            }
        }

        @JavascriptInterface
        public void setStoreSearchKeys(String str) {
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "setStoreSearchKeys(" + str + ")");
            SharedPreferences.Editor edit = C8392b.m24037a().f20136a.edit();
            edit.putString("search_keys", str);
            edit.apply();
        }

        @JavascriptInterface
        public void setTouchListener(String str) {
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "removeCloseEventHandler(" + str + ")");
            C8252x.this.mo56617a((Runnable) new Runnable() {
                public final void run() {
                    C8252x.this.setOnTouchListener(new C8309h(C8252x.this, (byte) 0));
                }
            });
        }

        @JavascriptInterface
        public void setUserData(String str) {
            String str2 = str;
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "setUserData(" + str2 + ")");
            C8350f fVar = new C8350f(str2);
            if (!fVar.mo56863a(SDKConstants.PARAM_KEY)) {
                C8252x.m23692a(C8252x.this, str2, false, "key does not exist", (String) null);
            } else if (!fVar.mo56863a("value")) {
                C8252x.m23692a(C8252x.this, str2, false, "value does not exist", (String) null);
            } else {
                String d = fVar.mo56866d(SDKConstants.PARAM_KEY);
                String d2 = fVar.mo56866d("value");
                SharedPreferences.Editor edit = C8392b.m24037a().f20136a.edit();
                edit.putString(d, d2);
                edit.apply();
                C8252x.this.mo56622b(C8252x.m23704b(new C8350f(str2).mo56866d(C8252x.f19736ab), C8252x.m23688a(d, d2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
            }
        }

        @JavascriptInterface
        public void setWebviewBackgroundColor(String str) {
            String b = C8252x.this.f19765a;
            Logger.m24028i(b, "setWebviewBackgroundColor(" + str + ")");
            C8252x.m23723g(C8252x.this, str);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.x$e */
    interface C8306e {
        /* renamed from: a */
        void mo56643a(String str, C8343d.C8348e eVar, C8342c cVar);
    }

    /* renamed from: com.ironsource.sdk.controller.x$f */
    static class C8307f {

        /* renamed from: a */
        String f19903a;

        /* renamed from: b */
        String f19904b;

        C8307f() {
        }
    }

    /* renamed from: com.ironsource.sdk.controller.x$g */
    public enum C8308g {
        Display,
        Gone
    }

    /* renamed from: com.ironsource.sdk.controller.x$h */
    class C8309h implements View.OnTouchListener {
        private C8309h() {
        }

        /* synthetic */ C8309h(C8252x xVar, byte b) {
            this();
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                String b = C8252x.this.f19765a;
                StringBuilder sb = new StringBuilder("X:");
                int i = (int) x;
                sb.append(i);
                sb.append(" Y:");
                int i2 = (int) y;
                sb.append(i2);
                Logger.m24028i(b, sb.toString());
                int m = C6429h.m19331m();
                int n = C6429h.m19333n();
                Logger.m24028i(C8252x.this.f19765a, "Width:" + m + " Height:" + n);
                int dpToPx = SDKUtils.dpToPx((long) C8252x.this.f19749H);
                int dpToPx2 = SDKUtils.dpToPx((long) C8252x.this.f19750I);
                if (C5976de.DEFAULT_POSITION.equalsIgnoreCase(C8252x.this.f19751J)) {
                    i = m - i;
                } else if (!"top-left".equalsIgnoreCase(C8252x.this.f19751J)) {
                    if ("bottom-right".equalsIgnoreCase(C8252x.this.f19751J)) {
                        i = m - i;
                    } else if (!"bottom-left".equalsIgnoreCase(C8252x.this.f19751J)) {
                        i = 0;
                        i2 = 0;
                    }
                    i2 = n - i2;
                }
                if (i <= dpToPx && i2 <= dpToPx2) {
                    boolean unused = C8252x.this.f19747F = false;
                    if (C8252x.this.f19748G != null) {
                        C8252x.this.f19748G.cancel();
                    }
                    CountDownTimer unused2 = C8252x.this.f19748G = new CountDownTimer(2000, 500) {
                        public final void onFinish() {
                            Logger.m24028i(C8252x.this.f19765a, "Close Event Timer Finish");
                            if (C8252x.this.f19747F) {
                                boolean unused = C8252x.this.f19747F = false;
                            } else {
                                C8252x.this.mo56625e(TJAdUnitConstants.String.FORCE_CLOSE);
                            }
                        }

                        public final void onTick(long j) {
                            String b = C8252x.this.f19765a;
                            Logger.m24028i(b, "Close Event Timer Tick " + j);
                        }
                    }.start();
                }
            }
            return false;
        }
    }

    /* renamed from: com.ironsource.sdk.controller.x$i */
    class C8311i extends WebViewClient {
        private C8311i() {
        }

        /* synthetic */ C8311i(C8252x xVar, byte b) {
            this();
        }

        public final void onPageFinished(WebView webView, String str) {
            Logger.m24028i("onPageFinished", str);
            if (str.contains(IronSourceConstants.EVENTS_AD_UNIT) || str.contains("index.html")) {
                C8252x.this.mo56622b(C8252x.m23722g("pageFinished"));
            }
            super.onPageFinished(webView, str);
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Logger.m24028i("onPageStarted", str);
            super.onPageStarted(webView, str, bitmap);
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            Logger.m24028i("onReceivedError", str2 + " " + str);
            if (str2.contains("mobileController.html") && C8252x.this.f19764W != null) {
                C8191e h = C8252x.this.f19764W;
                h.mo56512a("controller html - web-view receivedError on loading - " + str + " (errorCode: " + i + ")");
            }
            super.onReceivedError(webView, i, str, str2);
        }

        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            String b = C8252x.this.f19765a;
            Log.e(b, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            String str = renderProcessGoneDetail.didCrash() ? "Render process was observed to crash" : "Render process was killed by the system";
            if (C8252x.this.f19764W != null) {
                C8252x.this.f19764W.mo56514b(str);
            }
            C8252x xVar = C8252x.this;
            if (xVar.f19767e == null) {
                return true;
            }
            xVar.mo56628j();
            C8343d.C8348e eVar = xVar.f19767e.f19823a;
            String str2 = xVar.f19767e.f19824b;
            if (!xVar.mo56620a(eVar.toString())) {
                return true;
            }
            xVar.mo56616a(eVar, str2);
            return true;
        }

        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            boolean z;
            Logger.m24028i("shouldInterceptRequest", str);
            try {
                z = new URL(str).getFile().contains("mraid.js");
            } catch (MalformedURLException unused) {
                z = false;
            }
            if (z) {
                String str2 = Advertisement.FILE_SCHEME + C8252x.this.f19759R + File.separator + "mraid.js";
                try {
                    new FileInputStream(new File(str2));
                    return new WebResourceResponse("text/javascript", "UTF-8", getClass().getResourceAsStream(str2));
                } catch (FileNotFoundException unused2) {
                }
            }
            return super.shouldInterceptRequest(webView, str);
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.m24028i("shouldOverrideUrlLoading", str);
            try {
                if (C8252x.this.mo56626f(str)) {
                    C8252x.this.mo56627i();
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    public C8252x(Context context, C8219j jVar, C8189c cVar, C8191e eVar, C6421a aVar) {
        super(context);
        Logger.m24028i(this.f19765a, "C'tor");
        this.f19783u = cVar;
        this.f19764W = eVar;
        this.f19785w = aVar;
        this.f19759R = IronSourceStorageUtils.getNetworkStorageDir(context);
        this.f19763V = jVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.f19771i = new FrameLayout(context);
        this.f19752K = new FrameLayout(context);
        this.f19752K.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f19752K.setVisibility(8);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(this);
        this.f19771i.addView(this.f19752K, layoutParams);
        this.f19771i.addView(frameLayout);
        this.f19775m = new C8340b();
        C8372b a = mo56613a();
        this.f19745D = a;
        a.f20079a.f20077a = this;
        this.f19760S = new C8192f(SDKUtils.getNetworkConfiguration(), this.f19759R, SDKUtils.getControllerUrl(), this.f19745D);
        this.f19769g = new C8272a(this, (byte) 0);
        setWebViewClient(new C8311i(this, (byte) 0));
        setWebChromeClient(this.f19769g);
        C8395d.m24055a(this);
        C8245t tVar = new C8245t(UUID.randomUUID().toString());
        addJavascriptInterface(new C8215h(new C8190d(new C8275d()), tVar), APSAnalytics.OS_NAME);
        addJavascriptInterface(new C8244s(tVar), "GenerateTokenForMessaging");
        setDownloadListener(this);
        this.f19766aa = new C8380b(SDKUtils.getControllerConfigAsJSONObject(), context) {
            /* renamed from: a */
            public final void mo56634a() {
                if (C8252x.this.f19746E) {
                    C8252x.this.mo56624d("none");
                }
            }

            /* renamed from: a */
            public final void mo56635a(String str) {
                if (C8252x.this.f19746E) {
                    C8252x.this.mo56624d(str);
                }
            }

            /* renamed from: a */
            public final void mo56636a(String str, JSONObject jSONObject) {
                if (jSONObject != null && C8252x.this.f19746E) {
                    try {
                        jSONObject.put("connectionType", str);
                        C8252x xVar = C8252x.this;
                        String str2 = xVar.f19765a;
                        Logger.m24028i(str2, "device connection info changed: " + jSONObject.toString());
                        xVar.mo56622b(C8252x.m23704b("connectionInfoChanged", C8252x.m23688a("connectionInfo", jSONObject.toString(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        mo56522a(context);
        f19741y = FeaturesManager.getInstance().getDebugMode();
    }

    /* renamed from: a */
    private String m23686a(C8343d.C8348e eVar, JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.toString(jSONObject.optInt(IronSourceConstants.KEY_SESSION_DEPTH)));
        String optString = jSONObject.optString("demandSourceName");
        String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(jSONObject);
        C8342c a = this.f19763V.mo56571a(eVar, fetchDemandSourceId);
        if (a != null) {
            if (a.f20022d != null) {
                hashMap.putAll(a.f20022d);
            }
            if (!TextUtils.isEmpty(optString)) {
                hashMap.put("demandSourceName", optString);
            }
            if (!TextUtils.isEmpty(fetchDemandSourceId)) {
                hashMap.put("demandSourceId", fetchDemandSourceId);
            }
        }
        Map<String, String> a2 = m23689a(eVar);
        if (a2 != null) {
            hashMap.putAll(a2);
        }
        String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
        C8336a.C8337a a3 = C8336a.C8337a.m23905a(eVar);
        return m23687a(a3.f19988a, flatMapToJsonAsString, a3.f19989b, a3.f19990c);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static String m23687a(String str, String str2, String str3, String str4) {
        return "SSA_CORE.SDKController.runFunction('" + str + "?parameters=" + str2 + "','" + str3 + "','" + str4 + "');";
    }

    /* renamed from: a */
    public static String m23688a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                jSONObject.put(str, SDKUtils.encodeString(str2));
            }
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                jSONObject.put(str3, SDKUtils.encodeString(str4));
            }
            if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) {
                jSONObject.put(str5, SDKUtils.encodeString(str6));
            }
            if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str8)) {
                jSONObject.put(str7, SDKUtils.encodeString(str8));
            }
            if (!TextUtils.isEmpty(str9)) {
                jSONObject.put(str9, z);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    private Map<String, String> m23689a(C8343d.C8348e eVar) {
        if (eVar == C8343d.C8348e.OfferWall) {
            return this.f19744C;
        }
        return null;
    }

    /* renamed from: a */
    static /* synthetic */ void m23691a(C8252x xVar, final String str, final C8343d.C8348e eVar, final C8342c cVar) {
        if (xVar.mo56620a(eVar.toString())) {
            xVar.mo56623c((Runnable) new Runnable() {
                public final void run() {
                    if (C8343d.C8348e.RewardedVideo == eVar || C8343d.C8348e.Interstitial == eVar || C8343d.C8348e.Banner == eVar) {
                        C8342c cVar = cVar;
                        if (cVar != null && !TextUtils.isEmpty(cVar.f20020b)) {
                            C8361a a = C8252x.this.m23701b(eVar);
                            String b = C8252x.this.f19765a;
                            Log.d(b, "onAdProductInitFailed (message:" + str + ")(" + eVar + ")");
                            if (a != null) {
                                a.mo56782a(eVar, cVar.f20020b, str);
                            }
                        }
                    } else if (C8343d.C8348e.OfferWall == eVar) {
                        C8252x.this.f19756O.onOfferwallInitFail(str);
                    } else if (C8343d.C8348e.OfferWallCredits == eVar) {
                        C8252x.this.f19756O.onGetOWCreditsFailed(str);
                    }
                }
            });
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0023;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m23692a(com.ironsource.sdk.controller.C8252x r3, java.lang.String r4, boolean r5, java.lang.String r6, java.lang.String r7) {
        /*
            com.ironsource.sdk.g.f r0 = new com.ironsource.sdk.g.f
            r0.<init>(r4)
            java.lang.String r1 = f19736ab
            java.lang.String r1 = r0.mo56866d(r1)
            java.lang.String r2 = f19737ac
            java.lang.String r0 = r0.mo56866d(r2)
            if (r5 == 0) goto L_0x001a
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L_0x0022
            goto L_0x0023
        L_0x001a:
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L_0x0022
            r1 = r0
            goto L_0x0023
        L_0x0022:
            r1 = 0
        L_0x0023:
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L_0x005a
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            if (r5 != 0) goto L_0x003e
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x003e }
            r5.<init>(r4)     // Catch:{ JSONException -> 0x003e }
            java.lang.String r0 = "errMsg"
            org.json.JSONObject r5 = r5.put(r0, r6)     // Catch:{ JSONException -> 0x003e }
            java.lang.String r4 = r5.toString()     // Catch:{ JSONException -> 0x003e }
        L_0x003e:
            boolean r5 = android.text.TextUtils.isEmpty(r7)
            if (r5 != 0) goto L_0x0053
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0053 }
            r5.<init>(r4)     // Catch:{ JSONException -> 0x0053 }
            java.lang.String r6 = "errCode"
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ JSONException -> 0x0053 }
            java.lang.String r4 = r5.toString()     // Catch:{ JSONException -> 0x0053 }
        L_0x0053:
            java.lang.String r4 = m23704b((java.lang.String) r1, (java.lang.String) r4)
            r3.mo56622b((java.lang.String) r4)
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.C8252x.m23692a(com.ironsource.sdk.controller.x, java.lang.String, boolean, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    static /* synthetic */ void m23693a(C8252x xVar, JSONObject jSONObject) {
        if (jSONObject.optBoolean("inspectWebview") && Build.VERSION.SDK_INT >= 19) {
            setWebContentsDebuggingEnabled(true);
        }
    }

    /* renamed from: a */
    private void m23694a(String str, String str2, C8343d.C8348e eVar, C8342c cVar, C8306e eVar2) {
        String str3;
        String str4;
        String str5;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            eVar2.mo56643a("User id or Application key are missing", eVar, cVar);
            return;
        }
        C8307f fVar = new C8307f();
        if (eVar == C8343d.C8348e.RewardedVideo || eVar == C8343d.C8348e.Interstitial || eVar == C8343d.C8348e.OfferWall || eVar == C8343d.C8348e.Banner) {
            HashMap hashMap = new HashMap();
            hashMap.put("applicationKey", this.f19742A);
            hashMap.put("applicationUserId", this.f19743B);
            if (cVar != null) {
                if (cVar.f20022d != null) {
                    hashMap.putAll(cVar.f20022d);
                    C8385a aVar = C8385a.f20107a;
                    hashMap.put("loadStartTime", String.valueOf(C8385a.m23992a(cVar.f20020b)));
                }
                hashMap.put("demandSourceName", cVar.f20019a);
                hashMap.put("demandSourceId", cVar.f20020b);
            }
            Map<String, String> a = m23689a(eVar);
            if (a != null) {
                hashMap.putAll(a);
            }
            String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
            C8336a.C8337a aVar2 = new C8336a.C8337a();
            if (eVar == C8343d.C8348e.RewardedVideo) {
                aVar2.f19988a = "initRewardedVideo";
                aVar2.f19989b = "onInitRewardedVideoSuccess";
                str5 = "onInitRewardedVideoFail";
            } else if (eVar == C8343d.C8348e.Interstitial) {
                aVar2.f19988a = "initInterstitial";
                aVar2.f19989b = "onInitInterstitialSuccess";
                str5 = "onInitInterstitialFail";
            } else if (eVar == C8343d.C8348e.OfferWall) {
                aVar2.f19988a = "initOfferWall";
                aVar2.f19989b = "onInitOfferWallSuccess";
                str5 = "onInitOfferWallFail";
            } else {
                if (eVar == C8343d.C8348e.Banner) {
                    aVar2.f19988a = "initBanner";
                    aVar2.f19989b = "onInitBannerSuccess";
                    str5 = "onInitBannerFail";
                }
                str4 = m23687a(aVar2.f19988a, flatMapToJsonAsString, aVar2.f19989b, aVar2.f19990c);
                str3 = aVar2.f19988a;
            }
            aVar2.f19990c = str5;
            str4 = m23687a(aVar2.f19988a, flatMapToJsonAsString, aVar2.f19989b, aVar2.f19990c);
            str3 = aVar2.f19988a;
        } else {
            if (eVar == C8343d.C8348e.OfferWallCredits) {
                str3 = "getUserCredits";
                str4 = m23687a(str3, m23688a("productType", "OfferWall", "applicationKey", this.f19742A, "applicationUserId", this.f19743B, (String) null, (String) null, (String) null, false), "null", "onGetUserCreditsFail");
            }
            mo56622b(fVar.f19904b);
        }
        fVar.f19903a = str3;
        fVar.f19904b = str4;
        mo56622b(fVar.f19904b);
    }

    /* renamed from: a */
    private void m23695a(String str, String str2, String str3) {
        try {
            mo56622b(m23704b("assetCachedFailed", m23688a(ShareInternalUtility.STAGING_PARAM, str, "path", m23729i(str2), "errMsg", str3, (String) null, (String) null, (String) null, false)));
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static int m23699b() {
        return f19741y;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C8361a m23701b(C8343d.C8348e eVar) {
        if (eVar == C8343d.C8348e.Interstitial) {
            return this.f19755N;
        }
        if (eVar == C8343d.C8348e.RewardedVideo) {
            return this.f19754M;
        }
        if (eVar == C8343d.C8348e.Banner) {
            return this.f19757P;
        }
        return null;
    }

    /* renamed from: b */
    public static String m23704b(String str, String str2) {
        return "SSA_CORE.SDKController.runFunction('" + str + "?parameters=" + str2 + "');";
    }

    /* renamed from: b */
    private String m23705b(JSONObject jSONObject) {
        C8391a a = C8391a.m24034a(getContext());
        StringBuilder sb = new StringBuilder();
        String sDKVersion = SDKUtils.getSDKVersion();
        if (!TextUtils.isEmpty(sDKVersion)) {
            sb.append("SDKVersion=");
            sb.append(sDKVersion);
            sb.append("&");
        }
        String str = a.f20131c;
        if (!TextUtils.isEmpty(str)) {
            sb.append("deviceOs=");
            sb.append(str);
        }
        Uri parse = Uri.parse(SDKUtils.getControllerUrl());
        if (parse != null) {
            String str2 = parse.getScheme() + CertificateUtil.DELIMITER;
            String host = parse.getHost();
            int port = parse.getPort();
            if (port != -1) {
                host = host + CertificateUtil.DELIMITER + port;
            }
            sb.append("&protocol");
            sb.append("=");
            sb.append(str2);
            sb.append("&domain");
            sb.append("=");
            sb.append(host);
            if (jSONObject.keys().hasNext()) {
                try {
                    String jSONObject2 = new JSONObject(jSONObject, new String[]{"isSecured", "applicationKey"}).toString();
                    if (!TextUtils.isEmpty(jSONObject2)) {
                        sb.append("&controllerConfig");
                        sb.append("=");
                        sb.append(jSONObject2);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            sb.append("&debug");
            sb.append("=");
            sb.append(f19741y);
        }
        return sb.toString();
    }

    /* renamed from: b */
    static /* synthetic */ void m23706b(C8252x xVar, Context context) {
        try {
            if (xVar.f19766aa != null) {
                xVar.f19766aa.f20100a.mo56888a(context);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m23711c(C8252x xVar, Context context) {
        try {
            if (xVar.f19766aa != null) {
                xVar.f19766aa.f20100a.mo56889b(context);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m23712c(C8252x xVar, final String str, String str2) {
        final String d = new C8350f(str2).mo56866d("errMsg");
        if (!TextUtils.isEmpty(d)) {
            xVar.mo56617a((Runnable) new Runnable() {
                public final void run() {
                    if (C8252x.m23699b() == C8343d.C8347d.MODE_3.f20055d) {
                        Activity a = C8252x.this.f19783u.mo56507a();
                        Toast.makeText(a, str + " : " + d, 1).show();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public Object[] m23714c(Context context) {
        boolean z;
        C8391a a = C8391a.m24034a(context);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appOrientation", "none");
            jSONObject.put("deviceOrientation", SDKUtils.translateDeviceOrientation(C6429h.m19336o(context)));
            String str = a.f20129a;
            if (str != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOEM"), SDKUtils.encodeString(str));
            }
            String str2 = a.f20130b;
            if (str2 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceModel"), SDKUtils.encodeString(str2));
                z = false;
            } else {
                z = true;
            }
            try {
                SDKUtils.loadGoogleAdvertiserInfo(context);
                String advertiserId = SDKUtils.getAdvertiserId();
                Boolean valueOf = Boolean.valueOf(SDKUtils.isLimitAdTrackingEnabled());
                if (!TextUtils.isEmpty(advertiserId)) {
                    Logger.m24028i(this.f19765a, "add AID and LAT");
                    jSONObject.put("isLimitAdTrackingEnabled", valueOf);
                    jSONObject.put("deviceIds" + "[AID" + "]", SDKUtils.encodeString(advertiserId));
                }
                String str3 = a.f20131c;
                if (str3 != null) {
                    jSONObject.put(SDKUtils.encodeString("deviceOs"), SDKUtils.encodeString(str3));
                } else {
                    z = true;
                }
                String str4 = a.f20132d;
                if (str4 != null) {
                    jSONObject.put(SDKUtils.encodeString("deviceOSVersion"), str4.replaceAll("[^0-9/.]", ""));
                } else {
                    z = true;
                }
                String str5 = a.f20132d;
                if (str5 != null) {
                    jSONObject.put(SDKUtils.encodeString("deviceOSVersionFull"), SDKUtils.encodeString(str5));
                }
                String valueOf2 = String.valueOf(a.f20133e);
                if (valueOf2 != null) {
                    jSONObject.put(SDKUtils.encodeString("deviceApiLevel"), valueOf2);
                } else {
                    z = true;
                }
                String sDKVersion = SDKUtils.getSDKVersion();
                if (sDKVersion != null) {
                    jSONObject.put(SDKUtils.encodeString("SDKVersion"), SDKUtils.encodeString(sDKVersion));
                }
                if (a.f20134f != null && a.f20134f.length() > 0) {
                    jSONObject.put(SDKUtils.encodeString("mobileCarrier"), SDKUtils.encodeString(a.f20134f));
                }
                String a2 = C6392a.m19175a(context);
                if (!a2.equals("none")) {
                    jSONObject.put(SDKUtils.encodeString("connectionType"), SDKUtils.encodeString(a2));
                } else {
                    z = true;
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    jSONObject.put(SDKUtils.encodeString("hasVPN"), C6392a.m19180c(context));
                }
                String language = context.getResources().getConfiguration().locale.getLanguage();
                if (!TextUtils.isEmpty(language)) {
                    jSONObject.put(SDKUtils.encodeString("deviceLanguage"), SDKUtils.encodeString(language.toUpperCase()));
                }
                if (SDKUtils.isExternalStorageAvailable()) {
                    jSONObject.put(SDKUtils.encodeString("diskFreeSize"), SDKUtils.encodeString(String.valueOf(C6429h.m19302a(this.f19759R))));
                } else {
                    z = true;
                }
                String valueOf3 = String.valueOf(C6429h.m19331m());
                if (!TextUtils.isEmpty(valueOf3)) {
                    jSONObject.put(SDKUtils.encodeString("deviceScreenSize") + "[" + SDKUtils.encodeString("width") + "]", SDKUtils.encodeString(valueOf3));
                } else {
                    z = true;
                }
                jSONObject.put(SDKUtils.encodeString("deviceScreenSize") + "[" + SDKUtils.encodeString("height") + "]", SDKUtils.encodeString(String.valueOf(C6429h.m19333n())));
                String packageName = getContext().getPackageName();
                if (!TextUtils.isEmpty(packageName)) {
                    jSONObject.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(packageName));
                }
                String valueOf4 = String.valueOf(C6429h.m19335o());
                if (!TextUtils.isEmpty(valueOf4)) {
                    jSONObject.put(SDKUtils.encodeString("deviceScreenScale"), SDKUtils.encodeString(valueOf4));
                }
                String valueOf5 = String.valueOf(C6429h.m19326j());
                if (!TextUtils.isEmpty(valueOf5)) {
                    jSONObject.put(SDKUtils.encodeString("unLocked"), SDKUtils.encodeString(valueOf5));
                }
                C8391a.m24034a(context);
                jSONObject.put(SDKUtils.encodeString("deviceVolume"), (double) C8391a.m24036b(context));
                jSONObject.put(SDKUtils.encodeString("batteryLevel"), C6429h.m19347v(context));
                jSONObject.put(SDKUtils.encodeString("mcc"), C6399a.C64001.m19223c(context));
                jSONObject.put(SDKUtils.encodeString("mnc"), C6399a.C64001.m19226d(context));
                jSONObject.put(SDKUtils.encodeString("phoneType"), C6399a.C64001.m19229f(context));
                jSONObject.put(SDKUtils.encodeString("simOperator"), SDKUtils.encodeString(C6399a.C64001.m19228e(context)));
                jSONObject.put(SDKUtils.encodeString("lastUpdateTime"), C6408c.m19239b(context));
                jSONObject.put(SDKUtils.encodeString("firstInstallTime"), C6408c.m19236a(context));
                jSONObject.put(SDKUtils.encodeString("appVersion"), SDKUtils.encodeString(C6408c.m19241c(context)));
                String d = C6408c.m19243d(context);
                if (!TextUtils.isEmpty(d)) {
                    jSONObject.put(SDKUtils.encodeString("installerPackageName"), SDKUtils.encodeString(d));
                }
                jSONObject.put(SDKUtils.encodeString("gpi"), C6434k.m19355a(getContext()));
                jSONObject.put(SDKUtils.encodeString("screenBrightness"), C6429h.m19351z(context));
            } catch (JSONException e) {
                e = e;
                e.printStackTrace();
                return new Object[]{jSONObject.toString(), Boolean.valueOf(z)};
            }
        } catch (JSONException e2) {
            e = e2;
            z = false;
            e.printStackTrace();
            return new Object[]{jSONObject.toString(), Boolean.valueOf(z)};
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z)};
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public Object[] m23715c(String str, String str2) {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        Map<String, String> map = null;
        if (!TextUtils.isEmpty(str)) {
            C8343d.C8348e h = m23726h(str);
            if (h == C8343d.C8348e.OfferWall) {
                map = this.f19744C;
            } else {
                C8342c a = this.f19763V.mo56571a(h, str2);
                if (a != null) {
                    Map<String, String> map2 = a.f20022d;
                    map2.put("demandSourceName", a.f20019a);
                    map2.put("demandSourceId", a.f20020b);
                    map = map2;
                }
            }
            try {
                jSONObject.put("productType", str);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            try {
                Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
                if (initSDKParams != null) {
                    jSONObject = SDKUtils.mergeJSONObjects(jSONObject, new JSONObject(initSDKParams));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            z = false;
        } else {
            z = true;
        }
        if (!TextUtils.isEmpty(this.f19743B)) {
            try {
                jSONObject.put(SDKUtils.encodeString("applicationUserId"), SDKUtils.encodeString(this.f19743B));
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        } else {
            z = true;
        }
        if (!TextUtils.isEmpty(this.f19742A)) {
            try {
                jSONObject.put(SDKUtils.encodeString("applicationKey"), SDKUtils.encodeString(this.f19742A));
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
        } else {
            z = true;
        }
        if (map != null && !map.isEmpty()) {
            for (Map.Entry next : map.entrySet()) {
                if (((String) next.getKey()).equalsIgnoreCase("sdkWebViewCache")) {
                    if (((String) next.getValue()).equalsIgnoreCase("0")) {
                        getSettings().setCacheMode(2);
                    } else {
                        getSettings().setCacheMode(-1);
                    }
                }
                try {
                    jSONObject.put(SDKUtils.encodeString((String) next.getKey()), SDKUtils.encodeString((String) next.getValue()));
                } catch (JSONException e5) {
                    e5.printStackTrace();
                }
            }
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z)};
    }

    /* renamed from: g */
    static String m23722g(String str) {
        return "SSA_CORE.SDKController.runFunction('" + str + "');";
    }

    /* renamed from: g */
    static /* synthetic */ void m23723g(C8252x xVar, String str) {
        C8350f fVar = new C8350f(str);
        String d = fVar.mo56866d("color");
        String d2 = fVar.mo56866d("adViewId");
        int parseColor = !TJAdUnitConstants.String.TRANSPARENT.equalsIgnoreCase(d) ? Color.parseColor(d) : 0;
        if (d2 != null) {
            WebView b = C8173d.m23494a().mo56456a(d2).mo56442b();
            if (b != null) {
                b.setBackgroundColor(parseColor);
                return;
            }
            return;
        }
        xVar.setBackgroundColor(parseColor);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static C8343d.C8348e m23726h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase(C8343d.C8348e.Interstitial.toString())) {
            return C8343d.C8348e.Interstitial;
        }
        if (str.equalsIgnoreCase(C8343d.C8348e.RewardedVideo.toString())) {
            return C8343d.C8348e.RewardedVideo;
        }
        if (str.equalsIgnoreCase(C8343d.C8348e.OfferWall.toString())) {
            return C8343d.C8348e.OfferWall;
        }
        if (str.equalsIgnoreCase(C8343d.C8348e.Banner.toString())) {
            return C8343d.C8348e.Banner;
        }
        return null;
    }

    /* renamed from: h */
    static /* synthetic */ void m23727h(C8252x xVar, String str) {
        try {
            String str2 = xVar.f19765a;
            Logger.m24028i(str2, "load(): " + str);
            xVar.loadUrl(str);
        } catch (Throwable th) {
            String str3 = xVar.f19765a;
            Logger.m24026e(str3, "WebViewController::load: " + th);
        }
    }

    /* renamed from: i */
    private String m23729i(String str) {
        String str2 = this.f19759R + File.separator;
        return str.contains(str2) ? str.substring(str2.length()) : str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C8372b mo56613a() {
        return C8372b.m23962a(this.f19759R, this.f19785w);
    }

    /* renamed from: a */
    public final void mo56614a(int i) {
        if (this.f19760S.mo56516a()) {
            final JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
            String b = m23705b(controllerConfigAsJSONObject);
            Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
            if (initSDKParams != null && initSDKParams.containsKey("sessionid")) {
                b = String.format("%s&sessionid=%s", new Object[]{b, initSDKParams.get("sessionid")});
            }
            final String str = this.f19760S.mo56519d().toURI().toString() + "?" + b;
            this.f19785w.mo35928a(new Runnable() {
                public final void run() {
                    C8252x.m23693a(C8252x.this, controllerConfigAsJSONObject);
                    C8252x.m23727h(C8252x.this, "about:blank");
                    C8252x.m23727h(C8252x.this, str);
                }
            });
            this.f19768f = new CountDownTimer(50000, 1000, i) {

                /* renamed from: b */
                private /* synthetic */ int f19797b;

                {
                    this.f19797b = r6;
                }

                public final void onFinish() {
                    Logger.m24028i(C8252x.this.f19765a, "Loading Controller Timer Finish");
                    int i = this.f19797b;
                    if (i == 3) {
                        C8252x.this.mo56623c((Runnable) new Runnable() {
                            public final void run() {
                                C8252x.this.f19764W.mo56512a("controller html - failed to load into web-view");
                            }
                        });
                    } else {
                        C8252x.this.mo56614a(i + 1);
                    }
                }

                public final void onTick(long j) {
                    String b = C8252x.this.f19765a;
                    Logger.m24028i(b, "Loading Controller Timer Tick " + j);
                }
            }.start();
            return;
        }
        Logger.m24028i(this.f19765a, "load(): Mobile Controller HTML Does not exist");
    }

    /* renamed from: a */
    public final void mo56522a(final Context context) {
        mo56621b((Runnable) new Runnable() {
            public final void run() {
                C8252x.m23706b(C8252x.this, context);
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        if (android.text.TextUtils.isEmpty(r3) == false) goto L_0x0047;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo56615a(com.ironsource.sdk.p293g.C8340b r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f19761T
            monitor-enter(r0)
            boolean r1 = r11.f20007d     // Catch:{ all -> 0x0144 }
            if (r1 == 0) goto L_0x0140
            boolean r1 = r10.f19746E     // Catch:{ all -> 0x0144 }
            if (r1 == 0) goto L_0x0140
            java.lang.String r1 = r10.f19765a     // Catch:{ all -> 0x0144 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0144 }
            java.lang.String r3 = "restoreState(state:"
            r2.<init>(r3)     // Catch:{ all -> 0x0144 }
            r2.append(r11)     // Catch:{ all -> 0x0144 }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x0144 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0144 }
            android.util.Log.d(r1, r2)     // Catch:{ all -> 0x0144 }
            int r1 = r11.f20008e     // Catch:{ all -> 0x0144 }
            r2 = -1
            if (r1 == r2) goto L_0x0089
            com.ironsource.sdk.g.d$e r3 = com.ironsource.sdk.p293g.C8343d.C8348e.RewardedVideo     // Catch:{ all -> 0x0144 }
            int r3 = r3.ordinal()     // Catch:{ all -> 0x0144 }
            if (r1 != r3) goto L_0x004b
            java.lang.String r1 = r10.f19765a     // Catch:{ all -> 0x0144 }
            java.lang.String r3 = "onRVAdClosed()"
            android.util.Log.d(r1, r3)     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.g.d$e r1 = com.ironsource.sdk.p293g.C8343d.C8348e.RewardedVideo     // Catch:{ all -> 0x0144 }
            java.lang.String r3 = r11.f20006c     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.j.a.a r4 = r10.m23701b((com.ironsource.sdk.p293g.C8343d.C8348e) r1)     // Catch:{ all -> 0x0144 }
            if (r4 == 0) goto L_0x0083
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0144 }
            if (r5 != 0) goto L_0x0083
        L_0x0047:
            r4.mo56780a(r1, r3)     // Catch:{ all -> 0x0144 }
            goto L_0x0083
        L_0x004b:
            com.ironsource.sdk.g.d$e r3 = com.ironsource.sdk.p293g.C8343d.C8348e.Interstitial     // Catch:{ all -> 0x0144 }
            int r3 = r3.ordinal()     // Catch:{ all -> 0x0144 }
            if (r1 != r3) goto L_0x006b
            java.lang.String r1 = r10.f19765a     // Catch:{ all -> 0x0144 }
            java.lang.String r3 = "onInterstitialAdClosed()"
            android.util.Log.d(r1, r3)     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.g.d$e r1 = com.ironsource.sdk.p293g.C8343d.C8348e.Interstitial     // Catch:{ all -> 0x0144 }
            java.lang.String r3 = r11.f20006c     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.j.a.a r4 = r10.m23701b((com.ironsource.sdk.p293g.C8343d.C8348e) r1)     // Catch:{ all -> 0x0144 }
            if (r4 == 0) goto L_0x0083
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0144 }
            if (r5 != 0) goto L_0x0083
            goto L_0x0047
        L_0x006b:
            com.ironsource.sdk.g.d$e r3 = com.ironsource.sdk.p293g.C8343d.C8348e.OfferWall     // Catch:{ all -> 0x0144 }
            int r3 = r3.ordinal()     // Catch:{ all -> 0x0144 }
            if (r1 != r3) goto L_0x0083
            java.lang.String r1 = r10.f19765a     // Catch:{ all -> 0x0144 }
            java.lang.String r3 = "onOWAdClosed()"
            android.util.Log.d(r1, r3)     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.j.e r1 = r10.f19756O     // Catch:{ all -> 0x0144 }
            if (r1 == 0) goto L_0x0083
            com.ironsource.sdk.j.e r1 = r10.f19756O     // Catch:{ all -> 0x0144 }
            r1.onOWAdClosed()     // Catch:{ all -> 0x0144 }
        L_0x0083:
            r11.f20008e = r2     // Catch:{ all -> 0x0144 }
            r1 = 0
            r11.f20006c = r1     // Catch:{ all -> 0x0144 }
            goto L_0x0090
        L_0x0089:
            java.lang.String r1 = r10.f19765a     // Catch:{ all -> 0x0144 }
            java.lang.String r2 = "No ad was opened"
            android.util.Log.d(r1, r2)     // Catch:{ all -> 0x0144 }
        L_0x0090:
            java.lang.String r1 = r11.f20009f     // Catch:{ all -> 0x0144 }
            java.lang.String r2 = r11.f20010g     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.controller.j r3 = r10.f19763V     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.g.d$e r4 = com.ironsource.sdk.p293g.C8343d.C8348e.Interstitial     // Catch:{ all -> 0x0144 }
            java.util.Collection r3 = r3.mo56575b(r4)     // Catch:{ all -> 0x0144 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0144 }
        L_0x00a0:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0144 }
            r5 = 2
            if (r4 == 0) goto L_0x00e1
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.g.c r4 = (com.ironsource.sdk.p293g.C8342c) r4     // Catch:{ all -> 0x0144 }
            int r6 = r4.f20023e     // Catch:{ all -> 0x0144 }
            if (r6 != r5) goto L_0x00a0
            java.lang.String r5 = r10.f19765a     // Catch:{ all -> 0x0144 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0144 }
            java.lang.String r7 = "initInterstitial(appKey:"
            r6.<init>(r7)     // Catch:{ all -> 0x0144 }
            r6.append(r1)     // Catch:{ all -> 0x0144 }
            java.lang.String r7 = ", userId:"
            r6.append(r7)     // Catch:{ all -> 0x0144 }
            r6.append(r2)     // Catch:{ all -> 0x0144 }
            java.lang.String r7 = ", demandSource:"
            r6.append(r7)     // Catch:{ all -> 0x0144 }
            java.lang.String r7 = r4.f20019a     // Catch:{ all -> 0x0144 }
            r6.append(r7)     // Catch:{ all -> 0x0144 }
            java.lang.String r7 = ")"
            r6.append(r7)     // Catch:{ all -> 0x0144 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0144 }
            android.util.Log.d(r5, r6)     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.j.a.c r5 = r10.f19755N     // Catch:{ all -> 0x0144 }
            r10.mo56528a((java.lang.String) r1, (java.lang.String) r2, (com.ironsource.sdk.p293g.C8342c) r4, (com.ironsource.sdk.p296j.p297a.C8363c) r5)     // Catch:{ all -> 0x0144 }
            goto L_0x00a0
        L_0x00e1:
            java.lang.String r1 = r11.f20004a     // Catch:{ all -> 0x0144 }
            java.lang.String r2 = r11.f20005b     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.controller.j r3 = r10.f19763V     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.g.d$e r4 = com.ironsource.sdk.p293g.C8343d.C8348e.RewardedVideo     // Catch:{ all -> 0x0144 }
            java.util.Collection r3 = r3.mo56575b(r4)     // Catch:{ all -> 0x0144 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0144 }
        L_0x00f1:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0144 }
            if (r4 == 0) goto L_0x013d
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.g.c r4 = (com.ironsource.sdk.p293g.C8342c) r4     // Catch:{ all -> 0x0144 }
            int r6 = r4.f20023e     // Catch:{ all -> 0x0144 }
            if (r6 != r5) goto L_0x00f1
            java.lang.String r6 = r4.f20019a     // Catch:{ all -> 0x0144 }
            java.lang.String r7 = r10.f19765a     // Catch:{ all -> 0x0144 }
            java.lang.String r8 = "onRVNoMoreOffers()"
            android.util.Log.d(r7, r8)     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.j.a.d r7 = r10.f19754M     // Catch:{ all -> 0x0144 }
            r7.mo56799b(r6)     // Catch:{ all -> 0x0144 }
            java.lang.String r7 = r10.f19765a     // Catch:{ all -> 0x0144 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0144 }
            java.lang.String r9 = "initRewardedVideo(appKey:"
            r8.<init>(r9)     // Catch:{ all -> 0x0144 }
            r8.append(r1)     // Catch:{ all -> 0x0144 }
            java.lang.String r9 = ", userId:"
            r8.append(r9)     // Catch:{ all -> 0x0144 }
            r8.append(r2)     // Catch:{ all -> 0x0144 }
            java.lang.String r9 = ", demandSource:"
            r8.append(r9)     // Catch:{ all -> 0x0144 }
            r8.append(r6)     // Catch:{ all -> 0x0144 }
            java.lang.String r6 = ")"
            r8.append(r6)     // Catch:{ all -> 0x0144 }
            java.lang.String r6 = r8.toString()     // Catch:{ all -> 0x0144 }
            android.util.Log.d(r7, r6)     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.j.a.d r6 = r10.f19754M     // Catch:{ all -> 0x0144 }
            r10.mo56529a((java.lang.String) r1, (java.lang.String) r2, (com.ironsource.sdk.p293g.C8342c) r4, (com.ironsource.sdk.p296j.p297a.C8364d) r6)     // Catch:{ all -> 0x0144 }
            goto L_0x00f1
        L_0x013d:
            r1 = 0
            r11.f20007d = r1     // Catch:{ all -> 0x0144 }
        L_0x0140:
            r10.f19775m = r11     // Catch:{ all -> 0x0144 }
            monitor-exit(r0)     // Catch:{ all -> 0x0144 }
            return
        L_0x0144:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0144 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.C8252x.mo56615a(com.ironsource.sdk.g.b):void");
    }

    /* renamed from: a */
    public final void mo56523a(C8342c cVar, Map<String, String> map, C8362b bVar) {
        Map<String, String> mergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, cVar.mo56845a()});
        if (map != null) {
            mo56622b(m23687a("loadBanner", SDKUtils.flatMapToJsonAsString(mergeHashMaps), "onLoadBannerSuccess", "onLoadBannerFail"));
        }
    }

    /* renamed from: a */
    public final void mo56524a(C8342c cVar, Map<String, String> map, C8363c cVar2) {
        Map<String, String> mergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, cVar.mo56845a()});
        this.f19775m.mo56839a(cVar.f20020b, true);
        mo56622b(m23687a("loadInterstitial", SDKUtils.flatMapToJsonAsString(mergeHashMaps), "onLoadInterstitialSuccess", "onLoadInterstitialFail"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo56616a(final C8343d.C8348e eVar, final String str) {
        mo56623c((Runnable) new Runnable() {
            public final void run() {
                if (eVar == C8343d.C8348e.RewardedVideo || eVar == C8343d.C8348e.Interstitial) {
                    C8361a a = C8252x.this.m23701b(eVar);
                    if (a != null) {
                        a.mo56780a(eVar, str);
                    }
                } else if (eVar == C8343d.C8348e.OfferWall) {
                    C8252x.this.f19756O.onOWAdClosed();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo56576a(C8355c cVar) {
        if (cVar.getName().contains("mobileController.html")) {
            C8192f fVar = this.f19760S;
            C82664 r0 = new Runnable() {
                public final void run() {
                    C8252x.this.mo56614a(1);
                }
            };
            if (!fVar.mo56516a()) {
                if (fVar.f19557c == C8192f.C8195a.f19565b) {
                    fVar.mo56518c();
                }
                fVar.f19558d = C8192f.C8196b.CONTROLLER_FROM_SERVER;
                fVar.mo56515a(fVar.f19558d);
                r0.run();
                return;
            }
            return;
        }
        String name = cVar.getName();
        String parent = cVar.getParent();
        try {
            mo56622b(m23704b("assetCached", m23688a(ShareInternalUtility.STAGING_PARAM, name, "path", m23729i(parent), (String) null, (String) null, (String) null, (String) null, (String) null, false)));
        } catch (Exception e) {
            m23695a(name, parent, e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo56577a(C8355c cVar, final C8349e eVar) {
        if (cVar.getName().contains("mobileController.html")) {
            C8192f fVar = this.f19760S;
            C82675 r0 = new Runnable() {
                public final void run() {
                    C8252x.this.mo56614a(1);
                }
            };
            C82686 r1 = new Runnable() {
                public final void run() {
                    C8191e h = C8252x.this.f19764W;
                    h.mo56512a("controller html - failed to download - " + eVar.f20063a);
                }
            };
            if (fVar.mo56516a()) {
                return;
            }
            if (fVar.f19557c != C8192f.C8195a.f19565b || !fVar.mo56520e()) {
                C8150a a = new C8150a().mo56415a("generalmessage", Integer.valueOf(fVar.f19556b));
                if (fVar.f19555a > 0) {
                    a.mo56415a("timingvalue", Long.valueOf(System.currentTimeMillis() - fVar.f19555a));
                }
                C8154d.m23442a(C8156f.f19438t, (Map<String, Object>) a.f19410a);
                r1.run();
                return;
            }
            fVar.f19558d = C8192f.C8196b.FALLBACK_CONTROLLER_RECOVERY;
            fVar.mo56515a(fVar.f19558d);
            r0.run();
            return;
        }
        m23695a(cVar.getName(), cVar.getParent(), eVar.f20063a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo56617a(Runnable runnable) {
        C6421a aVar = this.f19785w;
        if (aVar != null) {
            aVar.mo35928a(runnable);
        }
    }

    /* renamed from: a */
    public final void mo56526a(String str, C8363c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("demandSourceName", str);
        String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
        this.f19775m.mo56839a(str, true);
        mo56622b(m23687a("loadInterstitial", flatMapToJsonAsString, "onLoadInterstitialSuccess", "onLoadInterstitialFail"));
    }

    /* renamed from: a */
    public final void mo56618a(String str, String str2) {
        mo56622b(m23704b("onNativeLifeCycleEvent", m23688a("lifeCycleEvent", str2, "productType", str, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
    }

    /* renamed from: a */
    public final void mo56527a(String str, String str2, C8342c cVar, C8362b bVar) {
        this.f19742A = str;
        this.f19743B = str2;
        this.f19757P = bVar;
        m23694a(str, str2, C8343d.C8348e.Banner, cVar, (C8306e) new C8306e() {
            /* renamed from: a */
            public final void mo56643a(String str, C8343d.C8348e eVar, C8342c cVar) {
                C8252x.m23691a(C8252x.this, str, eVar, cVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo56528a(String str, String str2, C8342c cVar, C8363c cVar2) {
        this.f19742A = str;
        this.f19743B = str2;
        this.f19755N = cVar2;
        this.f19775m.f20009f = str;
        this.f19775m.f20010g = this.f19743B;
        m23694a(this.f19742A, this.f19743B, C8343d.C8348e.Interstitial, cVar, (C8306e) new C8306e() {
            /* renamed from: a */
            public final void mo56643a(String str, C8343d.C8348e eVar, C8342c cVar) {
                C8252x.m23691a(C8252x.this, str, eVar, cVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo56529a(String str, String str2, C8342c cVar, C8364d dVar) {
        this.f19742A = str;
        this.f19743B = str2;
        this.f19754M = dVar;
        this.f19775m.f20004a = str;
        this.f19775m.f20005b = str2;
        m23694a(str, str2, C8343d.C8348e.RewardedVideo, cVar, (C8306e) new C8306e() {
            /* renamed from: a */
            public final void mo56643a(String str, C8343d.C8348e eVar, C8342c cVar) {
                C8252x.m23691a(C8252x.this, str, eVar, cVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo56530a(String str, String str2, C8368e eVar) {
        this.f19742A = str;
        this.f19743B = str2;
        this.f19756O = eVar;
        m23694a(str, str2, C8343d.C8348e.OfferWallCredits, (C8342c) null, (C8306e) new C8306e() {
            /* renamed from: a */
            public final void mo56643a(String str, C8343d.C8348e eVar, C8342c cVar) {
                C8252x.m23691a(C8252x.this, str, eVar, cVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo56531a(String str, String str2, Map<String, String> map, C8368e eVar) {
        this.f19742A = str;
        this.f19743B = str2;
        this.f19744C = map;
        this.f19756O = eVar;
        this.f19775m.f20013j = map;
        this.f19775m.f20011h = true;
        m23694a(this.f19742A, this.f19743B, C8343d.C8348e.OfferWall, (C8342c) null, (C8306e) new C8306e() {
            /* renamed from: a */
            public final void mo56643a(String str, C8343d.C8348e eVar, C8342c cVar) {
                C8252x.m23691a(C8252x.this, str, eVar, cVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo56532a(Map<String, String> map, C8368e eVar) {
        this.f19744C = map;
        mo56622b("SSA_CORE.SDKController.runFunction('" + "showOfferWall" + "','" + "onShowOfferWallSuccess" + "','" + "onShowOfferWallFail" + "');");
    }

    /* renamed from: a */
    public final void mo56533a(JSONObject jSONObject) {
        mo56622b(m23704b("updateConsentInfo", jSONObject != null ? jSONObject.toString() : null));
    }

    /* renamed from: a */
    public final void mo56534a(JSONObject jSONObject, C8363c cVar) {
        mo56622b(m23686a(C8343d.C8348e.Interstitial, jSONObject));
    }

    /* renamed from: a */
    public final void mo56535a(JSONObject jSONObject, C8364d dVar) {
        mo56622b(m23686a(C8343d.C8348e.RewardedVideo, jSONObject));
    }

    /* renamed from: a */
    public final void mo56619a(boolean z, String str) {
        mo56622b(m23704b("viewableChange", m23688a("webview", str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, "isViewable", z)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo56620a(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            Logger.m24024d(this.f19765a, "Trying to trigger a listener - no product was found");
            return false;
        }
        if (!str.equalsIgnoreCase(C8343d.C8348e.Interstitial.toString()) ? !str.equalsIgnoreCase(C8343d.C8348e.RewardedVideo.toString()) ? !str.equalsIgnoreCase(C8343d.C8348e.Banner.toString()) ? (str.equalsIgnoreCase(C8343d.C8348e.OfferWall.toString()) || str.equalsIgnoreCase(C8343d.C8348e.OfferWallCredits.toString())) && this.f19756O != null : this.f19757P != null : this.f19754M != null : this.f19755N != null) {
            z = true;
        }
        if (!z) {
            Logger.m24024d(this.f19765a, "Trying to trigger a listener - no listener was found for product " + str);
        }
        return z;
    }

    /* renamed from: b */
    public final void mo56536b(final Context context) {
        mo56621b((Runnable) new Runnable() {
            public final void run() {
                C8252x.m23711c(C8252x.this, context);
            }
        });
    }

    /* renamed from: b */
    public final void mo56537b(C8342c cVar, Map<String, String> map, C8363c cVar2) {
        mo56622b(m23686a(C8343d.C8348e.Interstitial, new JSONObject(SDKUtils.mergeHashMaps(new Map[]{map, cVar.mo56845a()}))));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo56621b(Runnable runnable) {
        C6421a aVar = this.f19785w;
        if (aVar != null) {
            aVar.mo35929b(runnable);
        }
    }

    /* renamed from: b */
    public void mo56622b(String str) {
        if (!TextUtils.isEmpty(str)) {
            String str2 = "console.log(\"JS exeption: \" + JSON.stringify(e));";
            if (f19741y != C8343d.C8347d.MODE_0.f20055d && (f19741y < C8343d.C8347d.MODE_1.f20055d || f19741y > C8343d.C8347d.MODE_3.f20055d)) {
                str2 = "empty";
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("try{");
            sb.append(str);
            sb.append("}catch(e){");
            sb.append(str2);
            sb.append("}");
            final String str3 = "javascript:" + sb.toString();
            Logger.m24028i(this.f19765a, str3);
            mo56617a((Runnable) new Runnable() {
                public final void run() {
                    try {
                        if (C8252x.this.f19758Q != null) {
                            if (C8252x.this.f19758Q.booleanValue()) {
                                C8252x.this.evaluateJavascript(sb.toString(), (ValueCallback) null);
                            } else {
                                C8252x.this.loadUrl(str3);
                            }
                        } else if (Build.VERSION.SDK_INT >= 19) {
                            C8252x.this.evaluateJavascript(sb.toString(), (ValueCallback) null);
                            Boolean unused = C8252x.this.f19758Q = Boolean.TRUE;
                        } else {
                            C8252x.this.loadUrl(str3);
                            Boolean unused2 = C8252x.this.f19758Q = Boolean.FALSE;
                        }
                    } catch (Throwable th) {
                        String b = C8252x.this.f19765a;
                        Logger.m24026e(b, "injectJavascript: " + th.toString());
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public final C8343d.C8346c mo56538c() {
        return C8343d.C8346c.Web;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo56623c(Runnable runnable) {
        C6421a aVar = this.f19785w;
        if (aVar != null) {
            aVar.mo35930c(runnable);
        }
    }

    /* renamed from: c */
    public final boolean mo56539c(String str) {
        C8342c a = this.f19763V.mo56571a(C8343d.C8348e.Interstitial, str);
        return a != null && a.f20024f;
    }

    /* renamed from: d */
    public final void mo56540d() {
        mo56622b(m23687a("destroyBanner", "", "onDestroyBannersSuccess", "onDestroyBannersFail"));
    }

    /* renamed from: d */
    public final void mo56624d(String str) {
        String str2 = this.f19765a;
        Logger.m24028i(str2, "device status changed, connection type " + str);
        C8151b.m23436a(str);
        mo56622b(m23704b("deviceStatusChanged", m23688a("connectionType", str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
    }

    public void destroy() {
        super.destroy();
        C8372b bVar = this.f19745D;
        if (bVar != null) {
            bVar.mo56879a();
        }
        C8380b bVar2 = this.f19766aa;
        if (bVar2 != null) {
            bVar2.f20100a.mo56887a();
        }
        CountDownTimer countDownTimer = this.f19768f;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* renamed from: e */
    public final void mo56542e() {
        mo56622b(m23722g("enterForeground"));
    }

    /* renamed from: e */
    public final void mo56625e(String str) {
        if (str.equals(TJAdUnitConstants.String.FORCE_CLOSE)) {
            mo56628j();
        }
        mo56622b(m23704b("engageEnd", m23688a("action", str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
    }

    /* renamed from: f */
    public final void mo56543f() {
        mo56622b(m23722g("enterBackground"));
    }

    /* renamed from: f */
    public final boolean mo56626f(String str) {
        List<String> b = C8392b.m24037a().mo56914b();
        try {
            if (b.isEmpty()) {
                return false;
            }
            for (String contains : b) {
                if (str.contains(contains)) {
                    C6399a.C64001.m19217a(this.f19783u.mo56507a(), str, (String) null);
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: g */
    public final void mo56544g() {
        mo56615a(this.f19775m);
    }

    /* renamed from: h */
    public final void mo56545h() {
        C8150a aVar = new C8150a();
        C8192f fVar = this.f19760S;
        aVar.mo56415a("generalmessage", Integer.valueOf(fVar.f19556b));
        C8154d.m23442a(C8156f.f19436r, (Map<String, Object>) aVar.f19410a);
        fVar.f19555a = System.currentTimeMillis();
        if (this.f19760S.mo56517b()) {
            mo56614a(1);
        }
    }

    /* renamed from: i */
    public final void mo56627i() {
        mo56622b(m23722g("interceptedUrlToStore"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo56628j() {
        C8370g gVar = this.f19784v;
        if (gVar != null) {
            gVar.onCloseRequested();
        }
    }

    /* renamed from: k */
    public final void mo56629k() {
        try {
            onPause();
        } catch (Throwable th) {
            String str = this.f19765a;
            Logger.m24028i(str, "WebViewController: onPause() - " + th);
        }
    }

    /* renamed from: l */
    public final void mo56630l() {
        try {
            onResume();
        } catch (Throwable th) {
            String str = this.f19765a;
            Logger.m24028i(str, "WebViewController: onResume() - " + th);
        }
    }

    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        String str5 = this.f19765a;
        Logger.m24028i(str5, str + " " + str4);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C8370g gVar;
        if (i != 4 || (gVar = this.f19784v) == null || !gVar.onBackButtonPressed()) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public WebBackForwardList saveState(Bundle bundle) {
        return super.saveState(bundle);
    }
}
