package com.iab.omid.library.inmobi;

import android.content.Context;
import com.iab.omid.library.inmobi.p251b.C7841b;
import com.iab.omid.library.inmobi.p251b.C7844d;
import com.iab.omid.library.inmobi.p251b.C7847f;
import com.iab.omid.library.inmobi.p253d.C7855b;
import com.iab.omid.library.inmobi.p253d.C7859e;

/* renamed from: com.iab.omid.library.inmobi.b */
public class C7839b {

    /* renamed from: a */
    private boolean f18665a;

    /* renamed from: b */
    private void m22073b(Context context) {
        C7859e.m22170a((Object) context, "Application Context cannot be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo55191a() {
        return "1.3.17-Inmobi";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55192a(Context context) {
        m22073b(context);
        if (!mo55194b()) {
            mo55193a(true);
            C7847f.m22118a().mo55237a(context);
            C7841b.m22085a().mo55201a(context);
            C7855b.m22150a(context);
            C7844d.m22098a().mo55218a(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55193a(boolean z) {
        this.f18665a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo55194b() {
        return this.f18665a;
    }
}
