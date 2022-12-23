package com.bytedance.sdk.openadsdk.p172h.p175c;

import com.bytedance.sdk.component.p125f.C2955g;
import com.bytedance.sdk.openadsdk.multipro.p184c.C3957a;
import com.bytedance.sdk.openadsdk.p172h.C3812a;
import com.bytedance.sdk.openadsdk.p172h.p175c.C3837c;
import com.bytedance.sdk.openadsdk.utils.C4002l;
import com.bytedance.sdk.openadsdk.utils.C4013t;

/* renamed from: com.bytedance.sdk.openadsdk.h.c.d */
/* compiled from: LogUploaderImpl4MultiProcess */
public class C3841d implements C3835a {
    /* renamed from: b */
    public void mo20678b() {
    }

    /* renamed from: a */
    public void mo20675a() {
        C3957a.m12921e();
    }

    /* renamed from: a */
    public void mo20676a(final C3812a aVar) {
        try {
            C4013t.m13175b(new C2955g("uploadEvent") {
                public void run() {
                    try {
                        C3957a.m12918b(aVar.mo18671a().mo20631a().toString());
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public String m12609b(C3812a aVar) throws Exception {
        return new C3837c.C3840a(C4002l.m13120a(), aVar.mo18671a().mo20631a()).mo20684a();
    }

    /* renamed from: a */
    public void mo20677a(final C3812a aVar, final boolean z) {
        try {
            C4013t.m13175b(new C2955g("uploadEvent") {
                public void run() {
                    try {
                        C3957a.m12915a(C3841d.this.m12609b(aVar), z);
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }
}
