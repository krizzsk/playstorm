package com.fyber.inneractive.sdk.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import android.view.ViewTreeObserver;
import com.fyber.inneractive.sdk.util.C5345j;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.fyber.inneractive.sdk.util.f0 */
public class C5328f0 {

    /* renamed from: a */
    public final Map<Context, Pair<ViewTreeObserver, ViewTreeObserver.OnPreDrawListener>> f14179a = new WeakHashMap();

    /* renamed from: b */
    public final WeakHashMap<Context, WeakHashMap<View, C5333e>> f14180b = new WeakHashMap<>();

    /* renamed from: c */
    public final C5345j<Rect> f14181c = new C5345j<>(16, new C5329a(this));

    /* renamed from: d */
    public final C5345j<HashSet<View>> f14182d = new C5345j<>(16, new C5330b(this));

    /* renamed from: com.fyber.inneractive.sdk.util.f0$a */
    public class C5329a implements C5345j.C5346a<Rect> {
        public C5329a(C5328f0 f0Var) {
        }

        /* renamed from: a */
        public Object mo26328a() {
            return new Rect();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.util.f0$b */
    public class C5330b implements C5345j.C5346a<HashSet<View>> {
        public C5330b(C5328f0 f0Var) {
        }

        /* renamed from: a */
        public Object mo26328a() {
            return new HashSet();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.util.f0$c */
    public class C5331c implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        public final /* synthetic */ Context f14183a;

        public C5331c(Context context) {
            this.f14183a = context;
        }

        public boolean onPreDraw() {
            WeakHashMap weakHashMap;
            C5328f0 f0Var = C5328f0.this;
            Context context = this.f14183a;
            f0Var.getClass();
            if (context == null || (weakHashMap = f0Var.f14180b.get(context)) == null) {
                return true;
            }
            HashSet a = f0Var.f14182d.mo26456a();
            a.addAll(weakHashMap.keySet());
            Iterator it = a.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                C5333e eVar = (C5333e) weakHashMap.get(view);
                if (eVar != null) {
                    float f = 0.0f;
                    Rect a2 = f0Var.f14181c.mo26456a();
                    if (view != null && view.getParent() != null && view.isShown() && view.getGlobalVisibleRect(a2)) {
                        f = ((float) (a2.height() * a2.width())) / ((float) (view.getHeight() * view.getWidth()));
                    }
                    eVar.mo26343a(view, f, a2);
                    f0Var.f14181c.f14205a.offer(a2);
                }
            }
            a.clear();
            f0Var.f14182d.f14205a.offer(a);
            return true;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.util.f0$d */
    public static class C5332d {

        /* renamed from: a */
        public static final C5328f0 f14185a = new C5328f0();
    }

    /* renamed from: com.fyber.inneractive.sdk.util.f0$e */
    public interface C5333e {
        /* renamed from: a */
        void mo26343a(View view, float f, Rect rect);
    }

    /* renamed from: a */
    public static C5328f0 m16724a() {
        return C5332d.f14185a;
    }

    /* renamed from: b */
    public final String mo26447b() {
        return "IAVisibilityTracker" + ": ";
    }

    /* renamed from: c */
    public final void mo26448c() {
        for (Context next : this.f14180b.keySet()) {
            IAlog.m16699a("%stracking context: %s", mo26447b(), next);
            WeakHashMap weakHashMap = this.f14180b.get(next);
            if (weakHashMap != null) {
                for (View view : weakHashMap.keySet()) {
                    IAlog.m16699a("%stracking view: %s", mo26447b(), view);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo26444a(Context context, View view, C5333e eVar) {
        View view2;
        ViewTreeObserver viewTreeObserver;
        IAlog.m16699a("%strackView called with context: %s view: %s", mo26447b(), context, view);
        if (context != null) {
            WeakHashMap weakHashMap = this.f14180b.get(context);
            if (weakHashMap == null) {
                weakHashMap = new WeakHashMap();
                this.f14180b.put(context, weakHashMap);
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (activity.getWindow() != null) {
                        view2 = activity.getWindow().getDecorView();
                        viewTreeObserver = view2.getViewTreeObserver();
                        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                            C5331c cVar = new C5331c(context);
                            viewTreeObserver.addOnPreDrawListener(cVar);
                            this.f14179a.put(context, new Pair(viewTreeObserver, cVar));
                        }
                    }
                }
                view2 = view.getRootView();
                viewTreeObserver = view2.getViewTreeObserver();
                C5331c cVar2 = new C5331c(context);
                viewTreeObserver.addOnPreDrawListener(cVar2);
                this.f14179a.put(context, new Pair(viewTreeObserver, cVar2));
            }
            weakHashMap.put(view, eVar);
            mo26448c();
            return;
        }
        throw new IllegalStateException("View must be attached to an Activity context");
    }

    /* renamed from: a */
    public void mo26446a(View view) {
        IAlog.m16699a("%sunTrackView called with view", mo26447b());
        if (view == null) {
            IAlog.m16699a("%sunTrackView called with a null view!", mo26447b());
            return;
        }
        Context context = view.getContext();
        if (context == null) {
            IAlog.m16699a("%sview.getContext() returned null!", mo26447b());
            return;
        }
        Map map = this.f14180b.get(context);
        if (map != null) {
            mo26445a(context, (Map<View, C5333e>) map, view);
        } else {
            Iterator it = new HashSet(this.f14180b.keySet()).iterator();
            while (it.hasNext()) {
                Context context2 = (Context) it.next();
                WeakHashMap weakHashMap = this.f14180b.get(context2);
                if (weakHashMap != null) {
                    mo26445a(context2, (Map<View, C5333e>) weakHashMap, view);
                }
            }
        }
        mo26448c();
    }

    /* renamed from: a */
    public final void mo26445a(Context context, Map<View, C5333e> map, View view) {
        if (map.remove(view) != null) {
            if (IAlog.f14137a <= 2) {
                IAlog.m16702d("removeViewFromContext found view for removal!", new Object[0]);
            }
            if (map.isEmpty()) {
                this.f14180b.remove(context);
                Pair pair = this.f14179a.get(context);
                if (pair != null) {
                    if (((ViewTreeObserver) pair.first).isAlive()) {
                        ((ViewTreeObserver) pair.first).removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) pair.second);
                    }
                    this.f14179a.remove(context);
                }
            }
        }
    }
}
