package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.inmobi.media.C6012eb;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.inmobi.media.ei */
/* compiled from: VisibilityTracker */
public abstract class C6028ei {

    /* renamed from: a */
    private static final String f15329a = C6028ei.class.getSimpleName();

    /* renamed from: b */
    boolean f15330b;
    /* access modifiers changed from: package-private */

    /* renamed from: c */
    public C6031c f15331c;

    /* renamed from: d */
    private final ArrayList<View> f15332d;

    /* renamed from: e */
    private long f15333e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final byte f15334f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Map<View, C6032d> f15335g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C6029a f15336h;

    /* renamed from: i */
    private final C6030b f15337i;

    /* renamed from: j */
    private final Handler f15338j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f15339k;

    /* renamed from: com.inmobi.media.ei$a */
    /* compiled from: VisibilityTracker */
    public interface C6029a {
        /* renamed from: a */
        boolean mo35150a(View view, View view2, int i);

        /* renamed from: a */
        boolean mo35151a(View view, View view2, int i, Object obj);
    }

    /* renamed from: com.inmobi.media.ei$c */
    /* compiled from: VisibilityTracker */
    public interface C6031c {
        /* renamed from: a */
        void mo35142a(List<View> list, List<View> list2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo35128a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo35129b();

    /* renamed from: com.inmobi.media.ei$d */
    /* compiled from: VisibilityTracker */
    static class C6032d {

        /* renamed from: a */
        int f15343a;

        /* renamed from: b */
        long f15344b;

        /* renamed from: c */
        View f15345c;

        /* renamed from: d */
        Object f15346d;

        C6032d() {
        }
    }

    C6028ei(C6029a aVar, byte b) {
        this(new WeakHashMap(10), aVar, new Handler(Looper.getMainLooper()), b);
    }

    private C6028ei(Map<View, C6032d> map, C6029a aVar, Handler handler, byte b) {
        this.f15333e = 0;
        this.f15330b = true;
        this.f15335g = map;
        this.f15336h = aVar;
        this.f15338j = handler;
        this.f15337i = new C6030b(this);
        this.f15332d = new ArrayList<>(50);
        this.f15334f = b;
    }

    /* renamed from: c */
    public void mo35130c() {
        this.f15337i.run();
        this.f15338j.removeCallbacksAndMessages((Object) null);
        this.f15339k = false;
        this.f15330b = true;
    }

    /* renamed from: d */
    public void mo35131d() {
        this.f15330b = false;
        mo35158h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo35154a(View view, Object obj, int i) {
        m18018a(view, view, obj, i);
    }

    /* renamed from: a */
    private void m18018a(View view, View view2, Object obj, int i) {
        C6032d dVar = this.f15335g.get(view2);
        if (dVar == null) {
            dVar = new C6032d();
            this.f15335g.put(view2, dVar);
            this.f15333e++;
        }
        dVar.f15343a = i;
        dVar.f15344b = this.f15333e;
        dVar.f15345c = view;
        dVar.f15346d = obj;
        long j = this.f15333e;
        if (j % 50 == 0) {
            m18017a(j - 50);
        }
        if (1 == this.f15335g.size()) {
            mo35131d();
        }
    }

    /* renamed from: a */
    private void m18017a(long j) {
        for (Map.Entry next : this.f15335g.entrySet()) {
            if (((C6032d) next.getValue()).f15344b < j) {
                this.f15332d.add((View) next.getKey());
            }
        }
        Iterator<View> it = this.f15332d.iterator();
        while (it.hasNext()) {
            mo35153a(it.next());
        }
        this.f15332d.clear();
    }

    /* renamed from: a */
    public final void mo35153a(View view) {
        if (this.f15335g.remove(view) != null) {
            this.f15333e--;
            if (this.f15335g.size() == 0) {
                mo35130c();
            }
        }
    }

    /* renamed from: f */
    public final void mo35156f() {
        this.f15335g.clear();
        this.f15338j.removeMessages(0);
        this.f15339k = false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.view.View} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35155a(java.lang.Object r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x0003
            return
        L_0x0003:
            r0 = 0
            java.util.Map<android.view.View, com.inmobi.media.ei$d> r1 = r4.f15335g
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x000e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x002f
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            com.inmobi.media.ei$d r3 = (com.inmobi.media.C6028ei.C6032d) r3
            java.lang.Object r3 = r3.f15346d
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x000e
            java.lang.Object r5 = r2.getKey()
            r0 = r5
            android.view.View r0 = (android.view.View) r0
        L_0x002f:
            if (r0 == 0) goto L_0x0034
            r4.mo35153a((android.view.View) r0)
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6028ei.mo35155a(java.lang.Object):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo35157g() {
        return !this.f15335g.isEmpty();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo35132e() {
        mo35156f();
        this.f15331c = null;
        this.f15330b = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo35158h() {
        if (!this.f15339k && !this.f15330b) {
            this.f15339k = true;
            this.f15338j.postDelayed(this.f15337i, (long) mo35128a());
        }
    }

    /* renamed from: com.inmobi.media.ei$b */
    /* compiled from: VisibilityTracker */
    static class C6030b implements Runnable {

        /* renamed from: a */
        private final ArrayList<View> f15340a = new ArrayList<>();

        /* renamed from: b */
        private final ArrayList<View> f15341b = new ArrayList<>();

        /* renamed from: c */
        private WeakReference<C6028ei> f15342c;

        C6030b(C6028ei eiVar) {
            this.f15342c = new WeakReference<>(eiVar);
        }

        public final void run() {
            C6031c e;
            C6028ei eiVar = (C6028ei) this.f15342c.get();
            if (eiVar != null) {
                boolean unused = eiVar.f15339k = false;
                for (Map.Entry entry : eiVar.f15335g.entrySet()) {
                    View view = (View) entry.getKey();
                    int i = ((C6032d) entry.getValue()).f15343a;
                    View view2 = ((C6032d) entry.getValue()).f15345c;
                    Object obj = ((C6032d) entry.getValue()).f15346d;
                    if (eiVar.f15334f != 2) {
                        C6029a d = eiVar.f15336h;
                        if (!d.mo35151a(view2, view, i, obj) || !d.mo35150a(view, view, i)) {
                            this.f15341b.add(view);
                        } else {
                            this.f15340a.add(view);
                        }
                    } else {
                        C6012eb.C6013a aVar = (C6012eb.C6013a) eiVar.f15336h;
                        if (!aVar.mo35151a(view2, view, i, obj) || !aVar.mo35150a(view, view, i) || !aVar.mo35134a(view)) {
                            this.f15341b.add(view);
                        } else {
                            this.f15340a.add(view);
                        }
                    }
                }
            }
            if (!(eiVar == null || (e = eiVar.f15331c) == null)) {
                e.mo35142a(this.f15340a, this.f15341b);
            }
            this.f15340a.clear();
            this.f15341b.clear();
            if (eiVar != null) {
                eiVar.mo35129b();
            }
        }
    }
}
