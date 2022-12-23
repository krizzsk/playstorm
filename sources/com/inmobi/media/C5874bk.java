package com.inmobi.media;

import android.content.ContentValues;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.browser.trusted.sharing.ShareTarget;
import com.inmobi.media.C6125fq;
import com.inmobi.media.C6145fs;
import com.inmobi.media.C6212hc;
import com.inmobi.media.C6243hz;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.inmobi.media.bk */
/* compiled from: ClickManager */
public class C5874bk implements C6145fs.C6148c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f14832a = C5874bk.class.getSimpleName();

    /* renamed from: b */
    private static ExecutorService f14833b;

    /* renamed from: c */
    private static C5883b f14834c;

    /* renamed from: d */
    private static HandlerThread f14835d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static List<C5872bi> f14836e = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static C5873bj f14837f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static AtomicBoolean f14838g = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static C6125fq.C6134e f14839h;

    /* renamed from: i */
    private static final Object f14840i = new Object();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public long f14841j = 0;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C5892e f14842k = new C5892e() {
        /* renamed from: a */
        public final void mo34854a(C5872bi biVar) {
            if (biVar != null) {
                String unused = C5874bk.f14832a;
                C5873bj unused2 = C5874bk.f14837f;
                C5873bj.m17601a(biVar);
            }
        }

        /* renamed from: b */
        public final void mo34855b(C5872bi biVar) {
            if (biVar != null) {
                String unused = C5874bk.f14832a;
                C5874bk.m17609a(biVar);
                C5874bk.this.mo34848b();
            }
        }
    };

    /* renamed from: com.inmobi.media.bk$a */
    /* compiled from: ClickManager */
    static class C5882a {

        /* renamed from: a */
        static final C5874bk f14858a = new C5874bk();
    }

    /* renamed from: com.inmobi.media.bk$e */
    /* compiled from: ClickManager */
    interface C5892e {
        /* renamed from: a */
        void mo34854a(C5872bi biVar);

        /* renamed from: b */
        void mo34855b(C5872bi biVar);
    }

    /* renamed from: a */
    public static C5874bk m17607a() {
        return C5882a.f14858a;
    }

    /* renamed from: a */
    public void mo34481a(C6144fr frVar) {
        f14839h = ((C6125fq) frVar).imai;
    }

    /* renamed from: b */
    public void mo34848b() {
        try {
            if (C6239hv.m18616a()) {
                synchronized (f14840i) {
                    if (f14838g.compareAndSet(false, true)) {
                        if (f14835d == null) {
                            HandlerThread handlerThread = new HandlerThread("pingHandlerThread");
                            f14835d = handlerThread;
                            handlerThread.start();
                        }
                        if (f14834c == null) {
                            f14834c = new C5883b(f14835d.getLooper());
                        }
                        if (C5873bj.m17602a()) {
                            f14838g.set(false);
                            m17619i();
                        } else {
                            Message obtain = Message.obtain();
                            obtain.what = 1;
                            f14834c.sendMessage(obtain);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void mo34847a(final String str, final boolean z) {
        new Thread() {
            public final void run() {
                try {
                    if (!((C6166gd) C6145fs.m18321a("root", C6227ho.m18559f(), (C6145fs.C6148c) null)).mo35352i()) {
                        C5872bi biVar = new C5872bi(str, z, false, C5874bk.f14839h.maxRetries + 1);
                        String unused = C5874bk.f14832a;
                        C5874bk.m17610a(C5874bk.this, biVar);
                    }
                } catch (Exception unused2) {
                    String unused3 = C5874bk.f14832a;
                }
            }
        }.start();
    }

    /* renamed from: a */
    public void mo34846a(final String str, final Map<String, String> map, final boolean z) {
        new Thread() {
            public final void run() {
                try {
                    if (!((C6166gd) C6145fs.m18321a("root", C6227ho.m18559f(), (C6145fs.C6148c) null)).mo35352i()) {
                        C5872bi biVar = new C5872bi(str, (Map<String, String>) map, z, C5874bk.f14839h.maxRetries + 1);
                        String unused = C5874bk.f14832a;
                        C5874bk.m17610a(C5874bk.this, biVar);
                    }
                } catch (Exception e) {
                    String unused2 = C5874bk.f14832a;
                    C6181gg.m18398a().mo35357a(new C6217hg(e));
                }
            }
        }.start();
    }

    /* renamed from: b */
    public void mo34849b(final String str, final boolean z) {
        new Thread() {
            public final void run() {
                try {
                    if (!((C6166gd) C6145fs.m18321a("root", C6227ho.m18559f(), (C6145fs.C6148c) null)).mo35352i()) {
                        C5872bi biVar = new C5872bi(str, z, true, C5874bk.f14839h.maxRetries + 1);
                        String unused = C5874bk.f14832a;
                        C5874bk.m17610a(C5874bk.this, biVar);
                    }
                } catch (Exception unused2) {
                    String unused3 = C5874bk.f14832a;
                }
            }
        }.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static void m17619i() {
        try {
            f14838g.set(false);
            synchronized (f14840i) {
                if (!f14838g.get() && f14835d != null) {
                    f14835d.getLooper().quit();
                    f14835d.interrupt();
                    f14835d = null;
                    f14834c = null;
                }
            }
        } catch (Exception unused) {
        }
    }

    public C5874bk() {
        try {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 5, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C6237ht(f14832a));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            f14833b = threadPoolExecutor;
            HandlerThread handlerThread = new HandlerThread("pingHandlerThread");
            f14835d = handlerThread;
            handlerThread.start();
            f14834c = new C5883b(f14835d.getLooper());
            f14839h = ((C6125fq) C6145fs.m18321a(CampaignUnit.JSON_KEY_ADS, C6227ho.m18559f(), this)).imai;
            f14837f = new C5873bj();
            C6243hz.m18635a().mo35459a((C6243hz.C6247c) new C6243hz.C6247c() {
                /* renamed from: a */
                public final void mo34838a(boolean z) {
                    if (z) {
                        C5874bk.this.mo34848b();
                    }
                }
            });
            if (Build.VERSION.SDK_INT >= 23) {
                C6243hz.m18635a().mo35460a("android.os.action.DEVICE_IDLE_MODE_CHANGED", (C6243hz.C6247c) new C6243hz.C6247c() {
                    /* renamed from: a */
                    public final void mo34838a(boolean z) {
                        if (!z) {
                            C5874bk.this.mo34848b();
                        }
                    }
                });
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: com.inmobi.media.bk$d */
    /* compiled from: ClickManager */
    static final class C5891d {

        /* renamed from: a */
        private C5892e f14873a;

        public C5891d(C5892e eVar) {
            this.f14873a = eVar;
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0068 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo34869a(com.inmobi.media.C5872bi r8) {
            /*
                r7 = this;
                com.inmobi.media.gx r0 = new com.inmobi.media.gx     // Catch:{ Exception -> 0x009d }
                java.lang.String r1 = "GET"
                java.lang.String r2 = r8.f14822b     // Catch:{ Exception -> 0x009d }
                r0.<init>(r1, r2)     // Catch:{ Exception -> 0x009d }
                java.util.HashMap r1 = com.inmobi.media.C5874bk.m17613c(r8)     // Catch:{ Exception -> 0x009d }
                boolean r2 = r1.isEmpty()     // Catch:{ Exception -> 0x009d }
                if (r2 != 0) goto L_0x0016
                r0.mo35385a((java.util.Map<java.lang.String, java.lang.String>) r1)     // Catch:{ Exception -> 0x009d }
            L_0x0016:
                r1 = 0
                r0.f15720t = r1     // Catch:{ Exception -> 0x009d }
                r0.f15715o = r1     // Catch:{ Exception -> 0x009d }
                java.util.Map<java.lang.String, java.lang.String> r1 = r8.f14823c     // Catch:{ Exception -> 0x009d }
                r0.mo35387b(r1)     // Catch:{ Exception -> 0x009d }
                boolean r1 = r8.f14829i     // Catch:{ Exception -> 0x009d }
                r0.f15714n = r1     // Catch:{ Exception -> 0x009d }
                com.inmobi.media.fq$e r1 = com.inmobi.media.C5874bk.f14839h     // Catch:{ Exception -> 0x009d }
                int r1 = r1.pingTimeout     // Catch:{ Exception -> 0x009d }
                int r1 = r1 * 1000
                r0.f15712l = r1     // Catch:{ Exception -> 0x009d }
                com.inmobi.media.fq$e r1 = com.inmobi.media.C5874bk.f14839h     // Catch:{ Exception -> 0x009d }
                int r1 = r1.pingTimeout     // Catch:{ Exception -> 0x009d }
                int r1 = r1 * 1000
                r0.f15713m = r1     // Catch:{ Exception -> 0x009d }
                long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x009d }
                com.inmobi.media.ha r3 = new com.inmobi.media.ha     // Catch:{ Exception -> 0x009d }
                r3.<init>(r0)     // Catch:{ Exception -> 0x009d }
                com.inmobi.media.gy r3 = r3.mo35400a()     // Catch:{ Exception -> 0x009d }
                com.inmobi.media.iv r4 = com.inmobi.media.C6279iv.m18765a()     // Catch:{ Exception -> 0x0068 }
                long r5 = r0.mo35394g()     // Catch:{ Exception -> 0x0068 }
                r4.mo35491a(r5)     // Catch:{ Exception -> 0x0068 }
                com.inmobi.media.iv r0 = com.inmobi.media.C6279iv.m18765a()     // Catch:{ Exception -> 0x0068 }
                long r4 = r3.mo35399d()     // Catch:{ Exception -> 0x0068 }
                r0.mo35492b(r4)     // Catch:{ Exception -> 0x0068 }
                com.inmobi.media.iv r0 = com.inmobi.media.C6279iv.m18765a()     // Catch:{ Exception -> 0x0068 }
                long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0068 }
                long r4 = r4 - r1
                r0.mo35493c(r4)     // Catch:{ Exception -> 0x0068 }
                goto L_0x006b
            L_0x0068:
                java.lang.String unused = com.inmobi.media.C5874bk.f14832a     // Catch:{ Exception -> 0x009d }
            L_0x006b:
                boolean r0 = r3.mo35396a()     // Catch:{ Exception -> 0x009d }
                if (r0 == 0) goto L_0x0097
                com.inmobi.media.gw r0 = r3.f15722a     // Catch:{ Exception -> 0x009d }
                int r0 = r0.f15700a     // Catch:{ Exception -> 0x009d }
                r1 = -9
                if (r1 != r0) goto L_0x007f
                com.inmobi.media.bk$e r0 = r7.f14873a     // Catch:{ Exception -> 0x009d }
                r0.mo34854a(r8)     // Catch:{ Exception -> 0x009d }
                return
            L_0x007f:
                boolean r1 = r8.f14829i     // Catch:{ Exception -> 0x009d }
                if (r1 != 0) goto L_0x0091
                r1 = 303(0x12f, float:4.25E-43)
                if (r1 == r0) goto L_0x008b
                r1 = 302(0x12e, float:4.23E-43)
                if (r1 != r0) goto L_0x0091
            L_0x008b:
                com.inmobi.media.bk$e r0 = r7.f14873a     // Catch:{ Exception -> 0x009d }
                r0.mo34854a(r8)     // Catch:{ Exception -> 0x009d }
                return
            L_0x0091:
                com.inmobi.media.bk$e r0 = r7.f14873a     // Catch:{ Exception -> 0x009d }
                r0.mo34855b(r8)     // Catch:{ Exception -> 0x009d }
                return
            L_0x0097:
                com.inmobi.media.bk$e r0 = r7.f14873a     // Catch:{ Exception -> 0x009d }
                r0.mo34854a(r8)     // Catch:{ Exception -> 0x009d }
                return
            L_0x009d:
                java.lang.String unused = com.inmobi.media.C5874bk.f14832a
                com.inmobi.media.bk$e r0 = r7.f14873a
                com.inmobi.media.gw r1 = new com.inmobi.media.gw
                r2 = -1
                java.lang.String r3 = "Unknown error"
                r1.<init>(r2, r3)
                r0.mo34855b(r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5874bk.C5891d.mo34869a(com.inmobi.media.bi):void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static HashMap<String, String> m17613c(C5872bi biVar) {
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            int i = (f14839h.maxRetries - biVar.f14826f) + 1;
            if (i > 0) {
                hashMap.put("X-im-retry-count", String.valueOf(i));
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }

    /* renamed from: com.inmobi.media.bk$c */
    /* compiled from: ClickManager */
    static final class C5886c {

        /* renamed from: a */
        C5892e f14862a;

        public C5886c(C5892e eVar) {
            this.f14862a = eVar;
        }

        /* renamed from: a */
        public final void mo34857a(final C5872bi biVar) {
            biVar.f14827g.set(false);
            final Handler handler = new Handler(Looper.getMainLooper());
            handler.post(new Runnable() {
                public final void run() {
                    C6206gx gxVar = new C6206gx(ShareTarget.METHOD_GET, biVar.f14822b);
                    gxVar.f15720t = false;
                    gxVar.f15715o = false;
                    HashMap b = C5874bk.m17613c(biVar);
                    if (!b.isEmpty()) {
                        gxVar.mo35385a((Map<String, String>) b);
                    }
                    C6212hc hcVar = new C6212hc(gxVar, new WebViewClient() {

                        /* renamed from: a */
                        AtomicBoolean f14866a = new AtomicBoolean(false);

                        /* renamed from: b */
                        boolean f14867b;

                        /* renamed from: c */
                        boolean f14868c;

                        public final void onPageStarted(final WebView webView, String str, Bitmap bitmap) {
                            this.f14868c = true;
                            this.f14867b = false;
                            new Thread(new Runnable() {
                                public final void run() {
                                    try {
                                        Thread.sleep((long) (C5874bk.f14839h.pingTimeout * 1000));
                                    } catch (InterruptedException unused) {
                                    }
                                    if (!C58881.this.f14866a.get()) {
                                        String unused2 = C5874bk.f14832a;
                                        biVar.f14827g.set(true);
                                        handler.post(new Runnable() {
                                            public final void run() {
                                                try {
                                                    C6212hc.C6213a aVar = (C6212hc.C6213a) webView;
                                                    if (aVar != null && !aVar.f15739a) {
                                                        webView.stopLoading();
                                                    }
                                                } catch (Throwable th) {
                                                    C6181gg.m18398a().mo35357a(new C6217hg(th));
                                                }
                                            }
                                        });
                                        C5886c.this.f14862a.mo34855b(biVar);
                                    }
                                }
                            }).start();
                        }

                        public final void onPageFinished(WebView webView, String str) {
                            this.f14866a.set(true);
                            if (!this.f14867b && !biVar.f14827g.get()) {
                                C5886c.this.f14862a.mo34854a(biVar);
                            }
                        }

                        public final void onReceivedError(WebView webView, int i, String str, String str2) {
                            this.f14867b = true;
                            C5886c.this.f14862a.mo34855b(biVar);
                        }

                        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                            this.f14867b = true;
                            C5886c.this.f14862a.mo34855b(biVar);
                        }

                        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                            this.f14867b = true;
                            C5886c.this.f14862a.mo34855b(biVar);
                        }

                        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                            return Build.VERSION.SDK_INT >= 21 && !biVar.f14829i && !webResourceRequest.getUrl().toString().equals(biVar.f14822b);
                        }

                        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                            return !biVar.f14829i && !str.equals(biVar.f14822b);
                        }

                        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                            if (Build.VERSION.SDK_INT < 26) {
                                return false;
                            }
                            webView.destroy();
                            return true;
                        }
                    });
                    try {
                        hcVar.f15738c = new C6212hc.C6213a(hcVar, C6227ho.m18551c());
                        hcVar.f15738c.setWebViewClient(hcVar.f15737b);
                        hcVar.f15738c.getSettings().setJavaScriptEnabled(true);
                        hcVar.f15738c.getSettings().setCacheMode(2);
                        hcVar.f15738c.loadUrl(hcVar.f15736a.mo35392e(), hcVar.f15736a.mo35390d());
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    /* renamed from: com.inmobi.media.bk$b */
    /* compiled from: ClickManager */
    final class C5883b extends Handler {
        public C5883b(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            Message message2 = message;
            try {
                int i = message2.what;
                int i2 = 3;
                if (i == 1) {
                    String str = null;
                    if (!((C6166gd) C6145fs.m18321a("root", C6227ho.m18559f(), (C6145fs.C6148c) null)).mo35352i()) {
                        C5873bj unused = C5874bk.f14837f;
                        int i3 = C5874bk.f14839h.maxEventBatch;
                        int i4 = C5874bk.f14839h.pingInterval;
                        ArrayList arrayList = new ArrayList();
                        C6215he a = C6215he.m18482a();
                        if (a.mo35404a("click") != 0) {
                            if (-1 != i3) {
                                str = Integer.toString(i3);
                            }
                            List<ContentValues> a2 = a.mo35407a("click", C5873bj.f14830a, (String) null, (String[]) null, CampaignEx.JSON_KEY_ST_TS, "ts < " + (System.currentTimeMillis() - ((long) i4)), "ts ASC ", str);
                            a.mo35412b();
                            for (ContentValues a3 : a2) {
                                arrayList.add(C5873bj.m17599a(a3));
                            }
                        }
                        List unused2 = C5874bk.f14836e = arrayList;
                        if (C5874bk.f14836e.isEmpty()) {
                            C5873bj unused3 = C5874bk.f14837f;
                            if (C5873bj.m17602a()) {
                                C5874bk.f14838g.set(false);
                                return;
                            }
                            Message obtain = Message.obtain();
                            obtain.what = 1;
                            sendMessageDelayed(obtain, (long) (C5874bk.f14839h.pingInterval * 1000));
                            return;
                        }
                        String unused4 = C5874bk.f14832a;
                        Iterator it = C5874bk.f14836e.iterator();
                        while (it.hasNext()) {
                            it.next();
                            String unused5 = C5874bk.f14832a;
                        }
                        C5872bi biVar = (C5872bi) C5874bk.f14836e.get(0);
                        Message obtain2 = Message.obtain();
                        obtain2.what = biVar.f14828h ? 3 : 2;
                        obtain2.obj = biVar;
                        long currentTimeMillis = System.currentTimeMillis() - biVar.f14824d;
                        if (currentTimeMillis < ((long) (C5874bk.f14839h.pingInterval * 1000))) {
                            sendMessageDelayed(obtain2, ((long) (C5874bk.f14839h.pingInterval * 1000)) - currentTimeMillis);
                        } else {
                            sendMessage(obtain2);
                        }
                    }
                } else if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            String unused6 = C5874bk.f14832a;
                            int i5 = message2.what;
                            return;
                        }
                        C5872bi biVar2 = (C5872bi) message2.obj;
                        String unused7 = C5874bk.f14832a;
                        C5873bj unused8 = C5874bk.f14837f;
                        C5873bj.m17601a(biVar2);
                        C5874bk.f14836e.remove(biVar2);
                        if (C5874bk.f14836e.isEmpty()) {
                            C5873bj unused9 = C5874bk.f14837f;
                            if (C5873bj.m17602a()) {
                                String unused10 = C5874bk.f14832a;
                                C5874bk.f14838g.set(false);
                                return;
                            }
                            Message obtain3 = Message.obtain();
                            obtain3.what = 1;
                            sendMessage(obtain3);
                            return;
                        }
                        C5872bi biVar3 = (C5872bi) C5874bk.f14836e.get(0);
                        Message obtain4 = Message.obtain();
                        if (!biVar3.f14828h) {
                            i2 = 2;
                        }
                        obtain4.what = i2;
                        obtain4.obj = biVar3;
                        sendMessage(obtain4);
                    } else if (!C6239hv.m18616a()) {
                        C5874bk.f14838g.set(false);
                        C5874bk.m17619i();
                    } else {
                        C5872bi biVar4 = (C5872bi) message2.obj;
                        if (biVar4.f14826f != 0) {
                            if (!biVar4.mo34844a(C5874bk.f14839h.pingCacheExpiry)) {
                                if ((C5874bk.f14839h.maxRetries - biVar4.f14826f) + 1 == 0) {
                                    String unused11 = C5874bk.f14832a;
                                } else {
                                    String unused12 = C5874bk.f14832a;
                                }
                                new C5886c(new C5892e() {
                                    /* renamed from: a */
                                    public final void mo34854a(C5872bi biVar) {
                                        C5883b.m17630a(C5883b.this, biVar);
                                    }

                                    /* renamed from: b */
                                    public final void mo34855b(C5872bi biVar) {
                                        String unused = C5874bk.f14832a;
                                        C5874bk.m17609a(biVar);
                                        C5883b.this.m17631b(biVar);
                                    }
                                }).mo34857a(biVar4);
                                return;
                            }
                        }
                        m17629a(biVar4);
                    }
                } else if (!C6239hv.m18616a()) {
                    C5874bk.f14838g.set(false);
                    C5874bk.m17619i();
                } else {
                    C5872bi biVar5 = (C5872bi) message2.obj;
                    if (biVar5.f14826f != 0) {
                        if (!biVar5.mo34844a(C5874bk.f14839h.pingCacheExpiry)) {
                            if ((C5874bk.f14839h.maxRetries - biVar5.f14826f) + 1 == 0) {
                                String unused13 = C5874bk.f14832a;
                            } else {
                                String unused14 = C5874bk.f14832a;
                            }
                            new C5891d(new C5892e() {
                                /* renamed from: a */
                                public final void mo34854a(C5872bi biVar) {
                                    C5883b.m17630a(C5883b.this, biVar);
                                }

                                /* renamed from: b */
                                public final void mo34855b(C5872bi biVar) {
                                    String unused = C5874bk.f14832a;
                                    C5874bk.m17609a(biVar);
                                    C5883b.this.m17631b(biVar);
                                }
                            }).mo34869a(biVar5);
                            return;
                        }
                    }
                    m17629a(biVar5);
                }
            } catch (Exception unused15) {
                String unused16 = C5874bk.f14832a;
            }
        }

        /* renamed from: a */
        private void m17629a(C5872bi biVar) {
            String unused = C5874bk.f14832a;
            m17631b(biVar);
            C5873bj unused2 = C5874bk.f14837f;
            C5873bj.m17601a(biVar);
            C5874bk.f14836e.remove(biVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m17631b(C5872bi biVar) {
            int indexOf = C5874bk.f14836e.indexOf(biVar);
            if (-1 != indexOf) {
                C5872bi biVar2 = (C5872bi) C5874bk.f14836e.get(indexOf == C5874bk.f14836e.size() + -1 ? 0 : indexOf + 1);
                Message obtain = Message.obtain();
                obtain.what = biVar2.f14828h ? 3 : 2;
                obtain.obj = biVar2;
                if (System.currentTimeMillis() - biVar2.f14824d < ((long) (C5874bk.f14839h.pingInterval * 1000))) {
                    sendMessageDelayed(obtain, (long) (C5874bk.f14839h.pingInterval * 1000));
                } else {
                    sendMessage(obtain);
                }
            }
        }

        /* renamed from: a */
        static /* synthetic */ void m17630a(C5883b bVar, C5872bi biVar) {
            Message obtain = Message.obtain();
            obtain.what = 4;
            obtain.obj = biVar;
            bVar.sendMessage(obtain);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m17610a(C5874bk bkVar, final C5872bi biVar) {
        f14837f.mo34845a(biVar, f14839h.maxDbEvents);
        if (!C6239hv.m18616a()) {
            f14838g.set(false);
            m17619i();
            return;
        }
        f14833b.submit(new Runnable() {
            public final void run() {
                long unused = C5874bk.this.f14841j = SystemClock.elapsedRealtime();
                if (biVar.f14828h) {
                    new C5886c(C5874bk.this.f14842k).mo34857a(biVar);
                } else {
                    new C5891d(C5874bk.this.f14842k).mo34869a(biVar);
                }
            }
        });
    }

    /* renamed from: a */
    static /* synthetic */ void m17609a(C5872bi biVar) {
        if (biVar.f14826f > 0) {
            biVar.f14826f--;
            biVar.f14824d = System.currentTimeMillis();
            C6215he a = C6215he.m18482a();
            a.mo35410b("click", C5873bj.m17603b(biVar), "id = ?", new String[]{String.valueOf(biVar.f14821a)});
            a.mo35412b();
        }
    }
}
