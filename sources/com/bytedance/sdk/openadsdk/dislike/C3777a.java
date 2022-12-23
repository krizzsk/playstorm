package com.bytedance.sdk.openadsdk.dislike;

import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.C3581n;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.p130b.C3126a;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.dislike.a */
/* compiled from: DislikeDispatcher */
public class C3777a {

    /* renamed from: a */
    private static volatile C3777a f9837a;

    /* renamed from: b */
    private final C3581n<C3126a> f9838b = C3578m.m11239f();

    private C3777a() {
    }

    /* renamed from: a */
    public static C3777a m12419a() {
        if (f9837a == null) {
            synchronized (C3777a.class) {
                if (f9837a == null) {
                    f9837a = new C3777a();
                }
            }
        }
        return f9837a;
    }

    /* renamed from: a */
    public void mo20582a(C3498n nVar, List<FilterWord> list) {
        this.f9838b.mo20074a(nVar, list);
    }
}
