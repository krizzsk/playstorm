package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.view.ViewGroup;
import com.bykv.p068vk.openvk.component.video.api.p084b.C2519a;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.video.p164c.C3670a;
import com.bytedance.sdk.openadsdk.p130b.C3167j;
import com.bytedance.sdk.openadsdk.p130b.p132b.p133a.C3133a;
import com.bytedance.sdk.openadsdk.p130b.p132b.p134b.C3150o;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.c */
/* compiled from: FullScreenVideoController */
public class C3331c extends C3670a {

    /* renamed from: z */
    private C3167j f7952z;

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public int mo18974t() {
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo18980z() {
    }

    public C3331c(Context context, ViewGroup viewGroup, C3498n nVar, C3167j jVar) {
        super(context, viewGroup, nVar);
        this.f7952z = jVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18972a(int i, int i2) {
        if (this.f9300e != null) {
            C3150o.C3151a aVar = new C3150o.C3151a();
            aVar.mo18725b(mo16450h());
            aVar.mo18728c(mo16452j());
            aVar.mo18721a(mo16449g());
            aVar.mo18720a(i);
            aVar.mo18724b(i2);
            C3133a.m9056c(mo20249F(), aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo18975u() {
        C3150o.C3151a aVar = new C3150o.C3151a();
        aVar.mo18721a(mo16449g());
        aVar.mo18728c(mo16452j());
        aVar.mo18725b(mo16450h());
        aVar.mo18734f(mo16451i());
        C3133a.m9053b(this.f9299d, aVar, this.f7952z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo18976v() {
        C3150o.C3151a aVar = new C3150o.C3151a();
        aVar.mo18721a(mo16449g());
        aVar.mo18728c(mo16452j());
        aVar.mo18725b(mo16450h());
        C3133a.m9042a((C2519a) this.f9299d, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo18977w() {
        C3150o.C3151a aVar = new C3150o.C3151a();
        aVar.mo18721a(mo16449g());
        aVar.mo18728c(mo16452j());
        aVar.mo18725b(mo16450h());
        C3133a.m9052b(mo20249F(), aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo18978x() {
        C3150o.C3151a aVar = new C3150o.C3151a();
        aVar.mo18722a(true);
        aVar.mo18728c(mo16452j());
        C3133a.m9041a(C3578m.m11231a(), (C2519a) this.f9299d, aVar, this.f7952z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo18979y() {
        C3133a.m9049a(this.f9300e, (C2519a) this.f9299d, this.f9363x);
    }
}
