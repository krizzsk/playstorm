package com.bykv.p068vk.openvk.component.video.p069a.p073b.p078e;

import android.text.TextUtils;
import com.bykv.p068vk.openvk.component.video.api.C2518b;
import com.bykv.p068vk.openvk.component.video.api.p088f.C2536c;
import com.bytedance.sdk.component.p104b.p105a.C2813i;
import com.bytedance.sdk.component.p104b.p105a.C2816k;
import com.bytedance.sdk.component.p104b.p105a.C2820m;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.e.d */
/* compiled from: NetworkSoureVolleyImpl */
public class C2452d implements C2449b {

    /* renamed from: a */
    private C2813i f5199a;

    public C2452d() {
        this.f5199a = null;
        this.f5199a = C2518b.m6277e();
    }

    /* renamed from: a */
    public C2448a mo16176a(C2453e eVar) throws IOException {
        C2816k.C2817a aVar = new C2816k.C2817a();
        try {
            if (eVar.f5204e != null) {
                for (Map.Entry next : eVar.f5204e.entrySet()) {
                    String str = (String) next.getKey();
                    if (!TextUtils.isEmpty(str)) {
                        String str2 = (String) next.getValue();
                        if (str2 == null) {
                            str2 = "";
                        }
                        aVar.mo17596b(str, str2);
                    }
                }
            }
            C2820m a = this.f5199a.mo17476a(aVar.mo17594a(eVar.f5201b).mo17589a().mo17597b()).mo17467a();
            C2536c.m6438b("NetworkSoureVolleyImpl", "response code = ", Integer.valueOf(a.mo17497c()));
            return new C2454f(a, eVar);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
