package com.mbridge.msdk.click;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.common.net.HttpHeaders;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.same.report.C8526d;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.p054c.C2278a;
import com.mbridge.msdk.p054c.C2283b;
import java.util.HashMap;

/* renamed from: com.mbridge.msdk.click.f */
/* compiled from: WebViewSpider */
public class C2317f {

    /* renamed from: a */
    public static long f4787a = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final String f4788d = C2317f.class.getSimpleName();

    /* renamed from: b */
    boolean f4789b;

    /* renamed from: c */
    boolean f4790c;

    /* renamed from: e */
    private int f4791e = 15000;

    /* renamed from: f */
    private int f4792f = 3000;

    /* renamed from: g */
    private Handler f4793g = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    private C2278a f4794h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C2323a f4795i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public String f4796j;

    /* renamed from: k */
    private String f4797k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public WebView f4798l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f4799m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public String f4800n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f4801o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f4802p = false;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f4803q;

    /* renamed from: r */
    private final Runnable f4804r = new Runnable() {
        public final void run() {
            boolean unused = C2317f.this.f4802p = true;
            int unused2 = C2317f.this.f4801o = 1;
            C2317f.m5485m(C2317f.this);
        }
    };

    /* renamed from: s */
    private final Runnable f4805s = new Runnable() {
        public final void run() {
            boolean unused = C2317f.this.f4802p = true;
            int unused2 = C2317f.this.f4801o = 2;
            C2317f.m5485m(C2317f.this);
        }
    };

    /* renamed from: com.mbridge.msdk.click.f$a */
    /* compiled from: WebViewSpider */
    interface C2323a {
        /* renamed from: a */
        void mo15700a(int i, String str, String str2, String str3);

        /* renamed from: a */
        void mo15701a(String str, boolean z, String str2);

        /* renamed from: a */
        boolean mo15702a(String str);

        /* renamed from: b */
        boolean mo15703b(String str);

        /* renamed from: c */
        boolean mo15704c(String str);
    }

    public C2317f() {
        C2278a b = C2283b.m5275a().mo15563b(C2350a.m5601e().mo15793h());
        this.f4794h = b;
        if (b == null) {
            this.f4794h = C2283b.m5275a().mo15562b();
        }
        this.f4799m = this.f4794h.mo15441O();
        this.f4791e = (int) this.f4794h.mo15446T();
        this.f4792f = (int) this.f4794h.mo15446T();
    }

    /* renamed from: a */
    public final void mo15687a(String str, String str2, Context context, String str3, String str4, C2323a aVar) {
        if (aVar != null) {
            this.f4797k = str4;
            this.f4796j = str3;
            this.f4795i = aVar;
            m5467a(str, str2, context);
            return;
        }
        throw new NullPointerException("OverrideUrlLoadingListener can not be null");
    }

    /* renamed from: a */
    public final void mo15686a(String str, String str2, Context context, String str3, C2323a aVar) {
        if (aVar != null) {
            this.f4796j = str3;
            this.f4795i = aVar;
            m5467a(str, str2, context);
            return;
        }
        throw new NullPointerException("OverrideUrlLoadingListener can not be null");
    }

