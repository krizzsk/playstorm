package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1959m;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.sdk.utils.e */
public class C2036e implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    private static final Set<C2036e> f3961a = new HashSet();

    /* renamed from: b */
    private final C2082o f3962b;

    /* renamed from: c */
    private final C1959m f3963c;

    private C2036e(long j, C1959m mVar, final Runnable runnable) {
        this.f3962b = C2082o.m5001a(j, mVar, new Runnable() {
            public void run() {
                C2036e.this.mo14671a();
                Runnable runnable = runnable;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        this.f3963c = mVar;
        f3961a.add(this);
        mVar.mo14337aj().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
        mVar.mo14337aj().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
    }

    /* renamed from: a */
    public static C2036e m4876a(long j, C1959m mVar, Runnable runnable) {
        return new C2036e(j, mVar, runnable);
    }

    /* renamed from: a */
    public void mo14671a() {
        this.f3962b.mo14753d();
        this.f3963c.mo14337aj().unregisterReceiver(this);
        f3961a.remove(this);
    }

    /* renamed from: b */
    public long mo14672b() {
        return this.f3962b.mo14750a();
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            this.f3962b.mo14751b();
        } else if ("com.applovin.application_resumed".equals(action)) {
            this.f3962b.mo14752c();
        }
    }
}
