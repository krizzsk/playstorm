package com.p374my.target;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.p374my.target.C9707g0;
import java.lang.ref.WeakReference;

/* renamed from: com.my.target.k0 */
public final class C9789k0 extends C9707g0 {

    /* renamed from: e */
    public int f24154e;

    /* renamed from: f */
    public C9790a f24155f;

    /* renamed from: com.my.target.k0$a */
    public class C9790a implements View.OnLayoutChangeListener {
        public C9790a() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            WeakReference<C10020w5> weakReference = C9789k0.this.f23910d;
            C10020w5 w5Var = weakReference != null ? (C10020w5) weakReference.get() : null;
            if (w5Var != null) {
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                int measuredWidth2 = w5Var.getMeasuredWidth();
                int measuredHeight2 = w5Var.getMeasuredHeight();
                int i15 = C9789k0.this.f24154e;
                if (i15 != 1) {
                    if (i15 == 2) {
                        int paddingLeft = (measuredWidth - measuredWidth2) - view.getPaddingLeft();
                        i13 = (measuredHeight - view.getPaddingBottom()) - measuredHeight2;
                        i12 = measuredWidth - view.getPaddingRight();
                        i14 = measuredHeight - view.getPaddingBottom();
                        i11 = paddingLeft;
                    } else if (i15 == 3) {
                        int paddingLeft2 = view.getPaddingLeft();
                        i13 = (measuredHeight - view.getPaddingBottom()) - measuredHeight2;
                        i14 = measuredHeight - view.getPaddingBottom();
                        i11 = paddingLeft2;
                        i12 = measuredWidth2 + view.getPaddingLeft();
                    } else if (i15 != 4) {
                        i11 = (measuredWidth - measuredWidth2) - view.getPaddingLeft();
                        i10 = view.getPaddingTop();
                        i12 = measuredWidth - view.getPaddingRight();
                        i9 = measuredHeight2 + view.getPaddingTop();
                    } else {
                        return;
                    }
                    i10 = i13;
                    i9 = i14;
                } else {
                    i11 = view.getPaddingLeft();
                    int paddingTop = view.getPaddingTop();
                    i9 = measuredHeight2 + view.getPaddingTop();
                    int paddingLeft3 = measuredWidth2 + view.getPaddingLeft();
                    i10 = paddingTop;
                    i12 = paddingLeft3;
                }
                w5Var.layout(i11, i10, i12, i9);
            }
        }
    }

    public C9789k0(C9894p1 p1Var) {
        super(p1Var);
        if (p1Var != null) {
            this.f24155f = new C9790a();
        }
    }

    /* renamed from: b */
    public static C9789k0 m28419b(C9894p1 p1Var) {
        return new C9789k0(p1Var);
    }

    /* renamed from: a */
    public void mo64485a(View view) {
        super.mo64036a();
        C9790a aVar = this.f24155f;
        if (aVar != null) {
            view.removeOnLayoutChangeListener(aVar);
        }
    }

    /* renamed from: a */
    public void mo64486a(ViewGroup viewGroup, C10020w5 w5Var, C9707g0.C9709b bVar, int i) {
        this.f24154e = i;
        if (this.f23907a != null) {
            if (w5Var == null) {
                Context context = viewGroup.getContext();
                C10020w5 w5Var2 = new C10020w5(context);
                C10059y8.m29840b(w5Var2, "ad_choices");
                int a = C10059y8.m29824a(2, context);
                w5Var2.setPadding(a, a, a, a);
                w5Var = w5Var2;
            }
            if (w5Var.getParent() == null) {
                try {
                    viewGroup.addView(w5Var);
                } catch (Throwable th) {
                    C9672e0.m27882a("Unable to add AdChoices View: " + th.getMessage());
                }
            }
            if (i != 4) {
                viewGroup.addOnLayoutChangeListener(this.f24155f);
            }
            super.mo64038a(w5Var, bVar);
        } else if (w5Var != null) {
            mo64037a(w5Var);
        }
    }
}
