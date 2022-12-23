package com.mbridge.msdk.video.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C2295a;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.C8412m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p064b.C2339a;
import com.mbridge.msdk.foundation.p064b.C2347b;
import com.mbridge.msdk.foundation.same.C8413a;
import com.mbridge.msdk.foundation.same.report.C8524c;
import com.mbridge.msdk.foundation.same.report.C8526d;
import com.mbridge.msdk.foundation.tools.C8556ac;
import com.mbridge.msdk.foundation.tools.C8596q;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.mbsignalcommon.mraid.C8808a;
import com.mbridge.msdk.mbsignalcommon.mraid.C8810b;
import com.mbridge.msdk.mbsignalcommon.mraid.C8812d;
import com.mbridge.msdk.mbsignalcommon.windvane.C8824g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.video.module.p365a.C9384a;
import com.mbridge.msdk.video.signal.C9530g;
import com.mbridge.msdk.videocommon.download.C9563g;
import com.mbridge.msdk.widget.FeedBackButton;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class MBridgeH5EndCardView extends MBridgeBaseView implements C8810b, C9530g {

    /* renamed from: A */
    private int f22759A = 1;

    /* renamed from: B */
    private int f22760B = 1;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f22761C = false;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f22762D = false;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public int f22763E = 1;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public long f22764F = 0;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public boolean f22765G = false;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public boolean f22766H = false;

    /* renamed from: I */
    private boolean f22767I = false;

    /* renamed from: J */
    private boolean f22768J = false;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public boolean f22769K = false;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public boolean f22770L = false;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public boolean f22771M = false;

    /* renamed from: N */
    private boolean f22772N = false;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public String f22773O = "";

    /* renamed from: P */
    private boolean f22774P = false;

    /* renamed from: Q */
    private boolean f22775Q = false;

    /* renamed from: m */
    protected View f22776m;

    /* renamed from: n */
    protected RelativeLayout f22777n;

    /* renamed from: o */
    protected ImageView f22778o;

    /* renamed from: p */
    protected WindVaneWebView f22779p;

    /* renamed from: q */
    protected Handler f22780q = new Handler();

    /* renamed from: r */
    protected String f22781r;

    /* renamed from: s */
    protected boolean f22782s = false;

    /* renamed from: t */
    protected boolean f22783t = false;

    /* renamed from: u */
    protected String f22784u;

    /* renamed from: v */
    Handler f22785v = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 100) {
                if (MBridgeH5EndCardView.this.f22765G) {
                    MBridgeH5EndCardView.this.f22697e.mo62252a(122, "");
                }
                MBridgeH5EndCardView.this.f22697e.mo62252a(103, "");
            }
        }
    };

    /* renamed from: w */
    boolean f22786w = false;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public FeedBackButton f22787x;

    /* renamed from: y */
    private boolean f22788y = false;

    /* renamed from: z */
    private boolean f22789z = false;

    public void expand(String str, boolean z) {
    }

    public void install(CampaignEx campaignEx) {
    }

    public void readyStatus(int i) {
    }

    public MBridgeH5EndCardView(Context context) {
        super(context);
    }

    public MBridgeH5EndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        orientation(configuration);
    }

    public void init(Context context) {
        int findLayout = findLayout("mbridge_reward_endcard_h5");
        if (findLayout >= 0) {
            View inflate = this.f22695c.inflate(findLayout, (ViewGroup) null);
            this.f22776m = inflate;
            try {
                this.f22778o = (ImageView) inflate.findViewById(findID("mbridge_windwv_close"));
                this.f22777n = (RelativeLayout) inflate.findViewById(findID("mbridge_windwv_content_rl"));
                this.f22779p = new WindVaneWebView(getContext());
                this.f22779p.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                this.f22777n.addView(this.f22779p);
                this.f22698f = isNotNULL(this.f22778o, this.f22779p);
            } catch (Exception unused) {
                this.f22698f = false;
            }
            addView(this.f22776m, mo62559b());
            mo62563c();
            mo62591e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo62563c() {
        super.mo62563c();
        if (this.f22698f) {
            this.f22778o.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    MBridgeH5EndCardView.this.onCloseViewClick();
                }
            });
        }
    }

    public void onCloseViewClick() {
        try {
            if (this.f22779p != null) {
                C8824g.m25670a().mo58310a((WebView) this.f22779p, "onSystemDestory", "");
                new Thread(new C9344a(this)).start();
                return;
            }
            this.f22697e.mo62252a(103, "");
            this.f22697e.mo62252a(119, "webview is null when closing webview");
        } catch (Exception e) {
            this.f22697e.mo62252a(103, "");
            C9384a aVar = this.f22697e;
            aVar.mo62252a(119, "close webview exception" + e.getMessage());
            C8608u.m24880a(MBridgeBaseView.TAG, e.getMessage());
        }
    }

    /* renamed from: com.mbridge.msdk.video.module.MBridgeH5EndCardView$a */
    private class C9344a implements Runnable {

        /* renamed from: b */
        private MBridgeH5EndCardView f22797b;

        public C9344a(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f22797b = mBridgeH5EndCardView;
        }

        public final void run() {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                C8608u.m24884d("CloseRunnable", e.getMessage());
            }
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f22797b;
            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.f22785v != null) {
                this.f22797b.f22785v.sendEmptyMessage(100);
            }
        }
    }

    public void setError(boolean z) {
        this.f22783t = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fa A[Catch:{ all -> 0x0102 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fe A[Catch:{ all -> 0x0102 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void preLoadData(com.mbridge.msdk.video.signal.factory.C9529b r10) {
        /*
            r9 = this;
            java.lang.String r0 = "wfr=1"
            java.lang.String r1 = "="
            java.lang.String r3 = r9.mo62558a()
            boolean r2 = r9.f22698f
            r8 = 0
            if (r2 == 0) goto L_0x0149
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r9.f22694b
            if (r2 == 0) goto L_0x0149
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L_0x0149
            long r4 = java.lang.System.currentTimeMillis()
            r9.f22764F = r4
            java.lang.String r2 = "start"
            r9.reportRenderResult(r2, r8)     // Catch:{ Exception -> 0x0022 }
        L_0x0022:
            com.mbridge.msdk.foundation.webview.BrowserView$MBDownloadListener r2 = new com.mbridge.msdk.foundation.webview.BrowserView$MBDownloadListener
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r9.f22694b
            r2.<init>(r4)
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r9.f22694b
            java.lang.String r4 = r4.getAppName()
            r2.setTitle(r4)
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r4 = r9.f22779p
            r4.setDownloadListener(r2)
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r2 = r9.f22779p
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r9.f22694b
            java.lang.String r4 = r4.getId()
            r2.setCampaignId(r4)
            r2 = 8
            r9.setCloseVisible(r2)
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r2 = r9.f22779p
            r2.setApiManagerJSFactory(r10)
            com.mbridge.msdk.foundation.entity.CampaignEx r10 = r9.f22694b
            boolean r10 = r10.isMraid()
            if (r10 == 0) goto L_0x0059
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r10 = r9.f22779p
            r10.setMraidObject(r9)
        L_0x0059:
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r10 = r9.f22779p
            com.mbridge.msdk.video.module.MBridgeH5EndCardView$3 r2 = new com.mbridge.msdk.video.module.MBridgeH5EndCardView$3
            r2.<init>()
            r10.setWebViewListener(r2)
            com.mbridge.msdk.foundation.entity.CampaignEx r10 = r9.f22694b
            java.lang.String r10 = r10.getMraid()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            java.lang.String r2 = "MBridgeBaseView"
            if (r10 == 0) goto L_0x010a
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0102 }
            r9.f22764F = r4     // Catch:{ all -> 0x0102 }
            com.mbridge.msdk.foundation.entity.CampaignEx r10 = r9.f22694b     // Catch:{ all -> 0x0102 }
            java.lang.String r10 = r10.getendcard_url()     // Catch:{ all -> 0x0102 }
            com.mbridge.msdk.videocommon.d.b r4 = com.mbridge.msdk.videocommon.p373d.C9549b.m27299a()     // Catch:{ all -> 0x0102 }
            com.mbridge.msdk.foundation.controller.a r5 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ all -> 0x0102 }
            java.lang.String r5 = r5.mo15793h()     // Catch:{ all -> 0x0102 }
            java.lang.String r6 = r9.f22784u     // Catch:{ all -> 0x0102 }
            com.mbridge.msdk.videocommon.d.c r4 = r4.mo63123a(r5, r6)     // Catch:{ all -> 0x0102 }
            boolean r5 = r9.f22789z     // Catch:{ all -> 0x0102 }
            if (r5 == 0) goto L_0x010a
            boolean r5 = com.mbridge.msdk.foundation.tools.C8556ac.m24738b(r10)     // Catch:{ all -> 0x0102 }
            if (r5 == 0) goto L_0x010a
            boolean r5 = r10.contains(r0)     // Catch:{ all -> 0x0102 }
            if (r5 != 0) goto L_0x00a7
            if (r4 == 0) goto L_0x010a
            int r5 = r4.mo63164m()     // Catch:{ all -> 0x0102 }
            if (r5 <= 0) goto L_0x010a
        L_0x00a7:
            boolean r0 = r10.contains(r0)     // Catch:{ all -> 0x0102 }
            r5 = 20
            if (r0 == 0) goto L_0x00ea
            java.lang.String r0 = "&"
            java.lang.String[] r10 = r10.split(r0)     // Catch:{ all -> 0x0102 }
            if (r10 == 0) goto L_0x00f7
            int r0 = r10.length     // Catch:{ all -> 0x0102 }
            if (r0 <= 0) goto L_0x00f7
            int r0 = r10.length     // Catch:{ all -> 0x0102 }
            r4 = r8
        L_0x00bc:
            if (r4 >= r0) goto L_0x00f7
            r6 = r10[r4]     // Catch:{ all -> 0x0102 }
            boolean r7 = com.mbridge.msdk.foundation.tools.C8556ac.m24738b(r6)     // Catch:{ all -> 0x0102 }
            if (r7 == 0) goto L_0x00e7
            java.lang.String r7 = "to"
            boolean r7 = r6.contains(r7)     // Catch:{ all -> 0x0102 }
            if (r7 == 0) goto L_0x00e7
            java.lang.String[] r7 = r6.split(r1)     // Catch:{ all -> 0x0102 }
            if (r7 == 0) goto L_0x00e7
            java.lang.String[] r7 = r6.split(r1)     // Catch:{ all -> 0x0102 }
            int r7 = r7.length     // Catch:{ all -> 0x0102 }
            if (r7 <= 0) goto L_0x00e7
            java.lang.String[] r10 = r6.split(r1)     // Catch:{ all -> 0x0102 }
            r0 = 1
            r10 = r10[r0]     // Catch:{ all -> 0x0102 }
            int r10 = com.mbridge.msdk.foundation.tools.C8613y.m24913a((java.lang.Object) r10)     // Catch:{ all -> 0x0102 }
            goto L_0x00f8
        L_0x00e7:
            int r4 = r4 + 1
            goto L_0x00bc
        L_0x00ea:
            if (r4 == 0) goto L_0x00f7
            int r10 = r4.mo63164m()     // Catch:{ all -> 0x0102 }
            if (r10 <= 0) goto L_0x00f7
            int r10 = r4.mo63164m()     // Catch:{ all -> 0x0102 }
            goto L_0x00f8
        L_0x00f7:
            r10 = r5
        L_0x00f8:
            if (r10 < 0) goto L_0x00fe
            r9.excuteEndCardShowTask(r10)     // Catch:{ all -> 0x0102 }
            goto L_0x010a
        L_0x00fe:
            r9.excuteEndCardShowTask(r5)     // Catch:{ all -> 0x0102 }
            goto L_0x010a
        L_0x0102:
            r10 = move-exception
            java.lang.String r0 = r10.getMessage()
            com.mbridge.msdk.foundation.tools.C8608u.m24881a(r2, r0, r10)
        L_0x010a:
            com.mbridge.msdk.videocommon.download.h r10 = com.mbridge.msdk.videocommon.download.C9572h.m27477a()
            java.lang.String r10 = r10.mo63246b(r3)
            r9.setHtmlSource(r10)
            java.lang.String r10 = r9.f22781r
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x0137
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "load url:"
            r10.append(r0)
            r10.append(r3)
            java.lang.String r10 = r10.toString()
            com.mbridge.msdk.foundation.tools.C8608u.m24880a(r2, r10)
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r10 = r9.f22779p
            r10.loadUrl(r3)
            goto L_0x015f
        L_0x0137:
            java.lang.String r10 = "load html..."
            com.mbridge.msdk.foundation.tools.C8608u.m24880a(r2, r10)
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r2 = r9.f22779p
            java.lang.String r4 = r9.f22781r
            r7 = 0
            java.lang.String r5 = "text/html"
            java.lang.String r6 = "UTF-8"
            r2.loadDataWithBaseURL(r3, r4, r5, r6, r7)
            goto L_0x015f
        L_0x0149:
            r10 = 3
            java.lang.String r0 = "PL URL IS NULL"
            r9.reportRenderResult(r0, r10)
            com.mbridge.msdk.video.module.a.a r10 = r9.f22697e
            r0 = 127(0x7f, float:1.78E-43)
            java.lang.String r1 = ""
            r10.mo62252a(r0, r1)
            com.mbridge.msdk.video.module.a.a r10 = r9.f22697e
            r0 = 129(0x81, float:1.81E-43)
            r10.mo62252a(r0, r1)
        L_0x015f:
            r9.f22786w = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeH5EndCardView.preLoadData(com.mbridge.msdk.video.signal.factory.b):void");
    }

    public void reportRenderResult(String str, int i) {
        if (this.f22694b != null && !this.f22783t) {
            C8412m mVar = new C8412m();
            mVar.mo57463k(this.f22694b.getRequestId());
            mVar.mo57465l(this.f22694b.getRequestIdNotice());
            mVar.mo57469n(this.f22694b.getId());
            mVar.mo57448d(i);
            mVar.mo57475q(String.valueOf(System.currentTimeMillis() - this.f22764F));
            mVar.mo57473p(str);
            String str2 = "2";
            if (this.f22694b.getAdType() == 287) {
                mVar.mo57457h("3");
            } else if (this.f22694b.getAdType() == 94) {
                mVar.mo57457h("1");
            } else if (this.f22694b.getAdType() == 42) {
                mVar.mo57457h(str2);
            }
            if (this.f22694b.isMraid()) {
                mVar.mo57439a(C8412m.f20281a);
            } else {
                mVar.mo57453f(this.f22694b.getendcard_url());
                if (C8556ac.m24738b(this.f22694b.getendcard_url()) && this.f22694b.getendcard_url().contains(".zip")) {
                    str2 = "1";
                }
                mVar.mo57455g(str2);
                mVar.mo57439a(C8412m.f20282b);
            }
            C8524c.m24640b(mVar, this.f22784u);
        }
    }

    public void startCounterEndCardShowTimer() {
        try {
            String str = this.f22694b.getendcard_url();
            int i = 15;
            if (C8556ac.m24738b(str) && str.contains("wfl=1")) {
                String[] split = str.split("&");
                if (split != null && split.length > 0) {
                    for (String str2 : split) {
                        if (C8556ac.m24738b(str2) && str2.contains("timeout") && str2.split("=") != null && str2.split("=").length > 0) {
                            i = C8613y.m24913a((Object) str2.split("=")[1]);
                        }
                    }
                }
                executeEndCardShow(i);
            }
        } catch (Throwable th) {
            C8608u.m24880a(MBridgeBaseView.TAG, th.getMessage());
        }
    }

    public void defaultShow() {
        super.defaultShow();
    }

    public void notifyCloseBtn(int i) {
        if (i == 0) {
            this.f22767I = true;
        } else if (i == 1) {
            this.f22768J = true;
        }
    }

    public void toggleCloseBtn(int i) {
        int visibility = this.f22778o.getVisibility();
        if (i == 1) {
            this.f22766H = true;
            visibility = 0;
        } else if (i == 2) {
            this.f22766H = false;
            visibility = 8;
            if (this.f22786w) {
                if (!this.f22775Q && !this.f22767I) {
                    this.f22775Q = true;
                    int i2 = this.f22760B;
                    if (i2 == 0) {
                        this.f22770L = true;
                    } else {
                        this.f22770L = false;
                        if (i2 > -1) {
                            this.f22780q.postDelayed(new C9348e(this), (long) (this.f22760B * 1000));
                        }
                    }
                }
            } else if (!this.f22774P && !this.f22767I) {
                this.f22774P = true;
                int i3 = this.f22759A;
                if (i3 == 0) {
                    this.f22769K = true;
                } else {
                    this.f22769K = false;
                    if (i3 > -1) {
                        this.f22780q.postDelayed(new C9347d(this), (long) (this.f22759A * 1000));
                    }
                }
            }
        }
        setCloseVisible(visibility);
    }

    /* renamed from: com.mbridge.msdk.video.module.MBridgeH5EndCardView$d */
    private class C9347d implements Runnable {

        /* renamed from: b */
        private MBridgeH5EndCardView f22803b;

        public C9347d(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f22803b = mBridgeH5EndCardView;
        }

        public final void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f22803b;
            if (mBridgeH5EndCardView != null) {
                boolean unused = mBridgeH5EndCardView.f22769K = true;
            }
        }
    }

    /* renamed from: com.mbridge.msdk.video.module.MBridgeH5EndCardView$e */
    private class C9348e implements Runnable {

        /* renamed from: b */
        private MBridgeH5EndCardView f22805b;

        public C9348e(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f22805b = mBridgeH5EndCardView;
        }

        public final void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f22805b;
            if (mBridgeH5EndCardView != null) {
                boolean unused = mBridgeH5EndCardView.f22770L = true;
            }
        }
    }

    public void handlerPlayableException(String str) {
        if (!this.f22783t) {
            this.f22783t = true;
            this.f22782s = false;
            if (this.f22694b != null) {
                C8412m mVar = new C8412m();
                mVar.mo57463k(this.f22694b.getRequestId());
                mVar.mo57465l(this.f22694b.getRequestIdNotice());
                mVar.mo57469n(this.f22694b.getId());
                mVar.mo57473p(str);
                C8524c.m24642d(mVar, this.f22693a.getApplicationContext(), this.f22784u);
            }
        }
    }

    public void webviewshow() {
        WindVaneWebView windVaneWebView = this.f22779p;
        if (windVaneWebView != null) {
            windVaneWebView.post(new Runnable() {
                public final void run() {
                    String str;
                    try {
                        C8608u.m24880a(MBridgeBaseView.TAG, "webviewshow");
                        try {
                            int[] iArr = new int[2];
                            MBridgeH5EndCardView.this.f22779p.getLocationOnScreen(iArr);
                            C8608u.m24884d(MBridgeBaseView.TAG, "coordinate:" + iArr[0] + "--" + iArr[1]);
                            JSONObject jSONObject = new JSONObject();
                            Context g = C2350a.m5601e().mo15792g();
                            if (g != null) {
                                jSONObject.put("startX", C8613y.m24912a(g, (float) iArr[0]));
                                jSONObject.put("startY", C8613y.m24912a(g, (float) iArr[1]));
                                jSONObject.put(C8413a.f20328j, (double) C8613y.m24941d(g));
                            }
                            str = jSONObject.toString();
                        } catch (Throwable th) {
                            C8608u.m24881a(MBridgeBaseView.TAG, th.getMessage(), th);
                            str = "";
                        }
                        C8824g.m25670a().mo58310a((WebView) MBridgeH5EndCardView.this.f22779p, "webviewshow", Base64.encodeToString(str.toString().getBytes(), 2));
                        MBridgeH5EndCardView.this.f22697e.mo62252a(109, "");
                        MBridgeH5EndCardView.m26785d(MBridgeH5EndCardView.this);
                        MBridgeH5EndCardView.this.startCounterEndCardShowTimer();
                        C8824g.m25670a().mo58310a((WebView) MBridgeH5EndCardView.this.f22779p, "oncutoutfetched", Base64.encodeToString(MBridgeH5EndCardView.this.f22773O.getBytes(), 0));
                        MBridgeH5EndCardView.m26789f(MBridgeH5EndCardView.this);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    public void orientation(Configuration configuration) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (configuration.orientation == 2) {
                jSONObject.put("orientation", "landscape");
            } else {
                jSONObject.put("orientation", "portrait");
            }
            C8824g.m25670a().mo58310a((WebView) this.f22779p, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean canBackPress() {
        ImageView imageView = this.f22778o;
        return imageView != null && imageView.getVisibility() == 0;
    }

    public boolean isLoadSuccess() {
        return this.f22782s;
    }

    public void setUnitId(String str) {
        this.f22784u = str;
    }

    public void setCloseDelayShowTime(int i) {
        this.f22759A = i;
    }

    public void setPlayCloseBtnTm(int i) {
        this.f22760B = i;
    }

    public void setHtmlSource(String str) {
        this.f22781r = str;
    }

    public void setCloseVisible(int i) {
        if (this.f22698f) {
            this.f22778o.setVisibility(i);
        }
    }

    public void setCloseVisibleForMraid(int i) {
        if (this.f22698f) {
            this.f22771M = true;
            if (i == 4) {
                this.f22778o.setImageDrawable(new ColorDrawable(16711680));
            } else {
                this.f22778o.setImageResource(findDrawable("mbridge_reward_close"));
            }
            this.f22778o.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public RelativeLayout.LayoutParams mo62559b() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo62591e() {
        if (this.f22698f) {
            setMatchParent();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo62558a() {
        if (this.f22694b != null) {
            this.f22765G = true;
            if (this.f22694b.isMraid()) {
                this.f22789z = false;
                String mraid = this.f22694b.getMraid();
                if (TextUtils.isEmpty(mraid)) {
                    return this.f22694b.getEndScreenUrl();
                }
                File file = new File(mraid);
                try {
                    if (!file.exists() || !file.isFile() || !file.canRead()) {
                        return this.f22694b.getEndScreenUrl();
                    }
                    return "file:////" + mraid;
                } catch (Throwable th) {
                    if (!MBridgeConstans.DEBUG) {
                        return mraid;
                    }
                    th.printStackTrace();
                    return mraid;
                }
            } else {
                String str = this.f22694b.getendcard_url();
                if (!C8556ac.m24737a(str)) {
                    this.f22789z = true;
                    String b = C9563g.m27460a().mo63242b(str);
                    if (TextUtils.isEmpty(b)) {
                        try {
                            String path = Uri.parse(str).getPath();
                            if (!TextUtils.isEmpty(path) && path.toLowerCase().endsWith(".zip")) {
                                String endScreenUrl = this.f22694b.getEndScreenUrl();
                                if (TextUtils.isEmpty(endScreenUrl)) {
                                    return null;
                                }
                                this.f22789z = false;
                                excuteTask();
                                return endScreenUrl;
                            }
                        } catch (Throwable th2) {
                            C8608u.m24884d(MBridgeBaseView.TAG, th2.getMessage());
                        }
                        return str + "&native_adtype=" + this.f22694b.getAdType();
                    }
                    return b + "&native_adtype=" + this.f22694b.getAdType();
                }
                this.f22789z = false;
                return this.f22694b.getEndScreenUrl();
            }
        } else {
            this.f22765G = false;
            return null;
        }
    }

    /* renamed from: com.mbridge.msdk.video.module.MBridgeH5EndCardView$f */
    private class C9349f implements Runnable {

        /* renamed from: b */
        private MBridgeH5EndCardView f22807b;

        public C9349f(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f22807b = mBridgeH5EndCardView;
        }

        public final void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f22807b;
            if (mBridgeH5EndCardView != null) {
                if (!mBridgeH5EndCardView.f22771M) {
                    MBridgeH5EndCardView.this.setCloseVisible(0);
                }
                boolean unused = this.f22807b.f22766H = true;
            }
        }
    }

    public void excuteTask() {
        if (!this.f22789z && this.f22759A > -1) {
            this.f22780q.postDelayed(new C9349f(this), (long) (this.f22759A * 1000));
        }
    }

    /* renamed from: com.mbridge.msdk.video.module.MBridgeH5EndCardView$b */
    private class C9345b implements Runnable {

        /* renamed from: b */
        private MBridgeH5EndCardView f22799b;

        public C9345b(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f22799b = mBridgeH5EndCardView;
        }

        public final void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f22799b;
            if (mBridgeH5EndCardView != null && !mBridgeH5EndCardView.f22762D) {
                boolean unused = this.f22799b.f22762D = true;
                this.f22799b.f22782s = false;
                MBridgeH5EndCardView.this.reportRenderResult("timeout", 5);
                this.f22799b.f22697e.mo62252a(127, "");
                C8608u.m24880a(MBridgeBaseView.TAG, "notify TYPE_NOTIFY_SHOW_NATIVE_ENDCARD");
            }
        }
    }

    public void executeEndCardShow(int i) {
        this.f22780q.postDelayed(new C9345b(this), (long) (i * 1000));
    }

    public void excuteEndCardShowTask(int i) {
        this.f22780q.postDelayed(new C9346c(this, i), (long) (i * 1000));
    }

    /* renamed from: com.mbridge.msdk.video.module.MBridgeH5EndCardView$c */
    private static class C9346c implements Runnable {

        /* renamed from: a */
        private MBridgeH5EndCardView f22800a;

        /* renamed from: b */
        private int f22801b;

        public C9346c(MBridgeH5EndCardView mBridgeH5EndCardView, int i) {
            this.f22800a = mBridgeH5EndCardView;
            this.f22801b = i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0084 A[Catch:{ Exception -> 0x00aa, all -> 0x00dd }] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x008a A[Catch:{ Exception -> 0x00aa, all -> 0x00dd }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r13 = this;
                java.lang.String r0 = "MBridgeBaseView"
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r1 = r13.f22800a
                if (r1 == 0) goto L_0x00e5
                com.mbridge.msdk.foundation.entity.CampaignEx r1 = r1.f22694b
                if (r1 == 0) goto L_0x00e5
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r1 = r13.f22800a     // Catch:{ all -> 0x00dd }
                boolean r1 = r1.f22761C     // Catch:{ all -> 0x00dd }
                if (r1 == 0) goto L_0x0018
                java.lang.String r1 = "insertEndCardReadyState hasInsertLoadEndCardReport true return"
                com.mbridge.msdk.foundation.tools.C8608u.m24882b(r0, r1)     // Catch:{ all -> 0x00dd }
                return
            L_0x0018:
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r1 = r13.f22800a     // Catch:{ all -> 0x00dd }
                r2 = 1
                boolean unused = r1.f22761C = r2     // Catch:{ all -> 0x00dd }
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r1 = r13.f22800a     // Catch:{ all -> 0x00dd }
                com.mbridge.msdk.foundation.entity.CampaignEx r1 = r1.f22694b     // Catch:{ all -> 0x00dd }
                java.lang.String r1 = r1.getendcard_url()     // Catch:{ all -> 0x00dd }
                boolean r1 = com.mbridge.msdk.foundation.tools.C8556ac.m24738b(r1)     // Catch:{ all -> 0x00dd }
                java.lang.String r2 = "1"
                java.lang.String r3 = "2"
                if (r1 == 0) goto L_0x0042
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r1 = r13.f22800a     // Catch:{ all -> 0x00dd }
                com.mbridge.msdk.foundation.entity.CampaignEx r1 = r1.f22694b     // Catch:{ all -> 0x00dd }
                java.lang.String r1 = r1.getendcard_url()     // Catch:{ all -> 0x00dd }
                java.lang.String r4 = ".zip"
                boolean r1 = r1.contains(r4)     // Catch:{ all -> 0x00dd }
                if (r1 == 0) goto L_0x0042
                r12 = r2
                goto L_0x0043
            L_0x0042:
                r12 = r3
            L_0x0043:
                r6 = 12
                java.lang.String r11 = "ready timeout"
                com.mbridge.msdk.foundation.entity.m r1 = new com.mbridge.msdk.foundation.entity.m     // Catch:{ all -> 0x00dd }
                java.lang.String r5 = "2000043"
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00dd }
                r4.<init>()     // Catch:{ all -> 0x00dd }
                int r7 = r13.f22801b     // Catch:{ all -> 0x00dd }
                int r7 = r7 * 1000
                r4.append(r7)     // Catch:{ all -> 0x00dd }
                java.lang.String r7 = ""
                r4.append(r7)     // Catch:{ all -> 0x00dd }
                java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x00dd }
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r4 = r13.f22800a     // Catch:{ all -> 0x00dd }
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.f22694b     // Catch:{ all -> 0x00dd }
                java.lang.String r8 = r4.getendcard_url()     // Catch:{ all -> 0x00dd }
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r4 = r13.f22800a     // Catch:{ all -> 0x00dd }
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.f22694b     // Catch:{ all -> 0x00dd }
                java.lang.String r9 = r4.getId()     // Catch:{ all -> 0x00dd }
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r4 = r13.f22800a     // Catch:{ all -> 0x00dd }
                java.lang.String r10 = r4.f22784u     // Catch:{ all -> 0x00dd }
                r4 = r1
                r4.<init>((java.lang.String) r5, (int) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (java.lang.String) r12)     // Catch:{ all -> 0x00dd }
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r4 = r13.f22800a     // Catch:{ Exception -> 0x00aa }
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.f22694b     // Catch:{ Exception -> 0x00aa }
                int r4 = r4.getAdType()     // Catch:{ Exception -> 0x00aa }
                r5 = 287(0x11f, float:4.02E-43)
                if (r4 != r5) goto L_0x008a
                java.lang.String r2 = "3"
                r1.mo57457h((java.lang.String) r2)     // Catch:{ Exception -> 0x00aa }
                goto L_0x00ae
            L_0x008a:
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r4 = r13.f22800a     // Catch:{ Exception -> 0x00aa }
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.f22694b     // Catch:{ Exception -> 0x00aa }
                int r4 = r4.getAdType()     // Catch:{ Exception -> 0x00aa }
                r5 = 94
                if (r4 != r5) goto L_0x009a
                r1.mo57457h((java.lang.String) r2)     // Catch:{ Exception -> 0x00aa }
                goto L_0x00ae
            L_0x009a:
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r2 = r13.f22800a     // Catch:{ Exception -> 0x00aa }
                com.mbridge.msdk.foundation.entity.CampaignEx r2 = r2.f22694b     // Catch:{ Exception -> 0x00aa }
                int r2 = r2.getAdType()     // Catch:{ Exception -> 0x00aa }
                r4 = 42
                if (r2 != r4) goto L_0x00ae
                r1.mo57457h((java.lang.String) r3)     // Catch:{ Exception -> 0x00aa }
                goto L_0x00ae
            L_0x00aa:
                r2 = move-exception
                r2.printStackTrace()     // Catch:{ all -> 0x00dd }
            L_0x00ae:
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r2 = r13.f22800a     // Catch:{ all -> 0x00dd }
                com.mbridge.msdk.foundation.entity.CampaignEx r2 = r2.f22694b     // Catch:{ all -> 0x00dd }
                java.lang.String r2 = r2.getRequestId()     // Catch:{ all -> 0x00dd }
                r1.mo57463k(r2)     // Catch:{ all -> 0x00dd }
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r2 = r13.f22800a     // Catch:{ all -> 0x00dd }
                com.mbridge.msdk.foundation.entity.CampaignEx r2 = r2.f22694b     // Catch:{ all -> 0x00dd }
                java.lang.String r2 = r2.getRequestIdNotice()     // Catch:{ all -> 0x00dd }
                r1.mo57465l(r2)     // Catch:{ all -> 0x00dd }
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r2 = r13.f22800a     // Catch:{ all -> 0x00dd }
                com.mbridge.msdk.foundation.entity.CampaignEx r2 = r2.f22694b     // Catch:{ all -> 0x00dd }
                int r2 = r2.getAdSpaceT()     // Catch:{ all -> 0x00dd }
                r1.mo57442b((int) r2)     // Catch:{ all -> 0x00dd }
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r2 = r13.f22800a     // Catch:{ all -> 0x00dd }
                java.lang.String r2 = r2.f22784u     // Catch:{ all -> 0x00dd }
                com.mbridge.msdk.foundation.same.report.C8524c.m24636a(r1, r2)     // Catch:{ all -> 0x00dd }
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r1 = r13.f22800a     // Catch:{ all -> 0x00dd }
                boolean r0 = r1.isLoadSuccess()     // Catch:{ all -> 0x00dd }
                goto L_0x00e5
            L_0x00dd:
                r1 = move-exception
                java.lang.String r2 = r1.getMessage()
                com.mbridge.msdk.foundation.tools.C8608u.m24881a(r0, r2, r1)
            L_0x00e5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeH5EndCardView.C9346c.run():void");
        }
    }

    public boolean isPlayable() {
        return this.f22789z;
    }

    public void onBackPress() {
        if (this.f22766H || ((this.f22767I && this.f22768J) || ((!this.f22767I && this.f22769K && !this.f22786w) || (!this.f22767I && this.f22770L && this.f22786w)))) {
            onCloseViewClick();
        }
    }

    public void setLoadPlayable(boolean z) {
        this.f22786w = z;
    }

    public void release() {
        Handler handler = this.f22780q;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f22780q = null;
        }
        Handler handler2 = this.f22785v;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages((Object) null);
            this.f22785v = null;
        }
        this.f22777n.removeAllViews();
        this.f22779p.release();
        this.f22779p = null;
    }

    public void volumeChange(double d) {
        C8808a.m25622a().mo58252a((WebView) this.f22779p, d);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f22694b != null && this.f22694b.isMraid()) {
            if (z) {
                C8808a.m25622a().mo58260b(this.f22779p, "true");
            } else {
                C8808a.m25622a().mo58260b(this.f22779p, "false");
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0 && !this.f22772N) {
            this.f22772N = true;
            setFocusableInTouchMode(true);
            requestFocus();
            requestFocusFromTouch();
        }
    }

    public void open(String str) {
        try {
            String clickURL = this.f22694b.getClickURL();
            if (!TextUtils.isEmpty(str)) {
                this.f22694b.setClickURL(str);
                CampaignEx mraidCampaign = getMraidCampaign();
                if (mraidCampaign != null) {
                    new C8526d(getContext()).mo57698b(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.f22784u, str, this.f22694b.isBidCampaign());
                }
            }
            new C2295a(getContext(), this.f22784u).mo15639a(this.f22694b);
            this.f22694b.setClickURL(clickURL);
            this.f22697e.mo62252a(126, "");
        } catch (Exception e) {
            C8608u.m24884d(MBridgeBaseView.TAG, e.getMessage());
        }
    }

    public void close() {
        try {
            onCloseViewClick();
        } catch (Exception e) {
            C8608u.m24884d(MBridgeBaseView.TAG, e.getMessage());
        }
    }

    public void unload() {
        close();
    }

    public CampaignEx getMraidCampaign() {
        return this.f22694b;
    }

    public void useCustomClose(boolean z) {
        try {
            setCloseVisibleForMraid(z ? 4 : 0);
        } catch (Exception e) {
            C8608u.m24884d(MBridgeBaseView.TAG, e.getMessage());
        }
    }

    public void setNotchValue(String str, int i, int i2, int i3, int i4) {
        this.f22773O = str;
        if (this.f22694b != null && this.f22694b.getAdSpaceT() != 2) {
            C8608u.m24884d(MBridgeBaseView.TAG, "NOTCH H5ENDCARD " + String.format("%1s-%2s-%3s-%4s", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f22778o.getLayoutParams();
            int b = C8613y.m24929b(getContext(), 20.0f);
            layoutParams.setMargins(i + b, i3 + b, i2 + b, i4 + b);
            this.f22778o.setLayoutParams(layoutParams);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033 A[Catch:{ NullPointerException -> 0x00a8, all -> 0x0112 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b A[Catch:{ NullPointerException -> 0x00a8, all -> 0x0112 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0086 A[Catch:{ NullPointerException -> 0x00a8, all -> 0x0112 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008c A[Catch:{ NullPointerException -> 0x00a8, all -> 0x0112 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d5 A[Catch:{ NullPointerException -> 0x00a8, all -> 0x0112 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m26778a(com.mbridge.msdk.video.module.MBridgeH5EndCardView r17, long r18, boolean r20) {
        /*
            r1 = r17
            boolean r0 = r1.f22761C     // Catch:{ all -> 0x0112 }
            if (r0 == 0) goto L_0x0008
            goto L_0x011c
        L_0x0008:
            r2 = 1
            r1.f22761C = r2     // Catch:{ all -> 0x0112 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f22694b     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = r0.getendcard_url()     // Catch:{ all -> 0x0112 }
            boolean r0 = com.mbridge.msdk.foundation.tools.C8556ac.m24738b(r0)     // Catch:{ all -> 0x0112 }
            java.lang.String r3 = "1"
            java.lang.String r4 = "2"
            if (r0 == 0) goto L_0x002b
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f22694b     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = r0.getendcard_url()     // Catch:{ all -> 0x0112 }
            java.lang.String r5 = ".zip"
            boolean r0 = r0.contains(r5)     // Catch:{ all -> 0x0112 }
            if (r0 == 0) goto L_0x002b
            r14 = r3
            goto L_0x002c
        L_0x002b:
            r14 = r4
        L_0x002c:
            r0 = 10
            java.lang.String r5 = "ready yes"
            r6 = 2
            if (r20 == 0) goto L_0x003b
            r0 = 12
            java.lang.String r5 = "ready timeout"
        L_0x0037:
            r7 = r0
            r15 = r5
            r13 = r6
            goto L_0x0048
        L_0x003b:
            int r7 = r1.f22763E     // Catch:{ all -> 0x0112 }
            if (r7 != r6) goto L_0x0045
            r6 = 3
            r0 = 11
            java.lang.String r5 = "ready no"
            goto L_0x0037
        L_0x0045:
            r7 = r0
            r13 = r2
            r15 = r5
        L_0x0048:
            com.mbridge.msdk.foundation.entity.m r12 = new com.mbridge.msdk.foundation.entity.m     // Catch:{ all -> 0x0112 }
            java.lang.String r6 = "2000043"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0112 }
            r0.<init>()     // Catch:{ all -> 0x0112 }
            r10 = r18
            r0.append(r10)     // Catch:{ all -> 0x0112 }
            java.lang.String r5 = ""
            r0.append(r5)     // Catch:{ all -> 0x0112 }
            java.lang.String r8 = r0.toString()     // Catch:{ all -> 0x0112 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f22694b     // Catch:{ all -> 0x0112 }
            java.lang.String r9 = r0.getendcard_url()     // Catch:{ all -> 0x0112 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f22694b     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = r0.getId()     // Catch:{ all -> 0x0112 }
            java.lang.String r5 = r1.f22784u     // Catch:{ all -> 0x0112 }
            r16 = r5
            r5 = r12
            r10 = r0
            r11 = r16
            r2 = r12
            r12 = r15
            r20 = r15
            r15 = r13
            r13 = r14
            r5.<init>((java.lang.String) r6, (int) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13)     // Catch:{ all -> 0x0112 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f22694b     // Catch:{ NullPointerException -> 0x00a8 }
            int r0 = r0.getAdType()     // Catch:{ NullPointerException -> 0x00a8 }
            r5 = 287(0x11f, float:4.02E-43)
            if (r0 != r5) goto L_0x008c
            java.lang.String r0 = "3"
            r2.mo57457h((java.lang.String) r0)     // Catch:{ NullPointerException -> 0x00a8 }
            goto L_0x00ac
        L_0x008c:
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f22694b     // Catch:{ NullPointerException -> 0x00a8 }
            int r0 = r0.getAdType()     // Catch:{ NullPointerException -> 0x00a8 }
            r5 = 94
            if (r0 != r5) goto L_0x009a
            r2.mo57457h((java.lang.String) r3)     // Catch:{ NullPointerException -> 0x00a8 }
            goto L_0x00ac
        L_0x009a:
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f22694b     // Catch:{ NullPointerException -> 0x00a8 }
            int r0 = r0.getAdType()     // Catch:{ NullPointerException -> 0x00a8 }
            r3 = 42
            if (r0 != r3) goto L_0x00ac
            r2.mo57457h((java.lang.String) r4)     // Catch:{ NullPointerException -> 0x00a8 }
            goto L_0x00ac
        L_0x00a8:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x0112 }
        L_0x00ac:
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f22694b     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = r0.getRequestId()     // Catch:{ all -> 0x0112 }
            r2.mo57463k(r0)     // Catch:{ all -> 0x0112 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f22694b     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = r0.getRequestIdNotice()     // Catch:{ all -> 0x0112 }
            r2.mo57465l(r0)     // Catch:{ all -> 0x0112 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f22694b     // Catch:{ all -> 0x0112 }
            int r0 = r0.getAdSpaceT()     // Catch:{ all -> 0x0112 }
            r2.mo57442b((int) r0)     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = r1.f22784u     // Catch:{ all -> 0x0112 }
            com.mbridge.msdk.foundation.same.report.C8524c.m24636a(r2, r0)     // Catch:{ all -> 0x0112 }
            boolean r0 = r17.isLoadSuccess()     // Catch:{ all -> 0x0112 }
            if (r0 != 0) goto L_0x011c
            r3 = 1
            if (r15 != r3) goto L_0x011c
            r2.mo57448d((int) r15)     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = java.lang.String.valueOf(r18)     // Catch:{ all -> 0x0112 }
            r2.mo57475q(r0)     // Catch:{ all -> 0x0112 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f22694b     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = r0.getId()     // Catch:{ all -> 0x0112 }
            r2.mo57469n(r0)     // Catch:{ all -> 0x0112 }
            r5 = r20
            r2.mo57473p(r5)     // Catch:{ all -> 0x0112 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f22694b     // Catch:{ all -> 0x0112 }
            boolean r0 = r0.isMraid()     // Catch:{ all -> 0x0112 }
            if (r0 == 0) goto L_0x00fb
            int r0 = com.mbridge.msdk.foundation.entity.C8412m.f20281a     // Catch:{ all -> 0x0112 }
            r2.mo57439a((int) r0)     // Catch:{ all -> 0x0112 }
            goto L_0x010c
        L_0x00fb:
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f22694b     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = r0.getendcard_url()     // Catch:{ all -> 0x0112 }
            r2.mo57453f((java.lang.String) r0)     // Catch:{ all -> 0x0112 }
            r2.mo57455g((java.lang.String) r14)     // Catch:{ all -> 0x0112 }
            int r0 = com.mbridge.msdk.foundation.entity.C8412m.f20282b     // Catch:{ all -> 0x0112 }
            r2.mo57439a((int) r0)     // Catch:{ all -> 0x0112 }
        L_0x010c:
            java.lang.String r0 = r1.f22784u     // Catch:{ all -> 0x0112 }
            com.mbridge.msdk.foundation.same.report.C8524c.m24640b(r2, r0)     // Catch:{ all -> 0x0112 }
            goto L_0x011c
        L_0x0112:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = "MBridgeBaseView"
            com.mbridge.msdk.foundation.tools.C8608u.m24881a(r2, r1, r0)
        L_0x011c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeH5EndCardView.m26778a(com.mbridge.msdk.video.module.MBridgeH5EndCardView, long, boolean):void");
    }

    /* renamed from: d */
    static /* synthetic */ void m26785d(MBridgeH5EndCardView mBridgeH5EndCardView) {
        MBridgeH5EndCardView mBridgeH5EndCardView2 = mBridgeH5EndCardView;
        if (mBridgeH5EndCardView2.f22694b != null && mBridgeH5EndCardView2.f22694b.isMraid()) {
            int i = mBridgeH5EndCardView.getResources().getConfiguration().orientation;
            String str = AdError.UNDEFINED_DOMAIN;
            if (i != 0) {
                if (i == 1) {
                    str = "portrait";
                } else if (i == 2) {
                    str = "landscape";
                }
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("orientation", str);
                jSONObject.put("locked", "true");
            } catch (Exception e) {
                e.printStackTrace();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("placementType", IronSourceConstants.INTERSTITIAL_AD_UNIT);
            hashMap.put("state", "default");
            hashMap.put("viewable", "true");
            hashMap.put("currentAppOrientation", jSONObject);
            if (mBridgeH5EndCardView.getContext() instanceof Activity) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((Activity) mBridgeH5EndCardView.getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                C8808a.m25622a().mo58258b(mBridgeH5EndCardView2.f22779p, (float) C8596q.m24837h(mBridgeH5EndCardView.getContext()), (float) C8596q.m24838i(mBridgeH5EndCardView.getContext()));
                C8808a.m25622a().mo58261c(mBridgeH5EndCardView2.f22779p, (float) displayMetrics.widthPixels, (float) displayMetrics.heightPixels);
            }
            C8808a a = C8808a.m25622a();
            WindVaneWebView windVaneWebView = mBridgeH5EndCardView2.f22779p;
            a.mo58254a(windVaneWebView, (float) windVaneWebView.getLeft(), (float) mBridgeH5EndCardView2.f22779p.getTop(), (float) mBridgeH5EndCardView2.f22779p.getWidth(), (float) mBridgeH5EndCardView2.f22779p.getHeight());
            C8808a a2 = C8808a.m25622a();
            WindVaneWebView windVaneWebView2 = mBridgeH5EndCardView2.f22779p;
            a2.mo58259b(windVaneWebView2, (float) windVaneWebView2.getLeft(), (float) mBridgeH5EndCardView2.f22779p.getTop(), (float) mBridgeH5EndCardView2.f22779p.getWidth(), (float) mBridgeH5EndCardView2.f22779p.getHeight());
            C8808a.m25622a().mo58257a((WebView) mBridgeH5EndCardView2.f22779p, (Map<String, Object>) hashMap);
            C8808a.m25622a().mo58252a((WebView) mBridgeH5EndCardView2.f22779p, C8812d.f21418a);
            C8808a.m25622a().mo58251a(mBridgeH5EndCardView2.f22779p);
        }
    }

    /* renamed from: f */
    static /* synthetic */ void m26789f(MBridgeH5EndCardView mBridgeH5EndCardView) {
        if (C2347b.m5579a().mo15773b()) {
            C2347b a = C2347b.m5579a();
            a.mo15774c(mBridgeH5EndCardView.f22784u + "_" + 1);
            mBridgeH5EndCardView.f22694b.setCampaignUnitId(mBridgeH5EndCardView.f22784u);
            C2347b a2 = C2347b.m5579a();
            a2.mo15768a(mBridgeH5EndCardView.f22784u + "_" + 2, mBridgeH5EndCardView.f22694b);
            C2347b a3 = C2347b.m5579a();
            a3.mo15767a(mBridgeH5EndCardView.f22784u + "_" + 2, (C2339a) new C2339a() {
                /* renamed from: a */
                public final void mo15737a() {
                    String str;
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (C2350a.m5601e().mo15792g() != null) {
                            jSONObject.put("status", 1);
                        }
                        str = jSONObject.toString();
                    } catch (Throwable th) {
                        C8608u.m24881a(MBridgeBaseView.TAG, th.getMessage(), th);
                        str = "";
                    }
                    C8824g.m25670a().mo58310a((WebView) MBridgeH5EndCardView.this.f22779p, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                }

                /* renamed from: b */
                public final void mo15739b() {
                    String str;
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (C2350a.m5601e().mo15792g() != null) {
                            jSONObject.put("status", 2);
                        }
                        str = jSONObject.toString();
                    } catch (Throwable th) {
                        C8608u.m24881a(MBridgeBaseView.TAG, th.getMessage(), th);
                        str = "";
                    }
                    C8824g.m25670a().mo58310a((WebView) MBridgeH5EndCardView.this.f22779p, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                }

                /* renamed from: a */
                public final void mo15738a(String str) {
                    String str2;
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (C2350a.m5601e().mo15792g() != null) {
                            jSONObject.put("status", 2);
                        }
                        str2 = jSONObject.toString();
                    } catch (Throwable th) {
                        C8608u.m24881a(MBridgeBaseView.TAG, th.getMessage(), th);
                        str2 = "";
                    }
                    C8824g.m25670a().mo58310a((WebView) MBridgeH5EndCardView.this.f22779p, "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
                }
            });
            C2347b a4 = C2347b.m5579a();
            FeedBackButton b = a4.mo15771b(mBridgeH5EndCardView.f22784u + "_" + 2);
            mBridgeH5EndCardView.f22787x = b;
            if (b != null) {
                RelativeLayout.LayoutParams layoutParams = null;
                try {
                    layoutParams = (RelativeLayout.LayoutParams) b.getLayoutParams();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (layoutParams == null) {
                    layoutParams = new RelativeLayout.LayoutParams(C2347b.f4896a, C2347b.f4897b);
                }
                layoutParams.addRule(9);
                ViewGroup viewGroup = (ViewGroup) mBridgeH5EndCardView.f22787x.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(mBridgeH5EndCardView.f22787x);
                }
                mBridgeH5EndCardView.f22777n.addView(mBridgeH5EndCardView.f22787x, layoutParams);
                mBridgeH5EndCardView.f22777n.postDelayed(new Runnable() {
                    public final void run() {
                        MBridgeH5EndCardView.this.f22787x.setVisibility(0);
                    }
                }, 200);
            }
        }
    }
}
