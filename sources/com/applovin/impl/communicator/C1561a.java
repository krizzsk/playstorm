package com.applovin.impl.communicator;

import android.content.Context;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.applovin.impl.communicator.a */
public class C1561a {

    /* renamed from: a */
    private final Context f1986a;

    /* renamed from: b */
    private final Set<C1562b> f1987b = new HashSet(32);

    /* renamed from: c */
    private final Object f1988c = new Object();

    public C1561a(Context context) {
        this.f1986a = context;
    }

    /* renamed from: a */
    private C1562b m2901a(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        for (C1562b next : this.f1987b) {
            if (str.equals(next.mo13051a()) && appLovinCommunicatorSubscriber.equals(next.mo13053b())) {
                return next;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0054, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo13048a(com.applovin.communicator.AppLovinCommunicatorSubscriber r7, java.lang.String r8) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x0072
            boolean r0 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r8)
            if (r0 != 0) goto L_0x0009
            goto L_0x0072
        L_0x0009:
            java.lang.Object r0 = r6.f1988c
            monitor-enter(r0)
            com.applovin.impl.communicator.b r1 = r6.m2901a((java.lang.String) r8, (com.applovin.communicator.AppLovinCommunicatorSubscriber) r7)     // Catch:{ all -> 0x006f }
            r2 = 1
            if (r1 == 0) goto L_0x0055
            boolean r3 = com.applovin.impl.sdk.C2092v.m5047a()     // Catch:{ all -> 0x006f }
            if (r3 == 0) goto L_0x003c
            java.lang.String r3 = "AppLovinCommunicator"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x006f }
            r4.<init>()     // Catch:{ all -> 0x006f }
            java.lang.String r5 = "Attempting to re-subscribe subscriber ("
            r4.append(r5)     // Catch:{ all -> 0x006f }
            r4.append(r7)     // Catch:{ all -> 0x006f }
            java.lang.String r7 = ") to topic ("
            r4.append(r7)     // Catch:{ all -> 0x006f }
            r4.append(r8)     // Catch:{ all -> 0x006f }
            java.lang.String r7 = ")"
            r4.append(r7)     // Catch:{ all -> 0x006f }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x006f }
            com.applovin.impl.sdk.C2092v.m5053i(r3, r7)     // Catch:{ all -> 0x006f }
        L_0x003c:
            boolean r7 = r1.mo13054c()     // Catch:{ all -> 0x006f }
            if (r7 != 0) goto L_0x0053
            r1.mo13052a(r2)     // Catch:{ all -> 0x006f }
            android.content.Context r7 = r6.f1986a     // Catch:{ all -> 0x006f }
            com.applovin.impl.sdk.AppLovinBroadcastManager r7 = com.applovin.impl.sdk.AppLovinBroadcastManager.getInstance(r7)     // Catch:{ all -> 0x006f }
            android.content.IntentFilter r3 = new android.content.IntentFilter     // Catch:{ all -> 0x006f }
            r3.<init>(r8)     // Catch:{ all -> 0x006f }
            r7.registerReceiver(r1, r3)     // Catch:{ all -> 0x006f }
        L_0x0053:
            monitor-exit(r0)     // Catch:{ all -> 0x006f }
            return r2
        L_0x0055:
            com.applovin.impl.communicator.b r1 = new com.applovin.impl.communicator.b     // Catch:{ all -> 0x006f }
            r1.<init>(r8, r7)     // Catch:{ all -> 0x006f }
            java.util.Set<com.applovin.impl.communicator.b> r7 = r6.f1987b     // Catch:{ all -> 0x006f }
            r7.add(r1)     // Catch:{ all -> 0x006f }
            monitor-exit(r0)     // Catch:{ all -> 0x006f }
            android.content.Context r7 = r6.f1986a
            com.applovin.impl.sdk.AppLovinBroadcastManager r7 = com.applovin.impl.sdk.AppLovinBroadcastManager.getInstance(r7)
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>(r8)
            r7.registerReceiver(r1, r0)
            return r2
        L_0x006f:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006f }
            throw r7
        L_0x0072:
            boolean r0 = com.applovin.impl.sdk.C2092v.m5047a()
            if (r0 == 0) goto L_0x009b
            java.lang.String r0 = "AppLovinCommunicator"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to subscribe - invalid subscriber ("
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = ") or topic ("
            r1.append(r7)
            r1.append(r8)
            java.lang.String r7 = ")"
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            com.applovin.impl.sdk.C2092v.m5053i(r0, r7)
        L_0x009b:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.communicator.C1561a.mo13048a(com.applovin.communicator.AppLovinCommunicatorSubscriber, java.lang.String):boolean");
    }

    /* renamed from: a */
    public boolean mo13049a(String str) {
        synchronized (this.f1988c) {
            for (C1562b a : this.f1987b) {
                if (str.equals(a.mo13051a())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: b */
    public void mo13050b(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        C1562b a;
        if (StringUtils.isValidString(str)) {
            synchronized (this.f1988c) {
                a = m2901a(str, appLovinCommunicatorSubscriber);
            }
            if (a != null) {
                a.mo13052a(false);
                AppLovinBroadcastManager.getInstance(this.f1986a).unregisterReceiver(a);
            }
        }
    }
}
