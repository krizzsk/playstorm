package com.bytedance.sdk.component.adexpress.p095b;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.C2690c;
import com.bytedance.sdk.component.adexpress.dynamic.p098a.C2652a;
import com.bytedance.sdk.component.adexpress.dynamic.p101c.C2705h;
import com.bytedance.sdk.component.adexpress.dynamic.p101c.C2707i;
import com.bytedance.sdk.component.adexpress.dynamic.p102d.C2712a;
import com.bytedance.sdk.component.adexpress.p095b.C2629i;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;

/* renamed from: com.bytedance.sdk.component.adexpress.b.b */
/* compiled from: DynamicRenderInterceptor */
public class C2620b implements C2629i {

    /* renamed from: a */
    private Context f5615a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C2652a f5616b;

    /* renamed from: c */
    private ThemeStatusBroadcastReceiver f5617c;

    /* renamed from: d */
    private C2627g f5618d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C2633l f5619e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f5620f;

    /* renamed from: b */
    public void mo16713b() {
    }

    /* renamed from: c */
    public void mo16714c() {
    }

    public C2620b(Context context, C2633l lVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z, C2707i iVar, C2627g gVar, C2712a aVar) {
        this.f5615a = context;
        this.f5619e = lVar;
        this.f5617c = themeStatusBroadcastReceiver;
        this.f5618d = gVar;
        C2652a aVar2 = new C2652a(this.f5615a, this.f5617c, z, iVar, this.f5619e, aVar);
        this.f5616b = aVar2;
        aVar2.mo16870a(this.f5618d);
        if (iVar instanceof C2705h) {
            this.f5620f = 3;
        } else {
            this.f5620f = 2;
        }
    }

    /* renamed from: a */
    public boolean mo16712a(final C2629i.C2630a aVar) {
        this.f5619e.mo16751c().mo16728b(this.f5620f);
        this.f5616b.mo16719a((C2626f) new C2626f() {
            /* renamed from: a */
            public void mo16717a(View view, C2635m mVar) {
                if (!aVar.mo16746c()) {
                    C2620b.this.f5619e.mo16751c().mo16736f(C2620b.this.f5620f);
                    C2620b.this.f5619e.mo16751c().mo16738g(C2620b.this.f5620f);
                    C2620b.this.f5619e.mo16751c().mo16739h();
                    C2636n b = aVar.mo16744b();
                    if (b != null) {
                        b.mo16808a(C2620b.this.f5616b, mVar);
                        aVar.mo16743a(true);
                    }
                }
            }

            /* renamed from: a */
            public void mo16716a(int i) {
                C2620b.this.f5619e.mo16751c().mo16725a(C2620b.this.f5620f, i, aVar.mo16745b(C2620b.this));
                if (aVar.mo16745b(C2620b.this)) {
                    aVar.mo16741a((C2629i) C2620b.this);
                    return;
                }
                C2636n b = aVar.mo16744b();
                if (b != null) {
                    b.mo16809a_(i);
                }
            }
        });
        return true;
    }

    /* renamed from: a */
    public void mo16711a() {
        C2652a aVar = this.f5616b;
        if (aVar != null) {
            aVar.mo16871b();
        }
    }

    /* renamed from: d */
    public C2690c mo16715d() {
        C2652a aVar = this.f5616b;
        if (aVar != null) {
            return aVar.mo16872d();
        }
        return null;
    }
}
