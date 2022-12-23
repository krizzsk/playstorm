package com.applovin.impl.sdk;

import com.applovin.impl.mediation.p032d.C1645c;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.sdk.s */
public class C2024s {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1959m f3930a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final AtomicBoolean f3931b = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public long f3932c;

    /* renamed from: d */
    private final Object f3933d = new Object();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final AtomicBoolean f3934e = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f3935f;

    /* renamed from: g */
    private Object f3936g;

    C2024s(C1959m mVar) {
        this.f3930a = mVar;
    }

    /* renamed from: a */
    public void mo14643a(final Object obj) {
        if (!C1645c.m3316a(obj) && this.f3931b.compareAndSet(false, true)) {
            this.f3936g = obj;
            this.f3932c = System.currentTimeMillis();
            if (C2092v.m5047a()) {
                C2092v A = this.f3930a.mo14286A();
                A.mo14789b("FullScreenAdTracker", "Setting fullscreen ad displayed: " + this.f3932c);
            }
            this.f3930a.mo14337aj().sendBroadcastWithAdObject("com.applovin.fullscreen_ad_displayed", obj);
            final long longValue = ((Long) this.f3930a.mo14311a(C1857b.f3208cg)).longValue();
            if (longValue >= 0) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                    public void run() {
                        if (C2024s.this.f3931b.get() && System.currentTimeMillis() - C2024s.this.f3932c >= longValue) {
                            if (C2092v.m5047a()) {
                                C2024s.this.f3930a.mo14286A().mo14789b("FullScreenAdTracker", "Resetting \"display\" state...");
                            }
                            C2024s.this.mo14646b(obj);
                        }
                    }
                }, longValue);
            }
        }
    }

    /* renamed from: a */
    public void mo14644a(boolean z) {
        synchronized (this.f3933d) {
            this.f3934e.set(z);
            if (z) {
                this.f3935f = System.currentTimeMillis();
                if (C2092v.m5047a()) {
                    C2092v A = this.f3930a.mo14286A();
                    A.mo14789b("FullScreenAdTracker", "Setting fullscreen ad pending display: " + this.f3935f);
                }
                final long longValue = ((Long) this.f3930a.mo14311a(C1857b.f3207cf)).longValue();
                if (longValue >= 0) {
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                        public void run() {
                            if (C2024s.this.mo14645a() && System.currentTimeMillis() - C2024s.this.f3935f >= longValue) {
                                if (C2092v.m5047a()) {
                                    C2024s.this.f3930a.mo14286A().mo14789b("FullScreenAdTracker", "Resetting \"pending display\" state...");
                                }
                                C2024s.this.f3934e.set(false);
                            }
                        }
                    }, longValue);
                }
            } else {
                this.f3935f = 0;
                if (C2092v.m5047a()) {
                    C2092v A2 = this.f3930a.mo14286A();
                    A2.mo14789b("FullScreenAdTracker", "Setting fullscreen ad not pending display: " + System.currentTimeMillis());
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo14645a() {
        return this.f3934e.get();
    }

    /* renamed from: b */
    public void mo14646b(Object obj) {
        if (!C1645c.m3316a(obj) && this.f3931b.compareAndSet(true, false)) {
            this.f3936g = null;
            if (C2092v.m5047a()) {
                C2092v A = this.f3930a.mo14286A();
                A.mo14789b("FullScreenAdTracker", "Setting fullscreen ad hidden: " + System.currentTimeMillis());
            }
            this.f3930a.mo14337aj().sendBroadcastWithAdObject("com.applovin.fullscreen_ad_hidden", obj);
        }
    }

    /* renamed from: b */
    public boolean mo14647b() {
        return this.f3931b.get();
    }

    /* renamed from: c */
    public Object mo14648c() {
        return this.f3936g;
    }
}
