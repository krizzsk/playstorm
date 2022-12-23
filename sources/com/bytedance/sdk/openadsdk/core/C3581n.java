package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.component.adexpress.p091a.p094c.C2614a;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.C3627o;
import com.bytedance.sdk.openadsdk.core.p151e.C3469a;
import com.bytedance.sdk.openadsdk.core.p151e.C3470b;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.p151e.C3500o;
import com.bytedance.sdk.openadsdk.p130b.C3166i;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.n */
/* compiled from: NetApi */
public interface C3581n<T> {

    /* renamed from: com.bytedance.sdk.openadsdk.core.n$a */
    /* compiled from: NetApi */
    public interface C3582a {
        /* renamed from: a */
        void mo18544a(int i, String str);

        /* renamed from: a */
        void mo18545a(C3469a aVar, C3470b bVar);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.n$b */
    /* compiled from: NetApi */
    public interface C3583b {
        /* renamed from: a */
        void mo18585a(int i, String str);

        /* renamed from: a */
        void mo18586a(C3627o.C3638b bVar);
    }

    /* renamed from: a */
    C2614a mo20070a();

    /* renamed from: a */
    C3166i mo20071a(List<T> list);

    /* renamed from: a */
    JSONObject mo20072a(JSONObject jSONObject);

    /* renamed from: a */
    void mo20073a(AdSlot adSlot, C3500o oVar, int i, C3582a aVar);

    /* renamed from: a */
    void mo20074a(C3498n nVar, List<FilterWord> list);

    /* renamed from: a */
    void mo20075a(String str);

    /* renamed from: a */
    void mo20076a(JSONObject jSONObject, C3583b bVar);

    /* renamed from: a */
    void mo20077a(JSONObject jSONObject, String str);

    /* renamed from: b */
    C3166i mo20078b(JSONObject jSONObject);
}
