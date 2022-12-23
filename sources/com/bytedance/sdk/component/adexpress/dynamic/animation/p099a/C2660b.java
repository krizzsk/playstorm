package com.bytedance.sdk.component.adexpress.dynamic.animation.p099a;

import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2725c;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2680a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.a.b */
/* compiled from: AnimationSets */
public class C2660b implements C2725c {

    /* renamed from: a */
    List<C2662d> f5746a = new ArrayList();

    public C2660b(View view, List<C2680a> list) {
        for (C2680a a : list) {
            C2662d a2 = C2661c.m6975a().mo16882a(view, a);
            if (a2 != null) {
                this.f5746a.add(a2);
            }
        }
    }

    /* renamed from: a */
    public void mo16880a() {
        for (C2662d c : this.f5746a) {
            try {
                c.mo16884c();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public void mo16881b() {
        for (C2662d b : this.f5746a) {
            try {
                b.mo16881b();
            } catch (Exception unused) {
            }
        }
    }
}
