package com.iab.omid.library.applovin;

import android.content.Context;
import com.iab.omid.library.applovin.p233b.C7689b;
import com.iab.omid.library.applovin.p233b.C7692d;
import com.iab.omid.library.applovin.p233b.C7695f;
import com.iab.omid.library.applovin.p235d.C7703b;
import com.iab.omid.library.applovin.p235d.C7707e;

/* renamed from: com.iab.omid.library.applovin.b */
public class C7687b {

    /* renamed from: a */
    private boolean f18319a;

    /* renamed from: b */
    private void m21391b(Context context) {
        C7707e.m21490a((Object) context, "Application Context cannot be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo54603a() {
        return "1.3.30-Applovin";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54604a(Context context) {
        m21391b(context);
        if (!mo54606b()) {
            mo54605a(true);
            C7695f.m21436a().mo54649a(context);
            C7689b.m21403a().mo54613a(context);
            C7703b.m21468a(context);
            C7692d.m21416a().mo54630a(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54605a(boolean z) {
        this.f18319a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo54606b() {
        return this.f18319a;
    }
}
