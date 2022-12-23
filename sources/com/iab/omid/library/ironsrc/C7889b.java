package com.iab.omid.library.ironsrc;

import android.content.Context;
import com.iab.omid.library.ironsrc.p257b.C7891b;
import com.iab.omid.library.ironsrc.p257b.C7894d;
import com.iab.omid.library.ironsrc.p257b.C7897f;
import com.iab.omid.library.ironsrc.p259d.C7905b;
import com.iab.omid.library.ironsrc.p259d.C7909e;

/* renamed from: com.iab.omid.library.ironsrc.b */
public class C7889b {

    /* renamed from: a */
    private boolean f18778a;

    /* renamed from: b */
    private void m22297b(Context context) {
        C7909e.m22391a((Object) context, "Application Context cannot be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo55385a() {
        return "1.3.12-Ironsrc";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55386a(Context context) {
        m22297b(context);
        if (!mo55388b()) {
            mo55387a(true);
            C7897f.m22340a().mo55423a(context);
            C7891b.m22309a().mo55395a(context);
            C7905b.m22371a(context);
            C7894d.m22320a().mo55404a(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55387a(boolean z) {
        this.f18778a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo55388b() {
        return this.f18778a;
    }
}