    /* renamed from: a */
    private void m5467a(final String str, final String str2, final Context context) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            m5468a(str, str2, context, this.f4796j);
        } else {
            this.f4793g.post(new Runnable() {
                public final void run() {
                    C2317f fVar = C2317f.this;
                    fVar.m5468a(str, str2, context, fVar.f4796j);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5468a(String str, String str2, Context context, String str3) {
        try {
            m5465a(context, str, str2);
            if (!TextUtils.isEmpty(this.f4797k)) {
                this.f4798l.getSettings().setDefaultTextEncodingName("utf-8");
                this.f4792f = 2000;
                this.f4791e = 2000;
                C8608u.m24882b(f4788d, this.f4797k);
                this.f4798l.loadDataWithBaseURL(str3, this.f4797k, "*/*", "utf-8", str3);
            } else if (this.f4799m) {
                HashMap hashMap = new HashMap();
                if (this.f4798l.getUrl() != null) {
                    hashMap.put(HttpHeaders.REFERER, this.f4798l.getUrl());
                }
                this.f4798l.loadUrl(str3, hashMap);
            } else {
                this.f4798l.loadUrl(str3);
            }
        } catch (Throwable th) {
            try {
                if (this.f4795i != null) {
                    this.f4795i.mo15700a(0, this.f4796j, th.getMessage(), this.f4800n);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private void m5465a(final Context context, final String str, final String str2) {
        WebView webView = new WebView(context);
        this.f4798l = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f4798l.getSettings().setCacheMode(2);
        this.f4798l.getSettings().setLoadsImagesAutomatically(false);
        this.f4798l.setWebViewClient(new WebViewClient() {
            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                try {
                    webView.loadUrl("javascript:window.navigator.vibrate([]);");
                    if (C2317f.this.f4803q) {
                        int unused = C2317f.this.f4801o = 0;
                        C2317f.m5474c(C2317f.this);
                        return;
                    }
                    C2317f.this.f4790c = false;
                    if (webView.getTag() == null) {
                        webView.setTag("has_first_started");
                    } else {
                        C2317f.this.f4789b = true;
                    }
                    synchronized (C2317f.f4788d) {
                        String unused2 = C2317f.this.f4796j = str;
                        if (C2317f.this.f4795i == null || !C2317f.this.f4795i.mo15702a(str)) {
                            C2317f.m5477e(C2317f.this);
                        } else {
                            boolean unused3 = C2317f.this.f4803q = true;
                            C2317f.m5474c(C2317f.this);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
                if (com.mbridge.msdk.click.C2317f.m5480h(r3.f4813d) == false) goto L_0x0080;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
                r4 = new java.util.HashMap();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
                if (com.mbridge.msdk.click.C2317f.m5481i(r3.f4813d).getUrl() == null) goto L_0x0076;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
                r4.put(com.google.common.net.HttpHeaders.REFERER, com.mbridge.msdk.click.C2317f.m5481i(r3.f4813d).getUrl());
             */
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
                com.mbridge.msdk.click.C2317f.m5481i(r3.f4813d).loadUrl(r5, r4);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:22:0x0080, code lost:
                com.mbridge.msdk.click.C2317f.m5481i(r3.f4813d).loadUrl(r5);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:23:0x0089, code lost:
                return true;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final boolean shouldOverrideUrlLoading(android.webkit.WebView r4, java.lang.String r5) {
                /*
                    r3 = this;
                    java.lang.String r4 = com.mbridge.msdk.click.C2317f.f4788d
                    monitor-enter(r4)
                    com.mbridge.msdk.click.f r0 = com.mbridge.msdk.click.C2317f.this     // Catch:{ all -> 0x008a }
                    r1 = 1
                    r0.f4790c = r1     // Catch:{ all -> 0x008a }
                    com.mbridge.msdk.click.f r0 = com.mbridge.msdk.click.C2317f.this     // Catch:{ all -> 0x008a }
                    r0.m5476d()     // Catch:{ all -> 0x008a }
                    com.mbridge.msdk.click.f r0 = com.mbridge.msdk.click.C2317f.this     // Catch:{ all -> 0x008a }
                    boolean r0 = r0.f4803q     // Catch:{ all -> 0x008a }
                    if (r0 == 0) goto L_0x0023
                    com.mbridge.msdk.click.f r5 = com.mbridge.msdk.click.C2317f.this     // Catch:{ all -> 0x008a }
                    r5.m5473c()     // Catch:{ all -> 0x008a }
                    com.mbridge.msdk.click.f r5 = com.mbridge.msdk.click.C2317f.this     // Catch:{ all -> 0x008a }
                    com.mbridge.msdk.click.C2317f.m5474c(r5)     // Catch:{ all -> 0x008a }
                    monitor-exit(r4)     // Catch:{ all -> 0x008a }
                    return r1
                L_0x0023:
                    com.mbridge.msdk.click.f r0 = com.mbridge.msdk.click.C2317f.this     // Catch:{ all -> 0x008a }
                    java.lang.String unused = r0.f4796j = r5     // Catch:{ all -> 0x008a }
                    com.mbridge.msdk.click.f r0 = com.mbridge.msdk.click.C2317f.this     // Catch:{ all -> 0x008a }
                    com.mbridge.msdk.click.f$a r0 = r0.f4795i     // Catch:{ all -> 0x008a }
                    if (r0 == 0) goto L_0x004d
                    com.mbridge.msdk.click.f r0 = com.mbridge.msdk.click.C2317f.this     // Catch:{ all -> 0x008a }
                    com.mbridge.msdk.click.f$a r0 = r0.f4795i     // Catch:{ all -> 0x008a }
                    boolean r0 = r0.mo15703b(r5)     // Catch:{ all -> 0x008a }
                    if (r0 == 0) goto L_0x004d
                    com.mbridge.msdk.click.f r5 = com.mbridge.msdk.click.C2317f.this     // Catch:{ all -> 0x008a }
                    boolean unused = r5.f4803q = r1     // Catch:{ all -> 0x008a }
                    com.mbridge.msdk.click.f r5 = com.mbridge.msdk.click.C2317f.this     // Catch:{ all -> 0x008a }
                    r5.m5473c()     // Catch:{ all -> 0x008a }
                    com.mbridge.msdk.click.f r5 = com.mbridge.msdk.click.C2317f.this     // Catch:{ all -> 0x008a }
                    com.mbridge.msdk.click.C2317f.m5474c(r5)     // Catch:{ all -> 0x008a }
                    monitor-exit(r4)     // Catch:{ all -> 0x008a }
                    return r1
                L_0x004d:
                    monitor-exit(r4)     // Catch:{ all -> 0x008a }
                    com.mbridge.msdk.click.f r4 = com.mbridge.msdk.click.C2317f.this
                    boolean r4 = r4.f4799m
                    if (r4 == 0) goto L_0x0080
                    java.util.HashMap r4 = new java.util.HashMap
                    r4.<init>()
                    com.mbridge.msdk.click.f r0 = com.mbridge.msdk.click.C2317f.this
                    android.webkit.WebView r0 = r0.f4798l
                    java.lang.String r0 = r0.getUrl()
                    if (r0 == 0) goto L_0x0076
                    java.lang.String r0 = "Referer"
                    com.mbridge.msdk.click.f r2 = com.mbridge.msdk.click.C2317f.this
                    android.webkit.WebView r2 = r2.f4798l
                    java.lang.String r2 = r2.getUrl()
                    r4.put(r0, r2)
                L_0x0076:
                    com.mbridge.msdk.click.f r0 = com.mbridge.msdk.click.C2317f.this
                    android.webkit.WebView r0 = r0.f4798l
                    r0.loadUrl(r5, r4)
                    goto L_0x0089
                L_0x0080:
                    com.mbridge.msdk.click.f r4 = com.mbridge.msdk.click.C2317f.this
                    android.webkit.WebView r4 = r4.f4798l
                    r4.loadUrl(r5)
                L_0x0089:
                    return r1
                L_0x008a:
                    r5 = move-exception
                    monitor-exit(r4)     // Catch:{ all -> 0x008a }
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.C2317f.C23192.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
            }

            public final void onReceivedError(WebView webView, int i, String str, String str2) {
                synchronized (C2317f.f4788d) {
                    boolean unused = C2317f.this.f4803q = true;
                    C2317f.this.m5470b();
                    C2317f.m5474c(C2317f.this);
                }
                if (C2317f.this.f4795i != null) {
                    C2317f.this.f4795i.mo15700a(i, webView.getUrl(), str, C2317f.this.f4800n);
                }
            }

            public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                try {
                    if (MBridgeConstans.IS_SP_CBT_CF && sslErrorHandler != null) {
                        sslErrorHandler.cancel();
                    }
                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                        new C8526d(context).mo57694a(str, str2, webView.getUrl());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            public final void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                try {
                    webView.loadUrl("javascript:window.navigator.vibrate([]);");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        this.f4798l.setWebChromeClient(new WebChromeClient() {
            public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
                return true;
            }

            public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
                return true;
            }

            public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
                return true;
            }

            public final void onProgressChanged(WebView webView, int i) {
                if (i == 100) {
                    try {
                        webView.loadUrl("javascript:window.navigator.vibrate([]);");
                        if (!C2317f.this.f4803q && !C2317f.this.f4790c) {
                            C2317f.m5484l(C2317f.this);
                        }
                        if (C2317f.this.f4795i != null) {
                            C2317f.this.f4795i.mo15704c(webView.getUrl());
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m5470b() {
        m5476d();
        m5473c();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m5473c() {
        this.f4793g.removeCallbacks(this.f4805s);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m5476d() {
        this.f4793g.removeCallbacks(this.f4804r);
    }

    /* renamed from: c */
    static /* synthetic */ void m5474c(C2317f fVar) {
        synchronized (f4788d) {
            try {
                fVar.m5470b();
                if (fVar.f4795i != null) {
                    fVar.f4795i.mo15701a(fVar.f4796j, fVar.f4802p, fVar.f4800n);
                }
            } catch (Exception e) {
                C8608u.m24884d(f4788d, e.getMessage());
            } catch (Throwable th) {
                C8608u.m24884d(f4788d, th.getMessage());
            }
        }
    }

    /* renamed from: e */
    static /* synthetic */ void m5477e(C2317f fVar) {
        fVar.m5473c();
        fVar.f4793g.postDelayed(fVar.f4805s, (long) fVar.f4791e);
    }

    /* renamed from: l */
    static /* synthetic */ void m5484l(C2317f fVar) {
        fVar.m5476d();
        fVar.f4793g.postDelayed(fVar.f4804r, (long) fVar.f4792f);
    }

    /* renamed from: m */
    static /* synthetic */ void m5485m(C2317f fVar) {
        synchronized (f4788d) {
            try {
                fVar.m5470b();
                fVar.f4798l.destroy();
                if (fVar.f4795i != null) {
                    fVar.f4795i.mo15701a(fVar.f4796j, fVar.f4802p, fVar.f4800n);
                }
            } catch (Exception e) {
                C8608u.m24884d(f4788d, e.getMessage());
            } catch (Throwable th) {
                C8608u.m24884d(f4788d, th.getMessage());
            }
        }
    }
}
