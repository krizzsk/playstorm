package com.bytedance.sdk.openadsdk.core.p146b;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.p146b.C3429c;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;

/* renamed from: com.bytedance.sdk.openadsdk.core.b.e */
/* compiled from: RewardBarClickListener */
public abstract class C3432e extends C3426a {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo18480a(View view, float f, float f2, float f3, float f4, SparseArray<C3429c.C3430a> sparseArray, int i, int i2, int i3, boolean z);

    public C3432e(Context context, C3498n nVar, String str, int i) {
        super(context, nVar, str, i);
    }

    /* renamed from: a */
    public void mo18471a(View view, float f, float f2, float f3, float f4, SparseArray<C3429c.C3430a> sparseArray, boolean z) {
        View view2 = view;
        if (mo19406a(view, z)) {
            mo18480a(view, f, f2, f3, f4, sparseArray, this.f8284A, this.f8296y, this.f8297z, z);
        }
        super.mo18471a(view, f, f2, f3, f4, sparseArray, z);
    }
}
