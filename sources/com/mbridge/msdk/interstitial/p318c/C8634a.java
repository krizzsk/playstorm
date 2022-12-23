package com.mbridge.msdk.interstitial.p318c;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.interstitial.p316a.C8629a;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.out.InterstitialListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.p054c.C2283b;
import com.mbridge.msdk.p054c.C2290c;
import com.mbridge.msdk.p054c.C2294d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.mbridge.msdk.interstitial.c.a */
/* compiled from: InterstitialController */
public final class C8634a {

    /* renamed from: a */
    public static String f20892a;

    /* renamed from: c */
    public static Map<String, Integer> f20893c = new HashMap();

    /* renamed from: d */
    public static Map<String, Integer> f20894d = new HashMap();

    /* renamed from: e */
    public static Map<String, C8638c> f20895e = new HashMap();

    /* renamed from: b */
    public boolean f20896b = false;

    /* renamed from: f */
    private String f20897f = "InterstitialController";

    /* renamed from: g */
    private Context f20898g;

    /* renamed from: h */
    private String f20899h;

    /* renamed from: i */
    private String f20900i;

    /* renamed from: j */
    private String f20901j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public MBridgeIds f20902k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Handler f20903l;

    /* renamed from: m */
    private C2294d f20904m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public InterstitialListener f20905n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public String f20906o = "";

    /* renamed from: p */
    private String f20907p = "";

    /* renamed from: q */
    private boolean f20908q = false;

