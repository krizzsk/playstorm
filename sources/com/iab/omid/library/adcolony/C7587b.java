package com.iab.omid.library.adcolony;

import android.content.Context;
import com.iab.omid.library.adcolony.p221b.C7589b;
import com.iab.omid.library.adcolony.p221b.C7592d;
import com.iab.omid.library.adcolony.p221b.C7595f;
import com.iab.omid.library.adcolony.p223d.C7603b;
import com.iab.omid.library.adcolony.p223d.C7607e;

/* renamed from: com.iab.omid.library.adcolony.b */
public class C7587b {

    /* renamed from: a */
    private boolean f18085a;

    /* renamed from: b */
    private void m20931b(Context context) {
        C7607e.m21030a((Object) context, "Application Context cannot be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo54205a() {
        return "1.3.30-Adcolony";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54206a(Context context) {
        m20931b(context);
        if (!mo54208b()) {
            mo54207a(true);
            C7595f.m20976a().mo54251a(context);
            C7589b.m20943a().mo54215a(context);
            C7603b.m21008a(context);
            C7592d.m20956a().mo54232a(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54207a(boolean z) {
        this.f18085a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo54208b() {
        return this.f18085a;
    }
}
