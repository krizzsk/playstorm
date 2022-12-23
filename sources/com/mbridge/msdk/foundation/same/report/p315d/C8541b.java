package com.mbridge.msdk.foundation.same.report.p315d;

import com.mbridge.msdk.foundation.same.net.C8480f;
import com.mbridge.msdk.foundation.same.net.C8501k;
import com.mbridge.msdk.foundation.same.net.p305a.C8452a;
import com.mbridge.msdk.foundation.same.net.p310f.C8481a;

/* renamed from: com.mbridge.msdk.foundation.same.report.d.b */
/* compiled from: ReportResponseHandler */
public abstract class C8541b extends C8480f<String> {

    /* renamed from: a */
    private static final String f20687a = C8541b.class.getSimpleName();

    /* renamed from: a */
    public abstract void mo15651a(String str);

    /* renamed from: b */
    public abstract void mo15652b(String str);

    /* renamed from: a */
    public final void mo57520a(C8501k<String> kVar) {
        if (kVar != null) {
            mo15651a((String) kVar.f20594a);
        }
    }

    /* renamed from: a */
    public final void mo57519a(C8452a aVar) {
        mo15652b(C8481a.m24481a(aVar));
    }
}
