package com.p374my.target;

import android.content.Context;
import android.widget.FrameLayout;
import com.p374my.target.C10000v5;
import com.p374my.target.C9707g0;
import com.p374my.target.C9894p1;
import com.p374my.target.C9949s5;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.my.target.h0 */
public final class C9730h0 implements C9949s5.C9950a, C10000v5.C10001a {

    /* renamed from: a */
    public final List<C9894p1.C9895a> f23976a;

    /* renamed from: b */
    public C9707g0.C9709b f23977b;

    /* renamed from: c */
    public WeakReference<C9949s5> f23978c;

    public C9730h0(List<C9894p1.C9895a> list) {
        this.f23976a = list;
    }

    /* renamed from: a */
    public static C9730h0 m28115a(List<C9894p1.C9895a> list) {
        return new C9730h0(list);
    }

    /* renamed from: a */
    public void mo64135a() {
        mo64140b();
    }

    /* renamed from: a */
    public void mo64136a(Context context) {
        try {
            C9949s5 a = C9949s5.m29241a(this, context);
            this.f23978c = new WeakReference<>(a);
            a.show();
        } catch (Throwable th) {
            th.printStackTrace();
            C9672e0.m27883b("Unable to start adchoices dialog");
            mo64143q();
        }
    }

    /* renamed from: a */
    public void mo64137a(C9707g0.C9709b bVar) {
        this.f23977b = bVar;
    }

    /* renamed from: a */
    public void mo64138a(C9894p1.C9895a aVar, Context context) {
        C9707g0.C9709b bVar;
        String str = aVar.f24472b;
        if (!(str == null || str.length() == 0)) {
            C10039x8.m29719c(str, context);
        }
        String str2 = aVar.f24473c;
        if (!(str2 == null || str2.length() == 0)) {
            C9832l8.m28605a(str2, context);
        }
        if (aVar.f24474d && (bVar = this.f23977b) != null) {
            bVar.mo63363a(context);
        }
        mo64140b();
    }

    /* renamed from: a */
    public void mo64139a(C9949s5 s5Var, FrameLayout frameLayout) {
        C10000v5 v5Var = new C10000v5(frameLayout.getContext());
        frameLayout.addView(v5Var, -1, -1);
        v5Var.mo65608a(this.f23976a, (C10000v5.C10001a) this);
        v5Var.mo65607a();
    }

    /* renamed from: b */
    public final void mo64140b() {
        C9949s5 s5Var;
        WeakReference<C9949s5> weakReference = this.f23978c;
        if (weakReference != null && (s5Var = (C9949s5) weakReference.get()) != null) {
            s5Var.dismiss();
        }
    }

    /* renamed from: b */
    public void mo64141b(boolean z) {
    }

    /* renamed from: c */
    public boolean mo64142c() {
        WeakReference<C9949s5> weakReference = this.f23978c;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* renamed from: q */
    public void mo64143q() {
        WeakReference<C9949s5> weakReference = this.f23978c;
        if (weakReference != null) {
            weakReference.clear();
            this.f23978c = null;
        }
    }
}
