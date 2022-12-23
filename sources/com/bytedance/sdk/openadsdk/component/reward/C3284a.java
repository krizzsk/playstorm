package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.component.p125f.C2952e;
import com.bytedance.sdk.component.p125f.C2955g;
import com.bytedance.sdk.component.utils.C2968h;
import com.bytedance.sdk.component.utils.C2979o;
import com.bytedance.sdk.openadsdk.core.C3578m;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.a */
/* compiled from: ContinueDownloadTask */
public class C3284a extends C2955g {

    /* renamed from: a */
    private final List<? extends C2955g> f7786a;

    public C3284a(String str, List<? extends C2955g> list) {
        super(str);
        this.f7786a = list;
    }

    public void run() {
        List<? extends C2955g> list;
        if (!(C2979o.m8409c(C3578m.m11231a()) == 0 || (list = this.f7786a) == null)) {
            Iterator<? extends C2955g> it = list.iterator();
            while (it.hasNext()) {
                C2952e.m8308a((C2955g) it.next(), 1);
                it.remove();
            }
        }
        try {
            C2968h.m8366a().removeCallbacks(this);
        } catch (Exception unused) {
        }
    }
}
