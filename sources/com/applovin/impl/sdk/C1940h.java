package com.applovin.impl.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.sdk.h */
public class C1940h extends BroadcastReceiver implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    public static int f3603a = -1;

    /* renamed from: b */
    private final AudioManager f3604b;

    /* renamed from: c */
    private final Context f3605c;

    /* renamed from: d */
    private final C1959m f3606d;

    /* renamed from: e */
    private final Set<C1942a> f3607e = new HashSet();

    /* renamed from: f */
    private final Object f3608f = new Object();

    /* renamed from: g */
    private boolean f3609g;

    /* renamed from: h */
    private int f3610h;

    /* renamed from: com.applovin.impl.sdk.h$a */
    public interface C1942a {
        /* renamed from: a */
        void mo12791a(int i);
    }

    C1940h(C1959m mVar) {
        this.f3606d = mVar;
        Context L = mVar.mo14297L();
        this.f3605c = L;
        this.f3604b = (AudioManager) L.getSystemService("audio");
    }

    /* renamed from: a */
    public static boolean m4342a(int i) {
        return i == 0 || i == 1;
    }

    /* renamed from: b */
    private void m4343b() {
        if (C2092v.m5047a()) {
            this.f3606d.mo14286A().mo14789b("AudioSessionManager", "Observing ringer mode...");
        }
        this.f3610h = f3603a;
        this.f3605c.registerReceiver(this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        this.f3606d.mo14337aj().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
        this.f3606d.mo14337aj().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
    }

    /* renamed from: b */
    private void m4344b(final int i) {
        if (!this.f3609g) {
            if (C2092v.m5047a()) {
                C2092v A = this.f3606d.mo14286A();
                A.mo14789b("AudioSessionManager", "Ringer mode is " + i);
            }
            synchronized (this.f3608f) {
                for (final C1942a next : this.f3607e) {
                    AppLovinSdkUtils.runOnUiThread(new Runnable() {
                        public void run() {
                            next.mo12791a(i);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: c */
    private void m4345c() {
        if (C2092v.m5047a()) {
            this.f3606d.mo14286A().mo14789b("AudioSessionManager", "Stopping observation of mute switch state...");
        }
        this.f3605c.unregisterReceiver(this);
        this.f3606d.mo14337aj().unregisterReceiver(this);
    }

    /* renamed from: a */
    public int mo14251a() {
        return this.f3604b.getRingerMode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14252a(com.applovin.impl.sdk.C1940h.C1942a r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f3608f
            monitor-enter(r0)
            java.util.Set<com.applovin.impl.sdk.h$a> r1 = r2.f3607e     // Catch:{ all -> 0x0020 }
            boolean r1 = r1.contains(r3)     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return
        L_0x000d:
            java.util.Set<com.applovin.impl.sdk.h$a> r1 = r2.f3607e     // Catch:{ all -> 0x0020 }
            r1.add(r3)     // Catch:{ all -> 0x0020 }
            java.util.Set<com.applovin.impl.sdk.h$a> r3 = r2.f3607e     // Catch:{ all -> 0x0020 }
            int r3 = r3.size()     // Catch:{ all -> 0x0020 }
            r1 = 1
            if (r3 != r1) goto L_0x001e
            r2.m4343b()     // Catch:{ all -> 0x0020 }
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return
        L_0x0020:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C1940h.mo14252a(com.applovin.impl.sdk.h$a):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14253b(com.applovin.impl.sdk.C1940h.C1942a r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f3608f
            monitor-enter(r0)
            java.util.Set<com.applovin.impl.sdk.h$a> r1 = r2.f3607e     // Catch:{ all -> 0x001f }
            boolean r1 = r1.contains(r3)     // Catch:{ all -> 0x001f }
            if (r1 != 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return
        L_0x000d:
            java.util.Set<com.applovin.impl.sdk.h$a> r1 = r2.f3607e     // Catch:{ all -> 0x001f }
            r1.remove(r3)     // Catch:{ all -> 0x001f }
            java.util.Set<com.applovin.impl.sdk.h$a> r3 = r2.f3607e     // Catch:{ all -> 0x001f }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x001d
            r2.m4345c()     // Catch:{ all -> 0x001f }
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return
        L_0x001f:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C1940h.mo14253b(com.applovin.impl.sdk.h$a):void");
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
            m4344b(this.f3604b.getRingerMode());
        }
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            this.f3609g = true;
            this.f3610h = this.f3604b.getRingerMode();
        } else if ("com.applovin.application_resumed".equals(action)) {
            this.f3609g = false;
            if (this.f3610h != this.f3604b.getRingerMode()) {
                this.f3610h = f3603a;
                m4344b(this.f3604b.getRingerMode());
            }
        }
    }
}
