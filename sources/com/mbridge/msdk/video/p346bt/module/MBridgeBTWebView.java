package com.mbridge.msdk.video.p346bt.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.click.C2295a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.C8526d;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.mbsignalcommon.base.C8795c;
import com.mbridge.msdk.mbsignalcommon.mraid.C8810b;
import com.mbridge.msdk.mbsignalcommon.p338b.C8789a;
import com.mbridge.msdk.mbsignalcommon.windvane.C8824g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.video.p346bt.p347a.C9196c;
import com.mbridge.msdk.video.signal.p369a.C9425j;
import com.mbridge.msdk.videocommon.p373d.C9551c;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.bt.module.MBridgeBTWebView */
public class MBridgeBTWebView extends BTBaseView implements C8810b {
    /* access modifiers changed from: private */

    /* renamed from: p */
    public String f22367p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public String f22368q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public String f22369r;

    /* renamed from: s */
    private boolean f22370s = false;

    /* renamed from: t */
    private ImageView f22371t;

    /* renamed from: u */
    private boolean f22372u = false;

    /* renamed from: v */
    private C9551c f22373v;

    /* renamed from: w */
    private List<CampaignEx> f22374w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public WindVaneWebView f22375x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public C9425j f22376y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public WebView f22377z;

    public void expand(String str, boolean z) {
    }

    public C9551c getRewardUnitSetting() {
        return this.f22373v;
    }

    public void setRewardUnitSetting(C9551c cVar) {
        this.f22373v = cVar;
    }

    public List<CampaignEx> getCampaigns() {
        return this.f22374w;
    }

    public void setCampaigns(List<CampaignEx> list) {
        this.f22374w = list;
    }

    public void setCreateWebView(WebView webView) {
        this.f22377z = webView;
    }

    public String getFileURL() {
        return this.f22367p;
    }

    public void setFileURL(String str) {
        this.f22367p = str;
        if (!TextUtils.isEmpty(str)) {
            boolean contains = str.contains("play.google.com");
            setWebviewClickable(!contains);
            if (contains) {
                C8795c cVar = new C8795c();
                WindVaneWebView windVaneWebView = this.f22375x;
                if (windVaneWebView != null) {
                    windVaneWebView.setFilter(cVar);
                }
            }
        }
    }

    public String getFilePath() {
        return this.f22368q;
    }

    public void setFilePath(String str) {
        this.f22368q = str;
    }

    public String getHtml() {
        return this.f22369r;
    }

    public void setHtml(String str) {
        this.f22369r = str;
    }

    public WindVaneWebView getWebView() {
        return this.f22375x;
    }

    public MBridgeBTWebView(Context context) {
        super(context);
    }

    public MBridgeBTWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setWebviewClickable(boolean z) {
        WindVaneWebView windVaneWebView = this.f22375x;
        if (windVaneWebView != null) {
            windVaneWebView.setClickable(z);
        }
    }

