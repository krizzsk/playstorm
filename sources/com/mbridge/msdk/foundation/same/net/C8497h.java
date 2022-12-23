package com.mbridge.msdk.foundation.same.net;

import android.content.Context;
import android.os.Process;
import com.mbridge.msdk.foundation.same.net.p305a.C8452a;
import com.mbridge.msdk.foundation.same.net.p309e.C8477a;
import com.mbridge.msdk.foundation.same.net.p309e.C8479c;
import com.mbridge.msdk.foundation.same.net.stack.C8508a;
import com.mbridge.msdk.foundation.same.net.stack.OkHttpStack;
import com.mbridge.msdk.foundation.tools.C8608u;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.mbridge.msdk.foundation.same.net.h */
/* compiled from: NetworkDispatcher */
public class C8497h {

    /* renamed from: a */
    private static final String f20572a = C8497h.class.getSimpleName();

    /* renamed from: b */
    private C8508a f20573b = new OkHttpStack();

    /* renamed from: c */
    private C8490g f20574c;

    /* renamed from: d */
    private C8455c f20575d;

    public C8497h(Context context, SSLSocketFactory sSLSocketFactory, C8455c cVar) {
        this.f20574c = new C8477a(this.f20573b, cVar);
        this.f20575d = cVar;
    }

    /* renamed from: a */
    public final void mo57609a(C8498i iVar) {
        Process.setThreadPriority(10);
        try {
            this.f20575d.mo57554c(iVar);
            if (iVar.mo57622c()) {
                iVar.mo57618a("network-discard-cancelled");
                this.f20575d.mo57553b(iVar);
                this.f20575d.mo57549a(iVar);
                return;
            }
            this.f20575d.mo57555d(iVar);
            this.f20575d.mo57552a((C8498i<?>) iVar, (C8501k<?>) iVar.mo57571a(this.f20574c.mo57581a(iVar)));
        } catch (C8452a e) {
            this.f20575d.mo57551a((C8498i<?>) iVar, e);
        } catch (Exception e2) {
            String str = f20572a;
            C8608u.m24884d(str, "Unhandled exception " + e2.getMessage());
            this.f20575d.mo57551a((C8498i<?>) iVar, new C8452a(4, (C8479c) null));
        }
    }
}
