package com.mbridge.msdk.foundation.same.p304f;

import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.same.net.p310f.C8487d;
import com.mbridge.msdk.foundation.same.report.C8542e;
import com.mbridge.msdk.foundation.same.report.p315d.C8540a;
import com.mbridge.msdk.foundation.same.report.p315d.C8541b;
import com.mbridge.msdk.foundation.tools.C8608u;

/* renamed from: com.mbridge.msdk.foundation.same.f.a */
/* compiled from: ReportTask */
public final class C8440a implements Runnable {

    /* renamed from: a */
    private String f20418a;

    /* renamed from: b */
    private String f20419b;

    public C8440a(String str, String str2) {
        this.f20418a = str;
        this.f20419b = str2;
    }

    public final void run() {
        try {
            new C8540a(C2350a.m5601e().mo15792g()).mo57603c(0, C8487d.m24492a().f20531a, C8542e.m24691a(this.f20418a, C2350a.m5601e().mo15792g(), this.f20419b), new C8541b() {
                /* renamed from: a */
                public final void mo15651a(String str) {
                    C8608u.m24884d("ReportTask", str);
                }

                /* renamed from: b */
                public final void mo15652b(String str) {
                    C8608u.m24884d("ReportTask", str);
                }
            });
        } catch (Throwable th) {
            C8608u.m24884d("ReportTask", th.getMessage());
        }
    }
}
