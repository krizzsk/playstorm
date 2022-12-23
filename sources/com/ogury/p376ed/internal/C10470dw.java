package com.ogury.p376ed.internal;

import android.content.Context;
import com.ogury.core.internal.network.OguryNetworkClient;
import com.ogury.p376ed.internal.C10465ds;

/* renamed from: com.ogury.ed.internal.dw */
public final class C10470dw {

    /* renamed from: a */
    public static final C10470dw f26453a = new C10470dw();

    /* renamed from: b */
    private static C10469dv f26454b;

    private C10470dw() {
    }

    /* renamed from: a */
    public static C10469dv m31662a(Context context) {
        int i;
        C10765mq.m32773b(context, "context");
        if (f26454b == null) {
            Context applicationContext = context.getApplicationContext();
            C10465ds.C10466a aVar = C10465ds.f26447a;
            C10765mq.m32770a((Object) applicationContext, "appContext");
            C10465ds a = C10465ds.C10466a.m31652a(applicationContext, new C10463dq(applicationContext));
            C10531fn fnVar = C10531fn.f26635a;
            C10530fm a2 = C10531fn.m32005a(context);
            Integer valueOf = a2 == null ? null : Integer.valueOf(a2.mo67437l());
            if (valueOf == null) {
                i = C10533fp.m32017a(3);
            } else {
                i = valueOf.intValue();
            }
            f26454b = new C10471dx(a, new C10514fa(applicationContext), new C10510ez(applicationContext), C10430dc.f26375a, new OguryNetworkClient(i, i * 5), new C10542fx(applicationContext));
        }
        C10469dv dvVar = f26454b;
        C10765mq.m32769a((Object) dvVar);
        return dvVar;
    }
}
