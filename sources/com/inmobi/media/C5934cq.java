package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.JavascriptInterface;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.core.view.ViewCompat;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.C5958cy;
import com.inmobi.media.C5966db;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import com.smaato.sdk.video.vast.model.ErrorCode;
import com.tapjoy.TJAdUnitConstants;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.cq */
/* compiled from: JavaScriptBridge */
public class C5934cq {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f15053a = C5934cq.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C6337q f15054b;

    /* renamed from: c */
    private final int f15055c;

    /* renamed from: d */
    private C5975dd f15056d;

    @JavascriptInterface
    public void cancelSaveContent(String str, String str2) {
    }

    @JavascriptInterface
    public void fireSkip(String str) {
    }

    @JavascriptInterface
    public void log(String str, String str2) {
    }

    @JavascriptInterface
    public void onOrientationChange(String str) {
    }

    @JavascriptInterface
    public void showAlert(String str, String str2) {
    }

    @JavascriptInterface
    public void storePicture(String str, String str2) {
    }

    public C5934cq(C6337q qVar, int i) {
        this.f15054b = qVar;
        this.f15055c = i;
    }

    @JavascriptInterface
    public void open(final String str, final String str2) {
        C6337q qVar = this.f15054b;
        if (qVar != null) {
            if (!qVar.mo35658i()) {
                this.f15054b.mo35616c("open");
                return;
            }
            this.f15054b.mo35659l();
            C6306ji.m18854a().mo35541a(new Runnable() {
                public final void run() {
                    C5934cq.this.f15054b.getLandingPageHandler().mo35547a("open", str, str2);
                }
            });
        }
    }

    @JavascriptInterface
    public void openWithoutTracker(final String str, final String str2) {
        C6337q qVar = this.f15054b;
        if (qVar != null) {
            if (!qVar.mo35658i()) {
                this.f15054b.mo35616c("openWithoutTracker");
            } else {
                C6306ji.m18854a().mo35541a(new Runnable() {
                    public final void run() {
                        C5934cq.this.f15054b.getLandingPageHandler().mo35547a("openWithoutTracker", str, str2);
                    }
                });
            }
        }
    }

    @JavascriptInterface
    public void openEmbedded(final String str, final String str2) {
        C6337q qVar = this.f15054b;
        if (qVar != null) {
            if (!qVar.mo35658i()) {
                this.f15054b.mo35616c("openEmbedded");
                return;
            }
            this.f15054b.mo35659l();
            new Handler(this.f15054b.getContainerContext().getMainLooper()).post(new Runnable() {
                public final void run() {
                    try {
                        C5934cq.this.f15054b.getLandingPageHandler().mo35550d("openEmbedded", str, str2);
                    } catch (Exception unused) {
                        C5934cq.this.f15054b.mo35614b(str, "Unexpected error", "openEmbedded");
                        C6238hu.m18605a((byte) 1, "InMobi", "Failed to open URL; SDK encountered unexpected error");
                        String unused2 = C5934cq.f15053a;
                    }
                }
            });
        }
    }

    @JavascriptInterface
    public void ping(String str, String str2, boolean z) {
        if (this.f15054b != null) {
            if (str2 == null || str2.trim().length() == 0 || !URLUtil.isValidUrl(str2)) {
                this.f15054b.mo35614b(str, "Invalid URL:".concat(String.valueOf(str2)), "ping");
                return;
            }
            try {
                C5874bk.m17607a().mo34847a(str2, z);
            } catch (Exception unused) {
                this.f15054b.mo35614b(str, "Unexpected error", "ping");
                C6238hu.m18605a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
            }
        }
    }

    @JavascriptInterface
    public void pingInWebView(String str, String str2, boolean z) {
        if (this.f15054b != null) {
            if (str2 == null || str2.trim().length() == 0 || !URLUtil.isValidUrl(str2)) {
                this.f15054b.mo35614b(str, "Invalid URL:".concat(String.valueOf(str2)), "pingInWebView");
                return;
            }
            try {
                C5874bk.m17607a().mo34849b(str2, z);
            } catch (Exception unused) {
                this.f15054b.mo35614b(str, "Unexpected error", "pingInWebView");
                C6238hu.m18605a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
            }
        }
    }

