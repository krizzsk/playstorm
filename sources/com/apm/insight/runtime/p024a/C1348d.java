package com.apm.insight.runtime.p024a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.apm.insight.C1176b;
import com.apm.insight.runtime.C1384p;

/* renamed from: com.apm.insight.runtime.a.d */
class C1348d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f1398a;

    /* renamed from: com.apm.insight.runtime.a.d$a */
    private class C1350a extends BroadcastReceiver {
        private C1350a() {
        }

        public void onReceive(Context context, Intent intent) {
            try {
                if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                    int unused = C1348d.this.f1398a = (int) ((((float) intent.getIntExtra("level", 0)) * 100.0f) / ((float) intent.getIntExtra("scale", 100)));
                }
            } catch (Throwable unused2) {
            }
        }
    }

    C1348d(final Context context) {
        C1384p.m2264b().mo12526a((Runnable) new Runnable() {
            public void run() {
                try {
                    C1348d.this.m2130a(context);
                } catch (Throwable th) {
                    C1176b.m1249a().mo12218a("NPTH_CATCH", th);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2130a(Context context) {
        context.registerReceiver(new C1350a(), new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    /* renamed from: a */
    public int mo12474a() {
        return this.f1398a;
    }
}
