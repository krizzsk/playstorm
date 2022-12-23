package com.p374my.target;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p374my.target.C9906p6;
import com.p374my.target.nativeads.views.IconAdView;
import com.p374my.target.nativeads.views.MediaAdView;
import com.p374my.target.nativeads.views.PromoCardRecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.my.target.r8 */
public class C9937r8 {

    /* renamed from: a */
    public final WeakReference<ViewGroup> f24606a;

    /* renamed from: b */
    public List<WeakReference<View>> f24607b;

    /* renamed from: c */
    public WeakReference<MediaAdView> f24608c;

    /* renamed from: d */
    public WeakReference<IconAdView> f24609d;

    /* renamed from: e */
    public WeakReference<C10020w5> f24610e;

    /* renamed from: f */
    public WeakReference<C9906p6> f24611f;

    /* renamed from: g */
    public WeakReference<C10005v6> f24612g;

    /* renamed from: h */
    public boolean f24613h = false;

    /* renamed from: com.my.target.r8$a */
    public static class C9938a implements Iterator<View> {

        /* renamed from: a */
        public int f24614a = 0;

        /* renamed from: b */
        public final /* synthetic */ ViewGroup f24615b;

        public C9938a(ViewGroup viewGroup) {
            this.f24615b = viewGroup;
        }

        /* renamed from: a */
        public View next() {
            ViewGroup viewGroup = this.f24615b;
            int i = this.f24614a;
            this.f24614a = i + 1;
            return viewGroup.getChildAt(i);
        }

        public boolean hasNext() {
            return this.f24614a < this.f24615b.getChildCount();
        }
    }

    public C9937r8(ViewGroup viewGroup, MediaAdView mediaAdView) {
        this.f24606a = new WeakReference<>(viewGroup);
        if (mediaAdView != null) {
            this.f24608c = new WeakReference<>(mediaAdView);
        }
        mo65346f(viewGroup);
    }

    public C9937r8(ViewGroup viewGroup, List<View> list, MediaAdView mediaAdView, View.OnClickListener onClickListener) {
        this.f24606a = new WeakReference<>(viewGroup);
        if (mediaAdView != null) {
            this.f24608c = new WeakReference<>(mediaAdView);
        }
        if (list != null && !list.isEmpty()) {
            this.f24607b = new ArrayList();
            for (View next : list) {
                if (next != null) {
                    this.f24607b.add(new WeakReference(next));
                    if (next instanceof MediaAdView) {
                        this.f24613h = true;
                    } else {
                        next.setOnClickListener(onClickListener);
                    }
                }
            }
        }
        mo65340b(viewGroup, onClickListener);
    }

    /* renamed from: a */
    public static C9937r8 m29149a(ViewGroup viewGroup, MediaAdView mediaAdView) {
        return new C9937r8(viewGroup, mediaAdView);
    }

    /* renamed from: a */
    public static C9937r8 m29150a(ViewGroup viewGroup, List<View> list, View.OnClickListener onClickListener) {
        return new C9937r8(viewGroup, list, (MediaAdView) null, onClickListener);
    }

    /* renamed from: a */
    public static C9937r8 m29151a(ViewGroup viewGroup, List<View> list, MediaAdView mediaAdView, View.OnClickListener onClickListener) {
        return new C9937r8(viewGroup, list, mediaAdView, onClickListener);
    }

    /* renamed from: c */
    public static C9937r8 m29152c(ViewGroup viewGroup) {
        return new C9937r8(viewGroup, (MediaAdView) null);
    }

    /* renamed from: d */
    public static Iterable<View> m29153d(ViewGroup viewGroup) {
        return new Iterable(viewGroup) {
            public final /* synthetic */ ViewGroup f$0;

            {
                this.f$0 = r1;
            }

            public final Iterator iterator() {
                return C9937r8.m29154e(this.f$0);
            }
        };
    }

    /* renamed from: e */
    public static /* synthetic */ Iterator m29154e(ViewGroup viewGroup) {
        return new C9938a(viewGroup);
    }

    /* renamed from: a */
    public void mo65332a() {
        WeakReference<C9906p6> weakReference = this.f24611f;
        if (weakReference != null) {
            C9906p6 p6Var = (C9906p6) weakReference.get();
            if (p6Var != null) {
                p6Var.setViewabilityListener((C9906p6.C9907a) null);
            }
            this.f24611f.clear();
            this.f24611f = null;
        }
    }

