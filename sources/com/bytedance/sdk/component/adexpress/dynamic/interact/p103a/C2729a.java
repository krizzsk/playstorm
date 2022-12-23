package com.bytedance.sdk.component.adexpress.dynamic.interact.p103a;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.C2640c;
import com.bytedance.sdk.component.adexpress.dynamic.interact.C2734c;
import com.bytedance.sdk.component.adexpress.dynamic.interact.InteractViewContainer;
import com.bytedance.sdk.component.adexpress.p096c.C2642b;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.interact.a.a */
/* compiled from: LongPressTouch */
public class C2729a implements View.OnTouchListener {

    /* renamed from: a */
    private float f6043a;

    /* renamed from: b */
    private float f6044b;

    /* renamed from: c */
    private long f6045c;

    /* renamed from: d */
    private boolean f6046d;

    /* renamed from: e */
    private InteractViewContainer f6047e;

    /* renamed from: f */
    private C2734c f6048f;

    public C2729a(InteractViewContainer interactViewContainer, C2734c cVar) {
        this.f6047e = interactViewContainer;
        this.f6048f = cVar;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f6045c = System.currentTimeMillis();
            this.f6043a = motionEvent.getX();
            this.f6044b = motionEvent.getY();
            this.f6047e.mo17294c();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.f6043a) >= C2642b.m6894a(C2640c.m6890a(), 10.0f) || Math.abs(y - this.f6044b) >= C2642b.m6894a(C2640c.m6890a(), 10.0f)) {
                    this.f6046d = true;
                    this.f6047e.mo17295d();
                }
            }
        } else if (this.f6046d) {
            return false;
        } else {
            if (System.currentTimeMillis() - this.f6045c >= 1500) {
                C2734c cVar = this.f6048f;
                if (cVar != null) {
                    cVar.mo17292a();
                }
            } else {
                this.f6047e.mo17295d();
            }
        }
        return true;
    }
}
