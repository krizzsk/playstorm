package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.component.p125f.C2952e;
import com.bytedance.sdk.component.p125f.C2955g;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2989x;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.component.C3245a;
import com.bytedance.sdk.openadsdk.component.p138c.C3272a;
import com.bytedance.sdk.openadsdk.component.p139d.C3274a;
import com.bytedance.sdk.openadsdk.component.p139d.C3275b;
import com.bytedance.sdk.openadsdk.core.C3513g;
import com.bytedance.sdk.openadsdk.core.C3568k;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.C3581n;
import com.bytedance.sdk.openadsdk.core.p151e.C3469a;
import com.bytedance.sdk.openadsdk.core.p151e.C3470b;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.p151e.C3500o;
import com.bytedance.sdk.openadsdk.core.p151e.C3503r;
import com.bytedance.sdk.openadsdk.p130b.C3126a;
import com.bytedance.sdk.openadsdk.p176i.p177a.C3850b;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.component.c */
/* compiled from: TTAppOpenAdLoadManager */
public class C3267c implements C2989x.C2990a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f7740a = 0;

    /* renamed from: b */
    private AdSlot f7741b;

    /* renamed from: c */
    private final Context f7742c;

    /* renamed from: d */
    private final C3581n<C3126a> f7743d;

    /* renamed from: e */
    private TTAdNative.AppOpenAdListener f7744e;

    /* renamed from: f */
    private C2989x f7745f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C3245a f7746g;

    /* renamed from: h */
    private int f7747h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public volatile int f7748i = 0;

    /* renamed from: j */
    private final AtomicBoolean f7749j = new AtomicBoolean(false);

    /* renamed from: k */
    private C3503r f7750k;

    public C3267c(Context context) {
        if (context != null) {
            this.f7742c = context.getApplicationContext();
        } else {
            this.f7742c = C3578m.m11231a();
        }
        this.f7743d = C3578m.m11239f();
        this.f7746g = C3245a.m9453a(this.f7742c);
    }

    /* renamed from: a */
    public static C3267c m9530a(Context context) {
        return new C3267c(context);
    }

    /* renamed from: a */
    public void mo18949a(AdSlot adSlot, TTAdNative.AppOpenAdListener appOpenAdListener, int i) {
        if (appOpenAdListener != null) {
            if (i <= 0) {
                C2975l.m8384b("TTAppOpenAdLoadManager", "Since the timeout value passed by loadAppOpenAd is <=0, now it is set to the default value of 3500ms");
                i = IronSourceConstants.BN_AUCTION_REQUEST;
            }
            this.f7741b = adSlot;
            this.f7744e = appOpenAdListener;
            this.f7740a = mo18948a(adSlot);
            this.f7747h = i;
            C2989x xVar = new C2989x(C3568k.m11191c().getLooper(), this);
            this.f7745f = xVar;
            xVar.sendEmptyMessageDelayed(1, (long) i);
            m9538b(this.f7741b);
            m9539c(this.f7741b);
        }
    }

    /* renamed from: b */
    private void m9538b(final AdSlot adSlot) {
        long currentTimeMillis = System.currentTimeMillis();
        C3503r rVar = new C3503r();
        this.f7750k = rVar;
        rVar.mo19785a(currentTimeMillis);
        this.f7748i = 1;
        C3500o oVar = new C3500o();
        oVar.f8661g = currentTimeMillis;
        oVar.f8663i = this.f7750k;
        oVar.f8658d = 1;
        this.f7743d.mo20073a(adSlot, oVar, 3, new C3581n.C3582a() {
            /* renamed from: a */
            public void mo18544a(int i, String str) {
                int unused = C3267c.this.f7748i = 3;
                C2975l.m8384b("TTAppOpenAdLoadManager", "try load app open ad from network fail");
                C3267c.this.m9534a(new C3275b(2, 100, i, str));
            }

            /* renamed from: a */
            public void mo18545a(C3469a aVar, C3470b bVar) {
                int unused = C3267c.this.f7748i = 2;
                C2975l.m8384b("TTAppOpenAdLoadManager", "try load app open ad from network success");
                if (aVar == null || aVar.mo19477b() == null || aVar.mo19477b().size() == 0) {
                    int unused2 = C3267c.this.f7748i = 3;
                    C3267c.this.m9534a(new C3275b(2, 100, 20001, C3513g.m10825a(20001)));
                    bVar.mo19482a(-3);
                    C3470b.m10407a(bVar);
                    return;
                }
                C3498n nVar = aVar.mo19477b().get(0);
                if (C3498n.m10583c(nVar)) {
                    C3267c.this.m9536a(nVar, adSlot);
                } else {
                    C3267c.this.m9535a(nVar);
                }
            }
        });
    }

    /* renamed from: c */
    private void m9539c(AdSlot adSlot) {
        C2952e.m8308a(new C2955g("tryGetAppOpenAdFromCache") {
            public void run() {
                if (!C3267c.this.f7746g.mo18929e(C3267c.this.f7740a)) {
                    return;
                }
                if (C3267c.this.f7746g.mo18925b(C3267c.this.f7740a) || C3267c.this.f7746g.mo18928d(C3267c.this.f7740a)) {
                    C3498n f = C3267c.this.f7746g.mo18930f(C3267c.this.f7740a);
                    C3267c.this.f7746g.mo18931g(C3267c.this.f7740a);
                    if (f == null) {
                        C2975l.m8384b("TTAppOpenAdLoadManager", "Cached material resolution failed");
                        return;
                    }
                    C2975l.m8384b("TTAppOpenAdLoadManager", "Cached material resolution success");
                    if (C3498n.m10583c(f)) {
                        if (!TextUtils.isEmpty(C3267c.this.f7746g.mo18915a(f)) || Build.VERSION.SDK_INT < 23) {
                            C3267c.this.m9534a(new C3275b(1, 101, f));
                            return;
                        }
                        C2975l.m8384b("TTAppOpenAdLoadManager", "Video cache path not found");
                        C3272a.m9556b(f);
                    } else if (C3267c.this.f7746g.mo18926b(f)) {
                        C3267c.this.m9534a(new C3275b(1, 101, f));
                    } else {
                        C2975l.m8384b("TTAppOpenAdLoadManager", "Image cache path not found");
                        C3272a.m9556b(f);
                    }
                } else {
                    C3267c.this.f7746g.mo18931g(C3267c.this.f7740a);
                }
            }
        }, 10);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9536a(final C3498n nVar, AdSlot adSlot) {
        this.f7746g.mo18921a(nVar, adSlot, this.f7750k, (C3245a.C3255c) new C3245a.C3255c() {
            /* renamed from: a */
            public void mo18933a() {
                int unused = C3267c.this.f7748i = 4;
                C3267c.this.m9534a(new C3275b(1, 100, nVar));
            }

            /* renamed from: a */
            public void mo18934a(int i, String str) {
                int unused = C3267c.this.f7748i = 5;
                C3267c.this.m9534a(new C3275b(2, 100, 10003, C3513g.m10825a(10003)));
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9535a(final C3498n nVar) {
        this.f7746g.mo18922a(nVar, this.f7750k, (C3245a.C3254b) new C3245a.C3254b() {
            /* renamed from: a */
            public void mo18936a(C3850b bVar) {
                int unused = C3267c.this.f7748i = 4;
                C3267c.this.m9534a(new C3275b(1, 100, nVar));
            }

            /* renamed from: a */
            public void mo18935a() {
                int unused = C3267c.this.f7748i = 5;
                C3267c.this.m9534a(new C3275b(2, 100, 10003, C3513g.m10825a(10003)));
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9534a(C3275b bVar) {
        int a = bVar.mo18953a();
        int b = bVar.mo18954b();
        if (this.f7749j.get()) {
            if (a == 1 && b == 100) {
                C3245a.m9453a(C3578m.m11231a()).mo18920a(new C3274a(this.f7740a, bVar.mo18955c()));
                C3272a.m9552a(bVar.mo18955c(), 1, this.f7750k);
            }
        } else if (a == 1) {
            C3259b bVar2 = new C3259b(this.f7742c, bVar.mo18955c(), b == 101);
            TTAdNative.AppOpenAdListener appOpenAdListener = this.f7744e;
            if (appOpenAdListener != null) {
                appOpenAdListener.onAppOpenAdLoaded(bVar2);
            }
            this.f7749j.set(true);
            if (b == 101) {
                C3272a.m9553a(bVar.mo18955c(), System.currentTimeMillis() - this.f7750k.mo19783a());
            } else if (b == 100) {
                C3272a.m9552a(bVar.mo18955c(), 0, this.f7750k);
                this.f7746g.mo18919a(this.f7741b);
            }
        } else if (a == 2 || a == 3) {
            TTAdNative.AppOpenAdListener appOpenAdListener2 = this.f7744e;
            if (appOpenAdListener2 != null) {
                appOpenAdListener2.onError(bVar.mo18956d(), bVar.mo18957e());
            }
            this.f7749j.set(true);
            if (a == 3) {
                C3272a.m9549a(this.f7748i, this.f7747h);
            }
        }
    }

    /* renamed from: a */
    public int mo18948a(AdSlot adSlot) {
        try {
            return Integer.parseInt(adSlot.getCodeId());
        } catch (Throwable unused) {
            m9534a(new C3275b(2, 102, 40006, C3513g.m10825a(40006)));
            return 0;
        }
    }

    /* renamed from: a */
    public void mo17318a(Message message) {
        if (message.what == 1 && !this.f7749j.get()) {
            m9534a(new C3275b(3, 102, 10002, C3513g.m10825a(10002)));
        }
    }
}
