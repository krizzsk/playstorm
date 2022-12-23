package com.applovin.impl.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.p048c.C1856a;
import com.applovin.impl.sdk.utils.C2082o;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.b */
public class C1837b implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    private final C1959m f2973a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1839a f2974b;

    /* renamed from: c */
    private C2082o f2975c;

    /* renamed from: d */
    private final Object f2976d = new Object();

    /* renamed from: e */
    private long f2977e;

    /* renamed from: com.applovin.impl.sdk.b$a */
    public interface C1839a {
        void onAdExpired();
    }

    public C1837b(C1959m mVar, C1839a aVar) {
        this.f2973a = mVar;
        this.f2974b = aVar;
    }

    /* renamed from: b */
    private void m3969b() {
        C2082o oVar = this.f2975c;
        if (oVar != null) {
            oVar.mo14753d();
            this.f2975c = null;
        }
    }

    /* renamed from: c */
    private void m3970c() {
        synchronized (this.f2976d) {
            m3969b();
        }
    }

    /* renamed from: d */
    private void m3971d() {
        boolean z;
        synchronized (this.f2976d) {
            long currentTimeMillis = this.f2977e - System.currentTimeMillis();
            if (currentTimeMillis <= 0) {
                mo14024a();
                z = true;
            } else {
                mo14025a(currentTimeMillis);
                z = false;
            }
        }
        if (z) {
            this.f2974b.onAdExpired();
        }
    }

    /* renamed from: a */
    public void mo14024a() {
        synchronized (this.f2976d) {
            m3969b();
            this.f2973a.mo14337aj().unregisterReceiver(this);
        }
    }

    /* renamed from: a */
    public void mo14025a(long j) {
        synchronized (this.f2976d) {
            mo14024a();
            this.f2977e = System.currentTimeMillis() + j;
            this.f2973a.mo14337aj().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
            this.f2973a.mo14337aj().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
            if (((Boolean) this.f2973a.mo14311a(C1856a.f3022E)).booleanValue() || !this.f2973a.mo14331ad().mo14802a()) {
                this.f2975c = C2082o.m5001a(j, this.f2973a, new Runnable() {
                    public void run() {
                        C1837b.this.mo14024a();
                        C1837b.this.f2974b.onAdExpired();
                    }
                });
            }
        }
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            m3970c();
        } else if ("com.applovin.application_resumed".equals(action)) {
            m3971d();
        }
    }
}
