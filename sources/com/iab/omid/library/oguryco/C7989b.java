package com.iab.omid.library.oguryco;

import android.content.Context;
import com.iab.omid.library.oguryco.p269b.C7991b;
import com.iab.omid.library.oguryco.p269b.C7995d;
import com.iab.omid.library.oguryco.p269b.C7998f;
import com.iab.omid.library.oguryco.p271d.C8006b;
import com.iab.omid.library.oguryco.p271d.C8010e;

/* renamed from: com.iab.omid.library.oguryco.b */
public class C7989b {

    /* renamed from: a */
    private boolean f19014a;

    /* renamed from: b */
    private void m22749b(Context context) {
        C8010e.m22850a((Object) context, "Application Context cannot be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo55795a() {
        return "1.3.1-Oguryco";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55796a(Context context) {
        m22749b(context);
        if (!mo55799b()) {
            mo55797a(true);
            C7998f.m22798a().mo55836a(context);
            C7991b.m22762a().mo55806a(context);
            C8006b.m22830a(context);
            C7995d.m22778a().mo55817a(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55797a(boolean z) {
        this.f19014a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo55798a(String str) {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo55799b() {
        return this.f19014a;
    }
}
