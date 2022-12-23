package com.bytedance.sdk.openadsdk.p130b;

import com.bytedance.sdk.component.utils.C2968h;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.utils.C4009p;

/* renamed from: com.bytedance.sdk.openadsdk.b.o */
/* compiled from: LastShowAdManager */
public class C3175o {
    /* renamed from: a */
    public static void m9300a(final C3498n nVar, final String str) {
        if (nVar != null) {
            C2968h.m8366a().post(new Runnable() {
                public void run() {
                    try {
                        C4009p.m13157a(nVar.mo19674ar().toString(), str);
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
