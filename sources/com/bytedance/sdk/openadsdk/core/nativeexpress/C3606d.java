package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bykv.p068vk.openvk.component.video.api.p085c.C2522c;
import com.bykv.p068vk.openvk.component.video.api.p087e.C2531a;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.core.C3513g;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.C3581n;
import com.bytedance.sdk.openadsdk.core.bannerexpress.C3445a;
import com.bytedance.sdk.openadsdk.core.bannerexpress.C3454b;
import com.bytedance.sdk.openadsdk.core.p151e.C3469a;
import com.bytedance.sdk.openadsdk.core.p151e.C3470b;
import com.bytedance.sdk.openadsdk.core.p151e.C3484k;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.p151e.C3500o;
import com.bytedance.sdk.openadsdk.core.video.p165d.C3687a;
import com.bytedance.sdk.openadsdk.p130b.C3156e;
import com.bytedance.sdk.openadsdk.p172h.C3815b;
import com.bytedance.sdk.openadsdk.p172h.p173a.C3814b;
import com.bytedance.sdk.openadsdk.p176i.C3845a;
import com.bytedance.sdk.openadsdk.p176i.C3854d;
import com.bytedance.sdk.openadsdk.p176i.p177a.C3846a;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.d */
/* compiled from: ExpressAdLoadManager */
public class C3606d {

    /* renamed from: j */
    private static Set<C3606d> f9136j = Collections.synchronizedSet(new HashSet());
    /* access modifiers changed from: private */

    /* renamed from: a */
    public AdSlot f9137a;

    /* renamed from: b */
    private final C3581n f9138b = C3578m.m11239f();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Context f9139c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public TTAdNative.NativeExpressAdListener f9140d;

    /* renamed from: e */
    private final AtomicBoolean f9141e = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public List<C3498n> f9142f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public List<C3498n> f9143g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C3609a f9144h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f9145i = 5;

    /* renamed from: k */
    private ScheduledFuture<?> f9146k = null;

    /* renamed from: l */
    private ScheduledFuture<?> f9147l = null;

    /* renamed from: m */
    private ScheduledFuture<?> f9148m = null;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public long f9149n = 0;

    /* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.d$a */
    /* compiled from: ExpressAdLoadManager */
    public interface C3609a {
        /* renamed from: a */
        void mo19449a();

        /* renamed from: a */
        void mo19450a(List<C3498n> list);
    }

    private C3606d(Context context) {
        if (context != null) {
            this.f9139c = context.getApplicationContext();
        } else {
            this.f9139c = C3578m.m11231a();
        }
        f9136j.add(this);
    }

    /* renamed from: a */
    public static C3606d m11392a(Context context) {
        return new C3606d(context);
    }

    /* renamed from: a */
    public void mo20179a(AdSlot adSlot, int i, TTAdNative.NativeExpressAdListener nativeExpressAdListener, int i2) {
        mo20180a(adSlot, i, nativeExpressAdListener, (C3609a) null, i2);
    }

    /* renamed from: a */
    public void mo20180a(AdSlot adSlot, int i, TTAdNative.NativeExpressAdListener nativeExpressAdListener, C3609a aVar, int i2) {
        this.f9149n = System.currentTimeMillis();
        if (this.f9141e.get()) {
            C2975l.m8391e("ExpressAdLoadManager", "express ad is loading...");
            return;
        }
        this.f9145i = i;
        this.f9141e.set(true);
        this.f9137a = adSlot;
        this.f9140d = nativeExpressAdListener;
        this.f9144h = aVar;
        m11399a(adSlot, nativeExpressAdListener);
    }

