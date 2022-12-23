package com.iab.omid.library.mmadbridge;

import android.content.Context;
import com.iab.omid.library.mmadbridge.p263b.C7941b;
import com.iab.omid.library.mmadbridge.p263b.C7944d;
import com.iab.omid.library.mmadbridge.p263b.C7947f;
import com.iab.omid.library.mmadbridge.p265d.C7955b;
import com.iab.omid.library.mmadbridge.p265d.C7959e;

/* renamed from: com.iab.omid.library.mmadbridge.b */
public class C7939b {

    /* renamed from: a */
    private boolean f18893a;

    /* renamed from: b */
    private void m22520b(Context context) {
        C7959e.m22619a((Object) context, "Application Context cannot be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo55575a() {
        return "1.3.29-Mmadbridge";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55576a(Context context) {
        m22520b(context);
        if (!mo55578b()) {
            mo55577a(true);
            C7947f.m22565a().mo55621a(context);
            C7941b.m22532a().mo55585a(context);
            C7955b.m22597a(context);
            C7944d.m22545a().mo55602a(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55577a(boolean z) {
        this.f18893a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo55578b() {
        return this.f18893a;
    }
}
