package com.p374my.target;

import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.my.target.a0 */
public class C9597a0 {

    /* renamed from: a */
    public final ArrayList<C10028x1> f23604a = new ArrayList<>();

    /* renamed from: b */
    public WeakReference<View> f23605b;

    /* renamed from: c */
    public float f23606c = -1.0f;

    /* renamed from: d */
    public long f23607d;

    public C9597a0(C9641c3 c3Var) {
        Iterator<C10045y2> it = c3Var.mo63674a().iterator();
        while (it.hasNext()) {
            C10045y2 next = it.next();
            if (next instanceof C10028x1) {
                this.f23604a.add((C10028x1) next);
            }
        }
    }

    /* renamed from: a */
    public static C9597a0 m27569a(C9641c3 c3Var) {
        return new C9597a0(c3Var);
    }

    /* renamed from: a */
    public final void mo63404a() {
        Iterator<C10028x1> it = this.f23604a.iterator();
        while (it.hasNext()) {
            it.next().mo65741a(-1.0f);
        }
    }

    /* renamed from: a */
    public final void mo63405a(double d, int i, Context context) {
        float f;
        ArrayList arrayList = new ArrayList();
        Iterator<C10028x1> it = this.f23604a.iterator();
        while (it.hasNext()) {
            C10028x1 next = it.next();
            int f2 = next.mo65696f();
            int e = next.mo65695e();
            if (!(f2 <= i && (e == 0 || e >= i)) || ((double) next.f23750d) > d) {
                f = -1.0f;
            } else {
                if (next.mo65742d() >= 0.0f) {
                    float f3 = (float) i;
                    if (f3 > next.mo65742d()) {
                        if (f3 - next.mo65742d() >= next.f24969e) {
                            arrayList.add(next);
                            it.remove();
                        }
                    }
                }
                f = (float) i;
            }
            next.mo65741a(f);
        }
        if (!arrayList.isEmpty()) {
            C10039x8.m29720c((List<C9626b3>) arrayList, context);
        }
    }

    /* renamed from: a */
    public void mo63406a(View view) {
        WeakReference<View> weakReference;
        if (view != null || (weakReference = this.f23605b) == null) {
            this.f23605b = new WeakReference<>(view);
        } else {
            weakReference.clear();
        }
    }

    /* renamed from: a */
    public final boolean mo63407a(int i) {
        float f = (float) i;
        float f2 = this.f23606c;
        if (f < f2) {
            return false;
        }
        if (this.f23607d > 0) {
            return (((long) (f - f2)) * 1000) - (System.currentTimeMillis() - this.f23607d) <= 1000;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo63408b(double d, int i, Context context) {
        if (!this.f23604a.isEmpty()) {
            if (context == null) {
                Iterator<C10028x1> it = this.f23604a.iterator();
                while (it.hasNext()) {
                    it.next().mo65741a(-1.0f);
                }
                return;
            }
            mo63405a(d, i, context);
        }
    }

    /* renamed from: b */
    public void mo63409b(int i) {
        View view;
        float f = (float) i;
        if (f != this.f23606c) {
            if (!mo63407a(i)) {
                mo63404a();
            }
            Context context = null;
            double d = 0.0d;
            WeakReference<View> weakReference = this.f23605b;
            if (!(weakReference == null || (view = (View) weakReference.get()) == null)) {
                d = C9609a9.m27614a(view);
                context = view.getContext();
            }
            mo63408b(d, i, context);
            this.f23606c = f;
            this.f23607d = System.currentTimeMillis();
        }
    }
}
