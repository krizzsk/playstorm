package com.bytedance.sdk.openadsdk.core.p147c.p149b;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.p102d.C2712a;
import com.bytedance.sdk.component.adexpress.p095b.C2631j;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.core.p146b.C3429c;
import com.bytedance.sdk.openadsdk.core.p151e.C3481j;
import com.bytedance.sdk.openadsdk.utils.C4020v;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.sdk.openadsdk.core.c.b.a */
/* compiled from: DynamicClickListener */
public class C3459a extends C3429c implements C2712a {

    /* renamed from: a */
    protected WeakReference<View> f8390a;

    /* renamed from: b */
    protected WeakReference<View> f8391b;

    /* renamed from: c */
    private C2631j f8392c;

    /* renamed from: a */
    public void mo17211a(C2631j jVar) {
        this.f8392c = jVar;
    }

    /* renamed from: a */
    public void mo17210a(View view) {
        this.f8390a = new WeakReference<>(view);
    }

    /* renamed from: b */
    public void mo17212b(View view) {
        this.f8391b = new WeakReference<>(view);
    }

    /* renamed from: a */
    public void mo18471a(View view, float f, float f2, float f3, float f4, SparseArray<C3429c.C3430a> sparseArray, boolean z) {
        m10366a(view, ((Integer) view.getTag()).intValue(), f, f2, f3, f4, sparseArray);
    }

    /* renamed from: a */
    private void m10366a(View view, int i, float f, float f2, float f3, float f4, SparseArray<C3429c.C3430a> sparseArray) {
        if (this.f8392c != null) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            WeakReference<View> weakReference = this.f8391b;
            if (weakReference != null) {
                int[] a = C4020v.m13296a((View) weakReference.get());
                if (a != null) {
                    iArr = a;
                }
                int[] c = C4020v.m13309c((View) this.f8391b.get());
                if (c != null) {
                    iArr2 = c;
                }
            }
            String str = "";
            try {
                if (view.getTag(C2984t.m8432e(view.getContext(), "tt_id_click_area_type")) != null) {
                    str = String.valueOf(view.getTag(C2984t.m8432e(view.getContext(), "tt_id_click_area_type")));
                }
            } catch (Exception unused) {
            }
            this.f8392c.mo16747a(view, i, new C3481j.C3483a().mo19555d(f).mo19553c(f2).mo19550b(f3).mo19542a(f4).mo19552b(this.f8294w).mo19544a(this.f8295x).mo19554c(iArr[0]).mo19556d(iArr[1]).mo19557e(iArr2[0]).mo19558f(iArr2[1]).mo19545a(sparseArray).mo19548a(this.f8285C).mo19546a(str).mo19549a());
        }
    }
}