    /* renamed from: a */
    private void m11399a(final AdSlot adSlot, TTAdNative.NativeExpressAdListener nativeExpressAdListener) {
        if (adSlot != null) {
            C3500o oVar = new C3500o();
            oVar.f8660f = 2;
            this.f9138b.mo20073a(adSlot, oVar, this.f9145i, new C3581n.C3582a() {
                /* renamed from: a */
                public void mo18544a(int i, String str) {
                    C3606d.this.m11396a(i, str);
                }

                /* renamed from: a */
                public void mo18545a(C3469a aVar, C3470b bVar) {
                    if (aVar.mo19477b() == null || aVar.mo19477b().isEmpty()) {
                        C3606d.this.m11396a(-3, C3513g.m10825a(-3));
                        bVar.mo19482a(-3);
                        C3470b.m10407a(bVar);
                        return;
                    }
                    List unused = C3606d.this.f9142f = aVar.mo19477b();
                    List unused2 = C3606d.this.f9143g = aVar.mo19477b();
                    C3606d.this.m11398a(adSlot);
                    C3606d dVar = C3606d.this;
                    dVar.m11397a(dVar.f9149n);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11398a(AdSlot adSlot) {
        List<C3498n> list = this.f9142f;
        if (list != null) {
            for (C3498n next : list) {
                if (next.mo19671ao() && next.mo19613P() != null && !next.mo19613P().isEmpty()) {
                    for (C3484k next2 : next.mo19613P()) {
                        if (!TextUtils.isEmpty(next2.mo19559a())) {
                            C3854d.m12660a().mo20706c().mo20691a(new C3845a(next2.mo19559a(), next2.mo19570g()), C3846a.m12620b(), next2.mo19563b(), next2.mo19566c(), (String) null);
                        }
                    }
                }
                if (!(!C3498n.m10583c(next) || next.mo19607J() == null || next.mo19607J().mo16360i() == null)) {
                    if (C3578m.m11241h().mo19930b(String.valueOf(C4014u.m13223f(next))) && C3578m.m11241h().mo19920G()) {
                        C2522c a = C3498n.m10578a(CacheDirFactory.getICacheDir(next.mo19650aD()).mo16068a(), next);
                        a.mo16377a("material_meta", next);
                        a.mo16377a("ad_slot", adSlot);
                        C3687a.m11850a(a, (C2531a.C2532a) null);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11397a(final long j) {
        if (this.f9141e.getAndSet(false)) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    if (C3606d.this.f9143g == null || C3606d.this.f9143g.size() <= 0) {
                        if (C3606d.this.f9140d != null) {
                            C3606d.this.f9140d.onError(108, C3513g.m10825a(108));
                            C3606d.this.m11395a(108);
                        }
                        if (C3606d.this.f9144h != null) {
                            C3606d.this.f9144h.mo19449a();
                        }
                    } else {
                        if (C3606d.this.f9140d != null) {
                            ArrayList arrayList = new ArrayList(C3606d.this.f9143g.size());
                            for (C3498n a : C3606d.this.f9143g) {
                                arrayList.add(C3606d.this.m11390a(a));
                            }
                            if (!arrayList.isEmpty()) {
                                if (!TextUtils.isEmpty(C3606d.this.f9137a.getBidAdm())) {
                                    C3156e.m9181a((C3498n) C3606d.this.f9143g.get(0), C4014u.m13198b(C3606d.this.f9145i), System.currentTimeMillis() - C3606d.this.f9149n);
                                } else {
                                    C3156e.m9191b(C3606d.this.f9139c, (C3498n) C3606d.this.f9143g.get(0), C4014u.m13198b(C3606d.this.f9137a.getDurationSlotType()), j);
                                }
                                C3606d.this.f9140d.onNativeExpressAdLoad(arrayList);
                            } else {
                                C3606d.this.f9140d.onError(103, C3513g.m10825a(103));
                                C3606d.this.m11395a(103);
                            }
                        }
                        if (C3606d.this.f9144h != null) {
                            C3606d.this.f9144h.mo19450a(C3606d.this.f9143g);
                        }
                    }
                    C3606d.this.m11394a();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11395a(int i) {
        List<C3498n> list = this.f9142f;
        C3814b e = C3814b.m12522b().mo20632a(this.f9145i).mo20637c(this.f9137a.getCodeId()).mo20641e((list == null || list.size() <= 0) ? "" : C4014u.m13235h(this.f9142f.get(0)));
        e.mo20635b(i).mo20643f(C3513g.m10825a(i));
        C3815b.m12552a().mo20665b(e);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11396a(int i, String str) {
        if (this.f9141e.getAndSet(false)) {
            TTAdNative.NativeExpressAdListener nativeExpressAdListener = this.f9140d;
            if (nativeExpressAdListener != null) {
                nativeExpressAdListener.onError(i, str);
            }
            C3609a aVar = this.f9144h;
            if (aVar != null) {
                aVar.mo19449a();
            }
            m11394a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public TTNativeExpressAd m11390a(C3498n nVar) {
        if (this.f9145i != 1) {
            return null;
        }
        if (nVar.mo19607J() != null) {
            return new C3454b(this.f9139c, nVar, this.f9137a);
        }
        return new C3445a(this.f9139c, nVar, this.f9137a);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11394a() {
        List<C3498n> list = this.f9142f;
        if (list != null) {
            list.clear();
        }
        List<C3498n> list2 = this.f9143g;
        if (list2 != null) {
            list2.clear();
        }
        m11404a(true);
        m11408b(true);
        m11410c(true);
        m11407b();
    }

    /* renamed from: a */
    private void m11404a(boolean z) {
        try {
            if (this.f9147l != null && !this.f9147l.isCancelled()) {
                boolean cancel = this.f9147l.cancel(z);
                C2975l.m8391e("ExpressAdLoadManager", "CheckValidFutureTask-->cancel......success=" + cancel);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private void m11408b(boolean z) {
        try {
            if (this.f9148m != null && !this.f9148m.isCancelled()) {
                boolean cancel = this.f9148m.cancel(z);
                C2975l.m8384b("ExpressAdLoadManager", "CheckValidDoneFutureTask-->cancel.....success=" + cancel);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    private void m11410c(boolean z) {
        try {
            if (this.f9146k != null && !this.f9146k.isCancelled()) {
                boolean cancel = this.f9146k.cancel(z);
                C2975l.m8391e("ExpressAdLoadManager", "TimeOutFutureTask-->cancel......success=" + cancel);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private void m11407b() {
        f9136j.remove(this);
    }
}
