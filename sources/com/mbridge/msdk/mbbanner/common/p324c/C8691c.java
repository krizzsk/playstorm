package com.mbridge.msdk.mbbanner.common.p324c;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.iab.omid.library.mmadbridge.ScriptInjector;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C2295a;
import com.mbridge.msdk.click.p057a.C2302a;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p064b.C2339a;
import com.mbridge.msdk.foundation.p064b.C2347b;
import com.mbridge.msdk.foundation.p066db.C2374f;
import com.mbridge.msdk.foundation.p066db.C2376g;
import com.mbridge.msdk.foundation.p066db.C2379j;
import com.mbridge.msdk.foundation.same.p301c.C8425b;
import com.mbridge.msdk.foundation.same.p301c.C8428c;
import com.mbridge.msdk.foundation.same.p303e.C8434a;
import com.mbridge.msdk.foundation.same.report.C8518b;
import com.mbridge.msdk.foundation.same.report.C8524c;
import com.mbridge.msdk.foundation.same.report.C8526d;
import com.mbridge.msdk.foundation.same.report.C8542e;
import com.mbridge.msdk.foundation.tools.C8602s;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.mbbanner.common.bridge.C8682a;
import com.mbridge.msdk.mbbanner.common.p322a.C8666a;
import com.mbridge.msdk.mbbanner.common.p323b.C8670a;
import com.mbridge.msdk.mbbanner.common.p323b.C8672c;
import com.mbridge.msdk.mbbanner.common.p323b.C8676g;
import com.mbridge.msdk.mbbanner.common.p325d.C8704a;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.mbridge.msdk.mbbanner.view.MBBannerWebView;
import com.mbridge.msdk.mbsignalcommon.communication.C8805b;
import com.mbridge.msdk.mbsignalcommon.mraid.C8808a;
import com.mbridge.msdk.mbsignalcommon.mraid.C8811c;
import com.mbridge.msdk.mbsignalcommon.p338b.C8790b;
import com.mbridge.msdk.mbsignalcommon.windvane.C8821d;
import com.mbridge.msdk.mbsignalcommon.windvane.C8824g;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.p054c.C2283b;
import com.mbridge.msdk.p054c.C2294d;
import com.mbridge.msdk.videocommon.download.C9572h;
import com.mbridge.msdk.widget.FeedBackButton;
import java.io.File;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.mbbanner.common.c.c */
/* compiled from: BannerShowManager */
public final class C8691c {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static String f21068b = "BannerShowManager";
    /* access modifiers changed from: private */

    /* renamed from: A */
    public float f21069A;

    /* renamed from: B */
    private View.OnClickListener f21070B = new View.OnClickListener() {
        public final void onClick(View view) {
            if (C8691c.this.f21087p) {
                C8691c.m25252c(C8691c.this);
            }
        }
    };

    /* renamed from: C */
    private C8670a f21071C = new C8670a() {
        /* renamed from: a */
        public final void mo57988a(int i) {
            if (i == 2) {
                C8691c.m25255d(C8691c.this);
            } else {
                C8691c.this.m25259f();
            }
        }

        /* renamed from: a */
        public final void mo57990a(String str) {
            C8691c.m25252c(C8691c.this);
        }

        /* renamed from: a */
        public final void mo57987a() {
            C8691c.m25252c(C8691c.this);
        }

        /* renamed from: b */
        public final void mo57993b(int i) {
            if (i == 1) {
                C8691c.this.m25254d();
                C8691c.this.m25242a("", 1);
                return;
            }
            C8691c.this.m25250c();
        }

        /* renamed from: a */
        public final void mo57989a(CampaignEx campaignEx) {
            C8691c.this.mo58028a(campaignEx);
        }

        /* renamed from: a */
        public final void mo57991a(boolean z) {
            if (C8691c.this.f21074c != null) {
                boolean unused = C8691c.this.f21086o = z;
                if (z) {
                    C8691c.this.f21074c.mo57959c();
                } else {
                    C8691c.this.f21074c.mo57960d();
                }
            }
        }

        /* renamed from: a */
        public final void mo57992a(boolean z, String str) {
            try {
                if (C8691c.this.f21074c == null) {
                    return;
                }
                if (TextUtils.isEmpty(str)) {
                    C8691c.this.f21074c.mo57954a();
                    C8691c.this.f21074c.mo57958b();
                    return;
                }
                CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(CampaignEx.campaignToJsonObject(C8691c.this.f21076e));
                parseCampaignWithBackData.setClickURL(str);
                if (z) {
                    String j = C8691c.this.f21088q;
                    if (parseCampaignWithBackData != null) {
                        try {
                            if (!TextUtils.isEmpty(str)) {
                                new C8526d(C2350a.m5601e().mo15792g()).mo57698b(parseCampaignWithBackData.getRequestId(), parseCampaignWithBackData.getRequestIdNotice(), parseCampaignWithBackData.getId(), j, str, parseCampaignWithBackData.isBidCampaign());
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
                C8691c.this.mo58028a(parseCampaignWithBackData);
            } catch (Exception e2) {
                C8608u.m24884d(C8691c.f21068b, e2.getMessage());
            }
        }
    };

    /* renamed from: D */
    private C8790b f21072D = new C8790b() {
        /* renamed from: a */
        public final void mo57902a(WebView webView, String str) {
            boolean unused = C8691c.this.f21083l = true;
            C8608u.m24884d("BannerCallJS", "fireOnSignalCommunication");
            C8824g.m25670a().mo58309a(webView);
            boolean unused2 = C8691c.this.f21085n = true;
            if (C8691c.this.f21076e != null && !C8691c.this.f21076e.isHasMBTplMark()) {
                C8691c.this.m25254d();
                C8691c.this.m25242a("", 1);
            }
        }

        /* renamed from: a */
        public final void mo57900a(WebView webView, int i, String str, String str2) {
            C8691c.this.m25241a(str);
            C8691c.this.m25242a(str, 2);
        }
    };

    /* renamed from: a */
    C2295a f21073a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C8672c f21074c;

    /* renamed from: d */
    private boolean f21075d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public CampaignEx f21076e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public MBBannerView f21077f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ImageView f21078g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public MBBannerWebView f21079h;

    /* renamed from: i */
    private ImageView f21080i;

    /* renamed from: j */
    private boolean f21081j;

    /* renamed from: k */
    private boolean f21082k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f21083l;

    /* renamed from: m */
    private boolean f21084m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f21085n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f21086o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f21087p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public String f21088q;

    /* renamed from: r */
    private String f21089r;

    /* renamed from: s */
    private List<CampaignEx> f21090s;

    /* renamed from: t */
    private int f21091t;

    /* renamed from: u */
    private long f21092u = 15000;

    /* renamed from: v */
    private C8682a f21093v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public AdSession f21094w;

    /* renamed from: x */
    private Handler f21095x = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                try {
                    if (C8691c.this.f21094w != null) {
                        AdEvents.createAdEvents(C8691c.this.f21094w).impressionOccurred();
                        C8691c.this.f21094w.finish();
                        AdSession unused = C8691c.this.f21094w = null;
                    }
                } catch (Throwable th) {
                    C8608u.m24880a(C8691c.f21068b, th.getMessage());
                }
            }
        }
    };

    /* renamed from: y */
    private C8434a f21096y = new C8434a() {
        /* renamed from: b */
        public final void mo15709b() {
        }

        /* renamed from: a */
        public final void mo15708a() {
            C8691c.this.m25241a("banner render failed because render is timeout");
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: z */
    public float f21097z;

    public C8691c(MBBannerView mBBannerView, C8672c cVar, String str, String str2, boolean z, C2294d dVar) {
        this.f21075d = z;
        this.f21077f = mBBannerView;
        this.f21088q = str2;
        this.f21089r = str;
        this.f21074c = new C8676g(cVar, dVar);
    }

    /* renamed from: a */
    public final void mo58031a(boolean z, int i) {
        this.f21091t = i;
        if (i == 0) {
            C2294d e = C2283b.m5275a().mo15569e(C2350a.m5601e().mo15793h(), this.f21088q);
            if (e != null) {
                z = e.mo15588c() == 1;
            } else {
                return;
            }
        }
        this.f21075d = z;
    }

    /* renamed from: a */
    public final void mo58030a(boolean z) {
        this.f21075d = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m25250c() {
        if (this.f21077f != null) {
            MBBannerWebView mBBannerWebView = this.f21079h;
            if (!(mBBannerWebView == null || mBBannerWebView.getParent() == null)) {
                this.f21077f.removeView(this.f21079h);
            }
            if (this.f21078g == null) {
                ImageView imageView = new ImageView(C2350a.m5601e().mo15792g());
                this.f21078g = imageView;
                imageView.setOnTouchListener(new View.OnTouchListener() {
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        float unused = C8691c.this.f21097z = motionEvent.getRawX();
                        float unused2 = C8691c.this.f21069A = motionEvent.getRawY();
                        String b = C8691c.f21068b;
                        C8608u.m24884d(b, C8691c.this.f21097z + "  " + C8691c.this.f21069A);
                        return false;
                    }
                });
                this.f21078g.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        C8691c.this.mo58028a(BannerUtils.managerCampaignEX(C8805b.m25602a(C8691c.this.f21097z, C8691c.this.f21069A), C8691c.this.f21076e));
                    }
                });
            }
            String imageUrl = this.f21076e.getImageUrl();
            if (!TextUtils.isEmpty(imageUrl)) {
                C8425b.m24339a(C2350a.m5601e().mo15792g()).mo57506a(imageUrl, (C8428c) new C8428c() {
                    public final void onSuccessLoad(Bitmap bitmap, String str) {
                        if (C8691c.this.f21078g != null) {
                            C8691c.this.f21078g.setImageBitmap(bitmap);
                        }
                        boolean unused = C8691c.this.f21083l = true;
                        C8691c.m25268n(C8691c.this);
                        C8691c.this.m25259f();
                        C8691c.this.m25254d();
                    }

                    public final void onFailedLoad(String str, String str2) {
                        C8691c.this.m25241a("banner show failed because banner default view is exception");
                    }
                });
            } else {
                m25241a("banner show failed because campain is exception");
            }
        } else {
            m25241a("banner show failed because banner view is exception");
        }
    }

