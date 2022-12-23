package com.mbridge.msdk.foundation.same.net;

import android.content.Context;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.same.net.p308d.C8468b;

/* renamed from: com.mbridge.msdk.foundation.same.net.n */
/* compiled from: VolleyManager */
public final class C8507n {

    /* renamed from: c */
    private static C8507n f20610c;

    /* renamed from: a */
    private C8499j f20611a;

    /* renamed from: b */
    private C8468b f20612b;

    private C8507n() {
    }

    /* renamed from: a */
    public static void m24587a(Context context) {
        if (f20610c == null) {
            C8507n nVar = new C8507n();
            f20610c = nVar;
            nVar.f20611a = new C8499j(context.getApplicationContext());
            f20610c.f20612b = new C8468b(m24589b(), 3);
        }
    }

    /* renamed from: a */
    public static void m24588a(C8498i iVar) {
        m24589b().mo57638a(iVar);
    }

    /* renamed from: b */
    private static C8499j m24589b() {
        C8507n nVar = f20610c;
        if (nVar != null) {
            C8499j jVar = nVar.f20611a;
            if (jVar != null) {
                return jVar;
            }
            nVar.f20611a = new C8499j(C2350a.m5601e().mo15792g());
            return f20610c.f20611a;
        }
        C8507n nVar2 = new C8507n();
        f20610c = nVar2;
        if (nVar2.f20611a == null) {
            nVar2.f20611a = new C8499j(C2350a.m5601e().mo15792g());
        }
        return f20610c.f20611a;
    }

    /* renamed from: a */
    public static C8468b m24586a() {
        C8507n nVar = f20610c;
        if (nVar != null) {
            C8468b bVar = nVar.f20612b;
            if (bVar != null) {
                return bVar;
            }
            nVar.f20612b = new C8468b(m24589b(), 3);
            return f20610c.f20612b;
        }
        C8507n nVar2 = new C8507n();
        f20610c = nVar2;
        if (nVar2.f20612b == null) {
            nVar2.f20612b = new C8468b(m24589b(), 3);
        }
        return f20610c.f20612b;
    }
}
