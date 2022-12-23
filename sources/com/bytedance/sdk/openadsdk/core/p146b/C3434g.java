package com.bytedance.sdk.openadsdk.core.p146b;

import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.core.p146b.C3429c;
import com.bytedance.sdk.openadsdk.core.p156j.C3539a;

/* renamed from: com.bytedance.sdk.openadsdk.core.b.g */
/* compiled from: VastClickListenerWrapper */
public abstract class C3434g extends C3429c {

    /* renamed from: a */
    private final String f8321a;

    /* renamed from: b */
    private final C3539a f8322b;

    /* renamed from: c */
    private C3429c f8323c;

    /* renamed from: a */
    public abstract void mo19153a();

    public C3434g(String str, C3539a aVar) {
        this(str, aVar, (C3429c) null);
    }

    public C3434g(String str, C3539a aVar, C3429c cVar) {
        this.f8321a = str;
        this.f8322b = aVar;
        this.f8323c = cVar;
    }

    /* renamed from: a */
    public void mo19418a(C3429c cVar) {
        this.f8323c = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18471a(View view, float f, float f2, float f3, float f4, SparseArray<C3429c.C3430a> sparseArray, boolean z) {
        View view2 = view;
        C3539a aVar = this.f8322b;
        if (aVar != null) {
            aVar.mo19990e(this.f8321a);
        }
        if (view2 != null) {
            if (view.getId() == C2984t.m8432e(view.getContext(), "tt_reward_ad_appname")) {
                view.setTag("VAST_TITLE");
            } else if (view.getId() == C2984t.m8432e(view.getContext(), "tt_reward_ad_description")) {
                view.setTag("VAST_DESCRIPTION");
            } else {
                view.setTag(this.f8321a);
            }
        }
        C3429c cVar = this.f8323c;
        if (cVar != null) {
            cVar.f8294w = this.f8294w;
            this.f8323c.f8295x = this.f8295x;
            this.f8323c.f8296y = this.f8296y;
            this.f8323c.f8297z = this.f8296y;
            this.f8323c.f8284A = this.f8296y;
            this.f8323c.mo18471a(view, f, f2, f3, f4, sparseArray, z);
        }
        mo19153a();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        return super.onTouch(view, motionEvent);
    }
}
