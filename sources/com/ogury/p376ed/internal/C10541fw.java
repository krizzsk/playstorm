package com.ogury.p376ed.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: com.ogury.ed.internal.fw */
public final class C10541fw {
    /* renamed from: a */
    public static final NetworkInfo m32048a(Context context) {
        C10765mq.m32773b(context, "<this>");
        if (!C10555gh.m32084a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return null;
        }
        Object systemService = context.getSystemService("connectivity");
        if (systemService != null) {
            return ((ConnectivityManager) systemService).getActiveNetworkInfo();
        }
        throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
    }

    /* renamed from: a */
    public static final boolean m32049a(NetworkInfo networkInfo) {
        C10765mq.m32773b(networkInfo, "<this>");
        return networkInfo.isConnected() && networkInfo.getType() == 1;
    }

    /* renamed from: b */
    public static final boolean m32050b(Context context) {
        C10765mq.m32773b(context, "<this>");
        NetworkInfo a = m32048a(context);
        return a != null && a.isConnected();
    }
}
