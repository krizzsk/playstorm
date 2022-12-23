package com.iab.omid.library.amazon;

import android.content.Context;
import com.iab.omid.library.amazon.p227b.C7639b;
import com.iab.omid.library.amazon.p227b.C7642d;
import com.iab.omid.library.amazon.p227b.C7645f;
import com.iab.omid.library.amazon.p229d.C7653b;
import com.iab.omid.library.amazon.p229d.C7657e;

/* renamed from: com.iab.omid.library.amazon.b */
public class C7637b {

    /* renamed from: a */
    private boolean f18202a;

    /* renamed from: b */
    private void m21161b(Context context) {
        C7657e.m21260a((Object) context, "Application Context cannot be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo54404a() {
        return "1.3.28-Amazon";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54405a(Context context) {
        m21161b(context);
        if (!mo54407b()) {
            mo54406a(true);
            C7645f.m21206a().mo54450a(context);
            C7639b.m21173a().mo54414a(context);
            C7653b.m21238a(context);
            C7642d.m21186a().mo54431a(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54406a(boolean z) {
        this.f18202a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo54407b() {
        return this.f18202a;
    }
}
