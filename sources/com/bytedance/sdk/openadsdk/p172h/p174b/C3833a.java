package com.bytedance.sdk.openadsdk.p172h.p174b;

import com.bytedance.sdk.component.p125f.C2949c;
import com.bytedance.sdk.component.p125f.C2952e;
import com.bytedance.sdk.component.p125f.C2955g;
import com.bytedance.sdk.component.p125f.p126a.C2947a;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.p172h.C3815b;

/* renamed from: com.bytedance.sdk.openadsdk.h.b.a */
/* compiled from: ReportThreadLogServiceImp */
public class C3833a implements C2949c {
    /* renamed from: a */
    public void mo17869a(final C2947a aVar) {
        if (C3578m.m11241h().mo19919F() && aVar != null && aVar.mo17863a() != null) {
            C2952e.m8308a(new C2955g("ReportThreadLogServiceImp") {
                public void run() {
                    C3815b.m12552a().mo20663a("stats_sdk_thread_num", aVar.mo17863a());
                }
            }, 5);
        }
    }
}