    /* renamed from: b */
    private String m25246b(CampaignEx campaignEx) {
        String str;
        String str2 = "";
        if (campaignEx == null) {
            return str2;
        }
        String b = C9572h.m27477a().mo63246b(campaignEx.getBannerUrl());
        if (!TextUtils.isEmpty(b)) {
            return ScriptInjector.injectScriptContentIntoHtml(MBridgeConstans.OMID_JS_SERVICE_CONTENT, b);
        }
        String bannerHtml = campaignEx.getBannerHtml();
        if (campaignEx.isActiveOm()) {
            try {
                File file = new File(bannerHtml);
                if (file.exists()) {
                    str2 = C8602s.m24862a(file);
                }
                str = ScriptInjector.injectScriptContentIntoHtml(MBridgeConstans.OMID_JS_SERVICE_CONTENT, str2);
            } catch (Exception unused) {
                File file2 = new File(bannerHtml);
                if (file2.exists() && file2.isFile() && file2.canRead()) {
                    str = "file:////" + bannerHtml;
                }
            }
        } else {
            File file3 = new File(bannerHtml);
            if (file3.exists() && file3.isFile() && file3.canRead()) {
                str = "file:////" + bannerHtml;
            }
            return bannerHtml;
        }
        return str;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25241a(String str) {
        if (this.f21076e != null && !m25258e()) {
            this.f21095x.removeCallbacks(this.f21096y);
            C8672c cVar = this.f21074c;
            if (cVar != null) {
                cVar.mo57956a(str);
            }
            C8542e.m24710b(C2350a.m5601e().mo15792g(), this.f21076e, this.f21088q, str);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x039e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01f2  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m25254d() {
        /*
            r24 = this;
            r1 = r24
            java.lang.String r2 = "true"
            boolean r0 = r1.f21083l
            r3 = 1
            if (r0 == 0) goto L_0x0047
            boolean r0 = r1.f21084m
            if (r0 != 0) goto L_0x0047
            com.mbridge.msdk.mbbanner.common.b.c r0 = r1.f21074c
            if (r0 == 0) goto L_0x0047
            r1.f21084m = r3
            android.os.Handler r0 = r1.f21095x
            com.mbridge.msdk.foundation.same.e.a r4 = r1.f21096y
            r0.removeCallbacks(r4)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f21076e
            if (r0 == 0) goto L_0x0047
            boolean r0 = r0.isCallbacked()
            if (r0 != 0) goto L_0x0047
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f21076e
            r0.setCallbacked(r3)
            com.mbridge.msdk.mbbanner.common.b.c r0 = r1.f21074c
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r4 = r1.f21090s
            r0.mo57957a((java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>) r4)
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
            android.content.Context r0 = r0.mo15792g()
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r1.f21076e
            int r4 = r4.getMaitve()
            com.mbridge.msdk.foundation.entity.CampaignEx r5 = r1.f21076e
            java.lang.String r5 = r5.getMaitve_src()
            com.mbridge.msdk.click.C2309b.m5446a((android.content.Context) r0, (int) r4, (java.lang.String) r5)
        L_0x0047:
            boolean r0 = r1.f21083l
            if (r0 == 0) goto L_0x03a4
            boolean r0 = r1.f21081j
            if (r0 == 0) goto L_0x03a4
            boolean r0 = r1.f21082k
            if (r0 == 0) goto L_0x03a4
            boolean r0 = r1.f21084m
            if (r0 == 0) goto L_0x03a4
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f21076e
            if (r0 == 0) goto L_0x03a4
            boolean r0 = r24.m25258e()
            if (r0 != 0) goto L_0x03a4
            com.mbridge.msdk.out.MBBannerView r0 = r1.f21077f
            r4 = 0
            if (r0 != 0) goto L_0x0067
            goto L_0x0073
        L_0x0067:
            boolean r0 = com.mbridge.msdk.foundation.tools.C8560af.m24752a(r0)
            if (r0 != 0) goto L_0x0073
            boolean r0 = r1.f21086o
            if (r0 != 0) goto L_0x0073
            r5 = r3
            goto L_0x0074
        L_0x0073:
            r5 = r4
        L_0x0074:
            r6 = 1000(0x3e8, double:4.94E-321)
            if (r5 != 0) goto L_0x0084
            com.mbridge.msdk.out.MBBannerView r0 = r1.f21077f
            if (r0 == 0) goto L_0x0084
            com.mbridge.msdk.mbbanner.common.c.c$11 r8 = new com.mbridge.msdk.mbbanner.common.c.c$11
            r8.<init>()
            r0.postDelayed(r8, r6)
        L_0x0084:
            boolean r0 = r1.f21085n
            if (r0 == 0) goto L_0x01ee
            if (r5 == 0) goto L_0x01ee
            r8 = 2
            int[] r9 = new int[r8]
            com.mbridge.msdk.out.MBBannerView r0 = r1.f21077f
            r0.getLocationInWindow(r9)
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r0 = r1.f21079h
            r10 = r9[r4]
            float r10 = (float) r10
            r11 = r9[r3]
            float r11 = (float) r11
            java.lang.String r12 = "BannerCallJS"
            java.lang.String r13 = "fireOnBannerWebViewShow"
            com.mbridge.msdk.foundation.tools.C8608u.m24884d(r12, r13)
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ all -> 0x00da }
            r14.<init>()     // Catch:{ all -> 0x00da }
            java.lang.String r15 = "startX"
            double r6 = (double) r10     // Catch:{ all -> 0x00da }
            r14.put(r15, r6)     // Catch:{ all -> 0x00da }
            java.lang.String r6 = "startY"
            double r10 = (double) r11     // Catch:{ all -> 0x00da }
            r14.put(r6, r10)     // Catch:{ all -> 0x00da }
            java.lang.String r6 = "scale"
            com.mbridge.msdk.foundation.controller.a r7 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ all -> 0x00da }
            android.content.Context r7 = r7.mo15792g()     // Catch:{ all -> 0x00da }
            float r7 = com.mbridge.msdk.foundation.tools.C8613y.m24941d((android.content.Context) r7)     // Catch:{ all -> 0x00da }
            double r10 = (double) r7     // Catch:{ all -> 0x00da }
            r14.put(r6, r10)     // Catch:{ all -> 0x00da }
            java.lang.String r6 = r14.toString()     // Catch:{ all -> 0x00da }
            byte[] r6 = r6.getBytes()     // Catch:{ all -> 0x00da }
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r8)     // Catch:{ all -> 0x00da }
            com.mbridge.msdk.mbsignalcommon.windvane.g r7 = com.mbridge.msdk.mbsignalcommon.windvane.C8824g.m25670a()     // Catch:{ all -> 0x00da }
            java.lang.String r10 = "webviewshow"
            r7.mo58310a((android.webkit.WebView) r0, (java.lang.String) r10, (java.lang.String) r6)     // Catch:{ all -> 0x00da }
            goto L_0x00de
        L_0x00da:
            r0 = move-exception
            com.mbridge.msdk.foundation.tools.C8608u.m24881a(r12, r13, r0)
        L_0x00de:
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r0 = r1.f21079h
            r6 = r9[r4]
            r7 = r9[r3]
            com.mbridge.msdk.out.MBBannerView r9 = r1.f21077f
            int r9 = r9.getWidth()
            com.mbridge.msdk.out.MBBannerView r10 = r1.f21077f
            int r10 = r10.getHeight()
            com.mbridge.msdk.foundation.controller.a r11 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ all -> 0x01c1 }
            android.content.Context r11 = r11.mo15792g()     // Catch:{ all -> 0x01c1 }
            android.content.res.Resources r11 = r11.getResources()     // Catch:{ all -> 0x01c1 }
            android.content.res.Configuration r11 = r11.getConfiguration()     // Catch:{ all -> 0x01c1 }
            int r11 = r11.orientation     // Catch:{ all -> 0x01c1 }
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ all -> 0x01c1 }
            r13.<init>()     // Catch:{ all -> 0x01c1 }
            java.lang.String r14 = "orientation"
            if (r11 != r8) goto L_0x010e
            java.lang.String r8 = "landscape"
            goto L_0x0115
        L_0x010e:
            if (r11 != r3) goto L_0x0113
            java.lang.String r8 = "portrait"
            goto L_0x0115
        L_0x0113:
            java.lang.String r8 = "undefined"
        L_0x0115:
            r13.put(r14, r8)     // Catch:{ all -> 0x01c1 }
            java.lang.String r8 = "locked"
            r13.put(r8, r2)     // Catch:{ all -> 0x01c1 }
            com.mbridge.msdk.foundation.controller.a r8 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ all -> 0x01c1 }
            android.content.Context r8 = r8.mo15792g()     // Catch:{ all -> 0x01c1 }
            int r8 = com.mbridge.msdk.foundation.tools.C8596q.m24837h(r8)     // Catch:{ all -> 0x01c1 }
            float r8 = (float) r8     // Catch:{ all -> 0x01c1 }
            com.mbridge.msdk.foundation.controller.a r11 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ all -> 0x01c1 }
            android.content.Context r11 = r11.mo15792g()     // Catch:{ all -> 0x01c1 }
            int r11 = com.mbridge.msdk.foundation.tools.C8596q.m24838i(r11)     // Catch:{ all -> 0x01c1 }
            float r11 = (float) r11     // Catch:{ all -> 0x01c1 }
            com.mbridge.msdk.foundation.controller.a r14 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ all -> 0x01c1 }
            android.content.Context r14 = r14.mo15792g()     // Catch:{ all -> 0x01c1 }
            java.util.HashMap r14 = com.mbridge.msdk.foundation.tools.C8596q.m24841j(r14)     // Catch:{ all -> 0x01c1 }
            java.lang.String r15 = "width"
            java.lang.Object r15 = r14.get(r15)     // Catch:{ all -> 0x01c1 }
            java.lang.Integer r15 = (java.lang.Integer) r15     // Catch:{ all -> 0x01c1 }
            int r15 = r15.intValue()     // Catch:{ all -> 0x01c1 }
            java.lang.String r3 = "height"
            java.lang.Object r3 = r14.get(r3)     // Catch:{ all -> 0x01c1 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x01c1 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x01c1 }
            java.util.HashMap r14 = new java.util.HashMap     // Catch:{ all -> 0x01c1 }
            r14.<init>()     // Catch:{ all -> 0x01c1 }
            java.lang.String r4 = "placementType"
            r23 = r5
            java.lang.String r5 = "inline"
            r14.put(r4, r5)     // Catch:{ all -> 0x01bf }
            java.lang.String r4 = "state"
            java.lang.String r5 = "default"
            r14.put(r4, r5)     // Catch:{ all -> 0x01bf }
            java.lang.String r4 = "viewable"
            r14.put(r4, r2)     // Catch:{ all -> 0x01bf }
            java.lang.String r2 = "currentAppOrientation"
            r14.put(r2, r13)     // Catch:{ all -> 0x01bf }
            com.mbridge.msdk.mbsignalcommon.mraid.a r16 = com.mbridge.msdk.mbsignalcommon.mraid.C8808a.m25622a()     // Catch:{ all -> 0x01bf }
            float r2 = (float) r6     // Catch:{ all -> 0x01bf }
            float r4 = (float) r7     // Catch:{ all -> 0x01bf }
            float r5 = (float) r9     // Catch:{ all -> 0x01bf }
            float r6 = (float) r10     // Catch:{ all -> 0x01bf }
            r17 = r0
            r18 = r2
            r19 = r4
            r20 = r5
            r21 = r6
            r16.mo58254a(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x01bf }
            com.mbridge.msdk.mbsignalcommon.mraid.a r16 = com.mbridge.msdk.mbsignalcommon.mraid.C8808a.m25622a()     // Catch:{ all -> 0x01bf }
            r17 = r0
            r18 = r2
            r19 = r4
            r20 = r5
            r21 = r6
            r16.mo58259b(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x01bf }
            com.mbridge.msdk.mbsignalcommon.mraid.a r2 = com.mbridge.msdk.mbsignalcommon.mraid.C8808a.m25622a()     // Catch:{ all -> 0x01bf }
            r2.mo58258b(r0, r8, r11)     // Catch:{ all -> 0x01bf }
            com.mbridge.msdk.mbsignalcommon.mraid.a r2 = com.mbridge.msdk.mbsignalcommon.mraid.C8808a.m25622a()     // Catch:{ all -> 0x01bf }
            float r4 = (float) r15     // Catch:{ all -> 0x01bf }
            float r3 = (float) r3     // Catch:{ all -> 0x01bf }
            r2.mo58261c(r0, r4, r3)     // Catch:{ all -> 0x01bf }
            com.mbridge.msdk.mbsignalcommon.mraid.a r2 = com.mbridge.msdk.mbsignalcommon.mraid.C8808a.m25622a()     // Catch:{ all -> 0x01bf }
            r2.mo58257a((android.webkit.WebView) r0, (java.util.Map<java.lang.String, java.lang.Object>) r14)     // Catch:{ all -> 0x01bf }
            com.mbridge.msdk.mbsignalcommon.mraid.a r2 = com.mbridge.msdk.mbsignalcommon.mraid.C8808a.m25622a()     // Catch:{ all -> 0x01bf }
            r2.mo58251a(r0)     // Catch:{ all -> 0x01bf }
            goto L_0x01c9
        L_0x01bf:
            r0 = move-exception
            goto L_0x01c4
        L_0x01c1:
            r0 = move-exception
            r23 = r5
        L_0x01c4:
            java.lang.String r2 = "transInfoForMraid"
            com.mbridge.msdk.foundation.tools.C8608u.m24881a(r12, r2, r0)
        L_0x01c9:
            r2 = 0
            r1.f21085n = r2
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f21076e
            java.lang.String r0 = r0.getImageUrl()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01f0
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
            android.content.Context r0 = r0.mo15792g()
            com.mbridge.msdk.foundation.same.c.b r0 = com.mbridge.msdk.foundation.same.p301c.C8425b.m24339a((android.content.Context) r0)
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r1.f21076e
            java.lang.String r2 = r2.getImageUrl()
            r0.mo57509c(r2)
            goto L_0x01f0
        L_0x01ee:
            r23 = r5
        L_0x01f0:
            if (r23 == 0) goto L_0x039e
            android.widget.ImageView r0 = r1.f21078g
            java.lang.String r2 = "banner"
            if (r0 == 0) goto L_0x023a
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x023a
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f21076e
            if (r0 == 0) goto L_0x02ce
            if (r0 == 0) goto L_0x022b
            com.mbridge.msdk.foundation.controller.a r3 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
            android.content.Context r3 = r3.mo15792g()
            java.lang.String r4 = r1.f21088q
            r1.m25251c(r0, r3, r4)
            com.mbridge.msdk.foundation.controller.a r3 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
            android.content.Context r3 = r3.mo15792g()
            java.lang.String r4 = r1.f21088q
            r1.m25247b(r0, r3, r4)
            com.mbridge.msdk.foundation.controller.a r3 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
            android.content.Context r3 = r3.mo15792g()
            java.lang.String r4 = r1.f21088q
            r1.m25238a((com.mbridge.msdk.foundation.entity.CampaignEx) r0, (android.content.Context) r3, (java.lang.String) r4)
        L_0x022b:
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f21076e
            r3 = 1
            r0.setReport(r3)
            java.lang.String r0 = r1.f21088q
            com.mbridge.msdk.foundation.entity.CampaignEx r3 = r1.f21076e
            com.mbridge.msdk.foundation.same.p299a.C8417d.m24308a((java.lang.String) r0, (com.mbridge.msdk.foundation.entity.CampaignEx) r3, (java.lang.String) r2)
            goto L_0x02ce
        L_0x023a:
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r1.f21090s
            if (r0 == 0) goto L_0x02ce
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x02ce
            r0 = 0
            r4 = 0
            r22 = 0
        L_0x0248:
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r3 = r1.f21090s
            int r3 = r3.size()
            if (r4 >= r3) goto L_0x02a2
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r3 = r1.f21090s
            java.lang.Object r3 = r3.get(r4)
            com.mbridge.msdk.foundation.entity.CampaignEx r3 = (com.mbridge.msdk.foundation.entity.CampaignEx) r3
            boolean r3 = r3.isHasMBTplMark()
            if (r3 != 0) goto L_0x029f
            if (r4 == 0) goto L_0x026e
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r3 = r1.f21090s
            java.lang.Object r3 = r3.get(r4)
            com.mbridge.msdk.foundation.entity.CampaignEx r3 = (com.mbridge.msdk.foundation.entity.CampaignEx) r3
            boolean r3 = r3.isReport()
            if (r3 != 0) goto L_0x029f
        L_0x026e:
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r1.f21090s
            java.lang.Object r0 = r0.get(r4)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0
            com.mbridge.msdk.foundation.controller.a r3 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
            android.content.Context r3 = r3.mo15792g()
            java.lang.String r5 = r1.f21088q
            r1.m25251c(r0, r3, r5)
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r1.f21090s
            java.lang.Object r0 = r0.get(r4)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0
            r3 = 1
            r0.setReport(r3)
            java.lang.String r0 = r1.f21088q
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r3 = r1.f21090s
            java.lang.Object r3 = r3.get(r4)
            com.mbridge.msdk.foundation.entity.CampaignEx r3 = (com.mbridge.msdk.foundation.entity.CampaignEx) r3
            com.mbridge.msdk.foundation.same.p299a.C8417d.m24308a((java.lang.String) r0, (com.mbridge.msdk.foundation.entity.CampaignEx) r3, (java.lang.String) r2)
            r0 = r4
            r22 = 1
        L_0x029f:
            int r4 = r4 + 1
            goto L_0x0248
        L_0x02a2:
            if (r22 == 0) goto L_0x02ce
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r2 = r1.f21090s
            java.lang.Object r2 = r2.get(r0)
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = (com.mbridge.msdk.foundation.entity.CampaignEx) r2
            com.mbridge.msdk.foundation.controller.a r3 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
            android.content.Context r3 = r3.mo15792g()
            java.lang.String r4 = r1.f21088q
            r1.m25247b(r2, r3, r4)
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r2 = r1.f21090s
            java.lang.Object r0 = r2.get(r0)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
            android.content.Context r2 = r2.mo15792g()
            java.lang.String r3 = r1.f21088q
            r1.m25238a((com.mbridge.msdk.foundation.entity.CampaignEx) r0, (android.content.Context) r2, (java.lang.String) r3)
        L_0x02ce:
            r2 = 1
            r1.f21087p = r2
            com.mbridge.msdk.mbbanner.common.b.c r0 = r1.f21074c
            if (r0 == 0) goto L_0x02da
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r1.f21076e
            r0.mo57955a((com.mbridge.msdk.foundation.entity.CampaignEx) r2)
        L_0x02da:
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f21076e     // Catch:{ Exception -> 0x035c }
            if (r0 == 0) goto L_0x0384
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f21076e     // Catch:{ Exception -> 0x035c }
            boolean r0 = r0.isActiveOm()     // Catch:{ Exception -> 0x035c }
            if (r0 == 0) goto L_0x0384
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ Exception -> 0x035c }
            android.content.Context r0 = r0.mo15792g()     // Catch:{ Exception -> 0x035c }
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r2 = r1.f21079h     // Catch:{ Exception -> 0x035c }
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r3 = r1.f21079h     // Catch:{ Exception -> 0x035c }
            java.lang.String r3 = r3.getUrl()     // Catch:{ Exception -> 0x035c }
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r1.f21076e     // Catch:{ Exception -> 0x035c }
            com.iab.omid.library.mmadbridge.adsession.AdSession r0 = com.mbridge.msdk.p051a.C2265b.m5113a(r0, r2, r3, r4)     // Catch:{ Exception -> 0x035c }
            r1.f21094w = r0     // Catch:{ Exception -> 0x035c }
            if (r0 == 0) goto L_0x0331
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r2 = r1.f21079h     // Catch:{ Exception -> 0x0326 }
            r0.registerAdView(r2)     // Catch:{ Exception -> 0x0326 }
            android.widget.ImageView r0 = r1.f21080i     // Catch:{ Exception -> 0x0326 }
            r2 = 0
            if (r0 == 0) goto L_0x0313
            com.iab.omid.library.mmadbridge.adsession.AdSession r0 = r1.f21094w     // Catch:{ Exception -> 0x0326 }
            android.widget.ImageView r3 = r1.f21080i     // Catch:{ Exception -> 0x0326 }
            com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose r4 = com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose.VIDEO_CONTROLS     // Catch:{ Exception -> 0x0326 }
            r0.addFriendlyObstruction(r3, r4, r2)     // Catch:{ Exception -> 0x0326 }
        L_0x0313:
            android.widget.ImageView r0 = r1.f21078g     // Catch:{ Exception -> 0x0326 }
            if (r0 == 0) goto L_0x0320
            com.iab.omid.library.mmadbridge.adsession.AdSession r0 = r1.f21094w     // Catch:{ Exception -> 0x0326 }
            android.widget.ImageView r3 = r1.f21078g     // Catch:{ Exception -> 0x0326 }
            com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose r4 = com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose.OTHER     // Catch:{ Exception -> 0x0326 }
            r0.addFriendlyObstruction(r3, r4, r2)     // Catch:{ Exception -> 0x0326 }
        L_0x0320:
            com.iab.omid.library.mmadbridge.adsession.AdSession r0 = r1.f21094w     // Catch:{ Exception -> 0x0326 }
            r0.start()     // Catch:{ Exception -> 0x0326 }
            goto L_0x0384
        L_0x0326:
            r0 = move-exception
            java.lang.String r2 = "OMSDK"
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x035c }
            com.mbridge.msdk.foundation.tools.C8608u.m24880a(r2, r0)     // Catch:{ Exception -> 0x035c }
            goto L_0x0384
        L_0x0331:
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f21076e     // Catch:{ Exception -> 0x035c }
            if (r0 == 0) goto L_0x0384
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f21076e     // Catch:{ Exception -> 0x035c }
            java.lang.String r3 = r0.getRequestId()     // Catch:{ Exception -> 0x035c }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f21076e     // Catch:{ Exception -> 0x035c }
            java.lang.String r5 = r0.getId()     // Catch:{ Exception -> 0x035c }
            java.lang.String r6 = r1.f21088q     // Catch:{ Exception -> 0x035c }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f21076e     // Catch:{ Exception -> 0x035c }
            java.lang.String r4 = r0.getRequestIdNotice()     // Catch:{ Exception -> 0x035c }
            com.mbridge.msdk.foundation.same.report.d r2 = new com.mbridge.msdk.foundation.same.report.d     // Catch:{ Exception -> 0x035c }
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ Exception -> 0x035c }
            android.content.Context r0 = r0.mo15792g()     // Catch:{ Exception -> 0x035c }
            r2.<init>(r0)     // Catch:{ Exception -> 0x035c }
            java.lang.String r7 = "fetch OM failed, context null"
            r2.mo57696a((java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7)     // Catch:{ Exception -> 0x035c }
            goto L_0x0384
        L_0x035c:
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f21076e
            if (r0 == 0) goto L_0x0384
            java.lang.String r3 = r0.getRequestId()
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f21076e
            java.lang.String r5 = r0.getId()
            java.lang.String r6 = r1.f21088q
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f21076e
            java.lang.String r4 = r0.getRequestIdNotice()
            com.mbridge.msdk.foundation.same.report.d r2 = new com.mbridge.msdk.foundation.same.report.d
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
            android.content.Context r0 = r0.mo15792g()
            r2.<init>(r0)
            java.lang.String r7 = "fetch OM failed, context null"
            r2.mo57696a((java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7)
        L_0x0384:
            android.os.Handler r0 = r1.f21095x
            r2 = 1000(0x3e8, double:4.94E-321)
            r4 = 1
            r0.sendEmptyMessageDelayed(r4, r2)
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
            android.content.Context r0 = r0.mo15792g()
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r1.f21076e
            java.lang.String r3 = r1.f21088q
            java.lang.String r4 = ""
            com.mbridge.msdk.foundation.same.report.C8542e.m24696a((android.content.Context) r0, (com.mbridge.msdk.foundation.entity.CampaignEx) r2, (java.lang.String) r3, (java.lang.String) r4)
            goto L_0x03a4
        L_0x039e:
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f21076e
            r2 = 0
            r0.setReport(r2)
        L_0x03a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbbanner.common.p324c.C8691c.m25254d():void");
    }

    /* renamed from: e */
    private synchronized boolean m25258e() {
        boolean isReport;
        isReport = this.f21076e.isReport();
        if (!isReport) {
            this.f21076e.setReport(true);
        }
        return isReport;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m25259f() {
        ImageView imageView;
        if (this.f21075d && (imageView = this.f21080i) != null) {
            if (imageView.getVisibility() != 0) {
                this.f21080i.setVisibility(0);
                this.f21080i.setOnClickListener(this.f21070B);
            }
            if (this.f21080i.getParent() == null && this.f21077f != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C8613y.m24929b(C2350a.m5601e().mo15792g(), 12.0f), C8613y.m24929b(C2350a.m5601e().mo15792g(), 12.0f));
                layoutParams.addRule(11);
                layoutParams.addRule(10);
                this.f21077f.addView(this.f21080i, layoutParams);
            }
        }
    }

    /* renamed from: a */
    public final void mo58026a() {
        AdSession adSession = this.f21094w;
        if (adSession != null) {
            adSession.finish();
            this.f21094w = null;
        }
        if (this.f21074c != null) {
            this.f21074c = null;
        }
        MBBannerWebView mBBannerWebView = this.f21079h;
        if (mBBannerWebView != null) {
            mBBannerWebView.setWebViewListener((C8821d) null);
        }
        if (this.f21072D != null) {
            this.f21072D = null;
        }
        ImageView imageView = this.f21080i;
        if (imageView != null) {
            imageView.setOnClickListener((View.OnClickListener) null);
        }
        ImageView imageView2 = this.f21078g;
        if (imageView2 != null) {
            imageView2.setOnClickListener((View.OnClickListener) null);
        }
        MBBannerView mBBannerView = this.f21077f;
        if (mBBannerView != null) {
            mBBannerView.removeAllViews();
        }
        MBBannerWebView mBBannerWebView2 = this.f21079h;
        if (mBBannerWebView2 != null) {
            mBBannerWebView2.release();
        }
        C8682a aVar = this.f21093v;
        if (aVar != null) {
            aVar.mo58002a();
        }
        if (this.f21071C != null) {
            this.f21071C = null;
        }
        C2347b.m5579a().mo15774c(this.f21088q);
    }

    /* renamed from: b */
    public final void mo58032b(boolean z) {
        this.f21081j = z;
        m25254d();
        if (!z) {
            CampaignEx campaignEx = this.f21076e;
            String str = this.f21088q;
            if (campaignEx != null) {
                String a = C8811c.m25637a(campaignEx.getId());
                if (!TextUtils.isEmpty(a)) {
                    new C8526d(C2350a.m5601e().mo15792g()).mo57697a(campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), campaignEx.getId(), str, a, campaignEx.isBidCampaign());
                    C8811c.m25638b(campaignEx.getId());
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo58033c(boolean z) {
        this.f21082k = z;
        m25254d();
    }

    /* renamed from: a */
    private void m25238a(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                List<String> pv_urls = campaignEx.getPv_urls();
                if (pv_urls != null && pv_urls.size() > 0) {
                    for (String a : pv_urls) {
                        C2295a.m5360a(context, campaignEx, str, a, false, true);
                    }
                }
            } catch (Throwable th) {
                C8608u.m24884d(f21068b, th.getMessage());
            }
        }
    }

    /* renamed from: b */
    private void m25247b(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                if (!TextUtils.isEmpty(campaignEx.getOnlyImpressionURL())) {
                    C2295a.m5361a(context, campaignEx, str, campaignEx.getOnlyImpressionURL(), false, true, C2302a.f4734h);
                }
            } catch (Throwable th) {
                C8608u.m24884d(f21068b, th.getMessage());
            }
        }
    }

    /* renamed from: c */
    private void m25251c(final CampaignEx campaignEx, final Context context, String str) {
        if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
            new Thread(new Runnable() {
                public final void run() {
                    try {
                        C2379j.m5740a((C2374f) C2376g.m5723a(context)).mo15910b(campaignEx.getId());
                    } catch (Exception e) {
                        C8608u.m24884d(C8691c.f21068b, e.getMessage());
                    }
                }
            }).start();
            C2295a.m5361a(context, campaignEx, str, campaignEx.getImpressionURL(), false, true, C2302a.f4733g);
        }
        if (!TextUtils.isEmpty(str) && campaignEx.getNativeVideoTracking() != null && campaignEx.getNativeVideoTracking().mo57392i() != null) {
            C2295a.m5362a(context, campaignEx, str, campaignEx.getNativeVideoTracking().mo57392i(), false, false);
        }
    }

    /* renamed from: a */
    public final void mo58028a(CampaignEx campaignEx) {
        if (this.f21087p) {
            if (this.f21073a == null) {
                this.f21073a = new C2295a(C2350a.m5601e().mo15792g(), this.f21088q);
            }
            this.f21073a.mo15642a((NativeListener.NativeTrackingListener) new NativeListener.TrackingExListener() {
                public final void onDismissLoading(Campaign campaign) {
                }

                public final void onDownloadFinish(Campaign campaign) {
                }

                public final void onDownloadProgress(int i) {
                }

                public final void onDownloadStart(Campaign campaign) {
                }

                public final void onFinishRedirection(Campaign campaign, String str) {
                }

                public final boolean onInterceptDefaultLoadingDialog() {
                    return false;
                }

                public final void onRedirectionFailed(Campaign campaign, String str) {
                }

                public final void onShowLoading(Campaign campaign) {
                }

                public final void onStartRedirection(Campaign campaign, String str) {
                }

                public final void onLeaveApp() {
                    if (C8691c.this.f21074c != null) {
                        C8691c.this.f21074c.mo57958b();
                    }
                }
            });
            campaignEx.setCampaignUnitId(this.f21088q);
            this.f21073a.mo15639a(campaignEx);
            if (!this.f21076e.isReportClick()) {
                this.f21076e.setReportClick(true);
                Context g = C2350a.m5601e().mo15792g();
                if (!(campaignEx == null || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().mo57384e() == null)) {
                    C2295a.m5362a(g, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().mo57384e(), false, false);
                }
            }
            C8672c cVar = this.f21074c;
            if (cVar != null) {
                cVar.mo57954a();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25242a(String str, int i) {
        if (this.f21076e != null) {
            C8704a.m25293a(C8666a.m25135a().mo57971c(this.f21076e.getId()).mo57969b(this.f21088q).mo57973e(this.f21076e.getRequestId()).mo57972d(this.f21076e.getRequestIdNotice()).mo57975g(str).mo57966a(i).mo57968a(this.f21076e.isBidCampaign()), this.f21088q);
        }
    }

    /* renamed from: a */
    public final void mo58027a(int i, int i2, int i3, int i4) {
        if (i != i3 || i2 != i4) {
            MBBannerWebView mBBannerWebView = this.f21079h;
            C8608u.m24884d("BannerCallJS", "fireOnBannerViewSizeChange");
            try {
                C8808a.m25622a().mo58253a((WebView) mBBannerWebView, (float) i, (float) i2);
            } catch (Throwable th) {
                C8608u.m24881a("BannerCallJS", "fireOnBannerViewSizeChange", th);
            }
        }
    }

    /* renamed from: d */
    private void m25256d(boolean z) {
        if (this.f21077f != null) {
            FeedBackButton b = C2347b.m5579a().mo15771b(this.f21088q);
            if (C2347b.m5579a().mo15773b() && z && b != null) {
                ViewGroup viewGroup = (ViewGroup) b.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(b);
                }
                b.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) b.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new RelativeLayout.LayoutParams(C2347b.f4896a, C2347b.f4897b);
                }
                layoutParams.addRule(12);
                b.setLayoutParams(layoutParams);
                this.f21077f.addView(b);
            }
            C2347b.m5579a().mo15767a(this.f21088q, (C2339a) new C2339a() {
                /* renamed from: a */
                public final void mo15737a() {
                    String str;
                    C8691c.this.f21077f.onPause();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (C2350a.m5601e().mo15792g() != null) {
                            jSONObject.put("status", 1);
                        }
                        str = jSONObject.toString();
                    } catch (Throwable th) {
                        C8608u.m24881a(C8691c.f21068b, th.getMessage(), th);
                        str = "";
                    }
                    C8824g.m25670a().mo58310a((WebView) C8691c.this.f21079h, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                }

                /* renamed from: b */
                public final void mo15739b() {
                    String str;
                    C8691c.this.f21077f.onResume();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (C2350a.m5601e().mo15792g() != null) {
                            jSONObject.put("status", 2);
                        }
                        str = jSONObject.toString();
                    } catch (Throwable th) {
                        C8608u.m24881a(C8691c.f21068b, th.getMessage(), th);
                        str = "";
                    }
                    C8824g.m25670a().mo58310a((WebView) C8691c.this.f21079h, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                }

                /* renamed from: a */
                public final void mo15738a(String str) {
                    String str2;
                    C8691c.this.f21077f.onResume();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (C2350a.m5601e().mo15792g() != null) {
                            jSONObject.put("status", 2);
                        }
                        str2 = jSONObject.toString();
                    } catch (Throwable th) {
                        C8608u.m24881a(C8691c.f21068b, th.getMessage(), th);
                        str2 = "";
                    }
                    C8824g.m25670a().mo58310a((WebView) C8691c.this.f21079h, "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
                }
            });
            this.f21076e.setCampaignUnitId(this.f21088q);
            C2347b.m5579a().mo15768a(this.f21088q, this.f21076e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58029a(com.mbridge.msdk.foundation.entity.CampaignUnit r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L_0x001a
            java.util.ArrayList r11 = r11.getAds()
            r10.f21090s = r11
            if (r11 == 0) goto L_0x001a
            int r11 = r11.size()
            if (r11 <= 0) goto L_0x001a
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r11 = r10.f21090s
            java.lang.Object r11 = r11.get(r0)
            com.mbridge.msdk.foundation.entity.CampaignEx r11 = (com.mbridge.msdk.foundation.entity.CampaignEx) r11
            goto L_0x001b
        L_0x001a:
            r11 = 0
        L_0x001b:
            r10.f21076e = r11
            if (r11 != 0) goto L_0x0025
            java.lang.String r11 = "banner show failed because campain is exception"
            r10.m25241a((java.lang.String) r11)
            return
        L_0x0025:
            android.os.Handler r11 = r10.f21095x
            com.mbridge.msdk.foundation.same.e.a r1 = r10.f21096y
            r11.removeCallbacks(r1)
            boolean r11 = r10.f21075d
            r1 = 8
            if (r11 == 0) goto L_0x0064
            android.widget.ImageView r11 = r10.f21080i
            if (r11 != 0) goto L_0x0064
            android.widget.ImageView r11 = new android.widget.ImageView
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
            android.content.Context r2 = r2.mo15792g()
            r11.<init>(r2)
            r10.f21080i = r11
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
            android.content.Context r2 = r2.mo15792g()
            java.lang.String r3 = "mbridge_banner_close"
            java.lang.String r4 = "drawable"
            int r2 = com.mbridge.msdk.foundation.tools.C8594o.m24812a(r2, r3, r4)
            r11.setBackgroundResource(r2)
            android.widget.ImageView r11 = r10.f21080i
            r11.setVisibility(r1)
            android.widget.ImageView r11 = r10.f21080i
            java.lang.String r2 = "closeButton"
            r11.setContentDescription(r2)
        L_0x0064:
            r10.f21083l = r0
            r10.f21084m = r0
            r10.f21087p = r0
            com.mbridge.msdk.foundation.entity.CampaignEx r11 = r10.f21076e
            java.lang.String r11 = r11.getBannerHtml()
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 == 0) goto L_0x0082
            com.mbridge.msdk.foundation.entity.CampaignEx r11 = r10.f21076e
            java.lang.String r11 = r11.getBannerUrl()
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x00e2
        L_0x0082:
            com.mbridge.msdk.mbbanner.common.a.a r11 = com.mbridge.msdk.mbbanner.common.p322a.C8666a.m25135a()
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r10.f21076e
            java.lang.String r2 = r2.getId()
            com.mbridge.msdk.mbbanner.common.a.a r11 = r11.mo57971c(r2)
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r10.f21076e
            java.lang.String r2 = r2.getRequestId()
            com.mbridge.msdk.mbbanner.common.a.a r11 = r11.mo57973e(r2)
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r10.f21076e
            java.lang.String r2 = r2.getRequestIdNotice()
            com.mbridge.msdk.mbbanner.common.a.a r11 = r11.mo57972d(r2)
            java.lang.String r2 = r10.f21088q
            com.mbridge.msdk.mbbanner.common.a.a r11 = r11.mo57969b(r2)
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r10.f21076e
            boolean r2 = r2.isBidCampaign()
            com.mbridge.msdk.mbbanner.common.a.a r11 = r11.mo57968a((boolean) r2)
            java.lang.String r2 = r10.f21088q
            if (r11 == 0) goto L_0x00e2
            java.lang.String r3 = "2000067"
            r11.mo57967a((java.lang.String) r3)
            com.mbridge.msdk.foundation.same.report.b r3 = com.mbridge.msdk.foundation.same.report.C8518b.m24607a()
            boolean r3 = r3.mo57681c()
            if (r3 == 0) goto L_0x00d3
            com.mbridge.msdk.foundation.same.report.b r2 = com.mbridge.msdk.foundation.same.report.C8518b.m24607a()
            java.lang.String r11 = r11.mo57970b()
            r2.mo57679a((java.lang.String) r11)
            goto L_0x00e2
        L_0x00d3:
            java.lang.String r11 = r11.mo57970b()
            com.mbridge.msdk.foundation.controller.a r3 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
            android.content.Context r3 = r3.mo15792g()
            com.mbridge.msdk.foundation.same.report.C8524c.m24638a((java.lang.String) r11, (android.content.Context) r3, (java.lang.String) r2)
        L_0x00e2:
            android.os.Handler r11 = r10.f21095x
            com.mbridge.msdk.foundation.same.e.a r2 = r10.f21096y
            long r3 = r10.f21092u
            r11.postDelayed(r2, r3)
            com.mbridge.msdk.foundation.entity.CampaignEx r11 = r10.f21076e
            java.lang.String r11 = r10.m25246b((com.mbridge.msdk.foundation.entity.CampaignEx) r11)
            boolean r2 = android.text.TextUtils.isEmpty(r11)
            r3 = 2
            if (r2 != 0) goto L_0x01d2
            com.mbridge.msdk.out.MBBannerView r2 = r10.f21077f
            if (r2 == 0) goto L_0x01c7
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r2 = r10.f21079h
            if (r2 != 0) goto L_0x0128
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r2 = new com.mbridge.msdk.mbbanner.view.MBBannerWebView
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
            android.content.Context r4 = r4.mo15792g()
            r2.<init>(r4)
            r10.f21079h = r2
            android.widget.RelativeLayout$LayoutParams r4 = new android.widget.RelativeLayout$LayoutParams
            r5 = -1
            r4.<init>(r5, r5)
            r2.setLayoutParams(r4)
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r2 = r10.f21079h
            com.mbridge.msdk.mbbanner.view.a r4 = new com.mbridge.msdk.mbbanner.view.a
            java.lang.String r5 = r10.f21088q
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r6 = r10.f21090s
            com.mbridge.msdk.mbbanner.common.b.a r7 = r10.f21071C
            r4.<init>(r5, r6, r7)
            r2.setWebViewClient(r4)
        L_0x0128:
            android.widget.ImageView r2 = r10.f21078g
            if (r2 == 0) goto L_0x012f
            r2.setVisibility(r1)
        L_0x012f:
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r1 = r10.f21079h
            int r1 = r1.getVisibility()
            if (r1 == 0) goto L_0x013c
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r1 = r10.f21079h
            r1.setVisibility(r0)
        L_0x013c:
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r0 = r10.f21079h
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x014b
            com.mbridge.msdk.out.MBBannerView r0 = r10.f21077f
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r1 = r10.f21079h
            r0.addView(r1)
        L_0x014b:
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r10.f21076e
            boolean r0 = r0.isMraid()
            r10.m25256d((boolean) r0)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r10.f21076e
            java.lang.String r1 = r10.f21088q
            r0.setCampaignUnitId(r1)
            com.mbridge.msdk.foundation.b.b r0 = com.mbridge.msdk.foundation.p064b.C2347b.m5579a()
            java.lang.String r1 = r10.f21088q
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r10.f21076e
            r0.mo15768a((java.lang.String) r1, (com.mbridge.msdk.foundation.entity.CampaignEx) r2)
            r10.m25259f()
            com.mbridge.msdk.mbbanner.common.bridge.a r0 = new com.mbridge.msdk.mbbanner.common.bridge.a
            com.mbridge.msdk.out.MBBannerView r1 = r10.f21077f
            android.content.Context r1 = r1.getContext()
            java.lang.String r2 = r10.f21089r
            java.lang.String r4 = r10.f21088q
            r0.<init>(r1, r2, r4)
            r10.f21093v = r0
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r1 = r10.f21090s
            r0.mo58006a((java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>) r1)
            com.mbridge.msdk.mbbanner.common.bridge.a r0 = r10.f21093v
            com.mbridge.msdk.mbbanner.common.b.a r1 = r10.f21071C
            r0.mo58004a((com.mbridge.msdk.mbbanner.common.p323b.C8670a) r1)
            com.mbridge.msdk.mbbanner.common.bridge.a r0 = r10.f21093v
            int r1 = r10.f21091t
            r0.mo58003a((int) r1)
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r0 = r10.f21079h
            com.mbridge.msdk.mbsignalcommon.b.b r1 = r10.f21072D
            r0.setWebViewListener(r1)
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r0 = r10.f21079h
            com.mbridge.msdk.mbbanner.common.bridge.a r1 = r10.f21093v
            r0.setObject(r1)
            java.lang.String r0 = "file"
            boolean r0 = r11.startsWith(r0)
            if (r0 != 0) goto L_0x01c1
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r10.f21076e
            boolean r0 = r0.isActiveOm()
            if (r0 == 0) goto L_0x01af
            java.lang.String r11 = com.mbridge.msdk.p051a.C2265b.m5116a((java.lang.String) r11)
        L_0x01af:
            r6 = r11
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r4 = r10.f21079h
            com.mbridge.msdk.foundation.entity.CampaignEx r11 = r10.f21076e
            java.lang.String r5 = r11.getBannerUrl()
            r9 = 0
            java.lang.String r7 = "text/html"
            java.lang.String r8 = "utf-8"
            r4.loadDataWithBaseURL(r5, r6, r7, r8, r9)
            goto L_0x01d1
        L_0x01c1:
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r0 = r10.f21079h
            r0.loadUrl(r11)
            goto L_0x01d1
        L_0x01c7:
            java.lang.String r11 = "banner render failed because banner view is null"
            r10.m25242a((java.lang.String) r11, (int) r3)
            java.lang.String r11 = "banner show failed because banner view is exception"
            r10.m25241a((java.lang.String) r11)
        L_0x01d1:
            r0 = 1
        L_0x01d2:
            if (r0 != 0) goto L_0x01f4
            com.mbridge.msdk.foundation.entity.CampaignEx r11 = r10.f21076e
            java.lang.String r11 = r11.getBannerHtml()
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 == 0) goto L_0x01ec
            com.mbridge.msdk.foundation.entity.CampaignEx r11 = r10.f21076e
            java.lang.String r11 = r11.getBannerUrl()
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x01f1
        L_0x01ec:
            java.lang.String r11 = "banner render failed because res load failed"
            r10.m25242a((java.lang.String) r11, (int) r3)
        L_0x01f1:
            r10.m25250c()
        L_0x01f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbbanner.common.p324c.C8691c.mo58029a(com.mbridge.msdk.foundation.entity.CampaignUnit):void");
    }

    /* renamed from: c */
    static /* synthetic */ void m25252c(C8691c cVar) {
        MBBannerWebView mBBannerWebView = cVar.f21079h;
        if (!(mBBannerWebView == null || mBBannerWebView.getParent() == null)) {
            cVar.f21077f.removeView(cVar.f21079h);
        }
        ImageView imageView = cVar.f21078g;
        if (!(imageView == null || imageView.getParent() == null)) {
            cVar.f21078g.setVisibility(8);
            cVar.f21077f.removeView(cVar.f21078g);
        }
        ImageView imageView2 = cVar.f21080i;
        if (!(imageView2 == null || imageView2.getParent() == null)) {
            cVar.f21077f.removeView(cVar.f21080i);
            cVar.f21080i.setVisibility(8);
        }
        C8666a c = C8666a.m25135a().mo57969b(cVar.f21088q).mo57973e(cVar.f21076e.getRequestId()).mo57972d(cVar.f21076e.getRequestIdNotice()).mo57971c(cVar.f21076e.getId());
        C8666a a = c.mo57974f(cVar.f21076e.getCreativeId() + "").mo57968a(cVar.f21076e.isBidCampaign());
        String str = cVar.f21088q;
        if (a != null) {
            a.mo57967a("2000069");
            if (C8518b.m24607a().mo57681c()) {
                C8518b.m24607a().mo57679a(a.mo57970b());
            } else {
                C8524c.m24638a(a.mo57970b(), C2350a.m5601e().mo15792g(), str);
            }
        }
        BannerUtils.inserCloseId(cVar.f21088q, cVar.f21090s);
        C8672c cVar2 = cVar.f21074c;
        if (cVar2 != null) {
            cVar2.mo57961e();
        }
    }

    /* renamed from: d */
    static /* synthetic */ void m25255d(C8691c cVar) {
        ImageView imageView;
        if (cVar.f21075d && (imageView = cVar.f21080i) != null && imageView.getVisibility() == 0) {
            cVar.f21080i.setVisibility(8);
            cVar.f21080i.setOnClickListener((View.OnClickListener) null);
            if (cVar.f21077f != null && cVar.f21080i.getParent() != null) {
                cVar.f21077f.removeView(cVar.f21080i);
            }
        }
    }

    /* renamed from: n */
    static /* synthetic */ void m25268n(C8691c cVar) {
        if (cVar.f21078g != null) {
            MBBannerWebView mBBannerWebView = cVar.f21079h;
            if (mBBannerWebView != null) {
                mBBannerWebView.setVisibility(8);
            }
            if (cVar.f21078g.getVisibility() != 0) {
                cVar.f21078g.setVisibility(0);
            }
            if (cVar.f21077f != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(10);
                cVar.f21078g.setScaleType(ImageView.ScaleType.FIT_XY);
                if (cVar.f21078g.getParent() == null) {
                    cVar.f21077f.addView(cVar.f21078g, layoutParams);
                }
                cVar.m25256d(true);
            }
        }
    }
}
