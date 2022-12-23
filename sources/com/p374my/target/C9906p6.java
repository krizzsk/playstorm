package com.p374my.target;

import android.content.Context;
import android.view.View;

/* renamed from: com.my.target.p6 */
public class C9906p6 extends View {

    /* renamed from: a */
    public C9907a f24497a;

    /* renamed from: b */
    public final C9908b f24498b = new C9908b();

    /* renamed from: com.my.target.p6$a */
    public interface C9907a {
        /* renamed from: a */
        void mo63317a(boolean z);
    }

    /* renamed from: com.my.target.p6$b */
    public static class C9908b {

        /* renamed from: a */
        public boolean f24499a;

        /* renamed from: b */
        public boolean f24500b;

        /* renamed from: a */
        public void mo65220a(boolean z) {
            this.f24499a = z;
        }

        /* renamed from: a */
        public boolean mo65221a() {
            return this.f24499a && this.f24500b;
        }

        /* renamed from: b */
        public void mo65222b(boolean z) {
            this.f24500b = z;
        }
    }

    public C9906p6(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo65212a(boolean z) {
        C9907a aVar;
        boolean z2;
        this.f24498b.mo65220a(z);
        this.f24498b.mo65222b(hasWindowFocus());
        if (this.f24498b.mo65221a()) {
            aVar = this.f24497a;
            if (aVar != null) {
                z2 = true;
            } else {
                return;
            }
        } else if (!z && (aVar = this.f24497a) != null) {
            z2 = false;
        } else {
            return;
        }
        aVar.mo63317a(z2);
    }

    /* renamed from: a */
    public boolean mo65213a() {
        return this.f24498b.mo65221a();
    }

    public C9908b getViewabilityState() {
        return this.f24498b;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo65212a(true);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo65212a(false);
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(1, 1);
    }

    public void onWindowFocusChanged(boolean z) {
        C9907a aVar;
        boolean z2;
        super.onWindowFocusChanged(z);
        this.f24498b.mo65222b(z);
        if (this.f24498b.mo65221a()) {
            aVar = this.f24497a;
            if (aVar != null) {
                z2 = true;
            } else {
                return;
            }
        } else if (!z && (aVar = this.f24497a) != null) {
            z2 = false;
        } else {
            return;
        }
        aVar.mo63317a(z2);
    }

    public void setViewabilityListener(C9907a aVar) {
        this.f24497a = aVar;
    }
}
