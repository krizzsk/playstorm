package com.bytedance.sdk.openadsdk.component.p136a;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p146b.C3427b;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.p151e.C3501p;
import com.com.bytedance.overseas.sdk.p186a.C4026c;
import com.com.bytedance.overseas.sdk.p186a.C4027d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.component.a.b */
/* compiled from: TTAppOpenAdClickManager */
public class C3258b {

    /* renamed from: a */
    private String f7711a = "open_ad";

    /* renamed from: b */
    private int f7712b = 4;

    /* renamed from: c */
    private C3257a f7713c;

    /* renamed from: d */
    private C4026c f7714d;

    public C3258b(C3498n nVar, Activity activity) {
        C3257a aVar = new C3257a(activity.getApplicationContext(), nVar, this.f7711a, this.f7712b);
        this.f7713c = aVar;
        aVar.mo19396a(activity.findViewById(16908290));
        this.f7713c.mo19408b(activity.findViewById(C2984t.m8432e(C3578m.m11231a(), "tt_top_dislike")));
        HashMap hashMap = new HashMap();
        hashMap.put("click_area", Integer.valueOf(nVar.mo19691c()));
        hashMap.put("openad_creative_type", C3498n.m10583c(nVar) ? "video_normal_ad" : "image_normal_ad");
        hashMap.put("click_scence", Integer.valueOf(C3501p.m10769i(nVar) ? 3 : 1));
        this.f7713c.mo19404a((Map<String, Object>) hashMap);
        m9499a(activity.getApplicationContext(), nVar);
    }

    /* renamed from: a */
    private void m9499a(Context context, C3498n nVar) {
        if (mo18939a(nVar) == 4) {
            C4026c a = C4027d.m13342a(context, nVar, "open_ad");
            this.f7714d = a;
            this.f7713c.mo19402a(a);
        }
    }

    /* renamed from: a */
    public int mo18939a(C3498n nVar) {
        if (nVar == null) {
            return -1;
        }
        return nVar.mo19609L();
    }

    /* renamed from: a */
    public void mo18941a(C3427b.C3428a aVar) {
        C3257a aVar2 = this.f7713c;
        if (aVar2 != null) {
            aVar2.mo19400a(aVar);
        }
    }

    /* renamed from: a */
    public C3257a mo18940a() {
        return this.f7713c;
    }
}
