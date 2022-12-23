package com.iab.omid.library.vungle;

import android.content.Context;
import com.iab.omid.library.vungle.p281b.C8092b;
import com.iab.omid.library.vungle.p281b.C8095d;
import com.iab.omid.library.vungle.p281b.C8098f;
import com.iab.omid.library.vungle.p283d.C8106b;
import com.iab.omid.library.vungle.p283d.C8110e;

/* renamed from: com.iab.omid.library.vungle.b */
public class C8090b {

    /* renamed from: a */
    private boolean f19243a;

    /* renamed from: b */
    private void m23201b(Context context) {
        C8110e.m23298a((Object) context, "Application Context cannot be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo56178a() {
        return "1.3.21-Vungle";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo56179a(Context context) {
        m23201b(context);
        if (!mo56181b()) {
            mo56180a(true);
            C8098f.m23246a().mo56224a(context);
            C8092b.m23213a().mo56188a(context);
            C8106b.m23278a(context);
            C8095d.m23226a().mo56205a(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo56180a(boolean z) {
        this.f19243a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo56181b() {
        return this.f19243a;
    }
}
