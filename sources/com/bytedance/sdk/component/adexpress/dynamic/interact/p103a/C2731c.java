package com.bytedance.sdk.component.adexpress.dynamic.interact.p103a;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.C2640c;
import com.bytedance.sdk.component.adexpress.dynamic.interact.C2734c;
import com.bytedance.sdk.component.adexpress.p096c.C2642b;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.interact.a.c */
/* compiled from: SlideUpTouch */
public class C2731c implements View.OnTouchListener {

    /* renamed from: a */
    private float f6053a;

    /* renamed from: b */
    private float f6054b;

    /* renamed from: c */
    private boolean f6055c;

    /* renamed from: d */
    private C2734c f6056d;

    /* renamed from: e */
    private int f6057e;

    public C2731c(C2734c cVar, int i) {
        this.f6056d = cVar;
        this.f6057e = i;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        C2734c cVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f6053a = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float y = motionEvent.getY();
                this.f6054b = y;
                if (Math.abs(y - this.f6053a) > 10.0f) {
                    this.f6055c = true;
                }
            }
        } else if (!this.f6055c) {
            return false;
        } else {
            int b = C2642b.m6898b(C2640c.m6890a(), Math.abs(this.f6054b - this.f6053a));
            if (this.f6054b - this.f6053a < 0.0f && b > this.f6057e && (cVar = this.f6056d) != null) {
                cVar.mo17292a();
            }
        }
        return true;
    }
}