    /* renamed from: a */
    public final void mo65333a(View view, View.OnClickListener onClickListener) {
        if (this.f24607b == null) {
            view.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: a */
    public final void mo65334a(ViewGroup viewGroup, View.OnClickListener onClickListener) {
        if (!mo65337a(viewGroup)) {
            for (View next : m29153d(viewGroup)) {
                mo65333a(next, onClickListener);
                if (!mo65336a(next) && (next instanceof ViewGroup)) {
                    mo65334a((ViewGroup) next, onClickListener);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo65335a(C9906p6 p6Var) {
        this.f24611f = new WeakReference<>(p6Var);
    }

    /* renamed from: a */
    public final boolean mo65336a(View view) {
        if (!(view instanceof IconAdView)) {
            return false;
        }
        this.f24609d = new WeakReference<>((IconAdView) view);
        return true;
    }

    /* renamed from: a */
    public final boolean mo65337a(ViewGroup viewGroup) {
        if (viewGroup instanceof PromoCardRecyclerView) {
            this.f24612g = new WeakReference<>((C10005v6) viewGroup);
            return true;
        } else if (this.f24608c != null || !(viewGroup instanceof MediaAdView)) {
            return false;
        } else {
            this.f24608c = new WeakReference<>((MediaAdView) viewGroup);
            return true;
        }
    }

    /* renamed from: b */
    public void mo65338b() {
        WeakReference<MediaAdView> weakReference = this.f24608c;
        if (weakReference != null) {
            weakReference.clear();
            this.f24608c = null;
        }
        List<WeakReference<View>> list = this.f24607b;
        if (list != null) {
            for (WeakReference<View> weakReference2 : list) {
                View view = (View) weakReference2.get();
                if (view != null) {
                    view.setOnClickListener((View.OnClickListener) null);
                }
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.f24606a.get();
        if (viewGroup != null) {
            mo65339b(viewGroup);
        }
    }

    /* renamed from: b */
    public final void mo65339b(ViewGroup viewGroup) {
        for (View next : m29153d(viewGroup)) {
            if (!(next instanceof RecyclerView) && !(next instanceof MediaAdView) && !(next instanceof C10020w5) && !(next instanceof C9906p6)) {
                next.setOnClickListener((View.OnClickListener) null);
                if (next instanceof ViewGroup) {
                    mo65339b((ViewGroup) next);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo65340b(ViewGroup viewGroup, View.OnClickListener onClickListener) {
        if (!mo65337a(viewGroup)) {
            mo65333a((View) viewGroup, onClickListener);
            for (View next : m29153d(viewGroup)) {
                if (!mo65341b(next) && !mo65336a(next)) {
                    mo65333a(next, onClickListener);
                    if (next instanceof ViewGroup) {
                        mo65334a((ViewGroup) next, onClickListener);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean mo65341b(View view) {
        if (view instanceof C10020w5) {
            this.f24610e = new WeakReference<>((C10020w5) view);
            return true;
        } else if (!(view instanceof C9906p6)) {
            return false;
        } else {
            this.f24611f = new WeakReference<>((C9906p6) view);
            return true;
        }
    }

    /* renamed from: c */
    public C10020w5 mo65342c() {
        WeakReference<C10020w5> weakReference = this.f24610e;
        if (weakReference != null) {
            return (C10020w5) weakReference.get();
        }
        return null;
    }

    /* renamed from: d */
    public Context mo65343d() {
        ViewGroup viewGroup = (ViewGroup) this.f24606a.get();
        if (viewGroup != null) {
            return viewGroup.getContext();
        }
        return null;
    }

    /* renamed from: e */
    public IconAdView mo65344e() {
        WeakReference<IconAdView> weakReference = this.f24609d;
        if (weakReference != null) {
            return (IconAdView) weakReference.get();
        }
        return null;
    }

    /* renamed from: f */
    public MediaAdView mo65345f() {
        WeakReference<MediaAdView> weakReference = this.f24608c;
        if (weakReference != null) {
            return (MediaAdView) weakReference.get();
        }
        return null;
    }

    /* renamed from: f */
    public final boolean mo65346f(ViewGroup viewGroup) {
        if (this.f24608c == null && (viewGroup instanceof MediaAdView)) {
            this.f24608c = new WeakReference<>((MediaAdView) viewGroup);
        } else if (viewGroup instanceof IconAdView) {
            this.f24609d = new WeakReference<>((IconAdView) viewGroup);
        } else {
            for (View next : m29153d(viewGroup)) {
                if ((next instanceof ViewGroup) && mo65346f((ViewGroup) next)) {
                    return true;
                }
            }
        }
        return (this.f24608c == null || this.f24609d == null) ? false : true;
    }

    /* renamed from: g */
    public C10005v6 mo65347g() {
        WeakReference<C10005v6> weakReference = this.f24612g;
        if (weakReference != null) {
            return (C10005v6) weakReference.get();
        }
        return null;
    }

    /* renamed from: h */
    public ViewGroup mo65348h() {
        return (ViewGroup) this.f24606a.get();
    }

    /* renamed from: i */
    public C9906p6 mo65349i() {
        WeakReference<C9906p6> weakReference = this.f24611f;
        if (weakReference != null) {
            return (C9906p6) weakReference.get();
        }
        return null;
    }

    /* renamed from: j */
    public boolean mo65350j() {
        return this.f24607b == null || this.f24613h;
    }
}
