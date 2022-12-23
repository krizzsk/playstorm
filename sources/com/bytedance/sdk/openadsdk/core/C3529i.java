package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3610e;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3611f;
import com.bytedance.sdk.openadsdk.core.p146b.C3429c;
import com.bytedance.sdk.openadsdk.core.p151e.C3481j;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import com.com.bytedance.overseas.sdk.p186a.C4026c;
import com.com.bytedance.overseas.sdk.p186a.C4027d;

/* renamed from: com.bytedance.sdk.openadsdk.core.i */
/* compiled from: H5AdInteractionManager */
public class C3529i {

    /* renamed from: a */
    private final Context f8760a;

    /* renamed from: b */
    private final C3498n f8761b;

    /* renamed from: c */
    private C4026c f8762c;

    /* renamed from: d */
    private C3611f f8763d;

    /* renamed from: e */
    private C3610e f8764e;

    /* renamed from: f */
    private View f8765f;

    /* renamed from: g */
    private String f8766g = "rewarded_video";

    public C3529i(Context context, C3498n nVar, View view) {
        this.f8761b = nVar;
        this.f8760a = context;
        this.f8765f = view;
        this.f8766g = C4014u.m13198b(C4014u.m13219e(nVar));
        if (this.f8761b.mo19609L() == 4) {
            this.f8762c = C4027d.m13342a(this.f8760a, this.f8761b, this.f8766g);
        }
        String str = this.f8766g;
        C3611f fVar = new C3611f(context, nVar, str, C4014u.m13176a(str));
        this.f8763d = fVar;
        fVar.mo19396a(this.f8765f);
        this.f8763d.mo19402a(this.f8762c);
        String str2 = this.f8766g;
        C3610e eVar = new C3610e(context, nVar, str2, C4014u.m13176a(str2));
        this.f8764e = eVar;
        eVar.mo19396a(this.f8765f);
        this.f8764e.mo19402a(this.f8762c);
    }

    /* renamed from: a */
    public void mo19880a(int i, C3481j jVar) {
        C3610e eVar;
        if (i != -1 && jVar != null) {
            float f = jVar.f8480a;
            float f2 = jVar.f8481b;
            float f3 = jVar.f8482c;
            float f4 = jVar.f8483d;
            SparseArray<C3429c.C3430a> sparseArray = jVar.f8493n;
            if (i == 1) {
                C3611f fVar = this.f8763d;
                if (fVar != null) {
                    fVar.mo20183a(jVar);
                    this.f8763d.mo18471a(this.f8765f, f, f2, f3, f4, sparseArray, true);
                }
            } else if (i == 2 && (eVar = this.f8764e) != null) {
                eVar.mo20182a(jVar);
                this.f8764e.mo18471a(this.f8765f, f, f2, f3, f4, sparseArray, true);
            }
        }
    }
}
