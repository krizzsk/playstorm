package com.applovin.impl.mediation.p029b.p030a;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.applovin.impl.mediation.b.a.c */
public class C1612c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final WeakHashMap<View, Integer> f2196a = new WeakHashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f2197b = new Object();

    /* renamed from: c */
    private final Handler f2198c = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f2199d = false;

    /* renamed from: e */
    private final WeakReference<View> f2200e;

    /* renamed from: f */
    private final ViewTreeObserver.OnPreDrawListener f2201f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C1615a f2202g;

    /* renamed from: com.applovin.impl.mediation.b.a.c$a */
    public interface C1615a {
        /* renamed from: a */
        void mo13349a(int i, int i2);
    }

    public C1612c(View view) {
        this.f2200e = new WeakReference<>(view);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            C16131 r0 = new ViewTreeObserver.OnPreDrawListener() {
                public boolean onPreDraw() {
                    C1612c.this.m3187b();
                    return true;
                }
            };
            this.f2201f = r0;
            viewTreeObserver.addOnPreDrawListener(r0);
            return;
        }
        this.f2201f = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m3187b() {
        if (!this.f2199d) {
            this.f2199d = true;
            this.f2198c.postDelayed(new Runnable() {
                public void run() {
                    synchronized (C1612c.this.f2197b) {
                        boolean unused = C1612c.this.f2199d = false;
                        int i = -1;
                        int i2 = -1;
                        for (Map.Entry entry : C1612c.this.f2196a.entrySet()) {
                            if (C1612c.this.m3188b((View) entry.getKey())) {
                                Integer num = (Integer) entry.getValue();
                                if (i == -1 && i2 == -1) {
                                    i = num.intValue();
                                    i2 = num.intValue();
                                } else {
                                    i = Math.min(i, ((Integer) entry.getValue()).intValue());
                                    i2 = Math.max(i2, ((Integer) entry.getValue()).intValue());
                                }
                            }
                        }
                        if (C1612c.this.f2202g != null) {
                            C1612c.this.f2202g.mo13349a(i, i2);
                        }
                    }
                }
            }, 100);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m3188b(View view) {
        return (view == null || view.getVisibility() != 0 || view.getParent() == null) ? false : true;
    }

    /* renamed from: a */
    public void mo13343a() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener;
        this.f2202g = null;
        View view = (View) this.f2200e.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (onPreDrawListener = this.f2201f) != null) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            }
            this.f2200e.clear();
        }
    }

    /* renamed from: a */
    public void mo13344a(View view) {
        synchronized (this.f2197b) {
            this.f2196a.remove(view);
        }
    }

    /* renamed from: a */
    public void mo13345a(View view, int i) {
        synchronized (this.f2197b) {
            this.f2196a.put(view, Integer.valueOf(i));
            m3187b();
        }
    }

    /* renamed from: a */
    public void mo13346a(C1615a aVar) {
        this.f2202g = aVar;
    }
}
