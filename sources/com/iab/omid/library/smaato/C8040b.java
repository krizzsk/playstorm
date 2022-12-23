package com.iab.omid.library.smaato;

import android.content.Context;
import com.iab.omid.library.smaato.p275b.C8042b;
import com.iab.omid.library.smaato.p275b.C8045d;
import com.iab.omid.library.smaato.p275b.C8048f;
import com.iab.omid.library.smaato.p277d.C8056b;
import com.iab.omid.library.smaato.p277d.C8060e;

/* renamed from: com.iab.omid.library.smaato.b */
public class C8040b {

    /* renamed from: a */
    private boolean f19130a;

    /* renamed from: b */
    private void m22977b(Context context) {
        C8060e.m23074a((Object) context, "Application Context cannot be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo55984a() {
        return "1.3.15-Smaato";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55985a(Context context) {
        m22977b(context);
        if (!mo55987b()) {
            mo55986a(true);
            C8048f.m23022a().mo56030a(context);
            C8042b.m22989a().mo55994a(context);
            C8056b.m23054a(context);
            C8045d.m23002a().mo56011a(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55986a(boolean z) {
        this.f19130a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo55987b() {
        return this.f19130a;
    }
}