    public void init(Context context) {
        WindVaneWebView windVaneWebView = new WindVaneWebView(context);
        this.f22375x = windVaneWebView;
        windVaneWebView.setBackgroundColor(0);
        this.f22375x.setVisibility(0);
        C9425j jVar = new C9425j((Activity) null, this.f22191b, this.f22374w);
        this.f22376y = jVar;
        jVar.mo62816a(this.f22192c);
        this.f22375x.setObject(this.f22376y);
        this.f22375x.setMraidObject(this);
        this.f22375x.setWebViewListener(new C8789a() {
            /* renamed from: a */
            public final void mo58185a(Object obj) {
                super.mo58185a(obj);
                try {
                    String str = "";
                    String c = MBridgeBTWebView.this.f22376y != null ? MBridgeBTWebView.this.f22376y.mo62822c() : str;
                    if (!TextUtils.isEmpty(c)) {
                        str = Base64.encodeToString(c.getBytes(), 2);
                        C8608u.m24880a("RVWindVaneWebView", "getEndScreenInfo success");
                    } else {
                        C8608u.m24880a("RVWindVaneWebView", "getEndScreenInfo failed");
                    }
                    C8824g.m25670a().mo58311a(obj, str);
                } catch (Throwable th) {
                    C8608u.m24880a("RVWindVaneWebView", th.getMessage());
                }
            }

            /* renamed from: a */
            public final void mo57902a(WebView webView, String str) {
                super.mo57902a(webView, str);
                if (MBridgeBTWebView.this.f22377z != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", MBridgeBTWebView.this.f22193d);
                        jSONObject.put("code", BTBaseView.f22188n);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("id", MBridgeBTWebView.this.f22193d);
                        jSONObject2.put(IronSourceConstants.EVENTS_RESULT, 1);
                        jSONObject.put("data", jSONObject2);
                        C8824g.m25670a().mo58310a(MBridgeBTWebView.this.f22377z, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e) {
                        C9196c.m26194a().mo62125a(MBridgeBTWebView.this.f22377z, e.getMessage());
                        C8608u.m24880a("RVWindVaneWebView", e.getMessage());
                    }
                }
                C8824g.m25670a().mo58309a(MBridgeBTWebView.this.f22375x);
            }

            /* renamed from: a */
            public final void mo57900a(WebView webView, int i, String str, String str2) {
                super.mo57900a(webView, i, str, str2);
                if (MBridgeBTWebView.this.f22377z != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", MBridgeBTWebView.this.f22193d);
                        jSONObject.put("code", BTBaseView.f22188n);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("id", MBridgeBTWebView.this.f22193d);
                        jSONObject2.put(IronSourceConstants.EVENTS_RESULT, 2);
                        jSONObject2.put("error", str);
                        jSONObject.put("data", jSONObject2);
                        C8824g.m25670a().mo58310a(MBridgeBTWebView.this.f22377z, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e) {
                        C9196c.m26194a().mo62125a(MBridgeBTWebView.this.f22377z, e.getMessage());
                        C8608u.m24880a("RVWindVaneWebView", e.getMessage());
                    }
                }
            }

            /* renamed from: a */
            public final void mo57901a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                super.mo57901a(webView, sslErrorHandler, sslError);
                if (MBridgeBTWebView.this.f22377z != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", MBridgeBTWebView.this.f22193d);
                        jSONObject.put("code", BTBaseView.f22188n);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("id", MBridgeBTWebView.this.f22193d);
                        jSONObject2.put(IronSourceConstants.EVENTS_RESULT, 2);
                        jSONObject2.put("error", sslError.toString());
                        jSONObject.put("data", jSONObject2);
                        C8824g.m25670a().mo58310a(MBridgeBTWebView.this.f22377z, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e) {
                        C9196c.m26194a().mo62125a(MBridgeBTWebView.this.f22377z, e.getMessage());
                        C8608u.m24880a("RVWindVaneWebView", e.getMessage());
                    }
                }
            }

            /* renamed from: a */
            public final void mo57899a(WebView webView, int i) {
                super.mo57899a(webView, i);
            }
        });
        addView(this.f22375x, new FrameLayout.LayoutParams(-1, -1));
        setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                if (MBridgeBTWebView.this.f22377z != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", BTBaseView.f22188n);
                        jSONObject.put("id", MBridgeBTWebView.this.f22193d);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", String.valueOf(view.getX()));
                        jSONObject2.put("y", String.valueOf(view.getY()));
                        jSONObject.put("data", jSONObject2);
                        C8824g.m25670a().mo58310a(MBridgeBTWebView.this.f22377z, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception unused) {
                        C9196c.m26194a().mo62126a(MBridgeBTWebView.this.f22377z, "onClicked", MBridgeBTWebView.this.f22193d);
                    }
                }
            }
        });
        try {
            ImageView imageView = new ImageView(getContext());
            this.f22371t = imageView;
            imageView.setImageResource(findDrawable("mbridge_reward_close"));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
            layoutParams.gravity = 8388661;
            layoutParams.setMargins(30, 30, 30, 30);
            this.f22371t.setLayoutParams(layoutParams);
            this.f22371t.setVisibility(this.f22370s ? 4 : 8);
            if (this.f22191b != null && this.f22191b.isMraid()) {
                this.f22371t.setVisibility(4);
            }
            this.f22371t.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    MBridgeBTWebView.this.close();
                }
            });
            addView(this.f22371t);
        } catch (Throwable th) {
            C8608u.m24880a(BTBaseView.TAG, th.getMessage());
        }
    }

    public void setWebViewRid(String str) {
        WindVaneWebView windVaneWebView = this.f22375x;
        if (windVaneWebView != null) {
            windVaneWebView.setRid(str);
        }
    }

    public void preload() {
        if (!TextUtils.isEmpty(this.f22367p)) {
            this.f22375x.loadUrl(this.f22367p);
        } else if (!TextUtils.isEmpty(this.f22368q)) {
            this.f22375x.loadUrl(this.f22368q);
        } else if (!TextUtils.isEmpty(this.f22369r)) {
            this.f22375x.loadDataWithBaseURL("", this.f22369r, "text/html", "UTF-8", (String) null);
        }
    }

    public void webviewLoad(int i) {
        if (this.f22376y == null) {
            this.f22376y = new C9425j((Activity) null, this.f22191b, this.f22374w);
        }
        if (this.f22191b != null) {
            this.f22376y.mo62848a(this.f22191b);
        } else {
            List<CampaignEx> list = this.f22374w;
            if (list != null && list.size() > 0) {
                this.f22376y.mo62849a(this.f22374w);
                if (this.f22374w.size() == 1) {
                    this.f22376y.mo62848a(this.f22374w.get(0));
                }
            }
        }
        C9551c cVar = this.f22373v;
        if (cVar != null) {
            this.f22376y.mo62815a(cVar);
        }
        this.f22376y.mo62816a(this.f22192c);
        this.f22376y.mo62850c(this.f22193d);
        if (i == 1) {
            this.f22376y.mo62855n();
        }
        WindVaneWebView windVaneWebView = this.f22375x;
        if (windVaneWebView != null) {
            windVaneWebView.setObject(this.f22376y);
        }
        if (this.f22191b != null && this.f22191b.isMraid()) {
            this.f22371t.setVisibility(4);
        }
        preload();
    }

    public boolean webviewReload() {
        WindVaneWebView windVaneWebView = this.f22375x;
        if (windVaneWebView == null) {
            return false;
        }
        windVaneWebView.reload();
        return true;
    }

    public boolean webviewGoBack() {
        WindVaneWebView windVaneWebView = this.f22375x;
        if (windVaneWebView == null || !windVaneWebView.canGoBack()) {
            return false;
        }
        this.f22375x.goBack();
        return true;
    }

    public boolean webviewGoForward() {
        WindVaneWebView windVaneWebView = this.f22375x;
        if (windVaneWebView == null || !windVaneWebView.canGoForward()) {
            return false;
        }
        this.f22375x.goForward();
        return true;
    }

    public void broadcast(String str, JSONObject jSONObject) {
        if (this.f22375x != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", f22188n);
                jSONObject2.put("id", this.f22193d);
                jSONObject2.put("eventName", str);
                jSONObject2.put("data", jSONObject);
                C8824g.m25670a().mo58310a((WebView) this.f22375x, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                C9196c.m26194a().mo62126a((WebView) this.f22375x, "broadcast", this.f22193d);
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (this.f22375x != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (configuration.orientation == 2) {
                    jSONObject.put("orientation", "landscape");
                } else {
                    jSONObject.put("orientation", "portrait");
                }
                jSONObject.put("instanceId", this.f22193d);
                C8824g.m25670a().mo58310a((WebView) this.f22375x, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void onBackPressed() {
        if (this.f22375x != null) {
            C9196c.m26194a().mo62126a((WebView) this.f22375x, "onSystemBackPressed", this.f22193d);
        }
    }

    public void onDestory() {
        if (!this.f22372u) {
            this.f22372u = true;
            try {
                if (this.f22375x != null) {
                    C9196c.m26194a().mo62126a((WebView) this.f22375x, "onSystemDestory", this.f22193d);
                }
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    public final void run() {
                        try {
                            if (MBridgeBTWebView.this.f22375x != null) {
                                MBridgeBTWebView.this.f22375x.clearWebView();
                                MBridgeBTWebView.this.f22375x.release();
                            }
                            String unused = MBridgeBTWebView.this.f22367p = null;
                            String unused2 = MBridgeBTWebView.this.f22368q = null;
                            String unused3 = MBridgeBTWebView.this.f22369r = null;
                            if (MBridgeBTWebView.this.f22377z != null) {
                                WebView unused4 = MBridgeBTWebView.this.f22377z = null;
                            }
                        } catch (Throwable th) {
                            C8608u.m24880a(BTBaseView.TAG, th.getMessage());
                        }
                    }
                }, 500);
                setOnClickListener((View.OnClickListener) null);
                removeAllViews();
            } catch (Throwable th) {
                C8608u.m24880a(BTBaseView.TAG, th.getMessage());
            }
        }
    }

    public void open(String str) {
        String clickURL;
        try {
            clickURL = this.f22191b.getClickURL();
            if (!TextUtils.isEmpty(str)) {
                this.f22191b.setClickURL(str);
                CampaignEx mraidCampaign = getMraidCampaign();
                if (mraidCampaign != null) {
                    new C8526d(getContext()).mo57698b(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.f22192c, str, this.f22191b.isBidCampaign());
                }
            }
        } catch (Throwable th) {
            C8608u.m24884d(BTBaseView.TAG, th.getMessage());
            return;
        }
        new C2295a(getContext(), this.f22192c).mo15639a(this.f22191b);
        this.f22191b.setClickURL(clickURL);
    }

    public void close() {
        WebView webView = this.f22377z;
        if (webView != null) {
            m26261a(webView, "onPlayerCloseBtnClicked", this.f22193d);
        }
    }

    public void unload() {
        close();
    }

    public CampaignEx getMraidCampaign() {
        return this.f22191b;
    }

    public void useCustomClose(boolean z) {
        try {
            this.f22371t.setVisibility(z ? 4 : 0);
        } catch (Throwable th) {
            C8608u.m24884d(BTBaseView.TAG, th.getMessage());
        }
    }
}
