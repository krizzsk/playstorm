package com.fyber.inneractive.sdk.util;

import com.tapjoy.TapjoyConstants;

/* renamed from: com.fyber.inneractive.sdk.util.k0 */
public enum C5349k0 {
    UNKNOWN(""),
    ETHERNET("3g"),
    WIFI(TapjoyConstants.TJC_CONNECTION_TYPE_WIFI),
    MOBILE_3G("3g"),
    MOBILE_4G("4g");
    

    /* renamed from: a */
    public final String f14215a;

    /* access modifiers changed from: public */
    C5349k0(String str) {
        this.f14215a = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0048  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.fyber.inneractive.sdk.util.C5349k0 m16751f() {
        /*
            android.app.Application r0 = com.fyber.inneractive.sdk.util.C5350l.f14216a     // Catch:{ Exception -> 0x001d }
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ Exception -> 0x001d }
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ Exception -> 0x001d }
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = com.fyber.inneractive.sdk.util.C5350l.m16763b((java.lang.String) r1)     // Catch:{ Exception -> 0x001d }
            if (r1 == 0) goto L_0x001d
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ Exception -> 0x001d }
            if (r0 == 0) goto L_0x001d
            int r0 = r0.getType()     // Catch:{ Exception -> 0x001d }
            goto L_0x001f
        L_0x001d:
            r0 = 8
        L_0x001f:
            r1 = 9
            if (r0 == r1) goto L_0x0048
            if (r0 == 0) goto L_0x003a
            r1 = 1
            if (r0 == r1) goto L_0x0037
            r1 = 2
            if (r0 == r1) goto L_0x003a
            r1 = 3
            if (r0 == r1) goto L_0x003a
            r1 = 4
            if (r0 == r1) goto L_0x003a
            r1 = 5
            if (r0 == r1) goto L_0x003a
            com.fyber.inneractive.sdk.util.k0 r0 = UNKNOWN
            return r0
        L_0x0037:
            com.fyber.inneractive.sdk.util.k0 r0 = WIFI
            return r0
        L_0x003a:
            int r0 = com.fyber.inneractive.sdk.util.C5348k.m16744i()
            r1 = 13
            if (r0 != r1) goto L_0x0045
            com.fyber.inneractive.sdk.util.k0 r0 = MOBILE_4G
            goto L_0x0047
        L_0x0045:
            com.fyber.inneractive.sdk.util.k0 r0 = MOBILE_3G
        L_0x0047:
            return r0
        L_0x0048:
            com.fyber.inneractive.sdk.util.k0 r0 = ETHERNET
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.C5349k0.m16751f():com.fyber.inneractive.sdk.util.k0");
    }
}
