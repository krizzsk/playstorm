package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.p049d.C1871f;
import com.applovin.impl.sdk.utils.AppKilledService;
import com.applovin.impl.sdk.utils.C2032a;
import com.applovin.impl.sdk.utils.Utils;
import com.tapjoy.TJAdUnitConstants;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.applovin.impl.sdk.y */
public class C2096y {

    /* renamed from: b */
    private static final AtomicBoolean f4109b = new AtomicBoolean();

    /* renamed from: a */
    final C1959m f4110a;

    /* renamed from: c */
    private final AtomicBoolean f4111c = new AtomicBoolean();

    /* renamed from: d */
    private final AtomicBoolean f4112d = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final AtomicInteger f4113e = new AtomicInteger();

    /* renamed from: f */
    private Date f4114f;

    /* renamed from: g */
    private Date f4115g;

    C2096y(final C1959m mVar) {
        this.f4110a = mVar;
        final Application application = (Application) mVar.mo14297L();
        application.registerActivityLifecycleCallbacks(new C2032a() {
            public void onActivityResumed(Activity activity) {
                super.onActivityResumed(activity);
                C2096y.this.m5073e();
            }
        });
        application.registerComponentCallbacks(new ComponentCallbacks2() {
            public void onConfigurationChanged(Configuration configuration) {
            }

            public void onLowMemory() {
            }

            public void onTrimMemory(int i) {
                C2096y.this.f4113e.set(i);
                if (i == 20) {
                    C2096y.this.m5074f();
                }
            }
        });
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        application.registerReceiver(new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                if ("android.intent.action.USER_PRESENT".equals(action)) {
                    if (Utils.isCurrentProcessInForeground()) {
                        C2096y.this.m5073e();
                    }
                } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    C2096y.this.m5074f();
                }
            }
        }, intentFilter);
        if (((Boolean) mVar.mo14311a(C1857b.f3217cp)).booleanValue() && f4109b.compareAndSet(false, true)) {
            final Intent intent = new Intent(application, AppKilledService.class);
            application.startService(intent);
            mVar.mo14337aj().registerReceiver(new AppLovinBroadcastManager.Receiver() {
                public void onReceive(Context context, Intent intent, Map<String, Object> map) {
                    application.stopService(intent);
                    mVar.mo14337aj().unregisterReceiver(this);
                }
            }, new IntentFilter(AppKilledService.ACTION_APP_KILLED));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m5073e() {
        if (this.f4112d.compareAndSet(true, false)) {
            m5076h();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m5074f() {
        if (this.f4112d.compareAndSet(false, true)) {
            m5075g();
        }
    }

    /* renamed from: g */
    private void m5075g() {
        if (C2092v.m5047a()) {
            this.f4110a.mo14286A().mo14789b("SessionTracker", "Application Paused");
        }
        this.f4110a.mo14337aj().sendBroadcastSync(new Intent("com.applovin.application_paused"), (Map<String, Object>) null);
        if (!this.f4111c.get()) {
            boolean booleanValue = ((Boolean) this.f4110a.mo14311a(C1857b.f3265dl)).booleanValue();
            long millis = TimeUnit.MINUTES.toMillis(((Long) this.f4110a.mo14311a(C1857b.f3267dn)).longValue());
            if (this.f4114f == null || System.currentTimeMillis() - this.f4114f.getTime() >= millis) {
                ((EventServiceImpl) this.f4110a.mo14371w()).trackEvent(TJAdUnitConstants.String.VIDEO_PAUSED);
                if (booleanValue) {
                    this.f4114f = new Date();
                }
            }
            if (!booleanValue) {
                this.f4114f = new Date();
            }
        }
    }

    /* renamed from: h */
    private void m5076h() {
        if (C2092v.m5047a()) {
            this.f4110a.mo14286A().mo14789b("SessionTracker", "Application Resumed");
        }
        boolean booleanValue = ((Boolean) this.f4110a.mo14311a(C1857b.f3265dl)).booleanValue();
        long longValue = ((Long) this.f4110a.mo14311a(C1857b.f3266dm)).longValue();
        this.f4110a.mo14337aj().sendBroadcastSync(new Intent("com.applovin.application_resumed"), (Map<String, Object>) null);
        if (!this.f4111c.getAndSet(false)) {
            long millis = TimeUnit.MINUTES.toMillis(longValue);
            if (this.f4115g == null || System.currentTimeMillis() - this.f4115g.getTime() >= millis) {
                ((EventServiceImpl) this.f4110a.mo14371w()).trackEvent("resumed");
                if (booleanValue) {
                    this.f4115g = new Date();
                }
            }
            if (!booleanValue) {
                this.f4115g = new Date();
            }
            this.f4110a.mo14304T().mo14128a(C1871f.f3446k);
        }
    }

    /* renamed from: a */
    public boolean mo14802a() {
        return this.f4112d.get();
    }

    /* renamed from: b */
    public int mo14803b() {
        return this.f4113e.get();
    }

    /* renamed from: c */
    public void mo14804c() {
        this.f4111c.set(true);
    }

    /* renamed from: d */
    public void mo14805d() {
        this.f4111c.set(false);
    }
}