    /* renamed from: a */
    public static void m25015a(String str, int i) {
        try {
            if (f20893c != null && !TextUtils.isEmpty(str)) {
                f20893c.put(str, Integer.valueOf(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static int m25010a(String str) {
        Integer num;
        try {
            if (TextUtils.isEmpty(str) || f20893c == null || !f20893c.containsKey(str) || (num = f20893c.get(str)) == null) {
                return 0;
            }
            return num.intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public final void mo57841a(InterstitialListener interstitialListener) {
        this.f20905n = interstitialListener;
    }

    public C8634a() {
        try {
            this.f20903l = new Handler(Looper.getMainLooper()) {
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.lang.Object} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: java.lang.Object} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.String} */
                /* JADX WARNING: Multi-variable type inference failed */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void handleMessage(android.os.Message r6) {
                    /*
                        r5 = this;
                        if (r6 != 0) goto L_0x0003
                        return
                    L_0x0003:
                        int r0 = r6.what
                        r1 = 1
                        if (r0 == r1) goto L_0x00ce
                        r2 = 2
                        java.lang.String r3 = "can't show because unknow error"
                        java.lang.String r4 = ""
                        if (r0 == r2) goto L_0x009f
                        r2 = 3
                        if (r0 == r2) goto L_0x0083
                        r1 = 4
                        if (r0 == r1) goto L_0x0054
                        r6 = 6
                        if (r0 == r6) goto L_0x003b
                        r6 = 7
                        if (r0 == r6) goto L_0x001d
                        goto L_0x00e5
                    L_0x001d:
                        com.mbridge.msdk.interstitial.c.a r6 = com.mbridge.msdk.interstitial.p318c.C8634a.this
                        r0 = 0
                        r6.f20896b = r0
                        com.mbridge.msdk.interstitial.c.a r6 = com.mbridge.msdk.interstitial.p318c.C8634a.this
                        com.mbridge.msdk.out.InterstitialListener r6 = r6.f20905n
                        if (r6 == 0) goto L_0x00e5
                        com.mbridge.msdk.interstitial.c.a r6 = com.mbridge.msdk.interstitial.p318c.C8634a.this
                        com.mbridge.msdk.out.InterstitialListener r6 = r6.f20905n
                        com.mbridge.msdk.interstitial.c.a r0 = com.mbridge.msdk.interstitial.p318c.C8634a.this
                        com.mbridge.msdk.out.MBridgeIds r0 = r0.f20902k
                        r6.onInterstitialClosed(r0)
                        goto L_0x00e5
                    L_0x003b:
                        com.mbridge.msdk.interstitial.c.a r6 = com.mbridge.msdk.interstitial.p318c.C8634a.this
                        com.mbridge.msdk.out.InterstitialListener r6 = r6.f20905n
                        if (r6 == 0) goto L_0x00e5
                        com.mbridge.msdk.interstitial.c.a r6 = com.mbridge.msdk.interstitial.p318c.C8634a.this
                        com.mbridge.msdk.out.InterstitialListener r6 = r6.f20905n
                        com.mbridge.msdk.interstitial.c.a r0 = com.mbridge.msdk.interstitial.p318c.C8634a.this
                        com.mbridge.msdk.out.MBridgeIds r0 = r0.f20902k
                        r6.onInterstitialAdClick(r0)
                        goto L_0x00e5
                    L_0x0054:
                        com.mbridge.msdk.interstitial.c.a r0 = com.mbridge.msdk.interstitial.p318c.C8634a.this
                        com.mbridge.msdk.out.InterstitialListener r0 = r0.f20905n
                        if (r0 == 0) goto L_0x00e5
                        java.lang.Object r0 = r6.obj
                        if (r0 == 0) goto L_0x006b
                        java.lang.Object r0 = r6.obj
                        boolean r0 = r0 instanceof java.lang.String
                        if (r0 == 0) goto L_0x006b
                        java.lang.Object r6 = r6.obj
                        r4 = r6
                        java.lang.String r4 = (java.lang.String) r4
                    L_0x006b:
                        boolean r6 = android.text.TextUtils.isEmpty(r4)
                        if (r6 == 0) goto L_0x0072
                        goto L_0x0073
                    L_0x0072:
                        r3 = r4
                    L_0x0073:
                        com.mbridge.msdk.interstitial.c.a r6 = com.mbridge.msdk.interstitial.p318c.C8634a.this
                        com.mbridge.msdk.out.InterstitialListener r6 = r6.f20905n
                        com.mbridge.msdk.interstitial.c.a r0 = com.mbridge.msdk.interstitial.p318c.C8634a.this
                        com.mbridge.msdk.out.MBridgeIds r0 = r0.f20902k
                        r6.onInterstitialShowFail(r0, r3)
                        goto L_0x00e5
                    L_0x0083:
                        com.mbridge.msdk.interstitial.c.a r6 = com.mbridge.msdk.interstitial.p318c.C8634a.this
                        r6.f20896b = r1
                        com.mbridge.msdk.interstitial.c.a r6 = com.mbridge.msdk.interstitial.p318c.C8634a.this
                        com.mbridge.msdk.out.InterstitialListener r6 = r6.f20905n
                        if (r6 == 0) goto L_0x00e5
                        com.mbridge.msdk.interstitial.c.a r6 = com.mbridge.msdk.interstitial.p318c.C8634a.this
                        com.mbridge.msdk.out.InterstitialListener r6 = r6.f20905n
                        com.mbridge.msdk.interstitial.c.a r0 = com.mbridge.msdk.interstitial.p318c.C8634a.this
                        com.mbridge.msdk.out.MBridgeIds r0 = r0.f20902k
                        r6.onInterstitialShowSuccess(r0)
                        goto L_0x00e5
                    L_0x009f:
                        com.mbridge.msdk.interstitial.c.a r0 = com.mbridge.msdk.interstitial.p318c.C8634a.this
                        com.mbridge.msdk.out.InterstitialListener r0 = r0.f20905n
                        if (r0 == 0) goto L_0x00e5
                        java.lang.Object r0 = r6.obj
                        if (r0 == 0) goto L_0x00b6
                        java.lang.Object r0 = r6.obj
                        boolean r0 = r0 instanceof java.lang.String
                        if (r0 == 0) goto L_0x00b6
                        java.lang.Object r6 = r6.obj
                        r4 = r6
                        java.lang.String r4 = (java.lang.String) r4
                    L_0x00b6:
                        boolean r6 = android.text.TextUtils.isEmpty(r4)
                        if (r6 == 0) goto L_0x00bd
                        goto L_0x00be
                    L_0x00bd:
                        r3 = r4
                    L_0x00be:
                        com.mbridge.msdk.interstitial.c.a r6 = com.mbridge.msdk.interstitial.p318c.C8634a.this
                        com.mbridge.msdk.out.InterstitialListener r6 = r6.f20905n
                        com.mbridge.msdk.interstitial.c.a r0 = com.mbridge.msdk.interstitial.p318c.C8634a.this
                        com.mbridge.msdk.out.MBridgeIds r0 = r0.f20902k
                        r6.onInterstitialLoadFail(r0, r3)
                        goto L_0x00e5
                    L_0x00ce:
                        com.mbridge.msdk.interstitial.c.a r6 = com.mbridge.msdk.interstitial.p318c.C8634a.this
                        com.mbridge.msdk.out.InterstitialListener r6 = r6.f20905n
                        if (r6 == 0) goto L_0x00e5
                        com.mbridge.msdk.interstitial.c.a r6 = com.mbridge.msdk.interstitial.p318c.C8634a.this
                        com.mbridge.msdk.out.InterstitialListener r6 = r6.f20905n
                        com.mbridge.msdk.interstitial.c.a r0 = com.mbridge.msdk.interstitial.p318c.C8634a.this
                        com.mbridge.msdk.out.MBridgeIds r0 = r0.f20902k
                        r6.onInterstitialLoadSuccess(r0)
                    L_0x00e5:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.interstitial.p318c.C8634a.C86351.handleMessage(android.os.Message):void");
                }
            };
        } catch (Exception e) {
            try {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo57842a(Context context, Map<String, Object> map) {
        try {
            this.f20908q = false;
            if (!(map == null || context == null || !map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID))) {
                if (map.get(MBridgeConstans.PROPERTIES_UNIT_ID) instanceof String) {
                    if (map.containsKey(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY) && (map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY) instanceof String)) {
                        this.f20901j = (String) map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY);
                    }
                    this.f20899h = (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
                    this.f20898g = context;
                    if (map.containsKey(MBridgeConstans.PLACEMENT_ID) && map.get(MBridgeConstans.PLACEMENT_ID) != null) {
                        this.f20900i = (String) map.get(MBridgeConstans.PLACEMENT_ID);
                    }
                    this.f20902k = new MBridgeIds(this.f20900i, this.f20899h);
                    this.f20908q = true;
                    return this.f20908q;
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            this.f20908q = false;
        }
    }

    /* renamed from: a */
    public final void mo57840a() {
        try {
            if (this.f20898g == null) {
                m25019b("context is null");
            } else if (TextUtils.isEmpty(this.f20899h)) {
                m25019b("unitid is null");
            } else if (!this.f20908q) {
                m25019b("init error");
            } else {
                m25024d();
                try {
                    if (this.f20904m != null) {
                        int p = this.f20904m.mo15602p();
                        int u = this.f20904m.mo15608u();
                        if (p <= 0) {
                            p = 1;
                        }
                        if (u <= 0) {
                            u = 1;
                        }
                        int i = u * p;
                        if (f20894d != null && !TextUtils.isEmpty(this.f20899h)) {
                            f20894d.put(this.f20899h, Integer.valueOf(i));
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                m25016a(false);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            m25019b("can't show because unknow error");
        }
    }

    /* renamed from: b */
    public final String mo57843b() {
        if (this.f20896b) {
            return this.f20907p;
        }
        return this.f20906o;
    }

    /* renamed from: c */
    public final void mo57844c() {
        try {
            if (this.f20898g == null) {
                m25023c("context is null");
            } else if (TextUtils.isEmpty(this.f20899h)) {
                m25023c("unitid is null");
            } else if (!this.f20908q) {
                m25023c("init error");
            } else {
                m25024d();
                m25020b(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
            m25023c("can't show because unknow error");
        }
    }

    /* renamed from: d */
    private void m25024d() {
        try {
            m25026e();
            C2294d e = C2283b.m5275a().mo15569e(C2350a.m5601e().mo15793h(), this.f20899h);
            this.f20904m = e;
            if (e == null) {
                this.f20904m = C2294d.m5327f(this.f20899h);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m25016a(boolean z) {
        try {
            C8629a aVar = new C8629a(this.f20898g, this.f20899h, this.f20900i, this.f20901j, z);
            C8637b bVar = new C8637b(aVar);
            aVar.mo57828a(new C8636a(aVar, bVar));
            if (this.f20903l != null) {
                this.f20903l.postDelayed(bVar, 30000);
            }
            aVar.mo57829b();
        } catch (Exception e) {
            e.printStackTrace();
            if (!z) {
                m25019b("can't show because unknow error");
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m25020b(boolean z) {
        try {
            CampaignEx a = new C8629a(this.f20898g, this.f20899h, this.f20900i, this.f20901j, true).mo57827a();
            if (a != null) {
                m25012a(a);
            } else if (z) {
                m25016a(true);
            } else {
                m25023c("no ads available can show");
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (this.f20905n != null) {
                m25023c("can't show because unknow error");
            }
        }
    }

    /* renamed from: a */
    private void m25012a(CampaignEx campaignEx) {
        C8638c cVar = new C8638c();
        if (f20895e != null && !TextUtils.isEmpty(this.f20899h)) {
            f20895e.put(this.f20899h, cVar);
        }
        Intent intent = new Intent(this.f20898g, MBInterstitialActivity.class);
        intent.addFlags(67108864);
        intent.addFlags(268435456);
        if (!TextUtils.isEmpty(this.f20899h)) {
            intent.putExtra("unitId", this.f20899h);
        }
        if (campaignEx != null) {
            this.f20907p = campaignEx.getRequestId();
            intent.putExtra("campaign", campaignEx);
        }
        Context context = this.f20898g;
        if (context != null) {
            context.startActivity(intent);
        }
    }

    /* renamed from: com.mbridge.msdk.interstitial.c.a$b */
    /* compiled from: InterstitialController */
    public class C8637b implements Runnable {

        /* renamed from: b */
        private C8629a f20914b;

        public C8637b(C8629a aVar) {
            this.f20914b = aVar;
        }

        public final void run() {
            try {
                if (this.f20914b != null) {
                    if (this.f20914b.mo57830c()) {
                        C8634a.this.m25023c("load timeout");
                    } else if (C8634a.this.f20905n != null) {
                        C8634a.this.m25019b("load timeout");
                    }
                    this.f20914b.mo57828a((C8636a) null);
                    this.f20914b = null;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mbridge.msdk.interstitial.c.a$a */
    /* compiled from: InterstitialController */
    public class C8636a {

        /* renamed from: b */
        private C8629a f20911b;

        /* renamed from: c */
        private C8637b f20912c;

        public C8636a(C8629a aVar, C8637b bVar) {
            this.f20911b = aVar;
            this.f20912c = bVar;
        }

        /* renamed from: a */
        public final void mo57846a(boolean z, String str) {
            try {
                String unused = C8634a.this.f20906o = str;
                if (this.f20912c != null) {
                    if (C8634a.this.f20903l != null) {
                        C8634a.this.f20903l.removeCallbacks(this.f20912c);
                    }
                    if (z) {
                        C8634a.this.m25020b(false);
                    } else if (C8634a.this.f20905n != null) {
                        C8634a.m25025d(C8634a.this);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: b */
        public final void mo57847b(boolean z, String str) {
            try {
                if (this.f20911b != null) {
                    this.f20911b.mo57828a((C8636a) null);
                    this.f20911b = null;
                }
                if (this.f20912c != null) {
                    if (C8634a.this.f20903l != null) {
                        C8634a.this.f20903l.removeCallbacks(this.f20912c);
                    }
                    if (z) {
                        if (C8634a.this.f20905n != null) {
                            C8634a.this.m25023c(str);
                        }
                    } else if (C8634a.this.f20905n != null) {
                        C8634a.this.m25019b(str);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mbridge.msdk.interstitial.c.a$c */
    /* compiled from: InterstitialController */
    public class C8638c {
        public C8638c() {
        }

        /* renamed from: a */
        public final void mo57850a(String str) {
            try {
                C8634a.this.m25023c(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: a */
        public final void mo57849a() {
            try {
                C8634a.m25027e(C8634a.this);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: b */
        public final void mo57851b() {
            try {
                if (C8634a.this.f20903l != null) {
                    C8634a.this.f20903l.sendEmptyMessage(7);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: c */
        public final void mo57852c() {
            try {
                if (C8634a.this.f20903l != null) {
                    C8634a.this.f20903l.sendEmptyMessage(6);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m25019b(String str) {
        try {
            if (this.f20903l != null) {
                Message obtain = Message.obtain();
                obtain.obj = str;
                obtain.what = 2;
                this.f20903l.sendMessage(obtain);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m25023c(String str) {
        try {
            if (this.f20903l != null) {
                Message obtain = Message.obtain();
                obtain.obj = str;
                obtain.what = 4;
                this.f20903l.sendMessage(obtain);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    private void m25026e() {
        try {
            new C2290c().mo15580a(this.f20898g, (String) null, (String) null, this.f20899h);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    static /* synthetic */ void m25025d(C8634a aVar) {
        Handler handler = aVar.f20903l;
        if (handler != null) {
            handler.sendEmptyMessage(1);
        }
    }

    /* renamed from: e */
    static /* synthetic */ void m25027e(C8634a aVar) {
        Handler handler = aVar.f20903l;
        if (handler != null) {
            handler.sendEmptyMessage(3);
        }
    }
}
