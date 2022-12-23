package com.iab.omid.library.fyber;

import android.content.Context;
import com.iab.omid.library.fyber.p245b.C7790b;
import com.iab.omid.library.fyber.p245b.C7793d;
import com.iab.omid.library.fyber.p245b.C7796f;
import com.iab.omid.library.fyber.p247d.C7804b;
import com.iab.omid.library.fyber.p247d.C7808e;

/* renamed from: com.iab.omid.library.fyber.b */
public class C7788b {

    /* renamed from: a */
    private boolean f18549a;

    /* renamed from: b */
    private void m21845b(Context context) {
        C7808e.m21944a((Object) context, "Application Context cannot be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo54996a() {
        return "1.3.30-Fyber";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54997a(Context context) {
        m21845b(context);
        if (!mo54999b()) {
            mo54998a(true);
            C7796f.m21890a().mo55042a(context);
            C7790b.m21857a().mo55006a(context);
            C7804b.m21922a(context);
            C7793d.m21870a().mo55023a(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54998a(boolean z) {
        this.f18549a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo54999b() {
        return this.f18549a;
    }
}
