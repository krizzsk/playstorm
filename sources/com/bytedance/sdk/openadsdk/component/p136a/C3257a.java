package com.bytedance.sdk.openadsdk.component.p136a;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p146b.C3426a;
import com.bytedance.sdk.openadsdk.core.p146b.C3429c;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;

/* renamed from: com.bytedance.sdk.openadsdk.component.a.a */
/* compiled from: TTAppOpenAdClickListener */
public class C3257a extends C3426a {
    public C3257a(Context context, C3498n nVar, String str, int i) {
        super(context, nVar, str, i);
    }

    /* renamed from: a */
    public void mo18471a(View view, float f, float f2, float f3, float f4, SparseArray<C3429c.C3430a> sparseArray, boolean z) {
        if (view.getId() == C2984t.m8432e(C3578m.m11231a(), "tt_open_ad_click_button")) {
            mo19403a("click_bar");
        } else {
            mo19403a("click_material");
        }
        super.mo18471a(view, f, f2, f3, f4, sparseArray, z);
    }
}
