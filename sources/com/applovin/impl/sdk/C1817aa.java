package com.applovin.impl.sdk;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.applovin.impl.mediation.p028a.C1574b;
import com.applovin.impl.mediation.p028a.C1576d;
import com.applovin.impl.mediation.p028a.C1577e;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* renamed from: com.applovin.impl.sdk.aa */
public class C1817aa {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2092v f2893a;

    /* renamed from: b */
    private final Object f2894b = new Object();

    /* renamed from: c */
    private final Rect f2895c = new Rect();

    /* renamed from: d */
    private final Handler f2896d;

    /* renamed from: e */
    private final Runnable f2897e;

    /* renamed from: f */
    private final ViewTreeObserver.OnPreDrawListener f2898f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final WeakReference<View> f2899g;

    /* renamed from: h */
    private final long f2900h;

    /* renamed from: i */
    private WeakReference<ViewTreeObserver> f2901i = new WeakReference<>((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: j */
    public WeakReference<View> f2902j = new WeakReference<>((Object) null);

    /* renamed from: k */
    private int f2903k;

    /* renamed from: l */
    private long f2904l;

    /* renamed from: m */
    private long f2905m = Long.MIN_VALUE;

    /* renamed from: com.applovin.impl.sdk.aa$a */
    public interface C1820a {
        void onLogVisibilityImpression();
    }

    public C1817aa(final View view, C1959m mVar, C1820a aVar) {
        this.f2893a = mVar.mo14286A();
        this.f2900h = ((Long) mVar.mo14311a(C1857b.f3143bT)).longValue();
        this.f2896d = new Handler(Looper.getMainLooper());
        this.f2899g = new WeakReference<>(view);
        final WeakReference weakReference = new WeakReference(aVar);
        this.f2897e = new Runnable() {
            public void run() {
                View view = (View) C1817aa.this.f2899g.get();
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                View view2 = (View) C1817aa.this.f2902j.get();
                if (viewGroup != null && view2 != null) {
                    if (C1817aa.this.m3809b(viewGroup, view2)) {
                        if (C2092v.m5047a()) {
                            C1817aa.this.f2893a.mo14789b("VisibilityTracker", "View met visibility requirements. Logging visibility impression..");
                        }
                        C1817aa.this.mo13892a();
                        C1820a aVar = (C1820a) weakReference.get();
                        if (aVar != null) {
                            aVar.onLogVisibilityImpression();
                            return;
                        }
                        return;
                    }
                    C1817aa.this.m3807b();
                }
            }
        };
        this.f2898f = new ViewTreeObserver.OnPreDrawListener() {
            public boolean onPreDraw() {
                C1817aa.this.m3807b();
                C1817aa.this.m3808b(view);
                return true;
            }
        };
    }

    /* renamed from: a */
    private void m3802a(View view) {
        View rootView = Utils.getRootView((View) this.f2899g.get());
        if (rootView == null) {
            rootView = Utils.getRootView(view);
        }
        if (rootView != null) {
            ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                this.f2901i = new WeakReference<>(viewTreeObserver);
                viewTreeObserver.addOnPreDrawListener(this.f2898f);
            } else if (C2092v.m5047a()) {
                this.f2893a.mo14792d("VisibilityTracker", "Unable to set view tree observer since the view tree observer is not alive.");
            }
        } else if (C2092v.m5047a()) {
            this.f2893a.mo14789b("VisibilityTracker", "Unable to set view tree observer due to no root view.");
        }
    }

    /* renamed from: a */
    private boolean m3804a(View view, View view2) {
        return view2 != null && view2.getVisibility() == 0 && view.getParent() != null && view2.getWidth() > 0 && view2.getHeight() > 0 && view2.getGlobalVisibleRect(this.f2895c) && ((long) (AppLovinSdkUtils.pxToDp(view2.getContext(), this.f2895c.width()) * AppLovinSdkUtils.pxToDp(view2.getContext(), this.f2895c.height()))) >= ((long) this.f2903k);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m3807b() {
        this.f2896d.postDelayed(this.f2897e, this.f2900h);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m3808b(View view) {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f2901i.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f2898f);
        } else if (view != null) {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnPreDrawListener(this.f2898f);
            }
        }
        this.f2901i.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m3809b(View view, View view2) {
        if (!m3804a(view, view2)) {
            return false;
        }
        if (this.f2905m == Long.MIN_VALUE) {
            this.f2905m = SystemClock.uptimeMillis();
        }
        return SystemClock.uptimeMillis() - this.f2905m >= this.f2904l;
    }

    /* renamed from: a */
    public void mo13892a() {
        synchronized (this.f2894b) {
            this.f2896d.removeMessages(0);
            m3808b((View) this.f2899g.get());
            this.f2905m = Long.MIN_VALUE;
            this.f2902j.clear();
        }
    }

    /* renamed from: a */
    public void mo13893a(C1577e eVar) {
        WeakReference<View> weakReference;
        synchronized (this.f2894b) {
            if (C2092v.m5047a()) {
                this.f2893a.mo14789b("VisibilityTracker", "Tracking Visibility...");
            }
            mo13892a();
            if (eVar instanceof C1574b) {
                weakReference = new WeakReference<>(((C1574b) eVar).mo13176w());
            } else if (eVar instanceof C1576d) {
                weakReference = new WeakReference<>(((C1576d) eVar).mo13174u());
            } else {
                return;
            }
            this.f2902j = weakReference;
            this.f2903k = eVar.mo13202F();
            this.f2904l = eVar.mo13204H();
            m3802a((View) this.f2902j.get());
        }
    }
}
