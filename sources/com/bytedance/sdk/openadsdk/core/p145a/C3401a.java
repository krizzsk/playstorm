package com.bytedance.sdk.openadsdk.core.p145a;

import com.bykv.p068vk.openvk.component.video.p069a.p080c.C2482a;
import com.bytedance.sdk.openadsdk.core.C3568k;
import com.bytedance.sdk.openadsdk.core.C3581n;
import com.bytedance.sdk.openadsdk.core.p151e.C3469a;
import com.bytedance.sdk.openadsdk.core.p151e.C3470b;

/* renamed from: com.bytedance.sdk.openadsdk.core.a.a */
/* compiled from: AdCallBackAdapter */
public class C3401a implements C3581n.C3582a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C3581n.C3582a f8210a;

    public C3401a(C3581n.C3582a aVar) {
        this.f8210a = aVar;
    }

    /* renamed from: a */
    public void mo18544a(int i, String str) {
        C3581n.C3582a aVar = this.f8210a;
        if (aVar != null) {
            aVar.mo18544a(i, str);
        }
    }

    /* renamed from: a */
    public void mo18545a(final C3469a aVar, final C3470b bVar) {
        if (this.f8210a == null) {
            return;
        }
        if (C2482a.m6066b()) {
            this.f8210a.mo18545a(aVar, bVar);
        } else {
            C3568k.m11192d().post(new Runnable() {
                public void run() {
                    C3401a.this.f8210a.mo18545a(aVar, bVar);
                }
            });
        }
    }
}
