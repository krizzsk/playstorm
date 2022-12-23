package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.C3524h;
import com.bytedance.sdk.openadsdk.core.p146b.C3433f;
import com.bytedance.sdk.openadsdk.core.p151e.C3476g;
import com.bytedance.sdk.openadsdk.utils.C4020v;

/* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.n */
/* compiled from: ViewGestureDetector */
public class C3622n extends GestureDetector {

    /* renamed from: a */
    private final C3623a f9176a;

    /* renamed from: b */
    private final C3433f f9177b;

    public C3622n(Context context) {
        this(context, new C3623a());
    }

    public C3622n(Context context, C3623a aVar) {
        super(context, aVar);
        this.f9176a = aVar;
        this.f9177b = new C3433f();
        setIsLongpressEnabled(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20190a() {
        this.f9176a.mo20193a();
    }

    /* renamed from: b */
    public boolean mo20191b() {
        return this.f9176a.mo20194b();
    }

    /* renamed from: a */
    public C3476g mo20189a(Context context, View view, View view2) {
        if (this.f9177b == null) {
            return new C3476g.C3478a().mo19519a();
        }
        return new C3476g.C3478a().mo19532f(this.f9177b.f8308a).mo19530e(this.f9177b.f8309b).mo19527d(this.f9177b.f8310c).mo19524c(this.f9177b.f8311d).mo19522b(this.f9177b.f8312e).mo19514a(this.f9177b.f8313f).mo19523b(C4020v.m13296a(view)).mo19518a(C4020v.m13296a(view2)).mo19526c(C4020v.m13309c(view)).mo19529d(C4020v.m13309c(view2)).mo19528d(this.f9177b.f8314g).mo19531e(this.f9177b.f8315h).mo19533f(this.f9177b.f8316i).mo19515a(this.f9177b.f8318l).mo19521b(C3524h.m10852d().mo19842b() ? 1 : 2).mo19516a("vessel").mo19512a(C4020v.m13314e(context)).mo19525c(C4020v.m13319g(context)).mo19520b(C4020v.m13317f(context)).mo19519a();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f9177b.mo19417a(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.n$a */
    /* compiled from: ViewGestureDetector */
    static class C3623a extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        boolean f9178a = false;

        C3623a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo20193a() {
            this.f9178a = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo20194b() {
            return this.f9178a;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            this.f9178a = true;
            return super.onSingleTapUp(motionEvent);
        }
    }
}
