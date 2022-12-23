package com.mbridge.msdk.mbnative.controller;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import com.mbridge.msdk.foundation.tools.C8608u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mbridge.msdk.mbnative.controller.a */
/* compiled from: ImpressionTracker */
public final class C8757a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WeakReference<ViewTreeObserver> f21292a;

    /* renamed from: b */
    private List<View> f21293b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ViewTreeObserver.OnPreDrawListener f21294c = null;

    /* renamed from: d */
    private C8761a f21295d;

    /* renamed from: e */
    private Handler f21296e;

    /* renamed from: f */
    private boolean f21297f;

    /* renamed from: com.mbridge.msdk.mbnative.controller.a$a */
    /* compiled from: ImpressionTracker */
    public interface C8761a {
        /* renamed from: a */
        void mo58126a(ArrayList<View> arrayList, ArrayList<View> arrayList2);
    }

    public C8757a(List<View> list, C8761a aVar, Handler handler) {
        ArrayList arrayList = new ArrayList();
        this.f21293b = arrayList;
        this.f21295d = aVar;
        this.f21296e = handler;
        if (list != null) {
            this.f21293b = list;
        } else {
            arrayList.clear();
        }
        try {
            m25446b();
        } catch (Throwable th) {
            C8608u.m24881a("ImpressionTracker", th.getMessage(), th);
        }
        try {
            this.f21294c = new ViewTreeObserver.OnPreDrawListener() {
                public final boolean onPreDraw() {
                    C8757a.this.m25446b();
                    return true;
                }
            };
        } catch (Throwable th2) {
            C8608u.m24881a("ImpressionTracker", th2.getMessage(), th2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m25446b() {
        if (!this.f21297f) {
            Handler handler = this.f21296e;
            if (handler != null) {
                handler.postDelayed(new Runnable() {
                    public final void run() {
                        C8757a.m25447b(C8757a.this);
                    }
                }, 100);
            }
            this.f21297f = true;
        }
    }

    /* renamed from: a */
    public final void mo58137a(View view) {
        final View view2 = null;
        if (view != null) {
            view2 = C8771d.m25503a(view.getContext(), view);
            this.f21293b.add(view);
        } else {
            List<View> list = this.f21293b;
            if (list != null && list.size() > 0) {
                int i = 0;
                while (i < this.f21293b.size() && ((r1 = this.f21293b.get(i)) == null || (view2 = C8771d.m25503a(r1.getContext(), r1)) == null)) {
                    i++;
                }
            }
        }
        if (view2 != null) {
            view2.post(new Runnable() {
                public final void run() {
                    ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                    if (viewTreeObserver == null || viewTreeObserver.isAlive()) {
                        WeakReference unused = C8757a.this.f21292a = new WeakReference(viewTreeObserver);
                        if (C8757a.this.f21294c != null) {
                            viewTreeObserver.addOnPreDrawListener(C8757a.this.f21294c);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo58136a() {
        try {
            this.f21297f = false;
            if (!(this.f21292a == null || this.f21292a.get() == null)) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f21292a.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this.f21294c);
                }
                this.f21292a.clear();
            }
            this.f21295d = null;
            this.f21294c = null;
            if (this.f21293b != null) {
                this.f21293b.clear();
            }
            this.f21293b = null;
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b A[Catch:{ Exception -> 0x008d }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006f A[Catch:{ Exception -> 0x008d }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m25447b(com.mbridge.msdk.mbnative.controller.C8757a r11) {
        /*
            r0 = 0
            r11.f21297f = r0     // Catch:{ Exception -> 0x008d }
            java.util.List<android.view.View> r1 = r11.f21293b     // Catch:{ Exception -> 0x008d }
            if (r1 == 0) goto L_0x008d
            java.util.List<android.view.View> r1 = r11.f21293b     // Catch:{ Exception -> 0x008d }
            int r1 = r1.size()     // Catch:{ Exception -> 0x008d }
            if (r1 <= 0) goto L_0x008d
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x008d }
            r1.<init>()     // Catch:{ Exception -> 0x008d }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x008d }
            r2.<init>()     // Catch:{ Exception -> 0x008d }
            r3 = r0
        L_0x001a:
            java.util.List<android.view.View> r4 = r11.f21293b     // Catch:{ Exception -> 0x008d }
            int r4 = r4.size()     // Catch:{ Exception -> 0x008d }
            if (r3 >= r4) goto L_0x0075
            java.util.List<android.view.View> r4 = r11.f21293b     // Catch:{ Exception -> 0x008d }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ Exception -> 0x008d }
            android.view.View r4 = (android.view.View) r4     // Catch:{ Exception -> 0x008d }
            if (r4 == 0) goto L_0x0068
            int r5 = r4.getVisibility()     // Catch:{ Exception -> 0x008d }
            if (r5 == 0) goto L_0x0033
            goto L_0x0068
        L_0x0033:
            android.graphics.Rect r5 = new android.graphics.Rect     // Catch:{ Exception -> 0x008d }
            r5.<init>()     // Catch:{ Exception -> 0x008d }
            boolean r6 = r4.getGlobalVisibleRect(r5)     // Catch:{ Exception -> 0x008d }
            if (r6 != 0) goto L_0x003f
            goto L_0x0068
        L_0x003f:
            int r6 = r5.height()     // Catch:{ Exception -> 0x008d }
            int r5 = r5.width()     // Catch:{ Exception -> 0x008d }
            int r6 = r6 * r5
            long r5 = (long) r6     // Catch:{ Exception -> 0x008d }
            int r7 = r4.getHeight()     // Catch:{ Exception -> 0x008d }
            int r8 = r4.getWidth()     // Catch:{ Exception -> 0x008d }
            int r7 = r7 * r8
            long r7 = (long) r7     // Catch:{ Exception -> 0x008d }
            r9 = 0
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 > 0) goto L_0x005a
            goto L_0x0068
        L_0x005a:
            double r5 = (double) r5     // Catch:{ Exception -> 0x008d }
            double r7 = (double) r7     // Catch:{ Exception -> 0x008d }
            r9 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            double r7 = r7 * r9
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x0068
            r5 = 1
            goto L_0x0069
        L_0x0068:
            r5 = r0
        L_0x0069:
            if (r5 == 0) goto L_0x006f
            r1.add(r4)     // Catch:{ Exception -> 0x008d }
            goto L_0x0072
        L_0x006f:
            r2.add(r4)     // Catch:{ Exception -> 0x008d }
        L_0x0072:
            int r3 = r3 + 1
            goto L_0x001a
        L_0x0075:
            com.mbridge.msdk.mbnative.controller.a$a r0 = r11.f21295d     // Catch:{ Exception -> 0x008d }
            if (r0 == 0) goto L_0x007e
            com.mbridge.msdk.mbnative.controller.a$a r0 = r11.f21295d     // Catch:{ Exception -> 0x008d }
            r0.mo58126a(r1, r2)     // Catch:{ Exception -> 0x008d }
        L_0x007e:
            int r0 = r1.size()     // Catch:{ Exception -> 0x008d }
            if (r0 <= 0) goto L_0x0087
            r11.mo58136a()     // Catch:{ Exception -> 0x008d }
        L_0x0087:
            r1.clear()     // Catch:{ Exception -> 0x008d }
            r2.clear()     // Catch:{ Exception -> 0x008d }
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbnative.controller.C8757a.m25447b(com.mbridge.msdk.mbnative.controller.a):void");
    }
}
