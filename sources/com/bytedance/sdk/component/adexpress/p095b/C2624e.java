package com.bytedance.sdk.component.adexpress.p095b;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.p095b.C2629i;

/* renamed from: com.bytedance.sdk.component.adexpress.b.e */
/* compiled from: NativeRenderInterceptor */
public class C2624e implements C2629i {

    /* renamed from: a */
    private Context f5623a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C2619a f5624b;

    /* renamed from: c */
    private C2633l f5625c;

    /* renamed from: a */
    public void mo16711a() {
    }

    /* renamed from: b */
    public void mo16713b() {
    }

    /* renamed from: c */
    public void mo16714c() {
    }

    public C2624e(Context context, C2633l lVar, C2619a aVar) {
        this.f5623a = context;
        this.f5624b = aVar;
        this.f5625c = lVar;
    }

    /* renamed from: a */
    public boolean mo16712a(final C2629i.C2630a aVar) {
        this.f5625c.mo16751c().mo16731d();
        this.f5624b.mo16719a(new C2626f() {
            /* renamed from: a */
            public void mo16717a(View view, C2635m mVar) {
                if (!aVar.mo16746c()) {
                    C2636n b = aVar.mo16744b();
                    if (b != null) {
                        b.mo16808a(C2624e.this.f5624b, mVar);
                    }
                    aVar.mo16743a(true);
                }
            }

            /* renamed from: a */
            public void mo16716a(int i) {
                C2636n b = aVar.mo16744b();
                if (b != null) {
                    b.mo16809a_(i);
                }
            }
        });
        return true;
    }

    /* renamed from: a */
    public void mo16721a(C2622c cVar) {
        this.f5624b.mo16709a(cVar);
    }
}
