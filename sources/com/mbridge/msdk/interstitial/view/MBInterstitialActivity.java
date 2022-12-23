package com.mbridge.msdk.interstitial.view;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.activity.MBBaseActivity;
import com.mbridge.msdk.click.C2295a;
import com.mbridge.msdk.click.C2309b;
import com.mbridge.msdk.click.p057a.C2302a;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.controller.C2358b;
import com.mbridge.msdk.foundation.entity.C8412m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p064b.C2339a;
import com.mbridge.msdk.foundation.p064b.C2347b;
import com.mbridge.msdk.foundation.p066db.C2374f;
import com.mbridge.msdk.foundation.p066db.C2376g;
import com.mbridge.msdk.foundation.p066db.C2379j;
import com.mbridge.msdk.foundation.same.p299a.C8417d;
import com.mbridge.msdk.foundation.same.p304f.C8442b;
import com.mbridge.msdk.foundation.same.report.C8524c;
import com.mbridge.msdk.foundation.same.report.C8526d;
import com.mbridge.msdk.foundation.tools.C8556ac;
import com.mbridge.msdk.foundation.tools.C8594o;
import com.mbridge.msdk.foundation.tools.C8596q;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.interstitial.p317b.C8633a;
import com.mbridge.msdk.interstitial.p318c.C8634a;
import com.mbridge.msdk.mbsignalcommon.mraid.C8808a;
import com.mbridge.msdk.mbsignalcommon.mraid.C8810b;
import com.mbridge.msdk.mbsignalcommon.mraid.C8811c;
import com.mbridge.msdk.mbsignalcommon.mraid.C8812d;
import com.mbridge.msdk.mbsignalcommon.windvane.C8821d;
import com.mbridge.msdk.mbsignalcommon.windvane.C8824g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.p054c.C2283b;
import com.mbridge.msdk.p054c.C2294d;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class MBInterstitialActivity extends MBBaseActivity implements C8810b {
    public static final String INTENT_CAMAPIGN = "campaign";
    public static final String INTENT_UNIT_ID = "unitId";
    public static final long WATI_JS_INVOKE = 2000;
    public static final long WEB_LOAD_TIME = 15000;

    /* renamed from: a */
    Runnable f20925a = new Runnable() {
        public final void run() {
            if (!MBInterstitialActivity.this.f20928d) {
                boolean unused = MBInterstitialActivity.this.f20927c = true;
                if (MBInterstitialActivity.this.f20932h != null) {
                    MBInterstitialActivity.this.f20932h.mo57850a("load page timeout");
                    if (MBInterstitialActivity.this.f20930f != null) {
                        MBInterstitialActivity.this.f20930f.setVisibility(8);
                        MBInterstitialActivity.this.f20930f.setWebViewListener((C8821d) null);
                        MBInterstitialActivity.this.f20930f.release();
                    }
                    MBInterstitialActivity.this.hideLoading();
                }
            }
        }
    };

    /* renamed from: b */
    Runnable f20926b = new Runnable() {
        public final void run() {
            if (!MBInterstitialActivity.this.mIsMBPage) {
                if (MBInterstitialActivity.this.f20929e != null && MBInterstitialActivity.this.f20929e.isMraid()) {
                    MBInterstitialActivity.m25071h(MBInterstitialActivity.this);
                }
                C8633a.m25004a().mo57837a(MBInterstitialActivity.this.f20929e, MBInterstitialActivity.this.mUnitid);
                if (!MBInterstitialActivity.this.f20927c) {
                    boolean unused = MBInterstitialActivity.this.f20928d = true;
                    MBInterstitialActivity.this.hideLoading();
                    MBInterstitialActivity.this.showWebView();
                }
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f20927c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f20928d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public CampaignEx f20929e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public WindVaneWebView f20930f;

    /* renamed from: g */
    private ImageView f20931g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C8634a.C8638c f20932h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f20933i;

    /* renamed from: j */
    private C8812d f20934j;

    /* renamed from: k */
    private long f20935k;

    /* renamed from: l */
    private boolean f20936l;

    /* renamed from: m */
    private boolean f20937m;
    public boolean mIsMBPage = false;
    public ProgressBar mProgressBar;
    public String mUnitid;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public Handler f20938n = new Handler() {
        public final void handleMessage(Message message) {
        }
    };

    /* renamed from: o */
    private C2295a f20939o;

    public void expand(String str, boolean z) {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            int a = C8594o.m24812a(getApplicationContext(), "mbridge_interstitial_activity", "layout");
            if (a != -1) {
                setContentView(a);
                initView();
                m25058a();
                this.f20931g.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        MBInterstitialActivity.this.finish();
                    }
                });
                if (!(this.f20930f == null || this.f20929e == null)) {
                    BrowserView.MBDownloadListener mBDownloadListener = new BrowserView.MBDownloadListener(this.f20929e);
                    mBDownloadListener.setTitle(this.f20929e.getAppName());
                    this.f20930f.setCampaignId(this.f20929e.getId());
                    this.f20930f.setDownloadListener(mBDownloadListener);
                }
                m25062b();
                try {
                    if (this.f20929e == null || (TextUtils.isEmpty(this.f20929e.getHtmlUrl()) && !this.f20929e.isMraid())) {
                        if (this.f20932h != null) {
                            this.f20932h.mo57850a("htmlurl is null");
                        }
                        C2350a.m5601e().mo15778a((Context) this);
                        C2347b.m5579a().mo15766a(this.mUnitid, this, (ViewGroup) null, (ViewGroup.LayoutParams) null, new C2339a() {
                            /* renamed from: a */
                            public final void mo15737a() {
                                String str;
                                MBInterstitialActivity.this.onPause();
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    if (C2350a.m5601e().mo15792g() != null) {
                                        jSONObject.put("status", 1);
                                    }
                                    str = jSONObject.toString();
                                } catch (Throwable th) {
                                    C8608u.m24881a("MBInterstitialActivity", th.getMessage(), th);
                                    str = "";
                                }
                                C8824g.m25670a().mo58310a((WebView) MBInterstitialActivity.this.f20930f, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                            }

                            /* renamed from: b */
                            public final void mo15739b() {
                                String str;
                                MBInterstitialActivity.this.onResume();
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    if (C2350a.m5601e().mo15792g() != null) {
                                        jSONObject.put("status", 2);
                                    }
                                    str = jSONObject.toString();
                                } catch (Throwable th) {
                                    C8608u.m24881a("MBInterstitialActivity", th.getMessage(), th);
                                    str = "";
                                }
                                C8824g.m25670a().mo58310a((WebView) MBInterstitialActivity.this.f20930f, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                            }

                            /* renamed from: a */
                            public final void mo15738a(String str) {
                                String str2;
                                MBInterstitialActivity.this.onResume();
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    if (C2350a.m5601e().mo15792g() != null) {
                                        jSONObject.put("status", 2);
                                    }
                                    str2 = jSONObject.toString();
                                } catch (Throwable th) {
                                    C8608u.m24881a("MBInterstitialActivity", th.getMessage(), th);
                                    str2 = "";
                                }
                                C8824g.m25670a().mo58310a((WebView) MBInterstitialActivity.this.f20930f, "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
                            }
                        });
                        this.f20929e.setCampaignUnitId(this.mUnitid);
                        C2347b.m5579a().mo15768a(this.mUnitid, this.f20929e);
                    }
                    C8608u.m24882b("MBInterstitialActivity", "url:" + this.f20929e.getHtmlUrl());
                    goneWebView();
                    this.f20930f.setWebViewListener(new C8821d() {
                        /* renamed from: a */
                        public final void mo57899a(WebView webView, int i) {
                        }

                        /* renamed from: a */
                        public final void mo57903a(WebView webView, String str, Bitmap bitmap) {
                        }

                        /* renamed from: b */
                        public final void mo57904b(WebView webView, int i) {
                        }

                        /* renamed from: b */
                        public final boolean mo57905b(WebView webView, String str) {
                            return true;
                        }

                        /* renamed from: c */
                        public final void mo57906c(WebView webView, int i) {
                        }

                        /* renamed from: a */
                        public final void mo57901a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                            boolean unused = MBInterstitialActivity.this.f20933i = true;
                        }

                        /* renamed from: a */
                        public final void mo57900a(WebView webView, int i, String str, String str2) {
                            try {
                                boolean unused = MBInterstitialActivity.this.f20933i = true;
                                if (MBInterstitialActivity.this.f20932h != null) {
                                    MBInterstitialActivity.this.f20932h.mo57850a(str);
                                }
                                MBInterstitialActivity.m25059a(MBInterstitialActivity.this, 3, str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        /* renamed from: a */
                        public final void mo57902a(WebView webView, String str) {
                            try {
                                if (!MBInterstitialActivity.this.f20933i) {
                                    MBInterstitialActivity.m25059a(MBInterstitialActivity.this, 1, "");
                                    if (!(MBInterstitialActivity.this.f20925a == null || MBInterstitialActivity.this.f20938n == null)) {
                                        MBInterstitialActivity.this.f20938n.removeCallbacks(MBInterstitialActivity.this.f20925a);
                                    }
                                    if (MBInterstitialActivity.this.f20932h != null) {
                                        MBInterstitialActivity.this.f20932h.mo57849a();
                                    }
                                    if (!MBInterstitialActivity.this.mIsMBPage) {
                                        MBInterstitialActivity.this.f20938n.postDelayed(MBInterstitialActivity.this.f20926b, 2000);
                                    }
                                    MBInterstitialActivity.m25068e(MBInterstitialActivity.this);
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                                if (MBInterstitialActivity.this.f20932h != null) {
                                    MBInterstitialActivity.this.f20932h.mo57850a("load page failed");
                                }
                            }
                        }
                    });
                    String htmlUrl = this.f20929e.getHtmlUrl();
                    if (this.f20929e.isMraid()) {
                        File file = new File(this.f20929e.getMraid());
                        if (file.exists() && file.isFile() && file.canRead()) {
                            htmlUrl = "file:////" + this.f20929e.getMraid();
                        }
                    }
                    this.f20935k = System.currentTimeMillis();
                    this.f20930f.loadUrl(htmlUrl);
                    this.f20938n.postDelayed(this.f20925a, 15000);
                    C2350a.m5601e().mo15778a((Context) this);
                    C2347b.m5579a().mo15766a(this.mUnitid, this, (ViewGroup) null, (ViewGroup.LayoutParams) null, new C2339a() {
                        /* renamed from: a */
                        public final void mo15737a() {
                            String str;
                            MBInterstitialActivity.this.onPause();
                            try {
                                JSONObject jSONObject = new JSONObject();
                                if (C2350a.m5601e().mo15792g() != null) {
                                    jSONObject.put("status", 1);
                                }
                                str = jSONObject.toString();
                            } catch (Throwable th) {
                                C8608u.m24881a("MBInterstitialActivity", th.getMessage(), th);
                                str = "";
                            }
                            C8824g.m25670a().mo58310a((WebView) MBInterstitialActivity.this.f20930f, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                        }

                        /* renamed from: b */
                        public final void mo15739b() {
                            String str;
                            MBInterstitialActivity.this.onResume();
                            try {
                                JSONObject jSONObject = new JSONObject();
                                if (C2350a.m5601e().mo15792g() != null) {
                                    jSONObject.put("status", 2);
                                }
                                str = jSONObject.toString();
                            } catch (Throwable th) {
                                C8608u.m24881a("MBInterstitialActivity", th.getMessage(), th);
                                str = "";
                            }
                            C8824g.m25670a().mo58310a((WebView) MBInterstitialActivity.this.f20930f, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                        }

                        /* renamed from: a */
                        public final void mo15738a(String str) {
                            String str2;
                            MBInterstitialActivity.this.onResume();
                            try {
                                JSONObject jSONObject = new JSONObject();
                                if (C2350a.m5601e().mo15792g() != null) {
                                    jSONObject.put("status", 2);
                                }
                                str2 = jSONObject.toString();
                            } catch (Throwable th) {
                                C8608u.m24881a("MBInterstitialActivity", th.getMessage(), th);
                                str2 = "";
                            }
                            C8824g.m25670a().mo58310a((WebView) MBInterstitialActivity.this.f20930f, "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
                        }
                    });
                    this.f20929e.setCampaignUnitId(this.mUnitid);
                    C2347b.m5579a().mo15768a(this.mUnitid, this.f20929e);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                m25058a();
                m25062b();
                if (this.f20932h != null) {
                    this.f20932h.mo57850a("not found resource");
                }
                finish();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        CampaignEx campaignEx = this.f20929e;
        if (campaignEx != null && campaignEx.isMraid()) {
            C8808a.m25622a().mo58260b(this.f20930f, "true");
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        CampaignEx campaignEx = this.f20929e;
        if (campaignEx != null && campaignEx.isMraid()) {
            C8808a.m25622a().mo58260b(this.f20930f, "false");
        }
    }

    /* renamed from: a */
    private void m25058a() {
        Intent intent = getIntent();
        if (intent != null) {
            this.mUnitid = intent.getStringExtra("unitId");
            this.f20929e = (CampaignEx) intent.getSerializableExtra("campaign");
        }
        CampaignEx campaignEx = this.f20929e;
        if (campaignEx != null && campaignEx.isMraid()) {
            C8812d dVar = new C8812d(this);
            this.f20934j = dVar;
            dVar.mo58265c();
            this.f20934j.mo58263a(new C8812d.C8814b() {
                /* renamed from: a */
                public final void mo57882a(double d) {
                    C8808a.m25622a().mo58252a((WebView) MBInterstitialActivity.this.f20930f, d);
                }
            });
        }
        CampaignEx campaignEx2 = this.f20929e;
        if (campaignEx2 != null) {
            C2309b.m5446a((Context) this, campaignEx2.getMaitve(), this.f20929e.getMaitve_src());
        }
    }

    public void initView() {
        this.f20930f = (WindVaneWebView) findViewById(C8594o.m24812a(getApplicationContext(), "mbridge_interstitial_wv", "id"));
        this.mProgressBar = (ProgressBar) findViewById(C8594o.m24812a(getApplicationContext(), "mbridge_interstitial_pb", "id"));
        this.f20931g = (ImageView) findViewById(C8594o.m24812a(getApplicationContext(), "mbridge_interstitial_iv_close", "id"));
    }

    /* renamed from: b */
    private void m25062b() {
        try {
            if (C8634a.f20895e != null && !TextUtils.isEmpty(this.mUnitid) && C8634a.f20895e.containsKey(this.mUnitid)) {
                this.f20932h = C8634a.f20895e.get(this.mUnitid);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showWebView() {
        try {
            runOnUiThread(new Runnable() {
                public final void run() {
                    if (MBInterstitialActivity.this.f20930f != null) {
                        MBInterstitialActivity.this.f20930f.setVisibility(0);
                        if (MBInterstitialActivity.this.f20929e.isMraid()) {
                            MBInterstitialActivity.m25073j(MBInterstitialActivity.this);
                        }
                        MBInterstitialActivity.m25074k(MBInterstitialActivity.this);
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void goneWebView() {
        try {
            runOnUiThread(new Runnable() {
                public final void run() {
                    if (MBInterstitialActivity.this.f20930f != null) {
                        MBInterstitialActivity.this.f20930f.setVisibility(8);
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showLoading() {
        try {
            runOnUiThread(new Runnable() {
                public final void run() {
                    if (MBInterstitialActivity.this.mProgressBar != null) {
                        MBInterstitialActivity.this.mProgressBar.setVisibility(0);
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void hideLoading() {
        try {
            runOnUiThread(new Runnable() {
                public final void run() {
                    if (MBInterstitialActivity.this.mProgressBar != null) {
                        MBInterstitialActivity.this.mProgressBar.setVisibility(8);
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        try {
            if (this.f20932h != null) {
                this.f20932h.mo57851b();
            }
            if (this.f20939o != null) {
                this.f20939o.mo15644a(false);
                this.f20939o.mo15642a((NativeListener.NativeTrackingListener) null);
                this.f20939o.mo15638a();
            }
            if (this.f20934j != null) {
                this.f20934j.mo58266d();
            }
            if (!this.f20936l) {
                m25064c();
            }
            if (C8634a.f20895e != null && !TextUtils.isEmpty(this.mUnitid)) {
                C8634a.f20895e.remove(this.mUnitid);
            }
            this.f20932h = null;
            C2347b.m5579a().mo15774c(this.mUnitid);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void finish() {
        super.finish();
        if (!this.f20936l) {
            m25064c();
        }
        if (!this.f20937m) {
            reportPlayableClosed();
        }
    }

    public void reportPlayableClosed() {
        if (this.f20929e != null) {
            C8412m mVar = new C8412m("2000061", this.f20929e.getId(), this.f20929e.getRequestId(), this.f20929e.getRequestIdNotice(), this.mUnitid, C8596q.m24849n(C2350a.m5601e().mo15792g()));
            mVar.mo57439a(this.f20929e.isMraid() ? C8412m.f20281a : C8412m.f20282b);
            C8524c.m24639b(mVar, C2350a.m5601e().mo15792g(), this.mUnitid);
            this.f20937m = true;
        }
    }

    /* renamed from: c */
    private void m25064c() {
        C8526d dVar = new C8526d(getApplicationContext());
        CampaignEx campaignEx = this.f20929e;
        if (campaignEx != null) {
            dVar.mo57697a(campaignEx.getRequestId(), this.f20929e.getRequestIdNotice(), this.f20929e.getId(), this.mUnitid, C8811c.m25637a(this.f20929e.getId()), this.f20929e.isBidCampaign());
            C8811c.m25638b(this.f20929e.getId());
            this.f20936l = true;
        }
    }

    public void onIntersClick() {
        try {
            if (this.f20932h != null) {
                this.f20932h.mo57852c();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public C2294d getIntersUnitSetting() {
        try {
            if (TextUtils.isEmpty(this.mUnitid)) {
                return null;
            }
            C2294d e = C2283b.m5275a().mo15569e(C2350a.m5601e().mo15793h(), this.mUnitid);
            return e == null ? C2294d.m5327f(this.mUnitid) : e;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public void clickTracking() {
        try {
            if (this.f20929e == null) {
                return;
            }
            if (!C8556ac.m24737a(this.mUnitid)) {
                onIntersClick();
                C2295a aVar = new C2295a(getApplicationContext(), this.mUnitid);
                this.f20939o = aVar;
                aVar.mo15642a((NativeListener.NativeTrackingListener) new NativeListener.NativeTrackingListener() {
                    public final void onDismissLoading(Campaign campaign) {
                    }

                    public final void onDownloadFinish(Campaign campaign) {
                    }

                    public final void onDownloadProgress(int i) {
                    }

                    public final void onDownloadStart(Campaign campaign) {
                    }

                    public final boolean onInterceptDefaultLoadingDialog() {
                        return false;
                    }

                    public final void onShowLoading(Campaign campaign) {
                    }

                    public final void onStartRedirection(Campaign campaign, String str) {
                        try {
                            MBInterstitialActivity.this.showLoading();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }

                    public final void onRedirectionFailed(Campaign campaign, String str) {
                        MBInterstitialActivity.this.hideLoading();
                    }

                    public final void onFinishRedirection(Campaign campaign, String str) {
                        try {
                            MBInterstitialActivity.this.hideLoading();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
                this.f20939o.mo15639a(this.f20929e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void open(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f20929e.setClickURL(str);
            CampaignEx mraidCampaign = getMraidCampaign();
            if (mraidCampaign != null) {
                new C8526d(getApplicationContext()).mo57698b(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.mUnitid, str, mraidCampaign.isBidCampaign());
            }
        }
        clickTracking();
    }

    public void close() {
        finish();
    }

    public void unload() {
        close();
    }

    public CampaignEx getMraidCampaign() {
        return this.f20929e;
    }

    public void useCustomClose(boolean z) {
        if (z) {
            this.f20931g.setImageDrawable(new ColorDrawable(0));
        } else {
            this.f20931g.setImageResource(C8594o.m24812a(getApplicationContext(), "mbridge_interstitial_close", "drawable"));
        }
    }

    public void setTopControllerPadding(int i, int i2, int i3, int i4, int i5) {
        int b = C8613y.m24929b((Context) this, 10.0f);
        if (i2 <= 0) {
            i2 = b;
        }
        if (i3 <= 0) {
            i3 = b;
        }
        if (i4 <= 0) {
            i4 = b;
        }
        if (i5 <= 0) {
            i5 = b;
        }
        if (this.f20931g != null) {
            int b2 = C8613y.m24929b((Context) this, 25.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b2, b2);
            layoutParams.addRule(11);
            layoutParams.setMargins(i2, i4, i3, i5);
            this.f20931g.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m25059a(MBInterstitialActivity mBInterstitialActivity, int i, String str) {
        CampaignEx campaignEx = mBInterstitialActivity.f20929e;
        if (campaignEx != null && campaignEx.isMraid()) {
            C8412m mVar = new C8412m();
            mVar.mo57463k(mBInterstitialActivity.f20929e.getRequestId());
            mVar.mo57465l(mBInterstitialActivity.f20929e.getRequestIdNotice());
            mVar.mo57469n(mBInterstitialActivity.f20929e.getId());
            mVar.mo57448d(i);
            mVar.mo57475q(String.valueOf(System.currentTimeMillis() - mBInterstitialActivity.f20935k));
            mVar.mo57453f("");
            mVar.mo57473p(str);
            mVar.mo57457h("5");
            mVar.mo57439a(mBInterstitialActivity.f20929e.isMraid() ? C8412m.f20281a : C8412m.f20282b);
            C8524c.m24640b(mVar, mBInterstitialActivity.mUnitid);
        }
    }

    /* renamed from: e */
    static /* synthetic */ void m25068e(MBInterstitialActivity mBInterstitialActivity) {
        CampaignEx campaignEx = mBInterstitialActivity.f20929e;
        if (campaignEx != null && campaignEx.isMraid()) {
            int i = mBInterstitialActivity.getResources().getConfiguration().orientation;
            String str = i != 0 ? i != 1 ? i != 2 ? "UNDEFINED" : "landscape" : "portrait" : AdError.UNDEFINED_DOMAIN;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("orientation", str);
                jSONObject.put("locked", "true");
            } catch (Exception e) {
                e.printStackTrace();
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            mBInterstitialActivity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            HashMap hashMap = new HashMap();
            hashMap.put("placementType", IronSourceConstants.INTERSTITIAL_AD_UNIT);
            hashMap.put("state", "default");
            hashMap.put("viewable", "true");
            hashMap.put("currentAppOrientation", jSONObject);
            C8808a.m25622a().mo58258b(mBInterstitialActivity.f20930f, (float) C8596q.m24837h(mBInterstitialActivity), (float) C8596q.m24838i(mBInterstitialActivity));
            C8808a.m25622a().mo58261c(mBInterstitialActivity.f20930f, (float) displayMetrics.widthPixels, (float) displayMetrics.heightPixels);
            C8808a.m25622a().mo58257a((WebView) mBInterstitialActivity.f20930f, (Map<String, Object>) hashMap);
            C8808a.m25622a().mo58252a((WebView) mBInterstitialActivity.f20930f, mBInterstitialActivity.f20934j.mo58262a());
            C8808a.m25622a().mo58251a(mBInterstitialActivity.f20930f);
        }
    }

    /* renamed from: h */
    static /* synthetic */ void m25071h(MBInterstitialActivity mBInterstitialActivity) {
        List<String> pv_urls;
        try {
            C2350a.m5601e().mo15778a((Context) mBInterstitialActivity);
            if (!TextUtils.isEmpty(mBInterstitialActivity.f20929e.getImpressionURL())) {
                C2295a.m5361a(C2350a.m5601e().mo15792g(), mBInterstitialActivity.f20929e, mBInterstitialActivity.mUnitid, mBInterstitialActivity.f20929e.getImpressionURL(), false, true, C2302a.f4733g);
            }
            if (!TextUtils.isEmpty(mBInterstitialActivity.f20929e.getOnlyImpressionURL())) {
                C2295a.m5361a(C2350a.m5601e().mo15792g(), mBInterstitialActivity.f20929e, mBInterstitialActivity.mUnitid, mBInterstitialActivity.f20929e.getOnlyImpressionURL(), false, true, C2302a.f4734h);
            }
            C8417d.m24308a(mBInterstitialActivity.mUnitid, mBInterstitialActivity.f20929e, "interstitial");
            C86556 r0 = new Runnable() {
                public final void run() {
                    C2379j.m5740a((C2374f) C2376g.m5723a((Context) MBInterstitialActivity.this)).mo15910b(MBInterstitialActivity.this.f20929e.getId());
                }
            };
            if (C2358b.m5644a().mo15829d()) {
                C8442b.m24388a().execute(r0);
            } else {
                r0.run();
            }
            if (mBInterstitialActivity.f20929e != null && (pv_urls = mBInterstitialActivity.f20929e.getPv_urls()) != null && pv_urls.size() > 0) {
                for (String a : pv_urls) {
                    C2295a.m5360a(C2350a.m5601e().mo15792g(), mBInterstitialActivity.f20929e, mBInterstitialActivity.mUnitid, a, false, true);
                }
            }
        } catch (Throwable th) {
            C8608u.m24880a("MBInterstitialActivity", th.getMessage());
        }
    }

    /* renamed from: j */
    static /* synthetic */ void m25073j(MBInterstitialActivity mBInterstitialActivity) {
        try {
            C8412m mVar = new C8412m();
            mVar.mo57463k(mBInterstitialActivity.f20929e.getRequestId());
            mVar.mo57465l(mBInterstitialActivity.f20929e.getRequestIdNotice());
            mVar.mo57469n(mBInterstitialActivity.f20929e.getId());
            mVar.mo57439a(mBInterstitialActivity.f20929e.isMraid() ? C8412m.f20281a : C8412m.f20282b);
            C8524c.m24635a(mVar, mBInterstitialActivity.getApplicationContext(), mBInterstitialActivity.mUnitid);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: k */
    static /* synthetic */ void m25074k(MBInterstitialActivity mBInterstitialActivity) {
        CampaignEx campaignEx = mBInterstitialActivity.f20929e;
        if (campaignEx != null && campaignEx.isMraid()) {
            mBInterstitialActivity.f20930f.post(new Runnable() {
                public final void run() {
                    C8808a.m25622a().mo58254a(MBInterstitialActivity.this.f20930f, (float) MBInterstitialActivity.this.f20930f.getLeft(), (float) MBInterstitialActivity.this.f20930f.getTop(), (float) MBInterstitialActivity.this.f20930f.getWidth(), (float) MBInterstitialActivity.this.f20930f.getHeight());
                    C8808a.m25622a().mo58259b(MBInterstitialActivity.this.f20930f, (float) MBInterstitialActivity.this.f20930f.getLeft(), (float) MBInterstitialActivity.this.f20930f.getTop(), (float) MBInterstitialActivity.this.f20930f.getWidth(), (float) MBInterstitialActivity.this.f20930f.getHeight());
                }
            });
        }
    }
}
