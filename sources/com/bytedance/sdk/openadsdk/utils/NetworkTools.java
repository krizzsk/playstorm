package com.bytedance.sdk.openadsdk.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.sdk.component.p125f.C2955g;
import com.bytedance.sdk.component.utils.C2979o;
import com.bytedance.sdk.openadsdk.core.C3578m;
import java.util.concurrent.atomic.AtomicBoolean;

public class NetworkTools {

    /* renamed from: a */
    private static int f10191a = 0;

    /* renamed from: b */
    private static long f10192b = -2147483648L;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final AtomicBoolean f10193c = new AtomicBoolean(false);

    /* renamed from: a */
    public static int m13018a(Context context, boolean z) {
        if (z || f10192b == -2147483648L) {
            m13025e(context);
            return f10191a;
        }
        if (System.currentTimeMillis() - f10192b >= 60000) {
            m13022c();
        }
        return f10191a;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m13022c() {
        if (f10193c.compareAndSet(false, true)) {
            C4013t.m13174a(new C2955g("getNetworkType") {
                public void run() {
                    NetworkTools.m13025e(C3578m.m11231a());
                    NetworkTools.f10193c.set(false);
                }
            });
        }
    }

    /* renamed from: a */
    public static int m13017a(Context context) {
        return m13018a(context, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m13025e(Context context) {
        f10191a = C2979o.m8409c(context);
        f10192b = System.currentTimeMillis();
    }

    /* renamed from: b */
    public static int m13020b(Context context) {
        int a = m13017a(context);
        if (a == 1) {
            return 0;
        }
        if (a == 4) {
            return 1;
        }
        if (a == 5) {
            return 4;
        }
        if (a != 6) {
            return a;
        }
        return 5;
    }

    /* renamed from: c */
    public static void m13023c(Context context) {
        if (context == null) {
            try {
                context = C3578m.m11231a();
            } catch (Throwable unused) {
                return;
            }
        }
        context.registerReceiver(new NetworkReceiver(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public static class NetworkReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                NetworkTools.m13022c();
            }
        }
    }
}
