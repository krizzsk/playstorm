package com.inmobi.media;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import com.inmobi.media.C6028ei;
import java.lang.ref.WeakReference;

/* renamed from: com.inmobi.media.ea */
/* compiled from: DecorViewVisibilityTracker */
final class C6010ea extends C6028ei {

    /* renamed from: a */
    private static final String f15283a = C6010ea.class.getSimpleName();

    /* renamed from: d */
    private ViewTreeObserver.OnPreDrawListener f15284d;

    /* renamed from: e */
    private final WeakReference<View> f15285e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo35128a() {
        return 100;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo35129b() {
    }

    C6010ea(C6028ei.C6029a aVar, Activity activity) {
        super(aVar, (byte) 1);
        View decorView = activity.getWindow().getDecorView();
        this.f15285e = new WeakReference<>(decorView);
        ViewTreeObserver viewTreeObserver = decorView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            C60111 r3 = new ViewTreeObserver.OnPreDrawListener() {
                public final boolean onPreDraw() {
                    C6010ea.this.mo35158h();
                    return true;
                }
            };
            this.f15284d = r3;
            viewTreeObserver.addOnPreDrawListener(r3);
        }
    }

    /* renamed from: i */
    private void m17952i() {
        View view = (View) this.f15285e.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f15284d);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo35132e() {
        m17952i();
        super.mo35132e();
    }

    /* renamed from: c */
    public final void mo35130c() {
        if (!this.f15330b) {
            m17952i();
            super.mo35130c();
        }
    }

    /* renamed from: d */
    public final void mo35131d() {
        if (this.f15330b) {
            View view = (View) this.f15285e.get();
            if (view != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnPreDrawListener(this.f15284d);
                }
            }
            super.mo35131d();
        }
    }
}
