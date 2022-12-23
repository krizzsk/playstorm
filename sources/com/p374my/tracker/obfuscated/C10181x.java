package com.p374my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.p374my.tracker.MyTrackerConfig;
import java.net.URL;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.my.tracker.obfuscated.x */
public final class C10181x {

    /* renamed from: a */
    final AtomicReference<byte[]> f25505a = new AtomicReference<>();

    /* renamed from: b */
    final String f25506b;

    /* renamed from: c */
    final MyTrackerConfig.OkHttpClientProvider f25507c;

    /* renamed from: d */
    boolean f25508d = false;

    public C10181x(C10178v0 v0Var) {
        this.f25506b = m30494a(v0Var.mo66424k());
        this.f25507c = v0Var.mo66423j();
    }

    /* renamed from: a */
    static String m30494a(String str) {
        try {
            URL url = new URL(str);
            return url.getProtocol() + "://" + "ip4." + url.getAuthority();
        } catch (Throwable th) {
            C10175u0.m30441a("Ipv4DataProvider: error occurred while creating IPv4 url", th);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void m30495a() {
        /*
            r4 = this;
            java.lang.String r0 = "Ipv4DataProvider: get IPv4 address"
            com.p374my.tracker.obfuscated.C10175u0.m30440a((java.lang.String) r0)
            byte[] r0 = com.p374my.tracker.obfuscated.C10110g.f25183a
            com.my.tracker.MyTrackerConfig$OkHttpClientProvider r1 = r4.f25507c     // Catch:{ all -> 0x00a9 }
            com.my.tracker.obfuscated.t r1 = com.p374my.tracker.obfuscated.C10170t.m30424a((com.p374my.tracker.MyTrackerConfig.OkHttpClientProvider) r1)     // Catch:{ all -> 0x00a9 }
            java.lang.String r2 = r4.f25506b     // Catch:{ all -> 0x00a9 }
            com.my.tracker.obfuscated.t$b r1 = r1.mo66167a((java.lang.String) r2)     // Catch:{ all -> 0x00a9 }
            boolean r2 = r1.mo66385b()     // Catch:{ all -> 0x00a9 }
            if (r2 != 0) goto L_0x0030
            java.lang.String r1 = "Ipv4DataProvider: unsuccessful response from server"
            com.p374my.tracker.obfuscated.C10175u0.m30440a((java.lang.String) r1)     // Catch:{ all -> 0x00a9 }
            java.util.concurrent.atomic.AtomicReference<byte[]> r1 = r4.f25505a
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicReference<byte[]> r2 = r4.f25505a     // Catch:{ all -> 0x002d }
            r2.set(r0)     // Catch:{ all -> 0x002d }
            java.util.concurrent.atomic.AtomicReference<byte[]> r0 = r4.f25505a     // Catch:{ all -> 0x002d }
            r0.notify()     // Catch:{ all -> 0x002d }
            monitor-exit(r1)     // Catch:{ all -> 0x002d }
            return
        L_0x002d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002d }
            throw r0
        L_0x0030:
            java.lang.Object r1 = r1.mo66384a()     // Catch:{ all -> 0x00a9 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00a9 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00a9 }
            if (r2 == 0) goto L_0x0053
            java.lang.String r1 = "Ipv4DataProvider: empty response from server"
            com.p374my.tracker.obfuscated.C10175u0.m30440a((java.lang.String) r1)     // Catch:{ all -> 0x00a9 }
            java.util.concurrent.atomic.AtomicReference<byte[]> r1 = r4.f25505a
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicReference<byte[]> r2 = r4.f25505a     // Catch:{ all -> 0x0050 }
            r2.set(r0)     // Catch:{ all -> 0x0050 }
            java.util.concurrent.atomic.AtomicReference<byte[]> r0 = r4.f25505a     // Catch:{ all -> 0x0050 }
            r0.notify()     // Catch:{ all -> 0x0050 }
            monitor-exit(r1)     // Catch:{ all -> 0x0050 }
            return
        L_0x0050:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0050 }
            throw r0
        L_0x0053:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x00a9 }
            r2.<init>(r1)     // Catch:{ all -> 0x00a9 }
            java.lang.String r1 = "ip"
            java.lang.String r1 = r2.optString(r1)     // Catch:{ all -> 0x00a9 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00a9 }
            if (r2 == 0) goto L_0x007b
            java.lang.String r1 = "Ipv4DataProvider: IP is empty"
            com.p374my.tracker.obfuscated.C10175u0.m30440a((java.lang.String) r1)     // Catch:{ all -> 0x00a9 }
            java.util.concurrent.atomic.AtomicReference<byte[]> r1 = r4.f25505a
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicReference<byte[]> r2 = r4.f25505a     // Catch:{ all -> 0x0078 }
            r2.set(r0)     // Catch:{ all -> 0x0078 }
            java.util.concurrent.atomic.AtomicReference<byte[]> r0 = r4.f25505a     // Catch:{ all -> 0x0078 }
            r0.notify()     // Catch:{ all -> 0x0078 }
            monitor-exit(r1)     // Catch:{ all -> 0x0078 }
            return
        L_0x0078:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0078 }
            throw r0
        L_0x007b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a9 }
            r2.<init>()     // Catch:{ all -> 0x00a9 }
            java.lang.String r3 = "Ipv4DataProvider: IPv4 address is received "
            r2.append(r3)     // Catch:{ all -> 0x00a9 }
            r2.append(r1)     // Catch:{ all -> 0x00a9 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00a9 }
            com.p374my.tracker.obfuscated.C10175u0.m30440a((java.lang.String) r2)     // Catch:{ all -> 0x00a9 }
            java.net.InetAddress r1 = java.net.Inet4Address.getByName(r1)     // Catch:{ all -> 0x00a9 }
            byte[] r0 = r1.getAddress()     // Catch:{ all -> 0x00a9 }
            java.util.concurrent.atomic.AtomicReference<byte[]> r1 = r4.f25505a
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicReference<byte[]> r2 = r4.f25505a     // Catch:{ all -> 0x00a6 }
            r2.set(r0)     // Catch:{ all -> 0x00a6 }
            java.util.concurrent.atomic.AtomicReference<byte[]> r0 = r4.f25505a     // Catch:{ all -> 0x00a6 }
            r0.notify()     // Catch:{ all -> 0x00a6 }
            monitor-exit(r1)     // Catch:{ all -> 0x00a6 }
            goto L_0x00bd
        L_0x00a6:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00a6 }
            throw r0
        L_0x00a9:
            r1 = move-exception
            java.lang.String r2 = "Ipv4DataProvider: failed to get IPv4 address"
            com.p374my.tracker.obfuscated.C10175u0.m30445b(r2, r1)     // Catch:{ all -> 0x00c1 }
            java.util.concurrent.atomic.AtomicReference<byte[]> r1 = r4.f25505a
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicReference<byte[]> r2 = r4.f25505a     // Catch:{ all -> 0x00be }
            r2.set(r0)     // Catch:{ all -> 0x00be }
            java.util.concurrent.atomic.AtomicReference<byte[]> r0 = r4.f25505a     // Catch:{ all -> 0x00be }
            r0.notify()     // Catch:{ all -> 0x00be }
            monitor-exit(r1)     // Catch:{ all -> 0x00be }
        L_0x00bd:
            return
        L_0x00be:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00be }
            throw r0
        L_0x00c1:
            r1 = move-exception
            java.util.concurrent.atomic.AtomicReference<byte[]> r2 = r4.f25505a
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicReference<byte[]> r3 = r4.f25505a     // Catch:{ all -> 0x00d1 }
            r3.set(r0)     // Catch:{ all -> 0x00d1 }
            java.util.concurrent.atomic.AtomicReference<byte[]> r0 = r4.f25505a     // Catch:{ all -> 0x00d1 }
            r0.notify()     // Catch:{ all -> 0x00d1 }
            monitor-exit(r2)     // Catch:{ all -> 0x00d1 }
            throw r1
        L_0x00d1:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00d1 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.tracker.obfuscated.C10181x.m30495a():void");
    }

    /* renamed from: a */
    public void mo66433a(Context context) {
        if (!this.f25508d) {
            this.f25508d = true;
            if (TextUtils.isEmpty(this.f25506b)) {
                C10175u0.m30440a("Ipv4DataProvider: no IPv4 url");
                this.f25505a.set(C10110g.f25183a);
                return;
            }
            C10104d.m30024b(new Runnable() {
                public final void run() {
                    C10181x.this.m30495a();
                }
            });
            this.f25508d = true;
        }
    }

    /* renamed from: a */
    public void mo66434a(C10129m0 m0Var, Context context) {
        String str;
        byte[] bArr = this.f25505a.get();
        if (bArr == null) {
            try {
                C10175u0.m30440a("Ipv4DataProvider: waiting for collecting data");
                synchronized (this.f25505a) {
                    this.f25505a.wait(1000);
                }
                C10175u0.m30440a("Ipv4DataProvider: timeout for collecting IPv4 has exceeded");
                bArr = this.f25505a.get();
            } catch (Throwable unused) {
                C10175u0.m30440a("Ipv4DataProvider: attempt to block thread retrieving IPv4 finished unsuccessfully");
            }
        }
        if (bArr == null) {
            str = "Ipv4DataProvider: data hasn't been collected yet";
        } else if (bArr == C10110g.f25183a) {
            str = "Ipv4DataProvider: error occurred while collecting data";
        } else {
            m0Var.mo66284b(bArr);
            return;
        }
        C10175u0.m30440a(str);
    }

    /* renamed from: b */
    public void mo66435b(Context context) {
    }
}