    @JavascriptInterface
    public String getPlatformVersion(String str) {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    @JavascriptInterface
    public String getPlatform(String str) {
        C6228hp.m18578d();
        return C6228hp.m18578d();
    }

    @JavascriptInterface
    public void fireAdReady(String str) {
        try {
            C6337q qVar = this.f15054b;
            qVar.f16125w = true;
            if (qVar.getImpressionType() == 0) {
                qVar.mo35657h();
            }
            qVar.getListener().mo34513c(qVar);
        } catch (Exception unused) {
            this.f15054b.mo35614b(str, "Unexpected error", "fireAdReady");
        }
    }

    @JavascriptInterface
    public void fireAdFailed(String str) {
        try {
            this.f15054b.getListener().mo34520d(this.f15054b);
        } catch (Exception unused) {
            this.f15054b.mo35614b(str, "Unexpected error", "fireAdFailed");
        }
    }

    @JavascriptInterface
    public String getDefaultPosition(String str) {
        C6337q qVar = this.f15054b;
        if (qVar == null) {
            return new JSONObject().toString();
        }
        synchronized (qVar.getDefaultPositionMonitor()) {
            this.f15054b.f16112j = true;
            new Handler(this.f15054b.getContainerContext().getMainLooper()).post(new Runnable() {
                public final void run() {
                    try {
                        C5934cq.this.f15054b.mo35619d();
                    } catch (Exception unused) {
                        String unused2 = C5934cq.f15053a;
                    }
                }
            });
            while (this.f15054b.f16112j) {
                try {
                    this.f15054b.getDefaultPositionMonitor().wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        return this.f15054b.getDefaultPosition();
    }

    @JavascriptInterface
    public String getCurrentPosition(String str) {
        C6337q qVar = this.f15054b;
        if (qVar == null) {
            return "";
        }
        synchronized (qVar.getCurrentPositionMonitor()) {
            this.f15054b.f16113k = true;
            new Handler(this.f15054b.getContainerContext().getMainLooper()).post(new Runnable() {
                public final void run() {
                    try {
                        C5934cq.this.f15054b.mo35622e();
                    } catch (Exception unused) {
                        String unused2 = C5934cq.f15053a;
                    }
                }
            });
            while (this.f15054b.f16113k) {
                try {
                    this.f15054b.getCurrentPositionMonitor().wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        return this.f15054b.getCurrentPosition();
    }

    @JavascriptInterface
    public void setExpandProperties(String str, String str2) {
        C6337q qVar = this.f15054b;
        if (qVar != null && !"Expanded".equals(qVar.getState())) {
            try {
                this.f15054b.setExpandProperties(C5957cx.m17808a(str2));
            } catch (Exception unused) {
                this.f15054b.mo35614b(str, "Unexpected error", "setExpandProperties");
            }
        }
    }

    @JavascriptInterface
    public String getExpandProperties(String str) {
        C6337q qVar = this.f15054b;
        if (qVar == null) {
            return "";
        }
        return qVar.getExpandProperties().f15132c;
    }

    @JavascriptInterface
    public void expand(final String str, final String str2) {
        C6337q qVar;
        if (this.f15055c != 1 && (qVar = this.f15054b) != null) {
            if (!qVar.mo35658i()) {
                this.f15054b.mo35616c(MraidJsMethods.EXPAND);
            } else if (!this.f15054b.f16115m) {
                this.f15054b.mo35614b(str, "Creative is not visible. Ignoring request.", MraidJsMethods.EXPAND);
            } else if (str2 == null || str2.length() == 0 || str2.startsWith("http")) {
                if (URLUtil.isValidUrl(str2)) {
                    this.f15054b.mo35659l();
                }
                new Handler(this.f15054b.getContainerContext().getMainLooper()).post(new Runnable() {
                    public final void run() {
                        int i;
                        try {
                            C6337q a = C5934cq.this.f15054b;
                            String str = str2;
                            if ("Default".equals(a.f16106d) || "Resized".equals(a.f16106d)) {
                                a.f16120r = true;
                                C5962cz czVar = a.f16108f;
                                if (czVar.f15152c == null) {
                                    czVar.f15152c = (ViewGroup) czVar.f15150a.getParent();
                                    czVar.f15153d = czVar.f15152c.indexOfChild(czVar.f15150a);
                                }
                                C5957cx expandProperties = czVar.f15150a.getExpandProperties();
                                czVar.f15151b = URLUtil.isValidUrl(str);
                                C6337q qVar = czVar.f15150a;
                                if (czVar.f15151b) {
                                    try {
                                        C6337q qVar2 = new C6337q(czVar.f15150a.getContainerContext(), (byte) 0, (Set<C6002du>) null, czVar.f15150a.getImpressionId(), Boolean.FALSE, "DEFAULT");
                                        qVar2.mo35608a(czVar.f15150a.getListener(), czVar.f15150a.getAdConfig(), false, false);
                                        qVar2.setOriginalRenderView(czVar.f15150a);
                                        qVar2.loadUrl(str);
                                        qVar2.setPlacementId(czVar.f15150a.getPlacementId());
                                        qVar2.setAllowAutoRedirection(czVar.f15150a.getAllowAutoRedirection());
                                        qVar2.setCreativeId(czVar.f15150a.getCreativeId());
                                        i = InMobiAdActivity.m23427a((C6286j) qVar2);
                                        if (expandProperties != null) {
                                            qVar2.setUseCustomClose(czVar.f15150a.f16114l);
                                        }
                                    } catch (Exception e) {
                                        C6181gg.m18398a().mo35357a(new C6217hg(e));
                                        czVar.f15150a.getListener().mo34532g(czVar.f15150a);
                                    }
                                } else {
                                    qVar.setShouldFireRenderBeacon(false);
                                    ViewGroup viewGroup = czVar.f15152c;
                                    FrameLayout frameLayout = new FrameLayout(czVar.f15150a.getContainerContext());
                                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(czVar.f15150a.getWidth(), czVar.f15150a.getHeight());
                                    frameLayout.setId(C6248i.f15812a);
                                    viewGroup.addView(frameLayout, czVar.f15153d, layoutParams);
                                    viewGroup.removeView(czVar.f15150a);
                                    i = InMobiAdActivity.m23427a((C6286j) czVar.f15150a);
                                }
                                czVar.f15150a.getListener().mo35589d_();
                                Intent intent = new Intent(czVar.f15150a.getContainerContext(), InMobiAdActivity.class);
                                intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 102);
                                intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", i);
                                if (czVar.f15154e.equals("htmlUrl")) {
                                    intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", ErrorCode.DIFFERENT_DURATION_EXPECTED_ERROR);
                                } else {
                                    intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", 200);
                                }
                                C6227ho.m18540a(czVar.f15150a.getContainerContext(), intent);
                                a.requestLayout();
                                a.invalidate();
                                a.setFocusable(true);
                                a.setFocusableInTouchMode(true);
                                a.requestFocus();
                            }
                        } catch (Exception unused) {
                            C5934cq.this.f15054b.mo35614b(str, "Unexpected error", MraidJsMethods.EXPAND);
                            C6238hu.m18605a((byte) 1, "InMobi", "Failed to expand ad; SDK encountered an unexpected error");
                            String unused2 = C5934cq.f15053a;
                        }
                    }
                });
            } else {
                this.f15054b.mo35614b(str, "Invalid URL", MraidJsMethods.EXPAND);
            }
        }
    }

    @JavascriptInterface
    public void customExpand(String str, String str2, int i, float f, boolean z, boolean z2) {
        C6337q qVar;
        if (this.f15055c != 1 || (qVar = this.f15054b) == null) {
            return;
        }
        if (str2 == null) {
            qVar.mo35614b(str, "Invalid expandInput", "customExpand");
        } else if (i < 0 || i >= C6360v.values().length) {
            this.f15054b.mo35614b(str, "Invalid inputType", "customExpand");
        } else if (f < 0.0f || f > 1.0f) {
            this.f15054b.mo35614b(str, "Invalid screenPercentage", "customExpand");
        } else {
            C6306ji.m18854a().mo35541a(new Runnable(str2, i, str, f, z2) {
                public final /* synthetic */ String f$1;
                public final /* synthetic */ int f$2;
                public final /* synthetic */ String f$3;
                public final /* synthetic */ float f$4;
                public final /* synthetic */ boolean f$5;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                    this.f$5 = r6;
                }

                public final void run() {
                    C5934cq.this.m17740a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0085 A[Catch:{ Exception -> 0x00a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008f A[Catch:{ Exception -> 0x00a3 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void m17740a(java.lang.String r10, int r11, java.lang.String r12, float r13, boolean r14) {
        /*
            r9 = this;
            java.lang.String r0 = "customExpand"
            r1 = 1
            com.inmobi.media.q r2 = r9.f15054b     // Catch:{ Exception -> 0x00a3 }
            com.inmobi.media.w r2 = r2.getEmbeddedBrowserJSCallbacks()     // Catch:{ Exception -> 0x00a3 }
            if (r2 != 0) goto L_0x000c
            return
        L_0x000c:
            com.inmobi.media.v[] r2 = com.inmobi.media.C6360v.values()     // Catch:{ Exception -> 0x00a3 }
            r11 = r2[r11]     // Catch:{ Exception -> 0x00a3 }
            com.inmobi.media.v r2 = com.inmobi.media.C6360v.URL     // Catch:{ Exception -> 0x00a3 }
            if (r11 != r2) goto L_0x0099
            com.inmobi.media.q r2 = r9.f15054b     // Catch:{ Exception -> 0x00a3 }
            com.inmobi.media.m r2 = r2.getLandingPageHandler()     // Catch:{ Exception -> 0x00a3 }
            r3 = 4
            r4 = 3
            r5 = 2
            if (r10 == 0) goto L_0x007f
            boolean r6 = r10.isEmpty()     // Catch:{ Exception -> 0x00a3 }
            if (r6 == 0) goto L_0x0028
            goto L_0x007f
        L_0x0028:
            android.net.Uri r6 = android.net.Uri.parse(r10)     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r7 = r6.getScheme()     // Catch:{ Exception -> 0x00a3 }
            if (r7 == 0) goto L_0x007b
            boolean r8 = r7.isEmpty()     // Catch:{ Exception -> 0x00a3 }
            if (r8 == 0) goto L_0x0039
            goto L_0x007b
        L_0x0039:
            java.lang.String r8 = "inmobinativebrowser"
            boolean r8 = r7.equals(r8)     // Catch:{ Exception -> 0x00a3 }
            if (r8 == 0) goto L_0x0046
            r2.mo35548b(r0, r12, r10)     // Catch:{ Exception -> 0x00a3 }
        L_0x0044:
            r3 = r5
            goto L_0x0083
        L_0x0046:
            java.lang.String r8 = "inmobideeplink"
            boolean r7 = r7.equals(r8)     // Catch:{ Exception -> 0x00a3 }
            if (r7 == 0) goto L_0x0055
            boolean r2 = r2.mo35549c(r0, r12, r10)     // Catch:{ Exception -> 0x00a3 }
            if (r2 == 0) goto L_0x0083
            goto L_0x0044
        L_0x0055:
            com.inmobi.media.C6223hk.m18526a()     // Catch:{ Exception -> 0x00a3 }
            android.content.Context r7 = r2.f15976b     // Catch:{ Exception -> 0x00a3 }
            boolean r7 = com.inmobi.media.C6223hk.m18528a(r7, r10)     // Catch:{ Exception -> 0x00a3 }
            if (r7 == 0) goto L_0x0064
            r2.mo35551e(r0, r12, r10)     // Catch:{ Exception -> 0x00a3 }
            goto L_0x0044
        L_0x0064:
            boolean r6 = com.inmobi.media.C6236hs.m18598a((android.net.Uri) r6)     // Catch:{ Exception -> 0x00a3 }
            if (r6 == 0) goto L_0x006c
            r3 = r4
            goto L_0x0083
        L_0x006c:
            com.inmobi.media.C6224hl.m18530a()     // Catch:{ Exception -> 0x00a3 }
            android.content.Context r6 = r2.f15976b     // Catch:{ Exception -> 0x00a3 }
            boolean r6 = com.inmobi.media.C6224hl.m18531a(r6, r10)     // Catch:{ Exception -> 0x00a3 }
            if (r6 == 0) goto L_0x0083
            r2.mo35551e(r0, r12, r10)     // Catch:{ Exception -> 0x00a3 }
            goto L_0x0044
        L_0x007b:
            r2.mo35544a(r0, r12)     // Catch:{ Exception -> 0x00a3 }
            goto L_0x0082
        L_0x007f:
            r2.mo35544a(r0, r12)     // Catch:{ Exception -> 0x00a3 }
        L_0x0082:
            r3 = r1
        L_0x0083:
            if (r3 != r4) goto L_0x008f
            com.inmobi.media.q r2 = r9.f15054b     // Catch:{ Exception -> 0x00a3 }
            com.inmobi.media.w r2 = r2.getEmbeddedBrowserJSCallbacks()     // Catch:{ Exception -> 0x00a3 }
            r2.mo35037a(r10, r11, r13, r14)     // Catch:{ Exception -> 0x00a3 }
            return
        L_0x008f:
            com.inmobi.media.q r10 = r9.f15054b     // Catch:{ Exception -> 0x00a3 }
            com.inmobi.media.w r10 = r10.getEmbeddedBrowserJSCallbacks()     // Catch:{ Exception -> 0x00a3 }
            r10.mo35036a()     // Catch:{ Exception -> 0x00a3 }
            return
        L_0x0099:
            com.inmobi.media.q r2 = r9.f15054b     // Catch:{ Exception -> 0x00a3 }
            com.inmobi.media.w r2 = r2.getEmbeddedBrowserJSCallbacks()     // Catch:{ Exception -> 0x00a3 }
            r2.mo35037a(r10, r11, r13, r14)     // Catch:{ Exception -> 0x00a3 }
            return
        L_0x00a3:
            com.inmobi.media.q r10 = r9.f15054b
            java.lang.String r11 = "Unexpected error"
            r10.mo35614b(r12, r11, r0)
            java.lang.String r10 = "InMobi"
            java.lang.String r11 = "Failed to custom expand ad; SDK encountered an unexpected error"
            com.inmobi.media.C6238hu.m18605a((byte) r1, (java.lang.String) r10, (java.lang.String) r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5934cq.m17740a(java.lang.String, int, java.lang.String, float, boolean):void");
    }

    @JavascriptInterface
    public void closeCustomExpand(String str) {
        if (this.f15055c == 1 && this.f15054b != null) {
            C6306ji.m18854a().mo35541a(new Runnable() {
                public final void run() {
                    C5934cq.this.m17741b();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m17741b() {
        if (this.f15054b.getEmbeddedBrowserJSCallbacks() != null) {
            this.f15054b.getEmbeddedBrowserJSCallbacks().mo35036a();
        }
    }

    @JavascriptInterface
    public String getVersion(String str) {
        C6228hp.m18577c();
        return C6228hp.m18577c();
    }

    @JavascriptInterface
    public void setResizeProperties(String str, String str2) {
        C6337q qVar = this.f15054b;
        if (qVar != null) {
            C5976de a = C5976de.m17845a(str2, qVar.getResizeProperties());
            if (a == null) {
                this.f15054b.mo35614b(str, "setResizeProperties", "All mandatory fields are not present");
            }
            this.f15054b.setResizeProperties(a);
        }
    }

    @JavascriptInterface
    public String getResizeProperties(String str) {
        C5976de resizeProperties;
        JSONObject a;
        C6337q qVar = this.f15054b;
        if (qVar == null || (resizeProperties = qVar.getResizeProperties()) == null || (a = new C6262ij().mo35468a(resizeProperties)) == null) {
            return "";
        }
        return a.toString();
    }

    @JavascriptInterface
    public void resize(final String str) {
        if (this.f15055c != 1 && this.f15054b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    try {
                        C6337q a = C5934cq.this.f15054b;
                        if (!"Default".equals(a.f16106d)) {
                            if (!"Resized".equals(a.f16106d)) {
                                return;
                            }
                        }
                        if (a.getResizeProperties() != null) {
                            a.f16120r = true;
                            a.f16109g.mo35077a();
                            a.requestLayout();
                            a.invalidate();
                            a.setFocusable(true);
                            a.setFocusableInTouchMode(true);
                            a.requestFocus();
                            a.setAndUpdateViewState("Resized");
                            a.getListener().mo34610a_(a);
                            a.f16120r = false;
                        }
                    } catch (Exception unused) {
                        C5934cq.this.f15054b.mo35614b(str, "Unexpected error", MraidJsMethods.RESIZE);
                        C6238hu.m18605a((byte) 1, C5934cq.f15053a, "Could not resize ad; SDK encountered an unexpected error");
                        String unused2 = C5934cq.f15053a;
                    }
                }
            });
        }
    }

    @JavascriptInterface
    public void setOrientationProperties(String str, String str2) {
        C6306ji.m18854a().mo35541a(new Runnable(str2) {
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C5934cq.this.m17739a(this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m17739a(String str) {
        C5975dd orientationProperties = this.f15054b.getOrientationProperties();
        if (orientationProperties != null) {
            C5975dd a = C5975dd.m17844a(str, orientationProperties);
            this.f15056d = a;
            this.f15054b.setOrientationProperties(a);
        }
    }

    @JavascriptInterface
    public String getOrientationProperties(String str) {
        return this.f15056d.f15187d;
    }

    @JavascriptInterface
    public boolean isViewable(String str) {
        C6337q qVar = this.f15054b;
        if (qVar == null) {
            return false;
        }
        return qVar.f16115m;
    }

    @JavascriptInterface
    public void useCustomClose(final String str, final boolean z) {
        new Handler(this.f15054b.getContainerContext().getMainLooper()).post(new Runnable() {
            public final void run() {
                try {
                    C5934cq.this.f15054b.mo35618c(z);
                } catch (Exception unused) {
                    C5934cq.this.f15054b.mo35614b(str, "Unexpected error", "useCustomClose");
                    String unused2 = C5934cq.f15053a;
                }
            }
        });
    }

    @JavascriptInterface
    public void playVideo(final String str, final String str2) {
        if (this.f15054b != null) {
            if (str2 == null || str2.trim().length() == 0 || !str2.startsWith("http") || (!str2.endsWith("mp4") && !str2.endsWith("avi") && !str2.endsWith("m4v"))) {
                this.f15054b.mo35614b(str, "Null or empty or invalid media playback URL supplied", MraidJsMethods.PLAY_VIDEO);
            } else {
                new Handler(this.f15054b.getContainerContext().getMainLooper()).post(new Runnable() {
                    public final void run() {
                        try {
                            C6337q a = C5934cq.this.f15054b;
                            String str = str;
                            String trim = str2.trim();
                            if (1 == a.f16107e || "Expanded".equals(a.getViewState())) {
                                if (a.f16104b != null) {
                                    if (a.f16104b.get() != null) {
                                        C5966db dbVar = a.f16110h;
                                        Activity activity = (Activity) a.f16104b.get();
                                        dbVar.f15164b = new C5958cy(activity);
                                        C5958cy cyVar = dbVar.f15164b;
                                        cyVar.f15142h = C5958cy.m17811a(trim);
                                        cyVar.f15141g = "anonymous";
                                        if (cyVar.f15136b == null) {
                                            cyVar.f15136b = Bitmap.createBitmap(24, 24, Bitmap.Config.ARGB_8888);
                                            cyVar.f15136b = C5958cy.m17812b(cyVar.f15142h);
                                        }
                                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                                        layoutParams.addRule(13);
                                        dbVar.f15164b.setLayoutParams(layoutParams);
                                        RelativeLayout relativeLayout = new RelativeLayout(activity);
                                        relativeLayout.setOnTouchListener(new View.OnTouchListener() {
                                            public final boolean onTouch(View view, MotionEvent motionEvent) {
                                                return true;
                                            }
                                        });
                                        relativeLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                                        relativeLayout.addView(dbVar.f15164b);
                                        ((ViewGroup) activity.findViewById(16908290)).addView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
                                        dbVar.f15164b.f15137c = relativeLayout;
                                        dbVar.f15164b.requestFocus();
                                        dbVar.f15164b.setOnKeyListener(new View.OnKeyListener() {
                                            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                                                if (4 != i || keyEvent.getAction() != 0) {
                                                    return false;
                                                }
                                                C5966db.this.f15164b.mo35044a();
                                                return true;
                                            }
                                        });
                                        dbVar.f15164b.f15138d = new C5958cy.C5961b() {
                                            /* renamed from: a */
                                            public final void mo35067a(C5958cy cyVar) {
                                                String unused = C5966db.f15162f;
                                                ViewGroup viewGroup = cyVar.f15137c;
                                                if (viewGroup != null) {
                                                    ((ViewGroup) viewGroup.getParent()).removeView(viewGroup);
                                                }
                                                cyVar.f15137c = null;
                                            }

                                            /* renamed from: a */
                                            public final void mo35066a() {
                                                String unused = C5966db.f15162f;
                                            }
                                        };
                                        C5958cy cyVar2 = dbVar.f15164b;
                                        cyVar2.setVideoPath(cyVar2.f15142h);
                                        cyVar2.setOnCompletionListener(cyVar2);
                                        cyVar2.setOnPreparedListener(cyVar2);
                                        cyVar2.setOnErrorListener(cyVar2);
                                        if (cyVar2.f15135a == null && Build.VERSION.SDK_INT >= 19) {
                                            cyVar2.f15135a = new C5958cy.C5960a(cyVar2.getContext());
                                            cyVar2.f15135a.setAnchorView(cyVar2);
                                            cyVar2.setMediaController(cyVar2.f15135a);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                a.mo35614b(str, "Media playback is  not allowed before it is visible! Ignoring request ...", MraidJsMethods.PLAY_VIDEO);
                            }
                        } catch (Exception unused) {
                            C5934cq.this.f15054b.mo35614b(str, "Unexpected error", MraidJsMethods.PLAY_VIDEO);
                            C6238hu.m18605a((byte) 1, "InMobi", "Error playing video; SDK encountered an unexpected error");
                            String unused2 = C5934cq.f15053a;
                        }
                    }
                });
            }
        }
    }

    @JavascriptInterface
    public String getState(String str) {
        return this.f15054b.getState().toLowerCase(Locale.ENGLISH);
    }

    @JavascriptInterface
    public String getScreenSize(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("width", C6252ic.m18655a().f15838a);
            jSONObject.put("height", C6252ic.m18655a().f15839b);
        } catch (JSONException unused) {
        } catch (Exception unused2) {
            this.f15054b.mo35614b(str, "Unexpected error", "getScreenSize");
        }
        return jSONObject.toString();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0064 */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getMaxSize(java.lang.String r7) {
        /*
            r6 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            com.inmobi.media.q r1 = r6.f15054b     // Catch:{ Exception -> 0x007e }
            android.app.Activity r1 = r1.getFullScreenActivity()     // Catch:{ Exception -> 0x007e }
            if (r1 != 0) goto L_0x0024
            com.inmobi.media.q r1 = r6.f15054b     // Catch:{ Exception -> 0x007e }
            android.content.Context r1 = r1.getContainerContext()     // Catch:{ Exception -> 0x007e }
            boolean r1 = r1 instanceof android.app.Activity     // Catch:{ Exception -> 0x007e }
            if (r1 != 0) goto L_0x001c
            java.lang.String r7 = r6.getScreenSize(r7)     // Catch:{ Exception -> 0x007e }
            return r7
        L_0x001c:
            com.inmobi.media.q r1 = r6.f15054b     // Catch:{ Exception -> 0x007e }
            android.content.Context r1 = r1.getContainerContext()     // Catch:{ Exception -> 0x007e }
            android.app.Activity r1 = (android.app.Activity) r1     // Catch:{ Exception -> 0x007e }
        L_0x0024:
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r1.findViewById(r2)     // Catch:{ Exception -> 0x007e }
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1     // Catch:{ Exception -> 0x007e }
            int r2 = r1.getWidth()     // Catch:{ Exception -> 0x007e }
            int r2 = com.inmobi.media.C6252ic.m18660b((int) r2)     // Catch:{ Exception -> 0x007e }
            int r3 = r1.getHeight()     // Catch:{ Exception -> 0x007e }
            int r3 = com.inmobi.media.C6252ic.m18660b((int) r3)     // Catch:{ Exception -> 0x007e }
            com.inmobi.media.q r4 = r6.f15054b     // Catch:{ Exception -> 0x007e }
            android.app.Activity r4 = r4.getFullScreenActivity()     // Catch:{ Exception -> 0x007e }
            if (r4 == 0) goto L_0x0073
            if (r2 == 0) goto L_0x0049
            if (r3 != 0) goto L_0x0073
        L_0x0049:
            com.inmobi.media.cq$a r2 = new com.inmobi.media.cq$a     // Catch:{ Exception -> 0x007e }
            r2.<init>(r1)     // Catch:{ Exception -> 0x007e }
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()     // Catch:{ Exception -> 0x007e }
            r1.addOnGlobalLayoutListener(r2)     // Catch:{ Exception -> 0x007e }
            java.lang.Boolean r1 = r2.f15090d     // Catch:{ Exception -> 0x007e }
            monitor-enter(r1)     // Catch:{ Exception -> 0x007e }
            java.lang.Boolean r3 = r2.f15090d     // Catch:{ InterruptedException -> 0x0064 }
            r3.wait()     // Catch:{ InterruptedException -> 0x0064 }
            goto L_0x0064
        L_0x0062:
            r2 = move-exception
            goto L_0x0071
        L_0x0064:
            int r3 = r2.f15087a     // Catch:{ all -> 0x0062 }
            int r2 = r2.f15088b     // Catch:{ all -> 0x0062 }
            monitor-exit(r1)     // Catch:{ all -> 0x0062 }
            r5 = r3
            r3 = r2
            r2 = r5
            goto L_0x0073
        L_0x0071:
            monitor-exit(r1)     // Catch:{ all -> 0x0062 }
            throw r2     // Catch:{ Exception -> 0x007e }
        L_0x0073:
            java.lang.String r1 = "width"
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0087 }
            java.lang.String r1 = "height"
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x0087 }
            goto L_0x0087
        L_0x007e:
            com.inmobi.media.q r1 = r6.f15054b
            java.lang.String r2 = "Unexpected error"
            java.lang.String r3 = "getMaxSize"
            r1.mo35614b(r7, r2, r3)
        L_0x0087:
            java.lang.String r7 = r0.toString()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5934cq.getMaxSize(java.lang.String):java.lang.String");
    }

    /* renamed from: com.inmobi.media.cq$a */
    /* compiled from: JavaScriptBridge */
    static class C5947a implements ViewTreeObserver.OnGlobalLayoutListener {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f15087a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f15088b;

        /* renamed from: c */
        private View f15089c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final Boolean f15090d = Boolean.FALSE;

        C5947a(View view) {
            this.f15089c = view;
        }

        public final void onGlobalLayout() {
            try {
                this.f15087a = C6252ic.m18660b(this.f15089c.getWidth());
                this.f15088b = C6252ic.m18660b(this.f15089c.getHeight());
                if (Build.VERSION.SDK_INT >= 16) {
                    this.f15089c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                } else {
                    this.f15089c.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }
                synchronized (this.f15090d) {
                    this.f15090d.notify();
                }
            } catch (Exception unused) {
                String unused2 = C5934cq.f15053a;
            }
        }
    }

    @JavascriptInterface
    public void close(final String str) {
        new Handler(this.f15054b.getContainerContext().getMainLooper()).post(new Runnable() {
            public final void run() {
                try {
                    C5934cq.this.f15054b.getReferenceContainer().mo35499b();
                } catch (Exception unused) {
                    C5934cq.this.f15054b.mo35614b(str, "Unexpected error", "close");
                    C6238hu.m18605a((byte) 1, "InMobi", "Failed to close ad; SDK encountered an unexpected error");
                    String unused2 = C5934cq.f15053a;
                }
            }
        });
    }

    @JavascriptInterface
    public String getPlacementType(String str) {
        return 1 == this.f15055c ? "interstitial" : TJAdUnitConstants.String.INLINE;
    }

    @JavascriptInterface
    public String getSdkVersion(String str) {
        C6228hp.m18574b();
        return C6228hp.m18574b();
    }

    @JavascriptInterface
    public String supports(String str, String str2) {
        return String.valueOf(this.f15054b.mo35623e(str2));
    }

    @JavascriptInterface
    public void openExternal(String str, String str2, String str3) {
        C6337q qVar = this.f15054b;
        if (qVar != null) {
            if (!qVar.mo35658i()) {
                this.f15054b.mo35616c("openExternal");
                return;
            }
            this.f15054b.mo35659l();
            C6317m landingPageHandler = this.f15054b.getLandingPageHandler();
            if (str2 != null) {
                landingPageHandler.mo35545a("openExternal", str, str2, str3);
            } else if (str3 != null) {
                landingPageHandler.mo35545a("openExternal", str, str3, (String) null);
            } else {
                landingPageHandler.f15975a.mo35431a(str, "Empty url and fallback url", "openExternal");
            }
        }
    }

    @JavascriptInterface
    public void asyncPing(String str, String str2) {
        if (!URLUtil.isValidUrl(str2)) {
            this.f15054b.mo35614b(str, "Invalid url", "asyncPing");
            return;
        }
        try {
            final C6206gx gxVar = new C6206gx(ShareTarget.METHOD_GET, str2);
            gxVar.f15720t = false;
            gxVar.f15715o = false;
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            new Thread(new Runnable() {
                public final void run() {
                    try {
                        C6207gy a = new C6204gv(C6197gr.this.f15684b).mo35383a();
                        if (a.mo35396a()) {
                            C6197gr.this.f15685c.mo35011a();
                        } else {
                            C6197gr.this.f15685c.mo35012a(a);
                        }
                    } catch (Exception unused) {
                        String unused2 = C6197gr.f15683a;
                        new C6207gy().f15722a = new C6205gw(-1, "Network request failed with unknown error");
                        C6197gr.this.f15685c.mo35011a();
                    }
                }
            }).start();
        } catch (Exception unused) {
            this.f15054b.mo35614b(str, "Unexpected error", "asyncPing");
        }
    }

    @JavascriptInterface
    public void disableCloseRegion(final String str, final boolean z) {
        if (this.f15054b != null) {
            new Handler(this.f15054b.getContainerContext().getMainLooper()).post(new Runnable() {
                public final void run() {
                    try {
                        C5934cq.this.f15054b.mo35615b(z);
                    } catch (Exception unused) {
                        C5934cq.this.f15054b.mo35614b(str, "Unexpected error", "disableCloseRegion");
                        String unused2 = C5934cq.f15053a;
                    }
                }
            });
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:22|23|24) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:25|26|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r6.f15054b.mo35614b(r7, "Unexpected error", "onUserInteraction");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r6.f15054b.getListener().mo34488a(new java.util.HashMap());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006c, code lost:
        r6.f15054b.mo35614b(r7, "Unexpected error", "onUserInteraction");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0071, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0057 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005d */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUserInteraction(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            com.inmobi.media.q r0 = r6.f15054b
            java.lang.String r1 = "onUserInteraction"
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.mo35658i()
            if (r0 != 0) goto L_0x0012
            com.inmobi.media.q r7 = r6.f15054b
            r7.mo35616c((java.lang.String) r1)
            return
        L_0x0012:
            java.lang.String r0 = "Unexpected error"
            if (r8 != 0) goto L_0x002b
            com.inmobi.media.q r8 = r6.f15054b     // Catch:{ Exception -> 0x0025 }
            com.inmobi.media.s r8 = r8.getListener()     // Catch:{ Exception -> 0x0025 }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ Exception -> 0x0025 }
            r2.<init>()     // Catch:{ Exception -> 0x0025 }
            r8.mo34488a(r2)     // Catch:{ Exception -> 0x0025 }
            return
        L_0x0025:
            com.inmobi.media.q r8 = r6.f15054b
            r8.mo35614b(r7, r0, r1)
            return
        L_0x002b:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x005d }
            r2.<init>(r8)     // Catch:{ JSONException -> 0x005d }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ JSONException -> 0x005d }
            r8.<init>()     // Catch:{ JSONException -> 0x005d }
            java.util.Iterator r3 = r2.keys()     // Catch:{ JSONException -> 0x005d }
        L_0x0039:
            boolean r4 = r3.hasNext()     // Catch:{ JSONException -> 0x005d }
            if (r4 == 0) goto L_0x004d
            java.lang.Object r4 = r3.next()     // Catch:{ JSONException -> 0x005d }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ JSONException -> 0x005d }
            java.lang.Object r5 = r2.get(r4)     // Catch:{ JSONException -> 0x005d }
            r8.put(r4, r5)     // Catch:{ JSONException -> 0x005d }
            goto L_0x0039
        L_0x004d:
            com.inmobi.media.q r2 = r6.f15054b     // Catch:{ Exception -> 0x0057 }
            com.inmobi.media.s r2 = r2.getListener()     // Catch:{ Exception -> 0x0057 }
            r2.mo34488a(r8)     // Catch:{ Exception -> 0x0057 }
            return
        L_0x0057:
            com.inmobi.media.q r8 = r6.f15054b     // Catch:{ JSONException -> 0x005d }
            r8.mo35614b(r7, r0, r1)     // Catch:{ JSONException -> 0x005d }
            return
        L_0x005d:
            com.inmobi.media.q r8 = r6.f15054b     // Catch:{ Exception -> 0x006c }
            com.inmobi.media.s r8 = r8.getListener()     // Catch:{ Exception -> 0x006c }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ Exception -> 0x006c }
            r2.<init>()     // Catch:{ Exception -> 0x006c }
            r8.mo34488a(r2)     // Catch:{ Exception -> 0x006c }
            return
        L_0x006c:
            com.inmobi.media.q r8 = r6.f15054b
            r8.mo35614b(r7, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5934cq.onUserInteraction(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:16|17|18) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:19|20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r6.f15054b.mo35614b(r7, "Unexpected error", "incentCompleted");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r6.f15054b.getListener().mo34503b(new java.util.HashMap());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        r6.f15054b.mo35614b(r7, "Unexpected error", "incentCompleted");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0047 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void incentCompleted(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r0 = "incentCompleted"
            java.lang.String r1 = "Unexpected error"
            if (r8 != 0) goto L_0x001b
            com.inmobi.media.q r8 = r6.f15054b     // Catch:{ Exception -> 0x0015 }
            com.inmobi.media.s r8 = r8.getListener()     // Catch:{ Exception -> 0x0015 }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ Exception -> 0x0015 }
            r2.<init>()     // Catch:{ Exception -> 0x0015 }
            r8.mo34503b(r2)     // Catch:{ Exception -> 0x0015 }
            return
        L_0x0015:
            com.inmobi.media.q r8 = r6.f15054b
            r8.mo35614b(r7, r1, r0)
            return
        L_0x001b:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x004d }
            r2.<init>(r8)     // Catch:{ JSONException -> 0x004d }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ JSONException -> 0x004d }
            r8.<init>()     // Catch:{ JSONException -> 0x004d }
            java.util.Iterator r3 = r2.keys()     // Catch:{ JSONException -> 0x004d }
        L_0x0029:
            boolean r4 = r3.hasNext()     // Catch:{ JSONException -> 0x004d }
            if (r4 == 0) goto L_0x003d
            java.lang.Object r4 = r3.next()     // Catch:{ JSONException -> 0x004d }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ JSONException -> 0x004d }
            java.lang.Object r5 = r2.get(r4)     // Catch:{ JSONException -> 0x004d }
            r8.put(r4, r5)     // Catch:{ JSONException -> 0x004d }
            goto L_0x0029
        L_0x003d:
            com.inmobi.media.q r2 = r6.f15054b     // Catch:{ Exception -> 0x0047 }
            com.inmobi.media.s r2 = r2.getListener()     // Catch:{ Exception -> 0x0047 }
            r2.mo34503b(r8)     // Catch:{ Exception -> 0x0047 }
            return
        L_0x0047:
            com.inmobi.media.q r8 = r6.f15054b     // Catch:{ JSONException -> 0x004d }
            r8.mo35614b(r7, r1, r0)     // Catch:{ JSONException -> 0x004d }
            return
        L_0x004d:
            com.inmobi.media.q r8 = r6.f15054b     // Catch:{ Exception -> 0x005c }
            com.inmobi.media.s r8 = r8.getListener()     // Catch:{ Exception -> 0x005c }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ Exception -> 0x005c }
            r2.<init>()     // Catch:{ Exception -> 0x005c }
            r8.mo34503b(r2)     // Catch:{ Exception -> 0x005c }
            return
        L_0x005c:
            com.inmobi.media.q r8 = r6.f15054b
            r8.mo35614b(r7, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5934cq.incentCompleted(java.lang.String, java.lang.String):void");
    }

    @JavascriptInterface
    public String getOrientation(String str) {
        byte b = C6252ic.m18659b();
        if (b == 1) {
            return "0";
        }
        if (b == 3) {
            return "90";
        }
        if (b == 2) {
            return "180";
        }
        return b == 4 ? "270" : "-1";
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:10|11|12|13|14|15) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0037 */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void saveContent(java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            r10 = this;
            java.lang.String r0 = "saveContent"
            java.lang.String r1 = ""
            java.lang.String r2 = "\");"
            java.lang.String r3 = "\", 'failed', \""
            java.lang.String r4 = "reason"
            java.lang.String r5 = "sendSaveContentResult(\"saveContent_"
            java.lang.String r6 = "\\\""
            java.lang.String r7 = "\""
            java.lang.String r8 = "url"
            if (r12 == 0) goto L_0x008e
            int r9 = r12.length()
            if (r9 == 0) goto L_0x008e
            if (r13 == 0) goto L_0x008e
            int r9 = r13.length()
            if (r9 != 0) goto L_0x0023
            goto L_0x008e
        L_0x0023:
            com.inmobi.media.q r1 = r10.f15054b     // Catch:{ Exception -> 0x0086 }
            boolean r9 = r1.mo35623e((java.lang.String) r0)     // Catch:{ Exception -> 0x0086 }
            if (r9 != 0) goto L_0x0058
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Exception -> 0x0086 }
            r9.<init>()     // Catch:{ Exception -> 0x0086 }
            r9.put(r8, r13)     // Catch:{ JSONException -> 0x0037 }
            r13 = 7
            r9.put(r4, r13)     // Catch:{ JSONException -> 0x0037 }
        L_0x0037:
            java.lang.String r13 = r9.toString()     // Catch:{ Exception -> 0x0086 }
            java.lang.String r13 = r13.replace(r7, r6)     // Catch:{ Exception -> 0x0086 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0086 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0086 }
            r4.append(r12)     // Catch:{ Exception -> 0x0086 }
            r4.append(r3)     // Catch:{ Exception -> 0x0086 }
            r4.append(r13)     // Catch:{ Exception -> 0x0086 }
            r4.append(r2)     // Catch:{ Exception -> 0x0086 }
            java.lang.String r12 = r4.toString()     // Catch:{ Exception -> 0x0086 }
            r1.mo35611a((java.lang.String) r11, (java.lang.String) r12)     // Catch:{ Exception -> 0x0086 }
            return
        L_0x0058:
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ Exception -> 0x0086 }
            r2.<init>()     // Catch:{ Exception -> 0x0086 }
            com.inmobi.media.bn r3 = new com.inmobi.media.bn     // Catch:{ Exception -> 0x0086 }
            r4 = -1
            r3.<init>(r4, r13)     // Catch:{ Exception -> 0x0086 }
            r2.add(r3)     // Catch:{ Exception -> 0x0086 }
            com.inmobi.media.aw r13 = new com.inmobi.media.aw     // Catch:{ Exception -> 0x0086 }
            java.util.UUID r3 = java.util.UUID.randomUUID()     // Catch:{ Exception -> 0x0086 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0086 }
            com.inmobi.media.bh r1 = r1.f16127y     // Catch:{ Exception -> 0x0086 }
            r13.<init>((java.lang.String) r3, (java.util.Set<com.inmobi.media.C5895bn>) r2, (com.inmobi.media.C5871bh) r1, (java.lang.String) r12)     // Catch:{ Exception -> 0x0086 }
            r13.f14737f = r11     // Catch:{ Exception -> 0x0086 }
            com.inmobi.media.bg r12 = com.inmobi.media.C5861bg.m17544a()     // Catch:{ Exception -> 0x0086 }
            java.util.concurrent.ExecutorService r1 = r12.f14790a     // Catch:{ Exception -> 0x0086 }
            com.inmobi.media.bg$3 r2 = new com.inmobi.media.bg$3     // Catch:{ Exception -> 0x0086 }
            r2.<init>(r13)     // Catch:{ Exception -> 0x0086 }
            r1.execute(r2)     // Catch:{ Exception -> 0x0086 }
            return
        L_0x0086:
            com.inmobi.media.q r12 = r10.f15054b
            java.lang.String r13 = "Unexpected error"
            r12.mo35614b(r11, r13, r0)
            return
        L_0x008e:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            if (r13 != 0) goto L_0x0096
            r13 = r1
        L_0x0096:
            r0.put(r8, r13)     // Catch:{ JSONException -> 0x009e }
            r13 = 8
            r0.put(r4, r13)     // Catch:{ JSONException -> 0x009e }
        L_0x009e:
            java.lang.String r13 = r0.toString()
            java.lang.String r13 = r13.replace(r7, r6)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            if (r12 != 0) goto L_0x00ae
            r12 = r1
        L_0x00ae:
            r0.append(r12)
            r0.append(r3)
            r0.append(r13)
            r0.append(r2)
            java.lang.String r12 = r0.toString()
            com.inmobi.media.q r13 = r10.f15054b
            r13.mo35611a((java.lang.String) r11, (java.lang.String) r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5934cq.saveContent(java.lang.String, java.lang.String, java.lang.String):void");
    }

    @JavascriptInterface
    public String isDeviceMuted(String str) {
        C6337q qVar = this.f15054b;
        if (qVar == null) {
            return "false";
        }
        boolean z = false;
        try {
            qVar.getMediaProcessor();
            z = C5966db.m17827a();
        } catch (Exception unused) {
        }
        return String.valueOf(z);
    }

    @JavascriptInterface
    public String isHeadphonePlugged(String str) {
        C6337q qVar = this.f15054b;
        if (qVar == null) {
            return "false";
        }
        boolean z = false;
        try {
            qVar.getMediaProcessor();
            z = C5966db.m17829d();
        } catch (Exception unused) {
        }
        return String.valueOf(z);
    }

    @JavascriptInterface
    public void registerDeviceMuteEventListener(String str) {
        C6337q qVar = this.f15054b;
        if (qVar != null) {
            try {
                C5966db mediaProcessor = qVar.getMediaProcessor();
                Context c = C6227ho.m18551c();
                if (c != null && mediaProcessor.f15165c == null) {
                    mediaProcessor.f15165c = new C5966db.C5971b(str);
                    c.registerReceiver(mediaProcessor.f15165c, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
                }
            } catch (Exception unused) {
                this.f15054b.mo35614b(str, "Unexpected error", "registerDeviceMuteEventListener");
            }
        }
    }

    @JavascriptInterface
    public void unregisterDeviceMuteEventListener(String str) {
        C6337q qVar = this.f15054b;
        if (qVar != null) {
            try {
                qVar.getMediaProcessor().mo35069b();
            } catch (Exception unused) {
                this.f15054b.mo35614b(str, "Unexpected error", "unRegisterDeviceMuteEventListener");
            }
        }
    }

    @JavascriptInterface
    public void registerDeviceVolumeChangeEventListener(String str) {
        C6337q qVar = this.f15054b;
        if (qVar != null) {
            try {
                C5966db mediaProcessor = qVar.getMediaProcessor();
                Context c = C6227ho.m18551c();
                if (c != null && mediaProcessor.f15166d == null) {
                    mediaProcessor.f15166d = new C5966db.C5972c(str, c, new Handler());
                    c.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, mediaProcessor.f15166d);
                }
            } catch (Exception unused) {
                this.f15054b.mo35614b(str, "Unexpected error", "registerDeviceVolumeChangeEventListener");
            }
        }
    }

    @JavascriptInterface
    public void unregisterDeviceVolumeChangeEventListener(String str) {
        C6337q qVar = this.f15054b;
        if (qVar != null) {
            try {
                qVar.getMediaProcessor().mo35070c();
            } catch (Exception unused) {
                this.f15054b.mo35614b(str, "Unexpected error", "unregisterDeviceVolumeChangeEventListener");
            }
        }
    }

    @JavascriptInterface
    public int getDeviceVolume(String str) {
        C6337q qVar = this.f15054b;
        if (qVar == null) {
            return -1;
        }
        try {
            C5966db mediaProcessor = qVar.getMediaProcessor();
            Context c = C6227ho.m18551c();
            if (c == null) {
                return -1;
            }
            if (mediaProcessor.f15163a.getRenderingConfig().enablePubMuteControl && C6227ho.m18558e()) {
                return 0;
            }
            AudioManager audioManager = (AudioManager) c.getSystemService("audio");
            if (audioManager == null) {
                return -1;
            }
            return audioManager.getStreamVolume(3);
        } catch (Exception unused) {
            this.f15054b.mo35614b(str, "Unexpected error", "getDeviceVolume");
            return -1;
        }
    }

    @JavascriptInterface
    public void registerHeadphonePluggedEventListener(String str) {
        C6337q qVar = this.f15054b;
        if (qVar != null) {
            try {
                C5966db mediaProcessor = qVar.getMediaProcessor();
                Context c = C6227ho.m18551c();
                if (c != null && mediaProcessor.f15167e == null) {
                    mediaProcessor.f15167e = new C5966db.C5970a(str);
                    c.registerReceiver(mediaProcessor.f15167e, new IntentFilter("android.intent.action.HEADSET_PLUG"));
                }
            } catch (Exception unused) {
                this.f15054b.mo35614b(str, "Unexpected error", "registerHeadphonePluggedEventListener");
            }
        }
    }

    @JavascriptInterface
    public void unregisterHeadphonePluggedEventListener(String str) {
        C6337q qVar = this.f15054b;
        if (qVar != null) {
            try {
                qVar.getMediaProcessor().mo35071e();
            } catch (Exception unused) {
                this.f15054b.mo35614b(str, "Unexpected error", "unregisterHeadphonePluggedEventListener");
            }
        }
    }

    @JavascriptInterface
    public void disableBackButton(String str, boolean z) {
        C6337q qVar = this.f15054b;
        if (qVar != null) {
            qVar.setDisableBackButton(z);
        }
    }

    @JavascriptInterface
    public boolean isBackButtonDisabled(String str) {
        C6337q qVar = this.f15054b;
        if (qVar == null) {
            return false;
        }
        return qVar.f16117o;
    }

    @JavascriptInterface
    public void registerBackButtonPressedEventListener(String str) {
        C6337q qVar = this.f15054b;
        if (qVar != null) {
            try {
                qVar.f16118p = str;
            } catch (Exception unused) {
                this.f15054b.mo35614b(str, "Unexpected error", "registerBackButtonPressedEventListener");
            }
        }
    }

    @JavascriptInterface
    public void unregisterBackButtonPressedEventListener(String str) {
        C6337q qVar = this.f15054b;
        if (qVar != null) {
            try {
                qVar.f16118p = null;
            } catch (Exception unused) {
                this.f15054b.mo35614b(str, "Unexpected error", "unregisterBackButtonPressedEventListener");
            }
        }
    }

    @JavascriptInterface
    public void setCloseEndCardTracker(String str, String str2) {
        C6337q qVar = this.f15054b;
        if (qVar != null) {
            try {
                qVar.setCloseEndCardTracker(str2);
            } catch (Exception unused) {
                this.f15054b.mo35614b(str, "Unexpected error", "getDownloadStatus");
            }
        }
    }

    @JavascriptInterface
    public void fireComplete(String str) {
        if (this.f15054b == null) {
        }
    }

    @JavascriptInterface
    public void showEndCard(String str) {
        C6337q qVar = this.f15054b;
        if (qVar != null) {
            C6286j referenceContainer = qVar.getReferenceContainer();
            if (referenceContainer instanceof C6318n) {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public final void run() {
                        C6318n.this.f16015p = true;
                        C6318n.this.mo35563c((C5901bt) null);
                    }
                });
            }
        }
    }

    @JavascriptInterface
    public void saveBlob(String str, String str2) {
        C6337q qVar = this.f15054b;
        if (qVar != null && qVar.f16122t != null) {
            qVar.f16122t.mo34484a(str2, qVar.f16121s);
        }
    }

    @JavascriptInterface
    public void getBlob(String str, String str2) {
        C6337q qVar = this.f15054b;
        if (qVar != null && qVar.f16122t != null) {
            qVar.f16122t.mo34485a(str, str2, qVar, qVar.f16121s);
        }
    }

    @JavascriptInterface
    public String getRenderableAdIndexes(String str) {
        return this.f15054b.getRenderableAdIndexes().toString();
    }

    @JavascriptInterface
    public int getCurrentRenderingIndex(String str) {
        return this.f15054b.getCurrentRenderingPodAdIndex();
    }

    @JavascriptInterface
    public void showAd(String str, int i) {
        C6337q qVar = this.f15054b;
        if (!qVar.f16115m || qVar.f16124v == null) {
            qVar.mo35621d(false);
        } else {
            qVar.f16124v.mo34467a(i, qVar, (Context) qVar.f16104b.get());
        }
    }

    @JavascriptInterface
    public long timeSinceShow(String str) {
        C6337q qVar = this.f15054b;
        if (qVar.f16124v != null) {
            return qVar.f16124v.mo34507b_();
        }
        return 0;
    }

    @JavascriptInterface
    public void closeAll(String str) {
        C6337q qVar = this.f15054b;
        if (qVar.f16124v != null) {
            qVar.f16124v.mo34614b();
        }
        if (qVar.f16104b.get() != null) {
            ((Activity) qVar.f16104b.get()).finish();
        }
    }

    @JavascriptInterface
    public void loadAd(String str, int i) {
        C6337q qVar = this.f15054b;
        if (!qVar.f16115m || qVar.f16124v == null) {
            qVar.mo35612a(false);
        } else {
            qVar.f16124v.mo34609a(i, qVar);
        }
    }

    @JavascriptInterface
    public void setAdContext(String str, String str2) {
        C6315k adPodHandler = this.f15054b.getAdPodHandler();
        if (adPodHandler != null) {
            adPodHandler.mo34483a(str2);
        }
    }

    @JavascriptInterface
    public String getAdContext(String str) {
        C6315k adPodHandler = this.f15054b.getAdPodHandler();
        if (adPodHandler != null) {
            return adPodHandler.mo34522e();
        }
        return null;
    }

    @JavascriptInterface
    public long getShowTimeStamp(String str) {
        return this.f15054b.getShowTimeStamp();
    }
}
